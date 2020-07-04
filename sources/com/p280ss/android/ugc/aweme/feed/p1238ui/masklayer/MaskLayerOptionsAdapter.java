package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer;

import android.app.Activity;
import android.content.Context;
import android.net.Uri.Builder;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.p817ad.p818a.p822c.C18940g;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25244aq;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27746c;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.adapter.C28173d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.MaskLayerOption;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28897g;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.C28927a.C28928a;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.C28687a;
import com.p280ss.android.ugc.aweme.follow.p1259b.C29443a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.poi.utils.C35452k;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a;
import com.p280ss.android.ugc.aweme.report.C37196b;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.share.AwemeACLStruct;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.C38024d;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.share.experiment.VideoReportEnhanceExperiment;
import com.p280ss.android.ugc.aweme.share.p1536f.C38037a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsAdapter */
public class MaskLayerOptionsAdapter extends BaseMaskLayerOptionsAdapter implements C27746c {

    /* renamed from: a */
    public final Context f76250a;

    /* renamed from: b */
    private SharePackage f76251b;

    /* renamed from: c */
    private Aweme f76252c;

    /* renamed from: d */
    private C27743a f76253d;

    /* renamed from: e */
    private List<MaskLayerOption> f76254e = new ArrayList();

    /* renamed from: f */
    private String f76255f;

    /* renamed from: g */
    private C28932e f76256g;

    /* renamed from: a */
    public final void mo61805a(Exception exc) {
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo74220a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m95116a(view, 100, 0.92f);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            m95116a(view, 60, 1.0f);
        }
        return false;
    }

    public int getItemCount() {
        return this.f76254e.size();
    }

    /* renamed from: j */
    private void m95125j() {
        C42961az.m136380a(new C29443a(this.f76252c, "long_press"));
    }

    /* renamed from: e */
    private static int m95120e() {
        if (!C6399b.m19944t() || !C28928a.m95144b()) {
            return R.drawable.ayb;
        }
        return R.drawable.ayc;
    }

    /* renamed from: i */
    private void m95124i() {
        C37984ap.m121302b().getDislikeAction(this.f76252c, this.f76255f, "long_press").mo95712a(this.f76250a, this.f76251b);
    }

    /* renamed from: p */
    private void m95131p() {
        Activity g = C6405d.m19984g();
        if (g != null && !g.isFinishing()) {
            C37950a.m121238a().showReportDialog(this.f76252c, "long_press_mask_layer", C6405d.m19984g(), "");
        }
    }

    /* renamed from: d */
    private void m95119d() {
        if (!C28482e.m93606a(this.f76252c) && C6384b.m19835a().mo15292a(VideoReportEnhanceExperiment.class, true, "enable_enhance_report", C6384b.m19835a().mo15295d().enable_enhance_report, false)) {
            if (this.f76252c == null || !this.f76252c.isAd()) {
                this.f76254e.add(m95114a(7));
            }
        }
    }

    /* renamed from: f */
    private void m95121f() {
        String str;
        if (this.f76252c != null) {
            str = this.f76252c.getAid();
        } else {
            str = "";
        }
        C32656f.m105744a(C6405d.m19984g(), this.f76255f, "click_favorite_video", C42914ab.m136242a().mo104633a("group_id", str).mo104633a("log_pb", C33230ac.m107234j(str)).f111445a, (C23305g) new C28931d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void mo74221b() {
        if (this.f76253d == null) {
            this.f76253d = new C27743a();
        }
        this.f76253d.mo66537a(this);
        this.f76253d.mo56976a(Integer.valueOf(2), this.f76252c.getAid(), Integer.valueOf(this.f76252c.isCollected() ^ true ? 1 : 0));
    }

    /* renamed from: h */
    private void m95123h() {
        m95127l();
        if (C25352e.m83220c(this.f76252c)) {
            C10761a.m31399c(this.f76250a, (int) R.string.e4).mo25750a();
        } else if (!C21115b.m71197a().isLogin()) {
            m95121f();
        } else {
            mo74221b();
        }
    }

    /* renamed from: k */
    private void m95126k() {
        String str;
        Aweme aweme = this.f76252c;
        String str2 = "download";
        C22984d a = new C22984d().mo59973a("group_id", this.f76252c.getAid()).mo59973a("impr_type", C33230ac.m107245t(this.f76252c)).mo59973a("author_id", this.f76252c.getAuthorUid()).mo59973a("enter_from", this.f76255f);
        String str3 = "download_type";
        if (this.f76252c.getAuthor() == null || !TextUtils.equals(C21115b.m71197a().getCurUserId(), this.f76252c.getAuthor().getUid())) {
            str = "other";
        } else {
            str = "self";
        }
        C35452k.m114511a(aweme, str2, a.mo59973a(str3, str).mo59973a("download_method", "long_press_download").mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f76252c))));
    }

    /* renamed from: l */
    private void m95127l() {
        String str;
        Aweme aweme = this.f76252c;
        if (this.f76252c.isCollected()) {
            str = "cancel_favourite_video";
        } else {
            str = "favourite_video";
        }
        C35452k.m114516b(aweme, str, C22984d.m75611a().mo59973a("enter_from", this.f76255f).mo59973a("group_id", this.f76252c.getAid()).mo59973a("author_id", this.f76252c.getAuthorUid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f76252c))).mo59973a("enter_method", "long_press"));
    }

    /* renamed from: m */
    private void m95128m() {
        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f76255f).mo59973a("author_id", this.f76252c.getAuthorUid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f76252c))).mo59973a("enter_method", "long_press").mo59973a("scene_id", "1003");
        if (this.f76252c.isAd()) {
            a.mo59972a("group_id", (Object) this.f76252c.getAwemeRawAd().getGroupId());
        } else {
            a.mo59973a("group_id", this.f76252c.getAid());
        }
        C6907h.m21525a("report", C33230ac.m107211a(a.f60753a));
    }

    /* renamed from: n */
    private void m95129n() {
        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f76255f).mo59973a("group_id", this.f76252c.getAid()).mo59973a("author_id", this.f76252c.getAuthorUid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f76252c))).mo59973a("enter_method", "long_press");
        if (this.f76252c.isAd()) {
            a.mo59972a("group_id", (Object) this.f76252c.getAwemeRawAd().getGroupId());
        } else {
            a.mo59973a("group_id", this.f76252c.getAid());
        }
        C6907h.m21525a("report_show", C33230ac.m107211a(a.f60753a));
    }

    /* renamed from: o */
    private void m95130o() {
        m95128m();
        Activity a = C18940g.m61808a(this.f76250a);
        if (a != null && this.f76252c != null && this.f76252c.isAd() && this.f76252c.getAwemeRawAd().isReportEnable()) {
            Builder a2 = C25244aq.m82987a(this.f76252c, "creative", "ad");
            int reportAdType = this.f76252c.getAwemeRawAd().getReportAdType();
            if (reportAdType != 0) {
                a2.appendQueryParameter("report_ad_type", String.valueOf(reportAdType));
            }
            C37196b.m119559a(a, a2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0100  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m95118c() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f76252c
            if (r0 == 0) goto L_0x010d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f76252c
            int r0 = r0.getAwemeType()
            r1 = 13
            if (r0 == r1) goto L_0x010d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f76252c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f76252c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
            boolean r0 = com.p280ss.android.ugc.aweme.share.C37981am.m121297a(r0)
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = r8.f76255f
            java.lang.String r3 = "homepage_hot"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            boolean r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            r4 = 2
            if (r3 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f76252c
            boolean r3 = com.p280ss.android.ugc.aweme.feed.p1234j.C28482e.m93618k(r3)
            r5 = 0
            goto L_0x00a1
        L_0x0044:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f76252c
            boolean r3 = com.p280ss.android.ugc.aweme.feed.p1234j.C28482e.m93616i(r3)
            if (r3 != 0) goto L_0x0056
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f76252c
            boolean r3 = com.p280ss.android.ugc.aweme.feed.p1234j.C28482e.m93617j(r3)
            if (r3 != 0) goto L_0x0056
            r3 = 1
            goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f76252c
            int r5 = r5.getDistributeType()
            if (r5 != r4) goto L_0x0072
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f76252c
            com.ss.android.ugc.aweme.feed.model.VideoControl r5 = r5.getVideoControl()
            if (r5 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f76252c
            com.ss.android.ugc.aweme.feed.model.VideoControl r5 = r5.getVideoControl()
            int r5 = r5.preventDownloadType
            if (r5 != r1) goto L_0x0072
            r3 = 0
        L_0x0072:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f76252c
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            if (r5 == 0) goto L_0x0096
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f76252c
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            java.lang.String r5 = r5.getUid()
            boolean r5 = com.p280ss.android.ugc.aweme.share.C37981am.m121297a(r5)
            if (r5 != 0) goto L_0x0096
            java.lang.String r5 = r8.f76255f
            java.lang.String r6 = "homepage_follow"
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 == 0) goto L_0x0096
            r5 = 1
            goto L_0x0097
        L_0x0096:
            r5 = 0
        L_0x0097:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r8.f76252c
            boolean r6 = r6.isAd()
            if (r6 == 0) goto L_0x00a1
            r6 = 1
            goto L_0x00a2
        L_0x00a1:
            r6 = 0
        L_0x00a2:
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r7 = r8.f76254e
            r7.clear()
            if (r3 == 0) goto L_0x00ba
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r3 = r8.f76254e
            com.ss.android.ugc.aweme.feed.model.MaskLayerOption r7 = m95114a(r1)
            r3.add(r7)
            java.lang.String r3 = r8.f76255f
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r8.f76252c
            com.p280ss.android.ugc.aweme.share.C38024d.m121366a(r1, r3, r7)
            goto L_0x00c1
        L_0x00ba:
            java.lang.String r3 = r8.f76255f
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r8.f76252c
            com.p280ss.android.ugc.aweme.share.C38024d.m121366a(r2, r3, r7)
        L_0x00c1:
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r3 = r8.f76254e
            com.ss.android.ugc.aweme.feed.model.MaskLayerOption r4 = m95114a(r4)
            r3.add(r4)
            if (r0 == 0) goto L_0x00e6
            boolean r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.C28927a.C28928a.m95144b()
            r3 = 3
            if (r0 == 0) goto L_0x00dd
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r0 = r8.f76254e
            com.ss.android.ugc.aweme.feed.model.MaskLayerOption r3 = m95114a(r3)
            r0.add(r2, r3)
            goto L_0x00e6
        L_0x00dd:
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r0 = r8.f76254e
            com.ss.android.ugc.aweme.feed.model.MaskLayerOption r3 = m95114a(r3)
            r0.add(r3)
        L_0x00e6:
            if (r5 == 0) goto L_0x00f2
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r0 = r8.f76254e
            r3 = 5
            com.ss.android.ugc.aweme.feed.model.MaskLayerOption r3 = m95114a(r3)
            r0.add(r3)
        L_0x00f2:
            if (r6 == 0) goto L_0x00fd
            com.ss.android.ugc.aweme.share.libra.AdFeedbackOptimize r0 = com.p280ss.android.ugc.aweme.share.libra.AdFeedbackOptimize.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            r1 = 0
        L_0x00fe:
            if (r1 == 0) goto L_0x010a
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r0 = r8.f76254e
            r1 = 6
            com.ss.android.ugc.aweme.feed.model.MaskLayerOption r1 = m95114a(r1)
            r0.add(r1)
        L_0x010a:
            r8.m95119d()
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.MaskLayerOptionsAdapter.m95118c():void");
    }

    /* renamed from: a */
    public final void mo74218a() {
        m95126k();
        C38024d.m121364a("long_press_download");
        if (!C38037a.m121403a()) {
            AwemeACLStruct.m121220a().setToastMsg(this.f76250a.getString(R.string.ae8));
            C38024d.m121365a(this.f76255f, this.f76252c);
            C10761a.m31410e(this.f76250a, this.f76250a.getString(R.string.ae8, new Object[]{C38037a.m121404b()})).mo25750a();
        } else if (this.f76252c.isPreventDownload()) {
            AwemeACLStruct.m121220a().setToastMsg(this.f76250a.getString(R.string.w6));
            C38024d.m121365a(this.f76255f, this.f76252c);
            C10761a.m31410e(this.f76250a, this.f76250a.getResources().getString(R.string.w6)).mo25750a();
        } else {
            C38024d.m121368b(this.f76255f);
            if (C28687a.m94362a(this.f76250a, this.f76252c)) {
                if (C25352e.m83220c(this.f76252c) && !C6399b.m19944t()) {
                    AwemeACLStruct.m121220a().setToastMsg(this.f76250a.getString(R.string.e4));
                    C38024d.m121365a(this.f76255f, this.f76252c);
                    C10761a.m31399c(this.f76250a, (int) R.string.e4).mo25750a();
                } else if (C6399b.m19944t()) {
                    Activity a = C18940g.m61808a(this.f76250a);
                    C37984ap.m121302b().getDownloadAction(a, this.f76252c, this.f76255f, "long_press_download", false).mo95712a(a, this.f76251b);
                } else if (!C37984ap.m121302b().checkShareAllowStatus(this.f76252c, this.f76250a)) {
                    AwemeACLStruct.m121220a().setToastMsg(this.f76250a.getString(R.string.w7));
                    C38024d.m121365a(this.f76255f, this.f76252c);
                } else if (this.f76252c.getAwemeType() != 2 || !C28897g.m95083b(this.f76252c)) {
                    Activity a2 = C18940g.m61808a(this.f76250a);
                    C37984ap.m121302b().getDownloadAction(a2, this.f76252c, this.f76255f, "long_press_download", false).mo95712a(a2, this.f76251b);
                } else {
                    C37984ap.m121302b().requestFeedSelfsee(this.f76250a, this.f76252c);
                    AwemeACLStruct.m121220a().setShowType(3);
                    C38024d.m121365a(this.f76255f, this.f76252c);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo74217a(C28932e eVar) {
        this.f76256g = eVar;
    }

    public MaskLayerOptionsAdapter(Context context) {
        this.f76250a = context;
    }

    /* renamed from: a */
    public final void mo61803a(BaseResponse baseResponse) {
        if (this.f76252c != null) {
            boolean z = !this.f76252c.isCollected();
            this.f76252c.setCollectStatus(z ? 1 : 0);
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateCollectStatus(this.f76252c.getAid(), z);
        }
    }

    /* renamed from: a */
    private static MaskLayerOption m95114a(int i) {
        int i2 = R.string.boo;
        int i3 = R.drawable.ay_;
        int i4 = -1;
        if (i == 1) {
            i2 = R.string.dis;
            if (!C6399b.m19944t() || !C28928a.m95144b()) {
                i4 = R.drawable.ayf;
            } else {
                i4 = R.drawable.ayg;
            }
        } else if (i == 2) {
            if (C6399b.m19944t()) {
                if (C28928a.m95144b()) {
                    i3 = R.drawable.aya;
                }
                i4 = i3;
                i2 = R.string.ip;
            } else {
                i2 = R.string.e1m;
                i4 = R.drawable.ay_;
            }
        } else if (i == 3) {
            if (C28928a.m95144b()) {
                i2 = R.string.dkz;
            } else {
                i2 = R.string.cmd;
            }
            if (!C6399b.m19944t() || !C28928a.m95144b()) {
                i4 = R.drawable.ayd;
            } else {
                i4 = R.drawable.aye;
            }
        } else if (i == 5) {
            i2 = R.string.fll;
            i4 = R.drawable.ay9;
        } else if (i == 6) {
            i4 = R.drawable.ayi;
        } else if (i != 7) {
            i2 = -1;
        } else if (C6399b.m19944t()) {
            i4 = R.drawable.ayj;
        } else {
            i4 = R.drawable.ayk;
        }
        return new MaskLayerOption(i, i4, i2);
    }

    /* renamed from: a */
    private static MaskLayerOptionsViewHolder m95115a(ViewGroup viewGroup, int i) {
        return MaskLayerOptionsViewHolder.f76258c.mo74222a(viewGroup);
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m95115a(viewGroup, i);
    }

    /* renamed from: a */
    public final void mo74216a(Aweme aweme, String str) {
        this.f76252c = aweme;
        this.f76255f = str;
        this.f76251b = C37984ap.m121301a().parseAweme(C6399b.m19921a(), aweme, 0, str, "long_press_download");
        m95118c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(MaskLayerOptionsViewHolder maskLayerOptionsViewHolder, int i) {
        int i2;
        if (C28928a.m95144b()) {
            LayoutParams layoutParams = (LayoutParams) maskLayerOptionsViewHolder.itemView.getLayoutParams();
            layoutParams.width = C28927a.f76264d.mo74223a(maskLayerOptionsViewHolder.itemView);
            maskLayerOptionsViewHolder.itemView.setLayoutParams(layoutParams);
        }
        MaskLayerOption maskLayerOption = (MaskLayerOption) this.f76254e.get(i);
        if (C6399b.m19944t()) {
            if (C28928a.m95144b()) {
                i2 = R.color.ac0;
            } else {
                i2 = R.color.yk;
            }
            maskLayerOptionsViewHolder.f76260b.setTextColor(C23481i.m77088a(i2));
        }
        if (2 != maskLayerOption.mType || !this.f76252c.isCollected()) {
            maskLayerOptionsViewHolder.f76259a.setImageResource(maskLayerOption.mIconResId);
            maskLayerOptionsViewHolder.f76260b.setText(maskLayerOption.mTextResId);
        } else {
            maskLayerOptionsViewHolder.f76259a.setImageResource(m95120e());
            if (C6399b.m19944t()) {
                maskLayerOptionsViewHolder.f76260b.setText(R.string.iq);
            } else {
                maskLayerOptionsViewHolder.f76260b.setText(R.string.wc);
            }
            maskLayerOption.mDoOrCancel = false;
        }
        maskLayerOptionsViewHolder.itemView.setOnClickListener(new C28929b(this, maskLayerOption));
        maskLayerOptionsViewHolder.itemView.setOnTouchListener(new C28930c(this));
        if (6 == maskLayerOption.mType) {
            m95129n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74219a(MaskLayerOption maskLayerOption, View view) {
        if (!C27326a.m89578a(view)) {
            switch (maskLayerOption.mType) {
                case 1:
                    ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getShortVideoPluginService().mo90366a(this.f76250a, true, new C35547a() {
                        public final void onSuccess() {
                            MaskLayerOptionsAdapter.this.mo74218a();
                        }
                    });
                    break;
                case 2:
                    m95123h();
                    break;
                case 3:
                    m95124i();
                    break;
                case 5:
                    m95125j();
                    break;
                case 6:
                    m95130o();
                    break;
                case 7:
                    m95131p();
                    break;
            }
            if (this.f76256g != null) {
                this.f76256g.mo67761a(false);
            }
        }
    }

    /* renamed from: a */
    private static void m95116a(View view, int i, float f) {
        view.animate().setDuration((long) i).scaleX(f).scaleY(f).setInterpolator(new C28173d()).start();
    }
}
