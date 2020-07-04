package com.p280ss.android.ugc.aweme.emoji.emojichoose;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.GridView;
import com.p280ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.k */
final /* synthetic */ class C27596k implements OnTouchListener {

    /* renamed from: a */
    private final C27592i f72731a;

    /* renamed from: b */
    private final List f72732b;

    /* renamed from: c */
    private final GridView f72733c;

    /* renamed from: d */
    private final List f72734d;

    /* renamed from: e */
    private final SwipeControlledViewPager f72735e;

    C27596k(C27592i iVar, List list, GridView gridView, List list2, SwipeControlledViewPager swipeControlledViewPager) {
        this.f72731a = iVar;
        this.f72732b = list;
        this.f72733c = gridView;
        this.f72734d = list2;
        this.f72735e = swipeControlledViewPager;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f72731a.mo70836a(this.f72732b, this.f72733c, this.f72734d, this.f72735e, view, motionEvent);
    }
}
