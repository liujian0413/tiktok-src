package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.graphics.Rect;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.common.applog.GlobalContext;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper */
public final class AccountKeyBoardHelper implements C0042h, OnGlobalLayoutListener {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f58910a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AccountKeyBoardHelper.class), "screenHeight", "getScreenHeight()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AccountKeyBoardHelper.class), "keyBoardHeight", "getKeyBoardHeight()I"))};

    /* renamed from: d */
    public static final C7541d f58911d = C7546e.m23568a(LazyThreadSafetyMode.NONE, C22036b.f58922a);

    /* renamed from: e */
    public static final C22035a f58912e = new C22035a(null);

    /* renamed from: b */
    public C22153l f58913b;

    /* renamed from: c */
    public final Fragment f58914c;

    /* renamed from: f */
    private final C7541d f58915f = C7546e.m23569a(new C22038d(this));

    /* renamed from: g */
    private final C7541d f58916g = C7546e.m23569a(new C22037c(this));

    /* renamed from: h */
    private final Rect f58917h = new Rect();

    /* renamed from: i */
    private Boolean f58918i;

    /* renamed from: j */
    private boolean f58919j = true;

    /* renamed from: k */
    private final View f58920k;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper$a */
    public static final class C22035a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f58921a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C22035a.class), "needAutoShowKeyboard", "getNeedAutoShowKeyboard()Z"))};

        private C22035a() {
        }

        /* renamed from: a */
        public static boolean m73321a() {
            return ((Boolean) AccountKeyBoardHelper.f58911d.getValue()).booleanValue();
        }

        public /* synthetic */ C22035a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper$b */
    static final class C22036b extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C22036b f58922a = new C22036b();

        C22036b() {
            super(0);
        }

        /* renamed from: a */
        private static boolean m73322a() {
            if (C9738o.m28709b(GlobalContext.getContext()) >= 1183) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m73322a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper$c */
    static final class C22037c extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ AccountKeyBoardHelper f58923a;

        C22037c(AccountKeyBoardHelper accountKeyBoardHelper) {
            this.f58923a = accountKeyBoardHelper;
            super(0);
        }

        /* renamed from: a */
        private int m73323a() {
            return this.f58923a.mo58386a() / 3;
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m73323a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper$d */
    static final class C22038d extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ AccountKeyBoardHelper f58924a;

        C22038d(AccountKeyBoardHelper accountKeyBoardHelper) {
            this.f58924a = accountKeyBoardHelper;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m73324a());
        }

        /* renamed from: a */
        private int m73324a() {
            FragmentActivity activity = this.f58924a.f58914c.getActivity();
            if (activity != null) {
                Window window = activity.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        View rootView = decorView.getRootView();
                        if (rootView != null) {
                            return rootView.getHeight();
                        }
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: b */
    private final int m73319b() {
        return ((Number) this.f58916g.getValue()).intValue();
    }

    /* renamed from: a */
    public final int mo58386a() {
        return ((Number) this.f58915f.getValue()).intValue();
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void startListen() {
        this.f58920k.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void stopListen() {
        this.f58920k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public final void onGlobalLayout() {
        boolean z = false;
        if (this.f58919j) {
            this.f58919j = false;
            return;
        }
        this.f58917h.setEmpty();
        FragmentActivity activity = this.f58914c.getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null) {
                    decorView.getWindowVisibleDisplayFrame(this.f58917h);
                }
            }
        }
        if (mo58386a() - this.f58917h.bottom > m73319b()) {
            z = true;
        }
        if (!C7573i.m23585a((Object) Boolean.valueOf(z), (Object) this.f58918i)) {
            this.f58918i = Boolean.valueOf(z);
            if (z) {
                C22153l lVar = this.f58913b;
                if (lVar != null) {
                    lVar.mo58427c();
                }
            } else {
                C22153l lVar2 = this.f58913b;
                if (lVar2 != null) {
                    lVar2.ad_();
                }
            }
        }
    }

    public AccountKeyBoardHelper(View view, Fragment fragment) {
        C7573i.m23587b(view, "rootView");
        C7573i.m23587b(fragment, "fragment");
        this.f58920k = view;
        this.f58914c = fragment;
        this.f58914c.getLifecycle().mo55a(this);
    }
}
