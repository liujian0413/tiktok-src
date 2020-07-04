package com.p280ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.crossplatform.activity.WebViewPoolExperiment.C25815a;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.m */
public class C25828m {

    /* renamed from: g */
    private static C25828m f68301g;

    /* renamed from: a */
    private List<SoftReference<SingleWebView>> f68302a = new ArrayList();

    /* renamed from: b */
    private List<SingleWebView> f68303b = new ArrayList();

    /* renamed from: c */
    private List<SingleWebView> f68304c = new ArrayList();

    /* renamed from: d */
    private int f68305d = 2;

    /* renamed from: e */
    private final Object f68306e = new Object();

    /* renamed from: f */
    private List<String> f68307f = C25815a.m84915a();

    /* renamed from: c */
    public final void mo67149c() {
        synchronized (this.f68306e) {
            mo67148b();
        }
    }

    /* renamed from: a */
    public static C25828m m84934a() {
        if (f68301g == null) {
            synchronized (C25828m.class) {
                if (f68301g == null) {
                    f68301g = new C25828m();
                }
            }
        }
        return f68301g;
    }

    /* renamed from: e */
    private boolean m84935e() {
        if (VERSION.SDK_INT < 23) {
            return true;
        }
        if (C7163a.m22363a() || !C23477d.m77081a((Collection<T>) this.f68307f)) {
            return false;
        }
        return true;
    }

    private C25828m() {
    }

    /* renamed from: b */
    public final void mo67148b() {
        if (VERSION.SDK_INT >= 23 && !m84935e() && this.f68303b.size() < this.f68305d) {
            C6399b.m19921a().getMainLooper().getQueue().addIdleHandler(new C25829n(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ boolean mo67150d() {
        SystemClock.uptimeMillis();
        synchronized (this.f68306e) {
            for (int i = 0; i < this.f68305d - this.f68303b.size(); i++) {
                this.f68303b.add(new SingleWebView(new MutableContextWrapper(C6399b.m19921a())));
            }
        }
        SystemClock.uptimeMillis();
        return false;
    }

    /* renamed from: a */
    public final SingleWebView mo67146a(Activity activity) {
        SingleWebView singleWebView = null;
        if (m84935e()) {
            return null;
        }
        synchronized (this.f68306e) {
            if (this.f68303b.size() > 0) {
                singleWebView = (SingleWebView) this.f68303b.get(0);
                this.f68303b.remove(0);
                if (singleWebView != null) {
                    Context context = singleWebView.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(activity);
                    }
                    singleWebView.initWeb(activity);
                }
            }
        }
        return singleWebView;
    }

    /* renamed from: a */
    public final boolean mo67147a(C25886b bVar) {
        if (m84935e()) {
            return false;
        }
        if (C7163a.m22363a()) {
            return true;
        }
        if (bVar == null) {
            return false;
        }
        String str = bVar.f68473a.f68430c;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String contains : this.f68307f) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
