package fr.mds.javacourse.depatp1.launcher;

import java.util.ArrayList;
import java.util.List;

import fr.mds.javacourse.depatp1.entities.Entity1;

public class Singleton {
	
	//Singleton
    private Singleton() {
    	
		List<Entity1> result = new ArrayList<Entity1>();

		for (int i = 0; i < 20; i++) {
			Entity1 e1 = new Entity1();
			e1.setId(i);
			e1.setData("data " + i);
			result.add(e1);
		}	
    }

	private static Singleton INSTANCE = null;
     
    public static synchronized Singleton getInstance(){   
    	
        if (INSTANCE == null){
        	INSTANCE = new Singleton(); 
        }
        
        return INSTANCE;
    }
	
    //Main
	public static void main(String[] args) {

		Entity1 e11 = new Entity1();
		e11.setId(15);
		e11.setData("data e1 15");

		getEntity1s().add(e11);

		Entity1 e12 = new Entity1();
		e12.setId(16);
		e12.setData("data e1 16");

		getEntity1s().add(e12);

		for (Entity1 item : getEntity1s()) {
			System.out.println(item);
		}
	}

	//Liste qui retourne ses données
	private static List<Entity1> getEntity1s(){
		
		return null;
	}
}