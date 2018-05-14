package fes.aragon;

public class MobileFactory {
	public static Telefonos createMobile(String type){
            switch (type) {
                case Telefonos.IPHONE:
                    return new IPhone(2, "A9", "A9 GPu");
                case Telefonos.XIAOMI:
                    return new Xiaomi(2,"ARM");
                case Telefonos.BLACKBERRY:
                    return new BlackBerry("Intel");
                case Telefonos.LANIX:
                    return new Lanix(4, "Android", 64);
                case Telefonos.ASUS:
                    return new Asus(4, 128, "Android");
                case Telefonos.VORAGO:
                    return new Vorago (4, "SnapDragon 800");
                default:
                    return null;
            }
	}
}
