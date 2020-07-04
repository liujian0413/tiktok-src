package com.p280ss.android.download;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.download.C19410c.C19413c;
import com.p280ss.android.download.p861b.C19409f;
import java.io.File;

/* renamed from: com.ss.android.download.m */
public final class C19434m {
    /* renamed from: a */
    private static String m63901a(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: b */
    private static Uri m63903b(Cursor cursor, String str) {
        try {
            return Uri.parse(m63901a(cursor, str));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Intent m63900a(Context context, long j, boolean z) {
        Intent intent;
        boolean z2 = false;
        Cursor a = C19410c.m63772a(context).mo51430a(new C19413c().mo51436a(j));
        try {
            if (!a.moveToFirst()) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
            String string = a.getString(a.getColumnIndexOrThrow("local_filename"));
            if (C6319n.m19593a(string)) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused2) {
                    }
                }
                return null;
            }
            if (C19409f.m63770a(context, string)) {
                PackageManager packageManager = context.getPackageManager();
                intent = packageManager.getLaunchIntentForPackage(packageManager.getPackageArchiveInfo(new File(string).getAbsolutePath(), 1).packageName);
            } else {
                Uri b = m63903b(a, "local_uri");
                String a2 = m63901a(a, "media_type");
                if (!(b == null || a2 == null)) {
                    if (new File(string).exists()) {
                        intent = new Intent("android.intent.action.VIEW");
                        if ("application/vnd.android.package-archive".equals(a2)) {
                            intent.setDataAndType(b, a2);
                        } else if ("file".equals(b.getScheme())) {
                            intent.setDataAndType(b, a2);
                        } else {
                            intent.setDataAndType(b, a2);
                        }
                        C19432k a3 = C19431j.m63881a();
                        if (a3 != null) {
                            z2 = a3.mo51464a(j, z);
                        }
                    }
                }
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            }
            if (z2) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused4) {
                    }
                }
                return null;
            }
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused5) {
                }
            }
            return intent;
        } finally {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused6) {
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m63902a(Context context, long j, int i, boolean z) {
        Intent a = m63900a(context, j, z);
        if (a == null) {
            return false;
        }
        a.addFlags(268435456);
        try {
            context.startActivity(a);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
