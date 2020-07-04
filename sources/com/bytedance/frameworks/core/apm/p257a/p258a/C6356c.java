package com.bytedance.frameworks.core.apm.p257a.p258a;

import android.content.ContentValues;
import com.bytedance.apm.p245h.C6213e;
import com.bytedance.frameworks.core.apm.p257a.C6350a.C6353b;

/* renamed from: com.bytedance.frameworks.core.apm.a.a.c */
public final class C6356c extends C6354a<C6213e> {
    /* renamed from: d */
    public final String mo15247d() {
        return "local_monitor_log";
    }

    /* renamed from: e */
    public final String[] mo15248e() {
        return new String[]{"_id", "type", "version_id", "data", "delete_flag"};
    }

    /* renamed from: a */
    public final /* synthetic */ ContentValues mo15239a(Object obj) {
        return m19735b((C6213e) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo15249a(C6353b bVar) {
        return m19736b(bVar);
    }

    /* renamed from: b */
    private static C6213e m19736b(C6353b bVar) {
        C6213e eVar = new C6213e(bVar.mo15250a("_id"), bVar.mo15252c("type"), bVar.mo15250a("version_id"), bVar.mo15252c("data"));
        return eVar;
    }

    /* renamed from: b */
    private static ContentValues m19735b(C6213e eVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", eVar.f18294g);
        contentValues.put("type2", eVar.f18295h);
        contentValues.put("timestamp", Long.valueOf(eVar.f18298k));
        contentValues.put("version_id", Long.valueOf(eVar.f18297j));
        contentValues.put("data", eVar.f18296i.toString());
        contentValues.put("is_sampled", Integer.valueOf(eVar.f18299l ? 1 : 0));
        return contentValues;
    }
}
