/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.dal;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kedde
 */
public class DAO {
    
    ConnectionManager cM = new ConnectionManager();
    
    public void addSong() throws SQLServerException, SQLException
    {
            try (Connection con = cM.getConnection()){
            PreparedStatement stmt;
            stmt = con.prepareStatement("INSERT INTO Song(name, artist, genre, length, path) VALUES(?,?,?,?,?)");
            stmt.setString(1, "Thing");
            stmt.setString(2, "Someone");
            stmt.setString(3, "Something");
            stmt.setDouble(4, 3.40);
            stmt.setString(5, "Somewhere");
            stmt.executeUpdate();
        }
        
        catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void addPlaylist(String playName) throws SQLServerException, SQLException
    {
            try (Connection con = cM.getConnection()){
            PreparedStatement stmt;
            stmt = con.prepareStatement("INSERT INTO Playlist(Name) VALUES(?)");
            stmt.setString(1, playName);
            stmt.executeUpdate();
        }
        
        catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
