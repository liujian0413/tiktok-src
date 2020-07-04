package com.bytedance.android.livesdk.feed.roomdetector;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.google.gson.C6600e;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.feed.roomdetector.b */
public final class C6108b implements C6310a {

    /* renamed from: a */
    private final Handler f18040a = new C6309f(this);

    /* renamed from: b */
    private final long f18041b;

    /* renamed from: c */
    private final long f18042c;

    /* renamed from: d */
    private final String f18043d;

    /* renamed from: e */
    private final boolean f18044e;

    /* renamed from: f */
    private final C6109a f18045f;

    /* renamed from: g */
    private boolean f18046g = false;

    /* renamed from: h */
    private C6600e f18047h;

    /* renamed from: i */
    private long f18048i = ((long) ((Integer) LiveFeedSettings.AUDIENCE_PING_INTERVAL.mo10240a()).intValue());

    /* renamed from: com.bytedance.android.livesdk.feed.roomdetector.b$a */
    public interface C6109a {
        /* renamed from: a */
        void mo14772a(int i);

        /* renamed from: a */
        void mo14773a(long j, long j2);

        /* renamed from: c */
        boolean mo14774c();

        /* renamed from: d */
        void mo14775d();

        /* renamed from: e */
        void mo14776e();
    }

    /* renamed from: a */
    public final void mo14768a() {
        if (!this.f18046g) {
            this.f18046g = true;
            m19036c();
        }
    }

    /* renamed from: b */
    public final void mo14771b() {
        if (this.f18046g) {
            this.f18046g = false;
            this.f18040a.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: c */
    private void m19036c() {
        if (!this.f18046g || !this.f18045f.mo14774c()) {
            mo14771b();
            return;
        }
        ((RoomRetrofitApi) C3458e.m12798a().mo10440a(RoomRetrofitApi.class)).sendPlayingPing(this.f18041b, 1).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C6110c<Object>(this), (C7326g<? super Throwable>) new C6111d<Object>(this));
        if (this.f18048i > 0 && this.f18048i >= ((long) ((Integer) LiveFeedSettings.AUDIENCE_PING_INTERVAL.mo10240a()).intValue())) {
            this.f18040a.sendMessageDelayed(this.f18040a.obtainMessage(8), this.f18048i * 1000);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14769a(C3479d dVar) throws Exception {
        if (this.f18040a != null) {
            Message obtainMessage = this.f18040a.obtainMessage(7);
            obtainMessage.obj = dVar.data;
            this.f18040a.sendMessage(obtainMessage);
        }
    }

    public final void handleMsg(Message message) {
        if (this.f18046g) {
            switch (message.what) {
                case 7:
                    m19035a(message.obj);
                    return;
                case 8:
                    m19036c();
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14770a(Throwable th) throws Exception {
        if (this.f18040a != null) {
            Message obtainMessage = this.f18040a.obtainMessage(7);
            obtainMessage.obj = th;
            this.f18040a.sendMessage(obtainMessage);
        }
    }

    /* renamed from: a */
    private void m19035a(Object obj) {
        if (this.f18046g) {
            if (obj instanceof ApiServerException) {
                int errorCode = ((ApiServerException) obj).getErrorCode();
                if (30001 == errorCode || 30003 == errorCode || 30004 == errorCode) {
                    this.f18045f.mo14772a(errorCode);
                } else {
                    if (50002 == errorCode) {
                        this.f18045f.mo14776e();
                    }
                }
            } else if (obj instanceof PingResult) {
                long currentTimeMillis = System.currentTimeMillis();
                C3166a.m11953a(4, "pingresult", this.f18047h.mo15979b(obj));
                C3166a.m11964c("pingresultCostTime", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                PingResult pingResult = (PingResult) obj;
                this.f18048i = pingResult.getNextPingInterval();
                if (4 == pingResult.getRoomStatus() && pingResult.getRoomId() == this.f18041b) {
                    this.f18045f.mo14775d();
                } else if (pingResult.getMosaicStatus() != 0) {
                    this.f18045f.mo14773a(pingResult.getRoomId(), (long) pingResult.getMosaicStatus());
                }
            }
        }
    }

    public C6108b(long j, long j2, String str, boolean z, C6109a aVar) {
        this.f18041b = j;
        this.f18042c = j2;
        this.f18043d = str;
        this.f18044e = z;
        this.f18045f = aVar;
        this.f18047h = C2317a.m9932a();
    }
}
