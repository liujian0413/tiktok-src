package com.p280ss.android.ugc.aweme.emoji.emojichoose;

import android.view.View;
import com.p280ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.l */
final /* synthetic */ class C27597l implements Runnable {

    /* renamed from: a */
    private final C27592i f72736a;

    /* renamed from: b */
    private final List f72737b;

    /* renamed from: c */
    private final List f72738c;

    /* renamed from: d */
    private final View f72739d;

    /* renamed from: e */
    private final SwipeControlledViewPager f72740e;

    C27597l(C27592i iVar, List list, List list2, View view, SwipeControlledViewPager swipeControlledViewPager) {
        this.f72736a = iVar;
        this.f72737b = list;
        this.f72738c = list2;
        this.f72739d = view;
        this.f72740e = swipeControlledViewPager;
    }

    public final void run() {
        this.f72736a.mo70835a(this.f72737b, this.f72738c, this.f72739d, this.f72740e);
    }
}
