package com.bytedance.android.livesdk.rank.p421c;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.adapter.LiveMultiTypeAdapter;
import com.bytedance.android.livesdk.chatroom.model.UserRankExtra;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.rank.model.C8855d;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.p419a.C8811c.C8812a;
import com.bytedance.android.livesdk.rank.p419a.C8811c.C8813b;
import com.bytedance.android.livesdk.rank.viewbinder.C8899n;
import com.bytedance.android.livesdk.rank.viewbinder.C8901o;
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

/* renamed from: com.bytedance.android.livesdk.rank.c.j */
public final class C8830j implements C8813b, C6310a {

    /* renamed from: a */
    private static int f23995a = 100;

    /* renamed from: b */
    private C6309f f23996b = new C6309f(this);

    /* renamed from: c */
    private C8812a f23997c;

    /* renamed from: d */
    private long f23998d;

    /* renamed from: e */
    private long f23999e;

    /* renamed from: f */
    private boolean f24000f;

    /* renamed from: g */
    private DataCenter f24001g;

    /* renamed from: h */
    private C3477b<CurrentRankListResponse, UserRankExtra> f24002h;

    /* renamed from: i */
    private LiveMultiTypeAdapter f24003i;

    /* renamed from: c */
    private boolean m26437c() {
        if (this.f24002h.data == null || C6307b.m19566a((Collection<T>) ((CurrentRankListResponse) this.f24002h.data).ranks)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo21897a() {
        C4275g.m14447a((Handler) this.f23996b, this.f23998d, this.f23999e, 22);
    }

    /* renamed from: b */
    private void m26436b() {
        int i;
        this.f23997c.mo21892a(false, null);
        if (this.f24002h == null) {
            this.f23997c.mo21890a();
            return;
        }
        if (this.f24002h.data != null && !C6311g.m19573a(((CurrentRankListResponse) this.f24002h.data).ranks)) {
            C7492s.m23300b((Iterable<? extends T>) ((CurrentRankListResponse) this.f24002h.data).ranks).mo19291a(C8831k.f24004a).mo19334m().mo19129a((C7326g<? super T>) new C8832l<Object>(this), C8833m.f24006a);
        }
        if (m26437c()) {
            this.f23997c.mo21893b();
            return;
        }
        CurrentRankListResponse currentRankListResponse = (CurrentRankListResponse) this.f24002h.data;
        int size = currentRankListResponse.ranks.size();
        ArrayList arrayList = new ArrayList(size + 1);
        if (this.f23997c.getContext() != null) {
            arrayList.addAll(currentRankListResponse.ranks);
            if (size >= f23995a) {
                arrayList.add(new C8855d(C3358ac.m12515a((int) R.string.f9_)));
            } else {
                if (this.f24001g != null) {
                    i = ((Integer) this.f24001g.get("data_member_count", Integer.valueOf(-1))).intValue();
                } else {
                    i = -1;
                }
                if (i != -1) {
                    int i2 = i - size;
                    if (i2 > 0) {
                        arrayList.add(new C8855d(C3358ac.m12517a((int) R.string.f99, C3385e.m12593c((long) i2))));
                    }
                }
            }
            this.f24003i = new LiveMultiTypeAdapter();
            this.f24003i.mo120457a(C8855d.class, new C8899n());
            C8901o oVar = new C8901o(TTLiveSDKContext.getHostService().mo22367h(), this.f24000f, 0, this.f23997c.getFragment(), 22);
            this.f24003i.mo120457a(C8857f.class, oVar);
            this.f24003i.mo11418a(arrayList);
            this.f23997c.mo21891a(this.f24003i);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m26435a(C8857f fVar) throws Exception {
        if (fVar == null || fVar.f24097a == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21904a(List list) throws Exception {
        ((CurrentRankListResponse) this.f24002h.data).ranks = list;
    }

    public final void handleMsg(Message message) {
        if (message.what == 24) {
            if (message.obj instanceof Exception) {
                this.f23997c.mo21890a();
            } else if (message.obj instanceof C3477b) {
                this.f24002h = (C3477b) message.obj;
                m26436b();
            }
        }
    }

    public C8830j(C8812a aVar, DataCenter dataCenter, long j, long j2, boolean z) {
        this.f23997c = aVar;
        this.f23998d = j;
        this.f23999e = j2;
        this.f24000f = z;
        this.f24001g = dataCenter;
    }
}
