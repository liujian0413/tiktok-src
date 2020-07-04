package com.p280ss.android.ugc.aweme.property;

import com.p280ss.android.ugc.aweme.property.PropertyStore.C36952a;
import com.p280ss.android.ugc.aweme.utils.C42909a;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.property.c */
public class C36957c {

    /* renamed from: b */
    public final String f96848b = this.f96853g.f96888a;

    /* renamed from: c */
    public final String f96849c = this.f96853g.f96889b;

    /* renamed from: d */
    public final String f96850d;

    /* renamed from: e */
    public final String f96851e;

    /* renamed from: f */
    public final C36952a f96852f;

    /* renamed from: g */
    public final C36981p f96853g;

    /* renamed from: a */
    public final String mo93381a() {
        if (!C42909a.m136237b(this.f96849c.charAt(0))) {
            return "zzzzzzzzzzzzzzz";
        }
        String b = C42909a.m136236b(String.valueOf(this.f96849c.charAt(0)));
        C7573i.m23582a((Object) b, "AVCharacterUtil.hanziToP…chineseKey[0].toString())");
        return b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ItemBean(property=");
        sb.append(this.f96852f.key());
        sb.append(", abMoreMessage=");
        sb.append(this.f96853g);
        sb.append(')');
        return sb.toString();
    }

    public C36957c(C36952a aVar, C36981p pVar) {
        C7573i.m23587b(aVar, "property");
        C7573i.m23587b(pVar, "AbMoreMessage");
        this.f96852f = aVar;
        this.f96853g = pVar;
        String key = this.f96852f.key();
        C7573i.m23582a((Object) key, "property.key()");
        this.f96850d = key;
        StringBuilder sb = new StringBuilder("\n        Key:");
        sb.append(this.f96852f.key());
        sb.append("\n        中文名:");
        sb.append(this.f96853g.f96889b);
        sb.append("\n        Owner:");
        sb.append(this.f96853g.f96888a);
        sb.append("\n        参数意义:");
        sb.append(this.f96853g.f96890c);
        sb.append("\n        开始时间:");
        sb.append(this.f96853g.f96891d);
        sb.append("\n        其他补充:");
        sb.append(this.f96853g.f96893f);
        sb.append("\n    ");
        this.f96851e = C7634n.m23692a(sb.toString());
    }
}
