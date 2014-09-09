/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kuri.dto;

import com.kuri.data.Equipment;
import com.kuri.data.Organisation;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class EquipmentDTO {
     private Integer equipmentID;
    
    private String equipmentName;
    
    private List<EqupmanageDTO> equpmanageList;
   
    private int organisationID;
    
    private List<InventoryDTO> inventoryList;

    public EquipmentDTO(Equipment e) {
        
        equipmentID = e.getEquipmentID();
        equipmentName = e.getEquipmentName();
        Organisation o = e.getOrganisationID();
        
        
    }

    public Integer getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(Integer equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public List<EqupmanageDTO> getEqupmanageList() {
        return equpmanageList;
    }

    public void setEqupmanageList(List<EqupmanageDTO> equpmanageList) {
        this.equpmanageList = equpmanageList;
    }

    public int getOrganisationID() {
        return organisationID;
    }

    public void setOrganisationID(int organisationID) {
        this.organisationID = organisationID;
    }

    public List<InventoryDTO> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<InventoryDTO> inventoryList) {
        this.inventoryList = inventoryList;
    }
    
}
