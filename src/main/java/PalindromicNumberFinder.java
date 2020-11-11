public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
        int init = num;
        while (!testPalindromicNum(num))
            num++;
        return num - init;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
        return new Integer(num).toString() == reverseNum(num);
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
        String numString = new Integer(num).toString();
        String reverseNumString = "";
        for (int i = numString.length() - 1; i >= 0; i--)
            reverseNumString += numString.charAt(i);
        return reverseNumString;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
