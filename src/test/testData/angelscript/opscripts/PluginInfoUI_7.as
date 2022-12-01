// All texts are fetched from the API set in Setting_API_URL (default: https://greep.gq/api/rmc.json)

bool WindowInfo_Show = false;

Resources::Font@ Header1 = Resources::GetFont("DroidSans.ttf", 22);
Resources::Font@ Header2 = Resources::GetFont("DroidSans.ttf", 20);

int WindowInfo_Flags = UI::WindowFlags::NoCollapse + UI::WindowFlags::HorizontalScrollbar;

void RenderPluginInfoInterface() {
    if (!WindowInfo_Show) return;
    
    UI::SetNextWindowSize(600, 370);
    if (UI::Begin(MXColor + Icons::InfoCircle + " \\$z" + name, WindowInfo_Show, WindowInfo_Flags)) {
        UI::BeginTabBar("MXInfoTabBar", UI::TabBarFlags::FittingPolicyResizeDown);
        if (IsPluginInfoAPILoaded()) {
            if (UI::BeginTabItem(Icons::Book + " Rules")) {
                RenderPluginInfoRules();
                UI::EndTabItem();
            }
            int announcementsLength = PluginInfoNet["announcements"].get_Length();
            int unreadAnnouncements = announcementsLength - PluginData["announcements"]["read"].get_Length();
            if (announcementsLength > 0 && UI::BeginTabItem((unreadAnnouncements > 0 ? "\\$f39":"") + Icons::Bullhorn + " \\$zAnnouncements"+(unreadAnnouncements > 0 ? " \\$f39("+unreadAnnouncements+")":""))){
                RenderPluginInfoAnnouncements();
                UI::EndTabItem();
            }
            if (UI::BeginTabItem(Icons::Tag + " Changelog")) {
                WindowInfo_Flags = UI::WindowFlags::NoCollapse;
                RenderPluginInfoChangelog();
                UI::EndTabItem();
            }
        }
        if (UI::BeginTabItem(Icons::Kenney::InfoCircle+" About")) {
            RenderPluginInfoAbout();
            UI::EndTabItem();
        }
        UI::EndTabBar();
    }
    UI::End();
}

void RenderPluginInfoAbout() {
    UI::Text(MXColor + Icons::Random);
    UI::SameLine();
    UI::PushFont(Header1);
    UI::Text(name);
    UI::PopFont();
    UI::Text("Made by \\$777" + Meta::ExecutingPlugin().get_Author() + " \\$aaaand its contributors");
    UI::Text("Version \\$777" + Meta::ExecutingPlugin().get_Version());
    UI::Text("Plugin ID \\$777" + Meta::ExecutingPlugin().get_ID());
    UI::Text("Site ID \\$777" + Meta::ExecutingPlugin().get_SiteID());
    UI::Text("Type \\$777" + changeEnumStyle(tostring(Meta::ExecutingPlugin().get_Type())));
    if (isDevMode()) {
        UI::SameLine();
        UI::Text("\\$777(\\$f39"+Icons::Code+" \\$777Dev mode)");
    }
    
    UI::Separator();

    UI::Text("\\$f39" + Icons::Heartbeat);
    UI::SameLine();
    UI::PushFont(Header2);
    UI::Text("Openplanet");
    UI::PopFont();
    UI::Text("Version \\$777" + Meta::OpenplanetBuildInfo());

    UI::Separator();

    UI::Text(MXColor + Icons::Exchange);
    UI::SameLine();
    UI::PushFont(Header2);
    UI::Text("ManiaExchange");
    UI::PopFont();
    UI::Text("Base URL \\$777" + TMXURL);
    UI::Text("Game Name \\$777" + gameName);

    UI::Separator();

    if (UI::Button(Icons::Heart + " Donate")){
        OpenBrowserURL("https://github.com/sponsors/GreepTheSheep");
    }
    UI::SameLine();
    if (UI::Button(Icons::Kenney::GithubAlt + " Github")){
        OpenBrowserURL(repoURL);
    }
    UI::SameLine();
    if (UI::Button(Icons::DiscordAlt + " Discord")){
        OpenBrowserURL("https://greep.gq/discord");
    }
    UI::SameLine();
    if (UI::Button(Icons::Heartbeat + " Plugin Home")){
        OpenBrowserURL("https://openplanet.nl/files/" + Meta::ExecutingPlugin().get_SiteID());
    }
    UI::SameLine();
}

void RenderPluginInfoRules() {
    UI::BeginTabBar("MXInfoRulesTabBar", UI::TabBarFlags::FittingPolicyResizeDown);
    if (UI::BeginTabItem("Random Map Challenge")) {
        for (uint i = 0; i < PluginInfoNet["rules"]["challenge"].get_Length(); i++) {
            string rule = PluginInfoNet["rules"]["challenge"][i];
            UI::Markdown("- " + rule);
        }
        UI::EndTabItem();
    }
    if (UI::BeginTabItem("Random Map Survival")) {
        for (uint i = 0; i < PluginInfoNet["rules"]["survival"].get_Length(); i++) {
            string rule = PluginInfoNet["rules"]["survival"][i];
            UI::Markdown("- " + rule);
        }
        UI::EndTabItem();
    }
    UI::EndTabBar();
}

void RenderPluginInfoAnnouncements() {
    UI::BeginTabBar("MXInfoAnnounceTabBar", UI::TabBarFlags::FittingPolicyScroll);
    for (uint i = 0; i < PluginInfoNet["announcements"].get_Length(); i++) {
        int announcementId = PluginInfoNet["announcements"][i]["id"];
        string title = PluginInfoNet["announcements"][i]["title"];

        bool alreadyRead = false;
        // Check if announcement is already read by its ID
        for (uint j = 0; j < PluginData["announcements"]["read"].get_Length(); j++) {
            int localId = PluginData["announcements"]["read"][j];
            if (localId == announcementId) {
                alreadyRead = true;
            }
        }
        
        if (!alreadyRead) title = "\\$f39" + Icons::Bullhorn + "\\$z  " + title;

        if (UI::BeginTabItem(title)) {
            UI::Markdown("# " + title);
            if (!alreadyRead && UI::Button(Icons::Check + " Mark as read")){
                PluginData["announcements"]["read"].Add(announcementId);
            }
            UI::Text("");
            UI::Markdown(PluginInfoNet["announcements"][i]["description"]);
            UI::EndTabItem();
        }
    }
    UI::EndTabBar();
}

void RenderPluginInfoChangelog() {
    UI::BeginTabBar("MXInfoChangelogTabBar", UI::TabBarFlags::FittingPolicyScroll);
    for (uint i = 0; i < PluginInfoNet["changelog"].get_Length(); i++) {
        string tabTitle = PluginInfoNet["changelog"][i]["title"];
        if (PluginInfoNet["changelog"][i]["version"] == Meta::ExecutingPlugin().get_Version()) tabTitle += " \\$af0(Installed)";
        if (UI::BeginTabItem(tabTitle)) {
            for (uint j = 0; j < PluginInfoNet["changelog"][i]["changes"].get_Length(); j++) {
                string change = PluginInfoNet["changelog"][i]["changes"][j]["title"];
                UI::Markdown("- " + change);
                if (PluginInfoNet["changelog"][i]["changes"][j]["type"].GetType() != Json::Type::Null && PluginInfoNet["changelog"][i]["changes"][j]["githubIssueId"].GetType() != Json::Type::Null) {
                    UI::SameLine();
                    int issueID = PluginInfoNet["changelog"][i]["changes"][j]["githubIssueId"];
                    if (UI::Button("#"+issueID)) {
                        if (PluginInfoNet["changelog"][i]["changes"][j]["type"] == "issue") {
                            OpenBrowserURL(repoURL + "/issues/" + issueID);
                        } else if (PluginInfoNet["changelog"][i]["changes"][j]["type"] == "pull") {
                            OpenBrowserURL(repoURL + "/pull/" + issueID);
                        }
                    }
                }
            }
            UI::EndTabItem();
        }
    }
    UI::EndTabBar();
}