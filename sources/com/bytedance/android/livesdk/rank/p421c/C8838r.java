package com.bytedance.android.livesdk.rank.p421c;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.livesdk.rank.model.C8852a;
import com.bytedance.android.livesdk.rank.p419a.C8808b.C8809a;
import com.bytedance.android.livesdk.rank.p419a.C8808b.C8810b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;

/* renamed from: com.bytedance.android.livesdk.rank.c.r */
public final class C8838r implements C8809a, C6310a {

    /* renamed from: a */
    private final C8810b f24019a;

    /* renamed from: b */
    private final C6309f f24020b = new C6309f(this);

    /* renamed from: c */
    private C8852a f24021c;

    /* renamed from: d */
    private int f24022d;

    /* renamed from: e */
    private C8839a f24023e;

    /* renamed from: f */
    private boolean f24024f;

    /* renamed from: com.bytedance.android.livesdk.rank.c.r$a */
    static class C8839a implements Runnable {

        /* renamed from: a */
        public int f24025a;

        /* renamed from: b */
        private C6309f f24026b;

        public final void run() {
            StringBuilder sb;
            StringBuilder sb2;
            StringBuilder sb3;
            String str = "00:00:00";
            if (this.f24025a > 0) {
                this.f24025a--;
                int i = this.f24025a / 3600;
                int i2 = (this.f24025a % 3600) / 60;
                int i3 = (this.f24025a % 3600) % 60;
                StringBuilder sb4 = new StringBuilder();
                if (i < 10) {
                    sb = new StringBuilder("0");
                } else {
                    sb = new StringBuilder();
                }
                sb.append(i);
                sb4.append(sb.toString());
                sb4.append(":");
                if (i2 < 10) {
                    sb2 = new StringBuilder("0");
                } else {
                    sb2 = new StringBuilder();
                }
                sb2.append(i2);
                sb4.append(sb2.toString());
                sb4.append(":");
                if (i3 < 10) {
                    sb3 = new StringBuilder("0");
                } else {
                    sb3 = new StringBuilder();
                }
                sb3.append(i3);
                sb4.append(sb3.toString());
                str = sb4.toString();
            }
            this.f24026b.sendMessage(this.f24026b.obtainMessage(100, str));
        }

        C8839a(int i, C6309f fVar) {
            this.f24025a = i;
            this.f24026b = fVar;
        }
    }

    /* renamed from: b */
    public final void mo21887b() {
        this.f24020b.removeCallbacksAndMessages(null);
    }

    /* renamed from: c */
    private int m26446c() {
        if (this.f24021c == null) {
            return 0;
        }
        long j = this.f24021c.f24080m;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    /* renamed from: a */
    public final void mo21885a() {
        if (!this.f24024f && this.f24021c != null) {
            this.f24020b.removeCallbacksAndMessages(null);
            if (this.f24023e == null) {
                this.f24023e = new C8839a(m26446c(), this.f24020b);
            } else {
                this.f24023e.f24025a = m26446c();
            }
            this.f24020b.post(this.f24023e);
            this.f24024f = true;
        }
    }

    /* renamed from: a */
    public final void mo21886a(C8852a aVar) {
        this.f24021c = aVar;
    }

    public final void handleMsg(Message message) {
        long j;
        if (message.what != 100 || !this.f24024f) {
            if ((message.what == 12 || message.what == 16) && !(message.obj instanceof Exception)) {
                C3477b bVar = (C3477b) message.obj;
                C8852a aVar = (C8852a) bVar.data;
                if (aVar != null) {
                    if (bVar.extra != null) {
                        j = bVar.extra.now;
                    } else {
                        j = 0;
                    }
                    aVar.f24085r = j;
                    if (this.f24019a != null) {
                        this.f24019a.mo21888a(aVar);
                    }
                    this.f24021c = aVar;
                    mo21885a();
                }
            }
            return;
        }
        String str = (String) message.obj;
        if (this.f24019a != null) {
            this.f24019a.mo21889a(str);
        }
        if (!TextUtils.equals(str, "00:00:00")) {
            this.f24020b.postDelayed(this.f24023e, 1000);
        }
    }

    public C8838r(C8810b bVar, C8852a aVar, int i) {
        this.f24019a = bVar;
        this.f24021c = aVar;
        this.f24022d = i;
    }
}
