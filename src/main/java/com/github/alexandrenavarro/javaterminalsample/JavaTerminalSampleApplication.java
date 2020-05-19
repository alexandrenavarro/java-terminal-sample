package com.github.alexandrenavarro.javaterminalsample;


import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class JavaTerminalSampleApplication {

	public static void main(String[] args) throws InterruptedException {
		final DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
		Terminal terminal = null;
		try {
			terminal = defaultTerminalFactory.createHeadlessTerminal();
			final TextGraphics textGraphics = terminal.newTextGraphics().putString(1, 1, "Hello");
			terminal.flush();
			KeyStroke keyStroke = terminal.readInput();
			int i = 1;
			while(keyStroke.getKeyType() != KeyType.Escape) {
				textGraphics.putString(0, i, "Last Keystroke: ", SGR.BOLD);
				textGraphics.putString(5 + "Last Keystroke: ".length(), i++, keyStroke.toString());
				terminal.flush();
				keyStroke = terminal.readInput();
			}
			Thread.sleep(60000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(terminal != null) {
				try {
					terminal.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
