/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myTunes.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author maxim
 */
public class MitSynController implements Initializable
{

    @FXML
    private Button NewPlaylists;
    @FXML
    private Button EditPlaylists;
    @FXML
    private Button DeletePlaylists;
    @FXML
    private Button DeleteSongsonPlaylist;
    @FXML
    private Button NewSongs;
    @FXML
    private Button EditSongs;
    @FXML
    private Button DeleteSongs;
    @FXML
    private Button Close;
    @FXML
    private Button UpSongsonPlaylist;
    @FXML
    private Button NedSongsonPlaylist;
    @FXML
    private TextField SøgeFelt;
    @FXML
    private Button TilVenster;
    @FXML
    private Button Søge;
    @FXML
    private Label Playlists;
    @FXML
    private Label Songs;
    @FXML
    private TableView<?> PlaylistsFelt;
    @FXML
    private TableColumn<?, ?> Name;
    @FXML
    private TableColumn<?, ?> Time;
    @FXML
    private TableView<?> SongsFelt;
    @FXML
    private TableColumn<?, ?> Title;
    @FXML
    private TableColumn<?, ?> Artist;
    @FXML
    private TableColumn<?, ?> Category;
    @FXML
    private TableColumn<?, ?> Tme;
    @FXML
    private TableView<?> SongsonPlaylistFelt;
    @FXML
    private Button Tilbage;
    @FXML
    private Button Spil;
    @FXML
    private Button Næste;
    @FXML
    private Slider Lydstykke;
    @FXML
    private Label IsPlaying;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
