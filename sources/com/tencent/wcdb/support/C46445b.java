package com.tencent.wcdb.support;

import android.content.Context;
import com.tencent.wcdb.C46433g;
import com.tencent.wcdb.FileUtils;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabase.C46408a;
import com.tencent.wcdb.database.SQLiteGlobal;
import java.io.File;

/* renamed from: com.tencent.wcdb.support.b */
public final class C46445b {
    static {
        SQLiteGlobal.loadLib();
    }

    /* renamed from: a */
    private static File m146022a(Context context) {
        if (context != null) {
            String str = context.getApplicationInfo().dataDir;
            if (str != null) {
                return new File(str);
            }
            return null;
        }
        throw new RuntimeException("Not supported in system context");
    }

    /* renamed from: b */
    private static File m146026b(Context context) {
        File file = new File(m146022a(context), "databases");
        if (file.getPath().equals("databases")) {
            return new File("/data/system");
        }
        return file;
    }

    /* renamed from: a */
    private static File m146024a(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        StringBuilder sb = new StringBuilder("File ");
        sb.append(str);
        sb.append(" contains a path separator");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static File m146023a(Context context, String str, boolean z) {
        File file;
        File file2;
        if (str.charAt(0) == File.separatorChar) {
            file = new File(str.substring(0, str.lastIndexOf(File.separatorChar)));
            file2 = new File(file, str.substring(str.lastIndexOf(File.separatorChar)));
        } else {
            file = m146026b(context);
            file2 = m146024a(file, str);
        }
        if (!file.isDirectory() && file.mkdir()) {
            FileUtils.setPermissions(file.getPath(), 505, -1, -1);
        }
        return file2;
    }

    /* renamed from: a */
    private static void m146025a(String str, int i, int i2) {
        int i3;
        if ((i & 1) != 0) {
            i3 = 436;
        } else {
            i3 = 432;
        }
        if ((i & 2) != 0) {
            i3 |= 2;
        }
        FileUtils.setPermissions(str, i3, -1, -1);
    }

    /* renamed from: a */
    public static SQLiteDatabase m146021a(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i, C46408a aVar, C46433g gVar, int i2) {
        int i3;
        File a = m146023a(context, str, true);
        if ((i & 8) != 0) {
            i3 = 805306368;
        } else {
            i3 = 268435456;
        }
        SQLiteDatabase a2 = SQLiteDatabase.m145827a(a.getPath(), bArr, sQLiteCipherSpec, aVar, i3, gVar, i2);
        m146025a(a.getPath(), i, 0);
        return a2;
    }
}
