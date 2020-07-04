package com.p280ss.android.ugc.aweme.poi.search;

import android.content.Context;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.poi.search.C35228a.C35231a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.search.PoiSearchPagerAdapter */
public class PoiSearchPagerAdapter extends PagerAdapter {

    /* renamed from: a */
    private List<C35228a> f92277a = new ArrayList();

    /* renamed from: b */
    private C35228a f92278b;

    /* renamed from: c */
    private C35228a f92279c;

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public int getCount() {
        return this.f92277a.size();
    }

    /* renamed from: a */
    public final void mo89685a(boolean z) {
        this.f92278b.setNotShowNoMyLocation(z);
        if (this.f92279c != null) {
            this.f92279c.setNotShowNoMyLocation(z);
        }
    }

    /* renamed from: a */
    public final C35228a mo89684a(int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return (C35228a) this.f92277a.get(i);
    }

    public CharSequence getPageTitle(int i) {
        switch (i) {
            case 0:
                return C23481i.m77091b(R.string.d0e);
            case 1:
                return C23481i.m77091b(R.string.d0f);
            default:
                return "";
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        viewGroup.addView((View) this.f92277a.get(i));
        return this.f92277a.get(i);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public PoiSearchPagerAdapter(Context context, String str, boolean z, C35231a aVar) {
        this.f92278b = new C35237g(context, str, z);
        this.f92278b.setHideImmListener(aVar);
        this.f92277a.add(this.f92278b);
        if (z) {
            this.f92279c = new C35238h(context, str, z);
            this.f92279c.setHideImmListener(aVar);
            this.f92277a.add(this.f92279c);
        }
    }
}
