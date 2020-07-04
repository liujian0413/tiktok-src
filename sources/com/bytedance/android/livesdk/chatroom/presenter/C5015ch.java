package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.chatroom.view.C5373c;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.message.model.C8546ch;
import com.bytedance.android.livesdk.message.model.C8687s;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ch */
public final class C5015ch extends C5017ci<C5373c> implements C6310a, OnMessageListener {

    /* renamed from: a */
    private C6309f f14271a = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: b */
    private boolean f14272b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ch$1 */
    static /* synthetic */ class C50161 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14273a = new int[MessageType.values().length];

        static {
            try {
                f14273a[MessageType.USER_SEQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        this.f14271a = new C6309f(Looper.getMainLooper(), this);
        this.f14272b = false;
    }

    /* renamed from: a */
    public final void mo9142a(C5373c cVar) {
        super.mo9142a(cVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.USER_SEQ.getIntType(), this);
        }
    }

    public final void handleMsg(Message message) {
        int i = message.what;
        if (mo9140c() != null && i == 24) {
            if (message.obj instanceof Exception) {
                Object obj = message.obj;
            } else if (message.obj instanceof C3477b) {
                C3477b bVar = (C3477b) message.obj;
                if (bVar.data instanceof CurrentRankListResponse) {
                    CurrentRankListResponse currentRankListResponse = (CurrentRankListResponse) bVar.data;
                    int i2 = (int) currentRankListResponse.total;
                    ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).updateGameMsgViewUserCount(i2);
                    ((C5373c) mo9140c()).mo13663a(i2);
                    if (!C6307b.m19566a((Collection<T>) currentRankListResponse.ranks) || !C6307b.m19566a((Collection<T>) currentRankListResponse.seats)) {
                        ((C5373c) mo9140c()).mo13664a(currentRankListResponse.seats, currentRankListResponse.ranks);
                    } else {
                        return;
                    }
                }
            }
            this.f14272b = false;
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (!(mo9140c() == null || iMessage == null || !(iMessage instanceof C8538c))) {
            if (C50161.f14273a[((C8538c) iMessage).getMessageType().ordinal()] == 1 && (iMessage instanceof C8546ch)) {
                C8546ch chVar = (C8546ch) iMessage;
                int i = (int) chVar.f23535a;
                ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).updateGameMsgViewUserCount(i);
                ((C5373c) mo9140c()).mo13663a(i);
                if (chVar.f23536b != null || i >= 0) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    if (!C6307b.m19566a((Collection<T>) chVar.f23538d)) {
                        for (C8687s sVar : chVar.f23538d) {
                            if (sVar != null) {
                                C8857f fVar = new C8857f();
                                fVar.f24097a = sVar.f23666a;
                                fVar.f24098b = sVar.f23667b;
                                fVar.f24099c = (int) sVar.f23668c;
                                fVar.f24101e = sVar.f23669d;
                                arrayList2.add(fVar);
                            }
                        }
                    }
                    if (!C6307b.m19566a((Collection<T>) chVar.f23536b)) {
                        for (C8687s sVar2 : chVar.f23536b) {
                            if (sVar2 != null) {
                                C8857f fVar2 = new C8857f();
                                fVar2.f24097a = sVar2.f23666a;
                                fVar2.f24098b = sVar2.f23667b;
                                fVar2.f24099c = (int) sVar2.f23668c;
                                fVar2.f24101e = sVar2.f23669d;
                                arrayList.add(fVar2);
                            }
                        }
                    }
                    ((C5373c) mo9140c()).mo13664a(arrayList2, arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13029a(long j, long j2, int i) {
        if (!this.f14272b) {
            this.f14272b = true;
            C4275g.m14447a((Handler) this.f14271a, j, j2, 18);
        }
    }
}
