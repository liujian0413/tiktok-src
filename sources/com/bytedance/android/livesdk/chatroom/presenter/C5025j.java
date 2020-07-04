package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.GuardApi;
import com.bytedance.android.livesdk.chatroom.model.C4914l;
import com.bytedance.android.livesdk.chatroom.model.C4923s;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.message.model.C8691v;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.rank.C8851m;
import com.bytedance.android.livesdk.rank.model.C8852a;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdk.utils.p426b.C9058c;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.Map;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.j */
public final class C5025j extends C5017ci<C5026a> implements C6310a, OnMessageListener {

    /* renamed from: a */
    public long f14293a;

    /* renamed from: b */
    public long f14294b;

    /* renamed from: c */
    private boolean f14295c;

    /* renamed from: d */
    private C6309f f14296d;

    /* renamed from: e */
    private C7321c f14297e;

    /* renamed from: f */
    private boolean f14298f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.j$a */
    public interface C5026a extends C5595at {
        /* renamed from: a */
        void mo13045a(C4914l lVar);

        /* renamed from: a */
        void mo13046a(C8691v vVar);

        /* renamed from: a */
        void mo13047a(C8852a aVar);
    }

    /* renamed from: a */
    public final void mo8963a() {
        this.f14296d.removeCallbacksAndMessages(null);
        super.mo8963a();
    }

    /* renamed from: e */
    private boolean m16115e() {
        if (C8851m.m26480c(this.f14298f)) {
            return true;
        }
        C4923s sVar = (C4923s) LiveSettingKeys.LIVE_RANK_CONFIG.mo10240a();
        if (sVar == null || !sVar.f14075b) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo13043b() {
        if (!this.f14295c && this.f14293a > 0) {
            C4275g.m14448a((Handler) this.f14296d, this.f14293a, this.f14294b, 12, 1);
            this.f14295c = true;
        }
    }

    /* renamed from: d */
    public final void mo13044d() {
        this.f14297e = ((C9057b) ((GuardApi) C9178j.m27302j().mo22373b().mo10440a(GuardApi.class)).getGuardInfo(this.f14294b).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22249a(3).mo19294a(C47549a.m148327a()).mo19304b(C7333a.m23044b()).mo19280a((C7326g<? super T>) new C5027k<Object>(this), (C7326g<? super Throwable>) new C5028l<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13040a(C3479d dVar) throws Exception {
        ((C5026a) mo9140c()).mo13045a((C4914l) dVar.data);
    }

    /* renamed from: a */
    private void m16113a(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "receive_daily_rank_msg_and_not_show");
        hashMap.put("is_enable_location_rank", Boolean.valueOf(m16115e()));
        hashMap.put("msg_type", String.valueOf(i));
        C8444d.m25673b().mo9999a("ttlive_msg", (Map<String, ?>) hashMap);
    }

    /* renamed from: b */
    private boolean m16114b(int i) {
        if (i == 6) {
            return true;
        }
        C4923s sVar = (C4923s) LiveSettingKeys.LIVE_RANK_CONFIG.mo10240a();
        if (!this.f14298f && sVar == null) {
            return false;
        }
        if (this.f14298f && sVar == null && LiveSettingKeys.LIVE_RANK_ANCHOR_CONFIG.mo10240a() == null) {
            return false;
        }
        int b = C8851m.m26479b(this.f14298f);
        if (b == 0 && i == 5) {
            return true;
        }
        if (b == 1 && i == 7) {
            return true;
        }
        return false;
    }

    public final void handleMsg(Message message) {
        long j;
        if (12 == message.what) {
            this.f14295c = false;
            if ((message.obj instanceof C3477b) && mo9140c() != null) {
                C3477b bVar = (C3477b) message.obj;
                C8852a aVar = (C8852a) bVar.data;
                if (bVar.extra != null) {
                    j = bVar.extra.now;
                } else {
                    j = 0;
                }
                aVar.f24085r = j;
                ((C5026a) mo9140c()).mo13047a(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo9142a(C5026a aVar) {
        super.mo9142a(aVar);
        if (DailyRankWidget.m17194a() && this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.DAILY_RANK.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.DAILY_REGION_RANK.getIntType(), this);
        }
        this.f14296d = new C6309f(this);
        boolean z = false;
        if (this.f14275g != null && ((Boolean) this.f14275g.get("data_is_anchor", Boolean.valueOf(false))).booleanValue()) {
            z = true;
        }
        this.f14298f = z;
    }

    public final void onMessage(IMessage iMessage) {
        if (MessageType.DAILY_RANK.getIntType() == iMessage.getIntType() && mo9140c() != null) {
            C8691v vVar = (C8691v) iMessage;
            if (m16115e()) {
                if (m16114b(vVar.f23684f)) {
                    ((C5026a) mo9140c()).mo13046a(vVar);
                } else {
                    m16113a(vVar.f23684f);
                }
            } else if (vVar.f23684f == 1) {
                ((C5026a) mo9140c()).mo13046a(vVar);
            } else {
                m16113a(vVar.f23684f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13042a(Throwable th) throws Exception {
        if (this.f14297e != null && !this.f14297e.isDisposed()) {
            this.f14297e.dispose();
            this.f14297e = null;
        }
    }
}
