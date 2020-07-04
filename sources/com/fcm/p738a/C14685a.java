package com.fcm.p738a;

import android.content.Context;
import com.google.android.gms.tasks.C17054c;
import com.google.android.gms.tasks.C17057f;
import com.google.firebase.iid.C18329b;
import com.google.firebase.iid.FirebaseInstanceId;
import com.p280ss.android.push.PushDependManager;
import com.p280ss.android.pushmanager.thirdparty.ISendTokenCallBack;

/* renamed from: com.fcm.a.a */
public final class C14685a {
    /* renamed from: a */
    public static void m42499a(final Context context, int i) {
        try {
            FirebaseInstanceId.m60321a().mo47189c().mo44285a((C17054c<TResult>) new C17054c<C18329b>(1) {
                /* renamed from: a */
                public final void mo37270a(C17057f<C18329b> fVar) {
                    if (fVar != null && fVar.mo44294b() && fVar.mo44296d() != null) {
                        C14685a.m42500a(context, ((C18329b) fVar.mo44296d()).mo47242a(), 1);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m42500a(Context context, final String str, int i) {
        try {
            m42501a(context, str, (ISendTokenCallBack) new ISendTokenCallBack() {
                public final int getType() {
                    return 5;
                }

                public final String getToken(Context context) {
                    return str;
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m42501a(Context context, String str, ISendTokenCallBack iSendTokenCallBack) {
        if (context != null) {
            try {
                PushDependManager.inst().sendToken(context.getApplicationContext(), iSendTokenCallBack);
            } catch (Throwable unused) {
            }
        }
    }
}
