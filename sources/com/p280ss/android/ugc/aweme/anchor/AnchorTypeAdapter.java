package com.p280ss.android.ugc.aweme.anchor;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentStatePagerAdapter;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.anchor.AnchorTypeAdapter */
public final class AnchorTypeAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a */
    public final Pair<String, AnchorListFragment>[] f59993a;

    public final int getCount() {
        Pair<String, AnchorListFragment>[] pairArr = this.f59993a;
        if (pairArr != null) {
            return pairArr.length;
        }
        return 0;
    }

    public final Fragment getItem(int i) {
        AnchorListFragment anchorListFragment;
        Pair<String, AnchorListFragment>[] pairArr = this.f59993a;
        if (pairArr != null) {
            Pair<String, AnchorListFragment> pair = pairArr[i];
            if (pair != null) {
                anchorListFragment = (AnchorListFragment) pair.getSecond();
                return anchorListFragment;
            }
        }
        anchorListFragment = null;
        return anchorListFragment;
    }

    public final CharSequence getPageTitle(int i) {
        String str;
        Pair<String, AnchorListFragment>[] pairArr = this.f59993a;
        if (pairArr != null) {
            Pair<String, AnchorListFragment> pair = pairArr[i];
            if (pair != null) {
                str = (String) pair.getFirst();
                return str;
            }
        }
        str = null;
        return str;
    }

    public AnchorTypeAdapter(Pair<String, AnchorListFragment>[] pairArr, C0608j jVar) {
        C7573i.m23587b(jVar, "fm");
        super(jVar);
        this.f59993a = pairArr;
    }
}
