/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.gui;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import mytunes.bll.BLLManager;

/**
 *
 * @author Kristian Bertelsen
 */
public class MainWindowController implements Initializable {
    
    mytunes.bll.BLLManager BLL = new mytunes.bll.BLLManager();
    @FXML
    private Label label;
    @FXML
    private Button PlaylistsNew;
    @FXML
    private Button PlaylistsEdit;
    @FXML
    private Button PlaylistsDelete;
    @FXML
    private Button SongsonPlaylistUp;
    @FXML
    private Button SongsonPlaylistNed;
    @FXML
    private Button SongsDelete;
    @FXML
    private Button SongsEdit;
    @FXML
    private Button SongsNew;
    @FXML
    private Button SongsonPlaylistDelete;
    @FXML
    private Button tilbage;
    @FXML
    private Button spil;
    @FXML
    private Button næste;
    @FXML
    private TableView<?> playlistfelt;
    @FXML
    private TableColumn<?, ?> name;
    @FXML
    private TableColumn<?, ?> songs;
    @FXML
    private TableColumn<?, ?> time;
    @FXML
    private TableView<?> songsfelt;
    @FXML
    private TableColumn<?, ?> title;
    @FXML
    private TableColumn<?, ?> artist;
    @FXML
    private TableColumn<?, ?> genre;
    @FXML
    private TableColumn<?, ?> SongsonPlaylistfelt;
    @FXML
    private Button tilVentes;
    @FXML
    private Button søge;
    @FXML
    private TextField søgefelt;
    @FXML
    private Button SongsClose;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void newPlaylist(ActionEvent event) {
    }

    @FXML
    private void editPlaylist(ActionEvent event) {
    }

    @FXML
    private void deletePlaylist(ActionEvent event) {
    }

    @FXML
    private void playlistSongUp(ActionEvent event) {
    }

    @FXML
    private void playlistSongDown(ActionEvent event) {
    }

    @FXML
    private void deleteSong(ActionEvent event) {
    }

    @FXML
    private void editSong(ActionEvent event) {
    }

    @FXML
    private void newSong(ActionEvent event) throws SQLException {
        BLL.addSong();
    }

    @FXML
    private void deleteFromPlaylist(ActionEvent event) {
    }

    @FXML
    private void prevSong(ActionEvent event) {
    }

    @FXML
    private void playPauseSong(ActionEvent event) {
    }

    @FXML
    private void nextSong(ActionEvent event) {
    }

    @FXML
    private void searchForSong(ActionEvent event) {
    }

    @FXML
    private void closeMyTunes(ActionEvent event) {
    }
    
}
