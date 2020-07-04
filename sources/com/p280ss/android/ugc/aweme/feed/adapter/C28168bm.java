package com.p280ss.android.ugc.aweme.feed.adapter;

import android.support.p022v4.app.Fragment;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24716aj;
import com.p280ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.feedwidget.AbsVSViewWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoFeedTagWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoHotSearchBarWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoMixBarWidget;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bm */
public final class C28168bm implements C28134ag {
    /* renamed from: a */
    public final Widget mo71731a() {
        return new VideoFeedTagWidget();
    }

    /* renamed from: b */
    public final Widget mo71735b() {
        return new VideoHotSearchBarWidget();
    }

    /* renamed from: c */
    public final Widget mo71736c() {
        return new VideoMixBarWidget();
    }

    /* renamed from: d */
    public final Widget mo71737d() {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getVideoFamiliarBarrageWidget();
    }

    /* renamed from: e */
    public final Widget mo71738e() {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getVideoUserInfoWidget();
    }

    /* renamed from: f */
    public final Widget mo71739f() {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getVideoBottomInputWidget();
    }

    /* renamed from: a */
    public final AbsVSViewWidget mo71733a(int i) {
        return (AbsVSViewWidget) BusinessComponentServiceUtils.getBusinessBridgeService().mo61471c().mo61472a(i);
    }

    /* renamed from: a */
    public final boolean mo71734a(Aweme aweme) {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).shouldShowVSButton(aweme);
    }

    /* renamed from: a */
    public final C24716aj mo71732a(C28130ac acVar, View view, int i, String str, C28343z<C28318an> zVar, Fragment fragment) {
        CommerceVideoDelegate commerceVideoDelegate = new CommerceVideoDelegate(acVar, view, i, str, zVar, fragment);
        return commerceVideoDelegate;
    }
}
