package com.tencent.wcdb;

import android.util.Pair;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.util.List;

/* renamed from: com.tencent.wcdb.i */
public final class C46435i implements C46433g {

    /* renamed from: b */
    private static final String[] f119632b = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};

    /* renamed from: a */
    private final boolean f119633a;

    public C46435i() {
    }

    public C46435i(boolean z) {
        this.f119633a = true;
    }

    /* renamed from: b */
    private static boolean m145985b(String str) {
        return new File(str).delete();
    }

    /* renamed from: a */
    private void m145983a(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            StringBuilder sb = new StringBuilder("Remove database file: ");
            sb.append(str);
            Log.m146010a("WCDB.DefaultDatabaseErrorHandler", sb.toString());
            int i = 0;
            if (!this.f119633a) {
                File file = new File(str);
                File file2 = new File(file.getParentFile(), "corrupted");
                if (!file2.mkdirs()) {
                    Log.m146010a("WCDB.DefaultDatabaseErrorHandler", "Could not create directory for corrupted database. Corruption backup may be unavailable.");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file2.getPath());
                sb2.append("/");
                sb2.append(file.getName());
                String sb3 = sb2.toString();
                String[] strArr = f119632b;
                int length = strArr.length;
                while (i < length) {
                    String str2 = strArr[i];
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(str2);
                    String sb5 = sb4.toString();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb3);
                    sb6.append(str2);
                    m145984a(sb5, sb6.toString());
                    i++;
                }
                return;
            }
            String[] strArr2 = f119632b;
            int length2 = strArr2.length;
            while (i < length2) {
                String str3 = strArr2[i];
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(str3);
                m145985b(sb7.toString());
                i++;
            }
        }
    }

    /* renamed from: a */
    public final void mo27338a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("Corruption reported by sqlite on database: ");
        sb.append(sQLiteDatabase.mo115476o());
        Log.m146010a("WCDB.DefaultDatabaseErrorHandler", sb.toString());
        if (!sQLiteDatabase.mo115475n()) {
            m145983a(sQLiteDatabase.mo115476o());
            return;
        }
        List<Pair> list = null;
        try {
            list = sQLiteDatabase.mo115478q();
        } catch (SQLiteException unused) {
        }
        sQLiteDatabase.mo115477p();
        try {
            sQLiteDatabase.close();
            if (list != null) {
                for (Pair pair : list) {
                    m145983a((String) pair.second);
                }
                return;
            }
        } catch (SQLiteException unused2) {
            if (list != null) {
                for (Pair pair2 : list) {
                    m145983a((String) pair2.second);
                }
                return;
            }
        } catch (Throwable th) {
            if (list != null) {
                for (Pair pair3 : list) {
                    m145983a((String) pair3.second);
                }
            } else {
                m145983a(sQLiteDatabase.mo115476o());
            }
            throw th;
        }
        m145983a(sQLiteDatabase.mo115476o());
    }

    /* renamed from: a */
    private static boolean m145984a(String str, String str2) {
        File file = new File(str);
        boolean renameTo = file.renameTo(new File(str2));
        if (!renameTo) {
            file.delete();
        }
        return renameTo;
    }
}
