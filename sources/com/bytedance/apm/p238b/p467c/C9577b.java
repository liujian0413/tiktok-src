package com.bytedance.apm.p238b.p467c;

import android.text.TextUtils;
import com.bytedance.apm.p238b.p466b.C9571a;
import com.bytedance.apm.p245h.C9603b;
import com.bytedance.apm.util.C9650n;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.apm.b.c.b */
public abstract class C9577b implements C9586i {

    /* renamed from: a */
    private String f26187a;

    /* renamed from: b */
    private int f26188b;

    /* renamed from: c */
    private boolean f26189c;

    /* renamed from: d */
    private Set<String> f26190d = new HashSet(4);

    /* renamed from: b */
    public final void mo23898b() {
        this.f26189c = false;
    }

    /* renamed from: c */
    public final void mo23899c() {
        this.f26189c = true;
    }

    /* renamed from: d */
    public final void mo23900d() {
        if (this.f26188b > 0 && !this.f26189c) {
            mo23883a();
        }
    }

    /* renamed from: a */
    private void mo23883a() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f26189c;
        String str = this.f26187a;
        if (this.f26188b > 0) {
            z = true;
        } else {
            z = false;
        }
        C9603b bVar = new C9603b(z2, currentTimeMillis, str, z);
        C9571a.m28319a().mo23885a(bVar);
    }

    public C9577b(String str) {
        this.f26187a = str;
    }

    /* renamed from: b */
    public final void mo23903b(String str) {
        if (this.f26188b > 0) {
            this.f26188b--;
            if (!TextUtils.isEmpty(str)) {
                this.f26190d.remove(str);
            }
            if (this.f26188b == 0) {
                mo23883a();
            }
        }
    }

    /* renamed from: a */
    public final void mo23902a(String str) {
        this.f26188b++;
        if (!TextUtils.isEmpty(str)) {
            this.f26190d.add(str);
        }
        if (this.f26188b == 1) {
            mo23883a();
        }
    }

    /* renamed from: b */
    private static C9650n<Long, Long> m28342b(List<C9603b> list, int i, int i2) {
        long j;
        long j2;
        C9603b bVar = (C9603b) list.get(i);
        C9603b bVar2 = (C9603b) list.get(i2);
        long j3 = 0;
        if (bVar.f26257b && bVar2.f26257b) {
            j2 = bVar2.f26258c - bVar.f26258c;
        } else if (!bVar.mo23950a() || !bVar2.mo23950a()) {
            if (bVar.f26257b && bVar2.mo23950a()) {
                while (true) {
                    if (i > i2) {
                        break;
                    }
                    C9603b bVar3 = (C9603b) list.get(i);
                    if (bVar3.mo23950a()) {
                        j3 = bVar3.f26258c - bVar.f26258c;
                        j = bVar2.f26258c - bVar3.f26258c;
                        break;
                    }
                    i++;
                }
            } else if (bVar.mo23950a() && bVar2.f26257b) {
                while (i <= i2) {
                    C9603b bVar4 = (C9603b) list.get(i);
                    if (bVar4.f26257b) {
                        j3 = bVar4.f26258c - bVar.f26258c;
                        j2 = bVar2.f26258c - bVar4.f26258c;
                    } else {
                        i++;
                    }
                }
            }
            j = 0;
            return new C9650n<>(Long.valueOf(j3), Long.valueOf(j));
        } else {
            j = bVar2.f26258c - bVar.f26258c;
            return new C9650n<>(Long.valueOf(j3), Long.valueOf(j));
        }
        long j4 = j2;
        j = j3;
        j3 = j4;
        return new C9650n<>(Long.valueOf(j3), Long.valueOf(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9650n<Long, Long> mo23901a(List<C9603b> list, int i, int i2) {
        new HashSet();
        CharSequence charSequence = null;
        long j = 0;
        long j2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i <= i2) {
            C9603b bVar = (C9603b) list.get(i);
            if (this.f26187a.equals(bVar.f26259d)) {
                String str = bVar.f26267l;
                if (charSequence != null && !TextUtils.equals(charSequence, str)) {
                    if (i3 >= 0 && i4 == -1) {
                        C9650n b = m28342b(list, i3, i2);
                        j += ((Long) b.f26366a).longValue();
                        j2 += ((Long) b.f26367b).longValue();
                    }
                    i3 = -1;
                    i4 = -1;
                }
                if (bVar.f26260e) {
                    i3 = i;
                } else if (bVar.mo23951b() && i > i3 && i3 >= 0) {
                    i4 = i;
                }
                if (i3 < 0 || i4 <= i3) {
                    charSequence = str;
                } else {
                    C9650n b2 = m28342b(list, i3, i4);
                    j += ((Long) b2.f26366a).longValue();
                    j2 += ((Long) b2.f26367b).longValue();
                    charSequence = str;
                    i3 = -1;
                    i4 = -1;
                }
            }
            i++;
        }
        if (i3 >= 0 && i4 == -1) {
            C9650n b3 = m28342b(list, i3, i2);
            j += ((Long) b3.f26366a).longValue();
            j2 += ((Long) b3.f26367b).longValue();
        }
        return new C9650n<>(Long.valueOf(j), Long.valueOf(j2));
    }
}
