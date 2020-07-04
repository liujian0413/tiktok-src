package com.bytedance.apm.p238b.p467c;

import android.text.TextUtils;
import com.bytedance.apm.p238b.p466b.C9575b;
import com.bytedance.apm.p245h.C9603b;
import com.bytedance.apm.util.C9640c;
import com.bytedance.apm.util.C9650n;
import java.util.List;

/* renamed from: com.bytedance.apm.b.c.e */
public final class C9581e extends C9578c {
    /* renamed from: e */
    private static String m28358e() {
        return "cpu_active_time";
    }

    public C9581e() {
        super("cpu_active_time");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo23904a() {
        long c = C9640c.m28522c();
        if (c <= 0) {
            return 0;
        }
        return c * 10;
    }

    /* renamed from: a */
    public final void mo23906a(C9575b bVar, List<C9603b> list, int i, int i2) {
        C9650n b = m28357b(bVar, list, i, i2);
        bVar.f26163e = ((Long) b.f26366a).longValue();
        bVar.f26168j = ((Long) b.f26367b).longValue();
    }

    /* renamed from: b */
    private C9650n<Long, Long> m28357b(C9575b bVar, List<C9603b> list, int i, int i2) {
        String str;
        List<C9603b> list2 = list;
        String e = m28358e();
        int i3 = i;
        CharSequence charSequence = null;
        long j = 0;
        int i4 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i5 = i2;
        while (i3 <= i5) {
            C9603b bVar2 = (C9603b) list2.get(i3);
            if (!TextUtils.equals(e, bVar2.f26259d) || bVar2.f26262g < 0) {
                str = e;
            } else {
                String str2 = bVar2.f26267l;
                if (charSequence != null && !TextUtils.equals(charSequence, str2)) {
                    if (j > 0) {
                        j2 += ((C9603b) list2.get(i4)).f26262g - j;
                    }
                    j = 0;
                    j4 = 0;
                    j5 = 0;
                }
                if (bVar2.mo23950a()) {
                    if (j == 0) {
                        j = bVar2.f26262g;
                        if (j4 > 0) {
                            long j6 = j - j4;
                            if (j6 > 0) {
                                j3 += j6;
                                j4 = 0;
                            }
                        }
                    }
                    str = e;
                    charSequence = str2;
                    i4 = i3;
                } else {
                    if (!bVar2.f26257b || j <= 0 || j5 != 0) {
                        str = e;
                    } else {
                        long j7 = bVar2.f26262g;
                        long j8 = j7 - j;
                        if (j8 > 0) {
                            j2 += j8;
                            str = e;
                            j = 0;
                            j7 = 0;
                        } else {
                            str = e;
                        }
                        j5 = j7;
                        j4 = bVar2.f26262g;
                    }
                    charSequence = str2;
                }
            }
            i3++;
            e = str;
            i5 = i2;
        }
        if (j > 0) {
            j2 += ((C9603b) list2.get(i4)).f26262g - j;
        }
        return new C9650n<>(Long.valueOf(j3), Long.valueOf(j2));
    }
}
