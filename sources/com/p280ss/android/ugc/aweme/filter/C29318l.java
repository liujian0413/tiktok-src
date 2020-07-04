package com.p280ss.android.ugc.aweme.filter;

import android.content.Context;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.collect.C17794bt;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.l */
public final class C29318l implements C29315j {

    /* renamed from: a */
    public static final C29319a f77311a = new C29319a(null);

    /* renamed from: b */
    private final FilterViewImpl f77312b;

    /* renamed from: com.ss.android.ugc.aweme.filter.l$a */
    public static final class C29319a {
        private C29319a() {
        }

        public /* synthetic */ C29319a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C29318l m96171a(FilterViewImpl filterViewImpl) {
            C7573i.m23587b(filterViewImpl, "filterView");
            return new C29318l(filterViewImpl);
        }
    }

    /* renamed from: a */
    public static final C29318l m96164a(FilterViewImpl filterViewImpl) {
        return C29319a.m96171a(filterViewImpl);
    }

    /* renamed from: a */
    public final String mo74987a() {
        AppCompatActivity appCompatActivity = this.f77312b.f77045a;
        C7573i.m23582a((Object) appCompatActivity, "filterView.activity");
        return C29316k.m96160a(appCompatActivity);
    }

    /* renamed from: b */
    public final boolean mo74989b() {
        AppCompatActivity appCompatActivity = this.f77312b.f77045a;
        C7573i.m23582a((Object) appCompatActivity, "filterView.activity");
        return C29316k.m96161b(appCompatActivity);
    }

    /* renamed from: d */
    public final <K, V> C17794bt<K, V> mo74991d() {
        C17794bt<K, V> d = C29263bs.m95999d();
        C7573i.m23582a((Object) d, "SpecializedMultimap.makeMultimap()");
        return d;
    }

    /* renamed from: c */
    public final C29296g mo74990c() {
        List list = (List) C35574k.m114859a().mo70097l().mo74951d().mo74818a().getValue();
        if (list != null && !list.isEmpty()) {
            return (C29296g) list.get(0);
        }
        C29296g a = C29196ab.m95825a();
        AppCompatActivity appCompatActivity = this.f77312b.f77045a;
        C7573i.m23582a((Object) appCompatActivity, "filterView.activity");
        a.f77267b = appCompatActivity.getResources().getStringArray(R.array.a9)[0];
        C7573i.m23582a((Object) a, "FilterHelperCopy.makeNor…er_name)[0]\n            }");
        return a;
    }

    public C29318l(FilterViewImpl filterViewImpl) {
        C7573i.m23587b(filterViewImpl, "filterView");
        this.f77312b = filterViewImpl;
    }

    /* renamed from: a */
    public final void mo74988a(C29296g gVar) {
        C7573i.m23587b(gVar, "filter");
        if (this.f77312b.f77045a != null) {
            FilterViewModel.m95784a(this.f77312b.f77045a, gVar);
        }
    }

    /* renamed from: a */
    public final View mo74986a(AppCompatActivity appCompatActivity) {
        C7573i.m23587b(appCompatActivity, "activity");
        Context context = appCompatActivity;
        FrameLayout frameLayout = new FrameLayout(context);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = new AVDmtHorizontalImageTextLayout(context, null, 0, 6, null);
        aVDmtHorizontalImageTextLayout.setText(mo74987a());
        aVDmtHorizontalImageTextLayout.setTextSize(15);
        aVDmtHorizontalImageTextLayout.setGravity(17);
        if (C6399b.m19944t()) {
            aVDmtHorizontalImageTextLayout.mo103489a();
        }
        aVDmtHorizontalImageTextLayout.setImageRes(R.drawable.as7);
        aVDmtHorizontalImageTextLayout.setPadding(0, 0, (int) C20505c.m68010a(aVDmtHorizontalImageTextLayout.getContext(), 12.0f), 0);
        frameLayout.addView(aVDmtHorizontalImageTextLayout, new LayoutParams(-2, -2, 17));
        return frameLayout;
    }
}
