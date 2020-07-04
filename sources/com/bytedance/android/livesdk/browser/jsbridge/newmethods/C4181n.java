package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.p276a.C6593c;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.n */
public final class C4181n extends C11152c<C4182a, C4183b> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.n$a */
    public static final class C4182a {
        @C6593c(mo15949a = "type")

        /* renamed from: a */
        public final String f12238a;
        @C6593c(mo15949a = "title")

        /* renamed from: b */
        public final String f12239b;
        @C6593c(mo15949a = "text")

        /* renamed from: c */
        public final String f12240c;
        @C6593c(mo15949a = "left_button_text")

        /* renamed from: d */
        public final String f12241d;
        @C6593c(mo15949a = "left_button_text_color")

        /* renamed from: e */
        public final String f12242e;
        @C6593c(mo15949a = "right_button_text")

        /* renamed from: f */
        public final String f12243f;
        @C6593c(mo15949a = "right_button_text_color")

        /* renamed from: g */
        public final String f12244g;
        @C6593c(mo15949a = "corner_radius")

        /* renamed from: h */
        public final Float f12245h;

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f12245h, (java.lang.Object) r3.f12245h) != false) goto L_0x005b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x005b
                boolean r0 = r3 instanceof com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4181n.C4182a
                if (r0 == 0) goto L_0x0059
                com.bytedance.android.livesdk.browser.jsbridge.newmethods.n$a r3 = (com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4181n.C4182a) r3
                java.lang.String r0 = r2.f12238a
                java.lang.String r1 = r3.f12238a
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r2.f12239b
                java.lang.String r1 = r3.f12239b
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r2.f12240c
                java.lang.String r1 = r3.f12240c
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r2.f12241d
                java.lang.String r1 = r3.f12241d
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r2.f12242e
                java.lang.String r1 = r3.f12242e
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r2.f12243f
                java.lang.String r1 = r3.f12243f
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r2.f12244g
                java.lang.String r1 = r3.f12244g
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.Float r0 = r2.f12245h
                java.lang.Float r3 = r3.f12245h
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                if (r3 == 0) goto L_0x0059
                goto L_0x005b
            L_0x0059:
                r3 = 0
                return r3
            L_0x005b:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4181n.C4182a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f12238a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f12239b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f12240c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f12241d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f12242e;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f12243f;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.f12244g;
            int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            Float f = this.f12245h;
            if (f != null) {
                i = f.hashCode();
            }
            return hashCode7 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(type=");
            sb.append(this.f12238a);
            sb.append(", title=");
            sb.append(this.f12239b);
            sb.append(", text=");
            sb.append(this.f12240c);
            sb.append(", leftButtonText=");
            sb.append(this.f12241d);
            sb.append(", leftButtonTextColor=");
            sb.append(this.f12242e);
            sb.append(", rightButtonText=");
            sb.append(this.f12243f);
            sb.append(", rightButtonTextColor=");
            sb.append(this.f12244g);
            sb.append(", cornerRadius=");
            sb.append(this.f12245h);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.n$b */
    public static final class C4183b {
        @C6593c(mo15949a = "code")

        /* renamed from: a */
        public final int f12246a = 1;
        @C6593c(mo15949a = "action")

        /* renamed from: b */
        public final String f12247b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C4183b) {
                    C4183b bVar = (C4183b) obj;
                    if (!(this.f12246a == bVar.f12246a) || !C7573i.m23585a((Object) this.f12247b, (Object) bVar.f12247b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f12246a) * 31;
            String str = this.f12247b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(code=");
            sb.append(this.f12246a);
            sb.append(", action=");
            sb.append(this.f12247b);
            sb.append(")");
            return sb.toString();
        }

        public C4183b(int i, String str) {
            C7573i.m23587b(str, "action");
            this.f12247b = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.n$c */
    static final class C4184c extends Lambda implements C7563m<DialogInterface, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C4181n f12248a;

        /* renamed from: b */
        final /* synthetic */ C4182a f12249b;

        /* renamed from: c */
        final /* synthetic */ ObjectRef f12250c;

        C4184c(C4181n nVar, C4182a aVar, ObjectRef objectRef) {
            this.f12248a = nVar;
            this.f12249b = aVar;
            this.f12250c = objectRef;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m14286a((DialogInterface) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m14286a(DialogInterface dialogInterface, int i) {
            C7573i.m23587b(dialogInterface, "<anonymous parameter 0>");
            this.f12248a.finishWithResult(new C4183b(1, "right"));
            ((C7561a) this.f12250c.element).invoke();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.n$d */
    static final class C4185d extends Lambda implements C7563m<DialogInterface, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C4181n f12251a;

        /* renamed from: b */
        final /* synthetic */ C4182a f12252b;

        /* renamed from: c */
        final /* synthetic */ ObjectRef f12253c;

        C4185d(C4181n nVar, C4182a aVar, ObjectRef objectRef) {
            this.f12251a = nVar;
            this.f12252b = aVar;
            this.f12253c = objectRef;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m14287a((DialogInterface) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m14287a(DialogInterface dialogInterface, int i) {
            C7573i.m23587b(dialogInterface, "<anonymous parameter 0>");
            this.f12251a.finishWithResult(new C4183b(1, "left"));
            ((C7561a) this.f12253c.element).invoke();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.n$e */
    static final class C4186e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C9245h f12254a;

        C4186e(C9245h hVar) {
            this.f12254a = hVar;
            super(0);
        }

        /* renamed from: a */
        private void m14288a() {
            C9245h hVar = this.f12254a;
            if (hVar != null) {
                hVar.dismiss();
            }
        }

        public final /* synthetic */ Object invoke() {
            m14288a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.n$f */
    static final class C4187f extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        public static final C4187f f12255a = new C4187f();

        C4187f() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C7581n.f20898a;
        }
    }

    public final void onTerminate() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(C4182a aVar, CallContext callContext) {
        C7573i.m23587b(aVar, "params");
        C7573i.m23587b(callContext, "context");
        try {
            String str = aVar.f12238a;
            if (str.hashCode() == 951117504) {
                if (str.equals("confirm")) {
                    Context context = callContext.f30265a;
                    C7573i.m23582a((Object) context, "context.context");
                    m14283a(aVar, context);
                    return;
                }
            }
            finishWithFailure();
        } catch (Throwable th) {
            finishWithFailure();
            C8444d.m25673b();
            C8444d.m11969a(5, th.getStackTrace());
        }
    }

    /* renamed from: a */
    private final void m14283a(C4182a aVar, Context context) {
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = (C7561a) C4187f.f12255a;
        C9249a aVar2 = new C9249a(context, 4);
        String str = aVar.f12239b;
        if (str != null) {
            aVar2.mo22731d((CharSequence) str);
        }
        String str2 = aVar.f12240c;
        if (str2 != null) {
            aVar2.mo22727c((CharSequence) str2);
        }
        Float f = aVar.f12245h;
        if (f != null) {
            aVar2.mo22717a(f.floatValue());
        }
        aVar2.mo22716a(false);
        m14285a(aVar2, 0, aVar.f12243f, aVar.f12244g, new C4184c(this, aVar, objectRef));
        m14285a(aVar2, 1, aVar.f12241d, aVar.f12242e, new C4185d(this, aVar, objectRef));
        objectRef.element = (C7561a) new C4186e(aVar2.mo22729d());
    }

    /* renamed from: a */
    private static void m14285a(C9249a aVar, int i, String str, String str2, C7563m<? super DialogInterface, ? super Integer, C7581n> mVar) {
        boolean z;
        if (str != null) {
            CharSequence charSequence = str;
            if (charSequence.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                SpannableString spannableString = new SpannableString(charSequence);
                if (str2 != null) {
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str2)), 0, spannableString.length(), 33);
                }
                aVar.mo22723b(i, (CharSequence) spannableString, (OnClickListener) new C4188o(mVar));
            }
        }
    }
}
