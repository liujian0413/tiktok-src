package com.p280ss.android.ugc.aweme.mvp.p1415a;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.common.C25678f;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.mvp.a.a */
public abstract class C34028a<T> implements C6310a, C34030c {
    public T mData;
    protected C6309f mHandler = new C6309f(Looper.getMainLooper(), this);
    public boolean mIsLoading;
    protected List<C25678f> mNotifyListeners;
    public int mQueryType = 1;

    public void onDestroy() {
        clearAllNotifyListener();
    }

    public void clearAllNotifyListener() {
        if (this.mNotifyListeners != null) {
            this.mNotifyListeners.clear();
        }
    }

    /* access modifiers changed from: protected */
    public void handleData(T t) {
        this.mData = t;
    }

    public void clearNotifyListener(C25678f fVar) {
        if (!(fVar == null || this.mNotifyListeners == null)) {
            this.mNotifyListeners.remove(fVar);
        }
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
        this.mIsLoading = false;
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
