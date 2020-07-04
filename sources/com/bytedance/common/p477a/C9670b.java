package com.bytedance.common.p477a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.a.b */
final class C9670b {

    /* renamed from: a */
    public String f26383a;

    /* renamed from: b */
    public String[] f26384b;

    /* renamed from: c */
    public List<InetAddress> f26385c;

    /* renamed from: d */
    public long f26386d;

    /* renamed from: e */
    public long f26387e;

    /* renamed from: f */
    private Handler f26388f = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null && message.what == 0) {
                StringBuilder sb = new StringBuilder("get MSG_EXPIRE for ");
                sb.append(C9670b.this.f26383a);
                C9676f.m28592a(sb.toString());
                C9675e a = C9674d.m28580a();
                if (a != null) {
                    a.mo24040a(C9670b.this.f26383a);
                }
            }
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24028a() {
        this.f26388f.removeMessages(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo24029b() {
        if (this.f26387e + this.f26386d >= System.currentTimeMillis() / 1000) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("host: ");
        sb.append(this.f26383a);
        sb.append(" ip cnt: ");
        sb.append(this.f26384b.length);
        sb.append(" ttl: ");
        sb.append(this.f26386d);
        String sb2 = sb.toString();
        for (String append : this.f26384b) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("\n ip: ");
            sb3.append(append);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    /* renamed from: a */
    private void m28567a(boolean z) {
        this.f26388f.removeMessages(0);
        if (z) {
            this.f26388f.sendEmptyMessageDelayed(0, this.f26386d * 1000);
        }
    }

    C9670b(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f26383a = jSONObject.getString("host");
            JSONArray jSONArray = jSONObject.getJSONArray("ips");
            int length = jSONArray.length();
            this.f26384b = new String[length];
            this.f26385c = new ArrayList();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                this.f26384b[i] = string;
                if (C9679i.m28601b(string)) {
                    this.f26385c.add(InetAddress.getByAddress(this.f26383a, InetAddress.getByName(string).getAddress()));
                }
            }
            this.f26386d = jSONObject.getLong("ttl");
            this.f26387e = System.currentTimeMillis() / 1000;
            m28567a(z);
        } catch (Exception unused) {
        }
    }

    C9670b(String str, long j, boolean z) {
        this.f26383a = str;
        this.f26386d = j;
        this.f26387e = System.currentTimeMillis() / 1000;
        m28567a(z);
    }
}
