package com.test.connection;

import java.sql.*;

/**
 * This class contains methods for creating database connection objects 
 * @author Joe Litwack
 *
 */
public class SQL {
	
	/*
	 * Allow users to specify what kind of SQL connection they wish to use
	 * depending on an argument used in the constructor 
	 */
	public SQL() {}
	
	private Connection con; 
	
	public void setConnection(enum con) {
		switch(con) {
		  case MySQL:
			  // connect to mySQL
			  // this.con = new MySQL connection
			  break;
		  case MsSQL:
		  	  // connect to MsSQL
		      // this.con = new MsSQL connection
		}
	}
	
	/**
	 * Connect to database 
	 */
	public void connect() {}

	/**
	 * Disconnect SQL databse
	 */
	public void disconnect() {
		try {
			con.close();
		}
		catch(SQLException e) {}
		
	}
	
	public Connection getConnection() {
		return con;
	}

	public void createQuery(String vQuery) {}
	
	public void insert(String vInsert) {}
	
}
