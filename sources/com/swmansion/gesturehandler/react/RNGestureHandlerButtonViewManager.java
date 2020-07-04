package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RNGestureHandlerButtonViewManager extends ViewGroupManager<C46367a> {

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a */
    static class C46367a extends ViewGroup {

        /* renamed from: a */
        static TypedValue f119402a = new TypedValue();

        /* renamed from: b */
        static C46367a f119403b;

        /* renamed from: c */
        int f119404c;

        /* renamed from: d */
        boolean f119405d;

        /* renamed from: e */
        boolean f119406e;

        /* renamed from: f */
        float f119407f;

        /* renamed from: g */
        boolean f119408g = true;

        public final void dispatchDrawableHotspotChanged(float f, float f2) {
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* renamed from: b */
        private Drawable m145623b() {
            String str;
            int i = VERSION.SDK_INT;
            if (!this.f119406e || i < 21) {
                str = "selectableItemBackground";
            } else {
                str = "selectableItemBackgroundBorderless";
            }
            getContext().getTheme().resolveAttribute(getResources().getIdentifier(str, "attr", "android"), f119402a, true);
            if (i >= 21) {
                return getResources().getDrawable(f119402a.resourceId, getContext().getTheme());
            }
            return getResources().getDrawable(f119402a.resourceId);
        }

        /* renamed from: a */
        public final void mo115269a() {
            if (this.f119408g) {
                this.f119408g = false;
                if (this.f119404c == 0) {
                    setBackground(null);
                }
                if (VERSION.SDK_INT >= 23) {
                    setForeground(null);
                }
                if (this.f119405d && VERSION.SDK_INT >= 23) {
                    setForeground(m145623b());
                    if (this.f119404c != 0) {
                        setBackgroundColor(this.f119404c);
                    }
                } else if (this.f119404c == 0) {
                    setBackground(m145623b());
                } else {
                    PaintDrawable paintDrawable = new PaintDrawable(this.f119404c);
                    Drawable b = m145623b();
                    if (this.f119407f != 0.0f) {
                        paintDrawable.setCornerRadius(this.f119407f);
                        if (VERSION.SDK_INT >= 21 && (b instanceof RippleDrawable)) {
                            PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                            paintDrawable2.setCornerRadius(this.f119407f);
                            ((RippleDrawable) b).setDrawableByLayerId(16908334, paintDrawable2);
                        }
                    }
                    setBackground(new LayerDrawable(new Drawable[]{paintDrawable, b}));
                }
            }
        }

        /* renamed from: b */
        public final void mo115272b(boolean z) {
            this.f119406e = z;
        }

        /* renamed from: a */
        public final void mo115271a(boolean z) {
            this.f119405d = z;
            this.f119408g = true;
        }

        public final void setBackgroundColor(int i) {
            this.f119404c = i;
            this.f119408g = true;
        }

        public C46367a(Context context) {
            super(context);
            setClickable(true);
            setFocusable(true);
        }

        /* renamed from: a */
        public final void mo115270a(float f) {
            this.f119407f = f * getResources().getDisplayMetrics().density;
            this.f119408g = true;
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            if (isPressed()) {
                return true;
            }
            return false;
        }

        public final void setPressed(boolean z) {
            if (z && f119403b == null) {
                f119403b = this;
            }
            if (!z || f119403b == this) {
                super.setPressed(z);
            }
            if (!z && f119403b == this) {
                f119403b = null;
            }
        }

        public final void drawableHotspotChanged(float f, float f2) {
            if (f119403b == null || f119403b == this) {
                super.drawableHotspotChanged(f, f2);
            }
        }
    }

    public String getName() {
        return "RNGestureHandlerButton";
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C46367a aVar) {
        aVar.mo115269a();
    }

    public C46367a createViewInstance(ThemedReactContext themedReactContext) {
        return new C46367a(themedReactContext);
    }

    @ReactProp(name = "borderRadius")
    public void setBorderRadius(C46367a aVar, float f) {
        aVar.mo115270a(f);
    }

    @ReactProp(name = "borderless")
    public void setBorderless(C46367a aVar, boolean z) {
        aVar.mo115272b(z);
    }

    @ReactProp(name = "enabled")
    public void setEnabled(C46367a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @ReactProp(name = "foreground")
    public void setForeground(C46367a aVar, boolean z) {
        aVar.mo115271a(z);
    }
}
