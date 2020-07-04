package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23843a;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.k */
public final class C23966k extends BaseMusicListView<MusicModel> {

    /* renamed from: g */
    boolean f63319g;

    /* renamed from: h */
    public long f63320h;

    /* renamed from: g */
    public final void mo62180g() {
        if (this.mTitleLayout != null) {
            this.mTitleLayout.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final BaseAdapter mo62114f() {
        MusicAdapter musicAdapter = new MusicAdapter(null, this.f63260c, false, this.f63263f);
        musicAdapter.f62923f = this.f63319g;
        musicAdapter.f62925h = this.f63261d;
        return musicAdapter;
    }

    /* renamed from: a */
    public final void mo62174a(int i) {
        this.mTitleBar.setTitle(i);
    }

    /* renamed from: a */
    public final void mo62175a(C23819a aVar) {
        if (this.f63258a instanceof MusicAdapter) {
            ((MusicAdapter) this.f63258a).f62922e = aVar;
        }
    }

    /* renamed from: b */
    public final void mo62179b(View view) {
        this.mStatusView.setBuilder(this.mStatusView.mo25937c().mo25963b(view));
    }

    /* renamed from: a */
    public final void mo62176a(C23844b bVar) {
        if (this.f63258a instanceof MusicAdapter) {
            ((MusicAdapter) this.f63258a).f62918a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo62177a(String str) {
        this.mTitleBar.setTitle((CharSequence) str);
    }

    /* renamed from: a */
    public final void mo62178a(boolean z) {
        this.f63319g = z;
        if (this.f63258a instanceof MusicAdapter) {
            ((MusicAdapter) this.f63258a).f62923f = this.f63319g;
        }
    }

    /* renamed from: a */
    public final void mo60121a(List<MusicModel> list, boolean z) {
        super.mo60121a(list, z);
        if (list != null && this.f63320h > 0) {
            C23888c.m78197b(System.currentTimeMillis() - this.f63320h);
        }
    }

    public C23966k(Context context, View view, C23843a aVar, int i, C6905a aVar2, C33746f<C23822c> fVar, int i2) {
        super(context, view, aVar, i, aVar2, fVar, i2);
    }

    public C23966k(Context context, View view, C23843a aVar, int i, C6905a aVar2, C33746f<C23822c> fVar, int i2, boolean z) {
        super(context, view, aVar, R.string.cmf, aVar2, fVar, i2, true);
    }
}
