package P2;
import P1.*;
import java.io.*;
public class ConvertLength extends ConverterIO
{
    void metre()
    {
        if(output_unit.equals("cm"))
            value2=value1*100;
        else if(output_unit.equals("mm"))
            value2=value1*1000;
        else if(output_unit.equals("in"))
            value2=value1*39.3701;
        else if(output_unit.equals("ft"))
            value2=value1*3.28084;
        else if(output_unit.equals("km"))
            value2=value1*0.001;
        else if(output_unit.equals("yd"))
            value2=value1*1.09361;
        else if(output_unit.equals("mi"))
            value2=value1*0.000621371;
        else if(output_unit.equals("AU"))
            value2=value1*6.68459e-12;
        else if(output_unit.equals("ly"))
            value2=value1*1.057e-16;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void cmetre()
    {
        if(output_unit.equals("m"))
            value2=value1*0.01;
        else if(output_unit.equals("mm"))
            value2=value1*10;
        else if(output_unit.equals("in"))
            value2=value1*0.393701;
        else if(output_unit.equals("ft"))
            value2=value1*0.0328084;
        else if(output_unit.equals("km"))
            value2=value1*1e-5;
        else if(output_unit.equals("yd"))
            value2=value1*0.0109361;
        else if(output_unit.equals("mi"))
            value2=value1*621371e-6;
        else if(output_unit.equals("AU"))
            value2=value1*6.68459e-14;
        else if(output_unit.equals("ly"))
            value2=value1*1.057e-18;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void mmetre()
    {
        if(output_unit.equals("cm"))
            value2=value1*0.1;
        else if(output_unit.equals("m"))
            value2=value1*0.001;
        else if(output_unit.equals("in"))
            value2=value1*0.0393701;
        else if(output_unit.equals("ft"))
            value2=value1*0.00328084;
        else if(output_unit.equals("km"))
            value2=value1*1e-6;
        else if(output_unit.equals("yd"))
            value2=value1*0.00109361;
        else if(output_unit.equals("mi"))
            value2=value1*6.21371e-7;
        else if(output_unit.equals("AU"))
            value2=value1*6.68459e-15;
        else if(output_unit.equals("ly"))
            value2=value1*1.057e-19;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void inch()
    {
        if(output_unit.equals("cm"))
            value2=value1*2.54;
        else if(output_unit.equals("mm"))
            value2=value1*25.4;
        else if(output_unit.equals("m"))
            value2=value1*0.0254;
        else if(output_unit.equals("ft"))
            value2=value1*0.0833333;
        else if(output_unit.equals("km"))
            value2=value1*2.54e-5;
        else if(output_unit.equals("yd"))
            value2=value1*0.0277778;
        else if(output_unit.equals("mi"))
            value2=value1*1.57828e-5;
        else if(output_unit.equals("AU"))
            value2=value1*1.69789e-13;
        else if(output_unit.equals("ly"))
            value2=value1*2.68478e-18;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void foot()
    {
        if(output_unit.equals("cm"))
            value2=value1*30.48;
        else if(output_unit.equals("mm"))
            value2=value1*304.8;
        else if(output_unit.equals("in"))
            value2=value1*12;
        else if(output_unit.equals("m"))
            value2=value1*0.3048;
        else if(output_unit.equals("km"))
            value2=value1*0.0003048;
        else if(output_unit.equals("yd"))
            value2=value1*0.3333333;
        else if(output_unit.equals("mi"))
            value2=value1*0.000189394;
        else if(output_unit.equals("AU"))
            value2=value1*2.03746e-12;
        else if(output_unit.equals("ly"))
            value2=value1*3.22174e-17;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void kmetre()
    {
        if(output_unit.equals("cm"))
            value2=value1*100000;
        else if(output_unit.equals("mm"))
            value2=value1*1000000;
        else if(output_unit.equals("in"))
            value2=value1*39370.1;
        else if(output_unit.equals("ft"))
            value2=value1*3280.84;
        else if(output_unit.equals("m"))
            value2=value1*1000;
        else if(output_unit.equals("yd"))
            value2=value1*1093.61;
        else if(output_unit.equals("mi"))
            value2=value1*0.621371;
        else if(output_unit.equals("AU"))
            value2=value1*6.68459e-9;
        else if(output_unit.equals("ly"))
            value2=value1*1.057e-13;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void yard()
    {
        if(output_unit.equals("cm"))
            value2=value1*91.44;
        else if(output_unit.equals("mm"))
            value2=value1*914.4;
        else if(output_unit.equals("in"))
            value2=value1*36;
        else if(output_unit.equals("ft"))
            value2=value1*3;
        else if(output_unit.equals("km"))
            value2=value1*0.0009144;
        else if(output_unit.equals("m"))
            value2=value1*0.9144;
        else if(output_unit.equals("mi"))
            value2=value1*0.000568182;
        else if(output_unit.equals("AU"))
            value2=value1*6.11239e-12;
        else if(output_unit.equals("ly"))
            value2=value1*9.66522e-17;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void mile()
    {
        if(output_unit.equals("cm"))
            value2=value1*160934;
        else if(output_unit.equals("mm"))
            value2=value1*1.609e+6;
        else if(output_unit.equals("in"))
            value2=value1*63360;
        else if(output_unit.equals("ft"))
            value2=value1*5280;
        else if(output_unit.equals("km"))
            value2=value1*1.60934;
        else if(output_unit.equals("yd"))
            value2=value1*1760;
        else if(output_unit.equals("m"))
            value2=value1*1609.34;
        else if(output_unit.equals("AU"))
            value2=value1*1.07578e-8;
        else if(output_unit.equals("ly"))
            value2=value1*1.70108e-13;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void aunit()
    {
        if(output_unit.equals("cm"))
            value2=value1*1.496e+13;
        else if(output_unit.equals("mm"))
            value2=value1*1.496e+14;
        else if(output_unit.equals("in"))
            value2=value1*5.89e+12;
        else if(output_unit.equals("ft"))
            value2=value1*4.908e+11;
        else if(output_unit.equals("km"))
            value2=value1*1.496e+8;
        else if(output_unit.equals("yd"))
            value2=value1*1.636e+11;
        else if(output_unit.equals("mi"))
            value2=value1*9.296e+7;
        else if(output_unit.equals("m"))
            value2=value1*1.496e+11;
        else if(output_unit.equals("ly"))
            value2=value1*1.58125e-5;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void lyear()
    {
        if(output_unit.equals("cm"))
            value2=value1*9.461e+17;
        else if(output_unit.equals("mm"))
            value2=value1*9.461e+18;
        else if(output_unit.equals("in"))
            value2=value1*3.725e+17;
        else if(output_unit.equals("ft"))
            value2=value1*3.104e+16;
        else if(output_unit.equals("km"))
            value2=value1*9.461e+12;
        else if(output_unit.equals("yd"))
            value2=value1*1.035e+16;
        else if(output_unit.equals("mi"))
            value2=value1*5.879e+12;
        else if(output_unit.equals("AU"))
            value2=value1*63241.1;
        else if(output_unit.equals("m"))
            value2=value1*9.461e+15;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    public void caller() throws IOException
    {
        input(4);
        if(input_unit.equals("m"))
            metre();
        else if(input_unit.equals("cm"))
            cmetre();
        else if(input_unit.equals("mm"))
            mmetre();
        else if(input_unit.equals("in"))
            inch();
        else if(input_unit.equals("ft"))
            foot();
        else if(input_unit.equals("km"))
            kmetre();
        else if(input_unit.equals("yd"))
            yard();
        else if(input_unit.equals("mi"))
            mile();
        else if(input_unit.equals("AU"))
            aunit();
        else if(input_unit.equals("ly"))
            lyear();
        output();
    }
}
