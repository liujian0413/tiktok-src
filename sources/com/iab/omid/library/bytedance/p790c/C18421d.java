package com.iab.omid.library.bytedance.p790c;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.bytedance.p790c.C18417a.C18418a;
import com.iab.omid.library.bytedance.p791d.C18423b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.c.d */
public final class C18421d implements C18417a {

    /* renamed from: a */
    private final int[] f49962a = new int[2];

    /* renamed from: a */
    private void m60642a(ViewGroup viewGroup, JSONObject jSONObject, C18418a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo47859a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m60643b(ViewGroup viewGroup, JSONObject jSONObject, C18418a aVar) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.mo47859a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo47857a(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f49962a);
        return C18423b.m60651a(this.f49962a[0], this.f49962a[1], width, height);
    }

    /* renamed from: a */
    public final void mo47858a(View view, JSONObject jSONObject, C18418a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || VERSION.SDK_INT < 21) {
                m60642a(viewGroup, jSONObject, aVar);
            } else {
                m60643b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
