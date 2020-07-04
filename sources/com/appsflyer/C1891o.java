package com.appsflyer;

import com.C1642a;

/* renamed from: com.appsflyer.o */
final class C1891o {

    /* renamed from: ˊ */
    public boolean f6835;

    /* renamed from: ˋ */
    private C1892a f6836;

    /* renamed from: ˎ */
    public String f6837;

    /* renamed from: com.appsflyer.o$a */
    enum C1892a {
        GOOGLE(0),
        AMAZON(1);
        

        /* renamed from: ॱ */
        private int f6841;

        public final String toString() {
            return String.valueOf(this.f6841);
        }

        private C1892a(int i) {
            this.f6841 = i;
        }
    }

    public final String toString() {
        return C1642a.m8034a("%s,%s", new Object[]{this.f6837, Boolean.valueOf(this.f6835)});
    }

    C1891o(C1892a aVar, String str, boolean z) {
        this.f6836 = aVar;
        this.f6837 = str;
        this.f6835 = z;
    }
}
