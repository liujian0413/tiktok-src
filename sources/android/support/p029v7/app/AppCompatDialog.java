package android.support.p029v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.view.C0973f;
import android.support.p022v4.view.C0973f.C0974a;
import android.support.p029v7.view.C1153b;
import android.support.p029v7.view.C1153b.C1154a;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.app.AppCompatDialog */
public class AppCompatDialog extends Dialog implements C1106b {

    /* renamed from: a */
    private C1107c f3917a;

    /* renamed from: b */
    private final C0974a f3918b;

    public void onSupportActionModeFinished(C1153b bVar) {
    }

    public void onSupportActionModeStarted(C1153b bVar) {
    }

    public C1153b onWindowStartingSupportActionMode(C1154a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        mo4364b().mo4308f();
    }

    /* renamed from: b */
    public final C1107c mo4364b() {
        if (this.f3917a == null) {
            this.f3917a = C1107c.m4898a((Dialog) this, (C1106b) this);
        }
        return this.f3917a;
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo4364b().mo4305d();
    }

    public AppCompatDialog(Context context) {
        this(context, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo4362a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setContentView(int i) {
        mo4364b().mo4298b(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0973f.m4115a(this.f3918b, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo4364b().mo4286a(i);
    }

    public void setContentView(View view) {
        mo4364b().mo4292a(view);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo4364b().mo4294a(charSequence);
    }

    /* renamed from: b */
    public final boolean mo4365b(int i) {
        return mo4364b().mo4304c(1);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo4364b().mo4315i();
        super.onCreate(bundle);
        mo4364b().mo4289a(bundle);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo4364b().mo4294a((CharSequence) getContext().getString(i));
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo4364b().mo4301b(view, layoutParams);
    }

    public AppCompatDialog(Context context, int i) {
        super(context, m4830a(context, i));
        this.f3918b = new C0974a() {
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return AppCompatDialog.this.mo4362a(keyEvent);
            }
        };
        mo4364b().mo4289a((Bundle) null);
        mo4364b().mo4316j();
    }

    /* renamed from: a */
    private static int m4830a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.iu, typedValue, true);
        return typedValue.resourceId;
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo4364b().mo4293a(view, layoutParams);
    }
}
