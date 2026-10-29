package MeuGerenciadorFinanceiro;

import java.math.BigDecimal;

public class Despesa {
    private String descricao;
    private BigDecimal valor;
    private String categoria;

    Despesa(String descricao, BigDecimal valor, String categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String internet) {
        this.descricao = internet;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
