package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogButtonContract.C4507a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogButtonContract.View;
import com.bytedance.android.livesdk.p428w.C9178j;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.k */
public final class C4743k extends C4507a {
    public C4743k(View view) {
        super(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12662a(C3479d dVar) throws Exception {
        ((View) this.f13121b).mo12276a();
    }

    /* renamed from: a */
    public final void mo12278a(long j) {
        C7492s a = ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).checkPermissionV3(j).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
        C4744l lVar = new C4744l(this);
        View view = (View) this.f13121b;
        view.getClass();
        a.mo19280a((C7326g<? super T>) lVar, C4745m.m15617a(view));
    }
}
