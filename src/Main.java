public class Main {
    public static void main(String[] args) {

        // creazione di diversi tipi di dipendenti
        Dipendente dip1 = new DipendenteFullTime("D001", 2500.0, Dipartimento.PRODUZIONE);
        Dipendente dip2 = new DipendentePartTime("D002", 20.0, Dipartimento.AMMINISTRAZIONE, 80); // 80 ore lavorate
        Dipendente dip3 = new Dirigente("D003", 3000.0, Dipartimento.VENDITE);

        // creazione di un array di Dipendente
        Dipendente[] dipendenti = { dip1, dip2, dip3 };

        // iterazione sull'array e calcolo degli stipendi di ogni dipendente
        double stipendioTotale = 0.0;
        for (Dipendente dip : dipendenti) {
            System.out.println("Matricola: " + dip.getMatricola() + ", Stipendio: " + dip.calculateSalary() + " euro");
            stipendioTotale += dip.calculateSalary();
        }

        // stipendio totale
        System.out.println("Stipendio totale: " + stipendioTotale + " euro");
    }
}
