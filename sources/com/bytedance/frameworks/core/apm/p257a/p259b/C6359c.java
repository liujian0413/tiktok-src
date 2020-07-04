package com.bytedance.frameworks.core.apm.p257a.p259b;

import android.content.ContentValues;
import com.bytedance.apm.p245h.C6214f;
import com.bytedance.apm.util.C6292i;
import com.bytedance.frameworks.core.apm.p257a.C6350a;
import com.bytedance.frameworks.core.apm.p257a.C6350a.C6352a;
import com.bytedance.frameworks.core.apm.p257a.C6350a.C6353b;
import java.util.List;

/* renamed from: com.bytedance.frameworks.core.apm.a.b.c */
public final class C6359c extends C6350a<C6214f> implements C6352a<C6214f> {

    /* renamed from: a */
    private static final String[] f18641a = {"_id", "version_code", "version_name", "manifest_version_code", "update_version_code", "app_version"};

    /* renamed from: c */
    public final boolean mo15246c() {
        return false;
    }

    /* renamed from: d */
    public final String mo15247d() {
        return "local_monitor_version";
    }

    /* renamed from: e */
    public final String[] mo15248e() {
        return f18641a;
    }

    /* renamed from: f */
    public final synchronized C6214f mo15260f() {
        List a = mo15241a(null, null, "_id DESC LIMIT 1", this);
        if (C6292i.m19525a(a)) {
            return null;
        }
        return (C6214f) a.get(0);
    }

    /* renamed from: a */
    public final /* synthetic */ ContentValues mo15239a(Object obj) {
        return m19758b((C6214f) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo15249a(C6353b bVar) {
        return m19759b(bVar);
    }

    /* renamed from: a */
    public final synchronized long mo15265a(C6214f fVar) {
        if (fVar == null) {
            return -1;
        }
        return mo15238a(m19758b(fVar));
    }

    /* renamed from: b */
    private static ContentValues m19758b(C6214f fVar) {
        if (fVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("version_code", fVar.f18301b);
        contentValues.put("version_name", fVar.f18302c);
        contentValues.put("manifest_version_code", fVar.f18303d);
        contentValues.put("update_version_code", fVar.f18304e);
        contentValues.put("app_version", fVar.f18305f);
        return contentValues;
    }

    /* renamed from: b */
    private static C6214f m19759b(C6353b bVar) {
        C6214f fVar = new C6214f(bVar.mo15250a("_id"), bVar.mo15252c("version_code"), bVar.mo15252c("version_name"), bVar.mo15252c("manifest_version_code"), bVar.mo15252c("update_version_code"), bVar.mo15252c("app_version"));
        return fVar;
    }

    /* renamed from: b */
    public final synchronized C6214f mo15266b(long j) {
        String str = "_id DESC";
        String str2 = " _id = ?";
        String[] strArr = {String.valueOf(j)};
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" LIMIT 1");
        List a = mo15241a(str2, strArr, sb.toString(), this);
        if (C6292i.m19525a(a)) {
            return null;
        }
        return (C6214f) a.get(0);
    }
}
