package day_2;

public class Main {

    public static void main(String[] args) {
        Reader filereader = new Reader();
        Handler gamehandler = new Handler();
        int a = 0;
        for (int i = 0; i < 100; i++) {
            a += gamehandler.HandlerGo(filereader.getOneLine(i));
        }
        System.out.println(a);
    }
}