package com.bytedance.android.livesdk.chatroom.p212e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.LotteryEventMessage;
import com.bytedance.android.livesdkapi.message.C9500b;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.android.livesdkapi.message.C9507h;
import com.bytedance.android.livesdkapi.message.C9511l;
import com.bytedance.android.livesdkapi.message.PieceType;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.m */
public final class C4360m extends C4343b<LotteryEventMessage> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        return null;
    }

    /* renamed from: e */
    public final User mo12065e() {
        Object obj;
        boolean z;
        LotteryEventMessage lotteryEventMessage = (LotteryEventMessage) this.f12647a;
        if (lotteryEventMessage != null) {
            C9500b bVar = lotteryEventMessage.baseMessage;
            if (bVar != null) {
                C9505f fVar = bVar.f26000j;
                if (fVar != null) {
                    List<C9507h> list = fVar.f26016d;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            C9507h hVar = (C9507h) obj;
                            C7573i.m23582a((Object) hVar, "it");
                            if (hVar.f26020a != PieceType.USER.getPieceType() || hVar.f26023d == null) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        C9507h hVar2 = (C9507h) obj;
                        if (hVar2 != null) {
                            C9511l lVar = hVar2.f26023d;
                            if (lVar != null) {
                                return lVar.f26032a;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public C4360m(LotteryEventMessage lotteryEventMessage) {
        C7573i.m23587b(lotteryEventMessage, "message");
        super(lotteryEventMessage);
    }
}
