package com.yedam.question_java;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.ResourceBundle;

import com.yedam.classes.Student;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class QuizController implements Initializable {
	Connection conn;
	int numi = 1;
	ObservableList<Quiz> list = FXCollections.observableArrayList();
	@FXML
	Button btnOk, btnNext, btnClose;
	@FXML
	Label quiz;
	@FXML
	Label select1, select2, select3;
	@FXML 
	VBox answerlist;
	ObservableList<Quiz> explain;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		explain = FXCollections.observableArrayList();
		
		btnOk.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				btnOkAction(event);
			}		
		});		
		
		quiz.setText(getQuizList().get(0).getQuiz());
		select1.setText(getQuizList().get(0).getSelect1());
		select2.setText(getQuizList().get(0).getSelect2());
		select3.setText(getQuizList().get(0).getSelect3());
		
	}

	public ObservableList<Quiz> getQuizList() {
		
		Random random = new Random();
		numi = random.nextInt(5) + 1;
		String sql = "select *  from question where num =" + numi;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Quiz board = new Quiz(rs.getInt("num"), rs.getString("quiz"), rs.getInt("r1"), rs.getString("select1"),
						rs.getInt("r2"), rs.getString("select2"), rs.getInt("r3"), rs.getString("select3"),
						rs.getInt("answer"), rs.getString("answerlist"));
				list.add(board);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}


	public void btnOkAction(ActionEvent ae) {
		Stage addStage = new Stage(StageStyle.UTILITY);
		addStage.initModality(Modality.WINDOW_MODAL);
		addStage.initOwner(btnOk.getScene().getWindow());
		
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("Answer.fxml"));
			Scene scene = new Scene(parent);
			addStage.setScene(scene);
			addStage.setResizable(false);
			addStage.show();
			
			Button btnNext = (Button) parent.lookup("#btnNext");
			btnNext.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					VBox answerlist = (VBox) parent.lookup("#answerlist");
				}
				
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();

	}

}
