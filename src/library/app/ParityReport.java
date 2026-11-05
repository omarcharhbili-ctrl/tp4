package library.app;

// Ancienne complexMethodExample(), sortie du modèle (SRP) et décomposée
public class ParityReport {
    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + " " + classify(i));
        }
    }

    static String classify(int i) {
        if (i % 2 == 0) return "is even";
        if (i % 3 == 0) return "divisible by 3";
        return "something else";
    }
}
