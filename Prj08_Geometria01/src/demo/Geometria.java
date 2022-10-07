package demo;

//devo importare i file del package forme per poter utilizzare i loro oggetti
import forme.Punto;
import forme.Quadrato;
import forme.Rettangolo;	
import forme.Segmento;
import forme.Triangolo;


public class Geometria {

	public static void main(String[] args) {

		Punto a = new Punto(3,2);
        Punto b = new Punto(8,2);
        Punto c = new Punto(3,6);
		
        Segmento ab = new Segmento (a,b);
        System.out.println("Lunghezza segmento ab = " + ab.lunghezza());
        
        Segmento ac = new Segmento(a,c);
        System.out.println("Lunghezza segmento ac = " + ac.lunghezza());
        
        Segmento bc = new Segmento(b,c);
        System.out.println("Lunghezza segmento bc = " + bc.lunghezza());

		Triangolo t1 = new Triangolo(a, b, c);
		System.out.println("Perimetro del triangolo abc = " + t1.getPerimetro());
		System.out.println("Area del triangolo abc = " + t1.getArea());

		Rettangolo r1 = new Rettangolo(ab, bc);		// posso vedere il commento javadoc di Rettangolo() nella sua tooltip
						
		System.out.println(r1);
		
		Quadrato q1 = new Quadrato(ab);
		System.out.println(q1);
        
	}

}
/*








    }

}
*/