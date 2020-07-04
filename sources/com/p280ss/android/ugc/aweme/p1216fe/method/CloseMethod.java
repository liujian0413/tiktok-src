package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.sdk.webview.C20135c;
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.p280ss.android.ugc.aweme.framework.activity.C29948b;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.live.p1359a.C32432a;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.CloseMethod */
public final class CloseMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27879a f73454a = new C27879a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.CloseMethod$a */
    public static final class C27879a {
        private C27879a() {
        }

        public /* synthetic */ C27879a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.CloseMethod$b */
    public static final class C27880b {

        /* renamed from: a */
        public final int f73455a;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C27880b) {
                    if (this.f73455a == ((C27880b) obj).f73455a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f73455a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WebViewFragmentBackEvent(webViewHash=");
            sb.append(this.f73455a);
            sb.append(")");
            return sb.toString();
        }

        public C27880b(int i) {
            this.f73455a = i;
        }
    }

    public CloseMethod() {
        this(null, 1, null);
    }

    public CloseMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        boolean z;
        if (this.f73445h != null) {
            int i = 0;
            if (jSONObject != null) {
                String optString = jSONObject.optString("reactId");
                CharSequence charSequence = optString;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    optString = null;
                }
                if (optString != null) {
                    C42961az.m136380a(new C20135c(optString));
                    return;
                }
            }
            WeakReference weakReference = this.f73443f;
            if (weakReference != null) {
                Context context = (Context) weakReference.get();
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (!activity.isFinishing()) {
                        if (context instanceof MainActivity) {
                            C11087a aVar2 = this.f73445h;
                            if (aVar2 != null) {
                                WebView webView = aVar2.f30155d;
                                if (webView != null) {
                                    i = webView.hashCode();
                                }
                            }
                            C42961az.m136380a(new C27880b(i));
                        } else {
                            activity.finish();
                        }
                    }
                }
                C42961az.m136380a(new C32432a(C32432a.f84603b));
            }
        } else if (jSONObject != null) {
            C29948b reactViewById = ReactInstance.getReactViewById(jSONObject.optString("reactId"));
            if (reactViewById != null) {
                reactViewById.mo67483c();
                aVar.mo71363a(C29956a.f78748a);
            } else {
                aVar.mo71362a(C29956a.f78751d, "the target activity doesn't exist");
            }
        }
    }

    private /* synthetic */ CloseMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
