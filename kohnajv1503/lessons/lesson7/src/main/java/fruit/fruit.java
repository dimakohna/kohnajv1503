package fruit;

public class fruit {
    String color;
    double weight;
    String taste;
    public fruit ( String color, double weight,String taste ){
        this.color = color;
        this. weight = weight;
        this. taste = taste;

    }
    public fruit (){
        color ="green";
        weight = 0.125;
        taste = "delicious";

    }
    public fruit(double weight){
      this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight<0){
            this.weight=weight*(-1);

        }else {this.weight=weight;}
    }
}
