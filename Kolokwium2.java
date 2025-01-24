class Zadanie6<T> {
	
	public static <T> Boolean isEqualOrNull(T arg1, T arg2) {
		
		if((arg1.equals(arg2)) || ((arg1 == null) && (arg2 == null)))
			return true;
		else
			return false;
		
	}
}

interface Converter {
	
	public Double convertToEuro(Double amount);
	public Double convertToUSD(Double amount);
	public Double getConversionRate(String currency);
	
}

class CurrencyConverter implements Converter {
	
	public Double convertToEuro(Double amount) {
		Double kursPLN = 4.21; 
		return kursPLN * amount;
	}
	public Double convertToUSD(Double amount) {
		Double kursPLN = 4.01;
		return kursPLN * amount;
	}
	
	public Double getConversionRate(String currency) {
		Double cr1;
		Double cr2;
		String[] cur = currency.split("=");
		cr1 = Double.valueOf(cur[0].toString());
		cr2 = Double.valueOf(cur[1].toString());
		return cr1 / cr2;
	}
	
}
	
class UnitConverter implements Converter {
	
	public Double convertToEuro(Double amount) {
		Double kursPLN = 4.21; 
		return kursPLN * amount;
	}
	public Double convertToUSD(Double amount) {
		Double kursPLN = 4.01;
		return kursPLN * amount;
	}
	
	public Double getConversionRate(String currency) {
		Double cr1;
		Double cr2;
		String[] cur = currency.split("=");
		cr1 = Double.valueOf(cur[0].toString());
		cr2 = Double.valueOf(cur[1].toString());
		return cr1 / cr2;
	}
}
	


class Triple<T>{
	private T first;
	private T second;
	private T third;
	
	public Triple(T f, T s, T t) {
		this.first = f;
		this.second = s;
		this.third = t;
	}
	
	public T getFirst() {
		return this.first;
	}
	
	public T getSecond() {
		return this.second;
	}
	
	public T getThird() {
		return this.third;
	}
	
	public void setFirst(T newFirst) {
		this.first = newFirst;
	}
	
	public void setSecond(T newSecond) {
		this.second = newSecond;
	}
	
	public void setThird(T newThird) {
		this.third = newThird;
	}
}


interface Sensor{
	
	public abstract Double readValue();
	public abstract String getStatus();
	public abstract void reset();
}

class TemperatureSensor implements Sensor{
	public Double readValue() {
		Double qq = 10.00;
		return qq;
	}
	
	public String getStatus() {
		String qq = "STATUS TEMPERATURY";
		return qq;
	}
	
	public void reset() {
		System.out.println("Wykonano reset systemu temperatury");
	}
}

class PressureSensor implements Sensor{
	public Double readValue() {
		Double qq = 1013.00;
		return qq;
	}
	
	public String getStatus() {
		String qq = "STATUS CIŚNIENIA";
		return qq;
	}
	
	public void reset() {
		System.out.println("Wykonano reset systemu ciśnienia");
	}
}



abstract class WorkTool{
	
	protected String name;
	protected Integer productionYear;
	
	public abstract void use();
	
}

class Hammer extends WorkTool{
	public void use() {
		System.out.println("Użycie młotka");
	}
}

class Screwdriver extends WorkTool{
	public void use() {
		System.out.println("Użycie śrubokręta");
	}
}

class Saw extends WorkTool{
	public void use() {
		System.out.println("Użycie piły");
	}
}

class Vehicle {
	protected String brand;
	protected String model;
	
	public Vehicle(String b, String m) {
		this.brand = b;
		this.model = m;
	}
}

class Car extends Vehicle {
	
	private Integer numbersOfDoors;

	public Car(String b, String m, Integer nod ) {
		super(b, m);
		this.numbersOfDoors = nod;	
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public Integer getNumberOfDoors() {
		return this.numbersOfDoors;
	}
	
}


public class Kolokwium2 {

	public static void main(String[] args) {
		
		// Zadanie 1
		
		Car c = new Car("Suzuki","Swift",5);
		System.out.println(c.getBrand());
		System.out.println(c.getModel());
		System.out.println(c.getNumberOfDoors());
		
		// Zadanie 2
		
		Hammer h = new Hammer();
		h.use();
		Screwdriver s = new Screwdriver();
		s.use();
		Saw sw = new Saw();
		sw.use();
		
		// Zadanie 3
		
		TemperatureSensor ts = new TemperatureSensor();
		System.out.println(ts.readValue());
		System.out.println(ts.getStatus());
		ts.reset();
		
		PressureSensor ps = new PressureSensor();
		System.out.println(ps.readValue());
		System.out.println(ps.getStatus());
		ps.reset();
		
		// Zadanie 4
		
		Triple<String> t1 = new Triple<>("first", "second", "third");
		System.out.println(t1.getFirst() + " " + t1.getSecond() + " " + t1.getThird());
		t1.setFirst("pierwszy");
		t1.setSecond("drugi");
		t1.setThird("trzeci");
		System.out.println(t1.getFirst() + " " + t1.getSecond() + " " + t1.getThird());
		
		Triple<Integer> t2 = new Triple<>(1, 2, 3);
		System.out.println(t2.getFirst() + " " + t2.getSecond() + " " + t2.getThird());
		t2.setFirst(10);
		t2.setSecond(20);
		t2.setThird(30);
		System.out.println(t2.getFirst() + " " + t2.getSecond() + " " + t2.getThird());
		
		// Zadanie 5
		
		CurrencyConverter cc = new CurrencyConverter();
		System.out.println(cc.convertToEuro(100.00));
		System.out.println(cc.convertToUSD(100.00));
		
		UnitConverter uc = new UnitConverter();
		System.out.println(uc.getConversionRate("401.00 = 100.00"));
		
		// Zadanie 6
		
		Zadanie6<String> z6 = new Zadanie6<>();
		System.out.println(z6.isEqualOrNull("",""));
	}

}
