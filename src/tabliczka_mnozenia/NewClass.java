package tabliczka_mnozenia;

public class NewClass {

    public static void main(String[] args)
    {
        int n = 10, wiersze, kolumny;

        System.out.println("Program wyswietla tabliczke mnozenia");

        for (wiersze = 1; wiersze <= n; wiersze++)
        {
            for (kolumny = 1; kolumny <= n; kolumny++)
            {
                System.out.print(wiersze * kolumny + "\t");
            }
            System.out.println();
        }
    }
}
