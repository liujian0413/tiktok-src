package com.facebook.keyframes.model;

import com.facebook.keyframes.model.KFAnimation.PropertyType;
import com.facebook.keyframes.model.keyframedmodels.C14057b;
import com.facebook.keyframes.p733b.C14010b;
import com.facebook.keyframes.p733b.C14011c;
import com.facebook.keyframes.p733b.C14013e;
import java.util.List;

/* renamed from: com.facebook.keyframes.model.c */
public final class C14035c {

    /* renamed from: a */
    public final int f37060a;

    /* renamed from: b */
    public final int f37061b;

    /* renamed from: c */
    public final List<KFAnimation> f37062c;

    /* renamed from: d */
    private final KFAnimation f37063d;

    /* renamed from: com.facebook.keyframes.model.c$a */
    public static class C14036a {

        /* renamed from: a */
        public int f37064a;

        /* renamed from: b */
        public int f37065b;

        /* renamed from: c */
        public List<KFAnimation> f37066c;

        /* renamed from: a */
        public final C14035c mo33692a() {
            return new C14035c(this.f37064a, this.f37065b, this.f37066c);
        }
    }

    /* renamed from: a */
    public final C14057b mo33691a() {
        if (this.f37063d == null) {
            return null;
        }
        return (C14057b) this.f37063d.f37051f;
    }

    public C14035c(int i, int i2, List<KFAnimation> list) {
        boolean z;
        Integer valueOf = Integer.valueOf(i);
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f37060a = ((Integer) C14011c.m41368a(valueOf, z, "group_id")).intValue();
        this.f37061b = i2;
        C14013e.m41372a(list, KFAnimation.f37046a);
        this.f37063d = C14010b.m41367a(list, PropertyType.ANCHOR_POINT);
        List a = C14013e.m41371a(list);
        if (list.size() > 0) {
            z2 = true;
        }
        this.f37062c = (List) C14011c.m41368a(a, z2, "animations");
    }
}
