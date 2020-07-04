package com.p280ss.android.ugc.aweme.unlogin;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.main.C32982di;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.unlogin.c */
public final class C42758c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f111088a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42758c.class), "sp", "getSp()Lcom/ss/android/ugc/aweme/main/SafeMainTabPreferences;"))};

    /* renamed from: b */
    public static final C42758c f111089b = new C42758c();

    /* renamed from: c */
    private static final C7541d f111090c = C7546e.m23569a(C42759a.f111091a);

    /* renamed from: com.ss.android.ugc.aweme.unlogin.c$a */
    static final class C42759a extends Lambda implements C7561a<C32982di> {

        /* renamed from: a */
        public static final C42759a f111091a = new C42759a();

        C42759a() {
            super(0);
        }

        /* renamed from: a */
        private static C32982di m135707a() {
            return new C32982di();
        }

        public final /* synthetic */ Object invoke() {
            return m135707a();
        }
    }

    private C42758c() {
    }

    /* renamed from: c */
    private C32982di m135702c() {
        return (C32982di) f111090c.getValue();
    }

    /* renamed from: b */
    public final String mo104371b() {
        return m135702c().mo84685b();
    }

    /* renamed from: a */
    public final List<String> mo104368a() {
        return C7634n.m23768b(m135702c().mo84685b(), new String[]{","}, false, 0);
    }

    /* renamed from: a */
    public final void mo104369a(ContentLanguage contentLanguage) {
        C7573i.m23587b(contentLanguage, "contentLanguage");
        Iterable b = C7634n.m23768b(m135702c().mo84685b(), new String[]{","}, false, 0);
        Collection arrayList = new ArrayList();
        for (Object next : b) {
            if (!TextUtils.isEmpty((String) next)) {
                arrayList.add(next);
            }
        }
        List d = C7525m.m23509d((Collection<? extends T>) (List) arrayList);
        String languageCode = contentLanguage.getLanguageCode();
        C7573i.m23582a((Object) languageCode, "contentLanguage.languageCode");
        if (!m135701a(d, languageCode, false)) {
            String languageCode2 = contentLanguage.getLanguageCode();
            C7573i.m23582a((Object) languageCode2, "contentLanguage.languageCode");
            d.add(languageCode2);
            m135702c().mo84682a(C7525m.m23492a(d, ",", null, null, 0, null, null, 62, null));
        }
    }

    /* renamed from: a */
    public final void mo104370a(String str) {
        C7573i.m23587b(str, "code");
        List d = C7525m.m23509d((Collection<? extends T>) C7634n.m23768b(m135702c().mo84685b(), new String[]{","}, false, 0));
        if (m135701a(d, str, true)) {
            m135702c().mo84682a(C7525m.m23492a(d, ",", null, null, 0, null, null, 62, null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static boolean m135701a(List<String> list, String str, boolean z) {
        C7573i.m23587b(list, "list");
        C7573i.m23587b(str, "code");
        boolean z2 = false;
        if (C6307b.m19566a((Collection<T>) list)) {
            return false;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            String str2 = (String) list.get(size);
            if (TextUtils.equals(str2, "zh-hant")) {
                list.set(size, "zh-Hant");
            }
            if (C7634n.m23717a(str2, str, true)) {
                if (z) {
                    list.remove(str2);
                }
                z2 = true;
            }
        }
        return z2;
    }
}
