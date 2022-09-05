// panorma js example
"use strict";

class Console {
	static onMoveDragStart(source, callback) {
		callback.displayPanel = $.GetContextPanel();
		callback.removePositionBeforeDrop = false;
	}

	static toggle() {
		$.DispatchEvent('ToggleConsole');
	}

	static onNewMessages() {
		$('#ConsoleMessageTarget').ScrollToBottom();
	}

	static setupFormat() {
		// todo: it only applies the change if you close and reopen

		let p2ce_quake_console = $.persistentStorage.getItem("p2ce.console.quake");

		if (p2ce_quake_console !== null && p2ce_quake_console) {
			$('#Console').AddClass('ConsoleQuake');
			$('#ConsoleResizeDragKnob').horizontalDrag = false;
		} else {
			$.RegisterEventHandler('DragStart', $('#MoveDragArea'), Console.onMoveDragStart);
			$('#ConsoleResizeDragKnob').horizontalDrag = true;
		}
	}

	static {
		Console.setupFormat();
		$.RegisterEventHandler('NewConsoleMessages', 'ConsoleMessageTarget', Console.onNewMessages);
	}
}
