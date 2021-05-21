package interFace;
//ctrl+1
public class Superman implements Lawyer,Accountant {
	//3個型態
	@Override
	public void 訴訟() {
    
	}
	@Override
	public void 報稅() {
		
	}
	public static void main(String[] args) {

		Superman s = new Superman();
		s.訴訟();
		s.報稅();
		
		Accountant acc = new Accountant() {
			@Override
			public void 報稅() {
				// TODO Auto-generated method stub
				
			}
		};
			
		acc.報稅();
		//lambda:functional interface, 介面上只有一種抽象方法  @FunctionalInterface
		Accountant acc1 = () ->  {
			System.out.println("綜合所得稅");
		};
		Accountant acc2 = () ->  System.out.println("綜合所得稅");
		//Accountant acc2 =  System.out.println("綜合所得稅");
		
		
		Lawyer l = new Lawyer() {
			@Override
			public void 訴訟() {
				// TODO Auto-generated method stub
				
			}
		};
	    l.訴訟();
	    
	}
}
