package fes.aragon;

public class Ejecutar {
	 public static void main(String[] args) {
		Telefonos mobile = MobileFactory.createMobile(Telefonos.BLACKBERRY);
                Telefonos mobile1 = MobileFactory.createMobile(Telefonos.XIAOMI);
                Telefonos mobile2 = MobileFactory.createMobile(Telefonos.IPHONE);
                Telefonos mobile3 = MobileFactory.createMobile(Telefonos.ASUS);
                Telefonos mobile4 = MobileFactory.createMobile(Telefonos.LANIX);
                Telefonos mobile5 = MobileFactory.createMobile(Telefonos.VORAGO);
                
                System.out.println(mobile);
                System.out.println(mobile1);
                System.out.println(mobile2);
                System.out.println(mobile3);
                System.out.println(mobile4);
                System.out.println(mobile5);

	}
}
