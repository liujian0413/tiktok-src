package com.bytedance.android.livesdk.rank.p421c;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.core.utils.C3409v;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.adapter.LiveMultiTypeAdapter;
import com.bytedance.android.livesdk.chatroom.model.UserRankExtra;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.rank.model.C8855d;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.rank.model.C8858g;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.p419a.C8811c.C8812a;
import com.bytedance.android.livesdk.rank.p419a.C8811c.C8813b;
import com.bytedance.android.livesdk.rank.viewbinder.C8899n;
import com.bytedance.android.livesdk.rank.viewbinder.C8901o;
import com.bytedance.android.livesdk.rank.viewbinder.C8908t;
import com.bytedance.android.livesdk.rank.viewbinder.C8910u;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.bytedance.android.livesdk.rank.c.a */
public final class C8821a implements C8813b, C6310a {

    /* renamed from: a */
    private C6309f f23969a = new C6309f(this);

    /* renamed from: b */
    private C8812a f23970b;

    /* renamed from: c */
    private long f23971c;

    /* renamed from: d */
    private long f23972d;

    /* renamed from: e */
    private boolean f23973e;

    /* renamed from: f */
    private DataCenter f23974f;

    /* renamed from: g */
    private C3477b<CurrentRankListResponse, UserRankExtra> f23975g;

    /* renamed from: h */
    private LiveMultiTypeAdapter f23976h;

    /* renamed from: a */
    public final void mo21897a() {
        C4275g.m14447a((Handler) this.f23969a, this.f23971c, this.f23972d, 17);
    }

    /* renamed from: c */
    private boolean m26422c() {
        if (this.f23975g.data == null || (C6307b.m19566a((Collection<T>) ((CurrentRankListResponse) this.f23975g.data).ranks) && C6307b.m19566a((Collection<T>) ((CurrentRankListResponse) this.f23975g.data).seats))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m26421b() {
        String str;
        if (this.f23975g == null) {
            this.f23970b.mo21890a();
            return;
        }
        if (this.f23975g.data != null && !C6311g.m19573a(((CurrentRankListResponse) this.f23975g.data).ranks)) {
            C7492s.m23300b((Iterable<? extends T>) ((CurrentRankListResponse) this.f23975g.data).ranks).mo19291a((C7328l<? super T>) new C8822b<Object>(this)).mo19334m().mo19129a((C7326g<? super T>) new C8823c<Object>(this), C8824d.f23979a);
        }
        if (m26422c()) {
            this.f23970b.mo21893b();
            if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                this.f23970b.mo21894c();
            } else {
                this.f23970b.mo21892a(false, null);
            }
        } else {
            CurrentRankListResponse currentRankListResponse = (CurrentRankListResponse) this.f23975g.data;
            ArrayList arrayList = new ArrayList(currentRankListResponse.ranks.size() + 1);
            if (this.f23970b.getContext() != null) {
                if (!C3409v.m12670a(currentRankListResponse.seats)) {
                    arrayList.add(new C8858g(C3358ac.m12515a((int) R.string.fe6), this.f23970b.getContext().getResources().getColor(R.color.as5)));
                    for (int i = 0; i < currentRankListResponse.seats.size(); i++) {
                        C8857f fVar = (C8857f) currentRankListResponse.seats.get(i);
                        if (fVar.f24099c <= 3) {
                            fVar.f24099c -= 3;
                        }
                    }
                    arrayList.addAll(currentRankListResponse.seats);
                    C6307b.m19566a((Collection<T>) currentRankListResponse.ranks);
                }
                if (C9290a.f25466a) {
                    str = C3385e.m12594d(currentRankListResponse.total);
                } else {
                    str = C3385e.m12592b(currentRankListResponse.total);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(currentRankListResponse.musicWave);
                sb.append(" ");
                sb.append(str);
                arrayList.add(sb.toString());
                arrayList.addAll(currentRankListResponse.ranks);
                this.f23976h = new LiveMultiTypeAdapter();
                this.f23976h.mo120457a(C8855d.class, new C8899n());
                this.f23976h.mo120457a(C8858g.class, new C8910u());
                this.f23976h.mo120457a(String.class, new C8908t());
                C8901o oVar = new C8901o(TTLiveSDKContext.getHostService().mo22367h(), this.f23973e, 3, this.f23970b.getFragment(), 17);
                this.f23976h.mo120457a(C8857f.class, oVar);
                this.f23976h.mo11418a(arrayList);
                this.f23970b.mo21891a(this.f23976h);
                this.f23970b.mo21892a(!this.f23973e, currentRankListResponse.selfInfo);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21901a(List list) throws Exception {
        ((CurrentRankListResponse) this.f23975g.data).ranks = list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo21902a(C8857f fVar) throws Exception {
        if (fVar == null || fVar.f24097a == null) {
            return false;
        }
        return true;
    }

    public final void handleMsg(Message message) {
        if (message.what == 24) {
            if (message.obj instanceof Exception) {
                this.f23970b.mo21890a();
            } else if (message.obj instanceof C3477b) {
                this.f23975g = (C3477b) message.obj;
                m26421b();
            }
        }
    }

    public C8821a(C8812a aVar, DataCenter dataCenter, long j, long j2, boolean z) {
        this.f23970b = aVar;
        this.f23971c = j;
        this.f23972d = j2;
        this.f23973e = z;
        this.f23974f = dataCenter;
    }
}
