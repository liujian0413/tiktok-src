package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.livesdk.chatroom.api.PkPromotionApi;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKTypeContract.C4514a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKTypeContract.View;
import com.bytedance.android.livesdk.p428w.C9178j;
import p346io.reactivex.C7494t;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.ar */
public final class C4546ar extends C4514a {
    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12390b(Throwable th) {
        mo12286a(th);
    }

    public C4546ar(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo12323a(long j) {
        ((C3245ad) ((PkPromotionApi) C9178j.m27302j().mo22373b().mo10440a(PkPromotionApi.class)).getCurrentMedal(j).mo19297a((C7494t<T, ? extends R>) mo12287b())).mo10183a(new C4547as(this), new C4548at(this));
    }
}
