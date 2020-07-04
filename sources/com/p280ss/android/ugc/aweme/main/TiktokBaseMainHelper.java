package com.p280ss.android.ugc.aweme.main;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Handler;
import android.os.Process;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.image.C6813b;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p313im.C30556d;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.main.TiktokBaseMainHelper */
public abstract class TiktokBaseMainHelper {

    /* renamed from: a */
    private static boolean f85783a;

    /* renamed from: b */
    protected Activity f85784b;

    /* renamed from: c */
    protected NotificationManager f85785c;

    /* renamed from: d */
    protected boolean f85786d;

    /* renamed from: e */
    protected boolean f85787e;

    /* renamed from: f */
    protected boolean f85788f;

    /* renamed from: g */
    protected final Handler f85789g = new Handler();

    /* renamed from: h */
    protected long f85790h = 0;

    /* renamed from: com.ss.android.ugc.aweme.main.TiktokBaseMainHelper$1 */
    class C328551 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TiktokBaseMainHelper f85791a;

        public final void run() {
            TiktokBaseMainHelper.m106451d();
            this.f85791a.mo84584f();
            Process.killProcess(Process.myPid());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.TiktokBaseMainHelper$AppStartJobTask */
    class AppStartJobTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        private AppStartJobTask() {
        }

        public void run(Context context) {
            new C6813b(TiktokBaseMainHelper.this.f85784b).mo16651b();
            C30556d.m99808a(false);
        }

        /* synthetic */ AppStartJobTask(TiktokBaseMainHelper tiktokBaseMainHelper, C328551 r2) {
            this();
        }
    }

    /* renamed from: a */
    public boolean mo84580a() {
        return m106450a(true);
    }

    /* renamed from: d */
    protected static void m106451d() {
        BusinessComponentServiceUtils.getMainHelperService().mo84624c();
        AppLog.onQuit();
    }

    /* renamed from: h */
    private static void m106453h() {
        BusinessComponentServiceUtils.getMainHelperService().mo84622a();
        try {
            CookieSyncManager.getInstance().sync();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo84581b() {
        m106453h();
        this.f85788f = true;
        this.f85784b.finish();
    }

    /* renamed from: c */
    public final void mo84582c() {
        if (!this.f85786d && !this.f85787e) {
            m106452g();
        }
    }

    /* renamed from: g */
    private void m106452g() {
        C7121a.m22248b().mo18559a(new AppStartJobTask(this, null)).mo18560a();
    }

    /* renamed from: f */
    public final void mo84584f() {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("com.ss.android.newmedia.killApplication");
        this.f85784b.sendBroadcast(intent);
    }

    /* renamed from: e */
    public final boolean mo84583e() {
        if (f85783a) {
            mo84581b();
            return true;
        } else if (System.currentTimeMillis() - this.f85790h <= 2000) {
            mo84581b();
            this.f85790h = 0;
            return true;
        } else {
            this.f85790h = System.currentTimeMillis();
            C9738o.m28710b((Context) this.f85784b, (int) R.string.pr, 48);
            return false;
        }
    }

    protected TiktokBaseMainHelper(Activity activity) {
        this.f85784b = activity;
        this.f85785c = (NotificationManager) activity.getSystemService("notification");
        this.f85786d = false;
        this.f85787e = false;
    }

    /* renamed from: a */
    private boolean m106450a(boolean z) {
        C10741a aVar = new C10741a(this.f85784b);
        aVar.mo25657b((int) R.string.btl);
        aVar.mo25649a((int) R.string.e9k);
        aVar.mo25650a((int) R.string.afn, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                TiktokBaseMainHelper.this.mo84581b();
            }
        });
        aVar.mo25658b((int) R.string.w_, (OnClickListener) null);
        aVar.mo25656a().mo25637a();
        return false;
    }
}
