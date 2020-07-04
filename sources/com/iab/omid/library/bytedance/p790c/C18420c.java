package com.iab.omid.library.bytedance.p790c;

import android.view.View;
import com.iab.omid.library.bytedance.adsession.C18403g;
import com.iab.omid.library.bytedance.p789b.C18407a;
import com.iab.omid.library.bytedance.p790c.C18417a.C18418a;
import com.iab.omid.library.bytedance.p791d.C18423b;
import com.iab.omid.library.bytedance.p791d.C18427e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.c.c */
public final class C18420c implements C18417a {

    /* renamed from: a */
    private final C18417a f49961a;

    public C18420c(C18417a aVar) {
        this.f49961a = aVar;
    }

    /* renamed from: a */
    private static ArrayList<View> m60639a() {
        ArrayList<View> arrayList = new ArrayList<>();
        C18407a a = C18407a.m60593a();
        if (a != null) {
            Collection<C18403g> c = a.mo47835c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C18403g f : c) {
                View f2 = f.mo47813f();
                if (f2 != null && C18427e.m60679b(f2)) {
                    View rootView = f2.getRootView();
                    if (rootView != null && !identityHashMap.containsKey(rootView)) {
                        identityHashMap.put(rootView, rootView);
                        float a2 = C18427e.m60678a(rootView);
                        int size = arrayList.size();
                        while (size > 0 && C18427e.m60678a((View) arrayList.get(size - 1)) > a2) {
                            size--;
                        }
                        arrayList.add(size, rootView);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final JSONObject mo47857a(View view) {
        return C18423b.m60651a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public final void mo47858a(View view, JSONObject jSONObject, C18418a aVar, boolean z) {
        Iterator it = m60639a().iterator();
        while (it.hasNext()) {
            aVar.mo47859a((View) it.next(), this.f49961a, jSONObject);
        }
    }
}
