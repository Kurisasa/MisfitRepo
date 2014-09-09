/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kuri.dto;

import com.kuri.data.Consultant;
import com.kuri.data.Consultantorganisation;
import com.kuri.data.Organisation;

/**
 *
 * @author CodeTribe1
 */
public class ConsultantorganisationDTO {
     private Integer consultantOrganisationID;
    
    private int consultantID;
    
    private int organisationID;

    public ConsultantorganisationDTO(Consultantorganisation d) {
        consultantOrganisationID = d.getConsultantOrganisationID();
        Consultant c = d.getConsultantID();
        consultantID  = c.getConsultantID();
        Organisation o = d.getOrganisation();
        organisationID = o.getOrganisationID();
        
        
               
                
        
    }

    public Integer getConsultantOrganisationID() {
        return consultantOrganisationID;
    }

    public void setConsultantOrganisationID(Integer consultantOrganisationID) {
        this.consultantOrganisationID = consultantOrganisationID;
    }

    public int getConsultantID() {
        return consultantID;
    }

    public void setConsultantID(int consultantID) {
        this.consultantID = consultantID;
    }

    public int getOrganisationID() {
        return organisationID;
    }

    public void setOrganisationID(int organisationID) {
        this.organisationID = organisationID;
    }
    
    

    
}
