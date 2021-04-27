package com.cognizant.LearnTodayRESTAPI.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
	@Id
	private int trainerId;
	private String password;
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", password=" + password + "]";
	}
	

}
