package OptionalClass;

import java.util.Optional;

public class Two {
	    String address;
	    String defaultAddress = "India";
	public static void main(String[] args) {
		Two t = new Two();
		Optional<String> check = Optional.ofNullable(t.address);
		System.out.println(check.orElse(t.defaultAddress));
	}
}
