package dagger.android;

import android.app.Activity;
import android.app.Application;
import com.C1642a;
import dagger.p1859a.C47375f;

/* renamed from: dagger.android.a */
public final class C47376a {
    /* renamed from: a */
    public static void m147942a(Activity activity) {
        C47375f.m147940a(activity, "activity");
        Application application = activity.getApplication();
        if (application instanceof C7316d) {
            C7313b e = ((C7316d) application).mo16890e();
            C47375f.m147941a(e, "%s.activityInjector() returned null", application.getClass());
            e.mo19116a(activity);
            return;
        }
        throw new RuntimeException(C1642a.m8034a("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C7316d.class.getCanonicalName()}));
    }
}
