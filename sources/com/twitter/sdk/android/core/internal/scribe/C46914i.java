package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.C46869g;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.i */
public abstract class C46914i<T> implements C46919n {

    /* renamed from: a */
    protected final Context f120302a;

    /* renamed from: b */
    protected final ScheduledExecutorService f120303b;

    /* renamed from: c */
    protected C46920o<T> f120304c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo118050a() {
        try {
            this.f120304c.mo118025a();
        } catch (Exception e) {
            C46869g.m146603a(this.f120302a, "Failed to send events files.", (Throwable) e);
        }
    }

    /* renamed from: a */
    private void m146740a(Runnable runnable) {
        try {
            this.f120303b.submit(runnable);
        } catch (Exception e) {
            C46869g.m146603a(this.f120302a, "Failed to submit events task", (Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo118052a(String str) {
        m146740a((Runnable) new C46916k(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo118053b(Object obj, boolean z) {
        try {
            this.f120304c.mo118026a(obj);
            if (z) {
                this.f120304c.mo118028c();
            }
        } catch (Exception e) {
            C46869g.m146603a(this.f120302a, "Failed to record event.", (Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo118051a(T t, boolean z) {
        m146740a((Runnable) new C46915j(this, t, false));
    }

    public C46914i(Context context, C46920o<T> oVar, C46911g gVar, ScheduledExecutorService scheduledExecutorService) {
        this.f120302a = context.getApplicationContext();
        this.f120303b = scheduledExecutorService;
        this.f120304c = oVar;
        gVar.mo118042a((C46919n) this);
    }
}
