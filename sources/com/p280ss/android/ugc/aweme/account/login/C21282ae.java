package com.p280ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22172c;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a.C21172b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.ae */
public final class C21282ae extends C21261a {

    /* renamed from: D */
    public static final C21283a f57189D = new C21283a(null);

    /* renamed from: B */
    public boolean f57190B = true;

    /* renamed from: C */
    public final TPLoginMethod f57191C;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ae$a */
    public static final class C21283a {
        private C21283a() {
        }

        public /* synthetic */ C21283a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static Dialog m71648a(Activity activity, Bundle bundle, TPLoginMethod tPLoginMethod) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(bundle, "data");
            C7573i.m23587b(tPLoginMethod, "loginMethod");
            C21282ae aeVar = new C21282ae(activity, bundle, tPLoginMethod);
            Window window = aeVar.getWindow();
            if (window != null) {
                LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                attributes.flags |= 2;
                window.setAttributes(attributes);
                window.setWindowAnimations(R.style.uv);
            }
            aeVar.show();
            return aeVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ae$b */
    static final class C21284b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21282ae f57192a;

        /* renamed from: b */
        final /* synthetic */ Context f57193b;

        C21284b(C21282ae aeVar, Context context) {
            this.f57192a = aeVar;
            this.f57193b = context;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f57192a.f57190B = false;
            this.f57192a.f57158g = true;
            if (this.f57192a.isShowing()) {
                this.f57192a.dismiss();
            }
            this.f57192a.mo57233a(this.f57192a.f57191C.getPlatform());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ae$c */
    static final class C21285c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21282ae f57194a;

        /* renamed from: b */
        final /* synthetic */ Context f57195b;

        C21285c(C21282ae aeVar, Context context) {
            this.f57194a = aeVar;
            this.f57195b = context;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f57194a.f57158g = true;
            this.f57194a.f57190B = false;
            C6907h.m21524a("switch_login_account", (Map) new C21102b().mo56946a("enter_method", this.f57194a.f57155d).mo56946a("enter_from", this.f57194a.f57154c).f56672a);
            this.f57194a.dismiss();
            C21671bd.m72545m().retryLogin(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ae$d */
    static final class C21286d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21282ae f57196a;

        /* renamed from: b */
        final /* synthetic */ Context f57197b;

        C21286d(C21282ae aeVar, Context context) {
            this.f57196a = aeVar;
            this.f57197b = context;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f57196a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ae$e */
    static final class C21287e implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C21282ae f57198a;

        C21287e(C21282ae aeVar) {
            this.f57198a = aeVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f57198a.f57190B) {
                BaseLoginMethod baseLoginMethod = new BaseLoginMethod(null, null, null, null, 15, null);
                C21579s.m72313b(baseLoginMethod);
            }
        }
    }

    /* renamed from: a */
    public static final Dialog m71643a(Activity activity, Bundle bundle, TPLoginMethod tPLoginMethod) {
        return C21283a.m71648a(activity, bundle, tPLoginMethod);
    }

    /* renamed from: a */
    public final void mo57232a(C22172c cVar) {
    }

    public final void dismiss() {
        super.dismiss();
        C21170a.m71341b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Dialog mo57240f() {
        StringBuilder sb = new StringBuilder("An operation is not implemented: ");
        sb.append("not implemented");
        throw new NotImplementedError(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Dialog mo57228a(Activity activity) {
        StringBuilder sb = new StringBuilder("An operation is not implemented: ");
        sb.append("not implemented");
        throw new NotImplementedError(sb.toString());
    }

    /* renamed from: a */
    public final void mo57230a(Context context) {
        C7573i.m23587b(context, "context");
        if (this.f57191C != null) {
            this.f57169t = getLayoutInflater().inflate(R.layout.la, null);
            View view = this.f57169t;
            if (view != null) {
                C23323e.m76514a((RemoteImageView) view.findViewById(R.id.ic), this.f57191C.getUserInfo().getAvatarUrl());
                View findViewById = view.findViewById(R.id.bvh);
                C7573i.m23582a((Object) findViewById, "it.findViewById<TextView>(R.id.login_in)");
                TextView textView = (TextView) findViewById;
                StringBuilder sb = new StringBuilder("@");
                sb.append(this.f57191C.getUserInfo().getUserName());
                textView.setText(context.getString(R.string.ab1, new Object[]{sb.toString()}));
                view.findViewById(R.id.bvh).setOnClickListener(new C21284b(this, context));
                view.findViewById(R.id.df4).setOnClickListener(new C21285c(this, context));
                view.findViewById(R.id.d7j).setOnClickListener(new C21286d(this, context));
            }
            setContentView(this.f57169t);
            C21170a.m71339a((C21172b) this);
            setOnDismissListener(new C21287e(this));
        }
    }

    public C21282ae(Activity activity, Bundle bundle, TPLoginMethod tPLoginMethod) {
        C7573i.m23587b(activity, "context");
        C7573i.m23587b(bundle, "data");
        super(activity, bundle);
        this.f57191C = tPLoginMethod;
        mo57230a((Context) activity);
    }
}
