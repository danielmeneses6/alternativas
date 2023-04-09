
package estructuras;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Alternativas {
     public char[][] metodoarreglos()
    {
        /*double vector[]=new double[10];
        for (int i = 0; i < 10; i++) {
            vector[i]=(Math.random()*100+1);
        }
       return vector;*/
        char matriz[][]=new char [3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]='*';
            }
            
        }
        return matriz;
    }
    public void metodolistas()
    {
        ArrayList lista1= new ArrayList();
        lista1.add("hola");
        lista1.add(6);
        lista1.remove(0);//se elimina por    defecto el primero
        lista1.add("marzo");
        lista1.add("ENERO");
        lista1.remove(2);
        lista1.add("enero");
        lista1.add("febrero");
        lista1.add(2023);
        System.out.println(lista1);
    }
    public void metodoPilas()
    {
        Stack pila=new Stack();
        System.out.println(pila.empty());
        pila.push("hola");
        pila.push("programacion");
        pila.pop();
        pila.pop();
        pila.push("III");
        pila.pop();//desapilar
        System.out.println(pila.peek());
        System.out.println(pila.empty());
    }
    public void metodoColas()
    {
       Queue cola=new LinkedList();
       cola.offer(10);
       cola.offer("A");
       cola.offer("B");
       cola.poll();
       cola.poll();
        System.out.println(cola.isEmpty());
       cola.offer("C");
       cola.offer("D");
       cola.offer("E");
       cola.poll();
       cola.poll();
       cola.offer("F");
          System.out.println(cola.peek());
                  
          
    }
    
}