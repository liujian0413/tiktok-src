package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.keva.Keva;
import java.util.HashSet;
import java.util.Set;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bw */
public final class C25298bw {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f66654a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25298bw.class), "KEVA", "getKEVA()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C25298bw f66655b = new C25298bw();

    /* renamed from: c */
    private static final String f66656c = f66656c;

    /* renamed from: d */
    private static final C7541d f66657d = C7546e.m23569a(C25299a.f66660a);

    /* renamed from: e */
    private static boolean f66658e = true;

    /* renamed from: f */
    private static String f66659f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bw$a */
    static final class C25299a extends Lambda implements C7561a<Keva> {

        /* renamed from: a */
        public static final C25299a f66660a = new C25299a();

        C25299a() {
            super(0);
        }

        /* renamed from: a */
        private static Keva m83122a() {
            return Keva.getRepo("undisplay_ad_keva_name");
        }

        public final /* synthetic */ Object invoke() {
            return m83122a();
        }
    }

    private C25298bw() {
    }

    /* renamed from: a */
    private final Keva m83120a() {
        return (Keva) f66657d.getValue();
    }

    /* renamed from: a */
    public final String mo65893a(Set<Long> set) {
        boolean z;
        C7573i.m23587b(set, "discardCidSet");
        HashSet<Long> hashSet = new HashSet<>(set);
        StringBuilder sb = new StringBuilder();
        for (Long l : hashSet) {
            C7573i.m23582a((Object) l, "it");
            sb.append(l.longValue());
            sb.append(",");
        }
        CharSequence charSequence = sb;
        if (charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.deleteCharAt(C7634n.m23780f(charSequence));
        }
        f66659f = sb.toString();
        m83120a().storeString(f66656c, f66659f);
        return f66659f;
    }
}
