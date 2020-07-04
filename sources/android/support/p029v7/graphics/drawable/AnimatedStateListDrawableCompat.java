package android.support.p029v7.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.p022v4.content.res.C0704f;
import android.support.p022v4.util.C0893e;
import android.support.p022v4.util.C0905l;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat */
public class AnimatedStateListDrawableCompat extends C1133d {

    /* renamed from: c */
    private static final String f4003c = "AnimatedStateListDrawableCompat";

    /* renamed from: d */
    private C1122b f4004d;

    /* renamed from: e */
    private C1126f f4005e;

    /* renamed from: f */
    private int f4006f;

    /* renamed from: g */
    private int f4007g;

    /* renamed from: h */
    private boolean f4008h;

    /* renamed from: android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat$a */
    static class C1121a extends C1126f {

        /* renamed from: a */
        private final Animatable f4009a;

        /* renamed from: a */
        public final void mo4453a() {
            this.f4009a.start();
        }

        /* renamed from: b */
        public final void mo4454b() {
            this.f4009a.stop();
        }

        C1121a(Animatable animatable) {
            super();
            this.f4009a = animatable;
        }
    }

    /* renamed from: android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat$b */
    static class C1122b extends C1134a {

        /* renamed from: a */
        C0893e<Long> f4010a;

        /* renamed from: b */
        C0905l<Integer> f4011b;

        /* renamed from: f */
        private static long m4974f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        public final Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4460a() {
            this.f4010a = this.f4010a.clone();
            this.f4011b = this.f4011b.clone();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo4458a(int[] iArr) {
            int b = super.mo4534b(iArr);
            if (b >= 0) {
                return b;
            }
            return super.mo4534b(StateSet.WILD_CARD);
        }

        public final Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo4455a(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f4011b.mo3434a(i, Integer.valueOf(0))).intValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo4456a(int i, int i2) {
            return (int) ((Long) this.f4010a.mo3328a(m4974f(i, i2), Long.valueOf(-1))).longValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo4461b(int i, int i2) {
            if ((((Long) this.f4010a.mo3328a(m4974f(i, i2), Long.valueOf(-1))).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo4462c(int i, int i2) {
            if ((((Long) this.f4010a.mo3328a(m4974f(i, i2), Long.valueOf(-1))).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        C1122b(C1122b bVar, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(bVar, animatedStateListDrawableCompat, resources);
            if (bVar != null) {
                this.f4010a = bVar.f4010a;
                this.f4011b = bVar.f4011b;
                return;
            }
            this.f4010a = new C0893e<>();
            this.f4011b = new C0905l<>();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo4459a(int[] iArr, Drawable drawable, int i) {
            int a = super.mo4533a(iArr, drawable);
            this.f4011b.mo3437b(a, Integer.valueOf(i));
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo4457a(int i, int i2, Drawable drawable, boolean z) {
            long j;
            int a = super.mo4480a(drawable);
            long f = m4974f(i, i2);
            if (z) {
                j = 8589934592L;
            } else {
                j = 0;
            }
            long j2 = (long) a;
            this.f4010a.mo3337c(f, Long.valueOf(j2 | j));
            if (z) {
                this.f4010a.mo3337c(m4974f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }
    }

    /* renamed from: android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat$c */
    static class C1123c extends C1126f {

        /* renamed from: a */
        private final AnimatedVectorDrawableCompat f4012a;

        /* renamed from: a */
        public final void mo4453a() {
            this.f4012a.start();
        }

        /* renamed from: b */
        public final void mo4454b() {
            this.f4012a.stop();
        }

        C1123c(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            super();
            this.f4012a = animatedVectorDrawableCompat;
        }
    }

    /* renamed from: android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat$d */
    static class C1124d extends C1126f {

        /* renamed from: a */
        private final ObjectAnimator f4013a;

        /* renamed from: b */
        private final boolean f4014b;

        /* renamed from: c */
        public final boolean mo4465c() {
            return this.f4014b;
        }

        /* renamed from: a */
        public final void mo4453a() {
            this.f4013a.start();
        }

        /* renamed from: b */
        public final void mo4454b() {
            this.f4013a.cancel();
        }

        /* renamed from: d */
        public final void mo4466d() {
            this.f4013a.reverse();
        }

        C1124d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            int i;
            int i2;
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = numberOfFrames - 1;
            }
            C1125e eVar = new C1125e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) eVar.f4015a);
            ofInt.setInterpolator(eVar);
            this.f4014b = z2;
            this.f4013a = ofInt;
        }
    }

    /* renamed from: android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat$e */
    static class C1125e implements TimeInterpolator {

        /* renamed from: a */
        public int f4015a;

        /* renamed from: b */
        private int[] f4016b;

        /* renamed from: c */
        private int f4017c;

        public final float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * ((float) this.f4015a)) + 0.5f);
            int i2 = this.f4017c;
            int[] iArr = this.f4016b;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            if (i3 < i2) {
                f2 = ((float) i) / ((float) this.f4015a);
            } else {
                f2 = 0.0f;
            }
            return (((float) i3) / ((float) i2)) + f2;
        }

        C1125e(AnimationDrawable animationDrawable, boolean z) {
            m4989a(animationDrawable, z);
        }

        /* renamed from: a */
        private int m4989a(AnimationDrawable animationDrawable, boolean z) {
            int i;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f4017c = numberOfFrames;
            if (this.f4016b == null || this.f4016b.length < numberOfFrames) {
                this.f4016b = new int[numberOfFrames];
            }
            int[] iArr = this.f4016b;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                if (z) {
                    i = (numberOfFrames - i3) - 1;
                } else {
                    i = i3;
                }
                int duration = animationDrawable.getDuration(i);
                iArr[i3] = duration;
                i2 += duration;
            }
            this.f4015a = i2;
            return i2;
        }
    }

    /* renamed from: android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat$f */
    static abstract class C1126f {
        private C1126f() {
        }

        /* renamed from: a */
        public abstract void mo4453a();

        /* renamed from: b */
        public abstract void mo4454b();

        /* renamed from: c */
        public boolean mo4465c() {
            return false;
        }

        /* renamed from: d */
        public void mo4466d() {
        }
    }

    public boolean isStateful() {
        return true;
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    /* renamed from: c */
    private void m4963c() {
        onStateChange(getState());
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C1122b mo4420b() {
        return new C1122b(this.f4004d, this, null);
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        if (this.f4005e != null) {
            this.f4005e.mo4454b();
            this.f4005e = null;
            mo4470a(this.f4006f);
            this.f4006f = -1;
            this.f4007g = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f4008h && super.mutate() == this) {
            this.f4004d.mo4460a();
            this.f4008h = true;
        }
        return this;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(Mode mode) {
        super.setTintMode(mode);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo4418a(C1130b bVar) {
        super.mo4418a(bVar);
        if (bVar instanceof C1122b) {
            this.f4004d = (C1122b) bVar;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z;
        int a = this.f4004d.mo4458a(iArr);
        if (a == this.f4018a || (!m4962b(a) && !mo4470a(a))) {
            z = false;
        } else {
            z = true;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z | current.setState(iArr);
        }
        return z;
    }

    /* renamed from: a */
    private void m4961a(TypedArray typedArray) {
        C1122b bVar = this.f4004d;
        if (VERSION.SDK_INT >= 21) {
            bVar.f4047f |= typedArray.getChangingConfigurations();
        }
        bVar.f4052k = typedArray.getBoolean(2, bVar.f4052k);
        bVar.f4055n = typedArray.getBoolean(3, bVar.f4055n);
        bVar.f4035C = typedArray.getInt(4, bVar.f4035C);
        bVar.f4036D = typedArray.getInt(5, bVar.f4036D);
        setDither(typedArray.getBoolean(0, bVar.f4067z));
    }

    /* renamed from: b */
    private boolean m4962b(int i) {
        int i2;
        C1126f fVar;
        C1126f fVar2 = this.f4005e;
        if (fVar2 == null) {
            i2 = this.f4018a;
        } else if (i == this.f4006f) {
            return true;
        } else {
            if (i != this.f4007g || !fVar2.mo4465c()) {
                i2 = this.f4006f;
                fVar2.mo4454b();
            } else {
                fVar2.mo4466d();
                this.f4006f = this.f4007g;
                this.f4007g = i;
                return true;
            }
        }
        this.f4005e = null;
        this.f4007g = -1;
        this.f4006f = -1;
        C1122b bVar = this.f4004d;
        int a = bVar.mo4455a(i2);
        int a2 = bVar.mo4455a(i);
        if (a2 == 0 || a == 0) {
            return false;
        }
        int a3 = bVar.mo4456a(a, a2);
        if (a3 < 0) {
            return false;
        }
        boolean c = bVar.mo4462c(a, a2);
        mo4470a(a3);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            fVar = new C1124d((AnimationDrawable) current, bVar.mo4461b(a, a2), c);
        } else if (current instanceof AnimatedVectorDrawableCompat) {
            fVar = new C1123c((AnimatedVectorDrawableCompat) current);
        } else if (!(current instanceof Animatable)) {
            return false;
        } else {
            fVar = new C1121a((Animatable) current);
        }
        fVar.mo4453a();
        this.f4005e = fVar;
        this.f4007g = i2;
        this.f4006f = i;
        return true;
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    AnimatedStateListDrawableCompat(C1122b bVar, Resources resources) {
        super(null);
        this.f4006f = -1;
        this.f4007g = -1;
        mo4418a((C1130b) new C1122b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f4005e != null && (visible || z2)) {
            if (z) {
                this.f4005e.mo4453a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: b */
    public final void mo4421b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        TypedArray a = C0704f.m2990a(resources, theme, attributeSet, R$styleable.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(1, true), true);
        m4961a(a);
        mo4468a(resources);
        a.recycle();
        m4964c(context, resources, xmlPullParser, attributeSet, theme);
        m4963c();
    }

    /* renamed from: a */
    public static AnimatedStateListDrawableCompat m4960a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new AnimatedStateListDrawableCompat();
            animatedStateListDrawableCompat.mo4421b(context, resources, xmlPullParser, attributeSet, theme);
            return animatedStateListDrawableCompat;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: c */
    private void m4964c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m4967e(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m4965d(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private int m4965d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray a = C0704f.m2990a(resources, theme, attributeSet, R$styleable.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(2, -1);
        int resourceId2 = a.getResourceId(1, -1);
        int resourceId3 = a.getResourceId(0, -1);
        if (resourceId3 > 0) {
            drawable = C1065a.m4641b(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = a.getBoolean(3, false);
        a.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = AnimatedVectorDrawableCompat.m1848a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawable == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f4004d.mo4457a(resourceId, resourceId2, drawable, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    /* renamed from: e */
    private int m4967e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray a = C0704f.m2990a(resources, theme, attributeSet, R$styleable.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(0, 0);
        int resourceId2 = a.getResourceId(1, -1);
        if (resourceId2 > 0) {
            drawable = C1065a.m4641b(context, resourceId2);
        } else {
            drawable = null;
        }
        a.recycle();
        int[] a2 = m5030a(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("vector")) {
                drawable = VectorDrawableCompat.m1856a(resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawable != null) {
            return this.f4004d.mo4459a(a2, drawable, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(sb2.toString());
    }
}
