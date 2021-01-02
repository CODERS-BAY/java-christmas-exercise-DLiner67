package model;
// Sledge = Schlitten
public class Sledge {
	Presents[] presents; //Klassenvariablen (= Instanzvaribalen)

	public Sledge() {//Konstruktor
		presents=new Presents[100];
		// TODO Auto-generated constructor stub
	}
	//Methoden
	public boolean/*<-Rückgabetyp*/ isFull/*<-Name der Methode*/(/*Keine Paramter*/){
		//Methodenkörper
		for (int i = 0; i < presents.length; i++) {
			if (presents[i]==null){

				return false;
			}
		}
		return true;

	}

	public void addPresent(Presents present){
		if (!isFull()){
			for (int i = 0; i < presents.length; i++) {
				if (presents[i]==null){
					this.presents[i]=present;
					break;
				}
			}

		}


	}


}
