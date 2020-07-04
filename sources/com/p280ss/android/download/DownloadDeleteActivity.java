package com.p280ss.android.download;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: com.ss.android.download.DownloadDeleteActivity */
public class DownloadDeleteActivity extends Activity {

    /* renamed from: a */
    private Dialog f52306a;

    /* renamed from: b */
    private Uri f52307b;

    /* renamed from: c */
    private Intent f52308c;

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Intent intent = getIntent();
        this.f52308c = intent;
        if (intent != null) {
            setIntent(null);
            m63497a();
        }
        if (this.f52306a != null && !this.f52306a.isShowing()) {
            this.f52306a.show();
        }
    }

    /* renamed from: a */
    private void m63497a() {
        if (this.f52306a == null && this.f52308c != null) {
            this.f52307b = this.f52308c.getData();
            if (this.f52307b != null) {
                Cursor a = C19422f.m63833a(getApplicationContext()).mo51451a(this.f52307b, (String[]) null, (String) null, (String[]) null, (String) null);
                try {
                    if (!a.moveToFirst()) {
                        if (a != null) {
                            try {
                                a.close();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    m63498a(a);
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Exception unused3) {
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Exception unused4) {
                        }
                    }
                } finally {
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Exception unused5) {
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r6v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m63498a(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = "title"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "_id"
            int r1 = r6.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0072 }
            long r1 = r6.getLong(r1)     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x001f
            r6.close()     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 == 0) goto L_0x0026
            return
        L_0x0026:
            r6 = 2131825220(0x7f111244, float:1.928329E38)
            java.lang.String r6 = r5.getString(r6)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r6 = com.C1642a.m8034a(r6, r3)
            com.bytedance.ies.uikit.dialog.b$a r0 = com.p280ss.android.download.C19431j.m63891b(r5)
            r3 = 2131827367(0x7f111aa7, float:1.9287645E38)
            com.bytedance.ies.uikit.dialog.b$a r3 = r0.mo26634a(r3)
            com.bytedance.ies.uikit.dialog.b$a r6 = r3.mo26647b(r6)
            r3 = 2131824196(0x7f110e44, float:1.9281213E38)
            com.ss.android.download.DownloadDeleteActivity$3 r4 = new com.ss.android.download.DownloadDeleteActivity$3
            r4.<init>(r1)
            com.bytedance.ies.uikit.dialog.b$a r6 = r6.mo26635a(r3, r4)
            r1 = 2131824188(0x7f110e3c, float:1.9281197E38)
            com.ss.android.download.DownloadDeleteActivity$2 r2 = new com.ss.android.download.DownloadDeleteActivity$2
            r2.<init>()
            com.bytedance.ies.uikit.dialog.b$a r6 = r6.mo26646b(r1, r2)
            com.ss.android.download.DownloadDeleteActivity$1 r1 = new com.ss.android.download.DownloadDeleteActivity$1
            r1.<init>()
            r6.mo26636a(r1)
            r0.mo26649b()
            return
        L_0x006a:
            if (r6 == 0) goto L_0x0071
            r6.close()     // Catch:{ Exception -> 0x0070 }
            goto L_0x0071
        L_0x0070:
            return
        L_0x0071:
            return
        L_0x0072:
            r0 = move-exception
            if (r6 == 0) goto L_0x0078
            r6.close()     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.DownloadDeleteActivity.m63498a(android.database.Cursor):void");
    }
}
