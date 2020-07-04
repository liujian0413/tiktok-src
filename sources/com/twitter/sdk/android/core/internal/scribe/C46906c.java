package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.C1642a;
import com.twitter.sdk.android.core.internal.C46869g;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.c */
public abstract class C46906c<T> implements C46920o<T> {

    /* renamed from: a */
    protected final Context f120274a;

    /* renamed from: b */
    protected final C46911g<T> f120275b;

    /* renamed from: c */
    final ScheduledExecutorService f120276c;

    /* renamed from: d */
    final AtomicReference<ScheduledFuture<?>> f120277d;

    /* renamed from: e */
    public volatile int f120278e = -1;

    /* renamed from: a */
    public final void mo118025a() {
        m146714f();
    }

    /* renamed from: e */
    private void m146713e() {
        boolean z;
        if (this.f120278e != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m146712a((long) this.f120278e, (long) this.f120278e);
        }
    }

    /* renamed from: c */
    public final boolean mo118028c() {
        try {
            return this.f120275b.mo118045a();
        } catch (IOException e) {
            C46869g.m146603a(this.f120274a, "Failed to roll file over.", (Throwable) e);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo118027b() {
        if (this.f120277d.get() != null) {
            C46869g.m146602a(this.f120274a, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture) this.f120277d.get()).cancel(false);
            this.f120277d.set(null);
        }
    }

    /* renamed from: f */
    private void m146714f() {
        C46922q d = mo118029d();
        if (d == null) {
            C46869g.m146602a(this.f120274a, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        C46869g.m146602a(this.f120274a, "Sending all files");
        List c = this.f120275b.mo118047c();
        int i = 0;
        while (c.size() > 0) {
            try {
                C46869g.m146602a(this.f120274a, C1642a.m8035a(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(c.size())}));
                boolean a = d.mo118008a(c);
                if (a) {
                    i += c.size();
                    this.f120275b.mo118044a(c);
                }
                if (!a) {
                    break;
                }
                c = this.f120275b.mo118047c();
            } catch (Exception e) {
                Context context = this.f120274a;
                StringBuilder sb = new StringBuilder("Failed to send batch of analytics files to server: ");
                sb.append(e.getMessage());
                C46869g.m146603a(context, sb.toString(), (Throwable) e);
            }
        }
        if (i == 0) {
            this.f120275b.mo118048d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo118030a(int i) {
        this.f120278e = i;
        m146712a(0, (long) this.f120278e);
    }

    /* renamed from: a */
    public final void mo118026a(T t) {
        C46869g.m146602a(this.f120274a, t.toString());
        try {
            this.f120275b.mo118043a(t);
        } catch (IOException e) {
            C46869g.m146603a(this.f120274a, "Failed to write event.", (Throwable) e);
        }
        m146713e();
    }

    /* renamed from: a */
    private void m146712a(long j, long j2) {
        boolean z;
        if (this.f120277d.get() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C46903ac acVar = new C46903ac(this.f120274a, this);
            Context context = this.f120274a;
            StringBuilder sb = new StringBuilder("Scheduling time based file roll over every ");
            sb.append(j2);
            sb.append(" seconds");
            C46869g.m146602a(context, sb.toString());
            try {
                this.f120277d.set(this.f120276c.scheduleAtFixedRate(acVar, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e) {
                C46869g.m146603a(this.f120274a, "Failed to schedule time based file roll over", (Throwable) e);
            }
        }
    }

    public C46906c(Context context, ScheduledExecutorService scheduledExecutorService, C46911g<T> gVar) {
        this.f120274a = context;
        this.f120276c = scheduledExecutorService;
        this.f120275b = gVar;
        this.f120277d = new AtomicReference<>();
    }
}
