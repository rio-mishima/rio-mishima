package curriculum_B;

class Person {

   // インスタンスフィールドを定義
  String name;
  int age;
  double height;
  double weight;

  // 人数を数えるクラス変数
  static int count = 0;

  Person(String name, int age, double height, double weight) {

    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;

   // 人数を追加
    count++;
  }
  
  double bmi() {

    return this.weight / (this.height * this.height);
  }

  void print() {

    System.out.println("名前は" + this.name + "です");
    System.out.println("年は" + this.age + "です");
    System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
  }
}