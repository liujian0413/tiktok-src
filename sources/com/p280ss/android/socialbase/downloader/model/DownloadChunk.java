package com.p280ss.android.socialbase.downloader.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.socialbase.downloader.p906d.C20197b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.socialbase.downloader.model.DownloadChunk */
public class DownloadChunk implements Parcelable {
    public static final Creator<DownloadChunk> CREATOR = new Creator<DownloadChunk>() {
        /* renamed from: a */
        private static DownloadChunk[] m67402a(int i) {
            return new DownloadChunk[i];
        }

        /* renamed from: a */
        private static DownloadChunk m67401a(Parcel parcel) {
            return new DownloadChunk(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m67401a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m67402a(i);
        }
    };

    /* renamed from: k */
    private static final String f54918k = "DownloadChunk";

    /* renamed from: a */
    public int f54919a;

    /* renamed from: b */
    public long f54920b;

    /* renamed from: c */
    public long f54921c;

    /* renamed from: d */
    public long f54922d;

    /* renamed from: e */
    public int f54923e;

    /* renamed from: f */
    public long f54924f;

    /* renamed from: g */
    public List<DownloadChunk> f54925g;

    /* renamed from: h */
    public DownloadChunk f54926h;

    /* renamed from: i */
    public int f54927i;

    /* renamed from: j */
    public boolean f54928j;

    /* renamed from: l */
    private AtomicLong f54929l;

    /* renamed from: m */
    private AtomicInteger f54930m;

    /* renamed from: n */
    private AtomicBoolean f54931n;

    /* renamed from: o */
    private C20197b f54932o;

    /* renamed from: com.ss.android.socialbase.downloader.model.DownloadChunk$a */
    public static class C20333a {

        /* renamed from: a */
        public int f54933a;

        /* renamed from: b */
        public long f54934b;

        /* renamed from: c */
        public long f54935c;

        /* renamed from: d */
        public long f54936d;

        /* renamed from: e */
        public long f54937e;

        /* renamed from: f */
        public int f54938f;

        /* renamed from: g */
        public long f54939g;

        /* renamed from: h */
        public DownloadChunk f54940h;

        /* renamed from: a */
        public final DownloadChunk mo54561a() {
            return new DownloadChunk(this);
        }

        /* renamed from: a */
        public final C20333a mo54558a(int i) {
            this.f54938f = i;
            return this;
        }

        /* renamed from: b */
        public final C20333a mo54562b(long j) {
            this.f54935c = j;
            return this;
        }

        /* renamed from: c */
        public final C20333a mo54563c(long j) {
            this.f54936d = j;
            return this;
        }

        /* renamed from: d */
        public final C20333a mo54564d(long j) {
            this.f54937e = j;
            return this;
        }

        /* renamed from: e */
        public final C20333a mo54565e(long j) {
            this.f54939g = j;
            return this;
        }

        public C20333a(int i) {
            this.f54933a = i;
        }

        /* renamed from: a */
        public final C20333a mo54559a(long j) {
            this.f54934b = j;
            return this;
        }

        /* renamed from: a */
        public final C20333a mo54560a(DownloadChunk downloadChunk) {
            this.f54940h = downloadChunk;
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: m */
    private void m67381m() {
        this.f54924f = mo54553k();
    }

    /* renamed from: b */
    public final int mo54542b() {
        if (this.f54930m == null) {
            return -1;
        }
        return this.f54930m.get();
    }

    /* renamed from: c */
    public final boolean mo54544c() {
        if (this.f54931n == null) {
            return false;
        }
        return this.f54931n.get();
    }

    /* renamed from: d */
    public final boolean mo54545d() {
        if (mo54542b() == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo54548f() {
        if (this.f54925g == null || this.f54925g.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final long mo54552j() {
        if (this.f54929l != null) {
            return this.f54929l.get();
        }
        return 0;
    }

    /* renamed from: e */
    public final DownloadChunk mo54547e() {
        DownloadChunk downloadChunk;
        if (!mo54545d()) {
            downloadChunk = this.f54926h;
        } else {
            downloadChunk = this;
        }
        if (downloadChunk == null || !downloadChunk.mo54548f()) {
            return null;
        }
        return (DownloadChunk) downloadChunk.f54925g.get(0);
    }

    /* renamed from: g */
    public final boolean mo54549g() {
        if (this.f54926h == null) {
            return true;
        }
        if (!this.f54926h.mo54548f()) {
            return false;
        }
        for (int i = 0; i < this.f54926h.f54925g.size(); i++) {
            DownloadChunk downloadChunk = (DownloadChunk) this.f54926h.f54925g.get(i);
            if (downloadChunk != null) {
                int indexOf = this.f54926h.f54925g.indexOf(this);
                if (indexOf > i && !downloadChunk.mo54550h()) {
                    return false;
                }
                if (indexOf == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo54550h() {
        long j = this.f54920b;
        if (mo54545d() && this.f54924f > this.f54920b) {
            j = this.f54924f;
        }
        if (mo54553k() - j >= this.f54922d) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final long mo54551i() {
        if (this.f54926h == null || this.f54926h.f54925g == null) {
            return -1;
        }
        int indexOf = this.f54926h.f54925g.indexOf(this);
        boolean z = false;
        for (int i = 0; i < this.f54926h.f54925g.size(); i++) {
            DownloadChunk downloadChunk = (DownloadChunk) this.f54926h.f54925g.get(i);
            if (downloadChunk != null) {
                if (z) {
                    return downloadChunk.mo54553k();
                }
                if (indexOf == i) {
                    z = true;
                }
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final long mo54554l() {
        long k = mo54553k() - this.f54920b;
        if (mo54548f()) {
            k = 0;
            for (int i = 0; i < this.f54925g.size(); i++) {
                DownloadChunk downloadChunk = (DownloadChunk) this.f54925g.get(i);
                if (downloadChunk != null) {
                    k += downloadChunk.mo54553k() - downloadChunk.f54920b;
                }
            }
        }
        return k;
    }

    /* renamed from: a */
    public final ContentValues mo54535a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(this.f54919a));
        contentValues.put("chunkIndex", Integer.valueOf(this.f54923e));
        contentValues.put("startOffset", Long.valueOf(this.f54920b));
        contentValues.put("curOffset", Long.valueOf(mo54553k()));
        contentValues.put("endOffset", Long.valueOf(this.f54921c));
        contentValues.put("chunkContentLen", Long.valueOf(this.f54922d));
        contentValues.put("hostChunkIndex", Integer.valueOf(mo54542b()));
        return contentValues;
    }

    /* renamed from: k */
    public final long mo54553k() {
        if (!mo54545d() || !mo54548f()) {
            return mo54552j();
        }
        long j = 0;
        for (int i = 0; i < this.f54925g.size(); i++) {
            DownloadChunk downloadChunk = (DownloadChunk) this.f54925g.get(i);
            if (downloadChunk != null) {
                if (!downloadChunk.mo54550h()) {
                    return downloadChunk.mo54552j();
                }
                if (j < downloadChunk.mo54552j()) {
                    j = downloadChunk.mo54552j();
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public final void mo54539a(C20197b bVar) {
        this.f54932o = bVar;
        m67381m();
    }

    /* renamed from: a */
    public final void mo54540a(DownloadChunk downloadChunk) {
        this.f54926h = downloadChunk;
        if (this.f54926h != null) {
            m67380a(this.f54926h.f54923e);
        }
    }

    /* renamed from: a */
    private void m67380a(int i) {
        if (this.f54930m == null) {
            this.f54930m = new AtomicInteger(i);
        } else {
            this.f54930m.set(i);
        }
    }

    protected DownloadChunk(Parcel parcel) {
        this.f54919a = parcel.readInt();
        this.f54920b = parcel.readLong();
        this.f54929l = new AtomicLong(parcel.readLong());
        this.f54921c = parcel.readLong();
        this.f54922d = parcel.readLong();
        this.f54923e = parcel.readInt();
        this.f54930m = new AtomicInteger(parcel.readInt());
    }

    /* renamed from: a */
    public final void mo54537a(long j) {
        if (this.f54929l != null) {
            this.f54929l.set(j);
        } else {
            this.f54929l = new AtomicLong(j);
        }
    }

    private DownloadChunk(C20333a aVar) {
        if (aVar != null) {
            this.f54919a = aVar.f54933a;
            this.f54920b = aVar.f54934b;
            this.f54929l = new AtomicLong(aVar.f54935c);
            this.f54921c = aVar.f54936d;
            this.f54922d = aVar.f54937e;
            this.f54923e = aVar.f54938f;
            this.f54924f = aVar.f54939g;
            this.f54930m = new AtomicInteger(-1);
            mo54540a(aVar.f54940h);
            this.f54931n = new AtomicBoolean(false);
        }
    }

    /* renamed from: b */
    public final long mo54543b(boolean z) {
        long k = mo54553k();
        long j = this.f54922d - (k - this.f54924f);
        if (!z && k == this.f54924f) {
            j = this.f54922d - (k - this.f54920b);
        }
        StringBuilder sb = new StringBuilder("contentLength:");
        sb.append(this.f54922d);
        sb.append(" curOffset:");
        sb.append(mo54553k());
        sb.append(" oldOffset:");
        sb.append(this.f54924f);
        sb.append(" retainLen:");
        sb.append(j);
        if (j < 0) {
            return 0;
        }
        return j;
    }

    public DownloadChunk(Cursor cursor) {
        if (cursor != null) {
            this.f54919a = cursor.getInt(cursor.getColumnIndex("_id"));
            this.f54923e = cursor.getInt(cursor.getColumnIndex("chunkIndex"));
            this.f54920b = cursor.getLong(cursor.getColumnIndex("startOffset"));
            int columnIndex = cursor.getColumnIndex("curOffset");
            if (columnIndex != -1) {
                this.f54929l = new AtomicLong(cursor.getLong(columnIndex));
            } else {
                this.f54929l = new AtomicLong(0);
            }
            this.f54921c = cursor.getLong(cursor.getColumnIndex("endOffset"));
            int columnIndex2 = cursor.getColumnIndex("hostChunkIndex");
            if (columnIndex2 != -1) {
                this.f54930m = new AtomicInteger(cursor.getInt(columnIndex2));
            } else {
                this.f54930m = new AtomicInteger(-1);
            }
            int columnIndex3 = cursor.getColumnIndex("chunkContentLen");
            if (columnIndex3 != -1) {
                this.f54922d = cursor.getLong(columnIndex3);
            }
            this.f54931n = new AtomicBoolean(false);
        }
    }

    /* renamed from: a */
    public final void mo54538a(SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement != null) {
            this.f54927i = 0;
            sQLiteStatement.clearBindings();
            int i = this.f54927i + 1;
            this.f54927i = i;
            sQLiteStatement.bindLong(i, (long) this.f54919a);
            int i2 = this.f54927i + 1;
            this.f54927i = i2;
            sQLiteStatement.bindLong(i2, (long) this.f54923e);
            int i3 = this.f54927i + 1;
            this.f54927i = i3;
            sQLiteStatement.bindLong(i3, this.f54920b);
            int i4 = this.f54927i + 1;
            this.f54927i = i4;
            sQLiteStatement.bindLong(i4, mo54553k());
            int i5 = this.f54927i + 1;
            this.f54927i = i5;
            sQLiteStatement.bindLong(i5, this.f54921c);
            int i6 = this.f54927i + 1;
            this.f54927i = i6;
            sQLiteStatement.bindLong(i6, this.f54922d);
            int i7 = this.f54927i + 1;
            this.f54927i = i7;
            sQLiteStatement.bindLong(i7, (long) mo54542b());
        }
    }

    /* renamed from: a */
    public final void mo54541a(boolean z) {
        if (this.f54931n == null) {
            this.f54931n = new AtomicBoolean(z);
        } else {
            this.f54931n.set(z);
        }
        this.f54932o = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        long j;
        parcel.writeInt(this.f54919a);
        parcel.writeLong(this.f54920b);
        if (this.f54929l != null) {
            j = this.f54929l.get();
        } else {
            j = 0;
        }
        parcel.writeLong(j);
        parcel.writeLong(this.f54921c);
        parcel.writeLong(this.f54922d);
        parcel.writeInt(this.f54923e);
        int i2 = -1;
        if (this.f54930m != null) {
            i2 = this.f54930m.get();
        }
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public final List<DownloadChunk> mo54536a(int i, long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i2 = i;
        if (!mo54545d() || mo54548f()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long j8 = mo54552j();
        long b = mo54543b(true);
        long j9 = b / ((long) i2);
        StringBuilder sb = new StringBuilder("retainLen:");
        sb.append(b);
        sb.append(" divideChunkForReuse chunkSize:");
        sb.append(j9);
        sb.append(" current host downloadChunk index:");
        sb.append(this.f54923e);
        long j10 = j8;
        int i3 = 0;
        while (i3 < i2) {
            if (i3 == 0) {
                j4 = b;
                j6 = this.f54920b;
            } else {
                j4 = b;
                int i4 = i2 - 1;
                if (i3 == i4) {
                    long j11 = this.f54921c;
                    if (j11 > j10) {
                        j7 = (j11 - j10) + 1;
                    } else {
                        j7 = j4 - (((long) i4) * j9);
                    }
                    j3 = j7;
                    j5 = j11;
                    j6 = j10;
                    long j12 = j10;
                    long j13 = j3;
                    DownloadChunk a = new C20333a(this.f54919a).mo54558a((-i3) - 1).mo54559a(j6).mo54562b(j10).mo54565e(j10).mo54563c(j5).mo54564d(j13).mo54560a(this).mo54561a();
                    StringBuilder sb2 = new StringBuilder("divide sub chunk : ");
                    sb2.append(i3);
                    sb2.append(" startOffset:");
                    sb2.append(j6);
                    sb2.append(" curOffset:");
                    long j14 = j12;
                    sb2.append(j14);
                    sb2.append(" endOffset:");
                    sb2.append(j5);
                    sb2.append(" contentLen:");
                    sb2.append(j13);
                    arrayList.add(a);
                    j10 = j14 + j9;
                    i3++;
                    b = j4;
                } else {
                    j6 = j10;
                }
            }
            j5 = (j10 + j9) - 1;
            j3 = j9;
            long j122 = j10;
            long j132 = j3;
            DownloadChunk a2 = new C20333a(this.f54919a).mo54558a((-i3) - 1).mo54559a(j6).mo54562b(j10).mo54565e(j10).mo54563c(j5).mo54564d(j132).mo54560a(this).mo54561a();
            StringBuilder sb22 = new StringBuilder("divide sub chunk : ");
            sb22.append(i3);
            sb22.append(" startOffset:");
            sb22.append(j6);
            sb22.append(" curOffset:");
            long j142 = j122;
            sb22.append(j142);
            sb22.append(" endOffset:");
            sb22.append(j5);
            sb22.append(" contentLen:");
            sb22.append(j132);
            arrayList.add(a2);
            j10 = j142 + j9;
            i3++;
            b = j4;
        }
        long j15 = 0;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            DownloadChunk downloadChunk = (DownloadChunk) arrayList.get(size);
            if (downloadChunk != null) {
                j15 += downloadChunk.f54922d;
            }
        }
        new StringBuilder("reuseChunkContentLen:").append(j15);
        DownloadChunk downloadChunk2 = (DownloadChunk) arrayList.get(0);
        if (downloadChunk2 != null) {
            if (this.f54921c == 0) {
                j2 = j - this.f54920b;
            } else {
                j2 = (this.f54921c - this.f54920b) + 1;
            }
            downloadChunk2.f54922d = j2 - j15;
            downloadChunk2.f54923e = this.f54923e;
            if (this.f54932o != null) {
                this.f54932o.mo54089a(downloadChunk2.f54921c, this.f54922d - j15);
            }
        }
        this.f54925g = arrayList;
        return arrayList;
    }
}
