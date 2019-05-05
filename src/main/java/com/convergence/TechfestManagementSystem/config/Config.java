package com.convergence.TechfestManagementSystem.config;

import java.util.ArrayList;

import antlr.collections.List;

public class Config {
	public static String addressLine1 = "Ganpat Vidyanagar";
	public static String addressLine2 = "Mehsana-Gozaria Highway";
	public static String addressLine3 = "Kherva-384012";
	public static String addressLine4 = "Mehsana";
	public static String collegeName = "U V Patel College of Engineering,Kherva";
	public static String shortNameofCollge = "UVPCE";
	static ArrayList<String> coordinatorList;
	static {
		coordinatorList = new ArrayList<String>();
		coordinatorList.add("Rishikumar chopda (+91 9574477105");
	}
	public static String startDate = "01/03/2019";
	public static String endDate = "26/02/2019";
	public static String eventName = "Convergence 2019";
	public static boolean isEventUpdateAllowed = true;
	public static boolean isLoginAllowed = true;
	public static boolean isRegistrationAllowed = true;

	//default false
	public static boolean isKeyDeleteAllwoed = false;
	
	public static String mailId = "convergence.uvpce@ganpatuniversity.ac.in";
	public static int maxNumberofEvents = 4;
	public static String redrctUrl = "http://convergence.uvpce.ac.in/2019";
	public static boolean isSepServer = false;
	public static boolean isStudentDeleteAllowed = false;
}
