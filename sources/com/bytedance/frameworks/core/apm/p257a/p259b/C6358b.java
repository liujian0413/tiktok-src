package com.bytedance.frameworks.core.apm.p257a.p259b;

import android.content.ContentValues;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p245h.C9609j;
import com.bytedance.frameworks.core.apm.p257a.C6350a;
import com.bytedance.frameworks.core.apm.p257a.C6350a.C6352a;
import com.bytedance.frameworks.core.apm.p257a.C6350a.C6353b;

/* renamed from: com.bytedance.frameworks.core.apm.a.b.b */
public class C6358b extends C6350a<C9609j> implements C6352a<C9609j> {

    /* renamed from: a */
    private static volatile C6358b f18636a;

    /* renamed from: b */
    private static final String[] f18637b = {"_id", "front", "network_type", "send", "value", "timestamp", "sid"};

    /* renamed from: c */
    private static String f18638c = "sid = ? and front = ? and network_type = ? and send = ?";

    /* renamed from: d */
    private static String f18639d = "delete_flag = ? AND timestamp < ? ";

    /* renamed from: e */
    private static String f18640e = "delete_flag = ?";

    private C6358b() {
    }

    /* renamed from: d */
    public final String mo15247d() {
        return "t_traffic";
    }

    /* renamed from: e */
    public final String[] mo15248e() {
        return f18637b;
    }

    /* renamed from: f */
    public static C6358b m19753f() {
        if (f18636a == null) {
            synchronized (C6358b.class) {
                if (f18636a == null) {
                    f18636a = new C6358b();
                }
            }
        }
        return f18636a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ContentValues mo15239a(Object obj) {
        return m19751a((C9609j) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo15249a(C6353b bVar) {
        return m19752b(bVar);
    }

    /* renamed from: b */
    private static C9609j m19752b(C6353b bVar) {
        C9609j jVar = new C9609j(bVar.mo15250a("value"), bVar.mo15251b("front"), bVar.mo15251b("network_type"), bVar.mo15251b("send"), bVar.mo15250a("timestamp"), bVar.mo15250a("sid"));
        return jVar;
    }

    /* renamed from: a */
    private static ContentValues m19751a(C9609j jVar) {
        if (jVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", Long.valueOf(jVar.f26296b));
        contentValues.put("front", Integer.valueOf(jVar.f26299e));
        contentValues.put("network_type", Integer.valueOf(jVar.f26297c));
        contentValues.put("send", Integer.valueOf(jVar.f26298d));
        contentValues.put("timestamp", Long.valueOf(jVar.f26300f));
        contentValues.put("sid", Long.valueOf(C6174c.m19147e()));
        return contentValues;
    }
}
