public class Truck extends Car {
    private int weight;

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    //Предефинирайте метода getSalePrice на
    // супер-класа със следното правило: Ако weight > 2000, 10% отстъпка от редовната цена,
    // иначе 20% отстъпка
    public double getSalePrice(){
        if(weight > 2000){
            return this.getRegularPrice() * 0.90;
        } else {
            return this.getRegularPrice() * 0.80;
        }
    }
}

