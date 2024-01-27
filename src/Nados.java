
public class Nados {
    void add(int x,int y){
        System.out.println(x+y);
    }
    void add(int x,int y, int z){
        System.out.println(x+y+z);
    }

    public static class NadosChild extends Nados{
        @Override
        void add(int x,int y){
            System.out.println(x+y);
        }
    }
    public static void main(String[] args) {
        Nados nados = new Nados();
        nados.add(20,30);
        nados.add(20,30,40);
        NadosChild child = new NadosChild();
        child.add(10,80);

    }
}


