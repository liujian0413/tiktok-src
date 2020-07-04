package com.p280ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.property.ABAndSettingViewModel */
public final class ABAndSettingViewModel extends C0063u {

    /* renamed from: a */
    public final C0052o<String> f96762a = new C0052o<>();

    /* renamed from: b */
    public final C0052o<Language> f96763b = new C0052o<>();

    /* renamed from: c */
    public final C0052o<Integer> f96764c = new C0052o<>();

    /* renamed from: d */
    public final C0052o<Integer> f96765d = new C0052o<>();

    /* renamed from: e */
    public C36969j f96766e;

    /* renamed from: f */
    public C36969j f96767f;

    /* renamed from: g */
    public final C0052o<C36969j> f96768g = new C0052o<>();

    /* renamed from: h */
    public final C0052o<C36969j> f96769h = new C0052o<>();

    /* renamed from: i */
    public final C0052o<String> f96770i = new C0052o<>();

    /* renamed from: j */
    public final C0052o<String> f96771j = new C0052o<>();

    /* renamed from: a */
    public final C36969j mo93289a() {
        C36969j jVar = this.f96766e;
        if (jVar == null) {
            C7573i.m23583a("allAbItemsData");
        }
        return jVar;
    }

    /* renamed from: b */
    public final C36969j mo93291b() {
        C36969j jVar = this.f96767f;
        if (jVar == null) {
            C7573i.m23583a("allSettingItemsData");
        }
        return jVar;
    }

    /* renamed from: a */
    public final void mo93290a(C36969j jVar) {
        C7573i.m23587b(jVar, "<set-?>");
        this.f96766e = jVar;
    }

    /* renamed from: b */
    public final void mo93292b(C36969j jVar) {
        C7573i.m23587b(jVar, "<set-?>");
        this.f96767f = jVar;
    }
}
