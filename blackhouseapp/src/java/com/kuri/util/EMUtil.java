/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kuri.util;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;
/**
 *
 * @author CodeTribe1
 */
public class EMUtil {

    private static final Logger LOG = Logger.getLogger("EMUtil");
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    private static void setEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("misfitPU");
        }
        if (em == null) {
            em = emf.createEntityManager();
            LOG.log(Level.INFO, "TesterWebApp EntityManager created OK", emf.toString());
        } else {
            if (!em.isOpen()) {
                em = emf.createEntityManager();
            }
        }
    }
    
    public static EntityManager getEntityManager(){
        setEntityManager();
        em.setFlushMode(FlushModeType.AUTO);
        return em;
    }
}
