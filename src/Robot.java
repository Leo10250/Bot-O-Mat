public class Robot {
    private String name;
    private String type;
    private int totalTime;
    String[] botTypes = { "unipedal", "bipedal", "quadrupedal", "arachnid", "radial", "aeronautical" };

    public Robot(String botName, String botType) {
        this.name = botName;
        this.type = botType;
        this.totalTime = 0;
    }

    public void dishes() {
        try {
            if (this.type.toLowerCase().equals(botTypes[0]) || this.type.toLowerCase().equals(botTypes[1])
                    || this.type.toLowerCase().equals(botTypes[2])) {
                System.out.println(
                        this.name + " is not specialized in this task, and it will take longer to complete the task.");
                System.out.println(this.name + " has begun doing dishes!");
                Thread.sleep(1500);
                this.totalTime += 1500;
                System.out.println(this.name + " has finished doing the dishes!\n");
            } else if (this.type.toLowerCase().equals(botTypes[4])) {
                System.out.println(
                        this.name + " is specialized in this task, and it will complete the task in a shorter time.");
                System.out.println(this.name + " has begun doing dishes!");
                Thread.sleep(800);
                this.totalTime += 800;
                System.out.println(this.name + " has finished doing the dishes!\n");
            } else {
                System.out.println(this.name + " has begun doing dishes!");
                Thread.sleep(1000);
                this.totalTime += 1000;
                System.out.println(this.name + " has finished doing the dishes!\n");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void sweep() {
        try {
            if (this.type.toLowerCase().equals(botTypes[1])) {
                System.out.println(
                        this.name + " is specialized in this task, and it will complete the task in a shorter time.");
                System.out.println(this.name + " has begun sweeping the house!");
                Thread.sleep(2500);
                this.totalTime += 2500;
                System.out.println(this.name + " has finished sweeping the house!\n");
            } else if (this.type.toLowerCase().equals(botTypes[2])) {
                System.out.println(
                        this.name + " is specialized in this task, and it will complete the task in a shorter time.");
                System.out.println(this.name + " has begun sweeping the house!");
                Thread.sleep(2000);
                this.totalTime += 2000;
                System.out.println(this.name + " has finished sweeping the house!\n");

            } else if (this.type.toLowerCase().equals(botTypes[5])) {
                System.out.println(
                        this.name + " is not specialized in this task, and it will take longer to complete the task.");
                System.out.println(this.name + " has begun sweeping the house!");
                Thread.sleep(3200);
                this.totalTime += 3200;
                System.out.println(this.name + " has finished sweeping the house!\n");
            } else {
                System.out.println(this.name + " has begun sweeping the house!");
                Thread.sleep(3000);
                this.totalTime += 3000;
                System.out.println(this.name + " has finished sweeping the house!\n");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void laundry() {
        try {
            if (this.type.toLowerCase().equals(botTypes[0]) || this.type.toLowerCase().equals(botTypes[1])
                    || this.type.toLowerCase().equals(botTypes[2])) {
                System.out.println(
                        this.name + " is not specialized in this task, and it will take longer to complete the task.");
                System.out.println(this.name + " has begun doing the laundry!");
                Thread.sleep(12000);
                this.totalTime += 12000;
                System.out.println(this.name + " has finished doing the laundry!\n");
            } else if (this.type.toLowerCase().equals(botTypes[3])) {
                System.out.println(
                        this.name + " is specialized in this task, and it will complete the task in a shorter time.");
                System.out.println(this.name + " has begun doing the laundry!");
                Thread.sleep(9000);
                this.totalTime += 9000;
                System.out.println(this.name + " has finished doing the laundry!\n");
            } else {
                System.out.println(this.name + " has begun doing the laundry!");
                Thread.sleep(10000);
                this.totalTime += 10000;
                System.out.println(this.name + " has finished doing the laundry!\n");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void recycle() {
        try {
            if (this.type.toLowerCase().equals(botTypes[3])) {
                System.out.println(
                        this.name + " is not specialized in this task, and it will take longer to complete the task.");
                System.out.println(this.name + " has begun taking out the recycling!");
                Thread.sleep(4500);
                this.totalTime += 4500;
                System.out.println(this.name + " has finished taking out the recycling\n");
            } else {
                System.out.println(this.name + " has begun taking out the recycling!");
                Thread.sleep(4000);
                this.totalTime += 4000;
                System.out.println(this.name + " has finished taking out the recycling\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void sammich() {
        try {
            if (this.type.toLowerCase().equals(botTypes[3])) {
                System.out.println(
                        this.name + " is specialized in this task, and it will complete the task in a shorter time.");
                System.out.println(this.name + " has begun making sammich!");
                Thread.sleep(6000);
                this.totalTime += 6000;
                System.out.println(this.name + " has finished making a sammich!\n");
            } else if (this.type.toLowerCase().equals(botTypes[5])) {
                System.out.println(
                        this.name + " is not specialized in this task, and it will take longer to complete the task.");
                System.out.println(this.name + " has begun making sammich!");
                Thread.sleep(8000);
                this.totalTime += 8000;
                System.out.println(this.name + " has finished making a sammich!\n");
            } else {
                System.out.println(this.name + " has begun making sammich!");
                Thread.sleep(7000);
                this.totalTime += 7000;
                System.out.println(this.name + " has finished making a sammich!\n");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void lawn() {
        try {
            if (this.type.toLowerCase().equals(botTypes[0])) {
                System.out.println(
                        this.name + " is specialized in this task, and it will complete the task in a shorter time.");
                System.out.println(this.name + " has begun mowing the lawn!");
                Thread.sleep(15000);
                this.totalTime += 15000;
                System.out.println(this.name + " has finished mowing the lawn!\n");
            } else if (this.type.toLowerCase().equals(botTypes[1])) {
                System.out.println(
                        this.name + " is specialized in this task, and it will complete the task in a shorter time.");
                System.out.println(this.name + " has begun mowing the lawn!");
                Thread.sleep(12000);
                this.totalTime += 12000;
                System.out.println(this.name + " has finished mowing the lawn!\n");
            } else if (this.type.toLowerCase().equals(botTypes[2])) {
                System.out.println(
                        this.name + " is specialized in this task, and it will complete the task in a shorter time.");
                System.out.println(this.name + " has begun mowing the lawn!");
                Thread.sleep(10000);
                this.totalTime += 10000;
                System.out.println(this.name + " has finished mowing the lawn!\n");

            } else if (this.type.toLowerCase().equals(botTypes[5])) {
                System.out.println(
                        this.name + " is not specialized in this task, and it will take longer to complete the task.");
                System.out.println(this.name + " has begun mowing the lawn!");
                Thread.sleep(22000);
                this.totalTime += 22000;
                System.out.println(this.name + " has finished mowing the lawn!\n");
            } else {
                System.out.println(this.name + " has begun mowing the lawn!");
                Thread.sleep(20000);
                this.totalTime += 20000;
                System.out.println(this.name + " has finished mowing the lawn!\n");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void leaves() {
        try {
            if (this.type.toLowerCase().equals(botTypes[4])) {
                System.out.println(
                        this.name + " is specialized in this task, and it will complete the task in a shorter time.");
                System.out.println(this.name + " has begun raking the leaves!");
                Thread.sleep(17500);
                this.totalTime += 17500;
                System.out.println(this.name + " has finsihed raking the leaves!\n");
            } else if (this.type.toLowerCase().equals(botTypes[0]) || this.type.toLowerCase().equals(botTypes[1])
                    || this.type.toLowerCase().equals(botTypes[2])) {
                System.out.println(
                        this.name + " is specialized in this task, and it will complete the task in a shorter time.");
                System.out.println(this.name + " has begun raking the leaves!");
                Thread.sleep(17000);
                this.totalTime += 17000;
                System.out.println(this.name + " has finsihed raking the leaves!\n");
            } else if (this.type.toLowerCase().equals(botTypes[5])) {
                System.out.println(
                        this.name + " is not specialized in this task, and it will take longer to complete the task.");
                System.out.println(this.name + " has begun raking the leaves!");
                Thread.sleep(19000);
                this.totalTime += 19000;
                System.out.println(this.name + " has finsihed raking the leaves!\n");
            } else {
                System.out.println(this.name + " has begun raking the leaves!");
                Thread.sleep(18000);
                this.totalTime += 18000;
                System.out.println(this.name + " has finsihed raking the leaves!\n");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void dog() {
        try {
            if (this.type.toLowerCase().equals(botTypes[0]) || this.type.toLowerCase().equals(botTypes[1])
                    || this.type.toLowerCase().equals(botTypes[2]) || this.type.toLowerCase().equals(botTypes[5])) {
                System.out.println(
                        this.name + " is not specialized in this task, and it will take longer to complete the task.");
                System.out.println(this.name + " has begun gving the dog a bath!");
                Thread.sleep(16000);
                this.totalTime += 16000;
                System.out.println(this.name + " has finished bathing the dog!\n");
            } else {
                System.out.println(this.name + " has begun gving the dog a bath!");
                Thread.sleep(14500);
                this.totalTime += 14500;
                System.out.println(this.name + " has finished bathing the dog!\n");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void bake() {
        try {
            if (this.type.toLowerCase().equals(botTypes[4])) {
                System.out.println(
                        this.name + " is specialized in this task, and it will complete the task in a shorter time.");
                System.out.println(this.name + " has begun baking some cookies!");
                Thread.sleep(7000);
                this.totalTime += 7000;
                System.out.println(this.name + " has finished baking cookies!\n");

            } else {
                System.out.println(this.name + " has begun baking some cookies!");
                Thread.sleep(8000);
                this.totalTime += 8000;
                System.out.println(this.name + " has finished baking cookies!\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void car() {
        try {
            if (this.type.toLowerCase().equals(botTypes[4]) || this.type.toLowerCase().equals(botTypes[4])) {
                System.out.println(
                        this.name + " is specialized in this task, and it will complete the task in a shorter time.");
                System.out.println(this.name + " has begun washing the car!");
                Thread.sleep(15000);
                this.totalTime += 15000;
                System.out.println(this.name + " has finished washing the car!\n");
            } else {
                System.out.println(this.name + " has begun washing the car!");
                Thread.sleep(20000);
                this.totalTime += 20000;
                System.out.println(this.name + " has finished washing the car!\n");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public String getName() {
        return this.name;

    }

    public String getType() {
        return this.type;
    }

    public int getTime() {
        return this.totalTime;
    }
}
