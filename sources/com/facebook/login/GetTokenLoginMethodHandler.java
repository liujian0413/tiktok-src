package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.C13962w.C13964a;
import com.facebook.internal.C13967z;
import com.facebook.internal.C13967z.C13970a;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Creator<GetTokenLoginMethodHandler> CREATOR = new Creator() {
        /* renamed from: a */
        private static GetTokenLoginMethodHandler[] m41526a(int i) {
            return new GetTokenLoginMethodHandler[i];
        }

        /* renamed from: a */
        private static GetTokenLoginMethodHandler m41525a(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m41525a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m41526a(i);
        }
    };

    /* renamed from: c */
    private C14100b f37184c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo33721a() {
        return "get_token";
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33762b() {
        if (this.f37184c != null) {
            this.f37184c.mo33613b();
            this.f37184c.f36931b = null;
            this.f37184c = null;
        }
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33724a(final Request request) {
        this.f37184c = new C14100b(this.f37240b.mo33770a(), request.f37203d);
        if (!this.f37184c.mo33612a()) {
            return false;
        }
        this.f37240b.mo33780f();
        this.f37184c.f36931b = new C13964a() {
            /* renamed from: a */
            public final void mo33617a(Bundle bundle) {
                GetTokenLoginMethodHandler.this.mo33761a(request, bundle);
            }
        };
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: c */
    private void m41516c(final Request request, final Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.isEmpty()) {
            this.f37240b.mo33780f();
            C13967z.m41241a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), (C13970a) new C13970a() {
                /* renamed from: a */
                public final void mo31807a(FacebookException facebookException) {
                    GetTokenLoginMethodHandler.this.f37240b.mo33775b(Result.m41565a(GetTokenLoginMethodHandler.this.f37240b.f37196g, "Caught exception", facebookException.getMessage()));
                }

                /* renamed from: a */
                public final void mo31808a(JSONObject jSONObject) {
                    try {
                        bundle.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                        GetTokenLoginMethodHandler.this.mo33763b(request, bundle);
                    } catch (JSONException e) {
                        GetTokenLoginMethodHandler.this.f37240b.mo33775b(Result.m41565a(GetTokenLoginMethodHandler.this.f37240b.f37196g, "Caught exception", e.getMessage()));
                    }
                }
            });
            return;
        }
        mo33763b(request, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33763b(Request request, Bundle bundle) {
        this.f37240b.mo33773a(Result.m41563a(this.f37240b.f37196g, m41610a(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.f37203d)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33761a(Request request, Bundle bundle) {
        if (this.f37184c != null) {
            this.f37184c.f36931b = null;
        }
        this.f37184c = null;
        this.f37240b.mo33781g();
        if (bundle != null) {
            ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> set = request.f37201b;
            if (stringArrayList == null || (set != null && !stringArrayList.containsAll(set))) {
                HashSet hashSet = new HashSet();
                for (String str : set) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    mo33813a("new_permissions", TextUtils.join(",", hashSet));
                }
                request.mo33785a(hashSet);
            } else {
                m41516c(request, bundle);
                return;
            }
        }
        this.f37240b.mo33779e();
    }
}
