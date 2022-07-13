public class Main {

    public static void main(String[] args) {
        masp i = new masp();
        i.aumentar();
        System.out.println(i.p);
    }

    // clase aumentar número de puertas
     static class masp{
         int p=4;
         void aumentar(){
            this.p++;
        }
    }

}





