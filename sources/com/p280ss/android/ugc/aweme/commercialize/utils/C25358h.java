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

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.h */
public final class C25358h {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f66756a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25358h.class), "mDecorView", "getMDecorView()Landroid/view/View;"))};

    /* renamed from: f */
    public static final C25360b f66757f = new C25360b(null);

    /* renamed from: b */
    public int f66758b;

    /* renamed from: c */
    public C25359a f66759c;

    /* renamed from: d */
    public final Activity f66760d;

    /* renamed from: e */
    public final View f66761e;

    /* renamed from: g */
    private final C7541d f66762g = C7546e.m23569a(new C25362d(this));

    /* renamed from: h */
    private OnGlobalLayoutListener f66763h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.h$a */
    public interface C25359a {
        /* renamed from: a */
        void mo65924a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.h$b */
    public static final class C25360b {
        private C25360b() {
        }

        public /* synthetic */ C25360b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.h$c */
    static final class C25361c implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C25358h f66764a;

        C25361c(C25358h hVar) {
            this.f66764a = hVar;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            this.f66764a.mo65921a().getWindowVisibleDisplayFrame(rect);
            int height = rect.height();
            if (this.f66764a.f66758b == 0) {
                this.f66764a.f66758b = height;
            } else if (this.f66764a.f66758b != height) {
                int i = height - this.f66764a.f66758b;
                if (i < -20) {
                    this.f66764a.f66761e.animate().translationYBy((float) (-((C25358h.m83383a(this.f66764a.f66761e).bottom - rect.bottom) + 30))).setDuration(100).start();
                    C25359a aVar = this.f66764a.f66759c;
                    if (aVar != null) {
                        aVar.mo65924a(true);
                    }
                } else if (i > 20) {
                    this.f66764a.f66761e.animate().translationY((((float) (this.f66764a.mo65921a().getHeight() - this.f66764a.f66761e.getHeight())) / 2.0f) - ((float) this.f66764a.f66761e.getTop())).setDuration(100).start();
                    C25359a aVar2 = this.f66764a.f66759c;
                    if (aVar2 != null) {
                        aVar2.mo65924a(false);
                    }
                }
                this.f66764a.f66758b = height;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.h$d */
    static final class C25362d extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ C25358h f66765a;

        C25362d(C25358h hVar) {
            this.f66765a = hVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            Window window = this.f66765a.f66760d.getWindow();
            C7573i.m23582a((Object) window, "mActivity.window");
            return window.getDecorView();
        }
    }

    /* renamed from: a */
    public final View mo65921a() {
        return (View) this.f66762g.getValue();
    }

    /* renamed from: b */
    public final void mo65922b() {
        this.f66763h = new C25361c(this);
        mo65921a().getViewTreeObserver().addOnGlobalLayoutListener(this.f66763h);
    }

    /* renamed from: c */
    public final void mo65923c() {
        mo65921a().getViewTreeObserver().removeOnGlobalLayoutListener(this.f66763h);
        this.f66763h = null;
    }

    /* renamed from: a */
    public static Rect m83383a(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    public C25358h(Activity activity, View view) {
        C7573i.m23587b(activity, "mActivity");
        C7573i.m23587b(view, "mContainerView");
        this.f66760d = activity;
        this.f66761e = view;
    }
}
