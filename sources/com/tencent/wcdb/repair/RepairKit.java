package com.tencent.wcdb.repair;

import android.database.Cursor;
import com.tencent.wcdb.C46397a;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.C46443a.C46444a;

public class RepairKit implements C46444a {

    /* renamed from: a */
    public C46441a f119637a;

    /* renamed from: b */
    private long f119638b;

    /* renamed from: c */
    private int f119639c;

    /* renamed from: d */
    private C46442b f119640d;

    /* renamed from: e */
    private RepairCursor f119641e;

    static class RepairCursor extends C46397a {

        /* renamed from: g */
        long f119642g;

        private RepairCursor() {
        }

        private static native byte[] nativeGetBlob(long j, int i);

        private static native int nativeGetColumnCount(long j);

        private static native double nativeGetDouble(long j, int i);

        private static native long nativeGetLong(long j, int i);

        private static native String nativeGetString(long j, int i);

        private static native int nativeGetType(long j, int i);

        public int getColumnCount() {
            return nativeGetColumnCount(this.f119642g);
        }

        public String[] getColumnNames() {
            throw new UnsupportedOperationException();
        }

        public int getCount() {
            throw new UnsupportedOperationException();
        }

        public byte[] getBlob(int i) {
            return nativeGetBlob(this.f119642g, i);
        }

        public double getDouble(int i) {
            return nativeGetDouble(this.f119642g, i);
        }

        public float getFloat(int i) {
            return (float) getDouble(i);
        }

        public int getInt(int i) {
            return (int) getLong(i);
        }

        public long getLong(int i) {
            return nativeGetLong(this.f119642g, i);
        }

        public short getShort(int i) {
            return (short) ((int) getLong(i));
        }

        public String getString(int i) {
            return nativeGetString(this.f119642g, i);
        }

        public int getType(int i) {
            return nativeGetType(this.f119642g, i);
        }

        public boolean isNull(int i) {
            if (getType(i) == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.tencent.wcdb.repair.RepairKit$a */
    public interface C46441a {
        /* renamed from: a */
        int mo27351a(String str, int i, Cursor cursor);
    }

    /* renamed from: com.tencent.wcdb.repair.RepairKit$b */
    public static class C46442b {

        /* renamed from: a */
        public long f119643a;

        /* renamed from: b */
        public byte[] f119644b;

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            mo115543a();
            super.finalize();
        }

        /* renamed from: a */
        public final void mo115543a() {
            if (this.f119643a != 0) {
                RepairKit.nativeFreeMaster(this.f119643a);
                this.f119643a = 0;
            }
        }

        /* renamed from: a */
        private static C46442b m146006a(String[] strArr) {
            long nativeMakeMaster = RepairKit.nativeMakeMaster(strArr);
            if (nativeMakeMaster != 0) {
                return new C46442b(nativeMakeMaster, null);
            }
            throw new SQLiteException("Cannot create MasterInfo.");
        }

        private C46442b(long j, byte[] bArr) {
            this.f119643a = j;
            this.f119644b = bArr;
        }

        /* renamed from: a */
        public static C46442b m146005a(String str, byte[] bArr, String[] strArr) {
            if (str == null) {
                return m146006a(null);
            }
            byte[] bArr2 = new byte[16];
            long nativeLoadMaster = RepairKit.nativeLoadMaster(str, null, null, bArr2);
            if (nativeLoadMaster != 0) {
                return new C46442b(nativeLoadMaster, bArr2);
            }
            throw new SQLiteException("Cannot create MasterInfo.");
        }

        /* renamed from: a */
        public static boolean m146007a(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr) {
            long a = sQLiteDatabase.mo115458a("backupMaster", true, false);
            boolean nativeSaveMaster = RepairKit.nativeSaveMaster(a, str, null);
            sQLiteDatabase.mo115463a(a, (Exception) null);
            return nativeSaveMaster;
        }
    }

    private static native void nativeCancel(long j);

    private static native void nativeFini(long j);

    public static native void nativeFreeMaster(long j);

    private static native long nativeInit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, byte[] bArr2);

    private static native int nativeIntegrityFlags(long j);

    private static native String nativeLastError();

    public static native long nativeLoadMaster(String str, byte[] bArr, String[] strArr, byte[] bArr2);

    public static native long nativeMakeMaster(String[] strArr);

    private native int nativeOutput(long j, long j2, long j3, int i);

    public static native boolean nativeSaveMaster(long j, String str, byte[] bArr);

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        mo115537a();
        super.finalize();
    }

    /* renamed from: b */
    public final void mo115436b() {
        if (this.f119638b != 0) {
            nativeCancel(this.f119638b);
        }
    }

    /* renamed from: a */
    public final void mo115537a() {
        if (this.f119640d != null) {
            this.f119640d.mo115543a();
            this.f119640d = null;
        }
        if (this.f119638b != 0) {
            nativeFini(this.f119638b);
            this.f119638b = 0;
        }
    }

    /* renamed from: a */
    public final int mo115536a(SQLiteDatabase sQLiteDatabase, int i) {
        long j = 0;
        if (this.f119638b != 0) {
            if (this.f119640d != null) {
                j = this.f119640d.f119643a;
            }
            long j2 = j;
            long a = sQLiteDatabase.mo115458a("repair", false, false);
            int nativeOutput = nativeOutput(this.f119638b, a, j2, 0);
            sQLiteDatabase.mo115463a(a, (Exception) null);
            this.f119641e = null;
            this.f119639c = nativeIntegrityFlags(this.f119638b);
            return nativeOutput;
        }
        throw new IllegalArgumentException();
    }

    private int onProgress(String str, int i, long j) {
        if (this.f119637a == null) {
            return 0;
        }
        if (this.f119641e == null) {
            this.f119641e = new RepairCursor();
        }
        this.f119641e.f119642g = j;
        return this.f119637a.mo27351a(str, i, this.f119641e);
    }

    public RepairKit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, C46442b bVar) {
        byte[] bArr2;
        if (str != null) {
            if (bVar == null) {
                bArr2 = null;
            } else {
                bArr2 = bVar.f119644b;
            }
            this.f119638b = nativeInit(str, bArr, null, bArr2);
            if (this.f119638b != 0) {
                this.f119639c = nativeIntegrityFlags(this.f119638b);
                this.f119640d = bVar;
                return;
            }
            throw new SQLiteException("Failed initialize RepairKit.");
        }
        throw new IllegalArgumentException();
    }
}
