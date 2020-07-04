package com.iab.omid.library.bytedance.adsession;

import android.webkit.WebView;
import com.iab.omid.library.bytedance.p791d.C18426d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.iab.omid.library.bytedance.adsession.d */
public final class C18400d {

    /* renamed from: a */
    public final C18401e f49912a;

    /* renamed from: b */
    public final WebView f49913b;

    /* renamed from: c */
    public final String f49914c;

    /* renamed from: d */
    public final String f49915d;

    /* renamed from: e */
    public final AdSessionContextType f49916e;

    /* renamed from: f */
    private final List<C18402f> f49917f = new ArrayList();

    private C18400d(C18401e eVar, WebView webView, String str, List<C18402f> list, String str2) {
        AdSessionContextType adSessionContextType;
        this.f49912a = eVar;
        this.f49913b = null;
        this.f49914c = str;
        if (list != null) {
            this.f49917f.addAll(list);
            adSessionContextType = AdSessionContextType.NATIVE;
        } else {
            adSessionContextType = AdSessionContextType.HTML;
        }
        this.f49916e = adSessionContextType;
        this.f49915d = str2;
    }

    /* renamed from: a */
    public static C18400d m60555a(C18401e eVar, String str, List<C18402f> list, String str2) {
        C18426d.m60669a((Object) eVar, "Partner is null");
        C18426d.m60669a((Object) str, "OM SDK JS script content is null");
        C18426d.m60669a((Object) list, "VerificationScriptResources is null");
        C18400d dVar = new C18400d(eVar, null, str, list, null);
        return dVar;
    }

    /* renamed from: a */
    public final List<C18402f> mo47809a() {
        return Collections.unmodifiableList(this.f49917f);
    }
}
