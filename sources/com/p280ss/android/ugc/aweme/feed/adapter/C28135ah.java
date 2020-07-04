package com.p280ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.C28067ad;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.story.live.C41994h;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ah */
public final class C28135ah implements C28067ad {

    /* renamed from: a */
    public Aweme f74199a;

    /* renamed from: b */
    public Context f74200b;

    /* renamed from: c */
    private boolean f74201c;

    /* renamed from: d */
    private View f74202d;

    /* renamed from: e */
    private TextView f74203e;

    /* renamed from: f */
    private TextView f74204f;

    /* renamed from: g */
    private TextView f74205g;

    /* renamed from: a */
    private void m92402a() {
        this.f74201c = false;
    }

    /* renamed from: b */
    private boolean m92403b() {
        return this.f74201c;
    }

    /* renamed from: a */
    private static String m92401a(User user) {
        if (user == null) {
            return "";
        }
        if (TextUtils.isEmpty(user.getUniqueId())) {
            return user.getShortId();
        }
        return user.getUniqueId();
    }

    /* renamed from: b */
    public final void mo71513b(FeedLiveViewHolderOld feedLiveViewHolderOld) {
        if (this.f74205g != null) {
            this.f74205g.setVisibility(0);
            this.f74202d.setVisibility(8);
            feedLiveViewHolderOld.mCoverView.setController(null);
        }
    }

    /* renamed from: a */
    public final void mo71512a(FeedLiveViewHolderOld feedLiveViewHolderOld) {
        UrlModel urlModel;
        if (!m92403b()) {
            if (feedLiveViewHolderOld.f73974b != null) {
                feedLiveViewHolderOld.f73974b.setVisibility(8);
            }
            return;
        }
        if (feedLiveViewHolderOld.f73974b == null) {
            feedLiveViewHolderOld.f73974b = feedLiveViewHolderOld.mLiveStub.inflate();
            this.f74204f = (TextView) feedLiveViewHolderOld.f73974b.findViewById(R.id.bq6);
            this.f74203e = (TextView) feedLiveViewHolderOld.f73974b.findViewById(R.id.bq7);
            this.f74202d = feedLiveViewHolderOld.f73974b.findViewById(R.id.ry);
            this.f74205g = (TextView) feedLiveViewHolderOld.f73974b.findViewById(R.id.du0);
        }
        feedLiveViewHolderOld.f73974b.setVisibility(0);
        this.f74205g.setVisibility(8);
        this.f74202d.setVisibility(0);
        TextView textView = this.f74204f;
        StringBuilder sb = new StringBuilder("@");
        sb.append(m92401a(this.f74199a.getAuthor()));
        textView.setText(sb.toString());
        if (TextUtils.isEmpty(this.f74199a.getTitle())) {
            this.f74203e.setVisibility(8);
        } else {
            this.f74203e.setVisibility(0);
            this.f74203e.setText(this.f74199a.getTitle());
        }
        RemoteImageView remoteImageView = feedLiveViewHolderOld.mCoverView;
        if (this.f74199a.getAuthor() == null) {
            urlModel = null;
        } else {
            urlModel = this.f74199a.getAuthor().getAvatarLarger();
        }
        C23323e.m76524b(remoteImageView, urlModel);
        this.f74202d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                User author = C28135ah.this.f74199a.getAuthor();
                if (author != null) {
                    if (!C43122ff.m136769b(author, false) || author.getFollowStatus() == 2 || author.getFollowStatus() == 1) {
                        C41989d.m133473a(C28135ah.this.f74200b, author.getRequestId(), author.getUid(), author.roomId, true);
                        C41994h.m133522a(view.getContext(), author, (C36040n) null);
                        return;
                    }
                    C10761a.m31409e(C28135ah.this.f74200b, (int) R.string.d52).mo25750a();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo71511a(Context context, Aweme aweme) {
        m92402a();
        this.f74199a = aweme;
        this.f74200b = context;
        if (this.f74200b != null && this.f74199a != null && this.f74199a.getAwemeType() == 101 && this.f74199a.getStreamUrlModel() != null) {
            this.f74201c = true;
        }
    }
}
