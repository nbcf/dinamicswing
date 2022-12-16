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
@Table(name = "local_pedido", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "LocalPedido.findAll", query = "SELECT l FROM LocalPedido l")
    , @NamedQuery(name = "LocalPedido.findByIdLocalPedido", query = "SELECT l FROM LocalPedido l WHERE l.idLocalPedido = :idLocalPedido")
    , @NamedQuery(name = "LocalPedido.findByTipoLocal", query = "SELECT l FROM LocalPedido l WHERE l.tipoLocal = :tipoLocal")
    , @NamedQuery(name = "LocalPedido.findByLocal", query = "SELECT l FROM LocalPedido l WHERE l.local = :local")
    , @NamedQuery(name = "LocalPedido.findByNome", query = "SELECT l FROM LocalPedido l WHERE l.nome = :nome")
    , @NamedQuery(name = "LocalPedido.findByNumero", query = "SELECT l FROM LocalPedido l WHERE l.numero = :numero")
    , @NamedQuery(name = "LocalPedido.findByFlagReserva", query = "SELECT l FROM LocalPedido l WHERE l.flagReserva = :flagReserva")
    , @NamedQuery(name = "LocalPedido.findByDataReserva", query = "SELECT l FROM LocalPedido l WHERE l.dataReserva = :dataReserva")
    , @NamedQuery(name = "LocalPedido.findByHoraReserva", query = "SELECT l FROM LocalPedido l WHERE l.horaReserva = :horaReserva")
    , @NamedQuery(name = "LocalPedido.findByStatusReserva", query = "SELECT l FROM LocalPedido l WHERE l.statusReserva = :statusReserva")
    , @NamedQuery(name = "LocalPedido.findByFlagUso", query = "SELECT l FROM LocalPedido l WHERE l.flagUso = :flagUso")
    , @NamedQuery(name = "LocalPedido.findByIdEmpresa", query = "SELECT l FROM LocalPedido l WHERE l.idEmpresa = :idEmpresa")
    , @NamedQuery(name = "LocalPedido.findByEmpresa", query = "SELECT l FROM LocalPedido l WHERE l.empresa = :empresa")
    , @NamedQuery(name = "LocalPedido.findByIdLoja", query = "SELECT l FROM LocalPedido l WHERE l.idLoja = :idLoja")
    , @NamedQuery(name = "LocalPedido.findByLoja", query = "SELECT l FROM LocalPedido l WHERE l.loja = :loja")})
public class LocalPedido implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_LOCAL_PEDIDO")
    private Integer idLocalPedido;
    @Column(name = "TIPO_LOCAL")
    private String tipoLocal;
    @Column(name = "LOCAL")
    private String local;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "FLAG_RESERVA")
    private String flagReserva;
    @Column(name = "DATA_RESERVA")
    @Temporal(TemporalType.DATE)
    private Date dataReserva;
    @Column(name = "HORA_RESERVA")
    private String horaReserva;
    @Column(name = "STATUS_RESERVA")
    private String statusReserva;
    @Column(name = "FLAG_USO")
    private String flagUso;
    @Column(name = "ID_EMPRESA")
    private String idEmpresa;
    @Column(name = "EMPRESA")
    private String empresa;
    @Column(name = "ID_LOJA")
    private String idLoja;
    @Column(name = "LOJA")
    private String loja;

    public LocalPedido() {
    }

    public LocalPedido(Integer idLocalPedido) {
        this.idLocalPedido = idLocalPedido;
    }

    public Integer getIdLocalPedido() {
        return idLocalPedido;
    }

    public void setIdLocalPedido(Integer idLocalPedido) {
        Integer oldIdLocalPedido = this.idLocalPedido;
        this.idLocalPedido = idLocalPedido;
        changeSupport.firePropertyChange("idLocalPedido", oldIdLocalPedido, idLocalPedido);
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getFlagReserva() {
        return flagReserva;
    }

    public void setFlagReserva(String flagReserva) {
        String oldFlagReserva = this.flagReserva;
        this.flagReserva = flagReserva;
        changeSupport.firePropertyChange("flagReserva", oldFlagReserva, flagReserva);
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        Date oldDataReserva = this.dataReserva;
        this.dataReserva = dataReserva;
        changeSupport.firePropertyChange("dataReserva", oldDataReserva, dataReserva);
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        String oldHoraReserva = this.horaReserva;
        this.horaReserva = horaReserva;
        changeSupport.firePropertyChange("horaReserva", oldHoraReserva, horaReserva);
    }

    public String getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(String statusReserva) {
        String oldStatusReserva = this.statusReserva;
        this.statusReserva = statusReserva;
        changeSupport.firePropertyChange("statusReserva", oldStatusReserva, statusReserva);
    }

    public String getFlagUso() {
        return flagUso;
    }

    public void setFlagUso(String flagUso) {
        String oldFlagUso = this.flagUso;
        this.flagUso = flagUso;
        changeSupport.firePropertyChange("flagUso", oldFlagUso, flagUso);
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
        hash += (idLocalPedido != null ? idLocalPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocalPedido)) {
            return false;
        }
        LocalPedido other = (LocalPedido) object;
        if ((this.idLocalPedido == null && other.idLocalPedido != null) || (this.idLocalPedido != null && !this.idLocalPedido.equals(other.idLocalPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.beans.LocalPedido[ idLocalPedido=" + idLocalPedido + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
