
public class MaquinaDeCafeV1
{
    private int saldoActual;
    private int nivelDeCafe;
    private int valorOnza;
    private int dineroRecibido;
    private int onzasAVender;

    public MaquinaDeCafeV1(){
        saldoActual=20000;
        nivelDeCafe=1000;
        valorOnza=100;
    }

    public MaquinaDeCafeV1(int saldoActual,int nivelDeCafe,int valorOnza){
        this.saldoActual=saldoActual;
        this.nivelDeCafe=nivelDeCafe;
        this.valorOnza=valorOnza;
    }

    public MaquinaDeCafeV1(int nivelDeCafe){
        this.nivelDeCafe=nivelDeCafe;
        saldoActual=20000;
        valorOnza=100;
    }

    public void recibirDinero(int dineroRecibido){
        this.dineroRecibido=dineroRecibido;
    }

    private int calcularCambio(){
        int cambio=dineroRecibido-valorOnza*onzasAVender;
        return cambio;
    }

    public void pedirCantidadDeOnzas(int onzasAVender){
        int posibleVenta=dineroRecibido/valorOnza;
        if(onzasAVender<=posibleVenta){
            if(onzasAVender<=nivelDeCafe){
                this.onzasAVender=onzasAVender;
            }else{
                System.out.println("Cantidad de onzas no disponible");
            }
        }else{
            int faltante=onzasAVender*valorOnza-dineroRecibido;
            System.out.println("Faltan "+faltante+" pesos");
        }
    }

    public void entregarCafe(){
        saldoActual=saldoActual+dineroRecibido-calcularCambio();
        nivelDeCafe=nivelDeCafe-onzasAVender;
        //reiniciar los valores de uso temporal
        System.out.println("Cambio: "+ calcularCambio());
        dineroRecibido=0;
        onzasAVender=0;
    }
    
   public void mostarEstado(){
        System.out.println("******************"
        +"\nNivel de cafe:"+nivelDeCafe
            +"\nSaldo:"+saldoActual
            +"\nValor onza:"+valorOnza
            +"\n******************");
    }

}
