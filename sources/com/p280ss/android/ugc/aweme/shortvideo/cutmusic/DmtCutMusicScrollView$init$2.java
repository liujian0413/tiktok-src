package com.p280ss.android.ugc.aweme.shortvideo.cutmusic;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView.C39297a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView$init$2 */
public final class DmtCutMusicScrollView$init$2 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ DmtCutMusicScrollView f102069a;

    DmtCutMusicScrollView$init$2(DmtCutMusicScrollView dmtCutMusicScrollView) {
        this.f102069a = dmtCutMusicScrollView;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        if (i == 0 && this.f102069a.f102061N != null && this.f102069a.f102062O) {
            C39297a aVar = this.f102069a.f102061N;
            if (aVar == null) {
                C7573i.m23580a();
            }
            aVar.mo97840a((this.f102069a.getScrollDx() * 1.0f) / ((float) DmtCutMusicScrollView.m125571a(this.f102069a).getMeasuredWidth()));
            this.f102069a.f102062O = false;
            this.f102069a.f102063P = false;
        }
        super.onScrollStateChanged(recyclerView, i);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f102069a;
        dmtCutMusicScrollView.setScrollDx(dmtCutMusicScrollView.getScrollDx() + ((float) i));
        if (this.f102069a.f102061N != null && this.f102069a.f102063P) {
            float scrollDx = (this.f102069a.getScrollDx() * 1.0f) / ((float) DmtCutMusicScrollView.m125571a(this.f102069a).getMeasuredWidth());
            C39297a aVar = this.f102069a.f102061N;
            if (aVar == null) {
                C7573i.m23580a();
            }
            aVar.mo97841b(scrollDx);
        }
    }
}
