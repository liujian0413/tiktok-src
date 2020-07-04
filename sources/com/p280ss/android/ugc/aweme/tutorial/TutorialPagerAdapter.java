package com.p280ss.android.ugc.aweme.tutorial;

import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.app.FragmentStatePagerAdapter;
import android.view.View;
import com.p280ss.android.ugc.aweme.themechange.base.AVTabLayoutItemView;
import com.p280ss.android.ugc.aweme.tutorial.p1683a.C42668c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tutorial.TutorialPagerAdapter */
public final class TutorialPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a */
    public final FragmentActivity f110883a;

    /* renamed from: b */
    private final List<C42668c> f110884b = new ArrayList();

    /* renamed from: c */
    private final Map<Integer, Fragment> f110885c = new LinkedHashMap();

    public final int getItemPosition(Object obj) {
        C7573i.m23587b(obj, "object");
        return -2;
    }

    public final int getCount() {
        return this.f110884b.size();
    }

    public final CharSequence getPageTitle(int i) {
        return ((C42668c) this.f110884b.get(i)).f110919a;
    }

    /* renamed from: a */
    public final View mo104265a(int i) {
        AVTabLayoutItemView aVTabLayoutItemView = new AVTabLayoutItemView(this.f110883a, null, 0, 6, null);
        aVTabLayoutItemView.setText(((C42668c) this.f110884b.get(i)).f110919a);
        return aVTabLayoutItemView;
    }

    /* renamed from: b */
    public final void mo104266b(int i) {
        if (this.f110885c.get(Integer.valueOf(i)) != null) {
            Object obj = this.f110885c.get(Integer.valueOf(i));
            if (obj != null) {
                ((TutorialCategoryFragment) obj).mo104262b();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.tutorial.TutorialCategoryFragment");
        }
    }

    public final Fragment getItem(int i) {
        TutorialCategoryFragment tutorialCategoryFragment = new TutorialCategoryFragment();
        tutorialCategoryFragment.mo104261a(((C42668c) this.f110884b.get(i)).f110919a, ((C42668c) this.f110884b.get(i)).f110920b, i);
        this.f110885c.put(Integer.valueOf(i), tutorialCategoryFragment);
        return tutorialCategoryFragment;
    }

    public TutorialPagerAdapter(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        super(fragmentActivity.getSupportFragmentManager());
        this.f110883a = fragmentActivity;
        List<C42668c> list = this.f110884b;
        String string = this.f110883a.getString(R.string.alh);
        C7573i.m23582a((Object) string, "activity.getString(R.str…reation_tutorials_how_to)");
        list.add(new C42668c(string, 0));
        List<C42668c> list2 = this.f110884b;
        String string2 = this.f110883a.getString(R.string.ali);
        C7573i.m23582a((Object) string2, "activity.getString(R.str…reation_tutorials_trends)");
        list2.add(new C42668c(string2, 1));
    }
}
