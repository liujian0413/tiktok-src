package com.p280ss.android.ugc.aweme;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p293di.push.C6804a;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25225af;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25274bl;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.util.C42881i;
import com.p280ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.j */
public final class C21758j {

    /* renamed from: i */
    public static WeakReference<Activity> f58268i = new WeakReference<>(null);

    /* renamed from: a */
    public int f58269a;

    /* renamed from: b */
    public volatile boolean f58270b = true;

    /* renamed from: c */
    public long f58271c;

    /* renamed from: d */
    public C7162m f58272d;

    /* renamed from: e */
    public C21760a f58273e;

    /* renamed from: f */
    public volatile boolean f58274f = true;

    /* renamed from: g */
    public long f58275g;

    /* renamed from: h */
    public boolean f58276h;

    /* renamed from: com.ss.android.ugc.aweme.j$a */
    public interface C21760a {
        /* renamed from: a */
        void mo58101a(Activity activity);

        /* renamed from: b */
        void mo58102b(Activity activity);
    }

    /* renamed from: a */
    public static WeakReference<Activity> m72769a() {
        return f58268i;
    }

    public C21758j(Application application) {
        m72770a(application);
    }

    /* renamed from: a */
    private void m72770a(Application application) {
        if (application == null) {
            this.f58270b = false;
            return;
        }
        application.registerActivityLifecycleCallbacks(ActivityStack.lifecycleCallbacks);
        application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
                if (activity instanceof MainActivity) {
                    C21758j.this.f58276h = false;
                }
            }

            public final void onActivityPaused(Activity activity) {
                C21781u.m72812b(activity);
                C21758j.this.f58274f = true;
                C21758j.this.f58275g = System.currentTimeMillis();
                C25274bl.m83061a(activity);
            }

            public final void onActivityResumed(Activity activity) {
                C21781u.m72811a(activity);
                if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).needCallbackOnActivityResumed(activity) && C21758j.this.f58272d != null) {
                    C21758j.this.f58272d.mo18613c();
                }
                C21758j.this.f58274f = false;
                C21758j.f58268i = new WeakReference<>(activity);
                C25274bl.m83063b(activity);
            }

            public final void onActivityStarted(Activity activity) {
                C25274bl.m83064c(activity);
                if (C6399b.m19944t() || !C6804a.m21138a().isSswoAct(activity)) {
                    C21758j.this.f58269a++;
                    if (C21758j.this.f58269a == 1) {
                        C21758j.this.f58270b = false;
                        if (C21758j.this.f58272d != null) {
                            C21758j.this.f58272d.mo18611a();
                        }
                        if (C21758j.this.f58273e != null) {
                            C21758j.this.f58273e.mo58101a(activity);
                        }
                        C42881i.m136166c(activity);
                    }
                }
            }

            public final void onActivityStopped(Activity activity) {
                C25274bl.m83065d(activity);
                if (C6399b.m19944t() || !C6804a.m21138a().isSswoAct(activity)) {
                    C21758j.this.f58269a--;
                    if (C21758j.this.f58269a == 0) {
                        C21758j.this.f58270b = true;
                        C21758j.this.f58271c = System.currentTimeMillis();
                        if (C21758j.this.f58272d != null) {
                            C21758j.this.f58272d.mo18612b();
                        }
                        if (C21758j.this.f58273e != null) {
                            C21758j.this.f58273e.mo58102b(activity);
                        }
                        C42881i.m136158a();
                    }
                }
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MainActivity) {
                    C21758j.this.f58276h = true;
                }
            }
        });
        if (application != null) {
            C25225af.f66549a.mo65840a(application);
        }
    }
}
