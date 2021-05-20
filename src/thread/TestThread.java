package thread;

public class TestThread {

	public static void main(String[] args) {
        /*
		MyThread t1 = new MyThread();
		t1.setName("倒數執行緒");
		t1.start();//開始執行,不會直接呼叫run方法
		*/
		
		Runnable runnable = new Runnable() {
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
		};
		Thread t2 = new Thread(runnable);
		t2.setName("Runable倒數");
		t2.start();	
		System.out.println("Main方法結束");
	}

}
