package MeuGerenciadorFinanceiro;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BigDecimal total = BigDecimal.ZERO;

        List<Despesa> despesas = new ArrayList<>();
        despesas.add(new Despesa("Internet", new BigDecimal("120.00"), "Moradia"));
        despesas.add(new Despesa("Academia", new BigDecimal("280.00"), "Saúde"));
        despesas.add(new Despesa("Cap Cut e Lightroom", new BigDecimal("85.99"), "Estúdio"));


        for (Despesa d : despesas) {
            System.out.println(d.getDescricao() + " - " + d.getValor() + " - " + d.getCategoria());
            total = total.add(d.getValor());
        }
        System.out.println("Total: " + total);

    }
}


