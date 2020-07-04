package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.LiveData;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerViewModel */
public class InfoStickerViewModel extends C0063u {

    /* renamed from: a */
    public int f105746a;

    /* renamed from: b */
    public VideoPublishEditModel f105747b;

    /* renamed from: c */
    private InfoStickerRepository f105748c;

    /* renamed from: d */
    private C0052o<Effect> f105749d;

    /* renamed from: e */
    private LiveData<LiveDataWrapper<EffectChannelResponse>> f105750e;

    /* renamed from: f */
    private LiveData<LiveDataWrapper<PanelInfoModel>> f105751f;

    /* renamed from: g */
    private LiveData<LiveDataWrapper<CategoryPageModel>> f105752g;

    public void onCleared() {
        super.onCleared();
    }

    /* renamed from: a */
    public final void mo100817a(boolean z) {
        this.f105748c.mo100790a(z);
    }

    /* renamed from: c */
    public final void mo100822c() {
        mo100817a(false);
    }

    /* renamed from: d */
    public final C0052o<Effect> mo100823d() {
        if (this.f105749d == null) {
            this.f105749d = new C0052o<>();
        }
        return this.f105749d;
    }

    /* renamed from: b */
    public final void mo100821b() {
        this.f105748c.mo100793b();
    }

    /* renamed from: a */
    public final void mo100815a() {
        this.f105748c.mo100787a();
    }

    public InfoStickerViewModel(InfoStickerRepository infoStickerRepository) {
        this.f105748c = infoStickerRepository;
    }

    /* renamed from: b */
    public final LiveData<LiveDataWrapper<AVChallenge>> mo100818b(String str) {
        return InfoStickerRepository.m129989b(str);
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<Effect>> mo100809a(StickerWrapper stickerWrapper) {
        return this.f105748c.mo100781a(stickerWrapper.f104908a);
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<ProviderEffect>> mo100810a(ProviderEffect providerEffect) {
        return this.f105748c.mo100782a(providerEffect);
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<EffectChannelResponse>> mo100811a(String str) {
        if (this.f105750e == null || ((LiveDataWrapper) this.f105750e.getValue()).f88768b == STATUS.ERROR) {
            this.f105750e = this.f105748c.mo100783a(str);
        }
        return this.f105750e;
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<C40691ai>> mo100808a(double d, double d2) {
        return this.f105748c.mo100780a(d, d2);
    }

    /* renamed from: a */
    public final void mo100816a(List<Effect> list, boolean z) {
        if (!list.isEmpty()) {
            this.f105748c.mo100789a(list, z);
        }
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<ProviderEffectModel>> mo100812a(String str, int i, int i2) {
        return this.f105748c.mo100784a(str, i, 30);
    }

    /* renamed from: b */
    public final LiveData<LiveDataWrapper<ProviderEffectModel>> mo100819b(String str, String str2, int i, int i2) {
        return this.f105748c.mo100791b(str, str2, i, 30);
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<PanelInfoModel>> mo100813a(String str, String str2, int i, int i2) {
        if (this.f105751f == null || ((LiveDataWrapper) this.f105751f.getValue()).f88768b == STATUS.ERROR) {
            this.f105751f = this.f105748c.mo100785a(str, str2, 75, 0);
        }
        return this.f105751f;
    }

    /* renamed from: b */
    public final LiveData<LiveDataWrapper<CategoryPageModel>> mo100820b(String str, String str2, int i, int i2, int i3, String str3) {
        if (this.f105752g == null || ((LiveDataWrapper) this.f105752g.getValue()).f88768b == STATUS.ERROR) {
            this.f105752g = this.f105748c.mo100792b(str, str2, 75, 0, 0, str3);
        }
        return this.f105752g;
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<CategoryEffectModel>> mo100814a(String str, String str2, int i, int i2, int i3, String str3) {
        return this.f105748c.mo100786a(str, str2, 75, i2, i3, str3);
    }
}
