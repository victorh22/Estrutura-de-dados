package com.estruturadados.listaencadeadas;

public class No<T> {
    private T conteudo;
    private No proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    /**
     * @return the conteudo
     */
    public T getConteudo() {
        return conteudo;
    }

    /**
     * @param conteudo the conteudo to set
     */
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * @return the proximoNo
     */
    public No getProximoNo() {
        return proximoNo;
    }

    /**
     * @param proximoNo the proximoNo to set
     */
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
       
        
        return "No" + 
                "[conteudo=" + conteudo + 
                "]";
    }
    
    public String toStringEncadeado() {
        String str = "No" + 
                "[conteudo=" + conteudo + 
                "]";
        if(proximoNo !=null){
            str += "->" + proximoNo.toString();
        }else{
            str+= "->null";
        }
        
        return str;
    }    
}
