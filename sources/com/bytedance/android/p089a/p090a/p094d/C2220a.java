package com.bytedance.android.p089a.p090a.p094d;

import android.util.SparseArray;
import com.bytedance.android.p089a.p090a.p095e.C2222b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.a.a.d.a */
public final class C2220a {
    /* renamed from: a */
    public static String m9572a(int i) {
        switch (i) {
            case 0:
                return "show";
            case 1:
                return "play";
            case 2:
                return "click";
            case 4:
                return "play_valid";
            case 5:
                return "play_over";
            case 6:
                return "play_25";
            case 7:
                return "play_50";
            case 8:
                return "play_75";
            case 9:
                return "cpv_6s";
            case 10:
                return "cpv_15s";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static List<C2222b> m9573a(List<C2222b> list) {
        if (list == null || list.size() <= 1) {
            return list;
        }
        SparseArray sparseArray = new SparseArray(list.size());
        for (C2222b bVar : list) {
            if (bVar != null) {
                int i = bVar.f7472j;
                List list2 = (List) sparseArray.get(i);
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(bVar);
                sparseArray.put(i, list2);
            }
        }
        int[] iArr = {0, 1, 2, 6, 7, 8, 9, 10, 4, 5};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 10; i2++) {
            List list3 = (List) sparseArray.get(iArr[i2]);
            if (list3 != null) {
                arrayList.addAll(list3);
            }
        }
        return arrayList;
    }
}
