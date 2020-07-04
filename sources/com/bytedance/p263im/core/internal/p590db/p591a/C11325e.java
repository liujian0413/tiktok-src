package com.bytedance.p263im.core.internal.p590db.p591a;

import android.content.Context;
import com.C1642a;
import com.bytedance.p263im.core.internal.p590db.p592b.C11351d;
import com.bytedance.p263im.core.internal.p590db.p592b.p593a.C11330a;
import com.bytedance.p263im.core.internal.p590db.p592b.p594b.p596b.C11347c;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.tencent.wcdb.C46434h;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.io.File;

/* renamed from: com.bytedance.im.core.internal.db.a.e */
public final class C11325e extends C11321a {

    /* renamed from: d */
    private Context f30670d;

    /* renamed from: e */
    private String f30671e;

    /* renamed from: a */
    public final C11330a mo27327a() {
        return this;
    }

    /* renamed from: a */
    public final void mo27328a(C11351d dVar) {
        C11404d.m33582a("IMEncryptedDBHelper onCreate");
        File databasePath = this.f30670d.getDatabasePath(this.f30671e);
        if (!databasePath.exists() || !(dVar instanceof C11347c)) {
            super.mo27328a(dVar);
            return;
        }
        C11404d.m33587b("IMEncryptedDBHelper Migrating old database to encrypted one.");
        m33213a((C11347c) dVar, databasePath);
    }

    /* renamed from: a */
    private void m33213a(C11347c cVar, File file) {
        SQLiteDatabase sQLiteDatabase = cVar.f30718a;
        sQLiteDatabase.mo115469h();
        sQLiteDatabase.mo115465b(C1642a.m8034a("ATTACH DATABASE %s AS old KEY '';", new Object[]{C46434h.m145972a(file.getPath())}));
        sQLiteDatabase.mo115468g();
        C46434h.m145980b(sQLiteDatabase, "SELECT sqlcipher_export('main', 'old');", null);
        sQLiteDatabase.mo115470i();
        sQLiteDatabase.mo115469h();
        int a = (int) C46434h.m145970a(sQLiteDatabase, "PRAGMA old.user_version;", (String[]) null);
        sQLiteDatabase.mo115465b("DETACH DATABASE old;");
        file.delete();
        sQLiteDatabase.mo115468g();
        if (a > 16) {
            mo27330b(cVar, a, 16);
            return;
        }
        if (a < 16) {
            mo27329a(cVar, a, 16);
        }
    }

    /* renamed from: a */
    public final void mo27329a(C11351d dVar, int i, int i2) {
        super.mo27329a(dVar, i, i2);
    }

    public C11325e(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder("encrypted_");
        sb.append(str);
        super(context, sb.toString(), str2);
        this.f30670d = context;
        this.f30671e = str;
    }
}
