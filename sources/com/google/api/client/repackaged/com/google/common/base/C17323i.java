package com.google.api.client.repackaged.com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.api.client.repackaged.com.google.common.base.i */
public final class C17323i {

    /* renamed from: a */
    public final C17303c f48204a;

    /* renamed from: b */
    public final boolean f48205b;

    /* renamed from: c */
    public final int f48206c;

    /* renamed from: d */
    private final C17327b f48207d;

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.i$a */
    static abstract class C17326a extends C17300b<String> {

        /* renamed from: b */
        final CharSequence f48210b;

        /* renamed from: c */
        final C17303c f48211c;

        /* renamed from: d */
        final boolean f48212d;

        /* renamed from: e */
        int f48213e;

        /* renamed from: f */
        int f48214f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract int mo44757a(int i);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract int mo44758b(int i);

        /* access modifiers changed from: private */
        /* renamed from: c */
        public String mo44743a() {
            int i;
            int i2 = this.f48213e;
            while (this.f48213e != -1) {
                int a = mo44757a(this.f48213e);
                if (a == -1) {
                    a = this.f48210b.length();
                    this.f48213e = -1;
                } else {
                    this.f48213e = mo44758b(a);
                }
                if (this.f48213e == i2) {
                    this.f48213e++;
                    if (this.f48213e >= this.f48210b.length()) {
                        this.f48213e = -1;
                    }
                } else {
                    while (i2 < a && this.f48211c.mo44751b(this.f48210b.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.f48211c.mo44751b(this.f48210b.charAt(i - 1))) {
                        a = i - 1;
                    }
                    if (!this.f48212d || i2 != i) {
                        if (this.f48214f == 1) {
                            i = this.f48210b.length();
                            this.f48213e = -1;
                            while (i > i2 && this.f48211c.mo44751b(this.f48210b.charAt(i - 1))) {
                                i--;
                            }
                        } else {
                            this.f48214f--;
                        }
                        return this.f48210b.subSequence(i2, i).toString();
                    }
                    i2 = this.f48213e;
                }
            }
            mo44744b();
            return null;
        }

        protected C17326a(C17323i iVar, CharSequence charSequence) {
            this.f48211c = iVar.f48204a;
            this.f48212d = iVar.f48205b;
            this.f48214f = iVar.f48206c;
            this.f48210b = charSequence;
        }
    }

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.i$b */
    interface C17327b {
        /* renamed from: a */
        Iterator<String> mo44756a(C17323i iVar, CharSequence charSequence);
    }

    /* renamed from: b */
    private Iterator<String> m57697b(CharSequence charSequence) {
        return this.f48207d.mo44756a(this, charSequence);
    }

    private C17323i(C17327b bVar) {
        this(bVar, false, C17303c.f48190m, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static C17323i m57695a(char c) {
        return m57696a(C17303c.m57645a(','));
    }

    /* renamed from: a */
    private static C17323i m57696a(final C17303c cVar) {
        C17321g.m57682a(cVar);
        return new C17323i(new C17327b() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public C17326a mo44756a(C17323i iVar, CharSequence charSequence) {
                return new C17326a(iVar, charSequence) {
                    /* access modifiers changed from: 0000 */
                    /* renamed from: b */
                    public final int mo44758b(int i) {
                        return i + 1;
                    }

                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final int mo44757a(int i) {
                        return cVar.mo44748a(this.f48210b, i);
                    }
                };
            }
        });
    }

    /* renamed from: a */
    public final List<String> mo44755a(CharSequence charSequence) {
        C17321g.m57682a(charSequence);
        Iterator b = m57697b(charSequence);
        ArrayList arrayList = new ArrayList();
        while (b.hasNext()) {
            arrayList.add(b.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private C17323i(C17327b bVar, boolean z, C17303c cVar, int i) {
        this.f48207d = bVar;
        this.f48205b = false;
        this.f48204a = cVar;
        this.f48206c = Integer.MAX_VALUE;
    }
}
