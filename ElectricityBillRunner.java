public class ElectricityBillRunner {
    public static void main(String[] args) {
        ElectricityBill bill = (x,y) ->{
			System.out.println("Bill: " + (x*y) );
        
    };
	bill.calculate(120, 8); 

}
}