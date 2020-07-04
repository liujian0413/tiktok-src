package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p280ss.android.ugc.aweme.detail.DetailFeedPagerAdapter;
import com.p280ss.android.ugc.aweme.detail.p1167ui.C26191b;
import com.p280ss.android.ugc.aweme.detail.p1167ui.C26192c;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoveryV4DetailFeedPagerAdapter */
public final class DiscoveryV4DetailFeedPagerAdapter extends DetailFeedPagerAdapter {

    /* renamed from: l */
    private String f70951l;

    /* renamed from: m */
    private String f70952m;

    /* renamed from: n */
    private String f70953n;

    /* renamed from: o */
    private String f70954o;

    /* renamed from: a */
    public final void mo69574a(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "playListType");
        C7573i.m23587b(str2, "playListIdKey");
        C7573i.m23587b(str3, "playListId");
        C7573i.m23587b(str4, "tabName");
        this.f70953n = str3;
        this.f70951l = str;
        this.f70952m = str2;
        this.f70954o = str4;
    }

    /* renamed from: a */
    public final C28130ac mo67564a(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(zVar, "listener");
        C7573i.m23587b(onTouchListener, "tapTouchListener");
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(baseFeedPageParams, "baseFeedPageParams");
        C26192c cVar = new C26192c(view, zVar, onTouchListener, fragment, baseFeedPageParams, this.f73987c, this.f73989e);
        cVar.mo71668a(this.f70951l, this.f70952m, this.f70953n, this.f70954o);
        C28130ac acVar = cVar;
        mo71586a(acVar);
        return acVar;
    }

    public DiscoveryV4DetailFeedPagerAdapter(Context context, LayoutInflater layoutInflater, int i, C28343z<C28318an> zVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        super(context, layoutInflater, i, zVar, fragment, onTouchListener, baseFeedPageParams);
    }

    /* renamed from: a */
    public final C28130ac mo67563a(int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        View view2 = view;
        C7573i.m23587b(view, "view");
        C28343z<C28318an> zVar2 = zVar;
        C7573i.m23587b(zVar, "listener");
        String str2 = str;
        C7573i.m23587b(str, "eventType");
        OnTouchListener onTouchListener2 = onTouchListener;
        C7573i.m23587b(onTouchListener2, "tapTouchListener");
        Fragment fragment2 = fragment;
        C7573i.m23587b(fragment2, "fragment");
        C26191b bVar = new C26191b(i, view2, zVar2, str2, onTouchListener2, fragment2, i2, null);
        bVar.mo71527a(this.f70951l, this.f70952m, this.f70953n, this.f70954o);
        return bVar;
    }
}
