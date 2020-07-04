package com.bytedance.android.livesdk.chatroom.detail;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.google.gson.C6600e;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.g */
public final class C4327g implements C6310a {

    /* renamed from: a */
    private final Handler f12568a = new C6309f(this);

    /* renamed from: b */
    private final long f12569b;

    /* renamed from: c */
    private final long f12570c;

    /* renamed from: d */
    private final String f12571d;

    /* renamed from: e */
    private final boolean f12572e;

    /* renamed from: f */
    private final C4328a f12573f;

    /* renamed from: g */
    private boolean f12574g = false;

    /* renamed from: h */
    private C6600e f12575h;

    /* renamed from: i */
    private long f12576i = ((long) ((Integer) LiveConfigSettingKeys.AUDIENCE_PING_INTERVAL.mo10240a()).intValue());

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.g$a */
    public interface C4328a {
        /* renamed from: a */
        void mo12016a(int i);

        /* renamed from: a */
        boolean mo12017a();

        /* renamed from: b */
        void mo12018b();

        /* renamed from: c */
        void mo12019c();
    }

    /* renamed from: a */
    public final void mo12014a() {
        if (!this.f12574g) {
            this.f12574g = true;
            m14546c();
        }
    }

    /* renamed from: b */
    public final void mo12015b() {
        if (this.f12574g) {
            this.f12574g = false;
            this.f12568a.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: c */
    private void m14546c() {
        if (!this.f12574g || !this.f12573f.mo12017a()) {
            mo12015b();
            return;
        }
        C4275g.m14450a(this.f12568a, this.f12569b, this.f12570c, this.f12572e, 7);
        if (this.f12576i > 0 && this.f12576i >= ((long) ((Integer) LiveConfigSettingKeys.AUDIENCE_PING_INTERVAL.mo10240a()).intValue())) {
            this.f12568a.sendMessageDelayed(this.f12568a.obtainMessage(8), this.f12576i * 1000);
        }
    }

    public final void handleMsg(Message message) {
        if (this.f12574g) {
            switch (message.what) {
                case 7:
                    m14545a(message.obj);
                    return;
                case 8:
                    m14546c();
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m14545a(Object obj) {
        if (this.f12574g) {
            if (obj instanceof ApiServerException) {
                int errorCode = ((ApiServerException) obj).getErrorCode();
                if (30001 == errorCode || 30003 == errorCode || 30004 == errorCode) {
                    this.f12573f.mo12016a(errorCode);
                } else {
                    if (50002 == errorCode) {
                        this.f12573f.mo12019c();
                    }
                }
            } else if (obj instanceof PingResult) {
                long currentTimeMillis = System.currentTimeMillis();
                C3166a.m11953a(2, "pingresult", this.f12575h.mo15979b(obj));
                C3166a.m11956a("pingresultCostTime", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                PingResult pingResult = (PingResult) obj;
                this.f12576i = pingResult.getNextPingInterval();
                if (4 == pingResult.getRoomStatus() && pingResult.getRoomId() == this.f12569b) {
                    this.f12573f.mo12018b();
                } else if (pingResult.getMosaicStatus() != 0) {
                    pingResult.getRoomId();
                    pingResult.getMosaicStatus();
                }
            }
        }
    }

    public C4327g(long j, long j2, String str, boolean z, C4328a aVar) {
        this.f12569b = j;
        this.f12570c = j2;
        this.f12571d = str;
        this.f12572e = false;
        this.f12573f = aVar;
        this.f12575h = C2317a.m9932a();
    }
}
