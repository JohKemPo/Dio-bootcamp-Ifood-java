package DesafioDeProjeo_2.src.gof;

import java.util.SortedMap;

public class SingletonEager {
    private static SengletonEager instancia = new SingletonEager();
    
    private SingletonEager(){
        super();
    }

    public static SingletonLazy getInstancia(){
        
        return instancia;
    }
}
