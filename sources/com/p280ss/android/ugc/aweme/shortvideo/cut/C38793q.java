package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import kotlin.text.Regex;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.q */
public final class C38793q {

    /* renamed from: a */
    public static final C38794a f100815a = new C38794a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.q$a */
    public static final class C38794a {
        private C38794a() {
        }

        /* renamed from: b */
        private static boolean m123911b() {
            if (C35563c.f93230L.mo93343b(Property.Enable1080pFastImport) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final String mo96930a() {
            String e = C35563c.f93231M.mo93309e(AVAB.Property.FastImportResolutionLimit);
            C7573i.m23582a((Object) e, "resolution");
            if (!m123910a(e)) {
                e = "720*1280";
            }
            if (!C7634n.m23721b(e, "1080*", false) || m123911b()) {
                return e;
            }
            return "720*1280";
        }

        public /* synthetic */ C38794a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static boolean m123910a(String str) {
            C7573i.m23587b(str, "resolution");
            CharSequence charSequence = str;
            if (TextUtils.isEmpty(charSequence)) {
                return false;
            }
            return new Regex("[0-9]+\\*[0-9]*").matches(charSequence);
        }
    }

    /* renamed from: a */
    public static final String m123909a() {
        return f100815a.mo96930a();
    }
}
