package com.twitter.sdk.android.tweetui.internal.p1847a;

/* renamed from: com.twitter.sdk.android.tweetui.internal.a.b */
public final class C47066b {

    /* renamed from: a */
    public int f120783a;

    /* renamed from: b */
    private C47067a[] f120784b;

    /* renamed from: c */
    private int f120785c;

    /* renamed from: d */
    private float f120786d;

    /* renamed from: com.twitter.sdk.android.tweetui.internal.a.b$a */
    static class C47067a {

        /* renamed from: a */
        public final int f120787a;

        /* renamed from: b */
        public int f120788b;

        /* renamed from: c */
        public Object f120789c;

        /* renamed from: d */
        public C47067a f120790d;

        protected C47067a(int i, int i2, Object obj, C47067a aVar) {
            this.f120787a = i;
            this.f120788b = i2;
            this.f120789c = obj;
            this.f120790d = aVar;
        }
    }

    public C47066b() {
        this(20, 0.75f);
    }

    /* renamed from: a */
    private void m147161a() {
        int length = this.f120784b.length;
        C47067a[] aVarArr = this.f120784b;
        int i = (length * 2) + 1;
        C47067a[] aVarArr2 = new C47067a[i];
        this.f120785c = (int) (((float) i) * this.f120786d);
        this.f120784b = aVarArr2;
        while (true) {
            int i2 = length - 1;
            if (length > 0) {
                C47067a aVar = aVarArr[i2];
                while (aVar != null) {
                    C47067a aVar2 = aVar.f120790d;
                    int i3 = (aVar.f120787a & Integer.MAX_VALUE) % i;
                    aVar.f120790d = aVarArr2[i3];
                    aVarArr2[i3] = aVar;
                    aVar = aVar2;
                }
                length = i2;
            } else {
                return;
            }
        }
    }

    private C47066b(int i, float f) {
        this.f120786d = 0.75f;
        this.f120784b = new C47067a[20];
        this.f120785c = 15;
    }

    /* renamed from: a */
    public final Object mo118333a(int i, Object obj) {
        C47067a[] aVarArr = this.f120784b;
        int i2 = Integer.MAX_VALUE & i;
        int length = i2 % aVarArr.length;
        for (C47067a aVar = aVarArr[length]; aVar != null; aVar = aVar.f120790d) {
            if (aVar.f120787a == i) {
                Object obj2 = aVar.f120789c;
                aVar.f120789c = obj;
                return obj2;
            }
        }
        if (this.f120783a >= this.f120785c) {
            m147161a();
            aVarArr = this.f120784b;
            length = i2 % aVarArr.length;
        }
        aVarArr[length] = new C47067a(i, i, obj, aVarArr[length]);
        this.f120783a++;
        return null;
    }
}
