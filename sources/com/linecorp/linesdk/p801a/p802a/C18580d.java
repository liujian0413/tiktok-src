package com.linecorp.linesdk.p801a.p802a;

import android.content.Context;
import android.net.Uri;
import com.linecorp.linesdk.C18565a;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.p801a.C18586e;
import com.linecorp.linesdk.p801a.p802a.p803a.C18568a;
import com.linecorp.linesdk.p801a.p802a.p803a.C18571d;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.a.a.d */
public final class C18580d {

    /* renamed from: a */
    private static final C18571d<LineProfile> f50212a = new C18581a();

    /* renamed from: b */
    private final Uri f50213b;

    /* renamed from: c */
    private final C18568a f50214c;

    /* renamed from: com.linecorp.linesdk.a.a.d$a */
    static class C18581a extends C18567a<LineProfile> {
        C18581a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo48730a(JSONObject jSONObject) {
            Uri uri;
            String optString = jSONObject.optString("pictureUrl", null);
            String string = jSONObject.getString("userId");
            String string2 = jSONObject.getString("displayName");
            if (optString == null) {
                uri = null;
            } else {
                uri = Uri.parse(optString);
            }
            return new LineProfile(string, string2, uri, jSONObject.optString("statusMessage", null));
        }
    }

    /* renamed from: a */
    public final C18565a<LineProfile> mo48736a(C18586e eVar) {
        Uri build = this.f50213b.buildUpon().appendPath("profile").build();
        HashMap hashMap = new HashMap(1);
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(eVar.f50221a);
        hashMap.put("Authorization", sb.toString());
        return this.f50214c.mo48732b(build, hashMap, Collections.emptyMap(), f50212a);
    }

    private C18580d(Uri uri, C18568a aVar) {
        this.f50213b = uri;
        this.f50214c = aVar;
    }

    public C18580d(Context context, Uri uri) {
        this(uri, new C18568a(context, "4.0.8"));
    }
}
