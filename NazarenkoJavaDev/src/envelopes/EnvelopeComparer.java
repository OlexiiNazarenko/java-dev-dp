package envelopes;

class EnvelopeComparer {

    public static String checkInsertionPossibility (Envelope e1, Envelope e2) {
        if((e1.height > e2.height) & (e1.width > e2.width)) {
            return  "Second envelope fits into first envelope.";
        } else if((e1.height < e2.height) & (e1.width < e2.width)){
            return "First envelope fits into second envelope.";
        }
        return  "Envelopes do not fit into each other.";
    }
}
