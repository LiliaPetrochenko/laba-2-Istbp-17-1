package l2;

import java.util.Arrays;


class MyMassiv {
    private String[] massiv1;
    
    MyMassiv() 
    {
        this.massiv1=new String []{"1", "333", "22", "777", "77777", "888"};
    }
    
    public MyMassiv(String str)
    {
        massiv1 = str.split(",");
        System.out.println();
        System.out.print("Массив: ");
        
        for(int i = 0; i < massiv1.length; i++)
        {
            System.out.print(massiv1[i]+" ");
        }
    }
    
    public String Uporyad()
    {
        String[] strArray = massiv1;       
        
        for(int i = 0; i < strArray.length; i++)
        {
            for(int j = 0; j < strArray.length - 1 - i; j++)
            {
                if(strArray[j].length() < strArray[j + 1].length())
                {
                String str1 = strArray[j];
                strArray[j] = strArray[j + 1];
                strArray[j + 1] = str1;
                }
            }
        }

        String a = Arrays.toString(strArray);
        System.out.println(a);
        return a;
    }
    
    
    public boolean Slovo(String word)
    {
        boolean yes = false;
        for (String strArray1 : massiv1) 
        {
            if (strArray1.equals(word)) 
            {
                yes = true;
                break;
            }
        }
        System.out.println(yes);
        return yes;
    }
    
    
    public String Change(int n, int k)
    {
        String z=" ";
        
        if ((n <= massiv1.length) & (k<=massiv1.length))
        {
            z=massiv1[n];
            massiv1[n]=massiv1[k];
            massiv1[k]=z;
        }

        String g = Arrays.toString(massiv1);
        System.out.println(g);
        return g;
    }
}
    

