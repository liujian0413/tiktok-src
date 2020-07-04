package com.p280ss.android.ugc.aweme.detail.p1157a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.detail.C26065h;
import com.p280ss.android.ugc.aweme.detail.C26067i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.a.b */
public final class C26044b implements C26065h {

    /* renamed from: a */
    public final ViewGroup f68839a;

    /* renamed from: b */
    public final C26067i f68840b;

    /* renamed from: c */
    public boolean f68841c;

    /* renamed from: d */
    public final Context f68842d;

    /* renamed from: e */
    public final ViewGroup f68843e;

    /* renamed from: f */
    private boolean f68844f = true;

    /* renamed from: e */
    private boolean m85553e() {
        return this.f68844f;
    }

    /* renamed from: c */
    public final void mo67574c() {
        m85554f();
    }

    /* renamed from: d */
    public final void mo67575d() {
        m85555g();
    }

    /* renamed from: a */
    public final void mo67570a() {
        this.f68840b.mo67579b(C26070b.f68881a);
    }

    /* renamed from: b */
    public final void mo67573b() {
        this.f68840b.mo67577a(C26069a.f68880a);
    }

    /* renamed from: f */
    private void m85554f() {
        if (m85553e() && !this.f68841c) {
            this.f68839a.setVisibility(0);
            this.f68839a.startAnimation(C26043a.m85551a());
            this.f68841c = true;
            this.f68840b.mo67577a(C26069a.f68880a);
        }
    }

    /* renamed from: g */
    private void m85555g() {
        if (m85553e() && this.f68841c) {
            this.f68840b.mo67579b(C26070b.f68881a);
            this.f68839a.startAnimation(C26043a.m85552b());
            this.f68839a.setVisibility(8);
            this.f68841c = false;
        }
    }

    /* renamed from: a */
    public final void mo67571a(int i) {
        m85554f();
    }

    /* renamed from: a */
    public final void mo67572a(boolean z) {
        this.f68839a.setVisibility(8);
        this.f68844f = false;
    }

    public C26044b(Context context, ViewGroup viewGroup) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(viewGroup, "viewGroup");
        this.f68842d = context;
        this.f68843e = viewGroup;
        View findViewById = this.f68843e.findViewById(R.id.da5);
        C7573i.m23582a((Object) findViewById, "this.viewGroup.findViewById(R.id.start_record)");
        this.f68839a = (ViewGroup) findViewById;
        this.f68840b = new C26045c(this.f68842d, this.f68839a);
        this.f68841c = true;
    }
}
