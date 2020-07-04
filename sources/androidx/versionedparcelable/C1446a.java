package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: androidx.versionedparcelable.a */
final class C1446a extends VersionedParcel {

    /* renamed from: a */
    private final SparseIntArray f5613a;

    /* renamed from: b */
    private final Parcel f5614b;

    /* renamed from: c */
    private final int f5615c;

    /* renamed from: d */
    private final int f5616d;

    /* renamed from: e */
    private final String f5617e;

    /* renamed from: f */
    private int f5618f;

    /* renamed from: g */
    private int f5619g;

    /* renamed from: c */
    public final int mo6658c() {
        return this.f5614b.readInt();
    }

    /* renamed from: d */
    public final String mo6660d() {
        return this.f5614b.readString();
    }

    /* renamed from: f */
    public final <T extends Parcelable> T mo6662f() {
        return this.f5614b.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: e */
    public final byte[] mo6661e() {
        int readInt = this.f5614b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5614b.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: a */
    public final void mo6640a() {
        if (this.f5618f >= 0) {
            int i = this.f5613a.get(this.f5618f);
            int dataPosition = this.f5614b.dataPosition();
            int i2 = dataPosition - i;
            this.f5614b.setDataPosition(i);
            this.f5614b.writeInt(i2);
            this.f5614b.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final VersionedParcel mo6653b() {
        int i;
        Parcel parcel = this.f5614b;
        int dataPosition = this.f5614b.dataPosition();
        if (this.f5619g == this.f5615c) {
            i = this.f5616d;
        } else {
            i = this.f5619g;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5617e);
        sb.append("  ");
        return new C1446a(parcel, dataPosition, i, sb.toString());
    }

    /* renamed from: a */
    public final void mo6641a(int i) {
        this.f5614b.writeInt(i);
    }

    C1446a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    /* renamed from: a */
    public final void mo6643a(Parcelable parcelable) {
        this.f5614b.writeParcelable(parcelable, 0);
    }

    /* renamed from: b */
    public final boolean mo6656b(int i) {
        int d = m7278d(i);
        if (d == -1) {
            return false;
        }
        this.f5614b.setDataPosition(d);
        return true;
    }

    /* renamed from: a */
    public final void mo6647a(String str) {
        this.f5614b.writeString(str);
    }

    /* renamed from: c */
    public final void mo6659c(int i) {
        mo6640a();
        this.f5618f = i;
        this.f5613a.put(i, this.f5614b.dataPosition());
        mo6641a(0);
        mo6641a(i);
    }

    /* renamed from: d */
    private int m7278d(int i) {
        while (this.f5619g < this.f5616d) {
            this.f5614b.setDataPosition(this.f5619g);
            int readInt = this.f5614b.readInt();
            int readInt2 = this.f5614b.readInt();
            this.f5619g += readInt;
            if (readInt2 == i) {
                return this.f5614b.dataPosition();
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo6649a(byte[] bArr) {
        if (bArr != null) {
            this.f5614b.writeInt(bArr.length);
            this.f5614b.writeByteArray(bArr);
            return;
        }
        this.f5614b.writeInt(-1);
    }

    private C1446a(Parcel parcel, int i, int i2, String str) {
        this.f5613a = new SparseIntArray();
        this.f5618f = -1;
        this.f5619g = 0;
        this.f5614b = parcel;
        this.f5615c = i;
        this.f5616d = i2;
        this.f5619g = this.f5615c;
        this.f5617e = str;
    }
}
