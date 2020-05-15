package com.github.alexandrenavarro.javaterminalsample;


import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class JavaTerminalSampleApplication {

	public static void main(String[] args) {
		final DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
		Terminal terminal = null;
		try {
			terminal = defaultTerminalFactory.createTerminal();
			KeyStroke	 keyStroke = terminal.readInput();
			int i = 0;
			while(keyStroke.getKeyType() != KeyType.Escape) {
				terminal.newTextGraphics().putString(0, i++, "Last Keystroke: " + keyStroke.toString());
				terminal.flush();
				keyStroke = terminal.readInput();
			}
		} catch(IOException e) {
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
