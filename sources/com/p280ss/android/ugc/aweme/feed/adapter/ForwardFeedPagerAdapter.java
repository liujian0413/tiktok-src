package com.p280ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ForwardFeedPagerAdapter */
public class ForwardFeedPagerAdapter extends FeedPagerAdapter {

    /* renamed from: l */
    private List<Aweme> f73998l = new ArrayList();

    /* renamed from: c */
    public final List<Aweme> mo71596c() {
        return this.f73998l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo71583a(Aweme aweme) {
        if (!aweme.isForwardAweme() || aweme.getForwardItem() == null) {
            return super.mo71583a(aweme);
        }
        if (aweme.getForwardItem().getAwemeType() == 2) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public final Aweme mo71595c(int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return (Aweme) this.f73998l.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo71598d(int i) {
        if (i >= 0 && i < getCount()) {
            this.f73998l.remove(i);
            super.mo71598d(i);
        }
    }

    /* renamed from: b */
    private static List<Aweme> m91900b(List<Aweme> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            if (aweme.isForwardAweme()) {
                arrayList.add(aweme.getForwardItem());
            } else {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    public int getItemPosition(Object obj) {
        C28130ac acVar = (C28130ac) ((View) obj).getTag(R.id.aje);
        int count = getCount();
        for (int i = 0; i < count; i++) {
            Aweme c = mo71595c(i);
            if (acVar != null && c != null && C6319n.m19594a(c.getAid(), acVar.mo71542A().getAid())) {
                return i;
            }
        }
        return -2;
    }

    /* renamed from: a */
    public final void mo71589a(List<Aweme> list) {
        this.f73998l.clear();
        if (!C6307b.m19566a((Collection<T>) list)) {
            this.f73998l.addAll(list);
        }
        super.mo71589a(m91900b(list));
    }

    /* renamed from: a */
    public final C28130ac mo67564a(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        C28192t tVar = new C28192t(view, zVar, onTouchListener, fragment, baseFeedPageParams, this.f73987c, this.f73989e);
        mo71586a((C28130ac) tVar);
        return tVar;
    }

    public ForwardFeedPagerAdapter(Context context, LayoutInflater layoutInflater, int i, C28343z<C28318an> zVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        super(context, layoutInflater, i, zVar, fragment, onTouchListener, baseFeedPageParams);
    }

    /* renamed from: a */
    public final C28130ac mo67563a(int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        C28191s sVar = new C28191s(i, view, zVar, str, onTouchListener, fragment, i2);
        return sVar;
    }
}
