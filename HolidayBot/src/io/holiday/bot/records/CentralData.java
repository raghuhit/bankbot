package io.holiday.bot.records;

import java.util.HashMap;
import java.util.Map;

public class CentralData {

	private Map<String, Account> accounts=new HashMap<String, Account>();
	private Map<String,FinancialGoal> goals=new HashMap<String, FinancialGoal>();
	public Map<String, Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Map<String, Account> accounts) {
		this.accounts = accounts;
	}
	public Map<String, FinancialGoal> getGoals() {
		return goals;
	}
	public void setGoals(Map<String, FinancialGoal> goals) {
		this.goals = goals;
	}
	
	
	
}
