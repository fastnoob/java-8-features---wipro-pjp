var HashMap = Java.type("java.util.HashMap");
countryCapitals = new HashMap();
countryCapitals.put("India","New Delhi");
countryCapitals.put("Japan","Tokyo");
countryCapitals.put("China","Bejjing");
countryCapitals.put("Spain","Madrid");
countryCapitals.put("France","Paris");

	for (var i in countryCapitals) {
    print(i+" = "+countryCapitals[i]);
} 