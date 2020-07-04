package com.p280ss.android.ugc.aweme.commercialize.loft.adapter;

import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.LoftVideo;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.feed.adapter.MultiTypePagerAdapter;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.adapter.LoftPagerAdapter */
public final class LoftPagerAdapter extends MultiTypePagerAdapter {

    /* renamed from: a */
    public String f65478a;

    /* renamed from: b */
    public List<LoftVideo> f65479b = new ArrayList();

    /* renamed from: c */
    public final FragmentActivity f65480c;

    /* renamed from: d */
    public final LayoutInflater f65481d;

    /* renamed from: e */
    public final C28297e f65482e;

    /* renamed from: f */
    public boolean f65483f;

    /* renamed from: g */
    private final C43316v f65484g = new C43316v(true);

    /* renamed from: a */
    public final int mo64963a(int i) {
        return 0;
    }

    /* renamed from: a */
    public final int mo64964a(View view) {
        return 0;
    }

    public final int getCount() {
        List<LoftVideo> list = this.f65479b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    private final C24845a m81537a(View view, int i, boolean z) {
        C24846b bVar = new C24846b(view, this.f65480c, this.f65484g, this.f65482e, z);
        return bVar;
    }

    /* renamed from: a */
    private final void m81538a(C24845a aVar, int i, String str) {
        int i2;
        List<LoftVideo> list = this.f65479b;
        if (list != null) {
            LoftVideo loftVideo = (LoftVideo) list.get(i);
            if (!(loftVideo == null || loftVideo.getAweme() == null)) {
                List<LoftVideo> list2 = this.f65479b;
                if (list2 != null) {
                    i2 = list2.size();
                } else {
                    i2 = 0;
                }
                aVar.mo64967a(str, loftVideo, i, i2);
            }
        }
    }

    /* renamed from: a */
    public final View mo64965a(int i, View view, ViewGroup viewGroup) {
        C24845a aVar;
        if (view == null) {
            view = this.f74003i.inflate(R.layout.xb, viewGroup, false);
            C7573i.m23582a((Object) view, "loftView");
            aVar = m81537a(view, 0, this.f65483f);
            view.setTag(aVar);
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                aVar = (C24845a) tag;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.loft.adapter.ILoftViewHolder");
            }
        }
        m81538a(aVar, i, this.f65478a);
        return view;
    }

    public LoftPagerAdapter(FragmentActivity fragmentActivity, LayoutInflater layoutInflater, int i, C28297e eVar, boolean z) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(eVar, "dialogController");
        super(fragmentActivity, layoutInflater, 1);
        this.f65480c = fragmentActivity;
        this.f65481d = layoutInflater;
        this.f65482e = eVar;
        this.f65483f = z;
    }
}
