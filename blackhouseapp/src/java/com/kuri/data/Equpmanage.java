/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kuri.data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "equpmanage")
@NamedQueries({
    @NamedQuery(name = "Equpmanage.findAll", query = "SELECT e FROM Equpmanage e"),
    @NamedQuery(name = "Equpmanage.findByEqupManageID", query = "SELECT e FROM Equpmanage e WHERE e.equpManageID = :equpManageID")})
public class Equpmanage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "equpManageID")
    private Integer equpManageID;
    @JoinColumn(name = "equipmentID", referencedColumnName = "equipmentID")
    @ManyToOne(optional = false)
    private Equipment equipmentID;
    @JoinColumn(name = "equipmentmanagerID", referencedColumnName = "equipmentManagerID")
    @ManyToOne(optional = false)
<<<<<<< HEAD
    private Equipmentmanager equipmentmanager;
=======
    private Equipmentmanager equipmentmanagerID;
>>>>>>> 76cec44c301978a92060d65583aadf88d51df71b

    public Equpmanage() {
    }

    public Equpmanage(Integer equpManageID) {
        this.equpManageID = equpManageID;
    }

    public Integer getEqupManageID() {
        return equpManageID;
    }

    public void setEqupManageID(Integer equpManageID) {
        this.equpManageID = equpManageID;
    }

    public Equipment getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(Equipment equipmentID) {
        this.equipmentID = equipmentID;
    }

<<<<<<< HEAD
    public Equipmentmanager getEquipmentmanager() {
        return equipmentmanager;
    }

    public void setEquipmentmanager(Equipmentmanager equipmentmanager) {
        this.equipmentmanager = equipmentmanager;
    }


=======
    public Equipmentmanager getEquipmentmanagerID() {
        return equipmentmanagerID;
    }

    public void setEquipmentmanagerID(Equipmentmanager equipmentmanagerID) {
        this.equipmentmanagerID = equipmentmanagerID;
    }

>>>>>>> 76cec44c301978a92060d65583aadf88d51df71b
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equpManageID != null ? equpManageID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equpmanage)) {
            return false;
        }
        Equpmanage other = (Equpmanage) object;
        if ((this.equpManageID == null && other.equpManageID != null) || (this.equpManageID != null && !this.equpManageID.equals(other.equpManageID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kuri.data.Equpmanage[ equpManageID=" + equpManageID + " ]";
    }
    
}
