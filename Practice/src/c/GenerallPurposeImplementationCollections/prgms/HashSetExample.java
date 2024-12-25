package c.GenerallPurposeImplementationCollections.prgms;

import java.util.HashMap;

class employee{
	String name;
	int age;
	String position;
	employee(String name,int age,String position){
		this.name=name;
		this.age=age;
		this.position=position;
	}
	public String toString() {
		return "Employee[name="+ name +",age ="+age+", position ="+position+"]";
		
	}
}
public class HashSetExample {
	public static void main(String[] args) {
		HashMap<String,employee> hm=new HashMap<>();
		hm.put("E001",new employee("ganesh",24,"manager"));
		hm.put("E002",new employee("syam",25,"developer"));
		hm.put("E003",new employee("kali",27,"design"));
		employee emp=hm.get("E001");  
		System.out.println(emp);
		//hm.remove("E002");
		employee updateemp=hm.get("E002");
		if(updateemp!=null) {
			updateemp.position="senior devop";
			hm.put("E002",updateemp);
			
		}
		int s=hm.size();
		System.out.println(s);
		for(String k:hm.keySet()) {
			System.out.println(k+" :"+hm.get(k));
		}
}
}
