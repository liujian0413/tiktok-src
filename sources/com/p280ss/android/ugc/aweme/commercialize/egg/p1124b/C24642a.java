package com.p280ss.android.ugc.aweme.commercialize.egg.p1124b;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24641b;
import com.p280ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1123a.C24638b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.a */
public abstract class C24642a {

    /* renamed from: d */
    public final Context f64982d;

    /* renamed from: e */
    public C24641b f64983e;

    /* renamed from: f */
    public C24638b f64984f;

    /* renamed from: g */
    public int f64985g = 1;

    /* renamed from: h */
    public boolean f64986h = true;

    /* renamed from: i */
    public final CommerceEggLayout f64987i;

    /* renamed from: a */
    public abstract void mo64511a();

    /* renamed from: b */
    public abstract void mo64513b();

    /* renamed from: c */
    public final void mo64514c() {
        m80789a(true, null);
    }

    public C24642a(CommerceEggLayout commerceEggLayout) {
        C7573i.m23587b(commerceEggLayout, "eggLayout");
        this.f64987i = commerceEggLayout;
        Context context = this.f64987i.getContext();
        C7573i.m23582a((Object) context, "eggLayout.context");
        this.f64982d = context;
    }

    /* renamed from: a */
    public final void mo64512a(String str) {
        m80789a(false, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m80789a(boolean z, String str) {
        C24671f.m80871u().mo64539a(this.f64983e, z, str);
    }
}
