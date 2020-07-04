package com.p280ss.android.ugc.aweme.message.adapter;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.p1428c.C34318a;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.message.adapter.MessagePagerAdapter */
public class MessagePagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a */
    private List<Fragment> f86436a = new ArrayList();

    /* renamed from: b */
    private boolean f86437b;

    public int getCount() {
        if (this.f86437b) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public final Fragment mo85010a() {
        for (int i = 0; i < this.f86436a.size(); i++) {
            if (this.f86436a.get(i) instanceof C34318a) {
                return ((C34318a) this.f86436a.get(i)).mo87143a();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        Fragment d = m107158d(i);
        this.f86436a.add(d);
        return d;
    }

    /* renamed from: b */
    public final long mo2424b(int i) {
        if (!this.f86437b || i != 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public final Fragment mo85011c(int i) {
        if (i < this.f86436a.size()) {
            return (Fragment) this.f86436a.get(i);
        }
        return null;
    }

    /* renamed from: d */
    private Fragment m107158d(int i) {
        if (!this.f86437b) {
            return C34315c.m110975a().mo87143a();
        }
        if (i != 0) {
            return C34315c.m110975a().mo87143a();
        }
        return C30553b.m99810g().getRelationSelectFragment().mo18105d();
    }

    public MessagePagerAdapter(C0608j jVar, boolean z) {
        super(jVar);
        this.f86437b = z;
    }
}
