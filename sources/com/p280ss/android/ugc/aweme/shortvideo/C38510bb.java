package com.p280ss.android.ugc.aweme.shortvideo;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bb */
public final class C38510bb {

    /* renamed from: a */
    private HashMap<String, Object> f100111a = new HashMap<>();

    /* renamed from: a */
    public static C38510bb m123095a() {
        return new C38510bb();
    }

    /* renamed from: b */
    public final synchronized JSONObject mo96482b() {
        try {
        } catch (Exception unused) {
            return null;
        }
        return new JSONObject(this.f100111a);
    }

    /* renamed from: a */
    public static C38510bb m123096a(SynthetiseResult synthetiseResult) {
        if (synthetiseResult == null) {
            return new C38510bb();
        }
        return new C38510bb().mo96477a("is_fast_import", Boolean.valueOf(synthetiseResult.isFastImport)).mo96481a("support_max_resolution", synthetiseResult.fastImportResolution).mo96477a("is_new_framework", Boolean.valueOf(synthetiseResult.isNewFramework)).mo96477a("has_subtitle", Boolean.valueOf(synthetiseResult.hasSubtitle)).mo96479a("segment_count", Integer.valueOf(synthetiseResult.segmentCount));
    }

    /* renamed from: a */
    public final C38510bb mo96477a(String str, Boolean bool) {
        this.f100111a.put(str, bool);
        return this;
    }

    /* renamed from: a */
    public final C38510bb mo96478a(String str, Float f) {
        this.f100111a.put(str, f);
        return this;
    }

    /* renamed from: a */
    public final C38510bb mo96479a(String str, Integer num) {
        this.f100111a.put(str, num);
        return this;
    }

    /* renamed from: a */
    public final C38510bb mo96480a(String str, Long l) {
        this.f100111a.put(str, l);
        return this;
    }

    /* renamed from: a */
    public final C38510bb mo96481a(String str, String str2) {
        this.f100111a.put(str, str2);
        return this;
    }
}
