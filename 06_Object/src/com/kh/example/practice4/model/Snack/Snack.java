package com.kh.example.practice4.model.Snack;

public class Snack {

	public String kind;
	public String name;
	public String flavor;
	public int numOf;
	public int price;
	
	public Snack() {}
	public Snack(String kind,String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
		
		
	}
		
	
			
		@Override
	public String toString() {
		return "Snack [kind=" + kind + ", name=" + name + ", flavor=" + flavor + ", numOf=" + numOf + ", price=" + price
				+ "]";
	}
		public String getKind() {
			return kind;
		}			
		public void setKind(String kind) {
			this.kind = kind;
		}
		public String getName() {
			return name;
		}
        public void setName(String name) {
        	this.name = name;
        }
        public String getFlavor() {
        	return flavor;
        }
        public void setFlavor(String flavor) {
        	this.flavor = flavor;
        }
        public int getNumOf() {
			return numOf;
        }
        public void setNumOf(int numOf) {
        	this.numOf = numOf;
        }
        public int getPrice() {
        	return price;
        }
        public void setPrice(int price) {
        	this.price = price;
        }

}

