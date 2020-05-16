package com.github.alexandrenavarro.javaterminalsample;


import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;


import java.io.IOException;

public class JavaTerminalSampleApplication {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Started");
//		Thread.sleep(60000);
//		System.out.println("Ended");

		final DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
		Terminal terminal = null;

		// This error without  --initialize-at-run-time=sun.awt.dnd.SunDropTargetContextPeer$EventDispatcher
		//
//
//		Caused by: com.oracle.graal.pointsto.constraints.UnsupportedFeatureException: Class initialization of sun.awt.dnd.SunDropTargetContextPeer$EventDispatcher failed. Use the option --initialize-at-run-time=sun.awt.dnd.SunDropTargetContextPeer$EventDispatcher to explicitly request delayed initialization of this class.
//		Detailed message:
//
//		at com.oracle.graal.pointsto.constraints.UnsupportedFeatures.report(UnsupportedFeatures.java:126)
//		at com.oracle.svm.hosted.NativeImageGenerator.runPointsToAnalysis(NativeImageGenerator.java:738)
//        ... 8 more
//		Caused by: java.lang.NoClassDefFoundError: Could not initialize class sun.awt.dnd.SunDropTargetContextPeer$EventDispatcher

		// This error with --initialize-at-run-time=sun.awt.dnd.SunDropTargetContextPeer$EventDispatcher
		//Caused by: java.lang.RuntimeException: There was an error linking the native image: Linker command exited with 1

//		try {
//			terminal = defaultTerminalFactory.createTerminal();
//			terminal.putCharacter('A');
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			if(terminal != null) {
//				try {
//					terminal.close();
//				}
//				catch(IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	}
}
