package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p022v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.p749d.C15176d;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.internal.measurement.C16494ec;
import com.google.android.gms.internal.measurement.C16498eg;
import com.google.android.gms.internal.measurement.C16499eh;
import com.google.android.gms.internal.measurement.C16501ej;
import com.p280ss.android.ugc.aweme.main.guide.C33040a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.measurement.internal.ed */
public class C16912ed implements C16850bw {

    /* renamed from: b */
    private static volatile C16912ed f47277b;

    /* renamed from: a */
    public final C16825ay f47278a;

    /* renamed from: c */
    private C16819as f47279c;

    /* renamed from: d */
    private C16957v f47280d;

    /* renamed from: e */
    private C16933ex f47281e;

    /* renamed from: f */
    private C16804ad f47282f;

    /* renamed from: g */
    private C16907dz f47283g;

    /* renamed from: h */
    private C16927er f47284h;

    /* renamed from: i */
    private final C16919ej f47285i;

    /* renamed from: j */
    private C16868cn f47286j;

    /* renamed from: k */
    private boolean f47287k;

    /* renamed from: l */
    private boolean f47288l;

    /* renamed from: m */
    private boolean f47289m;

    /* renamed from: n */
    private long f47290n;

    /* renamed from: o */
    private List<Runnable> f47291o;

    /* renamed from: p */
    private int f47292p;

    /* renamed from: q */
    private int f47293q;

    /* renamed from: r */
    private boolean f47294r;

    /* renamed from: s */
    private boolean f47295s;

    /* renamed from: t */
    private boolean f47296t;

    /* renamed from: u */
    private FileLock f47297u;

    /* renamed from: v */
    private FileChannel f47298v;

    /* renamed from: w */
    private List<Long> f47299w;

    /* renamed from: x */
    private List<Long> f47300x;

    /* renamed from: y */
    private long f47301y;

    /* renamed from: com.google.android.gms.measurement.internal.ed$a */
    class C16913a implements C16935ez {

        /* renamed from: a */
        C16501ej f47302a;

        /* renamed from: b */
        List<Long> f47303b;

        /* renamed from: c */
        List<C16498eg> f47304c;

        /* renamed from: d */
        private long f47305d;

        private C16913a() {
        }

        /* renamed from: a */
        public final void mo43875a(C16501ej ejVar) {
            C15267r.m44384a(ejVar);
            this.f47302a = ejVar;
        }

        /* renamed from: a */
        public final boolean mo43876a(long j, C16498eg egVar) {
            C15267r.m44384a(egVar);
            if (this.f47304c == null) {
                this.f47304c = new ArrayList();
            }
            if (this.f47303b == null) {
                this.f47303b = new ArrayList();
            }
            if (this.f47304c.size() > 0 && m55910a((C16498eg) this.f47304c.get(0)) != m55910a(egVar)) {
                return false;
            }
            long e = this.f47305d + ((long) egVar.mo43168e());
            if (e >= ((long) Math.max(0, ((Integer) C16942h.f47449q.mo44132a()).intValue()))) {
                return false;
            }
            this.f47305d = e;
            this.f47304c.add(egVar);
            this.f47303b.add(Long.valueOf(j));
            if (this.f47304c.size() >= Math.max(1, ((Integer) C16942h.f47450r.mo44132a()).intValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private static long m55910a(C16498eg egVar) {
            return ((egVar.f46184c.longValue() / 1000) / 60) / 60;
        }

        /* synthetic */ C16913a(C16912ed edVar, C16914ee eeVar) {
            this();
        }
    }

    /* renamed from: a */
    public static C16912ed m55850a(Context context) {
        C15267r.m44384a(context);
        C15267r.m44384a(context.getApplicationContext());
        if (f47277b == null) {
            synchronized (C16912ed.class) {
                if (f47277b == null) {
                    f47277b = new C16912ed(new C16918ei(context));
                }
            }
        }
        return f47277b;
    }

    private C16912ed(C16918ei eiVar) {
        this(eiVar, null);
    }

    private C16912ed(C16918ei eiVar, C16825ay ayVar) {
        C15267r.m44384a(eiVar);
        this.f47278a = C16825ay.m55497a(eiVar.f47314a, (C16948m) null);
        this.f47301y = -1;
        C16919ej ejVar = new C16919ej(this);
        ejVar.mo43844t();
        this.f47285i = ejVar;
        C16957v vVar = new C16957v(this);
        vVar.mo43844t();
        this.f47280d = vVar;
        C16819as asVar = new C16819as(this);
        asVar.mo43844t();
        this.f47279c = asVar;
        this.f47278a.mo43584p().mo43645a((Runnable) new C16914ee(this, eiVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m55855a(C16918ei eiVar) {
        this.f47278a.mo43584p().mo43571c();
        C16933ex exVar = new C16933ex(this);
        exVar.mo43844t();
        this.f47281e = exVar;
        this.f47278a.f47009e.f47356a = this.f47279c;
        C16927er erVar = new C16927er(this);
        erVar.mo43844t();
        this.f47284h = erVar;
        C16868cn cnVar = new C16868cn(this);
        cnVar.mo43844t();
        this.f47286j = cnVar;
        C16907dz dzVar = new C16907dz(this);
        dzVar.mo43844t();
        this.f47283g = dzVar;
        this.f47282f = new C16804ad(this);
        if (this.f47292p != this.f47293q) {
            this.f47278a.mo43585q().f47487a.mo44162a("Not all upload components initialized", Integer.valueOf(this.f47292p), Integer.valueOf(this.f47293q));
        }
        this.f47287k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43845a() {
        this.f47278a.mo43584p().mo43571c();
        mo43864d().mo44118z();
        if (this.f47278a.mo43658b().f46917c.mo43614a() == 0) {
            this.f47278a.mo43658b().f46917c.mo43615a(this.f47278a.mo43580l().mo38684a());
        }
        m55873x();
    }

    /* renamed from: b */
    public final C16930eu mo43857b() {
        return this.f47278a.f47009e;
    }

    /* renamed from: q */
    public final C16953r mo43585q() {
        return this.f47278a.mo43585q();
    }

    /* renamed from: p */
    public final C16820at mo43584p() {
        return this.f47278a.mo43584p();
    }

    /* renamed from: r */
    private final C16819as m55867r() {
        m55864b((C16911ec) this.f47279c);
        return this.f47279c;
    }

    /* renamed from: c */
    public final C16957v mo43862c() {
        m55864b((C16911ec) this.f47280d);
        return this.f47280d;
    }

    /* renamed from: d */
    public final C16933ex mo43864d() {
        m55864b((C16911ec) this.f47281e);
        return this.f47281e;
    }

    /* renamed from: s */
    private final C16804ad m55868s() {
        if (this.f47282f != null) {
            return this.f47282f;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: t */
    private final C16907dz m55869t() {
        m55864b((C16911ec) this.f47283g);
        return this.f47283g;
    }

    /* renamed from: e */
    public final C16927er mo43866e() {
        m55864b((C16911ec) this.f47284h);
        return this.f47284h;
    }

    /* renamed from: f */
    public final C16868cn mo43867f() {
        m55864b((C16911ec) this.f47286j);
        return this.f47286j;
    }

    /* renamed from: g */
    public final C16919ej mo43868g() {
        m55864b((C16911ec) this.f47285i);
        return this.f47285i;
    }

    /* renamed from: h */
    public final C16951p mo43869h() {
        return this.f47278a.mo43663g();
    }

    /* renamed from: m */
    public final Context mo43581m() {
        return this.f47278a.mo43581m();
    }

    /* renamed from: l */
    public final C15322e mo43580l() {
        return this.f47278a.mo43580l();
    }

    /* renamed from: i */
    public final C16922em mo43870i() {
        return this.f47278a.mo43662f();
    }

    /* renamed from: u */
    private final void m55870u() {
        this.f47278a.mo43584p().mo43571c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo43871j() {
        if (!this.f47287k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: b */
    private static void m55864b(C16911ec ecVar) {
        if (ecVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!ecVar.mo43842i()) {
            String valueOf = String.valueOf(ecVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43851a(zzk zzk) {
        m55870u();
        mo43871j();
        C15267r.m44386a(zzk.f47530a);
        m55866e(zzk);
    }

    /* renamed from: v */
    private final long m55871v() {
        long a = this.f47278a.mo43580l().mo38684a();
        C16806af b = this.f47278a.mo43658b();
        b.mo43718x();
        b.mo43571c();
        long a2 = b.f46921g.mo43614a();
        if (a2 == 0) {
            a2 = 1 + ((long) b.mo43583o().mo43914g().nextInt(C33040a.f86003c));
            b.f46921g.mo43615a(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43849a(zzag zzag, String str) {
        zzag zzag2 = zzag;
        String str2 = str;
        C16924eo b = mo43864d().mo44099b(str2);
        if (b == null || TextUtils.isEmpty(b.mo43958j())) {
            this.f47278a.mo43585q().f47494h.mo44161a("No app data available; dropping event", str2);
            return;
        }
        Boolean b2 = m55863b(b);
        if (b2 == null) {
            if (!"_ui".equals(zzag2.f47518a)) {
                this.f47278a.mo43585q().f47490d.mo44161a("Could not find package. appId", C16953r.m56340a(str));
            }
        } else if (!b2.booleanValue()) {
            this.f47278a.mo43585q().f47487a.mo44161a("App version does not match; dropping event. appId", C16953r.m56340a(str));
            return;
        }
        zzk zzk = r2;
        C16924eo eoVar = b;
        zzk zzk2 = new zzk(str, b.mo43941d(), b.mo43958j(), b.mo43960k(), b.mo43962l(), b.mo43964m(), b.mo43966n(), (String) null, b.mo43969o(), false, eoVar.mo43950g(), eoVar.mo43926B(), 0, 0, eoVar.mo43927C(), eoVar.mo43928D(), false, eoVar.mo43944e());
        mo43848a(zzag2, zzk);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43848a(zzag zzag, zzk zzk) {
        List<zzo> list;
        List<zzo> list2;
        List<zzo> list3;
        zzag zzag2 = zzag;
        zzk zzk2 = zzk;
        C15267r.m44384a(zzk);
        C15267r.m44386a(zzk2.f47530a);
        m55870u();
        mo43871j();
        String str = zzk2.f47530a;
        long j = zzag2.f47521d;
        if (mo43868g().mo43886a(zzag2, zzk2)) {
            if (!zzk2.f47537h) {
                m55866e(zzk2);
                return;
            }
            mo43864d().mo44108e();
            try {
                C16933ex d = mo43864d();
                C15267r.m44386a(str);
                d.mo43571c();
                d.mo43843j();
                if (j < 0) {
                    d.mo43585q().f47490d.mo44162a("Invalid time querying timed out conditional properties", C16953r.m56340a(str), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = d.mo44089a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzo zzo : list) {
                    if (zzo != null) {
                        this.f47278a.mo43585q().f47494h.mo44163a("User property timed out", zzo.f47548a, this.f47278a.mo43663g().mo44155c(zzo.f47550c.f47522a), zzo.f47550c.mo44178a());
                        if (zzo.f47554g != null) {
                            m55865b(new zzag(zzo.f47554g, j), zzk2);
                        }
                        mo43864d().mo44106e(str, zzo.f47550c.f47522a);
                    }
                }
                C16933ex d2 = mo43864d();
                C15267r.m44386a(str);
                d2.mo43571c();
                d2.mo43843j();
                if (j < 0) {
                    d2.mo43585q().f47490d.mo44162a("Invalid time querying expired conditional properties", C16953r.m56340a(str), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = d2.mo44089a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzo zzo2 : list2) {
                    if (zzo2 != null) {
                        this.f47278a.mo43585q().f47494h.mo44163a("User property expired", zzo2.f47548a, this.f47278a.mo43663g().mo44155c(zzo2.f47550c.f47522a), zzo2.f47550c.mo44178a());
                        mo43864d().mo44101b(str, zzo2.f47550c.f47522a);
                        if (zzo2.f47558k != null) {
                            arrayList.add(zzo2.f47558k);
                        }
                        mo43864d().mo44106e(str, zzo2.f47550c.f47522a);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    m55865b(new zzag((zzag) obj, j), zzk2);
                }
                C16933ex d3 = mo43864d();
                String str2 = zzag2.f47518a;
                C15267r.m44386a(str);
                C15267r.m44386a(str2);
                d3.mo43571c();
                d3.mo43843j();
                if (j < 0) {
                    d3.mo43585q().f47490d.mo44163a("Invalid time querying triggered conditional properties", C16953r.m56340a(str), d3.mo43582n().mo44153a(str2), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = d3.mo44089a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(list3.size());
                for (zzo zzo3 : list3) {
                    if (zzo3 != null) {
                        zzfv zzfv = zzo3.f47550c;
                        C16921el elVar = r4;
                        C16921el elVar2 = new C16921el(zzo3.f47548a, zzo3.f47549b, zzfv.f47522a, j, zzfv.mo44178a());
                        if (mo43864d().mo44096a(elVar)) {
                            this.f47278a.mo43585q().f47494h.mo44163a("User property triggered", zzo3.f47548a, this.f47278a.mo43663g().mo44155c(elVar.f47317c), elVar.f47319e);
                        } else {
                            this.f47278a.mo43585q().f47487a.mo44163a("Too many active user properties, ignoring", C16953r.m56340a(zzo3.f47548a), this.f47278a.mo43663g().mo44155c(elVar.f47317c), elVar.f47319e);
                        }
                        if (zzo3.f47556i != null) {
                            arrayList3.add(zzo3.f47556i);
                        }
                        zzo3.f47550c = new zzfv(elVar);
                        zzo3.f47552e = true;
                        mo43864d().mo44097a(zzo3);
                    }
                }
                m55865b(zzag, zzk);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    m55865b(new zzag((zzag) obj2, j), zzk2);
                }
                mo43864d().mo44113u();
            } finally {
                mo43864d().mo44114v();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:186:0x071c, code lost:
        r2 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x024d A[Catch:{ SQLiteException -> 0x021c, all -> 0x07c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x027e A[Catch:{ SQLiteException -> 0x021c, all -> 0x07c7 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m55865b(com.google.android.gms.measurement.internal.zzag r26, com.google.android.gms.measurement.internal.zzk r27) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r3 = r27
            com.google.android.gms.common.internal.C15267r.m44384a(r27)
            java.lang.String r0 = r3.f47530a
            com.google.android.gms.common.internal.C15267r.m44386a(r0)
            long r4 = java.lang.System.nanoTime()
            r25.m55870u()
            r25.mo43871j()
            java.lang.String r15 = r3.f47530a
            com.google.android.gms.measurement.internal.ej r0 = r25.mo43868g()
            boolean r0 = r0.mo43886a(r2, r3)
            if (r0 != 0) goto L_0x0025
            return
        L_0x0025:
            boolean r0 = r3.f47537h
            if (r0 != 0) goto L_0x002d
            r1.m55866e(r3)
            return
        L_0x002d:
            com.google.android.gms.measurement.internal.as r0 = r25.m55867r()
            java.lang.String r6 = r2.f47518a
            boolean r0 = r0.mo43632b(r15, r6)
            r14 = 0
            r21 = 1
            if (r0 == 0) goto L_0x00d3
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47490d
            java.lang.String r3 = "Dropping blacklisted event. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C16953r.m56340a(r15)
            com.google.android.gms.measurement.internal.ay r5 = r1.f47278a
            com.google.android.gms.measurement.internal.p r5 = r5.mo43663g()
            java.lang.String r6 = r2.f47518a
            java.lang.String r5 = r5.mo44153a(r6)
            r0.mo44162a(r3, r4, r5)
            com.google.android.gms.measurement.internal.as r0 = r25.m55867r()
            boolean r0 = r0.mo43640f(r15)
            if (r0 != 0) goto L_0x006d
            com.google.android.gms.measurement.internal.as r0 = r25.m55867r()
            boolean r0 = r0.mo43642g(r15)
            if (r0 == 0) goto L_0x006e
        L_0x006d:
            r14 = 1
        L_0x006e:
            if (r14 != 0) goto L_0x008b
            java.lang.String r0 = "_err"
            java.lang.String r3 = r2.f47518a
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x008b
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a
            com.google.android.gms.measurement.internal.em r6 = r0.mo43662f()
            r8 = 11
            java.lang.String r9 = "_ev"
            java.lang.String r10 = r2.f47518a
            r11 = 0
            r7 = r15
            r6.mo43903a(r7, r8, r9, r10, r11)
        L_0x008b:
            if (r14 == 0) goto L_0x00d2
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()
            com.google.android.gms.measurement.internal.eo r0 = r0.mo44099b(r15)
            if (r0 == 0) goto L_0x00d2
            long r2 = r0.mo43972r()
            long r4 = r0.mo43971q()
            long r2 = java.lang.Math.max(r2, r4)
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a
            com.google.android.gms.common.util.e r4 = r4.mo43580l()
            long r4 = r4.mo38684a()
            long r4 = r4 - r2
            long r2 = java.lang.Math.abs(r4)
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r4 = com.google.android.gms.measurement.internal.C16942h.f47387H
            java.lang.Object r4 = r4.mo44132a()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d2
            com.google.android.gms.measurement.internal.ay r2 = r1.f47278a
            com.google.android.gms.measurement.internal.r r2 = r2.mo43585q()
            com.google.android.gms.measurement.internal.t r2 = r2.f47494h
            java.lang.String r3 = "Fetching config for blacklisted app"
            r2.mo44160a(r3)
            r1.m55856a(r0)
        L_0x00d2:
            return
        L_0x00d3:
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()
            r13 = 2
            boolean r0 = r0.mo44158a(r13)
            if (r0 == 0) goto L_0x00f7
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47495i
            java.lang.String r6 = "Logging event"
            com.google.android.gms.measurement.internal.ay r7 = r1.f47278a
            com.google.android.gms.measurement.internal.p r7 = r7.mo43663g()
            java.lang.String r7 = r7.mo44152a(r2)
            r0.mo44161a(r6, r7)
        L_0x00f7:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()
            r0.mo44108e()
            r1.m55866e(r3)     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = "_iap"
            java.lang.String r6 = r2.f47518a     // Catch:{ all -> 0x07c7 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x07c7 }
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = "ecommerce_purchase"
            java.lang.String r6 = r2.f47518a     // Catch:{ all -> 0x07c7 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x07c7 }
            if (r0 == 0) goto L_0x028d
        L_0x0115:
            com.google.android.gms.measurement.internal.zzad r0 = r2.f47519b     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "currency"
            java.lang.String r0 = r0.mo44172d(r6)     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "ecommerce_purchase"
            java.lang.String r7 = r2.f47518a     // Catch:{ all -> 0x07c7 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x07c7 }
            if (r6 == 0) goto L_0x017b
            com.google.android.gms.measurement.internal.zzad r6 = r2.f47519b     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "value"
            java.lang.Double r6 = r6.mo44171c(r7)     // Catch:{ all -> 0x07c7 }
            double r6 = r6.doubleValue()     // Catch:{ all -> 0x07c7 }
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r6 * r8
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0152
            com.google.android.gms.measurement.internal.zzad r6 = r2.f47519b     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "value"
            java.lang.Long r6 = r6.mo44170b(r7)     // Catch:{ all -> 0x07c7 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x07c7 }
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r8
        L_0x0152:
            r8 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0163
            r8 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0163
            long r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x07c7 }
            goto L_0x0187
        L_0x0163:
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47490d     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C16953r.m56340a(r15)     // Catch:{ all -> 0x07c7 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ all -> 0x07c7 }
            r0.mo44162a(r8, r9, r6)     // Catch:{ all -> 0x07c7 }
            r0 = 0
            goto L_0x027c
        L_0x017b:
            com.google.android.gms.measurement.internal.zzad r6 = r2.f47519b     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "value"
            java.lang.Long r6 = r6.mo44170b(r7)     // Catch:{ all -> 0x07c7 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x07c7 }
        L_0x0187:
            boolean r8 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x07c7 }
            if (r8 != 0) goto L_0x027b
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r0.toUpperCase(r8)     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = "[A-Z]{3}"
            boolean r8 = r0.matches(r8)     // Catch:{ all -> 0x07c7 }
            if (r8 == 0) goto L_0x027b
            java.lang.String r8 = "_ltv_"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x07c7 }
            int r9 = r0.length()     // Catch:{ all -> 0x07c7 }
            if (r9 == 0) goto L_0x01b1
            java.lang.String r0 = r8.concat(r0)     // Catch:{ all -> 0x07c7 }
        L_0x01af:
            r9 = r0
            goto L_0x01b7
        L_0x01b1:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x07c7 }
            r0.<init>(r8)     // Catch:{ all -> 0x07c7 }
            goto L_0x01af
        L_0x01b7:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.el r0 = r0.mo44103c(r15, r9)     // Catch:{ all -> 0x07c7 }
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r8 = r0.f47319e     // Catch:{ all -> 0x07c7 }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x07c7 }
            if (r8 != 0) goto L_0x01c8
            goto L_0x01ec
        L_0x01c8:
            java.lang.Object r0 = r0.f47319e     // Catch:{ all -> 0x07c7 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x07c7 }
            long r10 = r0.longValue()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.el r0 = new com.google.android.gms.measurement.internal.el     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = r2.f47520c     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r12 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.common.util.e r12 = r12.mo43580l()     // Catch:{ all -> 0x07c7 }
            long r16 = r12.mo38684a()     // Catch:{ all -> 0x07c7 }
            r12 = 0
            long r10 = r10 + r6
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x07c7 }
            r6 = r0
            r7 = r15
            r10 = r16
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x07c7 }
            goto L_0x0243
        L_0x01ec:
            com.google.android.gms.measurement.internal.ex r8 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.eu r0 = r0.f47009e     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.C16942h.f47392M     // Catch:{ all -> 0x07c7 }
            int r0 = r0.mo44049b(r15, r10)     // Catch:{ all -> 0x07c7 }
            int r0 = r0 + -1
            com.google.android.gms.common.internal.C15267r.m44386a(r15)     // Catch:{ all -> 0x07c7 }
            r8.mo43571c()     // Catch:{ all -> 0x07c7 }
            r8.mo43843j()     // Catch:{ all -> 0x07c7 }
            android.database.sqlite.SQLiteDatabase r10 = r8.mo44115w()     // Catch:{ SQLiteException -> 0x021c }
            java.lang.String r11 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12 = 3
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x021c }
            r12[r14] = r15     // Catch:{ SQLiteException -> 0x021c }
            r12[r21] = r15     // Catch:{ SQLiteException -> 0x021c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x021c }
            r12[r13] = r0     // Catch:{ SQLiteException -> 0x021c }
            r10.execSQL(r11, r12)     // Catch:{ SQLiteException -> 0x021c }
            goto L_0x022c
        L_0x021c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r8 = r8.mo43585q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r8 = r8.f47487a     // Catch:{ all -> 0x07c7 }
            java.lang.String r10 = "Error pruning currencies. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C16953r.m56340a(r15)     // Catch:{ all -> 0x07c7 }
            r8.mo44162a(r10, r11, r0)     // Catch:{ all -> 0x07c7 }
        L_0x022c:
            com.google.android.gms.measurement.internal.el r0 = new com.google.android.gms.measurement.internal.el     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = r2.f47520c     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r10 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.common.util.e r10 = r10.mo43580l()     // Catch:{ all -> 0x07c7 }
            long r10 = r10.mo38684a()     // Catch:{ all -> 0x07c7 }
            java.lang.Long r12 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07c7 }
            r6 = r0
            r7 = r15
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x07c7 }
        L_0x0243:
            com.google.android.gms.measurement.internal.ex r6 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            boolean r6 = r6.mo44096a(r0)     // Catch:{ all -> 0x07c7 }
            if (r6 != 0) goto L_0x027b
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r6 = r6.mo43585q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r6 = r6.f47487a     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C16953r.m56340a(r15)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r9 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.p r9 = r9.mo43663g()     // Catch:{ all -> 0x07c7 }
            java.lang.String r10 = r0.f47317c     // Catch:{ all -> 0x07c7 }
            java.lang.String r9 = r9.mo44155c(r10)     // Catch:{ all -> 0x07c7 }
            java.lang.Object r0 = r0.f47319e     // Catch:{ all -> 0x07c7 }
            r6.mo44163a(r7, r8, r9, r0)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r6 = r0.mo43662f()     // Catch:{ all -> 0x07c7 }
            r8 = 9
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r15
            r6.mo43903a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x07c7 }
        L_0x027b:
            r0 = 1
        L_0x027c:
            if (r0 != 0) goto L_0x028d
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            r0.mo44113u()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()
            r0.mo44114v()
            return
        L_0x028d:
            java.lang.String r0 = r2.f47518a     // Catch:{ all -> 0x07c7 }
            boolean r0 = com.google.android.gms.measurement.internal.C16922em.m55963a(r0)     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "_err"
            java.lang.String r7 = r2.f47518a     // Catch:{ all -> 0x07c7 }
            boolean r16 = r6.equals(r7)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r6 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            long r7 = r25.m55871v()     // Catch:{ all -> 0x07c7 }
            r10 = 1
            r12 = 0
            r17 = 0
            r9 = r15
            r11 = r0
            r13 = r16
            r22 = r4
            r4 = 0
            r14 = r17
            com.google.android.gms.measurement.internal.ey r5 = r6.mo44084a(r7, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x07c7 }
            long r6 = r5.f47369b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C16942h.f47451s     // Catch:{ all -> 0x07c7 }
            java.lang.Object r8 = r8.mo44132a()     // Catch:{ all -> 0x07c7 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x07c7 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x07c7 }
            long r8 = (long) r8     // Catch:{ all -> 0x07c7 }
            long r6 = r6 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            r10 = 1
            r13 = 0
            int r12 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x02f9
            long r6 = r6 % r8
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x02ea
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ all -> 0x07c7 }
            java.lang.String r2 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C16953r.m56340a(r15)     // Catch:{ all -> 0x07c7 }
            long r4 = r5.f47369b     // Catch:{ all -> 0x07c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07c7 }
            r0.mo44162a(r2, r3, r4)     // Catch:{ all -> 0x07c7 }
        L_0x02ea:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            r0.mo44113u()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()
            r0.mo44114v()
            return
        L_0x02f9:
            if (r0 == 0) goto L_0x0351
            long r6 = r5.f47368a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.C16942h.f47453u     // Catch:{ all -> 0x07c7 }
            java.lang.Object r12 = r12.mo44132a()     // Catch:{ all -> 0x07c7 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x07c7 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x07c7 }
            r24 = r5
            long r4 = (long) r12     // Catch:{ all -> 0x07c7 }
            long r6 = r6 - r4
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x034f
            long r6 = r6 % r8
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x032f
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ all -> 0x07c7 }
            java.lang.String r3 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C16953r.m56340a(r15)     // Catch:{ all -> 0x07c7 }
            r5 = r24
            long r5 = r5.f47368a     // Catch:{ all -> 0x07c7 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x07c7 }
            r0.mo44162a(r3, r4, r5)     // Catch:{ all -> 0x07c7 }
        L_0x032f:
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r6 = r0.mo43662f()     // Catch:{ all -> 0x07c7 }
            r8 = 16
            java.lang.String r9 = "_ev"
            java.lang.String r10 = r2.f47518a     // Catch:{ all -> 0x07c7 }
            r11 = 0
            r7 = r15
            r6.mo43903a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            r0.mo44113u()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()
            r0.mo44114v()
            return
        L_0x034f:
            r5 = r24
        L_0x0351:
            if (r16 == 0) goto L_0x039d
            long r6 = r5.f47371d     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.eu r4 = r4.f47009e     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = r3.f47530a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r9 = com.google.android.gms.measurement.internal.C16942h.f47452t     // Catch:{ all -> 0x07c7 }
            int r4 = r4.mo44049b(r8, r9)     // Catch:{ all -> 0x07c7 }
            r8 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x07c7 }
            r12 = 0
            int r4 = java.lang.Math.max(r12, r4)     // Catch:{ all -> 0x07c7 }
            long r8 = (long) r4     // Catch:{ all -> 0x07c7 }
            long r6 = r6 - r8
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x039e
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x038e
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ all -> 0x07c7 }
            java.lang.String r2 = "Too many error events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C16953r.m56340a(r15)     // Catch:{ all -> 0x07c7 }
            long r4 = r5.f47371d     // Catch:{ all -> 0x07c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07c7 }
            r0.mo44162a(r2, r3, r4)     // Catch:{ all -> 0x07c7 }
        L_0x038e:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            r0.mo44113u()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()
            r0.mo44114v()
            return
        L_0x039d:
            r12 = 0
        L_0x039e:
            com.google.android.gms.measurement.internal.zzad r4 = r2.f47519b     // Catch:{ all -> 0x07c7 }
            android.os.Bundle r4 = r4.mo44169b()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r5 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r5 = r5.mo43662f()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "_o"
            java.lang.String r7 = r2.f47520c     // Catch:{ all -> 0x07c7 }
            r5.mo43902a(r4, r6, r7)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r5 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r5 = r5.mo43662f()     // Catch:{ all -> 0x07c7 }
            boolean r5 = r5.mo43913f(r15)     // Catch:{ all -> 0x07c7 }
            if (r5 == 0) goto L_0x03db
            com.google.android.gms.measurement.internal.ay r5 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r5 = r5.mo43662f()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "_dbg"
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x07c7 }
            r5.mo43902a(r4, r6, r7)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r5 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r5 = r5.mo43662f()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "_r"
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x07c7 }
            r5.mo43902a(r4, r6, r7)     // Catch:{ all -> 0x07c7 }
        L_0x03db:
            com.google.android.gms.measurement.internal.ay r5 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.eu r5 = r5.f47009e     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r3.f47530a     // Catch:{ all -> 0x07c7 }
            boolean r5 = r5.mo44071q(r6)     // Catch:{ all -> 0x07c7 }
            if (r5 == 0) goto L_0x0412
            java.lang.String r5 = "_s"
            java.lang.String r6 = r2.f47518a     // Catch:{ all -> 0x07c7 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x07c7 }
            if (r5 == 0) goto L_0x0412
            com.google.android.gms.measurement.internal.ex r5 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r3.f47530a     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "_sno"
            com.google.android.gms.measurement.internal.el r5 = r5.mo44103c(r6, r7)     // Catch:{ all -> 0x07c7 }
            if (r5 == 0) goto L_0x0412
            java.lang.Object r6 = r5.f47319e     // Catch:{ all -> 0x07c7 }
            boolean r6 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x07c7 }
            if (r6 == 0) goto L_0x0412
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r6 = r6.mo43662f()     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "_sno"
            java.lang.Object r5 = r5.f47319e     // Catch:{ all -> 0x07c7 }
            r6.mo43902a(r4, r7, r5)     // Catch:{ all -> 0x07c7 }
        L_0x0412:
            com.google.android.gms.measurement.internal.ex r5 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            long r5 = r5.mo44102c(r15)     // Catch:{ all -> 0x07c7 }
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x0433
            com.google.android.gms.measurement.internal.ay r7 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r7 = r7.mo43585q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r7 = r7.f47490d     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C16953r.m56340a(r15)     // Catch:{ all -> 0x07c7 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x07c7 }
            r7.mo44162a(r8, r9, r5)     // Catch:{ all -> 0x07c7 }
        L_0x0433:
            com.google.android.gms.measurement.internal.c r5 = new com.google.android.gms.measurement.internal.c     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r7 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = r2.f47520c     // Catch:{ all -> 0x07c7 }
            java.lang.String r10 = r2.f47518a     // Catch:{ all -> 0x07c7 }
            long r12 = r2.f47521d     // Catch:{ all -> 0x07c7 }
            r16 = 0
            r6 = r5
            r9 = r15
            r2 = 0
            r11 = r12
            r13 = r16
            r2 = r15
            r15 = r4
            r6.<init>(r7, r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r4 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r5.f47104b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.d r4 = r4.mo44083a(r2, r6)     // Catch:{ all -> 0x07c7 }
            if (r4 != 0) goto L_0x04ba
            com.google.android.gms.measurement.internal.ex r4 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            long r6 = r4.mo44109f(r2)     // Catch:{ all -> 0x07c7 }
            r8 = 500(0x1f4, double:2.47E-321)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x04a0
            if (r0 == 0) goto L_0x04a0
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ all -> 0x07c7 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C16953r.m56340a(r2)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.p r6 = r6.mo43663g()     // Catch:{ all -> 0x07c7 }
            java.lang.String r5 = r5.f47104b     // Catch:{ all -> 0x07c7 }
            java.lang.String r5 = r6.mo44153a(r5)     // Catch:{ all -> 0x07c7 }
            r6 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x07c7 }
            r0.mo44163a(r3, r4, r5, r6)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r6 = r0.mo43662f()     // Catch:{ all -> 0x07c7 }
            r8 = 8
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r2
            r6.mo43903a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()
            r0.mo44114v()
            return
        L_0x04a0:
            com.google.android.gms.measurement.internal.d r0 = new com.google.android.gms.measurement.internal.d     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = r5.f47104b     // Catch:{ all -> 0x07c7 }
            r9 = 0
            r11 = 0
            long r13 = r5.f47105c     // Catch:{ all -> 0x07c7 }
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r6 = r0
            r7 = r2
            r6.<init>(r7, r8, r9, r11, r13, r15, r17, r18, r19, r20)     // Catch:{ all -> 0x07c7 }
            goto L_0x04c8
        L_0x04ba:
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            long r6 = r4.f47194e     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.c r5 = r5.mo43721a(r0, r6)     // Catch:{ all -> 0x07c7 }
            long r6 = r5.f47105c     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.d r0 = r4.mo43791a(r6)     // Catch:{ all -> 0x07c7 }
        L_0x04c8:
            com.google.android.gms.measurement.internal.ex r2 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            r2.mo44090a(r0)     // Catch:{ all -> 0x07c7 }
            r25.m55870u()     // Catch:{ all -> 0x07c7 }
            r25.mo43871j()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.common.internal.C15267r.m44384a(r5)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.common.internal.C15267r.m44384a(r27)     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r5.f47103a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.common.internal.C15267r.m44386a(r0)     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r5.f47103a     // Catch:{ all -> 0x07c7 }
            java.lang.String r2 = r3.f47530a     // Catch:{ all -> 0x07c7 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.common.internal.C15267r.m44394b(r0)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.internal.measurement.ej r2 = new com.google.android.gms.internal.measurement.ej     // Catch:{ all -> 0x07c7 }
            r2.<init>()     // Catch:{ all -> 0x07c7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x07c7 }
            r2.f46210a = r0     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = "android"
            r2.f46218i = r0     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r3.f47530a     // Catch:{ all -> 0x07c7 }
            r2.f46224o = r0     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r3.f47533d     // Catch:{ all -> 0x07c7 }
            r2.f46223n = r0     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r3.f47532c     // Catch:{ all -> 0x07c7 }
            r2.f46225p = r0     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f47539j     // Catch:{ all -> 0x07c7 }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            r0 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0512
            r4 = r0
            goto L_0x0519
        L_0x0512:
            long r6 = r3.f47539j     // Catch:{ all -> 0x07c7 }
            int r4 = (int) r6     // Catch:{ all -> 0x07c7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x07c7 }
        L_0x0519:
            r2.f46197C = r4     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f47534e     // Catch:{ all -> 0x07c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07c7 }
            r2.f46226q = r4     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f47531b     // Catch:{ all -> 0x07c7 }
            r2.f46234y = r4     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f47547r     // Catch:{ all -> 0x07c7 }
            r2.f46203I = r4     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f47535f     // Catch:{ all -> 0x07c7 }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0535
            r4 = r0
            goto L_0x053b
        L_0x0535:
            long r6 = r3.f47535f     // Catch:{ all -> 0x07c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07c7 }
        L_0x053b:
            r2.f46231v = r4     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.eu r4 = r4.f47009e     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r3.f47530a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C16942h.f47426as     // Catch:{ all -> 0x07c7 }
            boolean r4 = r4.mo44054d(r6, r7)     // Catch:{ all -> 0x07c7 }
            if (r4 == 0) goto L_0x0555
            com.google.android.gms.measurement.internal.ej r4 = r25.mo43868g()     // Catch:{ all -> 0x07c7 }
            int[] r4 = r4.mo43891e()     // Catch:{ all -> 0x07c7 }
            r2.f46205K = r4     // Catch:{ all -> 0x07c7 }
        L_0x0555:
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.af r4 = r4.mo43658b()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r3.f47530a     // Catch:{ all -> 0x07c7 }
            android.util.Pair r4 = r4.mo43594a(r6)     // Catch:{ all -> 0x07c7 }
            java.lang.Object r6 = r4.first     // Catch:{ all -> 0x07c7 }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x07c7 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x07c7 }
            if (r6 != 0) goto L_0x057c
            boolean r6 = r3.f47544o     // Catch:{ all -> 0x07c7 }
            if (r6 == 0) goto L_0x05d5
            java.lang.Object r6 = r4.first     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x07c7 }
            r2.f46228s = r6     // Catch:{ all -> 0x07c7 }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x07c7 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x07c7 }
            r2.f46229t = r4     // Catch:{ all -> 0x07c7 }
            goto L_0x05d5
        L_0x057c:
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo43668n()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            android.content.Context r6 = r6.mo43581m()     // Catch:{ all -> 0x07c7 }
            boolean r4 = r4.mo43679a(r6)     // Catch:{ all -> 0x07c7 }
            if (r4 != 0) goto L_0x05d5
            boolean r4 = r3.f47545p     // Catch:{ all -> 0x07c7 }
            if (r4 == 0) goto L_0x05d5
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            android.content.Context r4 = r4.mo43581m()     // Catch:{ all -> 0x07c7 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "android_id"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r6)     // Catch:{ all -> 0x07c7 }
            if (r4 != 0) goto L_0x05ba
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo43585q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47490d     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "null secure ID. appId"
            java.lang.String r7 = r2.f46224o     // Catch:{ all -> 0x07c7 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C16953r.m56340a(r7)     // Catch:{ all -> 0x07c7 }
            r4.mo44161a(r6, r7)     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = "null"
            goto L_0x05d3
        L_0x05ba:
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x07c7 }
            if (r6 == 0) goto L_0x05d3
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r6 = r6.mo43585q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r6 = r6.f47490d     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "empty secure ID. appId"
            java.lang.String r10 = r2.f46224o     // Catch:{ all -> 0x07c7 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C16953r.m56340a(r10)     // Catch:{ all -> 0x07c7 }
            r6.mo44161a(r7, r10)     // Catch:{ all -> 0x07c7 }
        L_0x05d3:
            r2.f46198D = r4     // Catch:{ all -> 0x07c7 }
        L_0x05d5:
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo43668n()     // Catch:{ all -> 0x07c7 }
            r4.mo43718x()     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x07c7 }
            r2.f46220k = r4     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo43668n()     // Catch:{ all -> 0x07c7 }
            r4.mo43718x()     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x07c7 }
            r2.f46219j = r4     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo43668n()     // Catch:{ all -> 0x07c7 }
            long r6 = r4.mo43678O_()     // Catch:{ all -> 0x07c7 }
            int r4 = (int) r6     // Catch:{ all -> 0x07c7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x07c7 }
            r2.f46222m = r4     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo43668n()     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r4.mo43680f()     // Catch:{ all -> 0x07c7 }
            r2.f46221l = r4     // Catch:{ all -> 0x07c7 }
            r2.f46227r = r0     // Catch:{ all -> 0x07c7 }
            r2.f46213d = r0     // Catch:{ all -> 0x07c7 }
            r2.f46214e = r0     // Catch:{ all -> 0x07c7 }
            r2.f46215f = r0     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f47541l     // Catch:{ all -> 0x07c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07c7 }
            r2.f46200F = r4     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            boolean r4 = r4.mo43672t()     // Catch:{ all -> 0x07c7 }
            if (r4 == 0) goto L_0x062c
            boolean r4 = com.google.android.gms.measurement.internal.C16930eu.m56090t()     // Catch:{ all -> 0x07c7 }
            if (r4 == 0) goto L_0x062c
            r2.f46201G = r0     // Catch:{ all -> 0x07c7 }
        L_0x062c:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f47530a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.eo r0 = r0.mo44099b(r4)     // Catch:{ all -> 0x07c7 }
            if (r0 != 0) goto L_0x069a
            com.google.android.gms.measurement.internal.eo r0 = new com.google.android.gms.measurement.internal.eo     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r3.f47530a     // Catch:{ all -> 0x07c7 }
            r0.<init>(r4, r6)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r4 = r4.mo43662f()     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r4.mo43916j()     // Catch:{ all -> 0x07c7 }
            r0.mo43931a(r4)     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f47540k     // Catch:{ all -> 0x07c7 }
            r0.mo43946e(r4)     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f47531b     // Catch:{ all -> 0x07c7 }
            r0.mo43935b(r4)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.af r4 = r4.mo43658b()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r3.f47530a     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r4.mo43597b(r6)     // Catch:{ all -> 0x07c7 }
            r0.mo43943d(r4)     // Catch:{ all -> 0x07c7 }
            r0.mo43948f(r8)     // Catch:{ all -> 0x07c7 }
            r0.mo43930a(r8)     // Catch:{ all -> 0x07c7 }
            r0.mo43934b(r8)     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f47532c     // Catch:{ all -> 0x07c7 }
            r0.mo43949f(r4)     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f47539j     // Catch:{ all -> 0x07c7 }
            r0.mo43938c(r6)     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f47533d     // Catch:{ all -> 0x07c7 }
            r0.mo43952g(r4)     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f47534e     // Catch:{ all -> 0x07c7 }
            r0.mo43942d(r6)     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f47535f     // Catch:{ all -> 0x07c7 }
            r0.mo43945e(r6)     // Catch:{ all -> 0x07c7 }
            boolean r4 = r3.f47537h     // Catch:{ all -> 0x07c7 }
            r0.mo43932a(r4)     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f47541l     // Catch:{ all -> 0x07c7 }
            r0.mo43968o(r6)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r4 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            r4.mo44091a(r0)     // Catch:{ all -> 0x07c7 }
        L_0x069a:
            java.lang.String r4 = r0.mo43937c()     // Catch:{ all -> 0x07c7 }
            r2.f46230u = r4     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r0.mo43950g()     // Catch:{ all -> 0x07c7 }
            r2.f46196B = r0     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            java.lang.String r3 = r3.f47530a     // Catch:{ all -> 0x07c7 }
            java.util.List r0 = r0.mo44086a(r3)     // Catch:{ all -> 0x07c7 }
            int r3 = r0.size()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.internal.measurement.em[] r3 = new com.google.android.gms.internal.measurement.C16504em[r3]     // Catch:{ all -> 0x07c7 }
            r2.f46212c = r3     // Catch:{ all -> 0x07c7 }
            r3 = 0
        L_0x06b9:
            int r4 = r0.size()     // Catch:{ all -> 0x07c7 }
            if (r3 >= r4) goto L_0x06f2
            com.google.android.gms.internal.measurement.em r4 = new com.google.android.gms.internal.measurement.em     // Catch:{ all -> 0x07c7 }
            r4.<init>()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.internal.measurement.em[] r6 = r2.f46212c     // Catch:{ all -> 0x07c7 }
            r6[r3] = r4     // Catch:{ all -> 0x07c7 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.el r6 = (com.google.android.gms.measurement.internal.C16921el) r6     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r6.f47317c     // Catch:{ all -> 0x07c7 }
            r4.f46245b = r6     // Catch:{ all -> 0x07c7 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.el r6 = (com.google.android.gms.measurement.internal.C16921el) r6     // Catch:{ all -> 0x07c7 }
            long r6 = r6.f47318d     // Catch:{ all -> 0x07c7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07c7 }
            r4.f46244a = r6     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ej r6 = r25.mo43868g()     // Catch:{ all -> 0x07c7 }
            java.lang.Object r7 = r0.get(r3)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.el r7 = (com.google.android.gms.measurement.internal.C16921el) r7     // Catch:{ all -> 0x07c7 }
            java.lang.Object r7 = r7.f47319e     // Catch:{ all -> 0x07c7 }
            r6.mo43884a(r4, r7)     // Catch:{ all -> 0x07c7 }
            int r3 = r3 + 1
            goto L_0x06b9
        L_0x06f2:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()     // Catch:{ IOException -> 0x075e }
            long r3 = r0.mo44081a(r2)     // Catch:{ IOException -> 0x075e }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.zzad r2 = r5.f47107e     // Catch:{ all -> 0x07c7 }
            if (r2 == 0) goto L_0x0754
            com.google.android.gms.measurement.internal.zzad r2 = r5.f47107e     // Catch:{ all -> 0x07c7 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x07c7 }
        L_0x0708:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x07c7 }
            if (r6 == 0) goto L_0x071e
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "_r"
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x07c7 }
            if (r6 == 0) goto L_0x0708
        L_0x071c:
            r2 = 1
            goto L_0x0755
        L_0x071e:
            com.google.android.gms.measurement.internal.as r2 = r25.m55867r()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r5.f47103a     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = r5.f47104b     // Catch:{ all -> 0x07c7 }
            boolean r2 = r2.mo43634c(r6, r7)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r10 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            long r11 = r25.m55871v()     // Catch:{ all -> 0x07c7 }
            java.lang.String r13 = r5.f47103a     // Catch:{ all -> 0x07c7 }
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.google.android.gms.measurement.internal.ey r6 = r10.mo44084a(r11, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x07c7 }
            if (r2 == 0) goto L_0x0754
            long r6 = r6.f47372e     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r2 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.eu r2 = r2.f47009e     // Catch:{ all -> 0x07c7 }
            java.lang.String r10 = r5.f47103a     // Catch:{ all -> 0x07c7 }
            int r2 = r2.mo44046a(r10)     // Catch:{ all -> 0x07c7 }
            long r10 = (long) r2     // Catch:{ all -> 0x07c7 }
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0754
            goto L_0x071c
        L_0x0754:
            r2 = 0
        L_0x0755:
            boolean r0 = r0.mo44095a(r5, r3, r2)     // Catch:{ all -> 0x07c7 }
            if (r0 == 0) goto L_0x0772
            r1.f47290n = r8     // Catch:{ all -> 0x07c7 }
            goto L_0x0772
        L_0x075e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ay r3 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo43585q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r3 = r3.f47487a     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.f46224o     // Catch:{ all -> 0x07c7 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C16953r.m56340a(r2)     // Catch:{ all -> 0x07c7 }
            r3.mo44162a(r4, r2, r0)     // Catch:{ all -> 0x07c7 }
        L_0x0772:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()     // Catch:{ all -> 0x07c7 }
            r0.mo44113u()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x07c7 }
            r2 = 2
            boolean r0 = r0.mo44158a(r2)     // Catch:{ all -> 0x07c7 }
            if (r0 == 0) goto L_0x079d
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47495i     // Catch:{ all -> 0x07c7 }
            java.lang.String r2 = "Event recorded"
            com.google.android.gms.measurement.internal.ay r3 = r1.f47278a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.p r3 = r3.mo43663g()     // Catch:{ all -> 0x07c7 }
            java.lang.String r3 = r3.mo44151a(r5)     // Catch:{ all -> 0x07c7 }
            r0.mo44161a(r2, r3)     // Catch:{ all -> 0x07c7 }
        L_0x079d:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo43864d()
            r0.mo44114v()
            r25.m55873x()
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47495i
            java.lang.String r2 = "Background event processing time, ms"
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r22
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.mo44161a(r2, r3)
            return
        L_0x07c7:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ex r2 = r25.mo43864d()
            r2.mo44114v()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16912ed.m55865b(com.google.android.gms.measurement.internal.zzag, com.google.android.gms.measurement.internal.zzk):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:88|89) */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r1.f47278a.mo43585q().f47487a.mo44162a("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C16953r.m56340a(r5), r6);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x0276 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43872k() {
        /*
            r17 = this;
            r1 = r17
            r17.m55870u()
            r17.mo43871j()
            r0 = 1
            r1.f47296t = r0
            r2 = 0
            com.google.android.gms.measurement.internal.ay r3 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.cu r3 = r3.mo43667k()     // Catch:{ all -> 0x02b1 }
            java.lang.Boolean r3 = r3.f47174a     // Catch:{ all -> 0x02b1 }
            if (r3 != 0) goto L_0x0029
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47490d     // Catch:{ all -> 0x02b1 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            r0.mo44160a(r3)     // Catch:{ all -> 0x02b1 }
            r1.f47296t = r2
            r17.m55874y()
            return
        L_0x0029:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x02b1 }
            if (r3 == 0) goto L_0x0042
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ all -> 0x02b1 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            r0.mo44160a(r3)     // Catch:{ all -> 0x02b1 }
            r1.f47296t = r2
            r17.m55874y()
            return
        L_0x0042:
            long r3 = r1.f47290n     // Catch:{ all -> 0x02b1 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0053
            r17.m55873x()     // Catch:{ all -> 0x02b1 }
            r1.f47296t = r2
            r17.m55874y()
            return
        L_0x0053:
            r17.m55870u()     // Catch:{ all -> 0x02b1 }
            java.util.List<java.lang.Long> r3 = r1.f47299w     // Catch:{ all -> 0x02b1 }
            if (r3 == 0) goto L_0x005c
            r3 = 1
            goto L_0x005d
        L_0x005c:
            r3 = 0
        L_0x005d:
            if (r3 == 0) goto L_0x0072
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47495i     // Catch:{ all -> 0x02b1 }
            java.lang.String r3 = "Uploading requested multiple times"
            r0.mo44160a(r3)     // Catch:{ all -> 0x02b1 }
            r1.f47296t = r2
            r17.m55874y()
            return
        L_0x0072:
            com.google.android.gms.measurement.internal.v r3 = r17.mo43862c()     // Catch:{ all -> 0x02b1 }
            boolean r3 = r3.mo44165e()     // Catch:{ all -> 0x02b1 }
            if (r3 != 0) goto L_0x0092
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47495i     // Catch:{ all -> 0x02b1 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.mo44160a(r3)     // Catch:{ all -> 0x02b1 }
            r17.m55873x()     // Catch:{ all -> 0x02b1 }
            r1.f47296t = r2
            r17.m55874y()
            return
        L_0x0092:
            com.google.android.gms.measurement.internal.ay r3 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.common.util.e r3 = r3.mo43580l()     // Catch:{ all -> 0x02b1 }
            long r3 = r3.mo38684a()     // Catch:{ all -> 0x02b1 }
            long r7 = com.google.android.gms.measurement.internal.C16930eu.m56089i()     // Catch:{ all -> 0x02b1 }
            r9 = 0
            long r7 = r3 - r7
            r9 = 0
            r1.m55859a(r9, r7)     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.ay r7 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.af r7 = r7.mo43658b()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.ai r7 = r7.f46917c     // Catch:{ all -> 0x02b1 }
            long r7 = r7.mo43614a()     // Catch:{ all -> 0x02b1 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00cf
            com.google.android.gms.measurement.internal.ay r5 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo43585q()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.t r5 = r5.f47494h     // Catch:{ all -> 0x02b1 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            r10 = 0
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x02b1 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x02b1 }
            r5.mo44161a(r6, r7)     // Catch:{ all -> 0x02b1 }
        L_0x00cf:
            com.google.android.gms.measurement.internal.ex r5 = r17.mo43864d()     // Catch:{ all -> 0x02b1 }
            java.lang.String r5 = r5.mo44116x()     // Catch:{ all -> 0x02b1 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x02b1 }
            r7 = -1
            if (r6 != 0) goto L_0x0288
            long r10 = r1.f47301y     // Catch:{ all -> 0x02b1 }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.ex r6 = r17.mo43864d()     // Catch:{ all -> 0x02b1 }
            long r6 = r6.mo44080E()     // Catch:{ all -> 0x02b1 }
            r1.f47301y = r6     // Catch:{ all -> 0x02b1 }
        L_0x00ef:
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.eu r6 = r6.f47009e     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C16942h.f47447o     // Catch:{ all -> 0x02b1 }
            int r6 = r6.mo44049b(r5, r7)     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.ay r7 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.eu r7 = r7.f47009e     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C16942h.f47448p     // Catch:{ all -> 0x02b1 }
            int r7 = r7.mo44049b(r5, r8)     // Catch:{ all -> 0x02b1 }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.ex r8 = r17.mo43864d()     // Catch:{ all -> 0x02b1 }
            java.util.List r6 = r8.mo44087a(r5, r6, r7)     // Catch:{ all -> 0x02b1 }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x02b1 }
            if (r7 != 0) goto L_0x02ab
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x02b1 }
        L_0x0119:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x02b1 }
            if (r8 == 0) goto L_0x0134
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x02b1 }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x02b1 }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ej r8 = (com.google.android.gms.internal.measurement.C16501ej) r8     // Catch:{ all -> 0x02b1 }
            java.lang.String r10 = r8.f46228s     // Catch:{ all -> 0x02b1 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x02b1 }
            if (r10 != 0) goto L_0x0119
            java.lang.String r7 = r8.f46228s     // Catch:{ all -> 0x02b1 }
            goto L_0x0135
        L_0x0134:
            r7 = r9
        L_0x0135:
            if (r7 == 0) goto L_0x0160
            r8 = 0
        L_0x0138:
            int r10 = r6.size()     // Catch:{ all -> 0x02b1 }
            if (r8 >= r10) goto L_0x0160
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x02b1 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x02b1 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ej r10 = (com.google.android.gms.internal.measurement.C16501ej) r10     // Catch:{ all -> 0x02b1 }
            java.lang.String r11 = r10.f46228s     // Catch:{ all -> 0x02b1 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x02b1 }
            if (r11 != 0) goto L_0x015d
            java.lang.String r10 = r10.f46228s     // Catch:{ all -> 0x02b1 }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x02b1 }
            if (r10 != 0) goto L_0x015d
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x02b1 }
            goto L_0x0160
        L_0x015d:
            int r8 = r8 + 1
            goto L_0x0138
        L_0x0160:
            com.google.android.gms.internal.measurement.ei r7 = new com.google.android.gms.internal.measurement.ei     // Catch:{ all -> 0x02b1 }
            r7.<init>()     // Catch:{ all -> 0x02b1 }
            int r8 = r6.size()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ej[] r8 = new com.google.android.gms.internal.measurement.C16501ej[r8]     // Catch:{ all -> 0x02b1 }
            r7.f46193a = r8     // Catch:{ all -> 0x02b1 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x02b1 }
            int r10 = r6.size()     // Catch:{ all -> 0x02b1 }
            r8.<init>(r10)     // Catch:{ all -> 0x02b1 }
            boolean r10 = com.google.android.gms.measurement.internal.C16930eu.m56090t()     // Catch:{ all -> 0x02b1 }
            if (r10 == 0) goto L_0x0188
            com.google.android.gms.measurement.internal.ay r10 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.eu r10 = r10.f47009e     // Catch:{ all -> 0x02b1 }
            boolean r10 = r10.mo44051c(r5)     // Catch:{ all -> 0x02b1 }
            if (r10 == 0) goto L_0x0188
            r10 = 1
            goto L_0x0189
        L_0x0188:
            r10 = 0
        L_0x0189:
            r11 = 0
        L_0x018a:
            com.google.android.gms.internal.measurement.ej[] r12 = r7.f46193a     // Catch:{ all -> 0x02b1 }
            int r12 = r12.length     // Catch:{ all -> 0x02b1 }
            if (r11 >= r12) goto L_0x01d5
            com.google.android.gms.internal.measurement.ej[] r12 = r7.f46193a     // Catch:{ all -> 0x02b1 }
            java.lang.Object r13 = r6.get(r11)     // Catch:{ all -> 0x02b1 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x02b1 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ej r13 = (com.google.android.gms.internal.measurement.C16501ej) r13     // Catch:{ all -> 0x02b1 }
            r12[r11] = r13     // Catch:{ all -> 0x02b1 }
            java.lang.Object r12 = r6.get(r11)     // Catch:{ all -> 0x02b1 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x02b1 }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x02b1 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x02b1 }
            r8.add(r12)     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ej[] r12 = r7.f46193a     // Catch:{ all -> 0x02b1 }
            r12 = r12[r11]     // Catch:{ all -> 0x02b1 }
            r13 = 14710(0x3976, double:7.2677E-320)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x02b1 }
            r12.f46227r = r13     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ej[] r12 = r7.f46193a     // Catch:{ all -> 0x02b1 }
            r12 = r12[r11]     // Catch:{ all -> 0x02b1 }
            java.lang.Long r13 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x02b1 }
            r12.f46213d = r13     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ej[] r12 = r7.f46193a     // Catch:{ all -> 0x02b1 }
            r12 = r12[r11]     // Catch:{ all -> 0x02b1 }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x02b1 }
            r12.f46235z = r13     // Catch:{ all -> 0x02b1 }
            if (r10 != 0) goto L_0x01d2
            com.google.android.gms.internal.measurement.ej[] r12 = r7.f46193a     // Catch:{ all -> 0x02b1 }
            r12 = r12[r11]     // Catch:{ all -> 0x02b1 }
            r12.f46201G = r9     // Catch:{ all -> 0x02b1 }
        L_0x01d2:
            int r11 = r11 + 1
            goto L_0x018a
        L_0x01d5:
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r6 = r6.mo43585q()     // Catch:{ all -> 0x02b1 }
            r10 = 2
            boolean r6 = r6.mo44158a(r10)     // Catch:{ all -> 0x02b1 }
            if (r6 == 0) goto L_0x01ea
            com.google.android.gms.measurement.internal.ej r6 = r17.mo43868g()     // Catch:{ all -> 0x02b1 }
            java.lang.String r9 = r6.mo43889b(r7)     // Catch:{ all -> 0x02b1 }
        L_0x01ea:
            com.google.android.gms.measurement.internal.ej r6 = r17.mo43868g()     // Catch:{ all -> 0x02b1 }
            byte[] r14 = r6.mo43887a(r7)     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.h$a<java.lang.String> r6 = com.google.android.gms.measurement.internal.C16942h.f47457y     // Catch:{ all -> 0x02b1 }
            java.lang.Object r6 = r6.mo44132a()     // Catch:{ all -> 0x02b1 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x02b1 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0276 }
            r13.<init>(r6)     // Catch:{ MalformedURLException -> 0x0276 }
            boolean r10 = r8.isEmpty()     // Catch:{ MalformedURLException -> 0x0276 }
            r10 = r10 ^ r0
            com.google.android.gms.common.internal.C15267r.m44394b(r10)     // Catch:{ MalformedURLException -> 0x0276 }
            java.util.List<java.lang.Long> r10 = r1.f47299w     // Catch:{ MalformedURLException -> 0x0276 }
            if (r10 == 0) goto L_0x0219
            com.google.android.gms.measurement.internal.ay r8 = r1.f47278a     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo43585q()     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.t r8 = r8.f47487a     // Catch:{ MalformedURLException -> 0x0276 }
            java.lang.String r10 = "Set uploading progress before finishing the previous upload"
            r8.mo44160a(r10)     // Catch:{ MalformedURLException -> 0x0276 }
            goto L_0x0220
        L_0x0219:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0276 }
            r10.<init>(r8)     // Catch:{ MalformedURLException -> 0x0276 }
            r1.f47299w = r10     // Catch:{ MalformedURLException -> 0x0276 }
        L_0x0220:
            com.google.android.gms.measurement.internal.ay r8 = r1.f47278a     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.af r8 = r8.mo43658b()     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.ai r8 = r8.f46918d     // Catch:{ MalformedURLException -> 0x0276 }
            r8.mo43615a(r3)     // Catch:{ MalformedURLException -> 0x0276 }
            java.lang.String r3 = "?"
            com.google.android.gms.internal.measurement.ej[] r4 = r7.f46193a     // Catch:{ MalformedURLException -> 0x0276 }
            int r4 = r4.length     // Catch:{ MalformedURLException -> 0x0276 }
            if (r4 <= 0) goto L_0x0238
            com.google.android.gms.internal.measurement.ej[] r3 = r7.f46193a     // Catch:{ MalformedURLException -> 0x0276 }
            r3 = r3[r2]     // Catch:{ MalformedURLException -> 0x0276 }
            java.lang.String r3 = r3.f46224o     // Catch:{ MalformedURLException -> 0x0276 }
        L_0x0238:
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo43585q()     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47495i     // Catch:{ MalformedURLException -> 0x0276 }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x0276 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x0276 }
            r4.mo44163a(r7, r3, r8, r9)     // Catch:{ MalformedURLException -> 0x0276 }
            r1.f47295s = r0     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.v r11 = r17.mo43862c()     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.ef r0 = new com.google.android.gms.measurement.internal.ef     // Catch:{ MalformedURLException -> 0x0276 }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x0276 }
            r11.mo43571c()     // Catch:{ MalformedURLException -> 0x0276 }
            r11.mo43843j()     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.common.internal.C15267r.m44384a(r13)     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.common.internal.C15267r.m44384a(r14)     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.common.internal.C15267r.m44384a(r0)     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.at r3 = r11.mo43584p()     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.ab r4 = new com.google.android.gms.measurement.internal.ab     // Catch:{ MalformedURLException -> 0x0276 }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x0276 }
            r3.mo43647b(r4)     // Catch:{ MalformedURLException -> 0x0276 }
            goto L_0x02ab
        L_0x0276:
            com.google.android.gms.measurement.internal.ay r0 = r1.f47278a     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo43585q()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ all -> 0x02b1 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C16953r.m56340a(r5)     // Catch:{ all -> 0x02b1 }
            r0.mo44162a(r3, r4, r6)     // Catch:{ all -> 0x02b1 }
            goto L_0x02ab
        L_0x0288:
            r1.f47301y = r7     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.ex r0 = r17.mo43864d()     // Catch:{ all -> 0x02b1 }
            long r5 = com.google.android.gms.measurement.internal.C16930eu.m56089i()     // Catch:{ all -> 0x02b1 }
            r7 = 0
            long r3 = r3 - r5
            java.lang.String r0 = r0.mo44085a(r3)     // Catch:{ all -> 0x02b1 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02b1 }
            if (r3 != 0) goto L_0x02ab
            com.google.android.gms.measurement.internal.ex r3 = r17.mo43864d()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.eo r0 = r3.mo44099b(r0)     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x02ab
            r1.m55856a(r0)     // Catch:{ all -> 0x02b1 }
        L_0x02ab:
            r1.f47296t = r2
            r17.m55874y()
            return
        L_0x02b1:
            r0 = move-exception
            r1.f47296t = r2
            r17.m55874y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16912ed.mo43872k():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r5 = r1;
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r7 = null;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0ace, code lost:
        if (r18 != r14) goto L_0x0ad0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v68 android.database.Cursor) = (r3v63 android.database.Cursor), (r3v63 android.database.Cursor), (r3v63 android.database.Cursor), (r3v71 android.database.Cursor), (r3v71 android.database.Cursor), (r3v71 android.database.Cursor), (r3v71 android.database.Cursor), (r3v0 android.database.Cursor), (r3v0 android.database.Cursor) binds: [B:47:0x00e2, B:53:0x00ef, B:54:?, B:24:0x0080, B:30:0x008d, B:32:0x0091, B:33:?, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x026a A[SYNTHETIC, Splitter:B:132:0x026a] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0271 A[Catch:{ IOException -> 0x0224, all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x027f A[Catch:{ IOException -> 0x0224, all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x038f A[Catch:{ IOException -> 0x0224, all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0391 A[Catch:{ IOException -> 0x0224, all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0394 A[Catch:{ IOException -> 0x0224, all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0395 A[Catch:{ IOException -> 0x0224, all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0592 A[ADDED_TO_REGION, Catch:{ IOException -> 0x0224, all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x064f A[Catch:{ IOException -> 0x0224, all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x06d0 A[Catch:{ IOException -> 0x0224, all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x081f A[Catch:{ IOException -> 0x0224, all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0839 A[Catch:{ IOException -> 0x0224, all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0859 A[Catch:{ IOException -> 0x0224, all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0af0 A[Catch:{ all -> 0x0b90 }] */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0b3c A[Catch:{ all -> 0x0b90 }] */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x0d56  */
    /* JADX WARNING: Removed duplicated region for block: B:567:0x0d6d A[SYNTHETIC, Splitter:B:567:0x0d6d] */
    /* JADX WARNING: Removed duplicated region for block: B:606:0x0836 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m55859a(java.lang.String r53, long r54) {
        /*
            r52 = this;
            r1 = r52
            com.google.android.gms.measurement.internal.ex r2 = r52.mo43864d()
            r2.mo44108e()
            com.google.android.gms.measurement.internal.ed$a r2 = new com.google.android.gms.measurement.internal.ed$a     // Catch:{ all -> 0x0d74 }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.ex r4 = r52.mo43864d()     // Catch:{ all -> 0x0d74 }
            long r5 = r1.f47301y     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.common.internal.C15267r.m44384a(r2)     // Catch:{ all -> 0x0d74 }
            r4.mo43571c()     // Catch:{ all -> 0x0d74 }
            r4.mo43843j()     // Catch:{ all -> 0x0d74 }
            r8 = -1
            r10 = 2
            r11 = 0
            r12 = 1
            android.database.sqlite.SQLiteDatabase r15 = r4.mo44115w()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            boolean r13 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            if (r13 == 0) goto L_0x00a0
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x004b
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r54)     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            r13[r12] = r14     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            goto L_0x0053
        L_0x0040:
            r0 = move-exception
            r5 = r1
            r8 = r3
            goto L_0x0252
        L_0x0045:
            r0 = move-exception
            r7 = r3
            r8 = r7
        L_0x0048:
            r3 = r0
            goto L_0x0259
        L_0x004b:
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r14 = java.lang.String.valueOf(r54)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
        L_0x0053:
            int r14 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x005a
            java.lang.String r14 = "rowid <= ? and "
            goto L_0x005c
        L_0x005a:
            java.lang.String r14 = ""
        L_0x005c:
            java.lang.String r16 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            int r7 = r16.length()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            int r7 = r7 + 148
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r3.<init>(r7)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r3.append(r14)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r7 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            android.database.Cursor r3 = r15.rawQuery(r3, r13)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x024a, all -> 0x0040 }
            if (r7 != 0) goto L_0x008d
            if (r3 == 0) goto L_0x026d
            r3.close()     // Catch:{ all -> 0x0d74 }
            goto L_0x026d
        L_0x008d:
            java.lang.String r7 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x024a, all -> 0x0040 }
            java.lang.String r13 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x009d, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x009d, all -> 0x0040 }
            r22 = r3
            r3 = r7
            r7 = r13
            goto L_0x00fa
        L_0x009d:
            r0 = move-exception
            r8 = r3
            goto L_0x0048
        L_0x00a0:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00b0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r3[r12] = r7     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            goto L_0x00b5
        L_0x00b0:
            java.lang.String[] r3 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
        L_0x00b5:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x00bc
            java.lang.String r7 = " and rowid <= ?"
            goto L_0x00be
        L_0x00bc:
            java.lang.String r7 = ""
        L_0x00be:
            java.lang.String r13 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            int r13 = r13.length()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            int r13 = r13 + 84
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r14.<init>(r13)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r13 = "select metadata_fingerprint from raw_events where app_id = ?"
            r14.append(r13)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r14.append(r7)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r7 = " order by rowid limit 1;"
            r14.append(r7)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r7 = r14.toString()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            android.database.Cursor r3 = r15.rawQuery(r7, r3)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x024a, all -> 0x0040 }
            if (r7 != 0) goto L_0x00ef
            if (r3 == 0) goto L_0x026d
            r3.close()     // Catch:{ all -> 0x0d74 }
            goto L_0x026d
        L_0x00ef:
            java.lang.String r13 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x024a, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x024a, all -> 0x0040 }
            r22 = r3
            r7 = r13
            r3 = 0
        L_0x00fa:
            java.lang.String r14 = "raw_events_metadata"
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0244, all -> 0x023f }
            java.lang.String r16 = "metadata"
            r13[r11] = r16     // Catch:{ SQLiteException -> 0x0244, all -> 0x023f }
            java.lang.String r16 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0244, all -> 0x023f }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0244, all -> 0x023f }
            r8[r12] = r7     // Catch:{ SQLiteException -> 0x0244, all -> 0x023f }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "2"
            r9 = r13
            r13 = r15
            r23 = r15
            r15 = r9
            r17 = r8
            android.database.Cursor r8 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0244, all -> 0x023f }
            boolean r9 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x023b }
            if (r9 != 0) goto L_0x0139
            com.google.android.gms.measurement.internal.r r5 = r4.mo43585q()     // Catch:{ SQLiteException -> 0x023b }
            com.google.android.gms.measurement.internal.t r5 = r5.f47487a     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r6 = "Raw event metadata record is missing. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C16953r.m56340a(r3)     // Catch:{ SQLiteException -> 0x023b }
            r5.mo44161a(r6, r7)     // Catch:{ SQLiteException -> 0x023b }
            if (r8 == 0) goto L_0x026d
            r8.close()     // Catch:{ all -> 0x0d74 }
            goto L_0x026d
        L_0x0139:
            byte[] r9 = r8.getBlob(r11)     // Catch:{ SQLiteException -> 0x023b }
            int r13 = r9.length     // Catch:{ SQLiteException -> 0x023b }
            com.google.android.gms.internal.measurement.km r9 = com.google.android.gms.internal.measurement.C16676km.m54726a(r9, r11, r13)     // Catch:{ SQLiteException -> 0x023b }
            com.google.android.gms.internal.measurement.ej r13 = new com.google.android.gms.internal.measurement.ej     // Catch:{ SQLiteException -> 0x023b }
            r13.<init>()     // Catch:{ SQLiteException -> 0x023b }
            r13.mo42654a(r9)     // Catch:{ IOException -> 0x0224 }
            boolean r9 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x023b }
            if (r9 == 0) goto L_0x015f
            com.google.android.gms.measurement.internal.r r9 = r4.mo43585q()     // Catch:{ SQLiteException -> 0x023b }
            com.google.android.gms.measurement.internal.t r9 = r9.f47490d     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C16953r.m56340a(r3)     // Catch:{ SQLiteException -> 0x023b }
            r9.mo44161a(r14, r15)     // Catch:{ SQLiteException -> 0x023b }
        L_0x015f:
            r8.close()     // Catch:{ SQLiteException -> 0x023b }
            r2.mo43875a(r13)     // Catch:{ SQLiteException -> 0x023b }
            r13 = -1
            int r9 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x017f
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x023b }
            r14[r11] = r3     // Catch:{ SQLiteException -> 0x023b }
            r14[r12] = r7     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x023b }
            r14[r10] = r5     // Catch:{ SQLiteException -> 0x023b }
            r16 = r9
            r17 = r14
            goto L_0x018b
        L_0x017f:
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x023b }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x023b }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x023b }
            r16 = r5
            r17 = r6
        L_0x018b:
            java.lang.String r14 = "raw_events"
            r5 = 4
            java.lang.String[] r15 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r5 = "rowid"
            r15[r11] = r5     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r5 = "name"
            r15[r12] = r5     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r5 = "timestamp"
            r15[r10] = r5     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r5 = "data"
            r6 = 3
            r15[r6] = r5     // Catch:{ SQLiteException -> 0x023b }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            r21 = 0
            r13 = r23
            android.database.Cursor r5 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x023b }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            if (r6 != 0) goto L_0x01cb
            com.google.android.gms.measurement.internal.r r6 = r4.mo43585q()     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            com.google.android.gms.measurement.internal.t r6 = r6.f47490d     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C16953r.m56340a(r3)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r6.mo44161a(r7, r8)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            if (r5 == 0) goto L_0x026d
            r5.close()     // Catch:{ all -> 0x0d74 }
            goto L_0x026d
        L_0x01cb:
            long r6 = r5.getLong(r11)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r8 = 3
            byte[] r9 = r5.getBlob(r8)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            int r8 = r9.length     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            com.google.android.gms.internal.measurement.km r8 = com.google.android.gms.internal.measurement.C16676km.m54726a(r9, r11, r8)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            com.google.android.gms.internal.measurement.eg r9 = new com.google.android.gms.internal.measurement.eg     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r9.<init>()     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r9.mo42654a(r8)     // Catch:{ IOException -> 0x01fe }
            java.lang.String r8 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r9.f46183b = r8     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            long r13 = r5.getLong(r10)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            java.lang.Long r8 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r9.f46184c = r8     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            boolean r6 = r2.mo43876a(r6, r9)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            if (r6 != 0) goto L_0x020f
            if (r5 == 0) goto L_0x026d
            r5.close()     // Catch:{ all -> 0x0d74 }
            goto L_0x026d
        L_0x01fe:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.r r7 = r4.mo43585q()     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            com.google.android.gms.measurement.internal.t r7 = r7.f47487a     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            java.lang.String r8 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C16953r.m56340a(r3)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r7.mo44162a(r8, r9, r6)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
        L_0x020f:
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            if (r6 != 0) goto L_0x01cb
            if (r5 == 0) goto L_0x026d
            r5.close()     // Catch:{ all -> 0x0d74 }
            goto L_0x026d
        L_0x021b:
            r0 = move-exception
            r8 = r5
            goto L_0x0d68
        L_0x021f:
            r0 = move-exception
            r7 = r3
            r8 = r5
            goto L_0x0048
        L_0x0224:
            r0 = move-exception
            r5 = r0
            com.google.android.gms.measurement.internal.r r6 = r4.mo43585q()     // Catch:{ SQLiteException -> 0x023b }
            com.google.android.gms.measurement.internal.t r6 = r6.f47487a     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r7 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C16953r.m56340a(r3)     // Catch:{ SQLiteException -> 0x023b }
            r6.mo44162a(r7, r9, r5)     // Catch:{ SQLiteException -> 0x023b }
            if (r8 == 0) goto L_0x026d
            r8.close()     // Catch:{ all -> 0x0d74 }
            goto L_0x026d
        L_0x023b:
            r0 = move-exception
            r7 = r3
            goto L_0x0048
        L_0x023f:
            r0 = move-exception
            r5 = r1
            r8 = r22
            goto L_0x0252
        L_0x0244:
            r0 = move-exception
            r7 = r3
            r8 = r22
            goto L_0x0048
        L_0x024a:
            r0 = move-exception
            r8 = r3
            r7 = 0
            goto L_0x0048
        L_0x024f:
            r0 = move-exception
            r5 = r1
            r8 = 0
        L_0x0252:
            r1 = r0
            goto L_0x0d6b
        L_0x0255:
            r0 = move-exception
            r3 = r0
            r7 = 0
            r8 = 0
        L_0x0259:
            com.google.android.gms.measurement.internal.r r4 = r4.mo43585q()     // Catch:{ all -> 0x0d67 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a     // Catch:{ all -> 0x0d67 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C16953r.m56340a(r7)     // Catch:{ all -> 0x0d67 }
            r4.mo44162a(r5, r6, r3)     // Catch:{ all -> 0x0d67 }
            if (r8 == 0) goto L_0x026d
            r8.close()     // Catch:{ all -> 0x0d74 }
        L_0x026d:
            java.util.List<com.google.android.gms.internal.measurement.eg> r3 = r2.f47304c     // Catch:{ all -> 0x0d74 }
            if (r3 == 0) goto L_0x027c
            java.util.List<com.google.android.gms.internal.measurement.eg> r3 = r2.f47304c     // Catch:{ all -> 0x0d74 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0d74 }
            if (r3 == 0) goto L_0x027a
            goto L_0x027c
        L_0x027a:
            r3 = 0
            goto L_0x027d
        L_0x027c:
            r3 = 1
        L_0x027d:
            if (r3 != 0) goto L_0x0d56
            com.google.android.gms.internal.measurement.ej r3 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.util.List<com.google.android.gms.internal.measurement.eg> r4 = r2.f47304c     // Catch:{ all -> 0x0d74 }
            int r4 = r4.size()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eg[] r4 = new com.google.android.gms.internal.measurement.C16498eg[r4]     // Catch:{ all -> 0x0d74 }
            r3.f46211b = r4     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.eu r4 = r4.f47009e     // Catch:{ all -> 0x0d74 }
            java.lang.String r5 = r3.f46224o     // Catch:{ all -> 0x0d74 }
            boolean r4 = r4.mo44056e(r5)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.ay r5 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.eu r5 = r5.f47009e     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r6 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r6 = r6.f46224o     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C16942h.f47422ao     // Catch:{ all -> 0x0d74 }
            boolean r5 = r5.mo44054d(r6, r7)     // Catch:{ all -> 0x0d74 }
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
        L_0x02aa:
            java.util.List<com.google.android.gms.internal.measurement.eg> r7 = r2.f47304c     // Catch:{ all -> 0x0d74 }
            int r7 = r7.size()     // Catch:{ all -> 0x0d74 }
            r16 = 1
            if (r8 >= r7) goto L_0x072c
            java.util.List<com.google.android.gms.internal.measurement.eg> r7 = r2.f47304c     // Catch:{ all -> 0x0d74 }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eg r7 = (com.google.android.gms.internal.measurement.C16498eg) r7     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.as r12 = r52.m55867r()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r11 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r11 = r11.f46224o     // Catch:{ all -> 0x0d74 }
            r24 = r9
            java.lang.String r9 = r7.f46183b     // Catch:{ all -> 0x0d74 }
            boolean r9 = r12.mo43632b(r11, r9)     // Catch:{ all -> 0x0d74 }
            if (r9 == 0) goto L_0x033d
            com.google.android.gms.measurement.internal.ay r9 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r r9 = r9.mo43585q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.t r9 = r9.f47490d     // Catch:{ all -> 0x0d74 }
            java.lang.String r11 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.ej r12 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = r12.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C16953r.m56340a(r12)     // Catch:{ all -> 0x0d74 }
            r25 = r8
            com.google.android.gms.measurement.internal.ay r8 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.p r8 = r8.mo43663g()     // Catch:{ all -> 0x0d74 }
            r26 = r13
            java.lang.String r13 = r7.f46183b     // Catch:{ all -> 0x0d74 }
            java.lang.String r8 = r8.mo44153a(r13)     // Catch:{ all -> 0x0d74 }
            r9.mo44162a(r11, r12, r8)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.as r8 = r52.m55867r()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r9 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = r9.f46224o     // Catch:{ all -> 0x0d74 }
            boolean r8 = r8.mo43640f(r9)     // Catch:{ all -> 0x0d74 }
            if (r8 != 0) goto L_0x0312
            com.google.android.gms.measurement.internal.as r8 = r52.m55867r()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r9 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = r9.f46224o     // Catch:{ all -> 0x0d74 }
            boolean r8 = r8.mo43642g(r9)     // Catch:{ all -> 0x0d74 }
            if (r8 == 0) goto L_0x0310
            goto L_0x0312
        L_0x0310:
            r8 = 0
            goto L_0x0313
        L_0x0312:
            r8 = 1
        L_0x0313:
            if (r8 != 0) goto L_0x0338
            java.lang.String r8 = "_err"
            java.lang.String r9 = r7.f46183b     // Catch:{ all -> 0x0d74 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0d74 }
            if (r8 != 0) goto L_0x0338
            com.google.android.gms.measurement.internal.ay r8 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.em r16 = r8.mo43662f()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r8 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r8 = r8.f46224o     // Catch:{ all -> 0x0d74 }
            r18 = 11
            java.lang.String r19 = "_ev"
            java.lang.String r7 = r7.f46183b     // Catch:{ all -> 0x0d74 }
            r21 = 0
            r17 = r8
            r20 = r7
            r16.mo43903a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0d74 }
        L_0x0338:
            r9 = r24
            r13 = 3
            goto L_0x0724
        L_0x033d:
            r25 = r8
            r26 = r13
            com.google.android.gms.measurement.internal.as r8 = r52.m55867r()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r9 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = r9.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.String r11 = r7.f46183b     // Catch:{ all -> 0x0d74 }
            boolean r8 = r8.mo43634c(r9, r11)     // Catch:{ all -> 0x0d74 }
            if (r8 != 0) goto L_0x039b
            r52.mo43868g()     // Catch:{ all -> 0x0d74 }
            java.lang.String r11 = r7.f46183b     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.common.internal.C15267r.m44386a(r11)     // Catch:{ all -> 0x0d74 }
            int r12 = r11.hashCode()     // Catch:{ all -> 0x0d74 }
            r13 = 94660(0x171c4, float:1.32647E-40)
            if (r12 == r13) goto L_0x0381
            r13 = 95025(0x17331, float:1.33158E-40)
            if (r12 == r13) goto L_0x0377
            r13 = 95027(0x17333, float:1.33161E-40)
            if (r12 == r13) goto L_0x036d
            goto L_0x038b
        L_0x036d:
            java.lang.String r12 = "_ui"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d74 }
            if (r11 == 0) goto L_0x038b
            r11 = 1
            goto L_0x038c
        L_0x0377:
            java.lang.String r12 = "_ug"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d74 }
            if (r11 == 0) goto L_0x038b
            r11 = 2
            goto L_0x038c
        L_0x0381:
            java.lang.String r12 = "_in"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d74 }
            if (r11 == 0) goto L_0x038b
            r11 = 0
            goto L_0x038c
        L_0x038b:
            r11 = -1
        L_0x038c:
            switch(r11) {
                case 0: goto L_0x0391;
                case 1: goto L_0x0391;
                case 2: goto L_0x0391;
                default: goto L_0x038f;
            }     // Catch:{ all -> 0x0d74 }
        L_0x038f:
            r11 = 0
            goto L_0x0392
        L_0x0391:
            r11 = 1
        L_0x0392:
            if (r11 == 0) goto L_0x0395
            goto L_0x039b
        L_0x0395:
            r37 = r14
            r39 = r24
            goto L_0x0584
        L_0x039b:
            com.google.android.gms.internal.measurement.eh[] r11 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            if (r11 != 0) goto L_0x03a4
            r11 = 0
            com.google.android.gms.internal.measurement.eh[] r12 = new com.google.android.gms.internal.measurement.C16499eh[r11]     // Catch:{ all -> 0x0d74 }
            r7.f46182a = r12     // Catch:{ all -> 0x0d74 }
        L_0x03a4:
            com.google.android.gms.internal.measurement.eh[] r11 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            int r12 = r11.length     // Catch:{ all -> 0x0d74 }
            r13 = 0
            r18 = 0
            r19 = 0
        L_0x03ac:
            if (r13 >= r12) goto L_0x03e0
            r9 = r11[r13]     // Catch:{ all -> 0x0d74 }
            r28 = r11
            java.lang.String r11 = "_c"
            r29 = r12
            java.lang.String r12 = r9.f46188a     // Catch:{ all -> 0x0d74 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d74 }
            if (r11 == 0) goto L_0x03c7
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d74 }
            r9.f46190c = r11     // Catch:{ all -> 0x0d74 }
            r18 = 1
            goto L_0x03d9
        L_0x03c7:
            java.lang.String r11 = "_r"
            java.lang.String r12 = r9.f46188a     // Catch:{ all -> 0x0d74 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d74 }
            if (r11 == 0) goto L_0x03d9
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d74 }
            r9.f46190c = r11     // Catch:{ all -> 0x0d74 }
            r19 = 1
        L_0x03d9:
            int r13 = r13 + 1
            r11 = r28
            r12 = r29
            goto L_0x03ac
        L_0x03e0:
            if (r18 != 0) goto L_0x0420
            if (r8 == 0) goto L_0x0420
            com.google.android.gms.measurement.internal.ay r9 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r r9 = r9.mo43585q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.t r9 = r9.f47495i     // Catch:{ all -> 0x0d74 }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.ay r12 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.p r12 = r12.mo43663g()     // Catch:{ all -> 0x0d74 }
            java.lang.String r13 = r7.f46183b     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = r12.mo44153a(r13)     // Catch:{ all -> 0x0d74 }
            r9.mo44161a(r11, r12)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r9 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r11 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            int r11 = r11.length     // Catch:{ all -> 0x0d74 }
            r12 = 1
            int r11 = r11 + r12
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r11)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r9 = (com.google.android.gms.internal.measurement.C16499eh[]) r9     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh r11 = new com.google.android.gms.internal.measurement.eh     // Catch:{ all -> 0x0d74 }
            r11.<init>()     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = "_c"
            r11.f46188a = r12     // Catch:{ all -> 0x0d74 }
            java.lang.Long r12 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d74 }
            r11.f46190c = r12     // Catch:{ all -> 0x0d74 }
            int r12 = r9.length     // Catch:{ all -> 0x0d74 }
            r13 = 1
            int r12 = r12 - r13
            r9[r12] = r11     // Catch:{ all -> 0x0d74 }
            r7.f46182a = r9     // Catch:{ all -> 0x0d74 }
        L_0x0420:
            if (r19 != 0) goto L_0x045e
            com.google.android.gms.measurement.internal.ay r9 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r r9 = r9.mo43585q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.t r9 = r9.f47495i     // Catch:{ all -> 0x0d74 }
            java.lang.String r11 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.ay r12 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.p r12 = r12.mo43663g()     // Catch:{ all -> 0x0d74 }
            java.lang.String r13 = r7.f46183b     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = r12.mo44153a(r13)     // Catch:{ all -> 0x0d74 }
            r9.mo44161a(r11, r12)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r9 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r11 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            int r11 = r11.length     // Catch:{ all -> 0x0d74 }
            r12 = 1
            int r11 = r11 + r12
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r11)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r9 = (com.google.android.gms.internal.measurement.C16499eh[]) r9     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh r11 = new com.google.android.gms.internal.measurement.eh     // Catch:{ all -> 0x0d74 }
            r11.<init>()     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = "_r"
            r11.f46188a = r12     // Catch:{ all -> 0x0d74 }
            java.lang.Long r12 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d74 }
            r11.f46190c = r12     // Catch:{ all -> 0x0d74 }
            int r12 = r9.length     // Catch:{ all -> 0x0d74 }
            r13 = 1
            int r12 = r12 - r13
            r9[r12] = r11     // Catch:{ all -> 0x0d74 }
            r7.f46182a = r9     // Catch:{ all -> 0x0d74 }
        L_0x045e:
            com.google.android.gms.measurement.internal.ex r28 = r52.mo43864d()     // Catch:{ all -> 0x0d74 }
            long r29 = r52.m55871v()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r9 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = r9.f46224o     // Catch:{ all -> 0x0d74 }
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 1
            r31 = r9
            com.google.android.gms.measurement.internal.ey r9 = r28.mo44084a(r29, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0d74 }
            long r11 = r9.f47372e     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.ay r9 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.eu r9 = r9.f47009e     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r13 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r13 = r13.f46224o     // Catch:{ all -> 0x0d74 }
            int r9 = r9.mo44046a(r13)     // Catch:{ all -> 0x0d74 }
            r37 = r14
            long r13 = (long) r9     // Catch:{ all -> 0x0d74 }
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x04c7
            r9 = 0
        L_0x0490:
            com.google.android.gms.internal.measurement.eh[] r11 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            int r11 = r11.length     // Catch:{ all -> 0x0d74 }
            if (r9 >= r11) goto L_0x04c4
            java.lang.String r11 = "_r"
            com.google.android.gms.internal.measurement.eh[] r12 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            r12 = r12[r9]     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = r12.f46188a     // Catch:{ all -> 0x0d74 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d74 }
            if (r11 == 0) goto L_0x04c1
            com.google.android.gms.internal.measurement.eh[] r11 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            int r11 = r11.length     // Catch:{ all -> 0x0d74 }
            r12 = 1
            int r11 = r11 - r12
            com.google.android.gms.internal.measurement.eh[] r11 = new com.google.android.gms.internal.measurement.C16499eh[r11]     // Catch:{ all -> 0x0d74 }
            if (r9 <= 0) goto L_0x04b2
            com.google.android.gms.internal.measurement.eh[] r12 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            r13 = 0
            java.lang.System.arraycopy(r12, r13, r11, r13, r9)     // Catch:{ all -> 0x0d74 }
        L_0x04b2:
            int r12 = r11.length     // Catch:{ all -> 0x0d74 }
            if (r9 >= r12) goto L_0x04be
            com.google.android.gms.internal.measurement.eh[] r12 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            int r13 = r9 + 1
            int r14 = r11.length     // Catch:{ all -> 0x0d74 }
            int r14 = r14 - r9
            java.lang.System.arraycopy(r12, r13, r11, r9, r14)     // Catch:{ all -> 0x0d74 }
        L_0x04be:
            r7.f46182a = r11     // Catch:{ all -> 0x0d74 }
            goto L_0x04c4
        L_0x04c1:
            int r9 = r9 + 1
            goto L_0x0490
        L_0x04c4:
            r9 = r24
            goto L_0x04c8
        L_0x04c7:
            r9 = 1
        L_0x04c8:
            java.lang.String r11 = r7.f46183b     // Catch:{ all -> 0x0d74 }
            boolean r11 = com.google.android.gms.measurement.internal.C16922em.m55963a(r11)     // Catch:{ all -> 0x0d74 }
            if (r11 == 0) goto L_0x0582
            if (r8 == 0) goto L_0x0582
            com.google.android.gms.measurement.internal.ex r12 = r52.mo43864d()     // Catch:{ all -> 0x0d74 }
            long r13 = r52.m55871v()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r11 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r15 = r11.f46224o     // Catch:{ all -> 0x0d74 }
            r16 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            com.google.android.gms.measurement.internal.ey r11 = r12.mo44084a(r13, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0d74 }
            long r11 = r11.f47370c     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.ay r13 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.eu r13 = r13.f47009e     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r14 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r14 = r14.f46224o     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.C16942h.f47454v     // Catch:{ all -> 0x0d74 }
            int r13 = r13.mo44049b(r14, r15)     // Catch:{ all -> 0x0d74 }
            long r13 = (long) r13     // Catch:{ all -> 0x0d74 }
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0582
            com.google.android.gms.measurement.internal.ay r11 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r r11 = r11.mo43585q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.t r11 = r11.f47490d     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.ej r13 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r13 = r13.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C16953r.m56340a(r13)     // Catch:{ all -> 0x0d74 }
            r11.mo44161a(r12, r13)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r11 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            int r12 = r11.length     // Catch:{ all -> 0x0d74 }
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x051c:
            if (r13 >= r12) goto L_0x0546
            r39 = r9
            r9 = r11[r13]     // Catch:{ all -> 0x0d74 }
            r40 = r11
            java.lang.String r11 = "_c"
            r41 = r12
            java.lang.String r12 = r9.f46188a     // Catch:{ all -> 0x0d74 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d74 }
            if (r11 == 0) goto L_0x0532
            r15 = r9
            goto L_0x053d
        L_0x0532:
            java.lang.String r11 = "_err"
            java.lang.String r9 = r9.f46188a     // Catch:{ all -> 0x0d74 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0d74 }
            if (r9 == 0) goto L_0x053d
            r14 = 1
        L_0x053d:
            int r13 = r13 + 1
            r9 = r39
            r11 = r40
            r12 = r41
            goto L_0x051c
        L_0x0546:
            r39 = r9
            if (r14 == 0) goto L_0x055d
            if (r15 == 0) goto L_0x055d
            com.google.android.gms.internal.measurement.eh[] r9 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            r11 = 1
            com.google.android.gms.internal.measurement.eh[] r12 = new com.google.android.gms.internal.measurement.C16499eh[r11]     // Catch:{ all -> 0x0d74 }
            r11 = 0
            r12[r11] = r15     // Catch:{ all -> 0x0d74 }
            java.lang.Object[] r9 = com.google.android.gms.common.util.C15319b.m44557a((T[]) r9, (T[]) r12)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r9 = (com.google.android.gms.internal.measurement.C16499eh[]) r9     // Catch:{ all -> 0x0d74 }
            r7.f46182a = r9     // Catch:{ all -> 0x0d74 }
            goto L_0x0584
        L_0x055d:
            if (r15 == 0) goto L_0x056c
            java.lang.String r9 = "_err"
            r15.f46188a = r9     // Catch:{ all -> 0x0d74 }
            r11 = 10
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d74 }
            r15.f46190c = r9     // Catch:{ all -> 0x0d74 }
            goto L_0x0584
        L_0x056c:
            com.google.android.gms.measurement.internal.ay r9 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r r9 = r9.mo43585q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.t r9 = r9.f47487a     // Catch:{ all -> 0x0d74 }
            java.lang.String r11 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.ej r12 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = r12.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C16953r.m56340a(r12)     // Catch:{ all -> 0x0d74 }
            r9.mo44161a(r11, r12)     // Catch:{ all -> 0x0d74 }
            goto L_0x0584
        L_0x0582:
            r39 = r9
        L_0x0584:
            com.google.android.gms.measurement.internal.ay r9 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.eu r9 = r9.f47009e     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r11 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r11 = r11.f46224o     // Catch:{ all -> 0x0d74 }
            boolean r9 = r9.mo44067m(r11)     // Catch:{ all -> 0x0d74 }
            if (r9 == 0) goto L_0x063e
            if (r8 == 0) goto L_0x063e
            com.google.android.gms.internal.measurement.eh[] r8 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            r9 = 0
            r11 = -1
            r12 = -1
        L_0x0599:
            int r13 = r8.length     // Catch:{ all -> 0x0d74 }
            if (r9 >= r13) goto L_0x05ba
            java.lang.String r13 = "value"
            r14 = r8[r9]     // Catch:{ all -> 0x0d74 }
            java.lang.String r14 = r14.f46188a     // Catch:{ all -> 0x0d74 }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0d74 }
            if (r13 == 0) goto L_0x05aa
            r11 = r9
            goto L_0x05b7
        L_0x05aa:
            java.lang.String r13 = "currency"
            r14 = r8[r9]     // Catch:{ all -> 0x0d74 }
            java.lang.String r14 = r14.f46188a     // Catch:{ all -> 0x0d74 }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0d74 }
            if (r13 == 0) goto L_0x05b7
            r12 = r9
        L_0x05b7:
            int r9 = r9 + 1
            goto L_0x0599
        L_0x05ba:
            r9 = -1
            if (r11 == r9) goto L_0x05e8
            r9 = r8[r11]     // Catch:{ all -> 0x0d74 }
            java.lang.Long r9 = r9.f46190c     // Catch:{ all -> 0x0d74 }
            if (r9 != 0) goto L_0x05ea
            r9 = r8[r11]     // Catch:{ all -> 0x0d74 }
            java.lang.Double r9 = r9.f46191d     // Catch:{ all -> 0x0d74 }
            if (r9 != 0) goto L_0x05ea
            com.google.android.gms.measurement.internal.ay r9 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r r9 = r9.mo43585q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.t r9 = r9.f47492f     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = "Value must be specified with a numeric type."
            r9.mo44160a(r12)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r8 = m55860a(r8, r11)     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = "_c"
            com.google.android.gms.internal.measurement.eh[] r8 = m55862a(r8, r9)     // Catch:{ all -> 0x0d74 }
            r9 = 18
            java.lang.String r11 = "value"
            com.google.android.gms.internal.measurement.eh[] r8 = m55861a(r8, r9, r11)     // Catch:{ all -> 0x0d74 }
        L_0x05e8:
            r13 = 3
            goto L_0x063b
        L_0x05ea:
            r9 = -1
            if (r12 != r9) goto L_0x05f0
            r9 = 1
            r13 = 3
            goto L_0x061a
        L_0x05f0:
            r9 = r8[r12]     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = r9.f46189b     // Catch:{ all -> 0x0d74 }
            if (r9 == 0) goto L_0x0618
            int r12 = r9.length()     // Catch:{ all -> 0x0d74 }
            r13 = 3
            if (r12 == r13) goto L_0x05fe
            goto L_0x0619
        L_0x05fe:
            r12 = 0
        L_0x05ff:
            int r14 = r9.length()     // Catch:{ all -> 0x0d74 }
            if (r12 >= r14) goto L_0x0616
            int r14 = r9.codePointAt(r12)     // Catch:{ all -> 0x0d74 }
            boolean r15 = java.lang.Character.isLetter(r14)     // Catch:{ all -> 0x0d74 }
            if (r15 != 0) goto L_0x0610
            goto L_0x0619
        L_0x0610:
            int r14 = java.lang.Character.charCount(r14)     // Catch:{ all -> 0x0d74 }
            int r12 = r12 + r14
            goto L_0x05ff
        L_0x0616:
            r9 = 0
            goto L_0x061a
        L_0x0618:
            r13 = 3
        L_0x0619:
            r9 = 1
        L_0x061a:
            if (r9 == 0) goto L_0x063b
            com.google.android.gms.measurement.internal.ay r9 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r r9 = r9.mo43585q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.t r9 = r9.f47492f     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r9.mo44160a(r12)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r8 = m55860a(r8, r11)     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = "_c"
            com.google.android.gms.internal.measurement.eh[] r8 = m55862a(r8, r9)     // Catch:{ all -> 0x0d74 }
            r9 = 19
            java.lang.String r11 = "currency"
            com.google.android.gms.internal.measurement.eh[] r8 = m55861a(r8, r9, r11)     // Catch:{ all -> 0x0d74 }
        L_0x063b:
            r7.f46182a = r8     // Catch:{ all -> 0x0d74 }
            goto L_0x063f
        L_0x063e:
            r13 = 3
        L_0x063f:
            com.google.android.gms.measurement.internal.ay r8 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.eu r8 = r8.f47009e     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r9 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = r9.f46224o     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C16942h.f47421an     // Catch:{ all -> 0x0d74 }
            boolean r8 = r8.mo44054d(r9, r11)     // Catch:{ all -> 0x0d74 }
            if (r8 == 0) goto L_0x06be
            java.lang.String r8 = "_e"
            java.lang.String r9 = r7.f46183b     // Catch:{ all -> 0x0d74 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0d74 }
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r8 == 0) goto L_0x0689
            r52.mo43868g()     // Catch:{ all -> 0x0d74 }
            java.lang.String r8 = "_fr"
            com.google.android.gms.internal.measurement.eh r8 = com.google.android.gms.measurement.internal.C16919ej.m55915a(r7, r8)     // Catch:{ all -> 0x0d74 }
            if (r8 != 0) goto L_0x06be
            if (r6 == 0) goto L_0x0687
            java.lang.Long r8 = r6.f46184c     // Catch:{ all -> 0x0d74 }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0d74 }
            java.lang.Long r10 = r7.f46184c     // Catch:{ all -> 0x0d74 }
            long r14 = r10.longValue()     // Catch:{ all -> 0x0d74 }
            r10 = 0
            long r8 = r8 - r14
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0d74 }
            int r10 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x0687
            boolean r8 = r1.m55858a(r7, r6)     // Catch:{ all -> 0x0d74 }
            if (r8 == 0) goto L_0x0687
        L_0x0684:
            r6 = 0
            r10 = 0
            goto L_0x06be
        L_0x0687:
            r10 = r7
            goto L_0x06be
        L_0x0689:
            java.lang.String r8 = "_vs"
            java.lang.String r9 = r7.f46183b     // Catch:{ all -> 0x0d74 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0d74 }
            if (r8 == 0) goto L_0x06be
            r52.mo43868g()     // Catch:{ all -> 0x0d74 }
            java.lang.String r8 = "_et"
            com.google.android.gms.internal.measurement.eh r8 = com.google.android.gms.measurement.internal.C16919ej.m55915a(r7, r8)     // Catch:{ all -> 0x0d74 }
            if (r8 != 0) goto L_0x06be
            if (r10 == 0) goto L_0x06bd
            java.lang.Long r6 = r10.f46184c     // Catch:{ all -> 0x0d74 }
            long r8 = r6.longValue()     // Catch:{ all -> 0x0d74 }
            java.lang.Long r6 = r7.f46184c     // Catch:{ all -> 0x0d74 }
            long r14 = r6.longValue()     // Catch:{ all -> 0x0d74 }
            r6 = 0
            long r8 = r8 - r14
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0d74 }
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x06bd
            boolean r6 = r1.m55858a(r10, r7)     // Catch:{ all -> 0x0d74 }
            if (r6 == 0) goto L_0x06bd
            goto L_0x0684
        L_0x06bd:
            r6 = r7
        L_0x06be:
            if (r4 == 0) goto L_0x0718
            if (r5 != 0) goto L_0x0718
            java.lang.String r8 = "_e"
            java.lang.String r9 = r7.f46183b     // Catch:{ all -> 0x0d74 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0d74 }
            if (r8 == 0) goto L_0x0718
            com.google.android.gms.internal.measurement.eh[] r8 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            if (r8 == 0) goto L_0x0703
            com.google.android.gms.internal.measurement.eh[] r8 = r7.f46182a     // Catch:{ all -> 0x0d74 }
            int r8 = r8.length     // Catch:{ all -> 0x0d74 }
            if (r8 != 0) goto L_0x06d6
            goto L_0x0703
        L_0x06d6:
            r52.mo43868g()     // Catch:{ all -> 0x0d74 }
            java.lang.String r8 = "_et"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C16919ej.m55925b(r7, r8)     // Catch:{ all -> 0x0d74 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0d74 }
            if (r8 != 0) goto L_0x06f9
            com.google.android.gms.measurement.internal.ay r8 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo43585q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.t r8 = r8.f47490d     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.ej r11 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r11 = r11.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C16953r.m56340a(r11)     // Catch:{ all -> 0x0d74 }
            r8.mo44161a(r9, r11)     // Catch:{ all -> 0x0d74 }
            goto L_0x0718
        L_0x06f9:
            long r8 = r8.longValue()     // Catch:{ all -> 0x0d74 }
            r11 = 0
            long r14 = r37 + r8
            r37 = r14
            goto L_0x0718
        L_0x0703:
            com.google.android.gms.measurement.internal.ay r8 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo43585q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.t r8 = r8.f47490d     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.ej r11 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r11 = r11.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C16953r.m56340a(r11)     // Catch:{ all -> 0x0d74 }
            r8.mo44161a(r9, r11)     // Catch:{ all -> 0x0d74 }
        L_0x0718:
            com.google.android.gms.internal.measurement.eg[] r8 = r3.f46211b     // Catch:{ all -> 0x0d74 }
            int r9 = r26 + 1
            r8[r26] = r7     // Catch:{ all -> 0x0d74 }
            r26 = r9
            r14 = r37
            r9 = r39
        L_0x0724:
            int r8 = r25 + 1
            r13 = r26
            r11 = 0
            r12 = 1
            goto L_0x02aa
        L_0x072c:
            r24 = r9
            r26 = r13
            r37 = r14
            if (r5 == 0) goto L_0x078d
            r13 = r26
            r14 = r37
            r5 = 0
        L_0x0739:
            if (r5 >= r13) goto L_0x078a
            com.google.android.gms.internal.measurement.eg[] r6 = r3.f46211b     // Catch:{ all -> 0x0d74 }
            r6 = r6[r5]     // Catch:{ all -> 0x0d74 }
            java.lang.String r7 = "_e"
            java.lang.String r8 = r6.f46183b     // Catch:{ all -> 0x0d74 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0d74 }
            if (r7 == 0) goto L_0x0766
            r52.mo43868g()     // Catch:{ all -> 0x0d74 }
            java.lang.String r7 = "_fr"
            com.google.android.gms.internal.measurement.eh r7 = com.google.android.gms.measurement.internal.C16919ej.m55915a(r6, r7)     // Catch:{ all -> 0x0d74 }
            if (r7 == 0) goto L_0x0766
            com.google.android.gms.internal.measurement.eg[] r6 = r3.f46211b     // Catch:{ all -> 0x0d74 }
            int r7 = r5 + 1
            com.google.android.gms.internal.measurement.eg[] r8 = r3.f46211b     // Catch:{ all -> 0x0d74 }
            int r9 = r13 - r5
            r10 = 1
            int r9 = r9 - r10
            java.lang.System.arraycopy(r6, r7, r8, r5, r9)     // Catch:{ all -> 0x0d74 }
            int r13 = r13 + -1
            int r5 = r5 + -1
            goto L_0x0787
        L_0x0766:
            if (r4 == 0) goto L_0x0787
            r52.mo43868g()     // Catch:{ all -> 0x0d74 }
            java.lang.String r7 = "_et"
            com.google.android.gms.internal.measurement.eh r6 = com.google.android.gms.measurement.internal.C16919ej.m55915a(r6, r7)     // Catch:{ all -> 0x0d74 }
            if (r6 == 0) goto L_0x0787
            java.lang.Long r6 = r6.f46190c     // Catch:{ all -> 0x0d74 }
            if (r6 == 0) goto L_0x0787
            long r7 = r6.longValue()     // Catch:{ all -> 0x0d74 }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0787
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d74 }
            r8 = 0
            long r14 = r14 + r6
        L_0x0787:
            r6 = 1
            int r5 = r5 + r6
            goto L_0x0739
        L_0x078a:
            r37 = r14
            goto L_0x078f
        L_0x078d:
            r13 = r26
        L_0x078f:
            java.util.List<com.google.android.gms.internal.measurement.eg> r5 = r2.f47304c     // Catch:{ all -> 0x0d74 }
            int r5 = r5.size()     // Catch:{ all -> 0x0d74 }
            if (r13 >= r5) goto L_0x07a1
            com.google.android.gms.internal.measurement.eg[] r5 = r3.f46211b     // Catch:{ all -> 0x0d74 }
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r13)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eg[] r5 = (com.google.android.gms.internal.measurement.C16498eg[]) r5     // Catch:{ all -> 0x0d74 }
            r3.f46211b = r5     // Catch:{ all -> 0x0d74 }
        L_0x07a1:
            if (r4 == 0) goto L_0x086f
            com.google.android.gms.measurement.internal.ex r4 = r52.mo43864d()     // Catch:{ all -> 0x0d74 }
            java.lang.String r5 = r3.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.String r6 = "_lte"
            com.google.android.gms.measurement.internal.el r4 = r4.mo44103c(r5, r6)     // Catch:{ all -> 0x0d74 }
            if (r4 == 0) goto L_0x07dd
            java.lang.Object r5 = r4.f47319e     // Catch:{ all -> 0x0d74 }
            if (r5 != 0) goto L_0x07b6
            goto L_0x07dd
        L_0x07b6:
            com.google.android.gms.measurement.internal.el r5 = new com.google.android.gms.measurement.internal.el     // Catch:{ all -> 0x0d74 }
            java.lang.String r7 = r3.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.String r8 = "auto"
            java.lang.String r9 = "_lte"
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.common.util.e r6 = r6.mo43580l()     // Catch:{ all -> 0x0d74 }
            long r10 = r6.mo38684a()     // Catch:{ all -> 0x0d74 }
            java.lang.Object r4 = r4.f47319e     // Catch:{ all -> 0x0d74 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0d74 }
            long r12 = r4.longValue()     // Catch:{ all -> 0x0d74 }
            r4 = 0
            long r12 = r12 + r37
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d74 }
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x0d74 }
            r4 = r5
            goto L_0x07fa
        L_0x07dd:
            com.google.android.gms.measurement.internal.el r4 = new com.google.android.gms.measurement.internal.el     // Catch:{ all -> 0x0d74 }
            java.lang.String r5 = r3.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.String r27 = "auto"
            java.lang.String r28 = "_lte"
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.common.util.e r6 = r6.mo43580l()     // Catch:{ all -> 0x0d74 }
            long r29 = r6.mo38684a()     // Catch:{ all -> 0x0d74 }
            java.lang.Long r31 = java.lang.Long.valueOf(r37)     // Catch:{ all -> 0x0d74 }
            r25 = r4
            r26 = r5
            r25.<init>(r26, r27, r28, r29, r31)     // Catch:{ all -> 0x0d74 }
        L_0x07fa:
            com.google.android.gms.internal.measurement.em r5 = new com.google.android.gms.internal.measurement.em     // Catch:{ all -> 0x0d74 }
            r5.<init>()     // Catch:{ all -> 0x0d74 }
            java.lang.String r6 = "_lte"
            r5.f46245b = r6     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.common.util.e r6 = r6.mo43580l()     // Catch:{ all -> 0x0d74 }
            long r6 = r6.mo38684a()     // Catch:{ all -> 0x0d74 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d74 }
            r5.f46244a = r6     // Catch:{ all -> 0x0d74 }
            java.lang.Object r6 = r4.f47319e     // Catch:{ all -> 0x0d74 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0d74 }
            r5.f46247d = r6     // Catch:{ all -> 0x0d74 }
            r6 = 0
        L_0x081a:
            com.google.android.gms.internal.measurement.em[] r7 = r3.f46212c     // Catch:{ all -> 0x0d74 }
            int r7 = r7.length     // Catch:{ all -> 0x0d74 }
            if (r6 >= r7) goto L_0x0836
            java.lang.String r7 = "_lte"
            com.google.android.gms.internal.measurement.em[] r8 = r3.f46212c     // Catch:{ all -> 0x0d74 }
            r8 = r8[r6]     // Catch:{ all -> 0x0d74 }
            java.lang.String r8 = r8.f46245b     // Catch:{ all -> 0x0d74 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0d74 }
            if (r7 == 0) goto L_0x0833
            com.google.android.gms.internal.measurement.em[] r7 = r3.f46212c     // Catch:{ all -> 0x0d74 }
            r7[r6] = r5     // Catch:{ all -> 0x0d74 }
            r6 = 1
            goto L_0x0837
        L_0x0833:
            int r6 = r6 + 1
            goto L_0x081a
        L_0x0836:
            r6 = 0
        L_0x0837:
            if (r6 != 0) goto L_0x0853
            com.google.android.gms.internal.measurement.em[] r6 = r3.f46212c     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.em[] r7 = r3.f46212c     // Catch:{ all -> 0x0d74 }
            int r7 = r7.length     // Catch:{ all -> 0x0d74 }
            r8 = 1
            int r7 = r7 + r8
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.em[] r6 = (com.google.android.gms.internal.measurement.C16504em[]) r6     // Catch:{ all -> 0x0d74 }
            r3.f46212c = r6     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.em[] r6 = r3.f46212c     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r7 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.em[] r7 = r7.f46212c     // Catch:{ all -> 0x0d74 }
            int r7 = r7.length     // Catch:{ all -> 0x0d74 }
            r8 = 1
            int r7 = r7 - r8
            r6[r7] = r5     // Catch:{ all -> 0x0d74 }
        L_0x0853:
            r5 = 0
            int r7 = (r37 > r5 ? 1 : (r37 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x086f
            com.google.android.gms.measurement.internal.ex r5 = r52.mo43864d()     // Catch:{ all -> 0x0d74 }
            r5.mo44096a(r4)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.ay r5 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo43585q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.t r5 = r5.f47494h     // Catch:{ all -> 0x0d74 }
            java.lang.String r6 = "Updated lifetime engagement user property with value. Value"
            java.lang.Object r4 = r4.f47319e     // Catch:{ all -> 0x0d74 }
            r5.mo44161a(r6, r4)     // Catch:{ all -> 0x0d74 }
        L_0x086f:
            java.lang.String r4 = r3.f46224o     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.em[] r5 = r3.f46212c     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eg[] r6 = r3.f46211b     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.common.internal.C15267r.m44386a(r4)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.er r7 = r52.mo43866e()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ee[] r4 = r7.mo44043a(r4, r6, r5)     // Catch:{ all -> 0x0d74 }
            r3.f46195A = r4     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.eu r4 = r4.f47009e     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r5 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r5 = r5.f46224o     // Catch:{ all -> 0x0d74 }
            boolean r4 = r4.mo44053d(r5)     // Catch:{ all -> 0x0d74 }
            if (r4 == 0) goto L_0x0b96
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0b90 }
            r4.<init>()     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.internal.measurement.eg[] r5 = r3.f46211b     // Catch:{ all -> 0x0b90 }
            int r5 = r5.length     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.internal.measurement.eg[] r5 = new com.google.android.gms.internal.measurement.C16498eg[r5]     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.measurement.internal.em r6 = r6.mo43662f()     // Catch:{ all -> 0x0b90 }
            java.security.SecureRandom r6 = r6.mo43914g()     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.internal.measurement.eg[] r7 = r3.f46211b     // Catch:{ all -> 0x0b90 }
            int r8 = r7.length     // Catch:{ all -> 0x0b90 }
            r9 = 0
            r10 = 0
        L_0x08a9:
            if (r9 >= r8) goto L_0x0b5e
            r11 = r7[r9]     // Catch:{ all -> 0x0b90 }
            java.lang.String r12 = r11.f46183b     // Catch:{ all -> 0x0b90 }
            java.lang.String r13 = "_ep"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0b90 }
            if (r12 == 0) goto L_0x0934
            r52.mo43868g()     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = "_en"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C16919ej.m55925b(r11, r12)     // Catch:{ all -> 0x0d74 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0d74 }
            java.lang.Object r13 = r4.get(r12)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.d r13 = (com.google.android.gms.measurement.internal.C16881d) r13     // Catch:{ all -> 0x0d74 }
            if (r13 != 0) goto L_0x08d9
            com.google.android.gms.measurement.internal.ex r13 = r52.mo43864d()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r14 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r14 = r14.f46224o     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.d r13 = r13.mo44083a(r14, r12)     // Catch:{ all -> 0x0d74 }
            r4.put(r12, r13)     // Catch:{ all -> 0x0d74 }
        L_0x08d9:
            java.lang.Long r12 = r13.f47197h     // Catch:{ all -> 0x0d74 }
            if (r12 != 0) goto L_0x0926
            java.lang.Long r12 = r13.f47198i     // Catch:{ all -> 0x0d74 }
            long r14 = r12.longValue()     // Catch:{ all -> 0x0d74 }
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x08f6
            r52.mo43868g()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r12 = r11.f46182a     // Catch:{ all -> 0x0d74 }
            java.lang.String r14 = "_sr"
            java.lang.Long r15 = r13.f47198i     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r12 = com.google.android.gms.measurement.internal.C16919ej.m55924a(r12, r14, r15)     // Catch:{ all -> 0x0d74 }
            r11.f46182a = r12     // Catch:{ all -> 0x0d74 }
        L_0x08f6:
            java.lang.Boolean r12 = r13.f47199j     // Catch:{ all -> 0x0d74 }
            if (r12 == 0) goto L_0x0913
            java.lang.Boolean r12 = r13.f47199j     // Catch:{ all -> 0x0d74 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x0d74 }
            if (r12 == 0) goto L_0x0913
            r52.mo43868g()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r12 = r11.f46182a     // Catch:{ all -> 0x0d74 }
            java.lang.String r13 = "_efs"
            java.lang.Long r14 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r12 = com.google.android.gms.measurement.internal.C16919ej.m55924a(r12, r13, r14)     // Catch:{ all -> 0x0d74 }
            r11.f46182a = r12     // Catch:{ all -> 0x0d74 }
        L_0x0913:
            int r12 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0d74 }
            r50 = r2
            r44 = r3
            r49 = r6
            r42 = r7
            r43 = r8
            r45 = r9
            r10 = r12
            goto L_0x0b4e
        L_0x0926:
            r50 = r2
            r44 = r3
            r49 = r6
            r42 = r7
            r43 = r8
            r45 = r9
            goto L_0x0b4e
        L_0x0934:
            com.google.android.gms.measurement.internal.as r12 = r52.m55867r()     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.internal.measurement.ej r13 = r2.f47302a     // Catch:{ all -> 0x0b90 }
            java.lang.String r13 = r13.f46224o     // Catch:{ all -> 0x0b90 }
            long r12 = r12.mo43638e(r13)     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.measurement.internal.ay r14 = r1.f47278a     // Catch:{ all -> 0x0b90 }
            r14.mo43662f()     // Catch:{ all -> 0x0b90 }
            java.lang.Long r14 = r11.f46184c     // Catch:{ all -> 0x0b90 }
            long r14 = r14.longValue()     // Catch:{ all -> 0x0b90 }
            long r14 = com.google.android.gms.measurement.internal.C16922em.m55954a(r14, r12)     // Catch:{ all -> 0x0b90 }
            r42 = r7
            java.lang.String r7 = "_dbg"
            r43 = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0b90 }
            boolean r18 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b90 }
            if (r18 != 0) goto L_0x098e
            if (r8 != 0) goto L_0x0962
            goto L_0x098e
        L_0x0962:
            r44 = r3
            com.google.android.gms.internal.measurement.eh[] r3 = r11.f46182a     // Catch:{ all -> 0x0d74 }
            r45 = r9
            int r9 = r3.length     // Catch:{ all -> 0x0d74 }
            r46 = r12
            r12 = 0
        L_0x096c:
            if (r12 >= r9) goto L_0x0994
            r13 = r3[r12]     // Catch:{ all -> 0x0d74 }
            r48 = r3
            java.lang.String r3 = r13.f46188a     // Catch:{ all -> 0x0d74 }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x0d74 }
            if (r3 == 0) goto L_0x0989
            boolean r3 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x0d74 }
            if (r3 == 0) goto L_0x0994
            java.lang.Long r3 = r13.f46190c     // Catch:{ all -> 0x0d74 }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0d74 }
            if (r3 != 0) goto L_0x0987
            goto L_0x0994
        L_0x0987:
            r3 = 1
            goto L_0x0995
        L_0x0989:
            int r12 = r12 + 1
            r3 = r48
            goto L_0x096c
        L_0x098e:
            r44 = r3
            r45 = r9
            r46 = r12
        L_0x0994:
            r3 = 0
        L_0x0995:
            if (r3 != 0) goto L_0x09a6
            com.google.android.gms.measurement.internal.as r3 = r52.m55867r()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r7 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r7 = r7.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.String r8 = r11.f46183b     // Catch:{ all -> 0x0d74 }
            int r12 = r3.mo43635d(r7, r8)     // Catch:{ all -> 0x0d74 }
            goto L_0x09a7
        L_0x09a6:
            r12 = 1
        L_0x09a7:
            if (r12 > 0) goto L_0x09c7
            com.google.android.gms.measurement.internal.ay r3 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo43585q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.t r3 = r3.f47490d     // Catch:{ all -> 0x0d74 }
            java.lang.String r7 = "Sample rate must be positive. event, rate"
            java.lang.String r8 = r11.f46183b     // Catch:{ all -> 0x0d74 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0d74 }
            r3.mo44162a(r7, r8, r9)     // Catch:{ all -> 0x0d74 }
            int r3 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0d74 }
            r50 = r2
            r10 = r3
            r49 = r6
            goto L_0x0b4e
        L_0x09c7:
            java.lang.String r3 = r11.f46183b     // Catch:{ all -> 0x0b90 }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.measurement.internal.d r3 = (com.google.android.gms.measurement.internal.C16881d) r3     // Catch:{ all -> 0x0b90 }
            if (r3 != 0) goto L_0x0a19
            com.google.android.gms.measurement.internal.ex r3 = r52.mo43864d()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r7 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r7 = r7.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.String r8 = r11.f46183b     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.d r3 = r3.mo44083a(r7, r8)     // Catch:{ all -> 0x0d74 }
            if (r3 != 0) goto L_0x0a19
            com.google.android.gms.measurement.internal.ay r3 = r1.f47278a     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo43585q()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.t r3 = r3.f47490d     // Catch:{ all -> 0x0d74 }
            java.lang.String r7 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.ej r8 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r8 = r8.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = r11.f46183b     // Catch:{ all -> 0x0d74 }
            r3.mo44162a(r7, r8, r9)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.d r3 = new com.google.android.gms.measurement.internal.d     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.ej r7 = r2.f47302a     // Catch:{ all -> 0x0d74 }
            java.lang.String r7 = r7.f46224o     // Catch:{ all -> 0x0d74 }
            java.lang.String r8 = r11.f46183b     // Catch:{ all -> 0x0d74 }
            r28 = 1
            r30 = 1
            java.lang.Long r9 = r11.f46184c     // Catch:{ all -> 0x0d74 }
            long r32 = r9.longValue()     // Catch:{ all -> 0x0d74 }
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r25 = r3
            r26 = r7
            r27 = r8
            r25.<init>(r26, r27, r28, r30, r32, r34, r36, r37, r38, r39)     // Catch:{ all -> 0x0d74 }
        L_0x0a19:
            r52.mo43868g()     // Catch:{ all -> 0x0b90 }
            java.lang.String r7 = "_eid"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C16919ej.m55925b(r11, r7)     // Catch:{ all -> 0x0b90 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0b90 }
            if (r7 == 0) goto L_0x0a28
            r8 = 1
            goto L_0x0a29
        L_0x0a28:
            r8 = 0
        L_0x0a29:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0b90 }
            r9 = 1
            if (r12 != r9) goto L_0x0a57
            int r7 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0d74 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0d74 }
            if (r8 == 0) goto L_0x0a50
            java.lang.Long r8 = r3.f47197h     // Catch:{ all -> 0x0d74 }
            if (r8 != 0) goto L_0x0a46
            java.lang.Long r8 = r3.f47198i     // Catch:{ all -> 0x0d74 }
            if (r8 != 0) goto L_0x0a46
            java.lang.Boolean r8 = r3.f47199j     // Catch:{ all -> 0x0d74 }
            if (r8 == 0) goto L_0x0a50
        L_0x0a46:
            r8 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo43793a(r8, r8, r8)     // Catch:{ all -> 0x0d74 }
            java.lang.String r8 = r11.f46183b     // Catch:{ all -> 0x0d74 }
            r4.put(r8, r3)     // Catch:{ all -> 0x0d74 }
        L_0x0a50:
            r50 = r2
            r49 = r6
            r10 = r7
            goto L_0x0b4e
        L_0x0a57:
            int r9 = r6.nextInt(r12)     // Catch:{ all -> 0x0b90 }
            if (r9 != 0) goto L_0x0a98
            r52.mo43868g()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r7 = r11.f46182a     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = "_sr"
            long r12 = (long) r12     // Catch:{ all -> 0x0d74 }
            r49 = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.eh[] r6 = com.google.android.gms.measurement.internal.C16919ej.m55924a(r7, r9, r6)     // Catch:{ all -> 0x0d74 }
            r11.f46182a = r6     // Catch:{ all -> 0x0d74 }
            int r6 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0d74 }
            boolean r7 = r8.booleanValue()     // Catch:{ all -> 0x0d74 }
            if (r7 == 0) goto L_0x0a84
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d74 }
            r8 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo43793a(r8, r7, r8)     // Catch:{ all -> 0x0d74 }
        L_0x0a84:
            java.lang.String r7 = r11.f46183b     // Catch:{ all -> 0x0d74 }
            java.lang.Long r8 = r11.f46184c     // Catch:{ all -> 0x0d74 }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.d r3 = r3.mo43792a(r8, r14)     // Catch:{ all -> 0x0d74 }
            r4.put(r7, r3)     // Catch:{ all -> 0x0d74 }
            r50 = r2
            r10 = r6
            goto L_0x0b4e
        L_0x0a98:
            r49 = r6
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.measurement.internal.eu r6 = r6.f47009e     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.internal.measurement.ej r9 = r2.f47302a     // Catch:{ all -> 0x0b90 }
            java.lang.String r9 = r9.f46224o     // Catch:{ all -> 0x0b90 }
            boolean r6 = r6.mo44069o(r9)     // Catch:{ all -> 0x0b90 }
            if (r6 == 0) goto L_0x0ad4
            java.lang.Long r6 = r3.f47196g     // Catch:{ all -> 0x0b90 }
            if (r6 == 0) goto L_0x0ab7
            java.lang.Long r6 = r3.f47196g     // Catch:{ all -> 0x0d74 }
            long r18 = r6.longValue()     // Catch:{ all -> 0x0d74 }
            r50 = r2
            r51 = r7
            goto L_0x0acc
        L_0x0ab7:
            com.google.android.gms.measurement.internal.ay r6 = r1.f47278a     // Catch:{ all -> 0x0b90 }
            r6.mo43662f()     // Catch:{ all -> 0x0b90 }
            java.lang.Long r6 = r11.f46185d     // Catch:{ all -> 0x0b90 }
            r50 = r2
            long r1 = r6.longValue()     // Catch:{ all -> 0x0b90 }
            r51 = r7
            r6 = r46
            long r18 = com.google.android.gms.measurement.internal.C16922em.m55954a(r1, r6)     // Catch:{ all -> 0x0b90 }
        L_0x0acc:
            int r1 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0ad2
        L_0x0ad0:
            r1 = 1
            goto L_0x0aee
        L_0x0ad2:
            r1 = 0
            goto L_0x0aee
        L_0x0ad4:
            r50 = r2
            r51 = r7
            long r1 = r3.f47195f     // Catch:{ all -> 0x0b90 }
            java.lang.Long r6 = r11.f46184c     // Catch:{ all -> 0x0b90 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0b90 }
            r9 = 0
            long r6 = r6 - r1
            long r1 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x0b90 }
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 < 0) goto L_0x0ad2
            goto L_0x0ad0
        L_0x0aee:
            if (r1 == 0) goto L_0x0b3c
            r52.mo43868g()     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.internal.measurement.eh[] r1 = r11.f46182a     // Catch:{ all -> 0x0b90 }
            java.lang.String r2 = "_efs"
            java.lang.Long r6 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.internal.measurement.eh[] r1 = com.google.android.gms.measurement.internal.C16919ej.m55924a(r1, r2, r6)     // Catch:{ all -> 0x0b90 }
            r11.f46182a = r1     // Catch:{ all -> 0x0b90 }
            r52.mo43868g()     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.internal.measurement.eh[] r1 = r11.f46182a     // Catch:{ all -> 0x0b90 }
            java.lang.String r2 = "_sr"
            long r6 = (long) r12     // Catch:{ all -> 0x0b90 }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.internal.measurement.eh[] r1 = com.google.android.gms.measurement.internal.C16919ej.m55924a(r1, r2, r9)     // Catch:{ all -> 0x0b90 }
            r11.f46182a = r1     // Catch:{ all -> 0x0b90 }
            int r1 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0b90 }
            boolean r2 = r8.booleanValue()     // Catch:{ all -> 0x0b90 }
            if (r2 == 0) goto L_0x0b2b
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0b90 }
            r6 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0b90 }
            r6 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo43793a(r6, r2, r7)     // Catch:{ all -> 0x0b90 }
        L_0x0b2b:
            java.lang.String r2 = r11.f46183b     // Catch:{ all -> 0x0b90 }
            java.lang.Long r6 = r11.f46184c     // Catch:{ all -> 0x0b90 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.measurement.internal.d r3 = r3.mo43792a(r6, r14)     // Catch:{ all -> 0x0b90 }
            r4.put(r2, r3)     // Catch:{ all -> 0x0b90 }
            r10 = r1
            goto L_0x0b4e
        L_0x0b3c:
            boolean r1 = r8.booleanValue()     // Catch:{ all -> 0x0b90 }
            if (r1 == 0) goto L_0x0b4e
            java.lang.String r1 = r11.f46183b     // Catch:{ all -> 0x0b90 }
            r7 = r51
            r2 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo43793a(r7, r2, r2)     // Catch:{ all -> 0x0b90 }
            r4.put(r1, r3)     // Catch:{ all -> 0x0b90 }
        L_0x0b4e:
            int r9 = r45 + 1
            r7 = r42
            r8 = r43
            r3 = r44
            r6 = r49
            r2 = r50
            r1 = r52
            goto L_0x08a9
        L_0x0b5e:
            r50 = r2
            r1 = r3
            com.google.android.gms.internal.measurement.eg[] r2 = r1.f46211b     // Catch:{ all -> 0x0b90 }
            int r2 = r2.length     // Catch:{ all -> 0x0b90 }
            if (r10 >= r2) goto L_0x0b6e
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r10)     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.internal.measurement.eg[] r2 = (com.google.android.gms.internal.measurement.C16498eg[]) r2     // Catch:{ all -> 0x0b90 }
            r1.f46211b = r2     // Catch:{ all -> 0x0b90 }
        L_0x0b6e:
            java.util.Set r2 = r4.entrySet()     // Catch:{ all -> 0x0b90 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0b90 }
        L_0x0b76:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0b90 }
            if (r3 == 0) goto L_0x0b99
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0b90 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.measurement.internal.ex r4 = r52.mo43864d()     // Catch:{ all -> 0x0b90 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0b90 }
            com.google.android.gms.measurement.internal.d r3 = (com.google.android.gms.measurement.internal.C16881d) r3     // Catch:{ all -> 0x0b90 }
            r4.mo44090a(r3)     // Catch:{ all -> 0x0b90 }
            goto L_0x0b76
        L_0x0b90:
            r0 = move-exception
            r1 = r0
            r5 = r52
            goto L_0x0d77
        L_0x0b96:
            r50 = r2
            r1 = r3
        L_0x0b99:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d52 }
            r1.f46214e = r2     // Catch:{ all -> 0x0d52 }
            r2 = -9223372036854775808
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d52 }
            r1.f46215f = r2     // Catch:{ all -> 0x0d52 }
            r2 = 0
        L_0x0bad:
            com.google.android.gms.internal.measurement.eg[] r3 = r1.f46211b     // Catch:{ all -> 0x0d52 }
            int r3 = r3.length     // Catch:{ all -> 0x0d52 }
            if (r2 >= r3) goto L_0x0be1
            com.google.android.gms.internal.measurement.eg[] r3 = r1.f46211b     // Catch:{ all -> 0x0b90 }
            r3 = r3[r2]     // Catch:{ all -> 0x0b90 }
            java.lang.Long r4 = r3.f46184c     // Catch:{ all -> 0x0b90 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0b90 }
            java.lang.Long r6 = r1.f46214e     // Catch:{ all -> 0x0b90 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0b90 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0bca
            java.lang.Long r4 = r3.f46184c     // Catch:{ all -> 0x0b90 }
            r1.f46214e = r4     // Catch:{ all -> 0x0b90 }
        L_0x0bca:
            java.lang.Long r4 = r3.f46184c     // Catch:{ all -> 0x0b90 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0b90 }
            java.lang.Long r6 = r1.f46215f     // Catch:{ all -> 0x0b90 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0b90 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0bde
            java.lang.Long r3 = r3.f46184c     // Catch:{ all -> 0x0b90 }
            r1.f46215f = r3     // Catch:{ all -> 0x0b90 }
        L_0x0bde:
            int r2 = r2 + 1
            goto L_0x0bad
        L_0x0be1:
            r2 = r50
            com.google.android.gms.internal.measurement.ej r3 = r2.f47302a     // Catch:{ all -> 0x0d52 }
            java.lang.String r3 = r3.f46224o     // Catch:{ all -> 0x0d52 }
            com.google.android.gms.measurement.internal.ex r4 = r52.mo43864d()     // Catch:{ all -> 0x0d52 }
            com.google.android.gms.measurement.internal.eo r4 = r4.mo44099b(r3)     // Catch:{ all -> 0x0d52 }
            if (r4 != 0) goto L_0x0c09
            r5 = r52
            com.google.android.gms.measurement.internal.ay r4 = r5.f47278a     // Catch:{ all -> 0x0d71 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo43585q()     // Catch:{ all -> 0x0d71 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a     // Catch:{ all -> 0x0d71 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.ej r7 = r2.f47302a     // Catch:{ all -> 0x0d71 }
            java.lang.String r7 = r7.f46224o     // Catch:{ all -> 0x0d71 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C16953r.m56340a(r7)     // Catch:{ all -> 0x0d71 }
            r4.mo44161a(r6, r7)     // Catch:{ all -> 0x0d71 }
            goto L_0x0c67
        L_0x0c09:
            r5 = r52
            com.google.android.gms.internal.measurement.eg[] r6 = r1.f46211b     // Catch:{ all -> 0x0d71 }
            int r6 = r6.length     // Catch:{ all -> 0x0d71 }
            if (r6 <= 0) goto L_0x0c67
            long r6 = r4.mo43956i()     // Catch:{ all -> 0x0d71 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0c1f
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d71 }
            goto L_0x0c20
        L_0x0c1f:
            r8 = 0
        L_0x0c20:
            r1.f46217h = r8     // Catch:{ all -> 0x0d71 }
            long r8 = r4.mo43953h()     // Catch:{ all -> 0x0d71 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0c2d
            goto L_0x0c2e
        L_0x0c2d:
            r6 = r8
        L_0x0c2e:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0c37
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d71 }
            goto L_0x0c38
        L_0x0c37:
            r6 = 0
        L_0x0c38:
            r1.f46216g = r6     // Catch:{ all -> 0x0d71 }
            r4.mo43973s()     // Catch:{ all -> 0x0d71 }
            long r6 = r4.mo43970p()     // Catch:{ all -> 0x0d71 }
            int r6 = (int) r6     // Catch:{ all -> 0x0d71 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0d71 }
            r1.f46232w = r6     // Catch:{ all -> 0x0d71 }
            java.lang.Long r6 = r1.f46214e     // Catch:{ all -> 0x0d71 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d71 }
            r4.mo43930a(r6)     // Catch:{ all -> 0x0d71 }
            java.lang.Long r6 = r1.f46215f     // Catch:{ all -> 0x0d71 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d71 }
            r4.mo43934b(r6)     // Catch:{ all -> 0x0d71 }
            java.lang.String r6 = r4.mo43925A()     // Catch:{ all -> 0x0d71 }
            r1.f46233x = r6     // Catch:{ all -> 0x0d71 }
            com.google.android.gms.measurement.internal.ex r6 = r52.mo43864d()     // Catch:{ all -> 0x0d71 }
            r6.mo44091a(r4)     // Catch:{ all -> 0x0d71 }
        L_0x0c67:
            com.google.android.gms.internal.measurement.eg[] r4 = r1.f46211b     // Catch:{ all -> 0x0d71 }
            int r4 = r4.length     // Catch:{ all -> 0x0d71 }
            if (r4 <= 0) goto L_0x0cb5
            com.google.android.gms.measurement.internal.as r4 = r52.m55867r()     // Catch:{ all -> 0x0d71 }
            com.google.android.gms.internal.measurement.ej r6 = r2.f47302a     // Catch:{ all -> 0x0d71 }
            java.lang.String r6 = r6.f46224o     // Catch:{ all -> 0x0d71 }
            com.google.android.gms.internal.measurement.ec r4 = r4.mo43628a(r6)     // Catch:{ all -> 0x0d71 }
            if (r4 == 0) goto L_0x0c84
            java.lang.Long r6 = r4.f46162a     // Catch:{ all -> 0x0d71 }
            if (r6 != 0) goto L_0x0c7f
            goto L_0x0c84
        L_0x0c7f:
            java.lang.Long r4 = r4.f46162a     // Catch:{ all -> 0x0d71 }
            r1.f46199E = r4     // Catch:{ all -> 0x0d71 }
            goto L_0x0cac
        L_0x0c84:
            com.google.android.gms.internal.measurement.ej r4 = r2.f47302a     // Catch:{ all -> 0x0d71 }
            java.lang.String r4 = r4.f46234y     // Catch:{ all -> 0x0d71 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0d71 }
            if (r4 == 0) goto L_0x0c97
            r6 = -1
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d71 }
            r1.f46199E = r4     // Catch:{ all -> 0x0d71 }
            goto L_0x0cac
        L_0x0c97:
            com.google.android.gms.measurement.internal.ay r4 = r5.f47278a     // Catch:{ all -> 0x0d71 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo43585q()     // Catch:{ all -> 0x0d71 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47490d     // Catch:{ all -> 0x0d71 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.ej r7 = r2.f47302a     // Catch:{ all -> 0x0d71 }
            java.lang.String r7 = r7.f46224o     // Catch:{ all -> 0x0d71 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C16953r.m56340a(r7)     // Catch:{ all -> 0x0d71 }
            r4.mo44161a(r6, r7)     // Catch:{ all -> 0x0d71 }
        L_0x0cac:
            com.google.android.gms.measurement.internal.ex r4 = r52.mo43864d()     // Catch:{ all -> 0x0d71 }
            r9 = r24
            r4.mo44094a(r1, r9)     // Catch:{ all -> 0x0d71 }
        L_0x0cb5:
            com.google.android.gms.measurement.internal.ex r1 = r52.mo43864d()     // Catch:{ all -> 0x0d71 }
            java.util.List<java.lang.Long> r2 = r2.f47303b     // Catch:{ all -> 0x0d71 }
            com.google.android.gms.common.internal.C15267r.m44384a(r2)     // Catch:{ all -> 0x0d71 }
            r1.mo43571c()     // Catch:{ all -> 0x0d71 }
            r1.mo43843j()     // Catch:{ all -> 0x0d71 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d71 }
            java.lang.String r6 = "rowid in ("
            r4.<init>(r6)     // Catch:{ all -> 0x0d71 }
            r6 = 0
        L_0x0ccc:
            int r7 = r2.size()     // Catch:{ all -> 0x0d71 }
            if (r6 >= r7) goto L_0x0ce9
            if (r6 == 0) goto L_0x0cd9
            java.lang.String r7 = ","
            r4.append(r7)     // Catch:{ all -> 0x0d71 }
        L_0x0cd9:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0d71 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d71 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d71 }
            r4.append(r7)     // Catch:{ all -> 0x0d71 }
            int r6 = r6 + 1
            goto L_0x0ccc
        L_0x0ce9:
            java.lang.String r6 = ")"
            r4.append(r6)     // Catch:{ all -> 0x0d71 }
            android.database.sqlite.SQLiteDatabase r6 = r1.mo44115w()     // Catch:{ all -> 0x0d71 }
            java.lang.String r7 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0d71 }
            r8 = 0
            int r4 = r6.delete(r7, r4, r8)     // Catch:{ all -> 0x0d71 }
            int r6 = r2.size()     // Catch:{ all -> 0x0d71 }
            if (r4 == r6) goto L_0x0d1a
            com.google.android.gms.measurement.internal.r r1 = r1.mo43585q()     // Catch:{ all -> 0x0d71 }
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a     // Catch:{ all -> 0x0d71 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0d71 }
            int r2 = r2.size()     // Catch:{ all -> 0x0d71 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d71 }
            r1.mo44162a(r6, r4, r2)     // Catch:{ all -> 0x0d71 }
        L_0x0d1a:
            com.google.android.gms.measurement.internal.ex r1 = r52.mo43864d()     // Catch:{ all -> 0x0d71 }
            android.database.sqlite.SQLiteDatabase r2 = r1.mo44115w()     // Catch:{ all -> 0x0d71 }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0d31 }
            r7 = 0
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0d31 }
            r7 = 1
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0d31 }
            r2.execSQL(r4, r6)     // Catch:{ SQLiteException -> 0x0d31 }
            goto L_0x0d42
        L_0x0d31:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.r r1 = r1.mo43585q()     // Catch:{ all -> 0x0d71 }
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a     // Catch:{ all -> 0x0d71 }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C16953r.m56340a(r3)     // Catch:{ all -> 0x0d71 }
            r1.mo44162a(r4, r3, r2)     // Catch:{ all -> 0x0d71 }
        L_0x0d42:
            com.google.android.gms.measurement.internal.ex r1 = r52.mo43864d()     // Catch:{ all -> 0x0d71 }
            r1.mo44113u()     // Catch:{ all -> 0x0d71 }
            com.google.android.gms.measurement.internal.ex r1 = r52.mo43864d()
            r1.mo44114v()
            r1 = 1
            return r1
        L_0x0d52:
            r0 = move-exception
            r5 = r52
            goto L_0x0d76
        L_0x0d56:
            r5 = r1
            com.google.android.gms.measurement.internal.ex r1 = r52.mo43864d()     // Catch:{ all -> 0x0d71 }
            r1.mo44113u()     // Catch:{ all -> 0x0d71 }
            com.google.android.gms.measurement.internal.ex r1 = r52.mo43864d()
            r1.mo44114v()
            r1 = 0
            return r1
        L_0x0d67:
            r0 = move-exception
        L_0x0d68:
            r5 = r1
            goto L_0x0252
        L_0x0d6b:
            if (r8 == 0) goto L_0x0d73
            r8.close()     // Catch:{ all -> 0x0d71 }
            goto L_0x0d73
        L_0x0d71:
            r0 = move-exception
            goto L_0x0d76
        L_0x0d73:
            throw r1     // Catch:{ all -> 0x0d71 }
        L_0x0d74:
            r0 = move-exception
            r5 = r1
        L_0x0d76:
            r1 = r0
        L_0x0d77:
            com.google.android.gms.measurement.internal.ex r2 = r52.mo43864d()
            r2.mo44114v()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16912ed.m55859a(java.lang.String, long):boolean");
    }

    /* renamed from: a */
    private final boolean m55858a(C16498eg egVar, C16498eg egVar2) {
        Object obj;
        C15267r.m44394b("_e".equals(egVar.f46183b));
        mo43868g();
        C16499eh a = C16919ej.m55915a(egVar, "_sc");
        String str = null;
        if (a == null) {
            obj = null;
        } else {
            obj = a.f46189b;
        }
        mo43868g();
        C16499eh a2 = C16919ej.m55915a(egVar2, "_pc");
        if (a2 != null) {
            str = a2.f46189b;
        }
        if (str == null || !str.equals(obj)) {
            return false;
        }
        mo43868g();
        C16499eh a3 = C16919ej.m55915a(egVar, "_et");
        if (a3.f46190c == null || a3.f46190c.longValue() <= 0) {
            return true;
        }
        long longValue = a3.f46190c.longValue();
        mo43868g();
        C16499eh a4 = C16919ej.m55915a(egVar2, "_et");
        if (!(a4 == null || a4.f46190c == null || a4.f46190c.longValue() <= 0)) {
            longValue += a4.f46190c.longValue();
        }
        mo43868g();
        egVar2.f46182a = C16919ej.m55924a(egVar2.f46182a, "_et", (Object) Long.valueOf(longValue));
        mo43868g();
        egVar.f46182a = C16919ej.m55924a(egVar.f46182a, "_fr", (Object) Long.valueOf(1));
        return true;
    }

    /* renamed from: a */
    private static C16499eh[] m55862a(C16499eh[] ehVarArr, String str) {
        int i = 0;
        while (true) {
            if (i >= ehVarArr.length) {
                i = -1;
                break;
            } else if (str.equals(ehVarArr[i].f46188a)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return ehVarArr;
        }
        return m55860a(ehVarArr, i);
    }

    /* renamed from: a */
    private static C16499eh[] m55860a(C16499eh[] ehVarArr, int i) {
        C16499eh[] ehVarArr2 = new C16499eh[(ehVarArr.length - 1)];
        if (i > 0) {
            System.arraycopy(ehVarArr, 0, ehVarArr2, 0, i);
        }
        if (i < ehVarArr2.length) {
            System.arraycopy(ehVarArr, i + 1, ehVarArr2, i, ehVarArr2.length - i);
        }
        return ehVarArr2;
    }

    /* renamed from: a */
    private static C16499eh[] m55861a(C16499eh[] ehVarArr, int i, String str) {
        for (C16499eh ehVar : ehVarArr) {
            if ("_err".equals(ehVar.f46188a)) {
                return ehVarArr;
            }
        }
        C16499eh[] ehVarArr2 = new C16499eh[(ehVarArr.length + 2)];
        System.arraycopy(ehVarArr, 0, ehVarArr2, 0, ehVarArr.length);
        C16499eh ehVar2 = new C16499eh();
        ehVar2.f46188a = "_err";
        ehVar2.f46190c = Long.valueOf((long) i);
        C16499eh ehVar3 = new C16499eh();
        ehVar3.f46188a = "_ev";
        ehVar3.f46189b = str;
        ehVarArr2[ehVarArr2.length - 2] = ehVar2;
        ehVarArr2[ehVarArr2.length - 1] = ehVar3;
        return ehVarArr2;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43846a(int i, Throwable th, byte[] bArr, String str) {
        C16933ex d;
        m55870u();
        mo43871j();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f47295s = false;
                m55874y();
                throw th2;
            }
        }
        List<Long> list = this.f47299w;
        this.f47299w = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f47278a.mo43658b().f46917c.mo43615a(this.f47278a.mo43580l().mo38684a());
                this.f47278a.mo43658b().f46918d.mo43615a(0);
                m55873x();
                this.f47278a.mo43585q().f47495i.mo44162a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                mo43864d().mo44108e();
                try {
                    for (Long l : list) {
                        try {
                            d = mo43864d();
                            long longValue = l.longValue();
                            d.mo43571c();
                            d.mo43843j();
                            if (d.mo44115w().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            d.mo43585q().f47487a.mo44161a("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.f47300x == null || !this.f47300x.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    mo43864d().mo44113u();
                    mo43864d().mo44114v();
                    this.f47300x = null;
                    if (!mo43862c().mo44165e() || !m55872w()) {
                        this.f47301y = -1;
                        m55873x();
                    } else {
                        mo43872k();
                    }
                    this.f47290n = 0;
                } catch (Throwable th3) {
                    mo43864d().mo44114v();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.f47278a.mo43585q().f47487a.mo44161a("Database error while trying to delete uploaded bundles", e3);
                this.f47290n = this.f47278a.mo43580l().mo38685b();
                this.f47278a.mo43585q().f47495i.mo44161a("Disable upload, time", Long.valueOf(this.f47290n));
            }
        } else {
            this.f47278a.mo43585q().f47495i.mo44162a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f47278a.mo43658b().f46918d.mo43615a(this.f47278a.mo43580l().mo38684a());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.f47278a.mo43658b().f46919e.mo43615a(this.f47278a.mo43580l().mo38684a());
            }
            if (this.f47278a.f47009e.mo44060g(str)) {
                mo43864d().mo44093a(list);
            }
            m55873x();
        }
        this.f47295s = false;
        m55874y();
    }

    /* renamed from: w */
    private final boolean m55872w() {
        m55870u();
        mo43871j();
        return mo43864d().mo44078C() || !TextUtils.isEmpty(mo43864d().mo44116x());
    }

    /* renamed from: a */
    private final void m55856a(C16924eo eoVar) {
        Map map;
        m55870u();
        if (!TextUtils.isEmpty(eoVar.mo43941d()) || (C16930eu.m56091v() && !TextUtils.isEmpty(eoVar.mo43944e()))) {
            Builder builder = new Builder();
            String d = eoVar.mo43941d();
            if (TextUtils.isEmpty(d) && C16930eu.m56091v()) {
                d = eoVar.mo43944e();
            }
            Builder encodedAuthority = builder.scheme((String) C16942h.f47445m.mo44132a()).encodedAuthority((String) C16942h.f47446n.mo44132a());
            String str = "config/app/";
            String valueOf = String.valueOf(d);
            encodedAuthority.path(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).appendQueryParameter("app_instance_id", eoVar.mo43937c()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "14710");
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                this.f47278a.mo43585q().f47495i.mo44161a("Fetching remote configuration", eoVar.mo43933b());
                C16494ec a = m55867r().mo43628a(eoVar.mo43933b());
                String b = m55867r().mo43631b(eoVar.mo43933b());
                if (a == null || TextUtils.isEmpty(b)) {
                    map = null;
                } else {
                    ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("If-Modified-Since", b);
                    map = arrayMap;
                }
                this.f47294r = true;
                C16957v c = mo43862c();
                String b2 = eoVar.mo43933b();
                C16916eg egVar = new C16916eg(this);
                c.mo43571c();
                c.mo43843j();
                C15267r.m44384a(url);
                C15267r.m44384a(egVar);
                C16820at p = c.mo43584p();
                C16802ab abVar = new C16802ab(c, b2, url, null, map, egVar);
                p.mo43647b((Runnable) abVar);
            } catch (MalformedURLException unused) {
                this.f47278a.mo43585q().f47487a.mo44162a("Failed to parse config URL. Not fetching. appId", C16953r.m56340a(eoVar.mo43933b()), uri);
            }
        } else {
            mo43855a(eoVar.mo43933b(), 204, null, null, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0138 A[Catch:{ all -> 0x0187, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0146 A[Catch:{ all -> 0x0187, all -> 0x000f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43855a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.m55870u()
            r6.mo43871j()
            com.google.android.gms.common.internal.C15267r.m44386a(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x000f }
            goto L_0x0012
        L_0x000f:
            r7 = move-exception
            goto L_0x0190
        L_0x0012:
            com.google.android.gms.measurement.internal.ay r1 = r6.f47278a     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.r r1 = r1.mo43585q()     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.t r1 = r1.f47495i     // Catch:{ all -> 0x000f }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x000f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x000f }
            r1.mo44161a(r2, r3)     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.ex r1 = r6.mo43864d()     // Catch:{ all -> 0x000f }
            r1.mo44108e()     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.ex r1 = r6.mo43864d()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.eo r1 = r1.mo44099b(r7)     // Catch:{ all -> 0x0187 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 1
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r2) goto L_0x0040
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x0040
            if (r8 != r4) goto L_0x0044
        L_0x0040:
            if (r9 != 0) goto L_0x0044
            r2 = 1
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.ay r8 = r6.f47278a     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo43585q()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.t r8 = r8.f47490d     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C16953r.m56340a(r7)     // Catch:{ all -> 0x0187 }
            r8.mo44161a(r9, r7)     // Catch:{ all -> 0x0187 }
            goto L_0x0173
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00c8
            if (r8 != r5) goto L_0x0061
            goto L_0x00c8
        L_0x0061:
            com.google.android.gms.measurement.internal.ay r10 = r6.f47278a     // Catch:{ all -> 0x0187 }
            com.google.android.gms.common.util.e r10 = r10.mo43580l()     // Catch:{ all -> 0x0187 }
            long r10 = r10.mo38684a()     // Catch:{ all -> 0x0187 }
            r1.mo43954h(r10)     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ex r10 = r6.mo43864d()     // Catch:{ all -> 0x0187 }
            r10.mo44091a(r1)     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ay r10 = r6.f47278a     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.r r10 = r10.mo43585q()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.t r10 = r10.f47495i     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0187 }
            r10.mo44162a(r11, r1, r9)     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.as r9 = r6.m55867r()     // Catch:{ all -> 0x0187 }
            r9.mo43633c(r7)     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ay r7 = r6.f47278a     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.af r7 = r7.mo43658b()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ai r7 = r7.f46918d     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ay r9 = r6.f47278a     // Catch:{ all -> 0x0187 }
            com.google.android.gms.common.util.e r9 = r9.mo43580l()     // Catch:{ all -> 0x0187 }
            long r9 = r9.mo38684a()     // Catch:{ all -> 0x0187 }
            r7.mo43615a(r9)     // Catch:{ all -> 0x0187 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ac
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r3 = 0
        L_0x00ac:
            if (r3 == 0) goto L_0x00c3
            com.google.android.gms.measurement.internal.ay r7 = r6.f47278a     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.af r7 = r7.mo43658b()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ai r7 = r7.f46919e     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ay r8 = r6.f47278a     // Catch:{ all -> 0x0187 }
            com.google.android.gms.common.util.e r8 = r8.mo43580l()     // Catch:{ all -> 0x0187 }
            long r8 = r8.mo38684a()     // Catch:{ all -> 0x0187 }
            r7.mo43615a(r8)     // Catch:{ all -> 0x0187 }
        L_0x00c3:
            r6.m55873x()     // Catch:{ all -> 0x0187 }
            goto L_0x0173
        L_0x00c8:
            r9 = 0
            if (r11 == 0) goto L_0x00d4
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0187 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0187 }
            goto L_0x00d5
        L_0x00d4:
            r11 = r9
        L_0x00d5:
            if (r11 == 0) goto L_0x00e4
            int r2 = r11.size()     // Catch:{ all -> 0x0187 }
            if (r2 <= 0) goto L_0x00e4
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0187 }
            goto L_0x00e5
        L_0x00e4:
            r11 = r9
        L_0x00e5:
            if (r8 == r5) goto L_0x0101
            if (r8 != r4) goto L_0x00ea
            goto L_0x0101
        L_0x00ea:
            com.google.android.gms.measurement.internal.as r9 = r6.m55867r()     // Catch:{ all -> 0x0187 }
            boolean r9 = r9.mo43630a(r7, r10, r11)     // Catch:{ all -> 0x0187 }
            if (r9 != 0) goto L_0x0122
            com.google.android.gms.measurement.internal.ex r7 = r6.mo43864d()     // Catch:{ all -> 0x000f }
            r7.mo44114v()     // Catch:{ all -> 0x000f }
            r6.f47294r = r0
            r6.m55874y()
            return
        L_0x0101:
            com.google.android.gms.measurement.internal.as r11 = r6.m55867r()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.internal.measurement.ec r11 = r11.mo43628a(r7)     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x0122
            com.google.android.gms.measurement.internal.as r11 = r6.m55867r()     // Catch:{ all -> 0x0187 }
            boolean r9 = r11.mo43630a(r7, r9, r9)     // Catch:{ all -> 0x0187 }
            if (r9 != 0) goto L_0x0122
            com.google.android.gms.measurement.internal.ex r7 = r6.mo43864d()     // Catch:{ all -> 0x000f }
            r7.mo44114v()     // Catch:{ all -> 0x000f }
            r6.f47294r = r0
            r6.m55874y()
            return
        L_0x0122:
            com.google.android.gms.measurement.internal.ay r9 = r6.f47278a     // Catch:{ all -> 0x0187 }
            com.google.android.gms.common.util.e r9 = r9.mo43580l()     // Catch:{ all -> 0x0187 }
            long r2 = r9.mo38684a()     // Catch:{ all -> 0x0187 }
            r1.mo43951g(r2)     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ex r9 = r6.mo43864d()     // Catch:{ all -> 0x0187 }
            r9.mo44091a(r1)     // Catch:{ all -> 0x0187 }
            if (r8 != r5) goto L_0x0146
            com.google.android.gms.measurement.internal.ay r8 = r6.f47278a     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo43585q()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.t r8 = r8.f47492f     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo44161a(r9, r7)     // Catch:{ all -> 0x0187 }
            goto L_0x015c
        L_0x0146:
            com.google.android.gms.measurement.internal.ay r7 = r6.f47278a     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.r r7 = r7.mo43585q()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.t r7 = r7.f47495i     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0187 }
            int r10 = r10.length     // Catch:{ all -> 0x0187 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0187 }
            r7.mo44162a(r9, r8, r10)     // Catch:{ all -> 0x0187 }
        L_0x015c:
            com.google.android.gms.measurement.internal.v r7 = r6.mo43862c()     // Catch:{ all -> 0x0187 }
            boolean r7 = r7.mo44165e()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x0170
            boolean r7 = r6.m55872w()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x0170
            r6.mo43872k()     // Catch:{ all -> 0x0187 }
            goto L_0x0173
        L_0x0170:
            r6.m55873x()     // Catch:{ all -> 0x0187 }
        L_0x0173:
            com.google.android.gms.measurement.internal.ex r7 = r6.mo43864d()     // Catch:{ all -> 0x0187 }
            r7.mo44113u()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ex r7 = r6.mo43864d()     // Catch:{ all -> 0x000f }
            r7.mo44114v()     // Catch:{ all -> 0x000f }
            r6.f47294r = r0
            r6.m55874y()
            return
        L_0x0187:
            r7 = move-exception
            com.google.android.gms.measurement.internal.ex r8 = r6.mo43864d()     // Catch:{ all -> 0x000f }
            r8.mo44114v()     // Catch:{ all -> 0x000f }
            throw r7     // Catch:{ all -> 0x000f }
        L_0x0190:
            r6.f47294r = r0
            r6.m55874y()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16912ed.mo43855a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b7  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m55873x() {
        /*
            r20 = this;
            r0 = r20
            r20.m55870u()
            r20.mo43871j()
            boolean r1 = r20.m55848A()
            if (r1 != 0) goto L_0x001b
            com.google.android.gms.measurement.internal.ay r1 = r0.f47278a
            com.google.android.gms.measurement.internal.eu r1 = r1.f47009e
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C16942h.f47425ar
            boolean r1 = r1.mo44048a(r2)
            if (r1 != 0) goto L_0x001b
            return
        L_0x001b:
            long r1 = r0.f47290n
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x005e
            com.google.android.gms.measurement.internal.ay r1 = r0.f47278a
            com.google.android.gms.common.util.e r1 = r1.mo43580l()
            long r1 = r1.mo38685b()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f47290n
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x005c
            com.google.android.gms.measurement.internal.ay r1 = r0.f47278a
            com.google.android.gms.measurement.internal.r r1 = r1.mo43585q()
            com.google.android.gms.measurement.internal.t r1 = r1.f47495i
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1.mo44161a(r2, r3)
            com.google.android.gms.measurement.internal.ad r1 = r20.m55868s()
            r1.mo43591b()
            com.google.android.gms.measurement.internal.dz r1 = r20.m55869t()
            r1.mo43838e()
            return
        L_0x005c:
            r0.f47290n = r3
        L_0x005e:
            com.google.android.gms.measurement.internal.ay r1 = r0.f47278a
            boolean r1 = r1.mo43676x()
            if (r1 == 0) goto L_0x025c
            boolean r1 = r20.m55872w()
            if (r1 != 0) goto L_0x006e
            goto L_0x025c
        L_0x006e:
            com.google.android.gms.measurement.internal.ay r1 = r0.f47278a
            com.google.android.gms.common.util.e r1 = r1.mo43580l()
            long r1 = r1.mo38684a()
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C16942h.f47388I
            java.lang.Object r5 = r5.mo44132a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ex r7 = r20.mo43864d()
            boolean r7 = r7.mo44079D()
            if (r7 != 0) goto L_0x009f
            com.google.android.gms.measurement.internal.ex r7 = r20.mo43864d()
            boolean r7 = r7.mo44117y()
            if (r7 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r7 = 0
            goto L_0x00a0
        L_0x009f:
            r7 = 1
        L_0x00a0:
            if (r7 == 0) goto L_0x00da
            com.google.android.gms.measurement.internal.ay r9 = r0.f47278a
            com.google.android.gms.measurement.internal.eu r9 = r9.f47009e
            java.lang.String r9 = r9.mo44063j()
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x00c9
            java.lang.String r10 = ".none."
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00c9
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C16942h.f47383D
            java.lang.Object r9 = r9.mo44132a()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            goto L_0x00ea
        L_0x00c9:
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C16942h.f47382C
            java.lang.Object r9 = r9.mo44132a()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            goto L_0x00ea
        L_0x00da:
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C16942h.f47381B
            java.lang.Object r9 = r9.mo44132a()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
        L_0x00ea:
            com.google.android.gms.measurement.internal.ay r11 = r0.f47278a
            com.google.android.gms.measurement.internal.af r11 = r11.mo43658b()
            com.google.android.gms.measurement.internal.ai r11 = r11.f46917c
            long r11 = r11.mo43614a()
            com.google.android.gms.measurement.internal.ay r13 = r0.f47278a
            com.google.android.gms.measurement.internal.af r13 = r13.mo43658b()
            com.google.android.gms.measurement.internal.ai r13 = r13.f46918d
            long r13 = r13.mo43614a()
            com.google.android.gms.measurement.internal.ex r15 = r20.mo43864d()
            r16 = r9
            long r8 = r15.mo44076A()
            com.google.android.gms.measurement.internal.ex r10 = r20.mo43864d()
            r18 = r5
            long r5 = r10.mo44077B()
            long r5 = java.lang.Math.max(r8, r5)
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0121
        L_0x011e:
            r8 = r3
            goto L_0x0197
        L_0x0121:
            r8 = 0
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r11 = r11 - r1
            long r8 = java.lang.Math.abs(r11)
            long r8 = r1 - r8
            long r13 = r13 - r1
            long r10 = java.lang.Math.abs(r13)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r5 + r18
            if (r7 == 0) goto L_0x0148
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0148
            long r10 = java.lang.Math.min(r5, r8)
            long r10 = r10 + r16
        L_0x0148:
            com.google.android.gms.measurement.internal.ej r7 = r20.mo43868g()
            r12 = r16
            boolean r7 = r7.mo43885a(r8, r12)
            if (r7 != 0) goto L_0x0156
            long r8 = r8 + r12
            goto L_0x0157
        L_0x0156:
            r8 = r10
        L_0x0157:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0197
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0197
            r5 = 0
        L_0x0160:
            r6 = 20
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C16942h.f47390K
            java.lang.Object r7 = r7.mo44132a()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r10 = 0
            int r7 = java.lang.Math.max(r10, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x011e
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r11 = com.google.android.gms.measurement.internal.C16942h.f47389J
            java.lang.Object r11 = r11.mo44132a()
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            long r11 = r11 * r6
            long r8 = r8 + r11
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0194
            goto L_0x0197
        L_0x0194:
            int r5 = r5 + 1
            goto L_0x0160
        L_0x0197:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01b7
            com.google.android.gms.measurement.internal.ay r1 = r0.f47278a
            com.google.android.gms.measurement.internal.r r1 = r1.mo43585q()
            com.google.android.gms.measurement.internal.t r1 = r1.f47495i
            java.lang.String r2 = "Next upload time is 0"
            r1.mo44160a(r2)
            com.google.android.gms.measurement.internal.ad r1 = r20.m55868s()
            r1.mo43591b()
            com.google.android.gms.measurement.internal.dz r1 = r20.m55869t()
            r1.mo43838e()
            return
        L_0x01b7:
            com.google.android.gms.measurement.internal.v r1 = r20.mo43862c()
            boolean r1 = r1.mo44165e()
            if (r1 != 0) goto L_0x01dd
            com.google.android.gms.measurement.internal.ay r1 = r0.f47278a
            com.google.android.gms.measurement.internal.r r1 = r1.mo43585q()
            com.google.android.gms.measurement.internal.t r1 = r1.f47495i
            java.lang.String r2 = "No network"
            r1.mo44160a(r2)
            com.google.android.gms.measurement.internal.ad r1 = r20.m55868s()
            r1.mo43590a()
            com.google.android.gms.measurement.internal.dz r1 = r20.m55869t()
            r1.mo43838e()
            return
        L_0x01dd:
            com.google.android.gms.measurement.internal.ay r1 = r0.f47278a
            com.google.android.gms.measurement.internal.af r1 = r1.mo43658b()
            com.google.android.gms.measurement.internal.ai r1 = r1.f46919e
            long r1 = r1.mo43614a()
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C16942h.f47458z
            java.lang.Object r5 = r5.mo44132a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ej r7 = r20.mo43868g()
            boolean r7 = r7.mo43885a(r1, r5)
            if (r7 != 0) goto L_0x0208
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x0208:
            com.google.android.gms.measurement.internal.ad r1 = r20.m55868s()
            r1.mo43591b()
            com.google.android.gms.measurement.internal.ay r1 = r0.f47278a
            com.google.android.gms.common.util.e r1 = r1.mo43580l()
            long r1 = r1.mo38684a()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0243
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C16942h.f47384E
            java.lang.Object r1 = r1.mo44132a()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.ay r1 = r0.f47278a
            com.google.android.gms.measurement.internal.af r1 = r1.mo43658b()
            com.google.android.gms.measurement.internal.ai r1 = r1.f46917c
            com.google.android.gms.measurement.internal.ay r2 = r0.f47278a
            com.google.android.gms.common.util.e r2 = r2.mo43580l()
            long r2 = r2.mo38684a()
            r1.mo43615a(r2)
        L_0x0243:
            com.google.android.gms.measurement.internal.ay r1 = r0.f47278a
            com.google.android.gms.measurement.internal.r r1 = r1.mo43585q()
            com.google.android.gms.measurement.internal.t r1 = r1.f47495i
            java.lang.String r2 = "Upload scheduled in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r1.mo44161a(r2, r3)
            com.google.android.gms.measurement.internal.dz r1 = r20.m55869t()
            r1.mo43837a(r8)
            return
        L_0x025c:
            com.google.android.gms.measurement.internal.ay r1 = r0.f47278a
            com.google.android.gms.measurement.internal.r r1 = r1.mo43585q()
            com.google.android.gms.measurement.internal.t r1 = r1.f47495i
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo44160a(r2)
            com.google.android.gms.measurement.internal.ad r1 = r20.m55868s()
            r1.mo43591b()
            com.google.android.gms.measurement.internal.dz r1 = r20.m55869t()
            r1.mo43838e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16912ed.m55873x():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43854a(Runnable runnable) {
        m55870u();
        if (this.f47291o == null) {
            this.f47291o = new ArrayList();
        }
        this.f47291o.add(runnable);
    }

    /* renamed from: y */
    private final void m55874y() {
        m55870u();
        if (this.f47294r || this.f47295s || this.f47296t) {
            this.f47278a.mo43585q().f47495i.mo44163a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f47294r), Boolean.valueOf(this.f47295s), Boolean.valueOf(this.f47296t));
            return;
        }
        this.f47278a.mo43585q().f47495i.mo44160a("Stopping uploading service(s)");
        if (this.f47291o != null) {
            for (Runnable run : this.f47291o) {
                run.run();
            }
            this.f47291o.clear();
        }
    }

    /* renamed from: b */
    private final Boolean m55863b(C16924eo eoVar) {
        try {
            if (eoVar.mo43960k() != -2147483648L) {
                if (eoVar.mo43960k() == ((long) C15176d.m44159a(this.f47278a.mo43581m()).mo38467b(eoVar.mo43933b(), 0).versionCode)) {
                    return Boolean.valueOf(true);
                }
            } else {
                String str = C15176d.m44159a(this.f47278a.mo43581m()).mo38467b(eoVar.mo43933b(), 0).versionName;
                if (eoVar.mo43958j() != null && eoVar.mo43958j().equals(str)) {
                    return Boolean.valueOf(true);
                }
            }
            return Boolean.valueOf(false);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: z */
    private final boolean m55875z() {
        m55870u();
        try {
            this.f47298v = new RandomAccessFile(new File(this.f47278a.mo43581m().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f47297u = this.f47298v.tryLock();
            if (this.f47297u != null) {
                this.f47278a.mo43585q().f47495i.mo44160a("Storage concurrent access okay");
                return true;
            }
            this.f47278a.mo43585q().f47487a.mo44160a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.f47278a.mo43585q().f47487a.mo44161a("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            this.f47278a.mo43585q().f47487a.mo44161a("Failed to access storage lock file", e2);
        }
    }

    /* renamed from: a */
    private final int m55849a(FileChannel fileChannel) {
        int i;
        m55870u();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f47278a.mo43585q().f47487a.mo44160a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f47278a.mo43585q().f47490d.mo44161a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            i = allocate.getInt();
            return i;
        } catch (IOException e) {
            this.f47278a.mo43585q().f47487a.mo44161a("Failed to read from channel", e);
            i = 0;
        }
    }

    /* renamed from: a */
    private final boolean m55857a(int i, FileChannel fileChannel) {
        m55870u();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f47278a.mo43585q().f47487a.mo44160a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f47278a.mo43585q().f47487a.mo44161a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f47278a.mo43585q().f47487a.mo44161a("Failed to write to channel", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final void mo43873n() {
        m55870u();
        mo43871j();
        if (!this.f47289m) {
            this.f47289m = true;
            m55870u();
            mo43871j();
            if ((this.f47278a.f47009e.mo44048a(C16942h.f47425ar) || m55848A()) && m55875z()) {
                int a = m55849a(this.f47298v);
                int y = this.f47278a.mo43669o().mo44138y();
                m55870u();
                if (a > y) {
                    this.f47278a.mo43585q().f47487a.mo44162a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a), Integer.valueOf(y));
                } else if (a < y) {
                    if (m55857a(y, this.f47298v)) {
                        this.f47278a.mo43585q().f47495i.mo44162a("Storage version upgraded. Previous, current version", Integer.valueOf(a), Integer.valueOf(y));
                    } else {
                        this.f47278a.mo43585q().f47487a.mo44162a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a), Integer.valueOf(y));
                    }
                }
            }
        }
        if (!this.f47288l && !this.f47278a.f47009e.mo44048a(C16942h.f47425ar)) {
            this.f47278a.mo43585q().f47493g.mo44160a("This instance being marked as an uploader");
            this.f47288l = true;
            m55873x();
        }
    }

    /* renamed from: A */
    private final boolean m55848A() {
        m55870u();
        mo43871j();
        return this.f47288l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo43859b(zzk zzk) {
        if (this.f47299w != null) {
            this.f47300x = new ArrayList();
            this.f47300x.addAll(this.f47299w);
        }
        C16933ex d = mo43864d();
        String str = zzk.f47530a;
        C15267r.m44386a(str);
        d.mo43571c();
        d.mo43843j();
        try {
            SQLiteDatabase w = d.mo44115w();
            String[] strArr = {str};
            int delete = w.delete("apps", "app_id=?", strArr) + 0 + w.delete("events", "app_id=?", strArr) + w.delete("user_attributes", "app_id=?", strArr) + w.delete("conditional_properties", "app_id=?", strArr) + w.delete("raw_events", "app_id=?", strArr) + w.delete("raw_events_metadata", "app_id=?", strArr) + w.delete("queue", "app_id=?", strArr) + w.delete("audience_filter_values", "app_id=?", strArr) + w.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                d.mo43585q().f47495i.mo44162a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            d.mo43585q().f47487a.mo44162a("Error resetting analytics data. appId, error", C16953r.m56340a(str), e);
        }
        zzk a = m55852a(this.f47278a.mo43581m(), zzk.f47530a, zzk.f47531b, zzk.f47537h, zzk.f47544o, zzk.f47545p, zzk.f47542m, zzk.f47547r);
        if (!this.f47278a.f47009e.mo44064j(zzk.f47530a) || zzk.f47537h) {
            mo43863c(a);
        }
    }

    /* renamed from: a */
    private final zzk m55852a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3) {
        String str4;
        int i;
        String str5 = str;
        String str6 = "Unknown";
        String str7 = "Unknown";
        String str8 = "Unknown";
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.f47278a.mo43585q().f47487a.mo44160a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str6 = packageManager.getInstallerPackageName(str5);
        } catch (IllegalArgumentException unused) {
            this.f47278a.mo43585q().f47487a.mo44161a("Error retrieving installer package name. appId", C16953r.m56340a(str));
        }
        if (str6 == null) {
            str6 = "manual_install";
        } else if ("com.android.vending".equals(str6)) {
            str6 = "";
        }
        String str9 = str6;
        try {
            PackageInfo b = C15176d.m44159a(context).mo38467b(str5, 0);
            if (b != null) {
                CharSequence b2 = C15176d.m44159a(context).mo38468b(str5);
                if (!TextUtils.isEmpty(b2)) {
                    String charSequence = b2.toString();
                }
                str4 = b.versionName;
                i = b.versionCode;
            } else {
                str4 = str7;
                i = Integer.MIN_VALUE;
            }
            zzk zzk = new zzk(str, str2, str4, (long) i, str9, 14710, this.f47278a.mo43662f().mo43895a(context, str5), (String) null, z, false, "", 0, this.f47278a.f47009e.mo44066l(str5) ? j : 0, 0, z2, z3, false, str3);
            return zzk;
        } catch (NameNotFoundException unused2) {
            this.f47278a.mo43585q().f47487a.mo44162a("Error retrieving newly installed package info. appId, appName", C16953r.m56340a(str), str8);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43850a(zzfv zzfv, zzk zzk) {
        m55870u();
        mo43871j();
        if (TextUtils.isEmpty(zzk.f47531b) && TextUtils.isEmpty(zzk.f47547r)) {
            return;
        }
        if (!zzk.f47537h) {
            m55866e(zzk);
            return;
        }
        int c = this.f47278a.mo43662f().mo43910c(zzfv.f47522a);
        if (c != 0) {
            this.f47278a.mo43662f();
            this.f47278a.mo43662f().mo43903a(zzk.f47530a, c, "_ev", C16922em.m55958a(zzfv.f47522a, 24, true), zzfv.f47522a != null ? zzfv.f47522a.length() : 0);
            return;
        }
        int b = this.f47278a.mo43662f().mo43908b(zzfv.f47522a, zzfv.mo44178a());
        if (b != 0) {
            this.f47278a.mo43662f();
            String a = C16922em.m55958a(zzfv.f47522a, 24, true);
            Object a2 = zzfv.mo44178a();
            this.f47278a.mo43662f().mo43903a(zzk.f47530a, b, "_ev", a, (a2 == null || (!(a2 instanceof String) && !(a2 instanceof CharSequence))) ? 0 : String.valueOf(a2).length());
            return;
        }
        this.f47278a.mo43662f();
        Object c2 = C16922em.m55970c(zzfv.f47522a, zzfv.mo44178a());
        if (c2 != null) {
            if (this.f47278a.f47009e.mo44071q(zzk.f47530a) && "_sno".equals(zzfv.f47522a)) {
                long j = 0;
                C16921el c3 = mo43864d().mo44103c(zzk.f47530a, "_sno");
                if (c3 == null || !(c3.f47319e instanceof Long)) {
                    C16881d a3 = mo43864d().mo44083a(zzk.f47530a, "_s");
                    if (a3 != null) {
                        j = a3.f47192c;
                        this.f47278a.mo43585q().f47495i.mo44161a("Backfill the session number. Last used session number", Long.valueOf(j));
                    }
                } else {
                    j = ((Long) c3.f47319e).longValue();
                }
                c2 = Long.valueOf(j + 1);
            }
            C16921el elVar = new C16921el(zzk.f47530a, zzfv.f47526e, zzfv.f47522a, zzfv.f47523b, c2);
            this.f47278a.mo43585q().f47494h.mo44162a("Setting user property", this.f47278a.mo43663g().mo44155c(elVar.f47317c), c2);
            mo43864d().mo44108e();
            try {
                m55866e(zzk);
                boolean a4 = mo43864d().mo44096a(elVar);
                mo43864d().mo44113u();
                if (a4) {
                    this.f47278a.mo43585q().f47494h.mo44162a("User property set", this.f47278a.mo43663g().mo44155c(elVar.f47317c), elVar.f47319e);
                } else {
                    this.f47278a.mo43585q().f47487a.mo44162a("Too many unique user properties are set. Ignoring user property", this.f47278a.mo43663g().mo44155c(elVar.f47317c), elVar.f47319e);
                    this.f47278a.mo43662f().mo43903a(zzk.f47530a, 9, (String) null, (String) null, 0);
                }
            } finally {
                mo43864d().mo44114v();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo43858b(zzfv zzfv, zzk zzk) {
        m55870u();
        mo43871j();
        if (TextUtils.isEmpty(zzk.f47531b) && TextUtils.isEmpty(zzk.f47547r)) {
            return;
        }
        if (!zzk.f47537h) {
            m55866e(zzk);
            return;
        }
        this.f47278a.mo43585q().f47494h.mo44161a("Removing user property", this.f47278a.mo43663g().mo44155c(zzfv.f47522a));
        mo43864d().mo44108e();
        try {
            m55866e(zzk);
            mo43864d().mo44101b(zzk.f47530a, zzfv.f47522a);
            mo43864d().mo44113u();
            this.f47278a.mo43585q().f47494h.mo44161a("User property removed", this.f47278a.mo43663g().mo44155c(zzfv.f47522a));
        } finally {
            mo43864d().mo44114v();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43847a(C16911ec ecVar) {
        this.f47292p++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo43874o() {
        this.f47293q++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo43863c(zzk zzk) {
        int i;
        C16924eo b;
        long j;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        boolean z;
        C16933ex d;
        String b2;
        zzk zzk2 = zzk;
        m55870u();
        mo43871j();
        C15267r.m44384a(zzk);
        C15267r.m44386a(zzk2.f47530a);
        if (!TextUtils.isEmpty(zzk2.f47531b) || !TextUtils.isEmpty(zzk2.f47547r)) {
            C16924eo b3 = mo43864d().mo44099b(zzk2.f47530a);
            if (b3 != null && TextUtils.isEmpty(b3.mo43941d()) && !TextUtils.isEmpty(zzk2.f47531b)) {
                b3.mo43951g(0);
                mo43864d().mo44091a(b3);
                m55867r().mo43636d(zzk2.f47530a);
            }
            if (!zzk2.f47537h) {
                m55866e(zzk);
                return;
            }
            long j2 = zzk2.f47542m;
            if (j2 == 0) {
                j2 = this.f47278a.mo43580l().mo38684a();
            }
            int i2 = zzk2.f47543n;
            if (i2 == 0 || i2 == 1) {
                i = i2;
            } else {
                this.f47278a.mo43585q().f47490d.mo44162a("Incorrect app type, assuming installed app. appId, appType", C16953r.m56340a(zzk2.f47530a), Integer.valueOf(i2));
                i = 0;
            }
            mo43864d().mo44108e();
            try {
                b = mo43864d().mo44099b(zzk2.f47530a);
                if (b != null) {
                    this.f47278a.mo43662f();
                    if (C16922em.m55965a(zzk2.f47531b, b.mo43941d(), zzk2.f47547r, b.mo43944e())) {
                        this.f47278a.mo43585q().f47490d.mo44161a("New GMP App Id passed in. Removing cached database data. appId", C16953r.m56340a(b.mo43933b()));
                        d = mo43864d();
                        b2 = b.mo43933b();
                        d.mo43843j();
                        d.mo43571c();
                        C15267r.m44386a(b2);
                        SQLiteDatabase w = d.mo44115w();
                        String[] strArr = {b2};
                        int delete = w.delete("events", "app_id=?", strArr) + 0 + w.delete("user_attributes", "app_id=?", strArr) + w.delete("conditional_properties", "app_id=?", strArr) + w.delete("apps", "app_id=?", strArr) + w.delete("raw_events", "app_id=?", strArr) + w.delete("raw_events_metadata", "app_id=?", strArr) + w.delete("event_filters", "app_id=?", strArr) + w.delete("property_filters", "app_id=?", strArr) + w.delete("audience_filter_values", "app_id=?", strArr);
                        if (delete > 0) {
                            d.mo43585q().f47495i.mo44162a("Deleted application data. app, records", b2, Integer.valueOf(delete));
                        }
                        b = null;
                    }
                }
            } catch (SQLiteException e) {
                d.mo43585q().f47487a.mo44162a("Error deleting application data. appId, error", C16953r.m56340a(b2), e);
            } catch (Throwable th) {
                mo43864d().mo44114v();
                throw th;
            }
            if (b != null) {
                if (b.mo43960k() != -2147483648L) {
                    if (b.mo43960k() != zzk2.f47539j) {
                        Bundle bundle = new Bundle();
                        bundle.putString("_pv", b.mo43958j());
                        zzag zzag = new zzag("_au", new zzad(bundle), "auto", j2);
                        mo43848a(zzag, zzk2);
                    }
                } else if (b.mo43958j() != null && !b.mo43958j().equals(zzk2.f47532c)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_pv", b.mo43958j());
                    zzag zzag2 = new zzag("_au", new zzad(bundle2), "auto", j2);
                    mo43848a(zzag2, zzk2);
                }
            }
            m55866e(zzk);
            C16881d dVar = i == 0 ? mo43864d().mo44083a(zzk2.f47530a, "_f") : i == 1 ? mo43864d().mo44083a(zzk2.f47530a, "_v") : null;
            if (dVar == null) {
                long j3 = ((j2 / 3600000) + 1) * 3600000;
                if (i == 0) {
                    j = 1;
                    zzfv zzfv = new zzfv("_fot", j2, Long.valueOf(j3), "auto");
                    mo43850a(zzfv, zzk2);
                    if (this.f47278a.f47009e.mo44068n(zzk2.f47531b)) {
                        m55870u();
                        this.f47278a.f47012h.mo43621a(zzk2.f47530a);
                    }
                    m55870u();
                    mo43871j();
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("_c", 1);
                    bundle3.putLong("_r", 1);
                    bundle3.putLong("_uwa", 0);
                    bundle3.putLong("_pfo", 0);
                    bundle3.putLong("_sys", 0);
                    bundle3.putLong("_sysu", 0);
                    if (this.f47278a.f47009e.mo44074t(zzk2.f47530a)) {
                        bundle3.putLong("_et", 1);
                    }
                    if (this.f47278a.f47009e.mo44064j(zzk2.f47530a) && zzk2.f47546q) {
                        bundle3.putLong("_dac", 1);
                    }
                    if (this.f47278a.mo43581m().getPackageManager() == null) {
                        this.f47278a.mo43585q().f47487a.mo44161a("PackageManager is null, first open report might be inaccurate. appId", C16953r.m56340a(zzk2.f47530a));
                    } else {
                        try {
                            packageInfo = C15176d.m44159a(this.f47278a.mo43581m()).mo38467b(zzk2.f47530a, 0);
                        } catch (NameNotFoundException e2) {
                            this.f47278a.mo43585q().f47487a.mo44162a("Package info is null, first open report might be inaccurate. appId", C16953r.m56340a(zzk2.f47530a), e2);
                            packageInfo = null;
                        }
                        if (!(packageInfo == null || packageInfo.firstInstallTime == 0)) {
                            if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                bundle3.putLong("_uwa", 1);
                                z = false;
                            } else {
                                z = true;
                            }
                            zzfv zzfv2 = r7;
                            zzfv zzfv3 = new zzfv("_fi", j2, Long.valueOf(z ? 1 : 0), "auto");
                            mo43850a(zzfv2, zzk2);
                        }
                        try {
                            applicationInfo = C15176d.m44159a(this.f47278a.mo43581m()).mo38462a(zzk2.f47530a, 0);
                        } catch (NameNotFoundException e3) {
                            this.f47278a.mo43585q().f47487a.mo44162a("Application info is null, first open report might be inaccurate. appId", C16953r.m56340a(zzk2.f47530a), e3);
                            applicationInfo = null;
                        }
                        if (applicationInfo != null) {
                            if ((applicationInfo.flags & 1) != 0) {
                                bundle3.putLong("_sys", 1);
                            }
                            if ((applicationInfo.flags & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
                                bundle3.putLong("_sysu", 1);
                            }
                        }
                    }
                    C16933ex d2 = mo43864d();
                    String str = zzk2.f47530a;
                    C15267r.m44386a(str);
                    d2.mo43571c();
                    d2.mo43843j();
                    long h = d2.mo44112h(str, "first_open_count");
                    if (h >= 0) {
                        bundle3.putLong("_pfo", h);
                    }
                    zzag zzag3 = new zzag("_f", new zzad(bundle3), "auto", j2);
                    mo43848a(zzag3, zzk2);
                } else {
                    j = 1;
                    if (i == 1) {
                        zzfv zzfv4 = new zzfv("_fvt", j2, Long.valueOf(j3), "auto");
                        mo43850a(zzfv4, zzk2);
                        m55870u();
                        mo43871j();
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("_c", 1);
                        bundle4.putLong("_r", 1);
                        if (this.f47278a.f47009e.mo44074t(zzk2.f47530a)) {
                            bundle4.putLong("_et", 1);
                        }
                        if (this.f47278a.f47009e.mo44064j(zzk2.f47530a) && zzk2.f47546q) {
                            bundle4.putLong("_dac", 1);
                        }
                        zzag zzag4 = new zzag("_v", new zzad(bundle4), "auto", j2);
                        mo43848a(zzag4, zzk2);
                    }
                }
                if (!this.f47278a.f47009e.mo44054d(zzk2.f47530a, C16942h.f47422ao)) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putLong("_et", j);
                    if (this.f47278a.f47009e.mo44074t(zzk2.f47530a)) {
                        bundle5.putLong("_fr", j);
                    }
                    zzag zzag5 = new zzag("_e", new zzad(bundle5), "auto", j2);
                    mo43848a(zzag5, zzk2);
                }
            } else if (zzk2.f47538i) {
                zzag zzag6 = new zzag("_cd", new zzad(new Bundle()), "auto", j2);
                mo43848a(zzag6, zzk2);
            }
            mo43864d().mo44113u();
            mo43864d().mo44114v();
        }
    }

    /* renamed from: a */
    private final zzk m55853a(String str) {
        String str2 = str;
        C16924eo b = mo43864d().mo44099b(str2);
        if (b == null || TextUtils.isEmpty(b.mo43958j())) {
            this.f47278a.mo43585q().f47494h.mo44161a("No app data available; dropping", str2);
            return null;
        }
        Boolean b2 = m55863b(b);
        if (b2 == null || b2.booleanValue()) {
            C16924eo eoVar = b;
            zzk zzk = new zzk(str, b.mo43941d(), b.mo43958j(), b.mo43960k(), b.mo43962l(), b.mo43964m(), b.mo43966n(), (String) null, b.mo43969o(), false, b.mo43950g(), eoVar.mo43926B(), 0, 0, eoVar.mo43927C(), eoVar.mo43928D(), false, eoVar.mo43944e());
            return zzk;
        }
        this.f47278a.mo43585q().f47487a.mo44161a("App version does not match; dropping. appId", C16953r.m56340a(str));
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43852a(zzo zzo) {
        zzk a = m55853a(zzo.f47548a);
        if (a != null) {
            mo43853a(zzo, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43853a(zzo zzo, zzk zzk) {
        C15267r.m44384a(zzo);
        C15267r.m44386a(zzo.f47548a);
        C15267r.m44384a(zzo.f47549b);
        C15267r.m44384a(zzo.f47550c);
        C15267r.m44386a(zzo.f47550c.f47522a);
        m55870u();
        mo43871j();
        if (TextUtils.isEmpty(zzk.f47531b) && TextUtils.isEmpty(zzk.f47547r)) {
            return;
        }
        if (!zzk.f47537h) {
            m55866e(zzk);
            return;
        }
        zzo zzo2 = new zzo(zzo);
        boolean z = false;
        zzo2.f47552e = false;
        mo43864d().mo44108e();
        try {
            zzo d = mo43864d().mo44104d(zzo2.f47548a, zzo2.f47550c.f47522a);
            if (d != null && !d.f47549b.equals(zzo2.f47549b)) {
                this.f47278a.mo43585q().f47490d.mo44163a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f47278a.mo43663g().mo44155c(zzo2.f47550c.f47522a), zzo2.f47549b, d.f47549b);
            }
            if (d != null && d.f47552e) {
                zzo2.f47549b = d.f47549b;
                zzo2.f47551d = d.f47551d;
                zzo2.f47555h = d.f47555h;
                zzo2.f47553f = d.f47553f;
                zzo2.f47556i = d.f47556i;
                zzo2.f47552e = d.f47552e;
                zzfv zzfv = new zzfv(zzo2.f47550c.f47522a, d.f47550c.f47523b, zzo2.f47550c.mo44178a(), d.f47550c.f47526e);
                zzo2.f47550c = zzfv;
            } else if (TextUtils.isEmpty(zzo2.f47553f)) {
                zzfv zzfv2 = new zzfv(zzo2.f47550c.f47522a, zzo2.f47551d, zzo2.f47550c.mo44178a(), zzo2.f47550c.f47526e);
                zzo2.f47550c = zzfv2;
                zzo2.f47552e = true;
                z = true;
            }
            if (zzo2.f47552e) {
                zzfv zzfv3 = zzo2.f47550c;
                C16921el elVar = new C16921el(zzo2.f47548a, zzo2.f47549b, zzfv3.f47522a, zzfv3.f47523b, zzfv3.mo44178a());
                if (mo43864d().mo44096a(elVar)) {
                    this.f47278a.mo43585q().f47494h.mo44163a("User property updated immediately", zzo2.f47548a, this.f47278a.mo43663g().mo44155c(elVar.f47317c), elVar.f47319e);
                } else {
                    this.f47278a.mo43585q().f47487a.mo44163a("(2)Too many active user properties, ignoring", C16953r.m56340a(zzo2.f47548a), this.f47278a.mo43663g().mo44155c(elVar.f47317c), elVar.f47319e);
                }
                if (z && zzo2.f47556i != null) {
                    m55865b(new zzag(zzo2.f47556i, zzo2.f47551d), zzk);
                }
            }
            if (mo43864d().mo44097a(zzo2)) {
                this.f47278a.mo43585q().f47494h.mo44163a("Conditional property added", zzo2.f47548a, this.f47278a.mo43663g().mo44155c(zzo2.f47550c.f47522a), zzo2.f47550c.mo44178a());
            } else {
                this.f47278a.mo43585q().f47487a.mo44163a("Too many conditional properties, ignoring", C16953r.m56340a(zzo2.f47548a), this.f47278a.mo43663g().mo44155c(zzo2.f47550c.f47522a), zzo2.f47550c.mo44178a());
            }
            mo43864d().mo44113u();
        } finally {
            mo43864d().mo44114v();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo43860b(zzo zzo) {
        zzk a = m55853a(zzo.f47548a);
        if (a != null) {
            mo43861b(zzo, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo43861b(zzo zzo, zzk zzk) {
        C15267r.m44384a(zzo);
        C15267r.m44386a(zzo.f47548a);
        C15267r.m44384a(zzo.f47550c);
        C15267r.m44386a(zzo.f47550c.f47522a);
        m55870u();
        mo43871j();
        if (TextUtils.isEmpty(zzk.f47531b) && TextUtils.isEmpty(zzk.f47547r)) {
            return;
        }
        if (!zzk.f47537h) {
            m55866e(zzk);
            return;
        }
        mo43864d().mo44108e();
        try {
            m55866e(zzk);
            zzo d = mo43864d().mo44104d(zzo.f47548a, zzo.f47550c.f47522a);
            if (d != null) {
                this.f47278a.mo43585q().f47494h.mo44162a("Removing conditional user property", zzo.f47548a, this.f47278a.mo43663g().mo44155c(zzo.f47550c.f47522a));
                mo43864d().mo44106e(zzo.f47548a, zzo.f47550c.f47522a);
                if (d.f47552e) {
                    mo43864d().mo44101b(zzo.f47548a, zzo.f47550c.f47522a);
                }
                if (zzo.f47558k != null) {
                    Bundle bundle = null;
                    if (zzo.f47558k.f47519b != null) {
                        bundle = zzo.f47558k.f47519b.mo44169b();
                    }
                    Bundle bundle2 = bundle;
                    m55865b(this.f47278a.mo43662f().mo43899a(zzo.f47548a, zzo.f47558k.f47518a, bundle2, d.f47549b, zzo.f47558k.f47521d, true, false), zzk);
                }
            } else {
                this.f47278a.mo43585q().f47490d.mo44162a("Conditional user property doesn't exist", C16953r.m56340a(zzo.f47548a), this.f47278a.mo43663g().mo44155c(zzo.f47550c.f47522a));
            }
            mo43864d().mo44113u();
        } finally {
            mo43864d().mo44114v();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C16924eo m55866e(com.google.android.gms.measurement.internal.zzk r9) {
        /*
            r8 = this;
            r8.m55870u()
            r8.mo43871j()
            com.google.android.gms.common.internal.C15267r.m44384a(r9)
            java.lang.String r0 = r9.f47530a
            com.google.android.gms.common.internal.C15267r.m44386a(r0)
            com.google.android.gms.measurement.internal.ex r0 = r8.mo43864d()
            java.lang.String r1 = r9.f47530a
            com.google.android.gms.measurement.internal.eo r0 = r0.mo44099b(r1)
            com.google.android.gms.measurement.internal.ay r1 = r8.f47278a
            com.google.android.gms.measurement.internal.af r1 = r1.mo43658b()
            java.lang.String r2 = r9.f47530a
            java.lang.String r1 = r1.mo43597b(r2)
            r2 = 1
            if (r0 != 0) goto L_0x0042
            com.google.android.gms.measurement.internal.eo r0 = new com.google.android.gms.measurement.internal.eo
            com.google.android.gms.measurement.internal.ay r3 = r8.f47278a
            java.lang.String r4 = r9.f47530a
            r0.<init>(r3, r4)
            com.google.android.gms.measurement.internal.ay r3 = r8.f47278a
            com.google.android.gms.measurement.internal.em r3 = r3.mo43662f()
            java.lang.String r3 = r3.mo43916j()
            r0.mo43931a(r3)
            r0.mo43943d(r1)
        L_0x0040:
            r1 = 1
            goto L_0x005e
        L_0x0042:
            java.lang.String r3 = r0.mo43947f()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005d
            r0.mo43943d(r1)
            com.google.android.gms.measurement.internal.ay r1 = r8.f47278a
            com.google.android.gms.measurement.internal.em r1 = r1.mo43662f()
            java.lang.String r1 = r1.mo43916j()
            r0.mo43931a(r1)
            goto L_0x0040
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.lang.String r3 = r9.f47531b
            java.lang.String r4 = r0.mo43941d()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0070
            java.lang.String r1 = r9.f47531b
            r0.mo43935b(r1)
            r1 = 1
        L_0x0070:
            java.lang.String r3 = r9.f47547r
            java.lang.String r4 = r0.mo43944e()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0082
            java.lang.String r1 = r9.f47547r
            r0.mo43939c(r1)
            r1 = 1
        L_0x0082:
            java.lang.String r3 = r9.f47540k
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = r9.f47540k
            java.lang.String r4 = r0.mo43950g()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x009c
            java.lang.String r1 = r9.f47540k
            r0.mo43946e(r1)
            r1 = 1
        L_0x009c:
            long r3 = r9.f47534e
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            long r3 = r9.f47534e
            long r5 = r0.mo43964m()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            long r3 = r9.f47534e
            r0.mo43942d(r3)
            r1 = 1
        L_0x00b4:
            java.lang.String r3 = r9.f47532c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r3 = r9.f47532c
            java.lang.String r4 = r0.mo43958j()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r1 = r9.f47532c
            r0.mo43949f(r1)
            r1 = 1
        L_0x00ce:
            long r3 = r9.f47539j
            long r5 = r0.mo43960k()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00de
            long r3 = r9.f47539j
            r0.mo43938c(r3)
            r1 = 1
        L_0x00de:
            java.lang.String r3 = r9.f47533d
            if (r3 == 0) goto L_0x00f4
            java.lang.String r3 = r9.f47533d
            java.lang.String r4 = r0.mo43962l()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00f4
            java.lang.String r1 = r9.f47533d
            r0.mo43952g(r1)
            r1 = 1
        L_0x00f4:
            long r3 = r9.f47535f
            long r5 = r0.mo43966n()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0104
            long r3 = r9.f47535f
            r0.mo43945e(r3)
            r1 = 1
        L_0x0104:
            boolean r3 = r9.f47537h
            boolean r4 = r0.mo43969o()
            if (r3 == r4) goto L_0x0112
            boolean r1 = r9.f47537h
            r0.mo43932a(r1)
            r1 = 1
        L_0x0112:
            java.lang.String r3 = r9.f47536g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x012c
            java.lang.String r3 = r9.f47536g
            java.lang.String r4 = r0.mo43980z()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012c
            java.lang.String r1 = r9.f47536g
            r0.mo43955h(r1)
            r1 = 1
        L_0x012c:
            long r3 = r9.f47541l
            long r5 = r0.mo43926B()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x013c
            long r3 = r9.f47541l
            r0.mo43968o(r3)
            r1 = 1
        L_0x013c:
            boolean r3 = r9.f47544o
            boolean r4 = r0.mo43927C()
            if (r3 == r4) goto L_0x014a
            boolean r1 = r9.f47544o
            r0.mo43936b(r1)
            r1 = 1
        L_0x014a:
            boolean r3 = r9.f47545p
            boolean r4 = r0.mo43928D()
            if (r3 == r4) goto L_0x0158
            boolean r9 = r9.f47545p
            r0.mo43940c(r9)
            r1 = 1
        L_0x0158:
            if (r1 == 0) goto L_0x0161
            com.google.android.gms.measurement.internal.ex r9 = r8.mo43864d()
            r9.mo44091a(r0)
        L_0x0161:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16912ed.m55866e(com.google.android.gms.measurement.internal.zzk):com.google.android.gms.measurement.internal.eo");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo43865d(zzk zzk) {
        try {
            return (String) this.f47278a.mo43584p().mo43644a((Callable<V>) new C16917eh<V>(this, zzk)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f47278a.mo43585q().f47487a.mo44162a("Failed to get app instance id. appId", C16953r.m56340a(zzk.f47530a), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43856a(boolean z) {
        m55873x();
    }
}
