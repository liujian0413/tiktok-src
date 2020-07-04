package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogSettingContract.C4516a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogSettingContract.View;
import com.bytedance.android.livesdk.p428w.C9178j;
import p346io.reactivex.C7494t;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.bc */
public final class C4558bc extends C4516a {
    public C4558bc(View view) {
        super(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12397a(C3479d dVar) throws Exception {
        ((View) this.f13121b).mo12334h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12398b(C3479d dVar) throws Exception {
        ((View) this.f13121b).mo12331a();
    }

    /* renamed from: a */
    public final void mo12335a(boolean z) {
        C3245ad adVar = (C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).settings(z ? 1 : 0).mo19297a((C7494t<T, ? extends R>) mo12287b());
        C4559bd bdVar = new C4559bd(this);
        View view = (View) this.f13121b;
        view.getClass();
        adVar.mo10183a(bdVar, C4560be.m15197a(view));
    }

    /* renamed from: b */
    public final void mo12336b(boolean z) {
        int i;
        LinkApi linkApi = (LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class);
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        C3245ad adVar = (C3245ad) linkApi.settings(i).mo19297a((C7494t<T, ? extends R>) mo12287b());
        C4561bf bfVar = new C4561bf(this);
        View view = (View) this.f13121b;
        view.getClass();
        adVar.mo10183a(bfVar, C4562bg.m15198a(view));
    }
}
