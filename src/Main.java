//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
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

        System.out.println(" ");
        System.out.println("Задание 2");
        double number1 = 27.12;
        long number2 = 987678965549L;
        float number3 = 2.786F;
        short number4 = 569;
        short number5 = -159;
        int number6 = 27897;
        byte number7 = 67;
        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6 + " " + number7);

        System.out.println(" ");
        System.out.println("Задание 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int otvet = 480/(class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано " + otvet + " листов бумаги");

        System.out.println(" ");
        System.out.println("Задание 4");
        byte uslovie = 16;
        System.out.println("За 20 минут машина произвела " + (uslovie/2)*20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + ((uslovie/2)*60)*24 + " штук бутылок");
        System.out.println("За три дня машина произвела " + (((uslovie/2)*60)*24)*3 + " штук бутылок");
        System.out.println("Если бы в месяце было 30 дней то за это время машина произвела бы " + (((uslovie/2)*60)*24)*30 + " штук бутылок");

        System.out.println(" ");
        System.out.println("Задание 5");
        int vsegoBanok = 120;
        int belayaKraskaNaKabinet = 2;
        int korichnevayaKraskaNaKabinet = 4;
        int vsegoKlassov = vsegoBanok/(belayaKraskaNaKabinet+korichnevayaKraskaNaKabinet);
        int vsegoBeloyKraski = vsegoKlassov*belayaKraskaNaKabinet;
        int vsegoKorichnevoiKraski = vsegoKlassov*korichnevayaKraskaNaKabinet;
        System.out.println("В школе, где " + vsegoKlassov +  " классов, нужно " + vsegoBeloyKraski + " банок белой краски и " + vsegoKorichnevoiKraski + " банок коричневой краски");

        System.out.println(" ");
        System.out.println("Задание 6");
        byte bananaCount = 5;
        short milkCount = 200;
        byte iceCreamBriket = 2;
        byte egs = 4;
        short banana1Weight = 80;
        double milk100Ml = 105;
        short iceCreamBriket1Weight = 100;
        short egs1Weight = 70;
        float kollichestvoGramm = (int) ((bananaCount*banana1Weight)+(iceCreamBriket*iceCreamBriket1Weight)+(egs*egs1Weight)+((milk100Ml/100)*milkCount));
        float kollichestvoKGramm = kollichestvoGramm/1000;
        System.out.println("Всего грамм в данном завтраке: " + kollichestvoGramm + " грамм, что в килограммах состовляет: " + kollichestvoKGramm + " килограмм");

        System.out.println(" ");
        System.out.println("Задание 7");
        byte nujnoSbrositKg = 7;
        short poteryaVesaMin = 250;
        short poteryaVesaMax = 500;
        int nujnoSbrositGramm = nujnoSbrositKg*1000;
        int poteryaVesa250 =  nujnoSbrositGramm/poteryaVesaMin;
        int poteryaVesa500 = nujnoSbrositGramm/poteryaVesaMax;
        System.out.println("Если спортсмен будет серять 250 грамм каждый день ему потребуется: " + poteryaVesa250);
        System.out.println("Если спортсмен будет серять 500 грамм каждый день ему потребуется: " + poteryaVesa500);
        System.out.println("В среднем ему потребуется дней: " + (poteryaVesa250+poteryaVesa500)/2);

        System.out.println(" ");
        System.out.println("Задание 8");
        int zarplataMasha = 67760;
        int zarplataDenis = 83690;
        int zarplataKristina = 76230;
        System.out.println("Маша теперь получает: " + (int)(zarplataMasha*1.1) + " рублей. Годовой доход вырос на: " + (int)(((zarplataMasha*1.1)*12)-(zarplataMasha*12)) + " рублей");
        System.out.println("Денис теперь получает: " + (int)(zarplataDenis*1.1) + " рублей. Годовой доход вырос на: " + (int)(((zarplataDenis*1.1)*12)-(zarplataDenis*12)) + " рублей");
        System.out.println("Кристина теперь получает: " + (int)(zarplataKristina*1.1) + " рублей. Годовой доход вырос на: " + (int)(((zarplataKristina*1.1)*12)-(zarplataKristina*12)) + " рублей");
    }
    }