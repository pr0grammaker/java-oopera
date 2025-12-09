import java.util.ArrayList;
import java.util.Arrays;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Алексей", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Петрова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Дмитрий", "Смирнов", Gender.MALE, 175);

        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(actor1, actor2, actor3));


        Director director1 = new Director("Сергей", "Кузнецов", Gender.MALE, 12);
        Director director2 = new Director("Анна", "Скопытецкая", Gender.FEMALE, 32);


        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Михаил", "Фокин", Gender.MALE);

        Show regularShow = new Show(
                "Волшебная мелодия",
                120,
                director1,
                actors
        );

        Opera operaShow = new Opera(
                "Голос судьбы",
                150,
                director2,
                actors,
                musicAuthor,
                """
                        Действие 1. Сцена 1: Замок короля
                        Герой (ария): «Сквозь тьму и ветер я иду,
                        Судьба ведёт меня туда, где ты живёшь!»
                        Принцесса (ария): «О, кто придёт ко мне в этот час?
                        Сердце моё зовёт героя на спасенье!»
                        Злодей (реквием): «Никто не остановит меня!
                        Моя власть — навеки!»
                        
                        Действие 1. Сцена 2: Лесная чаща
                        Герой и Принцесса (дуэт): «Вместе мы пройдём все бури,
                        Любовь сильнее тьмы и страха!»
                        
                        Действие 2. Сцена 1: Битва у замка
                        Злодей (ария): «Вы не уйдёте живыми!»
                        Герой (ария): «Смелость и честь ведут меня вперёд!»
                        Принцесса (ария): «Сердце моё с тобой, и я не боюсь!»
                        
                        Финал (ансамбль): «Тьма повержена, свет сияет вновь,
                        Любовь и верность торжествуют в сердце людском!»
                        """,
                30
        );

        Ballet balletShow = new Ballet(
                "Тайна леса",          // title
                120,
                director1,
                actors,
                musicAuthor,
                """
                        Балет: «Тайна леса»
                        
                        Действие 1. Сцена 1: Рассвет в лесу
                        Действующие лица: Герой, Героиня, Тени леса
                        
                        Ремарки: Лёгкий туман, первые лучи солнца.
                        Текст:
                        
                        Герой (внутренний голос): «Новый день… новые испытания.»
                        
                        Герои встречаются взглядом, осторожные движения, танец доверия.
                        
                        Действие 1. Сцена 2: Буря
                        Ремарки: Ветер усиливается, молнии освещают сцену.
                        Текст:
                        
                        Герой (мысленно): «Страх и сомнение окружили меня.»
                        
                        Герои выражают борьбу и напряжение через танцевальные движения.
                        
                        Финальный жест: слияние рук, преодоление трудностей.
                        
                        Действие 2. Сцена 1: Солнечная поляна
                        Ремарки: Солнце, открытое пространство, радостная музыка.
                        Текст:
                        
                        Герои танцуют дуэт, движения лёгкие и воздушные.

                        Завершающий жест: руки соединяются, символ гармонии.
                        """,
                choreographer
        );

        regularShow.addActor(actor1.getName(), actor1.getSurname(), actor1.getGender(), actor1.getHeight());
        regularShow.addActor(actor2.getName(), actor2.getSurname(), actor2.getGender(), actor2.getHeight());

        operaShow.addActor(actor2.getName(), actor2.getSurname(), actor2.getGender(), actor2.getHeight());
        operaShow.addActor(actor3.getName(), actor3.getSurname(), actor3.getGender(), actor3.getHeight());

        balletShow.addActor(actor1.getName(), actor1.getSurname(), actor1.getGender(), actor1.getHeight());
        balletShow.addActor(actor3.getName(), actor3.getSurname(), actor3.getGender(), actor3.getHeight());
        System.out.println("-".repeat(20));
        System.out.println("Актеры обычного спектакля: ");
        regularShow.printListOfActors();
        System.out.println("-".repeat(20));
        System.out.println("Актеры оперного спектакля: ");
        operaShow.printListOfActors();
        System.out.println("-".repeat(20));
        System.out.println("Актеры баллетного спектакля: ");
        balletShow.printListOfActors();
        System.out.println("-".repeat(20));

        System.out.println("Замена актера на существующего актера:");
        regularShow.replaceActor(actor3, "Иванов");
        System.out.println("Список актеров обычного спектакля:");
        regularShow.printListOfActors();

        System.out.println("-".repeat(20));
        System.out.println("Замена актера на существующего актера:");
        balletShow.replaceActor(actor3, "Козловский");
        System.out.println("-".repeat(20));

        System.out.println("Текст либретто для оперы:");
        operaShow.printLibretto();

        System.out.println("-".repeat(20));
        System.out.println("Текст либретто для баллета:");
        balletShow.printLibretto();

    }
}
