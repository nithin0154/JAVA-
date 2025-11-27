package Arrays;

public class besttimesellstock {
    public static void day(int price[]){
        int day_buy=0,profit=0,day_sell=0;
        int buy_price= Integer.MAX_VALUE;
        System.out.println(buy_price);
        for (int i = 0; i < price.length; i++) {
            if(buy_price>price[i]){
                System.err.println(buy_price);
                buy_price=price[i];
                day_buy=i+1;
            }
            int curr_profit=price[i]-buy_price;
            if (profit<curr_profit) {
                profit=curr_profit;
                day_sell=i+1;
            }
        }
        System.out.println("The best time to buy is on day:"+day_buy);
        System.out.println("The best time to sell is on day:"+day_sell);
        System.out.println("The best profit achiveable is :"+profit);
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        day(price);
    }
}
