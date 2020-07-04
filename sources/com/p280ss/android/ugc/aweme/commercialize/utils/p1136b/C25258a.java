package com.p280ss.android.ugc.aweme.commercialize.utils.p1136b;

import android.net.Uri;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a */
public final class C25258a {

    /* renamed from: a */
    public static final C25258a f66605a = new C25258a();

    /* renamed from: b */
    private static volatile C25260b f66606b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a$a */
    static final class C25259a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Uri f66607a;

        C25259a(Uri uri) {
            this.f66607a = uri;
        }

        /* renamed from: a */
        private void m83024a() {
            C25258a.m83023b(this.f66607a);
        }

        public final /* synthetic */ Object call() {
            m83024a();
            return C7581n.f20898a;
        }
    }

    private C25258a() {
    }

    /* renamed from: a */
    public static void m83021a(C25260b bVar) {
        f66606b = bVar;
    }

    /* renamed from: a */
    private static boolean m83022a(String str) {
        if (str == null || !C7634n.m23776c((CharSequence) str, (CharSequence) "__back_url__", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m83020a(Uri uri) {
        if (uri != null) {
            String uri2 = uri.toString();
            C7573i.m23582a((Object) uri2, "uri.toString()");
            if (C7634n.m23721b(uri2, "snssdk1233://adx", false)) {
                C1592h.m7853a((Callable<TResult>) new C25259a<TResult>(uri));
            }
        }
    }

    /* renamed from: b */
    public static void m83023b(Uri uri) {
        String str;
        boolean z;
        C25260b bVar = f66606b;
        f66606b = null;
        if (bVar != null) {
            String str2 = bVar.f66608a;
            boolean z2 = false;
            if (str2 != null) {
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = bVar.f66608a;
                    C24958f.m81905a().mo65266a(str).mo65276b("open_url_appback").mo65264a(Long.valueOf(bVar.f66609b)).mo65286h(bVar.f66610c).mo65275b(Long.valueOf(bVar.f66611d)).mo65278b();
                }
            }
            String queryParameter = uri.getQueryParameter("tag");
            if (queryParameter != null) {
                if (queryParameter.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    str = uri.getQueryParameter("tag");
                    C24958f.m81905a().mo65266a(str).mo65276b("open_url_appback").mo65264a(Long.valueOf(bVar.f66609b)).mo65286h(bVar.f66610c).mo65275b(Long.valueOf(bVar.f66611d)).mo65278b();
                }
            }
            str = "draw_ad";
            C24958f.m81905a().mo65266a(str).mo65276b("open_url_appback").mo65264a(Long.valueOf(bVar.f66609b)).mo65286h(bVar.f66610c).mo65275b(Long.valueOf(bVar.f66611d)).mo65278b();
        }
    }

    /* renamed from: a */
    public static final String m83019a(String str, String str2) {
        boolean z;
        if (!m83022a(str)) {
            return str;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = Uri.parse(str).buildUpon().appendQueryParameter("tag", str2).build().toString();
            }
        }
        String str3 = str;
        if (str3 == null) {
            return null;
        }
        String encode = Uri.encode("snssdk1233://adx");
        C7573i.m23582a((Object) encode, "Uri.encode(ADX_DEEP_LINK)");
        return C7634n.m23711a(str3, "__back_url__", encode, false);
    }
}
