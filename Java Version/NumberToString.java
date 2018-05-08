 //Declaration and initialization of String Arrays to store number values in Word format
     String[] ones = {"Zero", "One","Two","Three","Four","Five","Six","Seven","Eight","Nine", "Ten", 
                        "Eleven", "Twelve", "Thirteen",
                        "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
     String[] teens = {" ", "Ten" , "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                         "Eighteen", "Nineteen"};
     String[] tens = {"Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
     
     System.out.println("Number to Word | App\n");
     System.out.println("This app converts the number you enter into word format");
     System.out.println("Eg: 4560 = Four Thousand Five Hundred and Sixty");
     
     //Initialize scanner for user input
     Scanner userInput = new Scanner(System.in);
     //Store user's input in variable 'num'
     System.out.println("\nPlease type a number (Not negative, and less than Nineteen Million) and press ENTER: ");
     System.out.print("Enter Number here: ");
     int num = userInput.nextInt();
     
     try
     {
         if((num<0) || (num>19999999))
     {
         throw new Exception();
     }
     
     System.out.println("\nYour number: " + num + "\n");
     System.out.print("Result: \n");
     if(num==0)
     {
         System.out.println("Zero");
     }
     
     //find millions
     int mil = num/1000000;        
        if(mil!=0)
        {
            System.out.print(ones[mil] + " million ");
        }
        int rem= num%1000000;
        
     //find hundred thousands   
     int hThou = rem/100000;
     if(hThou!=0)
       {
            System.out.print(ones[hThou] + " hundred");
       }
        rem = rem % 100000;
        
     //find tens of thousands   
     int tThou = rem/10000;
     if(tThou!=0)
        {
            System.out.print(" " + tens[tThou] );
        }
        rem = rem%10000;
        
     //find thousands   
     int thou = rem/1000;
     if(thou!=0)
        {
            System.out.print(" " + ones[thou]);
        }
        rem = rem%1000;
        
    //add the thousand word
    if((hThou!=0) || (tThou!=0) || (thou!=0))
    {
        System.out.print(" thousand");
    }
        
     //find hundreds   
     int hun = rem/100;
        if(hun!=0)
        {
            System.out.print(" " + ones[hun] + " hundred ");
        }
        rem = rem%100;
        
     //return remainder by checking if it is "Ten-Nineteen"   
     if(rem!=0)
     {
         if((rem>=1) && (rem<=19))
        {
            if ((mil != 0) || (hThou != 0) || (tThou != 0) || (thou != 0) || (hun != 0)) {
                System.out.print("and " + ones[rem]);
            } else {
                System.out.print(ones[rem]);
            }
        }
        else
            {
               int ten = rem/10;
               rem = rem%10;
               System.out.print(tens[ten] + " ");
               if(rem!=0)
               {
                    System.out.print(ones[rem]);        
               }
            }
     }
     System.out.println();
    
     }
     catch(Exception e)
     {
         System.out.println("\nDid you really think that would work?");
         System.out.println("Try again with a number bigger than 0 and less than 20 million and learn to read instruction!\n");
     }
     
    }