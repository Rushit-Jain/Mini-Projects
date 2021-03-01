import P2.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        int choice=0,choice2=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do
        {
            System.out.println("MENU:\n\n 1:Temperature\n 2:Mass\n 3:Currency\n 4:length\n 5:Number sysytem\n 6:exit");
            choice=Integer.parseInt(br.readLine());
            ConvertTemperature a = new ConvertTemperature();
            ConvertMass b = new ConvertMass();
            ConvertCurrency c = new ConvertCurrency();
            ConvertLength d = new ConvertLength();
            ConvertNumberSystem e =new ConvertNumberSystem();
            if(choice == 1)
            {
                do
                {
                    a.caller();
                    System.out.println("DO YOU WANT TO ENTER ANOTHER TEMPERATURE:\n1.YES\n2.NO");
                    choice2=Integer.parseInt(br.readLine());
                }while(choice2!=2);
            }
            else if(choice == 2)
            {
                do
                {
                    b.caller();
                    System.out.println("DO YOU WANT TO ENTER ANOTHER MASS:\n1.YES\n2.NO");
                    choice2=Integer.parseInt(br.readLine());
                }while(choice2!=2);
            }
            else if(choice == 3)
            {
                do
                {
                    c.caller();
                    System.out.println("DO YOU WANT TO ENTER ANOTHER CURRENCY:\n1.YES\n2.NO");
                    choice2=Integer.parseInt(br.readLine());
                }while(choice2!=2);
            }
            else if(choice == 4)
            {
                do
                {
                    d.caller();
                    System.out.println("DO YOU WANT TO ENTER ANOTHER LENGTH:\n1.YES\n2.NO");
                    choice2=Integer.parseInt(br.readLine());
                }while(choice2!=2);
            }
           
            else if(choice == 5)
            {
                do
                {
                    e.caller();
                    System.out.println("DO YOU WANT TO ENTER ANOTHER BASE-N NUMBER:\n1.YES\n2.NO");
                    choice2=Integer.parseInt(br.readLine());
                }while(choice2!=2);
            }
            else if(choice !=6)
            {
                System.out.println("INVALID CHOICE\n");
            }
        }while(choice!=6);
        System.out.println("END OF PROGRAM");
    }
}
