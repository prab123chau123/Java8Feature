package com.virtusa.RxjavaPratice;

import java.util.concurrent.TimeUnit;

import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class SingleObservable
{
	public static void main(String args[]) throws Exception
	{
		Single<String>single=Single.just("Hello,Welcome to Java World..");
		Disposable d=single.delay(5,TimeUnit.SECONDS,Schedulers.io())
		.subscribeWith(new DisposableSingleObserver<String>() {

			@Override
			public void onSuccess(String t) 
			{
				System.out.println(t);	
			}

			@Override
			public void onError(Throwable e)
			{
				System.out.println(e.getLocalizedMessage());
			}
			
		});
		Thread.sleep(1700);
		d.dispose();
	}
}
