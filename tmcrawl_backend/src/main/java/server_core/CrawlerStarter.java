package server_core;

import java.util.concurrent.TimeUnit;

/**
 * starts the crawling process
 *
 */
public class CrawlerStarter extends Thread {
	public void run(){
		int i = 0;
		while(i<10){
			try {
				TimeUnit.SECONDS.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			i++;
		}
		System.out.println("Crawling finished.");
	}
}