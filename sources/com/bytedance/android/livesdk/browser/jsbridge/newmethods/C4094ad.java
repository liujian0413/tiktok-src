package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.chatroom.event.C4410ab;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ad */
public final class C4094ad extends C11152c<C4095a, Object> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ad$a */
    public static final class C4095a {
        @C6593c(mo15949a = "type")

        /* renamed from: a */
        public final String f12081a;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f12081a, (java.lang.Object) ((com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4094ad.C4095a) r2).f12081a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4094ad.C4095a
                if (r0 == 0) goto L_0x0013
                com.bytedance.android.livesdk.browser.jsbridge.newmethods.ad$a r2 = (com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4094ad.C4095a) r2
                java.lang.String r0 = r1.f12081a
                java.lang.String r2 = r2.f12081a
                boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4094ad.C4095a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f12081a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(type=");
            sb.append(this.f12081a);
            sb.append(")");
            return sb.toString();
        }
    }

    public final void onTerminate() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(C4095a aVar, CallContext callContext) {
        C7573i.m23587b(aVar, "params");
        C7573i.m23587b(callContext, "context");
        String str = aVar.f12081a;
        if (str.hashCode() == -990193242 && str.equals("anchor_submit_success")) {
            C9097a.m27146a().mo22267a((Object) new C4410ab());
            finishWithSuccess();
            return;
        }
        finishWithFailure();
    }
}
