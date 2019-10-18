/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;

/**
 *
 * @author jhona
 */
public class FornecedorDao {
    public Fornecedor inserir(Fornecedor f){
        
        return f;
    }
    
    public boolean excluir(Fornecedor f){
        
        return false;
    }
    
    public Fornecedor alterar(Fornecedor f){
        
        return f;
    }
    
    public List<Fornecedor> selecionarPeloNome(String n){
        List<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
        
        return listaFornecedores;
    }
}
