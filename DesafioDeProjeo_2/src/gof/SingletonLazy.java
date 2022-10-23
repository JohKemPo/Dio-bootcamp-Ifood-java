package DesafioDeProjeo_2.src.gof;

public class SingletonLazy {
    private static SengletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(!instancia) instancia = new SingletonLazy();
        
        return instancia;
    }
}
