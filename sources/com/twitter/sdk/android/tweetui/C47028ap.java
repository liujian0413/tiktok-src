package com.twitter.sdk.android.tweetui;

import android.text.TextUtils;
import com.twitter.sdk.android.core.models.C46959o;
import com.twitter.sdk.android.core.models.HashtagEntity;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.MentionEntity;
import com.twitter.sdk.android.core.models.SymbolEntity;
import com.twitter.sdk.android.core.models.UrlEntity;
import com.twitter.sdk.android.tweetui.internal.p1847a.C47061a;
import com.twitter.sdk.android.tweetui.internal.p1847a.C47061a.C47065d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.twitter.sdk.android.tweetui.ap */
final class C47028ap {
    /* renamed from: a */
    static C47084k m147034a(C46959o oVar) {
        if (oVar == null) {
            return null;
        }
        C47084k kVar = new C47084k();
        m147035a(kVar, oVar);
        m147038b(kVar, oVar);
        return kVar;
    }

    /* renamed from: b */
    private static void m147039b(List<? extends C47085l> list, List<Integer> list2) {
        if (list != null) {
            for (C47085l lVar : list) {
                int i = lVar.f120828c;
                int i2 = 0;
                Iterator it = list2.iterator();
                while (it.hasNext() && ((Integer) it.next()).intValue() - i2 <= i) {
                    i2++;
                }
                lVar.f120828c += i2;
                lVar.f120829d += i2;
            }
        }
    }

    /* renamed from: a */
    private static void m147036a(StringBuilder sb, C47084k kVar) {
        ArrayList arrayList = new ArrayList();
        int length = sb.length() - 1;
        for (int i = 0; i < length; i++) {
            if (Character.isHighSurrogate(sb.charAt(i)) && Character.isLowSurrogate(sb.charAt(i + 1))) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        m147039b(kVar.f120823b, (List<Integer>) arrayList);
        m147039b(kVar.f120824c, (List<Integer>) arrayList);
        m147039b(kVar.f120825d, (List<Integer>) arrayList);
        m147039b(kVar.f120826e, (List<Integer>) arrayList);
        m147039b(kVar.f120827f, (List<Integer>) arrayList);
    }

    /* renamed from: b */
    private static void m147038b(C47084k kVar, C46959o oVar) {
        if (!TextUtils.isEmpty(oVar.f120419A)) {
            C47065d a = C47061a.f120774a.mo118330a(oVar.f120419A);
            StringBuilder sb = new StringBuilder(a.f120781a);
            m147037a(kVar.f120823b, (List<int[]>) a.f120782b);
            m147037a(kVar.f120824c, (List<int[]>) a.f120782b);
            m147037a(kVar.f120825d, (List<int[]>) a.f120782b);
            m147037a(kVar.f120826e, (List<int[]>) a.f120782b);
            m147037a(kVar.f120827f, (List<int[]>) a.f120782b);
            m147036a(sb, kVar);
            kVar.f120822a = sb.toString();
        }
    }

    /* renamed from: a */
    private static void m147035a(C47084k kVar, C46959o oVar) {
        if (oVar.f120430d != null) {
            List<UrlEntity> list = oVar.f120430d.f120488b;
            if (list != null) {
                for (UrlEntity a : list) {
                    kVar.f120823b.add(C47085l.m147208a(a));
                }
            }
            List<MediaEntity> list2 = oVar.f120430d.f120490d;
            if (list2 != null) {
                for (MediaEntity jVar : list2) {
                    kVar.f120824c.add(new C47083j(jVar));
                }
            }
            List<HashtagEntity> list3 = oVar.f120430d.f120491e;
            if (list3 != null) {
                for (HashtagEntity a2 : list3) {
                    kVar.f120825d.add(C47085l.m147205a(a2));
                }
            }
            List<MentionEntity> list4 = oVar.f120430d.f120489c;
            if (list4 != null) {
                for (MentionEntity a3 : list4) {
                    kVar.f120826e.add(C47085l.m147206a(a3));
                }
            }
            List<SymbolEntity> list5 = oVar.f120430d.f120492f;
            if (list5 != null) {
                for (SymbolEntity a4 : list5) {
                    kVar.f120827f.add(C47085l.m147207a(a4));
                }
            }
        }
    }

    /* renamed from: a */
    private static void m147037a(List<? extends C47085l> list, List<int[]> list2) {
        if (list != null && list2 != null && !list2.isEmpty()) {
            int size = list2.size();
            int i = 0;
            int i2 = 0;
            for (C47085l lVar : list) {
                int i3 = i;
                int i4 = 0;
                while (i < size) {
                    int[] iArr = (int[]) list2.get(i);
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    int i7 = i6 - i5;
                    if (i6 < lVar.f120828c) {
                        i2 += i7;
                        i3++;
                    } else if (i6 < lVar.f120829d) {
                        i4 += i7;
                    }
                    i++;
                }
                int i8 = i4 + i2;
                lVar.f120828c -= i8;
                lVar.f120829d -= i8;
                i = i3;
            }
        }
    }
}
