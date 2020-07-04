package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.arch.C23074c;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23843a;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23966k;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23969n.C23971a;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.LyricMusicListFragment */
public class LyricMusicListFragment extends BaseMusicListFragment implements C23843a<Music>, C6905a {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo61917a(Object obj, int i) {
    }

    /* renamed from: b */
    public final String mo60114b() {
        return "hot_music_list_data";
    }

    public final void bd_() {
    }

    /* renamed from: c */
    public final String mo60115c() {
        return "refresh_status_hot_music_list";
    }

    /* renamed from: d */
    public final String mo60116d() {
        return "loadmore_status_hot_music_list";
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo62004n() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final String mo62005o() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo62007p() {
        return R.layout.p7;
    }

    /* renamed from: a */
    public final void mo60113a() {
        super.mo60113a();
        this.f63049h.mo61954g(0, 20);
    }

    /* renamed from: r */
    public final void mo61918r() {
        if (this.f63049h != null) {
            this.f63049h.mo61954g(0, 20);
        }
    }

    /* renamed from: s */
    public final void mo61919s() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* renamed from: a */
    public static Fragment m78367a(int i) {
        LyricMusicListFragment lyricMusicListFragment = new LyricMusicListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        lyricMusicListFragment.setArguments(bundle);
        return lyricMusicListFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23074c mo61998b(View view) {
        C23966k kVar = new C23966k(getContext(), view, this, R.string.cmf, this, this, this.f63052k, true);
        kVar.mo62174a((int) R.string.dc2);
        kVar.mo62180g();
        kVar.mo62176a((C23844b) this);
        if (getContext() != null) {
            kVar.mo62175a(new C23819a("lyricsticker_song_search", getContext().getString(R.string.dc2), "click_lyric", C23888c.m78180a()));
        }
        kVar.mo62112a((C23971a) new C23935k(this), 10);
        return kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62040a(int i, int i2) {
        bd_();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo62007p(), viewGroup, false);
        inflate.findViewById(R.id.ap5).setBackgroundResource(R.color.ac4);
        inflate.findViewById(R.id.c1y).setBackgroundResource(R.color.ac4);
        return inflate;
    }
}
