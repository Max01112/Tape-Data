//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        byte bait = 1;
        short karatkli = 2;
        int odin = 3;
        long dlinna = 4;
        float sem = 2.1F;
        double shet = 3.44;
        System.out.println("Значение переменной bait с типом byte равно " + bait);
        System.out.println("Значение переменной karatkli с типом short равно " + karatkli);
        System.out.println("Значение переменной odin типом int равно " + odin);
        System.out.println("Значение переменной dlinna типом long равно " + dlinna);
        System.out.println("Значение переменной sem с типом float равно " + sem);
        System.out.println("Значение переменной shet с типом double равно " + shet);

        System.out.println("Задание 2");
        double number1 = 27.12;
        long number2 = 987678965549L;
        double number3 = 2.786;
        short number4 = 569;
        int number5 = -159;
        int number6 = 27897;
        byte number7 = 67;
        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6 + " " + number7);

        System.out.println("Задание 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int otvet = 480/(class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано " + otvet + " листов бумаги");

        System.out.println("Задание 4");
        int uvlovie = 16;
        System.out.println("За 20 минут машина произвела " + (uvlovie/2)*20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + ((uvlovie/2)*60)*24 + " штук бутылок");
        System.out.println("За три дня машина произвела " + (((uvlovie/2)*60)*24)*3 + " штук бутылок");
        System.out.println("Если бы в месяце было 30 дней то за это время машина произвела бы " + (((uvlovie/2)*60)*24)*30 + " штук бутылок");

        System.out.println("Задание 5");
        int vsegoBanok = 120;
        int belayaKraskaNaKabinet = 2;
        int KorichnevayaKraskaNaKabinet = 4;
        int vsegoKlassov = vsegoBanok/(belayaKraskaNaKabinet+KorichnevayaKraskaNaKabinet);
        int vsegoBeloyKraski = vsegoKlassov*belayaKraskaNaKabinet;
        int vsegoKorichnevoiKraski = vsegoKlassov*KorichnevayaKraskaNaKabinet;
        System.out.println("В школе, где " + vsegoKlassov +  " классов, нужно " + vsegoBeloyKraski + " банок белой краски и " + vsegoKorichnevoiKraski + " банок коричневой краски");

        System.out.println("Задание 6");
        byte bananaCount = 5;
        short milkCount = 200;
        byte iceCreamBriket = 2;
        byte egs = 4;
        short banana1Weight = 80;
        double milk100Ml = 105;
        short iceCreamBriket1Weight = 100;
        short egs1Weight = 70;
        int kollichestvoGramm = (int) ((bananaCount*banana1Weight)+(iceCreamBriket*iceCreamBriket1Weight)+(egs*egs1Weight)+((milk100Ml/100)*milkCount));
        int kollichestvoKGramm = kollichestvoGramm/1000;
        System.out.println("Всего грамм в данном завтраке: " + kollichestvoGramm + " грамм, что в килограммах состовляет: " + kollichestvoKGramm + "килограмм");

        System.out.println("Задание 7");

    }
    }