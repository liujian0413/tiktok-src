package com.p280ss.android.agilelogger.p839c;

import android.content.Context;
import android.os.Environment;
import android.os.Process;
import com.C1642a;
import com.p280ss.android.agilelogger.ALog.MMAP_STATE;
import com.p280ss.android.agilelogger.AgileDelegate;
import com.p280ss.android.agilelogger.C19178e;
import com.p280ss.android.agilelogger.C19179f;
import com.p280ss.android.agilelogger.p837a.C19162a;
import com.p280ss.android.agilelogger.p838b.C19166a;
import com.p280ss.android.agilelogger.utils.C19203g;
import com.p280ss.android.agilelogger.utils.C19210n;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.agilelogger.c.a */
public final class C19169a extends C19171b {

    /* renamed from: e */
    private final Context f51820e;

    /* renamed from: f */
    private final int f51821f;

    /* renamed from: g */
    private AgileDelegate f51822g;

    /* renamed from: com.ss.android.agilelogger.c.a$a */
    public static class C19170a {

        /* renamed from: a */
        public Context f51823a;

        /* renamed from: b */
        public String f51824b;

        /* renamed from: c */
        public String f51825c;

        /* renamed from: d */
        public int f51826d;

        /* renamed from: e */
        public int f51827e = 2;

        /* renamed from: f */
        public List<C19166a> f51828f;

        /* renamed from: g */
        public boolean f51829g;

        /* renamed from: h */
        public boolean f51830h;

        /* renamed from: i */
        public int f51831i = 3;

        /* renamed from: j */
        public int f51832j = C19162a.f51807c;

        /* renamed from: a */
        public final C19169a mo50893a() {
            if (this.f51825c != null) {
                if (this.f51824b == null) {
                    this.f51824b = m62852a(this.f51823a);
                }
                if (this.f51826d == 0) {
                    this.f51826d = VideoPreloadSizeExperiment.DEFAULT;
                }
                return new C19169a(this);
            }
            throw new IllegalArgumentException("log path cannot be null!");
        }

        /* renamed from: a */
        public final C19170a mo50890a(int i) {
            this.f51826d = i;
            return this;
        }

        /* renamed from: b */
        public final C19170a mo50894b(int i) {
            this.f51827e = i;
            return this;
        }

        /* renamed from: a */
        public final C19170a mo50891a(String str) {
            this.f51824b = str;
            return this;
        }

        /* renamed from: b */
        public final C19170a mo50895b(String str) {
            this.f51825c = str;
            return this;
        }

        /* renamed from: c */
        public final C19170a mo50897c(int i) {
            if (i <= 0) {
                i = 3;
            }
            this.f51831i = i;
            return this;
        }

        /* renamed from: d */
        public final C19170a mo50898d(int i) {
            if (i < 0) {
                i = C19162a.f51807c;
            }
            this.f51832j = i;
            return this;
        }

        public C19170a(Context context) {
            this.f51823a = context;
        }

        /* renamed from: a */
        public final C19170a mo50892a(boolean z) {
            this.f51829g = z;
            return this;
        }

        /* renamed from: b */
        public final C19170a mo50896b(boolean z) {
            this.f51830h = z;
            return this;
        }

        /* renamed from: a */
        private static String m62852a(Context context) {
            File file;
            if (!Environment.getExternalStorageState().equals("mounted") || context.getExternalFilesDir("alog") == null) {
                file = new File(context.getFilesDir(), "alog");
            } else {
                file = context.getExternalFilesDir("alog");
            }
            if (file != null && !file.exists()) {
                file.mkdirs();
            }
            return new File(file, ".alog").getAbsolutePath();
        }
    }

    /* renamed from: c */
    public final long mo50886c() {
        return this.f51822g.mo50869d();
    }

    /* renamed from: d */
    public final long mo50887d() {
        return this.f51822g.mo50870e();
    }

    /* renamed from: e */
    public final long mo50888e() {
        return this.f51822g.mo50871f();
    }

    /* renamed from: a */
    public final void mo50882a() {
        super.mo50882a();
        this.f51822g.mo50864a();
    }

    /* renamed from: b */
    public final void mo50885b() {
        super.mo50885b();
        this.f51822g.mo50867b();
    }

    /* renamed from: f */
    public final MMAP_STATE mo50889f() {
        if (this.f51822g != null) {
            return this.f51822g.mo50868c();
        }
        return MMAP_STATE.NOT_INIT;
    }

    /* renamed from: a */
    public final void mo50884a(boolean z) {
        this.f51822g.mo50866a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50883a(C19178e eVar) {
        this.f51822g.mo50865a(m62843c(eVar));
    }

    public C19169a(C19170a aVar) {
        this.f51820e = aVar.f51823a;
        this.f51821f = aVar.f51831i;
        AgileDelegate agileDelegate = new AgileDelegate(aVar.f51824b, aVar.f51826d, aVar.f51825c, C19203g.m62935a(this.f51820e), C19210n.m62946a(this.f51820e), aVar.f51829g, aVar.f51830h, aVar.f51831i, aVar.f51832j);
        this.f51822g = agileDelegate;
        this.f51835c = aVar.f51826d;
        mo50899a(aVar.f51827e);
        mo50900a(aVar.f51828f);
    }

    /* renamed from: c */
    private String m62843c(C19178e eVar) {
        String str;
        String str2;
        String str3;
        C19178e eVar2 = eVar;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            str = this.f51836d.format(Long.valueOf(currentTimeMillis));
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Locale locale = Locale.ENGLISH;
            String str4 = "[%s][%d:%d%s][%s][%s][%s, %s, %s]%s\n";
            Object[] objArr = new Object[10];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(Process.myPid());
            objArr[2] = Long.valueOf(eVar2.f51850e);
            if (eVar2.f51851f) {
                str3 = "*";
            } else {
                str3 = "";
            }
            objArr[3] = str3;
            objArr[4] = C19179f.m62885a(eVar2.f51847b);
            objArr[5] = eVar2.f51848c;
            objArr[6] = eVar2.f51855j;
            objArr[7] = eVar2.f51856k;
            objArr[8] = eVar2.f51857l;
            objArr[9] = eVar2.f51849d;
            return C1642a.m8035a(locale, str4, objArr);
        }
        long j = currentTimeMillis % 1000;
        long j2 = currentTimeMillis / 1000;
        long j3 = j2 % 60;
        long j4 = j2 / 60;
        long j5 = j4 % 60;
        long j6 = (j4 / 60) % 24;
        StringBuilder sb = new StringBuilder("2099-09-09 GMT+00:00 ");
        sb.append(j6);
        sb.append(":");
        sb.append(j5);
        sb.append(":");
        sb.append(j3);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(j);
        String sb2 = sb.toString();
        Locale locale2 = Locale.ENGLISH;
        String str5 = "[%s][%d:%d%s][%s][%s][%s, %s, %s]%s\n";
        Object[] objArr2 = new Object[10];
        objArr2[0] = sb2;
        objArr2[1] = Integer.valueOf(Process.myPid());
        objArr2[2] = Long.valueOf(eVar2.f51850e);
        if (eVar2.f51851f) {
            str2 = "*";
        } else {
            str2 = "";
        }
        objArr2[3] = str2;
        objArr2[4] = C19179f.m62885a(eVar2.f51847b);
        objArr2[5] = eVar2.f51848c;
        objArr2[6] = eVar2.f51855j;
        objArr2[7] = eVar2.f51856k;
        objArr2[8] = eVar2.f51857l;
        StringBuilder sb3 = new StringBuilder("_");
        sb3.append(currentTimeMillis);
        sb3.append("_:");
        sb3.append(eVar2.f51849d);
        objArr2[9] = sb3.toString();
        return C1642a.m8035a(locale2, str5, objArr2);
    }
}
