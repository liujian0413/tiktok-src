package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.C23073b;
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

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.HotMusicListFragment */
public class HotMusicListFragment extends BaseMusicListFragment implements C23843a<Music>, C6905a {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo61917a(Object obj, int i) {
    }

    /* renamed from: b */
    public final String mo60114b() {
        return "hot_music_list_data";
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
        this.f63049h.mo61952f(0, 20);
    }

    /* renamed from: r */
    public final void mo61918r() {
        if (this.f63049h != null) {
            this.f63049h.mo61952f(0, 20);
        }
    }

    /* renamed from: s */
    public final void mo61919s() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public final void bd_() {
        if (this.f63051j != null) {
            this.f63051j.mo60120a();
        }
        if (this.f63049h != null && this.f63050i != null) {
            this.f63049h.mo61956h(((Integer) ((C23073b) this.f63050i.mo60135a(mo60114b())).mo60119a("list_cursor")).intValue(), 20);
        }
    }

    /* renamed from: a */
    public static Fragment m78317a(int i) {
        HotMusicListFragment hotMusicListFragment = new HotMusicListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        hotMusicListFragment.setArguments(bundle);
        return hotMusicListFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23074c mo61998b(View view) {
        C23966k kVar = new C23966k(getContext(), view, this, R.string.cmf, this, this, this.f63052k);
        kVar.mo62174a((int) R.string.dc2);
        kVar.mo62176a((C23844b) this);
        if (getContext() != null) {
            kVar.mo62175a(new C23819a("change_music_page_detail", getContext().getString(R.string.dc2), "click_more", C23888c.m78180a()));
        }
        kVar.mo62112a((C23971a) new C23932h(this), 10);
        return kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62037a(int i, int i2) {
        bd_();
    }
}
