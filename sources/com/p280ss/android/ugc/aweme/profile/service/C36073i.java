package com.p280ss.android.ugc.aweme.profile.service;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.mix.C33538d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.service.i */
public final class C36073i implements C33538d {

    /* renamed from: a */
    public static final C36073i f94313a = new C36073i();

    /* renamed from: b */
    private final /* synthetic */ C33538d f94314b;

    /* renamed from: a */
    public final void mo85868a(Context context, Aweme aweme, View view, TextView textView, String str, int i) {
        this.f94314b.mo85868a(context, aweme, view, textView, str, i);
    }

    /* renamed from: a */
    public final void mo85869a(Context context, Aweme aweme, TextView textView) {
        this.f94314b.mo85869a(context, aweme, textView);
    }

    /* renamed from: a */
    public final boolean mo85870a() {
        return this.f94314b.mo85870a();
    }

    /* renamed from: a */
    public final boolean mo85871a(Aweme aweme, int i, String str) {
        return this.f94314b.mo85871a(aweme, i, str);
    }

    /* renamed from: b */
    public final int mo85872b(Context context, Aweme aweme, TextView textView) {
        return this.f94314b.mo85872b(context, aweme, textView);
    }

    /* renamed from: b */
    public final boolean mo85873b() {
        return this.f94314b.mo85873b();
    }

    /* renamed from: b */
    public final boolean mo85874b(Aweme aweme, int i, String str) {
        return this.f94314b.mo85874b(aweme, i, str);
    }

    private C36073i() {
        C33538d h = C6903bc.m21489h();
        C7573i.m23582a((Object) h, "LegacyServiceUtils.getMixHelperService()");
        this.f94314b = h;
    }
}
