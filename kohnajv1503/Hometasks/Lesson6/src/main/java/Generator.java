/**

 * Разработаем программу под названием "Генератор казенных речей."
 * Программа состоиз из одного класса и одного метода.
 */     public class Generator{

        public static void main(String[]args){
        /*
         * Для начала создадим базу данных фраз.
         */
        String[]column1=new String[10];
        String[]column2=new String[10];
        String[]column3=new String[10];
        String[]column4=new String[10];

        int r1;
        int r2;
        int r3;
        int r4;

        column1[0]="Дорогие друзья!";
        column1[1]="С другой стороны";
        column1[2]="Не следует, однако, забывать о том, что";
        column1[3]="Таким образом,";
        column1[4]="Повседневная практика показывает, что";
        column1[5]="Значимость этих проблем настолько очевидна, что";
        column1[6]="Разнообразный и богатый опыт";
        column1[7]="Равным образом";
        column1[8]="Задача организации, в особенности же";
        column1[9]="Соображения высшего порядка, а также";

        column2[0]="реализация намеченных плановых заданий";
        column2[1]="рамки и место обучения кадров";
        column2[2]="постоянный количественный рост и сфера нашей активности сложившаяся структура организации";
        column2[3]="новая модель";
        column2[4]="организационной деятельности";
        column2[5]="дальнейшее развитие различных форм деятельности";
        column2[6]="постоянное информационно-пропагандистское обеспечение нашей деятельности";
        column2[7]="укрепления и развития структуры";
        column2[8]="консультация с широким активом";
        column2[9]="начало повседневной работы по формированию позиции";

        column3[0]="играет важную роль в формировании";
        column3[1]="требуют от нас анализа";
        column3[2]="требуют определения и уточнения";
        column3[3]="способствует подготовке и реализации";
        column3[4]="обеспечивает широкому кругу специалистов участие в формировании";
        column3[5]="позволяет выполнить";
        column3[6]="важнейшие задания по разработке";
        column3[7]="в значительной степени обуславливает создание ";
        column3[8]="позволяет оценить значение";
        column3[9]="представляет собой интересный эксперимент проверки ";

        column4[0]="существующих финансовых и административных условий.";
        column4[1]="дальнейших направлений развитая.";
        column4[2]="системы массового участия.";
        column4[3]="позиций, занимаемых участниками в отношении поставленных задач.";
        column4[4]="новых предложений.";
        column4[5]="направлений прогрессивного развития.";
        column4[6]="системы обучения кадров соответствующей насущным потребностям.";
        column4[7]="соответствующих условий активизации.";
        column4[8]="модели развития.";
        column4[9]="форм воздействия.";

        r1=genRandomNumber();
        r2=genRandomNumber();
        r3=genRandomNumber();
        r4=genRandomNumber();

        System.out.println("Программа \"Генератор казенных речей\" сгенерировала следующую фразу: ");
        System.out.println(column1[r1]+" "+column2[r2]+" "+column3[r3]+" "+column4[r4]);
        }

public static int genRandomNumber(){
        int random=(int)(Math.random()*9);
        // System.out.println(random); // для отладки
        return random;
        }

        }