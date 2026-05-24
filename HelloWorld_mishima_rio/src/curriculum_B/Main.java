package curriculum_B;

class Main {

  public static void main(String[] args) {

    Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

    // 情報表示
    person1.print();

    // 合計人数表示
    System.out.println("合計" + Person.count + "人です");
  }
}