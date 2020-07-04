package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.LiveData;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40949u;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1603e.C40557c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1603e.C40565d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.StickerFetchViewModel */
public class StickerFetchViewModel extends C0063u {

    /* renamed from: a */
    private C27481e f106554a;

    /* renamed from: b */
    private C0052o<C40949u> f106555b;

    public void onCleared() {
        super.onCleared();
        if (this.f106554a != null) {
            this.f106554a.destroy();
        }
    }

    /* renamed from: a */
    public final LiveData<C40949u> mo101304a(C27481e eVar, C40565d dVar) {
        if (this.f106555b == null) {
            this.f106555b = new C0052o<>();
            this.f106554a = eVar;
            C40557c cVar = new C40557c(eVar);
            cVar.mo100630a(dVar);
            this.f106555b.setValue(cVar);
        }
        return this.f106555b;
    }
}
