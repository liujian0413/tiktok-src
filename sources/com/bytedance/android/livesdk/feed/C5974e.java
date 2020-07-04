package com.bytedance.android.livesdk.feed;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.content.Context;
import com.bytedance.android.livesdk.feed.p229d.C5971a;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.DislikeTipViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.LiveFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TimeOutRefreshViewModel;

/* renamed from: com.bytedance.android.livesdk.feed.e */
public final class C5974e implements C0067b {

    /* renamed from: a */
    private IFeedRepository f17710a;

    /* renamed from: b */
    private C6037j f17711b;

    /* renamed from: c */
    private long f17712c;

    /* renamed from: d */
    private C6019g f17713d;

    /* renamed from: e */
    private Context f17714e;

    /* renamed from: f */
    private C5971a f17715f;

    /* renamed from: g */
    private C6077n f17716g;

    /* renamed from: a */
    public final C5974e mo14622a(long j) {
        this.f17712c = j;
        return this;
    }

    /* renamed from: a */
    public final C5974e mo14623a(C6019g gVar) {
        this.f17713d = gVar;
        return this;
    }

    /* renamed from: a */
    public final <T extends C0063u> T mo149a(Class<T> cls) {
        if (cls.isAssignableFrom(BaseFeedDataViewModel.class)) {
            return new BaseFeedDataViewModel(this.f17710a, this.f17713d, this.f17715f);
        }
        if (cls.isAssignableFrom(FragmentFeedViewModel.class)) {
            return new FragmentFeedViewModel(this.f17710a, this.f17713d, this.f17715f);
        }
        if (cls.isAssignableFrom(TabFeedViewModel.class)) {
            TabFeedViewModel tabFeedViewModel = new TabFeedViewModel(this.f17710a, this.f17713d, this.f17711b, this.f17715f, this.f17716g, this.f17712c);
            return tabFeedViewModel;
        } else if (cls.isAssignableFrom(DislikeTipViewModel.class)) {
            return new DislikeTipViewModel(this.f17711b, this.f17712c, this.f17714e);
        } else {
            if (cls.isAssignableFrom(TimeOutRefreshViewModel.class)) {
                return new TimeOutRefreshViewModel();
            }
            if (cls.isAssignableFrom(LiveFeedViewModel.class)) {
                return new LiveFeedViewModel(this.f17710a, this.f17711b.mo14693c());
            }
            StringBuilder sb = new StringBuilder("unknown model ");
            sb.append(cls.getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public C5974e(IFeedRepository iFeedRepository, C6037j jVar, Context context, C6077n nVar, C5971a aVar) {
        this.f17710a = iFeedRepository;
        this.f17711b = jVar;
        this.f17714e = context;
        this.f17716g = nVar;
        this.f17715f = aVar;
    }
}
