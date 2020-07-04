package com.p280ss.android.ugc.aweme.feed.monitor;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.feed.monitor.a */
public final class C28539a {

    /* renamed from: c */
    public static final String f75168c = f75168c;

    /* renamed from: d */
    public static final String f75169d = f75169d;

    /* renamed from: e */
    public static final String f75170e = f75170e;

    /* renamed from: f */
    public static final String f75171f = f75171f;

    /* renamed from: g */
    public static final boolean f75172g = C6384b.m19835a().mo15292a(JankOpenAB.class, true, "fps_jank_open", C6384b.m19835a().mo15295d().fps_jank_open, true);

    /* renamed from: h */
    public static final int f75173h;

    /* renamed from: i */
    public static final long f75174i;

    /* renamed from: j */
    public static Printer f75175j = null;

    /* renamed from: k */
    public static final int f75176k = f75176k;

    /* renamed from: l */
    public static long f75177l;

    /* renamed from: m */
    public static long f75178m;

    /* renamed from: n */
    public static final C7541d f75179n = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, C28541b.f75185a);

    /* renamed from: o */
    public static final C28540a f75180o = new C28540a(null);

    /* renamed from: p */
    private static final C28542c f75181p = new C28542c();

    /* renamed from: a */
    public boolean f75182a;

    /* renamed from: b */
    public boolean f75183b;

    /* renamed from: com.ss.android.ugc.aweme.feed.monitor.a$a */
    public static final class C28540a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f75184a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C28540a.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/feed/monitor/JankDataManager;"))};

        private C28540a() {
        }

        /* renamed from: a */
        public static long m93746a() {
            return C28539a.f75174i;
        }

        /* renamed from: b */
        public static C28539a m93747b() {
            return (C28539a) C28539a.f75179n.getValue();
        }

        public /* synthetic */ C28540a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.monitor.a$b */
    static final class C28541b extends Lambda implements C7561a<C28539a> {

        /* renamed from: a */
        public static final C28541b f75185a = new C28541b();

        C28541b() {
            super(0);
        }

        /* renamed from: a */
        private static C28539a m93748a() {
            return new C28539a(null);
        }

        public final /* synthetic */ Object invoke() {
            return m93748a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.monitor.a$c */
    public static final class C28542c implements Printer {

        /* renamed from: a */
        private long f75186a;

        C28542c() {
        }

        public final void println(String str) {
            C7573i.m23587b(str, "x");
            if (!TextUtils.isEmpty(str) && C28540a.m93747b().f75182a) {
                if (C7634n.m23721b(str, C28539a.f75169d, false)) {
                    this.f75186a = System.nanoTime();
                }
                if (C7634n.m23721b(str, C28539a.f75170e, false)) {
                    long nanoTime = (System.nanoTime() - this.f75186a) / ((long) C28539a.f75176k);
                    if (nanoTime > C28540a.m93746a()) {
                        C28539a.f75178m += nanoTime;
                        C28539a.f75177l++;
                    }
                }
                if (C28539a.f75175j != null && (!C7573i.m23585a((Object) C28539a.f75175j, (Object) this))) {
                    Printer printer = C28539a.f75175j;
                    if (printer == null) {
                        C7573i.m23580a();
                    }
                    printer.println(str);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.monitor.a$d */
    static final class C28543d<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f75187a;

        /* renamed from: b */
        final /* synthetic */ String f75188b;

        C28543d(String str, String str2) {
            this.f75187a = str;
            this.f75188b = str2;
        }

        public final /* synthetic */ Object call() {
            m93749a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m93749a() {
            C6907h.m21525a("ui_sample_report_first", new C6909j().mo16966a("ui_block_times", this.f75187a).mo16966a("ui_block_duration", this.f75188b).mo16967a());
        }
    }

    private C28539a() {
    }

    /* renamed from: c */
    private static Printer m93743c() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            C7573i.m23582a((Object) declaredField, "printerField");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj != null) {
                return (Printer) obj;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.util.Printer");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo73252a() {
        if (f75172g && !this.f75182a && !this.f75183b) {
            this.f75182a = true;
            if (true ^ C7573i.m23585a((Object) f75175j, (Object) m93743c())) {
                f75175j = m93743c();
            }
            Looper.getMainLooper().setMessageLogging(f75181p);
        }
    }

    static {
        int i;
        int a = C6384b.m19835a().mo15287a(JankSampleAB.class, true, "fps_jank_interval", C6384b.m19835a().mo15295d().fps_jank_interval, 0);
        f75173h = a;
        if (a > 0) {
            i = f75173h * 20;
        } else {
            i = 100;
        }
        f75174i = (long) i;
    }

    /* renamed from: b */
    public final void mo73253b() {
        if (f75172g && this.f75182a) {
            this.f75183b = true;
            this.f75182a = false;
            C1592h.m7855a((Callable<TResult>) new C28543d<TResult>(String.valueOf(f75177l), String.valueOf(f75178m)), (Executor) C6907h.m21516a());
            f75178m = 0;
            f75177l = 0;
            if (m93743c() == f75181p) {
                Looper.getMainLooper().setMessageLogging(f75175j);
            }
        }
    }

    public /* synthetic */ C28539a(C7571f fVar) {
        this();
    }
}
