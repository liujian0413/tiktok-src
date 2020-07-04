package com.bytedance.android.live.wallet.viewholder;

import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.base.model.banner.C2337a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.wallet.adapter.DiamondBannerPageAdapter;
import com.bytedance.android.live.wallet.view.RoundIndicatorView;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class WalletBannerViewHolder extends BaseViewHolder<List<C2337a>> {

    /* renamed from: b */
    private ViewPager f11424b;

    /* renamed from: c */
    private RoundIndicatorView f11425c;

    /* renamed from: d */
    private DiamondBannerPageAdapter f11426d;

    /* renamed from: e */
    private C3828a f11427e;

    /* renamed from: f */
    private PageChangeListener f11428f;

    /* renamed from: g */
    private List<C2337a> f11429g;

    /* renamed from: h */
    private boolean f11430h;

    public static class PageChangeListener implements C0935e {

        /* renamed from: a */
        public boolean f11431a;

        /* renamed from: b */
        public int f11432b;

        /* renamed from: c */
        public boolean f11433c;

        /* renamed from: d */
        private ViewPager f11434d;

        /* renamed from: e */
        private C3828a f11435e;

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            this.f11432b = i;
            if (this.f11431a) {
                WalletBannerViewHolder.m13587a(this.f11434d, (Runnable) this.f11435e);
                if (!this.f11433c || ((DiamondBannerPageAdapter) this.f11434d.getAdapter()) == null || ((DiamondBannerPageAdapter) this.f11434d.getAdapter()).mo11060a(i) != null) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.viewholder.WalletBannerViewHolder$a */
    public static class C3828a implements Runnable {

        /* renamed from: a */
        ViewPager f11436a;

        public final void run() {
            if (!C9290a.f25466a || !C3519c.m12965a(C3358ac.m12528e())) {
                try {
                    Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
                    declaredField.setAccessible(true);
                    declaredField.set(this.f11436a, Boolean.valueOf(false));
                    declaredField.setAccessible(false);
                    Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f11436a, new Object[]{Integer.valueOf(this.f11436a.getCurrentItem() + 1), Boolean.valueOf(true), Boolean.valueOf(true), Integer.valueOf(1)});
                    declaredMethod.setAccessible(false);
                } catch (Exception unused) {
                    this.f11436a.setCurrentItem(this.f11436a.getCurrentItem() + 1);
                }
            } else {
                this.f11436a.setCurrentItem(this.f11436a.getCurrentItem() + 1);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo10319b() {
        return true;
    }

    /* renamed from: f */
    private void m13591f() {
        this.f11424b.removeCallbacks(this.f11427e);
        this.f11424b.clearOnPageChangeListeners();
        if (this.f11428f != null) {
            this.f11428f.f11431a = false;
        }
    }

    /* renamed from: c */
    public final void mo10320c() {
        super.mo10320c();
        this.f11430h = true;
        if (this.f11428f != null) {
            this.f11428f.f11433c = true;
        }
        m13590e();
    }

    /* renamed from: d */
    public final void mo10321d() {
        super.mo10321d();
        this.f11430h = false;
        if (this.f11428f != null) {
            this.f11428f.f11433c = false;
        }
        m13591f();
    }

    /* renamed from: e */
    private void m13590e() {
        if (!(!this.f11430h || this.itemView == null || this.itemView.getVisibility() != 0 || this.f11429g == null || this.f11429g.size() <= 1 || this.f11424b == null || this.f11425c == null)) {
            if (this.f11428f != null) {
                this.f11428f.f11431a = true;
            }
            this.f11424b.clearOnPageChangeListeners();
            this.f11424b.addOnPageChangeListener(this.f11428f);
            this.f11425c.setViewPager(this.f11424b);
            m13587a(this.f11424b, (Runnable) this.f11427e);
        }
    }

    /* renamed from: a */
    public static void m13587a(ViewPager viewPager, Runnable runnable) {
        viewPager.removeCallbacks(runnable);
        viewPager.postDelayed(runnable, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }

    /* renamed from: a */
    private static boolean m13589a(List<C2337a> list, List<C2337a> list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 == null) {
            return false;
        }
        if ((list == null && list2 != null) || list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            C2337a aVar = (C2337a) list.get(i);
            C2337a aVar2 = (C2337a) list2.get(i);
            if (aVar != null && !aVar.mo8228a(aVar2)) {
                return false;
            }
            if (aVar2 != null && !aVar2.mo8228a(aVar)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo10072a(List<C2337a> list, int i) {
        int i2;
        View view = this.itemView;
        if (C6311g.m19573a(list)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (!C6311g.m19573a(list) && !m13589a(this.f11429g, list)) {
            this.f11424b.removeCallbacks(this.f11427e);
            this.f11429g = list;
            this.f11424b.setAdapter(null);
            if (this.f11426d == null) {
                this.f11426d = new DiamondBannerPageAdapter(this.itemView.getContext(), LayoutInflater.from(this.itemView.getContext()));
            }
            this.f11426d.mo11061a(this.f11429g);
            this.f11424b.setAdapter(this.f11426d);
            if (this.f11429g.size() > 1) {
                m13587a(this.f11424b, (Runnable) this.f11427e);
                this.f11424b.clearOnPageChangeListeners();
                this.f11424b.addOnPageChangeListener(this.f11428f);
                if (this.f11428f != null) {
                    this.f11428f.f11431a = true;
                }
                this.f11425c.setViewPager(this.f11424b);
                this.f11425c.setVisibility(0);
                this.f11425c.setCount(list.size());
                this.f11424b.setCurrentItem(this.f11429g.size() * (Integer.MAX_VALUE / (this.f11429g.size() * 2)));
                return;
            }
            this.f11425c.setVisibility(8);
        }
    }
}
