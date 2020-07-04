package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8431c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.user.C8976b.C8977a;
import com.bytedance.android.livesdk.user.C8976b.C8978b;
import com.bytedance.android.livesdk.user.C8985f;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.h */
public final class C4400h {

    /* renamed from: a */
    public final C47562b f12806a = new C47562b();

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.h$a */
    public interface C4402a {
        /* renamed from: a */
        void mo12085a(FollowPair followPair);

        /* renamed from: a */
        void mo12087a(Throwable th);
    }

    /* renamed from: a */
    public final void mo12126a() {
        this.f12806a.mo119660a();
    }

    /* renamed from: a */
    public final void mo12127a(long j, Room room, String str, final C4402a aVar) {
        boolean z;
        String str2;
        if (room != null) {
            TTLiveSDKContext.getHostService().mo22367h().mo22168a(((C8978b) ((C8978b) ((C8978b) ((C8978b) ((C8978b) ((C8977a) C8985f.m26861a().mo22153a(j)).mo22154a(room.getRequestId())).mo22157b("live_detail")).mo22158c("live_over")).mo22156b(0)).mo22159d(room.getLabels())).mo22160c()).mo19189a((C7498y<? super T>) new C7498y<FollowPair>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C7321c cVar) {
                    C4400h.this.f12806a.mo119661a(cVar);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNext(FollowPair followPair) {
                    if (aVar != null) {
                        aVar.mo12085a(followPair);
                    }
                }

                public final void onError(Throwable th) {
                    if (aVar != null) {
                        aVar.mo12087a(th);
                    }
                }
            });
            if (room.getOwner() == null || room.getOwner().getId() != j) {
                z = false;
            } else {
                z = true;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("growth_deepevent", "1");
                C8443c a = C8443c.m25663a();
                String str3 = "follow";
                Object[] objArr = new Object[3];
                if (z) {
                    str2 = "live_over";
                } else {
                    str2 = "live_anchor_c_audience";
                }
                objArr[0] = new C8431c(str2, j);
                objArr[1] = new C8438j().mo21599b("live_interact").mo21603f("core").mo21598a("live_detail");
                objArr[2] = Room.class;
                a.mo21606a(str3, hashMap, objArr);
            } catch (Exception unused) {
            }
        }
    }
}
