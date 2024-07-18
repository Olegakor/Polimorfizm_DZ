package taxes;

public class USN_dohodi extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (debit/100)*6;
    }
}
