package com.p280ss.android.ugc.aweme.newfollow.model;

import android.graphics.Bitmap;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.UpLoadItemViewHolder;

/* renamed from: com.ss.android.ugc.aweme.newfollow.model.e */
public final class C34148e extends FollowFeed {

    /* renamed from: a */
    public int f88988a;

    /* renamed from: b */
    public Bitmap f88989b;

    /* renamed from: c */
    public boolean f88990c;

    /* renamed from: d */
    public UpLoadItemViewHolder f88991d;

    public C34148e() {
        setFeedType(TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN);
    }

    /* renamed from: a */
    public final void mo86842a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f88989b = bitmap;
        }
    }

    /* renamed from: a */
    public final void mo86841a(int i) {
        this.f88988a = i;
        if (this.f88991d != null) {
            this.f88991d.mo87022a(i);
        }
    }
}
