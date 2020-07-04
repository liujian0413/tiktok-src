package com.p280ss.android.ugc.aweme.effect;

import android.content.Context;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.effect.p1194a.C27359a;
import com.p280ss.android.ugc.aweme.effect.p1194a.C27359a.C27361b;
import com.p280ss.android.ugc.aweme.effect.p1194a.p1195a.C27371c;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectTabPagerAdapter */
public class EffectTabPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a */
    public Fragment f72127a;

    /* renamed from: b */
    public List<Effect> f72128b = new ArrayList();

    /* renamed from: c */
    public C27359a f72129c;

    /* renamed from: d */
    public boolean f72130d = false;

    /* renamed from: e */
    private List<EffectCategoryResponse> f72131e;

    /* renamed from: f */
    private Context f72132f;

    /* renamed from: g */
    private C27371c f72133g = new C27371c() {
        /* renamed from: a */
        public final boolean mo70395a() {
            return false;
        }

        /* renamed from: a */
        public final Effect mo70394a(Queue<Effect> queue) {
            for (int i = 0; i < EffectTabPagerAdapter.this.f72128b.size(); i++) {
                Effect effect = (Effect) EffectTabPagerAdapter.this.f72128b.get(i);
                boolean a = C27359a.m89722a().mo70640a(effect);
                boolean contains = queue.contains(effect);
                if (!a && !contains) {
                    return effect;
                }
            }
            return null;
        }
    };

    /* renamed from: a */
    public final void mo70392a() {
        this.f72129c.mo70467c();
    }

    public int getCount() {
        return this.f72131e.size();
    }

    /* renamed from: b */
    private void m89627b() {
        if (this.f72131e != null) {
            this.f72128b.clear();
            ArrayList arrayList = new ArrayList();
            for (EffectCategoryResponse effectCategoryResponse : this.f72131e) {
                List<Effect> list = effectCategoryResponse.totalEffects;
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
            int intValue = C30199h.m98861a().getEditEffectAutoDownloadSize().intValue();
            if (intValue >= 0) {
                int i = 0;
                while (i < intValue && i < arrayList.size()) {
                    this.f72128b.add(arrayList.get(i));
                    i++;
                }
            } else {
                this.f72128b.addAll(arrayList);
            }
            this.f72129c.mo70462a(this.f72128b);
        }
    }

    /* renamed from: a */
    public final void mo70393a(List<EffectCategoryResponse> list) {
        if (list != null) {
            this.f72131e = list;
            m89627b();
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final EffectCategoryResponse mo70391a(int i) {
        if (i < this.f72131e.size()) {
            return (EffectCategoryResponse) this.f72131e.get(i);
        }
        return null;
    }

    public CharSequence getPageTitle(int i) {
        if (i == getCount() - 1) {
            return this.f72132f.getString(R.string.e57);
        }
        return ((EffectCategoryResponse) this.f72131e.get(i)).name;
    }

    public Fragment getItem(int i) {
        if (i == getCount() - 1 && !this.f72130d) {
            return new TimeEffectTabFragment();
        }
        if (C27431j.m89899b(((EffectCategoryResponse) this.f72131e.get(i)).key)) {
            StickerEffectTabFragment a = StickerEffectTabFragment.m89651a(((EffectCategoryResponse) this.f72131e.get(i)).totalEffects, ((EffectCategoryResponse) this.f72131e.get(i)).key);
            a.f72095e = this.f72129c;
            return a;
        }
        FilterEffectTabFragment a2 = FilterEffectTabFragment.m89634a(((EffectCategoryResponse) this.f72131e.get(i)).totalEffects, ((EffectCategoryResponse) this.f72131e.get(i)).key);
        a2.f72095e = this.f72129c;
        return a2;
    }

    EffectTabPagerAdapter(C0608j jVar, Context context) {
        super(jVar);
        this.f72132f = context;
        this.f72129c = new C27361b().mo70469a(Integer.valueOf(3)).mo70468a(this.f72133g).mo70470a();
        C35574k.m114859a().mo70101p();
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f72127a = (Fragment) obj;
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
