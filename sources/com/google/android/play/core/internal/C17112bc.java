package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C17157l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.internal.bc */
public final class C17112bc<T extends IInterface> {

    /* renamed from: b */
    private static final Map<String, Handler> f47814b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public T f47815a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f47816c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6525f f47817d;

    /* renamed from: e */
    private final String f47818e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final List<C17113bd> f47819f = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f47820g;

    /* renamed from: h */
    private final Intent f47821h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C17119bj<T> f47822i;

    /* renamed from: j */
    private final WeakReference<C17116bg> f47823j;

    /* renamed from: k */
    private final DeathRecipient f47824k = new C17115bf(this);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ServiceConnection f47825l;

    public C17112bc(Context context, C6525f fVar, String str, Intent intent, C17119bj<T> bjVar, C17116bg bgVar) {
        this.f47816c = context;
        this.f47817d = fVar;
        this.f47818e = str;
        this.f47821h = intent;
        this.f47822i = bjVar;
        this.f47823j = new WeakReference<>(bgVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m56737b(C17113bd bdVar) {
        if (this.f47815a == null && !this.f47820g) {
            this.f47817d.mo15889a("Initiate binding to the service.", new Object[0]);
            this.f47819f.add(bdVar);
            this.f47825l = new C17118bi(this, 0);
            this.f47820g = true;
            if (!this.f47816c.bindService(this.f47821h, this.f47825l, 1)) {
                this.f47817d.mo15889a("Failed to bind to the service.", new Object[0]);
                this.f47820g = false;
                for (C17113bd bdVar2 : this.f47819f) {
                    C17157l<?> lVar = bdVar2.f47826a;
                    if (lVar != null) {
                        lVar.mo44428a((Exception) new C6509aa());
                    }
                }
                this.f47819f.clear();
            }
        } else if (this.f47820g) {
            this.f47817d.mo15889a("Waiting to bind to the service.", new Object[0]);
            this.f47819f.add(bdVar);
        } else {
            bdVar.run();
        }
    }

    /* renamed from: c */
    private final Handler m56739c() {
        Handler handler;
        synchronized (f47814b) {
            if (!f47814b.containsKey(this.f47818e)) {
                HandlerThread handlerThread = new HandlerThread(this.f47818e, 10);
                handlerThread.start();
                f47814b.put(this.f47818e, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) f47814b.get(this.f47818e);
        }
        return handler;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m56740c(C17113bd bdVar) {
        m56739c().post(bdVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m56742d() {
        this.f47817d.mo15889a("linkToDeath", new Object[0]);
        try {
            this.f47815a.asBinder().linkToDeath(this.f47824k, 0);
        } catch (RemoteException e) {
            this.f47817d.mo15890a((Throwable) e, "linkToDeath failed", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m56744e() {
        this.f47817d.mo15889a("unlinkToDeath", new Object[0]);
        this.f47815a.asBinder().unlinkToDeath(this.f47824k, 0);
    }

    /* renamed from: a */
    public final void mo44386a() {
        m56740c((C17113bd) new C17117bh(this));
    }

    /* renamed from: a */
    public final void mo44387a(C17113bd bdVar) {
        m56740c((C17113bd) new C17114be(this, bdVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo44388b() {
        this.f47817d.mo15889a("reportBinderDeath", new Object[0]);
        C17116bg bgVar = (C17116bg) this.f47823j.get();
        if (bgVar != null) {
            this.f47817d.mo15889a("calling onBinderDied", new Object[0]);
            bgVar.mo44391a();
        }
    }
}
