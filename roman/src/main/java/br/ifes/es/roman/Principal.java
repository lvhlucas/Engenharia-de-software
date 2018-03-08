/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.es.roman;

import java.util.HashMap;

/**
 *
 * @author 20131bsi0246
 */
public class Principal {

    private HashMap<Character, Integer> mapa=new HashMap<>();
    public Principal() {        
        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);                
    }
    
    
    public int calcular(String numeroRomano){                
        int contador=numeroRomano.length()-1;
        int romanoSucessor=mapa.get(numeroRomano.charAt(contador));
        int romanoAntecessor;
        int resultado=romanoSucessor;                
        while(contador>0 && numeroRomano.length()!=1){
            romanoSucessor=mapa.get(numeroRomano.charAt(contador));
            romanoAntecessor=mapa.get(numeroRomano.charAt(contador-1));
            if(romanoAntecessor<romanoSucessor){
                resultado-=romanoAntecessor;
            }
            else{
                resultado+=romanoAntecessor;
            }
            contador--;            
        }        
        return resultado;
    }        
}
