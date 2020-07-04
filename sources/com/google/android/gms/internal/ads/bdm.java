package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.afq.C15475a;
import com.google.android.gms.internal.ads.afq.C15475a.C15476a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class bdm {

    /* renamed from: a */
    protected static volatile bwp f41691a = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final ConditionVariable f41692d = new ConditionVariable();

    /* renamed from: e */
    private static volatile Random f41693e = null;

    /* renamed from: b */
    protected volatile Boolean f41694b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public beh f41695c;

    public bdm(beh beh) {
        this.f41695c = beh;
        beh.f41761b.execute(new bdo(this));
    }

    /* renamed from: a */
    public final void mo40522a(int i, int i2, long j) {
        mo40523a(i, i2, j, null);
    }

    /* renamed from: a */
    public final void mo40523a(int i, int i2, long j, Exception exc) {
        try {
            f41692d.block();
            if (this.f41694b.booleanValue() && f41691a != null) {
                C15476a a = C15475a.m45792a().mo39287a(this.f41695c.f41760a.getPackageName()).mo39286a(j);
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    avv.m47393a(exc, new PrintWriter(stringWriter));
                    a.mo39288b(stringWriter.toString()).mo39289c(exc.getClass().getName());
                }
                bwt a2 = f41691a.mo41411a(((C15475a) ((axu) a.mo40293e())).mo40082g());
                a2.mo41414b(i);
                if (i2 != -1) {
                    a2.mo41412a(i2);
                }
                a2.mo41413a();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static int m48462a() {
        try {
            if (VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return m48465c().nextInt();
        } catch (RuntimeException unused) {
            return m48465c().nextInt();
        }
    }

    /* renamed from: c */
    private static Random m48465c() {
        if (f41693e == null) {
            synchronized (bdm.class) {
                if (f41693e == null) {
                    f41693e = new Random();
                }
            }
        }
        return f41693e;
    }
}
