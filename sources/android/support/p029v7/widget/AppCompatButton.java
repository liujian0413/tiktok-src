package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0989s;
import android.support.p022v4.widget.C1036b;
import android.support.p022v4.widget.C1056n;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.AppCompatButton */
public class AppCompatButton extends Button implements C0989s, C1036b {

    /* renamed from: b */
    private final C1390d f4593b;

    /* renamed from: c */
    private final C1418m f4594c;

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        C1391e.m6888a(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f4593b != null) {
            return this.f4593b.mo6474a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f4593b != null) {
            return this.f4593b.mo6480b();
        }
        return null;
    }

    public final void ab_() {
        super.drawableStateChanged();
        if (this.f4593b != null) {
            this.f4593b.mo6481c();
        }
        if (this.f4594c != null) {
            this.f4594c.mo6552a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (f3605a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f4594c != null) {
            return this.f4594c.mo6567g();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f3605a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f4594c != null) {
            return this.f4594c.mo6566f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f3605a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f4594c != null) {
            return this.f4594c.mo6565e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f3605a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f4594c != null) {
            return this.f4594c.mo6568h();
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (f3605a) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        } else if (this.f4594c != null) {
            return this.f4594c.mo6564d();
        } else {
            return 0;
        }
    }

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1056n.m4565a((TextView) this, callback));
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f4593b != null) {
            this.f4593b.mo6478a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f4593b != null) {
            this.f4593b.mo6475a(i);
        }
    }

    public void setSupportAllCaps(boolean z) {
        if (this.f4594c != null) {
            this.f4594c.mo6559a(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4593b != null) {
            this.f4593b.mo6476a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f4593b != null) {
            this.f4593b.mo6477a(mode);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f3605a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        if (this.f4594c != null) {
            this.f4594c.mo6553a(i);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.du);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f4594c != null) {
            this.f4594c.mo6556a(context, i);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (f3605a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        if (this.f4594c != null) {
            this.f4594c.mo6561a(iArr, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (f3605a) {
            super.setTextSize(i, f);
            return;
        }
        if (this.f4594c != null) {
            this.f4594c.mo6554a(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C1362as.m6739a(context), attributeSet, i);
        this.f4593b = new C1390d(this);
        this.f4593b.mo6479a(attributeSet, i);
        this.f4594c = new C1418m(this);
        this.f4594c.mo6557a(attributeSet, i);
        this.f4594c.mo6552a();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f4594c != null && !f3605a && this.f4594c.mo6563c()) {
            this.f4594c.mo6562b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (f3605a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        if (this.f4594c != null) {
            this.f4594c.mo6555a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f4594c != null) {
            this.f4594c.mo6560a(z, i, i2, i3, i4);
        }
    }
}
