package com.p280ss.android.ugc.aweme.web;

import com.bytedance.ies.geckoclient.C10873f;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.web.c */
public final class C43440c {

    /* renamed from: a */
    public final HashMap<String, C10873f> f112514a = new HashMap<>();

    /* renamed from: b */
    public final Map<String, C10873f> f112515b = new LinkedHashMap();

    /* renamed from: b */
    public final C10873f mo105376b(String str) {
        C10873f fVar;
        C7573i.m23587b(str, "accessKey");
        synchronized (this.f112515b) {
            fVar = (C10873f) this.f112515b.get(str);
        }
        return fVar;
    }

    /* renamed from: a */
    public final C10873f mo105374a(String str) {
        boolean z;
        C10873f fVar;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        synchronized (this.f112514a) {
            fVar = (C10873f) this.f112514a.get(str);
        }
        return fVar;
    }

    /* renamed from: a */
    public final void mo105375a(String str, C10873f fVar) {
        C7573i.m23587b(str, "accessKey");
        synchronized (this.f112514a) {
            this.f112514a.put(str, fVar);
        }
    }

    /* renamed from: b */
    public final void mo105377b(String str, C10873f fVar) {
        C7573i.m23587b(str, "accessKey");
        C7573i.m23587b(fVar, "geckoClient");
        synchronized (this.f112515b) {
            this.f112515b.put(str, fVar);
        }
    }
}
