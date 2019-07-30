package envelopes;

public class ValidatorEnvelope {

    public static double validateArgsType(String arg) throws NumberFormatException {
        return Double.parseDouble(arg);
    }
}
