public class Reserve_String{
    public static void main(String[] args) {
        String inputedData = "There is a tide in the affairs of men";  
        
        
            System.out.print(ReverseString(inputedData);
        }
    }

    public static String ReverseString(String userInput) {
        StringBuilder reverse = new StringBuilder(); 

        for (int index = userInput.length() - 1; index >= 0; index--) {
            reverse.append(userInput.charAt(index)); 
        }

        return reverse.toString();
    }
}	






