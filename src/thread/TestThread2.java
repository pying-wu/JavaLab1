package thread;

public class TestThread2 {

	public static void main(String[] args) {
        //客戶不允許你使用anonymous class, TestThread$1.class
		//非同步   不知道啥時開始跑,也不知道啥時結束
//		System.exit(0);//強制中斷
//		Runtime.getRuntime().exit(0);
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
		t2.setPriority(10);
		//t2.setDaemon(true);//設成背景執行緒,java不會等他執行完
		t2.start();
		
		try {
			t2.join();//使用join變成同步行為
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("t2 alive = "+t2.isAlive());
		System.out.println(Thread.currentThread());//main執行緒
		System.out.println("Main方法結束");
	}

}
