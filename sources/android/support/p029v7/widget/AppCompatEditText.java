package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0989s;
import android.support.p022v4.widget.C1056n;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.AppCompatEditText */
public class AppCompatEditText extends EditText implements C0989s {

    /* renamed from: a */
    private final C1390d f4598a;

    /* renamed from: b */
    private final C1418m f4599b;

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f4598a != null) {
            return this.f4598a.mo6474a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f4598a != null) {
            return this.f4598a.mo6480b();
        }
        return null;
    }

    public Editable getText() {
        if (VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4598a != null) {
            this.f4598a.mo6481c();
        }
        if (this.f4599b != null) {
            this.f4599b.mo6552a();
        }
    }

    public AppCompatEditText(Context context) {
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
        if (this.f4598a != null) {
            this.f4598a.mo6478a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f4598a != null) {
            this.f4598a.mo6475a(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4598a != null) {
            this.f4598a.mo6476a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f4598a != null) {
            this.f4598a.mo6477a(mode);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.jk);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f4599b != null) {
            this.f4599b.mo6556a(context, i);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C1362as.m6739a(context), attributeSet, i);
        this.f4598a = new C1390d(this);
        this.f4598a.mo6479a(attributeSet, i);
        this.f4599b = new C1418m(this);
        this.f4599b.mo6557a(attributeSet, i);
        this.f4599b.mo6552a();
    }
}
