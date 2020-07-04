package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.text.Editable;
import android.text.Selection;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.OneLineInputDialog */
public class OneLineInputDialog extends AppCompatDialog {

    /* renamed from: b */
    public static final C36602a f96048b = new C36602a(null);

    /* renamed from: a */
    protected View f96049a;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.OneLineInputDialog$a */
    public static final class C36602a {
        private C36602a() {
        }

        public /* synthetic */ C36602a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.OneLineInputDialog$b */
    public static final class C36603b extends C23467g {

        /* renamed from: a */
        final /* synthetic */ OneLineInputDialog f96050a;

        C36603b(OneLineInputDialog oneLineInputDialog) {
            this.f96050a = oneLineInputDialog;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            String str2;
            C7573i.m23587b(editable, "s");
            CharSequence charSequence = editable;
            if (Character.codePointCount(charSequence, 0, editable.length()) > 20) {
                this.f96050a.mo92857a();
                int selectionEnd = Selection.getSelectionEnd(charSequence);
                String obj = editable.toString();
                if (selectionEnd == 0) {
                    str = "";
                } else if (obj != null) {
                    str = obj.substring(0, selectionEnd);
                    C7573i.m23582a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                if (selectionEnd == obj.length()) {
                    str2 = "";
                } else if (obj != null) {
                    str2 = obj.substring(selectionEnd);
                    C7573i.m23582a((Object) str2, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                int codePointCount = Character.codePointCount(str2, 0, str2.length());
                StringBuilder sb = new StringBuilder();
                int i = 20 - codePointCount;
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(Character.toChars(Character.codePointAt(str, sb.length())));
                }
                sb.append(str2);
                ((DmtEditText) this.f96050a.findViewById(R.id.afs)).setText(sb.toString());
                DmtEditText dmtEditText = (DmtEditText) this.f96050a.findViewById(R.id.afs);
                C7573i.m23582a((Object) dmtEditText, "etInput");
                Selection.setSelection(dmtEditText.getText(), Math.min(((DmtEditText) this.f96050a.findViewById(R.id.afs)).length() - str2.length(), ((DmtEditText) this.f96050a.findViewById(R.id.afs)).length()));
            }
            this.f96050a.mo92858a(editable);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.OneLineInputDialog$c */
    static final class C36604c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OneLineInputDialog f96051a;

        C36604c(OneLineInputDialog oneLineInputDialog) {
            this.f96051a = oneLineInputDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((DmtEditText) this.f96051a.findViewById(R.id.afs)).setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.OneLineInputDialog$d */
    static final class C36605d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OneLineInputDialog f96052a;

        C36605d(OneLineInputDialog oneLineInputDialog) {
            this.f96052a = oneLineInputDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f96052a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.OneLineInputDialog$e */
    static final class C36606e<TTaskResult, TContinuationResult> implements C1591g<Void, Object> {

        /* renamed from: a */
        final /* synthetic */ OneLineInputDialog f96053a;

        C36606e(OneLineInputDialog oneLineInputDialog) {
            this.f96053a = oneLineInputDialog;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Void> hVar) {
            DmtEditText dmtEditText = (DmtEditText) this.f96053a.findViewById(R.id.afs);
            if (dmtEditText != null) {
                dmtEditText.requestFocus();
                KeyboardUtils.m77055a(dmtEditText);
            }
            return null;
        }
    }

    /* renamed from: c */
    private static String m118108c() {
        return "";
    }

    public void cancel() {
        KeyboardUtils.m77057c((DmtEditText) findViewById(R.id.afs));
        super.cancel();
    }

    public void dismiss() {
        KeyboardUtils.m77057c((DmtEditText) findViewById(R.id.afs));
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92857a() {
        C10761a.m31403c(getContext(), getContext().getString(R.string.ru)).mo25750a();
    }

    public void show() {
        super.show();
        C1592h.m7848a(100).mo6876a((C1591g<TResult, TContinuationResult>) new C36606e<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92858a(Editable editable) {
        boolean z;
        boolean z2;
        C7573i.m23587b(editable, "s");
        if (editable.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ImageButton imageButton = (ImageButton) findViewById(R.id.pm);
            C7573i.m23582a((Object) imageButton, "btnClear");
            imageButton.setVisibility(4);
        } else {
            ImageButton imageButton2 = (ImageButton) findViewById(R.id.pm);
            C7573i.m23582a((Object) imageButton2, "btnClear");
            imageButton2.setVisibility(0);
        }
        String obj = editable.toString();
        if (obj != null) {
            if (C7634n.m23762b(obj).toString().length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                DmtButton dmtButton = (DmtButton) findViewById(R.id.a10);
                C7573i.m23582a((Object) dmtButton, "confirm");
                dmtButton.setEnabled(true);
                DmtButton dmtButton2 = (DmtButton) findViewById(R.id.a10);
                C7573i.m23582a((Object) dmtButton2, "confirm");
                dmtButton2.setAlpha(1.0f);
                return;
            }
            DmtButton dmtButton3 = (DmtButton) findViewById(R.id.a10);
            C7573i.m23582a((Object) dmtButton3, "confirm");
            dmtButton3.setEnabled(false);
            DmtButton dmtButton4 = (DmtButton) findViewById(R.id.a10);
            C7573i.m23582a((Object) dmtButton4, "confirm");
            dmtButton4.setAlpha(0.34f);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window == null) {
            C7573i.m23580a();
        }
        window.setLayout(-1, -2);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ku, null);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…alog_oneline_input, null)");
        this.f96049a = inflate;
        View view = this.f96049a;
        if (view == null) {
            C7573i.m23583a("rootView");
        }
        setContentView(view);
        ((DmtEditText) findViewById(R.id.afs)).addTextChangedListener(new C36603b(this));
        ((DmtEditText) findViewById(R.id.afs)).setText(m118108c());
        ((ImageButton) findViewById(R.id.pm)).setOnClickListener(new C36604c(this));
        ((DmtButton) findViewById(R.id.sp)).setOnClickListener(new C36605d(this));
    }

    private OneLineInputDialog(Context context, int i) {
        C7573i.m23587b(context, "context");
        super(context, i);
    }

    public /* synthetic */ OneLineInputDialog(Context context, int i, int i2, C7571f fVar) {
        this(context, 0);
    }
}
