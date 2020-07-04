package androidx.work.impl;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1451a;
import androidx.work.C1458e;
import androidx.work.C1460f;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.C1448a;
import androidx.work.ListenableWorker.Result;
import androidx.work.WorkInfo.State;
import androidx.work.WorkerParameters;
import androidx.work.WorkerParameters.C1450a;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.p036b.C1493b;
import androidx.work.impl.p036b.C1501g;
import androidx.work.impl.p036b.C1503h;
import androidx.work.impl.p036b.C1515k;
import androidx.work.impl.utils.C1565b;
import androidx.work.impl.utils.p038a.C1564c;
import androidx.work.impl.utils.p039b.C1566a;
import com.C1642a;
import com.google.common.util.concurrent.C18253l;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.work.impl.h */
public final class C1546h implements Runnable {

    /* renamed from: a */
    ListenableWorker f5843a;

    /* renamed from: b */
    C1448a f5844b = new C1448a(Result.FAILURE);

    /* renamed from: c */
    public C1564c<Boolean> f5845c = C1564c.m7648a();

    /* renamed from: d */
    C18253l<C1448a> f5846d = null;

    /* renamed from: e */
    private Context f5847e;

    /* renamed from: f */
    private String f5848f;

    /* renamed from: g */
    private List<C1538c> f5849g;

    /* renamed from: h */
    private C1450a f5850h;

    /* renamed from: i */
    private C1501g f5851i;

    /* renamed from: j */
    private C1451a f5852j;

    /* renamed from: k */
    private C1566a f5853k;

    /* renamed from: l */
    private WorkDatabase f5854l;

    /* renamed from: m */
    private C1503h f5855m;

    /* renamed from: n */
    private C1493b f5856n;

    /* renamed from: o */
    private C1515k f5857o;

    /* renamed from: p */
    private List<String> f5858p;

    /* renamed from: q */
    private String f5859q;

    /* renamed from: r */
    private volatile boolean f5860r;

    /* renamed from: androidx.work.impl.h$a */
    public static class C1550a {

        /* renamed from: a */
        Context f5867a;

        /* renamed from: b */
        ListenableWorker f5868b;

        /* renamed from: c */
        C1566a f5869c;

        /* renamed from: d */
        C1451a f5870d;

        /* renamed from: e */
        WorkDatabase f5871e;

        /* renamed from: f */
        String f5872f;

        /* renamed from: g */
        List<C1538c> f5873g;

        /* renamed from: h */
        C1450a f5874h = new C1450a();

        /* renamed from: a */
        public final C1546h mo6813a() {
            return new C1546h(this);
        }

        /* renamed from: a */
        public final C1550a mo6812a(List<C1538c> list) {
            this.f5873g = list;
            return this;
        }

        /* renamed from: a */
        public final C1550a mo6811a(C1450a aVar) {
            if (aVar != null) {
                this.f5874h = aVar;
            }
            return this;
        }

        public C1550a(Context context, C1451a aVar, C1566a aVar2, WorkDatabase workDatabase, String str) {
            this.f5867a = context.getApplicationContext();
            this.f5869c = aVar2;
            this.f5870d = aVar;
            this.f5871e = workDatabase;
            this.f5872f = str;
        }
    }

    /* renamed from: j */
    private void m7598j() {
        if (this.f5853k.mo6841b() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be executed on the Background executor thread.");
        }
    }

    public final void run() {
        this.f5858p = this.f5857o.mo6772a(this.f5848f);
        this.f5859q = m7586a(this.f5858p);
        m7589b();
    }

    /* renamed from: c */
    private void m7591c() {
        State d = this.f5855m.mo6770d(this.f5848f);
        if (d == State.RUNNING) {
            C1642a.m8034a("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f5848f});
            m7590b(true);
            return;
        }
        C1642a.m8034a("Status for %s is %s; not doing any work", new Object[]{this.f5848f, d});
        m7590b(false);
    }

    /* renamed from: d */
    private boolean m7592d() {
        boolean z = false;
        if (!this.f5860r) {
            return false;
        }
        C1642a.m8034a("Work interrupted for %s", new Object[]{this.f5859q});
        State d = this.f5855m.mo6770d(this.f5848f);
        if (d != null && !d.isFinished()) {
            z = true;
        }
        m7590b(z);
        return true;
    }

    /* renamed from: e */
    private boolean m7593e() {
        this.f5854l.mo313d();
        try {
            boolean z = true;
            if (this.f5855m.mo6770d(this.f5848f) == State.ENQUEUED) {
                this.f5855m.mo6760a(State.RUNNING, this.f5848f);
                this.f5855m.mo6767b(this.f5848f);
            } else {
                z = false;
            }
            this.f5854l.mo315f();
            return z;
        } finally {
            this.f5854l.mo314e();
        }
    }

    /* renamed from: f */
    private void m7594f() {
        this.f5854l.mo313d();
        try {
            m7588a(this.f5848f);
            if (this.f5844b != null) {
                this.f5855m.mo6765a(this.f5848f, this.f5844b.f5625b);
            }
            this.f5854l.mo315f();
        } finally {
            this.f5854l.mo314e();
            m7590b(false);
        }
    }

    /* renamed from: g */
    private void m7595g() {
        this.f5854l.mo313d();
        try {
            this.f5855m.mo6760a(State.ENQUEUED, this.f5848f);
            this.f5855m.mo6764a(this.f5848f, System.currentTimeMillis());
            if (VERSION.SDK_INT < 23) {
                this.f5855m.mo6768b(this.f5848f, -1);
            }
            this.f5854l.mo315f();
        } finally {
            this.f5854l.mo314e();
            m7590b(true);
        }
    }

    /* renamed from: h */
    private void m7596h() {
        this.f5854l.mo313d();
        try {
            this.f5855m.mo6764a(this.f5848f, Math.max(System.currentTimeMillis(), this.f5851i.f5747n + this.f5851i.f5741h));
            this.f5855m.mo6760a(State.ENQUEUED, this.f5848f);
            this.f5855m.mo6769c(this.f5848f);
            if (VERSION.SDK_INT < 23) {
                this.f5855m.mo6768b(this.f5848f, -1);
            }
            this.f5854l.mo315f();
        } finally {
            this.f5854l.mo314e();
            m7590b(false);
        }
    }

    /* renamed from: i */
    private void m7597i() {
        this.f5854l.mo313d();
        try {
            this.f5855m.mo6760a(State.SUCCEEDED, this.f5848f);
            this.f5855m.mo6765a(this.f5848f, this.f5844b.f5625b);
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f5856n.mo6747b(this.f5848f)) {
                if (this.f5856n.mo6746a(str)) {
                    C1642a.m8034a("Setting status to enqueued for %s", new Object[]{str});
                    this.f5855m.mo6760a(State.ENQUEUED, str);
                    this.f5855m.mo6764a(str, currentTimeMillis);
                }
            }
            this.f5854l.mo315f();
        } finally {
            this.f5854l.mo314e();
            m7590b(false);
        }
    }

    /* renamed from: b */
    private void m7589b() {
        C1458e a;
        if (!m7592d()) {
            this.f5854l.mo313d();
            try {
                this.f5851i = this.f5855m.mo6761a(this.f5848f);
                if (this.f5851i == null) {
                    C1642a.m8034a("Didn't find WorkSpec for id %s", new Object[]{this.f5848f});
                    m7590b(false);
                } else if (this.f5851i.f5735b != State.ENQUEUED) {
                    m7591c();
                    this.f5854l.mo315f();
                    this.f5854l.mo314e();
                } else {
                    this.f5854l.mo315f();
                    this.f5854l.mo314e();
                    if (this.f5851i.mo6753a()) {
                        a = this.f5851i.f5738e;
                    } else {
                        C1460f a2 = C1460f.m7328a(this.f5851i.f5737d);
                        if (a2 == null) {
                            C1642a.m8034a("Could not create Input Merger %s", new Object[]{this.f5851i.f5737d});
                            m7594f();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f5851i.f5738e);
                        arrayList.addAll(this.f5855m.mo6771e(this.f5848f));
                        a = a2.mo6664a((List<C1458e>) arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f5848f), a, this.f5858p, this.f5850h, this.f5851i.f5744k, this.f5852j.f5644a, this.f5853k, this.f5852j.f5645b);
                    if (this.f5843a == null) {
                        this.f5843a = this.f5852j.f5645b.mo6854a(this.f5847e, this.f5851i.f5736c, workerParameters);
                    }
                    if (this.f5843a == null) {
                        C1642a.m8034a("Could not create Worker %s", new Object[]{this.f5851i.f5736c});
                        m7594f();
                    } else if (this.f5843a.f5622c) {
                        C1642a.m8034a("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f5851i.f5736c});
                        m7594f();
                    } else {
                        this.f5843a.mo6670f();
                        if (!m7593e()) {
                            m7591c();
                        } else if (!m7592d()) {
                            final C1564c a3 = C1564c.m7648a();
                            this.f5853k.mo6839a().execute(new Runnable() {
                                public final void run() {
                                    try {
                                        C1546h.this.f5846d = C1546h.this.f5843a.mo6667c();
                                        a3.mo6819a(C1546h.this.f5846d);
                                    } catch (Throwable th) {
                                        a3.mo6821a(th);
                                    }
                                }
                            });
                            final String str = this.f5859q;
                            a3.mo6818a((Runnable) new Runnable() {
                                public final void run() {
                                    try {
                                        C1546h.this.f5844b = (C1448a) a3.get();
                                    } catch (CancellationException e) {
                                        C1642a.m8034a("%s was cancelled", new Object[]{str});
                                        new Throwable[1][0] = e;
                                    } catch (InterruptedException | ExecutionException e2) {
                                        C1642a.m8034a("%s failed because it threw an exception/error", new Object[]{str});
                                        new Throwable[1][0] = e2;
                                    } catch (Throwable th) {
                                        C1546h.this.mo6806a();
                                        throw th;
                                    }
                                    C1546h.this.mo6806a();
                                }
                            }, this.f5853k.mo6842c());
                        }
                    }
                }
            } finally {
                this.f5854l.mo314e();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6806a() {
        m7598j();
        boolean z = false;
        if (!m7592d()) {
            try {
                this.f5854l.mo313d();
                State d = this.f5855m.mo6770d(this.f5848f);
                if (d == null) {
                    m7590b(false);
                    z = true;
                } else if (d == State.RUNNING) {
                    m7587a(this.f5844b.f5624a);
                    z = this.f5855m.mo6770d(this.f5848f).isFinished();
                } else if (!d.isFinished()) {
                    m7595g();
                }
                this.f5854l.mo315f();
            } finally {
                this.f5854l.mo314e();
            }
        }
        if (this.f5849g != null) {
            if (z) {
                for (C1538c a : this.f5849g) {
                    a.mo6773a(this.f5848f);
                }
            }
            C1539d.m7570a(this.f5852j, this.f5854l, this.f5849g);
        }
    }

    /* renamed from: a */
    public final void mo6807a(boolean z) {
        this.f5860r = true;
        m7592d();
        if (this.f5846d != null) {
            this.f5846d.cancel(true);
        }
        if (this.f5843a != null) {
            this.f5843a.mo6668d();
        }
    }

    /* renamed from: a */
    private String m7586a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f5848f);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private void m7590b(boolean z) {
        try {
            this.f5854l.mo313d();
            if (this.f5854l.mo6697i().mo6762a().isEmpty()) {
                C1565b.m7652a(this.f5847e, RescheduleReceiver.class, false);
            }
            this.f5854l.mo315f();
            this.f5854l.mo314e();
            this.f5845c.mo6820a(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f5854l.mo314e();
            throw th;
        }
    }

    C1546h(C1550a aVar) {
        this.f5847e = aVar.f5867a;
        this.f5853k = aVar.f5869c;
        this.f5848f = aVar.f5872f;
        this.f5849g = aVar.f5873g;
        this.f5850h = aVar.f5874h;
        this.f5843a = aVar.f5868b;
        this.f5852j = aVar.f5870d;
        this.f5854l = aVar.f5871e;
        this.f5855m = this.f5854l.mo6697i();
        this.f5856n = this.f5854l.mo6698j();
        this.f5857o = this.f5854l.mo6699k();
    }

    /* renamed from: a */
    private void m7587a(Result result) {
        switch (result) {
            case SUCCESS:
                C1642a.m8034a("Worker result SUCCESS for %s", new Object[]{this.f5859q});
                if (this.f5851i.mo6753a()) {
                    m7596h();
                    return;
                } else {
                    m7597i();
                    return;
                }
            case RETRY:
                C1642a.m8034a("Worker result RETRY for %s", new Object[]{this.f5859q});
                m7595g();
                return;
            default:
                C1642a.m8034a("Worker result FAILURE for %s", new Object[]{this.f5859q});
                if (this.f5851i.mo6753a()) {
                    m7596h();
                    return;
                } else {
                    m7594f();
                    return;
                }
        }
    }

    /* renamed from: a */
    private void m7588a(String str) {
        for (String a : this.f5856n.mo6747b(str)) {
            m7588a(a);
        }
        if (this.f5855m.mo6770d(str) != State.CANCELLED) {
            this.f5855m.mo6760a(State.FAILED, str);
        }
    }
}
