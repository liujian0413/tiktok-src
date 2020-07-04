package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.at */
public final class C22880at {

    /* renamed from: a */
    public static final C22881a f60596a = new C22881a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.at$a */
    public static final class C22881a {
        private C22881a() {
        }

        public /* synthetic */ C22881a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static Intent m75349a(Activity activity, Intent intent, String str) {
            C7573i.m23587b(activity, "activity");
            C23018p a = C23018p.m75672a();
            C7573i.m23582a((Object) a, "AwemeRuntime.inst()");
            if (!a.mo59990c()) {
                Intent intent2 = new Intent();
                if (C6399b.m19944t()) {
                    intent2.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
                } else {
                    intent2 = new Intent(activity, MainActivity.class);
                }
                activity.startActivity(intent2);
            }
            Intent intent3 = new Intent(activity, PushLoginActivity.class);
            if (intent != null) {
                intent3.putExtra("next_step", intent);
            }
            intent3.putExtra("multi_account_push_uid", str);
            return intent3;
        }
    }
}
