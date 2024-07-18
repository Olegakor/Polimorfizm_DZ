import taxes.*;
public class Company {
    String title;
    public int debit = 0;
    int credit = 0;
    protected String taxSystem = "6%_ot_dohodov";// система налогообложения, НЕЯСНО это int, String или что???

    public Company(String title, String taxSystem) {
        this.title = title;// название компании
        this.taxSystem = taxSystem;//система налогообложения
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit+=amount;
        } else if (amount < 0) {
            credit+=Math.abs(amount);
        } else {
            // ничего не происходит
        }
    }
//    payTaxes()// рассчитывает размер налогов!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public void setTaxSystem(int taxSystem) {
        this.taxSystem = taxSystem;
    }
}
