
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.w3c.dom.css.ElementCSSInlineStyle;


public class Calcul extends JFrame implements ActionListener {
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton buttonadd;
	private JButton buttonsous;
	private JButton buttonmul;
	private JButton buttondiv;
	private JButton buttonegale;
	private JButton buttonvir;
	private JButton buttonclear;
	private JLabel label;
	//attributs
	 private double resA=0.0;
	 private double resB=0.0;
     private double res=0.0;
	 private String strA="";
	 private String strB="";
	 private String str="";
	 private int operation;
	 double str1;
	 	
	
	public Calcul(){
		
		setTitle("Calculatrice");
		setSize(170,300);
		getContentPane().setLayout(new FlowLayout());//aranger les boutons dans a fenetre
		    
		button0=new JButton("0");
		getContentPane().add(button0);
		button1=new JButton("1");
		getContentPane().add(button1);
		button2=new JButton("2");
		getContentPane().add(button2);
		button3=new JButton("3");
		getContentPane().add(button3);
		button4=new JButton("4");
		getContentPane().add(button4);
		button5=new JButton("5");
		getContentPane().add(button5);
		button6=new JButton("6");
		getContentPane().add(button6);
		button7=new JButton("7");
		getContentPane().add(button7);
		button8=new JButton("8");
		getContentPane().add(button8);
		button9=new JButton("9");
		getContentPane().add(button9);
		buttonadd=new JButton("+");
		getContentPane().add(buttonadd);
		buttonsous=new JButton("-");
		getContentPane().add(buttonsous);
		buttonmul=new JButton("*");
		getContentPane().add(buttonmul);
		buttondiv=new JButton("/");
		getContentPane().add(buttondiv);
		buttonegale=new JButton("=");
		getContentPane().add(buttonegale);
		buttonvir=new JButton(".");
		getContentPane().add(buttonvir);
		buttonclear=new JButton("Clear");
		getContentPane().add(buttonclear);
		
		label=new JLabel("result");
		getContentPane().add(label);
		
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		buttonadd.addActionListener(this);
		buttonsous.addActionListener(this);
		buttondiv.addActionListener(this);
		buttonmul.addActionListener(this);
		buttonegale.addActionListener(this);
		buttonvir.addActionListener(this);
		buttonclear.addActionListener(this);
		//label.addAncestorListener(null);
	
	/*public void setStrA(String srA) {
		strA = srA;
	}
	public String getStrA() {
		return strA;
	}*/
	}
		public void actionPerformed(ActionEvent ev) {
			// TODO Auto-generated method stub
			
			if (ev.getSource() == button0){
				System.out.println ("action sur bouton numero 0") ;
			strA=strA+"0";   //concatenation
			label.setText(strA);
			if( operation==1 || operation==2 || operation==3 || operation==4 ){
			/*if(operation==1){
			strB=strB+"0";}
			else if(operation==2) {
				strB=strB+"0";}
			else if(operation==3){
				strB=strB+"0";}
			else if(operation==4){
				strB=strB+"0";
			}*/
			label.setText(strB);
			}
			}
			
			if (ev.getSource() == button1){
				System.out.println ("action sur bouton numero 1") ;
				strA=strA+"1"; 
				label.setText(strA);
			if( operation==1 || operation==2 || operation==3 || operation==4 ){
				strB=strB+"1";
				label.setText(strB);
			}}
			
			if (ev.getSource() == button2){
				System.out.println ("action sur bouton numero 2") ;
				strA=strA+"2"; 
				label.setText(strA);
				 if( operation==1 || operation==2 || operation==3 || operation==4 ){
				strB=strB+"2";
				label.setText(strB);
			}}
			if (ev.getSource() == button3){
				System.out.println ("action sur bouton numero 3") ;
				strA=strA+"3"; //
				label.setText(strA);
			if( operation==1 || operation==2 || operation==3 || operation==4 ){
				strB=strB+"3";
				label.setText(strB);
			}}
			
			if (ev.getSource() == button4){
				System.out.println ("action sur bouton numero 4") ;
				strA=strA+"4"; 
				label.setText(strA);
				if( operation==1 || operation==2 || operation==3 || operation==4 ){
				strB=strB+"4";
				label.setText(strB);
			}}
		
			if (ev.getSource() == button5){
				System.out.println ("action sur bouton numero 5") ;
				strA=strA+"5"; 
				label.setText(strA);
				if( operation==1 || operation==2 || operation==3 || operation==4 ){
				strB=strB+"5";
				label.setText(strB);
			}}
			
			if (ev.getSource() == button6){
				System.out.println ("action sur bouton numero 6") ;
				strA=strA+"6"; 
				label.setText(strA);
				if( operation==1 || operation==2 || operation==3 || operation==4 ){
				strB=strB+"6";
				label.setText(strB);
			}}
			
			if (ev.getSource() == button7){
				System.out.println ("action sur bouton numero 7") ;
				strA=strA+"7"; 
				label.setText(strA);
			     if( operation==1 || operation==2 || operation==3 || operation==4 ){
				strB=strB+"7";
				label.setText(strB);
			}}
			
			if (ev.getSource() == button8){
				System.out.println ("action sur bouton numero 8") ;
				strA=strA+"8"; 
				label.setText(strA);
			   if( operation==1 || operation==2 || operation==3 || operation==4 ){
				strB=strB+"8";
				label.setText(strB);
			}}
			
			if (ev.getSource() == button9){
				System.out.println ("action sur bouton numero 9") ;
				strA=strA+"9"; 
				label.setText(strA);
			if( operation==1 || operation==2 || operation==3 || operation==4 ){
				strB=strB+"9";
				label.setText(strB);
			}}
			
			if (ev.getSource() == buttonmul){
				System.out.println ("action sur bouton multiplication") ;
				
				operation=1;
				str1=Double.parseDouble(strA);
				resA=0.0;
				resB=0.0;
				res=0.0;
				
				strA="";
				strB="";
				str="";
			}
			
			if (ev.getSource() == buttonsous){
				System.out.println ("action sur bouton soustraction") ;
				operation=2;
				str1=Double.parseDouble(strA);
				resA=0.0;
				resB=0.0;
				res=0.0;
				
				strA="";
				strB="";
				str="";
			}
			
			if (ev.getSource() == buttondiv){
				System.out.println ("action sur bouton division") ;
				operation=3;
				str1=Double.parseDouble(strA);
				resA=0.0;
				resB=0.0;
				res=0.0;
			
				strA="";
				strB="";
				str="";
			}
			
			if (ev.getSource() == buttonadd){
				System.out.println ("action sur bouton d'addition") ;
				operation=4;
				str1=Double.parseDouble(strA);
				resA=0.0;
				resB=0.0;
				res=0.0;
				
				strA="";
				strB="";
				str="";
			}
			
			if (ev.getSource() == buttonegale){
				System.out.println ("action sur bouton resultat") ;
				
				if (operation==1) 
					res=str1*Double.parseDouble(strB);
					
				
				else if(operation==2)
					res=str1-Double.parseDouble(strB); 
					
				
				else if (operation==3) 
					res=str1/Double.parseDouble(strB);
					
				
				else if (operation==4) 
					res=str1+Double.parseDouble(strB);
				
				str=Double.toString(res);
				label.setText(str);
		}
			
			if (ev.getSource() == buttonvir){
				System.out.println ("action sur bouton virgulle") ;
			strA=strA+"."; 
			label.setText(strA);
			if( operation==1 || operation==2 || operation==3 || operation==4 ){
			strB=strB+".";
			label.setText(strB);
			}}
		
			if (ev.getSource() == buttonclear){
				System.out.println ("action sur bouton Clear") ;
			strA="";
			strB="";
			str="";
			resA=0.0;
			resB=0.0;
			res=0.0;
			label.setText(strA);
			label.setText(strB);
			label.setText(str);
			
			
			}
		}
	
		}

