/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
import javax.persistence.Transient;

/**
 *
 * @author nil_b
 */
@Entity
@Table(name = "produtos", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p")
    , @NamedQuery(name = "Produtos.findByIdItens", query = "SELECT p FROM Produtos p WHERE p.idItens = :idItens")
    , @NamedQuery(name = "Produtos.findByIdTipoProduto", query = "SELECT p FROM Produtos p WHERE p.idTipoProduto = :idTipoProduto")
    , @NamedQuery(name = "Produtos.findByIdCadTipoUnd", query = "SELECT p FROM Produtos p WHERE p.idCadTipoUnd = :idCadTipoUnd")
    , @NamedQuery(name = "Produtos.findByIdCozinha", query = "SELECT p FROM Produtos p WHERE p.idCozinha = :idCozinha")
    , @NamedQuery(name = "Produtos.findByProduto", query = "SELECT p FROM Produtos p WHERE p.produto = :produto")
    , @NamedQuery(name = "Produtos.findByTipoProduto", query = "SELECT p FROM Produtos p WHERE p.tipoProduto = :tipoProduto")
    , @NamedQuery(name = "Produtos.findByTipoUnd", query = "SELECT p FROM Produtos p WHERE p.tipoUnd = :tipoUnd")
    , @NamedQuery(name = "Produtos.findByQuantUnd", query = "SELECT p FROM Produtos p WHERE p.quantUnd = :quantUnd")
    , @NamedQuery(name = "Produtos.findByValorUnitario", query = "SELECT p FROM Produtos p WHERE p.valorUnitario = :valorUnitario")
    , @NamedQuery(name = "Produtos.findByLucroPercentual", query = "SELECT p FROM Produtos p WHERE p.lucroPercentual = :lucroPercentual")
    , @NamedQuery(name = "Produtos.findByValorLucro", query = "SELECT p FROM Produtos p WHERE p.valorLucro = :valorLucro")
    , @NamedQuery(name = "Produtos.findByValorFinal", query = "SELECT p FROM Produtos p WHERE p.valorFinal = :valorFinal")
    , @NamedQuery(name = "Produtos.findByFoto", query = "SELECT p FROM Produtos p WHERE p.foto = :foto")
    , @NamedQuery(name = "Produtos.findByEstoqueMax", query = "SELECT p FROM Produtos p WHERE p.estoqueMax = :estoqueMax")
    , @NamedQuery(name = "Produtos.findByEstoqueMin", query = "SELECT p FROM Produtos p WHERE p.estoqueMin = :estoqueMin")
    , @NamedQuery(name = "Produtos.findByEstoqueAtual", query = "SELECT p FROM Produtos p WHERE p.estoqueAtual = :estoqueAtual")
    , @NamedQuery(name = "Produtos.findByFlagAtivo", query = "SELECT p FROM Produtos p WHERE p.flagAtivo = :flagAtivo")
    , @NamedQuery(name = "Produtos.findByIdEmpresa", query = "SELECT p FROM Produtos p WHERE p.idEmpresa = :idEmpresa")
    , @NamedQuery(name = "Produtos.findByEmpresa", query = "SELECT p FROM Produtos p WHERE p.empresa = :empresa")
    , @NamedQuery(name = "Produtos.findByIdLoja", query = "SELECT p FROM Produtos p WHERE p.idLoja = :idLoja")
    , @NamedQuery(name = "Produtos.findByLoja", query = "SELECT p FROM Produtos p WHERE p.loja = :loja")
    , @NamedQuery(name = "Produtos.findByImpressora", query = "SELECT p FROM Produtos p WHERE p.impressora = :impressora")
    , @NamedQuery(name = "Produtos.findByFotoGrande", query = "SELECT p FROM Produtos p WHERE p.fotoGrande = :fotoGrande")
  
        
        , @NamedQuery(name = "Produtos.buscaTipoProduto", query = "SELECT p FROM Produtos p WHERE p.tipoProduto = :tipoProduto AND  p.flagAtivo = :flagAtivo")
   
        
        , @NamedQuery(name = "Produtos.findByFotoPequena", query = "SELECT p FROM Produtos p WHERE p.fotoPequena = :fotoPequena")})
public class Produtos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ITENS")
    private Integer idItens;
    
//    @Column(name = "ID_TIPO_PRODUTO")
//    private Integer idTipoProduto;
//    
//    
//    @Column(name = "ID_CAD_TIPO_UND")
//    private Integer idCadTipoUnd;
//    
//    
//    @Column(name = "ID_COZINHA")
//    private Integer idCozinha;
    
    
    @JoinColumn(name = "ID_TIPO_PRODUTO", referencedColumnName = "ID_TIPO_PRODUTO")
    @ManyToOne
    private TipoProduto idTipoProduto;
    
   
     @JoinColumn(name = "ID_COZINHA", referencedColumnName = "ID_COZINHA")
    @ManyToOne
    private Cozinha idCozinha;
     

    
    @JoinColumn(name = "ID_CAD_TIPO_UND", referencedColumnName = "ID_CAD_TIPO_UND")
    @ManyToOne
    private CadTipoUnd idCadTipoUnd;

    
    @Column(name = "PRODUTO")
    private String produto;
    @Column(name = "TIPO_PRODUTO")
    private String tipoProduto;
    @Column(name = "TIPO_UND")
    private String tipoUnd;
    @Column(name = "QUANT_UND")
    private String quantUnd;
    @Lob
    @Column(name = "DESCRI_CAD_PROD")
    private String descriCadProd;
    @Column(name = "VALOR_UNITARIO")
    private String valorUnitario;
    @Column(name = "LUCRO_PERCENTUAL")
    private String lucroPercentual;
    @Column(name = "VALOR_LUCRO")
    private String valorLucro;
    @Column(name = "VALOR_FINAL")
    private String valorFinal;
    @Column(name = "FOTO")
    private String foto;
    @Column(name = "ESTOQUE_MAX")
    private String estoqueMax;
    @Column(name = "ESTOQUE_MIN")
    private String estoqueMin;
    @Column(name = "ESTOQUE_ATUAL")
    private String estoqueAtual;
    @Column(name = "FLAG_ATIVO")
    private String flagAtivo;
    @Column(name = "ID_EMPRESA")
    private String idEmpresa;
    @Column(name = "EMPRESA")
    private String empresa;
    @Column(name = "ID_LOJA")
    private String idLoja;
    @Column(name = "LOJA")
    private String loja;
    @Column(name = "IMPRESSORA")
    private String impressora;
    @Column(name = "FOTO_GRANDE")
    private String fotoGrande;
    @Column(name = "FOTO_PEQUENA")
    private String fotoPequena;

    public Produtos() {
    }

    public Produtos(Integer idItens) {
        this.idItens = idItens;
    }

    public Integer getIdItens() {
        return idItens;
    }

    public void setIdItens(Integer idItens) {
        Integer oldIdItens = this.idItens;
        this.idItens = idItens;
        changeSupport.firePropertyChange("idItens", oldIdItens, idItens);
    }

//    public Integer getIdTipoProduto() {
//        return idTipoProduto;
//    }
//
//    public void setIdTipoProduto(Integer idTipoProduto) {
//        Integer oldIdTipoProduto = this.idTipoProduto;
//        this.idTipoProduto = idTipoProduto;
//        changeSupport.firePropertyChange("idTipoProduto", oldIdTipoProduto, idTipoProduto);
//    }
//
//    public Integer getIdCadTipoUnd() {
//        return idCadTipoUnd;
//    }
//
//    public void setIdCadTipoUnd(Integer idCadTipoUnd) {
//        Integer oldIdCadTipoUnd = this.idCadTipoUnd;
//        this.idCadTipoUnd = idCadTipoUnd;
//        changeSupport.firePropertyChange("idCadTipoUnd", oldIdCadTipoUnd, idCadTipoUnd);
//    }
//
//    public Integer getIdCozinha() {
//        return idCozinha;
//    }
//
//    public void setIdCozinha(Integer idCozinha) {
//        Integer oldIdCozinha = this.idCozinha;
//        this.idCozinha = idCozinha;
//        changeSupport.firePropertyChange("idCozinha", oldIdCozinha, idCozinha);
//    }
    public TipoProduto getIdTipoProduto() {
        return idTipoProduto;
    }

    public void setIdTipoProduto(TipoProduto idTipoProduto) {
        TipoProduto oldIdTipoProduto = this.idTipoProduto;
        this.idTipoProduto = idTipoProduto;
        changeSupport.firePropertyChange("idTipoProduto", oldIdTipoProduto, idTipoProduto);
    }



     public CadTipoUnd getIdCadTipoUnd() {
        return idCadTipoUnd;
    }

    public void setIdCadTipoUnd(CadTipoUnd idCadTipoUnd) {
        CadTipoUnd oldIdCadTipoUnd = this.idCadTipoUnd;
        this.idCadTipoUnd = idCadTipoUnd;
        changeSupport.firePropertyChange("idCadTipoUnd", oldIdCadTipoUnd, idCadTipoUnd);
    }
    
    
    
    
     public Cozinha getIdCozinha() {
        return idCozinha;
    }

    public void setIdCozinha(Cozinha idCozinha) {
        Cozinha oldIdCozinha = this.idCozinha;
        this.idCozinha = idCozinha;
        changeSupport.firePropertyChange("idCozinha", oldIdCozinha, idCozinha);
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

    public String getTipoUnd() {
        return tipoUnd;
    }

    public void setTipoUnd(String tipoUnd) {
        String oldTipoUnd = this.tipoUnd;
        this.tipoUnd = tipoUnd;
        changeSupport.firePropertyChange("tipoUnd", oldTipoUnd, tipoUnd);
    }

    public String getQuantUnd() {
        return quantUnd;
    }

    public void setQuantUnd(String quantUnd) {
        String oldQuantUnd = this.quantUnd;
        this.quantUnd = quantUnd;
        changeSupport.firePropertyChange("quantUnd", oldQuantUnd, quantUnd);
    }

    public String getDescriCadProd() {
        return descriCadProd;
    }

    public void setDescriCadProd(String descriCadProd) {
        String oldDescriCadProd = this.descriCadProd;
        this.descriCadProd = descriCadProd;
        changeSupport.firePropertyChange("descriCadProd", oldDescriCadProd, descriCadProd);
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        String oldValorUnitario = this.valorUnitario;
        this.valorUnitario = valorUnitario;
        changeSupport.firePropertyChange("valorUnitario", oldValorUnitario, valorUnitario);
    }

    public String getLucroPercentual() {
        return lucroPercentual;
    }

    public void setLucroPercentual(String lucroPercentual) {
        String oldLucroPercentual = this.lucroPercentual;
        this.lucroPercentual = lucroPercentual;
        changeSupport.firePropertyChange("lucroPercentual", oldLucroPercentual, lucroPercentual);
    }

    public String getValorLucro() {
        return valorLucro;
    }

    public void setValorLucro(String valorLucro) {
        String oldValorLucro = this.valorLucro;
        this.valorLucro = valorLucro;
        changeSupport.firePropertyChange("valorLucro", oldValorLucro, valorLucro);
    }

    public String getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(String valorFinal) {
        String oldValorFinal = this.valorFinal;
        this.valorFinal = valorFinal;
        changeSupport.firePropertyChange("valorFinal", oldValorFinal, valorFinal);
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        String oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    public String getEstoqueMax() {
        return estoqueMax;
    }

    public void setEstoqueMax(String estoqueMax) {
        String oldEstoqueMax = this.estoqueMax;
        this.estoqueMax = estoqueMax;
        changeSupport.firePropertyChange("estoqueMax", oldEstoqueMax, estoqueMax);
    }

    public String getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(String estoqueMin) {
        String oldEstoqueMin = this.estoqueMin;
        this.estoqueMin = estoqueMin;
        changeSupport.firePropertyChange("estoqueMin", oldEstoqueMin, estoqueMin);
    }

    public String getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(String estoqueAtual) {
        String oldEstoqueAtual = this.estoqueAtual;
        this.estoqueAtual = estoqueAtual;
        changeSupport.firePropertyChange("estoqueAtual", oldEstoqueAtual, estoqueAtual);
    }

    public String getFlagAtivo() {
        return flagAtivo;
    }

    public void setFlagAtivo(String flagAtivo) {
        String oldFlagAtivo = this.flagAtivo;
        this.flagAtivo = flagAtivo;
        changeSupport.firePropertyChange("flagAtivo", oldFlagAtivo, flagAtivo);
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        String oldIdEmpresa = this.idEmpresa;
        this.idEmpresa = idEmpresa;
        changeSupport.firePropertyChange("idEmpresa", oldIdEmpresa, idEmpresa);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        String oldEmpresa = this.empresa;
        this.empresa = empresa;
        changeSupport.firePropertyChange("empresa", oldEmpresa, empresa);
    }

    public String getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(String idLoja) {
        String oldIdLoja = this.idLoja;
        this.idLoja = idLoja;
        changeSupport.firePropertyChange("idLoja", oldIdLoja, idLoja);
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        String oldLoja = this.loja;
        this.loja = loja;
        changeSupport.firePropertyChange("loja", oldLoja, loja);
    }

    public String getImpressora() {
        return impressora;
    }

    public void setImpressora(String impressora) {
        String oldImpressora = this.impressora;
        this.impressora = impressora;
        changeSupport.firePropertyChange("impressora", oldImpressora, impressora);
    }

    public String getFotoGrande() {
        return fotoGrande;
    }

    public void setFotoGrande(String fotoGrande) {
        String oldFotoGrande = this.fotoGrande;
        this.fotoGrande = fotoGrande;
        changeSupport.firePropertyChange("fotoGrande", oldFotoGrande, fotoGrande);
    }

    public String getFotoPequena() {
        return fotoPequena;
    }

    public void setFotoPequena(String fotoPequena) {
        String oldFotoPequena = this.fotoPequena;
        this.fotoPequena = fotoPequena;
        changeSupport.firePropertyChange("fotoPequena", oldFotoPequena, fotoPequena);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idItens != null ? idItens.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.idItens == null && other.idItens != null) || (this.idItens != null && !this.idItens.equals(other.idItens))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.beans.Produtos[ idItens=" + idItens + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
