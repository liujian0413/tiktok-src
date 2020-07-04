package com.ttnet.org.chromium.base;

import android.os.Handler;
import java.util.Iterator;

public class ObservableSupplierImpl<E> implements ObservableSupplier<E> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Handler mHandler = new Handler();
    private E mObject;
    private final ObserverList<Callback<E>> mObservers = new ObserverList<>();
    private final Thread mThread = Thread.currentThread();

    private void checkThread() {
    }

    public E get() {
        checkThread();
        return this.mObject;
    }

    public void removeObserver(Callback<E> callback) {
        checkThread();
        this.mObservers.removeObserver(callback);
    }

    public E addObserver(Callback<E> callback) {
        checkThread();
        this.mObservers.addObserver(callback);
        if (this.mObject != null) {
            this.mHandler.post(new ObservableSupplierImpl$$Lambda$0(this, this.mObject, callback));
        }
        return this.mObject;
    }

    public void set(E e) {
        checkThread();
        if (e != this.mObject) {
            this.mObject = e;
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).onResult(this.mObject);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$addObserver$0$ObservableSupplierImpl(Object obj, Callback callback) {
        if (this.mObject == obj && this.mObservers.hasObserver(callback)) {
            callback.onResult(this.mObject);
        }
    }
}
