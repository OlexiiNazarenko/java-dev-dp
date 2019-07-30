package envelopes;

import java.util.ArrayList;

public class EnvelopeStorage {
    private ArrayList<Envelope> envelopes; // = new ArrayList<>()

    public EnvelopeStorage() {}

    public void constructEnvelopesFromParametersArray(double[] parametersArray) throws IndexOutOfBoundsException, NullPointerException {
        for (int i = 0; i < parametersArray.length; i = i + 2) {
            envelopes.add(new Envelope(parametersArray[i], parametersArray[i + 1]));
        }
    }

    public ArrayList<Envelope> getEnvelopes() {
        return envelopes;
    }
}
