package com.google.android.gms.internal.measurement;

import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.en */
public final class C16505en extends C16679kp<C16505en> {

    /* renamed from: m */
    private static volatile C16505en[] f46250m;

    /* renamed from: a */
    public int f46251a;

    /* renamed from: b */
    public String f46252b;

    /* renamed from: c */
    public C16505en[] f46253c;

    /* renamed from: d */
    public C16505en[] f46254d;

    /* renamed from: e */
    public C16505en[] f46255e;

    /* renamed from: f */
    public String f46256f;

    /* renamed from: g */
    public String f46257g;

    /* renamed from: h */
    public long f46258h;

    /* renamed from: i */
    public boolean f46259i;

    /* renamed from: j */
    public C16505en[] f46260j;

    /* renamed from: k */
    public int[] f46261k;

    /* renamed from: l */
    public boolean f46262l;

    /* renamed from: a */
    private static int m53803a(int i) {
        if (i > 0 && i <= 17) {
            return i;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append(i);
        sb.append(" is not a valid enum Escaping");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static C16505en[] m53804a() {
        if (f46250m == null) {
            synchronized (C16683kt.f46606b) {
                if (f46250m == null) {
                    f46250m = new C16505en[0];
                }
            }
        }
        return f46250m;
    }

    public C16505en() {
        this.f46251a = 1;
        this.f46252b = "";
        this.f46253c = m53804a();
        this.f46254d = m53804a();
        this.f46255e = m53804a();
        this.f46256f = "";
        this.f46257g = "";
        this.f46258h = 0;
        this.f46259i = false;
        this.f46260j = m53804a();
        this.f46261k = C16687kx.f46611a;
        this.f46262l = false;
        this.f46593L = null;
        this.f46608M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16505en)) {
            return false;
        }
        C16505en enVar = (C16505en) obj;
        if (this.f46251a != enVar.f46251a) {
            return false;
        }
        if (this.f46252b == null) {
            if (enVar.f46252b != null) {
                return false;
            }
        } else if (!this.f46252b.equals(enVar.f46252b)) {
            return false;
        }
        if (!C16683kt.m54806a((Object[]) this.f46253c, (Object[]) enVar.f46253c) || !C16683kt.m54806a((Object[]) this.f46254d, (Object[]) enVar.f46254d) || !C16683kt.m54806a((Object[]) this.f46255e, (Object[]) enVar.f46255e)) {
            return false;
        }
        if (this.f46256f == null) {
            if (enVar.f46256f != null) {
                return false;
            }
        } else if (!this.f46256f.equals(enVar.f46256f)) {
            return false;
        }
        if (this.f46257g == null) {
            if (enVar.f46257g != null) {
                return false;
            }
        } else if (!this.f46257g.equals(enVar.f46257g)) {
            return false;
        }
        if (this.f46258h != enVar.f46258h || this.f46259i != enVar.f46259i || !C16683kt.m54806a((Object[]) this.f46260j, (Object[]) enVar.f46260j) || !C16683kt.m54804a(this.f46261k, enVar.f46261k) || this.f46262l != enVar.f46262l) {
            return false;
        }
        if (this.f46593L == null || this.f46593L.mo43156a()) {
            return enVar.f46593L == null || enVar.f46593L.mo43156a();
        }
        return this.f46593L.equals(enVar.f46593L);
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 1237;
        int hashCode = (((((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f46251a) * 31) + (this.f46252b == null ? 0 : this.f46252b.hashCode())) * 31) + C16683kt.m54802a((Object[]) this.f46253c)) * 31) + C16683kt.m54802a((Object[]) this.f46254d)) * 31) + C16683kt.m54802a((Object[]) this.f46255e)) * 31) + (this.f46256f == null ? 0 : this.f46256f.hashCode())) * 31) + (this.f46257g == null ? 0 : this.f46257g.hashCode())) * 31) + ((int) (this.f46258h ^ (this.f46258h >>> 32)))) * 31) + (this.f46259i ? 1231 : 1237)) * 31) + C16683kt.m54802a((Object[]) this.f46260j)) * 31) + C16683kt.m54800a(this.f46261k)) * 31;
        if (this.f46262l) {
            i2 = 1231;
        }
        int i3 = (hashCode + i2) * 31;
        if (this.f46593L != null && !this.f46593L.mo43156a()) {
            i = this.f46593L.hashCode();
        }
        return i3 + i;
    }

    /* renamed from: a */
    public final void mo42655a(C16678ko koVar) throws IOException {
        koVar.mo43135a(1, this.f46251a);
        if (this.f46252b != null && !this.f46252b.equals("")) {
            koVar.mo43139a(2, this.f46252b);
        }
        if (this.f46253c != null && this.f46253c.length > 0) {
            for (C16505en enVar : this.f46253c) {
                if (enVar != null) {
                    koVar.mo43138a(3, (C16684ku) enVar);
                }
            }
        }
        if (this.f46254d != null && this.f46254d.length > 0) {
            for (C16505en enVar2 : this.f46254d) {
                if (enVar2 != null) {
                    koVar.mo43138a(4, (C16684ku) enVar2);
                }
            }
        }
        if (this.f46255e != null && this.f46255e.length > 0) {
            for (C16505en enVar3 : this.f46255e) {
                if (enVar3 != null) {
                    koVar.mo43138a(5, (C16684ku) enVar3);
                }
            }
        }
        if (this.f46256f != null && !this.f46256f.equals("")) {
            koVar.mo43139a(6, this.f46256f);
        }
        if (this.f46257g != null && !this.f46257g.equals("")) {
            koVar.mo43139a(7, this.f46257g);
        }
        if (this.f46258h != 0) {
            koVar.mo43142b(8, this.f46258h);
        }
        if (this.f46262l) {
            koVar.mo43140a(9, this.f46262l);
        }
        if (this.f46261k != null && this.f46261k.length > 0) {
            for (int a : this.f46261k) {
                koVar.mo43135a(10, a);
            }
        }
        if (this.f46260j != null && this.f46260j.length > 0) {
            for (C16505en enVar4 : this.f46260j) {
                if (enVar4 != null) {
                    koVar.mo43138a(11, (C16684ku) enVar4);
                }
            }
        }
        if (this.f46259i) {
            koVar.mo43140a(12, this.f46259i);
        }
        super.mo42655a(koVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo42656b() {
        int b = super.mo42656b() + C16678ko.m54759b(1, this.f46251a);
        if (this.f46252b != null && !this.f46252b.equals("")) {
            b += C16678ko.m54761b(2, this.f46252b);
        }
        if (this.f46253c != null && this.f46253c.length > 0) {
            int i = b;
            for (C16505en enVar : this.f46253c) {
                if (enVar != null) {
                    i += C16678ko.m54760b(3, (C16684ku) enVar);
                }
            }
            b = i;
        }
        if (this.f46254d != null && this.f46254d.length > 0) {
            int i2 = b;
            for (C16505en enVar2 : this.f46254d) {
                if (enVar2 != null) {
                    i2 += C16678ko.m54760b(4, (C16684ku) enVar2);
                }
            }
            b = i2;
        }
        if (this.f46255e != null && this.f46255e.length > 0) {
            int i3 = b;
            for (C16505en enVar3 : this.f46255e) {
                if (enVar3 != null) {
                    i3 += C16678ko.m54760b(5, (C16684ku) enVar3);
                }
            }
            b = i3;
        }
        if (this.f46256f != null && !this.f46256f.equals("")) {
            b += C16678ko.m54761b(6, this.f46256f);
        }
        if (this.f46257g != null && !this.f46257g.equals("")) {
            b += C16678ko.m54761b(7, this.f46257g);
        }
        if (this.f46258h != 0) {
            b += C16678ko.m54764c(8, this.f46258h);
        }
        if (this.f46262l) {
            b += C16678ko.m54758b(9) + 1;
        }
        if (this.f46261k != null && this.f46261k.length > 0) {
            int i4 = 0;
            for (int a : this.f46261k) {
                i4 += C16678ko.m54751a(a);
            }
            b = b + i4 + (this.f46261k.length * 1);
        }
        if (this.f46260j != null && this.f46260j.length > 0) {
            for (C16505en enVar4 : this.f46260j) {
                if (enVar4 != null) {
                    b += C16678ko.m54760b(11, (C16684ku) enVar4);
                }
            }
        }
        return this.f46259i ? b + C16678ko.m54758b(12) + 1 : b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C16505en mo42654a(C16676km kmVar) throws IOException {
        int d;
        while (true) {
            int a = kmVar.mo43113a();
            switch (a) {
                case 0:
                    return this;
                case 8:
                    try {
                        d = kmVar.mo43124d();
                        if (d > 0 && d <= 8) {
                            this.f46251a = d;
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder(36);
                            sb.append(d);
                            sb.append(" is not a valid enum Type");
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        kmVar.mo43125d(kmVar.mo43130i());
                        mo43146a(kmVar, a);
                        break;
                    }
                    break;
                case 18:
                    this.f46252b = kmVar.mo43122c();
                    break;
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    int a2 = C16687kx.m54816a(kmVar, 26);
                    int length = this.f46253c == null ? 0 : this.f46253c.length;
                    C16505en[] enVarArr = new C16505en[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f46253c, 0, enVarArr, 0, length);
                    }
                    while (length < enVarArr.length - 1) {
                        enVarArr[length] = new C16505en();
                        kmVar.mo43115a((C16684ku) enVarArr[length]);
                        kmVar.mo43113a();
                        length++;
                    }
                    enVarArr[length] = new C16505en();
                    kmVar.mo43115a((C16684ku) enVarArr[length]);
                    this.f46253c = enVarArr;
                    break;
                case BaseNotice.CHALLENGE /*34*/:
                    int a3 = C16687kx.m54816a(kmVar, 34);
                    int length2 = this.f46254d == null ? 0 : this.f46254d.length;
                    C16505en[] enVarArr2 = new C16505en[(a3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f46254d, 0, enVarArr2, 0, length2);
                    }
                    while (length2 < enVarArr2.length - 1) {
                        enVarArr2[length2] = new C16505en();
                        kmVar.mo43115a((C16684ku) enVarArr2[length2]);
                        kmVar.mo43113a();
                        length2++;
                    }
                    enVarArr2[length2] = new C16505en();
                    kmVar.mo43115a((C16684ku) enVarArr2[length2]);
                    this.f46254d = enVarArr2;
                    break;
                case 42:
                    int a4 = C16687kx.m54816a(kmVar, 42);
                    int length3 = this.f46255e == null ? 0 : this.f46255e.length;
                    C16505en[] enVarArr3 = new C16505en[(a4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f46255e, 0, enVarArr3, 0, length3);
                    }
                    while (length3 < enVarArr3.length - 1) {
                        enVarArr3[length3] = new C16505en();
                        kmVar.mo43115a((C16684ku) enVarArr3[length3]);
                        kmVar.mo43113a();
                        length3++;
                    }
                    enVarArr3[length3] = new C16505en();
                    kmVar.mo43115a((C16684ku) enVarArr3[length3]);
                    this.f46255e = enVarArr3;
                    break;
                case 50:
                    this.f46256f = kmVar.mo43122c();
                    break;
                case 58:
                    this.f46257g = kmVar.mo43122c();
                    break;
                case 64:
                    this.f46258h = kmVar.mo43126e();
                    break;
                case 72:
                    this.f46262l = kmVar.mo43121b();
                    break;
                case 80:
                    int a5 = C16687kx.m54816a(kmVar, 80);
                    int[] iArr = new int[a5];
                    int i = 0;
                    for (int i2 = 0; i2 < a5; i2++) {
                        if (i2 != 0) {
                            kmVar.mo43113a();
                        }
                        int i3 = kmVar.mo43130i();
                        try {
                            iArr[i] = m53803a(kmVar.mo43124d());
                            i++;
                        } catch (IllegalArgumentException unused2) {
                            kmVar.mo43125d(i3);
                            mo43146a(kmVar, a);
                        }
                    }
                    if (i != 0) {
                        int length4 = this.f46261k == null ? 0 : this.f46261k.length;
                        if (length4 != 0 || i != iArr.length) {
                            int[] iArr2 = new int[(length4 + i)];
                            if (length4 != 0) {
                                System.arraycopy(this.f46261k, 0, iArr2, 0, length4);
                            }
                            System.arraycopy(iArr, 0, iArr2, length4, i);
                            this.f46261k = iArr2;
                            break;
                        } else {
                            this.f46261k = iArr;
                            break;
                        }
                    } else {
                        break;
                    }
                case 82:
                    int b = kmVar.mo43119b(kmVar.mo43124d());
                    int i4 = kmVar.mo43130i();
                    int i5 = 0;
                    while (kmVar.mo43129h() > 0) {
                        try {
                            m53803a(kmVar.mo43124d());
                            i5++;
                        } catch (IllegalArgumentException unused3) {
                        }
                    }
                    if (i5 != 0) {
                        kmVar.mo43125d(i4);
                        int length5 = this.f46261k == null ? 0 : this.f46261k.length;
                        int[] iArr3 = new int[(i5 + length5)];
                        if (length5 != 0) {
                            System.arraycopy(this.f46261k, 0, iArr3, 0, length5);
                        }
                        while (kmVar.mo43129h() > 0) {
                            int i6 = kmVar.mo43130i();
                            try {
                                iArr3[length5] = m53803a(kmVar.mo43124d());
                                length5++;
                            } catch (IllegalArgumentException unused4) {
                                kmVar.mo43125d(i6);
                                mo43146a(kmVar, 80);
                            }
                        }
                        this.f46261k = iArr3;
                    }
                    kmVar.mo43123c(b);
                    break;
                case 90:
                    int a6 = C16687kx.m54816a(kmVar, 90);
                    int length6 = this.f46260j == null ? 0 : this.f46260j.length;
                    C16505en[] enVarArr4 = new C16505en[(a6 + length6)];
                    if (length6 != 0) {
                        System.arraycopy(this.f46260j, 0, enVarArr4, 0, length6);
                    }
                    while (length6 < enVarArr4.length - 1) {
                        enVarArr4[length6] = new C16505en();
                        kmVar.mo43115a((C16684ku) enVarArr4[length6]);
                        kmVar.mo43113a();
                        length6++;
                    }
                    enVarArr4[length6] = new C16505en();
                    kmVar.mo43115a((C16684ku) enVarArr4[length6]);
                    this.f46260j = enVarArr4;
                    break;
                case 96:
                    this.f46259i = kmVar.mo43121b();
                    break;
                default:
                    if (super.mo43146a(kmVar, a)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append(d);
        sb2.append(" is not a valid enum Type");
        throw new IllegalArgumentException(sb2.toString());
    }
}
