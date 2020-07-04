package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23843a;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.i */
public final class C23964i extends BaseMusicListView<MusicModel> {

    /* renamed from: g */
    public long f63309g;

    /* renamed from: h */
    public final Context f63310h;

    /* renamed from: i */
    public final View f63311i;

    /* renamed from: j */
    public final C23843a<MusicModel> f63312j;

    /* renamed from: k */
    public final C33746f<C23822c> f63313k;

    /* renamed from: l */
    public final int f63314l;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final BaseAdapter<MusicModel> mo62114f() {
        MusicAdapter musicAdapter = new MusicAdapter(null, this.f63260c);
        musicAdapter.f62925h = this.f63261d;
        return musicAdapter;
    }

    /* renamed from: a */
    public final void mo62170a(boolean z) {
        BaseAdapter baseAdapter = this.f63258a;
        if (!(baseAdapter instanceof MusicAdapter)) {
            baseAdapter = null;
        }
        MusicAdapter musicAdapter = (MusicAdapter) baseAdapter;
        if (musicAdapter != null) {
            musicAdapter.f62924g = z;
        }
    }

    /* renamed from: a */
    public final void mo62168a(C23819a aVar) {
        C7573i.m23587b(aVar, "musicMobBean");
        BaseAdapter baseAdapter = this.f63258a;
        if (!(baseAdapter instanceof MusicAdapter)) {
            baseAdapter = null;
        }
        MusicAdapter musicAdapter = (MusicAdapter) baseAdapter;
        if (musicAdapter != null) {
            musicAdapter.f62922e = aVar;
        }
    }

    /* renamed from: a */
    public final void mo62169a(C23844b bVar) {
        C7573i.m23587b(bVar, "iSelectMusic");
        BaseAdapter baseAdapter = this.f63258a;
        if (!(baseAdapter instanceof MusicAdapter)) {
            baseAdapter = null;
        }
        MusicAdapter musicAdapter = (MusicAdapter) baseAdapter;
        if (musicAdapter != null) {
            musicAdapter.f62918a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo60121a(List<? extends MusicModel> list, boolean z) {
        super.mo60121a(list, z);
        if (list != null && this.f63309g > 0) {
            C23888c.m78197b(System.currentTimeMillis() - this.f63309g);
        }
    }

    public C23964i(Context context, View view, C23843a<MusicModel> aVar, C33746f<C23822c> fVar, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(aVar, "listener");
        C7573i.m23587b(fVar, "onInternalEventListener");
        super(context, view, aVar, R.string.c4k, null, fVar, i);
        this.f63310h = context;
        this.f63311i = view;
        this.f63312j = aVar;
        this.f63313k = fVar;
        this.f63314l = i;
        TextTitleBar textTitleBar = this.mTitleBar;
        C7573i.m23582a((Object) textTitleBar, "mTitleBar");
        textTitleBar.setVisibility(8);
        RecyclerView recyclerView = this.mRecyclerView;
        C7573i.m23582a((Object) recyclerView, "mRecyclerView");
        LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            RecyclerView recyclerView2 = this.mRecyclerView;
            C7573i.m23582a((Object) recyclerView2, "mRecyclerView");
            marginLayoutParams.topMargin = (int) C9738o.m28708b(recyclerView2.getContext(), 10.0f);
            RecyclerView recyclerView3 = this.mRecyclerView;
            C7573i.m23582a((Object) recyclerView3, "mRecyclerView");
            recyclerView3.setOverScrollMode(2);
            if (C6399b.m19944t()) {
                View inflate = LayoutInflater.from(this.f63311i.getContext()).inflate(R.layout.x_, null);
                DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(R.id.buf);
                if (C33703a.m108720d() == 2) {
                    C7573i.m23582a((Object) dmtTextView, "title");
                    dmtTextView.setText(this.f63311i.getContext().getString(R.string.chx));
                } else {
                    C7573i.m23582a((Object) dmtTextView, "title");
                    dmtTextView.setText(this.f63311i.getContext().getString(R.string.chw));
                }
                this.mStatusView.setBuilder(this.mStatusView.mo25937c().mo25963b(inflate));
                this.mStatusView.mo25939d();
                mo62113e();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
