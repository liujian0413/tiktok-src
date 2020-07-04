package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ac */
public final class C25220ac {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f66536a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25220ac.class), "KEVA", "getKEVA()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C25220ac f66537b;

    /* renamed from: c */
    private static final C7541d f66538c = C7546e.m23569a(C25221a.f66540a);

    /* renamed from: d */
    private static boolean f66539d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ac$a */
    static final class C25221a extends Lambda implements C7561a<Keva> {

        /* renamed from: a */
        public static final C25221a f66540a = new C25221a();

        C25221a() {
            super(0);
        }

        /* renamed from: a */
        private static Keva m82925a() {
            return Keva.getRepo("keva_repo_ad_web_checker");
        }

        public final /* synthetic */ Object invoke() {
            return m82925a();
        }
    }

    private C25220ac() {
    }

    /* renamed from: a */
    public static boolean m82918a() {
        return f66539d;
    }

    /* renamed from: b */
    private final Keva m82919b() {
        return (Keva) f66538c.getValue();
    }

    static {
        boolean z = true;
        C25220ac acVar = new C25220ac();
        f66537b = acVar;
        if (!C7163a.m22363a() || !acVar.m82919b().getBoolean("key_is_enable", true)) {
            z = false;
        }
        f66539d = z;
    }

    /* renamed from: a */
    public final void mo65836a(boolean z) {
        f66539d = z;
        m82919b().storeBoolean("key_is_enable", z);
    }

    /* renamed from: b */
    private static void m82920b(String str) {
        if (str != null) {
            Context a = C6399b.m19921a();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\n请反馈给lizijian@bytedance.com");
            C10761a.m31403c(a, sb.toString()).mo25750a();
        }
    }

    /* renamed from: a */
    public final void mo65835a(String str) {
        if (f66539d && str != null) {
            boolean z = false;
            if (C7634n.m23721b(str, "bytedance://", false)) {
                StringBuilder sb = new StringBuilder("console.log");
                try {
                    Uri parse = Uri.parse(str);
                    C7573i.m23582a((Object) parse, "uri");
                    boolean z2 = true;
                    if (!(!C7573i.m23585a((Object) "log_event", (Object) parse.getHost()))) {
                        String queryParameter = parse.getQueryParameter("tag");
                        String queryParameter2 = parse.getQueryParameter("label");
                        if (queryParameter == null) {
                            sb.append("未设置tag,");
                            z = true;
                        }
                        if (queryParameter2 == null) {
                            sb.append("未设置label");
                        } else {
                            z2 = z;
                        }
                        if (z2) {
                            m82920b(sb.toString());
                        }
                    }
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder("console.log上报url不合法,错误：");
                    sb2.append(e.getMessage());
                    m82920b(sb2.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo65834a(long j, String str) {
        boolean z;
        if (f66539d) {
            StringBuilder sb = new StringBuilder("adInfo方法");
            boolean z2 = false;
            if (j <= 0) {
                sb.append("adId未设置,");
                z = true;
            } else {
                z = false;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            }
            if (z2) {
                sb.append("log_extra为空");
                z = true;
            }
            if (z) {
                m82920b(sb.toString());
            }
        }
    }

    /* renamed from: b */
    public final void mo65837b(long j, String str) {
        boolean z;
        if (f66539d) {
            boolean z2 = false;
            if (j > 0) {
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m82920b("ad_id已设置，但未注入toutiao-track-log.js");
                }
            }
            if (j <= 0 && str != null) {
                if (str.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    m82920b("toutiao-track-log.js已注入，但未设置ad_id");
                }
            }
        }
    }
}
