import java.util.*;

import java.io.Console;

public class App {

    public static boolean moreBot(String response) {
        boolean bool = false;
        if (response.toLowerCase().equals("y") || response.toLowerCase().equals("yes")) {
            bool = true;
        }
        return bool;
    }

    public static boolean typeExists(ArrayList<String> arr, String type) {
        boolean bool = false;
        if (arr.contains(type.toLowerCase())) {
            bool = true;
        }
        return bool;
    }

    public static void taskCompleted(Robot bot, int amount) {
        if (amount == 0) {
            System.out.println(bot.getName()
                    + " has completed the last task from the task list.\nFrom now on, all remaining robots will redo the task list.\n");
        }
    }

    public static void main(String[] args) throws Exception {

        boolean bool = false;
        Random rand = new Random();
        ArrayList<String> types = new ArrayList<>(
                Arrays.asList("unipedal", "bipedal", "quadrupedal", "arachnid", "radial", "aeronautical"));
        ArrayList<String> tasks = new ArrayList<>(Arrays.asList("do the dishes", "sweep the house", "do the laundry",
                "take out the recycling", "make a sammich", "mow the lawn", "rake the leaves", "give the dog a bath",
                "bake some cookies", "wash the car"));
        ArrayList<Robot> botList = new ArrayList<>();
        Hashtable<String, Integer> botName = new Hashtable<>();
        ArrayList<Integer> list = new ArrayList<>();

        Console console = System.console();

        if (console != null) {
            while (!bool) {
                Scanner scanner = new Scanner(console.reader());
                String more = "";

                do {
                    console.writer().println("Give this robot a name!");
                    String name = scanner.nextLine();
                    console.writer().println("");

                    if (botName.containsKey(name.toLowerCase())) {
                        console.writer().println("ERROR!! Robot's name has to be unique.");
                        console.writer().println("");
                        continue;
                    }

                    botName.put(name.toLowerCase(), 1);
                    console.writer().println("Please select the type of the robot.");
                    console.writer().println(
                            "AVAILABLE TYPES: Unipedal, Bipedal, Quadrupedal, Arachnid, Radial, Aeronautical\nNote: each type has its own strength and weaknesses");
                    String type = scanner.nextLine();
                    console.writer().println("");

                    while (!typeExists(types, type)) {
                        console.writer().println("This type doesn't exist. Please choose one from the list below.");
                        console.writer().println(
                                "TYPES: Unipedal, Bipedal, Quadrupedal, Arachnid, Radial, Aeronautical\nNote: each type has its own strength and weaknesses");
                        type = scanner.nextLine();
                        console.writer().println("");
                    }

                    botList.add(new Robot(name, type));
                    console.writer().println("Do you want to create another robot?(Y/N)");
                    more = scanner.nextLine();
                    console.writer().println("");
                } while (moreBot(more));

                for (int i = 0; i < botList.size(); i++) {
                    int taskCount = 0;
                    console.writer().println("--------------------------------");
                    console.writer().println("Now " + botList.get(i).getName() + " will be assigned with 5 tasks!");
                    console.writer().println("--------------------------------\n");

                    while (taskCount != 5) {
                        int index = 0;

                        if (tasks.size() > 0) {
                            index = rand.nextInt(tasks.size());
                        } else {
                            tasks = new ArrayList<>(Arrays.asList("do the dishes", "sweep the house", "do the laundry",
                                    "take out the recycling", "make a sammich", "mow the lawn", "rake the leaves",
                                    "give the dog a bath", "bake some cookies", "wash the car"));
                        }

                        switch (tasks.get(index)) {
                            case "do the dishes":
                                tasks.remove("do the dishes");
                                botList.get(i).dishes();
                                taskCompleted(botList.get(i), tasks.size());
                                break;
                            case "sweep the house":
                                tasks.remove("sweep the house");
                                botList.get(i).sweep();
                                taskCompleted(botList.get(i), tasks.size());
                                break;
                            case "do the laundry":
                                tasks.remove("do the laundry");
                                botList.get(i).laundry();
                                taskCompleted(botList.get(i), tasks.size());
                                break;
                            case "take out the recycling":
                                tasks.remove("take out the recycling");
                                botList.get(i).recycle();
                                taskCompleted(botList.get(i), tasks.size());
                                break;
                            case "make a sammich":
                                tasks.remove("make a sammich");
                                botList.get(i).sammich();
                                taskCompleted(botList.get(i), tasks.size());
                                break;
                            case "mow the lawn":
                                tasks.remove("mow the lawn");
                                botList.get(i).lawn();
                                taskCompleted(botList.get(i), tasks.size());
                                break;
                            case "rake the leaves":
                                tasks.remove("rake the leaves");
                                botList.get(i).leaves();
                                taskCompleted(botList.get(i), tasks.size());
                                break;
                            case "give the dog a bath":
                                tasks.remove("give the dog a bath");
                                botList.get(i).dog();
                                taskCompleted(botList.get(i), tasks.size());
                                break;
                            case "bake some cookies":
                                tasks.remove("bake some cookies");
                                botList.get(i).bake();
                                taskCompleted(botList.get(i), tasks.size());
                                break;
                            case "wash the car":
                                tasks.remove("wash the car");
                                botList.get(i).car();
                                taskCompleted(botList.get(i), tasks.size());
                                break;
                        }
                        taskCount++;
                    }
                }

                tasks = new ArrayList<>(Arrays.asList("do the dishes", "sweep the house", "do the laundry",
                        "take out the recycling", "make a sammich", "mow the lawn", "rake the leaves",
                        "give the dog a bath", "bake some cookies", "wash the car"));

                for (int i = 1; i < botList.size(); i++) {
                    Robot key = botList.get(i);
                    int j = i - 1;

                    while (j >= 0 && botList.get(j).getTime() > key.getTime()) {
                        botList.set(j + 1, botList.get(j));
                        j -= 1;
                    }
                    botList.set(j + 1, key);

                }

                console.writer().println("\nLEADERBOARD");
                console.writer().println("-----------------------------------------------------------");
                for (int i = 0; i < botList.size(); i++) {
                    console.writer().println("Number " + (i + 1) + ": " + botList.get(i).getName() + "("
                            + botList.get(i).getType() + ") -  " + String.valueOf(botList.get(i).getTime()) + " ms");
                }
                console.writer().println("-----------------------------------------------------------\n");

                botList.clear();
                list.clear();
                botName.clear();

                console.writer().println("Exit Program(Y/N)");
                String exit = scanner.nextLine();
                if (exit.toLowerCase().equals("y") || exit.toLowerCase().equals("yes")) {
                    bool = true;
                }

            }
        } else {
            System.out.println("No Console found");
        }

    }
}
