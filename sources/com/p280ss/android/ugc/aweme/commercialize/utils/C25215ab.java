package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ab */
public final class C25215ab {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f66526a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25215ab.class), "mDecorView", "getMDecorView()Landroid/view/View;"))};

    /* renamed from: f */
    public static final C25217b f66527f = new C25217b(null);

    /* renamed from: b */
    public int f66528b;

    /* renamed from: c */
    public int f66529c;

    /* renamed from: d */
    public C25216a f66530d;

    /* renamed from: e */
    public final Activity f66531e;

    /* renamed from: g */
    private final C7541d f66532g = C7546e.m23569a(new C25218c(this));

    /* renamed from: h */
    private OnGlobalLayoutListener f66533h = new C25219d(this);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ab$a */
    public interface C25216a {
        /* renamed from: a */
        void mo65832a(int i, int i2, int i3);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ab$b */
    public static final class C25217b {
        private C25217b() {
        }

        public /* synthetic */ C25217b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ab$c */
    static final class C25218c extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ C25215ab f66534a;

        C25218c(C25215ab abVar) {
            this.f66534a = abVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            Window window = this.f66534a.f66531e.getWindow();
            C7573i.m23582a((Object) window, "mActivity.window");
            return window.getDecorView();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ab$d */
    static final class C25219d implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C25215ab f66535a;

        C25219d(C25215ab abVar) {
            this.f66535a = abVar;
        }

        public final void onGlobalLayout() {
            int c = this.f66535a.mo65831c();
            if (this.f66535a.f66528b == 0) {
                this.f66535a.f66528b = c;
            } else if (this.f66535a.f66528b != c) {
                if (Math.abs(c - this.f66535a.f66528b) > 20) {
                    C25216a aVar = this.f66535a.f66530d;
                    if (aVar != null) {
                        aVar.mo65832a(this.f66535a.f66528b, c, this.f66535a.f66529c);
                    }
                }
                this.f66535a.f66528b = c;
            }
        }
    }

    /* renamed from: d */
    private final View m82912d() {
        return (View) this.f66532g.getValue();
    }

    /* renamed from: b */
    public final void mo65830b() {
        m82912d().getViewTreeObserver().removeOnGlobalLayoutListener(this.f66533h);
    }

    /* renamed from: a */
    public final void mo65829a() {
        this.f66529c = mo65831c();
        this.f66528b = this.f66529c;
        m82912d().getViewTreeObserver().addOnGlobalLayoutListener(this.f66533h);
    }

    /* renamed from: c */
    public final int mo65831c() {
        Rect rect = new Rect();
        m82912d().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    public C25215ab(Activity activity) {
        C7573i.m23587b(activity, "mActivity");
        this.f66531e = activity;
    }
}
