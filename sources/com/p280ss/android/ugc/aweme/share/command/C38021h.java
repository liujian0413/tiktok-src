package com.p280ss.android.ugc.aweme.share.command;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7104a;
import com.p280ss.android.ugc.aweme.profile.api.C35732h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.share.command.h */
public final class C38021h extends Dialog implements OnClickListener, C6310a {

    /* renamed from: a */
    protected C6309f f98954a;

    /* renamed from: b */
    protected User f98955b;

    /* renamed from: c */
    private RemoteImageView f98956c;

    /* renamed from: d */
    private ImageView f98957d;

    /* renamed from: e */
    private DmtTextView f98958e;

    /* renamed from: f */
    private DmtTextView f98959f;

    /* renamed from: g */
    private ImageView f98960g;

    /* renamed from: h */
    private Schema f98961h;

    /* renamed from: i */
    private DmtTextView f98962i;

    /* renamed from: j */
    private boolean f98963j;

    /* renamed from: k */
    private boolean f98964k;

    /* renamed from: l */
    private String f98965l;

    /* renamed from: m */
    private Context f98966m;

    /* renamed from: d */
    private boolean m121357d() {
        if (this.f98961h == null || !this.f98963j) {
            return false;
        }
        IIMService g = C30553b.m99810g();
        if (g == null || g.exitUser(this.f98961h.getShareUserId())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private C7104a m121355b() {
        if (this.f98961h.getSchemeDetail() == null || this.f98961h.getSchemeDetail().getVideo() == null) {
            return null;
        }
        CommandTransVideo video = this.f98961h.getSchemeDetail().getVideo();
        C7104a aVar = new C7104a();
        aVar.f19953a = video.getAwemeId();
        aVar.f19956d = this.f98961h.getShareUserId();
        aVar.f19957e = video.getAuthorName();
        aVar.f19955c = video.getDesc();
        if (this.f98955b != null) {
            aVar.f19958f = C30553b.m99780a(this.f98955b);
        }
        aVar.f19954b = video.getCover();
        return aVar;
    }

    /* renamed from: c */
    private void m121356c() {
        Intent intent = new Intent(getContext(), DeepLinkHandlerActivity.class);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f98961h.getSchema());
        sb.append("?from_uid=");
        sb.append(this.f98961h.getShareUserId());
        intent.setData(Uri.parse(sb.toString()));
        intent.putExtra("from_token", this.f98965l);
        intent.putExtra("token_request_id", this.f98961h.getRid());
        getContext().startActivity(intent);
    }

    /* renamed from: a */
    private void m121353a() {
        String str;
        if (this.f98961h != null && this.f98961h.getSchemeDetail() != null && this.f98961h.getSchemeDetail().getVideo() != null) {
            String str2 = this.f98965l;
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 110986) {
                if (hashCode != 3321850) {
                    if (hashCode == 110541305 && str2.equals("token")) {
                        c = 1;
                    }
                } else if (str2.equals("link")) {
                    c = 0;
                }
            } else if (str2.equals("pic")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    str = this.f98966m.getString(R.string.dsv, new Object[]{"链接"});
                    break;
                case 1:
                    str = this.f98966m.getString(R.string.dsv, new Object[]{"口令"});
                    break;
                case 2:
                    str = this.f98966m.getString(R.string.dsv, new Object[]{this.f98966m.getString(R.string.d_w)});
                    break;
                default:
                    str = "";
                    break;
            }
            this.f98962i.setText(str);
            CommandTransVideo video = this.f98961h.getSchemeDetail().getVideo();
            C23323e.m76524b(this.f98956c, video.getCover());
            DmtTextView dmtTextView = this.f98958e;
            StringBuilder sb = new StringBuilder("@");
            sb.append(C1642a.m8034a(getContext().getString(R.string.dsu), new Object[]{video.getAuthorName()}));
            dmtTextView.setText(sb.toString());
        }
    }

    /* renamed from: a */
    private static boolean m121354a(String str) {
        return C6319n.m19594a(str, ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
    }

    public final void handleMsg(Message message) {
        if (message != null && (message.obj instanceof User)) {
            this.f98955b = (User) message.obj;
        }
        super.show();
    }

    /* renamed from: a */
    public final void mo95658a(Schema schema) {
        this.f98961h = schema;
        if ("token".equals(this.f98965l)) {
            this.f98963j = C7213d.m22500a().mo18715H();
        } else if ("pic".equals(this.f98965l)) {
            this.f98963j = C7213d.m22500a().mo18716I();
        }
        this.f98964k = m121357d();
        if (this.f98964k) {
            this.f98954a = new C6309f(Looper.getMainLooper(), this);
            C35732h.m115451a().mo90591a(this.f98954a, this.f98961h.getShareUserId(), 0);
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.equals(this.f98957d) || view.equals(this.f98959f)) {
            try {
                if (this.f98961h != null && this.f98963j && (!this.f98964k || this.f98955b != null)) {
                    if (!m121354a(this.f98961h.getShareUserId())) {
                        IIMService g = C30553b.m99810g();
                        if (g != null) {
                            C7104a b = m121355b();
                            if (b != null) {
                                g.commandShareVideo(getContext(), b);
                            } else {
                                m121356c();
                            }
                        } else {
                            m121356c();
                        }
                        dismiss();
                        return;
                    }
                }
                m121356c();
                dismiss();
            } catch (Exception unused) {
            }
            return;
        }
        if (view.equals(this.f98960g)) {
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.lf);
        setCanceledOnTouchOutside(false);
        this.f98956c = (RemoteImageView) findViewById(R.id.a4l);
        this.f98957d = (ImageView) findViewById(R.id.ccd);
        this.f98958e = (DmtTextView) findViewById(R.id.hy);
        this.f98959f = (DmtTextView) findViewById(R.id.c8t);
        this.f98962i = (DmtTextView) findViewById(R.id.dw5);
        this.f98960g = (ImageView) findViewById(R.id.xk);
        this.f98959f.setOnClickListener(this);
        this.f98957d.setOnClickListener(this);
        this.f98960g.setOnClickListener(this);
        m121353a();
    }

    public C38021h(Context context, String str) {
        super(context, R.style.uu);
        this.f98965l = str;
        this.f98966m = context;
    }
}
