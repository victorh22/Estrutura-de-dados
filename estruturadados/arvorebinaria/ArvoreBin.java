package com.estruturadados.arvorebinaria;

public class ArvoreBin<T extends Comparable<T>> {

    private BinNo<T> raiz;
    
    public ArvoreBin() {
        this.raiz = null;
    }
    
    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }
    
    private BinNo<T> inserir(BinNo<T> atual,BinNo<T> novoNo){
        if(atual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }
    
    public void exibirEmOrdem(){
        System.out.println("\nExibindo em ordem");
        exibirEmOrdem(this.raiz);
    }
    public void exibirPosOrdem(){
        System.out.println("\nExibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }
    public void exibirPreOrdem(){
        System.out.println("\nExibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }
    private void exibirEmOrdem(BinNo<T> atual){
        if(atual != null){
            exibirEmOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ",");
            exibirEmOrdem(atual.getNoDir());
        }
    }
    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ",");
            
        }
    }    
    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ",");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
            
            
        }
    }
    
    public void remove(T conteudo){
        try {
            BinNo<T> atual = this.raiz; 
            BinNo<T> pai = null; 
            BinNo<T> filho = null; 
            BinNo<T> temp = null;
            while(atual != null && !atual.getConteudo().equals(conteudo)){
            pai = atual;
            if(conteudo.compareTo(atual.getConteudo()) < 0){
                atual = atual.getNoEsq();
            }else{
                atual = atual.getNoDir();
            }    
            if(atual == null){
                System.out.println("conteudo nao encontrado(bloco try)");
            }
            
            if(pai == null){
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else{
                    for (temp = atual , filho = atual.getNoEsq();
                         filho.getNoDir() != null;
                         temp = filho,filho=filho.getNoEsq()) {
                        
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
                
            }else if(atual.getNoDir() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else{
                    pai.setNoDir(atual.getNoEsq());
                }
            }else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else{
                    pai.setNoDir(atual.getNoDir());
                }
            }else{
                for (temp = atual,filho = atual.getNoEsq();
                     filho.getNoDir() != null;
                     temp = filho,filho = filho.getNoDir()
                     ) {
                    if (filho != atual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }   
            }
            
            
            }
        } catch (NullPointerException e) {
            System.out.println("Conteudo nao encontrado(bloco catch)");
        }
        
    }
    
    
    
}
