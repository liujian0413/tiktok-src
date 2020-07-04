package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1278j;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.FavoriteScrollerEffectStickerModule$registerRecyclerMobListeners$1 */
public final class C40833x8cb7df70 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ C40871b f106187a;

    C40833x8cb7df70(C40871b bVar) {
        this.f106187a = bVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        C1278j jVar = this.f106187a.f106323p;
        if (jVar != null) {
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106187a.f106320m;
            if (aVDmtPanelRecyleView != null) {
                aVDmtPanelRecyleView.mo5543b(jVar);
            }
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.f106187a.mo101152i();
        }
    }
}
