/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Staff;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Barno
 */
@Stateless
public class StaffFacade extends AbstractFacade<Staff> 
{

    @PersistenceContext(unitName = "TransportMgtSystemPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() 
    {
        return em;
    }

    public StaffFacade() 
    {
        super(Staff.class);
    }
    
}
