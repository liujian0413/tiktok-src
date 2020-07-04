package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1278j;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.CategoryScrollerEffectStickerModule$onCreate$1 */
public final class CategoryScrollerEffectStickerModule$onCreate$1 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ C40851a f106185a;

    CategoryScrollerEffectStickerModule$onCreate$1(C40851a aVar) {
        this.f106185a = aVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        C1278j jVar = this.f106185a.f106323p;
        if (jVar != null) {
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106185a.f106320m;
            if (aVDmtPanelRecyleView != null) {
                aVDmtPanelRecyleView.mo5543b(jVar);
            }
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.f106185a.mo101152i();
        }
    }
}
