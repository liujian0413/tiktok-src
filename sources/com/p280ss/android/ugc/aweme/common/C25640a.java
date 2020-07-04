package com.p280ss.android.ugc.aweme.common;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.a */
public abstract class C25640a<T> implements C6310a {
    public T mData;
    public C6309f mHandler = new C6309f(Looper.getMainLooper(), this);
    public boolean mIsLoading;
    public List<C25678f> mNotifyListeners;

    /* access modifiers changed from: protected */
    public abstract boolean checkParams(Object... objArr);

    public T getData() {
        return this.mData;
    }

    /* access modifiers changed from: protected */
    public void handleData(T t) {
        this.mData = t;
    }

    /* access modifiers changed from: protected */
    public void resetLoadingStatus(Message message) {
        this.mIsLoading = false;
    }

    public void clearNotifyListener(C25678f fVar) {
        if (!(fVar == null || this.mNotifyListeners == null)) {
            this.mNotifyListeners.remove(fVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean sendRequest(Object... objArr) {
        if (!checkParams(objArr)) {
            return false;
        }
        this.mIsLoading = true;
        return true;
    }

    public void addNotifyListener(C25678f fVar) {
        if (fVar != null) {
            if (this.mNotifyListeners == null) {
                this.mNotifyListeners = new LinkedList();
            }
            this.mNotifyListeners.add(fVar);
            return;
        }
        throw new NullPointerException("INotifyListener could not be null");
    }

    public void handleMsg(Message message) {
        resetLoadingStatus(message);
        if (message.obj instanceof Exception) {
            if (this.mNotifyListeners != null) {
                for (C25678f a : this.mNotifyListeners) {
                    a.mo57296a((Exception) message.obj);
                }
            }
            return;
        }
        handleData(message.obj);
        if (this.mNotifyListeners != null) {
            for (C25678f b : this.mNotifyListeners) {
                b.mo56977b();
            }
        }
    }
}
