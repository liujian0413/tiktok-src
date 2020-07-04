package com.p280ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.content.C0688e;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.ies.uikit.dialog.C11029b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.bytedance.ies.uikit.p578c.C11014a;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32296d.C32297a;
import com.p280ss.android.ugc.aweme.splash.SplashActivity;
import com.p280ss.android.ugc.aweme.update.UpdateHelper;
import com.p280ss.android.ugc.aweme.utils.C42972bf;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.e */
public final class C32298e extends C32296d implements ActivityLifecycleCallbacks {

    /* renamed from: d */
    private static volatile C32298e f84372d;

    /* renamed from: a */
    WeakReference<Activity> f84373a;

    /* renamed from: c */
    C11029b f84374c;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* renamed from: a */
    private boolean m104841a() {
        if (this.f84373a == null) {
            return false;
        }
        Activity activity = (Activity) this.f84373a.get();
        if (activity == null || (activity instanceof SplashActivity) || !(activity instanceof AbsActivity) || !((AbsActivity) activity).isActive() || (this.f84374c != null && this.f84374c.isShowing())) {
            return false;
        }
        return true;
    }

    public final void onActivityResumed(Activity activity) {
        this.f84373a = new WeakReference<>(activity);
    }

    private C32298e(C32296d dVar) {
        super(dVar);
        AwemeApplication.m21341a().registerActivityLifecycleCallbacks(this);
        if (C6405d.m19984g() != null) {
            this.f84373a = new WeakReference<>(C6405d.m19984g());
        }
    }

    /* renamed from: a */
    public static C32298e m104839a(C32296d dVar) {
        if (f84372d == null) {
            synchronized (C32298e.class) {
                if (f84372d == null) {
                    f84372d = new C32298e(dVar);
                }
            }
        }
        return f84372d;
    }

    /* renamed from: a */
    private void m104840a(final String str) {
        final Activity activity = (Activity) this.f84373a.get();
        activity.runOnUiThread(new Runnable() {
            public final void run() {
                if (C32298e.this.f84374c == null) {
                    C11030a aVar = new C11030a(activity);
                    aVar.mo26647b((CharSequence) str).mo26635a((int) R.string.b9r, (OnClickListener) null).mo26646b((int) R.string.w_, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C19282c.m63182a(activity, "force_update_popup", "cancel");
                            C0688e.m2941a((Context) activity).mo2839a(new Intent("com.ss.android.common.app.action.exit_app"));
                            C32298e.this.f84374c = null;
                        }
                    });
                    C32298e.this.f84374c = aVar.mo26644a();
                    C32298e.this.f84374c.setCancelable(false);
                }
                if (C32298e.this.f84374c != null) {
                    C19282c.m63182a(activity, "force_update_popup", "show");
                    C32298e.this.f84374c.show();
                    C32298e.this.f84374c.mo26627a(-1).setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            C19282c.m63182a(activity, "force_update_popup", "confirm");
                            UpdateHelper b = UpdateHelper.m135755b();
                            b.mo104392c();
                            File q = b.mo104406q();
                            if (q != null) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setDataAndType(C42972bf.m136419a((Context) activity, q), "application/vnd.android.package-archive");
                                activity.startActivity(intent);
                                return;
                            }
                            b.mo104412w();
                            C11014a.m32279a((Context) activity, (int) R.string.b9q);
                        }
                    });
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C32297a mo83494a(C32303g gVar, C12462c cVar, C12534t tVar) {
        if (!m104841a() || gVar.f84380a.f84382a != 10 || TextUtils.isEmpty(gVar.f84380a.f84383b)) {
            return C32295c.f84366a;
        }
        m104840a(gVar.f84380a.f84383b);
        return new C32297a(true, false);
    }
}
