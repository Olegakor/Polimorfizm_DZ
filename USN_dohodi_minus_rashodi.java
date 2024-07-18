package taxes;

public class USN_dohodi_minus_rashodi extends TaxSystem{
    public int calcTaxFor(int debit, int credit) {
        return ((debit-credit)/100)*15;
    }
}
