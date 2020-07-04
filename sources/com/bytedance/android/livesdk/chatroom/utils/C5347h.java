package com.bytedance.android.livesdk.chatroom.utils;

import com.bytedance.android.live.core.rxutils.C3314p;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8423n;
import com.bytedance.android.livesdk.viewmodel.ILotteryState;
import com.bytedance.android.livesdk.viewmodel.LotteryWaiting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.h */
public final class C5347h extends C3314p<ILotteryState> {
    /* renamed from: b */
    private static C8423n m17055b() {
        C8416g a = C8443c.m25663a().mo21605a(Room.class);
        if (!(a instanceof C8423n)) {
            a = null;
        }
        return (C8423n) a;
    }

    /* renamed from: a */
    public final void mo13637a() {
        C8423n b = m17055b();
        if (b != null) {
            b.mo21569a("lottery_id");
        }
        C8444d.m25673b();
        C8444d.m11971b("ttlive_lottery", "logInjector cleared");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onNext(ILotteryState iLotteryState) {
        C7573i.m23587b(iLotteryState, "t");
        if (iLotteryState instanceof LotteryWaiting) {
            C8423n b = m17055b();
            if (b != null) {
                b.mo21570a("lottery_id", String.valueOf(((LotteryWaiting) iLotteryState).getLotteryId()));
            }
            C8444d.m25673b();
            C8444d.m11971b("ttlive_lottery", "logInjector updated");
            return;
        }
        mo13637a();
    }
}
