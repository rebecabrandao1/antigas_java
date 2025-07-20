import javax.swing.*;
public class Eleicao{


//Matheus Carvalho, 431

public static void main(String[] args) {
	Chapa cp[]=new Chapa[10];
	int id=0;
	int y;
	int v=0,m=0,posim=0;

	
int total=0;

		while (true) {
	int b=Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar Chapa\n2-Lancar Votos\n3-Imprimir Resultados\n4-Sair"));
	
		switch (b) {
			case 1:
			cp[id]=new Chapa();
			cp[id].setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero")));
			cp[id].setPresidente(JOptionPane.showInputDialog("Presidente"));
			cp[id].setVice(JOptionPane.showInputDialog("Vice"));

			//cp[id].setVotos(Integer.parseInt(JOptionPane.showInputDialog("Votos")));
			id++;
			
			
			break;
			case 2:
			
				for(y=0;y<id;y++){

				cp[y].setVotos(Integer.parseInt(JOptionPane.showInputDialog("Votos da Chapa ")));
				
				}
			
			break;

			case 3:
			for (int d=0;d<id;d++) {

				total=total+cp[d].getVotos();
				if(cp[d].getVotos()>m){
					m=cp[d].getVotos();
				}



				
			}

			for(int d=0;d<id;d++){
				if(m==cp[d].getVotos())
					posim=d;
			}

			JOptionPane.showMessageDialog(null,"Presidente: "+cp[posim].getPresidente()+"\nVice: "+cp[posim].getVice()+"\nNumero: "+cp[posim].getNumero()+"\nVotos da Chapa ganhadora: "+cp[posim].getVotos()+"\nVotos totais: "+total);
			break;
			case 4:
			System.exit(0);
			break;
			























		}


			
	}





}













}