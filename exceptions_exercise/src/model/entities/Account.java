package model.entities;

import model.exception.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {

		balance += amount;
	}

	public void withdraw(Double amount) {
		if (amount > withdrawLimit) {
			throw new DomainException("Erro no saque: Quantia excedeu o limite de saque!");
		}
		 if (amount > balance) {
			 throw new DomainException("N�o possui saldo suficiente!");
		 }

		balance -= amount;
	}

	@Override
	public String toString() {
		return "Novo Saldo= " + String.format("%.2f", getBalance());
	}

}
