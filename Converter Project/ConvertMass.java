package P2; 
import P1.*;
import java.io.*;
public class ConvertMass extends ConverterIO
{
     
    void tonne()
    {
        if(output_unit.equals("st"))
            value2=value1*157.473;
        else if(output_unit.equals("lb"))
            value2=value1*2204.62;
        else if(output_unit.equals("oz"))
            value2=value1*35273.962;
        else if(output_unit.equals("l.t"))
            value2=value1*0.984207;
        else if(output_unit.equals("sh.t"))
            value2=value1*0.984207*1.12;
        else if(output_unit.equals("kg"))
            value2=value1*1000;
        else if(output_unit.equals("g"))
            value2=value1*1000000;
        else if(output_unit.equals("mg"))
            value2=value1*1000000000;
        else if(output_unit.equals("ug"))
            value2=value1*1e12;    
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void kilogram()
    {
        if(output_unit.equals("st"))
            value2=value1*0.157473;
        else if(output_unit.equals("lb"))
            value2=value1*2.20462;
        else if(output_unit.equals("oz"))
            value2=value1*35.273962;
        else if(output_unit.equals("l.t"))
            value2=value1*0.984207e-3;
        else if(output_unit.equals("sh.t"))
            value2=value1*0.984207e-3*1.12;
        else if(output_unit.equals("t"))
            value2=value1*1e-3;
        else if(output_unit.equals("g"))
            value2=value1*1e3;
        else if(output_unit.equals("mg"))
            value2=value1*1e6;
        else if(output_unit.equals("ug"))
            value2=value1*1e9;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void gram()
    {
        if(output_unit.equals("st"))
            value2=value1*0.157473e-3;
        else if(output_unit.equals("lb"))
            value2=value1*2.20462e-3;
        else if(output_unit.equals("oz"))
            value2=value1*35.273962e-3;
        else if(output_unit.equals("l.t"))
            value2=value1*0.984207e-6;
        else if(output_unit.equals("sh.t"))
            value2=value1*0.984207e-6*1.12;
        else if(output_unit.equals("t"))
            value2=value1*1e-6;
        else if(output_unit.equals("kg"))
            value2=value1*1e-3;
        else if(output_unit.equals("mg"))
            value2=value1*1e3;
        else if(output_unit.equals("ug"))
            value2=value1*1e6;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void milligram()
    {
        if(output_unit.equals("st"))
            value2=value1*0.157473e-6;
        else if(output_unit.equals("lb"))
            value2=value1*2.20462e-6;
        else if(output_unit.equals("oz"))
            value2=value1*35.273962e-6;
        else if(output_unit.equals("l.t"))
            value2=value1*0.984207e-9;
        else if(output_unit.equals("sh.t"))
            value2=value1*0.984207e-9*1.12;
        else if(output_unit.equals("t"))
            value2=value1*1e-9;
        else if(output_unit.equals("kg"))
            value2=value1*1e-6;
        else if(output_unit.equals("g"))
            value2=value1*1e-3;
        else if(output_unit.equals("ug"))
            value2=value1*1e3;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void microgram()
    {
        if(output_unit.equals("st"))
            value2=value1*0.157473e-9;
        else if(output_unit.equals("lb"))
            value2=value1*2.20462e-9;
        else if(output_unit.equals("oz"))
            value2=value1*35.273962e-9;
        else if(output_unit.equals("l.t"))
            value2=value1*0.984207e-12;
        else if(output_unit.equals("sh.t"))
            value2=value1*0.984207e-12*1.12;
        else if(output_unit.equals("t"))
            value2=value1*1e-12;
        else if(output_unit.equals("kg"))
            value2=value1*1e-9;
        else if(output_unit.equals("g"))
            value2=value1*1e-6;
        else if(output_unit.equals("mg"))
            value2=value1*1e-3;
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void stone()
    {
        if(output_unit.equals("l.t"))
            value2=value1/160;
        else if(output_unit.equals("sh.t"))
            value2=value1/(160*1.12);
        else if(output_unit.equals("lb"))
            value2=value1*14;
        else if(output_unit.equals("oz"))
            value2=value1*224;
        else if(output_unit.equals("t"))
            value2=value1*6.35029318e-3;
        else if(output_unit.equals("kg"))
            value2=value1*6.35029318;
        else if(output_unit.equals("g"))
            value2=value1*6.35029318e3;
        else if(output_unit.equals("mg"))
            value2=value1*6.35029318e6;
        else if(output_unit.equals("ug"))
            value2=value1*6.35029318e9;        
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void longTon()
    {
        if(output_unit.equals("st"))
            value2=value1*160;
        else if(output_unit.equals("sh.t"))
            value2=value1*1.12;
        else if(output_unit.equals("lb"))
            value2=value1*2240;
        else if(output_unit.equals("oz"))
            value2=value1*35840;
        else if(output_unit.equals("t"))
            value2=value1*1.01604691;
        else if(output_unit.equals("kg"))
            value2=value1*1.01604691e3;
        else if(output_unit.equals("g"))
            value2=value1*1.01604691e6;
        else if(output_unit.equals("mg"))
            value2=value1*1.01604691e9;
        else if(output_unit.equals("ug"))
            value2=value1*1.01604691e12;        
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void shortTon()
    {
        value1=value1*1.12;
       if(output_unit.equals("st"))
            value2=value1*160;
        else if(output_unit.equals("l.t"))
            value2=value1/(1.12*1.12);
        else if(output_unit.equals("lb"))
            value2=value1*2240;
        else if(output_unit.equals("oz"))
            value2=value1*35840;
        else if(output_unit.equals("t"))
            value2=value1*1.01604691;
        else if(output_unit.equals("kg"))
            value2=value1*1.01604691e3;
        else if(output_unit.equals("g"))
            value2=value1*1.01604691e6;
        else if(output_unit.equals("mg"))
            value2=value1*1.01604691e9;
        else if(output_unit.equals("ug"))
            value2=value1*1.01604691e12;        
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void pound()
    {
        if(output_unit.equals("st"))
            value2=value1/14;
        else if(output_unit.equals("l.t"))
            value2=value1/2240;
        else if(output_unit.equals("sh.t"))
            value2=(value1*2240)/1.12;
        else if(output_unit.equals("oz"))
            value2=value1*16;
        else if(output_unit.equals("t"))
            value2=value1*0.45359237e-3;
        else if(output_unit.equals("kg"))
            value2=value1*0.45359237;
        else if(output_unit.equals("g"))
            value2=value1*0.45359237e3;
        else if(output_unit.equals("mg"))
            value2=value1*0.45359237e6;
        else if(output_unit.equals("ug"))
            value2=value1*0.45359237e9;        
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    void ounce()
    {
       value1=value1*16;
       if(output_unit.equals("st"))
            value2=value1/14;
        else if(output_unit.equals("l.t"))
            value2=value1/2240;
        else if(output_unit.equals("sh.t"))
            value2=(value1*2240)/1.12;
        else if(output_unit.equals("lb"))
            value2=value1/256;
        else if(output_unit.equals("t"))
            value2=value1*0.45359237e-3;
        else if(output_unit.equals("kg"))
            value2=value1*0.45359237;
        else if(output_unit.equals("g"))
            value2=value1*0.45359237e3;
        else if(output_unit.equals("mg"))
            value2=value1*0.45359237e6;
        else if(output_unit.equals("ug"))
            value2=value1*0.45359237e9;        
        s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
    }
    
    public void caller() throws IOException
    {
        input(2);
        if(input_unit.equals("t"))
        tonne();
        if(input_unit.equals("kg"))
        kilogram();
        if(input_unit.equals("g"))
        gram();
        if(input_unit.equals("mg"))
        milligram();
        if(input_unit.equals("ug"))
        microgram();
        if(input_unit.equals("l.t"))
        longTon();
        if(input_unit.equals("sh.t"))
        shortTon();
        if(input_unit.equals("st"))
        stone();
        if(input_unit.equals("lb"))
        pound();
        if(input_unit.equals("oz"))
        ounce();
        output();
    }
}
