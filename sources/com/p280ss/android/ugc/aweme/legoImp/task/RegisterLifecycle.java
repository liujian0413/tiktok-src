package com.p280ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.ugc.aweme.app.application.task.p1026a.C22870a;
import com.p280ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.p280ss.android.ugc.aweme.base.component.AnalysisFragmentComponent;
import com.p280ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.p304ab.C6857a.C6860a;
import com.p280ss.android.ugc.aweme.services.IAVService;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle */
public class RegisterLifecycle implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivityPaused(Activity activity) {
            }

            public final void onActivityResumed(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }

            /* renamed from: a */
            private static void m104954a(AbsActivity absActivity) {
                absActivity.getLifecycle().mo55a(new AnalysisActivityComponent(absActivity));
                absActivity.getLifecycle().mo55a(new EventActivityComponent(absActivity));
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof AbsActivity) {
                    m104954a((AbsActivity) activity);
                }
                if (activity instanceof FragmentActivity) {
                    ((FragmentActivity) activity).getSupportFragmentManager().mo2649a((C0609a) new AnalysisFragmentComponent(), true);
                }
                if (!(activity instanceof MainActivity) && !((IAVService) ServiceManager.get().getService(IAVService.class)).recordActivityService().instanceOfVideoRecordActivity(activity) && !(activity instanceof NewUserJourneyActivity)) {
                    C22870a.m75334a();
                }
            }
        });
        application.registerActivityLifecycleCallbacks(new C6860a());
    }
}
