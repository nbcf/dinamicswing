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
@Table(name = "funcoes", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "Funcoes.findAll", query = "SELECT f FROM Funcoes f")
    , @NamedQuery(name = "Funcoes.findByIdFuncoes", query = "SELECT f FROM Funcoes f WHERE f.idFuncoes = :idFuncoes")
    , @NamedQuery(name = "Funcoes.findByNomeFuncao", query = "SELECT f FROM Funcoes f WHERE f.nomeFuncao = :nomeFuncao")
    , @NamedQuery(name = "Funcoes.findByNivelAcesso", query = "SELECT f FROM Funcoes f WHERE f.nivelAcesso = :nivelAcesso")})
public class Funcoes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_FUNCOES")
    private Integer idFuncoes;
    @Column(name = "NOME_FUNCAO")
    private String nomeFuncao;
    @Column(name = "NIVEL_ACESSO")
    private String nivelAcesso;

    public Funcoes() {
    }

    public Funcoes(Integer idFuncoes) {
        this.idFuncoes = idFuncoes;
    }

    public Integer getIdFuncoes() {
        return idFuncoes;
    }

    public void setIdFuncoes(Integer idFuncoes) {
        Integer oldIdFuncoes = this.idFuncoes;
        this.idFuncoes = idFuncoes;
        changeSupport.firePropertyChange("idFuncoes", oldIdFuncoes, idFuncoes);
    }

    public String getNomeFuncao() {
        return nomeFuncao;
    }

    public void setNomeFuncao(String nomeFuncao) {
        String oldNomeFuncao = this.nomeFuncao;
        this.nomeFuncao = nomeFuncao;
        changeSupport.firePropertyChange("nomeFuncao", oldNomeFuncao, nomeFuncao);
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        String oldNivelAcesso = this.nivelAcesso;
        this.nivelAcesso = nivelAcesso;
        changeSupport.firePropertyChange("nivelAcesso", oldNivelAcesso, nivelAcesso);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFuncoes != null ? idFuncoes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcoes)) {
            return false;
        }
        Funcoes other = (Funcoes) object;
        if ((this.idFuncoes == null && other.idFuncoes != null) || (this.idFuncoes != null && !this.idFuncoes.equals(other.idFuncoes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.beans.Funcoes[ idFuncoes=" + idFuncoes + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
