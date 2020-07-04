package com.p280ss.android.ugc.aweme.p313im.sdk.module.session;

import android.support.p029v7.widget.AppCompatTextView;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6425b;
import com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.C6990a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.p1336a.C31494a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.ChatSession;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListNewViewHolder */
public class SessionListNewViewHolder extends SessionListViewHolder {

    /* renamed from: a */
    private final AppCompatTextView f82443a;

    public SessionListNewViewHolder(View view, C31494a aVar) {
        super(view, aVar);
        this.f82443a = (AppCompatTextView) view.findViewById(R.id.dga);
    }

    /* renamed from: a */
    public final void mo82172a(C7102a aVar, int i) {
        super.mo82172a(aVar, i);
        if (aVar.mo18115b() == 0) {
            ChatSession chatSession = (ChatSession) aVar;
            if (chatSession.mo18116c() == null || chatSession.mo18116c().getFollowStatus() != 2) {
                this.f82443a.setVisibility(8);
            } else {
                int a = C6990a.m21758a().mo18069a(String.valueOf(C6425b.m20074a(aVar.bf_())));
                if (a > 1) {
                    this.f82443a.setText(C6399b.m19921a().getString(R.string.brb, new Object[]{C6990a.m21759a(a)}));
                    this.f82443a.setVisibility(0);
                } else if (a == 1) {
                    this.f82443a.setText(C6399b.m19921a().getString(R.string.brc));
                    this.f82443a.setVisibility(0);
                } else {
                    this.f82443a.setVisibility(8);
                }
            }
            return;
        }
        this.f82443a.setVisibility(8);
    }
}
