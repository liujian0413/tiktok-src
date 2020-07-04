package com.p280ss.android.ugc.aweme.story.model;

/* renamed from: com.ss.android.ugc.aweme.story.model.d */
public final class C42005d {

    /* renamed from: a */
    public int f109115a;

    /* renamed from: b */
    public Object f109116b;

    /* renamed from: com.ss.android.ugc.aweme.story.model.d$a */
    public static class C42006a {

        /* renamed from: a */
        public final boolean f109117a;

        /* renamed from: b */
        public final int f109118b;

        /* renamed from: c */
        public final boolean f109119c;

        /* renamed from: d */
        public String f109120d;

        /* renamed from: e */
        public boolean f109121e;

        /* renamed from: f */
        public boolean f109122f;

        public C42006a(boolean z, int i, boolean z2, String str, boolean z3, boolean z4) {
            this.f109117a = z;
            this.f109118b = i;
            this.f109119c = z2;
            this.f109120d = str;
            this.f109121e = z3;
            this.f109122f = z4;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryObservingData{mType=");
        sb.append(this.f109115a);
        sb.append(", mArgs=");
        sb.append(this.f109116b);
        sb.append('}');
        return sb.toString();
    }

    public C42005d(int i, Object obj) {
        this.f109115a = i;
        this.f109116b = obj;
    }
}
