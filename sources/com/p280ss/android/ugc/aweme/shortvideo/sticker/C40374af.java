package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import com.bytedance.keva.Keva;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.af */
public final class C40374af {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f104958a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C40374af.class), "keva", "getKeva()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C40374af f104959b = new C40374af();

    /* renamed from: c */
    private static final C7541d f104960c = C7546e.m23569a(C40375a.f104961a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.af$a */
    static final class C40375a extends Lambda implements C7561a<Keva> {

        /* renamed from: a */
        public static final C40375a f104961a = new C40375a();

        C40375a() {
            super(0);
        }

        /* renamed from: a */
        private static Keva m129116a() {
            return Keva.getRepo("sticker_bind_music");
        }

        public final /* synthetic */ Object invoke() {
            return m129116a();
        }
    }

    private C40374af() {
    }

    /* renamed from: b */
    private final Keva m129115b() {
        return (Keva) f104960c.getValue();
    }

    /* renamed from: a */
    public static final void m129113a() {
        f104959b.m129115b().clear();
    }

    /* renamed from: a */
    public static final String m129112a(String str) {
        if (str == null) {
            return null;
        }
        return f104959b.m129115b().getString(str, null);
    }

    /* renamed from: a */
    public static final void m129114a(String str, String str2) {
        C7573i.m23587b(str, "musicId");
        C7573i.m23587b(str2, "musicPath");
        f104959b.m129115b().storeString(str, str2);
    }
}
