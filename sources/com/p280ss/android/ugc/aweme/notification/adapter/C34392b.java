package com.p280ss.android.ugc.aweme.notification.adapter;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.b */
public final class C34392b extends BaseMovementMethod {

    /* renamed from: a */
    public static final C7541d f89807a = C7546e.m23569a(C34394b.f89810a);

    /* renamed from: b */
    public static final C34393a f89808b = new C34393a(null);

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.b$a */
    public static final class C34393a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f89809a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C34393a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/notification/adapter/ClickableMovementMethod;"))};

        private C34393a() {
        }

        /* renamed from: a */
        public static C34392b m111245a() {
            return (C34392b) C34392b.f89807a.getValue();
        }

        public /* synthetic */ C34393a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.b$b */
    static final class C34394b extends Lambda implements C7561a<C34392b> {

        /* renamed from: a */
        public static final C34394b f89810a = new C34394b();

        C34394b() {
            super(0);
        }

        /* renamed from: a */
        private static C34392b m111246a() {
            return new C34392b();
        }

        public final /* synthetic */ Object invoke() {
            return m111246a();
        }
    }

    public final boolean canSelectArbitrarily() {
        return false;
    }

    public final void initialize(TextView textView, Spannable spannable) {
        C7573i.m23587b(textView, "widget");
        C7573i.m23587b(spannable, "text");
        Selection.removeSelection(spannable);
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        boolean z;
        C7573i.m23587b(textView, "widget");
        C7573i.m23587b(spannable, "buffer");
        C7573i.m23587b(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) totalPaddingLeft);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            C7573i.m23582a((Object) clickableSpanArr, "link");
            if (clickableSpanArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (actionMasked == 1) {
                    clickableSpanArr[0].onClick(textView);
                } else {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return false;
    }
}
