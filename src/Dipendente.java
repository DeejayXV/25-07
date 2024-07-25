enum Dipartimento {
    PRODUZIONE, AMMINISTRAZIONE, VENDITE
}

abstract class Dipendente {
    private String matricola;
    private double stipendioBase;
    private Dipartimento dipartimento;

    // costruttore
    public Dipendente(String matricola, double stipendioBase, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendioBase = stipendioBase;
        this.dipartimento = dipartimento;
    }

    // getter per il matricola
    public String getMatricola() {
        return matricola;
    }

    // getter per lo stipendio base
    public double getStipendioBase() {
        return stipendioBase;
    }

    // getter per il dipartimento
    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    // setter per il dipartimento
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    // metodo astratto per calcolare il salario
    public abstract double calculateSalary();
}
