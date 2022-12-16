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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author nil_b
 */
@Entity
@Table(name = "cozinha", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cozinha.findAll", query = "SELECT c FROM Cozinha c")
    , @NamedQuery(name = "Cozinha.findByIdCozinha", query = "SELECT c FROM Cozinha c WHERE c.idCozinha = :idCozinha")
    , @NamedQuery(name = "Cozinha.findByNome", query = "SELECT c FROM Cozinha c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cozinha.findByImpressora", query = "SELECT c FROM Cozinha c WHERE c.impressora = :impressora")
    , @NamedQuery(name = "Cozinha.findByCodImpressora", query = "SELECT c FROM Cozinha c WHERE c.codImpressora = :codImpressora")
    , @NamedQuery(name = "Cozinha.findByIdEmpresa", query = "SELECT c FROM Cozinha c WHERE c.idEmpresa = :idEmpresa")
    , @NamedQuery(name = "Cozinha.findByEmpresa", query = "SELECT c FROM Cozinha c WHERE c.empresa = :empresa")
    , @NamedQuery(name = "Cozinha.findByIdLoja", query = "SELECT c FROM Cozinha c WHERE c.idLoja = :idLoja")
    , @NamedQuery(name = "Cozinha.findByLoja", query = "SELECT c FROM Cozinha c WHERE c.loja = :loja")})
public class Cozinha implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_COZINHA")
    private Integer idCozinha;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "IMPRESSORA")
    private String impressora;
    @Column(name = "COD_IMPRESSORA")
    private String codImpressora;
    @Column(name = "ID_EMPRESA")
    private String idEmpresa;
    @Column(name = "EMPRESA")
    private String empresa;
    @Column(name = "ID_LOJA")
    private String idLoja;
    @Column(name = "LOJA")
    private String loja;

    public Cozinha() {
    }

    public Cozinha(Integer idCozinha) {
        this.idCozinha = idCozinha;
    }

    public Integer getIdCozinha() {
        return idCozinha;
    }

    public void setIdCozinha(Integer idCozinha) {
        Integer oldIdCozinha = this.idCozinha;
        this.idCozinha = idCozinha;
        changeSupport.firePropertyChange("idCozinha", oldIdCozinha, idCozinha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getImpressora() {
        return impressora;
    }

    public void setImpressora(String impressora) {
        String oldImpressora = this.impressora;
        this.impressora = impressora;
        changeSupport.firePropertyChange("impressora", oldImpressora, impressora);
    }

    public String getCodImpressora() {
        return codImpressora;
    }

    public void setCodImpressora(String codImpressora) {
        String oldCodImpressora = this.codImpressora;
        this.codImpressora = codImpressora;
        changeSupport.firePropertyChange("codImpressora", oldCodImpressora, codImpressora);
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCozinha != null ? idCozinha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cozinha)) {
            return false;
        }
        Cozinha other = (Cozinha) object;
        if ((this.idCozinha == null && other.idCozinha != null) || (this.idCozinha != null && !this.idCozinha.equals(other.idCozinha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.beans.Cozinha[ idCozinha=" + idCozinha + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
