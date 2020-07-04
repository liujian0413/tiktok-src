package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.p022v4.app.FragmentActivity;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.utils.C42923ak;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerEmojiFragment */
public class InfoStickerEmojiFragment extends InfoStickerFragment {

    /* renamed from: a */
    protected int f105651a;

    /* renamed from: b */
    protected boolean f105652b;

    /* renamed from: k */
    private CategoryEffectModel f105653k;

    /* renamed from: l */
    private PanelInfoModel f105654l;

    /* renamed from: m */
    private String f105655m;

    /* renamed from: n */
    private int f105656n;

    /* renamed from: o */
    private String f105657o;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo100765c() {
        m129953j();
    }

    /* renamed from: a */
    public static InfoStickerEmojiFragment m129952a() {
        return new InfoStickerEmojiFragment();
    }

    /* renamed from: j */
    private void m129953j() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C40805n.m130407a(activity).mo100813a("emoji-android", "", 75, 0).observe(activity, new C40700g(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void mo100768f() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C40805n.m130407a(activity).mo100814a("emoji-android", this.f105655m, 75, this.f105651a, this.f105656n, this.f105657o).observe(activity, new C40701h(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo100763b() {
        this.f105664g = new WrapGridLayoutManager(getContext(), 5, 1, false);
        this.f105661d.setItemViewCacheSize(5);
        this.f105661d.setLayoutManager(this.f105664g);
        if (this.f105661d.getAdapter() == null) {
            this.f105660c = m129951a(this.f105663f);
            this.f105661d.setAdapter(this.f105660c);
        } else {
            this.f105660c = (InfoStickerAdapterV2) this.f105661d.getAdapter();
        }
        m129953j();
        this.f105660c.mo66516d(true);
        this.f105660c.f105635b = this.f105666i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo100766d() {
        if (!this.f105652b) {
            super.mo100766d();
        } else if (this.f105665h == STATUS.LOADING) {
            this.f105660c.ag_();
        } else if (this.f105665h == STATUS.ERROR) {
            this.f105660c.mo66507h();
        } else {
            if (this.f105665h == STATUS.SUCCESS) {
                if (this.f105653k == null || C6311g.m19573a(this.f105653k.effects)) {
                    this.f105660c.ah_();
                    return;
                }
                this.f105660c.ai_();
                int i = this.f105651a;
                this.f105651a = this.f105653k.cursor;
                this.f105656n = this.f105653k.sorting_position;
                this.f105657o = this.f105653k.version;
                ((InfoStickerEmojiAdapterV2) this.f105660c).mo100761a(this.f105653k);
                if (C42923ak.m136268a()) {
                    this.f105660c.notifyDataSetChanged();
                    return;
                }
                this.f105660c.notifyItemRangeChanged(i, (this.f105651a - i) + 1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo100767e() {
        if (this.f105654l == null || this.f105654l.category_effects == null) {
            this.f105662e.mo25943g();
            return;
        }
        this.f105662e.mo25939d();
        this.f105652b = true;
        this.f105653k = this.f105654l.category_effects;
        this.f105655m = this.f105653k.category_key;
        this.f105651a = this.f105653k.cursor;
        this.f105656n = this.f105653k.sorting_position;
        this.f105657o = this.f105653k.version;
        ((InfoStickerEmojiAdapterV2) this.f105660c).mo100761a(this.f105653k);
        if (C42923ak.m136268a()) {
            this.f105660c.notifyDataSetChanged();
        } else {
            this.f105660c.notifyItemRangeChanged(0, this.f105651a);
        }
        this.f105660c.mo66504a((C6905a) new C40702i(this));
    }

    /* renamed from: a */
    private InfoStickerAdapterV2 m129951a(String str) {
        return new InfoStickerEmojiAdapterV2(getActivity(), str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100762a(LiveDataWrapper liveDataWrapper) {
        if (liveDataWrapper != null) {
            this.f105665h = liveDataWrapper.f88768b;
            this.f105653k = (CategoryEffectModel) liveDataWrapper.f88767a;
            mo100766d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo100764b(LiveDataWrapper liveDataWrapper) {
        if (liveDataWrapper != null) {
            this.f105665h = liveDataWrapper.f88768b;
            this.f105654l = (PanelInfoModel) liveDataWrapper.f88767a;
            mo100766d();
        }
    }
}
