package pratica10POO3;

public class Main {
	public static void main(String[] args) {
        Tempo tempo1 = new Tempo(); 
        Tempo tempo2 = new Tempo(12);
        Tempo tempo3 = new Tempo(8, 30); 
        Tempo tempo4 = new Tempo(14, 45, 30); 

        System.out.println("Tempo 1: " + tempo1);
        System.out.println("Tempo 2: " + tempo2);
        System.out.println("Tempo 3: " + tempo3);
        System.out.println("Tempo 4: " + tempo4);

        tempo2.setHora(25); 
        tempo2.setMinuto(-5); 
        System.out.println("Tempo 2 após valores inválidos: " + tempo2);
    }
}
