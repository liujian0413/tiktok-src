package com.p280ss.android.message;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;

/* renamed from: com.ss.android.message.k */
public class C19846k implements C6310a {

    /* renamed from: c */
    private static C19846k f53812c;

    /* renamed from: a */
    public final Looper f53813a;

    /* renamed from: b */
    public final C6309f f53814b;

    /* renamed from: d */
    private final HandlerThread f53815d = new HandlerThread("PushThreadHandler");

    public void handleMsg(Message message) {
    }

    /* renamed from: a */
    public static C19846k m65542a() {
        if (f53812c == null) {
            synchronized (C19846k.class) {
                if (f53812c == null) {
                    f53812c = new C19846k();
                }
            }
        }
        return f53812c;
    }

    private C19846k() {
        this.f53815d.start();
        this.f53813a = this.f53815d.getLooper();
        this.f53814b = new C6309f(this.f53813a, this);
    }

    /* renamed from: a */
    public final void mo53204a(Runnable runnable) {
        mo53205a(runnable, 0);
    }

    /* renamed from: a */
    public final void mo53205a(Runnable runnable, long j) {
        if (j <= 0) {
            this.f53814b.post(runnable);
        } else {
            this.f53814b.postDelayed(runnable, j);
        }
    }
}
