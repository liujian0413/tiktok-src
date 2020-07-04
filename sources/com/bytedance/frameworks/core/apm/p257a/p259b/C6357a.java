package com.bytedance.frameworks.core.apm.p257a.p259b;

import android.content.ContentValues;
import com.bytedance.apm.p245h.C9603b;
import com.bytedance.frameworks.core.apm.p257a.C6350a;
import com.bytedance.frameworks.core.apm.p257a.C6350a.C6352a;
import com.bytedance.frameworks.core.apm.p257a.C6350a.C6353b;
import java.util.List;

/* renamed from: com.bytedance.frameworks.core.apm.a.b.a */
public class C6357a extends C6350a<C9603b> implements C6352a<C9603b> {

    /* renamed from: a */
    private static volatile C6357a f18631a = null;

    /* renamed from: b */
    private static String f18632b = "_id <= ? ";

    /* renamed from: c */
    private static final String[] f18633c = {"_id", "front", "type", "timestamp", "accumulation", "version_id", "source", "status", "scene", "process", "main_process", "sid"};

    /* renamed from: d */
    private static String f18634d = "main_process = 1 AND delete_flag = 0 ";

    /* renamed from: e */
    private static String f18635e = "main_process = 0 AND delete_flag = 0 AND timestamp <= ? ";

    private C6357a() {
    }

    /* renamed from: d */
    public final String mo15247d() {
        return "t_battery";
    }

    /* renamed from: e */
    public final String[] mo15248e() {
        return f18633c;
    }

    /* renamed from: f */
    public static C6357a m19743f() {
        if (f18631a == null) {
            synchronized (C6357a.class) {
                if (f18631a == null) {
                    f18631a = new C6357a();
                }
            }
        }
        return f18631a;
    }

    /* renamed from: a */
    public final /* synthetic */ ContentValues mo15239a(Object obj) {
        return m19741b((C9603b) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo15249a(C6353b bVar) {
        return m19742b(bVar);
    }

    /* renamed from: b */
    public final synchronized void mo15264b(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_flag", Integer.valueOf(1));
        mo15236a(contentValues, f18632b, new String[]{String.valueOf(j)});
    }

    /* renamed from: b */
    private static ContentValues m19741b(C9603b bVar) {
        if (bVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("front", Integer.valueOf(bVar.f26257b ? 1 : 0));
        contentValues.put("source", bVar.f26263h);
        contentValues.put("type", bVar.f26259d);
        contentValues.put("timestamp", Long.valueOf(bVar.f26258c));
        contentValues.put("accumulation", Long.valueOf(bVar.f26262g));
        contentValues.put("version_id", Long.valueOf(bVar.f26264i));
        contentValues.put("status", Integer.valueOf(bVar.f26260e ? 1 : 0));
        contentValues.put("scene", bVar.f26261f);
        contentValues.put("main_process", Integer.valueOf(bVar.f26266k ? 1 : 0));
        contentValues.put("process", bVar.f26265j);
        contentValues.put("sid", bVar.f26267l);
        return contentValues;
    }

    /* renamed from: a */
    public final synchronized long mo15262a(C9603b bVar) {
        if (bVar == null) {
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("front", Integer.valueOf(bVar.f26257b ? 1 : 0));
            contentValues.put("source", bVar.f26263h);
            contentValues.put("type", bVar.f26259d);
            contentValues.put("timestamp", Long.valueOf(bVar.f26258c));
            contentValues.put("accumulation", Long.valueOf(bVar.f26262g));
            contentValues.put("version_id", Long.valueOf(bVar.f26264i));
            contentValues.put("status", Integer.valueOf(bVar.f26260e ? 1 : 0));
            contentValues.put("scene", bVar.f26261f);
            contentValues.put("main_process", Integer.valueOf(bVar.f26266k ? 1 : 0));
            contentValues.put("process", bVar.f26265j);
            contentValues.put("sid", bVar.f26267l);
            return mo15238a(contentValues);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static C9603b m19742b(C6353b bVar) {
        boolean z;
        boolean z2;
        C6353b bVar2 = bVar;
        long a = bVar2.mo15250a("_id");
        long a2 = bVar2.mo15250a("front");
        String c = bVar2.mo15252c("type");
        long a3 = bVar2.mo15250a("timestamp");
        long a4 = bVar2.mo15250a("accumulation");
        long a5 = bVar2.mo15250a("version_id");
        String c2 = bVar2.mo15252c("source");
        long a6 = bVar2.mo15250a("status");
        String c3 = bVar2.mo15252c("scene");
        int b = bVar2.mo15251b("main_process");
        String c4 = bVar2.mo15252c("process");
        long j = a;
        if (a2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (a6 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = c4;
        int i = b;
        long j2 = a5;
        C9603b bVar3 = new C9603b(z, a3, c, z2, c3, a4, c2);
        bVar3.f26265j = str;
        bVar3.f26256a = j;
        bVar3.f26264i = j2;
        boolean z3 = true;
        if (i != 1) {
            z3 = false;
        }
        bVar3.f26266k = z3;
        bVar3.f26267l = bVar.mo15252c("sid");
        return bVar3;
    }

    /* renamed from: a */
    public final synchronized List<C9603b> mo15263a(boolean z, long j) {
        List<C9603b> list;
        if (z) {
            try {
                list = mo15241a(f18634d, null, "_id", this);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            list = mo15241a(f18635e, new String[]{String.valueOf(j)}, "_id", this);
        }
        return list;
    }
}
