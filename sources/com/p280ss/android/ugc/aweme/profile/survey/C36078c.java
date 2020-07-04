package com.p280ss.android.ugc.aweme.profile.survey;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.c */
public final class C36078c {
    @C6593c(mo15949a = "action_type")

    /* renamed from: a */
    public int f94321a;
    @C6593c(mo15949a = "dialog_id")

    /* renamed from: b */
    public int f94322b;
    @C6593c(mo15949a = "original_id")

    /* renamed from: c */
    public int f94323c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C36078c) {
                C36078c cVar = (C36078c) obj;
                if (this.f94321a == cVar.f94321a) {
                    if (this.f94322b == cVar.f94322b) {
                        if (this.f94323c == cVar.f94323c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f94321a * 31) + this.f94322b) * 31) + this.f94323c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurveyAnswer(actionType=");
        sb.append(this.f94321a);
        sb.append(", dialogId=");
        sb.append(this.f94322b);
        sb.append(", originalId=");
        sb.append(this.f94323c);
        sb.append(")");
        return sb.toString();
    }

    public C36078c(int i, int i2, int i3) {
        this.f94321a = i;
        this.f94322b = i2;
        this.f94323c = i3;
    }
}
