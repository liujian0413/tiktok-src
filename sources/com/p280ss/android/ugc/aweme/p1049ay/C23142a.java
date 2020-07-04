package com.p280ss.android.ugc.aweme.p1049ay;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ay.a */
public final class C23142a {
    @C6593c(mo15949a = "dialog_id")

    /* renamed from: a */
    public int f61071a;
    @C6593c(mo15949a = "title")

    /* renamed from: b */
    public String f61072b;
    @C6593c(mo15949a = "question")

    /* renamed from: c */
    public String f61073c;
    @C6593c(mo15949a = "answer1")

    /* renamed from: d */
    public String f61074d;
    @C6593c(mo15949a = "answer2")

    /* renamed from: e */
    public String f61075e;
    @C6593c(mo15949a = "end_title")

    /* renamed from: f */
    public String f61076f;
    @C6593c(mo15949a = "end_sub_title")

    /* renamed from: g */
    public String f61077g;
    @C6593c(mo15949a = "orig_question")

    /* renamed from: h */
    public String f61078h;
    @C6593c(mo15949a = "original_id")

    /* renamed from: i */
    public int f61079i;
    @C6593c(mo15949a = "orig_answer1")

    /* renamed from: j */
    public String f61080j;
    @C6593c(mo15949a = "orig_answer2")

    /* renamed from: k */
    public String f61081k;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23142a) {
                C23142a aVar = (C23142a) obj;
                if ((this.f61071a == aVar.f61071a) && C7573i.m23585a((Object) this.f61072b, (Object) aVar.f61072b) && C7573i.m23585a((Object) this.f61073c, (Object) aVar.f61073c) && C7573i.m23585a((Object) this.f61074d, (Object) aVar.f61074d) && C7573i.m23585a((Object) this.f61075e, (Object) aVar.f61075e) && C7573i.m23585a((Object) this.f61076f, (Object) aVar.f61076f) && C7573i.m23585a((Object) this.f61077g, (Object) aVar.f61077g) && C7573i.m23585a((Object) this.f61078h, (Object) aVar.f61078h)) {
                    if (!(this.f61079i == aVar.f61079i) || !C7573i.m23585a((Object) this.f61080j, (Object) aVar.f61080j) || !C7573i.m23585a((Object) this.f61081k, (Object) aVar.f61081k)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f61071a * 31;
        String str = this.f61072b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f61073c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f61074d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f61075e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f61076f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f61077g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f61078h;
        int hashCode7 = (((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.f61079i) * 31;
        String str8 = this.f61080j;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f61081k;
        if (str9 != null) {
            i2 = str9.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurveyData(dialogId=");
        sb.append(this.f61071a);
        sb.append(", title=");
        sb.append(this.f61072b);
        sb.append(", question=");
        sb.append(this.f61073c);
        sb.append(", answer1=");
        sb.append(this.f61074d);
        sb.append(", answer2=");
        sb.append(this.f61075e);
        sb.append(", resultTitle=");
        sb.append(this.f61076f);
        sb.append(", resultDesc=");
        sb.append(this.f61077g);
        sb.append(", originalQuestion=");
        sb.append(this.f61078h);
        sb.append(", originId=");
        sb.append(this.f61079i);
        sb.append(", originAnswer1=");
        sb.append(this.f61080j);
        sb.append(", originAnswer2=");
        sb.append(this.f61081k);
        sb.append(")");
        return sb.toString();
    }
}
