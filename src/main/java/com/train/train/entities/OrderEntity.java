package com.train.train.entities;

public class OrderEntity {

    private int codigo_pedido;
    private double valor_basico;
    private double desconto;

    public OrderEntity() {
    }

    public OrderEntity(int codigo_pedido, double valor_basico, double desconto ) {
        this.codigo_pedido = codigo_pedido;
        this.valor_basico = valor_basico;
        this.desconto = desconto;
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public double getValor_basico() {
        return valor_basico;
    }

    public void setValor_basico(double valor_basico) {
        this.valor_basico = valor_basico;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
