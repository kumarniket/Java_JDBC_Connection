package com.JDBC.Connectivity;

public class CRUDOperationJava {
	
	private DBManager db;
	
	//constructor
	public CRUDOperationJava() {
		db = new DBManager();
	}
	
	public void selectData() {
		db.selectRecord();
	}
	
	//insert data in table
	public void insertData(int ID, String StudentName, String StudentDept, int StudentMarks) {
		String cmd = "INSERT INTO Student(StudentID, StudentName, StudentDept, StudentMarks) VALUES('"+ID+"','"+StudentName+"','"+StudentDept+"','"+StudentMarks+"')";
		if(db.recordManupulation(cmd)) {
			System.out.println("Record has been inserted Succcessfully !!");
		} else {
			System.out.println("Record has been not inserted - Failed !!");
		}
	}
	
	// update record in table
	public void updateRecord(int ID,int StudentMarks) {
		String cmd = "UPDATE Student SET StudentMarks = '"+StudentMarks+"' WHERE StudentID = '"+ID+"'";
		if(db.recordManupulation(cmd)) {
			System.out.println("Marks Record has been Updated Succcessfully for StudentID-> " + ID);
		} else {
			System.out.println("Record has failed to Update !!");
		}
	}
	
	// Delete record in table
		public void deleteRecord(int ID) {
			String cmd = "DELETE FROM Student WHERE StudentID = '"+ID+"'";
			if(db.recordManupulation(cmd)) {
				System.out.println("Student id- " +ID+ " Record has been deleted Succcessfull !!");
			} else {
				System.out.println("Record has Failed to delete, Might be Student id -> " + ID + " Not Present in Table");
			}
			System.out.println();
			System.out.println("*** Present Record in Student Table ***");
		}
	
	
	

}
