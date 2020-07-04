package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.bn */
public final class C14809bn {
    /* renamed from: a */
    public static Object[] m42978a(String str, zzyv zzyv, String str2, int i, zzyz zzyz) {
        HashSet hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add(null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzyv.f45778b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m42977a(zzyv.f45779c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzyv.f45780d));
        }
        if (hashSet.contains("keywords")) {
            if (zzyv.f45781e != null) {
                arrayList.add(zzyv.f45781e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzyv.f45782f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzyv.f45783g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzyv.f45784h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzyv.f45785i);
        }
        if (hashSet.contains("location")) {
            if (zzyv.f45787k != null) {
                arrayList.add(zzyv.f45787k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzyv.f45788l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m42977a(zzyv.f45789m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m42977a(zzyv.f45790n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzyv.f45791o != null) {
                arrayList.add(zzyv.f45791o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzyv.f45792p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzyv.f45793q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzyv.f45794r));
        }
        return arrayList.toArray();
    }

    /* renamed from: a */
    private static String m42977a(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else if (obj instanceof Bundle) {
                str = m42977a((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
