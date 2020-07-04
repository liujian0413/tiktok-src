package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.analytics.C14919a;
import com.google.android.gms.analytics.C14933l;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.common.util.C15325h;

/* renamed from: com.google.android.gms.internal.measurement.t */
public class C16697t {

    /* renamed from: g */
    private static volatile C16697t f46638g;

    /* renamed from: a */
    public final Context f46639a;

    /* renamed from: b */
    public final Context f46640b;

    /* renamed from: c */
    public final C15322e f46641c = C15325h.m44574d();

    /* renamed from: d */
    public final C16398ar f46642d = new C16398ar(this);

    /* renamed from: e */
    public final C16416bi f46643e;

    /* renamed from: f */
    public final C16402av f46644f;

    /* renamed from: h */
    private final C14933l f46645h;

    /* renamed from: i */
    private final C16689l f46646i;

    /* renamed from: j */
    private final C16403aw f46647j;

    /* renamed from: k */
    private final C16433bz f46648k;

    /* renamed from: l */
    private final C16421bn f46649l;

    /* renamed from: m */
    private final C14919a f46650m;

    /* renamed from: n */
    private final C16391ak f46651n;

    /* renamed from: o */
    private final C16663k f46652o;

    /* renamed from: p */
    private final C16385ae f46653p;

    private C16697t(C16699v vVar) {
        Context context = vVar.f46655a;
        C15267r.m44385a(context, (Object) "Application context can't be null");
        Context context2 = vVar.f46656b;
        C15267r.m44384a(context2);
        this.f46639a = context;
        this.f46640b = context2;
        C16416bi biVar = new C16416bi(this);
        biVar.mo43215t();
        this.f46643e = biVar;
        C16416bi a = mo43216a();
        String str = C16696s.f46636a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 134);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        a.mo43197d(sb.toString());
        C16421bn bnVar = new C16421bn(this);
        bnVar.mo43215t();
        this.f46649l = bnVar;
        C16433bz bzVar = new C16433bz(this);
        bzVar.mo43215t();
        this.f46648k = bzVar;
        C16689l lVar = new C16689l(this, vVar);
        C16391ak akVar = new C16391ak(this);
        C16663k kVar = new C16663k(this);
        C16385ae aeVar = new C16385ae(this);
        C16402av avVar = new C16402av(this);
        C14933l a2 = C14933l.m43377a(context);
        a2.f38618b = new C16698u(this);
        this.f46645h = a2;
        C14919a aVar = new C14919a(this);
        akVar.mo43215t();
        this.f46651n = akVar;
        kVar.mo43215t();
        this.f46652o = kVar;
        aeVar.mo43215t();
        this.f46653p = aeVar;
        avVar.mo43215t();
        this.f46644f = avVar;
        C16403aw awVar = new C16403aw(this);
        awVar.mo43215t();
        this.f46647j = awVar;
        lVar.mo43215t();
        this.f46646i = lVar;
        aVar.mo37974a();
        this.f46650m = aVar;
        lVar.mo43178b();
    }

    /* renamed from: a */
    public static C16697t m54864a(Context context) {
        C15267r.m44384a(context);
        if (f46638g == null) {
            synchronized (C16697t.class) {
                if (f46638g == null) {
                    C15322e d = C15325h.m44574d();
                    long b = d.mo38685b();
                    C16697t tVar = new C16697t(new C16699v(context));
                    f46638g = tVar;
                    C14919a.m43333c();
                    long b2 = d.mo38685b() - b;
                    long longValue = ((Long) C16406az.f45904E.f45945a).longValue();
                    if (b2 > longValue) {
                        tVar.mo43216a().mo43196c("Slow initialization (ms)", Long.valueOf(b2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return f46638g;
    }

    /* renamed from: a */
    public final C16416bi mo43216a() {
        m54865a((C16695r) this.f46643e);
        return this.f46643e;
    }

    /* renamed from: b */
    public final C14933l mo43217b() {
        C15267r.m44384a(this.f46645h);
        return this.f46645h;
    }

    /* renamed from: c */
    public final C16689l mo43218c() {
        m54865a((C16695r) this.f46646i);
        return this.f46646i;
    }

    /* renamed from: d */
    public final C16403aw mo43219d() {
        m54865a((C16695r) this.f46647j);
        return this.f46647j;
    }

    /* renamed from: e */
    public final C14919a mo43220e() {
        C15267r.m44384a(this.f46650m);
        C15267r.m44395b(this.f46650m.mo37975b(), "Analytics instance not initialized");
        return this.f46650m;
    }

    /* renamed from: f */
    public final C16433bz mo43221f() {
        m54865a((C16695r) this.f46648k);
        return this.f46648k;
    }

    /* renamed from: g */
    public final C16421bn mo43222g() {
        m54865a((C16695r) this.f46649l);
        return this.f46649l;
    }

    /* renamed from: h */
    public final C16421bn mo43223h() {
        if (this.f46649l == null || !this.f46649l.mo43213r()) {
            return null;
        }
        return this.f46649l;
    }

    /* renamed from: i */
    public final C16663k mo43224i() {
        m54865a((C16695r) this.f46652o);
        return this.f46652o;
    }

    /* renamed from: j */
    public final C16391ak mo43225j() {
        m54865a((C16695r) this.f46651n);
        return this.f46651n;
    }

    /* renamed from: k */
    public final C16385ae mo43226k() {
        m54865a((C16695r) this.f46653p);
        return this.f46653p;
    }

    /* renamed from: a */
    private static void m54865a(C16695r rVar) {
        C15267r.m44385a(rVar, (Object) "Analytics service not created/initialized");
        C15267r.m44395b(rVar.mo43213r(), "Analytics service not initialized");
    }
}
