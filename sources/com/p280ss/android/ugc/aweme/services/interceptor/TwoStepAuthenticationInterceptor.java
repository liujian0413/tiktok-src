package com.p280ss.android.ugc.aweme.services.interceptor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.util.ArrayMap;
import android.text.TextUtils;
import bolts.C1592h;
import bolts.C1606i;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.twostep.C21634f;
import com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity;
import com.p280ss.android.ugc.aweme.account.p943f.C21175b;
import com.p280ss.android.ugc.aweme.account.p943f.C21176c;
import com.p280ss.android.ugc.aweme.account.p950k.C21225a.C21226a;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor */
public final class TwoStepAuthenticationInterceptor implements IInterceptor {
    private Integer currentErrorCode;
    private String currentUrlPath;

    private final String getPathFromUrl(String str) {
        try {
            return new URI(str).getPath();
        } catch (NullPointerException | URISyntaxException unused) {
            return null;
        }
    }

    private final Integer getAuthType(Integer num) {
        if (num != null && num.intValue() == 2020) {
            return Integer.valueOf(2);
        }
        if (num != null && num.intValue() == 2032) {
            return Integer.valueOf(1);
        }
        if (num != null && num.intValue() == 2033) {
            return Integer.valueOf(4);
        }
        if (num != null && num.intValue() == 2025) {
            return Integer.valueOf(3);
        }
        if (num != null && num.intValue() == 2031) {
            return Integer.valueOf(5);
        }
        return null;
    }

    private final C1592h<C21176c> startTwoStepAuthentication(Context context, String str, String str2) {
        C1606i iVar = new C1606i();
        if (context == null || str2 == null) {
            StringBuilder sb = new StringBuilder("Activity or response is null, activity: ");
            sb.append(context);
            sb.append(", response: ");
            sb.append(str2);
            iVar.mo6902b(new Exception(sb.toString()));
            return iVar.f6010a;
        }
        Integer authType = getAuthType(this.currentErrorCode);
        if (authType == null) {
            StringBuilder sb2 = new StringBuilder("Failed to parse error code from JSON response: ");
            sb2.append(str2);
            iVar.mo6902b(new Exception(sb2.toString()));
            return iVar.f6010a;
        }
        C21634f.m72433a().mo57846a((C21175b) new TwoStepAuthenticationInterceptor$startTwoStepAuthentication$1(iVar));
        this.currentUrlPath = getPathFromUrl(str);
        Intent intent = new Intent(context, TwoStepAuthActivity.class);
        intent.putExtra("auth_type", authType.intValue());
        intent.putExtra("auth_data", str2);
        intent.putExtra("url_path", this.currentUrlPath);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
        return iVar.f6010a;
    }

    public final Map<String, String> tryToIntercept(String str, String str2, int i) {
        String str3;
        ArrayMap arrayMap = new ArrayMap();
        this.currentErrorCode = Integer.valueOf(i);
        C1592h startTwoStepAuthentication = startTwoStepAuthentication(C21671bd.m72532b(), str, str2);
        if (startTwoStepAuthentication == null) {
            return arrayMap;
        }
        startTwoStepAuthentication.mo6892g();
        C21176c cVar = (C21176c) startTwoStepAuthentication.mo6890e();
        if (TwoStepAuthenticationInterceptorKt.DEBUG) {
            StringBuilder sb = new StringBuilder("interceptAndGetNewParams, 2-step auth result: ");
            sb.append(cVar);
            if (cVar != null) {
                StringBuilder sb2 = new StringBuilder("ticket: ");
                sb2.append(cVar.f56945a);
                sb2.append(", profileKey: ");
                sb2.append(cVar.f56946b);
                sb2.append(", errorCode: ");
                sb2.append(cVar.f56947c);
                sb2.append(", errorMessage: ");
                sb2.append(cVar.f56948d);
                str3 = sb2.toString();
            } else {
                str3 = null;
            }
            sb.append(str3);
        }
        if (cVar == null || TextUtils.isEmpty(cVar.f56945a)) {
            return arrayMap;
        }
        if (!TextUtils.isEmpty(cVar.f56946b)) {
            arrayMap.put("profile_key", cVar.f56946b);
        }
        Map<String, String> map = arrayMap;
        map.put("verify_ticket", cVar.f56945a);
        C21226a.m71445a(this.currentUrlPath, this.currentErrorCode);
        return map;
    }
}
