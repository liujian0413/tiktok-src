package com.p280ss.android.ugc.aweme.p313im.sdk.p317j;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.p263im.core.p584a.C11198c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C6944i;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7075h;
import com.p280ss.android.websocket.p344ws.WebSocketStatus.ConnectState;
import com.p280ss.android.websocket.p344ws.output.C45455a;
import com.p280ss.android.websocket.p344ws.output.C45456b;
import com.p280ss.android.websocket.p344ws.output.C45457c;
import com.p280ss.android.websocket.p344ws.output.C45458d;
import com.p280ss.android.websocket.p344ws.output.C45459e;
import com.p280ss.android.websocket.p344ws.output.C45460f;
import com.p280ss.android.websocket.p344ws.p1781a.C45443a;
import com.p280ss.android.websocket.p344ws.p1781a.C45446d;
import com.p280ss.android.websocket.p344ws.p1781a.C45447e;
import java.util.HashMap;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.j.c */
public class C31335c {

    /* renamed from: a */
    private static C31335c f82116a;

    /* renamed from: b */
    private static boolean f82117b;

    /* renamed from: c */
    private Context f82118c;

    /* renamed from: d */
    private String f82119d;

    /* renamed from: e */
    private ConnectState f82120e = ConnectState.CLOSED;

    private C31335c() {
    }

    /* renamed from: b */
    public final boolean mo81904b() {
        if (this.f82120e == ConnectState.CONNECTED) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C31335c m102021a() {
        if (f82116a == null) {
            synchronized (C31335c.class) {
                if (f82116a == null) {
                    f82116a = new C31335c();
                }
            }
        }
        return f82116a;
    }

    /* renamed from: e */
    private static String m102025e() {
        String wsUrl = C6956a.m21632a().mo18009f().getWsUrl();
        if (TextUtils.isEmpty(wsUrl)) {
            return C7075h.f19902a;
        }
        return wsUrl;
    }

    /* renamed from: c */
    public final void mo81905c() {
        if (!C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20389a((Object) this);
        }
    }

    /* renamed from: d */
    public final void mo81906d() {
        if (this.f82120e != ConnectState.CLOSED && this.f82120e != ConnectState.CLOSING) {
            m102023a(this.f82119d);
        }
    }

    @C7709l
    public void onEvent(C45459e eVar) {
        if (TextUtils.equals(m102025e(), eVar.f117071a)) {
        }
    }

    @C7709l
    public void onEvent(C45455a aVar) {
        if (TextUtils.equals(m102025e(), aVar.f117061c)) {
            C6944i.f19642b.mo17977b("CLOSED");
            this.f82120e = ConnectState.CLOSED;
        }
    }

    /* renamed from: a */
    public static synchronized void m102022a(Context context) {
        synchronized (C31335c.class) {
            if (!f82117b) {
                m102021a().f82118c = context;
                f82117b = true;
            }
        }
    }

    @C7709l
    public void onEvent(C45456b bVar) {
        if (TextUtils.equals(m102025e(), bVar.f117062a)) {
            C6944i.f19642b.mo17977b("OPENED");
            this.f82120e = ConnectState.CONNECTED;
        }
    }

    /* renamed from: a */
    private void m102023a(String str) {
        if (C31336d.m102030a(this.f82118c)) {
            C7705c.m23799a().mo20394d(new C45443a(str));
        }
    }

    @C7709l
    public void onEvent(C45457c cVar) {
        if (TextUtils.equals(m102025e(), cVar.f117064a)) {
            m102024a(cVar.f117064a, cVar.f117066c, cVar.f117067d, cVar.f117068e, cVar.f117065b);
        }
    }

    @C7709l
    public void onEvent(C45458d dVar) {
        if (TextUtils.equals(m102025e(), dVar.f117069a)) {
            C6944i.f19642b.mo17977b("FAILED");
        }
    }

    @C7709l
    public void onEvent(C45460f fVar) {
        if (TextUtils.equals(m102025e(), fVar.f117074a)) {
            this.f82120e = fVar.f117075b;
            if (this.f82120e == ConnectState.CONNECTED) {
                C6944i.f19642b.mo17977b("CONNECTED");
                if (System.currentTimeMillis() - C6956a.m21632a().f19662b >= 30000) {
                    C31863ai.m103534c();
                }
            } else if (fVar.f117075b == ConnectState.CLOSED || fVar.f117075b == ConnectState.CLOSING || fVar.f117075b == ConnectState.RETRY_WAITING) {
                C6944i.f19642b.mo17977b("DISCONNECTED");
            } else {
                C6944i iVar = C6944i.f19642b;
                StringBuilder sb = new StringBuilder();
                sb.append(fVar.f117075b);
                iVar.mo17977b(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo81903a(int i, long j, String str, byte[] bArr) {
        if (this.f82120e == ConnectState.CONNECTED) {
            HashMap hashMap = new HashMap();
            hashMap.put("cmd", String.valueOf(i));
            hashMap.put("seq_id", String.valueOf(j));
            C45447e eVar = new C45447e(m102025e(), 5, j, 0, 1, bArr, "pb", str, hashMap);
            C7705c.m23799a().mo20394d(new C45446d(m102025e(), eVar));
        }
    }

    /* renamed from: a */
    private static void m102024a(String str, Object obj, int i, int i2, byte[] bArr) {
        if (C7074e.m22066a() && i == 1 && i2 == 5) {
            C31334a aVar = (C31334a) obj;
            C11198c.m32777a().mo27247a(aVar.f82113e, aVar.f82115g);
        }
    }
}
