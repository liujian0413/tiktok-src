package com.bytedance.opensdk.p619b;

import com.bytedance.opensdk.core.grant.config.GrantConfig;
import com.bytedance.opensdk.core.p620a.C12288a;
import com.bytedance.opensdk.core.p620a.p621a.C12290b.C12291a;
import com.bytedance.opensdk.core.p620a.p621a.C12290b.C12292b;
import com.bytedance.opensdk.core.p620a.p623c.C12298a;
import com.bytedance.opensdk.core.p620a.p623c.C12299b;
import com.bytedance.opensdk.core.p620a.p623c.C12300c;
import com.bytedance.opensdk.core.p620a.p623c.C12301d;
import com.bytedance.opensdk.core.p629c.p630a.C12322d;
import com.google.gson.C6609h;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.C6712o;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.opensdk.b.b */
public final class C12267b {
    /* renamed from: a */
    public static final C6711m m35671a(Exception exc, int i) {
        C7573i.m23587b(exc, "receiver$0");
        C6711m mVar = new C6711m();
        mVar.mo16147a("message", "error");
        C6711m mVar2 = new C6711m();
        mVar2.mo16147a("description", exc.toString());
        mVar2.mo16146a("error_code", (Number) Integer.valueOf(i));
        mVar.mo16144a("data", (C6709k) mVar2);
        return mVar;
    }

    /* renamed from: a */
    public static final String m35674a(C6711m mVar, String str, String str2) {
        C7573i.m23587b(mVar, "receiver$0");
        C7573i.m23587b(str, "key");
        C6709k b = mVar.mo16149b(str);
        if (b != null) {
            C6712o b2 = m35677b(b);
            if (b2 != null) {
                String a = m35676a(b2);
                if (a != null) {
                    return a;
                }
            }
        }
        return str2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Boolean m35672a(C6711m mVar, String str, Boolean bool) {
        C7573i.m23587b(mVar, "receiver$0");
        C7573i.m23587b(str, "key");
        C6709k b = mVar.mo16149b(str);
        if (b != null) {
            C6712o b2 = m35677b(b);
            if (b2 != null) {
                Boolean b3 = m35678b(b2);
                if (b3 != null) {
                    return b3;
                }
            }
        }
        return bool;
    }

    /* renamed from: a */
    private static String m35676a(C6712o oVar) {
        C7573i.m23587b(oVar, "receiver$0");
        if (oVar.mo16160r()) {
            return oVar.mo15998c();
        }
        return null;
    }

    /* renamed from: a */
    public static final C6609h m35669a(C6709k kVar) {
        C7573i.m23587b(kVar, "receiver$0");
        if (kVar.mo16132i()) {
            return kVar.mo16137n();
        }
        return null;
    }

    /* renamed from: b */
    private static C6712o m35677b(C6709k kVar) {
        C7573i.m23587b(kVar, "receiver$0");
        if (kVar.mo16134k()) {
            return kVar.mo16138o();
        }
        return null;
    }

    /* renamed from: c */
    private static Integer m35679c(C6712o oVar) {
        C7573i.m23587b(oVar, "receiver$0");
        if (oVar.mo16159q()) {
            return Integer.valueOf(oVar.mo16003g());
        }
        return null;
    }

    /* renamed from: b */
    private static Boolean m35678b(C6712o oVar) {
        C7573i.m23587b(oVar, "receiver$0");
        if (oVar.mo16156a()) {
            return Boolean.valueOf(oVar.mo16004h());
        }
        return null;
    }

    /* renamed from: a */
    public static final C12288a m35665a(C12292b bVar) {
        int i;
        C7573i.m23587b(bVar, "receiver$0");
        if (bVar.mo30108b()) {
            return new C12288a(0, "", "", "");
        }
        Integer num = ((C12291a) bVar.f32668c).f32666d;
        if (num != null) {
            i = num.intValue();
        } else {
            i = C34943c.f91128x;
        }
        return new C12288a(i, "", bVar.mo30109c(), ((C12291a) bVar.f32668c).f32665c);
    }

    /* renamed from: a */
    public static final C12288a m35666a(C12299b bVar) {
        C12288a aVar;
        int i;
        boolean z;
        if (bVar == null) {
            aVar = new C12288a(C34943c.f91127w, null, "error: 200", "code resp null error!");
        } else if (bVar.mo30108b()) {
            String a = bVar.mo30097a();
            CharSequence charSequence = a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aVar = new C12288a(0, a, bVar.f32667b, ((C12298a) bVar.f32668c).f32665c);
            } else {
                aVar = new C12288a(202, null, bVar.mo30109c(), ((C12298a) bVar.f32668c).f32665c);
            }
        } else {
            Integer num = ((C12298a) bVar.f32668c).f32666d;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 201;
            }
            return new C12288a(i, null, bVar.mo30109c(), ((C12298a) bVar.f32668c).f32665c);
        }
        return aVar;
    }

    /* renamed from: a */
    public static final C12288a m35667a(C12301d dVar, C7562b<? super String, C12288a> bVar) {
        C12288a aVar;
        int i;
        boolean z;
        C7573i.m23587b(bVar, "getCodeAction");
        if (dVar != null) {
            if (dVar.mo30108b()) {
                String a = dVar.mo30098a();
                CharSequence charSequence = a;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    aVar = (C12288a) bVar.invoke(a);
                } else {
                    aVar = new C12288a(102, null, dVar.mo30109c(), ((C12300c) dVar.f32668c).f32665c);
                }
            } else {
                Integer num = ((C12300c) dVar.f32668c).f32666d;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = BaseNotice.HASHTAG;
                }
                aVar = new C12288a(i, null, dVar.mo30109c(), ((C12300c) dVar.f32668c).f32665c);
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return new C12288a(100, null, "error: 100", "ticket resp null error!");
    }

    /* renamed from: a */
    public static final C12322d m35668a(GrantConfig grantConfig, boolean z) {
        C7573i.m23587b(grantConfig, "receiver$0");
        C12322d dVar = new C12322d(String.valueOf(grantConfig.f32709b.f32671c), grantConfig.f32709b.f32669a, grantConfig.f32709b.f32670b, grantConfig.f32711d, grantConfig.f32709b.f32672d, grantConfig.f32709b.f32673e, z);
        return dVar;
    }

    /* renamed from: a */
    public static final C6711m m35670a(C6711m mVar, String str) {
        C7573i.m23587b(mVar, "receiver$0");
        C7573i.m23587b(str, "key");
        C6709k b = mVar.mo16149b(str);
        if (b == null || !b.mo16133j()) {
            return null;
        }
        return b.mo16136m();
    }

    /* renamed from: a */
    public static final int m35664a(C6711m mVar, String str, int i) {
        C7573i.m23587b(mVar, "receiver$0");
        C7573i.m23587b(str, "key");
        C6709k b = mVar.mo16149b(str);
        if (b != null) {
            C6712o b2 = m35677b(b);
            if (b2 != null) {
                Integer c = m35679c(b2);
                if (c != null) {
                    return c.intValue();
                }
            }
        }
        return i;
    }
}
