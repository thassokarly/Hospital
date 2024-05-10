import java.math.BigDecimal;
import java.util.Objects;

public class Quarto {
    private int codigo;
    private String categoria;
    private BigDecimal valordiaria;

    public Quarto(int codigo, String categoria, BigDecimal valordiaria) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.valordiaria = valordiaria;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public BigDecimal getValordiaria() {
        return valordiaria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quarto quarto = (Quarto) o;
        return codigo == quarto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
