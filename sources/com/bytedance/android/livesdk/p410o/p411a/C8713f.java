package com.bytedance.android.livesdk.p410o.p411a;

import android.content.Context;

/* renamed from: com.bytedance.android.livesdk.o.a.f */
public final class C8713f implements C8710d {
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m26036a(android.content.Context r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch:{ Exception -> 0x0029, all -> 0x0024 }
            android.net.Uri r3 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ Exception -> 0x0029, all -> 0x0024 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0029, all -> 0x0024 }
            if (r8 != 0) goto L_0x0019
            r8.close()     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            return r0
        L_0x0019:
            int r1 = r8.getCount()     // Catch:{ Exception -> 0x002a, all -> 0x0021 }
            r8.close()     // Catch:{ Exception -> 0x002e }
            goto L_0x002e
        L_0x0021:
            r0 = move-exception
            r1 = r8
            goto L_0x0025
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            r1.close()     // Catch:{ Exception -> 0x0028 }
        L_0x0028:
            throw r0
        L_0x0029:
            r8 = r1
        L_0x002a:
            r8.close()     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 == 0) goto L_0x0032
            r8 = 1
            return r8
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p410o.p411a.C8713f.m26036a(android.content.Context):boolean");
    }

    /* renamed from: a */
    public final boolean mo21711a(Context context, String str) {
        return m26036a(context);
    }
}
