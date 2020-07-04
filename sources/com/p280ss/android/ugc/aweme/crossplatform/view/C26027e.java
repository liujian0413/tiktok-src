package com.p280ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.react.ReactInstanceManager;
import com.p280ss.android.ugc.aweme.crossplatform.RNPreloadHelper;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.e */
public final class C26027e extends CrossPlatformWebView {

    /* renamed from: i */
    public static final C26028a f68798i = new C26028a(null);

    /* renamed from: j */
    private boolean f68799j;

    /* renamed from: k */
    private Activity f68800k;

    /* renamed from: l */
    private boolean f68801l;

    /* renamed from: m */
    private boolean f68802m = true;

    /* renamed from: n */
    private final String f68803n;

    /* renamed from: o */
    private HashMap f68804o;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.e$a */
    public static final class C26028a {
        private C26028a() {
        }

        public /* synthetic */ C26028a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final View mo67462a(int i) {
        if (this.f68804o == null) {
            this.f68804o = new HashMap();
        }
        View view = (View) this.f68804o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f68804o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Activity getActivity() {
        return this.f68800k;
    }

    public final boolean getMFromPreload() {
        return this.f68801l;
    }

    public final boolean getMLoadRnSuccess() {
        return this.f68802m;
    }

    public final void setMFromPreload(boolean z) {
        this.f68801l = z;
    }

    public final void setMLoadRnSuccess(boolean z) {
        this.f68802m = z;
    }

    /* renamed from: e */
    public final void mo67490e(Activity activity) {
        C7573i.m23587b(activity, "activity");
        super.mo67490e(activity);
        this.f68800k = activity;
        RNPreloadHelper.m84816b(this.f68803n);
        C27064b.f71401a.mo69858b((CrossPlatformWebView) this);
    }

    /* renamed from: g */
    public final void mo67493g(Activity activity) {
        if (RNPreloadHelper.m84813a(this.f68803n) == this) {
            mo67485c("onDestroy");
        } else {
            super.mo67493g(activity);
        }
    }

    /* renamed from: f */
    public final void mo67491f(Activity activity) {
        C7573i.m23587b(activity, "activity");
        super.mo67491f(activity);
        C26024b reactInstanceReference = getReactInstanceReference();
        if (reactInstanceReference != null) {
            ReactInstanceManager reactInstanceManager = (ReactInstanceManager) reactInstanceReference.mo67542b();
            if (reactInstanceManager != null) {
                reactInstanceManager.onHostDestroy(this.f68800k);
            }
        }
        this.f68800k = null;
        RNPreloadHelper.m84817c(this.f68803n);
        mo67473a("search_middle_quit", (JSONObject) null, getReactId());
    }

    public C26027e(String str, Context context) {
        C7573i.m23587b(str, "mBaseUrl");
        C7573i.m23587b(context, "context");
        super(context, null, 0, 6, null);
        this.f68803n = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67471a(String str, Map<String, String> map) {
        super.mo67471a(str, map);
        this.f68802m = false;
        RNPreloadHelper.m84818d(this.f68803n);
        if (this.f68800k == null) {
            super.mo67493g(this.f68800k);
        }
    }

    /* renamed from: a */
    public final void mo67475a(String str, boolean z, boolean z2) {
        C7573i.m23587b(str, "url");
        if (!this.f68799j) {
            super.mo67475a(str, z, z2);
            this.f68799j = true;
        }
    }
}
