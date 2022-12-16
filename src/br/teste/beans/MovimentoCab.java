/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author nil_b
 */
@Entity
@Table(name = "movimento_cab", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "MovimentoCab.findAll", query = "SELECT m FROM MovimentoCab m")
    , @NamedQuery(name = "MovimentoCab.findByIdMovimentoCab", query = "SELECT m FROM MovimentoCab m WHERE m.idMovimentoCab = :idMovimentoCab")
    , @NamedQuery(name = "MovimentoCab.findByIdItens", query = "SELECT m FROM MovimentoCab m WHERE m.idItens = :idItens")
    , @NamedQuery(name = "MovimentoCab.findByIdMovimentoGeral", query = "SELECT m FROM MovimentoCab m WHERE m.idMovimentoGeral = :idMovimentoGeral")
    , @NamedQuery(name = "MovimentoCab.findByIdLoja", query = "SELECT m FROM MovimentoCab m WHERE m.idLoja = :idLoja")
    , @NamedQuery(name = "MovimentoCab.findByIdCaixa", query = "SELECT m FROM MovimentoCab m WHERE m.idCaixa = :idCaixa")
    , @NamedQuery(name = "MovimentoCab.findByIdOperador", query = "SELECT m FROM MovimentoCab m WHERE m.idOperador = :idOperador")
    , @NamedQuery(name = "MovimentoCab.findByIdVendedor", query = "SELECT m FROM MovimentoCab m WHERE m.idVendedor = :idVendedor")
    , @NamedQuery(name = "MovimentoCab.findByIdCliente", query = "SELECT m FROM MovimentoCab m WHERE m.idCliente = :idCliente")
    , @NamedQuery(name = "MovimentoCab.findByTipoMovimento", query = "SELECT m FROM MovimentoCab m WHERE m.tipoMovimento = :tipoMovimento")
    , @NamedQuery(name = "MovimentoCab.findByTipoAgregadorPgto", query = "SELECT m FROM MovimentoCab m WHERE m.tipoAgregadorPgto = :tipoAgregadorPgto")
    , @NamedQuery(name = "MovimentoCab.findByTipoPagto", query = "SELECT m FROM MovimentoCab m WHERE m.tipoPagto = :tipoPagto")
    , @NamedQuery(name = "MovimentoCab.findByTipoLocal", query = "SELECT m FROM MovimentoCab m WHERE m.tipoLocal = :tipoLocal")
    , @NamedQuery(name = "MovimentoCab.findByLocal", query = "SELECT m FROM MovimentoCab m WHERE m.local = :local")
    , @NamedQuery(name = "MovimentoCab.findByDataMovimento", query = "SELECT m FROM MovimentoCab m WHERE m.dataMovimento = :dataMovimento")
    , @NamedQuery(name = "MovimentoCab.findByHoraMovimento", query = "SELECT m FROM MovimentoCab m WHERE m.horaMovimento = :horaMovimento")
    , @NamedQuery(name = "MovimentoCab.findByMovimento", query = "SELECT m FROM MovimentoCab m WHERE m.movimento = :movimento")
    , @NamedQuery(name = "MovimentoCab.findByLoja", query = "SELECT m FROM MovimentoCab m WHERE m.loja = :loja")
    , @NamedQuery(name = "MovimentoCab.findByCaixa", query = "SELECT m FROM MovimentoCab m WHERE m.caixa = :caixa")
    , @NamedQuery(name = "MovimentoCab.findByOperador", query = "SELECT m FROM MovimentoCab m WHERE m.operador = :operador")
    , @NamedQuery(name = "MovimentoCab.findByVendedor", query = "SELECT m FROM MovimentoCab m WHERE m.vendedor = :vendedor")
    , @NamedQuery(name = "MovimentoCab.findByRecebidoDebito", query = "SELECT m FROM MovimentoCab m WHERE m.recebidoDebito = :recebidoDebito")
    , @NamedQuery(name = "MovimentoCab.findByRecebidoDinheiro", query = "SELECT m FROM MovimentoCab m WHERE m.recebidoDinheiro = :recebidoDinheiro")
    , @NamedQuery(name = "MovimentoCab.findByRecebidoCred", query = "SELECT m FROM MovimentoCab m WHERE m.recebidoCred = :recebidoCred")
    , @NamedQuery(name = "MovimentoCab.findByRecebidoPix", query = "SELECT m FROM MovimentoCab m WHERE m.recebidoPix = :recebidoPix")
    , @NamedQuery(name = "MovimentoCab.findByTaxaServico", query = "SELECT m FROM MovimentoCab m WHERE m.taxaServico = :taxaServico")
    , @NamedQuery(name = "MovimentoCab.findByTaxaCouver", query = "SELECT m FROM MovimentoCab m WHERE m.taxaCouver = :taxaCouver")
    , @NamedQuery(name = "MovimentoCab.findByTotalConsumo", query = "SELECT m FROM MovimentoCab m WHERE m.totalConsumo = :totalConsumo")
    , @NamedQuery(name = "MovimentoCab.findByTotalMovimento", query = "SELECT m FROM MovimentoCab m WHERE m.totalMovimento = :totalMovimento")
    , @NamedQuery(name = "MovimentoCab.findByTotalPago", query = "SELECT m FROM MovimentoCab m WHERE m.totalPago = :totalPago")
    , @NamedQuery(name = "MovimentoCab.findByTroco", query = "SELECT m FROM MovimentoCab m WHERE m.troco = :troco")
    , @NamedQuery(name = "MovimentoCab.findByTrocoParaEntrega", query = "SELECT m FROM MovimentoCab m WHERE m.trocoParaEntrega = :trocoParaEntrega")
    , @NamedQuery(name = "MovimentoCab.findByValorFrete", query = "SELECT m FROM MovimentoCab m WHERE m.valorFrete = :valorFrete")
    , @NamedQuery(name = "MovimentoCab.findByFlagEntrega", query = "SELECT m FROM MovimentoCab m WHERE m.flagEntrega = :flagEntrega")
    , @NamedQuery(name = "MovimentoCab.findByLogradouro", query = "SELECT m FROM MovimentoCab m WHERE m.logradouro = :logradouro")
    , @NamedQuery(name = "MovimentoCab.findByComplemento", query = "SELECT m FROM MovimentoCab m WHERE m.complemento = :complemento")
    , @NamedQuery(name = "MovimentoCab.findByBairro", query = "SELECT m FROM MovimentoCab m WHERE m.bairro = :bairro")
    , @NamedQuery(name = "MovimentoCab.findByCep", query = "SELECT m FROM MovimentoCab m WHERE m.cep = :cep")
    , @NamedQuery(name = "MovimentoCab.findByCidade", query = "SELECT m FROM MovimentoCab m WHERE m.cidade = :cidade")
    , @NamedQuery(name = "MovimentoCab.findByUf", query = "SELECT m FROM MovimentoCab m WHERE m.uf = :uf")
    , @NamedQuery(name = "MovimentoCab.findByEntregador", query = "SELECT m FROM MovimentoCab m WHERE m.entregador = :entregador")
    , @NamedQuery(name = "MovimentoCab.findByRecebedor", query = "SELECT m FROM MovimentoCab m WHERE m.recebedor = :recebedor")
    , @NamedQuery(name = "MovimentoCab.findByDataEntregue", query = "SELECT m FROM MovimentoCab m WHERE m.dataEntregue = :dataEntregue")
    , @NamedQuery(name = "MovimentoCab.findByHoraEntregue", query = "SELECT m FROM MovimentoCab m WHERE m.horaEntregue = :horaEntregue")
    , @NamedQuery(name = "MovimentoCab.findByDataEnvio", query = "SELECT m FROM MovimentoCab m WHERE m.dataEnvio = :dataEnvio")
    , @NamedQuery(name = "MovimentoCab.findByHoraEnvio", query = "SELECT m FROM MovimentoCab m WHERE m.horaEnvio = :horaEnvio")
    , @NamedQuery(name = "MovimentoCab.findByBandeira", query = "SELECT m FROM MovimentoCab m WHERE m.bandeira = :bandeira")
    , @NamedQuery(name = "MovimentoCab.findByNumeroCartao", query = "SELECT m FROM MovimentoCab m WHERE m.numeroCartao = :numeroCartao")
    , @NamedQuery(name = "MovimentoCab.findByCartao", query = "SELECT m FROM MovimentoCab m WHERE m.cartao = :cartao")
    , @NamedQuery(name = "MovimentoCab.findByFlagEstatusMovcab", query = "SELECT m FROM MovimentoCab m WHERE m.flagEstatusMovcab = :flagEstatusMovcab")
    , @NamedQuery(name = "MovimentoCab.findByCliente", query = "SELECT m FROM MovimentoCab m WHERE m.cliente = :cliente")
    , @NamedQuery(name = "MovimentoCab.findByTipoPessoa", query = "SELECT m FROM MovimentoCab m WHERE m.tipoPessoa = :tipoPessoa")
    , @NamedQuery(name = "MovimentoCab.findByGenero", query = "SELECT m FROM MovimentoCab m WHERE m.genero = :genero")
    , @NamedQuery(name = "MovimentoCab.findByRzsRg", query = "SELECT m FROM MovimentoCab m WHERE m.rzsRg = :rzsRg")
    , @NamedQuery(name = "MovimentoCab.findByCnpjCpf", query = "SELECT m FROM MovimentoCab m WHERE m.cnpjCpf = :cnpjCpf")
    , @NamedQuery(name = "MovimentoCab.findByCliLogradouro", query = "SELECT m FROM MovimentoCab m WHERE m.cliLogradouro = :cliLogradouro")
    , @NamedQuery(name = "MovimentoCab.findByCliComplemento", query = "SELECT m FROM MovimentoCab m WHERE m.cliComplemento = :cliComplemento")
    , @NamedQuery(name = "MovimentoCab.findByCliBairro", query = "SELECT m FROM MovimentoCab m WHERE m.cliBairro = :cliBairro")
    , @NamedQuery(name = "MovimentoCab.findByCliCep", query = "SELECT m FROM MovimentoCab m WHERE m.cliCep = :cliCep")
    , @NamedQuery(name = "MovimentoCab.findByCliCidade", query = "SELECT m FROM MovimentoCab m WHERE m.cliCidade = :cliCidade")
    , @NamedQuery(name = "MovimentoCab.findByCliUf", query = "SELECT m FROM MovimentoCab m WHERE m.cliUf = :cliUf")
    , @NamedQuery(name = "MovimentoCab.findByCliTrocoPara", query = "SELECT m FROM MovimentoCab m WHERE m.cliTrocoPara = :cliTrocoPara")
    , @NamedQuery(name = "MovimentoCab.findByZap", query = "SELECT m FROM MovimentoCab m WHERE m.zap = :zap")
    , @NamedQuery(name = "MovimentoCab.findByNumeroComanda", query = "SELECT m FROM MovimentoCab m WHERE m.numeroComanda = :numeroComanda")})
public class MovimentoCab implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MOVIMENTO_CAB")
    private Integer idMovimentoCab;
   
    
//    @Column(name = "ID_ITENS")
//    private Integer idItens;
//    
     @JoinColumn(name = "ID_ITENS", referencedColumnName = "ID_ITENS")
    @ManyToOne
    private Produtos idItens;
     
     
     
    
    @Column(name = "ID_MOVIMENTO_GERAL")
    private Integer idMovimentoGeral;
    @Column(name = "ID_LOJA")
    private String idLoja;
    @Column(name = "ID_CAIXA")
    private String idCaixa;
    @Column(name = "ID_OPERADOR")
    private String idOperador;
    @Column(name = "ID_VENDEDOR")
    private String idVendedor;
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
    @Column(name = "LOCAL")
    private String local;
    @Column(name = "DATA_MOVIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataMovimento;
    @Column(name = "HORA_MOVIMENTO")
    private String horaMovimento;
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
    @Column(name = "RECEBIDO_DEBITO")
    private String recebidoDebito;
    @Column(name = "RECEBIDO_DINHEIRO")
    private String recebidoDinheiro;
    @Column(name = "RECEBIDO_CRED")
    private String recebidoCred;
    @Column(name = "RECEBIDO_PIX")
    private String recebidoPix;
    @Column(name = "TAXA_SERVICO")
    private String taxaServico;
    @Column(name = "TAXA_COUVER")
    private String taxaCouver;
    @Column(name = "TOTAL_CONSUMO")
    private String totalConsumo;
    @Column(name = "TOTAL_MOVIMENTO")
    private String totalMovimento;
    @Column(name = "TOTAL_PAGO")
    private String totalPago;
    @Column(name = "TROCO")
    private String troco;
    @Column(name = "TROCO_PARA_ENTREGA")
    private String trocoParaEntrega;
    @Column(name = "VALOR_FRETE")
    private String valorFrete;
    @Column(name = "FLAG_ENTREGA")
    private String flagEntrega;
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
    @Column(name = "ENTREGADOR")
    private String entregador;
    @Column(name = "RECEBEDOR")
    private String recebedor;
    @Column(name = "DATA_ENTREGUE")
    @Temporal(TemporalType.DATE)
    private Date dataEntregue;
    @Column(name = "HORA_ENTREGUE")
    private String horaEntregue;
    @Column(name = "DATA_ENVIO")
    @Temporal(TemporalType.DATE)
    private Date dataEnvio;
    @Column(name = "HORA_ENVIO")
    private String horaEnvio;
    @Column(name = "BANDEIRA")
    private String bandeira;
    @Column(name = "NUMERO_CARTAO")
    private String numeroCartao;
    @Column(name = "CARTAO")
    private String cartao;
    @Column(name = "FLAG_ESTATUS_MOVCAB")
    private String flagEstatusMovcab;
    @Column(name = "CLIENTE")
    private String cliente;
    @Column(name = "TIPO_PESSOA")
    private String tipoPessoa;
    @Column(name = "GENERO")
    private String genero;
    @Column(name = "RZS_RG")
    private String rzsRg;
    @Column(name = "CNPJ_CPF")
    private String cnpjCpf;
    @Column(name = "CLI_LOGRADOURO")
    private String cliLogradouro;
    @Column(name = "CLI_COMPLEMENTO")
    private String cliComplemento;
    @Column(name = "CLI_BAIRRO")
    private String cliBairro;
    @Column(name = "CLI_CEP")
    private String cliCep;
    @Column(name = "CLI_CIDADE")
    private String cliCidade;
    @Column(name = "CLI_UF")
    private String cliUf;
    @Column(name = "CLI_TROCO_PARA")
    private String cliTrocoPara;
    @Column(name = "ZAP")
    private String zap;
    @Column(name = "NUMERO_COMANDA")
    private String numeroComanda;
    @Lob
    @Column(name = "DESC_PRODUTO")
    private String descProduto;
 
     @JoinColumn(name = "ID_MOVIMENTO_CAB", referencedColumnName = "ID_MOVIMENTO_CAB")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMovimentoCab")
    private Collection<MovimentoDet> movimentoDetCollection;
    
    public MovimentoCab() {
    }

    public MovimentoCab(Integer idMovimentoCab) {
        this.idMovimentoCab = idMovimentoCab;
    }

    public Integer getIdMovimentoCab() {
        return idMovimentoCab;
    }

    public void setIdMovimentoCab(Integer idMovimentoCab) {
        Integer oldIdMovimentoCab = this.idMovimentoCab;
        this.idMovimentoCab = idMovimentoCab;
        changeSupport.firePropertyChange("idMovimentoCab", oldIdMovimentoCab, idMovimentoCab);
    }

    public Produtos getIdItens() {
        return idItens;
    }

    public void setIdItens(Produtos idItens) {
        Produtos oldIdItens = this.idItens;
        this.idItens = idItens;
        changeSupport.firePropertyChange("idItens", oldIdItens, idItens);
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

    public String getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(String idOperador) {
        String oldIdOperador = this.idOperador;
        this.idOperador = idOperador;
        changeSupport.firePropertyChange("idOperador", oldIdOperador, idOperador);
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        String oldIdVendedor = this.idVendedor;
        this.idVendedor = idVendedor;
        changeSupport.firePropertyChange("idVendedor", oldIdVendedor, idVendedor);
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        String oldLocal = this.local;
        this.local = local;
        changeSupport.firePropertyChange("local", oldLocal, local);
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        Date oldDataMovimento = this.dataMovimento;
        this.dataMovimento = dataMovimento;
        changeSupport.firePropertyChange("dataMovimento", oldDataMovimento, dataMovimento);
    }

    public String getHoraMovimento() {
        return horaMovimento;
    }

    public void setHoraMovimento(String horaMovimento) {
        String oldHoraMovimento = this.horaMovimento;
        this.horaMovimento = horaMovimento;
        changeSupport.firePropertyChange("horaMovimento", oldHoraMovimento, horaMovimento);
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

    public String getRecebidoDebito() {
        return recebidoDebito;
    }

    public void setRecebidoDebito(String recebidoDebito) {
        String oldRecebidoDebito = this.recebidoDebito;
        this.recebidoDebito = recebidoDebito;
        changeSupport.firePropertyChange("recebidoDebito", oldRecebidoDebito, recebidoDebito);
    }

    public String getRecebidoDinheiro() {
        return recebidoDinheiro;
    }

    public void setRecebidoDinheiro(String recebidoDinheiro) {
        String oldRecebidoDinheiro = this.recebidoDinheiro;
        this.recebidoDinheiro = recebidoDinheiro;
        changeSupport.firePropertyChange("recebidoDinheiro", oldRecebidoDinheiro, recebidoDinheiro);
    }

    public String getRecebidoCred() {
        return recebidoCred;
    }

    public void setRecebidoCred(String recebidoCred) {
        String oldRecebidoCred = this.recebidoCred;
        this.recebidoCred = recebidoCred;
        changeSupport.firePropertyChange("recebidoCred", oldRecebidoCred, recebidoCred);
    }

    public String getRecebidoPix() {
        return recebidoPix;
    }

    public void setRecebidoPix(String recebidoPix) {
        String oldRecebidoPix = this.recebidoPix;
        this.recebidoPix = recebidoPix;
        changeSupport.firePropertyChange("recebidoPix", oldRecebidoPix, recebidoPix);
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

    public String getTotalConsumo() {
        return totalConsumo;
    }

    public void setTotalConsumo(String totalConsumo) {
        String oldTotalConsumo = this.totalConsumo;
        this.totalConsumo = totalConsumo;
        changeSupport.firePropertyChange("totalConsumo", oldTotalConsumo, totalConsumo);
    }

    public String getTotalMovimento() {
        return totalMovimento;
    }

    public void setTotalMovimento(String totalMovimento) {
        String oldTotalMovimento = this.totalMovimento;
        this.totalMovimento = totalMovimento;
        changeSupport.firePropertyChange("totalMovimento", oldTotalMovimento, totalMovimento);
    }

    public String getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(String totalPago) {
        String oldTotalPago = this.totalPago;
        this.totalPago = totalPago;
        changeSupport.firePropertyChange("totalPago", oldTotalPago, totalPago);
    }

    public String getTroco() {
        return troco;
    }

    public void setTroco(String troco) {
        String oldTroco = this.troco;
        this.troco = troco;
        changeSupport.firePropertyChange("troco", oldTroco, troco);
    }

    public String getTrocoParaEntrega() {
        return trocoParaEntrega;
    }

    public void setTrocoParaEntrega(String trocoParaEntrega) {
        String oldTrocoParaEntrega = this.trocoParaEntrega;
        this.trocoParaEntrega = trocoParaEntrega;
        changeSupport.firePropertyChange("trocoParaEntrega", oldTrocoParaEntrega, trocoParaEntrega);
    }

    public String getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(String valorFrete) {
        String oldValorFrete = this.valorFrete;
        this.valorFrete = valorFrete;
        changeSupport.firePropertyChange("valorFrete", oldValorFrete, valorFrete);
    }

    public String getFlagEntrega() {
        return flagEntrega;
    }

    public void setFlagEntrega(String flagEntrega) {
        String oldFlagEntrega = this.flagEntrega;
        this.flagEntrega = flagEntrega;
        changeSupport.firePropertyChange("flagEntrega", oldFlagEntrega, flagEntrega);
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

    public String getEntregador() {
        return entregador;
    }

    public void setEntregador(String entregador) {
        String oldEntregador = this.entregador;
        this.entregador = entregador;
        changeSupport.firePropertyChange("entregador", oldEntregador, entregador);
    }

    public String getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(String recebedor) {
        String oldRecebedor = this.recebedor;
        this.recebedor = recebedor;
        changeSupport.firePropertyChange("recebedor", oldRecebedor, recebedor);
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

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        Date oldDataEnvio = this.dataEnvio;
        this.dataEnvio = dataEnvio;
        changeSupport.firePropertyChange("dataEnvio", oldDataEnvio, dataEnvio);
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(String horaEnvio) {
        String oldHoraEnvio = this.horaEnvio;
        this.horaEnvio = horaEnvio;
        changeSupport.firePropertyChange("horaEnvio", oldHoraEnvio, horaEnvio);
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        String oldBandeira = this.bandeira;
        this.bandeira = bandeira;
        changeSupport.firePropertyChange("bandeira", oldBandeira, bandeira);
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        String oldNumeroCartao = this.numeroCartao;
        this.numeroCartao = numeroCartao;
        changeSupport.firePropertyChange("numeroCartao", oldNumeroCartao, numeroCartao);
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        String oldCartao = this.cartao;
        this.cartao = cartao;
        changeSupport.firePropertyChange("cartao", oldCartao, cartao);
    }

    public String getFlagEstatusMovcab() {
        return flagEstatusMovcab;
    }

    public void setFlagEstatusMovcab(String flagEstatusMovcab) {
        String oldFlagEstatusMovcab = this.flagEstatusMovcab;
        this.flagEstatusMovcab = flagEstatusMovcab;
        changeSupport.firePropertyChange("flagEstatusMovcab", oldFlagEstatusMovcab, flagEstatusMovcab);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        String oldCliente = this.cliente;
        this.cliente = cliente;
        changeSupport.firePropertyChange("cliente", oldCliente, cliente);
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        String oldTipoPessoa = this.tipoPessoa;
        this.tipoPessoa = tipoPessoa;
        changeSupport.firePropertyChange("tipoPessoa", oldTipoPessoa, tipoPessoa);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        String oldGenero = this.genero;
        this.genero = genero;
        changeSupport.firePropertyChange("genero", oldGenero, genero);
    }

    public String getRzsRg() {
        return rzsRg;
    }

    public void setRzsRg(String rzsRg) {
        String oldRzsRg = this.rzsRg;
        this.rzsRg = rzsRg;
        changeSupport.firePropertyChange("rzsRg", oldRzsRg, rzsRg);
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        String oldCnpjCpf = this.cnpjCpf;
        this.cnpjCpf = cnpjCpf;
        changeSupport.firePropertyChange("cnpjCpf", oldCnpjCpf, cnpjCpf);
    }

    public String getCliLogradouro() {
        return cliLogradouro;
    }

    public void setCliLogradouro(String cliLogradouro) {
        String oldCliLogradouro = this.cliLogradouro;
        this.cliLogradouro = cliLogradouro;
        changeSupport.firePropertyChange("cliLogradouro", oldCliLogradouro, cliLogradouro);
    }

    public String getCliComplemento() {
        return cliComplemento;
    }

    public void setCliComplemento(String cliComplemento) {
        String oldCliComplemento = this.cliComplemento;
        this.cliComplemento = cliComplemento;
        changeSupport.firePropertyChange("cliComplemento", oldCliComplemento, cliComplemento);
    }

    public String getCliBairro() {
        return cliBairro;
    }

    public void setCliBairro(String cliBairro) {
        String oldCliBairro = this.cliBairro;
        this.cliBairro = cliBairro;
        changeSupport.firePropertyChange("cliBairro", oldCliBairro, cliBairro);
    }

    public String getCliCep() {
        return cliCep;
    }

    public void setCliCep(String cliCep) {
        String oldCliCep = this.cliCep;
        this.cliCep = cliCep;
        changeSupport.firePropertyChange("cliCep", oldCliCep, cliCep);
    }

    public String getCliCidade() {
        return cliCidade;
    }

    public void setCliCidade(String cliCidade) {
        String oldCliCidade = this.cliCidade;
        this.cliCidade = cliCidade;
        changeSupport.firePropertyChange("cliCidade", oldCliCidade, cliCidade);
    }

    public String getCliUf() {
        return cliUf;
    }

    public void setCliUf(String cliUf) {
        String oldCliUf = this.cliUf;
        this.cliUf = cliUf;
        changeSupport.firePropertyChange("cliUf", oldCliUf, cliUf);
    }

    public String getCliTrocoPara() {
        return cliTrocoPara;
    }

    public void setCliTrocoPara(String cliTrocoPara) {
        String oldCliTrocoPara = this.cliTrocoPara;
        this.cliTrocoPara = cliTrocoPara;
        changeSupport.firePropertyChange("cliTrocoPara", oldCliTrocoPara, cliTrocoPara);
    }

    public String getZap() {
        return zap;
    }

    public void setZap(String zap) {
        String oldZap = this.zap;
        this.zap = zap;
        changeSupport.firePropertyChange("zap", oldZap, zap);
    }

    public String getNumeroComanda() {
        return numeroComanda;
    }

    public void setNumeroComanda(String numeroComanda) {
        String oldNumeroComanda = this.numeroComanda;
        this.numeroComanda = numeroComanda;
        changeSupport.firePropertyChange("numeroComanda", oldNumeroComanda, numeroComanda);
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        String oldDescProduto = this.descProduto;
        this.descProduto = descProduto;
        changeSupport.firePropertyChange("descProduto", oldDescProduto, descProduto);
    }

   public Collection<MovimentoDet> getMovimentoDetCollection() {
        return movimentoDetCollection;
    }

    public void setMovimentoDetCollection(Collection<MovimentoDet> movimentoDetCollection) {
        this.movimentoDetCollection = movimentoDetCollection;
    }
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovimentoCab != null ? idMovimentoCab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimentoCab)) {
            return false;
        }
        MovimentoCab other = (MovimentoCab) object;
        if ((this.idMovimentoCab == null && other.idMovimentoCab != null) || (this.idMovimentoCab != null && !this.idMovimentoCab.equals(other.idMovimentoCab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.beans.MovimentoCab[ idMovimentoCab=" + idMovimentoCab + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
