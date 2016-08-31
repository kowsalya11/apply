 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=23;
        int c[]=new int[a];
        int i,fact=1,temp,count=0;
        for(i=1;i<=a;i++){
            fact=fact*i;
            }
        for(i=0;i<a;i++){
         }System.out.println(""+fact);
        while(fact!=0){
            temp=fact%10;
            if(temp==0){
                count++;
                 }fact=fact/10;}
            System.out.println(""+count);
           }
        }