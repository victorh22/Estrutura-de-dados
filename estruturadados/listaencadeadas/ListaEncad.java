package com.estruturadados.listaencadeadas;

public class ListaEncad<T> {
    
    No<T> refEntrada;

    public ListaEncad() {
        refEntrada = null;
    }
    
    public void add(T conteudo){
        No novoNo = new No(conteudo);
        if(isEmpty()){
            refEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = refEntrada;
        for (int i = 0; i < this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }
    
    public T get(int index){
        return getNo(index).getConteudo();
    }
    
    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = refEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }
    
    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            refEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index-1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        
        return noPivor.getConteudo();
    }
    
    private void validaIndice(int index){
        int ultimoIndice = size()-1;
        if(index >= size()){
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista"+ "esta lista só vai até índice " + ultimoIndice + ".");
        }
    }
    
    
    public boolean isEmpty(){
        return refEntrada == null;
    }
    
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = refEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{break;}
            }else{break;}
        }
        
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String s = ""; 
        No<T> noAuxiliar = refEntrada;
        for (int i = 0; i < this.size(); i++) {
            s += "No[" + "conteudo=" + noAuxiliar.getConteudo() + "]-->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        s += "null";
        return s;
    }
    
    
    
}
