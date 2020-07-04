package com.p280ss.android.ugc.aweme.utils;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;

/* renamed from: com.ss.android.ugc.aweme.utils.n */
public final class C43147n {

    /* renamed from: a */
    public static final C43147n f111772a = new C43147n();

    private C43147n() {
    }

    /* renamed from: a */
    public static List<String> m136854a(JSONArray jSONArray) {
        Integer num;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                num = Integer.valueOf(jSONArray.length());
            } catch (Exception unused) {
            }
        } else {
            num = null;
        }
        int i = 0;
        if (num == null) {
            C7573i.m23580a();
        }
        int intValue = num.intValue();
        if (intValue >= 0) {
            while (true) {
                arrayList.add(jSONArray.getString(i));
                if (i == intValue) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }
}
