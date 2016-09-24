package io.holiday.bot.records;

public class Account {

	private String id;
	private double bal;
	private String name;
	
	public Account(String name, String id, double bal) {
		this.name=name;
		this.id=id;
		this.bal=bal;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
