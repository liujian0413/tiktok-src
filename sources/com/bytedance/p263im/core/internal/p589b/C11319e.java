package com.bytedance.p263im.core.internal.p589b;

import android.os.Looper;
import android.os.Message;
import com.bytedance.p263im.core.internal.utils.C11433k;
import com.bytedance.p263im.core.internal.utils.C11433k.C11434a;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p586b.C11209d;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.im.core.internal.b.e */
public final class C11319e<T> implements C11434a, Runnable {

    /* renamed from: a */
    private C11318d<T> f30648a;

    /* renamed from: b */
    private C11317c<T> f30649b;

    /* renamed from: c */
    private T f30650c;

    /* renamed from: d */
    private C11433k f30651d = new C11433k(Looper.getMainLooper(), this);

    /* renamed from: e */
    private Executor f30652e;

    /* renamed from: a */
    private void m33190a() {
        this.f30652e.execute(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r2 = this;
            com.bytedance.im.core.internal.b.d<T> r0 = r2.f30648a
            if (r0 == 0) goto L_0x000f
            com.bytedance.im.core.internal.b.d<T> r0 = r2.f30648a     // Catch:{ Exception -> 0x000b }
            java.lang.Object r0 = r0.mo15560a()     // Catch:{ Exception -> 0x000b }
            goto L_0x0010
        L_0x000b:
            r0 = move-exception
            com.bytedance.p263im.core.p586b.C11209d.m32824a(r0)
        L_0x000f:
            r0 = 0
        L_0x0010:
            r2.f30650c = r0
            com.bytedance.im.core.internal.utils.k r0 = r2.f30651d
            if (r0 == 0) goto L_0x0026
            android.os.Message r0 = android.os.Message.obtain()
            r1 = 100001(0x186a1, float:1.40131E-40)
            r0.what = r1
            r0.obj = r2
            com.bytedance.im.core.internal.utils.k r1 = r2.f30651d
            r1.sendMessage(r0)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p589b.C11319e.run():void");
    }

    /* renamed from: a */
    public final void mo27309a(Message message) {
        if (message.obj instanceof C11319e) {
            C11319e eVar = (C11319e) message.obj;
            if (message.what == 100001 && eVar.f30649b != null) {
                try {
                    eVar.f30649b.mo15561a(eVar.f30650c);
                } catch (Exception e) {
                    C11209d.m32824a(e);
                }
            }
        }
    }

    /* renamed from: a */
    public static <T> void m33191a(C11318d<T> dVar, C11317c<T> cVar) {
        if (C11198c.m32777a().f30374d) {
            new C11319e(dVar, cVar, C11314a.m33181a()).m33190a();
        }
    }

    private C11319e(C11318d<T> dVar, C11317c<T> cVar, Executor executor) {
        this.f30648a = dVar;
        this.f30649b = cVar;
        this.f30652e = executor;
    }

    /* renamed from: a */
    public static <T> void m33192a(C11318d<T> dVar, C11317c<T> cVar, Executor executor) {
        if (C11198c.m32777a().f30374d) {
            new C11319e(dVar, cVar, executor).m33190a();
        }
    }
}
