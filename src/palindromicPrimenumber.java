class Solution{

    //isPrime method returns true or false by checking if the
    //number is prime or not
    static boolean isPrime(int num){
        int count=0;
        //if any number other than 1 and the number itself
        //divides the number with remainder 0,then counter gets incremented
        for(int i=2;i<num;i++){

            if((num%i)==0){
                count=count+1;
            }
        }
        //if the count value is 0, means
        //the number doesn't have any other factor except 1 and itself
        //so,it is ap prime n umber and method returns true
        if(count==0){
            return true;
        }
        //else returns false;
        else{
            return false;
        }


    }

    //isPalindrome method to check if the number is palindrome or not
    static boolean isPalindrome(int num){
        //we reverse the umber by dividing it with 10 and
        //go on adding up the remainders by multiplying them with 10
        int temp=num;
        int rem,sum=0;
        while(num>0){
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;

        }
        //after getting the reverse of the number we
        //checks it wih the original number
        //if both are same,then it is a palindrome
        if(sum==temp){
            return true;
        }
        //else not a palindrome
        else{
            return false;
        }


    }
    //main method

    public static void main(String [] args){
        //a loop that traverse from 1 to 100000
        for(int i=1;i<=100000;i++){
            //checking each number if it is a prime and palindrome
            if((i!=1&&isPrime(i)) && (isPalindrome(i)) ){
                System.out.println(i);
            }
        }


    }
}