// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Processor proc = new Processor();
        int result = 0;

        try{
            proc.CheckArrSize(args);
            proc.CheckCurrSymb(args);
            result = proc.GetSumNumbers(args);
            System.out.println(result);
        } catch(ExcArrElementLess e) {
            System.out.println(e);
        } catch(ExcArrElementMore e) {
            System.out.println(e);
        } catch(ExcMissingNumber e) {
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}