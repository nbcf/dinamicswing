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
@Table(name = "tipo_produto", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "TipoProduto.findAll", query = "SELECT t FROM TipoProduto t")
    , @NamedQuery(name = "TipoProduto.findByIdTipoProduto", query = "SELECT t FROM TipoProduto t WHERE t.idTipoProduto = :idTipoProduto")
    , @NamedQuery(name = "TipoProduto.findByNomeTipo", query = "SELECT t FROM TipoProduto t WHERE t.nomeTipo = :nomeTipo")})
public class TipoProduto implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TIPO_PRODUTO")
    private Integer idTipoProduto;
    @Column(name = "NOME_TIPO")
    private String nomeTipo;

    public TipoProduto() {
    }

    public TipoProduto(Integer idTipoProduto) {
        this.idTipoProduto = idTipoProduto;
    }

    public Integer getIdTipoProduto() {
        return idTipoProduto;
    }

    public void setIdTipoProduto(Integer idTipoProduto) {
        Integer oldIdTipoProduto = this.idTipoProduto;
        this.idTipoProduto = idTipoProduto;
        changeSupport.firePropertyChange("idTipoProduto", oldIdTipoProduto, idTipoProduto);
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        String oldNomeTipo = this.nomeTipo;
        this.nomeTipo = nomeTipo;
        changeSupport.firePropertyChange("nomeTipo", oldNomeTipo, nomeTipo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoProduto != null ? idTipoProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoProduto)) {
            return false;
        }
        TipoProduto other = (TipoProduto) object;
        if ((this.idTipoProduto == null && other.idTipoProduto != null) || (this.idTipoProduto != null && !this.idTipoProduto.equals(other.idTipoProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.beans.TipoProduto[ idTipoProduto=" + idTipoProduto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
