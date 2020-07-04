package android.support.design.widget;

import android.content.Context;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p029v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: a */
    private static final int[] f1378a = {16842912};

    /* renamed from: b */
    private boolean f1379b;

    public boolean isChecked() {
        return this.f1379b;
    }

    public void toggle() {
        setChecked(!this.f1379b);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public void setChecked(boolean z) {
        if (this.f1379b != z) {
            this.f1379b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f1379b) {
            return mergeDrawableStates(super.onCreateDrawableState(i + f1378a.length), f1378a);
        }
        return super.onCreateDrawableState(i);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.nn);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0991u.m4187a((View) this, (C0939a) new C0939a() {
            /* renamed from: a */
            public final void mo1390a(View view, AccessibilityEvent accessibilityEvent) {
                super.mo1390a(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            /* renamed from: a */
            public final void mo1148a(View view, C0945c cVar) {
                super.mo1148a(view, cVar);
                cVar.mo3650a(true);
                cVar.mo3658b(CheckableImageButton.this.isChecked());
            }
        });
    }
}
