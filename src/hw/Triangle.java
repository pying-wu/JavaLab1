package hw;

public class Triangle {

	public static void main(String[] args) {

//		 System.out.println("請畫三角形!");
		   int count = 15; //設定colum次數(直的)
		   drawTriangle(count);	//呼叫畫圖方法
		   System.out.println("畫的還不錯!");
  }

		
		
  public static void drawTriangle(int count){
		    int i,j,k;	//宣告int變數
		
			for (i=1; i<=count; i++){//for迴圈colum(直的)總共有count個colum
		  		for(k=1;k<=(count-i)/2;k++){//列印遞減的空白,(count-i)/2是在每一個row中總共會列印count次(不論空白或*號)減掉*個數後,是全部空格的數量,除二是放*前面的數量
					System.out.print(" ");	
				}
		  
		   		if(i%2!=0){//指印奇數列
		  		 	for (j=1; j<=i; j++){//列印*號成三角形	
		 				    System.out.print("*");
			  		}		System.out.println(); 
					}else{System.out.println();}//偶數列換行
				}
		
		
	}

}
