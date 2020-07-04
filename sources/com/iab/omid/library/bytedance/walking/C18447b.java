package com.iab.omid.library.bytedance.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.bytedance.adsession.C18403g;
import com.iab.omid.library.bytedance.p789b.C18407a;
import com.iab.omid.library.bytedance.p791d.C18427e;
import com.iab.omid.library.bytedance.p792e.C18428a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.bytedance.walking.b */
public final class C18447b {

    /* renamed from: a */
    public final HashSet<String> f50003a = new HashSet<>();

    /* renamed from: b */
    public final HashSet<String> f50004b = new HashSet<>();

    /* renamed from: c */
    private final HashMap<View, String> f50005c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<View, ArrayList<String>> f50006d = new HashMap<>();

    /* renamed from: e */
    private final HashSet<View> f50007e = new HashSet<>();

    /* renamed from: f */
    private boolean f50008f;

    /* renamed from: a */
    private void m60737a(View view, C18403g gVar) {
        ArrayList arrayList = (ArrayList) this.f50006d.get(view);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f50006d.put(view, arrayList);
        }
        arrayList.add(gVar.mo47812e());
    }

    /* renamed from: a */
    private void m60738a(C18403g gVar) {
        for (C18428a aVar : gVar.f49923a) {
            View view = (View) aVar.get();
            if (view != null) {
                m60737a(view, gVar);
            }
        }
    }

    /* renamed from: d */
    private boolean m60739d(View view) {
        if (!view.hasWindowFocus()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            if (!C18427e.m60680c(view)) {
                return false;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f50007e.addAll(hashSet);
        return true;
    }

    /* renamed from: a */
    public final String mo47891a(View view) {
        if (this.f50005c.size() == 0) {
            return null;
        }
        String str = (String) this.f50005c.get(view);
        if (str != null) {
            this.f50005c.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public final void mo47892a() {
        C18407a a = C18407a.m60593a();
        if (a != null) {
            for (C18403g gVar : a.mo47835c()) {
                View f = gVar.mo47813f();
                if (gVar.mo47814g()) {
                    if (f == null || !m60739d(f)) {
                        this.f50004b.add(gVar.mo47812e());
                    } else {
                        this.f50003a.add(gVar.mo47812e());
                        this.f50005c.put(f, gVar.mo47812e());
                        m60738a(gVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final ArrayList<String> mo47893b(View view) {
        if (this.f50006d.size() == 0) {
            return null;
        }
        ArrayList<String> arrayList = (ArrayList) this.f50006d.get(view);
        if (arrayList != null) {
            this.f50006d.remove(view);
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo47894b() {
        this.f50005c.clear();
        this.f50006d.clear();
        this.f50007e.clear();
        this.f50003a.clear();
        this.f50004b.clear();
        this.f50008f = false;
    }

    /* renamed from: c */
    public final C18448c mo47895c(View view) {
        return this.f50007e.contains(view) ? C18448c.PARENT_VIEW : this.f50008f ? C18448c.OBSTRUCTION_VIEW : C18448c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public final void mo47896c() {
        this.f50008f = true;
    }
}
