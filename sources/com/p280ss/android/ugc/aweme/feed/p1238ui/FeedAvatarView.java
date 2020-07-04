package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.app.Dialog;
import android.arch.lifecycle.C0053p;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.p022v4.app.C0578a;
import android.support.p022v4.app.C0578a.C0580a;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.p028a.C0945c;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10804a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarBorderView;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.model.C24995f;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26682g;
import com.p280ss.android.ugc.aweme.familiar.p966b.C21718a;
import com.p280ss.android.ugc.aweme.familiar.p966b.C21719b;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.C28676s;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.exception.FeedAvatarException;
import com.p280ss.android.ugc.aweme.feed.experiment.C28345b;
import com.p280ss.android.ugc.aweme.feed.helper.C28417e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28498o;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28507v;
import com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p280ss.android.ugc.aweme.festival.p311a.C29125d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.live.feedpage.C32517b;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.main.p1378a.C32858a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33275q;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedAvatarView */
public class FeedAvatarView extends C28894e implements C0053p<C23083a> {

    /* renamed from: e */
    private static final String f75651e;

    /* renamed from: a */
    public boolean f75652a;
    int avatarSize;

    /* renamed from: b */
    private C28826b f75653b;

    /* renamed from: c */
    private C24723e f75654c;

    /* renamed from: d */
    private boolean f75655d;

    /* renamed from: f */
    private C7326g<C32517b> f75656f;
    ImageView ivFakeUserLink;
    LiveCircleView mAvatarBorderView;
    RemoteImageView mAvatarDeco;
    ImageView mAvatarDecoration;
    AvatarImageWithLive mAvatarLiveView;
    AnimationImageView mAvatarLoadingView;
    SmartAvatarBorderView mAvatarView;
    RelativeLayout mFollowContainerView;
    AnimationImageView mFollowView;

    /* renamed from: a */
    public final void mo72018a() {
        C42961az.m136383d(this);
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        ImageView imageView;
        super.mo72021a(videoItemParams);
        C28498o.m93660a(this.f76169g, this.f76176n, true, true);
        this.mFollowContainerView.setVisibility(C43122ff.m136767b() ? 4 : 0);
        int i = 8;
        if (C25300bx.m83125a(this.f76169g, 3)) {
            this.mFollowView.setVisibility(8);
            imageView = this.ivFakeUserLink;
        } else {
            this.mFollowView.setVisibility((C25329c.m83222e(this.f76169g) || this.f76169g.isDelete()) ? 8 : 0);
            imageView = this.ivFakeUserLink;
            if (C25329c.m83222e(this.f76169g)) {
                i = 0;
            }
        }
        imageView.setVisibility(i);
        mo73802a(this.f76169g.getAuthor());
    }

    /* renamed from: a */
    public final void mo73802a(User user) {
        if (user == null || C25300bx.m83125a(this.f76169g, 3)) {
            if (this.mAvatarLiveView != null) {
                this.mAvatarLiveView.setVisibility(4);
                this.mAvatarLiveView.mo73766a(false);
            }
            this.mAvatarView.setVisibility(0);
            this.mAvatarView.setBorderColor(R.color.dy);
            m94474a(this.mAvatarView);
            if (this.mAvatarDeco != null) {
                this.mAvatarDeco.setVisibility(8);
            }
        } else {
            m94482b(TextUtils.isEmpty(user.getRemarkName()) ? user.getNickname() : user.getRemarkName());
            if (C6861a.m21337f().isMe(user.getUid())) {
                user.roomId = C6861a.m21337f().getCurUser().roomId;
            }
            if (this.f75653b == null) {
                this.f75653b = new C28826b(user.isLive(), this.mAvatarLiveView, this.mAvatarView, this.mAvatarBorderView);
            }
            m94481b(user);
            if (m94485c(user)) {
                this.mAvatarLiveView.setBorderColor(R.color.ayd);
                m94474a(this.mAvatarLiveView.getAvatarImageView());
                this.mAvatarLiveView.mo73766a(true);
            } else {
                this.mAvatarView.setBorderColor(R.color.dy);
                m94474a(this.mAvatarView);
                this.mAvatarLiveView.mo73766a(false);
            }
            if (this.mAvatarDeco != null) {
                if (m94485c(user) || !C24995f.m82308a(user)) {
                    this.mAvatarDeco.setVisibility(8);
                } else {
                    this.mAvatarDeco.setVisibility(0);
                    C24995f.m82306a(user, this.mAvatarDeco);
                    C24995f.m82307a(user, C22704b.f60414c);
                }
            }
            m94471a(user.getFollowStatus());
            if (user.isActivityUser()) {
                Drawable j = C29125d.m95531j();
                if (j != null) {
                    this.mAvatarDecoration.setVisibility(0);
                    this.mAvatarDecoration.setImageDrawable(j);
                } else {
                    this.mAvatarDecoration.setVisibility(8);
                }
            } else {
                this.mAvatarDecoration.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo73801a(FollowStatus followStatus) {
        if (!TextUtils.isEmpty(followStatus.userId) && TextUtils.equals(C33230ac.m107205a(this.f76169g), followStatus.userId)) {
            if (this.f76169g.getAuthor() != null) {
                this.f76169g.getAuthor().setFollowStatus(followStatus.followStatus);
            }
            m94471a(followStatus.followStatus);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo73800a(View view, DialogInterface dialogInterface, int i) {
        if (!C6900g.m21454b().mo16943d()) {
            C10761a.m31399c(view.getContext(), (int) R.string.cjs).mo25750a();
            dialogInterface.dismiss();
            return;
        }
        if (this.f76174l != null) {
            C28318an anVar = new C28318an(38, this.f76169g);
            anVar.f74634d = "head_icon";
            this.f76174l.mo60134a("feed_internal_event", (Object) anVar);
        }
        C28507v.m93710a(true);
        dialogInterface.dismiss();
    }

    /* renamed from: g */
    public final void mo73804g() {
        super.mo73804g();
        m94490l();
    }

    /* renamed from: p */
    private boolean m94494p() {
        if (this.f75654c == null || !this.f75654c.mo64710e()) {
            return false;
        }
        return true;
    }

    static {
        String str;
        if (C6903bc.m21482a().mo84635e()) {
            str = "home_follow_lottie.json";
        } else {
            str = "anim_follow_people.json";
        }
        f75651e = str;
    }

    /* renamed from: i */
    private void m94487i() {
        C10804a aVar = new C10804a(0.5f, 1.0f);
        this.mAvatarView.setOnTouchListener(aVar);
        this.mAvatarLiveView.setOnTouchListener(aVar);
    }

    /* renamed from: j */
    private void m94488j() {
        if (!m94489k() && !this.f75655d) {
            this.f75655d = true;
            if (this.f75653b != null) {
                this.f75653b.mo74074c();
            }
        }
    }

    /* renamed from: k */
    private boolean m94489k() {
        if (this.f76169g == null || this.f76169g.getAwemeType() != 101 || this.f76169g.getStreamUrlModel() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m94490l() {
        if (this.f75655d) {
            this.f75655d = false;
            if (this.f75653b != null) {
                this.f75653b.mo74075d();
            }
        }
    }

    /* renamed from: n */
    private String m94492n() {
        return ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestId(this.f76169g, this.f76173k);
    }

    /* renamed from: o */
    private void m94493o() {
        boolean z;
        SmartAvatarBorderView avatarImageView = this.mAvatarLiveView.getAvatarImageView();
        boolean z2 = false;
        if (this.mAvatarLiveView.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        m94475a(avatarImageView, z);
        SmartAvatarBorderView smartAvatarBorderView = this.mAvatarView;
        if (this.mAvatarView.getVisibility() == 0) {
            z2 = true;
        }
        m94475a(smartAvatarBorderView, z2);
        if (this.f76169g != null && m94486d(this.f76169g.getAuthor())) {
            C24995f.m82307a(this.f76169g.getAuthor(), "video");
        }
        if (C25329c.m83224g(this.f76169g) && !C25300bx.m83125a(this.f76169g, 3) && m94485c(this.f76169g.getAuthor())) {
            C24671f.m80851a().mo64671c(this.f76175m, this.f76169g);
        }
    }

    /* renamed from: m */
    private void m94491m() {
        if (!C43122ff.m136767b() && !C32698a.m105818a(this.f76169g) && !mo74167d()) {
            if (this.f76169g == null || (this.f76169g.isCanPlay() && !this.f76169g.isDelete())) {
                if (this.f75654c != null) {
                    this.f75654c.mo64721p();
                }
                ((C33276r) ((C33276r) ((C33276r) ((C33276r) new C33276r().mo85312c(this.f76169g, this.f76173k).mo85310b(this.f76170h).mo85047a(this.f76175m)).mo85314d((String) this.f76174l.mo60136b("playlist_type", "")).mo85317f((String) this.f76174l.mo60136b("playlist_id", "")).mo85315e((String) this.f76174l.mo60136b("playlist_id_key", "")).mo85283l((String) this.f76174l.mo60136b("tab_name", ""))).mo85284m(C33230ac.m107216b(this.f76169g, this.f76173k))).mo85048a("click_head")).mo85252e();
                C28580o.m93830a(PAGE.PROFILE);
                if (this.f76169g != null) {
                    m94483c(19);
                    User author = this.f76169g.getAuthor();
                    if (author == null || !author.isLive() || !C41983b.m133444a()) {
                        m94476a("");
                    } else {
                        if (TextUtils.equals(this.f76170h, "homepage_hot")) {
                            C41989d.m133497d(this.f76175m, 1, m94492n(), author.getUid(), author.roomId, this.f76169g.getAid());
                        } else if (TextUtils.equals(this.f76170h, "homepage_follow")) {
                            C41989d.m133494c(this.f76175m, 1, m94492n(), author.getUid(), author.roomId, this.f76169g.getAid());
                        } else {
                            C41989d.m133471a(this.f76175m, 1, C28417e.m93408a(this.f76170h, this.f76172j), m94492n(), author.getUid(), author.roomId);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("live.intent.extra.ENTER_AWEME_ID", this.f76169g.getAid());
                        BusinessComponentServiceUtils.getLiveAllService().mo103111a(this.f76175m, author, this.f76170h, "video_head", bundle);
                        m94483c(19);
                    }
                }
            } else if (this.f76169g.isImage()) {
                C10761a.m31399c(this.f76175m, (int) R.string.bsx).mo25750a();
            } else {
                C10761a.m31399c(this.f76175m, (int) R.string.fp_).mo25750a();
            }
        }
    }

    public FeedAvatarView(View view) {
        super(view);
        m94487i();
        C42961az.m136382c(this);
    }

    /* renamed from: a */
    private void m94474a(SmartAvatarBorderView smartAvatarBorderView) {
        m94475a(smartAvatarBorderView, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo73803b(VideoItemParams videoItemParams) {
        super.mo73803b(videoItemParams);
        if (videoItemParams != null) {
            this.f75654c = videoItemParams.mAdViewController;
        }
    }

    /* renamed from: a */
    private void m94476a(String str) {
        if (this.f76174l != null) {
            this.f76174l.mo60134a("to_profile", (Object) str);
            return;
        }
        FeedAvatarException feedAvatarException = new FeedAvatarException("dataCenter is null! can't go!");
        C6921a.m21559a((Throwable) feedAvatarException);
        C2077a.m9160a((Throwable) feedAvatarException);
    }

    /* renamed from: d */
    private boolean m94486d(User user) {
        if (user == null || !C24995f.m82308a(user) || !m94485c(user)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60132a("startPlayAnimation", (C0053p<C23083a>) this).mo60132a("stopPlayAnimation", (C0053p<C23083a>) this).mo60132a("on_page_selected", (C0053p<C23083a>) this).mo60132a("image_pause", (C0053p<C23083a>) this).mo60132a("update_ad_user_follow_ui", (C0053p<C23083a>) this);
        }
    }

    /* renamed from: b */
    private void m94479b(int i) {
        int i2;
        float f;
        this.mFollowView.setAnimation(f75651e);
        AnimationImageView animationImageView = this.mFollowView;
        if (C25329c.m83222e(this.f76169g) || this.f76169g.isDelete()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        animationImageView.setVisibility(i2);
        AnimationImageView animationImageView2 = this.mFollowView;
        if (i == 0) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        animationImageView2.setProgress(f);
    }

    /* renamed from: c */
    private void m94483c(int i) {
        if (this.f76171i != null) {
            String str = "";
            try {
                str = this.f76171i.getString("request_id");
            } catch (JSONException unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                this.f76169g.setRequestId(str);
            }
        }
        if (this.f76174l != null) {
            this.f76174l.mo60134a("feed_internal_event", (Object) new C28318an(19, this.f76169g));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.layout_feed_avatar);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        ButterKnife.bind((Object) this, view2);
    }

    @C7709l
    public void onFollowEvent(FollowStatus followStatus) {
        C28900j jVar = new C28900j(this, followStatus);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            jVar.run();
        } else if (this.mFollowView != null) {
            this.mFollowView.post(jVar);
        } else {
            C6921a.m21555a("onFollowEvent mFollowView is null!");
        }
    }

    /* renamed from: b */
    private void m94481b(final User user) {
        if (this.f76169g != null && this.f76169g.getAuthor() != null) {
            if (this.f75656f == null) {
                this.f75656f = new C7326g<C32517b>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(C32517b bVar) throws Exception {
                        if (FeedAvatarView.this.f76169g != null && FeedAvatarView.this.f76169g.getAuthor() != null && TextUtils.equals(FeedAvatarView.this.f76169g.getAuthorUid(), String.valueOf(bVar.f84785a))) {
                            user.roomId = bVar.f84786b;
                            if (!C25072c.m82575a(FeedAvatarView.this.f76169g) && !user.isLive()) {
                                FeedAvatarView.this.mo73802a(FeedAvatarView.this.f76169g.getAuthor());
                            }
                        }
                    }
                };
            }
            this.f75653b.mo74072a(user, getClass(), this.f75656f, this.f76169g, C28498o.m93669a(this.f76169g));
        }
    }

    /* renamed from: c */
    private void m94484c(View view) {
        Dialog b = new C10741a(view.getContext()).mo25649a((int) R.string.wh).mo25650a((int) R.string.fll, (OnClickListener) new C28901k(this, view)).mo25658b((int) R.string.pp, C28902l.f76188a).mo25656a().mo25638b();
        if (b.findViewById(R.id.e0u) instanceof TextView) {
            ((TextView) b.findViewById(R.id.e0u)).setTextColor(view.getResources().getColor(R.color.lk));
        }
        if (b.findViewById(R.id.dsf) != null) {
            b.findViewById(R.id.dsf).setVisibility(8);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.anm) {
            m94480b(view);
            return;
        }
        if (id == R.id.e8m || id == R.id.e8s) {
            if (id == R.id.e8s && C25329c.m83224g(this.f76169g)) {
                C24671f.m80851a().mo64662a(this.f76175m, "draw_ad", this.f76169g);
            }
            if (C6399b.m19944t()) {
                m94491m();
                return;
            }
            m94477a(false);
            if (id == R.id.e8m) {
                String str = "FeedAvatarView";
                try {
                    StringBuilder sb = new StringBuilder("click avatar:");
                    sb.append(this.f76169g.getAuthor().getAvatarThumb().getUrlList());
                    C6921a.m21552a(4, str, sb.toString());
                } catch (Throwable th) {
                    C6921a.m21559a(th);
                }
            }
        }
    }

    @C7709l
    public void onLiveStatusEvent(RoomStatusEvent roomStatusEvent) {
        long j;
        User author = this.f76169g.getAuthor();
        try {
            j = Long.parseLong(author.getUid());
        } catch (Throwable unused) {
            j = 0;
        }
        if (author != null && String.valueOf(roomStatusEvent.f7645b).equals(author.getUid())) {
            if (roomStatusEvent.f7646c) {
                if (author.roomId != 0) {
                    BusinessComponentServiceUtils.getLiveStateManager().mo83744a(j);
                    m94478a(false, 0, j);
                }
                author.roomId = 0;
            } else if (roomStatusEvent.f7644a != 0) {
                if (author.roomId == 0) {
                    BusinessComponentServiceUtils.getLiveStateManager().mo83744a(j);
                    m94478a(true, roomStatusEvent.f7644a, j);
                }
                author.roomId = roomStatusEvent.f7644a;
            }
            mo73802a(author);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            switch (str.hashCode()) {
                case -1860252652:
                    if (str.equals("update_ad_user_follow_ui")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1780252142:
                    if (str.equals("image_pause")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1661876786:
                    if (str.equals("stopPlayAnimation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 307897710:
                    if (str.equals("startPlayAnimation")) {
                        c = 0;
                        break;
                    }
                    break;
                case 350216171:
                    if (str.equals("on_page_selected")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m94488j();
                    return;
                case 1:
                case 2:
                    m94490l();
                    return;
                case 3:
                    if (!m94494p()) {
                        this.mFollowView.setVisibility(8);
                        return;
                    } else if (this.f76169g.getAuthor() != null) {
                        m94471a(this.f76169g.getAuthor().getFollowStatus());
                        return;
                    }
                    break;
                case 4:
                    m94493o();
                    break;
            }
        }
    }

    /* renamed from: b */
    private void m94482b(String str) {
        if (!C6399b.m19944t()) {
            this.mAvatarView.setContentDescription(str);
            this.mAvatarLiveView.setContentDescription(str);
            C0578a.m2438a((View) this.mAvatarLiveView, (C0580a) new C0580a() {
                /* renamed from: a */
                public final void mo2559a(View view, C0945c cVar) {
                    cVar.mo3656b((CharSequence) Button.class.getName());
                }
            });
            C0578a.m2438a((View) this.mFollowContainerView, (C0580a) new C0580a() {
                /* renamed from: a */
                public final void mo2559a(View view, C0945c cVar) {
                    cVar.mo3656b((CharSequence) Button.class.getName());
                    cVar.mo3669d((CharSequence) FeedAvatarView.this.f76175m.getString(R.string.b_o));
                }
            });
        }
    }

    /* renamed from: c */
    private boolean m94485c(User user) {
        if (C25072c.m82575a(this.f76169g)) {
            if (!C28498o.m93669a(this.f76169g)) {
                return true;
            }
            return false;
        } else if (user == null || !user.isLive() || !C41983b.m133444a() || user.isBlock() || C43122ff.m136767b()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private void m94471a(int i) {
        int i2;
        if (this.f76169g == null) {
            StringBuilder sb = new StringBuilder("aweme is null. FollowStatus is :");
            sb.append(i);
            C6921a.m21563c(4, "FeedAvatarView", sb.toString());
        } else if (this.f76169g.getAuthor() == null) {
            StringBuilder sb2 = new StringBuilder("author is null. AwemeId is :");
            sb2.append(this.f76169g.getAid());
            sb2.append(", FollowStatus is :");
            sb2.append(i);
            C6921a.m21563c(4, "FeedAvatarView", sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder("AuthorUid is: ");
            sb3.append(this.f76169g.getAuthorUid());
            sb3.append(", AwemeId is :");
            sb3.append(this.f76169g.getAid());
            sb3.append(", FollowStatus is :");
            sb3.append(i);
            C6921a.m21563c(4, "FeedAvatarView", sb3.toString());
            if (this.f76169g.isDelete()) {
                this.mFollowView.setVisibility(4);
                this.mFollowContainerView.setVisibility(4);
                C6921a.m21563c(4, "FeedAvatarView", "aweme is delete!updateFollowView!");
                return;
            }
            this.mFollowView.clearAnimation();
            User author = this.f76169g.getAuthor();
            if (C6319n.m19594a(author.getUid(), C6861a.m21337f().getCurUserId()) || C6319n.m19594a(this.f76170h, "homepage_follow") || !this.f76169g.isCanPlay()) {
                if (!C6319n.m19594a(this.f76170h, "homepage_follow") || C6319n.m19594a(author.getUid(), C6861a.m21337f().getCurUserId()) || !this.f76169g.isCanPlay() || (!C6903bc.m21482a().mo84635e() && i != 0)) {
                    this.mFollowView.setVisibility(4);
                } else {
                    m94479b(i);
                }
                if (m94485c(author)) {
                    ((LayoutParams) this.mAvatarLiveView.getLayoutParams()).bottomMargin = (int) C9738o.m28708b(this.f76175m, 12.5f);
                } else {
                    ((LayoutParams) this.mAvatarView.getLayoutParams()).bottomMargin = (int) C9738o.m28708b(this.f76175m, 10.0f);
                }
            } else {
                if (i == 0) {
                    try {
                        if (mo74168f() || m94494p()) {
                            this.mFollowView.setImageDrawable(C0683b.m2903a(this.f76175m, (int) R.drawable.a3k));
                            AnimationImageView animationImageView = this.mFollowView;
                            if (!C25329c.m83222e(this.f76169g)) {
                                if (!this.f76169g.isDelete()) {
                                    i2 = 0;
                                    animationImageView.setVisibility(i2);
                                }
                            }
                            i2 = 8;
                            animationImageView.setVisibility(i2);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (!this.f75652a) {
                    if ((mo74168f() || m94494p()) && C6903bc.m21482a().mo84635e()) {
                        m94479b(i);
                    } else {
                        this.mFollowView.setVisibility(4);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m94480b(View view) {
        int i;
        if ((view == null || view.getVisibility() != 4) && !C25329c.m83215a(this.f76169g) && !mo74167d() && this.f76169g != null && !this.f76169g.isDelete()) {
            User author = this.f76169g.getAuthor();
            if (author != null) {
                if (author.getFollowStatus() != 0) {
                    if (C6903bc.m21482a().mo84635e()) {
                        C28507v.m93709a(this.f76169g, "head_icon");
                        m94484c(view);
                    }
                } else if (!TextUtils.equals(author.getUid(), C6861a.m21337f().getCurUserId())) {
                    if (this.f75654c != null && this.f75654c.mo64705a() && !C25329c.m83225h(this.f76169g)) {
                        C24671f.m80851a().mo64656a(view.getContext(), this.f76169g);
                    }
                    if (C25329c.m83227j(this.f76169g) || C25329c.m83225h(this.f76169g)) {
                        C24671f.m80851a().mo64659a(this.f76175m, this.f76169g, "plus_sign");
                    }
                    if (!C6900g.m21454b().mo16943d()) {
                        C10761a.m31399c(this.f76175m, (int) R.string.cjs).mo25750a();
                        return;
                    }
                    if (this.f76174l != null) {
                        C28318an anVar = new C28318an(12, this.f76169g);
                        anVar.f74634d = C22704b.f60414c;
                        this.f76174l.mo60134a("feed_internal_event", (Object) anVar);
                    }
                    if (C6861a.m21337f().isLogin()) {
                        C26682g.f70355a.mo68415a(author, 5);
                        this.mFollowView.setAnimation(f75651e);
                        this.mFollowView.mo7078b();
                        this.mFollowView.mo7076a((AnimatorListener) new AnimatorListener() {
                            public final void onAnimationCancel(Animator animator) {
                            }

                            public final void onAnimationRepeat(Animator animator) {
                            }

                            public final void onAnimationStart(Animator animator) {
                            }

                            public final void onAnimationEnd(Animator animator) {
                                FeedAvatarView.this.f75652a = false;
                            }
                        });
                        this.f75652a = true;
                    }
                    Integer num = (Integer) C21719b.m72643a().get(this.f76169g.getAid());
                    Aweme aweme = this.f76169g;
                    String str = "follow";
                    if (num == null) {
                        i = -1;
                    } else {
                        i = num.intValue();
                    }
                    C21718a.m72639a(aweme, str, i);
                }
            }
        }
    }

    /* renamed from: a */
    private void m94477a(boolean z) {
        String str;
        C42961az.m136380a(new C32858a());
        IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class, false);
        if (iIMService != null) {
            iIMService.hideLiveNotification();
        }
        if (!mo74167d() && !C32698a.m105818a(this.f76169g)) {
            if (this.f76169g == null || (this.f76169g.isCanPlay() && !this.f76169g.isDelete())) {
                if (this.f75654c != null) {
                    this.f75654c.mo64702a("photo");
                }
                if (!(this.f76169g == null || this.f76169g.getAuthor() == null)) {
                    m94483c(19);
                    User author = this.f76169g.getAuthor();
                    if (!m94485c(author) || !C41983b.m133444a()) {
                        ((C33276r) ((C33276r) ((C33276r) new C33276r().mo85312c(this.f76169g, this.f76173k).mo85310b(this.f76170h).mo85319i(FeedParamProvider.m94273a(this.f76175m).getPreviousPage()).mo85048a("click_head")).mo85282a(Boolean.valueOf(C28482e.m93609b(this.f76169g)))).mo85047a(this.f76175m)).mo85321k(this.f76169g.getAid()).mo85252e();
                        new C33275q().mo85309f(this.f76169g).mo85306b(this.f76169g.getAuthorUid()).mo85307c(this.f76170h).mo85252e();
                        C21718a.f58162a.mo57995a(this.f76169g, "enter_profile");
                        m94476a("");
                    } else if (!BusinessComponentServiceUtils.getLiveAllService().mo103112a()) {
                        if (C25072c.m82577c(this.f76169g) && !C28498o.m93669a(this.f76169g)) {
                            C28498o.m93659a(this.f76175m, this.f76169g);
                        } else if (C25329c.m83209K(this.f76169g)) {
                            C24671f.m80853c().mo64690b(this.f76175m, this.f76169g);
                        } else {
                            if (TextUtils.equals(this.f76170h, "homepage_hot")) {
                                C41989d.m133475a(this.f76175m, "homepage_hot", author.getRequestId(), author.getUid(), author.roomId, this.f76169g.getAid());
                                str = "homepage_hot";
                            } else if (TextUtils.equals(this.f76170h, "homepage_follow")) {
                                C41989d.m133475a(this.f76175m, "homepage_follow", author.getRequestId(), author.getUid(), author.roomId, this.f76169g.getAid());
                                str = "homepage_follow";
                            } else {
                                C41989d.m133475a(this.f76175m, this.f76170h, author.getRequestId(), author.getUid(), author.roomId, this.f76169g.getAid());
                                str = this.f76170h;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("live.intent.extra.ENTER_AWEME_ID", this.f76169g.getAid());
                            bundle.putString("live.intent.extra.REQUEST_ID", author.getRequestId());
                            bundle.putString("enter_method", "video_head");
                            if (C25329c.m83224g(this.f76169g)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("log_extra", this.f76169g.getAwemeRawAd().getLogExtra());
                                hashMap.put("value", this.f76169g.getAwemeRawAd().getCreativeId());
                                bundle.putSerializable("live_douplus_log_extra", hashMap);
                                bundle.putBoolean("enter_from_dou_plus", true);
                            }
                            C28676s.m94345a(this.f76175m, this.f76169g.getAuthor(), null, str, bundle);
                        }
                    }
                }
            } else if (this.f76169g.isImage()) {
                C10761a.m31399c(this.f76175m, (int) R.string.bsx).mo25750a();
            } else {
                C10761a.m31399c(this.f76175m, (int) R.string.fp_).mo25750a();
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m94472a(DialogInterface dialogInterface, int i) {
        C28507v.m93710a(false);
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    private void m94475a(SmartAvatarBorderView smartAvatarBorderView, boolean z) {
        String str;
        if (C25300bx.m83126a(this.f76169g, (SmartImageView) smartAvatarBorderView)) {
            if (z) {
                C24671f.m80862l().mo65863a(C25300bx.m83131d(this.f76169g));
            }
            return;
        }
        StringBuilder sb = new StringBuilder("FeedAvatarView_");
        if (this.f76169g == null) {
            str = "no_aid";
        } else {
            str = this.f76169g.getAid();
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (this.f76169g == null || this.f76169g.getAuthor() == null || this.f76169g.getAuthor().getAvatarThumb() == null || C6307b.m19566a((Collection<T>) this.f76169g.getAuthor().getAvatarThumb().getUrlList())) {
            C12133n.m35298a((int) R.drawable.a_j).mo29855c(true).mo29845a(sb2).mo29844a((C12128i) smartAvatarBorderView).mo29848a();
            return;
        }
        if (smartAvatarBorderView == this.mAvatarView && C28345b.m93124a()) {
            StringBuilder sb3 = new StringBuilder("loadAvatarViews:");
            sb3.append(this.f76169g.getAuthor().getAvatarThumb().getUrlList());
            C6921a.m21552a(4, "FeedAvatarView", sb3.toString());
        }
        smartAvatarBorderView.mo61032a(this.f76169g.getAuthor().getAvatarThumb(), C43012cg.m136513a(BaseNotice.HASHTAG), this.avatarSize, this.avatarSize, sb2, true);
    }

    /* renamed from: a */
    private static void m94478a(boolean z, long j, long j2) {
        String str;
        String str2 = "livesdk_live_status_change";
        C22984d a = C22984d.m75611a().mo59973a("action_type", "click").mo59973a("anchor_id", String.valueOf(j2)).mo59973a("room_id", String.valueOf(j)).mo59973a("enter_from_merge", "homepage_hot").mo59973a("enter_method", "video_head");
        String str3 = "status";
        if (z) {
            str = "live_on";
        } else {
            str = "live_off";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
    }
}
