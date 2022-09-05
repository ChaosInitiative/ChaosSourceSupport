package org.intellij.sdk.language.angelscript;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts.Label;
import com.intellij.openapi.util.NlsSafe;
import org.intellij.sdk.language.ChaosSourceSupportIcons;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

@SuppressWarnings("UnstableApiUsage")
public class AngelScriptFileType extends LanguageFileType {

	public static final AngelScriptFileType INSTANCE = new AngelScriptFileType();

	public AngelScriptFileType() {
		super( AngelScriptLanguage.INSTANCE );
	}

	@Override
	public @NonNls @NotNull String getName() {
		return "AngelScript File";
	}

	@Override
	public @Label @NotNull String getDescription() {
        //noinspection DialogTitleCapitalization
        return "AngelScript Language File";
	}

	@Override
	public @NlsSafe @NotNull String getDefaultExtension() {
		return "as";
	}

	@Override
	public @Nullable Icon getIcon() {
		return ChaosSourceSupportIcons.AS_FILE;
	}
}
