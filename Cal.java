//U10316052

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.util.*;
import javafx.animation.*;
import java.util.*;
import javafx.event.*;

public class Cal extends Pane {

    // Place nodes in the pane
	Menu menuView = new Menu("檢視(V)");
	Menu menuEdit = new Menu("編輯(E)");
	Menu menu = new Menu("說明(H)");
	MenuBar menubar = new MenuBar();

	MenuItem b1 = new MenuItem("標準型(T)");
	MenuItem b2 = new MenuItem("工程型(S)");
	MenuItem b3 = new MenuItem("程式設計師(P)");
	MenuItem b4 = new MenuItem("統計資料(A)");
	MenuItem b5 = new MenuItem("歷程記錄(Y)");
	MenuItem b6 = new MenuItem("數字分位(I)");
	MenuItem b7 = new MenuItem("基本(B)");
	MenuItem b8 = new MenuItem("單位轉換(U)");
	MenuItem b9 = new MenuItem("日期計算(D)");
	MenuItem b10 = new MenuItem("工作表(W)");

	MenuItem c1 = new MenuItem("複製(C)");
	MenuItem c2 = new MenuItem("貼上(P)");
	MenuItem c3 = new MenuItem("歷程記錄(H)");
	
	MenuItem d1 = new MenuItem("檢視說明(V)");
	MenuItem d2 = new MenuItem("關於小算盤(A)");	
	

	Button MC=new Button("MC");
	Button MR=new Button("MR");
	Button MS=new Button("MS");
	Button Madd=new Button("M+");
	Button Md=new Button("M-");
	
	Button del=new Button("<");
	Button CE=new Button("CE");
	Button C=new Button("C");
	Button addandde=new Button("±");			
	Button sqrt=new Button("√");
	
	Button a7=new Button("7");
	Button a8=new Button("8");
	Button a9=new Button("9");
	Button devide=new Button("/");
	Button q1=new Button("%");
	
	Button a4=new Button("4");
	Button a5=new Button("5");
	Button a6=new Button("6");
	Button Multiply=new Button("*");
	Button q2=new Button("1/x");	
	
	Button a1=new Button("1");
	Button a2=new Button("2");
	Button a3=new Button("3");
	Button less=new Button("-");		
	Button equ=new Button("=");
	
	Button a0=new Button("0");
	Button q3=new Button(".");		
	Button add=new Button("+");
	
	String tryy;
	String a="0";
	int b=0;
	TextField tx=new TextField(a);
	
	

	public Cal(){
		menubar.setPrefSize(300,30);
		tx.setPrefSize(293,64);
		menubar.relocate(0,0);
		tx.relocate(4,30);
		
		MC.relocate(14,100);
		MR.relocate(69,100);
		MS.relocate(126,100);
		Madd.relocate(183,100);
		MC.setPrefSize(50,49);
		MR.setPrefSize(50,49);
		Md.relocate(238,100);
		MS.setPrefSize(50,49);
		Madd.setPrefSize(50,49);
		Md.setPrefSize(50,49);
		
		del.relocate(14,155);
		CE.relocate(69,155);
		C.relocate(126,155);
		addandde.relocate(183,155);
		sqrt.relocate(238,155);
		del.setPrefSize(50,49);
		CE.setPrefSize(50,49);
		C.setPrefSize(50,49);
		addandde.setPrefSize(50,49);
		sqrt.setPrefSize(50,49);
		
		a7.relocate(14,210);
		a8.relocate(69,210);
		a9.relocate(126,210);
		devide.relocate(183,210);
		q1.relocate(238,210);
		a7.setPrefSize(50,49);
		a8.setPrefSize(50,49);
		a9.setPrefSize(50,49);
		devide.setPrefSize(50,49);
		q1.setPrefSize(50,49);		
		
		a4.relocate(14,265);
		a5.relocate(69,265);
		a6.relocate(126,265);
		Multiply.relocate(183,265);
		q2.relocate(238,265);
		a4.setPrefSize(50,49);
		a5.setPrefSize(50,49);
		a6.setPrefSize(50,49);
		Multiply.setPrefSize(50,49);
		q2.setPrefSize(50,49);

		a1.relocate(14,320);
		a2.relocate(69,320);
		a3.relocate(126,320);
		less.relocate(183,320);
		equ.relocate(238,320);
		a1.setPrefSize(50,49);
		a2.setPrefSize(50,49);
		a3.setPrefSize(50,49);
		less.setPrefSize(50,49);
		equ.setPrefSize(50,98);

		a0.relocate(14,375);
		q3.relocate(126,375);
		add.relocate(183,375);
		a0.setPrefSize(100,49);
		q3.setPrefSize(50,49);
		add.setPrefSize(50,49);	
		
		tx.setAlignment(Pos.CENTER_RIGHT);
		tx.setEditable(false);	
		menu.getItems().addAll(d1,d2);
		menuEdit.getItems().addAll(c1,c2,c3);
		menuView.getItems().addAll(b1,b2,b3,b4,b5,b6,b6,b7,b8,b9,b10);
		menubar.getMenus().addAll(menuView,menuEdit,menu);
		getChildren().addAll(menubar);
		getChildren().addAll(tx,a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,q1,q2,q3,MC,MR,MS,Madd,Md);
		getChildren().addAll(del,C,CE,devide,less,addandde,sqrt,Multiply,add,equ);
  	}
	public void buttonAction(){
		a1.setOnAction(e -> {
			tryy=tx.getText();
			if(tryy.equals(a))
			tx.setText("1");
			else
			tx.setText(tx.getText()+"1");
		});
		
		a2.setOnAction(e -> {
			tryy=tx.getText();
			if(tryy.equals(a))
			tx.setText("2");
			else
			tx.setText(tx.getText()+"2");
		});		
		
		a3.setOnAction(e -> {
			tryy=tx.getText();
			if(tryy.equals(a))
			tx.setText("3");
			else
			tx.setText(tx.getText()+"3");
		});		
		
			a4.setOnAction(e -> {
			tryy=tx.getText();
			if(tryy.equals(a))
			tx.setText("4");
			else
			tx.setText(tx.getText()+"4");
		});	
		
		a5.setOnAction(e -> {
			tryy=tx.getText();
			if(tryy.equals(a))
			tx.setText("5");
			else
			tx.setText(tx.getText()+"5");
		});		

		a6.setOnAction(e -> {
			tryy=tx.getText();
			if(tryy.equals(a))
			tx.setText("6");
			else
			tx.setText(tx.getText()+"6");
		});
		
		a7.setOnAction(e -> {
			tryy=tx.getText();
			if(tryy.equals(a))
			tx.setText("7");
			else
			tx.setText(tx.getText()+"7");
		});

		a8.setOnAction(e -> {
			tryy=tx.getText();
			if(tryy.equals(a))
			tx.setText("8");
			else
			tx.setText(tx.getText()+"8");
		});
		
		a9.setOnAction(e -> {
			tryy=tx.getText();
			if(tryy.equals(a))
			tx.setText("9");
			else
			tx.setText(tx.getText()+"9");
		});		
		
		a0.setOnAction(e -> {
			tryy=tx.getText();
			if(tryy.equals(a))
			tx.setText("0");
			else
			tx.setText(tx.getText()+"0");
		});		
	
		q3.setOnAction(e -> {
			tryy=tx.getText();
			b=tryy.indexOf(".");
			if(b!=-1)
			tx.setText(tx.getText());
			else		
			tx.setText(tx.getText()+".");
		});	

		addandde.setOnAction(e -> {
			tryy=tx.getText();
			b=tryy.indexOf("-");
			if(b!=-1)
			tx.setText(tryy.replace("-", ""));
			else		
			tx.setText("-"+tx.getText());
		});	
		
		C.setOnAction(e -> {
			tx.setText("0");
		});			

		/*del.setOnAction(e -> {
			tryy=tx.getText();
			int len=tryy.length()-1;
			char last=tryy.chartAt(len);
			System.out.println(last);
			//tx.setText(split());
		});	
			*/
		
	}
	
