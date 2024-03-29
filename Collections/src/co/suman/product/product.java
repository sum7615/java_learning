package co.suman.product;

import java.util.Objects;

public class product {
	private int id;
	private String Name;
	private double price;
	public product() {
		
	}
	
	public product(int id, String name, double price) {
		super();
		this.id = id;
		Name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Name, id, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		product other = (product) obj;
		return Objects.equals(Name, other.Name) && id == other.id
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return "product [id=" + id + ", Name=" + Name + ", price=" + price + "]";
	}
}
