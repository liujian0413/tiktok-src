package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.FansClubApi;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdk.utils.p426b.C9058c;
import com.bytedance.ies.p533a.C10290a;
import com.bytedance.ies.p533a.C10291b;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.q */
public final class C5036q extends C10291b<C5037a> {

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.q$a */
    public interface C5037a extends C10290a {
        /* renamed from: a */
        void mo13067a();

        /* renamed from: a */
        void mo13068a(Throwable th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13066a(Throwable th) throws Exception {
        if (mo9140c() != null) {
            ((C5037a) mo9140c()).mo13068a(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13064a(C3479d dVar) throws Exception {
        if (dVar != null && mo9140c() != null) {
            ((C5037a) mo9140c()).mo13067a();
        }
    }

    /* renamed from: a */
    public final void mo13065a(String str) {
        ((C9057b) ((FansClubApi) C9178j.m27302j().mo22373b().mo10440a(FansClubApi.class)).setPreferFansClub(str).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22249a(3).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19294a(C47549a.m148327a()).mo19304b(C7333a.m23044b()).mo19280a((C7326g<? super T>) new C5038r<Object>(this), (C7326g<? super Throwable>) new C5039s<Object>(this));
    }
}
