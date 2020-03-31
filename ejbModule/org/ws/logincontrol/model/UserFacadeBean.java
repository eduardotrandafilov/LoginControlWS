package org.ws.logincontrol.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class UserFacadeBean
 */
@Stateless
public class UserFacadeBean implements UserFacadeBeanLocal {

    /**
     * Default constructor. 
     */
    public UserFacadeBean() {
        // TODO Auto-generated constructor stub
    		
    	}
    	@PersistenceContext
    	private EntityManager em;
    	public User getUser(String email) {
    		User user = em.find(User.class, email);
    		
    		if (user!=null) {
    			if(!user.getEmail().isEmpty()) {
    				return user;
    			}
    		}
    		return null;
    	}
    }
