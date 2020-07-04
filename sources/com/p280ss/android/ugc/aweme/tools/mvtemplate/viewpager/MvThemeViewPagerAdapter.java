package com.p280ss.android.ugc.aweme.tools.mvtemplate.viewpager;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentStatePagerAdapter;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.viewpager.MvThemeViewPagerAdapter */
public class MvThemeViewPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a */
    private List<MvItemFragment> f110695a = new ArrayList();

    /* renamed from: b */
    private List<MvThemeData> f110696b = new ArrayList();

    /* renamed from: c */
    private C0608j f110697c;

    public int getCount() {
        if (this.f110695a == null) {
            return 0;
        }
        return this.f110695a.size();
    }

    public MvThemeViewPagerAdapter(C0608j jVar) {
        super(jVar);
        this.f110697c = jVar;
    }

    /* renamed from: a */
    public final MvItemFragment getItem(int i) {
        if (i < 0 || i >= this.f110695a.size()) {
            return null;
        }
        return (MvItemFragment) this.f110695a.get(i);
    }

    /* renamed from: b */
    public final MvThemeData mo104169b(int i) {
        if (!C23477d.m77081a((Collection<T>) this.f110696b) && i >= 0 && i < this.f110696b.size()) {
            return (MvThemeData) this.f110696b.get(i);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo104170b(List<MvThemeData> list) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            int size = this.f110696b.size();
            this.f110696b.addAll(list);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != null) {
                    this.f110695a.add(MvItemFragment.m135249a((MvThemeData) list.get(i), i + size));
                }
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo104168a(List<MvThemeData> list) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            this.f110696b.clear();
            this.f110696b.addAll(list);
            for (int i = 0; i < this.f110695a.size(); i++) {
                MvItemFragment mvItemFragment = (MvItemFragment) this.f110695a.get(i);
                if (mvItemFragment != null && i < list.size()) {
                    mvItemFragment.f110679b = (MvThemeData) list.get(i);
                    mvItemFragment.mo104157a();
                }
            }
            for (int size = this.f110695a.size(); size < list.size(); size++) {
                if (list.get(size) != null) {
                    this.f110695a.add(MvItemFragment.m135249a((MvThemeData) list.get(size), size));
                }
            }
            notifyDataSetChanged();
        }
    }
}
