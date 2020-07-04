package com.p280ss.android.ugc.aweme.i18n.checkprofile;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.i18n.checkprofile.CheckProfileAdapter.C30440a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.checkprofile.b */
final class C30442b extends C1293v implements OnClickListener {

    /* renamed from: a */
    private TextView f79979a = ((TextView) this.itemView.findViewById(R.id.e9n));

    /* renamed from: b */
    private TextView f79980b = ((TextView) this.itemView.findViewById(R.id.atz));

    /* renamed from: c */
    private TextView f79981c = ((TextView) this.itemView.findViewById(R.id.aio));

    /* renamed from: d */
    private AvatarImageWithVerify f79982d = ((AvatarImageWithVerify) this.itemView.findViewById(R.id.e9l));

    /* renamed from: e */
    private C30440a f79983e;

    /* renamed from: f */
    private User f79984f;

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f79983e != null) {
            this.f79983e.mo80112a(this.f79984f);
        }
        CheckProfileAdapter.m99439b(getAdapterPosition());
    }

    C30442b(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b3c, viewGroup, false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo80119a(User user, C30440a aVar) {
        this.f79983e = aVar;
        this.f79984f = user;
        this.f79979a.setText(user.getNickname());
        this.f79980b.setText(C1642a.m8034a(this.f79980b.getResources().getString(R.string.bd_), new Object[]{C43122ff.m136777h(user)}));
        this.f79981c.setText(C1642a.m8034a(this.f79981c.getResources().getString(R.string.b41), new Object[]{Integer.valueOf(user.getFollowerCount()), Integer.valueOf(user.getAwemeCount())}));
        UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
        this.f79982d.setUserData(userVerify);
        this.itemView.setOnClickListener(this);
        if (C6399b.m19944t()) {
            this.f79982d.mo60896b();
            C43126fg.m136801a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f79979a);
        }
    }
}
