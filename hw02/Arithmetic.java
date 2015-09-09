public class Arithmetic{
    public static void main(String [] args){
        //Hotwheels;
        int wheels=5;
        //Cost per Hotwheels;
        double wheelCost=.99;
        //Legos;
        int legos=3;
        //Cost per Legos;
        double legoCost=4.79;
        //iPod
        int iPod=1;
        //Cost per iPod;
        double iPodscost=299.99;
        double Taxpercent=.075;
        double wheelsTaxed, legosTaxed, ipodTaxed;
        double finaltotal, totalwithoutTaxes, totalWithoutTaxes, totalAfterTax;
        wheelsTaxed=(Taxpercent*wheelCost)+wheelCost;
        legosTaxed=(Taxpercent*legoCost)+legoCost;
        ipodTaxed= (Taxpercent*iPodscost)+iPodscost;
        totalWithoutTaxes=((wheels*wheelCost)+(legos*legoCost)+(iPod*iPodscost));
        finaltotal= wheelsTaxed+legosTaxed+ipodTaxed;
        int wheelTaxed= (int) wheelsTaxed;
        int legoTaxed= (int) legosTaxed;
        int IPodTaxed= (int) ipodTaxed;
        int totalWithouttaxes= (int) totalWithoutTaxes;
        int finalTotal= (int) finaltotal;
        wheelTaxed *=100;
        legoTaxed *=100;
        IPodTaxed *=100;
        totalWithouttaxes *=100;
        finalTotal *=100.0;
        wheelTaxed /=100.0;
        IPodTaxed /=100.0;
        totalWithouttaxes /=100.0;
        finalTotal /=100.0;
        System.out.println("The price for an individual Hotwheels is "+wheelCost+ " cents.");
        System.out.println("The price for an individual Legos is "+ legoCost+ " dollars.");
        System.out.println("The price for an individual iPod is "+ iPodscost+ " dollars.");
        System.out.println("The price for each item after tax are "+ wheelTaxed +", "+ legoTaxed +" ,and "+ IPodTaxed+ " dollars.");
        System.out.println(((("Without taxes, the total is "+totalWithoutTaxes+ " dollars."))));
        System.out.println("The final total is "+finalTotal+ " dollars.");
        
}}