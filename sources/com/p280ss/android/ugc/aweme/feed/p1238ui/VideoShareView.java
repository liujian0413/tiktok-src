package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.drawable.Drawable;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28205ai;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.experiment.InterctionShareButtonStyleExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.InterctionShareButtonWhatsappStyleExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.ShareButtonStyleExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.ShareGuideLimitExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.ShareIconInverseStrategyExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.ShareIconVariantExperiment;
import com.p280ss.android.ugc.aweme.feed.guide.C28405n;
import com.p280ss.android.ugc.aweme.feed.helper.C28429p;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28493l;
import com.p280ss.android.ugc.aweme.feed.service.C28677a;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.festival.p311a.C29125d;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoShareView */
public class VideoShareView extends C28894e implements C0053p<C23083a>, C28343z<C28318an>, C28519d {

    /* renamed from: t */
    private static SharedPreferences f75848t;

    /* renamed from: a */
    boolean f75849a;

    /* renamed from: b */
    boolean f75850b;

    /* renamed from: c */
    private boolean f75851c;

    /* renamed from: d */
    private boolean f75852d;

    /* renamed from: e */
    private String f75853e;

    /* renamed from: f */
    private long f75854f;
    View mShareContainerView;
    TextView mShareCount;

    /* renamed from: r */
    private boolean f75855r;

    /* renamed from: s */
    private int f75856s;
    RemoteImageView shareIv;

    /* renamed from: u */
    private String f75857u;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64929a(Object obj) {
    }

    /* renamed from: A */
    private void m94678A() {
        if (this.f75849a) {
            m94681D();
        }
    }

    /* renamed from: a */
    public final void mo72018a() {
        C42961az.m136383d(this);
    }

    /* renamed from: B */
    private static int m94679B() {
        return C6384b.m19835a().mo15287a(ShareIconInverseStrategyExperiment.class, true, "share_icon_inverse_strategy", C6384b.m19835a().mo15295d().share_icon_inverse_strategy, 0);
    }

    /* renamed from: E */
    private void m94682E() {
        if (this.mShareContainerView != null) {
            this.mShareContainerView.setScaleX(1.0f);
            this.mShareContainerView.setScaleY(1.0f);
        }
    }

    /* renamed from: q */
    private void m94695q() {
        if (this.f76178p == null || !C28429p.m93441a((Activity) this.f76178p.getActivity())) {
            m94696r();
        } else {
            this.shareIv.setImageResource(R.drawable.anl);
        }
    }

    /* renamed from: w */
    private static SharedPreferences m94701w() {
        if (f75848t == null) {
            f75848t = C7285c.m22838a(C6399b.m19921a(), "sp_video_digg_record", 0);
        }
        return f75848t;
    }

    /* renamed from: C */
    private static int m94680C() {
        if (C43122ff.m136767b()) {
            return 0;
        }
        return C6384b.m19835a().mo15287a(ShareGuideLimitExperiment.class, true, "share_guide_daily_limit", C6384b.m19835a().mo15295d().share_guide_daily_limit, 0);
    }

    /* renamed from: F */
    private void m94683F() {
        if (this.shareIv != null) {
            this.shareIv.setImageResource(R.drawable.a7c);
        }
        if (this.mShareContainerView != null) {
            this.mShareContainerView.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).withEndAction(new C28884cl(this)).start();
        }
    }

    /* renamed from: H */
    private void m94685H() {
        if (this.mShareContainerView != null && !this.f75850b) {
            this.f75850b = true;
            this.mShareContainerView.animate().scaleX(1.05f).scaleY(1.05f).setDuration(150).withEndAction(new Runnable() {
                public final void run() {
                    VideoShareView.this.mShareContainerView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(150).withEndAction(new Runnable() {
                        public final void run() {
                            ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.05f, 0.9f, 1.05f, 1, 0.5f, 1, 0.5f);
                            scaleAnimation.setDuration(600);
                            scaleAnimation.setRepeatMode(2);
                            scaleAnimation.setRepeatCount(-1);
                            VideoShareView.this.mShareContainerView.startAnimation(scaleAnimation);
                        }
                    }).start();
                }
            }).start();
        }
    }

    /* renamed from: I */
    private void m94686I() {
        if (this.mShareContainerView != null && !C28429p.m93442a(this.f76175m)) {
            this.mShareContainerView.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).withEndAction(new C28887co(this)).start();
        }
    }

    /* renamed from: J */
    private void m94687J() {
        if (C43122ff.m136767b()) {
            this.shareIv.setImageResource(R.drawable.auv);
            C23487o.m77140a((View) this.mShareCount, 8);
        }
        if (C32698a.m105818a(this.f76169g) && this.mShareCount != null) {
            this.mShareCount.setText("0");
        }
    }

    /* renamed from: r */
    private void m94696r() {
        this.mShareContainerView.setAlpha(1.0f);
        this.shareIv.getLayoutParams().width = (int) C9738o.m28708b(this.f76175m, 40.0f);
        this.shareIv.getLayoutParams().height = -1;
        this.shareIv.setImageResource(C28677a.m94347a().mo73745a());
    }

    /* renamed from: u */
    private boolean m94699u() {
        if (this.f76169g == null) {
            return false;
        }
        User author = this.f76169g.getAuthor();
        if (author != null) {
            return TextUtils.equals(author.getUid(), C6861a.m21337f().getCurUser().getUid());
        }
        return false;
    }

    /* renamed from: z */
    private void m94704z() {
        if (this.f75849a) {
            m94703y();
        }
        if (this.f75855r) {
            if (this.mShareCount != null && this.mShareCount.getVisibility() == 0 && !TextUtils.isEmpty(this.f75853e)) {
                this.mShareCount.setText(this.f75853e);
            }
            m94703y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo73965b() {
        if (!C29132a.m95560a() || m94699u() || C28429p.m93442a(this.f76175m)) {
            m94693o();
            return;
        }
        Drawable g = C29125d.m95528g();
        if (g == null) {
            m94693o();
        } else {
            this.shareIv.setImageDrawable(g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo73969i() {
        this.mShareContainerView.animate().scaleX(1.02f).scaleY(1.02f).setDuration(150).withEndAction(new C28888cp(this)).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo73970j() {
        this.mShareContainerView.animate().scaleX(0.95f).scaleY(0.95f).setDuration(150).withEndAction(new C28889cq(this)).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo73971k() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.02f, 0.95f, 1.02f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(600);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        this.mShareContainerView.startAnimation(scaleAnimation);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ void mo73972l() {
        this.mShareContainerView.animate().scaleX(1.03f).scaleY(1.03f).setDuration(130).withEndAction(new C28892ct(this)).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ void mo73973m() {
        this.mShareContainerView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(350).withEndAction(new C28885cm(this)).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo73974n() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.03f, 0.9f, 1.03f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        this.mShareContainerView.startAnimation(scaleAnimation);
    }

    /* renamed from: G */
    private void m94684G() {
        Drawable drawable;
        if (C29132a.m95562a(this.f76169g) && this.f76169g.getAuthor() != null && !this.f75852d) {
            if (C6861a.m21332a().userService().isMe(this.f76169g.getAuthor().getUid())) {
                drawable = C29125d.m95530i();
            } else {
                drawable = C29125d.m95529h();
            }
            if (drawable != null && this.shareIv != null) {
                this.shareIv.setImageDrawable(drawable);
                m94686I();
                this.f75852d = true;
            }
        }
    }

    /* renamed from: o */
    private void m94693o() {
        if (C43122ff.m136767b()) {
            this.shareIv.setImageResource(R.drawable.auv);
            C23487o.m77140a((View) this.mShareCount, 8);
        } else if (this.f76169g != null && this.f76169g.getAuthor() != null && TextUtils.equals(this.f76169g.getAuthor().getUid(), C6861a.m21337f().getCurUser().getUid())) {
            this.shareIv.setImageResource(R.drawable.auv);
        } else if (C28429p.m93442a(this.f76175m)) {
            m94695q();
        } else if (C6384b.m19835a().mo15287a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", C6384b.m19835a().mo15295d().interction_share_button_style, 0) != 0) {
            m94694p();
        } else {
            try {
                m94696r();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: x */
    private void m94702x() {
        if (this.f75850b) {
            this.f75850b = false;
            m94703y();
        }
        if (this.f75849a) {
            this.f75849a = false;
            m94703y();
        }
        if (this.f75855r) {
            this.f75855r = false;
            if (this.mShareCount != null && this.mShareCount.getVisibility() == 0 && !TextUtils.isEmpty(this.f75853e)) {
                this.mShareCount.setText(this.f75853e);
            }
            m94703y();
        }
        if (this.f75852d) {
            this.f75852d = false;
            m94703y();
        }
    }

    /* renamed from: y */
    private void m94703y() {
        Animation animation = this.mShareContainerView.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        this.mShareContainerView.clearAnimation();
        if (C29132a.m95560a()) {
            mo73965b();
        } else if (C28429p.m93442a(this.f76175m)) {
            m94695q();
        } else if (C6384b.m19835a().mo15287a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", C6384b.m19835a().mo15295d().interction_share_button_style, 0) != 0) {
            m94694p();
        } else {
            m94696r();
        }
        this.mShareContainerView.setScaleX(1.0f);
        this.mShareContainerView.setScaleY(1.0f);
        m94697s();
    }

    /* renamed from: D */
    private void m94681D() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f75850b || C6384b.m19835a().mo15287a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", C6384b.m19835a().mo15295d().interction_share_button_style, 0) != 0 || m94680C() != 0 || C43122ff.m136767b() || this.f75852d || this.f75855r) {
            return;
        }
        if ((!C6399b.m19946v() || !C30199h.m98861a().getShareDownloadDisabled().booleanValue()) && !C28429p.m93442a(this.f76175m)) {
            boolean z4 = false;
            if (!C28482e.m93618k(this.f76169g) || C28482e.m93619l(this.f76169g)) {
                z = false;
            } else {
                z = true;
            }
            if (C6384b.m19835a().mo15287a(ShareIconVariantExperiment.class, true, "share_icon_variant", C6384b.m19835a().mo15295d().share_icon_variant, 0) == 1 && m94679B() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z5 = Keva.getRepo("share_repo").getBoolean("user_download_action", false);
            if (m94679B() == 1 || (!z5 && m94679B() == 2)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z && (z2 || z3)) {
                z4 = true;
            }
            this.f75849a = true;
            this.mShareContainerView.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).withEndAction(new C28883ck(this, z4)).start();
        }
    }

    /* renamed from: p */
    private void m94694p() {
        this.f75857u = C37984ap.m121302b().getMostUseShareChannel();
        boolean b = C28429p.f74962b.mo72165b(this.f76175m);
        if (this.f75857u != null || !b) {
            int a = C6384b.m19835a().mo15287a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", C6384b.m19835a().mo15295d().interction_share_button_style, 0);
            if (this.f75857u == null || a == 1) {
                m94696r();
                return;
            }
            Drawable channelDrawable = C37984ap.m121302b().channelDrawable(this.f76178p.getActivity(), this.f75857u);
            if (channelDrawable != null) {
                this.shareIv.getLayoutParams().width = (int) C9738o.m28708b(this.f76175m, 36.0f);
                this.shareIv.getLayoutParams().height = (int) C9738o.m28708b(this.f76175m, 36.0f);
                this.shareIv.setImageDrawable(channelDrawable);
            }
            return;
        }
        this.shareIv.getLayoutParams().width = (int) C9738o.m28708b(this.f76175m, 36.0f);
        this.shareIv.getLayoutParams().height = (int) C9738o.m28708b(this.f76175m, 36.0f);
        this.shareIv.setImageResource(R.drawable.anl);
    }

    /* renamed from: s */
    private void m94697s() {
        if (this.f76169g != null) {
            User author = this.f76169g.getAuthor();
            AwemeStatistics statistics = this.f76169g.getStatistics();
            if (statistics == null || author == null) {
                this.mShareCount.setVisibility(8);
            } else if (TextUtils.equals(C6861a.m21337f().getCurUserId(), author.getUid())) {
                this.mShareCount.setVisibility(8);
            } else if (C6384b.m19835a().mo15287a(ShareButtonStyleExperiment.class, true, "share_button_style", C6384b.m19835a().mo15295d().share_button_style, 0) == 2) {
                this.mShareCount.setVisibility(0);
                this.mShareCount.setTextSize(1, 10.0f);
                this.mShareCount.setText(R.string.foy);
            } else if (C6384b.m19835a().mo15287a(ShareButtonStyleExperiment.class, true, "share_button_style", C6384b.m19835a().mo15295d().share_button_style, 0) == 3) {
                this.mShareCount.setVisibility(0);
                this.mShareCount.setTextSize(1, 12.0f);
                this.mShareCount.setText(C30537o.m99738a((long) statistics.getShareCount()));
            } else {
                this.mShareCount.setVisibility(8);
            }
            m94687J();
        }
    }

    /* renamed from: t */
    private boolean m94698t() {
        try {
            if (C6405d.m19984g() != this.f76178p.getActivity() || !TextUtils.equals(AwemeChangeCallBack.m106763a((FragmentActivity) C6405d.m19984g()).getAid(), this.f76169g.getAid()) || !C28429p.m93442a(this.f76175m) || !C28429p.m93443a(this.f76169g) || C28405n.m93353a().mo72141a(this.f76169g.getAid())) {
                return false;
            }
            C28405n.m93353a().mo72142b(this.f76169g.getAid());
            int a = C6384b.m19835a().mo15287a(InterctionShareButtonWhatsappStyleExperiment.class, true, "interction_share_button_whatsapp_style", C6384b.m19835a().mo15295d().interction_share_button_whatsapp_style, 0);
            if (!C28429p.m93441a((Activity) this.f76178p.getActivity())) {
                this.shareIv.setImageResource(R.drawable.anl);
                switch (a) {
                    case 1:
                        m94692d(1.02f, 0.95f);
                        break;
                    case 2:
                        m94692d(1.05f, 0.9f);
                        break;
                }
            } else {
                switch (a) {
                    case 1:
                        m94692d(1.02f, 0.95f);
                        break;
                    case 2:
                        m94685H();
                        break;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: v */
    private void m94700v() {
        if (m94680C() != 0 && m94680C() != -2 && m94680C() != -1) {
            String curUserId = C6861a.m21337f().getCurUserId();
            int C = m94680C();
            SharedPreferences w = m94701w();
            StringBuilder sb = new StringBuilder("video_digg_");
            sb.append(curUserId);
            int i = w.getInt(sb.toString(), 0);
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences w2 = m94701w();
            StringBuilder sb2 = new StringBuilder("video_digg_time_");
            sb2.append(curUserId);
            if (!DateUtils.isToday(w2.getLong(sb2.toString(), 0))) {
                Editor edit = m94701w().edit();
                StringBuilder sb3 = new StringBuilder("video_digg_time_");
                sb3.append(curUserId);
                edit.putLong(sb3.toString(), currentTimeMillis);
                StringBuilder sb4 = new StringBuilder("video_digg_");
                sb4.append(curUserId);
                edit.putInt(sb4.toString(), 1);
                edit.apply();
                return;
            }
            if (C <= 3) {
                C = 3;
            }
            if (i <= C) {
                Editor edit2 = m94701w().edit();
                StringBuilder sb5 = new StringBuilder("video_digg_");
                sb5.append(curUserId);
                edit2.putInt(sb5.toString(), i + 1);
                edit2.apply();
            }
        }
    }

    public VideoShareView(View view) {
        super(view);
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return this.f76170h;
    }

    @C7709l
    public void onVideoPlayerEvent(C39330h hVar) {
        if (hVar.f102160c == 7 && TextUtils.equals(hVar.f102163f, this.f76169g.getAid())) {
            m94690a(hVar.f102163f);
        }
    }

    /* renamed from: a */
    private void m94689a(Aweme aweme) {
        String str;
        if (aweme != null && !aweme.isProhibited() && !this.f75852d && !this.f75851c && aweme.getUserDigg() == 0 && !this.f75849a && C28493l.m93637a()) {
            this.f75855r = true;
            SharePrefCache.inst().getIsShowFavouriteIcon().mo59871a(Boolean.valueOf(true));
            if (this.mShareCount != null && this.mShareCount.getVisibility() == 0) {
                if (this.mShareCount.getText() != null) {
                    str = this.mShareCount.getText().toString();
                } else {
                    str = "";
                }
                this.f75853e = str;
                this.mShareCount.setText(this.f76175m.getString(R.string.ip));
            }
            m94683F();
        }
    }

    /* renamed from: a */
    private void m94690a(String str) {
        this.f75856s++;
        if (!m94698t() && !m94691b(str)) {
            int C = m94680C();
            if (C != 0 && C != -2) {
                try {
                    if (C6405d.m19984g() != this.f76178p.getActivity() || TextUtils.equals(AwemeChangeCallBack.m106763a((FragmentActivity) C6405d.m19984g()).getAid(), this.f76169g.getAid())) {
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        dataCenter.mo60132a("video_show_share_guide_animation", (C0053p<C23083a>) this).mo60132a("update_diig_view", (C0053p<C23083a>) this).mo60132a("video_on_pause", (C0053p<C23083a>) this).mo60132a("pause_share_guide_animation", (C0053p<C23083a>) this).mo60132a("recover_share_guide_animation", (C0053p<C23083a>) this).mo60132a("on_page_unselected", (C0053p<C23083a>) this).mo60132a("on_page_selected", (C0053p<C23083a>) this).mo60132a("video_digg", (C0053p<C23083a>) this).mo60132a("handle_double_click", (C0053p<C23083a>) this).mo60132a("video_share_click", (C0053p<C23083a>) this).mo60132a("show_festival_activity_icon", (C0053p<C23083a>) this).mo60132a("awesome_update_backup_data", (C0053p<C23083a>) this).mo60132a("video_show_flip_share_drawable", (C0053p<C23083a>) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            switch (str.hashCode()) {
                case -1618328215:
                    if (str.equals("video_digg")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1475411887:
                    if (str.equals("handle_double_click")) {
                        c = 7;
                        break;
                    }
                    break;
                case -777668341:
                    if (str.equals("update_diig_view")) {
                        c = 4;
                        break;
                    }
                    break;
                case 245017106:
                    if (str.equals("video_show_flip_share_drawable")) {
                        c = 11;
                        break;
                    }
                    break;
                case 249129690:
                    if (str.equals("video_on_pause")) {
                        c = 0;
                        break;
                    }
                    break;
                case 281945252:
                    if (str.equals("show_festival_activity_icon")) {
                        c = 12;
                        break;
                    }
                    break;
                case 350216171:
                    if (str.equals("on_page_selected")) {
                        c = 9;
                        break;
                    }
                    break;
                case 651229933:
                    if (str.equals("awesome_update_backup_data")) {
                        c = 10;
                        break;
                    }
                    break;
                case 920041496:
                    if (str.equals("pause_share_guide_animation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1181771620:
                    if (str.equals("video_share_click")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1346787590:
                    if (str.equals("recover_share_guide_animation")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1628582276:
                    if (str.equals("on_page_unselected")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1863388195:
                    if (str.equals("video_show_share_guide_animation")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m94702x();
                    return;
                case 1:
                    m94702x();
                    return;
                case 2:
                    m94704z();
                    return;
                case 3:
                    m94678A();
                    return;
                case 4:
                    this.f75851c = ((Boolean) aVar.mo60161a()).booleanValue();
                    return;
                case 5:
                    m94681D();
                    return;
                case 6:
                    if (((Integer) aVar.mo60161a()).intValue() == 5) {
                        m94700v();
                        return;
                    }
                    break;
                case 7:
                    if (!this.f75851c && this.f76169g != null && this.f76169g.getUserDigg() == 0) {
                        m94689a(this.f76169g);
                        return;
                    }
                case 8:
                    return;
                case 9:
                    m94682E();
                    return;
                case 10:
                    VideoItemParams videoItemParams = (VideoItemParams) aVar.mo60161a();
                    if (videoItemParams != null) {
                        mo72021a(videoItemParams);
                        return;
                    }
                    break;
                case 11:
                    m94684G();
                    return;
                case 12:
                    mo73965b();
                    break;
            }
        }
    }

    /* renamed from: b */
    private boolean m94691b(String str) {
        Drawable drawable;
        if (this.f75856s != 2) {
            return false;
        }
        try {
            if (C6405d.m19984g() != this.f76178p.getActivity() || !TextUtils.equals(AwemeChangeCallBack.m106763a((FragmentActivity) C6405d.m19984g()).getAid(), this.f76169g.getAid())) {
                return false;
            }
            boolean b = C28429p.f74962b.mo72165b(this.f76175m);
            int a = C6384b.m19835a().mo15287a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", C6384b.m19835a().mo15295d().interction_share_button_style, 0);
            if (a == 0 || (this.f75857u == null && !b)) {
                return false;
            }
            if (C28405n.m93353a().mo72141a(this.f76169g.getAid())) {
                return true;
            }
            C28405n.m93353a().mo72142b(this.f76169g.getAid());
            this.shareIv.getLayoutParams().width = (int) C9738o.m28708b(this.f76175m, 36.0f);
            this.shareIv.getLayoutParams().height = (int) C9738o.m28708b(this.f76175m, 36.0f);
            if (TextUtils.isEmpty(this.f75857u) || this.f76178p == null || this.f76178p.getActivity() == null) {
                drawable = this.f76175m.getResources().getDrawable(R.drawable.anl);
            } else {
                drawable = C37984ap.m121302b().channelDrawable(this.f76178p.getActivity(), this.f75857u);
            }
            this.shareIv.setImageDrawable(drawable);
            if ((a == 1 && this.f75857u == null) || a == 2) {
                m94685H();
                return true;
            } else if (a == 3) {
                m94692d(1.05f, 0.9f);
                return true;
            } else if (a != 1 || this.f75857u == null || this.f76178p == null || this.f76178p.getActivity() == null) {
                return false;
            } else {
                m94692d(1.05f, 0.9f);
                return true;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.layout_video_share);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        ButterKnife.bind((Object) this, view);
        this.mShareContainerView.setOnTouchListener(C23487o.m77135a());
        C42961az.m136382c(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo73967b(boolean z) {
        Drawable drawable;
        if (!C6903bc.m21488g().mo80286a() || !TextUtils.equals(C28205ai.m92707c(), "chat_merge")) {
            if (z) {
                drawable = C0683b.m2903a(this.f76175m, (int) R.drawable.a6k);
                this.mShareCount.setVisibility(8);
            } else {
                drawable = C37984ap.m121302b().getFirstShareIcon((Activity) this.f76175m);
            }
            if (drawable != null) {
                this.shareIv.setImageDrawable(drawable);
                C6907h.m21524a("share_highlight", (Map) C22984d.m75611a().mo59973a("enter_from", this.f76170h).mo59973a("group_id", C33230ac.m107238m(this.f76169g)).mo59973a("author_id", C33230ac.m107205a(this.f76169g)).mo59973a("show_content", C28205ai.m92707c()).f60753a);
            }
        } else {
            C6903bc.m21488g().mo80284a(this.f76175m, this.shareIv, 4);
            C6907h.m21524a("share_highlight", (Map) C22984d.m75611a().mo59973a("enter_from", this.f76170h).mo59973a("group_id", C33230ac.m107238m(this.f76169g)).mo59973a("author_id", C33230ac.m107205a(this.f76169g)).mo59973a("show_content", C28205ai.m92707c()).f60753a);
        }
        this.mShareContainerView.animate().scaleX(1.02f).scaleY(1.02f).setDuration(150).withEndAction(new Runnable() {
            public final void run() {
                VideoShareView.this.mShareContainerView.animate().scaleX(0.95f).scaleY(0.95f).setDuration(150).withEndAction(new Runnable() {
                    public final void run() {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.02f, 0.95f, 1.02f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setDuration(600);
                        scaleAnimation.setRepeatMode(2);
                        scaleAnimation.setRepeatCount(-1);
                        VideoShareView.this.mShareContainerView.startAnimation(scaleAnimation);
                    }
                }).start();
            }
        }).start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010f, code lost:
        if (r7.equals("homepage_hot") == false) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x023b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r7) {
        /*
            r6 = this;
            boolean r7 = com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a.m89578a(r7)
            if (r7 == 0) goto L_0x0007
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.f75854f
            long r2 = r0 - r2
            r4 = 800(0x320, double:3.953E-321)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x001a
            r0 = 0
            r6.f75854f = r0
            return
        L_0x001a:
            r6.f75854f = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f76169g
            if (r7 != 0) goto L_0x0021
            return
        L_0x0021:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f76169g
            boolean r7 = r7.isCanPlay()
            if (r7 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f76169g
            boolean r7 = r7.isDelete()
            if (r7 == 0) goto L_0x0043
        L_0x0031:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f76169g
            int r0 = r6.f76173k
            boolean r7 = com.p280ss.android.ugc.aweme.feed.p1234j.C28493l.m93638a(r7, r0)
            if (r7 != 0) goto L_0x0043
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f76169g
            boolean r7 = com.p280ss.android.ugc.aweme.login.utils.C32698a.m105819b(r7)
            if (r7 == 0) goto L_0x005b
        L_0x0043:
            int r7 = r6.f76173k
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r7 == r0) goto L_0x0083
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f76169g
            int r0 = r6.f76173k
            boolean r7 = com.p280ss.android.ugc.aweme.feed.p1234j.C28493l.m93638a(r7, r0)
            if (r7 != 0) goto L_0x0083
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f76169g
            boolean r7 = com.p280ss.android.ugc.aweme.login.utils.C32698a.m105818a(r7)
            if (r7 == 0) goto L_0x0083
        L_0x005b:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f76169g
            boolean r7 = r7.isImage()
            if (r7 == 0) goto L_0x0070
            android.content.Context r7 = r6.f76175m
            r0 = 2131824012(0x7f110d8c, float:1.928084E38)
            com.bytedance.ies.dmt.ui.c.a r7 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r7, r0)
            r7.mo25750a()
            return
        L_0x0070:
            android.content.Context r7 = r6.f76175m
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            r1 = 2131829407(0x7f11229f, float:1.9291782E38)
            java.lang.String r0 = com.p280ss.android.ugc.aweme.login.utils.C32698a.m105817a(r0, r1)
            com.bytedance.ies.dmt.ui.c.a r7 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r7, r0)
            r7.mo25750a()
            return
        L_0x0083:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r7 = r6.f76174l
            java.lang.String r0 = "video_share_click"
            r1 = 0
            r7.mo60134a(r0, r1)
            boolean r7 = r6.f75849a
            r0 = 0
            if (r7 == 0) goto L_0x00c4
            java.lang.String r7 = "share_highlight_click"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f76169g
            java.lang.String r3 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107238m(r3)
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f76169g
            java.lang.String r3 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107205a(r3)
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "show_content"
            java.lang.String r3 = com.p280ss.android.ugc.aweme.feed.C28205ai.m92707c()
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "is_pop_up"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59970a(r2, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r7, r1)
            goto L_0x00db
        L_0x00c4:
            com.ss.android.ugc.aweme.feed.helper.g r7 = com.p280ss.android.ugc.aweme.feed.helper.C28419g.m93414a()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r6.shareIv
            java.lang.String r2 = r6.f76170h
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f76169g
            java.lang.String r3 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107238m(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.f76169g
            java.lang.String r4 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107205a(r4)
            r7.mo72154a(r1, r2, r3, r4)
        L_0x00db:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r7 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.secapi.ISecApi> r1 = com.p280ss.android.ugc.aweme.secapi.ISecApi.class
            java.lang.Object r7 = r7.getService(r1)
            com.ss.android.ugc.aweme.secapi.ISecApi r7 = (com.p280ss.android.ugc.aweme.secapi.ISecApi) r7
            java.lang.String r1 = "share"
            r7.reportData(r1)
            r6.m94702x()
            java.lang.String r7 = r6.f76170h
            if (r7 != 0) goto L_0x00f7
            java.lang.String r7 = ""
            r6.f76170h = r7
        L_0x00f7:
            java.lang.String r7 = r6.f76170h
            r1 = -1
            int r2 = r7.hashCode()
            r3 = -1271119582(0xffffffffb43c4122, float:-1.753256E-7)
            if (r2 == r3) goto L_0x0112
            r3 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r2 == r3) goto L_0x0109
            goto L_0x011c
        L_0x0109:
            java.lang.String r2 = "homepage_hot"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x011c
            goto L_0x011d
        L_0x0112:
            java.lang.String r0 = "homepage_follow"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x011c
            r0 = 1
            goto L_0x011d
        L_0x011c:
            r0 = -1
        L_0x011d:
            switch(r0) {
                case 0: goto L_0x023b;
                case 1: goto L_0x01a7;
                default: goto L_0x0120;
            }
        L_0x0120:
            int r7 = r6.f76179q
            r0 = 2
            if (r7 != r0) goto L_0x02df
            android.content.Context r7 = r6.f76175m
            android.content.Context r0 = r7.getApplicationContext()
            java.lang.String r1 = "click_share_button"
            java.lang.String r2 = r6.f76170h
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f76169g
            java.lang.String r3 = r7.getAid()
            r4 = 0
            com.p280ss.android.ugc.aweme.common.C6907h.m21518a(r0, r1, r2, r3, r4)
            com.ss.android.ugc.aweme.metrics.i r7 = new com.ss.android.ugc.aweme.metrics.i
            r7.<init>()
            java.lang.String r0 = r6.f76170h
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85268d(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85071g(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r6.f76174l
            java.lang.String r1 = "playlist_id"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85267c(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r6.f76174l
            java.lang.String r1 = "playlist_id_key"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85266b(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r6.f76174l
            java.lang.String r1 = "playlist_type"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85264a(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r6.f76174l
            java.lang.String r1 = "tab_name"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.metrics.l r7 = r7.mo85283l(r0)
            com.ss.android.ugc.aweme.metrics.i r7 = (com.p280ss.android.ugc.aweme.metrics.C33267i) r7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            int r1 = r6.f76173k
            java.lang.String r0 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107216b(r0, r1)
            com.ss.android.ugc.aweme.metrics.l r7 = r7.mo85284m(r0)
            com.ss.android.ugc.aweme.metrics.i r7 = (com.p280ss.android.ugc.aweme.metrics.C33267i) r7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x02ce
            java.lang.String r0 = ""
            goto L_0x02d8
        L_0x01a7:
            android.content.Context r7 = r6.f76175m
            android.content.Context r0 = r7.getApplicationContext()
            java.lang.String r1 = "click_share_button"
            java.lang.String r2 = "homepage_follow"
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f76169g
            java.lang.String r3 = r7.getAid()
            r4 = 0
            com.p280ss.android.ugc.aweme.common.C6907h.m21518a(r0, r1, r2, r3, r4)
            com.ss.android.ugc.aweme.metrics.i r7 = new com.ss.android.ugc.aweme.metrics.i
            r7.<init>()
            java.lang.String r0 = "homepage_follow"
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85268d(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85071g(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r6.f76174l
            java.lang.String r1 = "playlist_id"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85267c(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r6.f76174l
            java.lang.String r1 = "playlist_id_key"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85266b(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r6.f76174l
            java.lang.String r1 = "playlist_type"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85264a(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r6.f76174l
            java.lang.String r1 = "tab_name"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.metrics.l r7 = r7.mo85283l(r0)
            com.ss.android.ugc.aweme.metrics.i r7 = (com.p280ss.android.ugc.aweme.metrics.C33267i) r7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            int r1 = r6.f76173k
            java.lang.String r0 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107216b(r0, r1)
            com.ss.android.ugc.aweme.metrics.l r7 = r7.mo85284m(r0)
            com.ss.android.ugc.aweme.metrics.i r7 = (com.p280ss.android.ugc.aweme.metrics.C33267i) r7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x0228
            java.lang.String r0 = ""
            goto L_0x0232
        L_0x0228:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
        L_0x0232:
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85275k(r0)
            r7.mo85252e()
            goto L_0x02df
        L_0x023b:
            android.content.Context r7 = r6.f76175m
            android.content.Context r0 = r7.getApplicationContext()
            java.lang.String r1 = "click_share_button"
            java.lang.String r2 = "homepage_hot"
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f76169g
            java.lang.String r3 = r7.getAid()
            r4 = 0
            com.p280ss.android.ugc.aweme.common.C6907h.m21518a(r0, r1, r2, r3, r4)
            com.ss.android.ugc.aweme.metrics.i r7 = new com.ss.android.ugc.aweme.metrics.i
            r7.<init>()
            java.lang.String r0 = "homepage_hot"
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85268d(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85071g(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r6.f76174l
            java.lang.String r1 = "playlist_id"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85267c(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r6.f76174l
            java.lang.String r1 = "playlist_id_key"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85266b(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r6.f76174l
            java.lang.String r1 = "playlist_type"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85264a(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r6.f76174l
            java.lang.String r1 = "tab_name"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.metrics.l r7 = r7.mo85283l(r0)
            com.ss.android.ugc.aweme.metrics.i r7 = (com.p280ss.android.ugc.aweme.metrics.C33267i) r7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            int r1 = r6.f76173k
            java.lang.String r0 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107216b(r0, r1)
            com.ss.android.ugc.aweme.metrics.l r7 = r7.mo85284m(r0)
            com.ss.android.ugc.aweme.metrics.i r7 = (com.p280ss.android.ugc.aweme.metrics.C33267i) r7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x02bc
            java.lang.String r0 = ""
            goto L_0x02c6
        L_0x02bc:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
        L_0x02c6:
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85275k(r0)
            r7.mo85252e()
            goto L_0x02df
        L_0x02ce:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
        L_0x02d8:
            com.ss.android.ugc.aweme.metrics.i r7 = r7.mo85275k(r0)
            r7.mo85252e()
        L_0x02df:
            com.ss.android.ugc.aweme.main.a.a r7 = new com.ss.android.ugc.aweme.main.a.a
            r7.<init>()
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.VideoShareView.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        super.mo72021a(videoItemParams);
        if (this.f76169g != null) {
            this.mShareContainerView.setVisibility(0);
            this.mShareCount.setVisibility(0);
            mo73965b();
            if (C28493l.m93638a(this.f76169g, this.f76173k) || ((!C43168s.m136912d(this.f76169g) && !C43168s.m136911c(this.f76169g)) || m94699u())) {
                this.mShareContainerView.setAlpha(1.0f);
                this.mShareContainerView.setEnabled(true);
            } else {
                this.mShareContainerView.setAlpha(0.5f);
                this.mShareContainerView.setEnabled(false);
            }
            m94697s();
            this.f75856s = 0;
        }
    }

    /* renamed from: d */
    private void m94692d(float f, float f2) {
        if (this.mShareContainerView != null && !this.f75850b) {
            this.f75850b = true;
            this.mShareContainerView.animate().scaleX(0.001f).scaleY(0.001f).setDuration(300).withEndAction(new C28886cn(this, f2, f)).start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo73964a(float f, float f2) {
        this.mShareContainerView.animate().scaleX(1.08f).scaleY(1.08f).setDuration(150).withEndAction(new C28890cr(this, f, f2)).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo73968c(float f, float f2) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(600);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        this.mShareContainerView.startAnimation(scaleAnimation);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo73966b(float f, float f2) {
        this.mShareContainerView.animate().scaleX(f).scaleY(f).setDuration(150).withEndAction(new C28891cs(this, f, f2)).start();
    }
}
