package lesson3.lab.prob3;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property property : properties) {
//			if (o instanceof House) {
//				House h = (House) o;
				totalRent += property.computeRent();
//			}
//			else if (o instanceof Condo) {
//				Condo h = (Condo) o;
//				totalRent += h.computeRent();
//			}
//			else if (o instanceof Trailer) {
//				Trailer h = (Trailer) o;
//				totalRent += h.computeRent();
//			}
		}
		return totalRent;
	}

//	public static Property[] findPropertyByCity(String city) {
//		Property[] properties = new Property[3];
//
//	}
}
