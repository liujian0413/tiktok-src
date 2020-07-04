package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.C13953v;
import com.facebook.login.LoginClient.Request;
import java.util.Collection;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<FacebookLiteLoginMethodHandler> CREATOR = new Creator<FacebookLiteLoginMethodHandler>() {
        /* renamed from: a */
        private static FacebookLiteLoginMethodHandler[] m41515a(int i) {
            return new FacebookLiteLoginMethodHandler[i];
        }

        /* renamed from: a */
        private static FacebookLiteLoginMethodHandler m41514a(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m41514a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m41515a(i);
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo33721a() {
        return "fb_lite_login";
    }

    public int describeContents() {
        return 0;
    }

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33724a(Request request) {
        String h = LoginClient.m41540h();
        Intent a = C13953v.m41158a((Context) this.f37240b.mo33770a(), request.f37203d, (Collection<String>) request.f37201b, h, request.f37205f, request.mo33786a(), request.f37202c, mo33811a(request.f37204e), request.f37207h);
        mo33813a("e2e", h);
        return mo33816a(a, LoginClient.m41535b());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
