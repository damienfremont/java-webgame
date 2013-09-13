package com.webgame.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.webgame.abstraction.Building;

import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class BuildingBean implements Serializable {

	private static final long serialVersionUID = -4675969535938539940L;
	
	public BuildingBean() {
		this.buildingList = new ArrayList<Building>();
	}

	private ArrayList<Building> buildingList;
	
	// TODO BUILDING DATABASE
	private Building building = new Building("Hall de la colonie", true, 1);
	
	
	public String getName() {
		String name = null;
		
		for (int k=0; k<this.buildingList.size(); k++)
		{
			name = this.getBuildingList().get(k).getBuildingName();
		}
		
		return name;	
	}
	
	/* Add a building to the list */
	public void addBuilding() {
		System.out.println("Ceci doit apparait en ligne de commande!");
		this.buildingList.add(this.building);
	}
	
	/* Delete a building from the list */
	public void deleteBuilding() {
		this.buildingList.remove(this.building);
	}
	
	/* Getter */
	public ArrayList<Building> getBuildingList() {
		return this.buildingList;
	}
	
	/* Setter */
	public void setBuildingList(ArrayList<Building> buildingList) {
		this.buildingList = buildingList;
	}
	
	public Building setBuilding(Building building) {
		return this.building = building;
	}
}