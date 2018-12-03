/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTunes.gui;

import MyTunes.be.SongModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author kedde
 */
public class CreateSongController implements Initializable {
MyTunes.be.SongModel songModel;
MyTunes.gui.MainWindowController mainWindowController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setSongModel(SongModel SongModel) {
        this.songModel = SongModel;
    }
    public void setMainWindowController(MainWindowController mainWindowControler) {
        this.mainWindowController =mainWindowControler;
    }
}
