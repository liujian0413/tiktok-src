package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.chatroom.event.C4419ak;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.google.gson.p276a.C6593c;
import java.util.Iterator;
import java.util.Map;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.sequences.C7605h;
import org.json.JSONObject;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.m */
public final class C4176m extends C11152c<C4177a, Object> {

    /* renamed from: a */
    private final C47562b f12228a = new C47562b();

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$a */
    public static final class C4177a {
        @C6593c(mo15949a = "type")

        /* renamed from: a */
        public final String f12229a;
        @C6593c(mo15949a = "content")

        /* renamed from: b */
        public final String f12230b;
        @C6593c(mo15949a = "sender")

        /* renamed from: c */
        public final String f12231c;
        @C6593c(mo15949a = "args")

        /* renamed from: d */
        public final JSONObject f12232d;

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f12232d, (java.lang.Object) r3.f12232d) != false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0033
                boolean r0 = r3 instanceof com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4176m.C4177a
                if (r0 == 0) goto L_0x0031
                com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$a r3 = (com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4176m.C4177a) r3
                java.lang.String r0 = r2.f12229a
                java.lang.String r1 = r3.f12229a
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.lang.String r0 = r2.f12230b
                java.lang.String r1 = r3.f12230b
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.lang.String r0 = r2.f12231c
                java.lang.String r1 = r3.f12231c
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0031
                org.json.JSONObject r0 = r2.f12232d
                org.json.JSONObject r3 = r3.f12232d
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                if (r3 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r3 = 0
                return r3
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4176m.C4177a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f12229a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f12230b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f12231c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            JSONObject jSONObject = this.f12232d;
            if (jSONObject != null) {
                i = jSONObject.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(type=");
            sb.append(this.f12229a);
            sb.append(", content=");
            sb.append(this.f12230b);
            sb.append(", sender=");
            sb.append(this.f12231c);
            sb.append(", args=");
            sb.append(this.f12232d);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$b */
    static final class C4178b extends Lambda implements C7562b<String, Pair<? extends String, ? extends Object>> {

        /* renamed from: a */
        final /* synthetic */ JSONObject f12233a;

        C4178b(JSONObject jSONObject) {
            this.f12233a = jSONObject;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<String, Object> invoke(String str) {
            return C7579l.m23633a(str, this.f12233a.get(str));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$c */
    static final class C4179c<T> implements C7328l<C4419ak> {

        /* renamed from: a */
        final /* synthetic */ C4176m f12234a;

        /* renamed from: b */
        final /* synthetic */ ISendCommentEvent f12235b;

        C4179c(C4176m mVar, ISendCommentEvent iSendCommentEvent) {
            this.f12234a = mVar;
            this.f12235b = iSendCommentEvent;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean mo9283a(C4419ak akVar) {
            C7573i.m23587b(akVar, "it");
            if (akVar.f12842a == this.f12235b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$d */
    static final class C4180d<T> implements C7326g<C4419ak> {

        /* renamed from: a */
        final /* synthetic */ C4176m f12236a;

        /* renamed from: b */
        final /* synthetic */ ISendCommentEvent f12237b;

        C4180d(C4176m mVar, ISendCommentEvent iSendCommentEvent) {
            this.f12236a = mVar;
            this.f12237b = iSendCommentEvent;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C4419ak akVar) {
            if (akVar.f12843b) {
                this.f12236a.finishWithSuccess();
            } else {
                this.f12236a.finishWithFailure();
            }
        }
    }

    public final void onTerminate() {
        this.f12228a.dispose();
    }

    /* renamed from: a */
    private static Map<String, Object> m14277a(JSONObject jSONObject) {
        Iterator keys = jSONObject.keys();
        C7573i.m23582a((Object) keys, "keys()");
        return C7507ae.m23391a(C7605h.m23659d(C7605h.m23637a(keys), new C4178b(jSONObject)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r0 == null) goto L_0x0030;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invoke(com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4176m.C4177a r5, com.bytedance.ies.web.jsbridge2.CallContext r6) {
        /*
            r4 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            java.lang.String r6 = r5.f12231c
            if (r6 != 0) goto L_0x000f
            goto L_0x0024
        L_0x000f:
            int r0 = r6.hashCode()
            r1 = 354670409(0x1523d749, float:3.3087418E-26)
            if (r0 == r1) goto L_0x0019
            goto L_0x0024
        L_0x0019:
            java.lang.String r0 = "lottery"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0024
            com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender r6 = com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent.Sender.Lottery
            goto L_0x0026
        L_0x0024:
            com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender r6 = com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent.Sender.Unknown
        L_0x0026:
            org.json.JSONObject r0 = r5.f12232d
            if (r0 == 0) goto L_0x0030
            java.util.Map r0 = m14277a(r0)
            if (r0 != 0) goto L_0x0034
        L_0x0030:
            java.util.Map r0 = kotlin.collections.C7507ae.m23387a()
        L_0x0034:
            java.lang.String r1 = r5.f12229a
            int r2 = r1.hashCode()
            r3 = -333150752(0xffffffffec2485e0, float:-7.955842E26)
            if (r2 == r3) goto L_0x0056
            r3 = 3556653(0x36452d, float:4.983932E-39)
            if (r2 != r3) goto L_0x0094
            java.lang.String r2 = "text"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0094
            com.bytedance.android.livesdk.chatroom.event.al r1 = new com.bytedance.android.livesdk.chatroom.event.al
            java.lang.String r5 = r5.f12230b
            r1.<init>(r5, r6, r0)
            com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent r1 = (com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent) r1
            goto L_0x0067
        L_0x0056:
            java.lang.String r2 = "barrage"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0094
            com.bytedance.android.livesdk.chatroom.event.aj r1 = new com.bytedance.android.livesdk.chatroom.event.aj
            java.lang.String r5 = r5.f12230b
            r1.<init>(r5, r6, r0)
            com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent r1 = (com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent) r1
        L_0x0067:
            com.bytedance.android.livesdk.v.a r5 = com.bytedance.android.livesdk.p427v.C9097a.m27146a()
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.ak> r6 = com.bytedance.android.livesdk.chatroom.event.C4419ak.class
            io.reactivex.s r6 = r5.mo22266a(r6)
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$c r0 = new com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$c
            r0.<init>(r4, r1)
            io.reactivex.d.l r0 = (p346io.reactivex.p348d.C7328l) r0
            io.reactivex.s r6 = r6.mo19291a(r0)
            io.reactivex.k r6 = r6.mo19319e()
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$d r0 = new com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$d
            r0.<init>(r4, r1)
            io.reactivex.d.g r0 = (p346io.reactivex.p348d.C7326g) r0
            io.reactivex.b.c r6 = r6.mo19279d(r0)
            io.reactivex.b.b r0 = r4.f12228a
            r0.mo119661a(r6)
            r5.mo22267a(r1)
            return
        L_0x0094:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "unsupported comment type"
            r5.<init>(r6)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4176m.invoke(com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$a, com.bytedance.ies.web.jsbridge2.CallContext):void");
    }
}
