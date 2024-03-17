public class Sedan extends Car {
    private int length;

    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    //Предефинирайте метода getSalePrice
    // на супер-класа със следното правило: Ако length > 20, 5% отстъпка от редовната цена,
    // иначе 10% отстъпка
    public double getSalePrice(){
        if(length > 20){
            return this.getRegularPrice() * 0.95;
        } else {
            return this.getRegularPrice() * 0.90;
        }
    }
}
