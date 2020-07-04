package com.p280ss.android.ugc.aweme.discover.p1189v4.adapter;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.C27189a;
import com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.DiscoverV4PlayListFragment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4ViewPagerAdapter */
public final class DiscoverV4ViewPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a */
    public final Map<Integer, WeakReference<C27189a>> f71594a = new LinkedHashMap();

    /* renamed from: b */
    public final C0608j f71595b;

    /* renamed from: c */
    public List<DiscoverCategoryStructV4> f71596c;

    public final int getCount() {
        return this.f71596c.size();
    }

    public final CharSequence getPageTitle(int i) {
        return ((DiscoverCategoryStructV4) this.f71596c.get(i)).tabText;
    }

    public final Fragment getItem(int i) {
        DiscoverV4PlayListFragment discoverV4PlayListFragment = new DiscoverV4PlayListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("tabName", ((DiscoverCategoryStructV4) this.f71596c.get(i)).tabName);
        bundle.putString("tabText", ((DiscoverCategoryStructV4) this.f71596c.get(i)).tabText);
        discoverV4PlayListFragment.setArguments(bundle);
        this.f71594a.put(Integer.valueOf(i), new WeakReference(discoverV4PlayListFragment));
        return discoverV4PlayListFragment;
    }

    public final Object instantiateItem(View view, int i) {
        C7573i.m23587b(view, "container");
        Object instantiateItem = super.instantiateItem(view, i);
        C7573i.m23582a(instantiateItem, "super.instantiateItem(container, position)");
        return instantiateItem;
    }

    public DiscoverV4ViewPagerAdapter(C0608j jVar, List<DiscoverCategoryStructV4> list) {
        C7573i.m23587b(jVar, "fm");
        C7573i.m23587b(list, "list");
        super(jVar);
        this.f71595b = jVar;
        this.f71596c = list;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C7573i.m23587b(viewGroup, "container");
        C7573i.m23587b(obj, "object");
        super.destroyItem(viewGroup, i, obj);
        WeakReference weakReference = (WeakReference) this.f71594a.get(Integer.valueOf(i));
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f71594a.remove(Integer.valueOf(i));
    }
}
