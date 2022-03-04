package org.kiot.customeroperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import org.kiot.customer.Customer;

/**
 *	CustomerSupporty class performs customer operations
 *	@version 04/03/2022
 *  @author praveen kandhan
 */
public class CustomerSupport {
	
	public CustomerSupport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void doCustomerOperations(){
		// TODO Auto-generated method stub
		try {
			Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/customerdb",
                    "root", "root");
			
			if (connection != null) {
				System.out.println("Database Connected successfully");
				Statement statement = connection.createStatement();
				System.out.println("***loan holder details whose residence "
						+ "is Chennai***");
				ResultSet resultSet1 = statement.executeQuery
						("select * from customer where address='chennai' ");
				while (resultSet1.next()) {
					System.out.println(resultSet1.getInt(1) + " "
							+ resultSet1.getString(2) + " "
							+ resultSet1.getString(3) + " "
							+ resultSet1.getString(4) + " "
							+ resultSet1.getString(5) + " "
							+ resultSet1.getString(6) + " "
							+ resultSet1.getString(7) + " "
							+ resultSet1.getString(8));
				}
				ResultSet resultSet2 = statement.executeQuery
						("select * from customer where gender='male'");
				System.out.println("***Segregated the customer as per "
						+ "the gender(Male)***");
				while (resultSet2.next()) {
					System.out.println(resultSet2.getInt(1) + " "
							+ resultSet2.getString(2) + " "
							+ resultSet2.getString(3) + " "
							+ resultSet2.getString(4) + " "
							+ resultSet2.getString(5) + " "
							+ resultSet2.getString(6) + " "
							+ resultSet2.getString(7) + " "
							+ resultSet2.getString(8));
				}
				
				ResultSet resultSet3 = statement.executeQuery
						("select * from customer where gender='Female'");
				System.out.println("***Segregated the customer as per the "
						+ "gender"+ "(Female)***");
				while (resultSet3.next()) {
					System.out.println(resultSet3.getInt(1) + " "
							+ resultSet3.getString(2) + " "
							+ resultSet3.getString(3) + " "
							+ resultSet3.getString(4) + " "
							+ resultSet3.getString(5) + " "
							+ resultSet3.getString(6) + " "
							+ resultSet3.getString(7) + " "
							+ resultSet3.getString(8));
				}
				
				ResultSet resultSet4 = statement.executeQuery
						("select * from customer where loanamount > 300000");
				System.out.println("***loan holder details whose loan amount "
						+ "is more than three lakhs***");
				while (resultSet4.next()) {
					System.out.println(resultSet4.getInt(1) + " "
							+ resultSet4.getString(2) + " "
							+ resultSet4.getString(3) + " "
							+ resultSet4.getString(4) + " "
							+ resultSet4.getString(5) + " "
							+ resultSet4.getString(6) + " "
							+ resultSet4.getString(7) + " "
							+ resultSet4.getString(8));
				}
				ResultSet resultSet5 = statement.executeQuery
						("select rateofinterest from customer where "
								+ "loanholdername='Raman' ");
				System.out.println("***Arjun’s rate of Interest***");
				while (resultSet5.next()) {
					System.out.println(resultSet5.getString("rateofinterest")
							+ "%");
				}

				connection.close();

			} else {
				throw new SQLException("Database Connection failed");
			}
			
			connection.close();
		
			} catch(SQLException e) {
				System.out.println(e.getMessage());

			}
	}
}