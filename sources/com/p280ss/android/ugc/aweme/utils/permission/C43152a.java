package com.p280ss.android.ugc.aweme.utils.permission;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.utils.permission.PermissionViewModel.C43151a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.a */
public final class C43152a {

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.a$a */
    public interface C43154a {
        /* renamed from: a */
        void mo71375a();

        /* renamed from: b */
        void mo71376b();
    }

    /* renamed from: a */
    public static boolean m136872a(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m136870a(Activity activity, String str) {
        return m136871a((Context) activity, new String[]{str});
    }

    /* renamed from: b */
    private static List<String> m136873b(Context context, String... strArr) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (C0683b.m2909b(context, str) == -1) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m136871a(Context context, String[] strArr) {
        List b = m136873b(context, strArr);
        if (b == null || b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m136869a(Activity activity, String str, C43154a aVar) {
        m136866a(activity, 1001, str, aVar);
    }

    /* renamed from: a */
    private static void m136866a(Activity activity, int i, String str, C43154a aVar) {
        m136867a(activity, 1001, new String[]{str}, aVar);
    }

    /* renamed from: a */
    public static void m136867a(Activity activity, int i, String[] strArr, C43154a aVar) {
        if (activity != null) {
            PermissionViewModel permissionViewModel = (PermissionViewModel) C0069x.m159a((FragmentActivity) activity).mo147a(PermissionViewModel.class);
            C43151a aVar2 = new C43151a();
            aVar2.f111780a = aVar;
            aVar2.f111781b = i;
            permissionViewModel.f111779a = aVar2;
            List b = m136873b(activity, strArr);
            if (b == null || b.isEmpty()) {
                if (aVar != null) {
                    aVar.mo71375a();
                }
                return;
            }
            ActivityCompat.m2241a(activity, (String[]) b.toArray(new String[b.size()]), i);
        }
    }

    /* renamed from: b */
    public static void m136874b(Activity activity, int i, String[] strArr, final C43154a aVar) {
        if (activity != null) {
            List b = m136873b(activity, strArr);
            if (b == null || b.isEmpty()) {
                aVar.mo71375a();
            } else {
                C22477b.m74364a(activity, strArr, new C22480b() {
                    /* renamed from: a */
                    public final void mo53549a(String[] strArr, int[] iArr) {
                        if (aVar != null) {
                            if (C43152a.m136872a(iArr)) {
                                aVar.mo71375a();
                                return;
                            }
                            aVar.mo71376b();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m136868a(Activity activity, int i, String[] strArr, int[] iArr) {
        C43151a aVar = ((PermissionViewModel) C0069x.m159a((FragmentActivity) activity).mo147a(PermissionViewModel.class)).f111779a;
        if (!(aVar == null || aVar.f111781b == -1 || i != aVar.f111781b || aVar.f111780a == null)) {
            if (m136872a(iArr)) {
                aVar.f111780a.mo71375a();
                return;
            }
            aVar.f111780a.mo71376b();
        }
    }
}
