package jtm.activity04;

public class RoadTest {

	public static void main(String[] args) {
		 Road road = new Road("Ventspils", "Riga", 183);
		 System.out.println(road.toString());
		 Transport transport = new Transport("volvo", 6.00f, 50);
		 System.out.println(transport.toString());
	}

}
