package com.twitter.sdk.android.core.internal.p1845a;

import com.twitter.sdk.android.core.C46823d;
import com.twitter.sdk.android.core.C46825e;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.io.IOException;
import okhttp3.Authenticator;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.Route;

/* renamed from: com.twitter.sdk.android.core.internal.a.c */
public final class C46855c implements Authenticator {

    /* renamed from: a */
    final C46825e f120163a;

    public C46855c(C46825e eVar) {
        this.f120163a = eVar;
    }

    /* renamed from: c */
    private static boolean m146558c(Response response) {
        int i = 1;
        while (true) {
            response = response.priorResponse;
            if (response == null) {
                break;
            }
            i++;
        }
        if (i < 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private Request m146556a(Response response) {
        GuestAuthToken guestAuthToken;
        if (m146558c(response)) {
            C46823d a = this.f120163a.mo117912a(m146557b(response));
            if (a == null) {
                guestAuthToken = null;
            } else {
                guestAuthToken = (GuestAuthToken) a.f120356a;
            }
            if (guestAuthToken != null) {
                return m146555a(response.request, guestAuthToken);
            }
        }
        return null;
    }

    /* renamed from: b */
    private static C46823d m146557b(Response response) {
        Headers headers = response.request.headers;
        String str = headers.get("Authorization");
        String str2 = headers.get("x-guest-token");
        if (str == null || str2 == null) {
            return null;
        }
        return new C46823d(new GuestAuthToken("bearer", str.replace("bearer ", ""), str2));
    }

    public final Request authenticate(Route route, Response response) throws IOException {
        return m146556a(response);
    }

    /* renamed from: a */
    private static Request m146555a(Request request, GuestAuthToken guestAuthToken) {
        Builder newBuilder = request.newBuilder();
        C46853a.m146554a(newBuilder, guestAuthToken);
        return newBuilder.build();
    }
}
