package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.p1058c.C23285d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.SetNicknameDialog */
public final class SetNicknameDialog extends OneLineInputDialog implements C36046t {

    /* renamed from: c */
    public C36011ai f96259c = new C36011ai();

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.SetNicknameDialog$a */
    static final class C36653a implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ SetNicknameDialog f96260a;

        C36653a(SetNicknameDialog setNicknameDialog) {
            this.f96260a = setNicknameDialog;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f96260a.f96259c.f94200a = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.SetNicknameDialog$b */
    static final class C36654b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SetNicknameDialog f96261a;

        C36654b(SetNicknameDialog setNicknameDialog) {
            this.f96261a = setNicknameDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C36011ai aiVar = this.f96261a.f96259c;
            DmtEditText dmtEditText = (DmtEditText) this.f96261a.findViewById(R.id.afs);
            C7573i.m23582a((Object) dmtEditText, "etInput");
            aiVar.mo91646b(String.valueOf(dmtEditText.getText()));
        }
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
    }

    public SetNicknameDialog(Context context) {
        C7573i.m23587b(context, "context");
        super(context, 0, 2, null);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((DmtTextView) findViewById(R.id.dq6)).setText(R.string.dmj);
        ((DmtEditText) findViewById(R.id.afs)).setHint(R.string.dmk);
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.dpz);
        C7573i.m23582a((Object) dmtTextView, "tvHint");
        dmtTextView.setVisibility(0);
        DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.dpz);
        C7573i.m23582a((Object) dmtTextView2, "tvHint");
        dmtTextView2.setText(getContext().getString(R.string.dml, new Object[]{"20"}));
        this.f96259c.f94200a = this;
        setOnDismissListener(new C36653a(this));
        ((DmtButton) findViewById(R.id.a10)).setOnClickListener(new C36654b(this));
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        C42961az.m136380a(new C23285d());
        dismiss();
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        if (isShowing() && getContext() != null) {
            C22814a.m75245a(getContext(), exc, R.string.d80);
        }
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
        C10761a.m31403c((Context) AwemeApplication.m21341a(), str).mo25750a();
    }
}
