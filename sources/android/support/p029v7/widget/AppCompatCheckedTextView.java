package android.support.p029v7.widget;

import android.content.Context;
import android.support.p022v4.widget.C1056n;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.AppCompatCheckedTextView */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f4596a = {16843016};

    /* renamed from: b */
    private final C1418m f4597b;

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4597b != null) {
            this.f4597b.mo6552a();
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1056n.m4565a((TextView) this, callback));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1399h.m6932a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C1065a.m4641b(getContext(), i));
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f4597b != null) {
            this.f4597b.mo6556a(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(C1362as.m6739a(context), attributeSet, i);
        this.f4597b = new C1418m(this);
        this.f4597b.mo6557a(attributeSet, i);
        this.f4597b.mo6552a();
        C1365av a = C1365av.m6744a(getContext(), attributeSet, f4596a, i, 0);
        setCheckMarkDrawable(a.mo6392a(0));
        a.mo6393a();
    }
}
