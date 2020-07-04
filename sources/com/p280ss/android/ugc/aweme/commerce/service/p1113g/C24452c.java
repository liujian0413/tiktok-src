package com.p280ss.android.ugc.aweme.commerce.service.p1113g;

import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p578c.C11014a;
import com.p280ss.android.vesdk.C45323k;
import java.util.Arrays;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.g.c */
public final class C24452c {

    /* renamed from: a */
    public static final C24453a f64503a = new C24453a(null);

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.g.c$a */
    public static final class C24453a {
        private C24453a() {
        }

        public /* synthetic */ C24453a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m80378a(long j) {
            if (!C6399b.m19944t()) {
                String a = C11014a.m32278a(j, "w");
                C7573i.m23582a((Object) a, "IESUIUtils.getDisplayCount(count, \"w\")");
                return a;
            } else if (j <= 1000) {
                return String.valueOf(j);
            } else {
                Locale locale = Locale.getDefault();
                C7573i.m23582a((Object) locale, "Locale.getDefault()");
                double d = (double) j;
                Double.isNaN(d);
                String a2 = C1642a.m8035a(locale, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf((d * 1.0d) / 1000.0d)}, 1));
                C7573i.m23582a((Object) a2, "java.lang.String.format(locale, format, *args)");
                if ('0' == a2.charAt(a2.length() - 1)) {
                    StringBuilder sb = new StringBuilder();
                    int length = a2.length() - 2;
                    if (a2 != null) {
                        String substring = a2.substring(0, length);
                        C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append(C45323k.f116730a);
                        return sb.toString();
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a2);
                sb2.append(C45323k.f116730a);
                return sb2.toString();
            }
        }
    }
}
