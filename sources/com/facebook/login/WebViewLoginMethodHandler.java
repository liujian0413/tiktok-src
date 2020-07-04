package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p022v4.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.C13877ab;
import com.facebook.internal.C13877ab.C13882a;
import com.facebook.internal.C13877ab.C13884c;
import com.facebook.internal.C13967z;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.login.LoginClient.Request;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<WebViewLoginMethodHandler> CREATOR = new Creator<WebViewLoginMethodHandler>() {
        /* renamed from: a */
        private static WebViewLoginMethodHandler[] m41646a(int i) {
            return new WebViewLoginMethodHandler[i];
        }

        /* renamed from: a */
        private static WebViewLoginMethodHandler m41645a(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m41645a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m41646a(i);
        }
    };

    /* renamed from: c */
    private C13877ab f37242c;

    /* renamed from: d */
    private String f37243d;

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    static class C14098a extends C13882a {

        /* renamed from: f */
        private String f37246f;

        /* renamed from: g */
        private String f37247g;

        /* renamed from: h */
        private String f37248h = "fbconnect://success";

        /* renamed from: a */
        public final C13877ab mo33533a() {
            Bundle bundle = this.f36771e;
            bundle.putString("redirect_uri", this.f37248h);
            bundle.putString("client_id", this.f36768b);
            bundle.putString("e2e", this.f37246f);
            bundle.putString("response_type", "token,signed_request");
            bundle.putString("return_scopes", "true");
            bundle.putString("auth_type", this.f37247g);
            return C13877ab.m40990a(this.f36767a, "oauth", bundle, this.f36769c, this.f36770d);
        }

        /* renamed from: a */
        public final C14098a mo33824a(String str) {
            this.f37246f = str;
            return this;
        }

        /* renamed from: b */
        public final C14098a mo33826b(String str) {
            this.f37247g = str;
            return this;
        }

        /* renamed from: a */
        public final C14098a mo33825a(boolean z) {
            String str;
            if (z) {
                str = "fbconnect://chrome_os_success";
            } else {
                str = "fbconnect://success";
            }
            this.f37248h = str;
            return this;
        }

        public C14098a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo33721a() {
        return "web_view";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo33815d() {
        return true;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s_ */
    public final AccessTokenSource mo33727s_() {
        return AccessTokenSource.WEB_VIEW;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33762b() {
        if (this.f37242c != null) {
            this.f37242c.cancel();
            this.f37242c = null;
        }
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f37243d = parcel.readString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33724a(final Request request) {
        Bundle b = mo33819b(request);
        C140961 r1 = new C13884c() {
            /* renamed from: a */
            public final void mo33486a(Bundle bundle, FacebookException facebookException) {
                WebViewLoginMethodHandler.this.mo33820b(request, bundle, facebookException);
            }
        };
        this.f37243d = LoginClient.m41540h();
        mo33813a("e2e", this.f37243d);
        FragmentActivity a = this.f37240b.mo33770a();
        this.f37242c = new C14098a(a, request.f37203d, b).mo33824a(this.f37243d).mo33825a(C13967z.m41272e((Context) a)).mo33826b(request.f37207h).mo33532a(r1).mo33533a();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.mRetainInstance = true;
        facebookDialogFragment.f36723a = this.f37242c;
        facebookDialogFragment.show(a.getSupportFragmentManager(), "FacebookDialogFragment");
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f37243d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33820b(Request request, Bundle bundle, FacebookException facebookException) {
        super.mo33818a(request, bundle, facebookException);
    }
}
