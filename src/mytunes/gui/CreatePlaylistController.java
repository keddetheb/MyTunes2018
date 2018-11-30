/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author simge
 */
public class CreatePlaylistController implements Initializable
    {

    @FXML
    private Label PlaylistName;
    @FXML
    private TextField txtInput;
    @FXML
    private Button CancelPlaylist;
    @FXML
    private Button SavePlaylist;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
        {
        // TODO
        }    
    
    }
