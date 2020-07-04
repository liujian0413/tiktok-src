package com.p280ss.android.ugc.aweme.discover.mob.p1183a;

import com.p280ss.android.ugc.aweme.metrics.C33259d;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.a.b */
public final class C26777b extends C33259d {

    /* renamed from: a */
    private String f70623a;

    /* renamed from: b */
    private Integer f70624b = Integer.valueOf(0);

    /* renamed from: c */
    private String f70625c;

    /* renamed from: v */
    private String f70626v;

    /* renamed from: w */
    private String f70627w;

    /* renamed from: x */
    private String f70628x;

    public C26777b() {
        super("trending_show");
    }

    /* renamed from: a */
    public final void mo67592a() {
        String str;
        mo85248a("raw_query", this.f70625c, C33260a.f86770a);
        mo85248a("search_id", this.f70626v, C33260a.f86770a);
        mo85248a("impr_id", this.f70627w, C33260a.f86770a);
        mo85248a("log_pb", this.f70628x, C33260a.f86770a);
        mo85248a("rank", "-1", C33260a.f86770a);
        mo85248a("words_source", this.f70623a, C33260a.f86770a);
        String str2 = "words_num";
        Integer num = this.f70624b;
        if (num != null) {
            str = String.valueOf(num.intValue());
        } else {
            str = null;
        }
        mo85248a(str2, str, C33260a.f86770a);
    }

    /* renamed from: a */
    public final C26777b mo68551a(Integer num) {
        this.f70624b = num;
        return this;
    }

    /* renamed from: b */
    public final C26777b mo68553b(String str) {
        this.f70625c = str;
        return this;
    }

    /* renamed from: c */
    public final C26777b mo68554c(String str) {
        this.f70627w = str;
        return this;
    }

    /* renamed from: d */
    public final C26777b mo68555d(String str) {
        this.f70628x = str;
        return this;
    }

    /* renamed from: a */
    public final C26777b mo68552a(String str) {
        this.f70623a = str;
        return this;
    }
}
