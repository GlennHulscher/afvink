public class DNA extends Sequentie {
    @Override
    public String getNtSeq() {
        return super.getNtSeq();
    }

    public DNA() {
        super();
    }

    @Override
    public void informatie() {
        super.informatie();
    }

    @Override
    public boolean checkSequentie(String ntSeq) {
        for (int i = 0, n = ntSeq.length(); i < n; i++){
            char c = ntSeq.charAt(i);
            String letter = Character.toString(c);
            if (!letter.matches("A|T|C|G")) {
                return false;
            }
        }

        return true;
    }

    public DNA(String ntSeq) throws Exception { //constructor is altijd public en dan naam van classe
        super(ntSeq);
    }
}