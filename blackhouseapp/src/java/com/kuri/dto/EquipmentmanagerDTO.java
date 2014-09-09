/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kuri.dto;

import com.kuri.data.Equipmentmanager;
import com.kuri.data.Organisation;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class EquipmentmanagerDTO {
     private Integer equipmentManagerID;
    
    private String equipmentManagerName;
    
    private String equipmentManagerSurname;
    
    private String equipmentManagerEmail;
    
    private String equipmentManagerTel;
   
    private String equipmentManagerAddress;
    
    private List<EqupmanageDTO> equpmanageList;
    
    private int organisationID;

    public EquipmentmanagerDTO(Equipmentmanager m) {
        equipmentManagerID = m.getEquipmentManagerID();
        equipmentManagerName = m.getEquipmentManagerName();
        equipmentManagerSurname = m.getEquipmentManagerSurname();
        equipmentManagerEmail  = m.getEquipmentManagerEmail();
        equipmentManagerTel = m.getEquipmentManagerTel();
        equipmentManagerAddress = m.getEquipmentManagerAddress();
        Organisation o = m.getOrganisation();
        
        
        
    }

    public Integer getEquipmentManagerID() {
        return equipmentManagerID;
    }

    public void setEquipmentManagerID(Integer equipmentManagerID) {
        this.equipmentManagerID = equipmentManagerID;
    }

    public String getEquipmentManagerName() {
        return equipmentManagerName;
    }

    public void setEquipmentManagerName(String equipmentManagerName) {
        this.equipmentManagerName = equipmentManagerName;
    }

    public String getEquipmentManagerSurname() {
        return equipmentManagerSurname;
    }

    public void setEquipmentManagerSurname(String equipmentManagerSurname) {
        this.equipmentManagerSurname = equipmentManagerSurname;
    }

    public String getEquipmentManagerEmail() {
        return equipmentManagerEmail;
    }

    public void setEquipmentManagerEmail(String equipmentManagerEmail) {
        this.equipmentManagerEmail = equipmentManagerEmail;
    }

    public String getEquipmentManagerTel() {
        return equipmentManagerTel;
    }

    public void setEquipmentManagerTel(String equipmentManagerTel) {
        this.equipmentManagerTel = equipmentManagerTel;
    }

    public String getEquipmentManagerAddress() {
        return equipmentManagerAddress;
    }

    public void setEquipmentManagerAddress(String equipmentManagerAddress) {
        this.equipmentManagerAddress = equipmentManagerAddress;
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
    
    
}
