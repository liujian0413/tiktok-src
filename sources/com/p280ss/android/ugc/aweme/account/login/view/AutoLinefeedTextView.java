package com.p280ss.android.ugc.aweme.account.login.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.account.views.AutoRTLTextView;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.account.login.view.AutoLinefeedTextView */
public final class AutoLinefeedTextView extends AutoRTLTextView {

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.AutoLinefeedTextView$a */
    static final class C22155a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AutoLinefeedTextView f59193a;

        /* renamed from: b */
        final /* synthetic */ String f59194b;

        C22155a(AutoLinefeedTextView autoLinefeedTextView, String str) {
            this.f59193a = autoLinefeedTextView;
            this.f59194b = str;
        }

        public final void run() {
            boolean z;
            CharSequence charSequence = this.f59194b;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && this.f59193a.getMeasuredWidth() != 0 && this.f59193a.getMeasuredHeight() != 0) {
                CharSequence text = this.f59193a.getText();
                C7573i.m23582a((Object) text, "text");
                int a = C7634n.m23730a(text, this.f59194b, 0, false, 6, (Object) null);
                if (a != -1) {
                    int length = (this.f59194b.length() + a) - 1;
                    TextPaint paint = this.f59193a.getPaint();
                    CharSequence text2 = this.f59193a.getText();
                    C7573i.m23582a((Object) text2, "text");
                    int measureText = (int) paint.measureText(text2.subSequence(0, a + 2).toString());
                    TextPaint paint2 = this.f59193a.getPaint();
                    CharSequence text3 = this.f59193a.getText();
                    C7573i.m23582a((Object) text3, "text");
                    if (measureText / this.f59193a.getMeasuredWidth() != ((int) paint2.measureText(text3.subSequence(0, length + 1).toString())) / this.f59193a.getMeasuredWidth()) {
                        this.f59193a.setText(new StringBuffer(this.f59193a.getText().toString()).insert(a, "\n").toString());
                    }
                }
            }
        }
    }

    public AutoLinefeedTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AutoLinefeedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo58473a(String str, String str2) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            setText(charSequence);
            post(new C22155a(this, str2));
        }
    }

    public AutoLinefeedTextView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AutoLinefeedTextView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 16842884;
        }
        this(context, attributeSet, i);
    }
}
