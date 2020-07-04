package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.C13953v;
import com.facebook.login.LoginClient.Request;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<KatanaProxyLoginMethodHandler> CREATOR = new Creator<KatanaProxyLoginMethodHandler>() {
        /* renamed from: a */
        private static KatanaProxyLoginMethodHandler[] m41530a(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }

        /* renamed from: a */
        private static KatanaProxyLoginMethodHandler m41529a(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m41529a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m41530a(i);
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo33721a() {
        return "katana_proxy_auth";
    }

    public int describeContents() {
        return 0;
    }

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33724a(Request request) {
        String h = LoginClient.m41540h();
        Intent b = C13953v.m41171b(this.f37240b.mo33770a(), request.f37203d, request.f37201b, h, request.f37205f, request.mo33786a(), request.f37202c, mo33811a(request.f37204e), request.f37207h);
        mo33813a("e2e", h);
        return mo33816a(b, LoginClient.m41535b());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
