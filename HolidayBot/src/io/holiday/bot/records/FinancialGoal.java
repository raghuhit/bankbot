package io.holiday.bot.records;

public class FinancialGoal {

	private String goalName;
	private String goalDescription;
	private double amount;
	
	public FinancialGoal(String goalName, String goalDescription, double amount) {
		this.goalName=goalName;
		this.goalDescription=goalDescription;
		this.amount=amount;
	}
	public String getGoalName() {
		return goalName;
	}
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	public String getGoalDescription() {
		return goalDescription;
	}
	public void setGoalDescription(String goalDescription) {
		this.goalDescription = goalDescription;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
