/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.frame.edits.jinternal;

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
@Table(name = "cad_cozinha", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadCozinha.findAll", query = "SELECT c FROM CadCozinha c")
    , @NamedQuery(name = "CadCozinha.findByIdCadCozinha", query = "SELECT c FROM CadCozinha c WHERE c.idCadCozinha = :idCadCozinha")
    , @NamedQuery(name = "CadCozinha.findByNomeCozinha", query = "SELECT c FROM CadCozinha c WHERE c.nomeCozinha = :nomeCozinha")
    , @NamedQuery(name = "CadCozinha.findByImpressora", query = "SELECT c FROM CadCozinha c WHERE c.impressora = :impressora")})
public class CadCozinha implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CAD_COZINHA")
    private Integer idCadCozinha;
    @Column(name = "NOME_COZINHA")
    private String nomeCozinha;
    @Column(name = "IMPRESSORA")
    private String impressora;

    public CadCozinha() {
    }

    public CadCozinha(Integer idCadCozinha) {
        this.idCadCozinha = idCadCozinha;
    }

    public Integer getIdCadCozinha() {
        return idCadCozinha;
    }

    public void setIdCadCozinha(Integer idCadCozinha) {
        Integer oldIdCadCozinha = this.idCadCozinha;
        this.idCadCozinha = idCadCozinha;
        changeSupport.firePropertyChange("idCadCozinha", oldIdCadCozinha, idCadCozinha);
    }

    public String getNomeCozinha() {
        return nomeCozinha;
    }

    public void setNomeCozinha(String nomeCozinha) {
        String oldNomeCozinha = this.nomeCozinha;
        this.nomeCozinha = nomeCozinha;
        changeSupport.firePropertyChange("nomeCozinha", oldNomeCozinha, nomeCozinha);
    }

    public String getImpressora() {
        return impressora;
    }

    public void setImpressora(String impressora) {
        String oldImpressora = this.impressora;
        this.impressora = impressora;
        changeSupport.firePropertyChange("impressora", oldImpressora, impressora);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCadCozinha != null ? idCadCozinha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadCozinha)) {
            return false;
        }
        CadCozinha other = (CadCozinha) object;
        if ((this.idCadCozinha == null && other.idCadCozinha != null) || (this.idCadCozinha != null && !this.idCadCozinha.equals(other.idCadCozinha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.edits.jInternalsFrames.CadCozinha[ idCadCozinha=" + idCadCozinha + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
