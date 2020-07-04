package com.p280ss.android.ugc.aweme.language;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.language.a */
public final class C7119a {

    /* renamed from: a */
    public static final C7119a f20001a = new C7119a();

    /* renamed from: b */
    private static boolean f20002b;

    /* renamed from: c */
    private static boolean f20003c;

    private C7119a() {
    }

    /* renamed from: a */
    public static boolean m22233a() {
        if (!f20002b) {
            try {
                f20003c = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).isArabicLang(C6399b.m19921a());
                f20002b = true;
            } catch (Throwable unused) {
            }
        }
        return f20003c;
    }
}
