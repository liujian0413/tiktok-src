package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class NextLiveData<T> extends C0052o<T> {
    public int mLatestVersion = -1;
    private Map<C0053p, NextObserver> nextObserverMap = new HashMap();

    class NextObserver<T> implements C0053p<T> {
        private int initVersion;
        private boolean notifyWhenObserve;
        private C0053p<T> observer;

        public void onChanged(T t) {
            if (this.notifyWhenObserve || this.initVersion < NextLiveData.this.mLatestVersion) {
                this.observer.onChanged(t);
            }
        }

        NextObserver(int i, C0053p<T> pVar, boolean z) {
            this.initVersion = i;
            this.observer = pVar;
            this.notifyWhenObserve = z;
        }
    }

    public void observeForever(C0053p<T> pVar) {
        observeForever(pVar, false);
    }

    public void setValue(T t) {
        this.mLatestVersion++;
        super.setValue(t);
    }

    public void removeObserver(C0053p<T> pVar) {
        NextObserver nextObserver = (NextObserver) this.nextObserverMap.remove(pVar);
        if (nextObserver != null) {
            super.removeObserver(nextObserver);
            return;
        }
        super.removeObserver(pVar);
        if (pVar instanceof NextObserver) {
            C0053p pVar2 = null;
            Iterator it = this.nextObserverMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (pVar.equals(entry.getValue())) {
                    pVar2 = (C0053p) entry.getKey();
                    break;
                }
            }
            if (pVar2 != null) {
                this.nextObserverMap.remove(pVar2);
            }
        }
    }

    public void observe(C0043i iVar, C0053p<T> pVar) {
        observe(iVar, pVar, false);
    }

    public void observeForever(C0053p<T> pVar, boolean z) {
        if (!this.nextObserverMap.containsKey(pVar)) {
            NextObserver nextObserver = new NextObserver(this.mLatestVersion, pVar, z);
            this.nextObserverMap.put(pVar, nextObserver);
            super.observeForever(nextObserver);
        }
    }

    public void observe(C0043i iVar, C0053p<T> pVar, boolean z) {
        if (!this.nextObserverMap.containsKey(pVar)) {
            NextObserver nextObserver = new NextObserver(this.mLatestVersion, pVar, z);
            this.nextObserverMap.put(pVar, nextObserver);
            super.observe(iVar, nextObserver);
        }
    }
}
