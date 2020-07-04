package com.p280ss.android.ugc.aweme.p1216fe.method;

import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30398q;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ReportCustomEventMethod */
public final class ReportCustomEventMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27913a f73531a = new C27913a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ReportCustomEventMethod$a */
    public static final class C27913a {
        private C27913a() {
        }

        public /* synthetic */ C27913a(C7571f fVar) {
            this();
        }
    }

    public ReportCustomEventMethod() {
        this(null, 1, null);
    }

    public ReportCustomEventMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        boolean z;
        boolean z2;
        String str;
        String str2 = "state invalid";
        C30388i b = mo71361b();
        if (b != null) {
            C30398q a = b.mo80008a(C30398q.class);
            if (a != null) {
                str2 = "params empty";
                if (jSONObject != null) {
                    String optString = jSONObject.optString("service");
                    CharSequence charSequence = optString;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = "service empty";
                    } else {
                        String optString2 = jSONObject.optString("trigger");
                        CharSequence charSequence2 = optString2;
                        if (charSequence2 == null || charSequence2.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            str = "trigger empty";
                        } else {
                            JSONObject optJSONObject = jSONObject.optJSONObject("category");
                            JSONObject optJSONObject2 = jSONObject.optJSONObject("metrics");
                            JSONObject optJSONObject3 = jSONObject.optJSONObject("extra");
                            if (optString == null) {
                                C7573i.m23580a();
                            }
                            if (optString2 == null) {
                                C7573i.m23580a();
                            }
                            a.mo79996a(optString, optString2, optJSONObject, optJSONObject2, optJSONObject3);
                            aVar.mo71364a(new JSONObject(), 1, "report success");
                            return;
                        }
                    }
                    str2 = str;
                }
            }
        }
        StringBuilder sb = new StringBuilder("report error, reason: ");
        sb.append(str2);
        aVar.mo71362a(0, sb.toString());
    }

    private /* synthetic */ ReportCustomEventMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
