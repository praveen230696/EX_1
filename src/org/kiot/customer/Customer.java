package org.kiot.customer;

/**
 *	Customer class contains basic details of an customer
 *	@version 04/03/2022
 *  @author praveen kandhan
 */
public class Customer {
	private int id;
	private long loanAmount, emiperMonth;
	private String loanHolderName, address, gender, loanSpecification;
	private float rateofInterest;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, long loanAmount, long emiperMonth, 
			String loanHolderName, String address, String gender,
			String loanSpecification, float rateofInterest) {
		super();
		this.id = id;
		this.loanAmount = loanAmount;
		this.emiperMonth = emiperMonth;
		this.loanHolderName = loanHolderName;
		this.address = address;
		this.gender = gender;
		this.loanSpecification = loanSpecification;
		this.rateofInterest = rateofInterest;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public long getEmiperMonth() {
		return emiperMonth;
	}
	public void setEmiperMonth(long emiperMonth) {
		this.emiperMonth = emiperMonth;
	}
	public String getLoanHolderName() {
		return loanHolderName;
	}
	public void setLoanHolderName(String loanHolderName) {
		this.loanHolderName = loanHolderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLoanSpecification() {
		return loanSpecification;
	}
	public void setLoanSpecification(String loanSpecification) {
		this.loanSpecification = loanSpecification;
	}
	public float getRateofInterest() {
		return rateofInterest;
	}
	public void setRateofInterest(float rateofInterest) {
		this.rateofInterest = rateofInterest;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", loanAmount=" + loanAmount + ", emiperMonth=" + emiperMonth
				+ ", loanHolderName=" + loanHolderName + ", address=" + address + ", gender=" + gender
				+ ", loanSpecification=" + loanSpecification + ", rateofInterest=" + rateofInterest + "]";
	}
	
}