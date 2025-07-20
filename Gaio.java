import java.awt.*;
import java.awt.event.*;
public class Gaio extends Frame{
	private Label l1;
	private Label l2;
	private Label l3;
	private TextField tf1;
	private TextField tf2;
	private TextField tf3;
	private Button b1;
	private Button b2;
	private Button b3;
	private Panel p1;
	private Panel p2;
	private Panel p3;
	private Panel p4;
	private Panel p5;
	private int c=0, k=50;
	public Gaio(){
		l1=new Label ("Frequencia (HZ)");
		l2= new Label ("Numero de Polos");
		l3= new Label ("Rotacoes/Minuto");
		tf1=new TextField();
		tf2=new TextField();
		tf3=new TextField();
		b1=new Button("LIMPAR");
		b2=new Button("SAIR");
		b3=new Button("CALCULAR");
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		p4=new Panel();
		p5=new Panel();
		p1.setLayout( new GridLayout(2,2));
		p1.add(l1);
		p1.add(l2);
		p1.add(tf1);
		p1.add(tf2);
		p2.setLayout(new GridLayout(2,1));
		p2.add(l3);
		p2.add(tf3);
		p3.setLayout(new GridLayout(1,2));
		p3.add(b1);
		p3.add(b2);
		p4.setLayout(new GridLayout(1,1));
		p4.add(b3);
		p5.setLayout(new GridLayout(3,1));
		p5.add(p1);
		p5.add(p2);
		p5.add(p3);
		setLayout(new BorderLayout());
		add(BorderLayout.CENTER,p5);
		add(BorderLayout.EAST,p4);
		addWindowListener(new FecharJanela());
		addWindowListener(new Og());
		tf1.addFocusListener(new Avax());
		tf1.addFocusListener(new Agax());
		tf2.addFocusListener(new Avax());
		tf3.addFocusListener(new Avax());
		b1.addActionListener(new B1());//Limpar
		b2.addActionListener(new B2());//Sair
		b3.addActionListener(new B3());//Calcular
	}
	class FecharJanela extends WindowAdapter{//fechar
            public void windowClosing (WindowEvent ev){
                System.exit(0);
            }    
        }
    class B1 implements ActionListener{
    	public void actionPerformed( ActionEvent ev){
 		tf1.setText("");
 		tf2.setText("");
 		tf3.setText("");
 	}
 }
 	class B2 implements ActionListener{
 		public void actionPerformed(ActionEvent ev){
		System.exit(0);
	}
 	}
 	class B3 implements ActionListener{
    public void actionPerformed(ActionEvent ev){
        try {
            int vprm=0;
            int f=Integer.parseInt(tf1.getText());
            int np=Integer.parseInt(tf2.getText());
            vprm=(120*f)/np;
            tf3.setText(""+vprm);
        } catch (NumberFormatException e) {
            tf3.setText("Erro");
        }
    }
 	}
 	class Avax extends FocusAdapter{
	public void focusLost(FocusEvent eve){
		if(!tf1.getText().equals("")&&!tf2.getText().equals("")){
			b3.setEnabled(true);
		}
	}
}
  class Agax extends FocusAdapter{
	public void focusGained(FocusEvent eve){
		if(tf1.getText().equals("")&&tf2.getText().equals("")){
			b3.setEnabled(false);
		}
	}
}


class Og extends WindowAdapter{
public void windowOpened(WindowEvent win){
		b3.setEnabled(false);
		
		
	}
}
        
	public static void main(String[] args) {
 	Gaio g =new Gaio();
 	g.pack();
 	g.show();	
}
}
