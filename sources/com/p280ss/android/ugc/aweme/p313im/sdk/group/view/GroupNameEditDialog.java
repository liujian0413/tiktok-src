package com.p280ss.android.ugc.aweme.p313im.sdk.group.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31257b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog */
public final class GroupNameEditDialog extends AppCompatDialog {

    /* renamed from: f */
    public static final C31285a f82001f = new C31285a(null);

    /* renamed from: a */
    public final DmtEditText f82002a = ((DmtEditText) this.f82007g.findViewById(R.id.ag_));

    /* renamed from: b */
    public final ImageButton f82003b = ((ImageButton) this.f82007g.findViewById(R.id.pw));

    /* renamed from: c */
    public final DmtButton f82004c = ((DmtButton) this.f82007g.findViewById(R.id.a10));

    /* renamed from: d */
    public C6425b f82005d;

    /* renamed from: e */
    public final String f82006e;

    /* renamed from: g */
    private final View f82007g;

    /* renamed from: h */
    private final DmtButton f82008h = ((DmtButton) this.f82007g.findViewById(R.id.sp));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog$a */
    public static final class C31285a {
        private C31285a() {
        }

        public /* synthetic */ C31285a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog$b */
    public static final class C31286b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ GroupNameEditDialog f82009a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
        }

        C31286b(GroupNameEditDialog groupNameEditDialog) {
            this.f82009a = groupNameEditDialog;
        }

        public final void afterTextChanged(Editable editable) {
            GroupNameEditDialog groupNameEditDialog = this.f82009a;
            DmtEditText dmtEditText = this.f82009a.f82002a;
            C7573i.m23582a((Object) dmtEditText, "mNameEdit");
            groupNameEditDialog.mo81862a(dmtEditText, 20);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0080  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            /*
                r0 = this;
                java.lang.String r2 = "s"
                kotlin.jvm.internal.C7573i.m23587b(r1, r2)
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                r3 = 1056964608(0x3f000000, float:0.5)
                r4 = 0
                if (r2 == 0) goto L_0x0035
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r1 = r0.f82009a
                android.widget.ImageButton r1 = r1.f82003b
                java.lang.String r2 = "mClearBtn"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                r2 = 8
                r1.setVisibility(r2)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r1 = r0.f82009a
                com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r1.f82004c
                java.lang.String r2 = "mConfirmBtn"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                r1.setEnabled(r4)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r1 = r0.f82009a
                com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r1.f82004c
                java.lang.String r2 = "mConfirmBtn"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                r1.setAlpha(r3)
                return
            L_0x0035:
                java.lang.String r1 = r1.toString()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r2 = r0.f82009a
                com.bytedance.im.core.model.b r2 = r2.f82005d
                if (r2 == 0) goto L_0x0052
                com.bytedance.im.core.model.Conversation r2 = r2.mo15562a()
                if (r2 == 0) goto L_0x0052
                com.bytedance.im.core.model.ConversationCoreInfo r2 = r2.getCoreInfo()
                if (r2 == 0) goto L_0x0052
                java.lang.String r2 = r2.getName()
                goto L_0x0053
            L_0x0052:
                r2 = 0
            L_0x0053:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L_0x0080
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r1 = r0.f82009a
                android.widget.ImageButton r1 = r1.f82003b
                java.lang.String r2 = "mClearBtn"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                r1.setVisibility(r4)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r1 = r0.f82009a
                com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r1.f82004c
                java.lang.String r2 = "mConfirmBtn"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                r1.setEnabled(r4)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r1 = r0.f82009a
                com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r1.f82004c
                java.lang.String r2 = "mConfirmBtn"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                r1.setAlpha(r3)
                return
            L_0x0080:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r1 = r0.f82009a
                android.widget.ImageButton r1 = r1.f82003b
                java.lang.String r2 = "mClearBtn"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                r1.setVisibility(r4)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r1 = r0.f82009a
                com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r1.f82004c
                java.lang.String r2 = "mConfirmBtn"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                r2 = 1
                r1.setEnabled(r2)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r1 = r0.f82009a
                com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r1.f82004c
                java.lang.String r2 = "mConfirmBtn"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                r2 = 1065353216(0x3f800000, float:1.0)
                r1.setAlpha(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.view.GroupNameEditDialog.C31286b.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog$c */
    static final class C31287c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupNameEditDialog f82010a;

        C31287c(GroupNameEditDialog groupNameEditDialog) {
            this.f82010a = groupNameEditDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82010a.f82002a.setText("");
            this.f82010a.f82002a.clearFocus();
            this.f82010a.mo81863c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog$d */
    static final class C31288d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupNameEditDialog f82011a;

        C31288d(GroupNameEditDialog groupNameEditDialog) {
            this.f82011a = groupNameEditDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82011a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog$e */
    static final class C31289e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupNameEditDialog f82012a;

        C31289e(GroupNameEditDialog groupNameEditDialog) {
            this.f82012a = groupNameEditDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82012a.mo81865d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog$f */
    static final class C31290f implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ GroupNameEditDialog f82013a;

        C31290f(GroupNameEditDialog groupNameEditDialog) {
            this.f82013a = groupNameEditDialog;
        }

        public final void onShow(DialogInterface dialogInterface) {
            C1592h.m7848a(100).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Void, Object>(this) {

                /* renamed from: a */
                final /* synthetic */ C31290f f82014a;

                {
                    this.f82014a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1592h<Void> hVar) {
                    if (this.f82014a.f82013a.f82002a != null) {
                        this.f82014a.f82013a.f82002a.requestFocus();
                        this.f82014a.f82013a.mo81861a();
                    }
                    return null;
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog$g */
    public static final class C31292g implements C11195b<Conversation> {

        /* renamed from: a */
        final /* synthetic */ GroupNameEditDialog f82015a;

        C31292g(GroupNameEditDialog groupNameEditDialog) {
            this.f82015a = groupNameEditDialog;
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            Context context = this.f82015a.getContext();
            C7573i.m23582a((Object) context, "context");
            C31257b.m101861a(context, gVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(Conversation conversation) {
            if (conversation != null) {
                C10761a.m31399c(this.f82015a.getContext(), (int) R.string.bkw).mo25750a();
                this.f82015a.dismiss();
            }
        }
    }

    public final void cancel() {
        mo81863c();
        super.cancel();
    }

    public final void dismiss() {
        mo81863c();
        super.dismiss();
    }

    /* renamed from: e */
    private final void m101922e() {
        this.f82005d = new C6425b(this.f82006e);
    }

    /* renamed from: a */
    public final void mo81861a() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f82002a, 1);
        }
    }

    /* renamed from: c */
    public final void mo81863c() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            DmtEditText dmtEditText = this.f82002a;
            C7573i.m23582a((Object) dmtEditText, "mNameEdit");
            inputMethodManager.hideSoftInputFromWindow(dmtEditText.getWindowToken(), 0);
        }
    }

    /* renamed from: f */
    private final void m101923f() {
        this.f82002a.addTextChangedListener(new C31286b(this));
        C6425b bVar = this.f82005d;
        boolean z = true;
        if (bVar != null) {
            Conversation a = bVar.mo15562a();
            if (a != null) {
                ConversationCoreInfo coreInfo = a.getCoreInfo();
                if (coreInfo != null) {
                    Map ext = coreInfo.getExt();
                    if (ext != null && ext.containsKey("a:s_name_operator") && (!C7573i.m23585a((Object) (String) ext.get("a:s_name_operator"), (Object) "0"))) {
                        this.f82002a.setText(coreInfo.getName());
                        DmtEditText dmtEditText = this.f82002a;
                        C7573i.m23582a((Object) dmtEditText, "mNameEdit");
                        Editable text = dmtEditText.getText();
                        if (text != null) {
                            this.f82002a.setSelection(text.length());
                        }
                    }
                }
            }
        }
        ImageButton imageButton = this.f82003b;
        C7573i.m23582a((Object) imageButton, "mClearBtn");
        DmtEditText dmtEditText2 = this.f82002a;
        C7573i.m23582a((Object) dmtEditText2, "mNameEdit");
        CharSequence text2 = dmtEditText2.getText();
        int i = 0;
        if (!(text2 == null || text2.length() == 0)) {
            z = false;
        }
        if (z) {
            i = 4;
        }
        imageButton.setVisibility(i);
        this.f82003b.setOnClickListener(new C31287c(this));
        this.f82008h.setOnClickListener(new C31288d(this));
        this.f82004c.setOnClickListener(new C31289e(this));
        setOnShowListener(new C31290f(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81865d() {
        /*
            r3 = this;
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = r3.f82002a
            java.lang.String r1 = "mNameEdit"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0010
        L_0x000d:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x0013
        L_0x0010:
            java.lang.String r0 = ""
            goto L_0x000d
        L_0x0013:
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31873as.m103564a(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0028
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = 0
            goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            if (r1 == 0) goto L_0x003a
            android.content.Context r0 = r3.getContext()
            r1 = 2131823713(0x7f110c61, float:1.9280233E38)
            com.bytedance.ies.dmt.ui.c.a r0 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r0, r1)
            r0.mo25750a()
            return
        L_0x003a:
            com.bytedance.im.core.model.b r1 = r3.f82005d
            if (r1 == 0) goto L_0x004f
            com.bytedance.im.core.model.Conversation r1 = r1.mo15562a()
            if (r1 == 0) goto L_0x004f
            com.bytedance.im.core.model.ConversationCoreInfo r1 = r1.getCoreInfo()
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = r1.getName()
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0059
            return
        L_0x0059:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "conversation_id"
            java.lang.String r2 = r3.f82006e
            r0.put(r1, r2)
            java.lang.String r1 = "group_name_confirm_quick_click"
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103437a(r1, r0)
            com.bytedance.im.core.model.b r0 = r3.f82005d
            if (r0 == 0) goto L_0x008a
            com.bytedance.ies.dmt.ui.widget.DmtEditText r1 = r3.f82002a
            java.lang.String r2 = "mNameEdit"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog$g r2 = new com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog$g
            r2.<init>(r3)
            com.bytedance.im.core.a.a.b r2 = (com.bytedance.p263im.core.p584a.p585a.C11195b) r2
            r0.mo15566a(r1, r2)
            return
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.view.GroupNameEditDialog.mo81865d():void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(this.f82007g);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        m101922e();
        m101923f();
    }

    public GroupNameEditDialog(Context context, String str) {
        C7573i.m23587b(context, "context");
        super(context, R.style.ue);
        this.f82006e = str;
        View inflate = LayoutInflater.from(context).inflate(R.layout.a71, null);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…p_name_edit_dialog, null)");
        this.f82007g = inflate;
    }

    /* renamed from: a */
    public final void mo81862a(EditText editText, int i) {
        Editable text = editText.getText();
        if (text.length() > 20) {
            C10761a.m31403c(getContext(), C6399b.m19921a().getResources().getString(R.string.bkx, new Object[]{"20"})).mo25750a();
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
