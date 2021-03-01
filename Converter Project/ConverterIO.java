package P1;         
import java.io.*;
    public class ConverterIO
    {
        public String s1,s2,input_unit,output_unit;            
        public double value1,value2;
        public int precision=14;
        public StringBuffer val1 = new StringBuffer("");
        public StringBuffer val2 = new StringBuffer(""); 
        public BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        public void input(int n) throws IOException
        {
            s1=output_unit=s2=input_unit="";
            val1.setLength(0);
            val2.setLength(0);
            value1=value2=0;
            if(n==1)
                System.out.println("Temperature units:\n\n>>Celsius C\n>>Fahrenheit F\n>>Kelvin K\n>>Rankine Ra\n>>Reaumur Re\n");
            else if(n==2)
            {
                System.out.println("Mass units:\n\n>>Metric Tonne t\t>>kilogram kg\t>>gram g\t>>milligram mg\t>>microgram ug");
                System.out.println(">>Long Ton l.t\t>>Short Ton sh.t\t>>Stone st\t>>Pound lb\t>>Ounce oz\n");
            }
            else if(n==3)
            {
            System.out.println("Currencies:\n\n>>Indian Rupee Rs\n>>US Dollar USD\n>>Euro EU\n>>British Pound GBP\n>>Swiss Franc CHF");
            System.out.println(">>Canadian Dollar CAD\n>>Russian Ruble P\n>>Chinese Renminbi Y\n");
            }
            else if(n==4)
            {
            System.out.println("Length units:\n\n>>Metre m\t>>Centimetre cm\t>>Millimetre mm\t>>Inch in\t>>Foot ft\t>>Kilometre km");
            System.out.println(">>Yard yd\t>>Mile mi\t>>Astronomical Unit AU\t>>Light Year ly\n");
            }
            else if(n==5)
            {
                System.out.println("enter input  as eg: (12345)12 or (12345) 12 or (12345)-12 which is read as 12345 to base 12\n");
                System.out.println("Bases that can be given :any value from 2 to 16");
            }
            if(n==5)
            {
                System.out.println("enter value to be converted along with base ");
                int flag=0;
                do
                {
                    s1 = br.readLine();
                    check();
                    int m = Integer.parseInt(input_unit);
                    if(m>=2 && m<=16)
                        flag = 1;
                    else
                    {
                        System.out.println("Invalid Input Enter again:\n");
                        flag = 0;
                    }
                }while(flag == 0);
                System.out.println("enter base of conversion ");
                flag=0;
                do
                {
                    output_unit=br.readLine();
                    int m = Integer.parseInt(output_unit);
                    if(m>=2 && m<=16)
                        flag = 1;
                    else
                    {
                        System.out.println("Invalid Output Base Enter again:\n");
                        flag = 0;
                    }
                }while(flag == 0);
            }
            else
            {
                System.out.println("enter value to be converted along with units ");
                int flag=0;
                do
                {
                    s1 = br.readLine();
                    check();
                    if(input_unit.equals("C")||input_unit.equals("F")||input_unit.equals("K")||input_unit.equals("Ra")||input_unit.equals("Re")||input_unit.equals("t")||input_unit.equals("l.t")||input_unit.equals("sh.t")||input_unit.equals("g")||input_unit.equals("kg")||input_unit.equals("ug")||input_unit.equals("mg")||input_unit.equals("st")||input_unit.equals("lb")||input_unit.equals("oz")||input_unit.equals("Rs")||input_unit.equals("USD")||input_unit.equals("EU")||input_unit.equals("GBP")||input_unit.equals("CHF")||input_unit.equals("CAD")||input_unit.equals("P")||input_unit.equals("Y")||input_unit.equals("m")||input_unit.equals("cm")||input_unit.equals("mm")||input_unit.equals("km")||input_unit.equals("in")||input_unit.equals("ft")||input_unit.equals("yd")||input_unit.equals("mi")||input_unit.equals("AU")||input_unit.equals("ly"))                      
                        flag = 1;
                    else
                    {
                        System.out.println("Invalid Input unit Enter again:\n");
                        flag = 0;
                    }
                }while(flag == 0);
                System.out.println("enter units of conversion ");
                flag=0;
                do
                {
                    output_unit = br.readLine();
                    if(output_unit.equals("C")||output_unit.equals("F")||output_unit.equals("K")||output_unit.equals("Ra")||output_unit.equals("Re")||output_unit.equals("t")||output_unit.equals("l.t")||output_unit.equals("sh.t")||output_unit.equals("g")||output_unit.equals("kg")||output_unit.equals("ug")||output_unit.equals("mg")||output_unit.equals("st")||output_unit.equals("lb")||output_unit.equals("oz")||output_unit.equals("Rs")||output_unit.equals("USD")||output_unit.equals("EU")||output_unit.equals("GBP")||output_unit.equals("CHF")||output_unit.equals("CAD")||output_unit.equals("P")||output_unit.equals("Y")||output_unit.equals("m")||output_unit.equals("cm")||output_unit.equals("mm")||output_unit.equals("km")||output_unit.equals("in")||output_unit.equals("ft")||output_unit.equals("yd")||output_unit.equals("mi")||output_unit.equals("AU")||output_unit.equals("ly"))                      
                        flag = 1;
                    else
                    {
                        System.out.println("Invalid output unit Enter again:\n");
                        flag = 0;
                    }
                }while(flag == 0);
            }       
        }
        
        void check() throws IOException
        {
            int i,len,len2; 
            len=s1.length();
            for(i=0;i<len;i++)
                if(Character.isLetter(s1.charAt(i)) || (s1.charAt(i)) == ' ' || (s1.charAt(i)) == ')' )
                    break;
            if(s1.charAt(0) == '(')
            {
                val1.append(s1.substring(1,i));
                if(s1.charAt(i+1) == ' ' || s1.charAt(i+1) == '-' )
                    input_unit=s1.substring(i+2,len);
                else
                    input_unit=s1.substring(i+1,len);
                    
            }    
            else
            {    
                value1=Double.parseDouble(s1.substring(0,i));
                if(s1.charAt(i) == ' ')
                    input_unit=s1.substring(i+1,len);
                else
                    input_unit=s1.substring(i,len);
            }
            len2=input_unit.length();    
            if(input_unit.charAt(len2-1)=='s' && !input_unit.equals("Rs"))
                input_unit=input_unit.substring(0,len2-1);
        }
        
        public void output()
        {
            System.out.println(s1+" = "+s2);
        }
    
}

