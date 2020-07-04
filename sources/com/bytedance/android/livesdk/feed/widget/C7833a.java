package com.bytedance.android.livesdk.feed.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.android.livesdk.feed.tab.p365c.C7776a;

/* renamed from: com.bytedance.android.livesdk.feed.widget.a */
final /* synthetic */ class C7833a implements OnClickListener {

    /* renamed from: a */
    private final LiveTabIndicator f21138a;

    /* renamed from: b */
    private final int f21139b;

    /* renamed from: c */
    private final C5989f f21140c;

    /* renamed from: d */
    private final C7776a f21141d;

    C7833a(LiveTabIndicator liveTabIndicator, int i, C5989f fVar, C7776a aVar) {
        this.f21138a = liveTabIndicator;
        this.f21139b = i;
        this.f21140c = fVar;
        this.f21141d = aVar;
    }

    public final void onClick(View view) {
        this.f21138a.mo20518a(this.f21139b, this.f21140c, this.f21141d, view);
    }
}
