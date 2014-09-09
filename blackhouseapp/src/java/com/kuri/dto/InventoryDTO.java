/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kuri.dto;

import com.kuri.data.Equipment;
import com.kuri.data.Inventory;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class InventoryDTO {
     private Integer inventoryID;
   
    private String inventoryName;
    
    private String inventoryModel;
   
    private String inventorySerialNo;
    
    private int equipmentID;
    
    private List<UserinventoryDTO> userinventoryList;

    public InventoryDTO(Inventory i) {
        inventoryID = i.getInventoryID();
        inventoryName = i.getInventoryName();
        inventoryModel = i.getInventoryModel();
        Equipment e = i.getEquipmentID();
        inventorySerialNo = i.getInventorySerialNo();
        
        
        
    }

    public Integer getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(Integer inventoryID) {
        this.inventoryID = inventoryID;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public String getInventoryModel() {
        return inventoryModel;
    }

    public void setInventoryModel(String inventoryModel) {
        this.inventoryModel = inventoryModel;
    }

    public String getInventorySerialNo() {
        return inventorySerialNo;
    }

    public void setInventorySerialNo(String inventorySerialNo) {
        this.inventorySerialNo = inventorySerialNo;
    }

    public int getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(int equipmentID) {
        this.equipmentID = equipmentID;
    }

    public List<UserinventoryDTO> getUserinventoryList() {
        return userinventoryList;
    }

    public void setUserinventoryList(List<UserinventoryDTO> userinventoryList) {
        this.userinventoryList = userinventoryList;
    }
    
    
}
