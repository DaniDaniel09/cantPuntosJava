
public class Tema7act22 {

    public static void main(String[] args) {
        int vector[] = {2,1,5,3,7};
        grafico(vector);
    }

    static void linia(int lon) {
        for (int i = 1; i <= lon; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    static void grafico(int [] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            System.out.print(" ");
            linia(v[i]);
        }
    }
}
