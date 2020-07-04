package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.arch.lifecycle.C0043i;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.arch.C23071a;
import com.p280ss.android.ugc.aweme.arch.C23071a.C23072a;
import com.p280ss.android.ugc.aweme.arch.C23073b;
import com.p280ss.android.ugc.aweme.arch.C23074c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23843a;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23853a;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23967l;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.MusicSheetFragment */
public class MusicSheetFragment extends AmeBaseFragment implements C23072a<MusicCollectionItem>, C23843a<MusicCollectionItem>, C6905a {

    /* renamed from: e */
    protected DataCenter f63117e;

    /* renamed from: f */
    protected C23074c<MusicCollectionItem> f63118f;

    /* renamed from: g */
    protected int f63119g;

    /* renamed from: h */
    private C23853a f63120h;

    /* renamed from: i */
    private C23071a f63121i;

    /* renamed from: j */
    private final int f63122j = PreloadTask.BYTE_UNIT_NUMBER;

    /* renamed from: b */
    public final String mo60114b() {
        return "music_sheet_list";
    }

    /* renamed from: c */
    public final String mo60115c() {
        return "refresh_status_music_sheet";
    }

    /* renamed from: d */
    public final String mo60116d() {
        return "loadmore_status_music_sheet";
    }

    /* renamed from: e */
    public final DataCenter mo60117e() {
        this.f63117e = DataCenter.m75849a(C23087c.m75886a((Fragment) this), (C0043i) this);
        return this.f63117e;
    }

    /* renamed from: r */
    public final void mo61918r() {
        if (this.f63120h != null) {
            this.f63120h.mo61943b(0, PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    /* renamed from: s */
    public final void mo61919s() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public final void bd_() {
        if (this.f63118f != null) {
            this.f63118f.mo60120a();
        }
        if (this.f63120h != null && this.f63117e != null) {
            this.f63120h.mo61946c(((Integer) ((C23073b) this.f63117e.mo60135a(mo60114b())).mo60119a("list_cursor")).intValue(), PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    /* renamed from: a */
    public final void mo60113a() {
        this.f63120h = new C23853a(getContext(), this.f63117e);
        this.f63120h.mo61943b(0, PreloadTask.BYTE_UNIT_NUMBER);
    }

    /* renamed from: a */
    public static Fragment m78396a(int i) {
        MusicSheetFragment musicSheetFragment = new MusicSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        musicSheetFragment.setArguments(bundle);
        return musicSheetFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f63119g = i;
    }

    /* renamed from: a */
    public final C23074c<MusicCollectionItem> mo60112a(View view) {
        C23967l lVar = new C23967l(getContext(), view, this, this, this.f63119g);
        lVar.mo62181a(R.string.cho);
        this.f63118f = lVar;
        return this.f63118f;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f63121i == null) {
            this.f63121i = new C23071a(this, this);
        }
        this.f63121i.mo60111a(view, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo61917a(MusicCollectionItem musicCollectionItem, int i) {
        if (musicCollectionItem != null && !TextUtils.isEmpty(musicCollectionItem.mcId)) {
            Intent intent = new Intent(getContext(), MusicDetailListActivity.class);
            intent.putExtra("music_type", 2);
            intent.putExtra("music_class_id", musicCollectionItem.mcId);
            intent.putExtra("music_class_name", musicCollectionItem.mcName);
            intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.f63119g);
            intent.putExtra("music_class_enter_method", "click_category_list");
            startActivityForResult(intent, 10001);
            C23888c.m78193a(musicCollectionItem.mcName, "click_category_list", "", "change_music_page_detail", musicCollectionItem.mcId);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.p7, viewGroup, false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }
}
