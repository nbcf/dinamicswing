/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author nil_b
 */
@Entity
@Table(name = "movi_rest", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "MoviRest.findAll", query = "SELECT m FROM MoviRest m")
    , @NamedQuery(name = "MoviRest.findByIdMovRest", query = "SELECT m FROM MoviRest m WHERE m.idMovRest = :idMovRest")
    , @NamedQuery(name = "MoviRest.findByIdMovimentoGeral", query = "SELECT m FROM MoviRest m WHERE m.idMovimentoGeral = :idMovimentoGeral")
    , @NamedQuery(name = "MoviRest.findByIdLoja", query = "SELECT m FROM MoviRest m WHERE m.idLoja = :idLoja")
    , @NamedQuery(name = "MoviRest.findByIdCaixa", query = "SELECT m FROM MoviRest m WHERE m.idCaixa = :idCaixa")
    , @NamedQuery(name = "MoviRest.findByIdVendedor", query = "SELECT m FROM MoviRest m WHERE m.idVendedor = :idVendedor")
    , @NamedQuery(name = "MoviRest.findByIdOperador", query = "SELECT m FROM MoviRest m WHERE m.idOperador = :idOperador")
    , @NamedQuery(name = "MoviRest.findByIdProduto", query = "SELECT m FROM MoviRest m WHERE m.idProduto = :idProduto")
    , @NamedQuery(name = "MoviRest.findByIdCozinha", query = "SELECT m FROM MoviRest m WHERE m.idCozinha = :idCozinha")
    , @NamedQuery(name = "MoviRest.findByIdCliente", query = "SELECT m FROM MoviRest m WHERE m.idCliente = :idCliente")
    , @NamedQuery(name = "MoviRest.findByTipoMovimento", query = "SELECT m FROM MoviRest m WHERE m.tipoMovimento = :tipoMovimento")
    , @NamedQuery(name = "MoviRest.findByTipoAgregadorPgto", query = "SELECT m FROM MoviRest m WHERE m.tipoAgregadorPgto = :tipoAgregadorPgto")
    , @NamedQuery(name = "MoviRest.findByTipoPagto", query = "SELECT m FROM MoviRest m WHERE m.tipoPagto = :tipoPagto")
    , @NamedQuery(name = "MoviRest.findByTipoLocal", query = "SELECT m FROM MoviRest m WHERE m.tipoLocal = :tipoLocal")
    , @NamedQuery(name = "MoviRest.findByMovimento", query = "SELECT m FROM MoviRest m WHERE m.movimento = :movimento")
    , @NamedQuery(name = "MoviRest.findByLoja", query = "SELECT m FROM MoviRest m WHERE m.loja = :loja")
    , @NamedQuery(name = "MoviRest.findByCaixa", query = "SELECT m FROM MoviRest m WHERE m.caixa = :caixa")
    , @NamedQuery(name = "MoviRest.findByOperador", query = "SELECT m FROM MoviRest m WHERE m.operador = :operador")
    , @NamedQuery(name = "MoviRest.findByVendedor", query = "SELECT m FROM MoviRest m WHERE m.vendedor = :vendedor")
    , @NamedQuery(name = "MoviRest.findByDataMovimento", query = "SELECT m FROM MoviRest m WHERE m.dataMovimento = :dataMovimento")
    , @NamedQuery(name = "MoviRest.findByHoraPedido", query = "SELECT m FROM MoviRest m WHERE m.horaPedido = :horaPedido")
    , @NamedQuery(name = "MoviRest.findByDataPedido", query = "SELECT m FROM MoviRest m WHERE m.dataPedido = :dataPedido")
    , @NamedQuery(name = "MoviRest.findByDataEntregue", query = "SELECT m FROM MoviRest m WHERE m.dataEntregue = :dataEntregue")
    , @NamedQuery(name = "MoviRest.findByHoraEntregue", query = "SELECT m FROM MoviRest m WHERE m.horaEntregue = :horaEntregue")
    , @NamedQuery(name = "MoviRest.findByHoraProducao", query = "SELECT m FROM MoviRest m WHERE m.horaProducao = :horaProducao")
    , @NamedQuery(name = "MoviRest.findByFlagEstatusPedido", query = "SELECT m FROM MoviRest m WHERE m.flagEstatusPedido = :flagEstatusPedido")
    , @NamedQuery(name = "MoviRest.findByCozinha", query = "SELECT m FROM MoviRest m WHERE m.cozinha = :cozinha")
    , @NamedQuery(name = "MoviRest.findByProduto", query = "SELECT m FROM MoviRest m WHERE m.produto = :produto")
    , @NamedQuery(name = "MoviRest.findByTipoProduto", query = "SELECT m FROM MoviRest m WHERE m.tipoProduto = :tipoProduto")
    , @NamedQuery(name = "MoviRest.findByTipoUnd", query = "SELECT m FROM MoviRest m WHERE m.tipoUnd = :tipoUnd")
    , @NamedQuery(name = "MoviRest.findByTipoQuant", query = "SELECT m FROM MoviRest m WHERE m.tipoQuant = :tipoQuant")
    , @NamedQuery(name = "MoviRest.findByQuantUnd", query = "SELECT m FROM MoviRest m WHERE m.quantUnd = :quantUnd")
    , @NamedQuery(name = "MoviRest.findByQuantVenda", query = "SELECT m FROM MoviRest m WHERE m.quantVenda = :quantVenda")
    , @NamedQuery(name = "MoviRest.findByPrecoUnitario", query = "SELECT m FROM MoviRest m WHERE m.precoUnitario = :precoUnitario")
    , @NamedQuery(name = "MoviRest.findByQuantAtual", query = "SELECT m FROM MoviRest m WHERE m.quantAtual = :quantAtual")
    , @NamedQuery(name = "MoviRest.findByQuantMin", query = "SELECT m FROM MoviRest m WHERE m.quantMin = :quantMin")
    , @NamedQuery(name = "MoviRest.findByNomeCliente", query = "SELECT m FROM MoviRest m WHERE m.nomeCliente = :nomeCliente")
    , @NamedQuery(name = "MoviRest.findByCpf", query = "SELECT m FROM MoviRest m WHERE m.cpf = :cpf")
    , @NamedQuery(name = "MoviRest.findByCouver", query = "SELECT m FROM MoviRest m WHERE m.couver = :couver")
    , @NamedQuery(name = "MoviRest.findByServico", query = "SELECT m FROM MoviRest m WHERE m.servico = :servico")
    , @NamedQuery(name = "MoviRest.findByLocalPedido", query = "SELECT m FROM MoviRest m WHERE m.localPedido = :localPedido")
    , @NamedQuery(name = "MoviRest.findByComanda", query = "SELECT m FROM MoviRest m WHERE m.comanda = :comanda")
    , @NamedQuery(name = "MoviRest.findByTotalPedido", query = "SELECT m FROM MoviRest m WHERE m.totalPedido = :totalPedido")
    , @NamedQuery(name = "MoviRest.findByTotalApagar", query = "SELECT m FROM MoviRest m WHERE m.totalApagar = :totalApagar")
    , @NamedQuery(name = "MoviRest.findByRecebDebito", query = "SELECT m FROM MoviRest m WHERE m.recebDebito = :recebDebito")
    , @NamedQuery(name = "MoviRest.findByRecebDinheiro", query = "SELECT m FROM MoviRest m WHERE m.recebDinheiro = :recebDinheiro")
    , @NamedQuery(name = "MoviRest.findByRecebCredito", query = "SELECT m FROM MoviRest m WHERE m.recebCredito = :recebCredito")
    , @NamedQuery(name = "MoviRest.findByRecebPix", query = "SELECT m FROM MoviRest m WHERE m.recebPix = :recebPix")
    , @NamedQuery(name = "MoviRest.findByTaxaServico", query = "SELECT m FROM MoviRest m WHERE m.taxaServico = :taxaServico")
    , @NamedQuery(name = "MoviRest.findByTaxaCouver", query = "SELECT m FROM MoviRest m WHERE m.taxaCouver = :taxaCouver")
    , @NamedQuery(name = "MoviRest.findByTroco", query = "SELECT m FROM MoviRest m WHERE m.troco = :troco")
    , @NamedQuery(name = "MoviRest.findByAcrescimo", query = "SELECT m FROM MoviRest m WHERE m.acrescimo = :acrescimo")
    , @NamedQuery(name = "MoviRest.findByDecrescimo", query = "SELECT m FROM MoviRest m WHERE m.decrescimo = :decrescimo")
    , @NamedQuery(name = "MoviRest.findByFlagEstatusMovidet", query = "SELECT m FROM MoviRest m WHERE m.flagEstatusMovidet = :flagEstatusMovidet")
    , @NamedQuery(name = "MoviRest.findByZap", query = "SELECT m FROM MoviRest m WHERE m.zap = :zap")
    , @NamedQuery(name = "MoviRest.findByLogradouro", query = "SELECT m FROM MoviRest m WHERE m.logradouro = :logradouro")
    , @NamedQuery(name = "MoviRest.findByComplemento", query = "SELECT m FROM MoviRest m WHERE m.complemento = :complemento")
    , @NamedQuery(name = "MoviRest.findByBairro", query = "SELECT m FROM MoviRest m WHERE m.bairro = :bairro")
    , @NamedQuery(name = "MoviRest.findByCep", query = "SELECT m FROM MoviRest m WHERE m.cep = :cep")
    , @NamedQuery(name = "MoviRest.findByCidade", query = "SELECT m FROM MoviRest m WHERE m.cidade = :cidade")
    , @NamedQuery(name = "MoviRest.findByUf", query = "SELECT m FROM MoviRest m WHERE m.uf = :uf")
    , @NamedQuery(name = "MoviRest.findByTrocoPara", query = "SELECT m FROM MoviRest m WHERE m.trocoPara = :trocoPara")
    
    , @NamedQuery(name = "MoviRest.vendasAbertas", query = "SELECT m FROM MoviRest m WHERE m.flagEstatusPedido = :flagEstatusPedido AND m.dataPedido = :dataPedido ")

    , @NamedQuery(name = "MoviRest.comandaOcupada", query = "SELECT m FROM MoviRest m WHERE m.flagEstatusPedido = :flagEstatusPedido AND m.comanda = :comanda")
        
    , @NamedQuery(name = "MoviRest.adicionarConsumo", query = "SELECT m FROM MoviRest m WHERE m.flagEstatusPedido = :flagEstatusPedido AND m.comanda = :comanda ") 
    //        + "AND m.dataMovimento BETWEEN :dataIni AND :dataFim"  )    

          , @NamedQuery(name = "MoviRest.limparTabela", query = "SELECT m FROM MoviRest m WHERE m.flagEstatusPedido = :flagEstatusPedido") 
    //        + "AND m.dataMovimento BETWEEN :dataIni AND :dataFim"  )    

        
        
    , @NamedQuery(name = "MoviRest.findByEntregador", query = "SELECT m FROM MoviRest m WHERE m.entregador = :entregador")})


public class MoviRest implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MOV_REST")
    private Integer idMovRest;
    @Column(name = "ID_MOVIMENTO_GERAL")
    private Integer idMovimentoGeral;
    @Column(name = "ID_LOJA")
    private String idLoja;
    @Column(name = "ID_CAIXA")
    private String idCaixa;
    @Column(name = "ID_VENDEDOR")
    private String idVendedor;
    @Column(name = "ID_OPERADOR")
    private String idOperador;
    @Column(name = "ID_PRODUTO")
    private Integer idProduto;
    @Column(name = "ID_COZINHA")
    private String idCozinha;
    @Column(name = "ID_CLIENTE")
    private String idCliente;
    @Column(name = "TIPO_MOVIMENTO")
    private String tipoMovimento;
    @Column(name = "TIPO_AGREGADOR_PGTO")
    private String tipoAgregadorPgto;
    @Column(name = "TIPO_PAGTO")
    private String tipoPagto;
    @Column(name = "TIPO_LOCAL")
    private String tipoLocal;
    @Column(name = "MOVIMENTO")
    private String movimento;
    @Column(name = "LOJA")
    private String loja;
    @Column(name = "CAIXA")
    private String caixa;
    @Column(name = "OPERADOR")
    private String operador;
    @Column(name = "VENDEDOR")
    private String vendedor;
    @Column(name = "DATA_MOVIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataMovimento;
    @Column(name = "HORA_PEDIDO")
    private String horaPedido;
    @Column(name = "DATA_PEDIDO")
    @Temporal(TemporalType.DATE)
    private Date dataPedido;
    @Column(name = "DATA_ENTREGUE")
    @Temporal(TemporalType.DATE)
    private Date dataEntregue;
    @Column(name = "HORA_ENTREGUE")
    private String horaEntregue;
    @Column(name = "HORA_PRODUCAO")
    private String horaProducao;
    @Column(name = "FLAG_ESTATUS_PEDIDO")
    private String flagEstatusPedido;
    @Column(name = "COZINHA")
    private String cozinha;
    @Column(name = "PRODUTO")
    private String produto;
    @Column(name = "TIPO_PRODUTO")
    private String tipoProduto;
    @Lob
    @Column(name = "DESCRICAO_PROD")
    private String descricaoProd;
    @Column(name = "TIPO_UND")
    private String tipoUnd;
    @Column(name = "TIPO_QUANT")
    private String tipoQuant;
    @Column(name = "QUANT_UND")
    private String quantUnd;
    @Column(name = "QUANT_VENDA")
    private String quantVenda;
    @Column(name = "PRECO_UNITARIO")
    private String precoUnitario;
    @Column(name = "QUANT_ATUAL")
    private String quantAtual;
    @Column(name = "QUANT_MIN")
    private String quantMin;
    @Column(name = "NOME_CLIENTE")
    private String nomeCliente;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "COUVER")
    private String couver;
    @Column(name = "SERVICO")
    private String servico;
    @Column(name = "LOCAL_PEDIDO")
    private String localPedido;
    @Column(name = "COMANDA")
    private String comanda;
    @Column(name = "TOTAL_PEDIDO")
    private String totalPedido;
    @Column(name = "TOTAL_APAGAR")
    private String totalApagar;
    @Column(name = "RECEB_DEBITO")
    private String recebDebito;
    @Column(name = "RECEB_DINHEIRO")
    private String recebDinheiro;
    @Column(name = "RECEB_CREDITO")
    private String recebCredito;
    @Column(name = "RECEB_PIX")
    private String recebPix;
    @Column(name = "TAXA_SERVICO")
    private String taxaServico;
    @Column(name = "TAXA_COUVER")
    private String taxaCouver;
    @Column(name = "TROCO")
    private String troco;
    @Column(name = "ACRESCIMO")
    private String acrescimo;
    @Column(name = "DECRESCIMO")
    private String decrescimo;
    @Lob
    @Column(name = "DETALHE_PEDIDO")
    private String detalhePedido;
    @Column(name = "FLAG_ESTATUS_MOVIDET")
    private String flagEstatusMovidet;
    @Column(name = "ZAP")
    private String zap;
    @Column(name = "LOGRADOURO")
    private String logradouro;
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "UF")
    private String uf;
    @Column(name = "TROCO_PARA")
    private String trocoPara;
    @Column(name = "ENTREGADOR")
    private String entregador;

    public MoviRest() {
    }

    public MoviRest(Integer idMovRest) {
        this.idMovRest = idMovRest;
    }

    public Integer getIdMovRest() {
        return idMovRest;
    }

    public void setIdMovRest(Integer idMovRest) {
        Integer oldIdMovRest = this.idMovRest;
        this.idMovRest = idMovRest;
        changeSupport.firePropertyChange("idMovRest", oldIdMovRest, idMovRest);
    }

    public Integer getIdMovimentoGeral() {
        return idMovimentoGeral;
    }

    public void setIdMovimentoGeral(Integer idMovimentoGeral) {
        Integer oldIdMovimentoGeral = this.idMovimentoGeral;
        this.idMovimentoGeral = idMovimentoGeral;
        changeSupport.firePropertyChange("idMovimentoGeral", oldIdMovimentoGeral, idMovimentoGeral);
    }

    public String getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(String idLoja) {
        String oldIdLoja = this.idLoja;
        this.idLoja = idLoja;
        changeSupport.firePropertyChange("idLoja", oldIdLoja, idLoja);
    }

    public String getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(String idCaixa) {
        String oldIdCaixa = this.idCaixa;
        this.idCaixa = idCaixa;
        changeSupport.firePropertyChange("idCaixa", oldIdCaixa, idCaixa);
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        String oldIdVendedor = this.idVendedor;
        this.idVendedor = idVendedor;
        changeSupport.firePropertyChange("idVendedor", oldIdVendedor, idVendedor);
    }

    public String getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(String idOperador) {
        String oldIdOperador = this.idOperador;
        this.idOperador = idOperador;
        changeSupport.firePropertyChange("idOperador", oldIdOperador, idOperador);
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        Integer oldIdProduto = this.idProduto;
        this.idProduto = idProduto;
        changeSupport.firePropertyChange("idProduto", oldIdProduto, idProduto);
    }

    public String getIdCozinha() {
        return idCozinha;
    }

    public void setIdCozinha(String idCozinha) {
        String oldIdCozinha = this.idCozinha;
        this.idCozinha = idCozinha;
        changeSupport.firePropertyChange("idCozinha", oldIdCozinha, idCozinha);
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        String oldIdCliente = this.idCliente;
        this.idCliente = idCliente;
        changeSupport.firePropertyChange("idCliente", oldIdCliente, idCliente);
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        String oldTipoMovimento = this.tipoMovimento;
        this.tipoMovimento = tipoMovimento;
        changeSupport.firePropertyChange("tipoMovimento", oldTipoMovimento, tipoMovimento);
    }

    public String getTipoAgregadorPgto() {
        return tipoAgregadorPgto;
    }

    public void setTipoAgregadorPgto(String tipoAgregadorPgto) {
        String oldTipoAgregadorPgto = this.tipoAgregadorPgto;
        this.tipoAgregadorPgto = tipoAgregadorPgto;
        changeSupport.firePropertyChange("tipoAgregadorPgto", oldTipoAgregadorPgto, tipoAgregadorPgto);
    }

    public String getTipoPagto() {
        return tipoPagto;
    }

    public void setTipoPagto(String tipoPagto) {
        String oldTipoPagto = this.tipoPagto;
        this.tipoPagto = tipoPagto;
        changeSupport.firePropertyChange("tipoPagto", oldTipoPagto, tipoPagto);
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        String oldTipoLocal = this.tipoLocal;
        this.tipoLocal = tipoLocal;
        changeSupport.firePropertyChange("tipoLocal", oldTipoLocal, tipoLocal);
    }

    public String getMovimento() {
        return movimento;
    }

    public void setMovimento(String movimento) {
        String oldMovimento = this.movimento;
        this.movimento = movimento;
        changeSupport.firePropertyChange("movimento", oldMovimento, movimento);
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        String oldLoja = this.loja;
        this.loja = loja;
        changeSupport.firePropertyChange("loja", oldLoja, loja);
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        String oldCaixa = this.caixa;
        this.caixa = caixa;
        changeSupport.firePropertyChange("caixa", oldCaixa, caixa);
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        String oldOperador = this.operador;
        this.operador = operador;
        changeSupport.firePropertyChange("operador", oldOperador, operador);
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        String oldVendedor = this.vendedor;
        this.vendedor = vendedor;
        changeSupport.firePropertyChange("vendedor", oldVendedor, vendedor);
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        Date oldDataMovimento = this.dataMovimento;
        this.dataMovimento = dataMovimento;
        changeSupport.firePropertyChange("dataMovimento", oldDataMovimento, dataMovimento);
    }

    public String getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(String horaPedido) {
        String oldHoraPedido = this.horaPedido;
        this.horaPedido = horaPedido;
        changeSupport.firePropertyChange("horaPedido", oldHoraPedido, horaPedido);
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        Date oldDataPedido = this.dataPedido;
        this.dataPedido = dataPedido;
        changeSupport.firePropertyChange("dataPedido", oldDataPedido, dataPedido);
    }

    public Date getDataEntregue() {
        return dataEntregue;
    }

    public void setDataEntregue(Date dataEntregue) {
        Date oldDataEntregue = this.dataEntregue;
        this.dataEntregue = dataEntregue;
        changeSupport.firePropertyChange("dataEntregue", oldDataEntregue, dataEntregue);
    }

    public String getHoraEntregue() {
        return horaEntregue;
    }

    public void setHoraEntregue(String horaEntregue) {
        String oldHoraEntregue = this.horaEntregue;
        this.horaEntregue = horaEntregue;
        changeSupport.firePropertyChange("horaEntregue", oldHoraEntregue, horaEntregue);
    }

    public String getHoraProducao() {
        return horaProducao;
    }

    public void setHoraProducao(String horaProducao) {
        String oldHoraProducao = this.horaProducao;
        this.horaProducao = horaProducao;
        changeSupport.firePropertyChange("horaProducao", oldHoraProducao, horaProducao);
    }

    public String getFlagEstatusPedido() {
        return flagEstatusPedido;
    }

    public void setFlagEstatusPedido(String flagEstatusPedido) {
        String oldFlagEstatusPedido = this.flagEstatusPedido;
        this.flagEstatusPedido = flagEstatusPedido;
        changeSupport.firePropertyChange("flagEstatusPedido", oldFlagEstatusPedido, flagEstatusPedido);
    }

    public String getCozinha() {
        return cozinha;
    }

    public void setCozinha(String cozinha) {
        String oldCozinha = this.cozinha;
        this.cozinha = cozinha;
        changeSupport.firePropertyChange("cozinha", oldCozinha, cozinha);
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        String oldProduto = this.produto;
        this.produto = produto;
        changeSupport.firePropertyChange("produto", oldProduto, produto);
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        String oldTipoProduto = this.tipoProduto;
        this.tipoProduto = tipoProduto;
        changeSupport.firePropertyChange("tipoProduto", oldTipoProduto, tipoProduto);
    }

    public String getDescricaoProd() {
        return descricaoProd;
    }

    public void setDescricaoProd(String descricaoProd) {
        String oldDescricaoProd = this.descricaoProd;
        this.descricaoProd = descricaoProd;
        changeSupport.firePropertyChange("descricaoProd", oldDescricaoProd, descricaoProd);
    }

    public String getTipoUnd() {
        return tipoUnd;
    }

    public void setTipoUnd(String tipoUnd) {
        String oldTipoUnd = this.tipoUnd;
        this.tipoUnd = tipoUnd;
        changeSupport.firePropertyChange("tipoUnd", oldTipoUnd, tipoUnd);
    }

    public String getTipoQuant() {
        return tipoQuant;
    }

    public void setTipoQuant(String tipoQuant) {
        String oldTipoQuant = this.tipoQuant;
        this.tipoQuant = tipoQuant;
        changeSupport.firePropertyChange("tipoQuant", oldTipoQuant, tipoQuant);
    }

    public String getQuantUnd() {
        return quantUnd;
    }

    public void setQuantUnd(String quantUnd) {
        String oldQuantUnd = this.quantUnd;
        this.quantUnd = quantUnd;
        changeSupport.firePropertyChange("quantUnd", oldQuantUnd, quantUnd);
    }

    public String getQuantVenda() {
        return quantVenda;
    }

    public void setQuantVenda(String quantVenda) {
        String oldQuantVenda = this.quantVenda;
        this.quantVenda = quantVenda;
        changeSupport.firePropertyChange("quantVenda", oldQuantVenda, quantVenda);
    }

    public String getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(String precoUnitario) {
        String oldPrecoUnitario = this.precoUnitario;
        this.precoUnitario = precoUnitario;
        changeSupport.firePropertyChange("precoUnitario", oldPrecoUnitario, precoUnitario);
    }

    public String getQuantAtual() {
        return quantAtual;
    }

    public void setQuantAtual(String quantAtual) {
        String oldQuantAtual = this.quantAtual;
        this.quantAtual = quantAtual;
        changeSupport.firePropertyChange("quantAtual", oldQuantAtual, quantAtual);
    }

    public String getQuantMin() {
        return quantMin;
    }

    public void setQuantMin(String quantMin) {
        String oldQuantMin = this.quantMin;
        this.quantMin = quantMin;
        changeSupport.firePropertyChange("quantMin", oldQuantMin, quantMin);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        String oldNomeCliente = this.nomeCliente;
        this.nomeCliente = nomeCliente;
        changeSupport.firePropertyChange("nomeCliente", oldNomeCliente, nomeCliente);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getCouver() {
        return couver;
    }

    public void setCouver(String couver) {
        String oldCouver = this.couver;
        this.couver = couver;
        changeSupport.firePropertyChange("couver", oldCouver, couver);
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        String oldServico = this.servico;
        this.servico = servico;
        changeSupport.firePropertyChange("servico", oldServico, servico);
    }

    public String getLocalPedido() {
        return localPedido;
    }

    public void setLocalPedido(String localPedido) {
        String oldLocalPedido = this.localPedido;
        this.localPedido = localPedido;
        changeSupport.firePropertyChange("localPedido", oldLocalPedido, localPedido);
    }

    public String getComanda() {
        return comanda;
    }

    public void setComanda(String comanda) {
        String oldComanda = this.comanda;
        this.comanda = comanda;
        changeSupport.firePropertyChange("comanda", oldComanda, comanda);
    }

    public String getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(String totalPedido) {
        String oldTotalPedido = this.totalPedido;
        this.totalPedido = totalPedido;
        changeSupport.firePropertyChange("totalPedido", oldTotalPedido, totalPedido);
    }

    public String getTotalApagar() {
        return totalApagar;
    }

    public void setTotalApagar(String totalApagar) {
        String oldTotalApagar = this.totalApagar;
        this.totalApagar = totalApagar;
        changeSupport.firePropertyChange("totalApagar", oldTotalApagar, totalApagar);
    }

    public String getRecebDebito() {
        return recebDebito;
    }

    public void setRecebDebito(String recebDebito) {
        String oldRecebDebito = this.recebDebito;
        this.recebDebito = recebDebito;
        changeSupport.firePropertyChange("recebDebito", oldRecebDebito, recebDebito);
    }

    public String getRecebDinheiro() {
        return recebDinheiro;
    }

    public void setRecebDinheiro(String recebDinheiro) {
        String oldRecebDinheiro = this.recebDinheiro;
        this.recebDinheiro = recebDinheiro;
        changeSupport.firePropertyChange("recebDinheiro", oldRecebDinheiro, recebDinheiro);
    }

    public String getRecebCredito() {
        return recebCredito;
    }

    public void setRecebCredito(String recebCredito) {
        String oldRecebCredito = this.recebCredito;
        this.recebCredito = recebCredito;
        changeSupport.firePropertyChange("recebCredito", oldRecebCredito, recebCredito);
    }

    public String getRecebPix() {
        return recebPix;
    }

    public void setRecebPix(String recebPix) {
        String oldRecebPix = this.recebPix;
        this.recebPix = recebPix;
        changeSupport.firePropertyChange("recebPix", oldRecebPix, recebPix);
    }

    public String getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(String taxaServico) {
        String oldTaxaServico = this.taxaServico;
        this.taxaServico = taxaServico;
        changeSupport.firePropertyChange("taxaServico", oldTaxaServico, taxaServico);
    }

    public String getTaxaCouver() {
        return taxaCouver;
    }

    public void setTaxaCouver(String taxaCouver) {
        String oldTaxaCouver = this.taxaCouver;
        this.taxaCouver = taxaCouver;
        changeSupport.firePropertyChange("taxaCouver", oldTaxaCouver, taxaCouver);
    }

    public String getTroco() {
        return troco;
    }

    public void setTroco(String troco) {
        String oldTroco = this.troco;
        this.troco = troco;
        changeSupport.firePropertyChange("troco", oldTroco, troco);
    }

    public String getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(String acrescimo) {
        String oldAcrescimo = this.acrescimo;
        this.acrescimo = acrescimo;
        changeSupport.firePropertyChange("acrescimo", oldAcrescimo, acrescimo);
    }

    public String getDecrescimo() {
        return decrescimo;
    }

    public void setDecrescimo(String decrescimo) {
        String oldDecrescimo = this.decrescimo;
        this.decrescimo = decrescimo;
        changeSupport.firePropertyChange("decrescimo", oldDecrescimo, decrescimo);
    }

    public String getDetalhePedido() {
        return detalhePedido;
    }

    public void setDetalhePedido(String detalhePedido) {
        String oldDetalhePedido = this.detalhePedido;
        this.detalhePedido = detalhePedido;
        changeSupport.firePropertyChange("detalhePedido", oldDetalhePedido, detalhePedido);
    }

    public String getFlagEstatusMovidet() {
        return flagEstatusMovidet;
    }

    public void setFlagEstatusMovidet(String flagEstatusMovidet) {
        String oldFlagEstatusMovidet = this.flagEstatusMovidet;
        this.flagEstatusMovidet = flagEstatusMovidet;
        changeSupport.firePropertyChange("flagEstatusMovidet", oldFlagEstatusMovidet, flagEstatusMovidet);
    }

    public String getZap() {
        return zap;
    }

    public void setZap(String zap) {
        String oldZap = this.zap;
        this.zap = zap;
        changeSupport.firePropertyChange("zap", oldZap, zap);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        String oldLogradouro = this.logradouro;
        this.logradouro = logradouro;
        changeSupport.firePropertyChange("logradouro", oldLogradouro, logradouro);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        changeSupport.firePropertyChange("complemento", oldComplemento, complemento);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String oldUf = this.uf;
        this.uf = uf;
        changeSupport.firePropertyChange("uf", oldUf, uf);
    }

    public String getTrocoPara() {
        return trocoPara;
    }

    public void setTrocoPara(String trocoPara) {
        String oldTrocoPara = this.trocoPara;
        this.trocoPara = trocoPara;
        changeSupport.firePropertyChange("trocoPara", oldTrocoPara, trocoPara);
    }

    public String getEntregador() {
        return entregador;
    }

    public void setEntregador(String entregador) {
        String oldEntregador = this.entregador;
        this.entregador = entregador;
        changeSupport.firePropertyChange("entregador", oldEntregador, entregador);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovRest != null ? idMovRest.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MoviRest)) {
            return false;
        }
        MoviRest other = (MoviRest) object;
        if ((this.idMovRest == null && other.idMovRest != null) || (this.idMovRest != null && !this.idMovRest.equals(other.idMovRest))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.beans.MoviRest[ idMovRest=" + idMovRest + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
