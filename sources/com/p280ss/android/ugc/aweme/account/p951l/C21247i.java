package com.p280ss.android.ugc.aweme.account.p951l;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.WhatsAppCodeItem;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.account.l.i */
public final class C21247i {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f57070a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21247i.class), "WHATSAPP_CODE_SETTINGS", "getWHATSAPP_CODE_SETTINGS()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C21247i f57071b = new C21247i();

    /* renamed from: c */
    private static final Set<String> f57072c = new LinkedHashSet();

    /* renamed from: d */
    private static final C7541d f57073d = C7546e.m23569a(C21248a.f57074a);

    /* renamed from: com.ss.android.ugc.aweme.account.l.i$a */
    static final class C21248a extends Lambda implements C7561a<List<WhatsAppCodeItem>> {

        /* renamed from: a */
        public static final C21248a f57074a = new C21248a();

        C21248a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m71512a();
        }

        /* renamed from: a */
        private static List<WhatsAppCodeItem> m71512a() {
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                List showWhatsappByCallingCode = a.getShowWhatsappByCallingCode();
                C7573i.m23582a((Object) showWhatsappByCallingCode, "it");
                if (!showWhatsappByCallingCode.isEmpty()) {
                    return showWhatsappByCallingCode;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private C21247i() {
    }

    /* renamed from: a */
    private final List<WhatsAppCodeItem> m71505a() {
        return (List) f57073d.getValue();
    }

    /* renamed from: c */
    public static final void m71508c(String str) {
        C7573i.m23587b(str, "phone");
        f57072c.add(str);
    }

    /* renamed from: d */
    public static final void m71509d(String str) {
        C7573i.m23587b(str, "phone");
        f57072c.remove(str);
    }

    /* renamed from: e */
    public static final boolean m71510e(String str) {
        C7573i.m23587b(str, "phone");
        return f57072c.contains(str);
    }

    /* renamed from: a */
    public static final boolean m71506a(String str) {
        if (f57071b.m71511f(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m71507b(String str) {
        try {
            WhatsAppCodeItem f = f57071b.m71511f(str);
            if (f == null) {
                return true;
            }
            Boolean whatsappFirst = f.getWhatsappFirst();
            if (whatsappFirst != null) {
                return whatsappFirst.booleanValue();
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: f */
    private final WhatsAppCodeItem m71511f(String str) {
        WhatsAppCodeItem whatsAppCodeItem = null;
        if (str == null) {
            return null;
        }
        List a = m71505a();
        if (a != null) {
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                boolean z = false;
                try {
                    String callingCode = ((WhatsAppCodeItem) next).getCallingCode();
                    C7573i.m23582a((Object) callingCode, "it.callingCode");
                    if (callingCode != null) {
                        String a2 = C7634n.m23711a(C7634n.m23762b(callingCode).toString(), "+", "", false);
                        String a3 = C7634n.m23711a(C7634n.m23762b(str).toString(), "+", "", false);
                        if (TextUtils.isEmpty(a2)) {
                            continue;
                        } else {
                            z = TextUtils.equals(a2, a3);
                            continue;
                        }
                        if (z) {
                            whatsAppCodeItem = next;
                            break;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } catch (Exception unused) {
                }
            }
            whatsAppCodeItem = whatsAppCodeItem;
        }
        return whatsAppCodeItem;
    }
}
