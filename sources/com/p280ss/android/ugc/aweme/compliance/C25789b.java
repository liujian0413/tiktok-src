package com.p280ss.android.ugc.aweme.compliance;

import com.p280ss.android.ugc.aweme.C21762l;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.compliance.model.ComplianceSetting;
import com.p280ss.android.ugc.aweme.compliance.p1149a.C25785a;
import com.p280ss.android.ugc.aweme.compliance.p1150b.C25790a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.compliance.b */
public final class C25789b {

    /* renamed from: a */
    public static final C25789b f68199a = new C25789b();

    /* renamed from: b */
    private static final C25790a f68200b = new C25790a();

    /* renamed from: c */
    private static final C25785a f68201c = new C25785a();

    private C25789b() {
    }

    /* renamed from: a */
    public static C25785a m84753a() {
        return f68201c;
    }

    /* renamed from: b */
    public static void m84757b() {
        f68200b.mo66980a();
    }

    /* renamed from: l */
    public static int m84765l() {
        return f68201c.mo66969a();
    }

    /* renamed from: m */
    public static void m84766m() {
        f68201c.mo66973b(0);
    }

    /* renamed from: c */
    public final void mo66978c() {
        f68201c.mo66971a((ComplianceSetting) null);
        m84757b();
    }

    /* renamed from: d */
    public static boolean m84758d() {
        ComplianceSetting b = f68201c.mo66972b();
        if (b != null) {
            Boolean algoFreeEnabled = b.getAlgoFreeEnabled();
            if (algoFreeEnabled != null) {
                return algoFreeEnabled.booleanValue();
            }
        }
        return false;
    }

    /* renamed from: e */
    public static String m84759e() {
        ComplianceSetting b = f68201c.mo66972b();
        if (b != null) {
            String vpaInfoBarUrl = b.getVpaInfoBarUrl();
            if (vpaInfoBarUrl != null) {
                return vpaInfoBarUrl;
            }
        }
        return "";
    }

    /* renamed from: f */
    public static boolean m84760f() {
        ComplianceSetting b = f68201c.mo66972b();
        if (b != null) {
            Boolean enableVpa = b.getEnableVpa();
            if (enableVpa != null) {
                return enableVpa.booleanValue();
            }
        }
        return false;
    }

    /* renamed from: g */
    public static List<String> m84761g() {
        ComplianceSetting b = f68201c.mo66972b();
        if (b != null) {
            List<String> blackSetting = b.getBlackSetting();
            if (blackSetting != null) {
                return blackSetting;
            }
        }
        return new ArrayList<>();
    }

    /* renamed from: i */
    public static String m84762i() {
        ComplianceSetting b = f68201c.mo66972b();
        if (b != null) {
            String impressumUrl = b.getImpressumUrl();
            if (impressumUrl != null) {
                return impressumUrl;
            }
        }
        return "";
    }

    /* renamed from: j */
    public static String m84763j() {
        ComplianceSetting b = f68201c.mo66972b();
        if (b != null) {
            String privacyPolicyUrl = b.getPrivacyPolicyUrl();
            if (privacyPolicyUrl != null) {
                return privacyPolicyUrl;
            }
        }
        return "";
    }

    /* renamed from: k */
    public static int m84764k() {
        ComplianceSetting b = f68201c.mo66972b();
        if (b != null) {
            Integer enableDoNotSell = b.getEnableDoNotSell();
            if (enableDoNotSell != null) {
                return enableDoNotSell.intValue();
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer m84767n() {
        /*
            com.ss.android.ugc.aweme.compliance.a.a r0 = f68201c
            com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r0 = r0.mo66972b()
            r1 = 1
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r0 = r0.getDefaultVpaContentChoice()
            if (r0 == 0) goto L_0x0014
            int r0 = r0.intValue()
            goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            if (r0 != 0) goto L_0x001c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x001c:
            com.ss.android.ugc.aweme.compliance.a.a r0 = f68201c
            com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r0 = r0.mo66972b()
            if (r0 == 0) goto L_0x0029
            java.lang.Integer r0 = r0.getDefaultVpaContentChoice()
            return r0
        L_0x0029:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.compliance.C25789b.m84767n():java.lang.Integer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0 == null) goto L_0x000f;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo66979h() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.compliance.a.a r0 = f68201c
            com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r0 = r0.mo66972b()
            r1 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.Integer r0 = r0.getEnableImpressum()
            if (r0 != 0) goto L_0x0013
        L_0x000f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0013:
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x002c
        L_0x001e:
            java.lang.String r0 = m84762i()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002c
            r0 = 1
            return r0
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.compliance.C25789b.mo66979h():boolean");
    }

    /* renamed from: a */
    public static void m84755a(ComplianceSetting complianceSetting) {
        C7573i.m23587b(complianceSetting, "setting");
        f68201c.mo66971a(complianceSetting);
    }

    /* renamed from: a */
    public static List<String> m84754a(int i) {
        AwemeApplication a = AwemeApplication.m21341a();
        C7573i.m23582a((Object) a, "AwemeApplication.getApplication()");
        String[] stringArray = a.getResources().getStringArray(i);
        C7573i.m23582a((Object) stringArray, "AwemeApplication.getAppl…tStringArray(whiteListId)");
        return C7519g.m23447d((T[]) stringArray);
    }

    /* renamed from: a */
    public static void m84756a(C21762l lVar) {
        C7573i.m23587b(lVar, "listener");
        f68200b.mo66981a(lVar);
    }
}
