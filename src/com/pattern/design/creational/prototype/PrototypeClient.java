package com.pattern.design.creational.prototype;

public class PrototypeClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		/* Create base Machine Images */
		MachineImage linuxVM = new MachineImage("Linux", "Symantec");
		MachineImage windowsVM = new MachineImage("Windows", "McAfee");

		/* Clone Linux VM and Install Web Server */
		MachineImage webServer = linuxVM.clone();
		webServer.install(" + Web Server S/W");

		/*
		 * Create a copy of the Web Server and install Application server on top of it
		 */
		MachineImage webAppServer = webServer.clone();
		webAppServer.install(" + App Server S/W");

		/* Clone Linux VM and Install DB Server */
		MachineImage dbServer = linuxVM.clone();
		dbServer.install(" + Database Server S/W");

		/* Create a test machine from Windows Image */
		MachineImage testMachine = windowsVM.clone();

		System.out.println("Web Server Configuration");
		webServer.printSw();
		System.out.println("App Server Configuration");
		webAppServer.printSw();
		System.out.println("DB Server Configuration");
		dbServer.printSw();
		System.out.println("Test Machine Configuration");
		testMachine.printSw();
	}

}
