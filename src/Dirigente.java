class Dirigente extends Dipendente {
    // costruttore
    public Dirigente(String matricola, double stipendioBase, Dipartimento dipartimento) {
        super(matricola, stipendioBase, dipartimento);
    }

    @Override
    public double calculateSalary() {
        // stipendio mensile per il dirigente
        return getStipendioBase();
    }
}
