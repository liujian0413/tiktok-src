package com.p280ss.android.ugc.aweme.following.p1265ui.adapter;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.following.C29560a;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowRelationPagerAdapter */
public final class FollowRelationPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a */
    public final C0608j f78244a;

    /* renamed from: b */
    public final List<Fragment> f78245b;

    /* renamed from: c */
    public final List<String> f78246c;

    public final int getCount() {
        return this.f78245b.size();
    }

    /* renamed from: d */
    public final void mo75716d(int i) {
        m97453e(i);
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        return (Fragment) this.f78245b.get(i);
    }

    public final CharSequence getPageTitle(int i) {
        return (CharSequence) this.f78246c.get(i);
    }

    /* renamed from: c */
    public final void mo75715c(int i) {
        boolean z;
        int i2 = 0;
        for (Object next : this.f78245b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C7525m.m23465b();
            }
            Fragment fragment = (Fragment) next;
            if (fragment instanceof C29560a) {
                C29560a aVar = (C29560a) fragment;
                if (i2 != i) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo75567a(z);
            }
            i2 = i3;
        }
    }

    /* renamed from: e */
    private final void m97453e(int i) {
        boolean z;
        Collection collection = this.f78245b;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int size = this.f78245b.size();
            if (i >= 0 && size >= i && (this.f78245b.get(i) instanceof C29560a)) {
                Object obj = this.f78245b.get(i);
                if (obj != null) {
                    C29560a aVar = (C29560a) obj;
                    if (aVar.aU_()) {
                        aVar.aV_();
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.following.ILazyLoad");
                }
            }
        }
    }

    public FollowRelationPagerAdapter(C0608j jVar, List<Fragment> list, List<String> list2) {
        C7573i.m23587b(jVar, "fm");
        C7573i.m23587b(list, "fragments");
        C7573i.m23587b(list2, "fragmentTitles");
        super(jVar);
        this.f78244a = jVar;
        this.f78245b = list;
        this.f78246c = list2;
    }
}
