public class progressbar{
	public static void main(String[] ar){
        System.out.println("Here is a progress bar");
        for(int j=0; j<20; j++){
            String loading[]={"\\ ","| ","/ ","- "};
			System.out.print("|"+"=".repeat(j)+">"+" ".repeat(20-j)+"| ( "+loading[j%4]+")\r");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}