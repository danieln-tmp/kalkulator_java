package pl.alx.kalkulator;

public class LogikaKalkulatora {
	private long dziel(long liczba1, long liczba2) {
		if (liczba2 == 0) {
			throw new IllegalArgumentException("Dzielenie przez zero");
		}
		return liczba1 / liczba2;
	}

    public String[] dostepneOperacje() {
        return new String[] { "+", "-", "*", "/" };
    }

    public long oblicz(long liczba1, long liczba2, String operacja) {
        return switch(operacja) {
            case "+" -> liczba1 + liczba2;
            case "-" -> liczba1 - liczba2;
            case "*" -> liczba1 * liczba2;
            case "/" -> liczba1 / liczba2;
            default -> throw new IllegalArgumentException("Nieznana operacja " + operacja);
        };
    }

}
