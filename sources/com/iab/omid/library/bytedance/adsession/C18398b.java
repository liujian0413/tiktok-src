package com.iab.omid.library.bytedance.adsession;

import android.view.View;
import com.iab.omid.library.bytedance.p791d.C18426d;

/* renamed from: com.iab.omid.library.bytedance.adsession.b */
public abstract class C18398b {
    /* renamed from: a */
    public static C18398b m60546a(C18399c cVar, C18400d dVar) {
        C18426d.m60666a();
        C18426d.m60669a((Object) cVar, "AdSessionConfiguration is null");
        C18426d.m60669a((Object) dVar, "AdSessionContext is null");
        return new C18403g(cVar, dVar);
    }

    /* renamed from: a */
    public abstract void mo47802a();

    /* renamed from: a */
    public abstract void mo47803a(View view);

    /* renamed from: b */
    public abstract void mo47804b();

    /* renamed from: b */
    public abstract void mo47805b(View view);
}
