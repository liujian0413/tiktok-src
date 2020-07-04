package com.p280ss.android.ugc.playerkit.p1751b;

import android.support.p022v4.util.C0894f;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.playerkit.session.C44925a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.playerkit.b.b */
public final class C44913b {

    /* renamed from: a */
    public static final boolean f115490a = C7163a.m22363a();

    /* renamed from: b */
    public static volatile String f115491b;

    /* renamed from: c */
    private static volatile C0894f<String, List<C44914a>> f115492c = new C0894f<>(4);

    /* renamed from: d */
    private static C44912a f115493d;

    /* renamed from: com.ss.android.ugc.playerkit.b.b$a */
    public static class C44914a {

        /* renamed from: a */
        int f115494a;

        /* renamed from: b */
        String f115495b;

        public final int hashCode() {
            return this.f115494a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (this.f115494a == ((C44914a) obj).f115494a) {
                return true;
            }
            return false;
        }

        C44914a(int i, String str) {
            this.f115494a = i;
            this.f115495b = str;
        }
    }

    /* renamed from: a */
    public static void m141675a(C44912a aVar) {
        f115493d = aVar;
    }

    /* renamed from: a */
    public static void m141676a(String str) {
        if (!TextUtils.isEmpty(str) && ((List) f115492c.mo3341a(str)) == null) {
            f115492c.mo3342a(str, new CopyOnWriteArrayList());
        }
    }

    /* renamed from: b */
    public static String m141680b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        List list = (List) f115492c.mo3341a(str);
        if (list == null || list.isEmpty()) {
            return "";
        }
        C44914a[] aVarArr = (C44914a[]) list.toArray(new C44914a[list.size()]);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < aVarArr.length - 1; i++) {
                jSONArray.put(aVarArr[i].f115494a);
                sb.append(aVarArr[i].f115495b);
                sb.append(",");
            }
            jSONArray.put(aVarArr[aVarArr.length - 1].f115494a);
            sb.append(aVarArr[aVarArr.length - 1].f115495b);
            sb.append("]");
            list.clear();
            jSONObject.put("codes", jSONArray);
            jSONObject.put("extra", sb.toString());
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static void m141678a(String str, String str2) {
        m141679a(str, str2, C44925a.m141730a().mo107407b().uri);
    }

    /* renamed from: a */
    public static void m141677a(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            List list = (List) f115492c.mo3341a(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                f115492c.mo3342a(str, list);
            }
            if (list.size() < 16) {
                C44914a aVar = new C44914a(i, str2);
                if (!list.contains(aVar)) {
                    list.add(aVar);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m141679a(String str, String str2, String str3) {
        if (f115493d != null) {
            f115493d.mo56935a(str, str2, str3);
        }
    }
}
