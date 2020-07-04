package com.bytedance.android.livesdk.viewmodel;

import com.bytedance.android.livesdk.log.C8444d;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p354j.C47844a;

/* renamed from: com.bytedance.android.livesdk.viewmodel.f */
public final class C9143f implements C9141d<ILotteryState, ILotteryAction, C7581n> {

    /* renamed from: a */
    public ILotteryState f24846a = new LotteryIdle();

    /* renamed from: b */
    private final C47844a<ILotteryState> f24847b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo22344a() {
        return this.f24846a;
    }

    /* renamed from: b */
    public final C7492s<ILotteryState> mo22346b() {
        return this.f24847b;
    }

    public C9143f() {
        C47844a<ILotteryState> a = C47844a.m148743a(this.f24846a);
        C7573i.m23582a((Object) a, "BehaviorSubject.createDefault(_state)");
        this.f24847b = a;
    }

    /* renamed from: a */
    private final void m27203a(ILotteryState iLotteryState) {
        this.f24846a = iLotteryState;
        this.f24847b.onNext(iLotteryState);
    }

    /* renamed from: a */
    public final void mo22345a(ILotteryAction iLotteryAction) {
        C7573i.m23587b(iLotteryAction, "action");
        ILotteryState iLotteryState = this.f24846a;
        m27204b(iLotteryAction);
        ILotteryState iLotteryState2 = this.f24846a;
        C8444d.m25673b();
        StringBuilder sb = new StringBuilder("state mutated from=");
        sb.append(iLotteryState);
        sb.append(" to=");
        sb.append(iLotteryState2);
        sb.append(" action=");
        sb.append(iLotteryAction);
        C8444d.m11970a("ttlive_lottery", sb.toString());
    }

    /* renamed from: b */
    private final void m27204b(ILotteryAction iLotteryAction) {
        if (iLotteryAction instanceof ResetLottery) {
            m27203a((ILotteryState) new LotteryIdle());
            return;
        }
        ILotteryState iLotteryState = this.f24846a;
        if (!(iLotteryState instanceof LotteryIdle)) {
            if (iLotteryState instanceof LotteryReviewPending) {
                if (iLotteryAction instanceof StartLottery) {
                    StartLottery startLottery = (StartLottery) iLotteryAction;
                    LotteryWaiting lotteryWaiting = new LotteryWaiting(startLottery.getLotteryId(), startLottery.getRoomId(), startLottery.getAnchorId(), startLottery.getUserId(), startLottery.getLocalDrawTime());
                    m27203a((ILotteryState) lotteryWaiting);
                }
            } else if ((iLotteryState instanceof LotteryWaiting) && (iLotteryAction instanceof FinishLottery)) {
                LotteryWaiting lotteryWaiting2 = (LotteryWaiting) iLotteryState;
                m27203a((ILotteryState) new LotteryFinishing(lotteryWaiting2.getRoomId(), lotteryWaiting2.getLotteryId()));
                m27203a((ILotteryState) new LotteryIdle());
            }
        } else if (iLotteryAction instanceof SubmitLottery) {
            m27203a((ILotteryState) new LotteryReviewPending());
        } else {
            if (iLotteryAction instanceof StartLottery) {
                StartLottery startLottery2 = (StartLottery) iLotteryAction;
                LotteryWaiting lotteryWaiting3 = new LotteryWaiting(startLottery2.getLotteryId(), startLottery2.getRoomId(), startLottery2.getAnchorId(), startLottery2.getUserId(), startLottery2.getLocalDrawTime());
                m27203a((ILotteryState) lotteryWaiting3);
            }
        }
    }
}
