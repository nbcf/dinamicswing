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
@Table(name = "clientes", catalog = "restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c")
    , @NamedQuery(name = "Clientes.findByIdClientes", query = "SELECT c FROM Clientes c WHERE c.idClientes = :idClientes")
    , @NamedQuery(name = "Clientes.findByNomeCliente", query = "SELECT c FROM Clientes c WHERE c.nomeCliente = :nomeCliente")
    , @NamedQuery(name = "Clientes.findByTipoPessoa", query = "SELECT c FROM Clientes c WHERE c.tipoPessoa = :tipoPessoa")
    , @NamedQuery(name = "Clientes.findByGenero", query = "SELECT c FROM Clientes c WHERE c.genero = :genero")
    , @NamedQuery(name = "Clientes.findByCpfCnpj", query = "SELECT c FROM Clientes c WHERE c.cpfCnpj = :cpfCnpj")
    , @NamedQuery(name = "Clientes.findByUsuario", query = "SELECT c FROM Clientes c WHERE c.usuario = :usuario")
    , @NamedQuery(name = "Clientes.findBySenha", query = "SELECT c FROM Clientes c WHERE c.senha = :senha")
    , @NamedQuery(name = "Clientes.findByNivelAcesso", query = "SELECT c FROM Clientes c WHERE c.nivelAcesso = :nivelAcesso")
    , @NamedQuery(name = "Clientes.findByDirJpg", query = "SELECT c FROM Clientes c WHERE c.dirJpg = :dirJpg")
    , @NamedQuery(name = "Clientes.findByTel", query = "SELECT c FROM Clientes c WHERE c.tel = :tel")
    , @NamedQuery(name = "Clientes.findByPessoaRzsFisico", query = "SELECT c FROM Clientes c WHERE c.pessoaRzsFisico = :pessoaRzsFisico")
    , @NamedQuery(name = "Clientes.findByCel", query = "SELECT c FROM Clientes c WHERE c.cel = :cel")
    , @NamedQuery(name = "Clientes.findByEmail", query = "SELECT c FROM Clientes c WHERE c.email = :email")
    , @NamedQuery(name = "Clientes.findByZap", query = "SELECT c FROM Clientes c WHERE c.zap = :zap")
    , @NamedQuery(name = "Clientes.findByFlagFuncionario", query = "SELECT c FROM Clientes c WHERE c.flagFuncionario = :flagFuncionario")
    , @NamedQuery(name = "Clientes.findByFlagCaixa", query = "SELECT c FROM Clientes c WHERE c.flagCaixa = :flagCaixa")
    , @NamedQuery(name = "Clientes.findByFlagGarcon", query = "SELECT c FROM Clientes c WHERE c.flagGarcon = :flagGarcon")
    , @NamedQuery(name = "Clientes.findByFlagCozinheira", query = "SELECT c FROM Clientes c WHERE c.flagCozinheira = :flagCozinheira")
    , @NamedQuery(name = "Clientes.findByFlagEntrega", query = "SELECT c FROM Clientes c WHERE c.flagEntrega = :flagEntrega")
    , @NamedQuery(name = "Clientes.findByLogradouro", query = "SELECT c FROM Clientes c WHERE c.logradouro = :logradouro")
    , @NamedQuery(name = "Clientes.findByComplemento", query = "SELECT c FROM Clientes c WHERE c.complemento = :complemento")
    , @NamedQuery(name = "Clientes.findByBairro", query = "SELECT c FROM Clientes c WHERE c.bairro = :bairro")
    , @NamedQuery(name = "Clientes.findByCidade", query = "SELECT c FROM Clientes c WHERE c.cidade = :cidade")
    , @NamedQuery(name = "Clientes.findByCep", query = "SELECT c FROM Clientes c WHERE c.cep = :cep")
    , @NamedQuery(name = "Clientes.findByUf", query = "SELECT c FROM Clientes c WHERE c.uf = :uf")
    , @NamedQuery(name = "Clientes.findByObsCliente", query = "SELECT c FROM Clientes c WHERE c.obsCliente = :obsCliente")})
public class Clientes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CLIENTES")
    private Integer idClientes;
    @Column(name = "NOME_CLIENTE")
    private String nomeCliente;
    @Column(name = "TIPO_PESSOA")
    private String tipoPessoa;
    @Column(name = "GENERO")
    private String genero;
    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "SENHA")
    private String senha;
    @Column(name = "NIVEL_ACESSO")
    private String nivelAcesso;
    @Column(name = "DIR_JPG")
    private String dirJpg;
    @Column(name = "TEL")
    private String tel;
    @Column(name = "PESSOA_RZS_FISICO")
    private String pessoaRzsFisico;
    @Column(name = "CEL")
    private String cel;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "ZAP")
    private String zap;
    @Column(name = "FLAG_FUNCIONARIO")
    private String flagFuncionario;
    @Column(name = "FLAG_CAIXA")
    private String flagCaixa;
    @Column(name = "FLAG_GARCON")
    private String flagGarcon;
    @Column(name = "FLAG_COZINHEIRA")
    private String flagCozinheira;
    @Column(name = "FLAG_ENTREGA")
    private String flagEntrega;
    @Column(name = "LOGRADOURO")
    private String logradouro;
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "UF")
    private String uf;
    @Column(name = "OBS_CLIENTE")
    private String obsCliente;

    public Clientes() {
    }

    public Clientes(Integer idClientes) {
        this.idClientes = idClientes;
    }

    public Integer getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(Integer idClientes) {
        Integer oldIdClientes = this.idClientes;
        this.idClientes = idClientes;
        changeSupport.firePropertyChange("idClientes", oldIdClientes, idClientes);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        String oldNomeCliente = this.nomeCliente;
        this.nomeCliente = nomeCliente;
        changeSupport.firePropertyChange("nomeCliente", oldNomeCliente, nomeCliente);
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

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        String oldCpfCnpj = this.cpfCnpj;
        this.cpfCnpj = cpfCnpj;
        changeSupport.firePropertyChange("cpfCnpj", oldCpfCnpj, cpfCnpj);
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

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        String oldNivelAcesso = this.nivelAcesso;
        this.nivelAcesso = nivelAcesso;
        changeSupport.firePropertyChange("nivelAcesso", oldNivelAcesso, nivelAcesso);
    }

    public String getDirJpg() {
        return dirJpg;
    }

    public void setDirJpg(String dirJpg) {
        String oldDirJpg = this.dirJpg;
        this.dirJpg = dirJpg;
        changeSupport.firePropertyChange("dirJpg", oldDirJpg, dirJpg);
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        String oldTel = this.tel;
        this.tel = tel;
        changeSupport.firePropertyChange("tel", oldTel, tel);
    }

    public String getPessoaRzsFisico() {
        return pessoaRzsFisico;
    }

    public void setPessoaRzsFisico(String pessoaRzsFisico) {
        String oldPessoaRzsFisico = this.pessoaRzsFisico;
        this.pessoaRzsFisico = pessoaRzsFisico;
        changeSupport.firePropertyChange("pessoaRzsFisico", oldPessoaRzsFisico, pessoaRzsFisico);
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        String oldCel = this.cel;
        this.cel = cel;
        changeSupport.firePropertyChange("cel", oldCel, cel);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getZap() {
        return zap;
    }

    public void setZap(String zap) {
        String oldZap = this.zap;
        this.zap = zap;
        changeSupport.firePropertyChange("zap", oldZap, zap);
    }

    public String getFlagFuncionario() {
        return flagFuncionario;
    }

    public void setFlagFuncionario(String flagFuncionario) {
        String oldFlagFuncionario = this.flagFuncionario;
        this.flagFuncionario = flagFuncionario;
        changeSupport.firePropertyChange("flagFuncionario", oldFlagFuncionario, flagFuncionario);
    }

    public String getFlagCaixa() {
        return flagCaixa;
    }

    public void setFlagCaixa(String flagCaixa) {
        String oldFlagCaixa = this.flagCaixa;
        this.flagCaixa = flagCaixa;
        changeSupport.firePropertyChange("flagCaixa", oldFlagCaixa, flagCaixa);
    }

    public String getFlagGarcon() {
        return flagGarcon;
    }

    public void setFlagGarcon(String flagGarcon) {
        String oldFlagGarcon = this.flagGarcon;
        this.flagGarcon = flagGarcon;
        changeSupport.firePropertyChange("flagGarcon", oldFlagGarcon, flagGarcon);
    }

    public String getFlagCozinheira() {
        return flagCozinheira;
    }

    public void setFlagCozinheira(String flagCozinheira) {
        String oldFlagCozinheira = this.flagCozinheira;
        this.flagCozinheira = flagCozinheira;
        changeSupport.firePropertyChange("flagCozinheira", oldFlagCozinheira, flagCozinheira);
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String oldUf = this.uf;
        this.uf = uf;
        changeSupport.firePropertyChange("uf", oldUf, uf);
    }

    public String getObsCliente() {
        return obsCliente;
    }

    public void setObsCliente(String obsCliente) {
        String oldObsCliente = this.obsCliente;
        this.obsCliente = obsCliente;
        changeSupport.firePropertyChange("obsCliente", oldObsCliente, obsCliente);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClientes != null ? idClientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idClientes == null && other.idClientes != null) || (this.idClientes != null && !this.idClientes.equals(other.idClientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.teste.beans.Clientes[ idClientes=" + idClientes + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
