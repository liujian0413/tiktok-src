package com.p280ss.android.ugc.aweme.discover.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.C1757f.C1759a;
import com.airbnb.lottie.C1833n;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26576c;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RecommendCardViewHolder */
public class RecommendCardViewHolder extends AnimatedViewHolder {

    /* renamed from: a */
    public C1757f f69598a;
    CircleImageView avatar;

    /* renamed from: b */
    public User f69599b;

    /* renamed from: c */
    public boolean f69600c;
    FrameLayout closeContainer;
    ImageView closeIv;

    /* renamed from: d */
    private Context f69601d;
    View descriptionBg;

    /* renamed from: e */
    private C28343z f69602e;
    AnimationImageView ivFollow;
    View nickNameBg;
    LinearLayout rootLayout;
    TextView txtDescription;
    TextView txtNickName;

    public final void bB_() {
    }

    /* renamed from: k */
    private void m86932k() {
        if (this.f69598a == null) {
            C1759a.m8390a(this.f69601d, "anim_follow_people.json", new C1833n() {
                /* renamed from: a */
                public final void mo7330a(C1757f fVar) {
                    RecommendCardViewHolder.this.f69598a = fVar;
                    RecommendCardViewHolder.this.ivFollow.setComposition(RecommendCardViewHolder.this.f69598a);
                }
            });
        } else {
            this.ivFollow.setComposition(this.f69598a);
        }
    }

    /* renamed from: e */
    private void m86931e() {
        m86932k();
        if (TextUtils.equals(C21115b.m71197a().getCurUserId(), this.f69599b.getUid())) {
            this.ivFollow.setVisibility(4);
        } else if (this.f69599b.getFollowStatus() == 0) {
            this.ivFollow.setVisibility(0);
            this.ivFollow.setProgress(0.0f);
        } else {
            this.ivFollow.setVisibility(4);
            this.ivFollow.setProgress(1.0f);
        }
    }

    /* renamed from: a */
    private void m86928a() {
        if (!this.f69600c) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.nickNameBg, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.setDuration(300);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.descriptionBg, "alpha", new float[]{1.0f, 0.0f});
            ofFloat2.setDuration(300);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
            animatorSet.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    RecommendCardViewHolder.this.nickNameBg.setVisibility(8);
                    RecommendCardViewHolder.this.descriptionBg.setVisibility(8);
                    RecommendCardViewHolder.this.f69600c = true;
                }
            });
        }
    }

    /* renamed from: c */
    private void m86929c() {
        if (this.f69600c) {
            mo68008a(this.f69599b);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.txtNickName, "alpha", new float[]{this.txtNickName.getAlpha(), 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.ivFollow, "alpha", new float[]{this.ivFollow.getAlpha(), 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.txtDescription, "alpha", new float[]{this.txtDescription.getAlpha(), 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat3).with(ofFloat2);
        animatorSet.start();
        animatorSet.setDuration(300);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                RecommendCardViewHolder.this.mo68008a(RecommendCardViewHolder.this.f69599b);
                RecommendCardViewHolder.this.f69600c = true;
            }
        });
    }

    /* renamed from: d */
    private void m86930d() {
        if (!C26536y.m87234a(this.f69601d)) {
            C10761a.m31399c(this.f69601d, (int) R.string.cjs).mo25750a();
            return;
        }
        String uid = this.f69599b.getUid();
        if (!TextUtils.equals(uid, C21115b.m71197a().getCurUserId()) && this.f69599b.getFollowStatus() == 0) {
            if (this.f69599b.getFollowStatus() == 0) {
                this.ivFollow.setAnimation("anim_follow_people.json");
                this.ivFollow.mo7078b();
            }
            if (this.f69602e != null) {
                C26576c cVar = new C26576c(uid, "follow");
                cVar.f70101b = this.f69599b;
                this.f69602e.mo64929a(cVar);
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.b9g) {
            if (this.f69599b != null) {
                m86930d();
            }
        } else if (id == R.id.cwn && this.f69599b != null) {
            UserProfileActivity.m117394a(this.f69601d, this.f69599b.getUid(), this.f69599b.getSecUid(), "discovery_recommend");
            if (this.f69602e != null) {
                this.f69602e.mo64929a(new C26576c(this.f69599b.getUid(), "enter"));
            }
        }
    }

    /* renamed from: a */
    public final void mo68008a(User user) {
        String str = "";
        if (!C6319n.m19593a(user.getNickname())) {
            str = user.getNickname();
        }
        this.txtNickName.setText(str);
        if (user.getRecommendReason() == null || user.getRecommendReason().isEmpty()) {
            this.txtDescription.setText("热门用户");
        } else {
            this.txtDescription.setText(user.getRecommendReason());
        }
        this.avatar.mo60860a(user.getAvatarMedium());
        C23323e.m76509a((RemoteImageView) this.avatar, user.getAvatarMedium(), this.avatar.getControllerListener());
        m86931e();
    }

    public RecommendCardViewHolder(View view, C28343z zVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f69602e = zVar;
    }

    /* renamed from: a */
    public final void mo68009a(User user, Context context) {
        this.f69601d = context;
        if (user != null) {
            this.f69599b = user;
            m86928a();
            m86929c();
            C6907h.onEvent(MobClick.obtain().setEventName("show_user").setLabelName("discovery_recommend").setValue(this.f69599b.getUid()));
        }
    }
}
