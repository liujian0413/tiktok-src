package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel */
public class TabSelectViewModel extends C0063u {

    /* renamed from: a */
    public C0052o<EffectCategoryModel> f106556a = new C0052o<>();

    /* renamed from: b */
    public C0052o<String> f106557b = new C0052o<>();

    /* renamed from: c */
    private C0052o<Integer> f106558c = new C0052o<>();

    /* renamed from: a */
    public final int mo101305a() {
        Integer num = (Integer) this.f106558c.getValue();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo101307a(String str) {
        this.f106557b.setValue(str);
    }

    /* renamed from: a */
    public final void mo101306a(EffectCategoryModel effectCategoryModel, int i) {
        this.f106556a.setValue(effectCategoryModel);
        this.f106558c.setValue(Integer.valueOf(i));
    }
}
