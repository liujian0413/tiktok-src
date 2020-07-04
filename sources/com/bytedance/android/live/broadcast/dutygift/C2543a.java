package com.bytedance.android.live.broadcast.dutygift;

import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.broadcast.api.p125a.C2415a.C2416a;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.broadcast.dutygift.a */
public final class C2543a extends C2549f {

    /* renamed from: com.bytedance.android.live.broadcast.dutygift.a$a */
    public interface C2544a extends C2416a, C5595at {
        /* renamed from: c */
        void mo9122c(DutyGiftInfo dutyGiftInfo);

        /* renamed from: d */
        void mo9124d(DutyGiftInfo dutyGiftInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C2544a mo9140c() {
        return (C2544a) super.mo9140c();
    }

    /* renamed from: b */
    public final void mo9139b() {
        if (this.f8200a != null && this.f8200a.getOwner() != null) {
            C2515f.m10417f().mo9076c().mo9172g().dutyGiftRequest(this.f8200a.getId(), this.f8200a.getOwner().getId(), 2, false).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C2545b<Object>(this), (C7326g<? super Throwable>) new C2546c<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9134a(C3479d dVar) throws Exception {
        mo9140c().mo9122c((DutyGiftInfo) dVar.data);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9135a(Throwable th) throws Exception {
        mo9140c().mo9122c(null);
    }

    /* renamed from: a */
    public final void mo9136a(boolean z) {
        if (this.f8200a != null && this.f8200a.getOwner() != null) {
            C2515f.m10417f().mo9076c().mo9172g().dutyGiftRequest(this.f8200a.getId(), this.f8200a.getOwner().getId(), 3, z).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C2547d<Object>(this, z), (C7326g<? super Throwable>) new C2548e<Object>(this, z));
        }
    }

    public C2543a(Room room, DataCenter dataCenter) {
        super(room, dataCenter);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9137a(boolean z, C3479d dVar) throws Exception {
        if (!z) {
            mo9140c().mo9124d((DutyGiftInfo) dVar.data);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9138a(boolean z, Throwable th) throws Exception {
        if (!z) {
            mo9140c().mo9124d(null);
        }
    }
}
