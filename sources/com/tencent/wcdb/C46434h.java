package com.tencent.wcdb;

import android.os.Parcel;
import com.tencent.wcdb.database.C46428n;
import com.tencent.wcdb.database.SQLiteAbortException;
import com.tencent.wcdb.database.SQLiteConstraintException;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import com.tencent.wcdb.database.SQLiteDiskIOException;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteFullException;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.OperationCanceledException;

/* renamed from: com.tencent.wcdb.h */
public final class C46434h {

    /* renamed from: a */
    private static final char[] f119631a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static boolean m145977a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    private static void m145976a(StringBuilder sb, String str) {
        sb.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    sb.append('\'');
                }
                sb.append(charAt);
            }
        } else {
            sb.append(str);
        }
        sb.append('\'');
    }

    /* renamed from: a */
    public static int m145969a(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static final int m145978b(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != -128) {
            return readInt;
        }
        if (parcel.readInt() == 0) {
            Log.m146010a("WCDB.DatabaseUtils", "Unexpected zero-sized Parcel reply header.");
        }
        return 0;
    }

    /* renamed from: a */
    public static int m145968a(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return 1;
        }
        return 3;
    }

    /* renamed from: c */
    private static int m145982c(String str) {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int charAt = str.charAt(i2);
            if (charAt >= 97 && charAt <= 122) {
                charAt = (charAt - 97) + 65;
            } else if (charAt >= 128) {
                return 0;
            }
            i |= (charAt & 127) << (i2 * 8);
        }
        return i;
    }

    /* renamed from: b */
    public static int m145979b(String str) {
        String trim = str.trim();
        if (trim.length() < 3) {
            return 99;
        }
        switch (m145982c(trim)) {
            case 4279873:
            case 5522756:
                return 9;
            case 4280912:
                return 7;
            case 4476485:
            case 5066563:
                return 5;
            case 4477013:
            case 4998468:
            case 5260626:
            case 5459529:
                return 2;
            case 4543043:
            case 5198404:
            case 5524545:
                return 8;
            case 4670786:
                return 4;
            case 4998483:
                return 1;
            case 5001042:
                return 6;
            case 5526593:
                return 3;
            default:
                return 99;
        }
    }

    /* renamed from: a */
    public static String m145972a(String str) {
        StringBuilder sb = new StringBuilder();
        m145976a(sb, str);
        return sb.toString();
    }

    /* renamed from: a */
    public static final void m145973a(Parcel parcel) {
        int b = m145978b(parcel);
        if (b != 0) {
            m145975a(parcel, parcel.readString(), b);
        }
    }

    /* renamed from: a */
    private static long m145971a(C46428n nVar, String[] strArr) {
        nVar.mo115506a(strArr);
        return nVar.mo115528i();
    }

    /* renamed from: b */
    private static String m145981b(C46428n nVar, String[] strArr) {
        nVar.mo115506a(strArr);
        return nVar.mo115529j();
    }

    /* renamed from: a */
    public static int m145967a(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m145974a(android.os.Parcel r4, java.lang.Exception r5) {
        /*
            boolean r0 = r5 instanceof java.io.FileNotFoundException
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0009
            r0 = 1
        L_0x0007:
            r3 = 0
            goto L_0x004a
        L_0x0009:
            boolean r0 = r5 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L_0x0010
            r0 = 2
        L_0x000e:
            r3 = 1
            goto L_0x004a
        L_0x0010:
            boolean r0 = r5 instanceof java.lang.UnsupportedOperationException
            if (r0 == 0) goto L_0x0016
            r0 = 3
            goto L_0x000e
        L_0x0016:
            boolean r0 = r5 instanceof com.tencent.wcdb.database.SQLiteAbortException
            if (r0 == 0) goto L_0x001c
            r0 = 4
            goto L_0x000e
        L_0x001c:
            boolean r0 = r5 instanceof com.tencent.wcdb.database.SQLiteConstraintException
            if (r0 == 0) goto L_0x0022
            r0 = 5
            goto L_0x000e
        L_0x0022:
            boolean r0 = r5 instanceof com.tencent.wcdb.database.SQLiteDatabaseCorruptException
            if (r0 == 0) goto L_0x0028
            r0 = 6
            goto L_0x000e
        L_0x0028:
            boolean r0 = r5 instanceof com.tencent.wcdb.database.SQLiteFullException
            if (r0 == 0) goto L_0x002e
            r0 = 7
            goto L_0x000e
        L_0x002e:
            boolean r0 = r5 instanceof com.tencent.wcdb.database.SQLiteDiskIOException
            if (r0 == 0) goto L_0x0035
            r0 = 8
            goto L_0x000e
        L_0x0035:
            boolean r0 = r5 instanceof com.tencent.wcdb.database.SQLiteException
            if (r0 == 0) goto L_0x003c
            r0 = 9
            goto L_0x000e
        L_0x003c:
            boolean r0 = r5 instanceof android.content.OperationApplicationException
            if (r0 == 0) goto L_0x0043
            r0 = 10
            goto L_0x000e
        L_0x0043:
            boolean r0 = r5 instanceof com.tencent.wcdb.support.OperationCanceledException
            if (r0 == 0) goto L_0x0062
            r0 = 11
            goto L_0x0007
        L_0x004a:
            r4.writeInt(r0)
            java.lang.String r0 = r5.getMessage()
            r4.writeString(r0)
            if (r3 == 0) goto L_0x0061
            java.lang.String r4 = "WCDB.DatabaseUtils"
            java.lang.String r0 = "Writing exception to parcel"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            com.tencent.wcdb.support.Log.m146011a(r4, r0, r2)
        L_0x0061:
            return
        L_0x0062:
            r4.writeException(r5)
            java.lang.String r4 = "WCDB.DatabaseUtils"
            java.lang.String r0 = "Writing exception to parcel"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            com.tencent.wcdb.support.Log.m146011a(r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.C46434h.m145974a(android.os.Parcel, java.lang.Exception):void");
    }

    /* renamed from: b */
    public static String m145980b(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        C46428n a = sQLiteDatabase.mo115459a(str);
        try {
            return m145981b(a, null);
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    public static long m145970a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        C46428n a = sQLiteDatabase.mo115459a(str);
        try {
            return m145971a(a, (String[]) null);
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    private static final void m145975a(Parcel parcel, String str, int i) {
        switch (i) {
            case 2:
                throw new IllegalArgumentException(str);
            case 3:
                throw new UnsupportedOperationException(str);
            case 4:
                throw new SQLiteAbortException(str);
            case 5:
                throw new SQLiteConstraintException(str);
            case 6:
                throw new SQLiteDatabaseCorruptException(str);
            case 7:
                throw new SQLiteFullException(str);
            case 8:
                throw new SQLiteDiskIOException(str);
            case 9:
                throw new SQLiteException(str);
            case 11:
                throw new OperationCanceledException(str);
            default:
                parcel.readException(i, str);
                return;
        }
    }
}
