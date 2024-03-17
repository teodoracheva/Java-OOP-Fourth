public class Ford extends Car {
    private int year;
    private int manufacturerDiscount;

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public int getManufacturerDiscount(){
        return manufacturerDiscount;
    }
    public void setManufacturerDiscount(int manufacturerDiscount){
        this.manufacturerDiscount = manufacturerDiscount;
    }

    //Предефинирайте метода getSalePrice на супер-класа със следното правило:
    // Продажната цена = редовната цена – отстъпката на производителя
    public double getSalePrice(){
        return getRegularPrice() - getManufacturerDiscount();
    }
}
