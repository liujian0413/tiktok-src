package com.p280ss.android.ugc.gamora.recorder;

import android.support.p029v7.widget.ViewStubCompat;
import android.view.View;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.filter.C29182a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.aa */
final class C44445aa extends C29182a {

    /* renamed from: a */
    private final View f114708a;

    /* renamed from: a */
    public final ViewStubCompat mo74782a() {
        View findViewById = this.f114708a.findViewById(R.id.akc);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.filter_indicator_stub)");
        return (ViewStubCompat) findViewById;
    }

    /* renamed from: b */
    public final FrameLayout mo74786b() {
        View findViewById = this.f114708a.findViewById(R.id.cpp);
        if (findViewById != null) {
            return (FrameLayout) findViewById;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* renamed from: c */
    public final FrameLayout mo74787c() {
        View findViewById = this.f114708a.findViewById(R.id.cpq);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.record_filter_extra2)");
        return (FrameLayout) findViewById;
    }

    /* renamed from: d */
    public final FrameLayout mo97959d() {
        View findViewById = this.f114708a.findViewById(R.id.cpr);
        if (findViewById != null) {
            return (FrameLayout) findViewById;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    public C44445aa(View view) {
        C7573i.m23587b(view, "rootView");
        this.f114708a = view;
    }
}
