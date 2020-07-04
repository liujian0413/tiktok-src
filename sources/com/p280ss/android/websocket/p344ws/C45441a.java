package com.p280ss.android.websocket.p344ws;

import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.C6306c;
import com.p280ss.android.websocket.internal.WebSocketService;
import com.p280ss.android.websocket.p344ws.WebSocketStatus.ConnectState;
import com.p280ss.android.websocket.p344ws.output.C45460f;
import com.p280ss.android.websocket.p344ws.p1782c.C45450a;
import com.p280ss.android.websocket.p344ws.p1782c.C45451b;
import com.p280ss.android.websocket.p344ws.p1782c.C45452c;
import com.p280ss.android.websocket.p344ws.p1782c.C45453d;
import com.p280ss.android.websocket.p344ws.p1782c.C45454e;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.websocket.ws.a */
public final class C45441a {

    /* renamed from: c */
    private static volatile C45441a f117031c;

    /* renamed from: a */
    public final C45442a f117032a;

    /* renamed from: b */
    private Context f117033b;

    /* renamed from: d */
    private final Map<String, ConnectState> f117034d = new HashMap();

    /* renamed from: com.ss.android.websocket.ws.a$a */
    public static class C45442a {

        /* renamed from: a */
        public C45453d f117035a;

        /* renamed from: b */
        public C45454e f117036b;

        /* renamed from: c */
        public C45453d f117037c;

        /* renamed from: d */
        public C45453d f117038d;

        /* renamed from: a */
        public final C45453d mo108839a() {
            if (this.f117035a == null) {
                return this.f117038d;
            }
            return this.f117035a;
        }

        /* renamed from: b */
        public final C45454e mo108840b() {
            if (this.f117036b == null) {
                return new C45451b();
            }
            return this.f117036b;
        }
    }

    /* renamed from: b */
    public final C45453d mo108835b() {
        return this.f117032a.mo108839a();
    }

    /* renamed from: c */
    public final C45453d mo108836c() {
        return this.f117032a.f117037c;
    }

    /* renamed from: d */
    public final C45454e mo108837d() {
        return this.f117032a.mo108840b();
    }

    /* renamed from: a */
    public final void mo108834a() {
        try {
            this.f117033b.startService(new Intent(this.f117033b, WebSocketService.class));
        } catch (Throwable unused) {
        }
    }

    @C7709l
    public final void onEvent(C45460f fVar) {
        if (fVar.f117075b != null) {
            this.f117034d.put(fVar.f117074a, fVar.f117075b);
        } else {
            this.f117034d.remove(fVar.f117074a);
        }
    }

    /* renamed from: a */
    public static C45441a m143654a(Context context) {
        if (f117031c != null) {
            return f117031c;
        }
        synchronized (C45441a.class) {
            if (f117031c == null) {
                C45442a aVar = new C45442a();
                aVar.f117038d = new C45450a(context);
                aVar.f117037c = new C45452c(context);
                f117031c = new C45441a(context, aVar);
            }
        }
        return f117031c;
    }

    private C45441a(Context context, C45442a aVar) {
        this.f117033b = context;
        this.f117032a = aVar;
        if (!C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20389a((Object) this);
        }
    }

    /* renamed from: a */
    public static String m143655a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append("f8a69f1719916z");
        return C6306c.m19561a(sb.toString());
    }
}
