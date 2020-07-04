package android.support.p029v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.ay */
final class C1370ay {

    /* renamed from: a */
    private final Context f5363a;

    /* renamed from: b */
    private final View f5364b;

    /* renamed from: c */
    private final TextView f5365c;

    /* renamed from: d */
    private final LayoutParams f5366d = new LayoutParams();

    /* renamed from: e */
    private final Rect f5367e = new Rect();

    /* renamed from: f */
    private final int[] f5368f = new int[2];

    /* renamed from: g */
    private final int[] f5369g = new int[2];

    /* renamed from: b */
    private boolean m6774b() {
        if (this.f5364b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6415a() {
        if (m6774b()) {
            ((WindowManager) this.f5363a.getSystemService("window")).removeView(this.f5364b);
        }
    }

    /* renamed from: a */
    private static View m6772a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    C1370ay(Context context) {
        this.f5363a = context;
        this.f5364b = LayoutInflater.from(this.f5363a).inflate(R.layout.a1, null);
        this.f5365c = (TextView) this.f5364b.findViewById(R.id.by6);
        this.f5366d.setTitle(getClass().getSimpleName());
        this.f5366d.packageName = this.f5363a.getPackageName();
        this.f5366d.type = 1002;
        this.f5366d.width = -2;
        this.f5366d.height = -2;
        this.f5366d.format = -3;
        this.f5366d.windowAnimations = R.style.h;
        this.f5366d.flags = 24;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6416a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m6774b()) {
            mo6415a();
        }
        this.f5365c.setText(charSequence);
        m6773a(view, i, i2, z, this.f5366d);
        ((WindowManager) this.f5363a.getSystemService("window")).addView(this.f5364b, this.f5366d);
    }

    /* renamed from: a */
    private void m6773a(View view, int i, int i2, boolean z, LayoutParams layoutParams) {
        int i3;
        int i4;
        int i5;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f5363a.getResources().getDimensionPixelOffset(R.dimen.nj);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f5363a.getResources().getDimensionPixelOffset(R.dimen.ni);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f5363a.getResources();
        if (z) {
            i5 = R.dimen.nm;
        } else {
            i5 = R.dimen.nl;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i5);
        View a = m6772a(view);
        if (a != null) {
            a.getWindowVisibleDisplayFrame(this.f5367e);
            if (this.f5367e.left < 0 && this.f5367e.top < 0) {
                Resources resources2 = this.f5363a.getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i6 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i6 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                this.f5367e.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            a.getLocationOnScreen(this.f5369g);
            view.getLocationOnScreen(this.f5368f);
            int[] iArr = this.f5368f;
            iArr[0] = iArr[0] - this.f5369g[0];
            int[] iArr2 = this.f5368f;
            iArr2[1] = iArr2[1] - this.f5369g[1];
            layoutParams.x = (this.f5368f[0] + i) - (a.getWidth() / 2);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            this.f5364b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.f5364b.getMeasuredHeight();
            int i7 = ((this.f5368f[1] + i3) - dimensionPixelOffset3) - measuredHeight;
            int i8 = this.f5368f[1] + i4 + dimensionPixelOffset3;
            if (z) {
                if (i7 < 0) {
                    layoutParams.y = i8;
                    return;
                }
            } else if (measuredHeight + i8 <= this.f5367e.height()) {
                layoutParams.y = i8;
                return;
            }
            layoutParams.y = i7;
        }
    }
}
