package thread;

public class TestThread2 {

	public static void main(String[] args) {
        //客戶不允許你使用anonymous class, TestThread$1.class
		//
		Thread t2 = new Thread ( new Runnable() {
			@Override
			public void run() {
				for( int i = 5 ; i > 0 ; i-- ) {
					//Thread.currentThread()可以取得目前執行的執行緒物件
					System.out.println("倒數:"+i+","+Thread.currentThread());
					try {
						Thread.sleep(1000);//暫停一秒,1000=1秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("執行結束");
			}
		});
		t2.setName("Runable倒數");
		t2.start();	
		System.out.println("Main方法結束");
	}

}
