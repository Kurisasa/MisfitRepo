/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kuri.dto;

import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class UserDTO {
     private Integer userID;
    
    private String userName;
    
    private String userSurname;
    
    private String userEmaill;
    
    private String userTel;
   
    private Integer userStatus;
   
    private int organisationID;
    
    private List<UserinventoryDTO> userinventoryList; 

    public UserDTO() {
    }
    
}
