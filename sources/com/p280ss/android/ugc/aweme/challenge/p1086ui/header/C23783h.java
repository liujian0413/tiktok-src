package com.p280ss.android.ugc.aweme.challenge.p1086ui.header;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.h */
public final class C23783h {

    /* renamed from: a */
    public HeaderType f62779a;

    /* renamed from: b */
    public AttrsType f62780b;

    /* renamed from: c */
    public ButtonType f62781c;

    /* renamed from: d */
    public String f62782d;

    /* renamed from: e */
    public String f62783e;

    public C23783h() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f62783e, (java.lang.Object) r3.f62783e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23783h
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.challenge.ui.header.h r3 = (com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23783h) r3
            com.ss.android.ugc.aweme.challenge.ui.header.HeaderType r0 = r2.f62779a
            com.ss.android.ugc.aweme.challenge.ui.header.HeaderType r1 = r3.f62779a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.challenge.ui.header.AttrsType r0 = r2.f62780b
            com.ss.android.ugc.aweme.challenge.ui.header.AttrsType r1 = r3.f62780b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.challenge.ui.header.ButtonType r0 = r2.f62781c
            com.ss.android.ugc.aweme.challenge.ui.header.ButtonType r1 = r3.f62781c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f62782d
            java.lang.String r1 = r3.f62782d
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f62783e
            java.lang.String r3 = r3.f62783e
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23783h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        HeaderType headerType = this.f62779a;
        int i = 0;
        int hashCode = (headerType != null ? headerType.hashCode() : 0) * 31;
        AttrsType attrsType = this.f62780b;
        int hashCode2 = (hashCode + (attrsType != null ? attrsType.hashCode() : 0)) * 31;
        ButtonType buttonType = this.f62781c;
        int hashCode3 = (hashCode2 + (buttonType != null ? buttonType.hashCode() : 0)) * 31;
        String str = this.f62782d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f62783e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderParam(headerType=");
        sb.append(this.f62779a);
        sb.append(", attrsType=");
        sb.append(this.f62780b);
        sb.append(", buttonType=");
        sb.append(this.f62781c);
        sb.append(", enterFrom=");
        sb.append(this.f62782d);
        sb.append(", processId=");
        sb.append(this.f62783e);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo61830a(AttrsType attrsType) {
        C7573i.m23587b(attrsType, "<set-?>");
        this.f62780b = attrsType;
    }

    /* renamed from: a */
    public final void mo61831a(ButtonType buttonType) {
        C7573i.m23587b(buttonType, "<set-?>");
        this.f62781c = buttonType;
    }

    /* renamed from: a */
    public final void mo61832a(HeaderType headerType) {
        C7573i.m23587b(headerType, "<set-?>");
        this.f62779a = headerType;
    }

    private C23783h(HeaderType headerType, AttrsType attrsType, ButtonType buttonType, String str, String str2) {
        C7573i.m23587b(headerType, "headerType");
        C7573i.m23587b(attrsType, "attrsType");
        C7573i.m23587b(buttonType, "buttonType");
        this.f62779a = headerType;
        this.f62780b = attrsType;
        this.f62781c = buttonType;
        this.f62782d = str;
        this.f62783e = str2;
    }

    public /* synthetic */ C23783h(HeaderType headerType, AttrsType attrsType, ButtonType buttonType, String str, String str2, int i, C7571f fVar) {
        String str3;
        String str4;
        if ((i & 1) != 0) {
            headerType = HeaderType.TYPE_NORMAL;
        }
        if ((i & 2) != 0) {
            attrsType = AttrsType.TYPE_LINK;
        }
        AttrsType attrsType2 = attrsType;
        if ((i & 4) != 0) {
            buttonType = ButtonType.TYPE_NORMAL;
        }
        ButtonType buttonType2 = buttonType;
        if ((i & 8) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 16) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        this(headerType, attrsType2, buttonType2, str3, str4);
    }
}
