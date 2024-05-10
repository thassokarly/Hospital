import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Quarto> quartosDisponiveis;

    public Hospital() {
        this.quartosDisponiveis = new ArrayList<>();

        adicionarQuartos("UTI", 3, BigDecimal.valueOf(500.0));
        adicionarQuartos("ENFERMARIA", 7, BigDecimal.valueOf(200.0));
    }

    private void adicionarQuartos(String categoria, int quantidade, BigDecimal valorDiaria) {
        for (int i = 1; i <= quantidade; i++) {
            quartosDisponiveis.add(new Quarto(i, categoria, valorDiaria));
        }
    }

    public boolean fazerReserva(LocalDate dataReserva, String categoria, Paciente paciente) {
        Quarto quartoDisponivel = encontrarQuartoDisponivel(categoria);
        if (quartoDisponivel == null) {
            System.out.println("Não há quartos disponíveis da categoria " + categoria);
            return false;
        }


        Reservar reserva = new Reservar(dataReserva, quartoDisponivel, paciente);
        System.out.println("Reserva realizada com sucesso para " + paciente.getNome() + ".");
        return true;
    }

    private Quarto encontrarQuartoDisponivel(String categoria) {
        for (Quarto quarto : quartosDisponiveis) {
            if (quarto.getCategoria().equals(categoria)) {
                return quarto;
            }
        }
        return null;
    }

}
