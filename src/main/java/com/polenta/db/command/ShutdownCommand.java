package com.polenta.db.command;

import com.polenta.db.Command;

public class ShutdownCommand implements Command {

	private String statement;
	
	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String execute() {
		// TODO Auto-generated method stub
		return null;
	}

}
