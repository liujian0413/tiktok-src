package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1282n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.StickerFragment */
public class StickerFragment extends Fragment {

    /* renamed from: a */
    private ShortVideoContext f105593a;

    /* renamed from: e */
    protected int f105594e;

    /* renamed from: f */
    protected C1282n f105595f;

    /* renamed from: g */
    protected EffectStickerManager f105596g;

    /* renamed from: h */
    protected String f105597h;

    /* renamed from: i */
    protected RecyclerView f105598i;

    /* renamed from: j */
    protected GridLayoutManager f105599j;

    /* renamed from: k */
    protected STATUS f105600k;

    /* renamed from: l */
    protected DmtStatusView f105601l;

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f105598i.mo5560d();
    }

    /* renamed from: a */
    private int mo100650a() {
        return ((EffectStickerViewModel) C0069x.m159a(getActivity()).mo147a(EffectStickerViewModel.class)).mo101285a().mo101198g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final JSONObject mo100735c() {
        String str;
        C6909j jVar = new C6909j();
        String str2 = "position";
        if (this.f105596g.mo100221b().equals("livestreaming")) {
            str = "live_set";
        } else {
            str = "shoot_page";
        }
        C6909j a = jVar.mo16966a(str2, str);
        if (mo100650a() == 1) {
            a.mo16966a("is_photo", "1");
        } else {
            a.mo16966a("is_photo", "0");
        }
        return a.mo16967a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C22984d mo100736d() {
        if (this.f105593a == null) {
            return null;
        }
        return C22984d.m75611a().mo59973a("enter_method", "click_main_panel").mo59973a("creation_id", this.f105593a.f99787w).mo59973a("shoot_way", this.f105593a.f99788x).mo59970a("draft_id", this.f105593a.f99790z);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f105599j = new WrapGridLayoutManager(getContext(), 5, 1, false);
        this.f105598i.setLayoutManager(this.f105599j);
        this.f105598i.setRecycledViewPool(this.f105595f);
        this.f105598i.setItemViewCacheSize(5);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.x1, viewGroup, false);
        this.f105598i = (RecyclerView) inflate.findViewById(R.id.db3);
        return inflate;
    }

    /* renamed from: a */
    public final void mo100734a(EffectStickerManager effectStickerManager, String str, C1282n nVar, int i, ShortVideoContext shortVideoContext) {
        this.f105594e = i;
        this.f105597h = str;
        this.f105595f = nVar;
        this.f105596g = effectStickerManager;
        this.f105593a = shortVideoContext;
    }
}
