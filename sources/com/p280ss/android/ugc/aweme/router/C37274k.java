package com.p280ss.android.ugc.aweme.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C23018p;
import com.p280ss.android.ugc.aweme.app.PushLoginActivity;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.router.k */
public final class C37274k implements IInterceptor, C37273j {

    /* renamed from: a */
    public static final C37275a f97396a = new C37275a(null);

    /* renamed from: com.ss.android.ugc.aweme.router.k$a */
    public static final class C37275a {
        private C37275a() {
        }

        public /* synthetic */ C37275a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo59315a(String str) {
        C7573i.m23587b(str, "url");
        return mo59314a(null, str, null);
    }

    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        String str2 = "login";
        if (routeIntent != null) {
            Uri uri = routeIntent.getUri();
            if (uri != null) {
                str = uri.getHost();
                return C7573i.m23585a((Object) str2, (Object) str);
            }
        }
        str = null;
        return C7573i.m23585a((Object) str2, (Object) str);
    }

    /* renamed from: a */
    public final boolean mo59313a(Activity activity, String str) {
        return mo59314a(activity, str, null);
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (routeIntent != null) {
                str2 = routeIntent.getUrl();
            }
            mo59313a(activity, str2);
        } else {
            Activity g = C6405d.m19984g();
            if (g != null) {
                if (routeIntent != null) {
                    str2 = routeIntent.getUrl();
                }
                mo59313a(g, str2);
            } else {
                if (routeIntent != null) {
                    str = routeIntent.getUrl();
                } else {
                    str = null;
                }
                mo59313a(null, str);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo59314a(Activity activity, String str, View view) {
        if (C7573i.m23585a((Object) "push", (Object) Uri.parse(str).getQueryParameter("enter_from"))) {
            Context context = activity;
            Intent intent = new Intent(context, MainActivity.class);
            Intent intent2 = new Intent(context, PushLoginActivity.class);
            if (activity != null) {
                IAccountUserService a = C21115b.m71197a();
                C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
                if (!a.isLogin()) {
                    C23018p a2 = C23018p.m75672a();
                    C7573i.m23582a((Object) a2, "AwemeRuntime.inst()");
                    if (a2.mo59990c()) {
                        activity.startActivity(intent2);
                    } else {
                        activity.startActivities(new Intent[]{intent, intent2});
                    }
                    return true;
                }
            }
            Context a3 = C6399b.m19921a();
            intent.setFlags(268435456);
            a3.startActivity(intent);
            return true;
        }
        if (activity == null) {
            C32656f.m105742a(C6405d.m19984g(), "h5", "");
        } else {
            C32656f.m105742a(activity, "h5", "");
        }
        return true;
    }
}
