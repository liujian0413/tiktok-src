package com.p280ss.android.ugc.aweme.antiaddic;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.antiaddic.experiment.TestAntiAddictionExperiment;
import com.p280ss.android.ugc.aweme.antiaddic.experiment.UseRelieveAwemeExperiment;
import com.p280ss.android.ugc.aweme.antiaddic.experiment.UseRelieveToastExperiment;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.c */
public class C22562c {

    /* renamed from: d */
    private static C22562c f60108d;

    /* renamed from: a */
    public boolean f60109a;

    /* renamed from: b */
    public String f60110b;

    /* renamed from: c */
    public String f60111c;

    /* renamed from: e */
    private int f60112e = 22;

    /* renamed from: f */
    private int f60113f = -1;

    /* renamed from: g */
    private int f60114g = -1;

    /* renamed from: h */
    private int f60115h = -1;

    /* renamed from: e */
    public final String mo59207e() {
        return this.f60110b;
    }

    /* renamed from: j */
    private long m74576j() {
        return (long) (this.f60113f * 1000);
    }

    /* renamed from: k */
    private long m74577k() {
        return (long) (this.f60114g * 1000);
    }

    /* renamed from: d */
    public final long mo59206d() {
        return (long) (this.f60115h * 1000);
    }

    /* renamed from: f */
    public final int mo59208f() {
        boolean z = this.f60109a;
        this.f60109a = false;
        return z ? 1 : 0;
    }

    /* renamed from: g */
    public final String mo59209g() {
        String str = this.f60111c;
        this.f60111c = "";
        return str;
    }

    private C22562c() {
    }

    /* renamed from: a */
    public static C22562c m74570a() {
        if (f60108d == null) {
            synchronized (C22562c.class) {
                if (f60108d == null) {
                    f60108d = new C22562c();
                }
            }
        }
        return f60108d;
    }

    /* renamed from: c */
    public static long m74573c() {
        int e = C6903bc.m21484c().mo59245e() * 60 * 1000;
        if (m74572b()) {
            return (long) (e / 10);
        }
        return (long) e;
    }

    /* renamed from: b */
    public static boolean m74572b() {
        if (C6399b.m19928c() || C6384b.m19835a().mo15292a(TestAntiAddictionExperiment.class, true, "debug_test_anti_addiction", C6384b.m19835a().mo15295d().debug_test_anti_addiction, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m74574h() {
        if (m74572b() || C6384b.m19835a().mo15287a(UseRelieveAwemeExperiment.class, true, "use_relieve_aweme", C6384b.m19835a().mo15295d().use_relieve_aweme, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m74575i() {
        if (m74572b() || C6384b.m19835a().mo15287a(UseRelieveToastExperiment.class, true, "use_relieve_toast", C6384b.m19835a().mo15295d().use_relieve_toast, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private long m74571b(long j) {
        if (mo59204a(j)) {
            return m74577k();
        }
        return m74576j();
    }

    /* renamed from: a */
    public final void mo59203a(IESSettingsProxy iESSettingsProxy) {
        if (C6399b.m19945u()) {
            this.f60112e = iESSettingsProxy.getAntiAddictionSeparation().intValue();
        }
        this.f60113f = iESSettingsProxy.getAntiAddictionDayTime().intValue();
        this.f60114g = iESSettingsProxy.getAntiAddictionNightTime().intValue();
        this.f60115h = iESSettingsProxy.getAntiAddictionToastTime().intValue();
    }

    /* renamed from: a */
    public final boolean mo59204a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(11);
        if (i >= this.f60112e || i < 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo59205a(long j, long j2) {
        long b = m74571b(j);
        if (b <= 0 || j2 <= b) {
            return false;
        }
        return true;
    }
}
