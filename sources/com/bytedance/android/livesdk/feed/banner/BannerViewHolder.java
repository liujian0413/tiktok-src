package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.base.model.banner.C2337a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C5912a;
import com.bytedance.android.livesdk.feed.C5924a;
import com.bytedance.android.livesdk.feed.C6076m;
import com.bytedance.android.livesdk.feed.banner.adapter.BannerPageAdapter;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p231f.C5982b;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p354j.C7486b;

public class BannerViewHolder extends BaseViewHolder<FeedItem> {

    /* renamed from: b */
    ViewPager f17633b;

    /* renamed from: c */
    RoundIndicatorView f17634c;

    /* renamed from: d */
    C7486b<Object> f17635d;

    /* renamed from: e */
    C7486b<Object> f17636e;

    /* renamed from: f */
    C7486b<Boolean> f17637f;

    /* renamed from: g */
    private BannerPageAdapter f17638g;

    /* renamed from: h */
    private C5952a f17639h = new C5952a(this.f17633b);

    /* renamed from: i */
    private PageChangeListener f17640i;

    /* renamed from: j */
    private List<C2337a> f17641j;

    /* renamed from: k */
    private Context f17642k;

    /* renamed from: l */
    private String f17643l;

    /* renamed from: m */
    private boolean f17644m;

    /* renamed from: n */
    private C6076m f17645n;

    public static class PageChangeListener implements C0935e {

        /* renamed from: a */
        public boolean f17646a;

        /* renamed from: b */
        public int f17647b;

        /* renamed from: c */
        public boolean f17648c = true;

        /* renamed from: d */
        private ViewPager f17649d;

        /* renamed from: e */
        private C5952a f17650e;

        /* renamed from: f */
        private String f17651f;

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            this.f17647b = i;
            if (this.f17646a) {
                BannerViewHolder.m18639a(this.f17649d, (Runnable) this.f17650e);
                if (this.f17648c && ((BannerPageAdapter) this.f17649d.getAdapter()) != null) {
                    C2337a a = ((BannerPageAdapter) this.f17649d.getAdapter()).mo14602a(i);
                    if (a != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("show_source", this.f17651f);
                        hashMap.put("banner_id", String.valueOf(a.getId()));
                        C5982b.m18722a("banner_show", (Map<String, String>) hashMap);
                        if (this.f17649d instanceof BannerViewPager) {
                            ((BannerViewPager) this.f17649d).mo14592b();
                        }
                    }
                }
            }
        }

        public PageChangeListener(ViewPager viewPager, C5952a aVar, String str) {
            this.f17649d = viewPager;
            this.f17650e = aVar;
            this.f17651f = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.banner.BannerViewHolder$a */
    public static class C5952a implements Runnable {

        /* renamed from: a */
        ViewPager f17652a;

        public final void run() {
            if (!C5924a.f17548a || !C3519c.m12965a(C3358ac.m12528e())) {
                try {
                    Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
                    declaredField.setAccessible(true);
                    declaredField.set(this.f17652a, Boolean.valueOf(false));
                    declaredField.setAccessible(false);
                    Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f17652a, new Object[]{Integer.valueOf(this.f17652a.getCurrentItem() + 1), Boolean.valueOf(true), Boolean.valueOf(true), Integer.valueOf(1)});
                    declaredMethod.setAccessible(false);
                } catch (Exception unused) {
                    this.f17652a.setCurrentItem(this.f17652a.getCurrentItem() + 1);
                }
            } else {
                this.f17652a.setCurrentItem(this.f17652a.getCurrentItem() + 1);
            }
        }

        public C5952a(ViewPager viewPager) {
            this.f17652a = viewPager;
        }
    }

    /* renamed from: b */
    public final boolean mo10319b() {
        return true;
    }

    /* renamed from: f */
    private void m18644f() {
        this.f17633b.removeCallbacks(this.f17639h);
        this.f17633b.clearOnPageChangeListeners();
        if (this.f17640i != null) {
            this.f17640i.f17646a = false;
        }
    }

    /* renamed from: c */
    public final void mo10320c() {
        super.mo10320c();
        this.f17644m = true;
        if (this.f17640i != null) {
            this.f17640i.f17648c = true;
        }
        m18643e();
    }

    /* renamed from: d */
    public final void mo10321d() {
        super.mo10321d();
        this.f17644m = false;
        if (this.f17640i != null) {
            this.f17640i.f17648c = false;
        }
        m18644f();
    }

    /* renamed from: e */
    private void m18643e() {
        if (this.f17644m && this.itemView != null && this.itemView.getVisibility() == 0) {
            m18641a(this.f17641j);
            if (!(this.f17641j == null || this.f17641j.size() <= 1 || this.f17633b == null || this.f17634c == null)) {
                if (this.f17640i != null) {
                    this.f17640i.f17646a = true;
                }
                this.f17633b.clearOnPageChangeListeners();
                this.f17633b.addOnPageChangeListener(this.f17640i);
                this.f17634c.setViewPager(this.f17633b);
                m18639a(this.f17633b, (Runnable) this.f17639h);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14589b(Object obj) throws Exception {
        m18644f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo14590c(Object obj) throws Exception {
        m18643e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14587a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m18643e();
        } else {
            m18644f();
        }
    }

    /* renamed from: a */
    private void m18641a(List<C2337a> list) {
        int i;
        if (this.f17640i != null) {
            i = this.f17640i.f17647b;
        } else {
            i = 0;
        }
        if (list != null && !list.isEmpty() && this.f17644m) {
            C2337a aVar = (C2337a) list.get(i % list.size());
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", this.f17643l);
            hashMap.put("banner_id", String.valueOf(aVar.getId()));
            C5982b.m18722a("banner_show", (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m18639a(ViewPager viewPager, Runnable runnable) {
        viewPager.removeCallbacks(runnable);
        viewPager.postDelayed(runnable, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }

    /* renamed from: a */
    private static boolean m18642a(List<C2337a> list, List<C2337a> list2) {
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

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo14588a(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17633b.removeCallbacks(this.f17639h);
        } else if (action == 3 || action == 1) {
            this.f17633b.postDelayed(this.f17639h, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo10072a(FeedItem feedItem, int i) {
        int i2;
        if (feedItem != null && feedItem.banners != null) {
            List<C2337a> list = feedItem.banners;
            if (!m18642a(this.f17641j, list)) {
                m18641a(list);
                this.f17633b.removeCallbacks(this.f17639h);
                this.f17641j = list;
                this.f17633b.setAdapter(null);
                if (list == null || list.isEmpty()) {
                    LayoutParams layoutParams = this.f17633b.getLayoutParams();
                    layoutParams.height = 0;
                    this.f17633b.setLayoutParams(layoutParams);
                    this.f17638g = null;
                    this.f17634c.setVisibility(8);
                } else {
                    LayoutParams layoutParams2 = this.f17633b.getLayoutParams();
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = 0;
                            break;
                        }
                        C2337a aVar = (C2337a) it.next();
                        if (aVar != null && aVar.f7667f != 0) {
                            i2 = (C9738o.m28691a(this.f17642k) * aVar.f7666e) / aVar.f7667f;
                            break;
                        }
                    }
                    if (i2 != layoutParams2.height) {
                        layoutParams2.height = i2;
                        this.f17633b.setLayoutParams(layoutParams2);
                    }
                    if (this.f17638g == null) {
                        this.f17638g = new BannerPageAdapter(this.itemView.getContext(), LayoutInflater.from(this.itemView.getContext()), this.f17643l, this.f17645n);
                    }
                    this.f17638g.mo14603a(this.f17641j);
                    this.f17633b.setAdapter(this.f17638g);
                    if (this.f17641j.size() > 1) {
                        m18639a(this.f17633b, (Runnable) this.f17639h);
                        this.f17633b.clearOnPageChangeListeners();
                        this.f17633b.addOnPageChangeListener(this.f17640i);
                        if (this.f17640i != null) {
                            this.f17640i.f17646a = true;
                        }
                        this.f17634c.setViewPager(this.f17633b);
                        this.f17634c.setVisibility(0);
                        this.f17634c.setCount(list.size());
                        this.f17633b.setCurrentItem(this.f17641j.size() * (Integer.MAX_VALUE / (this.f17641j.size() * 2)));
                    } else {
                        this.f17634c.setVisibility(8);
                    }
                }
            }
        }
    }

    public BannerViewHolder(View view, C5912a aVar, FeedDataKey feedDataKey, C7486b<Object> bVar, C7486b<Object> bVar2, C7486b<Boolean> bVar3, C6076m mVar) {
        super(view);
        this.f17633b = (ViewPager) view.findViewById(R.id.edp);
        this.f17634c = (RoundIndicatorView) view.findViewById(R.id.b0p);
        this.f17642k = view.getContext();
        this.f17643l = feedDataKey.f17733b;
        this.f17645n = mVar;
        this.f17635d = bVar;
        this.f17636e = bVar2;
        this.f17637f = bVar3;
        this.f17633b.removeCallbacks(this.f17639h);
        this.f17640i = new PageChangeListener(this.f17633b, this.f17639h, this.f17643l);
        this.f17633b.setOnTouchListener(new C5958b(this));
        this.f17634c.setViewPager(this.f17633b);
        this.f17634c.mo14594a((C0935e) this.f17640i);
        if (aVar != null) {
            aVar.mo14446a(this.f17633b, view);
        }
        this.f17637f.mo19280a((C7326g<? super T>) new C5959c<Object>(this), C5960d.f17690a);
        this.f17635d.mo19280a((C7326g<? super T>) new C5961e<Object>(this), C5962f.f17692a);
        this.f17636e.mo19280a((C7326g<? super T>) new C5963g<Object>(this), C5964h.f17694a);
    }
}
