package com.pattern.design.structural.proxy;

public class ProxyServer implements Server {

	private RealServer realServer;
	private boolean isSessionActive;
	
	public ProxyServer() {
		this.realServer = new RealServer();
		isSessionActive = false;
	}

	@Override
	public void authenticate() {
		realServer.authenticate();
		isSessionActive = true;
	}

	@Override
	public void get() {
		if(isSessionActive) {
			realServer.get();
		} else {
			System.out.println("Invalid session");
		}
	}

	@Override
	public void post() {
		if(isSessionActive) {
			realServer.post();
		} else {
			System.out.println("Invalid session");
		}
	}

	@Override
	public void put() {
		if(isSessionActive) {
			realServer.put();
		} else {
			System.out.println("Invalid session");
		}
	}

	@Override
	public void delete() {
		if(isSessionActive) {
			realServer.delete();
		} else {
			System.out.println("Invalid session");
		}
	}

	@Override
	public void logout() {
		realServer.logout();
		isSessionActive = false;
	}

}
