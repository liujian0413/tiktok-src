package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecomendFriendItemView */
public class RecomendFriendItemView extends LinearLayout {

    /* renamed from: a */
    public C30127a f79262a;

    /* renamed from: b */
    private TextView f79263b;

    /* renamed from: c */
    private AvatarImageView f79264c;

    /* renamed from: d */
    private TextView f79265d;

    /* renamed from: e */
    private TextView f79266e;

    /* renamed from: f */
    private TextView f79267f;

    /* renamed from: g */
    private ImageView f79268g;

    /* renamed from: h */
    private User f79269h;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecomendFriendItemView$a */
    public interface C30127a {
        /* renamed from: a */
        void mo76564a(User user);
    }

    public User getData() {
        return this.f79269h;
    }

    public void setListener(C30127a aVar) {
        this.f79262a = aVar;
    }

    public RecomendFriendItemView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo76558a(int i) {
        if (i == 0) {
            this.f79267f.setText(getContext().getString(R.string.b7r));
            this.f79267f.setTextColor(getContext().getResources().getColor(R.color.r8));
            this.f79267f.setBackground(getResources().getDrawable(R.drawable.qn));
            return;
        }
        if (i == 1) {
            this.f79267f.setText(getContext().getString(R.string.b92));
            this.f79267f.setBackground(getResources().getDrawable(R.drawable.qp));
            this.f79267f.setTextColor(getContext().getResources().getColor(R.color.r7));
        }
    }

    public void setData(final User user) {
        if (user != null) {
            this.f79269h = user;
            if (!C6319n.m19593a(user.getWeiboVerify()) || !C6319n.m19593a(user.getCustomVerify())) {
                this.f79268g.setVisibility(0);
            } else {
                this.f79268g.setVisibility(8);
            }
            this.f79263b.setText(user.getNickname());
            C23323e.m76524b(this.f79264c, user.getAvatarThumb());
            TextView textView = this.f79265d;
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getString(R.string.b94));
            sb.append(C30537o.m99738a((long) user.getFollowerCount()));
            textView.setText(sb.toString());
            this.f79266e.setText(user.getSignature());
            this.f79267f.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (RecomendFriendItemView.this.f79262a != null) {
                        RecomendFriendItemView.this.f79262a.mo76564a(user);
                        User user = user;
                        int i = 1;
                        if (user.getFollowStatus() == 1) {
                            i = 0;
                        }
                        user.setFollowStatus(i);
                        RecomendFriendItemView.this.mo76558a(user.getFollowStatus());
                    }
                }
            });
            mo76558a(user.getFollowStatus());
            this.f79264c.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C7195s a = C7195s.m22438a();
                    StringBuilder sb = new StringBuilder("aweme://user/profile/");
                    sb.append(user.getUid());
                    a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", user.getSecUid()).mo18695a());
                }
            });
        }
    }

    public RecomendFriendItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecomendFriendItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a1j, this);
        setOrientation(0);
        this.f79263b = (TextView) findViewById(R.id.e7f);
        this.f79264c = (AvatarImageView) findViewById(R.id.b64);
        this.f79265d = (TextView) findViewById(R.id.e6q);
        this.f79266e = (TextView) findViewById(R.id.e6j);
        this.f79267f = (TextView) findViewById(R.id.e6o);
        this.f79268g = (ImageView) findViewById(R.id.e_p);
    }
}
