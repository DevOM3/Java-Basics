import java.util.Vector;

class VecCon{
	public static void main(String []ar){
		Vector v = new Vector();
		Vector v1 = new Vector(2);
		Vector v2 = new Vector(2, 1);

		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v);

		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1);

		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.add(10);
		v2.add(20);
		v2.add(30);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println(v2);
	}
}