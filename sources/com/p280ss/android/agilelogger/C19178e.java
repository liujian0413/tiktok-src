package com.p280ss.android.agilelogger;

import android.os.Looper;
import com.p280ss.android.agilelogger.ALog.C6728b;
import com.p280ss.android.agilelogger.utils.FormatUtils.TYPE;

/* renamed from: com.ss.android.agilelogger.e */
public final class C19178e {

    /* renamed from: o */
    private static C19178e f51841o;

    /* renamed from: p */
    private static C19178e f51842p;

    /* renamed from: q */
    private static int f51843q;

    /* renamed from: r */
    private static int f51844r;

    /* renamed from: s */
    private static final Object f51845s = new Object();

    /* renamed from: a */
    public int f51846a = -1;

    /* renamed from: b */
    public int f51847b;

    /* renamed from: c */
    public String f51848c;

    /* renamed from: d */
    public String f51849d;

    /* renamed from: e */
    public long f51850e;

    /* renamed from: f */
    public boolean f51851f;

    /* renamed from: g */
    public TYPE f51852g;

    /* renamed from: h */
    public Object f51853h;

    /* renamed from: i */
    public Object f51854i;

    /* renamed from: j */
    public String f51855j;

    /* renamed from: k */
    public String f51856k;

    /* renamed from: l */
    public String f51857l;

    /* renamed from: m */
    public C6728b f51858m;

    /* renamed from: n */
    private C19178e f51859n;

    /* renamed from: a */
    public static C19178e m62882a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (f51845s) {
                if (f51841o != null) {
                    C19178e eVar = f51841o;
                    f51841o = eVar.f51859n;
                    eVar.f51859n = null;
                    f51843q--;
                    return eVar;
                }
            }
        } else if (f51842p != null) {
            C19178e eVar2 = f51842p;
            f51842p = eVar2.f51859n;
            eVar2.f51859n = null;
            f51844r--;
            return eVar2;
        }
        return new C19178e();
    }

    /* renamed from: b */
    public final void mo50909b() {
        this.f51847b = 0;
        this.f51848c = "";
        this.f51849d = "";
        this.f51852g = TYPE.MSG;
        this.f51850e = -1;
        this.f51851f = false;
        this.f51853h = null;
        this.f51854i = null;
        this.f51858m = null;
        this.f51855j = "";
        this.f51856k = "";
        this.f51857l = "";
        if (Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (f51845s) {
                if (f51843q < 60) {
                    this.f51859n = f51841o;
                    f51841o = this;
                    f51843q++;
                }
            }
        } else if (f51844r < 60) {
            this.f51859n = f51842p;
            f51842p = this;
            f51844r++;
        }
    }

    /* renamed from: a */
    public static C19178e m62883a(int i, String str, String str2, long j, boolean z) {
        C19178e a = m62882a();
        a.f51847b = i;
        a.f51848c = str;
        a.f51849d = str2;
        a.f51850e = j;
        a.f51851f = z;
        return a;
    }
}
