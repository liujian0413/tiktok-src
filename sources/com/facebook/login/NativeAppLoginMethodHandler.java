package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.C13966y;
import com.facebook.internal.C13967z;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo33724a(Request request);

    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: a */
    private static String m41624a(Bundle bundle) {
        String string = bundle.getString("error");
        if (string == null) {
            return bundle.getString("error_type");
        }
        return string;
    }

    /* renamed from: b */
    private static String m41626b(Bundle bundle) {
        String string = bundle.getString("error_message");
        if (string == null) {
            return bundle.getString("error_description");
        }
        return string;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo33816a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.f37240b.f37192c.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private Result m41625b(Request request, Intent intent) {
        String str;
        Bundle extras = intent.getExtras();
        String a = m41624a(extras);
        if (extras.get("error_code") != null) {
            str = extras.get("error_code").toString();
        } else {
            str = null;
        }
        if ("CONNECTION_FAILURE".equals(str)) {
            return Result.m41566a(request, a, m41626b(extras), str);
        }
        return Result.m41564a(request, a);
    }

    /* renamed from: a */
    private Result m41623a(Request request, Intent intent) {
        String str;
        Bundle extras = intent.getExtras();
        String a = m41624a(extras);
        if (extras.get("error_code") != null) {
            str = extras.get("error_code").toString();
        } else {
            str = null;
        }
        String b = m41626b(extras);
        String string = extras.getString("e2e");
        if (!C13967z.m41249a(string)) {
            mo33814b(string);
        }
        if (a == null && str == null && b == null) {
            try {
                return Result.m41563a(request, m41611a(request.f37201b, extras, AccessTokenSource.FACEBOOK_APPLICATION_WEB, request.f37203d));
            } catch (FacebookException e) {
                return Result.m41565a(request, null, e.getMessage());
            }
        } else if (C13966y.f36941a.contains(a)) {
            return null;
        } else {
            if (C13966y.f36942b.contains(a)) {
                return Result.m41564a(request, (String) null);
            }
            return Result.m41566a(request, a, b, str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33723a(int i, int i2, Intent intent) {
        Result result;
        Request request = this.f37240b.f37196g;
        if (intent == null) {
            result = Result.m41564a(request, "Operation canceled");
        } else if (i2 == 0) {
            result = m41625b(request, intent);
        } else if (i2 != -1) {
            result = Result.m41565a(request, "Unexpected resultCode from authorization.", null);
        } else {
            result = m41623a(request, intent);
        }
        if (result != null) {
            this.f37240b.mo33773a(result);
        } else {
            this.f37240b.mo33779e();
        }
        return true;
    }
}
