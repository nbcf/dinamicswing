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
@Table(name = "comandas", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "Comandas.findAll", query = "SELECT c FROM Comandas c")
    , @NamedQuery(name = "Comandas.findByIdComanda", query = "SELECT c FROM Comandas c WHERE c.idComanda = :idComanda")
    , @NamedQuery(name = "Comandas.findByNumero", query = "SELECT c FROM Comandas c WHERE c.numero = :numero")
    , @NamedQuery(name = "Comandas.findByCb", query = "SELECT c FROM Comandas c WHERE c.cb = :cb")
    , @NamedQuery(name = "Comandas.findByQrcode", query = "SELECT c FROM Comandas c WHERE c.qrcode = :qrcode")
    , @NamedQuery(name = "Comandas.findByIdLoja", query = "SELECT c FROM Comandas c WHERE c.idLoja = :idLoja")
    , @NamedQuery(name = "Comandas.findByIdEmpresa", query = "SELECT c FROM Comandas c WHERE c.idEmpresa = :idEmpresa")
    , @NamedQuery(name = "Comandas.findByFlagComanda", query = "SELECT c FROM Comandas c WHERE c.flagComanda = :flagComanda")
        
        
            , @NamedQuery(name = "Comandas.testaDisponibilidade", query = "SELECT c FROM Comandas c WHERE c.numero = :numero AND c.flagComanda = :flagComanda")
        
    , @NamedQuery(name = "Comandas.findByGrupo", query = "SELECT c FROM Comandas c WHERE c.grupo = :grupo")})
public class Comandas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_COMANDA")
    private Integer idComanda;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "CB")
    private String cb;
    @Column(name = "QRCODE")
    private String qrcode;
    @Column(name = "ID_LOJA")
    private String idLoja;
    @Column(name = "ID_EMPRESA")
    private String idEmpresa;
    @Column(name = "FLAG_COMANDA")
    private String flagComanda;
    @Column(name = "GRUPO")
    private String grupo;

    public Comandas() {
    }

    public Comandas(Integer idComanda) {
        this.idComanda = idComanda;
    }

    public Integer getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(Integer idComanda) {
        Integer oldIdComanda = this.idComanda;
        this.idComanda = idComanda;
        changeSupport.firePropertyChange("idComanda", oldIdComanda, idComanda);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getCb() {
        return cb;
    }

    public void setCb(String cb) {
        String oldCb = this.cb;
        this.cb = cb;
        changeSupport.firePropertyChange("cb", oldCb, cb);
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        String oldQrcode = this.qrcode;
        this.qrcode = qrcode;
        changeSupport.firePropertyChange("qrcode", oldQrcode, qrcode);
    }

    public String getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(String idLoja) {
        String oldIdLoja = this.idLoja;
        this.idLoja = idLoja;
        changeSupport.firePropertyChange("idLoja", oldIdLoja, idLoja);
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        String oldIdEmpresa = this.idEmpresa;
        this.idEmpresa = idEmpresa;
        changeSupport.firePropertyChange("idEmpresa", oldIdEmpresa, idEmpresa);
    }

    public String getFlagComanda() {
        return flagComanda;
    }

    public void setFlagComanda(String flagComanda) {
        String oldFlagComanda = this.flagComanda;
        this.flagComanda = flagComanda;
        changeSupport.firePropertyChange("flagComanda", oldFlagComanda, flagComanda);
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        String oldGrupo = this.grupo;
        this.grupo = grupo;
        changeSupport.firePropertyChange("grupo", oldGrupo, grupo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComanda != null ? idComanda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comandas)) {
            return false;
        }
        Comandas other = (Comandas) object;
        if ((this.idComanda == null && other.idComanda != null) || (this.idComanda != null && !this.idComanda.equals(other.idComanda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.beans.Comandas[ idComanda=" + idComanda + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
