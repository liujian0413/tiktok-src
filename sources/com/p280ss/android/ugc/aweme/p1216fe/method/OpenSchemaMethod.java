package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.facebook.react.bridge.UiThreadUtil;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.p280ss.android.ugc.aweme.framework.activity.C29948b;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C43011cf;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenSchemaMethod */
public final class OpenSchemaMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27909a f73523a = new C27909a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenSchemaMethod$a */
    public static final class C27909a {
        private C27909a() {
        }

        public /* synthetic */ C27909a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenSchemaMethod$b */
    static final class C27910b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f73524a;

        /* renamed from: b */
        final /* synthetic */ String f73525b;

        /* renamed from: c */
        final /* synthetic */ C27876a f73526c;

        C27910b(String str, String str2, C27876a aVar) {
            this.f73524a = str;
            this.f73525b = str2;
            this.f73526c = aVar;
        }

        public final void run() {
            String str;
            C29948b reactViewById = ReactInstance.getReactViewById(this.f73524a);
            if (TextUtils.isEmpty(this.f73525b) || reactViewById == null) {
                C27876a aVar = this.f73526c;
                if (aVar != null) {
                    aVar.mo71362a(C29956a.f78751d, "schema is not legal");
                    return;
                }
                return;
            }
            String str2 = this.f73525b;
            if (str2 != null && C7634n.m23721b(str2, "aweme://live/", false)) {
                Uri parse = Uri.parse(this.f73525b);
                String queryParameter = parse.getQueryParameter("room_id");
                String queryParameter2 = parse.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2)) {
                    C22912d.f60645e.mo59887a((Context) reactViewById.getActivity(), C7634n.m23711a(this.f73525b, "aweme", C22909c.f60637a, false), (String) null);
                    C27876a aVar2 = this.f73526c;
                    if (aVar2 != null) {
                        aVar2.mo71363a((Object) new JSONObject());
                    }
                } else {
                    C27876a aVar3 = this.f73526c;
                    if (aVar3 != null) {
                        aVar3.mo71362a(C29956a.f78751d, "");
                    }
                }
            } else if (C43011cf.m136512a(this.f73525b)) {
                if (C32430a.m105071h()) {
                    C27876a aVar4 = this.f73526c;
                    if (aVar4 != null) {
                        aVar4.mo71363a((Object) new JSONObject());
                    }
                } else {
                    C27876a aVar5 = this.f73526c;
                    if (aVar5 != null) {
                        aVar5.mo71362a(C29956a.f78751d, "");
                    }
                }
            } else if (C27995l.m91593a(this.f73525b)) {
                C27876a aVar6 = this.f73526c;
                if (aVar6 != null) {
                    aVar6.mo71363a((Object) new JSONObject());
                }
            } else {
                boolean a = C7195s.m22438a().mo18679a(reactViewById.getActivity(), this.f73525b);
                if (!a) {
                    String str3 = this.f73525b;
                    if (str3 != null) {
                        str = C7634n.m23711a(str3, "aweme", C22909c.f60637a, false);
                    } else {
                        str = null;
                    }
                    a = C22912d.f60645e.mo59887a((Context) reactViewById.getActivity(), str, (String) null);
                }
                if (a) {
                    C27876a aVar7 = this.f73526c;
                    if (aVar7 != null) {
                        aVar7.mo71363a((Object) new JSONObject());
                    }
                } else {
                    C27876a aVar8 = this.f73526c;
                    if (aVar8 != null) {
                        aVar8.mo71362a(C29956a.f78751d, "");
                    }
                }
            }
        }
    }

    public OpenSchemaMethod() {
        this(null, 1, null);
    }

    public OpenSchemaMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private final void m91431a(String str) {
        String str2;
        if (this.f73443f.get() == null) {
            C7195s.m22438a().mo18682a(str);
        } else if (!C27995l.m91593a(str)) {
            C7195s a = C7195s.m22438a();
            Object obj = this.f73443f.get();
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            } else if (!a.mo18679a((Activity) obj, str)) {
                if (str != null) {
                    str2 = C7634n.m23711a(str, "aweme", C22909c.f60637a, false);
                } else {
                    str2 = null;
                }
                C22912d.f60645e.mo59887a((Context) this.f73443f.get(), str2, (String) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        String str;
        String str2 = null;
        if (jSONObject != null) {
            str = jSONObject.optString("reactId");
        } else {
            str = null;
        }
        if (jSONObject != null) {
            str2 = jSONObject.optString("schema");
        }
        if (this.f73445h != null) {
            m91431a(str2);
        } else {
            m91432a(str, str2, aVar);
        }
    }

    private /* synthetic */ OpenSchemaMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }

    /* renamed from: a */
    private static void m91432a(String str, String str2, C27876a aVar) {
        UiThreadUtil.runOnUiThread(new C27910b(str, str2, aVar));
    }
}
