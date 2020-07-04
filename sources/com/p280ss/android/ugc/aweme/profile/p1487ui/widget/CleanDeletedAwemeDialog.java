package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.app.AppCompatDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28466r;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28471v;
import com.p280ss.android.ugc.aweme.profile.presenter.C36049w;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.CleanDeletedAwemeDialog */
public final class CleanDeletedAwemeDialog extends AppCompatDialog implements OnClickListener, C28466r {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f96012a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CleanDeletedAwemeDialog.class), "mDiggPresenter", "getMDiggPresenter()Lcom/ss/android/ugc/aweme/profile/presenter/ItemDiggPresenter;"))};

    /* renamed from: b */
    public C7561a<C7581n> f96013b;

    /* renamed from: c */
    public Aweme f96014c;

    /* renamed from: d */
    private final Activity f96015d;

    /* renamed from: e */
    private final View f96016e;

    /* renamed from: f */
    private final DmtTextView f96017f = ((DmtTextView) this.f96016e.findViewById(R.id.sp));

    /* renamed from: g */
    private final DmtTextView f96018g = ((DmtTextView) this.f96016e.findViewById(R.id.a10));

    /* renamed from: h */
    private final C7541d f96019h = C7546e.m23569a(new C36595a(this));

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.CleanDeletedAwemeDialog$a */
    static final class C36595a extends Lambda implements C7561a<C36049w> {

        /* renamed from: a */
        final /* synthetic */ CleanDeletedAwemeDialog f96020a;

        C36595a(CleanDeletedAwemeDialog cleanDeletedAwemeDialog) {
            this.f96020a = cleanDeletedAwemeDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C36049w invoke() {
            C36049w wVar = new C36049w();
            wVar.mo66536a(new C28471v());
            wVar.mo66537a(this.f96020a);
            return wVar;
        }
    }

    /* renamed from: a */
    private final C36049w m118084a() {
        return (C36049w) this.f96019h.getValue();
    }

    /* renamed from: a */
    public final void mo72203a(C0902i<String, Integer> iVar) {
        C10761a.m31383a((Context) this.f96015d, (int) R.string.b03).mo25750a();
        C7561a<C7581n> aVar = this.f96013b;
        if (aVar != null) {
            aVar.invoke();
        }
        dismiss();
    }

    public CleanDeletedAwemeDialog(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        this.f96015d = (Activity) context;
        this.f96016e = View.inflate(context, R.layout.jx, null);
    }

    /* renamed from: a */
    public final void mo72204a(Exception exc) {
        CharSequence charSequence;
        String str = null;
        if (exc != null) {
            charSequence = exc.getMessage();
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Context context = this.f96015d;
            if (exc != null) {
                str = exc.getMessage();
            }
            C10761a.m31387a(context, str).mo25750a();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(this.f96016e);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        OnClickListener onClickListener = this;
        this.f96017f.setOnClickListener(onClickListener);
        this.f96018g.setOnClickListener(onClickListener);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        String str = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.sp) {
            dismiss();
            return;
        }
        if (num != null && num.intValue() == R.id.a10) {
            C36049w a = m118084a();
            Object[] objArr = new Object[3];
            Aweme aweme = this.f96014c;
            if (aweme != null) {
                str = aweme.getAid();
            }
            objArr[0] = str;
            objArr[1] = Integer.valueOf(0);
            objArr[2] = "personal_homepage";
            a.mo56976a(objArr);
        }
    }
}
