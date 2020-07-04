package android.support.p022v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.DrawerLayout.C1009c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.ActionBarDrawerToggle */
public class ActionBarDrawerToggle implements C1009c {

    /* renamed from: c */
    private static final int[] f2094c = {16843531};

    /* renamed from: a */
    final Activity f2095a;

    /* renamed from: b */
    public boolean f2096b;

    /* renamed from: d */
    private final C0535a f2097d;

    /* renamed from: e */
    private C0537c f2098e;

    /* renamed from: f */
    private final int f2099f;

    /* renamed from: g */
    private final int f2100g;

    /* renamed from: h */
    private C0536b f2101h;

    /* renamed from: android.support.v4.app.ActionBarDrawerToggle$a */
    public interface C0535a {
    }

    /* renamed from: android.support.v4.app.ActionBarDrawerToggle$b */
    static class C0536b {

        /* renamed from: a */
        Method f2102a;

        /* renamed from: b */
        Method f2103b;

        /* renamed from: c */
        ImageView f2104c;

        C0536b(Activity activity) {
            try {
                this.f2102a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f2103b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        View childAt2 = viewGroup.getChildAt(1);
                        if (childAt.getId() != 16908332) {
                            childAt2 = childAt;
                        }
                        if (childAt2 instanceof ImageView) {
                            this.f2104c = (ImageView) childAt2;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.ActionBarDrawerToggle$c */
    class C0537c extends InsetDrawable implements Callback {

        /* renamed from: a */
        public float f2105a;

        /* renamed from: b */
        final /* synthetic */ ActionBarDrawerToggle f2106b;

        /* renamed from: c */
        private final boolean f2107c;

        /* renamed from: d */
        private final Rect f2108d;

        /* renamed from: e */
        private float f2109e;

        /* renamed from: a */
        public final void mo2171a(float f) {
            this.f2105a = f;
            invalidateSelf();
        }

        public final void draw(Canvas canvas) {
            boolean z;
            copyBounds(this.f2108d);
            canvas.save();
            int i = 1;
            if (C0991u.m4220h(this.f2106b.f2095a.getWindow().getDecorView()) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = -1;
            }
            float width = (float) this.f2108d.width();
            canvas.translate((-this.f2109e) * width * this.f2105a * ((float) i), 0.0f);
            if (z && !this.f2107c) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public void onDrawerStateChanged(int i) {
    }

    public void onDrawerClosed(View view) {
        this.f2098e.mo2171a(0.0f);
        if (this.f2096b) {
            m2234a(this.f2099f);
        }
    }

    public void onDrawerOpened(View view) {
        this.f2098e.mo2171a(1.0f);
        if (this.f2096b) {
            m2234a(this.f2100g);
        }
    }

    /* renamed from: a */
    private void m2234a(int i) {
        if (this.f2097d == null) {
            if (VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.f2095a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                }
                return;
            }
            if (this.f2101h == null) {
                this.f2101h = new C0536b(this.f2095a);
            }
            if (this.f2101h.f2102a != null) {
                try {
                    ActionBar actionBar2 = this.f2095a.getActionBar();
                    this.f2101h.f2103b.invoke(actionBar2, new Object[]{Integer.valueOf(i)});
                    actionBar2.setSubtitle(actionBar2.getSubtitle());
                } catch (Exception unused) {
                }
            }
        }
    }

    public void onDrawerSlide(View view, float f) {
        float f2;
        float f3 = this.f2098e.f2105a;
        if (f > 0.5f) {
            f2 = Math.max(f3, Math.max(0.0f, f - 0.5f) * 2.0f);
        } else {
            f2 = Math.min(f3, f * 2.0f);
        }
        this.f2098e.mo2171a(f2);
    }
}
