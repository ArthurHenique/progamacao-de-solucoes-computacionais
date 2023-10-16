package pratica10POO3;

public class Tempo {
	private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        this(0, 0, 0);
    }

    public Tempo(int hora) {
        this(hora, 0, 0);
    }

    public Tempo(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Tempo(int hora, int minuto, int segundo) {
        setTime(hora, minuto, segundo);
    }

    public void setTime(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            System.out.println("Valores inv�lidos para hora, minuto ou segundo.");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Valor inv�lido para hora.");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Valor inv�lido para minuto.");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Valor inv�lido para segundo.");
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
