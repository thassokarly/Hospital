import java.time.LocalDate;

public class Reservar {
    private LocalDate dataReserva;
    private Quarto quarto;
    private Paciente paciente;

    public Reservar(LocalDate dataReserva, Quarto quarto, Paciente paciente) {
        this.dataReserva = dataReserva;
        this.quarto = quarto;
        this.paciente = paciente;
    }



    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Paciente getPaciente() {
        return paciente;
    }
}
