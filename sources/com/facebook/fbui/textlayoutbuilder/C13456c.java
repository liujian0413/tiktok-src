package com.facebook.fbui.textlayoutbuilder;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.p022v4.p026d.C0712d;
import android.support.p022v4.p026d.C0713e;
import android.support.p022v4.util.C0894f;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;

/* renamed from: com.facebook.fbui.textlayoutbuilder.c */
public final class C13456c {

    /* renamed from: a */
    static final C0894f<Integer, Layout> f35670a = new C0894f<>(100);

    /* renamed from: b */
    final C13458b f35671b = new C13458b();

    /* renamed from: c */
    public C13451a f35672c;

    /* renamed from: d */
    public boolean f35673d = true;

    /* renamed from: e */
    public boolean f35674e = false;

    /* renamed from: f */
    private Layout f35675f = null;

    /* renamed from: com.facebook.fbui.textlayoutbuilder.c$a */
    static class C13457a extends TextPaint {

        /* renamed from: a */
        private float f35676a;

        /* renamed from: b */
        private float f35677b;

        /* renamed from: c */
        private float f35678c;

        /* renamed from: d */
        private int f35679d;

        public C13457a() {
        }

        public final int hashCode() {
            int i;
            Typeface typeface = getTypeface();
            int color = (((getColor() + 31) * 31) + Float.floatToIntBits(getTextSize())) * 31;
            if (typeface != null) {
                i = typeface.hashCode();
            } else {
                i = 0;
            }
            int floatToIntBits = ((((((((((color + i) * 31) + Float.floatToIntBits(this.f35676a)) * 31) + Float.floatToIntBits(this.f35677b)) * 31) + Float.floatToIntBits(this.f35678c)) * 31) + this.f35679d) * 31) + this.linkColor;
            if (this.drawableState == null) {
                return (floatToIntBits * 31) + 0;
            }
            for (int i2 : this.drawableState) {
                floatToIntBits = (floatToIntBits * 31) + i2;
            }
            return floatToIntBits;
        }

        public C13457a(int i) {
            super(1);
        }

        public C13457a(Paint paint) {
            super(paint);
        }

        public final void setShadowLayer(float f, float f2, float f3, int i) {
            this.f35678c = f;
            this.f35676a = f2;
            this.f35677b = f3;
            this.f35679d = i;
            super.setShadowLayer(f, f2, f3, i);
        }
    }

    /* renamed from: com.facebook.fbui.textlayoutbuilder.c$b */
    static class C13458b {

        /* renamed from: a */
        TextPaint f35680a = new C13457a(1);

        /* renamed from: b */
        int f35681b;

        /* renamed from: c */
        int f35682c;

        /* renamed from: d */
        CharSequence f35683d;

        /* renamed from: e */
        float f35684e = 1.0f;

        /* renamed from: f */
        float f35685f = 0.0f;

        /* renamed from: g */
        boolean f35686g = true;

        /* renamed from: h */
        TruncateAt f35687h = null;

        /* renamed from: i */
        boolean f35688i = false;

        /* renamed from: j */
        int f35689j = Integer.MAX_VALUE;

        /* renamed from: k */
        Alignment f35690k = Alignment.ALIGN_NORMAL;

        /* renamed from: l */
        C0712d f35691l = C0713e.f2705c;

        /* renamed from: m */
        boolean f35692m = false;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo32984a() {
            if (this.f35692m) {
                this.f35680a = new C13457a((Paint) this.f35680a);
                this.f35692m = false;
            }
        }

        C13458b() {
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (this.f35680a != null) {
                i = this.f35680a.hashCode();
            } else {
                i = 0;
            }
            int floatToIntBits = (((((((((((i + 31) * 31) + this.f35681b) * 31) + this.f35682c) * 31) + Float.floatToIntBits(this.f35684e)) * 31) + Float.floatToIntBits(this.f35685f)) * 31) + (this.f35686g ? 1 : 0)) * 31;
            if (this.f35687h != null) {
                i2 = this.f35687h.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (((((floatToIntBits + i2) * 31) + (this.f35688i ? 1 : 0)) * 31) + this.f35689j) * 31;
            if (this.f35690k != null) {
                i3 = this.f35690k.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            if (this.f35691l != null) {
                i4 = this.f35691l.hashCode();
            } else {
                i4 = 0;
            }
            int i8 = (i7 + i4) * 31;
            if (this.f35683d != null) {
                i5 = this.f35683d.hashCode();
            }
            return i8 + i5;
        }
    }

    /* renamed from: a */
    public final C13456c mo32974a(CharSequence charSequence) {
        if (charSequence == this.f35671b.f35683d || (charSequence != null && this.f35671b.f35683d != null && charSequence.equals(this.f35671b.f35683d))) {
            return this;
        }
        this.f35671b.f35683d = charSequence;
        this.f35675f = null;
        return this;
    }

    /* renamed from: a */
    public final C13456c mo32975a(boolean z) {
        if (this.f35671b.f35686g != z) {
            this.f35671b.f35686g = z;
            this.f35675f = null;
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x016c A[LOOP:0: B:40:0x0104->B:60:0x016c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Layout mo32966a() {
        /*
            r26 = this;
            r1 = r26
            boolean r0 = r1.f35673d
            if (r0 == 0) goto L_0x000d
            android.text.Layout r0 = r1.f35675f
            if (r0 == 0) goto L_0x000d
            android.text.Layout r0 = r1.f35675f
            return r0
        L_0x000d:
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b
            java.lang.CharSequence r0 = r0.f35683d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0019
            return r2
        L_0x0019:
            r0 = -1
            boolean r3 = r1.f35673d
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0043
            com.facebook.fbui.textlayoutbuilder.c$b r3 = r1.f35671b
            java.lang.CharSequence r3 = r3.f35683d
            boolean r3 = r3 instanceof android.text.Spannable
            if (r3 == 0) goto L_0x0043
            com.facebook.fbui.textlayoutbuilder.c$b r3 = r1.f35671b
            java.lang.CharSequence r3 = r3.f35683d
            android.text.Spannable r3 = (android.text.Spannable) r3
            com.facebook.fbui.textlayoutbuilder.c$b r6 = r1.f35671b
            java.lang.CharSequence r6 = r6.f35683d
            int r6 = r6.length()
            int r6 = r6 - r5
            java.lang.Class<android.text.style.ClickableSpan> r7 = android.text.style.ClickableSpan.class
            java.lang.Object[] r3 = r3.getSpans(r4, r6, r7)
            android.text.style.ClickableSpan[] r3 = (android.text.style.ClickableSpan[]) r3
            int r3 = r3.length
            if (r3 <= 0) goto L_0x0043
            r4 = 1
        L_0x0043:
            boolean r3 = r1.f35673d
            if (r3 == 0) goto L_0x0060
            if (r4 != 0) goto L_0x0060
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b
            int r0 = r0.hashCode()
            android.support.v4.util.f<java.lang.Integer, android.text.Layout> r3 = f35670a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.mo3341a(r6)
            android.text.Layout r3 = (android.text.Layout) r3
            if (r3 == 0) goto L_0x005e
            return r3
        L_0x005e:
            r3 = r0
            goto L_0x0061
        L_0x0060:
            r3 = -1
        L_0x0061:
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b
            boolean r0 = r0.f35688i
            if (r0 == 0) goto L_0x0069
            r15 = 1
            goto L_0x006e
        L_0x0069:
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b
            int r0 = r0.f35689j
            r15 = r0
        L_0x006e:
            if (r15 != r5) goto L_0x007c
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b
            java.lang.CharSequence r0 = r0.f35683d
            com.facebook.fbui.textlayoutbuilder.c$b r2 = r1.f35671b
            android.text.TextPaint r2 = r2.f35680a
            android.text.BoringLayout$Metrics r2 = android.text.BoringLayout.isBoring(r0, r2)
        L_0x007c:
            r22 = r2
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b
            int r0 = r0.f35682c
            switch(r0) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00b8;
                case 2: goto L_0x009d;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected measure mode "
            r2.<init>(r3)
            com.facebook.fbui.textlayoutbuilder.c$b r3 = r1.f35671b
            int r3 = r3.f35682c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x009d:
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b
            java.lang.CharSequence r0 = r0.f35683d
            com.facebook.fbui.textlayoutbuilder.c$b r2 = r1.f35671b
            android.text.TextPaint r2 = r2.f35680a
            float r0 = android.text.Layout.getDesiredWidth(r0, r2)
            double r6 = (double) r0
            double r6 = java.lang.Math.ceil(r6)
            int r0 = (int) r6
            com.facebook.fbui.textlayoutbuilder.c$b r2 = r1.f35671b
            int r2 = r2.f35681b
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x00cf
        L_0x00b8:
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b
            int r0 = r0.f35681b
            goto L_0x00cf
        L_0x00bd:
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b
            java.lang.CharSequence r0 = r0.f35683d
            com.facebook.fbui.textlayoutbuilder.c$b r2 = r1.f35671b
            android.text.TextPaint r2 = r2.f35680a
            float r0 = android.text.Layout.getDesiredWidth(r0, r2)
            double r6 = (double) r0
            double r6 = java.lang.Math.ceil(r6)
            int r0 = (int) r6
        L_0x00cf:
            r25 = r0
            if (r22 == 0) goto L_0x0104
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b
            java.lang.CharSequence r0 = r0.f35683d
            com.facebook.fbui.textlayoutbuilder.c$b r2 = r1.f35671b
            android.text.TextPaint r2 = r2.f35680a
            com.facebook.fbui.textlayoutbuilder.c$b r6 = r1.f35671b
            android.text.Layout$Alignment r6 = r6.f35690k
            com.facebook.fbui.textlayoutbuilder.c$b r7 = r1.f35671b
            float r7 = r7.f35684e
            com.facebook.fbui.textlayoutbuilder.c$b r8 = r1.f35671b
            float r8 = r8.f35685f
            com.facebook.fbui.textlayoutbuilder.c$b r9 = r1.f35671b
            boolean r9 = r9.f35686g
            com.facebook.fbui.textlayoutbuilder.c$b r10 = r1.f35671b
            android.text.TextUtils$TruncateAt r10 = r10.f35687h
            r16 = r0
            r17 = r2
            r18 = r25
            r19 = r6
            r20 = r7
            r21 = r8
            r23 = r9
            r24 = r10
            android.text.BoringLayout r0 = android.text.BoringLayout.make(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x013c
        L_0x0104:
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            java.lang.CharSequence r6 = r0.f35683d     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            r7 = 0
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            java.lang.CharSequence r0 = r0.f35683d     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            int r8 = r0.length()     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            android.text.TextPaint r9 = r0.f35680a     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            android.text.Layout$Alignment r11 = r0.f35690k     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            float r12 = r0.f35684e     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            float r13 = r0.f35685f     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            boolean r14 = r0.f35686g     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            android.text.TextUtils$TruncateAt r0 = r0.f35687h     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.c$b r2 = r1.f35671b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            android.support.v4.d.d r2 = r2.f35691l     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            r10 = r25
            r19 = r15
            r15 = r0
            r16 = r25
            r17 = r19
            r18 = r2
            android.text.StaticLayout r0 = com.facebook.fbui.textlayoutbuilder.C13454b.m39530a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IndexOutOfBoundsException -> 0x015f }
        L_0x013c:
            boolean r2 = r1.f35673d
            if (r2 == 0) goto L_0x014d
            if (r4 != 0) goto L_0x014d
            r1.f35675f = r0
            android.support.v4.util.f<java.lang.Integer, android.text.Layout> r2 = f35670a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo3342a(r3, r0)
        L_0x014d:
            com.facebook.fbui.textlayoutbuilder.c$b r2 = r1.f35671b
            r2.f35692m = r5
            boolean r2 = r1.f35674e
            if (r2 == 0) goto L_0x015e
            com.facebook.fbui.textlayoutbuilder.a r2 = r1.f35672c
            if (r2 == 0) goto L_0x015e
            com.facebook.fbui.textlayoutbuilder.a r2 = r1.f35672c
            r2.mo32964a(r0)
        L_0x015e:
            return r0
        L_0x015f:
            r0 = move-exception
            goto L_0x0164
        L_0x0161:
            r0 = move-exception
            r19 = r15
        L_0x0164:
            com.facebook.fbui.textlayoutbuilder.c$b r2 = r1.f35671b
            java.lang.CharSequence r2 = r2.f35683d
            boolean r2 = r2 instanceof java.lang.String
            if (r2 != 0) goto L_0x017b
            com.facebook.fbui.textlayoutbuilder.c$b r0 = r1.f35671b
            com.facebook.fbui.textlayoutbuilder.c$b r2 = r1.f35671b
            java.lang.CharSequence r2 = r2.f35683d
            java.lang.String r2 = r2.toString()
            r0.f35683d = r2
            r15 = r19
            goto L_0x0104
        L_0x017b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.textlayoutbuilder.C13456c.mo32966a():android.text.Layout");
    }

    /* renamed from: a */
    public final C13456c mo32973a(C13451a aVar) {
        this.f35672c = aVar;
        return this;
    }

    /* renamed from: c */
    public final C13456c mo32980c(boolean z) {
        this.f35673d = false;
        return this;
    }

    /* renamed from: d */
    public final C13456c mo32981d(boolean z) {
        this.f35674e = true;
        return this;
    }

    /* renamed from: a */
    public final C13456c mo32967a(float f) {
        if (this.f35671b.f35685f != f) {
            this.f35671b.f35685f = f;
            this.f35675f = null;
        }
        return this;
    }

    /* renamed from: b */
    public final C13456c mo32976b(float f) {
        if (this.f35671b.f35684e != f) {
            this.f35671b.f35684e = f;
            this.f35675f = null;
        }
        return this;
    }

    /* renamed from: c */
    public final C13456c mo32979c(int i) {
        if (this.f35671b.f35689j != i) {
            this.f35671b.f35689j = i;
            this.f35675f = null;
        }
        return this;
    }

    /* renamed from: a */
    private C13456c m39536a(Typeface typeface) {
        if (this.f35671b.f35680a.getTypeface() != typeface) {
            this.f35671b.mo32984a();
            this.f35671b.f35680a.setTypeface(typeface);
            this.f35675f = null;
        }
        return this;
    }

    /* renamed from: b */
    public final C13456c mo32977b(int i) {
        return m39536a(Typeface.defaultFromStyle(i));
    }

    /* renamed from: a */
    public final C13456c mo32968a(int i) {
        float f = (float) i;
        if (this.f35671b.f35680a.getTextSize() != f) {
            this.f35671b.mo32984a();
            this.f35671b.f35680a.setTextSize(f);
            this.f35675f = null;
        }
        return this;
    }

    /* renamed from: b */
    public final C13456c mo32978b(boolean z) {
        if (this.f35671b.f35688i != z) {
            this.f35671b.f35688i = z;
            this.f35675f = null;
        }
        return this;
    }

    /* renamed from: a */
    public final C13456c mo32970a(C0712d dVar) {
        if (this.f35671b.f35691l != dVar) {
            this.f35671b.f35691l = dVar;
            this.f35675f = null;
        }
        return this;
    }

    /* renamed from: a */
    public final C13456c mo32971a(Alignment alignment) {
        if (this.f35671b.f35690k != alignment) {
            this.f35671b.f35690k = alignment;
            this.f35675f = null;
        }
        return this;
    }

    /* renamed from: a */
    public final C13456c mo32972a(TruncateAt truncateAt) {
        if (this.f35671b.f35687h != truncateAt) {
            this.f35671b.f35687h = truncateAt;
            this.f35675f = null;
        }
        return this;
    }

    /* renamed from: a */
    public final C13456c mo32969a(int i, int i2) {
        if (!(this.f35671b.f35681b == i && this.f35671b.f35682c == i2)) {
            this.f35671b.f35681b = i;
            this.f35671b.f35682c = i2;
            this.f35675f = null;
        }
        return this;
    }
}
