package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.crossplatform.activity.C25822g;
import com.p280ss.android.ugc.aweme.crossplatform.business.C25862i;
import com.p280ss.android.ugc.aweme.crossplatform.business.C25862i.C25863a;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26025c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bh */
public class C25269bh implements C25822g {

    /* renamed from: a */
    protected final Activity f66616a;

    /* renamed from: b */
    protected C26025c f66617b;

    /* renamed from: c */
    protected C25965c f66618c;

    /* renamed from: d */
    protected final C25886b f66619d;

    /* renamed from: e */
    protected final C25862i f66620e = C25863a.m85098a(this);

    /* renamed from: a */
    public final void mo65871a(CharSequence charSequence, boolean z) {
    }

    /* renamed from: a */
    public final void mo65872a(String str) {
    }

    /* renamed from: c */
    public final void mo65874c() {
    }

    /* renamed from: d */
    public final void mo65875d() {
    }

    /* renamed from: e */
    public final C25965c mo65876e() {
        return this.f66618c;
    }

    /* renamed from: f */
    public final C26025c mo65877f() {
        return this.f66617b;
    }

    public Context getContext() {
        return this.f66616a;
    }

    public C25862i getCrossPlatformBusiness() {
        return this.f66620e;
    }

    public C25886b getCrossPlatformParams() {
        return this.f66619d;
    }

    /* renamed from: g */
    public final void mo65878g() {
        this.f66617b.mo65878g();
    }

    /* renamed from: h */
    public final boolean mo65882h() {
        return this.f66617b.mo65882h();
    }

    /* renamed from: b */
    public final void mo65873b(String str) {
        ((C26039m) this.f66617b.mo67463a(C26039m.class)).mo67530a(str);
    }

    public C25269bh(Activity activity, C26025c cVar, C25965c cVar2, C25886b bVar) {
        this.f66616a = activity;
        this.f66617b = cVar;
        this.f66618c = cVar2;
        this.f66619d = bVar;
    }
}
