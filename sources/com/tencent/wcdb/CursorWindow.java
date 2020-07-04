package com.tencent.wcdb;

import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.tencent.wcdb.database.C46411c;

public class CursorWindow extends C46411c implements Parcelable {
    public static final Creator<CursorWindow> CREATOR = new Creator<CursorWindow>() {
        /* renamed from: a */
        private static CursorWindow[] m145743a(int i) {
            return new CursorWindow[i];
        }

        /* renamed from: a */
        private static CursorWindow m145742a(Parcel parcel) {
            return new CursorWindow(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m145742a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m145743a(i);
        }
    };

    /* renamed from: d */
    private static int f119446d;

    /* renamed from: a */
    public long f119447a;

    /* renamed from: b */
    public int f119448b;

    /* renamed from: c */
    public final String f119449c;

    private static native boolean nativeAllocRow(long j);

    private static native void nativeClear(long j);

    private static native void nativeCopyStringToBuffer(long j, int i, int i2, CharArrayBuffer charArrayBuffer);

    private static native long nativeCreate(String str, int i);

    private static native void nativeDispose(long j);

    private static native void nativeFreeLastRow(long j);

    private static native byte[] nativeGetBlob(long j, int i, int i2);

    private static native double nativeGetDouble(long j, int i, int i2);

    private static native long nativeGetLong(long j, int i, int i2);

    private static native int nativeGetNumRows(long j);

    private static native String nativeGetString(long j, int i, int i2);

    private static native int nativeGetType(long j, int i, int i2);

    private static native boolean nativePutBlob(long j, byte[] bArr, int i, int i2);

    private static native boolean nativePutDouble(long j, double d, int i, int i2);

    private static native boolean nativePutLong(long j, long j2, int i, int i2);

    private static native boolean nativePutNull(long j, int i, int i2);

    private static native boolean nativePutString(long j, String str, int i, int i2);

    private static native boolean nativeSetNumColumns(long j, int i);

    /* renamed from: c */
    public final void mo115353c() {
        m145729f();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    private void m145729f() {
        if (this.f119447a != 0) {
            nativeDispose(this.f119447a);
            this.f119447a = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            m145729f();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: b */
    public final int mo115350b() {
        mo115483d();
        try {
            return nativeGetNumRows(this.f119447a);
        } finally {
            mo115484e();
        }
    }

    static {
        int identifier = Resources.getSystem().getIdentifier("config_cursorWindowSize", "integer", "android");
        if (identifier != 0) {
            f119446d = Resources.getSystem().getInteger(identifier) * PreloadTask.BYTE_UNIT_NUMBER;
        } else {
            f119446d = 2097152;
        }
    }

    /* renamed from: a */
    public final void mo115348a() {
        mo115483d();
        try {
            this.f119448b = 0;
            nativeClear(this.f119447a);
        } finally {
            mo115484e();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119449c);
        sb.append(" {");
        sb.append(Long.toHexString(this.f119447a));
        sb.append("}");
        return sb.toString();
    }

    private CursorWindow(Parcel parcel) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static CursorWindow m145728a(Parcel parcel) {
        return (CursorWindow) CREATOR.createFromParcel(parcel);
    }

    public CursorWindow(String str) {
        if (str == null || str.length() == 0) {
            str = "<unnamed>";
        }
        this.f119449c = str;
        this.f119447a = nativeCreate(this.f119449c, f119446d);
        if (this.f119447a == 0) {
            StringBuilder sb = new StringBuilder("Cursor window allocation of ");
            sb.append(f119446d / PreloadTask.BYTE_UNIT_NUMBER);
            sb.append(" kb failed. ");
            throw new CursorWindowAllocationException(sb.toString());
        }
    }

    /* renamed from: f */
    public final short mo115357f(int i, int i2) {
        return (short) ((int) mo115354d(i, i2));
    }

    /* renamed from: g */
    public final int mo115359g(int i, int i2) {
        return (int) mo115354d(i, i2);
    }

    /* renamed from: h */
    public final float mo115360h(int i, int i2) {
        return (float) mo115356e(i, i2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final int mo115347a(int i, int i2) {
        mo115483d();
        try {
            return nativeGetType(this.f119447a, i - this.f119448b, i2);
        } finally {
            mo115484e();
        }
    }

    /* renamed from: c */
    public final String mo115352c(int i, int i2) {
        mo115483d();
        try {
            return nativeGetString(this.f119447a, i - this.f119448b, i2);
        } finally {
            mo115484e();
        }
    }

    /* renamed from: d */
    public final long mo115354d(int i, int i2) {
        mo115483d();
        try {
            return nativeGetLong(this.f119447a, i - this.f119448b, i2);
        } finally {
            mo115484e();
        }
    }

    /* renamed from: e */
    public final double mo115356e(int i, int i2) {
        mo115483d();
        try {
            return nativeGetDouble(this.f119447a, i - this.f119448b, i2);
        } finally {
            mo115484e();
        }
    }

    /* renamed from: b */
    public final byte[] mo115351b(int i, int i2) {
        mo115483d();
        try {
            return nativeGetBlob(this.f119447a, i - this.f119448b, i2);
        } finally {
            mo115484e();
        }
    }

    /* renamed from: a */
    public final void mo115349a(int i, int i2, CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer != null) {
            mo115483d();
            try {
                nativeCopyStringToBuffer(this.f119447a, i - this.f119448b, i2, charArrayBuffer);
            } finally {
                mo115484e();
            }
        } else {
            throw new IllegalArgumentException("CharArrayBuffer should not be null");
        }
    }
}
