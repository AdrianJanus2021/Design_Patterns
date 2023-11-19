package Chain_Memento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Chain of Responsibility, Chain_Memento.Memento design pattern:
        Handler add=new Handler("+",(v1,v2) -> v1 + v2);
        Handler sub=new Handler("-",(v1,v2) -> v1 - v2);
        Handler div=new Handler("/",(v1,v2) ->{
                                                if(v2!=0){
                                                    return v1 / v2;
                                                }
                                                else return null;
                                            }
                                );
        Handler mul=new Handler("*",(v1,v2) -> v1 * v2);

        add.next=sub;
        sub.next=div;
        div.next=mul;

        List<Memento> savedStates=new ArrayList<Memento>();

        Double r1=add.handle("+",5,3);
        System.out.println(r1);
        add.setState(r1);
        savedStates.add(add.save());
        System.out.println();

        Double r2=add.handle("-",5,3);
        System.out.println(r2);
        add.setState(r2);
        savedStates.add(add.save());
        System.out.println();

        Double r3=add.handle("/",12,3);
        System.out.println(r3);
        add.setState(r3);
        savedStates.add(add.save());
        System.out.println();

        Double r4=add.handle("/",12,0);
        System.out.println(r4);
        add.setState(r4);
        savedStates.add(add.save());
        System.out.println();

        Double r5=add.handle("/",5,3);
        System.out.println(r5);
        add.setState(r5);
        savedStates.add(add.save());
        System.out.println();

        Double r6=add.handle("*",5,3);
        System.out.println(r6);
        add.setState(r6);
        savedStates.add(add.save());
        System.out.println();

        Double r7=add.handle(".",5,3);
        System.out.println(r7);
        add.setState(r7);
        savedStates.add(add.save());
        System.out.println();

        add.restore(savedStates.get(0));
        add.restore(savedStates.get(5));
        add.restore(savedStates.get(3));
    }
}
