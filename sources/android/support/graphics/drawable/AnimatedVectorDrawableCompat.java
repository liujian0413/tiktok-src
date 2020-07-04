package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.p022v4.content.res.C0704f;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.util.ArrayMap;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AnimatedVectorDrawableCompat extends C0435g implements C0429b {

    /* renamed from: a */
    final Callback f1776a;

    /* renamed from: c */
    private C0417a f1777c;

    /* renamed from: d */
    private Context f1778d;

    /* renamed from: e */
    private ArgbEvaluator f1779e;

    /* renamed from: android.support.graphics.drawable.AnimatedVectorDrawableCompat$a */
    static class C0417a extends ConstantState {

        /* renamed from: a */
        int f1781a;

        /* renamed from: b */
        VectorDrawableCompat f1782b;

        /* renamed from: c */
        AnimatorSet f1783c;

        /* renamed from: d */
        ArrayList<Animator> f1784d;

        /* renamed from: e */
        ArrayMap<Animator, String> f1785e;

        public final int getChangingConfigurations() {
            return this.f1781a;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        /* renamed from: a */
        public final void mo1922a() {
            if (this.f1783c == null) {
                this.f1783c = new AnimatorSet();
            }
            this.f1783c.playTogether(this.f1784d);
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public C0417a(Context context, C0417a aVar, Callback callback, Resources resources) {
            if (aVar != null) {
                this.f1781a = aVar.f1781a;
                if (aVar.f1782b != null) {
                    ConstantState constantState = aVar.f1782b.getConstantState();
                    if (resources != null) {
                        this.f1782b = (VectorDrawableCompat) constantState.newDrawable(resources);
                    } else {
                        this.f1782b = (VectorDrawableCompat) constantState.newDrawable();
                    }
                    this.f1782b = (VectorDrawableCompat) this.f1782b.mutate();
                    this.f1782b.setCallback(callback);
                    this.f1782b.setBounds(aVar.f1782b.getBounds());
                    this.f1782b.f1788c = false;
                }
                if (aVar.f1784d != null) {
                    int size = aVar.f1784d.size();
                    this.f1784d = new ArrayList<>(size);
                    this.f1785e = new ArrayMap<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) aVar.f1784d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) aVar.f1785e.get(animator);
                        clone.setTarget(this.f1782b.mo1931a(str));
                        this.f1784d.add(clone);
                        this.f1785e.put(clone, str);
                    }
                    mo1922a();
                }
            }
        }
    }

    /* renamed from: android.support.graphics.drawable.AnimatedVectorDrawableCompat$b */
    static class C0418b extends ConstantState {

        /* renamed from: a */
        private final ConstantState f1786a;

        public final boolean canApplyTheme() {
            return this.f1786a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f1786a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.f1872b = this.f1786a.newDrawable();
            animatedVectorDrawableCompat.f1872b.setCallback(animatedVectorDrawableCompat.f1776a);
            return animatedVectorDrawableCompat;
        }

        public C0418b(ConstantState constantState) {
            this.f1786a = constantState;
        }

        public final Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.f1872b = this.f1786a.newDrawable(resources);
            animatedVectorDrawableCompat.f1872b.setCallback(animatedVectorDrawableCompat.f1776a);
            return animatedVectorDrawableCompat;
        }

        public final Drawable newDrawable(Resources resources, Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.f1872b = this.f1786a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.f1872b.setCallback(animatedVectorDrawableCompat.f1776a);
            return animatedVectorDrawableCompat;
        }
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    AnimatedVectorDrawableCompat() {
        this(null, null, null);
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public boolean canApplyTheme() {
        if (this.f1872b != null) {
            return C0727a.m3113d(this.f1872b);
        }
        return false;
    }

    public Drawable mutate() {
        if (this.f1872b != null) {
            this.f1872b.mutate();
        }
        return this;
    }

    public int getAlpha() {
        if (this.f1872b != null) {
            return C0727a.m3112c(this.f1872b);
        }
        return this.f1777c.f1782b.getAlpha();
    }

    public int getChangingConfigurations() {
        if (this.f1872b != null) {
            return this.f1872b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f1777c.f1781a;
    }

    public ConstantState getConstantState() {
        if (this.f1872b == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0418b(this.f1872b.getConstantState());
    }

    public int getIntrinsicHeight() {
        if (this.f1872b != null) {
            return this.f1872b.getIntrinsicHeight();
        }
        return this.f1777c.f1782b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        if (this.f1872b != null) {
            return this.f1872b.getIntrinsicWidth();
        }
        return this.f1777c.f1782b.getIntrinsicWidth();
    }

    public int getOpacity() {
        if (this.f1872b != null) {
            return this.f1872b.getOpacity();
        }
        return this.f1777c.f1782b.getOpacity();
    }

    public boolean isAutoMirrored() {
        if (this.f1872b != null) {
            return C0727a.m3110b(this.f1872b);
        }
        return this.f1777c.f1782b.isAutoMirrored();
    }

    public boolean isRunning() {
        if (this.f1872b != null) {
            return ((AnimatedVectorDrawable) this.f1872b).isRunning();
        }
        return this.f1777c.f1783c.isRunning();
    }

    public boolean isStateful() {
        if (this.f1872b != null) {
            return this.f1872b.isStateful();
        }
        return this.f1777c.f1782b.isStateful();
    }

    public void stop() {
        if (this.f1872b != null) {
            ((AnimatedVectorDrawable) this.f1872b).stop();
        } else {
            this.f1777c.f1783c.end();
        }
    }

    public void start() {
        if (this.f1872b != null) {
            ((AnimatedVectorDrawable) this.f1872b).start();
        } else if (!this.f1777c.f1783c.isStarted()) {
            this.f1777c.f1783c.start();
            invalidateSelf();
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    private AnimatedVectorDrawableCompat(Context context) {
        this(context, null, null);
    }

    public void applyTheme(Theme theme) {
        if (this.f1872b != null) {
            C0727a.m3106a(this.f1872b, theme);
        }
    }

    public void draw(Canvas canvas) {
        if (this.f1872b != null) {
            this.f1872b.draw(canvas);
            return;
        }
        this.f1777c.f1782b.draw(canvas);
        if (this.f1777c.f1783c.isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f1872b != null) {
            this.f1872b.setBounds(rect);
        } else {
            this.f1777c.f1782b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f1872b != null) {
            return this.f1872b.setLevel(i);
        }
        return this.f1777c.f1782b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f1872b != null) {
            return this.f1872b.setState(iArr);
        }
        return this.f1777c.f1782b.setState(iArr);
    }

    public void setAlpha(int i) {
        if (this.f1872b != null) {
            this.f1872b.setAlpha(i);
        } else {
            this.f1777c.f1782b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f1872b != null) {
            C0727a.m3109a(this.f1872b, z);
        } else {
            this.f1777c.f1782b.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f1872b != null) {
            this.f1872b.setColorFilter(colorFilter);
        } else {
            this.f1777c.f1782b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        if (this.f1872b != null) {
            C0727a.m3103a(this.f1872b, i);
        } else {
            this.f1777c.f1782b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f1872b != null) {
            C0727a.m3105a(this.f1872b, colorStateList);
        } else {
            this.f1777c.f1782b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (this.f1872b != null) {
            C0727a.m3108a(this.f1872b, mode);
        } else {
            this.f1777c.f1782b.setTintMode(mode);
        }
    }

    /* renamed from: a */
    private void m1849a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m1849a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f1779e == null) {
                    this.f1779e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f1779e);
            }
        }
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f1872b != null) {
            return this.f1872b.setVisible(z, z2);
        }
        this.f1777c.f1782b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    /* renamed from: a */
    private void m1850a(String str, Animator animator) {
        animator.setTarget(this.f1777c.f1782b.mo1931a(str));
        if (VERSION.SDK_INT < 21) {
            m1849a(animator);
        }
        if (this.f1777c.f1784d == null) {
            this.f1777c.f1784d = new ArrayList<>();
            this.f1777c.f1785e = new ArrayMap<>();
        }
        this.f1777c.f1784d.add(animator);
        this.f1777c.f1785e.put(animator, str);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    private AnimatedVectorDrawableCompat(Context context, C0417a aVar, Resources resources) {
        this.f1776a = new Callback() {
            public final void invalidateDrawable(Drawable drawable) {
                AnimatedVectorDrawableCompat.this.invalidateSelf();
            }

            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
            }

            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
            }
        };
        this.f1778d = context;
        this.f1777c = new C0417a(context, null, this.f1776a, null);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (this.f1872b != null) {
            C0727a.m3107a(this.f1872b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a = C0704f.m2990a(resources, theme, attributeSet, C0428a.f1860e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat a2 = VectorDrawableCompat.m1855a(resources, resourceId, theme);
                        a2.f1788c = false;
                        a2.setCallback(this.f1776a);
                        if (this.f1777c.f1782b != null) {
                            this.f1777c.f1782b.setCallback(null);
                        }
                        this.f1777c.f1782b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0428a.f1861f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f1778d != null) {
                            m1850a(string, C0431d.m1900a(this.f1778d, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f1777c.mo1922a();
    }

    /* renamed from: a */
    public static AnimatedVectorDrawableCompat m1848a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }
}
