package com.linecorp.linesdk.p801a.p802a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.linecorp.linesdk.p801a.C18582b;
import com.linecorp.linesdk.p801a.C18586e;
import com.linecorp.linesdk.p801a.C18587f;
import com.linecorp.linesdk.p801a.C18588g;
import com.linecorp.linesdk.p801a.C18589h;
import com.linecorp.linesdk.p801a.p802a.p803a.C18568a;
import com.linecorp.linesdk.p801a.p802a.p803a.C18571d;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.a.a.b */
public final class C18574b {

    /* renamed from: a */
    public static final C18571d<C18588g> f50204a = new C18576b(0);

    /* renamed from: b */
    public static final C18571d<C18587f> f50205b = new C18575a(0);

    /* renamed from: c */
    public static final C18571d<C18582b> f50206c = new C18578d(0);

    /* renamed from: d */
    public static final C18571d<C18589h> f50207d = new C18577c(0);

    /* renamed from: e */
    public static final C18571d<?> f50208e = new C18579c();

    /* renamed from: f */
    public final Uri f50209f;

    /* renamed from: g */
    public final C18568a f50210g;

    /* renamed from: com.linecorp.linesdk.a.a.b$a */
    static class C18575a extends C18567a<C18587f> {
        private C18575a() {
        }

        /* synthetic */ C18575a(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo48730a(JSONObject jSONObject) {
            List list;
            String string = jSONObject.getString("token_type");
            if ("Bearer".equals(string)) {
                String optString = jSONObject.optString("scope");
                C18586e eVar = new C18586e(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, System.currentTimeMillis(), jSONObject.getString("refresh_token"));
                if (TextUtils.isEmpty(optString)) {
                    list = Collections.emptyList();
                } else {
                    list = Arrays.asList(optString.split(" "));
                }
                return new C18587f(eVar, list);
            }
            throw new JSONException("Illegal token type. token_type=".concat(String.valueOf(string)));
        }
    }

    /* renamed from: com.linecorp.linesdk.a.a.b$b */
    static class C18576b extends C18567a<C18588g> {
        private C18576b() {
        }

        /* synthetic */ C18576b(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo48730a(JSONObject jSONObject) {
            return new C18588g(jSONObject.getString("otpId"), jSONObject.getString("otp"));
        }
    }

    /* renamed from: com.linecorp.linesdk.a.a.b$c */
    static class C18577c extends C18567a<C18589h> {
        private C18577c() {
        }

        /* synthetic */ C18577c(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo48730a(JSONObject jSONObject) {
            String string = jSONObject.getString("token_type");
            if ("Bearer".equals(string)) {
                return new C18589h(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, jSONObject.optString("refresh_token"));
            }
            throw new JSONException("Illegal token type. token_type=".concat(String.valueOf(string)));
        }
    }

    /* renamed from: com.linecorp.linesdk.a.a.b$d */
    static class C18578d extends C18567a<C18582b> {
        private C18578d() {
        }

        /* synthetic */ C18578d(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo48730a(JSONObject jSONObject) {
            List list;
            String optString = jSONObject.optString("scope");
            String string = jSONObject.getString("client_id");
            long j = jSONObject.getLong("expires_in") * 1000;
            if (TextUtils.isEmpty(optString)) {
                list = Collections.emptyList();
            } else {
                list = Arrays.asList(optString.split(" "));
            }
            return new C18582b(string, j, list);
        }
    }

    private C18574b(Uri uri, C18568a aVar) {
        this.f50209f = uri;
        this.f50210g = aVar;
    }

    public C18574b(Context context, Uri uri) {
        this(uri, new C18568a(context, "4.0.8"));
    }
}
