package metaphysic.mindmapping;

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
public class Url {
	private String url;
	private int URLId=0;
	private String usersPageURL;
	/**
     *
     */
    public boolean needsUpdateingInDatabase=true;
	private int savedByHowMAnyOtherUSers=0;

	/**
     *
     * @param url
     * @param usersPageURL
     * @param URLID
     * @param savedByHowMAnyOtherUSers
     * @param needsUpdateingInDatabase
     */
    public Url (String url,String usersPageURL, int URLID,int savedByHowMAnyOtherUSers,boolean needsUpdateingInDatabase) {
		this.url = url;
		this.URLId=URLID;
		this.usersPageURL=usersPageURL;
		this.savedByHowMAnyOtherUSers=savedByHowMAnyOtherUSers;
		this.needsUpdateingInDatabase=needsUpdateingInDatabase;
	}
	
	/**
     *
     * @return
     */
    public int getURLID()
	{
		return this.URLId;
	}
	
	
	/**
     *
     * @return
     */
    public String getUsersPageURL()
	{
		return this.usersPageURL;
	}
	
	/**
     *
     * @return
     */
    public int GetHowManyOtherUsersHaveSavedThisURL()
	{
		return this.savedByHowMAnyOtherUSers;
	}

	/**
     *
     * @return
     */
    public String getUrl () {
		return this.url;
	}

	/**
     *
     * @param url
     */
    public void setUrl (String url) {
		this.url = url;
	}
	
	/**
     *
     * @param conn
     * @return
     */
    public boolean updateInDatabase(Connection conn)
	{
//update("CREATE TABLE URLTabel ( URLID INTEGER, URL VARCHAR(1000), UsersPageURL VARCHAR(1000), SavedByHowManyUsers INTEGER)", conn);
		PreparedStatement ps = null;
		Statement st = null;
		if(needsUpdateingInDatabase)
		{

			try{
				//remove from database
		        st = conn.createStatement();
		        st.executeUpdate("DELETE FROM URLTabel WHERE URLID = "+URLId);
				conn.commit();
		        st.close();
		        
		        //add this url to url table
				ps = conn.prepareStatement("INSERT INTO URLTabel(URLID,URL,UsersPageURL,SavedByHowManyUsers) VALUES(?,?,?,?)");
				ps.setInt(1, URLId);
				ps.setString(2, url);
				ps.setString(3, usersPageURL);
				ps.setInt(4, savedByHowMAnyOtherUSers);
		        ps.executeUpdate(); 
		        conn.commit();
		        ps.close();
		        
			}catch(SQLException sqlException)
			{
				sqlException.printStackTrace();
			}
			needsUpdateingInDatabase=false;
			return true;
		}
		return false;
	}
}
