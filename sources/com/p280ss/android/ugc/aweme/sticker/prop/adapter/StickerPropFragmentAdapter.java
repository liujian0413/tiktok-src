package com.p280ss.android.ugc.aweme.sticker.prop.adapter;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.adapter.StickerPropFragmentAdapter */
public class StickerPropFragmentAdapter<T extends AmeBaseFragment> extends FragmentPagerAdapter {

    /* renamed from: a */
    private List<T> f108884a;

    /* renamed from: b */
    public final long mo2424b(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.f108884a.size();
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        return (Fragment) this.f108884a.get(i);
    }

    public StickerPropFragmentAdapter(C0608j jVar, List<T> list) {
        super(jVar);
        this.f108884a = list;
    }
}
