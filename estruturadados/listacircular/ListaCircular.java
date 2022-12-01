package com.estruturadados.listacircular;

public class ListaCircular <T> {
    
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }
    
    
    
    public int size(){
        return this.tamanhoLista;
    }
    
    public boolean isEmpty(){
        
        /*if(tamanhoLista==0){
            return true;
        }else{
            return false;
        }*/
        return this.tamanhoLista == 0 ? true: false;
        
    }
    
    private No<T> getNo(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("a lista esta vazia");
        if(index == 0){
            return this.cauda;
        }
        No <T> noAuxiliar = this.cauda;
        for (int i = 0; (i<index) && (noAuxiliar!= null); i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }
    
    public T get(int index){
        return this.getNo(index).getConteudo();
    }
    
    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("indice maior que o tamanho da lista");
            No<T> noAuxiliar = this.cauda;
            if(index == 0){
                this.cauda = this.cauda.getProximoNo();
                this.cabeca.setProximoNo(this.cauda);
            }else if(index == 1){
                this.cauda.setProximoNo(this.cauda.getProximoNo());
            }else{
                for (int i = 0; i < index-1; i++) {
                    noAuxiliar.getProximoNo();
                }
                noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
            }
        this.tamanhoLista--;
    }
    
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProximoNo(this.cauda);
        }else{
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda = novoNo;
            
        }
        this.tamanhoLista++;
    }

    @Override
    public String toString() {
        String s = "";
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++) {
            s += "{No[conteudo=" + noAuxiliar.getConteudo() + "]}-->";
           noAuxiliar = noAuxiliar.getProximoNo();
        }
        s += this.size() != 0 ? "(retorna ao inicio)" : "[]";
        

        return s;
    }

    
    
}