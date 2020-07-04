package com.p280ss.android.ugc.aweme.comment.api;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.common.utility.C6312h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.comment.api.a */
public final class C24084a {

    /* renamed from: a */
    public static final C24084a f63696a = new C24084a();

    /* renamed from: com.ss.android.ugc.aweme.comment.api.a$a */
    static final class C24085a implements OnClickListener {

        /* renamed from: a */
        public static final C24085a f63697a = new C24085a();

        C24085a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    private C24084a() {
    }

    /* renamed from: a */
    public static final boolean m79026a(Context context, Exception exc, int i) {
        return m79027a(context, exc, i, false);
    }

    /* renamed from: a */
    private static void m79025a(Exception exc) {
        Exception exc2;
        Object obj;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", "comment/publish");
            String str = "errorCode";
            if (!(exc instanceof ApiServerException)) {
                exc2 = null;
            } else {
                exc2 = exc;
            }
            ApiServerException apiServerException = (ApiServerException) exc2;
            if (apiServerException != null) {
                obj = Integer.valueOf(apiServerException.getErrorCode());
            } else {
                obj = String.valueOf(exc);
            }
            jSONObject.put(str, obj);
            if (exc instanceof ApiServerException) {
                jSONObject.put("prompt", ((ApiServerException) exc).getPrompt());
                jSONObject.put("errorDesc", ((ApiServerException) exc).getErrorMsg());
            }
            C6893q.m21452b("api_error_web_return_log", "", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m79023a(Context context, int i) {
        C7573i.m23587b(context, "context");
        if (i != 0) {
            String string = context.getResources().getString(i);
            C7573i.m23582a((Object) string, "msg");
            m79024a(context, string);
        }
    }

    /* renamed from: a */
    private static void m79024a(Context context, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "msg");
        try {
            C10761a.m31403c(context, str).mo25750a();
        } catch (Exception e) {
            C6312h.m19577a((Throwable) e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b1, code lost:
        if (android.text.TextUtils.isEmpty(r0.getPrompt()) != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b3, code lost:
        r5 = r0.getPrompt();
        kotlin.jvm.internal.C7573i.m23582a((java.lang.Object) r5, "exception.prompt");
        m79024a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        if (android.text.TextUtils.isEmpty(r0.getErrorMsg()) != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        r5 = r0.getErrorMsg();
        kotlin.jvm.internal.C7573i.m23582a((java.lang.Object) r5, "exception.errorMsg");
        m79024a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        f63696a.m79023a(r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00de, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0110, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m79027a(android.content.Context r4, java.lang.Exception r5, int r6, boolean r7) {
        /*
            m79025a(r5)
            if (r4 != 0) goto L_0x0009
            android.content.Context r4 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
        L_0x0009:
            boolean r0 = r5 instanceof com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException
            r1 = 0
            if (r0 != 0) goto L_0x0014
            com.ss.android.ugc.aweme.comment.api.a r5 = f63696a
            r5.m79023a(r4, r6)
            return r1
        L_0x0014:
            r0 = r5
            com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException r0 = (com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException) r0
            int r2 = r0.getErrorCode()
            r3 = 1
            switch(r2) {
                case 8: goto L_0x00df;
                case 9: goto L_0x00a7;
                default: goto L_0x001f;
            }
        L_0x001f:
            switch(r2) {
                case 2055: goto L_0x00a7;
                case 2056: goto L_0x00a7;
                default: goto L_0x0022;
            }
        L_0x0022:
            switch(r2) {
                case 2146: goto L_0x00a7;
                case 2147: goto L_0x00a7;
                case 2148: goto L_0x00a7;
                default: goto L_0x0025;
            }
        L_0x0025:
            switch(r2) {
                case 3055: goto L_0x00a7;
                case 3056: goto L_0x00a7;
                case 3057: goto L_0x00a7;
                case 3058: goto L_0x00a6;
                case 3059: goto L_0x00a6;
                default: goto L_0x0028;
            }
        L_0x0028:
            switch(r2) {
                case 5051: goto L_0x00a7;
                case 5052: goto L_0x00a7;
                case 5053: goto L_0x00a7;
                case 5054: goto L_0x00a7;
                case 5055: goto L_0x00a7;
                case 5056: goto L_0x00a7;
                case 5057: goto L_0x00a7;
                default: goto L_0x002b;
            }
        L_0x002b:
            switch(r2) {
                case 5: goto L_0x00a7;
                case 13: goto L_0x00a7;
                case 19: goto L_0x00a7;
                case 22: goto L_0x00a7;
                case 100: goto L_0x00a7;
                case 1001: goto L_0x006b;
                case 2053: goto L_0x00a7;
                case 2084: goto L_0x00a7;
                case 2152: goto L_0x00a7;
                case 2155: goto L_0x00a6;
                case 2209: goto L_0x00a7;
                case 2554: goto L_0x00a7;
                case 3050: goto L_0x00a7;
                case 3220: goto L_0x00a7;
                case 5049: goto L_0x00a7;
                default: goto L_0x002e;
            }
        L_0x002e:
            if (r7 == 0) goto L_0x0110
            java.lang.String r5 = r0.getPrompt()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x004a
            java.lang.String r5 = r0.getPrompt()
            java.lang.String r6 = "exception.prompt"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            m79024a(r4, r5)
            goto L_0x0110
        L_0x004a:
            java.lang.String r5 = r0.getErrorMsg()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0064
            java.lang.String r5 = r0.getErrorMsg()
            java.lang.String r6 = "exception.errorMsg"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            m79024a(r4, r5)
            goto L_0x0110
        L_0x0064:
            com.ss.android.ugc.aweme.comment.api.a r5 = f63696a
            r5.m79023a(r4, r6)
            goto L_0x0110
        L_0x006b:
            com.bytedance.ies.uikit.dialog.b$a r6 = new com.bytedance.ies.uikit.dialog.b$a     // Catch:{ Exception -> 0x00a5 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x00a5 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a5 }
            r7.<init>()     // Catch:{ Exception -> 0x00a5 }
            com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException r5 = (com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException) r5     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r5 = r5.getErrorMsg()     // Catch:{ Exception -> 0x00a5 }
            r7.append(r5)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r5 = ","
            r7.append(r5)     // Catch:{ Exception -> 0x00a5 }
            r5 = 2131824698(0x7f11103a, float:1.9282231E38)
            java.lang.String r4 = r4.getString(r5)     // Catch:{ Exception -> 0x00a5 }
            r7.append(r4)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r4 = r7.toString()     // Catch:{ Exception -> 0x00a5 }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x00a5 }
            com.bytedance.ies.uikit.dialog.b$a r4 = r6.mo26647b(r4)     // Catch:{ Exception -> 0x00a5 }
            r5 = 2131825294(0x7f11128e, float:1.928344E38)
            com.ss.android.ugc.aweme.comment.api.a$a r6 = com.p280ss.android.ugc.aweme.comment.api.C24084a.C24085a.f63697a     // Catch:{ Exception -> 0x00a5 }
            android.content.DialogInterface$OnClickListener r6 = (android.content.DialogInterface.OnClickListener) r6     // Catch:{ Exception -> 0x00a5 }
            com.bytedance.ies.uikit.dialog.b$a r4 = r4.mo26635a(r5, r6)     // Catch:{ Exception -> 0x00a5 }
            r4.mo26649b()     // Catch:{ Exception -> 0x00a5 }
        L_0x00a5:
            return r3
        L_0x00a6:
            return r1
        L_0x00a7:
            java.lang.String r5 = r0.getPrompt()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00c0
            java.lang.String r5 = r0.getPrompt()
            java.lang.String r6 = "exception.prompt"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            m79024a(r4, r5)
            goto L_0x00de
        L_0x00c0:
            java.lang.String r5 = r0.getErrorMsg()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00d9
            java.lang.String r5 = r0.getErrorMsg()
            java.lang.String r6 = "exception.errorMsg"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            m79024a(r4, r5)
            goto L_0x00de
        L_0x00d9:
            com.ss.android.ugc.aweme.comment.api.a r5 = f63696a
            r5.m79023a(r4, r6)
        L_0x00de:
            return r3
        L_0x00df:
            android.app.Activity r5 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()
            if (r5 == 0) goto L_0x0108
            android.content.Context r4 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            r5 = 2131821809(0x7f1104f1, float:1.9276372E38)
            java.lang.String r4 = r4.getString(r5)
            android.app.Activity r5 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()
            java.lang.String r6 = "comment_net_exception"
            java.lang.String r7 = "system_auto"
            com.ss.android.ugc.aweme.utils.ab r0 = com.p280ss.android.ugc.aweme.utils.C42914ab.m136242a()
            java.lang.String r2 = "login_title"
            com.ss.android.ugc.aweme.utils.ab r4 = r0.mo104633a(r2, r4)
            android.os.Bundle r4 = r4.f111445a
            com.p280ss.android.ugc.aweme.login.C32656f.m105743a(r5, r6, r7, r4)
            goto L_0x0110
        L_0x0108:
            com.ss.android.ugc.aweme.comment.api.a r5 = f63696a
            r6 = 2131829279(0x7f11221f, float:1.9291523E38)
            r5.m79023a(r4, r6)
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.api.C24084a.m79027a(android.content.Context, java.lang.Exception, int, boolean):boolean");
    }
}
