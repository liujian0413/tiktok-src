package com.bytedance.crash.p493d;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.p493d.p494a.C9877a;
import com.bytedance.crash.p493d.p495b.C9880b;

/* renamed from: com.bytedance.crash.d.a */
public class C9876a {

    /* renamed from: a */
    private static volatile C9876a f26945a;

    /* renamed from: b */
    private C9880b f26946b;

    /* renamed from: c */
    private SQLiteDatabase f26947c;

    private C9876a() {
    }

    /* renamed from: b */
    private void m29133b() {
        if (this.f26946b == null) {
            mo24440a(C9918j.m29342g());
        }
    }

    /* renamed from: a */
    public static C9876a m29132a() {
        if (f26945a == null) {
            synchronized (C9876a.class) {
                if (f26945a == null) {
                    f26945a = new C9876a();
                }
            }
        }
        return f26945a;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24440a(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.bytedance.crash.d.b r0 = new com.bytedance.crash.d.b     // Catch:{ Throwable -> 0x000f }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x000f }
            android.database.sqlite.SQLiteDatabase r2 = r0.getWritableDatabase()     // Catch:{ Throwable -> 0x000f }
            r1.f26947c = r2     // Catch:{ Throwable -> 0x000f }
            goto L_0x000f
        L_0x000d:
            r2 = move-exception
            goto L_0x0018
        L_0x000f:
            com.bytedance.crash.d.b.b r2 = new com.bytedance.crash.d.b.b     // Catch:{ all -> 0x000d }
            r2.<init>()     // Catch:{ all -> 0x000d }
            r1.f26946b = r2     // Catch:{ all -> 0x000d }
            monitor-exit(r1)
            return
        L_0x0018:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p493d.C9876a.mo24440a(android.content.Context):void");
    }

    /* renamed from: a */
    public final synchronized void mo24441a(C9877a aVar) {
        m29133b();
        if (this.f26946b != null) {
            this.f26946b.mo24448a(this.f26947c, aVar);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo24442a(String str) {
        m29133b();
        if (this.f26946b == null) {
            return false;
        }
        return this.f26946b.mo24450a(this.f26947c, str);
    }
}
