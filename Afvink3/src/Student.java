public class Student {

    private String naam;  //instance variabele
    private int leeftijd = 18; //instance variabele
    private static int minLeeftijd = 18;  //class variabele
    private int studentnummer = 0000;

    public Student(String naam){  //Constructor een
        this.naam = naam;
    }

    public Student(int studentnummer) {
        this.studentnummer = studentnummer;
    }

    public Student() {

    };

    public Student(String naam, int leeftijd, int studentnummer){// Overloaded constructor twee
        this.naam = naam;
        setLeeftijd(leeftijd);
        this.studentnummer = studentnummer;
    }

    public void setLeeftijd(int getal) {
        if (getal < getMinLeeftijd()||getal>80) {
            System.out.println("De leeftijd van "+getal+" is geen toegestane leeftijd!");
        } else {
            leeftijd = getal;
        }
    }

    public void info(){
        System.out.println("Dit is student "+getNaam());
        System.out.println("Met een leeftijd van "+leeftijd);
        System.out.println("Het studentnummer is "+studentnummer+"\n");
    }

    public static int getMinLeeftijd() {
        return minLeeftijd;
    }

    public static void setMinLeeftijd(int aMinLeeftijd) {
        minLeeftijd = aMinLeeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
