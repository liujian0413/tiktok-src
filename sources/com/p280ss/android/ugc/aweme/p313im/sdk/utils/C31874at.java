package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.at */
abstract class C31874at<T> implements C6310a, Runnable {

    /* renamed from: a */
    public C31918r<T> f83336a;

    /* renamed from: b */
    private C31917q<T> f83337b;

    /* renamed from: c */
    private T f83338c;

    /* renamed from: d */
    private C6309f f83339d = new C6309f(Looper.getMainLooper(), this);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ExecutorService mo82718a();

    /* renamed from: b */
    public void mo82719b() {
        mo82718a().submit(this);
    }

    public void run() {
        T t;
        if (this.f83336a != null) {
            t = this.f83336a.mo81913a();
        } else {
            t = null;
        }
        this.f83338c = t;
        if (this.f83339d != null) {
            Message obtain = Message.obtain();
            obtain.what = 100001;
            obtain.obj = this;
            this.f83339d.sendMessage(obtain);
        }
    }

    public void handleMsg(Message message) {
        if (message.obj instanceof C31874at) {
            C31874at atVar = (C31874at) message.obj;
            if (message.what == 100001 && atVar.f83337b != null) {
                atVar.f83337b.mo81914a(atVar.f83338c);
            }
        }
    }

    public C31874at(C31918r<T> rVar, C31917q<T> qVar) {
        this.f83336a = rVar;
        this.f83337b = qVar;
    }
}
