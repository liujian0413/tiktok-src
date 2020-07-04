package com.p280ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod */
public final class DidLoadFinishMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C43456a f112547a = new C43456a(null);

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod$a */
    public static final class C43456a {
        private C43456a() {
        }

        public /* synthetic */ C43456a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod$b */
    public static final class C43457b {

        /* renamed from: b */
        public static final C43458a f112548b = new C43458a(null);

        /* renamed from: a */
        public final int f112549a;

        /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod$b$a */
        public static final class C43458a {
            private C43458a() {
            }

            public /* synthetic */ C43458a(C7571f fVar) {
                this();
            }
        }

        public C43457b() {
            this(0, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C43457b) {
                    if (this.f112549a == ((C43457b) obj).f112549a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f112549a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Event(status=");
            sb.append(this.f112549a);
            sb.append(")");
            return sb.toString();
        }

        public C43457b(int i) {
            this.f112549a = i;
        }

        private /* synthetic */ C43457b(int i, int i2, C7571f fVar) {
            this(0);
        }
    }

    public DidLoadFinishMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject != null) {
            C42961az.m136380a(new C43457b(jSONObject.optInt("status", 0)));
            aVar.mo71363a((Object) null);
        }
    }
}
