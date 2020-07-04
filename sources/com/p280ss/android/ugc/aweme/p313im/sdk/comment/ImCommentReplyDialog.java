package com.p280ss.android.ugc.aweme.p313im.sdk.comment;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C31055x;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31889bb;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7105b;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.comment.ImCommentReplyDialog */
public class ImCommentReplyDialog extends AppCompatDialog {

    /* renamed from: a */
    public final C7105b f81528a;

    /* renamed from: b */
    public final C31064a f81529b;

    /* renamed from: c */
    public final C31064a f81530c;

    /* renamed from: d */
    public EditText f81531d;

    /* renamed from: e */
    private View f81532e;

    /* renamed from: f */
    private DmtTextView f81533f;

    /* renamed from: g */
    private AvatarImageView f81534g;

    /* renamed from: h */
    private ImageView f81535h;

    /* renamed from: i */
    private DmtTextView f81536i;

    /* renamed from: j */
    private Button f81537j;

    /* renamed from: k */
    private Button f81538k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.comment.ImCommentReplyDialog$a */
    public interface C31064a {
        /* renamed from: a */
        void mo18005a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.comment.ImCommentReplyDialog$b */
    public static class C31065b {

        /* renamed from: a */
        public Context f81542a;

        /* renamed from: b */
        public C7105b f81543b;

        /* renamed from: c */
        public C31064a f81544c;

        /* renamed from: d */
        public C31064a f81545d;

        /* renamed from: a */
        public final ImCommentReplyDialog mo81545a() {
            return new ImCommentReplyDialog(this);
        }

        /* renamed from: a */
        public final C31065b mo81543a(C31064a aVar) {
            this.f81544c = aVar;
            return this;
        }

        /* renamed from: b */
        public final C31065b mo81546b(C31064a aVar) {
            this.f81545d = aVar;
            return this;
        }

        public C31065b(Context context) {
            this.f81542a = context;
        }

        /* renamed from: a */
        public final C31065b mo81544a(C7105b bVar) {
            this.f81543b = bVar;
            return this;
        }
    }

    public void cancel() {
        m101330a();
        super.cancel();
    }

    public void dismiss() {
        m101330a();
        super.dismiss();
    }

    public void show() {
        super.show();
        C25713b.m84476a((View) this.f81531d, 0);
    }

    /* renamed from: a */
    private void m101330a() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f81531d.getWindowToken(), 0);
        }
    }

    private ImCommentReplyDialog(C31065b bVar) {
        super(bVar.f81542a);
        this.f81528a = bVar.f81543b;
        this.f81529b = bVar.f81544c;
        this.f81530c = bVar.f81545d;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        this.f81532e = LayoutInflater.from(getContext()).inflate(R.layout.kc, null);
        setContentView(this.f81532e);
        setCancelable(false);
        this.f81533f = (DmtTextView) findViewById(R.id.yw);
        this.f81534g = (AvatarImageView) findViewById(R.id.j0);
        this.f81535h = (ImageView) findViewById(R.id.e_q);
        this.f81536i = (DmtTextView) findViewById(R.id.e9m);
        this.f81531d = (EditText) findViewById(R.id.ac9);
        this.f81537j = (Button) findViewById(R.id.d4v);
        this.f81538k = (Button) findViewById(R.id.d50);
        IMUser iMUser = this.f81528a.f19966h;
        this.f81533f.setText(getContext().getResources().getString(R.string.bim, new Object[]{this.f81528a.f19965g}));
        C23323e.m76524b(this.f81534g, iMUser.getAvatarThumb());
        this.f81536i.setText(iMUser.getNickName());
        if (!C6399b.m19944t()) {
            C31889bb.m103601a(this.f81535h, iMUser);
        }
        C43126fg.m136801a(getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.f81536i);
        C31878ax.m103576a(this.f81537j);
        C31878ax.m103576a(this.f81538k);
        this.f81537j.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (ImCommentReplyDialog.this.f81529b != null) {
                    ImCommentReplyDialog.this.f81529b.mo18005a(ImCommentReplyDialog.this.f81531d.getText().toString());
                }
                ImCommentReplyDialog.this.dismiss();
            }
        });
        this.f81538k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (TextUtils.isEmpty(ImCommentReplyDialog.this.f81531d.getText().toString())) {
                    C10761a.m31400c(ImCommentReplyDialog.this.getContext(), (int) R.string.bi0, 1).mo25750a();
                    C31858ad.m103406a();
                    C31858ad.m103501o(ImCommentReplyDialog.this.f81528a.f19963e);
                } else if (ImCommentReplyDialog.this.f81531d.getText().length() > C31863ai.m103525a()) {
                    C9738o.m28697a(C6399b.m19921a(), C6399b.m19921a().getResources().getString(R.string.bmn));
                    C31858ad.m103406a();
                    C31858ad.m103501o(ImCommentReplyDialog.this.f81528a.f19963e);
                } else {
                    C31858ad.m103406a();
                    C31858ad.m103416a(ImCommentReplyDialog.this.f81528a);
                    if (ImCommentReplyDialog.this.f81530c != null) {
                        ImCommentReplyDialog.this.f81530c.mo18005a(ImCommentReplyDialog.this.f81531d.getText().toString());
                    }
                    ImCommentReplyDialog.this.dismiss();
                }
            }
        });
        this.f81531d.setFilters(new InputFilter[]{new C31055x(C31863ai.m103525a())});
        this.f81531d.setOnKeyListener(new OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return i == 66;
            }
        });
    }
}
