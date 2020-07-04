package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7579l;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView */
public final class DouPlusRefundBanView extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f67065a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DouPlusRefundBanView.class), "titleView", "getTitleView()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DouPlusRefundBanView.class), "refundView", "getRefundView()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DouPlusRefundBanView.class), "appealView", "getAppealView()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DouPlusRefundBanView.class), "cancelView", "getCancelView()Landroid/widget/TextView;"))};

    /* renamed from: e */
    public static final C25473a f67066e = new C25473a(null);

    /* renamed from: b */
    public OnClickListener f67067b;

    /* renamed from: c */
    public OnClickListener f67068c;

    /* renamed from: d */
    public OnClickListener f67069d;

    /* renamed from: f */
    private final C7541d f67070f = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C25480h(this));

    /* renamed from: g */
    private final C7541d f67071g = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C25479g(this));

    /* renamed from: h */
    private final C7541d f67072h = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C25474b(this));

    /* renamed from: i */
    private final C7541d f67073i = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C25475c(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$a */
    public static final class C25473a {
        private C25473a() {
        }

        public /* synthetic */ C25473a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m83799a(String str, String str2) {
            C6907h.m21524a(str, C7507ae.m23400b((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("toast_type", "dou_plus_refund"), C7579l.m23633a("scene_id", str2)}));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$b */
    static final class C25474b extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f67074a;

        C25474b(DouPlusRefundBanView douPlusRefundBanView) {
            this.f67074a = douPlusRefundBanView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f67074a.findViewById(R.id.a_t);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$c */
    static final class C25475c extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f67075a;

        C25475c(DouPlusRefundBanView douPlusRefundBanView) {
            this.f67075a = douPlusRefundBanView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f67075a.findViewById(R.id.a_u);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$d */
    static final class C25476d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f67076a;

        C25476d(DouPlusRefundBanView douPlusRefundBanView) {
            this.f67076a = douPlusRefundBanView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25473a.m83799a("confirm_toast", "1001");
            OnClickListener onClickListener = this.f67076a.f67067b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$e */
    static final class C25477e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f67077a;

        C25477e(DouPlusRefundBanView douPlusRefundBanView) {
            this.f67077a = douPlusRefundBanView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            OnClickListener onClickListener = this.f67077a.f67068c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$f */
    static final class C25478f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f67078a;

        C25478f(DouPlusRefundBanView douPlusRefundBanView) {
            this.f67078a = douPlusRefundBanView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            OnClickListener onClickListener = this.f67078a.f67069d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$g */
    static final class C25479g extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f67079a;

        C25479g(DouPlusRefundBanView douPlusRefundBanView) {
            this.f67079a = douPlusRefundBanView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f67079a.findViewById(R.id.a_v);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$h */
    static final class C25480h extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f67080a;

        C25480h(DouPlusRefundBanView douPlusRefundBanView) {
            this.f67080a = douPlusRefundBanView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f67080a.findViewById(R.id.a_w);
        }
    }

    public final TextView getAppealView() {
        return (TextView) this.f67072h.getValue();
    }

    public final TextView getCancelView() {
        return (TextView) this.f67073i.getValue();
    }

    public final TextView getRefundView() {
        return (TextView) this.f67071g.getValue();
    }

    public final TextView getTitleView() {
        return (TextView) this.f67070f.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C25473a.m83799a("show_toast", "1002");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        getRefundView().setOnClickListener(new C25476d(this));
        getAppealView().setOnClickListener(new C25477e(this));
        getCancelView().setOnClickListener(new C25478f(this));
    }

    public DouPlusRefundBanView(Context context) {
        super(context);
    }

    public DouPlusRefundBanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DouPlusRefundBanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
