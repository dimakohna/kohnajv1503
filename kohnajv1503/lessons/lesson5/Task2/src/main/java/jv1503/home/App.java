package jv1503.home;

/**
 * Created by Æåêà on 27.11.2015.
 */
public class App {
    public static void main(String[] args) {
        int in = 12;



        String res = rev(in);
        System.out.println(res);
    }

    static String rev(int in) {
        String num[] = {"Íîëü", "Îäèí", "Äâà", "Òğè", "×åòûğå", "Ïÿòü", "Øåñòü", "Ñåìü", "Âîñåìü", "Äåâÿòü"};
        String num2[] = {"Äåñÿòü", "Îäèíàäöàòü", "Äâåíàäöàòü", "Òğèíàäöàòü", "×åòûğíàäöàòü",
                "Ïÿòíàäöàòü", "Øåñòíàäöàòü", "Ñåìíàäöàòü", "Âîñåìíàäöàòü", "Äåâÿòíàäöàòü"};
        String num3[] = {"Äâàäöàòü", "Òğèäöàòü", "Ñîğîê", "Ïÿòüäåñÿò", "Øåñòüäåñÿò",
                "Ñåìüäåñÿò", "Âîñåìüäåñÿò", "Äåâÿíîñòî"};
        String out = null;
        int in1;
        int in2;

        if ((in >= 0) && (in < 9)) {
            out = ("÷èñëî ğàâíî " + num[in]);
        } else if ((in >= 10) && (in < 19)) {
            out = ("÷èñëî ğàâíî " + num2[in - 10]);
        } else if ((in >= 20) && (in <= 99)) {
            in2 = in % 10;
            in1 = in - in2;
            switch (in2) {
                case 0: {
                   out = ("÷èñëî ğàâíî " + num3[(in / 10) - 2]);
                }break;
                default: {
                    out = ("÷èñëî ğàâíî " + num3[(in / 10) - 2] + " " + num[in2]);
                }
            }
        }
        return out;
    }
}

