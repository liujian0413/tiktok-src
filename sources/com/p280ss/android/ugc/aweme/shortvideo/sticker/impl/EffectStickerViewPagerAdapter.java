package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentStatePagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p029v7.widget.RecyclerView.C1282n;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.account.C21164d;
import com.p280ss.android.ugc.aweme.account.C21164d.C21165a;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40954b;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C42107a;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryIconsModel;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewPagerAdapter */
public class EffectStickerViewPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a */
    protected EffectStickerManager f105547a;

    /* renamed from: b */
    protected C1282n f105548b = new C1282n();

    /* renamed from: c */
    protected ViewPager f105549c;

    /* renamed from: d */
    protected String f105550d;

    /* renamed from: e */
    protected ShortVideoContext f105551e;

    /* renamed from: f */
    public Activity f105552f;

    /* renamed from: g */
    public C40954b f105553g;

    public int getItemPosition(Object obj) {
        return -2;
    }

    public int getCount() {
        StringBuilder sb = new StringBuilder("effect page adapter instantiate: ");
        sb.append(this.f105547a.mo100228c().size());
        C42880h.m136156a(sb.toString());
        return this.f105547a.mo100228c().size();
    }

    public Fragment getItem(int i) {
        return mo100720a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Fragment mo100720a(int i) {
        StickerFragment stickerFragment;
        if (i == 0) {
            stickerFragment = new FavoriteStickerFragment();
        } else {
            stickerFragment = new CategoryStickerFragment();
            ((CategoryStickerFragment) stickerFragment).f105453b = this.f105553g;
        }
        stickerFragment.mo100734a(this.f105547a, this.f105550d, this.f105548b, i, this.f105551e);
        return stickerFragment;
    }

    /* renamed from: b */
    public View mo100721b(final int i) {
        final AVDmtTabItemView a = C42107a.m134028a(this.f105552f);
        a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                Bundle bundle;
                ClickInstrumentation.onClick(view);
                String string = EffectStickerViewPagerAdapter.this.f105552f.getString(R.string.b4r);
                if (i != 0 || C35574k.m114859a().mo70073G().mo57090c()) {
                    EffectStickerViewPagerAdapter.this.f105549c.setCurrentItem(i, true);
                    C42962b bVar = C42962b.f111525a;
                    MobClick value = MobClick.obtain().setEventName("click_prop_tab").setLabelName("prop").setValue(((EffectCategoryModel) EffectStickerViewPagerAdapter.this.f105547a.mo100228c().get(i)).f113499id);
                    C6909j jVar = new C6909j();
                    String str2 = "position";
                    if (EffectStickerViewPagerAdapter.this.f105547a.mo100221b().equals("livestreaming")) {
                        str = "live_set";
                    } else {
                        str = "shoot_page";
                    }
                    bVar.onEvent(value.setJsonObject(jVar.mo16966a(str2, str).mo16967a()));
                    return;
                }
                C21164d G = C35574k.m114859a().mo70073G();
                Activity activity = EffectStickerViewPagerAdapter.this.f105552f;
                String str3 = "";
                String str4 = "click_my_prop";
                if (C30538p.m99745a()) {
                    bundle = null;
                } else {
                    bundle = C42914ab.m136242a().mo104633a("login_title", string).f111445a;
                }
                G.mo57085a(activity, str3, str4, bundle, (C21165a) new C21165a() {
                    /* renamed from: b */
                    public final void mo57094b() {
                    }

                    /* renamed from: a */
                    public final void mo57093a() {
                        EffectStickerViewPagerAdapter.this.f105547a.mo100235f();
                    }
                });
            }
        });
        EffectCategoryModel effectCategoryModel = (EffectCategoryModel) this.f105547a.mo100228c().get(i);
        EffectCategoryIconsModel effectCategoryIconsModel = effectCategoryModel.icon;
        if (effectCategoryIconsModel == null || TextUtils.isEmpty(effectCategoryIconsModel.uri)) {
            a.setText(effectCategoryModel.name);
        } else {
            a.mo103523a(effectCategoryModel.icon.uri, (int) R.drawable.aiu);
        }
        this.f105547a.f104787e.mo70634a(effectCategoryModel.f113499id, effectCategoryModel.tags, effectCategoryModel.tags_updated_at, (C43765o) new C43765o() {
            /* renamed from: b */
            public final void mo9279b() {
            }

            /* renamed from: a */
            public final void mo9278a() {
                a.mo103525b(true);
            }
        });
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, i, obj);
        StringBuilder sb = new StringBuilder("page adapter destroy: ");
        sb.append(this.f105547a.mo100228c().size());
        sb.append(" position:");
        sb.append(i);
        C42880h.m136156a(sb.toString());
    }

    EffectStickerViewPagerAdapter(C0608j jVar, ViewPager viewPager, EffectStickerManager effectStickerManager, String str, ShortVideoContext shortVideoContext, Activity activity) {
        super(jVar);
        this.f105549c = viewPager;
        this.f105550d = str;
        this.f105547a = effectStickerManager;
        this.f105551e = shortVideoContext;
        this.f105552f = activity;
    }
}
