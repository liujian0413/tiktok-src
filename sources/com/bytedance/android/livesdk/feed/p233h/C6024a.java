package com.bytedance.android.livesdk.feed.p233h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.core.viewholder.C3417a;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C5912a;
import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.C6037j;
import com.bytedance.android.livesdk.feed.C6076m;
import com.bytedance.android.livesdk.feed.adapter.C5948n;
import com.bytedance.android.livesdk.feed.adapter.FeedLiveAdapter;
import com.bytedance.android.livesdk.feed.dislike.C5972a;
import com.bytedance.android.livesdk.feed.dislike.DislikeApi;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.live.HorFollowLiveFeedViewHolder;
import com.bytedance.android.livesdk.feed.live.HotsoonLiveAdViewHolder;
import com.bytedance.android.livesdk.feed.live.LargeLiveViewHolder;
import com.bytedance.android.livesdk.feed.live.LiveBannerViewHolder;
import com.bytedance.android.livesdk.feed.live.LiveGapViewHolder;
import com.bytedance.android.livesdk.feed.live.LiveRankViewHolder;
import com.bytedance.android.livesdk.feed.live.LiveTabViewHolder;
import com.bytedance.android.livesdk.feed.live.SmallLiveViewHolder;
import com.bytedance.android.livesdk.feed.services.C6121d;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdkapi.p452h.C9418f;
import com.bytedance.android.livesdkapi.p452h.C9421i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.bytedance.android.livesdk.feed.h.a */
public final class C6024a {

    /* renamed from: a */
    C5980f f17842a = C6121d.m19067a();

    /* renamed from: b */
    C6037j f17843b;

    /* renamed from: c */
    C9418f f17844c;

    /* renamed from: d */
    C5972a f17845d = new C5972a((DislikeApi) C3458e.m12798a().mo10440a(DislikeApi.class));

    /* renamed from: e */
    private FeedLiveFragment f17846e;

    /* renamed from: c */
    private static C3417a m18833c() {
        return C6031g.f17862a;
    }

    /* renamed from: d */
    private static C3417a m18835d() {
        return C6032h.f17863a;
    }

    /* renamed from: e */
    private static C3417a m18836e() {
        return C6033i.f17864a;
    }

    /* renamed from: b */
    private Map<Integer, C3417a> m18830b() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(R.layout.aru), m18824a(this.f17845d, this.f17842a, this.f17843b, this.f17844c));
        hashMap.put(Integer.valueOf(R.layout.arv), m18829b(this.f17845d, this.f17842a, this.f17843b, this.f17844c));
        hashMap.put(Integer.valueOf(R.layout.awi), m18825a(this.f17846e));
        hashMap.put(Integer.valueOf(R.layout.awf), m18826a((C6076m) new C6076m() {
        }));
        hashMap.put(Integer.valueOf(R.layout.awh), m18833c());
        hashMap.put(Integer.valueOf(R.layout.awg), m18835d());
        hashMap.put(Integer.valueOf(R.layout.arz), m18836e());
        hashMap.put(Integer.valueOf(R.layout.art), m18834c(this.f17845d, this.f17842a, this.f17843b, this.f17844c));
        return hashMap;
    }

    /* renamed from: a */
    public final FeedLiveAdapter mo14688a() {
        return new FeedLiveAdapter(m18830b(), this.f17842a, this.f17846e);
    }

    /* renamed from: a */
    private static C3417a m18825a(FeedLiveFragment feedLiveFragment) {
        return new C6028d(feedLiveFragment);
    }

    public C6024a(FeedLiveFragment feedLiveFragment) {
        this.f17843b = feedLiveFragment.f17808w;
        this.f17844c = C9421i.m27940b();
        this.f17846e = feedLiveFragment;
    }

    /* renamed from: a */
    private static C3417a m18826a(C6076m mVar) {
        return new C6030f(mVar);
    }

    /* renamed from: b */
    static final /* synthetic */ BaseViewHolder m18827b(ViewGroup viewGroup, Object[] objArr) {
        return new LiveGapViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.awg, viewGroup, false));
    }

    /* renamed from: c */
    static final /* synthetic */ BaseViewHolder m18831c(ViewGroup viewGroup, Object[] objArr) {
        return new LiveRankViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.awh, viewGroup, false), false);
    }

    /* renamed from: a */
    static final /* synthetic */ BaseViewHolder m18820a(ViewGroup viewGroup, Object[] objArr) {
        C5912a aVar;
        if (objArr.length <= 0 || !(objArr[0] instanceof C5948n)) {
            aVar = null;
        } else {
            aVar = objArr[0].mo14540b();
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.arz, viewGroup, false);
        if (((Integer) LiveFeedSettings.DOUYIN_LIVE_FEED_TOP_HINT.mo10240a()).intValue() == 0) {
            inflate.findViewById(R.id.dpl).setVisibility(8);
        }
        return new HorFollowLiveFeedViewHolder(inflate, aVar);
    }

    /* renamed from: a */
    static final /* synthetic */ BaseViewHolder m18822a(FeedLiveFragment feedLiveFragment, ViewGroup viewGroup, Object[] objArr) {
        return new LiveTabViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.awi, viewGroup, false), feedLiveFragment);
    }

    /* renamed from: a */
    static final /* synthetic */ BaseViewHolder m18823a(C6076m mVar, ViewGroup viewGroup, Object[] objArr) {
        FeedDataKey feedDataKey;
        C5912a aVar;
        C7486b bVar;
        C7486b bVar2;
        C7486b bVar3;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.awf, viewGroup, false);
        if (objArr.length <= 0 || !(objArr[0] instanceof C5948n)) {
            aVar = null;
            feedDataKey = null;
        } else {
            C5948n nVar = objArr[0];
            FeedDataKey a = nVar.mo14539a();
            aVar = nVar.mo14540b();
            feedDataKey = a;
        }
        if (objArr.length <= 2 || !(objArr[2] instanceof C7486b)) {
            bVar = null;
        } else {
            bVar = objArr[2];
        }
        if (objArr.length <= 3 || !(objArr[3] instanceof C7486b)) {
            bVar2 = null;
        } else {
            bVar2 = objArr[3];
        }
        if (objArr.length <= 4 || !(objArr[4] instanceof C7486b)) {
            bVar3 = null;
        } else {
            bVar3 = objArr[4];
        }
        LiveBannerViewHolder liveBannerViewHolder = new LiveBannerViewHolder(inflate, aVar, feedDataKey, bVar, bVar2, bVar3, mVar);
        return liveBannerViewHolder;
    }

    /* renamed from: a */
    private static C3417a m18824a(C5972a aVar, C5980f fVar, C6037j jVar, C9418f fVar2) {
        return new C6026b(aVar, fVar, jVar, fVar2);
    }

    /* renamed from: b */
    private static C3417a m18829b(C5972a aVar, C5980f fVar, C6037j jVar, C9418f fVar2) {
        return new C6027c(aVar, fVar, jVar, fVar2);
    }

    /* renamed from: c */
    private static C3417a m18834c(C5972a aVar, C5980f fVar, C6037j jVar, C9418f fVar2) {
        return new C6029e(aVar, fVar, jVar, fVar2);
    }

    /* renamed from: b */
    static final /* synthetic */ BaseViewHolder m18828b(C5972a aVar, C5980f fVar, C6037j jVar, C9418f fVar2, ViewGroup viewGroup, Object[] objArr) {
        FeedDataKey feedDataKey;
        C7486b bVar;
        C7486b bVar2;
        C7486b bVar3;
        C7486b bVar4;
        Object[] objArr2 = objArr;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.arv, viewGroup, false);
        if (objArr2.length <= 0 || !(objArr2[0] instanceof C5948n)) {
            feedDataKey = null;
        } else {
            feedDataKey = ((C5948n) objArr2[0]).mo14539a();
        }
        if (objArr2.length <= 1 || !(objArr2[1] instanceof C7486b)) {
            bVar = null;
        } else {
            bVar = (C7486b) objArr2[1];
        }
        if (objArr2.length <= 2 || !(objArr2[2] instanceof C7486b)) {
            bVar2 = null;
        } else {
            bVar2 = (C7486b) objArr2[2];
        }
        if (objArr2.length <= 3 || !(objArr2[3] instanceof C7486b)) {
            bVar3 = null;
        } else {
            bVar3 = (C7486b) objArr2[3];
        }
        if (objArr2.length <= 4 || !(objArr2[4] instanceof C7486b)) {
            bVar4 = null;
        } else {
            bVar4 = (C7486b) objArr2[4];
        }
        SmallLiveViewHolder smallLiveViewHolder = new SmallLiveViewHolder(inflate, aVar, fVar, feedDataKey, jVar, fVar2, bVar, bVar4, bVar2, bVar3);
        return smallLiveViewHolder;
    }

    /* renamed from: c */
    static final /* synthetic */ BaseViewHolder m18832c(C5972a aVar, C5980f fVar, C6037j jVar, C9418f fVar2, ViewGroup viewGroup, Object[] objArr) {
        FeedDataKey feedDataKey;
        C7486b bVar;
        C7486b bVar2;
        C7486b bVar3;
        C7486b bVar4;
        Object[] objArr2 = objArr;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aru, viewGroup, false);
        if (objArr2.length <= 0 || !(objArr2[0] instanceof C5948n)) {
            feedDataKey = null;
        } else {
            feedDataKey = ((C5948n) objArr2[0]).mo14539a();
        }
        if (objArr2.length <= 1 || !(objArr2[1] instanceof C7486b)) {
            bVar = null;
        } else {
            bVar = (C7486b) objArr2[1];
        }
        if (objArr2.length <= 2 || !(objArr2[2] instanceof C7486b)) {
            bVar2 = null;
        } else {
            bVar2 = (C7486b) objArr2[2];
        }
        if (objArr2.length <= 3 || !(objArr2[3] instanceof C7486b)) {
            bVar3 = null;
        } else {
            bVar3 = (C7486b) objArr2[3];
        }
        if (objArr2.length <= 4 || !(objArr2[4] instanceof C7486b)) {
            bVar4 = null;
        } else {
            bVar4 = (C7486b) objArr2[4];
        }
        LargeLiveViewHolder largeLiveViewHolder = new LargeLiveViewHolder(inflate, aVar, fVar, feedDataKey, jVar, fVar2, bVar, bVar4, bVar2, bVar3);
        return largeLiveViewHolder;
    }

    /* renamed from: a */
    static final /* synthetic */ BaseViewHolder m18821a(C5972a aVar, C5980f fVar, C6037j jVar, C9418f fVar2, ViewGroup viewGroup, Object[] objArr) {
        FeedDataKey feedDataKey;
        C7486b bVar;
        C7486b bVar2;
        C7486b bVar3;
        C7486b bVar4;
        Object[] objArr2 = objArr;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.art, viewGroup, false);
        if (objArr2.length <= 0 || !(objArr2[0] instanceof C5948n)) {
            feedDataKey = null;
        } else {
            feedDataKey = ((C5948n) objArr2[0]).mo14539a();
        }
        if (objArr2.length <= 1 || !(objArr2[1] instanceof C7486b)) {
            bVar = null;
        } else {
            bVar = (C7486b) objArr2[1];
        }
        if (objArr2.length <= 2 || !(objArr2[2] instanceof C7486b)) {
            bVar2 = null;
        } else {
            bVar2 = (C7486b) objArr2[2];
        }
        if (objArr2.length <= 3 || !(objArr2[3] instanceof C7486b)) {
            bVar3 = null;
        } else {
            bVar3 = (C7486b) objArr2[3];
        }
        if (objArr2.length <= 4 || !(objArr2[4] instanceof C7486b)) {
            bVar4 = null;
        } else {
            bVar4 = (C7486b) objArr2[4];
        }
        HotsoonLiveAdViewHolder hotsoonLiveAdViewHolder = new HotsoonLiveAdViewHolder(inflate, aVar, fVar, feedDataKey, jVar, fVar2, bVar, bVar4, bVar2, bVar3);
        return hotsoonLiveAdViewHolder;
    }
}
