/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 *
 * @author lenovo
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button start;//开始按钮
    @FXML
    private Button suspend;//暂停按钮
    @FXML
    private ListView<?> listview;//波形文件列表
    @FXML
    private ImageView imageview;//波形图
    @FXML
    private Button produce;//生谱按钮
    @FXML
    private ProgressIndicator progressindicator;//进度指示器
    @FXML
    private Button stop;//停止按钮
    @FXML
    private Text a;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleStartAction(ActionEvent event) {
        a.setText("开始按钮");
    }

    @FXML
    private void handleSuspendAction(ActionEvent event) {
         a.setText("暂停按钮");
    }

    @FXML
    private void handleProduceAcition(ActionEvent event) {
        a.setText("生谱按钮");
    }

    @FXML
    private void handleStopAcition(ActionEvent event) {
        a.setText("停止按钮");
    }
    
}
