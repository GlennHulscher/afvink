public abstract class Sequentie {
    protected String ntSeq;
    private static int count = 0;

    public Sequentie(String ntSeq) throws Exception {
        if (checkSequentie(ntSeq)) {
            setNtSeq(ntSeq);
        } else {
            throw new Exception("Het is geen geldige sequentie");
        }
    }

    public int getCount() {
        return count;
    }

    public String getNtSeq() {
        return ntSeq;
    }

    public Sequentie() {
    }

    public void setNtSeq(String ntSeq) {
        this.ntSeq = ntSeq;
        count++;
    }

    public void informatie() {
        System.out.println("De sequentie die je hebt opgegeven: "+ntSeq);
        System.out.println("De teller staat op: "+getCount());
    }

    public abstract boolean checkSequentie(String ntSeq);
}

