package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserFragment$recyclerViewScrollListener$1 */
public final class MediaBrowserFragment$recyclerViewScrollListener$1 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ MediaBrowserFragment f82569a;

    MediaBrowserFragment$recyclerViewScrollListener$1(MediaBrowserFragment mediaBrowserFragment) {
        this.f82569a = mediaBrowserFragment;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            MediaBrowserFragment.m102526c(this.f82569a).setCanDrag(true);
            this.f82569a.mo82249i();
            return;
        }
        if (i == 1) {
            MediaBrowserFragment.m102526c(this.f82569a).setCanDrag(false);
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (i > 0) {
            MediaBrowserFragment.m102526c(this.f82569a).setCanDrag(false);
        }
    }
}
