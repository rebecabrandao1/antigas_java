import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc extends Frame{
	private Button c,ce,ad,sub,vez,div,igu,pont;
	private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	private Panel p1,p2,p3,p4,pm,pm1;
	private TextField t1;
	private float valor=0,rps=0,atvd=0;

	public Calc(){
		//Instaciação de elementos
		c=new Button("C");
		ce=new Button("CE");
		ad=new Button("+");
		sub=new Button("-");
		vez=new Button("*");
		div=new Button("/");
		igu=new Button("=");
		pont=new Button(".");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("0");
		p1=new Panel();
		pm=new Panel();
		pm1=new Panel();
		p2=new Panel();
		p3=new Panel();
		p4=new Panel();
		t1=new TextField(12);
		//Layout
		

		setLayout(new BorderLayout());
		add(BorderLayout.NORTH,p1);
		p1.add(t1);
		
		add(BorderLayout.CENTER,pm1);
		pm1.setLayout(new BorderLayout());
		pm1.add(BorderLayout.WEST,p2);
		p2.add(c);
		p2.add(ce);


		add(BorderLayout.SOUTH,pm);
		pm.setLayout(new GridLayout(1,2));
		pm.add(p3);
		pm.add(p4);
		p4.setLayout(new GridLayout());
		

		p3.setLayout(new GridLayout(5,3));
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);
		p3.add(b6);
		p3.add(b7);
		p3.add(b8);
		p3.add(b9);
		p3.add(pont);
		p3.add(b10);
		p3.add(ad);
		p3.add(sub);
		p3.add(vez);
		p3.add(div);
		p4.add(igu);
		addWindowListener(new Fechar());
		b1.addActionListener(new B1());
		b2.addActionListener(new B2());
		b3.addActionListener(new B3());
		b4.addActionListener(new B4());
		b5.addActionListener(new B5());
		b6.addActionListener(new B6());
		b7.addActionListener(new B7());
		b8.addActionListener(new B8());
		b9.addActionListener(new B9());
		b10.addActionListener(new B10());

		ad.addActionListener(new Adb());
		igu.addActionListener(new Igb());
		ce.addActionListener(new Limps());
		pont.addActionListener(new Point());
		c.addActionListener(new Zero());
		sub.addActionListener(new Subd());
		vez.addActionListener(new Multi());
		div.addActionListener(new Divis());

		



	}

		class Fechar extends WindowAdapter{
			public void windowClosing(WindowEvent e){ 
			System.exit(0); 
		} 

		}
		//Numeros

		class B1 implements ActionListener{
			public void actionPerformed(ActionEvent sdf){

				if(t1.getText().equals("") ){
					t1.setText("1");
				}
				else{
				int d=t1.getText().length();
				String nv=t1.getText();
				t1.setText(nv.substring(0,d)+"1");
				}
			}	
		}
		class B2 implements ActionListener{
			public void actionPerformed(ActionEvent sdf){

				if(t1.getText().equals("")){
					t1.setText("2");
				}
				else{
				int d=t1.getText().length();
				String nv=t1.getText();
				t1.setText(nv.substring(0,d)+"2");
				}
			}	
		}
		class B3 implements ActionListener{
			public void actionPerformed(ActionEvent sdf){

				if(t1.getText().equals("")){
					t1.setText("3");
				}
				else{
				int d=t1.getText().length();
				String nv=t1.getText();
				t1.setText(nv.substring(0,d)+"3");
				}
			}	
		}
		class B4 implements ActionListener{
			public void actionPerformed(ActionEvent sdf){

				if(!t1.getText().equals("")){
					t1.setText("4");
				
			}
			else{
				int d=t1.getText().length();
				String nv=t1.getText();
				t1.setText(nv.substring(0,d)+"4");
				
			}
		}	
		}
		class B5 implements ActionListener{
			public void actionPerformed(ActionEvent sdf){

				if(t1.getText().equals("")){
					t1.setText("5");
				}
				else{
				int d=t1.getText().length();
				String nv=t1.getText();
				t1.setText(nv.substring(0,d)+"5");
				}
			}	
		}
		class B6 implements ActionListener{
			public void actionPerformed(ActionEvent sdf){

				if(t1.getText().equals("")){
					t1.setText("6");
				}
				else{
				int d=t1.getText().length();
				String nv=t1.getText();
				t1.setText(nv.substring(0,d)+"6");
				}
			}	
		}
		class B7 implements ActionListener{
			public void actionPerformed(ActionEvent sdf){

				if(t1.getText().equals("")){
					t1.setText("7");
				}
				else{
				int d=t1.getText().length();
				String nv=t1.getText();
				t1.setText(nv.substring(0,d)+"7");
				}
			}	
		}
		class B8 implements ActionListener{
			public void actionPerformed(ActionEvent sdf){

				if(t1.getText().equals("")){
					t1.setText("8");
				}
				else{
				int d=t1.getText().length();
				String nv=t1.getText();
				t1.setText(nv.substring(0,d)+"8");
				}
			}	
		}
		class B9 implements ActionListener{
			public void actionPerformed(ActionEvent sdf){

				if(t1.getText().equals("")){
					t1.setText("9");
				}
				else{
				int d=t1.getText().length();
				String nv=t1.getText();
				t1.setText(nv.substring(0,d)+"9");
				}
			}	
		}
		class B10 implements ActionListener{
			public void actionPerformed(ActionEvent sdf){

				if(t1.getText().equals("")){
					t1.setText("0");
				}
				else{
				int d=t1.getText().length();
				String nv=t1.getText();
				t1.setText(nv.substring(0,d)+"0");
				}
			}

			}	

			

		class Adb implements ActionListener{
			public void actionPerformed(ActionEvent sdf){
						if (rps==0) {
							float b=Float.parseFloat(t1.getText());
					valor=valor+b;
					
						}
						t1.setText("");
						atvd=1;
					
					
				
			}
		}

		class Subd implements ActionListener{
			public void actionPerformed(ActionEvent sdf){
						if (rps==0) {
							float b=Float.parseFloat(t1.getText());
					valor=b-valor;
					
						}
						t1.setText("");
						atvd=2;
					
					
				
			}
}

			class Multi implements ActionListener{
			public void actionPerformed(ActionEvent sdf){
						if (rps==0) {
							float b=Float.parseFloat(t1.getText());
							valor=1;
					valor=b*valor;
					
						}
						t1.setText("");
						atvd=3;
			}
		}

		class Divis implements ActionListener{
			public void actionPerformed(ActionEvent sdf){
						if (rps==0) {
							float b=Float.parseFloat(t1.getText());
							valor=1;
					valor=b/valor;
					
						}
						t1.setText("");
						atvd=4;
			}
		}

		
		
			class Igb implements ActionListener{
			public void actionPerformed(ActionEvent sdf){
				if (atvd==1) {
					
				float b=Float.parseFloat(t1.getText());
				valor=valor+b;
				t1.setText(valor+"");
				rps=1;
				}

				if (atvd==2) {
					
				float b=Float.parseFloat(t1.getText());
				valor=valor-b;
				t1.setText(valor+"");
				rps=1;
				}
				if (atvd==3) {
					
				float b=Float.parseFloat(t1.getText());
				valor=valor*b;
				t1.setText(valor+"");
				rps=1;
				}

				if (atvd==4) {
					
				float b=Float.parseFloat(t1.getText());
				valor=valor/b;
				t1.setText(valor+"");
				rps=1;
				}

				}
			}	

		class Limps implements ActionListener{
			public void actionPerformed(ActionEvent sdf){
				t1.setText("");
				}
			}

			class Zero implements ActionListener{
			public void actionPerformed(ActionEvent sdf){
				valor=0;
				t1.setText("");
				rps=0;
				}
			}

		class Point implements ActionListener{
			public void actionPerformed(ActionEvent sdf){
				if(t1.getText().equals("")){
					t1.setText("0.");
				}
				else{
				int d=t1.getText().length();
				String nv=t1.getText();
				t1.setText(nv.substring(0,d)+".");
				}
				}
			}	

	public static void main(String[] args) {
		Calc gh=new Calc();
		gh.pack();
		gh.show();
	}


}