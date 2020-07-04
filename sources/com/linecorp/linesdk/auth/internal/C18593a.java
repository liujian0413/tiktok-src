package com.linecorp.linesdk.auth.internal;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.linecorp.linesdk.LineApiError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.auth.internal.a */
final class C18593a {

    /* renamed from: a */
    static final C18597b f50252a = new C18597b(6, 9, 0);

    /* renamed from: b */
    final C18602d f50253b;

    /* renamed from: com.linecorp.linesdk.auth.internal.a$a */
    static class C18594a {

        /* renamed from: a */
        final Intent f50254a;

        /* renamed from: b */
        final Bundle f50255b;

        /* renamed from: c */
        final boolean f50256c;

        C18594a(Intent intent, Bundle bundle, boolean z) {
            this.f50254a = intent;
            this.f50255b = bundle;
            this.f50256c = z;
        }
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.a$b */
    static class C18595b {

        /* renamed from: a */
        final Intent f50257a;

        /* renamed from: b */
        final Bundle f50258b;

        /* renamed from: c */
        final String f50259c;

        /* renamed from: d */
        final boolean f50260d;

        C18595b(Intent intent, Bundle bundle, String str, boolean z) {
            this.f50257a = intent;
            this.f50258b = bundle;
            this.f50259c = str;
            this.f50260d = z;
        }
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.a$c */
    static class C18596c {

        /* renamed from: a */
        final String f50261a;

        /* renamed from: b */
        private final String f50262b;

        /* renamed from: c */
        private final String f50263c;

        /* renamed from: d */
        private final String f50264d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo48774a() {
            if (!TextUtils.isEmpty(this.f50261a)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo48775b() {
            if (!TextUtils.isEmpty(this.f50264d) || mo48774a()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final LineApiError mo48776c() {
            if (!mo48775b()) {
                return new LineApiError(this.f50264d);
            }
            try {
                return new LineApiError(new JSONObject().putOpt("error", this.f50262b).putOpt("error_description", this.f50263c).toString());
            } catch (JSONException e) {
                return new LineApiError((Exception) e);
            }
        }

        /* renamed from: a */
        static C18596c m61025a(String str) {
            return new C18596c(null, null, null, str);
        }

        C18596c(String str, String str2, String str3, String str4) {
            this.f50261a = str;
            this.f50262b = str2;
            this.f50263c = str3;
            this.f50264d = str4;
        }
    }

    C18593a(C18602d dVar) {
        this.f50253b = dVar;
    }

    /* renamed from: a */
    static List<Intent> m61024a(Uri uri, Collection<ResolveInfo> collection, Bundle bundle) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (ResolveInfo resolveInfo : collection) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            arrayList.add(intent);
        }
        return arrayList;
    }
}
