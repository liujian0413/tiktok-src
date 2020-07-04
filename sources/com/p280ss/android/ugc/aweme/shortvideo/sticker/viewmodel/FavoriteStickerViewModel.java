package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.LiveData;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43761k;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel */
public class FavoriteStickerViewModel extends C0063u {

    /* renamed from: a */
    public C40984a f106548a;

    /* renamed from: b */
    public List<Effect> f106549b = new LinkedList();

    /* renamed from: c */
    public FetchFavoriteListResponse f106550c;

    /* renamed from: d */
    public C0052o<LiveDataWrapper<FetchFavoriteListResponse>> f106551d = new C0052o<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel$a */
    public interface C40984a {
        /* renamed from: a */
        void mo100670a(Effect effect);
    }

    public void onCleared() {
        super.onCleared();
        this.f106548a = null;
    }

    /* renamed from: a */
    public final void mo101298a(Effect effect) {
        if (effect != null) {
            if (this.f106548a != null) {
                this.f106548a.mo100670a(effect);
            }
            this.f106549b.add(0, effect);
            if (this.f106550c != null) {
                this.f106550c.setEffects(this.f106549b);
                this.f106551d.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, this.f106550c));
            }
        }
    }

    /* renamed from: b */
    public final void mo101299b(Effect effect) {
        if (effect != null) {
            this.f106549b.remove(effect);
            if (this.f106550c != null) {
                this.f106550c.setEffects(this.f106549b);
                this.f106551d.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, this.f106550c));
            }
        }
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<FetchFavoriteListResponse>> mo101297a(EffectPlatform effectPlatform, String str) {
        m130902b(effectPlatform, str);
        return this.f106551d;
    }

    /* renamed from: b */
    private void m130902b(EffectPlatform effectPlatform, String str) {
        effectPlatform.mo70624a(str, (C43761k) new C43761k() {
            /* renamed from: a */
            public final void mo101300a(C43726c cVar) {
                FavoriteStickerViewModel.this.f106551d.setValue(LiveDataWrapper.m109598a(STATUS.ERROR, cVar.f113222c));
            }

            /* renamed from: a */
            public final void mo101301a(FetchFavoriteListResponse fetchFavoriteListResponse) {
                FavoriteStickerViewModel.this.f106550c = fetchFavoriteListResponse;
                FavoriteStickerViewModel.this.f106549b = fetchFavoriteListResponse.getEffects();
                FavoriteStickerViewModel.this.f106551d.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, fetchFavoriteListResponse));
            }
        });
    }
}
