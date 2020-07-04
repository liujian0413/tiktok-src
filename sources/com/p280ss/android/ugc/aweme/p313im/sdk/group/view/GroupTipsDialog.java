package com.p280ss.android.ugc.aweme.p313im.sdk.group.view;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupTipsDialog */
public final class GroupTipsDialog extends AppCompatDialog {

    /* renamed from: a */
    public final C31293a f82016a;

    /* renamed from: b */
    private final View f82017b;

    /* renamed from: c */
    private final DmtTextView f82018c = ((DmtTextView) this.f82017b.findViewById(R.id.a1q));

    /* renamed from: d */
    private final DmtButton f82019d = ((DmtButton) this.f82017b.findViewById(R.id.sp));

    /* renamed from: e */
    private final DmtButton f82020e = ((DmtButton) this.f82017b.findViewById(R.id.a10));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupTipsDialog$a */
    public static final class C31293a {

        /* renamed from: a */
        public String f82021a;

        /* renamed from: b */
        public String f82022b;

        /* renamed from: c */
        public String f82023c;

        /* renamed from: d */
        public C7562b<? super View, C7581n> f82024d;

        /* renamed from: e */
        public C7562b<? super View, C7581n> f82025e;

        /* renamed from: f */
        public final Context f82026f;

        /* renamed from: a */
        public final GroupTipsDialog mo81875a() {
            return new GroupTipsDialog(this);
        }

        /* renamed from: a */
        public final C31293a mo81874a(C7562b<? super View, C7581n> bVar) {
            this.f82024d = bVar;
            return this;
        }

        /* renamed from: b */
        public final C31293a mo81876b(C7562b<? super View, C7581n> bVar) {
            this.f82025e = bVar;
            return this;
        }

        public C31293a(Context context) {
            C7573i.m23587b(context, "context");
            this.f82026f = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupTipsDialog$b */
    static final class C31294b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupTipsDialog f82027a;

        C31294b(GroupTipsDialog groupTipsDialog) {
            this.f82027a = groupTipsDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7562b<? super View, C7581n> bVar = this.f82027a.f82016a.f82024d;
            if (bVar != null) {
                C7573i.m23582a((Object) view, "it");
                bVar.invoke(view);
            }
            this.f82027a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupTipsDialog$c */
    static final class C31295c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupTipsDialog f82028a;

        C31295c(GroupTipsDialog groupTipsDialog) {
            this.f82028a = groupTipsDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7562b<? super View, C7581n> bVar = this.f82028a.f82016a.f82025e;
            if (bVar != null) {
                C7573i.m23582a((Object) view, "it");
                bVar.invoke(view);
            }
            this.f82028a.dismiss();
        }
    }

    public GroupTipsDialog(C31293a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar.f82026f);
        this.f82016a = aVar;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a72, null);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…_group_tips_dialog, null)");
        this.f82017b = inflate;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(this.f82017b);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        String str = this.f82016a.f82021a;
        if (str != null) {
            DmtTextView dmtTextView = this.f82018c;
            C7573i.m23582a((Object) dmtTextView, "mContentTv");
            dmtTextView.setText(str);
        }
        String str2 = this.f82016a.f82022b;
        if (str2 != null) {
            DmtButton dmtButton = this.f82020e;
            C7573i.m23582a((Object) dmtButton, "mConfirmBtn");
            dmtButton.setText(str2);
        }
        String str3 = this.f82016a.f82023c;
        if (str3 != null) {
            DmtButton dmtButton2 = this.f82019d;
            C7573i.m23582a((Object) dmtButton2, "mCancelBtn");
            dmtButton2.setText(str3);
        }
        this.f82019d.setOnClickListener(new C31294b(this));
        this.f82020e.setOnClickListener(new C31295c(this));
    }
}
