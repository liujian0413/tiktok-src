package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentStatePagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.view.View;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C42107a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerPagerAdapter */
public class InfoStickerPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a */
    public boolean f105694a;

    /* renamed from: b */
    public boolean f105695b;

    /* renamed from: c */
    private ViewPager f105696c;

    public int getCount() {
        return 2;
    }

    /* renamed from: a */
    public final View mo100778a(int i) {
        int i2;
        AVDmtTabItemView a = C42107a.m134029a(this.f105696c.getContext(), true);
        if (i == 0) {
            i2 = R.string.e1d;
        } else {
            i2 = R.string.bj0;
        }
        a.setText(i2);
        a.setOnClickListener(new C40811q(this, i));
        return a;
    }

    public Fragment getItem(int i) {
        InfoStickerFragment infoStickerFragment;
        if (i == 1) {
            infoStickerFragment = InfoStickerEmojiFragment.m129952a();
        } else {
            infoStickerFragment = InfoStickerFragment.m129965g();
        }
        infoStickerFragment.f105666i = this.f105694a;
        infoStickerFragment.f105667j = this.f105695b;
        return infoStickerFragment;
    }

    public InfoStickerPagerAdapter(C0608j jVar, ViewPager viewPager) {
        super(jVar);
        this.f105696c = viewPager;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100779a(int i, View view) {
        this.f105696c.setCurrentItem(i, true);
    }
}
