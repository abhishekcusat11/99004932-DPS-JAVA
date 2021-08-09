package com.ltts.playerproject.dao;


import java.sql.Connection;
import java.sql.Statement;

import com.ltts.playerproject.configure.MyConfigure;
import com.ltts.playerproject.model.Player;

public class PlayerDAO {
	public boolean insertPlayer(Player p) throws Exception{
		Connection c = MyConfigure.getConnection();
		Statement s =c.createStatement();
		try {
			s.execute("insert into player values("+p.getPlayerNumber()+",'"+p.getPlayerName()+"','"+p.getSkill()+"','"+p.getCountry()+"','"+p.getMobile()+"')");
			return false;
		}
		catch(Exception e) {
			return true;
		}
		finally{
			c.close();
		}
}
	
}
