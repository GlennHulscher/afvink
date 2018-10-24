public class Translator {

    static final String[] ONE   = {"A", "R", "N", "D", "C", "Q", "E", "G", "H", "I", "L", "K", "M", "F", "P", "S", "T", "W", "Y", "V"};
    static final String[] THREE = { "ALA", "ARG", "ASN", "ASP", "CYS", "GLN", "GLU", "GLY",
            "HIS", "ILE", "LEU", "LYS", "MET", "PHE", "PRO", "SER",
            "THR", "TRP", "TYR", "VAL"
    };

    public static String one2three(String symbol) throws NotAnAA {

        String threeCode = "";
        for (int i = 0; i < ONE.length; i++) {
            if (ONE[i].equals(symbol)) {
                threeCode = THREE[i];
            }
        }

        if (threeCode.equals("")) {
            throw new NotAnAA("Dit is een niet bestaand aminozuur: "+symbol);
        }
        return threeCode;
    }
}


/**
 * Class met custom exception
 *  @Author Martijn van der Bruggen
 *  @Date   21-November-2008
 * Deze class staat in hetzelfde bestand als translator
 * Merk op dat deze class niet public is, hetgeen voorwaardelijk is om in een
 * bestand met een andere naam te staan.
 * Custom exceptions overerven altijd van Exception
 */

class NotAnAA extends Exception {
    public NotAnAA(String message, Throwable cause) {
        super(message, cause);
    }

    public NotAnAA(Throwable cause) {
        super(cause);
    }

    protected NotAnAA(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

   // public NotAnAA() {
        /**
         * call van de constructor van de super class: Exception
         */
     //   super();
    //}

    public NotAnAA(String err) {
        super(err);
    }

}