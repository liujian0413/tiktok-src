package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicSheetAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23843a;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.l */
public final class C23967l extends BaseMusicListView<MusicCollectionItem> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final BaseAdapter mo62114f() {
        MusicSheetAdapter musicSheetAdapter = new MusicSheetAdapter();
        musicSheetAdapter.f62941a = new C23968m(this);
        return musicSheetAdapter;
    }

    /* renamed from: a */
    public final void mo62181a(int i) {
        this.mTitleBar.setTitle((int) R.string.cho);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62182a(MusicCollectionItem musicCollectionItem, int i) {
        if (this.f63259b != null) {
            this.f63259b.mo61917a(musicCollectionItem, i);
        }
    }

    public C23967l(Context context, View view, C23843a aVar, C6905a aVar2, int i) {
        super(context, view, aVar, R.string.cmf, aVar2, null, i);
    }
}
