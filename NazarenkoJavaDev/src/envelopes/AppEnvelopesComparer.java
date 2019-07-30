package envelopes;

import service.ConsoleWriter;

public class AppEnvelopesComparer {
    public static void main(String[] args) {
        ParamsEnvelopesCompare params = new ParamsEnvelopesCompare();
        params.readParams();
        if(params.getValidity()){
            EnvelopeStorage es = new EnvelopeStorage();
            try {
                es.constructEnvelopesFromParametersArray(params.getParams());
                String result = EnvelopeComparer.checkInsertionPossibility(es.getEnvelopes().get(0), es.getEnvelopes().get(1));
                ConsoleWriter.printText(result);
            } catch (Exception e) {
                ConsoleWriter.printText(e.getMessage());
            }
        }
    }
}
