public class discountOfPrice {
    static double discount(double...price){
        double sum=0.0;
        for(int i=0;i<price.length;i++){
            sum+=price[i];
        }
        double discount=sum-((sum*20)/100);
        return discount;
    }

    public static void main(String[] args) {
        System.out.println(discount(1000,500,700,800));
    }
}
