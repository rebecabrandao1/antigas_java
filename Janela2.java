//GUI
import java.awt.*;//chama o pacote awt
public class Janela2 extends Frame{//Frame é classe pai que já está formulada
	private Label l1;//private pois precisa ser encapsulado
	private Label l2;
	private Label l3;
	private Label l4;
	private TextField tf1;
	private TextField tf2;
	private TextField tf3;
	private TextField tf4;
	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;
	private Button b5;
	private Button b6;
	private Button b7;
	private Button b8;
	private Panel p1;
	private Panel p2;
	private Panel p3;

	public Janela2(){
		l1=new Label("Nome");//precisa instanciar cada documento com o construtor
		l2=new Label("Telefone");
		l3=new Label ("Endereco");
		l4=new Label ("Rg");
        tf1= new TextField ();//onde vai ser escrito
		tf2=new TextField ();
		tf3=new TextField();
		tf4=new TextField();
		p1=new Panel();
		p1.setLayout(new GridLayout(4,2));
		p1.add(l1);
		p1.add(l2);
		p1.add(tf1);
		p1.add(tf2);
		p1.add(l3);
		p1.add(l4);
		p1.add(tf3);
		p1.add(tf4);
        b1= new Button("Inserir");
		b2=new Button("Editar");
		b3=new Button("Excluir");
		b4=new Button("Sair");
		p2=new Panel();
		p2.setLayout(new GridLayout(4,1));
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
        b5=new Button ("|<");
		b6=new Button("<<");
		b7=new Button(" >>");
		b8=new Button(">|");
		p3=new Panel();
		p3.setLayout(new GridLayout(1,4));
		p3.add(b5);
		p3.add(b6);
		p3.add(b7);
		p3.add(b8);
		
		setLayout(new BorderLayout());
		add(p1, BorderLayout.CENTER);
		add(p2,BorderLayout.EAST);
		add(p3,BorderLayout.SOUTH);
	}
	public static void main(String [] args){
		Janela2 j=new Janela2();
		j.pack();//redimensiona a janela
		j.show();//mostrar
		

	}




}