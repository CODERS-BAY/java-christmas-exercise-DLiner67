package controller;

import model.Presents;
import model.Sledge;

public class ElfUtil {


	public ElfUtil() {
		// TODO Auto-generated constructor stub
	}

	public static void fillSledge(Sledge sledge, Presents present){
		sledge.addPresent(present);

	}
	public static void sort(Presents[]presents){


	}
	public static Sledge createSledge(){

		return new Sledge();
	}

	/*
	 * sledge should be prepared here
	 */
}
