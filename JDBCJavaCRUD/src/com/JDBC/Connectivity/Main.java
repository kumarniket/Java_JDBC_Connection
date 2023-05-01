package com.JDBC.Connectivity;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is
		
		//new DBManager().selectRecord();
		CRUDOperationJava bss = new CRUDOperationJava();
//		View Record in Student Table
//		bss.selectData();
		 
		// Insert record in Student Table
//		bss.insertData(107, "Cat", "ECE", 133);
//		bss.insertData(108, "Rat", "BSC", 199);
//		bss.insertData(109, "Dog", "CSE", 300);
//		bss.selectData();
		
		//Update Student Marks corresponded to Student I'd
//		bss.updateRecord(108, 233);
//		bss.selectData();
		
		//Delete record in student table 
		bss.deleteRecord(108);
		bss.selectData();
		

	}

}
