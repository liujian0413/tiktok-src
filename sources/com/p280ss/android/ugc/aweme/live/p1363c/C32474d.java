package com.p280ss.android.ugc.aweme.live.p1363c;

import android.content.Context;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.IPropertyCache;
import com.bytedance.android.livesdkapi.IPropertyCache.C9283a;
import com.bytedance.android.livesdkapi.IPropertyCache.PropertyType;
import com.bytedance.android.livesdkapi.host.C9439a;
import com.bytedance.android.livesdkapi.p450f.C9405a;
import com.bytedance.android.livesdkapi.p450f.C9406b;
import com.bytedance.ies.p534b.C10296b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.c.d */
public final class C32474d implements C9439a {

    /* renamed from: a */
    public static boolean f84720a;

    /* renamed from: b */
    private final C9406b f84721b = new C32476a();

    /* renamed from: c */
    private final IPropertyCache f84722c;

    /* renamed from: com.ss.android.ugc.aweme.live.c.d$a */
    static class C32476a implements C9406b {
        private C32476a() {
        }

        /* renamed from: a */
        public final boolean mo23111a() {
            return ((Boolean) SharePrefCache.inst().isEnableMessagePb2Json().mo59877d()).booleanValue();
        }

        /* renamed from: a */
        public final void mo23110a(boolean z) {
            C9405a.f25883c.mo22118a(Boolean.valueOf(true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.c.d$b */
    static class C32477b implements IPropertyCache {

        /* renamed from: a */
        private C10296b f84723a;

        /* renamed from: b */
        private Map<String, Object> f84724b = new HashMap();

        /* renamed from: a */
        private static void m105211a(boolean z) {
            if (!z) {
                throw new IllegalArgumentException();
            }
        }

        C32477b(Context context) {
            this.f84723a = C10296b.m30494a(context, "live-app-core-sdk");
            C3596c.m13174a(IPropertyCache.class, this);
        }

        /* renamed from: b */
        public final int mo22768b(C9283a aVar) {
            boolean z;
            if (aVar.type() == PropertyType.Integer) {
                z = true;
            } else {
                z = false;
            }
            m105211a(z);
            Integer num = (Integer) this.f84724b.get(aVar.key());
            if (num == null) {
                if (aVar.supportPersist()) {
                    num = Integer.valueOf(this.f84723a.mo25019a(aVar.key(), ((Integer) aVar.defValue()).intValue()));
                } else {
                    num = (Integer) aVar.defValue();
                }
                this.f84724b.put(aVar.key(), num);
            }
            return num.intValue();
        }

        /* renamed from: a */
        public final boolean mo22767a(C9283a aVar) {
            boolean z;
            if (aVar.type() == PropertyType.Boolean) {
                z = true;
            } else {
                z = false;
            }
            m105211a(z);
            Boolean bool = (Boolean) this.f84724b.get(aVar.key());
            if (bool == null) {
                if (aVar.supportPersist()) {
                    bool = Boolean.valueOf(this.f84723a.mo25024a(aVar.key(), ((Boolean) aVar.defValue()).booleanValue()));
                } else {
                    bool = (Boolean) aVar.defValue();
                }
                this.f84724b.put(aVar.key(), bool);
            }
            return bool.booleanValue();
        }

        /* renamed from: a */
        public final void mo22764a(C9283a aVar, int i) {
            boolean z;
            if (aVar.type() == PropertyType.Integer) {
                z = true;
            } else {
                z = false;
            }
            m105211a(z);
            this.f84724b.put(aVar.key(), Integer.valueOf(i));
            if (aVar.supportPersist()) {
                this.f84723a.f27957a.edit().putInt(aVar.key(), i).apply();
            }
        }

        /* renamed from: a */
        public final void mo22765a(C9283a aVar, String str) {
            boolean z;
            if (aVar.type() == PropertyType.String) {
                z = true;
            } else {
                z = false;
            }
            m105211a(z);
            this.f84724b.put(aVar.key(), str);
            if (aVar.supportPersist()) {
                this.f84723a.f27957a.edit().putString(aVar.key(), str).apply();
            }
        }

        /* renamed from: a */
        public final void mo22766a(C9283a aVar, boolean z) {
            boolean z2;
            Boolean bool;
            if (aVar.type() == PropertyType.Boolean) {
                z2 = true;
            } else {
                z2 = false;
            }
            m105211a(z2);
            Map<String, Object> map = this.f84724b;
            String key = aVar.key();
            if (z) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            map.put(key, bool);
            if (aVar.supportPersist()) {
                this.f84723a.f27957a.edit().putBoolean(aVar.key(), z).apply();
            }
        }
    }

    /* renamed from: a */
    public final C9406b mo23189a() {
        return this.f84721b;
    }

    /* renamed from: b */
    public final IPropertyCache mo23190b() {
        return this.f84722c;
    }

    C32474d(Context context) {
        this.f84722c = new C32477b(context);
    }
}
