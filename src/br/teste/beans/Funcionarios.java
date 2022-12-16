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
@Table(name = "funcionarios", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "Funcionarios.findAll", query = "SELECT f FROM Funcionarios f")
    , @NamedQuery(name = "Funcionarios.findByIdFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.idFuncionario = :idFuncionario")
    , @NamedQuery(name = "Funcionarios.findByNome", query = "SELECT f FROM Funcionarios f WHERE f.nome = :nome")
    , @NamedQuery(name = "Funcionarios.findByFuncao", query = "SELECT f FROM Funcionarios f WHERE f.funcao = :funcao")
    , @NamedQuery(name = "Funcionarios.findByNivelAcesso", query = "SELECT f FROM Funcionarios f WHERE f.nivelAcesso = :nivelAcesso")
    , @NamedQuery(name = "Funcionarios.findByUsuario", query = "SELECT f FROM Funcionarios f WHERE f.usuario = :usuario")
    , @NamedQuery(name = "Funcionarios.findBySenha", query = "SELECT f FROM Funcionarios f WHERE f.senha = :senha")
    , @NamedQuery(name = "Funcionarios.findByFoto", query = "SELECT f FROM Funcionarios f WHERE f.foto = :foto")
    , @NamedQuery(name = "Funcionarios.findByIdEmpresa", query = "SELECT f FROM Funcionarios f WHERE f.idEmpresa = :idEmpresa")
    , @NamedQuery(name = "Funcionarios.findByIdLoja", query = "SELECT f FROM Funcionarios f WHERE f.idLoja = :idLoja")})
public class Funcionarios implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_FUNCIONARIO")
    private Integer idFuncionario;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "FUNCAO")
    private String funcao;
    @Column(name = "NIVEL_ACESSO")
    private String nivelAcesso;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "SENHA")
    private String senha;
    @Column(name = "FOTO")
    private String foto;
    @Column(name = "ID_EMPRESA")
    private String idEmpresa;
    @Column(name = "ID_LOJA")
    private String idLoja;

    public Funcionarios() {
    }

    public Funcionarios(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        Integer oldIdFuncionario = this.idFuncionario;
        this.idFuncionario = idFuncionario;
        changeSupport.firePropertyChange("idFuncionario", oldIdFuncionario, idFuncionario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        String oldFuncao = this.funcao;
        this.funcao = funcao;
        changeSupport.firePropertyChange("funcao", oldFuncao, funcao);
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        String oldNivelAcesso = this.nivelAcesso;
        this.nivelAcesso = nivelAcesso;
        changeSupport.firePropertyChange("nivelAcesso", oldNivelAcesso, nivelAcesso);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        String oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        String oldIdEmpresa = this.idEmpresa;
        this.idEmpresa = idEmpresa;
        changeSupport.firePropertyChange("idEmpresa", oldIdEmpresa, idEmpresa);
    }

    public String getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(String idLoja) {
        String oldIdLoja = this.idLoja;
        this.idLoja = idLoja;
        changeSupport.firePropertyChange("idLoja", oldIdLoja, idLoja);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFuncionario != null ? idFuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionarios)) {
            return false;
        }
        Funcionarios other = (Funcionarios) object;
        if ((this.idFuncionario == null && other.idFuncionario != null) || (this.idFuncionario != null && !this.idFuncionario.equals(other.idFuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.beans.Funcionarios[ idFuncionario=" + idFuncionario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
