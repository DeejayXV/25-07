class DipendentePartTime extends Dipendente {
    private int oreLavorate;

    // costruttore
    public DipendentePartTime(String matricola, double stipendioBase, Dipartimento dipartimento, int oreLavorate) {
        super(matricola, stipendioBase, dipartimento);
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        // stipendio calcolato in base alle ore lavorative
        return getStipendioBase() * oreLavorate;
    }
}
