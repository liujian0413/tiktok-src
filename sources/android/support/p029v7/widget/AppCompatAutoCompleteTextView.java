package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0989s;
import android.support.p022v4.widget.C1056n;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.AppCompatAutoCompleteTextView */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements C0989s {

    /* renamed from: a */
    private static final int[] f4590a = {16843126};

    /* renamed from: b */
    private final C1390d f4591b;

    /* renamed from: c */
    private final C1418m f4592c;

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f4591b != null) {
            return this.f4591b.mo6474a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f4591b != null) {
            return this.f4591b.mo6480b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4591b != null) {
            this.f4591b.mo6481c();
        }
        if (this.f4592c != null) {
            this.f4592c.mo6552a();
        }
    }

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1056n.m4565a((TextView) this, callback));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1399h.m6932a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f4591b != null) {
            this.f4591b.mo6478a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f4591b != null) {
            this.f4591b.mo6475a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C1065a.m4641b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4591b != null) {
            this.f4591b.mo6476a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f4591b != null) {
            this.f4591b.mo6477a(mode);
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bq);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f4592c != null) {
            this.f4592c.mo6556a(context, i);
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C1362as.m6739a(context), attributeSet, i);
        C1365av a = C1365av.m6744a(getContext(), attributeSet, f4590a, i, 0);
        if (a.mo6406g(0)) {
            setDropDownBackgroundDrawable(a.mo6392a(0));
        }
        a.mo6393a();
        this.f4591b = new C1390d(this);
        this.f4591b.mo6479a(attributeSet, i);
        this.f4592c = new C1418m(this);
        this.f4592c.mo6557a(attributeSet, i);
        this.f4592c.mo6552a();
    }
}
