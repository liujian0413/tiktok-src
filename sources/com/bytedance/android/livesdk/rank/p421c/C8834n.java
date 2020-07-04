package com.bytedance.android.livesdk.rank.p421c;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.adapter.LiveMultiTypeAdapter;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.model.PeriodRankExtra;
import com.bytedance.android.livesdk.rank.p419a.C8811c.C8812a;
import com.bytedance.android.livesdk.rank.p419a.C8811c.C8813b;
import com.bytedance.android.livesdk.rank.viewbinder.C8901o;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.List;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.bytedance.android.livesdk.rank.c.n */
public final class C8834n implements C8813b, C6310a {

    /* renamed from: a */
    private C6309f f24007a = new C6309f(this);

    /* renamed from: b */
    private C8812a f24008b;

    /* renamed from: c */
    private long f24009c;

    /* renamed from: d */
    private long f24010d;

    /* renamed from: e */
    private boolean f24011e;

    /* renamed from: f */
    private int f24012f;

    /* renamed from: g */
    private DataCenter f24013g;

    /* renamed from: h */
    private C3477b<CurrentRankListResponse, PeriodRankExtra> f24014h;

    /* renamed from: i */
    private LiveMultiTypeAdapter f24015i;

    /* renamed from: a */
    public final void mo21897a() {
        C4275g.m14445a((Handler) this.f24007a, this.f24010d, this.f24012f, this.f24009c);
    }

    /* renamed from: b */
    private void m26441b() {
        if (this.f24014h == null) {
            this.f24008b.mo21890a();
            return;
        }
        if (this.f24014h.data != null && !C6311g.m19573a(((CurrentRankListResponse) this.f24014h.data).ranks)) {
            C7492s.m23300b((Iterable<? extends T>) ((CurrentRankListResponse) this.f24014h.data).ranks).mo19291a((C7328l<? super T>) new C8835o<Object>(this)).mo19334m().mo19129a((C7326g<? super T>) new C8836p<Object>(this), C8837q.f24018a);
        }
        C8857f fVar = null;
        if (this.f24014h.data == null || C6311g.m19573a(((CurrentRankListResponse) this.f24014h.data).ranks)) {
            this.f24008b.mo21893b();
            if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                this.f24008b.mo21894c();
            } else {
                this.f24008b.mo21892a(false, null);
            }
        } else {
            this.f24015i = new LiveMultiTypeAdapter();
            C8901o oVar = new C8901o(TTLiveSDKContext.getHostService().mo22367h(), this.f24011e, 10, this.f24008b.getFragment(), this.f24012f);
            this.f24015i.mo120457a(C8857f.class, oVar);
            this.f24015i.mo11418a(((CurrentRankListResponse) this.f24014h.data).ranks);
            this.f24008b.mo21891a(this.f24015i);
            if (this.f24014h.data != null) {
                fVar = ((CurrentRankListResponse) this.f24014h.data).selfInfo;
            }
            this.f24008b.mo21892a(!this.f24011e, fVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21905a(List list) throws Exception {
        ((CurrentRankListResponse) this.f24014h.data).ranks = list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo21906a(C8857f fVar) throws Exception {
        if (fVar == null || fVar.f24097a == null) {
            return false;
        }
        return true;
    }

    public final void handleMsg(Message message) {
        if (message.what == 31) {
            if (message.obj instanceof Exception) {
                this.f24008b.mo21890a();
                C3166a.m11955a(6, "PeriodRankPresent", ((Exception) message.obj).getStackTrace());
            }
            if (message.obj instanceof C3477b) {
                this.f24014h = (C3477b) message.obj;
                m26441b();
            }
        }
    }

    public C8834n(C8812a aVar, DataCenter dataCenter, long j, long j2, boolean z, int i) {
        this.f24008b = aVar;
        this.f24009c = j;
        this.f24010d = j2;
        this.f24011e = z;
        this.f24013g = dataCenter;
        this.f24012f = i;
    }
}
