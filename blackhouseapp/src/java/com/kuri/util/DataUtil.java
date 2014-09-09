/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kuri.util;

import com.kuri.data.City;
import com.kuri.data.Province;
import com.kuri.dto.CityDTO;
import com.kuri.dto.ProvinceDTO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;

/**
 *
 * @author CodeTribe1
 */
public class DataUtil {
    

 public static void addProvince(ProvinceDTO p) throws DataException {
    {
        try {
        EntityManager em = EMUtil.getEntityManager();
        Province prov = new Province();
        prov.setName(p.getProvinceName());
        
        EntityTransaction tran = em.getTransaction();
        tran.begin();
        em.persist(prov);
        tran.commit();
        log.log(Level.OFF, "province has been added: {0}", p.getProvinceName());
        
    } catch (Exception e)
        {
        log.log(Level.OFF,"Something went wrong", e);
        throw new DataException(12);
        }
    
    }
    }
    static final Logger log = Logger.getLogger(DataUtil.class.getName());
    
    public void addCity(int provinceID, CityDTO c)
    {
        EntityManager em = EMUtil.getEntityManager();
        
        Province prov = em.find(Province.class, provinceID);
        City city = new City();
        city.setProvince(prov);
        city.setName(c.getName());
        
        EntityTransaction tran = em.getTransaction();
        tran.begin();
        em.persist(prov);
        tran.commit();
        
    }
   }
