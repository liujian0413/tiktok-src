package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.base.activity.C23255b;
import com.p280ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30377c;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.p356e.C7549c;
import kotlin.p356e.C7551d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePushMethod */
public final class RoutePushMethod extends BaseCommonJavaMethod {

    /* renamed from: c */
    public static final C7549c f73573c = C7551d.m23565b(50000, 60000);

    /* renamed from: d */
    public static final C27923a f73574d = new C27923a(null);

    /* renamed from: a */
    public final Map<Integer, C27876a> f73575a;

    /* renamed from: b */
    public final C11087a f73576b;

    /* renamed from: i */
    private int f73577i;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePushMethod$a */
    public static final class C27923a {
        private C27923a() {
        }

        public /* synthetic */ C27923a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePushMethod$b */
    public static final class C27924b implements C23255b {

        /* renamed from: a */
        final /* synthetic */ AbsActivityContainer f73578a;

        /* renamed from: b */
        final /* synthetic */ String f73579b;

        /* renamed from: c */
        final /* synthetic */ RoutePushMethod f73580c;

        /* renamed from: d */
        final /* synthetic */ C27876a f73581d;

        /* renamed from: a */
        public final boolean mo60523a(int i, int i2, Intent intent) {
            JSONObject jSONObject;
            if (i2 == 50000) {
                C27876a aVar = (C27876a) this.f73580c.f73575a.remove(Integer.valueOf(i));
                if (aVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (intent != null) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("serialized_data");
                            if (string != null) {
                                try {
                                    jSONObject = new JSONObject(string).optJSONObject("data");
                                } catch (JSONException unused) {
                                    jSONObject = null;
                                }
                                if (jSONObject != null) {
                                    C30377c.m99262a(jSONObject2, jSONObject);
                                }
                            }
                        }
                    }
                    aVar.mo71364a(jSONObject2, C29956a.f78750c, "push callback succeed");
                }
            }
            this.f73578a.mo67091b(this);
            return false;
        }

        C27924b(AbsActivityContainer absActivityContainer, String str, RoutePushMethod routePushMethod, C27876a aVar) {
            this.f73578a = absActivityContainer;
            this.f73579b = str;
            this.f73580c = routePushMethod;
            this.f73581d = aVar;
        }
    }

    public RoutePushMethod() {
        this(null, 1, null);
    }

    public RoutePushMethod(C11087a aVar) {
        super(aVar);
        this.f73576b = aVar;
        this.f73575a = new LinkedHashMap();
        this.f73577i = f73573c.f20877a;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("schema");
            if (optString != null) {
                if (!(!TextUtils.isEmpty(optString))) {
                    optString = null;
                }
                if (optString != null) {
                    AbsActivityContainer a = mo71356a();
                    if (a != null) {
                        a.mo67085a((C23255b) new C27924b(a, optString, this, aVar));
                        if (a.mo67089a(optString, this.f73577i)) {
                            this.f73575a.put(Integer.valueOf(this.f73577i), aVar);
                            this.f73577i++;
                            if (this.f73577i > f73573c.f20878b) {
                                this.f73577i = f73573c.f20877a;
                                return;
                            }
                        } else {
                            aVar.mo71362a(C29956a.f78751d, "router not supported");
                        }
                        return;
                    }
                }
            }
        }
        aVar.mo71362a(C29956a.f78751d, "params not valid");
    }

    private /* synthetic */ RoutePushMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
