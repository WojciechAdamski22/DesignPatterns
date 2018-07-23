package com.pattern.design.behavioral.command.invoker;

import com.pattern.design.behavioral.command.commands.Command;

public class Waiter {

	/*
	 * Waiter does not need to know about the details of the command
	 */
	public void execute(Command command) {
		command.execute();
	}
}
