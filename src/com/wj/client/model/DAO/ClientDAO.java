package com.wj.client.model.DAO;

public class ClientDAO {
	private static ClientDAO instance = null;
	private ClientDAO() {}

	public static ClientDAO getInstance() {
		if(instance==null) {
			synchronized (ClientDAO.class) {
				instance = new ClientDAO();
			}
		}
		return instance;
	}
	
	
	//-------------------------------------- Client table Query--------------------------------------//
	
	
	
	
}
