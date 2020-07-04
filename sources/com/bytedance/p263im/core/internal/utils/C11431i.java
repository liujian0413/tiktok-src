package com.bytedance.p263im.core.internal.utils;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.p263im.core.internal.utils.C11433k.C11434a;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.C11198c;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.utils.i */
public class C11431i implements C11434a {

    /* renamed from: a */
    private static C11431i f30944a;

    /* renamed from: b */
    private C11433k f30945b;

    /* renamed from: c */
    private long f30946c;

    private C11431i() {
        HandlerThread handlerThread = new HandlerThread("IM-CORE-SNAPSHOT");
        handlerThread.start();
        this.f30945b = new C11433k(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public static C11431i m33701a() {
        if (f30944a == null) {
            synchronized (C11431i.class) {
                if (f30944a == null) {
                    f30944a = new C11431i();
                }
            }
        }
        return f30944a;
    }

    /* renamed from: b */
    public static List<Conversation> m33702b() {
        try {
            return Arrays.asList((Conversation[]) C11403c.f30887a.mo15974a(C11430h.m33685a().mo27482e(), Conversation[].class));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void mo27483c() {
        if (!this.f30945b.hasMessages(1001)) {
            if (SystemClock.uptimeMillis() - this.f30946c <= C11198c.m32777a().mo27248b().f30396F) {
                this.f30945b.sendEmptyMessageDelayed(1001, (this.f30946c + C11198c.m32777a().mo27248b().f30396F) - SystemClock.uptimeMillis());
            } else {
                m33703d();
            }
        }
    }

    /* renamed from: d */
    private synchronized void m33703d() {
        this.f30946c = SystemClock.uptimeMillis();
        List b = C6417a.m20015a().mo15539b();
        if (b.size() > C11198c.m32777a().mo27248b().f30395E) {
            b = b.subList(0, C11198c.m32777a().mo27248b().f30395E);
        }
        try {
            C11430h.m33685a().mo27473a(C11403c.f30887a.mo15979b((Object) b.toArray(new Conversation[0])));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo27309a(Message message) {
        if (message.what == 1001) {
            m33703d();
        }
    }
}
