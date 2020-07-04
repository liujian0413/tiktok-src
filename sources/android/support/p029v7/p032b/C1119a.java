package android.support.p029v7.p032b;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: android.support.v7.b.a */
public final class C1119a implements TransformationMethod {

    /* renamed from: a */
    private Locale f4002a;

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public C1119a(Context context) {
        this.f4002a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f4002a);
        }
        return null;
    }
}
