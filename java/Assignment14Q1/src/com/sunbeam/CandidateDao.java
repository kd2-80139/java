package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CandidateDao implements AutoCloseable {
	private Connection con;
	public CandidateDao() throws SQLException{
		con=DUtil.getCon();
	}
	public void close(){
		try {
			if(con!=null)
				con.close();
		}
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//delete given candidate
	public int deleteById(int id)throws SQLException {
		String sql="delete from candidates where id=?";
		
		try(PreparedStatement stmt =con.prepareStatement(sql)){
			stmt.setInt(1,id);
			int cnt=stmt.executeUpdate();
			return cnt;
		}//stmt.close();
	}
	//Add Candidate
	public int addCandidate(Candidate c) throws SQLException {
		String sql="insert into candidates values(default,?,?,0)";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
	//Modify Cnadidate
	public int modifyCandidate(Candidate c)throws SQLException{
		String sql="update candidates set name=? , party=? where id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getId());
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
	//Display All
	public List<Candidate> displayAll()throws SQLException{
		List<Candidate> list=new ArrayList<>();
		String sql="select * from candidates";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			try(ResultSet rs=stmt.executeQuery()){
				while(rs.next()) {
					Candidate c=new Candidate();
					c.setId(rs.getInt("id"));
					c.setName(rs.getString("name"));
					c.setParty(rs.getString("party"));
					c.setVotes(rs.getInt("votes"));
					list.add(c);
				}
			}
		}
		return list;
	}
		//Increment vote
		public int incrementVotes(int id)throws SQLException{
			String sql="update candidates set votes=votes+1 where id=?";
			try(PreparedStatement stmt=con.prepareStatement(sql)){
				stmt.setInt(1, id);
				int cnt=stmt.executeUpdate();
				return cnt;
			}
			
		}
		//Count Votes
		public List<PartyVotes> getPartyVotes()throws SQLException{
			
			List<PartyVotes> list=new ArrayList<PartyVotes>();
			String sql="Select party,sum(votes)as total from candidates group by party order by total desc";
			try(PreparedStatement stmt=con.prepareStatement(sql)){
				try(ResultSet rs=stmt.executeQuery()){
					while(rs.next()) {
						PartyVotes pv=new PartyVotes();
						pv.setParty(rs.getString("party"));
						pv.setVotes(rs.getInt("total"));
						list.add(pv);
					}
				}
				
			}
			return list;
		}
	
	
	

}
