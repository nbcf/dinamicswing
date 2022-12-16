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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "movimento_det", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "MovimentoDet.findAll", query = "SELECT m FROM MovimentoDet m")
    , @NamedQuery(name = "MovimentoDet.findByIdMovimentoDet", query = "SELECT m FROM MovimentoDet m WHERE m.idMovimentoDet = :idMovimentoDet")
    , @NamedQuery(name = "MovimentoDet.findByIdMovimentoGeral", query = "SELECT m FROM MovimentoDet m WHERE m.idMovimentoGeral = :idMovimentoGeral")
    , @NamedQuery(name = "MovimentoDet.findByIdLoja", query = "SELECT m FROM MovimentoDet m WHERE m.idLoja = :idLoja")
    , @NamedQuery(name = "MovimentoDet.findByIdCaixa", query = "SELECT m FROM MovimentoDet m WHERE m.idCaixa = :idCaixa")
    , @NamedQuery(name = "MovimentoDet.findByIdVendedor", query = "SELECT m FROM MovimentoDet m WHERE m.idVendedor = :idVendedor")
    , @NamedQuery(name = "MovimentoDet.findByIdOperador", query = "SELECT m FROM MovimentoDet m WHERE m.idOperador = :idOperador")
    , @NamedQuery(name = "MovimentoDet.findByIdProduto", query = "SELECT m FROM MovimentoDet m WHERE m.idProduto = :idProduto")
    , @NamedQuery(name = "MovimentoDet.findByIdCozinha", query = "SELECT m FROM MovimentoDet m WHERE m.idCozinha = :idCozinha")
    , @NamedQuery(name = "MovimentoDet.findByIdCliente", query = "SELECT m FROM MovimentoDet m WHERE m.idCliente = :idCliente")
    , @NamedQuery(name = "MovimentoDet.findByIdTipoProduto", query = "SELECT m FROM MovimentoDet m WHERE m.idTipoProduto = :idTipoProduto")
    , @NamedQuery(name = "MovimentoDet.findByIdCadTipoUnd", query = "SELECT m FROM MovimentoDet m WHERE m.idCadTipoUnd = :idCadTipoUnd")
    , @NamedQuery(name = "MovimentoDet.findByTipoMovimento", query = "SELECT m FROM MovimentoDet m WHERE m.tipoMovimento = :tipoMovimento")
    , @NamedQuery(name = "MovimentoDet.findByTipoAgregadorPgto", query = "SELECT m FROM MovimentoDet m WHERE m.tipoAgregadorPgto = :tipoAgregadorPgto")
    , @NamedQuery(name = "MovimentoDet.findByTipoPagto", query = "SELECT m FROM MovimentoDet m WHERE m.tipoPagto = :tipoPagto")
    , @NamedQuery(name = "MovimentoDet.findByTipoLocal", query = "SELECT m FROM MovimentoDet m WHERE m.tipoLocal = :tipoLocal")
    , @NamedQuery(name = "MovimentoDet.findByMovimento", query = "SELECT m FROM MovimentoDet m WHERE m.movimento = :movimento")
    , @NamedQuery(name = "MovimentoDet.findByLoja", query = "SELECT m FROM MovimentoDet m WHERE m.loja = :loja")
    , @NamedQuery(name = "MovimentoDet.findByCaixa", query = "SELECT m FROM MovimentoDet m WHERE m.caixa = :caixa")
    , @NamedQuery(name = "MovimentoDet.findByOperador", query = "SELECT m FROM MovimentoDet m WHERE m.operador = :operador")
    , @NamedQuery(name = "MovimentoDet.findByVendedor", query = "SELECT m FROM MovimentoDet m WHERE m.vendedor = :vendedor")
    , @NamedQuery(name = "MovimentoDet.findByDataMovimento", query = "SELECT m FROM MovimentoDet m WHERE m.dataMovimento = :dataMovimento")
    , @NamedQuery(name = "MovimentoDet.findByHoraPedido", query = "SELECT m FROM MovimentoDet m WHERE m.horaPedido = :horaPedido")
    , @NamedQuery(name = "MovimentoDet.findByDataPedido", query = "SELECT m FROM MovimentoDet m WHERE m.dataPedido = :dataPedido")
    , @NamedQuery(name = "MovimentoDet.findByDataEntregue", query = "SELECT m FROM MovimentoDet m WHERE m.dataEntregue = :dataEntregue")
    , @NamedQuery(name = "MovimentoDet.findByHoraEntregue", query = "SELECT m FROM MovimentoDet m WHERE m.horaEntregue = :horaEntregue")
    , @NamedQuery(name = "MovimentoDet.findByHoraProducao", query = "SELECT m FROM MovimentoDet m WHERE m.horaProducao = :horaProducao")
    , @NamedQuery(name = "MovimentoDet.findByFlagEstatusPedido", query = "SELECT m FROM MovimentoDet m WHERE m.flagEstatusPedido = :flagEstatusPedido")
    , @NamedQuery(name = "MovimentoDet.findByCozinha", query = "SELECT m FROM MovimentoDet m WHERE m.cozinha = :cozinha")
    , @NamedQuery(name = "MovimentoDet.findByProduto", query = "SELECT m FROM MovimentoDet m WHERE m.produto = :produto")
    , @NamedQuery(name = "MovimentoDet.findByTipoProduto", query = "SELECT m FROM MovimentoDet m WHERE m.tipoProduto = :tipoProduto")
    , @NamedQuery(name = "MovimentoDet.findByTipoUnd", query = "SELECT m FROM MovimentoDet m WHERE m.tipoUnd = :tipoUnd")
    , @NamedQuery(name = "MovimentoDet.findByTipoQuant", query = "SELECT m FROM MovimentoDet m WHERE m.tipoQuant = :tipoQuant")
    , @NamedQuery(name = "MovimentoDet.findByQuantUnd", query = "SELECT m FROM MovimentoDet m WHERE m.quantUnd = :quantUnd")
    , @NamedQuery(name = "MovimentoDet.findByQuantVenda", query = "SELECT m FROM MovimentoDet m WHERE m.quantVenda = :quantVenda")
    , @NamedQuery(name = "MovimentoDet.findByPrecoUnitario", query = "SELECT m FROM MovimentoDet m WHERE m.precoUnitario = :precoUnitario")
    , @NamedQuery(name = "MovimentoDet.findByQuantAtual", query = "SELECT m FROM MovimentoDet m WHERE m.quantAtual = :quantAtual")
    , @NamedQuery(name = "MovimentoDet.findByQuantMin", query = "SELECT m FROM MovimentoDet m WHERE m.quantMin = :quantMin")
    , @NamedQuery(name = "MovimentoDet.findByNomeCliente", query = "SELECT m FROM MovimentoDet m WHERE m.nomeCliente = :nomeCliente")
    , @NamedQuery(name = "MovimentoDet.findByCpf", query = "SELECT m FROM MovimentoDet m WHERE m.cpf = :cpf")
    , @NamedQuery(name = "MovimentoDet.findByCouver", query = "SELECT m FROM MovimentoDet m WHERE m.couver = :couver")
    , @NamedQuery(name = "MovimentoDet.findByServico", query = "SELECT m FROM MovimentoDet m WHERE m.servico = :servico")
    , @NamedQuery(name = "MovimentoDet.findByLocalPedido", query = "SELECT m FROM MovimentoDet m WHERE m.localPedido = :localPedido")
    , @NamedQuery(name = "MovimentoDet.findByComanda", query = "SELECT m FROM MovimentoDet m WHERE m.comanda = :comanda")
    , @NamedQuery(name = "MovimentoDet.findByTotalPedido", query = "SELECT m FROM MovimentoDet m WHERE m.totalPedido = :totalPedido")
    , @NamedQuery(name = "MovimentoDet.findByTotalApagar", query = "SELECT m FROM MovimentoDet m WHERE m.totalApagar = :totalApagar")
    , @NamedQuery(name = "MovimentoDet.findByRecebDebito", query = "SELECT m FROM MovimentoDet m WHERE m.recebDebito = :recebDebito")
    , @NamedQuery(name = "MovimentoDet.findByRecebDinheiro", query = "SELECT m FROM MovimentoDet m WHERE m.recebDinheiro = :recebDinheiro")
    , @NamedQuery(name = "MovimentoDet.findByRecebCredito", query = "SELECT m FROM MovimentoDet m WHERE m.recebCredito = :recebCredito")
    , @NamedQuery(name = "MovimentoDet.findByRecebPix", query = "SELECT m FROM MovimentoDet m WHERE m.recebPix = :recebPix")
    , @NamedQuery(name = "MovimentoDet.findByTaxaServico", query = "SELECT m FROM MovimentoDet m WHERE m.taxaServico = :taxaServico")
    , @NamedQuery(name = "MovimentoDet.findByTaxaCouver", query = "SELECT m FROM MovimentoDet m WHERE m.taxaCouver = :taxaCouver")
    , @NamedQuery(name = "MovimentoDet.findByTroco", query = "SELECT m FROM MovimentoDet m WHERE m.troco = :troco")
    , @NamedQuery(name = "MovimentoDet.findByAcrescimo", query = "SELECT m FROM MovimentoDet m WHERE m.acrescimo = :acrescimo")
    , @NamedQuery(name = "MovimentoDet.findByDecrescimo", query = "SELECT m FROM MovimentoDet m WHERE m.decrescimo = :decrescimo")
    , @NamedQuery(name = "MovimentoDet.findByFlagEstatusMovidet", query = "SELECT m FROM MovimentoDet m WHERE m.flagEstatusMovidet = :flagEstatusMovidet")
    , @NamedQuery(name = "MovimentoDet.findByZap", query = "SELECT m FROM MovimentoDet m WHERE m.zap = :zap")})
public class MovimentoDet implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MOVIMENTO_DET")
    private Integer idMovimentoDet;
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
    @Column(name = "ID_TIPO_PRODUTO")
    private Integer idTipoProduto;
    @Column(name = "ID_CAD_TIPO_UND")
    private Integer idCadTipoUnd;
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
    @JoinColumn(name = "ID_MOVIMENTO_CAB", referencedColumnName = "ID_MOVIMENTO_CAB")
    @ManyToOne
    private MovimentoCab idMovimentoCab;

    public MovimentoDet() {
    }

    public MovimentoDet(Integer idMovimentoDet) {
        this.idMovimentoDet = idMovimentoDet;
    }

    public Integer getIdMovimentoDet() {
        return idMovimentoDet;
    }

    public void setIdMovimentoDet(Integer idMovimentoDet) {
        Integer oldIdMovimentoDet = this.idMovimentoDet;
        this.idMovimentoDet = idMovimentoDet;
        changeSupport.firePropertyChange("idMovimentoDet", oldIdMovimentoDet, idMovimentoDet);
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

    public Integer getIdTipoProduto() {
        return idTipoProduto;
    }

    public void setIdTipoProduto(Integer idTipoProduto) {
        Integer oldIdTipoProduto = this.idTipoProduto;
        this.idTipoProduto = idTipoProduto;
        changeSupport.firePropertyChange("idTipoProduto", oldIdTipoProduto, idTipoProduto);
    }

    public Integer getIdCadTipoUnd() {
        return idCadTipoUnd;
    }

    public void setIdCadTipoUnd(Integer idCadTipoUnd) {
        Integer oldIdCadTipoUnd = this.idCadTipoUnd;
        this.idCadTipoUnd = idCadTipoUnd;
        changeSupport.firePropertyChange("idCadTipoUnd", oldIdCadTipoUnd, idCadTipoUnd);
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

    public MovimentoCab getIdMovimentoCab() {
        return idMovimentoCab;
    }

    public void setIdMovimentoCab(MovimentoCab idMovimentoCab) {
        MovimentoCab oldIdMovimentoCab = this.idMovimentoCab;
        this.idMovimentoCab = idMovimentoCab;
        changeSupport.firePropertyChange("idMovimentoCab", oldIdMovimentoCab, idMovimentoCab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovimentoDet != null ? idMovimentoDet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimentoDet)) {
            return false;
        }
        MovimentoDet other = (MovimentoDet) object;
        if ((this.idMovimentoDet == null && other.idMovimentoDet != null) || (this.idMovimentoDet != null && !this.idMovimentoDet.equals(other.idMovimentoDet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.beans.MovimentoDet[ idMovimentoDet=" + idMovimentoDet + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
