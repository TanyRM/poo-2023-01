package java.com.github.TanyRM.poo.Media;

public class CalcularMedia {
    public static void main (String[] args){
        int n=4;
        double num[] = new double[4];
        double media=0;

        num[0] = 8.5;
        num[1] = 4.3;
        num[2] = 7.1;
        num[3] = 9.0;

        for (int i=0; i<4;i++){
            media += num[i];
        }
        media = media/n;
        System.out.printf("Media = %.2f",media);
    }
}
