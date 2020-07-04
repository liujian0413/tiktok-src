package com.p280ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.symphony.C25153e;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28494m;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.recommend.viewholder.C37165b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.h */
public final class C28180h implements C28197y {
    /* renamed from: a */
    public final C28130ac mo71779a(View view) {
        return new C28181i(view);
    }

    /* renamed from: b */
    public final C28130ac mo71782b(View view) {
        return new C37165b(view);
    }

    /* renamed from: a */
    private static int m92544a(String str) {
        if (C28494m.m93643c(str)) {
            return R.layout.a1g;
        }
        if (C28494m.m93642b(str)) {
            return R.layout.a1f;
        }
        if (C28494m.m93640a(str)) {
            return R.layout.ud;
        }
        if (C28494m.m93641b()) {
            return R.layout.vf;
        }
        if (C28494m.m93639a()) {
            return R.layout.vg;
        }
        return R.layout.ve;
    }

    /* renamed from: a */
    public final View mo71776a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.vb, viewGroup, false);
    }

    /* renamed from: d */
    public final View mo71784d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.vi, viewGroup, false);
    }

    /* renamed from: b */
    public final View mo71781b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).inflateFamiliarFullFeedVideoView(layoutInflater, viewGroup);
    }

    /* renamed from: c */
    public final View mo71783c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).inflateFamiliarFullFeedImageView(layoutInflater, viewGroup);
    }

    /* renamed from: a */
    public final View mo71777a(LayoutInflater layoutInflater, String str, ViewGroup viewGroup) {
        return layoutInflater.inflate(m92544a(str), viewGroup, false);
    }

    /* renamed from: a */
    public final C28130ac mo71780a(View view, C28343z<C28318an> zVar, String str, long j) {
        if (C28494m.m93643c(str)) {
            return new C28190r(view, zVar);
        }
        if (C28494m.m93642b(str)) {
            return new C28189q(view, zVar);
        }
        if (C28494m.m93640a(str)) {
            return new C28172c(view, zVar, Long.valueOf(j), str);
        }
        if (C28494m.m93641b()) {
            return new C28187o(view, zVar);
        }
        if (C28494m.m93639a()) {
            return new C28188p(view, zVar);
        }
        return new FeedLiveViewHolderOld(view, zVar);
    }

    /* renamed from: a */
    public final C28130ac mo71778a(Context context, int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        C25153e eVar = new C25153e(context, i, view, zVar, str, onTouchListener, fragment, i2);
        return eVar;
    }
}
