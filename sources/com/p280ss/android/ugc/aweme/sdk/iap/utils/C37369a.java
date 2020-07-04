package com.p280ss.android.ugc.aweme.sdk.iap.utils;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.a */
public final class C37369a {

    /* renamed from: a */
    public int f97592a;

    /* renamed from: b */
    public String f97593b;

    /* renamed from: a */
    public final boolean mo94037a() {
        if (this.f97592a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo94038b() {
        if (!mo94037a()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IabResult: ");
        sb.append(this.f97593b);
        return sb.toString();
    }

    public C37369a(int i, String str) {
        this.f97592a = i;
        if (str == null || str.trim().length() == 0) {
            this.f97593b = IabHelper.m119935a(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (response: ");
        sb.append(IabHelper.m119935a(i));
        sb.append(")");
        this.f97593b = sb.toString();
    }
}
