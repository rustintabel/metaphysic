package metaphysic.mindmapping;

import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;



/**
 *
 * @author justin
 */
public class User {
	private String username;
	private int userID=0;
	private List<Integer> urlIDs= new ArrayList<Integer>();
	private List<Boolean> isURLAssociatedWithUserInDatabase= new ArrayList<Boolean>();
	/**
     *
     */
    public boolean needsUpdateingInDatabase=false;

	/**
     *
     * @param username
     * @param userID
     * @param newUser
     */
    public User (String username,int userID,boolean newUser) {
		this.username = username;
		this.userID=userID;
		needsUpdateingInDatabase=newUser;
	}
	
	/**
     *
     * @return
     */
    public int getId()
	{
		return userID;	
	}
	
	/**
     *
     * @param urlID
     * @param newUrlForThisUser
     */
    public void addUrl(int urlID,boolean newUrlForThisUser)
	{
		for(int i=0;i<urlIDs.size();i++)
		{
			if(urlIDs.get(i).intValue()==urlID)
			{
				return;
			}
		}

		urlIDs.add(urlID);
		isURLAssociatedWithUserInDatabase.add(!newUrlForThisUser);

	}
	
	/**
     *
     * @param i
     * @return
     */
    public int getUrl(int i)
	{
		return urlIDs.get(i);
	}
	
	/**
     *
     * @return
     */
    public List<Integer> getUrls()
	{
		return urlIDs;
	}

	/**
     *
     * @return
     */
    public String getUsername () {
		return this.username;
	}

	/**
     *
     * @param username
     */
    public void setUsername (String username) {
		this.username = username;
	}

	/**
     *
     * @return
     */
    public int getCount () {
		return urlIDs.size();
	}
	
	/**
     *
     * @param conn
     */
    public void updateInDatabase(Connection conn)
	{
		//update("CREATE TABLE UserTable ( UserID INTEGER, UserName VARCHAR(256), SetsUpdated DATE)", conn);
		//update("CREATE TABLE URLUsersTabel ( URLID INTEGER, UserID INTEGER )", conn);
		PreparedStatement ps = null;

			try{
				if(needsUpdateingInDatabase)
				{
					//add them and set the date updated.
					ps = conn.prepareStatement("INSERT INTO UserTable(UserID,UserName) VALUES(?,?)");
					ps.setInt(1, userID);
					ps.setString(2, username);
			        ps.executeUpdate();    // run the query  
			        conn.commit();
			        ps.close();
				}
				//for each of the users urls if not isURLAssociatedWithUserInDatabase
				//then add this user to URLUsersTabel with that urls id.
		        for(int i=0;i<urlIDs.size();i++)
		        {
		        	if(isURLAssociatedWithUserInDatabase.get(i)==false)
		        	{
						ps = conn.prepareStatement("INSERT INTO URLUsersTabel(URLID,UserID) VALUES(?,?)");
						ps.setInt(1, urlIDs.get(i));
						ps.setInt(2, userID);
				        ps.executeUpdate(); 
				        conn.commit();
				        ps.close();
				        isURLAssociatedWithUserInDatabase.set(i, true);
		        	}
		        }
			}catch(SQLException sqlException)
			{
				sqlException.printStackTrace();
			}
			
			needsUpdateingInDatabase=false;
		
	}


}
