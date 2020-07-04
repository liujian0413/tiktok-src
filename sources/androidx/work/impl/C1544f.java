package androidx.work.impl;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1451a;
import androidx.work.C1461g;
import androidx.work.C1462h;
import androidx.work.WorkerParameters.C1450a;
import androidx.work.impl.background.p037a.C1520a;
import androidx.work.impl.background.systemjob.C1537b;
import androidx.work.impl.utils.C1571c;
import androidx.work.impl.utils.C1572d;
import androidx.work.impl.utils.C1573e;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.p039b.C1566a;
import androidx.work.impl.utils.p039b.C1567b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.work.impl.f */
public final class C1544f extends C1462h {

    /* renamed from: j */
    private static C1544f f5831j;

    /* renamed from: k */
    private static C1544f f5832k;

    /* renamed from: l */
    private static final Object f5833l = new Object();

    /* renamed from: a */
    public Context f5834a;

    /* renamed from: b */
    public C1451a f5835b;

    /* renamed from: c */
    public WorkDatabase f5836c;

    /* renamed from: d */
    public C1566a f5837d;

    /* renamed from: e */
    public List<C1538c> f5838e;

    /* renamed from: f */
    public C1490b f5839f;

    /* renamed from: g */
    public C1571c f5840g;

    /* renamed from: h */
    private boolean f5841h;

    /* renamed from: i */
    private PendingResult f5842i;

    /* renamed from: c */
    public static C1544f m7577c() {
        return C1545g.m7585a();
    }

    /* renamed from: d */
    public static C1544f m7578d() {
        synchronized (f5833l) {
            if (f5831j != null) {
                C1544f fVar = f5831j;
                return fVar;
            }
            C1544f fVar2 = f5832k;
            return fVar2;
        }
    }

    /* renamed from: e */
    public final void mo6804e() {
        if (VERSION.SDK_INT >= 23) {
            C1537b.m7562a(this.f5834a);
        }
        this.f5836c.mo6697i().mo6766b();
        C1539d.m7570a(this.f5835b, this.f5836c, this.f5838e);
    }

    /* renamed from: f */
    public final void mo6805f() {
        synchronized (f5833l) {
            this.f5841h = true;
            if (this.f5842i != null) {
                this.f5842i.finish();
                this.f5842i = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo6801a(String str) {
        mo6802a(str, (C1450a) null);
    }

    /* renamed from: b */
    public final void mo6803b(String str) {
        this.f5837d.mo6840a(new C1573e(this, str));
    }

    /* renamed from: a */
    public final void mo6800a(PendingResult pendingResult) {
        synchronized (f5833l) {
            this.f5842i = pendingResult;
            if (this.f5841h) {
                this.f5842i.finish();
                this.f5842i = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo6802a(String str, C1450a aVar) {
        this.f5837d.mo6840a(new C1572d(this, str, aVar));
    }

    /* renamed from: a */
    private static List<C1538c> m7574a(Context context, C1544f fVar) {
        return Arrays.asList(new C1538c[]{C1539d.m7569a(context, fVar), new C1520a(context, fVar)});
    }

    /* renamed from: b */
    public static void m7576b(Context context, C1451a aVar) {
        synchronized (f5833l) {
            if (f5831j != null) {
                if (f5832k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (f5831j == null) {
                Context applicationContext = context.getApplicationContext();
                if (f5832k == null) {
                    f5832k = new C1544f(applicationContext, aVar, new C1567b());
                }
                f5831j = f5832k;
            }
        }
    }

    private C1544f(Context context, C1451a aVar, C1566a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(R.bool.n));
    }

    private C1544f(Context context, C1451a aVar, C1566a aVar2, boolean z) {
        Context applicationContext = context.getApplicationContext();
        Context context2 = context;
        C1451a aVar3 = aVar;
        C1566a aVar4 = aVar2;
        WorkDatabase a = WorkDatabase.m7335a(applicationContext, z);
        List a2 = m7574a(applicationContext, this);
        C1490b bVar = new C1490b(context2, aVar3, aVar4, a, a2);
        m7575a(context2, aVar3, aVar4, a, a2, bVar);
    }

    /* renamed from: a */
    private void m7575a(Context context, C1451a aVar, C1566a aVar2, WorkDatabase workDatabase, List<C1538c> list, C1490b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5834a = applicationContext;
        this.f5835b = aVar;
        this.f5837d = aVar2;
        this.f5836c = workDatabase;
        this.f5838e = list;
        this.f5839f = bVar;
        this.f5840g = new C1571c(this.f5834a);
        this.f5841h = false;
        C1461g.m7330a(this.f5835b.f5646c);
        this.f5837d.mo6840a(new ForceStopRunnable(applicationContext, this));
    }
}
