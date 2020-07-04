package com.p280ss.android.ugc.aweme.p313im.sdk.detail;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31257b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31873as;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity */
public final class EditGroupInfoActivity extends AmeActivity {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f81632a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditGroupInfoActivity.class), "mTitleBar", "getMTitleBar()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditGroupInfoActivity.class), "mInfoEditText", "getMInfoEditText()Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditGroupInfoActivity.class), "mWordCountText", "getMWordCountText()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditGroupInfoActivity.class), "mClearEditInfoImage", "getMClearEditInfoImage()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditGroupInfoActivity.class), "mLoadingStatusView", "getMLoadingStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;"))};

    /* renamed from: d */
    public static final C31105a f81633d = new C31105a(null);

    /* renamed from: b */
    public String f81634b;

    /* renamed from: c */
    public C6425b f81635c;

    /* renamed from: e */
    private final C7541d f81636e = C7546e.m23569a(new C31113i(this));

    /* renamed from: f */
    private final C7541d f81637f = C7546e.m23569a(new C31111g(this));

    /* renamed from: g */
    private final C7541d f81638g = C7546e.m23569a(new C31114j(this));

    /* renamed from: h */
    private final C7541d f81639h = C7546e.m23569a(new C31110f(this));

    /* renamed from: i */
    private final C7541d f81640i = C7546e.m23569a(new C31112h(this));

    /* renamed from: j */
    private Integer f81641j;

    /* renamed from: k */
    private HashMap f81642k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$a */
    public static final class C31105a {
        private C31105a() {
        }

        public /* synthetic */ C31105a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m101454a(Activity activity, String str, String str2, int i, int i2) {
            C7573i.m23587b(activity, "activity");
            Intent intent = new Intent(activity, EditGroupInfoActivity.class);
            intent.putExtra("conversationId", str);
            intent.putExtra("editInfo", str2);
            intent.putExtra("type", 0);
            activity.startActivityForResult(intent, 222);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$b */
    public static final class C31106b implements C31980a {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f81643a;

        /* renamed from: a */
        public final void mo18096a() {
            this.f81643a.onBackPressed();
        }

        /* renamed from: b */
        public final void mo18097b() {
            this.f81643a.mo81605f();
        }

        C31106b(EditGroupInfoActivity editGroupInfoActivity) {
            this.f81643a = editGroupInfoActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$c */
    public static final class C31107c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f81644a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C31107c(EditGroupInfoActivity editGroupInfoActivity) {
            this.f81644a = editGroupInfoActivity;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            CharSequence charSequence = editable;
            int i = 0;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ImTextTitleBar a = this.f81644a.mo81599a();
                C7573i.m23582a((Object) a, "mTitleBar");
                View rightView = a.getRightView();
                C7573i.m23582a((Object) rightView, "mTitleBar.rightView");
                rightView.setAlpha(0.34f);
                ImTextTitleBar a2 = this.f81644a.mo81599a();
                C7573i.m23582a((Object) a2, "mTitleBar");
                View rightView2 = a2.getRightView();
                C7573i.m23582a((Object) rightView2, "mTitleBar.rightView");
                rightView2.setEnabled(false);
                ImageView d = this.f81644a.mo81603d();
                C7573i.m23582a((Object) d, "mClearEditInfoImage");
                d.setVisibility(8);
            } else if (TextUtils.equals(charSequence, this.f81644a.f81634b)) {
                ImTextTitleBar a3 = this.f81644a.mo81599a();
                C7573i.m23582a((Object) a3, "mTitleBar");
                View rightView3 = a3.getRightView();
                C7573i.m23582a((Object) rightView3, "mTitleBar.rightView");
                rightView3.setAlpha(0.34f);
                ImTextTitleBar a4 = this.f81644a.mo81599a();
                C7573i.m23582a((Object) a4, "mTitleBar");
                View rightView4 = a4.getRightView();
                C7573i.m23582a((Object) rightView4, "mTitleBar.rightView");
                rightView4.setEnabled(false);
                ImageView d2 = this.f81644a.mo81603d();
                C7573i.m23582a((Object) d2, "mClearEditInfoImage");
                d2.setVisibility(0);
            } else {
                ImTextTitleBar a5 = this.f81644a.mo81599a();
                C7573i.m23582a((Object) a5, "mTitleBar");
                View rightView5 = a5.getRightView();
                C7573i.m23582a((Object) rightView5, "mTitleBar.rightView");
                rightView5.setAlpha(1.0f);
                ImTextTitleBar a6 = this.f81644a.mo81599a();
                C7573i.m23582a((Object) a6, "mTitleBar");
                View rightView6 = a6.getRightView();
                C7573i.m23582a((Object) rightView6, "mTitleBar.rightView");
                rightView6.setEnabled(true);
                ImageView d3 = this.f81644a.mo81603d();
                C7573i.m23582a((Object) d3, "mClearEditInfoImage");
                d3.setVisibility(0);
            }
            if (editable != null) {
                i = editable.length();
            }
            int i2 = 20;
            if (i <= 20) {
                i2 = i;
            }
            TextView c = this.f81644a.mo81602c();
            C7573i.m23582a((Object) c, "mWordCountText");
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append("/20");
            c.setText(sb.toString());
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditGroupInfoActivity editGroupInfoActivity = this.f81644a;
            DmtEditText b = this.f81644a.mo81601b();
            C7573i.m23582a((Object) b, "mInfoEditText");
            editGroupInfoActivity.mo81600a(b, 20);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$d */
    static final class C31108d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f81645a;

        C31108d(EditGroupInfoActivity editGroupInfoActivity) {
            this.f81645a = editGroupInfoActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f81645a.mo81601b().setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$e */
    static final class C31109e implements OnEditorActionListener {

        /* renamed from: a */
        public static final C31109e f81646a = new C31109e();

        C31109e() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$f */
    static final class C31110f extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f81647a;

        C31110f(EditGroupInfoActivity editGroupInfoActivity) {
            this.f81647a = editGroupInfoActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f81647a.mo81598a((int) R.id.b7e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$g */
    static final class C31111g extends Lambda implements C7561a<DmtEditText> {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f81648a;

        C31111g(EditGroupInfoActivity editGroupInfoActivity) {
            this.f81648a = editGroupInfoActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtEditText invoke() {
            return (DmtEditText) this.f81648a.mo81598a((int) R.id.ag5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$h */
    static final class C31112h extends Lambda implements C7561a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f81649a;

        C31112h(EditGroupInfoActivity editGroupInfoActivity) {
            this.f81649a = editGroupInfoActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtStatusView invoke() {
            return (DmtStatusView) this.f81649a.mo81598a((int) R.id.ecx);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$i */
    static final class C31113i extends Lambda implements C7561a<ImTextTitleBar> {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f81650a;

        C31113i(EditGroupInfoActivity editGroupInfoActivity) {
            this.f81650a = editGroupInfoActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImTextTitleBar invoke() {
            return (ImTextTitleBar) this.f81650a.mo81598a((int) R.id.djz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$j */
    static final class C31114j extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f81651a;

        C31114j(EditGroupInfoActivity editGroupInfoActivity) {
            this.f81651a = editGroupInfoActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f81651a.mo81598a((int) R.id.e4t);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$k */
    static final class C31115k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f81652a;

        C31115k(EditGroupInfoActivity editGroupInfoActivity) {
            this.f81652a = editGroupInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f81652a.mo81605f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$l */
    static final class C31116l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f81653a;

        C31116l(EditGroupInfoActivity editGroupInfoActivity) {
            this.f81653a = editGroupInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            EditGroupInfoActivity.super.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$m */
    static final class C31117m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f81654a;

        /* renamed from: b */
        final /* synthetic */ String f81655b;

        C31117m(EditGroupInfoActivity editGroupInfoActivity, String str) {
            this.f81654a = editGroupInfoActivity;
            this.f81655b = str;
        }

        public final void run() {
            this.f81654a.mo81604e().mo25942f();
            C6425b bVar = this.f81654a.f81635c;
            if (bVar != null) {
                bVar.mo15566a(this.f81655b, (C11195b<Conversation>) new C11195b<Conversation>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C31117m f81656a;

                    {
                        this.f81656a = r1;
                    }

                    /* renamed from: a */
                    public final void mo18088a(C11438g gVar) {
                        DmtStatusView e = this.f81656a.f81654a.mo81604e();
                        C7573i.m23582a((Object) e, "mLoadingStatusView");
                        e.setVisibility(8);
                        C31257b.m101861a(this.f81656a.f81654a, gVar);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void mo18089a(Conversation conversation) {
                        String str;
                        DmtStatusView e = this.f81656a.f81654a.mo81604e();
                        C7573i.m23582a((Object) e, "mLoadingStatusView");
                        e.setVisibility(8);
                        if (conversation != null) {
                            Intent intent = new Intent();
                            String str2 = "editInfo";
                            ConversationCoreInfo coreInfo = conversation.getCoreInfo();
                            if (coreInfo != null) {
                                str = coreInfo.getName();
                            } else {
                                str = null;
                            }
                            intent.putExtra(str2, str);
                            this.f81656a.f81654a.setResult(222, intent);
                            this.f81656a.f81654a.finish();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final View mo81598a(int i) {
        if (this.f81642k == null) {
            this.f81642k = new HashMap();
        }
        View view = (View) this.f81642k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81642k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final ImTextTitleBar mo81599a() {
        return (ImTextTitleBar) this.f81636e.getValue();
    }

    /* renamed from: b */
    public final DmtEditText mo81601b() {
        return (DmtEditText) this.f81637f.getValue();
    }

    /* renamed from: c */
    public final TextView mo81602c() {
        return (TextView) this.f81638g.getValue();
    }

    /* renamed from: d */
    public final ImageView mo81603d() {
        return (ImageView) this.f81639h.getValue();
    }

    /* renamed from: e */
    public final DmtStatusView mo81604e() {
        return (DmtStatusView) this.f81640i.getValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    /* renamed from: g */
    private final void m101443g() {
        Integer num;
        Intent intent = getIntent();
        String str = null;
        boolean z = false;
        if (intent != null) {
            num = Integer.valueOf(intent.getIntExtra("type", 0));
        } else {
            num = null;
        }
        this.f81641j = num;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            str = intent2.getStringExtra("conversationId");
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (!z) {
            this.f81635c = new C6425b(str);
        }
    }

    /* renamed from: i */
    private final void m101445i() {
        mo81599a().setOnTitlebarClickListener(new C31106b(this));
        mo81601b().addTextChangedListener(new C31107c(this));
        mo81603d().setOnClickListener(new C31108d(this));
        mo81601b().setOnEditorActionListener(C31109e.f81646a);
    }

    /* renamed from: f */
    public final void mo81605f() {
        String str;
        DmtEditText b = mo81601b();
        C7573i.m23582a((Object) b, "mInfoEditText");
        CharSequence text = b.getText();
        if (text == null) {
            text = "";
        }
        String a = C31873as.m103564a(text.toString());
        CharSequence charSequence = a;
        if (TextUtils.isEmpty(charSequence)) {
            C10761a.m31399c((Context) this, (int) R.string.bku).mo25750a();
        } else if (!TextUtils.equals(charSequence, this.f81634b)) {
            Context context = this;
            C6425b bVar = this.f81635c;
            if (bVar != null) {
                str = bVar.f18778a;
            } else {
                str = null;
            }
            C31257b.m101862a(context, str, new C31117m(this, a));
        }
    }

    public final void onBackPressed() {
        CharSequence charSequence = this.f81634b;
        DmtEditText b = mo81601b();
        C7573i.m23582a((Object) b, "mInfoEditText");
        if (!TextUtils.equals(charSequence, b.getText())) {
            DmtEditText b2 = mo81601b();
            C7573i.m23582a((Object) b2, "mInfoEditText");
            if (!TextUtils.isEmpty(C31873as.m103564a(String.valueOf(b2.getText())))) {
                new C10741a(this).mo25657b((int) R.string.blz).mo25665e(R.style.m2).mo25650a((int) R.string.boq, (DialogInterface.OnClickListener) new C31115k(this)).mo25658b((int) R.string.bjr, (DialogInterface.OnClickListener) new C31116l(this)).mo25656a().mo25637a();
                return;
            }
        }
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0 == null) goto L_0x000e;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101444h() {
        /*
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            if (r0 == 0) goto L_0x000e
            java.lang.String r1 = "editInfo"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r0 = ""
        L_0x0010:
            r3.f81634b = r0
            java.lang.Integer r0 = r3.f81641j
            if (r0 != 0) goto L_0x0017
            goto L_0x0058
        L_0x0017:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0058
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r0 = r3.mo81599a()
            r1 = 2131823643(0x7f110c1b, float:1.9280091E38)
            java.lang.String r1 = r3.getString(r1)
            r0.setTitle(r1)
            android.widget.TextView r0 = r3.mo81602c()
            java.lang.String r1 = "mWordCountText"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.f81634b
            if (r2 == 0) goto L_0x0046
            int r2 = r2.length()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            r1.append(r2)
            java.lang.String r2 = "/20"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0058:
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = r3.mo81601b()
            java.lang.String r1 = r3.f81634b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = r3.mo81601b()
            java.lang.String r1 = r3.f81634b
            if (r1 != 0) goto L_0x006e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x006e:
            int r1 = r1.length()
            r0.setSelection(r1)
            java.lang.String r0 = r3.f81634b
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            if (r0 == 0) goto L_0x0085
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r0 = 0
            goto L_0x0086
        L_0x0085:
            r0 = 1
        L_0x0086:
            if (r0 == 0) goto L_0x0096
            android.widget.ImageView r0 = r3.mo81603d()
            java.lang.String r2 = "mClearEditInfoImage"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            r2 = 8
            r0.setVisibility(r2)
        L_0x0096:
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r0 = r3.mo81599a()
            java.lang.String r2 = "mTitleBar"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            android.view.View r0 = r0.getRightView()
            java.lang.String r2 = "mTitleBar.rightView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            r0.setEnabled(r1)
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r0 = r3.mo81599a()
            java.lang.String r1 = "mTitleBar"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.view.View r0 = r0.getRightView()
            java.lang.String r1 = "mTitleBar.rightView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r1 = 1051595899(0x3eae147b, float:0.34)
            r0.setAlpha(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r3.mo81604e()
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a.m31631a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = r1.mo25953a()
            r0.setBuilder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.EditGroupInfoActivity.m101444h():void");
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.c2);
        C6956a.m21633b().setupStatusBar(this);
        m101443g();
        m101444h();
        m101445i();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo81600a(EditText editText, int i) {
        Editable text = editText.getText();
        if (text.length() > 20) {
            C10761a.m31403c((Context) this, getString(R.string.bkx, new Object[]{"20"})).mo25750a();
            int selectionEnd = Selection.getSelectionEnd(text);
            String obj = text.toString();
            if (obj != null) {
                String substring = obj.substring(0, 20);
                C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                editText.setText(substring);
                Editable text2 = editText.getText();
                if (selectionEnd > text2.length()) {
                    selectionEnd = text2.length();
                }
                Selection.setSelection(text2, selectionEnd);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }
}
