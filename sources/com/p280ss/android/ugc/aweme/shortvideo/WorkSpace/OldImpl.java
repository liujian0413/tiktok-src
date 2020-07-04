package com.p280ss.android.ugc.aweme.shortvideo.WorkSpace;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39777p;
import com.p280ss.android.ugc.aweme.tools.C42130a;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.WorkSpace.OldImpl */
public class OldImpl implements WorkspaceImpl {
    public static final Creator<OldImpl> CREATOR = new Creator<OldImpl>() {
        /* renamed from: a */
        private static OldImpl[] m122800a(int i) {
            return new OldImpl[i];
        }

        /* renamed from: a */
        private static OldImpl m122799a(Parcel parcel) {
            return new OldImpl(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122799a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122800a(i);
        }
    };

    /* renamed from: a */
    int f99836a;

    /* renamed from: b */
    String f99837b = C39811er.f103469e;

    /* renamed from: c */
    String f99838c;

    /* renamed from: d */
    String f99839d;

    /* renamed from: e */
    String f99840e;

    /* renamed from: f */
    String f99841f;

    /* renamed from: g */
    String f99842g;

    /* renamed from: h */
    String f99843h;

    /* renamed from: i */
    String f99844i;

    /* renamed from: j */
    String f99845j;

    /* renamed from: k */
    String f99846k;

    /* renamed from: l */
    String f99847l;

    /* renamed from: m */
    String f99848m;

    /* renamed from: n */
    String f99849n;

    /* renamed from: o */
    Workspace f99850o;

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo96291e() {
        this.f99842g = null;
    }

    public OldImpl() {
    }

    /* renamed from: d */
    public final File mo96289d() {
        return new File(this.f99837b);
    }

    /* renamed from: c */
    public final File mo96288c() {
        if (this.f99842g == null) {
            return null;
        }
        return new File(this.f99842g);
    }

    /* renamed from: o */
    private File m122780o() {
        if (this.f99843h == null) {
            this.f99843h = new File(C39811er.f103468d, "mix.wav").getPath();
        }
        return new File(this.f99843h);
    }

    /* renamed from: a */
    public final File mo96283a() {
        if (this.f99839d == null) {
            this.f99839d = C39811er.m127465c("-concat-v");
        }
        return new File(this.f99839d);
    }

    /* renamed from: b */
    public final File mo96287b() {
        if (this.f99840e == null) {
            this.f99840e = C39811er.m127465c("-concat-a");
        }
        return new File(this.f99840e);
    }

    /* renamed from: f */
    public final void mo96292f() {
        File p = m122781p();
        if (p.exists()) {
            p.delete();
        }
        File o = m122780o();
        if (o.exists()) {
            o.delete();
        }
    }

    /* renamed from: g */
    public final void mo96293g() {
        if (mo96289d().exists()) {
            C7276d.m22810b(mo96289d());
        }
        mo96292f();
    }

    /* renamed from: h */
    public final File mo96294h() {
        if (this.f99845j == null) {
            File a = mo96283a();
            new C39777p();
            this.f99845j = C39777p.m127354a(a.getPath());
        }
        return new File(this.f99845j);
    }

    /* renamed from: i */
    public final File mo96295i() {
        if (this.f99846k == null) {
            File b = mo96287b();
            new C39777p();
            this.f99846k = C39777p.m127355b(b.getPath());
        }
        return new File(this.f99846k);
    }

    /* renamed from: j */
    public final File mo96296j() {
        if (this.f99847l == null) {
            File a = mo96283a();
            new C39777p();
            this.f99847l = C39777p.m127356c(a.getPath());
        }
        return new File(this.f99847l);
    }

    /* renamed from: m */
    public final File mo96299m() {
        if (C7276d.m22812b(this.f99848m)) {
            return new File(this.f99848m);
        }
        return null;
    }

    /* renamed from: n */
    public final File mo96300n() {
        if (C7276d.m22812b(this.f99849n)) {
            return new File(this.f99849n);
        }
        return null;
    }

    /* renamed from: p */
    private File m122781p() {
        if (this.f99844i == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f99842g);
            sb.append(".wav");
            this.f99844i = new File(sb.toString()).getPath();
        }
        return new File(this.f99844i);
    }

    /* renamed from: k */
    public final File mo96297k() {
        String str = C39811er.f103473i;
        if (!C7276d.m22812b(str)) {
            C7276d.m22803a(str, false);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C39811er.m127467e("-bgv-v"));
        this.f99848m = sb.toString();
        return new File(this.f99848m);
    }

    /* renamed from: l */
    public final File mo96298l() {
        String str = C39811er.f103473i;
        if (!C7276d.m22812b(str)) {
            C7276d.m22803a(str, false);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C39811er.m127467e("-bgv-a"));
        this.f99849n = sb.toString();
        return new File(this.f99849n);
    }

    /* renamed from: a */
    public final void mo96286a(String str) {
        this.f99837b = str;
    }

    /* renamed from: a */
    public final void mo96285a(File file) {
        this.f99842g = file.getPath();
    }

    /* renamed from: a */
    public final void mo96284a(final C38416a aVar) {
        C42130a.m134090a().execute(new Runnable() {
            public final void run() {
                String a = Workspace.m122803a(OldImpl.this.mo96283a().getPath());
                File[] listFiles = new File(a).listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isFile()) {
                            file.delete();
                        }
                    }
                }
                String path = OldImpl.this.mo96289d().getPath();
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append(File.separator);
                C7276d.m22815c(path, sb.toString());
                if (aVar != null) {
                    aVar.mo96333a(OldImpl.this.f99850o);
                }
            }
        });
    }

    protected OldImpl(Parcel parcel) {
        this.f99836a = parcel.readInt();
        this.f99837b = parcel.readString();
        this.f99838c = parcel.readString();
        this.f99839d = parcel.readString();
        this.f99840e = parcel.readString();
        this.f99841f = parcel.readString();
        this.f99842g = parcel.readString();
        this.f99844i = parcel.readString();
        this.f99843h = parcel.readString();
        this.f99845j = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f99836a);
        parcel.writeString(this.f99837b);
        parcel.writeString(this.f99838c);
        parcel.writeString(this.f99839d);
        parcel.writeString(this.f99840e);
        parcel.writeString(this.f99841f);
        parcel.writeString(this.f99842g);
        parcel.writeString(this.f99844i);
        parcel.writeString(this.f99843h);
        parcel.writeString(this.f99845j);
    }
}
