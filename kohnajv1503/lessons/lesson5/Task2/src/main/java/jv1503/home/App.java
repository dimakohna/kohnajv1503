package jv1503.home;

/**
 * Created by ���� on 27.11.2015.
 */
public class App {
    public static void main(String[] args) {
        int in = 12;



        String res = rev(in);
        System.out.println(res);
    }

    static String rev(int in) {
        String num[] = {"����", "����", "���", "���", "������", "����", "�����", "����", "������", "������"};
        String num2[] = {"������", "����������", "����������", "����������", "������������",
                "����������", "�����������", "����������", "������������", "������������"};
        String num3[] = {"��������", "��������", "�����", "���������", "����������",
                "���������", "�����������", "���������"};
        String out = null;
        int in1;
        int in2;

        if ((in >= 0) && (in < 9)) {
            out = ("����� ����� " + num[in]);
        } else if ((in >= 10) && (in < 19)) {
            out = ("����� ����� " + num2[in - 10]);
        } else if ((in >= 20) && (in <= 99)) {
            in2 = in % 10;
            in1 = in - in2;
            switch (in2) {
                case 0: {
                   out = ("����� ����� " + num3[(in / 10) - 2]);
                }break;
                default: {
                    out = ("����� ����� " + num3[(in / 10) - 2] + " " + num[in2]);
                }
            }
        }
        return out;
    }
}

