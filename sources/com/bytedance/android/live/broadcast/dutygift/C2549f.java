package com.bytedance.android.live.broadcast.dutygift;

import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.broadcast.api.p125a.C2415a;
import com.bytedance.android.live.broadcast.api.p125a.C2415a.C2416a;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.message.model.C8477ae;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.p533a.C10291b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.broadcast.dutygift.f */
public class C2549f extends C10291b<C2416a> implements C2415a, OnMessageListener {

    /* renamed from: a */
    protected Room f8200a;

    /* renamed from: b */
    private DataCenter f8201b;

    /* renamed from: c */
    private IMessageManager f8202c;

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        if (this.f8202c != null) {
            this.f8202c.removeMessageListener(MessageType.DUTY_GIFT_MESSAGE.getIntType(), this);
        }
    }

    /* renamed from: b */
    private void mo9139b() {
        if (this.f8200a != null && this.f8200a.getOwner() != null) {
            C2515f.m10417f().mo9076c().mo9172g().dutyGiftRequest(this.f8200a.getId(), this.f8200a.getOwner().getId(), 1, false).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C2550g<Object>(this), (C7326g<? super Throwable>) new C2551h<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9143b(C3479d dVar) throws Exception {
        ((C2416a) mo9140c()).mo8873a((DutyGiftInfo) dVar.data);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9144b(Throwable th) throws Exception {
        ((C2416a) mo9140c()).mo8873a(null);
    }

    /* renamed from: a */
    private static DutyGiftInfo m10509a(C8477ae aeVar) {
        DutyGiftInfo dutyGiftInfo = new DutyGiftInfo();
        dutyGiftInfo.setGiftId((long) aeVar.f23202a);
        dutyGiftInfo.setTargetScore((long) aeVar.f23203b);
        dutyGiftInfo.setStageCount((long) aeVar.f23204c);
        dutyGiftInfo.setStatus(aeVar.f23205d);
        dutyGiftInfo.setScore((long) aeVar.f23206e);
        dutyGiftInfo.setMvpUser(aeVar.f23207f);
        dutyGiftInfo.setDutyId(aeVar.f23208g);
        return dutyGiftInfo;
    }

    public void onMessage(IMessage iMessage) {
        if (mo9140c() != null && (iMessage instanceof C8477ae)) {
            ((C2416a) mo9140c()).mo8874b(m10509a((C8477ae) iMessage));
            this.f8201b.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(5));
        }
    }

    /* renamed from: a */
    public final void mo9142a(C2416a aVar) {
        super.mo9142a(aVar);
        this.f8202c = (IMessageManager) this.f8201b.get("data_message_manager");
        if (this.f8202c != null) {
            this.f8202c.addMessageListener(MessageType.DUTY_GIFT_MESSAGE.getIntType(), this);
        }
        mo9139b();
    }

    public C2549f(Room room, DataCenter dataCenter) {
        this.f8200a = room;
        this.f8201b = dataCenter;
    }
}
