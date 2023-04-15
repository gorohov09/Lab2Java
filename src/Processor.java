public class Processor implements IFunc, IConst{
    @Override
    public int GetSumNumbers(String[] args) {
        int sum1 = 0;
        int sum2 = 0;

        for (String x : args)
        {
            int number = Integer.parseInt(x);
            if (number < 0)
            {
                if (number % 2 == 1){
                    sum2 += number;
                }
                else {
                    sum1 += number;
                }
            }
        }

        return  sum1 + sum2;
    }

    @Override
    public void CheckArrSize(String[] args) throws ExcArrElementLess, ExcArrElementMore {
        if(args == null){
            throw new NullPointerException();
        }

        if(args.length < MIN_ARRAY_SIZE){
            throw new ExcArrElementLess();
        }
        else if (args.length > MAX_ARRAY_SIZE){
            throw new ExcArrElementMore();
        }
    }

    @Override
    public void CheckCurrSymb(String[] arrayToCheck) throws ExcMissingNumber {
        if(arrayToCheck == null){
            throw new NullPointerException();
        }

        boolean isSucces = false;
        for (String number : arrayToCheck)
        {
            if (number.contains(REQ_SYMB))
            {
                isSucces = true; break;
            }
        }
        if (!isSucces)
        {
            throw new ExcMissingNumber();
        }
    }

}
