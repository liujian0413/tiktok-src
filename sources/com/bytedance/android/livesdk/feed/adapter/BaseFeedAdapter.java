package com.bytedance.android.livesdk.feed.adapter;

import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.paging.adapter.SimplePagingAdapter;
import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3363ah;
import com.bytedance.android.live.core.viewholder.C3417a;
import com.bytedance.android.livesdk.feed.C5924a;
import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.ItemRepository;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.common.utility.C6311g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p354j.C7486b;

public abstract class BaseFeedAdapter extends SimplePagingAdapter<FeedItem> {

    /* renamed from: l */
    private Handler f17563l;

    /* renamed from: m */
    private FeedDataKey f17564m;

    /* renamed from: n */
    private C5980f f17565n;

    /* renamed from: o */
    private Map<String, Long> f17566o;

    /* renamed from: p */
    private Map<String, Long> f17567p;

    /* renamed from: q */
    private Map<String, Long> f17568q;

    /* renamed from: r */
    private C7486b<C0902i<FeedItem, Long>> f17569r;

    /* renamed from: s */
    private C7486b<FeedItem> f17570s;

    /* renamed from: t */
    private C7486b<Object> f17571t;

    /* renamed from: u */
    private C7486b<Object> f17572u;

    /* renamed from: v */
    private C7486b<Boolean> f17573v;

    /* renamed from: w */
    private C7486b<Object> f17574w;

    /* renamed from: x */
    private boolean f17575x;

    /* renamed from: y */
    private boolean f17576y;

    /* renamed from: com.bytedance.android.livesdk.feed.adapter.BaseFeedAdapter$a */
    static class C5929a extends C1147c<FeedItem> {
        private C5929a() {
        }

        /* renamed from: a */
        private static boolean m18563a(FeedItem feedItem, FeedItem feedItem2) {
            if (feedItem.type == feedItem2.type && feedItem.type == 1003) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private static boolean m18564b(FeedItem feedItem, FeedItem feedItem2) {
            if (feedItem.type == feedItem2.type && feedItem.type == 1003) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo4549a(Object obj, Object obj2) {
            return m18563a((FeedItem) obj, (FeedItem) obj2);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ boolean mo4550b(Object obj, Object obj2) {
            return m18564b((FeedItem) obj, (FeedItem) obj2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo14520c(int i) {
        return -8888;
    }

    /* renamed from: i */
    public final C7492s<C0902i<FeedItem, Long>> mo14528i() {
        return this.f17569r;
    }

    /* renamed from: j */
    public final C7492s<FeedItem> mo14529j() {
        return this.f17570s;
    }

    /* renamed from: k */
    public final C7492s<Object> mo14530k() {
        return this.f17571t;
    }

    /* renamed from: e */
    public final void mo14524e() {
        m18542a(this.f17566o, false);
    }

    /* renamed from: f */
    public final void mo14525f() {
        m18542a(this.f17566o, false);
    }

    /* renamed from: d */
    public final void mo14523d() {
        Map<String, Long> map = this.f17566o;
        if (map != null && map.size() != 0) {
        }
    }

    /* renamed from: g */
    public final void mo14526g() {
        this.f17571t.onNext(C3303k.f10035a);
        this.f17575x = false;
    }

    /* renamed from: h */
    public final void mo14527h() {
        this.f17572u.onNext(C3303k.f10035a);
        this.f17563l.removeCallbacksAndMessages(null);
    }

    /* renamed from: l */
    public final List<FeedItem> mo14531l() {
        return this.f17565n.mo14609a(this.f17564m).mo14508f();
    }

    /* renamed from: b */
    public final void mo14519b() {
        m18542a(this.f17567p, true);
        if (C5924a.f17548a && ((Boolean) LiveFeedSettings.I18N_ZHIBOZHONG_ANIMATION_TAG.mo10240a()).booleanValue()) {
            this.f17574w.onNext(C3303k.f10035a);
        }
    }

    /* renamed from: c */
    public final void mo14521c() {
        this.f17563l.removeCallbacksAndMessages(null);
        if (C5924a.f17548a && ((Boolean) LiveFeedSettings.I18N_ZHIBOZHONG_ANIMATION_TAG.mo10240a()).booleanValue()) {
            this.f17574w.onNext(C3303k.f10035a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14516a(FeedItem feedItem) throws Exception {
        this.f17575x = true;
    }

    /* renamed from: b */
    private int m18543b(FeedItem feedItem) {
        if (feedItem == null) {
            return -8888;
        }
        return mo14520c(feedItem.type);
    }

    /* renamed from: c */
    private void m18544c(FeedItem feedItem) {
        if (feedItem != null && feedItem.item != null) {
            String mixId = feedItem.item.getMixId();
            if (!this.f17576y) {
                if (this.f17568q == null) {
                    this.f17568q = new HashMap();
                }
                this.f17568q.put(mixId, Long.valueOf(-1));
            } else if (this.f17566o.get(mixId) == null) {
                this.f17566o.put(mixId, Long.valueOf(C3363ah.m12540a()));
            }
        }
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        super.onViewDetachedFromWindow(vVar);
        int b = mo10079b(vVar.getAdapterPosition());
        if (b >= 0 && b < mo10079b(getItemCount())) {
            m18545d((FeedItem) mo153a(b));
        }
    }

    /* renamed from: d */
    private void m18545d(FeedItem feedItem) {
        if (feedItem != null && feedItem.item != null) {
            String mixId = feedItem.item.getMixId();
            if (this.f17566o.get(mixId) != null) {
                long longValue = ((Long) this.f17566o.get(mixId)).longValue();
                Long l = (Long) this.f17567p.get(mixId);
                if (l == null) {
                    l = Long.valueOf(0);
                }
                this.f17567p.put(mixId, Long.valueOf(l.longValue() + (C3363ah.m12540a() - longValue)));
                this.f17566o.remove(mixId);
            }
        }
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (!this.f17575x) {
            int b = mo10079b(vVar.getAdapterPosition());
            if (b >= 0 && b < mo10079b(getItemCount())) {
                m18544c((FeedItem) mo153a(b));
            }
            TimeCostUtil.m12200a(Tag.LiveFeedInit, TimeCostUtil.m12198a("viewholder", vVar.getClass().toString()));
            C3222b.m12218a().mo10134a(Tag.LiveFeedInit.name());
        }
    }

    /* renamed from: a */
    public final void mo14517a(C5948n nVar) {
        this.f17564m = nVar.mo14539a();
        this.f9824k = new Object[]{nVar, this.f17570s, this.f17571t, this.f17572u, this.f17573v, this.f17574w};
    }

    /* renamed from: d */
    public final FeedItem mo14522d(int i) {
        ItemRepository a = this.f17565n.mo14609a(this.f17564m);
        if (a != null && !C6311g.m19573a(a.mo14508f()) && i >= 0 && i < a.mo14508f().size() && ((FeedItem) mo14531l().get(i)).item != null) {
            return a.mo14507c(((FeedItem) mo14531l().get(i)).item.getMixId());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo14518a(boolean z) {
        this.f17576y = z;
        if (!z) {
            m18542a(this.f17566o, false);
        } else if (!(this.f17568q == null || this.f17568q.size() == 0)) {
            long a = C3363ah.m12540a();
            for (Entry key : this.f17568q.entrySet()) {
                this.f17566o.put((String) key.getKey(), Long.valueOf(a));
            }
            this.f17568q.clear();
            this.f17568q = null;
        }
        this.f17573v.onNext(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int mo10065a(int i, FeedItem feedItem) {
        return m18543b(feedItem);
    }

    public BaseFeedAdapter(Map<Integer, C3417a> map, C5980f fVar) {
        this(new C5929a(), map, fVar);
    }

    /* renamed from: a */
    private void m18541a(String str, long j) {
        if (j > 0 && j >= 50) {
            FeedItem b = this.f17565n.mo14615b(this.f17564m, str);
            if (b != null) {
                this.f17569r.onNext(new C0902i(b, Long.valueOf(j)));
            }
        }
    }

    /* renamed from: a */
    private void m18542a(Map<String, Long> map, boolean z) {
        if (map != null && map.size() != 0) {
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                long longValue = ((Long) entry.getValue()).longValue();
                if (!z && longValue > 0) {
                    longValue = C3363ah.m12540a() - longValue;
                }
                m18541a(str, longValue);
            }
            map.clear();
        }
    }

    private BaseFeedAdapter(C1147c<FeedItem> cVar, Map<Integer, C3417a> map, C5980f fVar) {
        super(cVar, map);
        this.f17563l = new Handler(Looper.getMainLooper());
        this.f17569r = C7486b.m23223a();
        this.f17570s = C7486b.m23223a();
        this.f17571t = C7486b.m23223a();
        this.f17572u = C7486b.m23223a();
        this.f17573v = C7486b.m23223a();
        this.f17574w = C7486b.m23223a();
        this.f17576y = true;
        this.f17565n = fVar;
        this.f17566o = new HashMap();
        this.f17567p = new HashMap();
        this.f17570s.mo19280a((C7326g<? super T>) new C5931a<Object>(this), C5932b.f17588a);
    }
}
