package com.facebook.keyframes.p733b;

import com.C1642a;
import com.facebook.keyframes.C13981a;
import java.util.Locale;

/* renamed from: com.facebook.keyframes.b.f */
public abstract class C14014f {

    /* renamed from: a */
    final C14016a f37012a;

    /* renamed from: b */
    final float[] f37013b;

    /* renamed from: c */
    private float[] f37014c;

    /* renamed from: com.facebook.keyframes.b.f$a */
    enum C14016a {
        RELATIVE,
        ABSOLUTE
    }

    /* renamed from: com.facebook.keyframes.b.f$b */
    public static class C14017b extends C14014f {
        /* renamed from: a */
        public final void mo33670a(C13981a aVar) {
            mo33671a(aVar, this.f37012a, this.f37013b);
        }

        public C14017b(C14016a aVar, float[] fArr) {
            super(aVar, fArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33671a(C13981a aVar, C14016a aVar2, float[] fArr) {
            switch (aVar2) {
                case RELATIVE:
                    aVar.mo33644b(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                    return;
                case ABSOLUTE:
                    aVar.mo33640a(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                    return;
                default:
                    throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "No such argument format %s", new Object[]{aVar2}));
            }
        }
    }

    /* renamed from: com.facebook.keyframes.b.f$c */
    public static class C14018c extends C14014f {
        /* renamed from: a */
        public final void mo33670a(C13981a aVar) {
            mo33671a(aVar, this.f37012a, this.f37013b);
        }

        public C14018c(C14016a aVar, float[] fArr) {
            super(aVar, fArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33671a(C13981a aVar, C14016a aVar2, float[] fArr) {
            switch (aVar2) {
                case RELATIVE:
                    aVar.mo33647d(fArr[0], fArr[1]);
                    return;
                case ABSOLUTE:
                    aVar.mo33646c(fArr[0], fArr[1]);
                    return;
                default:
                    throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "No such argument format %s", new Object[]{aVar2}));
            }
        }
    }

    /* renamed from: com.facebook.keyframes.b.f$d */
    public static class C14019d extends C14014f {
        /* renamed from: a */
        public final void mo33670a(C13981a aVar) {
            mo33671a(aVar, this.f37012a, this.f37013b);
        }

        public C14019d(C14016a aVar, float[] fArr) {
            super(aVar, fArr);
        }

        /* renamed from: a */
        public final void mo33672a(C14014f fVar, float f, C13981a aVar) {
            if (fVar instanceof C14019d) {
                C14014f.super.mo33672a(fVar, f, aVar);
                return;
            }
            throw new IllegalArgumentException("MoveToCommand should only be interpolated with other instances of MoveToCommand");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33671a(C13981a aVar, C14016a aVar2, float[] fArr) {
            switch (aVar2) {
                case RELATIVE:
                    aVar.mo33642b(fArr[0], fArr[1]);
                    return;
                case ABSOLUTE:
                    aVar.mo33638a(fArr[0], fArr[1]);
                    return;
                default:
                    throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "No such argument format %s", new Object[]{aVar2}));
            }
        }
    }

    /* renamed from: com.facebook.keyframes.b.f$e */
    public static class C14020e extends C14014f {
        /* renamed from: a */
        public final void mo33670a(C13981a aVar) {
            mo33671a(aVar, this.f37012a, this.f37013b);
        }

        public C14020e(C14016a aVar, float[] fArr) {
            super(aVar, fArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33671a(C13981a aVar, C14016a aVar2, float[] fArr) {
            switch (aVar2) {
                case RELATIVE:
                    aVar.mo33643b(fArr[0], fArr[1], fArr[2], fArr[3]);
                    return;
                case ABSOLUTE:
                    aVar.mo33639a(fArr[0], fArr[1], fArr[2], fArr[3]);
                    return;
                default:
                    throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "No such argument format %s", new Object[]{aVar2}));
            }
        }
    }

    /* renamed from: com.facebook.keyframes.b.f$f */
    enum C14021f {
        m(C14016a.RELATIVE, 2),
        M(C14016a.ABSOLUTE, 2),
        q(C14016a.RELATIVE, 4),
        Q(C14016a.ABSOLUTE, 4),
        c(C14016a.RELATIVE, 6),
        C(C14016a.ABSOLUTE, 6),
        l(C14016a.RELATIVE, 2),
        L(C14016a.ABSOLUTE, 2);
        

        /* renamed from: i */
        public final C14016a f37029i;

        /* renamed from: j */
        public final int f37030j;

        private C14021f(C14016a aVar, int i) {
            this.f37029i = aVar;
            this.f37030j = i;
        }
    }

    /* renamed from: a */
    private static float m41373a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    private int m41374a() {
        return this.f37013b.length;
    }

    /* renamed from: a */
    public abstract void mo33670a(C13981a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33671a(C13981a aVar, C14016a aVar2, float[] fArr);

    /* renamed from: b */
    private float[] m41378b() {
        if (this.f37014c == null) {
            this.f37014c = new float[this.f37013b.length];
        }
        return this.f37014c;
    }

    /* renamed from: a */
    public static C14014f m41375a(String str) {
        C14021f valueOf = C14021f.valueOf(str.substring(0, 1));
        String[] split = str.substring(1).split(",");
        float[] fArr = new float[split.length];
        int length = split.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            fArr[i2] = Float.parseFloat(split[i]);
            i++;
            i2 = i3;
        }
        switch (valueOf) {
            case m:
            case M:
                if (m41376a(valueOf, fArr)) {
                    return new C14019d(valueOf.f37029i, fArr);
                }
                throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "VectorCommand MoveTo requires two arguments, but got %s", new Object[]{fArr.toString()}));
            case q:
            case Q:
                if (m41376a(valueOf, fArr)) {
                    return new C14020e(valueOf.f37029i, fArr);
                }
                throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "VectorCommand QuadraticTo requires four arguments, but got %s", new Object[]{fArr.toString()}));
            case c:
            case C:
                if (m41376a(valueOf, fArr)) {
                    return new C14017b(valueOf.f37029i, fArr);
                }
                throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "VectorCommand CubicTo requires six arguments, but got %s", new Object[]{fArr.toString()}));
            case l:
            case L:
                if (m41376a(valueOf, fArr)) {
                    return new C14018c(valueOf.f37029i, fArr);
                }
                throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "VectorCommand LineTo requires two arguments, but got %s", new Object[]{fArr.toString()}));
            default:
                throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "Unhandled vector command: %s", new Object[]{str}));
        }
    }

    public C14014f(C14016a aVar, float[] fArr) {
        this.f37012a = aVar;
        this.f37013b = fArr;
    }

    /* renamed from: a */
    private static boolean m41376a(C14021f fVar, float[] fArr) {
        if (fVar.f37030j == fArr.length) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052 A[LOOP:0: B:11:0x0050->B:12:0x0052, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33672a(com.facebook.keyframes.p733b.C14014f r9, float r10, com.facebook.keyframes.C13981a r11) {
        /*
            r8 = this;
            com.facebook.keyframes.b.f$a r0 = r8.f37012a
            com.facebook.keyframes.b.f$a r1 = r9.f37012a
            if (r0 != r1) goto L_0x0065
            int r0 = r8.m41374a()
            int r1 = r9.m41374a()
            if (r0 <= r1) goto L_0x0024
            float[] r0 = r8.f37013b
            float[] r1 = r11.f36970b
            float[] r9 = r9.f37013b
            float[] r2 = r8.m41378b()
            float[] r9 = m41377a(r1, r9, r2)
            float[] r1 = r8.m41378b()
        L_0x0022:
            r2 = r8
            goto L_0x004e
        L_0x0024:
            int r0 = r8.m41374a()
            int r1 = r9.m41374a()
            if (r0 >= r1) goto L_0x0045
            float[] r0 = r11.f36970b
            float[] r1 = r8.f37013b
            float[] r2 = r9.m41378b()
            float[] r0 = m41377a(r0, r1, r2)
            float[] r1 = r9.f37013b
            float[] r2 = r9.m41378b()
            r7 = r2
            r2 = r9
            r9 = r1
            r1 = r7
            goto L_0x004e
        L_0x0045:
            float[] r0 = r8.f37013b
            float[] r9 = r9.f37013b
            float[] r1 = r8.m41378b()
            goto L_0x0022
        L_0x004e:
            r3 = 0
            int r4 = r1.length
        L_0x0050:
            if (r3 >= r4) goto L_0x005f
            r5 = r0[r3]
            r6 = r9[r3]
            float r5 = m41373a(r5, r6, r10)
            r1[r3] = r5
            int r3 = r3 + 1
            goto L_0x0050
        L_0x005f:
            com.facebook.keyframes.b.f$a r9 = r8.f37012a
            r2.mo33671a(r11, r9, r1)
            return
        L_0x0065:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Argument format must match between interpolated commands. RELATIVE and ABSOLUTE coordinates should stay consistent"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.keyframes.p733b.C14014f.mo33672a(com.facebook.keyframes.b.f, float, com.facebook.keyframes.a):void");
    }

    /* renamed from: a */
    private static float[] m41377a(float[] fArr, float[] fArr2, float[] fArr3) {
        if (fArr2.length < fArr3.length) {
            if (fArr2.length == 2) {
                if (fArr3.length == 4) {
                    fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                    fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
                    fArr3[2] = fArr2[0];
                    fArr3[3] = fArr2[1];
                } else if (fArr3.length == 6) {
                    fArr3[0] = fArr[0] + ((fArr2[0] - fArr[0]) / 3.0f);
                    fArr3[1] = fArr[1] + ((fArr2[1] - fArr[1]) / 3.0f);
                    fArr3[2] = fArr2[0] + ((fArr[0] - fArr2[0]) / 3.0f);
                    fArr3[3] = fArr2[1] + ((fArr[1] - fArr2[1]) / 3.0f);
                    fArr3[4] = fArr2[0];
                    fArr3[5] = fArr2[1];
                } else {
                    throw new IllegalArgumentException(C1642a.m8034a("Unknown conversion from %d args to %d", new Object[]{Integer.valueOf(fArr2.length), Integer.valueOf(fArr3.length)}));
                }
            } else if (fArr2.length != 4) {
                throw new IllegalArgumentException(C1642a.m8034a("Unknown conversion from %d args to %d", new Object[]{Integer.valueOf(fArr2.length), Integer.valueOf(fArr3.length)}));
            } else if (fArr3.length == 6) {
                fArr3[0] = fArr[0] + ((fArr2[0] - fArr[0]) * 0.6666667f);
                fArr3[1] = fArr[1] + ((fArr2[1] - fArr[1]) * 0.6666667f);
                fArr3[2] = fArr2[2] + ((fArr2[0] - fArr2[2]) * 0.6666667f);
                fArr3[3] = fArr2[3] + ((fArr2[1] - fArr2[3]) * 0.6666667f);
                fArr3[4] = fArr2[2];
                fArr3[5] = fArr2[3];
            } else {
                throw new IllegalArgumentException(C1642a.m8034a("Unknown conversion from %d args to %d", new Object[]{Integer.valueOf(fArr2.length), Integer.valueOf(fArr3.length)}));
            }
            return fArr3;
        }
        throw new IllegalArgumentException("convertUp should only be called to convert a lower order argument array to a higher one.");
    }
}
