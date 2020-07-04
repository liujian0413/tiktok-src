package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter */
public final class VoteViewPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a */
    public final List<Fragment> f105846a = new ArrayList();

    public final int getCount() {
        return this.f105846a.size();
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        return (Fragment) this.f105846a.get(i);
    }

    public VoteViewPagerAdapter(C0608j jVar) {
        C7573i.m23587b(jVar, "fm");
        super(jVar);
    }
}
