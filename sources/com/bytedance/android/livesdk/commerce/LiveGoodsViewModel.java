package com.bytedance.android.livesdk.commerce;

import android.arch.lifecycle.C0052o;
import android.util.Pair;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.core.widget.simple.SimpleListViewModel;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.livesdk.commerce.C5847d.C5848a;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdkapi.depend.p442e.C9312a;
import com.bytedance.common.utility.C6311g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

public final class LiveGoodsViewModel extends SimpleListViewModel<Object> {

    /* renamed from: j */
    public int f17180j;

    /* renamed from: k */
    public final C0052o<Integer> f17181k = new C0052o<>();

    /* renamed from: l */
    public C9312a<Long> f17182l = new C9312a<>("live_commerce_banner_last_close_id", Long.valueOf(-1));

    /* renamed from: m */
    private long f17183m;

    /* renamed from: com.bytedance.android.livesdk.commerce.LiveGoodsViewModel$a */
    static final class C5837a<T> implements C7326g<C3474a<C5851e, C2344a>> {

        /* renamed from: a */
        final /* synthetic */ LiveGoodsViewModel f17184a;

        C5837a(LiveGoodsViewModel liveGoodsViewModel) {
            this.f17184a = liveGoodsViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3474a<C5851e, C2344a> aVar) {
            this.f17184a.f17180j += aVar.f10296b.size();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.commerce.LiveGoodsViewModel$b */
    static final class C5838b<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ LiveGoodsViewModel f17185a;

        /* renamed from: b */
        final /* synthetic */ boolean f17186b;

        C5838b(LiveGoodsViewModel liveGoodsViewModel, boolean z) {
            this.f17185a = liveGoodsViewModel;
            this.f17186b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<List<Object>, C2344a> apply(C3474a<C5851e, C2344a> aVar) {
            C7573i.m23587b(aVar, "response");
            ArrayList arrayList = new ArrayList();
            if (!C6311g.m19573a(aVar.f10296b)) {
                if (this.f17186b) {
                    C3338l<C5852f> lVar = C5864b.f17272a;
                    C7573i.m23582a((Object) lVar, "LiveOtherSettingKeys.LIVE_COMMERCE_BANNER");
                    C5852f fVar = (C5852f) lVar.mo10240a();
                    if (fVar != null) {
                        long j = fVar.f17226a;
                        Object a = this.f17185a.f17182l.mo22117a();
                        C7573i.m23582a(a, "LIVE_COMMERCE_BANNER_LAST_CLOSE_ID.value");
                        if (j > ((Number) a).longValue()) {
                            arrayList.add(fVar);
                        }
                    }
                }
                arrayList.addAll(aVar.f10296b);
            }
            ((C2344a) aVar.f10297c).f7698e = ((C2344a) aVar.f10297c).now;
            this.f17185a.f17181k.postValue(Integer.valueOf(((C2344a) aVar.f10297c).f7702i));
            return Pair.create(arrayList, aVar.f10297c);
        }
    }

    /* renamed from: a */
    public final LiveGoodsViewModel mo14337a(long j) {
        this.f17183m = j;
        return this;
    }

    /* renamed from: a */
    public final void mo14338a(C5852f fVar) {
        if (fVar != null) {
            this.f17182l.mo22118a(Long.valueOf(fVar.f17226a));
            mo10112a(fVar);
        }
    }

    /* renamed from: a */
    public final C7492s<Pair<List<Object>, C2344a>> mo10093a(boolean z, Long l, int i) {
        if (z) {
            this.f17180j = 0;
        }
        C7492s<Pair<List<Object>, C2344a>> d = C5848a.m18316a(this.f17183m, (long) this.f17180j, 10).mo19316d((C7326g<? super T>) new C5837a<Object>(this)).mo19317d((C7327h<? super T, ? extends R>) new C5838b<Object,Object>(this, z));
        C7573i.m23582a((Object) d, "LiveCommerceService.fetc….extra)\n                }");
        return d;
    }
}
