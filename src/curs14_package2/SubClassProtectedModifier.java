package curs14_package2;

import curs14_package1.ProtectedAccessMofidier;

public class SubClassProtectedModifier extends ProtectedAccessMofidier{

	public static void main(String[] args) {
		SubClassProtectedModifier obj = new SubClassProtectedModifier();
		obj.printMesaj();
		System.out.println(obj.mesaj); 
		// obj.mesaj2; nu merge deoarece mesaj2 e declarat default
	}

}
