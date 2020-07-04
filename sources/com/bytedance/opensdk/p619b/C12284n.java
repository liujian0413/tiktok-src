package com.bytedance.opensdk.p619b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.b.n */
public final class C12284n {

    /* renamed from: a */
    public static final C12284n f32623a = new C12284n();

    private C12284n() {
    }

    /* renamed from: a */
    public final List<String> mo30086a(Context context) {
        C7573i.m23587b(context, "context");
        String packageName = context.getPackageName();
        C7573i.m23582a((Object) packageName, "context.packageName");
        return m35716a(context, packageName);
    }

    /* renamed from: a */
    private static List<String> m35716a(Context context, String str) {
        boolean z;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "pkgName");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                C7573i.m23582a((Object) packageInfo, "context.packageManager.g…geManager.GET_SIGNATURES)");
                Signature[] signatureArr = packageInfo.signatures;
                boolean z2 = true;
                if (signatureArr != null) {
                    if (signatureArr.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    for (Signature byteArray : signatureArr) {
                        byte[] byteArray2 = byteArray.toByteArray();
                        C7573i.m23582a((Object) byteArray2, "signature.toByteArray()");
                        String a = C12279j.m35692a(byteArray2);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                }
            } catch (NameNotFoundException unused) {
                return arrayList;
            }
        }
        return arrayList;
    }
}
