package Chain_Memento;

import java.util.function.BiFunction;

//Chain of responsibility pattern
public class Handler {
    Handler next=null;
    String opcode;
    BiFunction<Double,Double,Double> callback;

    private Double state;

    public Handler(String opcode, BiFunction<Double, Double, Double> callback) {
        this.opcode = opcode;
        this.callback = callback;
    }

    public Double handle(String opcode,double v1,double v2){
        if(opcode==this.opcode){
            return this.callback.apply(v1,v2);
        }
        else if(this.next!=null) {
            return this.next.handle(opcode, v1, v2);
        }
        else{
            return null;
        }
    }

    public void setState(Double state){
        System.out.println("Setting state: "+state);
        this.state=state;
    }
    public Memento save(){
        System.out.println("Saving State");
        return new Memento(state);
    }
    public void restore(Memento memento){
        state= memento.getState();
        System.out.println("Restored State: "+state);
    }
}
