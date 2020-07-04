package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23843a;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.g */
public final class C23962g extends BaseMusicListView<MusicModel> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final BaseAdapter mo62114f() {
        MusicAdapter musicAdapter = new MusicAdapter(null, this.f63260c);
        musicAdapter.f62925h = this.f63261d;
        return musicAdapter;
    }

    /* renamed from: c */
    public final void mo60124c() {
        super.mo60124c();
        if (!C6399b.m19944t()) {
            C6379c.m19826a("show_collect_empty", C6869c.m21381a().mo16887a("show_collect_empty_page", "choose_music").mo16888b());
        }
    }

    /* renamed from: a */
    public final void mo62165a(C23819a aVar) {
        if (this.f63258a instanceof MusicAdapter) {
            ((MusicAdapter) this.f63258a).f62922e = aVar;
        }
    }

    /* renamed from: a */
    public final void mo62166a(C23844b bVar) {
        if (this.f63258a instanceof MusicAdapter) {
            ((MusicAdapter) this.f63258a).f62918a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo62167a(boolean z) {
        if (this.f63258a instanceof MusicAdapter) {
            ((MusicAdapter) this.f63258a).f62924g = z;
        }
    }

    public C23962g(Context context, View view, C23843a aVar, C6905a aVar2, C33746f<C23822c> fVar, int i) {
        super(context, view, aVar, R.string.cm1, aVar2, fVar, i);
        this.mTitleBar.setVisibility(8);
        ((MarginLayoutParams) this.mRecyclerView.getLayoutParams()).topMargin = (int) C9738o.m28708b(this.mRecyclerView.getContext(), 10.0f);
        this.mRecyclerView.setOverScrollMode(2);
        if (C6399b.m19944t()) {
            this.mStatusView.setBuilder(this.mStatusView.mo25937c().mo25963b(LayoutInflater.from(view.getContext()).inflate(R.layout.b2p, null)));
        }
    }
}
