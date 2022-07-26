package com.virtusa.RxjavaPratice;
import java.util.concurrent.TimeUnit;
import io.reactivex.Maybe;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableMaybeObserver;
import io.reactivex.schedulers.Schedulers;
public class MayBeObservable
{
public static void main(String args[]) throws Exception
{
	Maybe<String>mayBe=Maybe.just("Hello I'm here");
	Disposable d=mayBe.delay(5,TimeUnit.SECONDS,Schedulers.io())
			.subscribeWith(new DisposableMaybeObserver<String>() 
			{
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

				@Override
				public void onComplete()
				{
					System.out.println("Completed");
					
				}
			});
	Thread.sleep(17000);
	d.dispose();
}
}
