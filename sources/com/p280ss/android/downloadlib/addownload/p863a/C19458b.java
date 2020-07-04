package com.p280ss.android.downloadlib.addownload.p863a;

import android.text.TextUtils;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.addownload.p864b.C19461a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.a.b */
final class C19458b {
    C19458b() {
    }

    /* renamed from: a */
    static CopyOnWriteArrayList<C19461a> m64014a(String str, String str2) {
        CopyOnWriteArrayList<C19461a> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        try {
            String string = C7285c.m22838a(C19491j.m64206a(), str, 0).getString(str2, "");
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    C19461a a = C19461a.m64027a(jSONObject.optJSONObject((String) keys.next()));
                    if (a != null) {
                        copyOnWriteArrayList.add(a);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: a */
    static void m64015a(String str, String str2, CopyOnWriteArrayList<C19461a> copyOnWriteArrayList) {
        if (copyOnWriteArrayList != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C19461a aVar = (C19461a) it.next();
                    if (aVar != null) {
                        jSONObject.put(String.valueOf(aVar.f52689b), aVar.mo51527b());
                    }
                }
            } catch (Exception unused) {
            }
            C7285c.m22838a(C19491j.m64206a(), str, 0).edit().putString(str2, jSONObject.toString()).apply();
        }
    }
}
