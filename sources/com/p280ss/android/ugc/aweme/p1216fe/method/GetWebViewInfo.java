package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.webkit.WebView;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.GetWebViewInfo */
public final class GetWebViewInfo extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27889a f73472a = new C27889a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.GetWebViewInfo$a */
    public static final class C27889a {
        private C27889a() {
        }

        public /* synthetic */ C27889a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.GetWebViewInfo$b */
    public static final class C27890b {

        /* renamed from: a */
        public final int f73473a;

        /* renamed from: b */
        public final C27876a f73474b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C27890b) {
                    C27890b bVar = (C27890b) obj;
                    if (!(this.f73473a == bVar.f73473a) || !C7573i.m23585a((Object) this.f73474b, (Object) bVar.f73474b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f73473a) * 31;
            C27876a aVar = this.f73474b;
            return hashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GetStatusEvent(webViewHash=");
            sb.append(this.f73473a);
            sb.append(", iReturn=");
            sb.append(this.f73474b);
            sb.append(")");
            return sb.toString();
        }

        public C27890b(int i, C27876a aVar) {
            this.f73473a = i;
            this.f73474b = aVar;
        }
    }

    public GetWebViewInfo() {
        this(null, 1, null);
    }

    public GetWebViewInfo(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        int i;
        C11087a aVar2 = this.f73445h;
        if (aVar2 != null) {
            WebView webView = aVar2.f30155d;
            if (webView != null) {
                i = webView.hashCode();
                C42961az.m136380a(new C27890b(i, aVar));
            }
        }
        i = 0;
        C42961az.m136380a(new C27890b(i, aVar));
    }

    private /* synthetic */ GetWebViewInfo(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
