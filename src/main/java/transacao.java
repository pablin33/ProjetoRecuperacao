public class transacao {

    private int id_transacao;
    private int id_produto;
    private int quantidade;
    private double data_da_transacao;
    private double hora_da_trasacao;
    private String foma_pagamento;

    /**
     * @return the id_transacao
     */
    public int getId_transacao() {
        return id_transacao;
    }

    /**
     * @param id_transacao the id_transacao to set
     */
    public void setId_transacao(int id_transacao) {
        this.id_transacao = id_transacao;
    }

    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the data_da_transacao
     */
    public double getData_da_transacao() {
        return data_da_transacao;
    }

    /**
     * @param data_da_transacao the data_da_transacao to set
     */
    public void setData_da_transacao(double data_da_transacao) {
        this.data_da_transacao = data_da_transacao;
    }

    /**
     * @return the hora_da_trasacao
     */
    public double getHora_da_trasacao() {
        return hora_da_trasacao;
    }

    /**
     * @param hora_da_trasacao the hora_da_trasacao to set
     */
    public void setHora_da_trasacao(double hora_da_trasacao) {
        this.hora_da_trasacao = hora_da_trasacao;
    }

    /**
     * @return the foma_pagamento
     */
    public String getFoma_pagamento() {
        return foma_pagamento;
    }

    /**
     * @param foma_pagamento the foma_pagamento to set
     */
    public void setFoma_pagamento(String foma_pagamento) {
        this.foma_pagamento = foma_pagamento;
    }

}