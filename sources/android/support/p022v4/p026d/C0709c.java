package android.support.p022v4.p026d;

import android.os.Build.VERSION;
import android.support.p022v4.util.C0901h;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.d.c */
public final class C0709c implements Spannable {

    /* renamed from: b */
    private static final Object f2689b = new Object();

    /* renamed from: c */
    private static Executor f2690c = null;

    /* renamed from: a */
    public final C0710a f2691a;

    /* renamed from: d */
    private final Spannable f2692d;

    /* renamed from: e */
    private final PrecomputedText f2693e;

    /* renamed from: android.support.v4.d.c$a */
    public static final class C0710a {

        /* renamed from: a */
        public final TextPaint f2694a;

        /* renamed from: b */
        public final TextDirectionHeuristic f2695b;

        /* renamed from: c */
        public final int f2696c;

        /* renamed from: d */
        public final int f2697d;

        /* renamed from: e */
        final Params f2698e;

        /* renamed from: android.support.v4.d.c$a$a */
        public static class C0711a {

            /* renamed from: a */
            private final TextPaint f2699a;

            /* renamed from: b */
            private TextDirectionHeuristic f2700b;

            /* renamed from: c */
            private int f2701c;

            /* renamed from: d */
            private int f2702d;

            /* renamed from: a */
            public final C0710a mo2873a() {
                return new C0710a(this.f2699a, this.f2700b, this.f2701c, this.f2702d);
            }

            /* renamed from: a */
            public final C0711a mo2871a(int i) {
                this.f2701c = i;
                return this;
            }

            /* renamed from: b */
            public final C0711a mo2874b(int i) {
                this.f2702d = i;
                return this;
            }

            /* renamed from: a */
            public final C0711a mo2872a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2700b = textDirectionHeuristic;
                return this;
            }

            public C0711a(TextPaint textPaint) {
                this.f2699a = textPaint;
                if (VERSION.SDK_INT >= 23) {
                    this.f2701c = 1;
                    this.f2702d = 1;
                } else {
                    this.f2702d = 0;
                    this.f2701c = 0;
                }
                if (VERSION.SDK_INT >= 18) {
                    this.f2700b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f2700b = null;
                }
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            sb2.append(this.f2694a.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder(", textScaleX=");
            sb3.append(this.f2694a.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder(", textSkewX=");
            sb4.append(this.f2694a.getTextSkewX());
            sb.append(sb4.toString());
            if (VERSION.SDK_INT >= 21) {
                StringBuilder sb5 = new StringBuilder(", letterSpacing=");
                sb5.append(this.f2694a.getLetterSpacing());
                sb.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder(", elegantTextHeight=");
                sb6.append(this.f2694a.isElegantTextHeight());
                sb.append(sb6.toString());
            }
            if (VERSION.SDK_INT >= 24) {
                StringBuilder sb7 = new StringBuilder(", textLocale=");
                sb7.append(this.f2694a.getTextLocales());
                sb.append(sb7.toString());
            } else if (VERSION.SDK_INT >= 17) {
                StringBuilder sb8 = new StringBuilder(", textLocale=");
                sb8.append(this.f2694a.getTextLocale());
                sb.append(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder(", typeface=");
            sb9.append(this.f2694a.getTypeface());
            sb.append(sb9.toString());
            if (VERSION.SDK_INT >= 26) {
                StringBuilder sb10 = new StringBuilder(", variationSettings=");
                sb10.append(this.f2694a.getFontVariationSettings());
                sb.append(sb10.toString());
            }
            StringBuilder sb11 = new StringBuilder(", textDir=");
            sb11.append(this.f2695b);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder(", breakStrategy=");
            sb12.append(this.f2696c);
            sb.append(sb12.toString());
            StringBuilder sb13 = new StringBuilder(", hyphenationFrequency=");
            sb13.append(this.f2697d);
            sb.append(sb13.toString());
            sb.append("}");
            return sb.toString();
        }

        public final int hashCode() {
            if (VERSION.SDK_INT >= 24) {
                return C0901h.m3835a(Float.valueOf(this.f2694a.getTextSize()), Float.valueOf(this.f2694a.getTextScaleX()), Float.valueOf(this.f2694a.getTextSkewX()), Float.valueOf(this.f2694a.getLetterSpacing()), Integer.valueOf(this.f2694a.getFlags()), this.f2694a.getTextLocales(), this.f2694a.getTypeface(), Boolean.valueOf(this.f2694a.isElegantTextHeight()), this.f2695b, Integer.valueOf(this.f2696c), Integer.valueOf(this.f2697d));
            } else if (VERSION.SDK_INT >= 21) {
                return C0901h.m3835a(Float.valueOf(this.f2694a.getTextSize()), Float.valueOf(this.f2694a.getTextScaleX()), Float.valueOf(this.f2694a.getTextSkewX()), Float.valueOf(this.f2694a.getLetterSpacing()), Integer.valueOf(this.f2694a.getFlags()), this.f2694a.getTextLocale(), this.f2694a.getTypeface(), Boolean.valueOf(this.f2694a.isElegantTextHeight()), this.f2695b, Integer.valueOf(this.f2696c), Integer.valueOf(this.f2697d));
            } else if (VERSION.SDK_INT >= 18) {
                return C0901h.m3835a(Float.valueOf(this.f2694a.getTextSize()), Float.valueOf(this.f2694a.getTextScaleX()), Float.valueOf(this.f2694a.getTextSkewX()), Integer.valueOf(this.f2694a.getFlags()), this.f2694a.getTextLocale(), this.f2694a.getTypeface(), this.f2695b, Integer.valueOf(this.f2696c), Integer.valueOf(this.f2697d));
            } else if (VERSION.SDK_INT >= 17) {
                return C0901h.m3835a(Float.valueOf(this.f2694a.getTextSize()), Float.valueOf(this.f2694a.getTextScaleX()), Float.valueOf(this.f2694a.getTextSkewX()), Integer.valueOf(this.f2694a.getFlags()), this.f2694a.getTextLocale(), this.f2694a.getTypeface(), this.f2695b, Integer.valueOf(this.f2696c), Integer.valueOf(this.f2697d));
            } else {
                return C0901h.m3835a(Float.valueOf(this.f2694a.getTextSize()), Float.valueOf(this.f2694a.getTextScaleX()), Float.valueOf(this.f2694a.getTextSkewX()), Integer.valueOf(this.f2694a.getFlags()), this.f2694a.getTypeface(), this.f2695b, Integer.valueOf(this.f2696c), Integer.valueOf(this.f2697d));
            }
        }

        public C0710a(Params params) {
            this.f2694a = params.getTextPaint();
            this.f2695b = params.getTextDirection();
            this.f2696c = params.getBreakStrategy();
            this.f2697d = params.getHyphenationFrequency();
            this.f2698e = params;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof C0710a)) {
                return false;
            }
            C0710a aVar = (C0710a) obj;
            if (this.f2698e != null) {
                return this.f2698e.equals(aVar.f2698e);
            }
            if (VERSION.SDK_INT >= 23 && (this.f2696c != aVar.f2696c || this.f2697d != aVar.f2697d)) {
                return false;
            }
            if ((VERSION.SDK_INT >= 18 && this.f2695b != aVar.f2695b) || this.f2694a.getTextSize() != aVar.f2694a.getTextSize() || this.f2694a.getTextScaleX() != aVar.f2694a.getTextScaleX() || this.f2694a.getTextSkewX() != aVar.f2694a.getTextSkewX()) {
                return false;
            }
            if ((VERSION.SDK_INT >= 21 && (this.f2694a.getLetterSpacing() != aVar.f2694a.getLetterSpacing() || !TextUtils.equals(this.f2694a.getFontFeatureSettings(), aVar.f2694a.getFontFeatureSettings()))) || this.f2694a.getFlags() != aVar.f2694a.getFlags()) {
                return false;
            }
            if (VERSION.SDK_INT >= 24) {
                if (!this.f2694a.getTextLocales().equals(aVar.f2694a.getTextLocales())) {
                    return false;
                }
            } else if (VERSION.SDK_INT >= 17 && !this.f2694a.getTextLocale().equals(aVar.f2694a.getTextLocale())) {
                return false;
            }
            if (this.f2694a.getTypeface() == null) {
                if (aVar.f2694a.getTypeface() != null) {
                    return false;
                }
            } else if (!this.f2694a.getTypeface().equals(aVar.f2694a.getTypeface())) {
                return false;
            }
            return true;
        }

        C0710a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (VERSION.SDK_INT >= 28) {
                this.f2698e = new Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f2698e = null;
            }
            this.f2694a = textPaint;
            this.f2695b = textDirectionHeuristic;
            this.f2696c = i;
            this.f2697d = i2;
        }
    }

    public final int length() {
        return this.f2692d.length();
    }

    public final String toString() {
        return this.f2692d.toString();
    }

    /* renamed from: a */
    public final PrecomputedText mo2856a() {
        if (this.f2692d instanceof PrecomputedText) {
            return (PrecomputedText) this.f2692d;
        }
        return null;
    }

    public final char charAt(int i) {
        return this.f2692d.charAt(i);
    }

    public final int getSpanEnd(Object obj) {
        return this.f2692d.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.f2692d.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.f2692d.getSpanStart(obj);
    }

    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (VERSION.SDK_INT >= 28) {
            this.f2693e.removeSpan(obj);
        } else {
            this.f2692d.removeSpan(obj);
        }
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.f2692d.subSequence(i, i2);
    }

    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2692d.nextSpanTransition(i, i2, cls);
    }

    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (VERSION.SDK_INT >= 28) {
            return this.f2693e.getSpans(i, i2, cls);
        }
        return this.f2692d.getSpans(i, i2, cls);
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (VERSION.SDK_INT >= 28) {
            this.f2693e.setSpan(obj, i, i2, i3);
        } else {
            this.f2692d.setSpan(obj, i, i2, i3);
        }
    }
}
