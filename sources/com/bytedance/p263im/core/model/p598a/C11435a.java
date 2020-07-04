package com.bytedance.p263im.core.model.p598a;

import android.text.TextUtils;

/* renamed from: com.bytedance.im.core.model.a.a */
public final class C11435a {

    /* renamed from: a */
    public String f30948a;

    /* renamed from: b */
    public int f30949b;

    /* renamed from: c */
    public String f30950c;

    /* renamed from: d */
    public String f30951d;

    /* renamed from: e */
    public String f30952e;

    /* renamed from: f */
    public String f30953f;

    /* renamed from: g */
    public String f30954g;

    /* renamed from: h */
    public String f30955h;

    /* renamed from: a */
    public final String mo27652a() {
        if (TextUtils.isEmpty(this.f30948a)) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f30950c)) {
                sb.append(this.f30950c);
                sb.append("|");
            }
            if (!TextUtils.isEmpty(this.f30951d)) {
                sb.append(this.f30951d);
                sb.append("|");
            }
            if (!TextUtils.isEmpty(this.f30952e)) {
                sb.append(this.f30952e);
                sb.append("|");
            }
            if (!TextUtils.isEmpty(this.f30953f)) {
                sb.append(this.f30953f);
                sb.append("|");
            }
            sb.append(this.f30949b);
            this.f30948a = sb.toString();
        }
        return this.f30948a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FTSEntity {combinedKey is ");
        sb.append(this.f30948a);
        sb.append(" , type is ");
        sb.append(this.f30949b);
        sb.append(" , conversationId is ");
        sb.append(this.f30950c);
        sb.append(" , messageUuid is ");
        sb.append(this.f30951d);
        sb.append(" , userId is ");
        sb.append(this.f30952e);
        sb.append(" , entityId is ");
        sb.append(this.f30953f);
        sb.append(" , searchContent is ");
        sb.append(this.f30954g);
        sb.append(" , extra is ");
        sb.append(this.f30955h);
        sb.append("}");
        return sb.toString();
    }
}
