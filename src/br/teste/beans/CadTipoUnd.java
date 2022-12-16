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
@Table(name = "cad_tipo_und", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadTipoUnd.findAll", query = "SELECT c FROM CadTipoUnd c")
    , @NamedQuery(name = "CadTipoUnd.findByIdCadTipoUnd", query = "SELECT c FROM CadTipoUnd c WHERE c.idCadTipoUnd = :idCadTipoUnd")
    , @NamedQuery(name = "CadTipoUnd.findByTipoUnd", query = "SELECT c FROM CadTipoUnd c WHERE c.tipoUnd = :tipoUnd")})
public class CadTipoUnd implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CAD_TIPO_UND")
    private Integer idCadTipoUnd;
    @Column(name = "TIPO_UND")
    private String tipoUnd;

    public CadTipoUnd() {
    }

    public CadTipoUnd(Integer idCadTipoUnd) {
        this.idCadTipoUnd = idCadTipoUnd;
    }

    public Integer getIdCadTipoUnd() {
        return idCadTipoUnd;
    }

    public void setIdCadTipoUnd(Integer idCadTipoUnd) {
        Integer oldIdCadTipoUnd = this.idCadTipoUnd;
        this.idCadTipoUnd = idCadTipoUnd;
        changeSupport.firePropertyChange("idCadTipoUnd", oldIdCadTipoUnd, idCadTipoUnd);
    }

    public String getTipoUnd() {
        return tipoUnd;
    }

    public void setTipoUnd(String tipoUnd) {
        String oldTipoUnd = this.tipoUnd;
        this.tipoUnd = tipoUnd;
        changeSupport.firePropertyChange("tipoUnd", oldTipoUnd, tipoUnd);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCadTipoUnd != null ? idCadTipoUnd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadTipoUnd)) {
            return false;
        }
        CadTipoUnd other = (CadTipoUnd) object;
        if ((this.idCadTipoUnd == null && other.idCadTipoUnd != null) || (this.idCadTipoUnd != null && !this.idCadTipoUnd.equals(other.idCadTipoUnd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.beans.CadTipoUnd[ idCadTipoUnd=" + idCadTipoUnd + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
