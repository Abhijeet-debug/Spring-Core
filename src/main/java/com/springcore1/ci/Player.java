package com.springcore1.ci;

import java.util.List;

public class Player {
	private String pName;
	private int pId;
	private List<String> pSkills;
	private Adress pAdress;

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public List<String> getpSkills() {
		return pSkills;
	}

	public void setpSkills(List<String> pSkills) {
		this.pSkills = pSkills;
	}

	public Adress getpAdress() {
		return pAdress;
	}

	public void setpAdress(Adress pAdress) {
		this.pAdress = pAdress;
	}

	public Player(String pName, int pId, List<String> pSkills, Adress pAdress) {
		super();
		this.pName = pName;
		this.pId = pId;
		this.pSkills = pSkills;
		this.pAdress = pAdress;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Player [pName=" + pName + ", pId=" + pId + ", pSkills=" + pSkills + ", pAdress=" + pAdress + "]";
	}

}
