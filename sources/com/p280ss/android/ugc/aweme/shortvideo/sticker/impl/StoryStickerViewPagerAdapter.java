package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.app.Activity;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager;
import android.view.View;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.StoryStickerViewPagerAdapter */
public class StoryStickerViewPagerAdapter extends EffectStickerViewPagerAdapter {
    /* renamed from: b */
    public final View mo100721b(int i) {
        View b = super.mo100721b(i);
        b.setOnClickListener(new C40640t(this, i));
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Fragment mo100720a(int i) {
        StoryCategoryStickerFragment storyCategoryStickerFragment = new StoryCategoryStickerFragment();
        storyCategoryStickerFragment.mo100734a(this.f105547a, this.f105550d, this.f105548b, i, this.f105551e);
        return storyCategoryStickerFragment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100746a(int i, View view) {
        String str;
        this.f105549c.setCurrentItem(i, true);
        C42962b bVar = C42962b.f111525a;
        MobClick value = MobClick.obtain().setEventName("click_prop_tab").setLabelName("prop").setValue(((EffectCategoryModel) this.f105547a.mo100228c().get(i)).f113499id);
        C6909j jVar = new C6909j();
        String str2 = "position";
        if (this.f105547a.mo100221b().equals("livestreaming")) {
            str = "live_set";
        } else {
            str = "shoot_page";
        }
        bVar.onEvent(value.setJsonObject(jVar.mo16966a(str2, str).mo16967a()));
    }

    StoryStickerViewPagerAdapter(C0608j jVar, ViewPager viewPager, EffectStickerManager effectStickerManager, String str, ShortVideoContext shortVideoContext, Activity activity) {
        super(jVar, viewPager, effectStickerManager, str, shortVideoContext, activity);
    }
}
