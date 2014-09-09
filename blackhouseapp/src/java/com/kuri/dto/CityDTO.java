/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kuri.dto;

import com.kuri.data.City;
import com.kuri.data.Province;

/**
 *
 * @author CodeTribe1
 */
public class CityDTO {
    private Integer cityID;
  
    private String name;
    
    private int province;
    private final int ProvinceID;
    

    public CityDTO(City c) {
        cityID = c.getCityID();
        name  = c.getName();
        Province p = c.getProvince();
        ProvinceID = p.getProvinceID();
        
        
               
        
        
        
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }
    
    
    
}
