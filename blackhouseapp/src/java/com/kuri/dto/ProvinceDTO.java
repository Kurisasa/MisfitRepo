/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kuri.dto;

import com.kuri.data.Province;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class ProvinceDTO {
    private Integer provinceID;
   
    private String name;
    
    private List<CityDTO> cityList;

    public ProvinceDTO(Province p) {
        provinceID = p.getProvinceID();
        name = p.getName();
        
        
    }

    public Integer getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CityDTO> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityDTO> cityList) {
        this.cityList = cityList;
    }

    public String getProvinceName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
