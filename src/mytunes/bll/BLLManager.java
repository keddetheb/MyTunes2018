/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.bll;
import java.sql.SQLException;
import mytunes.dal.DAO;
/**
 *
 * @author kedde
 */
public class BLLManager {
    
    mytunes.dal.DAO DAO = new mytunes.dal.DAO();
    
    public void addSong() throws SQLException {
        DAO.addSong();
    }
}
