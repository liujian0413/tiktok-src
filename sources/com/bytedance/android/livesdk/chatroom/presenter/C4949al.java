package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.ProfileNotificationApi;
import com.bytedance.android.livesdk.chatroom.model.C4870ae;
import com.bytedance.ies.p533a.C10290a;
import com.bytedance.ies.p533a.C10291b;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.al */
public final class C4949al extends C10291b<C4950a> {

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.al$a */
    public interface C4950a extends C10290a {
        /* renamed from: a */
        void mo12932a(C4870ae aeVar);

        /* renamed from: a */
        void mo12933a(Throwable th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12930a(C3479d dVar) throws Exception {
        ((C4950a) mo9140c()).mo12932a((C4870ae) dVar.data);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12931a(Throwable th) throws Exception {
        ((C4950a) mo9140c()).mo12933a(th);
    }

    /* renamed from: a */
    public final void mo12929a(int i, String str) {
        ((ProfileNotificationApi) C3458e.m12798a().mo10440a(ProfileNotificationApi.class)).sendNewSetting(i, str).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4951am<Object>(this), (C7326g<? super Throwable>) new C4952an<Object>(this));
    }
}
