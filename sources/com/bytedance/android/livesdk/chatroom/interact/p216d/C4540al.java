package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKSettingContract.C4512a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKSettingContract.View;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.common.utility.C6319n;
import p346io.reactivex.C7494t;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.al */
public final class C4540al extends C4512a {

    /* renamed from: d */
    private int f13148d = ((Integer) C8946b.f24390aO.mo22117a()).intValue();

    /* renamed from: e */
    private int f13149e = ((Integer) C8946b.f24391aP.mo22117a()).intValue();

    /* renamed from: f */
    private String f13150f;

    /* renamed from: c */
    public final int mo12320c() {
        return this.f13148d;
    }

    /* renamed from: d */
    public final int mo12321d() {
        return this.f13149e;
    }

    /* renamed from: e */
    public final String mo12322e() {
        return this.f13150f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12388a(C3479d dVar) throws Exception {
        ((View) this.f13121b).mo12315h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12389b(C3479d dVar) throws Exception {
        ((View) this.f13121b).mo12310a();
    }

    /* renamed from: a */
    public final void mo12317a(String str) {
        if (!C6319n.m19593a(str)) {
            this.f13150f = str;
        }
    }

    public C4540al(View view) {
        super(view);
    }

    /* renamed from: b */
    public final void mo12319b(boolean z) {
        int i;
        LinkApi linkApi = (LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class);
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        C3245ad adVar = (C3245ad) linkApi.settings(i).mo19297a((C7494t<T, ? extends R>) mo12287b());
        C4543ao aoVar = new C4543ao(this);
        View view = (View) this.f13121b;
        view.getClass();
        adVar.mo10183a(aoVar, C4544ap.m15180a(view));
    }

    /* renamed from: a */
    public final void mo12318a(boolean z) {
        C3245ad adVar = (C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).settings(z ? 1 : 0).mo19297a((C7494t<T, ? extends R>) mo12287b());
        C4541am amVar = new C4541am(this);
        View view = (View) this.f13121b;
        view.getClass();
        adVar.mo10183a(amVar, C4542an.m15179a(view));
    }

    /* renamed from: a */
    public final void mo12316a(int i, int i2) {
        this.f13148d = i;
        this.f13149e = i2;
        C8946b.f24390aO.mo22118a(Integer.valueOf(this.f13148d));
        C8946b.f24391aP.mo22118a(Integer.valueOf(i2));
        ((View) this.f13121b).mo12311a(this.f13148d);
    }
}
