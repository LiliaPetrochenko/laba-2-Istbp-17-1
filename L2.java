package l2;


public class L2 
{
    public static void main(String[] args) 
    {
        System.out.println("Задание А: Отсортируйте слова в массиве по убыванию длины. ");
        System.out.println("Задание В: Определить входит ли слово, указанное в программе, в массив слов. ");
        System.out.println("Задание С: Переставьте местами слова в предложении, под указанными позициями. ");
        
        String word ="0)Hello";  
        
        MyMassiv obj = new MyMassiv ();
        MyMassiv obj1 = new MyMassiv ();
      
        int n=1, k=5;
        
        System.out.println();
        System.out.println();
        System.out.print("Задание A:");
        obj1.Uporyad();
        System.out.println();
        

        System.out.print("Задание B: ");
        obj.Slovo(word);
        System.out.println();   
            

        System.out.print("Задание C: ");
        obj.Change(n,k);                
    }
}
