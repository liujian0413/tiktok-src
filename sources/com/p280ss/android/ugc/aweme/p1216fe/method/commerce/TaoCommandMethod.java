package com.p280ss.android.ugc.aweme.p1216fe.method.commerce;

import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.TaoCommandMethod */
public final class TaoCommandMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27968a f73670a = new C27968a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.TaoCommandMethod$a */
    public static final class C27968a {
        private C27968a() {
        }

        public /* synthetic */ C27968a(C7571f fVar) {
            this();
        }
    }

    public TaoCommandMethod() {
        this(null, 1, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023 A[Catch:{ Exception -> 0x002c }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m91547c() {
        /*
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ Exception -> 0x002c }
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x002c }
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch:{ Exception -> 0x002c }
            if (r0 == 0) goto L_0x0020
            android.content.ClipData r0 = r0.getPrimaryClip()     // Catch:{ Exception -> 0x002c }
            if (r0 == 0) goto L_0x0020
            r1 = 0
            android.content.ClipData$Item r0 = r0.getItemAt(r1)     // Catch:{ Exception -> 0x002c }
            if (r0 == 0) goto L_0x0020
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x002c }
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x002c }
            if (r0 != 0) goto L_0x002b
        L_0x0029:
            java.lang.String r0 = ""
        L_0x002b:
            return r0
        L_0x002c:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.commerce.TaoCommandMethod.m91547c():java.lang.String");
    }

    public TaoCommandMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("command", m91547c());
        aVar.mo71363a((Object) jSONObject2);
    }

    private /* synthetic */ TaoCommandMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
