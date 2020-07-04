package com.p280ss.android.ugc.aweme.flowfeed.p1257vh;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.facebook.drawee.p694b.C13364a.C13365a;
import com.p280ss.android.ugc.aweme.C21098ab;
import com.p280ss.android.ugc.aweme.C21780t;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24571k;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.C28227b;
import com.p280ss.android.ugc.aweme.feed.helper.C28418f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28506u;
import com.p280ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29370e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21746d;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21749g;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21751b;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21753d;
import com.p280ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.main.C32950d;
import com.p280ss.android.ugc.aweme.main.experiment.EarPhoneUnplugExperiment;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33253ax;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p280ss.android.ugc.aweme.newfollow.util.C34199d;
import com.p280ss.android.ugc.aweme.newfollow.util.C34200e;
import com.p280ss.android.ugc.aweme.newfollow.util.C34204g;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.poi.event.C35078a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoPlayerProgressbar;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40726a.C40727a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1608a.C40712b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p280ss.android.ugc.aweme.sticker.C41849d;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41842b;
import com.p280ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.vh.FollowVideoViewHolder */
public class FollowVideoViewHolder extends BaseFollowViewHolder implements C34976f {

    /* renamed from: a */
    private RotateAnimation f77574a;

    /* renamed from: aA */
    protected KeepSurfaceTextureView f77575aA;

    /* renamed from: aB */
    public ImageView f77576aB;

    /* renamed from: aC */
    public TextView f77577aC;

    /* renamed from: aD */
    MarqueeView f77578aD;

    /* renamed from: aE */
    protected ViewGroup f77579aE;

    /* renamed from: aF */
    VideoPlayerProgressbar f77580aF;

    /* renamed from: aG */
    ImageView f77581aG;

    /* renamed from: aH */
    protected ViewGroup f77582aH;

    /* renamed from: aI */
    ImageView f77583aI;

    /* renamed from: aJ */
    ImageView f77584aJ;

    /* renamed from: aK */
    ViewStub f77585aK;

    /* renamed from: aL */
    ViewGroup f77586aL;

    /* renamed from: aM */
    ViewGroup f77587aM;

    /* renamed from: aN */
    ViewStub f77588aN;

    /* renamed from: aO */
    View f77589aO;

    /* renamed from: aP */
    TextView f77590aP;

    /* renamed from: aQ */
    TextView f77591aQ;

    /* renamed from: aR */
    public C34199d f77592aR;

    /* renamed from: aS */
    protected C43222g f77593aS;

    /* renamed from: aT */
    public C21746d f77594aT;

    /* renamed from: aU */
    public boolean f77595aU;

    /* renamed from: aV */
    protected boolean f77596aV;

    /* renamed from: az */
    protected FrameLayout f77597az;

    /* renamed from: b */
    private C28228a f77598b;

    /* renamed from: c */
    private boolean f77599c;

    /* renamed from: d */
    private boolean f77600d;

    /* renamed from: e */
    private AbsInteractStickerWidget f77601e;

    /* renamed from: f */
    private C21098ab f77602f;

    /* renamed from: a */
    public void mo75308a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: aj */
    public void mo75312aj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ak */
    public void mo75313ak() {
    }

    /* renamed from: al */
    public boolean mo75314al() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public String mo75315am() {
        return null;
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo75267c(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo68523h() {
        return "from_follow_page";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo68524i() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo75289q() {
        return this.f77600d;
    }

    /* renamed from: a */
    public void mo63044a(C44920d dVar) {
        if (!this.f77516ae && mo86997j(dVar.f115529a)) {
            m96777f(0);
            mo75238N();
            this.f77598b.f74354a = 2;
            C28227b.m92771a(this.f77512aa, dVar.f115529a, this.f77546j != null ? this.f77546j.getAwemeType() : 0);
            C42961az.m136380a(new C21753d(this.f77546j));
            m96760a(new C39330h(0, dVar.f115531c));
        }
    }

    /* renamed from: a */
    public void mo63046a(String str) {
        if (mo86997j(str)) {
            this.f77595aU = false;
            mo75237M();
            m96777f(0);
            mo75238N();
            this.f77598b.f74354a = 2;
            C39330h hVar = new C39330h(11, this.f77592aR.mo86937c(), this.f77592aR.mo86938d());
            m96760a(hVar);
            m96772aw();
            m96773ax();
        }
    }

    /* renamed from: a */
    public void mo63045a(C44921e eVar) {
        String str = eVar.f115532a;
        if (mo86997j(str)) {
            C29363d.m96451a().mo75043a(str);
            mo75237M();
            m96760a(new C39330h(5));
            m96772aw();
            m96773ax();
            if (TextUtils.equals(mo75290r(), "homepage_follow") && (mo75261ab() instanceof FragmentActivity)) {
                FollowPageFirstFrameViewModel.m136066a((FragmentActivity) mo75261ab()).mo104573c();
            }
            C32950d.m106523a("video_play");
        }
    }

    /* renamed from: Z */
    public void mo75250Z() {
        super.mo75250Z();
        mo68519c(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo75293u() {
        if (this.f77522ak) {
            mo75236L();
        }
    }

    /* renamed from: as */
    private boolean m96768as() {
        if (C6399b.m19944t()) {
            return m96769at();
        }
        return m96770au();
    }

    /* renamed from: at */
    private boolean m96769at() {
        this.f77592aR.f89179a = m96762aB();
        this.f77592aR.mo86936b();
        return true;
    }

    /* renamed from: au */
    private boolean m96770au() {
        this.f77592aR.f89179a = m96762aB();
        this.f77592aR.mo86936b();
        return true;
    }

    /* renamed from: ax */
    private void m96773ax() {
        C29370e Q = mo75241Q();
        if (Q != null) {
            Q.mo75090a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo75238N() {
        super.mo75238N();
        this.f77518ag.postDelayed(new Runnable() {
            public final void run() {
                if (FollowVideoViewHolder.this.f77578aD != null && FollowVideoViewHolder.this.f77521aj) {
                    FollowVideoViewHolder.this.f77578aD.mo74411a();
                }
            }
        }, 100);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo75239O() {
        super.mo75239O();
        if (this.f77578aD != null) {
            this.f77578aD.mo74413c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final void mo75240P() {
        super.mo75240P();
        if (this.f77578aD != null) {
            this.f77578aD.mo74412b();
        }
    }

    /* renamed from: aB */
    private C43222g m96762aB() {
        if (this.f77593aS == null) {
            C29370e Q = mo75241Q();
            if (Q == null || Q.f77402g == null) {
                this.f77593aS = C34200e.m110432a().mo86947b();
            } else {
                this.f77593aS = Q.f77402g;
            }
        }
        return this.f77593aS;
    }

    /* renamed from: aC */
    private void m96763aC() {
        Activity g = C6405d.m19984g();
        if (g instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) g;
            HomePageDataViewModel.m98904a(fragmentActivity).f79568g.observe(fragmentActivity, new C29431t(this));
        }
    }

    /* renamed from: ao */
    private void mo86957ao() {
        new C40727a().mo100939a(this.f77546j).mo100940a(this.f77601e.mo101065d()).mo100948a().mo100936d();
    }

    /* renamed from: ap */
    private void mo86958ap() {
        LayoutParams layoutParams = this.f77582aH.getLayoutParams();
        layoutParams.width = (int) (((float) this.f77597az.getLayoutParams().width) * 0.6f);
        this.f77582aH.setLayoutParams(layoutParams);
    }

    /* renamed from: aq */
    private void mo86959aq() {
        if (this.f77589aO == null) {
            this.f77588aN.setLayoutResource(R.layout.b4v);
            this.f77589aO = this.f77588aN.inflate();
        }
    }

    /* renamed from: av */
    private void m96771av() {
        this.f77518ag.removeMessages(16);
        Message message = new Message();
        message.what = 16;
        message.obj = this.f77546j;
        this.f77518ag.sendMessage(message);
    }

    /* renamed from: ay */
    private void m96774ay() {
        C29370e Q = mo75241Q();
        if (Q != null && this.f77593aS != null) {
            Q.mo75097a(this.f77599c, mo75290r(), this.f77525an, this.f77527ap);
        }
    }

    /* renamed from: az */
    private void m96775az() {
        if (this.f77598b.f74354a != 3) {
            mo75240P();
            m96777f(1);
            this.f77598b.f74354a = 3;
            m96760a(new C39330h(4));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo75233I() {
        super.mo75233I();
        if (this.f77579aE != null) {
            this.f77579aE.setOnClickListener(new C29429r(this));
        }
        if (this.f77577aC != null) {
            this.f77577aC.setOnClickListener(new C29430s(this));
        }
    }

    /* renamed from: R */
    public void mo75242R() {
        super.mo75242R();
        if (C6903bc.m21489h().mo85870a()) {
            C28506u.m93698a(this.f77546j, this.f77510Z);
        }
    }

    /* renamed from: T */
    public void mo75244T() {
        super.mo75244T();
        mo75311ai();
        this.f77595aU = false;
        if (this.f77546j != null) {
            C29370e Q = mo75241Q();
            if (Q != null) {
                Q.f77397b = 0;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public void mo75260aa() {
        super.mo75260aa();
        if (!C27326a.m89578a(this.f77597az)) {
            mo68520e();
            mo75313ak();
        }
    }

    /* renamed from: ae */
    public final void mo75306ae() {
        new C40727a().mo100939a(this.f77546j).mo100940a(this.f77601e.mo101065d()).mo100948a().mo100934b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public void mo75307af() {
        C44962h a = C44962h.m141885a(this.f77575aA);
        this.f77592aR = new C34199d(this.f77575aA, this, null);
        this.f77592aR.f89181c = true;
        a.mo107455a((C44963i) new C44963i() {
            public final void aA_() {
                if (FollowVideoViewHolder.this.f77522ak) {
                    FollowVideoViewHolder.this.mo75236L();
                }
                C42961az.m136383d(FollowVideoViewHolder.this);
            }

            /* renamed from: b */
            public final void mo63039b(int i, int i2) {
                if (FollowVideoViewHolder.this.f77546j.getVideo() != null) {
                    C34204g.m110444a(i, i2, FollowVideoViewHolder.this.f77575aA, ((float) FollowVideoViewHolder.this.f77546j.getVideo().getHeight()) / ((float) FollowVideoViewHolder.this.f77546j.getVideo().getWidth()));
                    FollowVideoViewHolder.this.mo75309ag();
                }
            }

            /* renamed from: a */
            public final void mo63037a(int i, int i2) {
                FollowVideoViewHolder.this.f77516ae = false;
                FollowVideoViewHolder.this.f77595aU = false;
                if (FollowVideoViewHolder.this.mo75286o()) {
                    FollowVideoViewHolder.this.f77517af.mo75115a(FollowVideoViewHolder.this.f77531at);
                    FollowVideoViewHolder.this.f77517af.mo75119d();
                }
                if (FollowVideoViewHolder.this.f77546j.getVideo() != null) {
                    C34204g.m110444a(i, i2, FollowVideoViewHolder.this.f77575aA, ((float) FollowVideoViewHolder.this.f77546j.getVideo().getHeight()) / ((float) FollowVideoViewHolder.this.f77546j.getVideo().getWidth()));
                    FollowVideoViewHolder.this.mo75309ag();
                }
                C42961az.m136382c(FollowVideoViewHolder.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: ah */
    public final void mo75310ah() {
        this.f77518ag.removeMessages(16);
        Message message = new Message();
        message.what = 16;
        message.obj = this.f77546j;
        this.f77518ag.sendMessageDelayed(message, 150);
    }

    /* renamed from: ai */
    public void mo75311ai() {
        if (this.f77546j != null) {
            this.f77518ag.removeMessages(16);
            if (this.f77522ak || this.f77520ai.mo58072a()) {
                this.f77592aR.mo86939e();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: an */
    public final /* synthetic */ boolean mo75316an() {
        this.f77550n.mo58087b(this.f77559w, this.itemView, this.f77546j, this.f77546j.getAuthor());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo68522g() {
        if (!(mo75261ab() instanceof FragmentActivity)) {
            return false;
        }
        return FollowEnterDetailViewModel.m96850a(mo75290r(), (FragmentActivity) mo75261ab()).f77626a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo75288p() {
        this.f77601e = C29363d.m96451a().mo75033a();
        this.f77529ar.mo60151a((int) R.id.b2b, (Widget) this.f77601e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo75236L() {
        super.mo75236L();
        if (this.f77546j.getVideo() != null) {
            C23323e.m76506a(this.f77551o, this.f77546j.getVideo().getOriginCover(), this.f77551o.getWidth(), this.f77551o.getHeight());
        }
    }

    /* renamed from: X */
    public void mo75248X() {
        if (this.f77596aV) {
            this.f77596aV = false;
            return;
        }
        if (!mo68522g()) {
            super.mo75248X();
        }
        if (mo75247W()) {
            mo75239O();
            return;
        }
        this.f77595aU = true;
        mo75311ai();
        C43305j.m137386g().mo105028b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo75292t() {
        if (this.f77546j.getVideo() != null) {
            mo68503a((View) this.f77597az, this.f77546j.getVideo().getWidth(), this.f77546j.getVideo().getHeight());
            m96759a(this.f77546j, this.f77597az.getLayoutParams().width, this.f77597az.getLayoutParams().height, 0, 0);
        }
    }

    /* renamed from: ar */
    private void mo86986ar() {
        if (this.f77591aQ != null) {
            this.f77591aQ.setVisibility(8);
        }
        if (C25329c.m83221d(this.f77546j) && !TextUtils.isEmpty(this.f77546j.getAwemeRawAd().getTopTitle())) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.dcu);
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.aa3);
                mo75254a(viewStub.inflate(), 4.0f, 13.0f);
            }
            this.f77591aQ = (TextView) this.itemView.findViewById(R.id.e3y);
            if (this.f77591aQ != null) {
                this.f77591aQ.setText(this.f77546j.getAwemeRawAd().getTopTitle());
                this.f77591aQ.setVisibility(0);
            }
        }
    }

    /* renamed from: aw */
    private void m96772aw() {
        C29370e Q = mo75241Q();
        if (Q != null) {
            Q.mo75093a(mo75290r(), this.f77525an, this.f77527ap, this.f77599c, this.f77514ac);
            if (this.itemView.getContext() instanceof Activity) {
                Intent intent = ((Activity) this.itemView.getContext()).getIntent();
                if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                    String stringExtra = intent.getStringExtra("rule_id");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        new C33253ax("video_play_from_push").mo85189v(stringExtra).mo85252e();
                    }
                }
            }
        }
    }

    /* renamed from: ag */
    public final void mo75309ag() {
        if (this.f77575aA != null) {
            float[] fArr = new float[9];
            Matrix matrix = new Matrix();
            this.f77575aA.getTransform(matrix);
            matrix.getValues(fArr);
            m96759a(this.f77546j, (int) (((float) this.f77597az.getLayoutParams().width) * fArr[0]), (int) (((float) this.f77597az.getLayoutParams().height) * fArr[4]), (int) fArr[2], (int) fArr[5]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo68504d() {
        if (VERSION.SDK_INT >= 21) {
            this.f77597az.setOutlineProvider(new C43070ds(this.f77597az.getResources().getDimensionPixelOffset(R.dimen.hf)));
            this.f77597az.setClipToOutline(true);
        }
    }

    /* renamed from: aA */
    private void m96761aA() {
        if (this.f77592aR.f89179a == null) {
            this.f77592aR.f89179a = m96762aB();
        }
        if (!C29432u.m96841a(C6399b.m19921a())) {
            C10761a.m31399c(mo75261ab(), (int) R.string.cjs).mo25750a();
        } else if (!this.f77516ae && this.f77546j != null && this.f77546j.getVideo() != null) {
            if (this.f77598b.f74354a == 2 || this.f77598b.f74354a == 1) {
                C6903bc.m21486e().mo75368a(this.f77546j, mo75290r(), this.f77599c);
                mo75311ai();
                if (mo75241Q() != null) {
                    mo75241Q().f77397b = 3;
                }
            } else if (this.f77598b.f74354a == 3 || this.f77598b.f74354a == 0) {
                if (this.f77546j.getVideo().getProperPlayAddr() != null) {
                    C6903bc.m21486e().mo75371b(this.f77546j);
                    this.f77546j.getVideo().setRationAndSourceId(this.f77546j.getAid());
                    this.f77592aR.f89179a = m96762aB();
                    this.f77592aR.mo86941g();
                    if (this.f77594aT != null) {
                        this.f77594aT.mo58035a(this.f77546j);
                    }
                    if (mo75241Q() != null) {
                        mo75241Q().f77397b = 4;
                    }
                } else {
                    return;
                }
            }
            mo75313ak();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo68521f() {
        if (this.f77546j != null) {
            C6903bc.m21486e().mo75372b(this.f77546j, mo75290r());
            C28418f.m93413a().f74931a = m96762aB();
            C29370e Q = mo75241Q();
            C28418f.m93413a().f74933c = Q.f77401f;
            C28418f.m93413a().f74938h = true;
            if (Q != null) {
                Q.f77402g = null;
                this.f77592aR.f89179a = null;
                this.f77593aS = null;
            }
            C28503s.m93679a(this.f77550n.mo58090c(this.f77546j));
            this.f77596aV = true;
            mo68519c(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68499a() {
        int i;
        Resources resources;
        MarqueeView marqueeView;
        Object[] objArr;
        String str;
        super.mo68499a();
        C29428q qVar = new C29428q(this);
        if (this.f77546j.getAuthor() != null) {
            C29363d.m96451a().mo75041a(this.f77559w, this.f77546j.getAuthor().getStarBillboardRank(), 4, mo75290r(), (C13365a) qVar);
        }
        if (this.f77546j.getMusic() == null || !this.f77546j.getMusic().isOriginMusic()) {
            this.f77577aC.setVisibility(8);
            this.f77576aB.setImageResource(R.drawable.a8p);
        } else {
            this.f77577aC.setVisibility(0);
            this.f77576aB.setImageResource(R.drawable.auw);
        }
        Music music = this.f77546j.getMusic();
        if (music != null) {
            marqueeView = this.f77578aD;
            resources = this.itemView.getResources();
            i = R.string.ci0;
            objArr = new Object[2];
            objArr[0] = music.getMusicName();
            str = music.getAuthorName();
        } else {
            marqueeView = this.f77578aD;
            resources = this.itemView.getResources();
            i = R.string.chz;
            objArr = new Object[2];
            objArr[0] = this.itemView.getResources().getString(R.string.chc);
            if (this.f77546j.getAuthor() == null) {
                str = "";
            } else {
                str = this.f77546j.getAuthor().getNickname();
            }
        }
        objArr[1] = str;
        marqueeView.setText(resources.getString(i, objArr));
        this.f77580aF.setVisibility(8);
        mo86986ar();
        C6903bc.m21489h().mo85868a(mo75261ab(), this.f77546j, this.f77587aM, this.f77590aP, mo75290r(), mo68524i());
        if (this.f77546j.isHotListAweme() && this.f77588aN != null) {
            mo86959aq();
            C29363d.m96451a().mo75044b(this.f77589aO, this.f77510Z, true, this.f77546j);
        } else if (!this.f77546j.isHotSearchAweme() || this.f77588aN == null) {
            if (this.f77589aO != null) {
                this.f77589aO.setVisibility(8);
            }
        } else {
            mo86959aq();
            C29363d.m96451a().mo75039a(this.f77589aO, this.f77510Z, true, this.f77546j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo68520e() {
        float f;
        if (this.f77546j != null) {
            this.f77599c = true;
            C29370e Q = mo75241Q();
            if (Q != null) {
                Q.f77398c.mo104682a(16777216);
                Q.f77397b = this.f77598b.f74354a;
                Q.f77399d = this.f77582aH.getLayoutParams().height;
                Q.f77400e = this.f77582aH.getLayoutParams().width;
                Q.f77402g = m96762aB();
                if (this.f77592aR.f89179a == null) {
                    this.f77592aR.f89179a = m96762aB();
                }
                int[] iArr = new int[2];
                this.f77575aA.getLocationOnScreen(iArr);
                if (this.f77546j == null || this.f77546j.getVideo() == null) {
                    f = ((float) this.f77575aA.getHeight()) / ((float) this.f77575aA.getWidth());
                } else {
                    f = ((float) this.f77546j.getVideo().getHeight()) / ((float) this.f77546j.getVideo().getWidth());
                }
                IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], this.f77575aA.getHeight(), this.f77575aA.getWidth(), (float) this.f77551o.getResources().getDimensionPixelOffset(R.dimen.hf), f);
                int i = this.f77598b.f74354a;
                if (i != 0) {
                    switch (i) {
                        case 2:
                            C29363d.m96451a().mo75034a(mo75261ab(), iViewInfo, this.f77546j, 4, mo75290r(), Q.f77403h, false, true);
                            return;
                        case 3:
                            break;
                        default:
                            C29363d.m96451a().mo75034a(mo75261ab(), iViewInfo, this.f77546j, 2, mo75290r(), Q.f77403h, false, true);
                            return;
                    }
                }
                C29363d.m96451a().mo75034a(mo75261ab(), iViewInfo, this.f77546j, 3, mo75290r(), Q.f77403h, false, true);
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final /* synthetic */ void mo75323r(View view) {
        m96761aA();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final /* synthetic */ void mo75324s(View view) {
        m96761aA();
    }

    /* renamed from: a */
    private void m96760a(C39330h hVar) {
        this.f77580aF.mo101727a(hVar, (int) hVar.f102158a);
    }

    @C7709l
    public void onPauseFollowVideoEvent(C24571k kVar) {
        if (this.f77598b.f74354a != 3) {
            mo75311ai();
        }
    }

    /* renamed from: j */
    private boolean mo86997j(String str) {
        if (this.f77546j == null || !TextUtils.equals(str, this.f77546j.getAid())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo75251a(int i) {
        super.mo75251a(i);
        switch (i) {
            case 0:
            case 1:
                m96771av();
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void mo75264b(int i) {
        super.mo75264b(i);
        switch (i) {
            case 0:
            case 1:
                mo75310ah();
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        if (mo86997j(str)) {
            m96777f(2);
            this.f77598b.f74354a = 1;
            m96760a(new C39330h(2));
        }
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        if (mo86997j(str)) {
            m96775az();
            if (!mo75247W()) {
                m96774ay();
            }
        }
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        int i;
        m96760a(new C39330h(8, z, 0));
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        m96777f(i);
    }

    public void handleMsg(Message message) {
        super.handleMsg(message);
        if (message.what == 16) {
            mo75317d((Aweme) message.obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final /* synthetic */ void mo75322q(View view) {
        if (this.f77550n != null && (this.f77550n instanceof C21749g)) {
            ((C21749g) this.f77550n).mo58091c(view, this.itemView, this.f77546j);
        }
    }

    /* renamed from: d */
    private void mo86996d(boolean z) {
        if (z) {
            if (this.f77581aG.getVisibility() != 0) {
                this.f77581aG.startAnimation(this.f77574a);
                this.f77581aG.setVisibility(0);
            }
        } else if (this.f77581aG.getVisibility() != 8) {
            this.f77581aG.clearAnimation();
            this.f77581aG.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        if (mo86997j(cVar.f115522a)) {
            mo75240P();
            m96760a(new C39330h(1));
            m96777f(1);
        }
    }

    /* renamed from: b */
    public void mo63047b(String str) {
        if (mo86997j(str)) {
            m96760a(new C39330h(7));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo68519c(boolean z) {
        if (mo75261ab() instanceof FragmentActivity) {
            FollowEnterDetailViewModel.m96850a(mo75290r(), (FragmentActivity) mo75261ab()).f77626a = z;
        }
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
        if (mo86997j(str)) {
            m96760a(new C39330h(6));
            mo68527a(0);
            C6903bc.m21486e().mo75365a(this.f77546j, this.f77525an, this.f77527ap, mo75290r());
            C42961az.m136380a(new C35078a(C33230ac.m107223e(this.f77546j)));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo75318i(String str) {
        if ("on_ear_phone_unplug".equals(str)) {
            if (m96762aB().mo104916o()) {
                mo75311ai();
                m96777f(1);
                C32950d.m106524a("play", mo75290r(), this.f77546j);
                return;
            }
            C32950d.m106524a("pause", mo75290r(), this.f77546j);
        }
    }

    @C7709l
    public void onFollowFeedDetailEvent(C21751b bVar) {
        if (mo75261ab() != null && bVar.f58260b != null && bVar.f58260b.getAid().equals(this.f77546j.getAid())) {
            switch (bVar.f58259a) {
                case 1:
                    m96777f(bVar.f58261c);
                    return;
                case 2:
                    mo68527a(0);
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo75321p(View view) {
        if (this.f77550n != null && (this.f77550n instanceof C21749g)) {
            ((C21749g) this.f77550n).mo58092d(view, this.itemView, this.f77546j);
        }
    }

    /* renamed from: f */
    private void m96777f(int i) {
        switch (i) {
            case 0:
                this.f77583aI.setVisibility(8);
                mo86996d(false);
                this.f77584aJ.setVisibility(0);
                return;
            case 1:
                mo86996d(false);
                this.f77584aJ.setVisibility(8);
                this.f77583aI.setVisibility(0);
                return;
            case 2:
                this.f77583aI.setVisibility(8);
                this.f77584aJ.setVisibility(8);
                mo86996d(true);
                break;
            case 3:
                this.f77583aI.setVisibility(8);
                mo86996d(false);
                this.f77584aJ.setVisibility(8);
                return;
        }
    }

    public void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        this.f77518ag.removeMessages(16);
        mo75311ai();
        mo75239O();
        this.f77580aF.setVisibility(8);
        if (!(this.f77593aS == null || this.f77546j == null)) {
            C43305j.m137386g().mo105087b(this.f77546j);
        }
        mo75312aj();
        if (this.f77522ak) {
            mo75236L();
            if (this.f77593aS != null) {
                C34200e.m110432a().mo86946a(this.f77593aS);
                this.f77592aR.mo86931a();
                this.f77592aR.f89179a = null;
                this.f77593aS = null;
            }
        }
        mo75291s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68500a(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        viewStub.setLayoutResource(R.layout.a6t);
        mo75253a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        viewStub2.setLayoutResource(R.layout.a6s);
        mo75253a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        viewStub3.setLayoutResource(R.layout.a6c);
        mo75253a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dcl);
        viewStub4.setLayoutResource(R.layout.a6m);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc6);
        viewStub5.setLayoutResource(R.layout.a6d);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub6.setLayoutResource(R.layout.a6f);
        viewStub6.inflate();
        ViewStub viewStub7 = (ViewStub) view.findViewById(R.id.dc8);
        viewStub7.setLayoutResource(R.layout.a6p);
        mo75253a(viewStub7.inflate(), 12.0f);
    }

    /* renamed from: d */
    public void mo75317d(Aweme aweme) {
        if (!C29432u.m96841a(C6399b.m19921a())) {
            m96777f(3);
            C10761a.m31399c(mo75261ab(), (int) R.string.cjs).mo25750a();
        } else if (this.f77521aj && !this.f77516ae && mo75286o() && this.f77520ai.mo58073b() && aweme != null && this.f77546j != null && TextUtils.equals(this.f77546j.getAid(), aweme.getAid())) {
            C29370e Q = mo75241Q();
            if (Q == null) {
                this.f77598b.f74354a = 4;
            } else if (!Q.f77398c.mo104684c(16777216)) {
                if (Q.f77397b == 3 && !C28418f.m93413a().f74935e) {
                    if (C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false)) {
                        m96768as();
                        mo75311ai();
                    }
                    m96777f(1);
                    this.f77598b.f74354a = 3;
                    C39330h hVar = new C39330h(12, this.f77592aR.mo86937c(), this.f77592aR.mo86938d());
                    m96760a(hVar);
                    return;
                } else if (C28418f.m93413a().f74935e) {
                    C28418f.m93413a().f74935e = false;
                }
            } else {
                return;
            }
            boolean as = m96768as();
            if (this.f77594aT != null && as) {
                this.f77594aT.mo58035a(this.f77546j);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo75259a(FollowFeedLayout followFeedLayout) {
        super.mo75259a(followFeedLayout);
        this.f77597az = (FrameLayout) followFeedLayout.findViewById(R.id.bkm);
        this.f77575aA = (KeepSurfaceTextureView) followFeedLayout.findViewById(R.id.dij);
        this.f77576aB = (ImageView) followFeedLayout.findViewById(R.id.c1e);
        this.f77577aC = (TextView) followFeedLayout.findViewById(R.id.c1l);
        this.f77578aD = (MarqueeView) followFeedLayout.findViewById(R.id.c24);
        this.f77579aE = (ViewGroup) followFeedLayout.findViewById(R.id.bih);
        this.f77580aF = (VideoPlayerProgressbar) followFeedLayout.findViewById(R.id.eb_);
        this.f77581aG = (ImageView) followFeedLayout.findViewById(R.id.b_w);
        this.f77582aH = (ViewGroup) followFeedLayout.findViewById(R.id.big);
        this.f77583aI = (ImageView) followFeedLayout.findViewById(R.id.bb4);
        this.f77584aJ = (ImageView) followFeedLayout.findViewById(R.id.bau);
        this.f77585aK = (ViewStub) followFeedLayout.findViewById(R.id.dc3);
        this.f77586aL = (ViewGroup) followFeedLayout.findViewById(R.id.b2b);
        this.f77587aM = (ViewGroup) followFeedLayout.findViewById(R.id.bz6);
        this.f77588aN = (ViewStub) followFeedLayout.findViewById(R.id.dca);
        this.f77590aP = (TextView) followFeedLayout.findViewById(R.id.bz2);
        if (this.f77583aI != null) {
            this.f77583aI.setOnClickListener(new C29426o(this));
        }
        if (this.f77584aJ != null) {
            this.f77584aJ.setOnClickListener(new C29427p(this));
        }
    }

    public FollowVideoViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        this(followFeedLayout, bVar, jVar, aVar, false);
    }

    /* renamed from: a */
    public void mo68518a(Aweme aweme, List<Comment> list, List<User> list2, C21747e eVar) {
        super.mo68518a(aweme, list, list2, eVar);
        this.f77592aR.mo86934a(aweme);
        this.f77592aR.f89180b = mo75290r();
        this.f77598b.f74354a = 0;
        this.f77599c = false;
        mo86958ap();
        mo86957ao();
        mo75306ae();
        if (this.f77602f == null) {
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.amr);
            if (frameLayout != null) {
                this.f77602f = C21780t.m72808a(false).mo57895b(mo75261ab());
                if (this.f77602f != null) {
                    frameLayout.removeAllViews();
                    frameLayout.addView(this.f77602f.mo56936a());
                }
            }
        }
        if (this.f77602f != null && this.f77546j != null) {
            this.f77546j.getUploadMiscInfoStruct();
            this.f77546j.getAid();
        }
    }

    public FollowVideoViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar, boolean z) {
        super(followFeedLayout, bVar, jVar, aVar);
        this.f77598b = new C28228a();
        mo75307af();
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f77574a = rotateAnimation;
        this.f77574a.setRepeatCount(-1);
        this.f77574a.setInterpolator(new LinearInterpolator());
        this.f77574a.setDuration(1000);
        this.f77600d = z;
        if (this.f77600d) {
            this.f77502R.setDisplayType(C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8));
        }
        if (EarPhoneUnplugExperiment.shouldPausePlayVideo()) {
            m96763aC();
        }
    }

    /* renamed from: a */
    private void m96759a(Aweme aweme, int i, int i2, int i3, int i4) {
        if (aweme != null) {
            C41849d dVar = new C41849d();
            dVar.mo102613b(this.f77546j.getAuthorUid()).mo102612a(mo75290r()).mo102614c(this.f77546j.getAid()).mo102615d(C28199ae.m92689a().mo71791a(this.f77546j.getRequestId()));
            new C40727a().mo100939a(aweme).mo100942a((C41842b) new C40712b(i, i2, i3, i4)).mo100944a(dVar).mo100947a(false).mo100940a(this.f77601e.mo101065d()).mo100948a().mo100931a();
        }
    }
}
