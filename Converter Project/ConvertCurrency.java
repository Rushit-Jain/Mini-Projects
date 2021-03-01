package P2;
import P1.*;
import java.io.*;
public class ConvertCurrency extends ConverterIO
{
   void indianRupee()
   {
       if(output_unit.equals("USD"))
            value2=value1*0.014;
       else if(output_unit.equals("EU"))
            value2=value1*0.013;
       else if(output_unit.equals("GBP"))
            value2=value1*0.011;
       else if(output_unit.equals("CHF"))
            value2=value1*0.014;
       else if(output_unit.equals("CAD"))
            value2=value1*0.019;
       else if(output_unit.equals("P"))
            value2=value1*0.910;
       else if(output_unit.equals("Y"))
            value2=value1*0.100;
       s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
   }
   
   void uSDollar()
   {
       if(output_unit.equals("Rs"))
            value2=value1*70.82;
       else if(output_unit.equals("EU"))
            value2=value1*0.910;
       else if(output_unit.equals("GBP"))
            value2=value1*0.810;
       else if(output_unit.equals("CHF"))
            value2=value1*1.00;
       else if(output_unit.equals("CAD"))
            value2=value1*1.33;
       else if(output_unit.equals("P"))
            value2=value1*64.66;
       else if(output_unit.equals("Y"))
            value2=value1*7.150;
       s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
   }
   
   void euro()
   {
       if(output_unit.equals("USD"))
            value2=value1*1.10;
       else if(output_unit.equals("Rs"))
            value2=value1*77.77;
       else if(output_unit.equals("GBP"))
            value2=value1*0.890;
       else if(output_unit.equals("CHF"))
            value2=value1*1.090;
       else if(output_unit.equals("CAD"))
            value2=value1*1.460;
       else if(output_unit.equals("P"))
            value2=value1*71.00;
       else if(output_unit.equals("Y"))
            value2=value1*7.850;
       s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
   }
   
   void pound()
   {
       if(output_unit.equals("USD"))
            value2=value1*1.23;
       else if(output_unit.equals("EU"))
            value2=value1*1.12;
       else if(output_unit.equals("Rs"))
            value2=value1*87.35;
       else if(output_unit.equals("CHF"))
            value2=value1*1.23;
       else if(output_unit.equals("CAD"))
            value2=value1*1.64;
       else if(output_unit.equals("P"))
            value2=value1*79.75;
       else if(output_unit.equals("Y"))
            value2=value1*8.82;
       s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
   }
   
   void swissFranc()
   {
       if(output_unit.equals("USD"))
            value2=value1*1.00;
       else if(output_unit.equals("EU"))
            value2=value1*0.910;
       else if(output_unit.equals("GBP"))
            value2=value1*0.820;
       else if(output_unit.equals("Rs"))
            value2=value1*71.15;
       else if(output_unit.equals("CAD"))
            value2=value1*1.340;
       else if(output_unit.equals("P"))
            value2=value1*64.92;
       else if(output_unit.equals("Y"))
            value2=value1*7.18;
       s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
   }
   
   void canadianDollar()
   {
       if(output_unit.equals("USD"))
            value2=value1*0.75;
       else if(output_unit.equals("EU"))
            value2=value1*0.68;
       else if(output_unit.equals("GBP"))
            value2=value1*0.61;
       else if(output_unit.equals("CHF"))
            value2=value1*0.75;
       else if(output_unit.equals("Rs"))
            value2=value1*53.20;
       else if(output_unit.equals("P"))
            value2=value1*48.57;
       else if(output_unit.equals("Y"))
            value2=value1*5.37;
       s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
   }
   
   void ruble()
   {
       if(output_unit.equals("USD"))
            value2=value1*0.015;
       else if(output_unit.equals("EU"))
            value2=value1*0.014;
       else if(output_unit.equals("GBP"))
            value2=value1*0.013;
       else if(output_unit.equals("CHF"))
            value2=value1*0.015;
       else if(output_unit.equals("CAD"))
            value2=value1*0.021;
       else if(output_unit.equals("Rs"))
            value2=value1*1.10;
       else if(output_unit.equals("Y"))
            value2=value1*0.11;
       s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
   }
   
   void renminbi()
   {
       if(output_unit.equals("USD"))
            value2=value1*0.14;
       else if(output_unit.equals("EU"))
            value2=value1*0.13;
       else if(output_unit.equals("GBP"))
            value2=value1*0.11;
       else if(output_unit.equals("CHF"))
            value2=value1*0.14;
       else if(output_unit.equals("CAD"))
            value2=value1*0.19;
       else if(output_unit.equals("P"))
            value2=value1*9.05;
       else if(output_unit.equals("Rs"))
            value2=value1*9.91;
       s2=(Double.toString(value2)).toLowerCase()+" "+output_unit;
   }
   
   public void caller() throws IOException
   {
       input(3);
       if(input_unit.equals("Rs"))
            indianRupee();
       else if(input_unit.equals("USD"))
            uSDollar();
       else if(input_unit.equals("EU"))
            euro();
       else if(input_unit.equals("GBP"))
            pound();
       else if(input_unit.equals("CHF"))
            swissFranc();
       else if(input_unit.equals("CAD"))
            canadianDollar();
       else if(input_unit.equals("P"))
            ruble();
       else if(input_unit.equals("Y"))
            renminbi();
       output();
   }
}
