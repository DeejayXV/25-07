class DipendenteFullTime extends Dipendente {
    // costruttore
    public DipendenteFullTime(String matricola, double stipendioBase, Dipartimento dipartimento) {
        super(matricola, stipendioBase, dipartimento);
    }

    @Override
    public double calculateSalary() {
        // stipendio mensile fisso per i dipendenti full time
        return getStipendioBase();
    }
}
