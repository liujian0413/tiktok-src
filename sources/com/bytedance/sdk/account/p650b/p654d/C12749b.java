package com.bytedance.sdk.account.p650b.p654d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.account.b.d.b */
public final class C12749b {
    /* renamed from: a */
    public static String m37037a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append((String) list.get(i));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List<String> m37038a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList();
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return null;
            }
            for (Signature byteArray : signatureArr) {
                arrayList.add(C12748a.m37036a(byteArray.toByteArray()));
            }
            return arrayList;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }
}
