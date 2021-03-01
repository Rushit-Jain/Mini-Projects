package P2;
import P1.*;
import java.io.*;
public class ConvertNumberSystem extends ConverterIO
{
    void baseN()
    {
        int integer_part,i,n,digit;
        double fraction_part;
        integer_part=(int)value2;
        fraction_part=value2-integer_part;
        val2.setLength(0);
        n=Integer.parseInt(output_unit);
        while(integer_part!=0)
        {
            digit=integer_part % n;
            if(digit>=10 && digit<=15)
                val2.append((char)(digit+55));
            else
                val2.append(digit);
            integer_part /= n;
        }
        val2.reverse();
        if(fraction_part !=0)
        {   val2.append(".");
            for(i=1 ; i<=precision && fraction_part!=0 ; i++)
            {
                digit=(int)(fraction_part * n);
                if(digit>=10 && digit<=15)
                    val2.append((char)(digit+55));
                else
                    val2.append(digit);
                fraction_part = (fraction_part * n)-digit;
            }
        }
        s2 = "("+val2.toString()+")"+output_unit;
    }
    
    void base10()
    {
        int i,digit;
        char ch;
        StringBuffer fraction_part = new StringBuffer("") ;
        StringBuffer integer_part = new StringBuffer("") ;
        for(i=0 ; i<=(val1.length()-1) ; i++)
            if(val1.charAt(i)== '.')
                break;
        if(i== val1.length())
            integer_part.append(val1);
        else
        {
            integer_part.append(val1.substring(0,i));
            fraction_part.append(val1.substring(i+1,val1.length()));
        }
        int n = Integer.parseInt(input_unit);
        for(i=integer_part.length()-1 ; i>=0 ; i--)
        {
            ch=integer_part.charAt(i);
            if(ch>='A' && ch<='F')
                digit = ch-55;
            else if(ch>='a' && ch<='f')
                digit = ch-'a'+10;
            else
                digit = ch-48;
            value2 += digit * (int)Math.round(Math.pow(n,integer_part.length()-1-i));
        }
        if(!(fraction_part.equals("")))
        {
            for(i=0 ; i < fraction_part.length() ; i++)
            {
                ch=fraction_part.charAt(i);
                if(ch>='A' && ch<='F')
                    digit = ch-55;
                else if(ch>='a' && ch<='f')
                    digit = ch-'a'+10;
                else
                    digit = ch-48;
                value2 += digit * Math.pow(n,-i-1);
            }
        }
        val2.append(value2);
        s2 = "(" + val2.toString() +")" + output_unit;
    }
    
    public void caller() throws IOException
    {
        input(5);
        int n = Integer.parseInt(output_unit);
        if(n == 10)
            base10();
        else if( n>=2 && n<=16 )
        {
            base10();
            baseN();
        }
        output();
    }
}
