package ch9;

public class Ex9_2 {
	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D(1, 2, 3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?" + (p1==p2));
		System.out.println("p1.equals(p2)?" + p1.equals(p2));
	}
}

class Point3D{
	int x, y, z;
	
	Point3D() {
		this(0, 0, 0);
	}
	
	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public boolean equals(Object obj) {
		// 1) 인스턴스 변수 x, y, z	를 비교하도록 오버라이딩
		if(obj instanceof Point3D) {
			Point3D p = (Point3D)obj;
			return p.x==x && p.y==y && p.z==z;
		}
		
		return false;
	}
	
	public String toString() {
		// 2) 인스턴슨 변수 x, y, z의 내용을 출력하도록 오버라이딩 
		return "[" + x + "," + y + "," + z +"]";
	}
}