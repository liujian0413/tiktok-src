package com.p280ss.android.ugc.aweme.freeflowcard.data;

import android.arch.persistence.room.C0160e;
import android.os.Build.VERSION;
import android.os.StatFs;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.freeflowcard.data.database.FreeFlowDatabase;
import com.p280ss.android.ugc.aweme.freeflowcard.data.entity.AppStartMode;
import com.p280ss.android.ugc.aweme.freeflowcard.data.entity.AutoPlaySetting;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.a */
public class C29983a {

    /* renamed from: b */
    private static C29983a f78796b;

    /* renamed from: a */
    public FreeFlowDatabase f78797a = ((FreeFlowDatabase) C0160e.m441a(C6399b.m19921a(), FreeFlowDatabase.class, "free_flow").mo318a().mo322c());

    /* renamed from: c */
    private AutoPlaySetting f78798c;

    /* renamed from: d */
    public final void mo76181d() {
        C1592h.m7853a((Callable<TResult>) new Callable<Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() throws Exception {
                try {
                    C29983a.this.f78797a.mo76191i().mo76189a();
                    C29983a.this.f78797a.mo76192j().mo76185a();
                    C29983a.this.f78797a.mo76190h().mo76188b();
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    private C29983a() {
    }

    /* renamed from: a */
    public static C29983a m98302a() {
        if (f78796b == null) {
            synchronized (C29983a.class) {
                if (f78796b == null) {
                    f78796b = new C29983a();
                }
            }
        }
        return f78796b;
    }

    /* renamed from: c */
    public static boolean m98303c() {
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser == null) {
            return false;
        }
        return curUser.isFlowcardMember();
    }

    /* renamed from: f */
    private boolean m98305f() {
        File g = m98306g();
        if (g != null && m98301a(g) >= 1048576) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static File m98306g() {
        File databasePath = C6399b.m19921a().getDatabasePath("free_flow");
        if (databasePath.exists()) {
            return databasePath;
        }
        return null;
    }

    /* renamed from: e */
    private AutoPlaySetting m98304e() {
        if (this.f78798c != null) {
            return this.f78798c;
        }
        try {
            List a = this.f78797a.mo76190h().mo76186a();
            if (C6307b.m19566a((Collection<T>) a)) {
                AutoPlaySetting autoPlaySetting = new AutoPlaySetting(m98303c(), 0, 0, 0, false, 0);
                mo76179a(autoPlaySetting);
                return autoPlaySetting;
            }
            this.f78798c = (AutoPlaySetting) a.get(0);
            return this.f78798c;
        } catch (Exception unused) {
            AutoPlaySetting autoPlaySetting2 = new AutoPlaySetting(false, 0, 0, 0, false, 0);
            return autoPlaySetting2;
        }
    }

    /* renamed from: b */
    public final AutoPlaySetting mo76180b() {
        AutoPlaySetting e = m98304e();
        if (e.isOpen && e.resetTime < System.currentTimeMillis() && !m98303c()) {
            e.resetTime = 0;
            e.isOpen = false;
            e.changeType = 0;
            e.monthlyState = 0;
            mo76179a(e);
        }
        if (e.isDayOpen && e.dayOpenResetTime < System.currentTimeMillis()) {
            e.isDayOpen = false;
            e.dayOpenResetTime = 0;
            mo76179a(e);
        }
        if (!e.isOpen && e.changeType == 1 && e.resetTime < System.currentTimeMillis()) {
            e.resetTime = 0;
            e.changeType = 0;
            mo76179a(e);
        }
        return e;
    }

    /* renamed from: a */
    private static long m98301a(File file) {
        StatFs statFs;
        try {
            statFs = new StatFs(file.getPath());
        } catch (IllegalArgumentException unused) {
            statFs = null;
        }
        if (statFs == null) {
            return 0;
        }
        if (VERSION.SDK_INT >= 18) {
            return statFs.getAvailableBytes();
        }
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    /* renamed from: a */
    public final void mo76179a(AutoPlaySetting autoPlaySetting) {
        if (m98305f()) {
            try {
                this.f78797a.mo76190h().mo76188b();
                this.f78797a.mo76190h().mo76187a(autoPlaySetting);
                this.f78798c = autoPlaySetting;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final List<AppStartMode> mo76177a(long j, long j2) {
        try {
            return this.f78797a.mo76192j().mo76183a(j, j2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final List<AppStartMode> mo76178a(long j, long j2, int i) {
        try {
            return this.f78797a.mo76192j().mo76184a(j, j2, 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
