package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.p026d.C0709c;
import android.support.p022v4.p026d.C0709c.C0710a;
import android.support.p022v4.view.C0989s;
import android.support.p022v4.widget.C1036b;
import android.support.p022v4.widget.C1056n;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: android.support.v7.widget.AppCompatTextView */
public class AppCompatTextView extends TextView implements C0989s, C1036b {

    /* renamed from: b */
    private final C1390d f4633b;

    /* renamed from: c */
    private final C1418m f4634c;

    /* renamed from: d */
    private Future<C0709c> f4635d;

    public int getFirstBaselineToTopHeight() {
        return C1056n.m4574c(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C1056n.m4576d(this);
    }

    public CharSequence getText() {
        mo1061a();
        return super.getText();
    }

    public C0710a getTextMetricsParamsCompat() {
        return C1056n.m4578e(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f4633b != null) {
            return this.f4633b.mo6474a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f4633b != null) {
            return this.f4633b.mo6480b();
        }
        return null;
    }

    /* renamed from: a */
    private void mo1061a() {
        if (this.f4635d != null) {
            try {
                Future<C0709c> future = this.f4635d;
                this.f4635d = null;
                C1056n.m4571a((TextView) this, (C0709c) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4633b != null) {
            this.f4633b.mo6481c();
        }
        if (this.f4634c != null) {
            this.f4634c.mo6552a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (f3605a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f4634c != null) {
            return this.f4634c.mo6567g();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f3605a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f4634c != null) {
            return this.f4634c.mo6566f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f3605a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f4634c != null) {
            return this.f4634c.mo6565e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f3605a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f4634c != null) {
            return this.f4634c.mo6568h();
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (f3605a) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        } else if (this.f4634c != null) {
            return this.f4634c.mo6564d();
        } else {
            return 0;
        }
    }

    public void setLineHeight(int i) {
        C1056n.m4577d(this, i);
    }

    public void setPrecomputedText(C0709c cVar) {
        C1056n.m4571a((TextView) this, cVar);
    }

    public void setTextMetricsParamsCompat(C0710a aVar) {
        C1056n.m4570a((TextView) this, aVar);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1056n.m4565a((TextView) this, callback));
    }

    public void setTextFuture(Future<C0709c> future) {
        this.f4635d = future;
        requestLayout();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1399h.m6932a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f4633b != null) {
            this.f4633b.mo6478a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f4633b != null) {
            this.f4633b.mo6475a(i);
        }
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C1056n.m4572b(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C1056n.m4575c(this, i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4633b != null) {
            this.f4633b.mo6476a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f4633b != null) {
            this.f4633b.mo6477a(mode);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f3605a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        if (this.f4634c != null) {
            this.f4634c.mo6553a(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo1061a();
        super.onMeasure(i, i2);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f4634c != null) {
            this.f4634c.mo6556a(context, i);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (f3605a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        if (this.f4634c != null) {
            this.f4634c.mo6561a(iArr, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (f3605a) {
            super.setTextSize(i, f);
            return;
        }
        if (this.f4634c != null) {
            this.f4634c.mo6554a(i, f);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C1362as.m6739a(context), attributeSet, i);
        this.f4633b = new C1390d(this);
        this.f4633b.mo6479a(attributeSet, i);
        this.f4634c = new C1418m(this);
        this.f4634c.mo6557a(attributeSet, i);
        this.f4634c.mo6552a();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f4634c != null && !f3605a && this.f4634c.mo6563c()) {
            this.f4634c.mo6562b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (f3605a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        if (this.f4634c != null) {
            this.f4634c.mo6555a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f4634c != null) {
            this.f4634c.mo6560a(z, i, i2, i3, i4);
        }
    }
}
