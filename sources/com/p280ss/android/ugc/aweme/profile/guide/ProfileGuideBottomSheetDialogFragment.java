package com.p280ss.android.ugc.aweme.profile.guide;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0343a;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideBottomSheetDialogFragment */
public abstract class ProfileGuideBottomSheetDialogFragment extends BottomSheetDialogFragment {

    /* renamed from: c */
    public static final C35795a f93817c = new C35795a(null);

    /* renamed from: a */
    public boolean f93818a;

    /* renamed from: b */
    public boolean f93819b = true;

    /* renamed from: d */
    private boolean f93820d;

    /* renamed from: e */
    private BottomSheetBehavior<View> f93821e;

    /* renamed from: f */
    private HashMap f93822f;

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideBottomSheetDialogFragment$a */
    static final class C35795a {
        private C35795a() {
        }

        public /* synthetic */ C35795a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideBottomSheetDialogFragment$b */
    static final class C35796b implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ ProfileGuideBottomSheetDialogFragment f93823a;

        C35796b(ProfileGuideBottomSheetDialogFragment profileGuideBottomSheetDialogFragment) {
            this.f93823a = profileGuideBottomSheetDialogFragment;
        }

        public final void onShow(DialogInterface dialogInterface) {
            this.f93823a.mo90691c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideBottomSheetDialogFragment$c */
    static final class C35797c implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f93824a;

        /* renamed from: b */
        final /* synthetic */ ProfileGuideBottomSheetDialogFragment f93825b;

        C35797c(Dialog dialog, ProfileGuideBottomSheetDialogFragment profileGuideBottomSheetDialogFragment) {
            this.f93824a = dialog;
            this.f93825b = profileGuideBottomSheetDialogFragment;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            C7573i.m23582a((Object) keyEvent, "event");
            if (keyEvent.getKeyCode() != 4 || !this.f93825b.f93819b) {
                return false;
            }
            if (keyEvent.getAction() == 1) {
                C35810a.m115624a(this.f93824a);
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideBottomSheetDialogFragment$d */
    static final class C35798d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileGuideBottomSheetDialogFragment f93826a;

        C35798d(ProfileGuideBottomSheetDialogFragment profileGuideBottomSheetDialogFragment) {
            this.f93826a = profileGuideBottomSheetDialogFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f93826a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideBottomSheetDialogFragment$e */
    static final class C35799e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProfileGuideBottomSheetDialogFragment f93827a;

        C35799e(ProfileGuideBottomSheetDialogFragment profileGuideBottomSheetDialogFragment) {
            this.f93827a = profileGuideBottomSheetDialogFragment;
        }

        public final void run() {
            Dialog dialog = this.f93827a.getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setWindowAnimations(R.style.s0);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideBottomSheetDialogFragment$f */
    public static final class C35800f extends C0343a {

        /* renamed from: a */
        final /* synthetic */ ProfileGuideBottomSheetDialogFragment f93828a;

        /* renamed from: a */
        public final void mo1372a(View view, float f) {
            C7573i.m23587b(view, "p0");
        }

        C35800f(ProfileGuideBottomSheetDialogFragment profileGuideBottomSheetDialogFragment) {
            this.f93828a = profileGuideBottomSheetDialogFragment;
        }

        /* renamed from: a */
        public final void mo1373a(View view, int i) {
            C7573i.m23587b(view, "bottomSheet");
            if (!this.f93828a.f93819b && i == 1) {
                BottomSheetBehavior a = BottomSheetBehavior.m1365a(view);
                C7573i.m23582a((Object) a, "BottomSheetBehavior.from(bottomSheet)");
                a.mo1357b(4);
            }
            if (i == 5) {
                this.f93828a.dismiss();
            }
        }
    }

    /* renamed from: a */
    public abstract int mo90688a();

    /* renamed from: b */
    public abstract String mo90689b();

    /* renamed from: d */
    public void mo90692d() {
        if (this.f93822f != null) {
            this.f93822f.clear();
        }
    }

    public void dismiss() {
        dismiss(true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f93818a = false;
        mo90692d();
    }

    /* renamed from: g */
    private final void mo90705g() {
        BottomSheetBehavior f = mo90704f();
        if (f != null) {
            f.f1347m = new C35800f(this);
        }
    }

    /* renamed from: h */
    private final void mo90706h() {
        C6907h.m21524a(mo90689b(), (Map) C22984d.m75611a().mo59973a("event_type", "impression").f60753a);
    }

    /* renamed from: i */
    private void m115584i() {
        C6907h.m21524a(mo90689b(), (Map) C22984d.m75611a().mo59973a("event_type", "exit").f60753a);
    }

    public void onStop() {
        if (!this.f93820d) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setWindowAnimations(0);
                }
            }
        }
        super.onStop();
    }

    /* renamed from: f */
    private final BottomSheetBehavior<View> mo90704f() {
        ViewParent viewParent;
        LayoutParams layoutParams;
        Behavior behavior;
        if (this.f93821e != null) {
            return this.f93821e;
        }
        View view = getView();
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof View)) {
            viewParent = null;
        }
        View view2 = (View) viewParent;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof C0355d)) {
            layoutParams = null;
        }
        C0355d dVar = (C0355d) layoutParams;
        if (dVar != null) {
            behavior = dVar.f1407a;
        } else {
            behavior = null;
        }
        if (!(behavior instanceof BottomSheetBehavior)) {
            behavior = null;
        }
        this.f93821e = (BottomSheetBehavior) behavior;
        return this.f93821e;
    }

    /* renamed from: c */
    public void mo90691c() {
        ViewParent viewParent;
        ViewParent viewParent2;
        View view = getView();
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof View)) {
            viewParent = null;
        }
        View view2 = (View) viewParent;
        if (view2 != null) {
            viewParent2 = view2.getParent();
        } else {
            viewParent2 = null;
        }
        if (!(viewParent2 instanceof View)) {
            viewParent2 = null;
        }
        View view3 = (View) viewParent2;
        if (view3 != null) {
            View findViewById = view3.findViewById(R.id.dn6);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C35798d(this));
            }
        }
    }

    public void onStart() {
        ViewParent viewParent;
        super.onStart();
        mo90703e();
        mo90705g();
        View view = getView();
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof View)) {
            viewParent = null;
        }
        View view2 = (View) viewParent;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
        View view3 = getView();
        if (view3 != null) {
            view3.postDelayed(new C35799e(this), 50);
        }
    }

    /* renamed from: e */
    private final void mo90703e() {
        ViewParent viewParent;
        LayoutParams layoutParams;
        Object obj;
        View view = getView();
        Object obj2 = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof View)) {
            viewParent = null;
        }
        View view2 = (View) viewParent;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof C0355d)) {
            layoutParams = null;
        }
        C0355d dVar = (C0355d) layoutParams;
        if (dVar != null) {
            obj = dVar.f1407a;
        } else {
            obj = null;
        }
        if (obj instanceof BottomSheetBehavior) {
            obj2 = obj;
        }
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo1352a(mo90688a());
        }
        if (dVar != null) {
            dVar.height = mo90688a();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f93820d = true;
        super.onCancel(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.t0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo90690b(boolean z) {
        String str;
        String b = mo90689b();
        C22984d a = C22984d.m75611a();
        String str2 = "event_type";
        if (z) {
            str = "upload_success";
        } else {
            str = "upload_fail";
        }
        C6907h.m21524a(b, (Map) a.mo59973a(str2, str).f60753a);
    }

    /* access modifiers changed from: protected */
    public void dismiss(boolean z) {
        if (z) {
            m115584i();
        }
        BottomSheetBehavior f = mo90704f();
        if (f != null) {
            f.mo1357b(4);
        }
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
    }

    /* renamed from: a */
    private static void m115579a(Window window) {
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(201326592);
                View decorView = window.getDecorView();
                C7573i.m23582a((Object) decorView, "decorView");
                decorView.setSystemUiVisibility(1280);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
            } else {
                window.addFlags(67108864);
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCancelable(false);
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setOnShowListener(new C35796b(this));
        onCreateDialog.setOnKeyListener(new C35797c(onCreateDialog, this));
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
            window.setGravity(80);
            window.setSoftInputMode(16);
        }
        m115579a(onCreateDialog.getWindow());
        C7573i.m23582a((Object) onCreateDialog, "super.onCreateDialog(sav…atusBar(window)\n        }");
        return onCreateDialog;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f93818a = true;
        mo90706h();
    }
}
