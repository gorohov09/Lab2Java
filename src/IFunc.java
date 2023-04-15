public interface IFunc {
    public int GetSumNumbers(String args[]);
    public void CheckArrSize(String[] args) throws ExcArrElementLess, ExcArrElementMore;
    public void CheckCurrSymb(String[] arrayToCheck) throws ExcMissingNumber;
}
