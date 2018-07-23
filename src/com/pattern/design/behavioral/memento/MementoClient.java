package com.pattern.design.behavioral.memento;

public class MementoClient {

	public static void main(String[] args) {

		/* Create an OS */
		OS os = new OS("Windows 10");

		/* Install basic s/w */
		os.install("Antivirus");

		/* Create an OS recovery tool */
		RecoveryTool recoveryTool = new RecoveryTool();
		/* Save image for future restoration */
		recoveryTool.addImage(os.createImage());

		/* Install more s/w */
		os.install("Tomcat Server");

		/* Save image for future restoration */
		recoveryTool.addImage(os.createImage());

		/* Install more s/w */
		os.install("MySQL");

		/* OS Corrupted */
		/* Restore the last good configuration */
		os.restoreImage(recoveryTool.getLastGoodImage());

		/* OS Corrupted again */
		/* Delete the last image and restore the previous good configuration */
		recoveryTool.deleteLastImage();
		os.restoreImage(recoveryTool.getLastGoodImage());

	}
}
