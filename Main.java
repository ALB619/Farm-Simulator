package cs143.axlal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		ArrayList<Dinosaur> farm = new ArrayList<>();
		
		TyrannosaurusRex tRex = new TyrannosaurusRex(rand.nextInt(24), "Grimlock");
		farm.add(tRex);
		tRex = new TyrannosaurusRex(rand.nextInt(24), "Rex");
		farm.add(tRex);
		
		Triceratops tricera = new Triceratops(rand.nextInt(24), "Billy");
		farm.add(tricera);
		tricera = new Triceratops(rand.nextInt(24), "Spike");
		farm.add(tricera);
		
		Brachiosaurus brachiosaur = new Brachiosaurus(rand.nextInt(24), "Brachio");
		farm.add(brachiosaur);
		brachiosaur = new Brachiosaurus(rand.nextInt(24), "Chomper");
		farm.add(brachiosaur);
		
		Stegosaurus stego = new Stegosaurus(rand.nextInt(24), "Snarl");
		farm.add(stego);
		stego = new Stegosaurus(rand.nextInt(24), "Spike");
		farm.add(stego);
		
		Velociraptor raptor = new Velociraptor(rand.nextInt(24), "Riptor");
		farm.add(raptor);
		raptor = new Velociraptor(rand.nextInt(24), "Blue");
		farm.add(raptor);
		
		int amt = 0;
		
		while(amt < 10)
		{
			amt = 0;
			
			Collections.sort(farm);
		
			for (Dinosaur dinosaur: farm)
			{	
				dinosaur.tick();
				
				dinosaur.feed();
				
				System.out.println(dinosaur.speak());
				
				System.out.println(dinosaur.toString());
				
				System.out.println();
				
				if(dinosaur.ifFull())
				{
					amt = amt + 1;
				}
			}
		}		
	}
}
