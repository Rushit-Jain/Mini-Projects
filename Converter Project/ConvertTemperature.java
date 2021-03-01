package P2;
import P1.*;
import java.io.*;
public class ConvertTemperature extends ConverterIO
{
    void celcius()
    {
        if(output_unit.equals("F"))
            value2=value1*1.8+32;
        else if(output_unit.equals("K"))
            value2=value1+273.15;
        else if(output_unit.equals("Ra"))
            value2=value1*1.8+32+459.67;
        else if(output_unit.equals("Re"))
            value2=value1*0.8;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void fahrenheit()
    {
        if(output_unit.equals("C"))
            value2=(value1-32)/1.8f;
        else if(output_unit.equals("K"))
            value2=(value1+459.67f)/1.8f;
        else if(output_unit.equals("Ra"))
            value2=value1+459.67f;
        else if(output_unit.equals("Re"))
            value2=(value1-32)/2.25f;
       s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void kelvin()
    {
        if(output_unit.equals("C"))
            value2=value1-273.15f;
        else if(output_unit.equals("F"))
            value2=value1*1.8f-459.67f;
        else if(output_unit.equals("Ra"))
            value2=value1*1.8f;
        else if(output_unit.equals("Re"))
            value2=(value1-273.15f)*0.8f;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void rankine()
    {
        if(output_unit.equals("C"))
            value2=(value1-32-459.67f)/1.8f;
        else if(output_unit.equals("F"))
            value2=value1-459.67f;
        else if(output_unit.equals("K"))
            value2=value1/1.8f;
        else if(output_unit.equals("Re"))
            value2=(value1-32-459.67f)/2.25f;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void reaumur()
    {
        if(output_unit.equals("C"))
            value2=value1*1.25f;
        else if(output_unit.equals("F"))
            value2=value1*2.25f+32;
        else if(output_unit.equals("K"))
            value2=value1*1.25f+273.15f;
        else if(output_unit.equals("Re"))
            value2=value1*2.25f+32+459.67f;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    public void caller() throws IOException
    {
        input(1);
        if(input_unit.equals("C"))
        celcius();
        if(input_unit.equals("F"))
        fahrenheit();
        if(input_unit.equals("K"))
        kelvin();
        if(input_unit.equals("Ra"))
        rankine();
        if(input_unit.equals("Re"))
        reaumur();
        output();
    }
}
