package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.message.model.C8529bs;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class PromotionStatusPresenter extends C5017ci<C4932a> implements OnMessageListener {

    /* renamed from: a */
    public int f14135a;

    /* renamed from: b */
    public int f14136b;

    /* renamed from: c */
    private PromotionStatus f14137c = PromotionStatus.IDLE;

    /* renamed from: d */
    private long f14138d;

    /* renamed from: e */
    private int f14139e;

    /* renamed from: f */
    private int f14140f = 1;

    public enum PromotionStatus {
        IDLE,
        IN_PROGRESS,
        FINISHED
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.PromotionStatusPresenter$a */
    public interface C4932a extends C5595at {
        /* renamed from: a */
        void mo12897a(int i, int i2);

        /* renamed from: a */
        void mo12898a(PromotionStatus promotionStatus, long j);
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        this.f14138d = 0;
        this.f14135a = 0;
        this.f14139e = 0;
        this.f14136b = 0;
    }

    public PromotionStatusPresenter(int i) {
    }

    /* renamed from: a */
    public final void mo9142a(C4932a aVar) {
        super.mo9142a(aVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.PROMOTION_CARD_MESSAGE.getIntType(), this);
        }
        this.f14138d = ((Long) this.f14275g.get("data_room_id")).longValue();
    }

    public final void onMessage(IMessage iMessage) {
        PromotionStatus promotionStatus;
        if (mo9140c() != null && (iMessage instanceof C8529bs) && (!((Boolean) C5864b.f17270Y.mo10240a()).booleanValue() || this.f14140f != 1)) {
            C8529bs bsVar = (C8529bs) iMessage;
            if (bsVar.f23451f == this.f14140f) {
                String str = bsVar.f23446a;
                char c = 65535;
                if (str.hashCode() == -1422071172 && str.equals("card_progress")) {
                    c = 0;
                }
                if (c == 0) {
                    if (bsVar.mo21667a()) {
                        promotionStatus = PromotionStatus.FINISHED;
                    } else {
                        promotionStatus = PromotionStatus.IN_PROGRESS;
                    }
                    this.f14136b = bsVar.f23452g;
                    if (this.f14137c != promotionStatus) {
                        this.f14137c = promotionStatus;
                        ((C4932a) mo9140c()).mo12898a(promotionStatus, this.f14138d);
                        this.f14135a = 0;
                        this.f14139e = 0;
                    }
                    if (this.f14137c == PromotionStatus.IN_PROGRESS && (this.f14135a < bsVar.f23449d || this.f14139e != bsVar.f23448c)) {
                        if (this.f14139e != bsVar.f23448c) {
                            ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
                        }
                        this.f14135a = bsVar.f23449d;
                        this.f14139e = bsVar.f23448c;
                        ((C4932a) mo9140c()).mo12897a(this.f14135a, this.f14139e);
                    }
                }
            }
        }
    }
}
