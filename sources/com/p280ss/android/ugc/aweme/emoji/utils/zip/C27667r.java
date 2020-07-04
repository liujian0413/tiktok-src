package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import com.p280ss.android.ugc.aweme.emoji.utils.zip.C27650d.C27651a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.r */
public class C27667r extends ZipEntry implements Cloneable {

    /* renamed from: f */
    private static final byte[] f72888f = new byte[0];

    /* renamed from: l */
    private static final C27668s[] f72889l = new C27668s[0];

    /* renamed from: a */
    public int f72890a;

    /* renamed from: b */
    public int f72891b;

    /* renamed from: c */
    public long f72892c;

    /* renamed from: d */
    public C27660l f72893d;

    /* renamed from: e */
    public C27653f f72894e;

    /* renamed from: g */
    private int f72895g;

    /* renamed from: h */
    private long f72896h;

    /* renamed from: i */
    private C27668s[] f72897i;

    /* renamed from: j */
    private String f72898j;

    /* renamed from: k */
    private byte[] f72899k;

    public int getMethod() {
        return this.f72895g;
    }

    public long getSize() {
        return this.f72896h;
    }

    /* renamed from: a */
    public final void mo71076a(byte[] bArr) {
        try {
            m90726a(C27650d.m90658a(bArr, false, C27651a.f72850c), false);
        } catch (ZipException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    protected C27667r() {
        this("");
    }

    /* renamed from: d */
    private C27668s[] m90732d() {
        if (this.f72893d == null) {
            return f72889l;
        }
        return new C27668s[]{this.f72893d};
    }

    /* renamed from: e */
    private C27668s[] m90733e() {
        C27668s[] f = m90734f();
        if (f == this.f72897i) {
            return m90730b(f);
        }
        return f;
    }

    /* renamed from: g */
    private byte[] m90735g() {
        byte[] extra = getExtra();
        if (extra != null) {
            return extra;
        }
        return f72888f;
    }

    /* renamed from: b */
    public final byte[] mo71078b() {
        return C27650d.m90659b(m90727a(true));
    }

    public String getName() {
        if (this.f72898j == null) {
            return super.getName();
        }
        return this.f72898j;
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public boolean isDirectory() {
        return getName().endsWith("/");
    }

    /* renamed from: c */
    private C27668s[] m90731c() {
        C27668s[] a = m90728a(this.f72897i, this.f72897i.length + 1);
        a[this.f72897i.length] = this.f72893d;
        return a;
    }

    /* renamed from: f */
    private C27668s[] m90734f() {
        if (this.f72897i == null) {
            return m90732d();
        }
        if (this.f72893d != null) {
            return m90731c();
        }
        return this.f72897i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71071a() {
        super.setExtra(C27650d.m90657a(m90727a(true)));
    }

    public Object clone() {
        C27667r rVar = (C27667r) super.clone();
        rVar.f72890a = this.f72890a;
        rVar.f72892c = this.f72892c;
        rVar.m90725a(m90734f());
        return rVar;
    }

    /* renamed from: a */
    private C27668s[] m90727a(boolean z) {
        return m90733e();
    }

    /* renamed from: b */
    private C27668s[] m90730b(C27668s[] sVarArr) {
        return m90728a(sVarArr, sVarArr.length);
    }

    private C27667r(String str) {
        super(str);
        this.f72895g = -1;
        this.f72896h = -1;
        this.f72894e = new C27653f();
        mo71074a(str);
    }

    /* renamed from: b */
    public final C27668s mo71077b(C27679w wVar) {
        C27668s[] sVarArr;
        if (this.f72897i != null) {
            for (C27668s sVar : this.f72897i) {
                if (wVar.equals(sVar.mo71050a())) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public void setMethod(int i) {
        if (i >= 0) {
            this.f72895g = i;
            return;
        }
        StringBuilder sb = new StringBuilder("ZIP compression method can not be negative: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public void setSize(long j) {
        if (j >= 0) {
            this.f72896h = j;
            return;
        }
        throw new IllegalArgumentException("invalid entry size");
    }

    /* renamed from: a */
    private void m90725a(C27668s[] sVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C27660l lVar : sVarArr) {
            if (lVar instanceof C27660l) {
                this.f72893d = lVar;
            } else {
                arrayList.add(lVar);
            }
        }
        this.f72897i = (C27668s[]) arrayList.toArray(new C27668s[arrayList.size()]);
        mo71071a();
    }

    /* renamed from: b */
    private void m90729b(C27668s sVar) {
        if (sVar instanceof C27660l) {
            this.f72893d = (C27660l) sVar;
        } else if (this.f72897i == null) {
            this.f72897i = new C27668s[]{sVar};
        } else {
            if (mo71077b(sVar.mo71050a()) != null) {
                mo71073a(sVar.mo71050a());
            }
            C27668s[] a = m90728a(this.f72897i, this.f72897i.length + 1);
            a[this.f72897i.length] = sVar;
            this.f72897i = a;
        }
        mo71071a();
    }

    public void setExtra(byte[] bArr) throws RuntimeException {
        try {
            m90726a(C27650d.m90658a(bArr, true, C27651a.f72850c), true);
        } catch (ZipException e) {
            StringBuilder sb = new StringBuilder("Error parsing extra fields for entry: ");
            sb.append(getName());
            sb.append(" - ");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final void mo71072a(C27668s sVar) {
        int i;
        if (mo71077b(sVar.mo71050a()) != null) {
            mo71073a(sVar.mo71050a());
        }
        C27668s[] sVarArr = this.f72897i;
        if (this.f72897i != null) {
            i = this.f72897i.length + 1;
        } else {
            i = 1;
        }
        this.f72897i = new C27668s[i];
        this.f72897i[0] = sVar;
        if (sVarArr != null) {
            System.arraycopy(sVarArr, 0, this.f72897i, 1, this.f72897i.length - 1);
        }
        mo71071a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C27667r rVar = (C27667r) obj;
        String name = getName();
        String name2 = rVar.getName();
        if (name == null) {
            if (name2 != null) {
                return false;
            }
        } else if (!name.equals(name2)) {
            return false;
        }
        String comment = getComment();
        String comment2 = rVar.getComment();
        if (comment == null) {
            comment = "";
        }
        if (comment2 == null) {
            comment2 = "";
        }
        if (getTime() == rVar.getTime() && comment.equals(comment2) && this.f72890a == rVar.f72890a && this.f72891b == rVar.f72891b && this.f72892c == rVar.f72892c && getMethod() == rVar.getMethod() && getSize() == rVar.getSize() && getCrc() == rVar.getCrc() && getCompressedSize() == rVar.getCompressedSize() && Arrays.equals(mo71078b(), rVar.mo71078b()) && Arrays.equals(m90735g(), rVar.m90735g()) && this.f72894e.equals(rVar.f72894e)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo71073a(C27679w wVar) {
        C27668s[] sVarArr;
        if (this.f72897i != null) {
            ArrayList arrayList = new ArrayList();
            for (C27668s sVar : this.f72897i) {
                if (!wVar.equals(sVar.mo71050a())) {
                    arrayList.add(sVar);
                }
            }
            if (this.f72897i.length != arrayList.size()) {
                this.f72897i = (C27668s[]) arrayList.toArray(new C27668s[arrayList.size()]);
                mo71071a();
                return;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71074a(String str) {
        if (str != null && this.f72891b == 0 && !str.contains("/")) {
            str = str.replace('\\', '/');
        }
        this.f72898j = str;
    }

    /* renamed from: a */
    private static C27668s[] m90728a(C27668s[] sVarArr, int i) {
        C27668s[] sVarArr2 = new C27668s[i];
        System.arraycopy(sVarArr, 0, sVarArr2, 0, Math.min(sVarArr.length, i));
        return sVarArr2;
    }

    /* renamed from: a */
    private void m90726a(C27668s[] sVarArr, boolean z) throws ZipException {
        C27668s sVar;
        if (this.f72897i == null) {
            m90725a(sVarArr);
            return;
        }
        for (C27668s sVar2 : sVarArr) {
            if (sVar2 instanceof C27660l) {
                sVar = this.f72893d;
            } else {
                sVar = mo71077b(sVar2.mo71050a());
            }
            if (sVar == null) {
                m90729b(sVar2);
            } else if (z || !(sVar instanceof C27649c)) {
                byte[] d = sVar2.mo71048d();
                sVar.mo71044a(d, 0, d.length);
            } else {
                byte[] b = sVar2.mo71046b();
                ((C27649c) sVar).mo71052b(b, 0, b.length);
            }
        }
        mo71071a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71075a(String str, byte[] bArr) {
        mo71074a(str);
        this.f72899k = bArr;
    }
}
