package com.p280ss.android.ugc.aweme.poi.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.f */
final /* synthetic */ class C35489f implements OnClickListener {

    /* renamed from: a */
    private final RatingBar f93128a;

    /* renamed from: b */
    private final ImageView f93129b;

    C35489f(RatingBar ratingBar, ImageView imageView) {
        this.f93128a = ratingBar;
        this.f93129b = imageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f93128a.mo90222a(this.f93129b, view);
    }
}
