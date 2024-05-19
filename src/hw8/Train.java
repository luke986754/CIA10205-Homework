package hw8;

import java.util.Objects;

public class Train implements Comparable<Train> {
/*	請設計一個Train類別，並包含以下屬性: 班次number，型別為int；車種type，型別為String
 *  出發地start，型別為String；目的地dest，型別為String；票價price，型別為double
	設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
	需使用的集合裡- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
				- (1254, “區間”, “屏東”, “基隆”, 700)
				- (118, “自強”, “高雄”, “台北”, 500)
				- (1288, “區間”, “新竹”, “基隆”, 400)
				- (122, “自強”, “台中”, “花蓮”, 600)
				- (1222, “區間”, “樹林”, 七堵, 300)
				- (1254, “區間”, “屏東”, “基隆”, 700
*/
	public int number;
	public String type;
	public String start;
	public String dest;
	public double price;
	
	public int compareTo(Train aTrain) {
		if (this.number > aTrain.number) {
			return 1;
		}else if(this.number == aTrain.number) {
			return 0;
		}else {
			return -1;
		}
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(number, type);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number && Objects.equals(type, other.type);
	}
	
	public String toString() {
		return "班次: " + number + " , " + "車種: " + type + " , " + "出發地: " + start + " , " + "目的地: " + dest + " , " + "票價: " + price;
	}


	public Train() {
		
	}
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	} 
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	} 
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	} 
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	} 
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	
	
}
