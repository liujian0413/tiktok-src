package com.p280ss.android.ugc.aweme.flowfeed.p1256ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.C10804a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.p308ui.AbstractFeedTagLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28994s;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33277s;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.movie.p1404c.C33651a;
import com.p280ss.android.ugc.aweme.movie.view.FeedMvTagView;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformRawData;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.FollowFeedTagLayout2 */
public class FollowFeedTagLayout2 extends AbstractFeedTagLayout implements OnClickListener {

    /* renamed from: n */
    private RemoteImageView f77469n;

    /* renamed from: o */
    private View f77470o;

    /* renamed from: p */
    private C28994s f77471p;

    /* renamed from: q */
    private C33651a f77472q;

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return R.layout.a6g;
    }

    /* renamed from: c */
    public final void mo75208c() {
        this.f77470o.setVisibility(0);
        this.f61605b.setVisibility(8);
    }

    /* renamed from: d */
    public final void mo75209d() {
        if (getVisibility() == 0) {
            this.f77470o.setVisibility(8);
            if (this.f61605b.getVisibility() == 8) {
                setVisibility(8);
            }
        }
    }

    /* renamed from: i */
    private void m96601i() {
        String str;
        String m = C33230ac.m107238m(this.f61607d);
        MobClick value = MobClick.obtain().setEventName("mp_click").setLabelName(this.f61610g).setValue(m);
        C6869c cVar = new C6869c();
        String str2 = "request_id";
        if (this.f61612i == null) {
            str = "";
        } else {
            str = this.f61612i.optString("request_id");
        }
        C6907h.onEvent(value.setJsonObject(cVar.mo16887a(str2, str).mo16887a("group_id", m).mo16887a("content_type", C33230ac.m107240o(this.f61607d)).mo16888b()));
        C7167b.m22380b().mo18647a().openMiniApp((Context) this.f61611h, this.f61607d.getMicroAppInfo(), new C33472a().mo85791b(this.f61610g).mo85793d(m).mo85792c("025002").mo85790a());
    }

    /* renamed from: e */
    public final void mo75210e() {
        if (C23487o.m77153b((View) this.f61605b)) {
            onClick(this.f61605b);
        } else if (C23487o.m77153b(this.f77470o)) {
            onClick(this.f77470o);
        } else if (this.f77471p.mo74287c()) {
            this.f77471p.mo74281a();
        } else if (this.f61615l) {
            C6903bc.m21462C().mo87966a(this.f61606c, this.f61607d);
            m96600h();
        } else {
            if (C33651a.m108584b(this.f61607d)) {
                this.f77472q.mo86035a(this.f61607d.getUploadMiscInfoStruct().mvThemeId);
            }
        }
    }

    /* renamed from: f */
    public final void mo75211f() {
        String str;
        MicroAppInfo microAppInfo = this.f61607d.getMicroAppInfo();
        if (microAppInfo != null) {
            C7167b.m22380b().mo18647a().preloadMiniApp(microAppInfo.getAppId(), microAppInfo.getType());
            String m = C33230ac.m107238m(this.f61607d);
            MobClick value = MobClick.obtain().setEventName("mp_show").setLabelName(this.f61610g).setValue(m);
            C6869c cVar = new C6869c();
            String str2 = "request_id";
            if (this.f61612i == null) {
                str = "";
            } else {
                str = this.f61612i.optString("request_id");
            }
            C6907h.onEvent(value.setJsonObject(cVar.mo16887a(str2, str).mo16887a("group_id", m).mo16887a("content_type", C33230ac.m107240o(this.f61607d)).mo16888b()));
        }
    }

    /* renamed from: g */
    private void m96599g() {
        String str;
        String str2;
        String str3;
        if (this.f61612i == null) {
            str = "";
        } else {
            str = this.f61612i.optString("request_id");
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        String str4 = null;
        if (this.f61607d == null || this.f61607d.getOpenPlatformStruct() == null || this.f61607d.getOpenPlatformStruct().getRawData() == null) {
            str3 = null;
            str2 = null;
        } else {
            OpenPlatformRawData rawData = this.f61607d.getOpenPlatformStruct().getRawData();
            if (rawData.getBase() != null) {
                str2 = rawData.getBase().getClientKey();
            } else {
                str2 = null;
            }
            if (rawData.getShare() != null) {
                str4 = rawData.getShare().getStyleId();
                str3 = rawData.getShare().getShareId();
            } else {
                str3 = null;
            }
        }
        C6907h.m21524a("anchor_entrance_show", (Map) C22984d.m75611a().mo59973a(POIService.KEY_LOGPB, C28199ae.m92689a().mo71790a(logPbBean)).mo59973a("author_id", this.f61607d.getAuthorUid()).mo59973a("group_id", this.f61607d.getAid()).mo59973a("enter_from", this.f61610g).mo59973a("anchor_type", "third_party").mo59973a("client_key", str2).mo59973a("style_id", str4).mo59973a("share_id", str3).f60753a);
    }

    /* renamed from: h */
    private void m96600h() {
        String str;
        String str2;
        String str3;
        if (this.f61612i == null) {
            str = "";
        } else {
            str = this.f61612i.optString("request_id");
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        String str4 = null;
        if (this.f61607d == null || this.f61607d.getOpenPlatformStruct() == null || this.f61607d.getOpenPlatformStruct().getRawData() == null) {
            str3 = null;
            str2 = null;
        } else {
            OpenPlatformRawData rawData = this.f61607d.getOpenPlatformStruct().getRawData();
            if (rawData.getBase() != null) {
                str2 = rawData.getBase().getClientKey();
            } else {
                str2 = null;
            }
            if (rawData.getShare() != null) {
                str4 = rawData.getShare().getStyleId();
                str3 = rawData.getShare().getShareId();
            } else {
                str3 = null;
            }
        }
        C6907h.m21524a("anchor_entrance_click", (Map) C22984d.m75611a().mo59973a(POIService.KEY_LOGPB, C28199ae.m92689a().mo71790a(logPbBean)).mo59973a("author_id", this.f61607d.getAuthorUid()).mo59973a("group_id", this.f61607d.getAid()).mo59973a("enter_from", this.f61610g).mo59973a("anchor_type", "third_party").mo59973a("client_key", str2).mo59973a("style_id", str4).mo59973a("share_id", str3).f60753a);
    }

    /* renamed from: a */
    public final void mo60852a() {
        LayoutInflater.from(this.f61606c).inflate(getLayoutId(), this);
        int i = 0;
        setOrientation(0);
        this.f61608e = (int) C9738o.m28708b(getContext(), 5.0f);
        this.f61609f = -((int) C9738o.m28708b(getContext(), 0.0f));
        this.f61604a = (TextView) findViewById(R.id.buk);
        this.f61605b = (TextView) findViewById(R.id.u8);
        this.f77469n = (RemoteImageView) findViewById(R.id.bum);
        this.f77470o = findViewById(R.id.bul);
        C10804a aVar = new C10804a(0.5f, 1.0f);
        this.f61605b.setOnTouchListener(aVar);
        this.f77470o.setOnTouchListener(aVar);
        this.f61605b.setOnClickListener(this);
        this.f77470o.setOnClickListener(this);
        View view = this.f77470o;
        if (!((IPoiService) ServiceManager.get().getService(IPoiService.class)).showPoiEntrance()) {
            i = 8;
        }
        view.setVisibility(i);
        this.f77471p = new C28994s((TextView) findViewById(R.id.e2o));
        this.f77472q = new C33651a((FeedMvTagView) findViewById(R.id.dg5));
    }

    public FollowFeedTagLayout2(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.u8) {
            if (!(C27326a.m89578a(view) || this.f61607d == null || this.f61607d.getChallengeList() == null)) {
                Challenge challenge = (Challenge) this.f61607d.getChallengeList().get(0);
                if (challenge != null) {
                    String uuid = UUID.randomUUID().toString();
                    C7195s a = C7195s.m22438a();
                    Activity activity = this.f61611h;
                    StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                    sb.append(challenge.getCid());
                    C7203u a2 = C7203u.m22460a(sb.toString());
                    String str8 = "aweme_id";
                    if (this.f61607d != null) {
                        str = this.f61607d.getAid();
                    } else {
                        str = "";
                    }
                    C7203u a3 = a2.mo18694a(str8, str).mo18693a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType());
                    String str9 = "is_commerce";
                    if (C25242ao.m82976b(challenge)) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    a.mo18679a(activity, a3.mo18694a(str9, str2).mo18694a("process_id", uuid).mo18695a());
                    C6869c cVar = new C6869c();
                    String str10 = "request_id";
                    if (this.f61612i == null) {
                        str3 = "";
                    } else {
                        str3 = this.f61612i.optString("request_id");
                    }
                    C6869c a4 = cVar.mo16887a(str10, str3);
                    String str11 = "content_type";
                    if (this.f61607d == null) {
                        str4 = "";
                    } else if (this.f61607d.isImage()) {
                        str4 = "photo";
                    } else {
                        str4 = "video";
                    }
                    C6869c a5 = a4.mo16887a(str11, str4);
                    String str12 = "author_id";
                    if (this.f61607d == null) {
                        str5 = "";
                    } else {
                        str5 = this.f61607d.getAuthorUid();
                    }
                    JSONObject a6 = C6903bc.m21485d().mo75949a(a5.mo16887a(str12, str5).mo16888b(), this.f61607d, this.f61616m);
                    MobClick labelName = MobClick.obtain().setEventName("challenge_click").setLabelName(this.f61610g);
                    if (this.f61607d == null) {
                        str6 = "";
                    } else {
                        str6 = this.f61607d.getAid();
                    }
                    C6907h.onEvent(labelName.setValue(str6).setExtValueString(challenge.getCid()).setJsonObject(a6));
                    if (this.f61612i == null) {
                        str7 = "";
                    } else {
                        str7 = this.f61612i.optString("request_id");
                    }
                    if (C6319n.m19593a(str7)) {
                        str7 = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestId(this.f61607d, this.f61613j);
                    }
                    ((C33277s) new C33277s().mo85330f(this.f61610g).mo85071g(this.f61607d).mo85332i(this.f61616m).mo85334k(challenge.getCid()).mo85335o(uuid).mo85048a("click_in_video_name")).mo85336p(str7).mo85252e();
                    if (this.f61607d.isAd()) {
                        C24671f.m80851a().mo64673d(view.getContext(), this.f61607d);
                    }
                }
            }
        } else if (id == R.id.bul && !C27326a.m89578a(view)) {
            if (this.f61607d.getMicroAppInfo() != null) {
                m96601i();
                if (TextUtils.equals(this.f61610g, "general_search")) {
                    C24671f.m80851a().mo64672c(getContext(), this.f61607d, "result_ad");
                }
            } else if (this.f61615l) {
                C6903bc.m21462C().mo87966a(this.f61606c, this.f61607d);
                m96600h();
            } else {
                C6903bc.m21496o().mo88911a(this.f61606c, this.f61607d, this.f61610g, this.f61616m, this.f61612i, this);
            }
        }
    }

    public FollowFeedTagLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FollowFeedTagLayout2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61606c = context;
        mo60852a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75207a(com.p280ss.android.ugc.aweme.feed.model.Aweme r8, android.app.Activity r9, java.lang.String r10, org.json.JSONObject r11) {
        /*
            r7 = this;
            r7.f61607d = r8
            r7.f61610g = r10
            r7.f61611h = r9
            r7.f61612i = r11
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r7.f61607d
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r9 = r9.getStatus()
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r7.f61607d
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r9 = r9.getStatus()
            boolean r9 = r9.isWithGoods()
            if (r9 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r7.f61607d
            com.ss.android.ugc.aweme.commerce.model.SimplePromotion r9 = r9.getPromotion()
            if (r9 == 0) goto L_0x0028
            r9 = 1
            goto L_0x0029
        L_0x0028:
            r9 = 0
        L_0x0029:
            if (r9 != 0) goto L_0x0035
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r7.f61607d
            boolean r9 = com.p280ss.android.ugc.aweme.movie.p1404c.C33651a.m108584b(r9)
            if (r9 == 0) goto L_0x0035
            r9 = 1
            goto L_0x0036
        L_0x0035:
            r9 = 0
        L_0x0036:
            if (r9 != 0) goto L_0x0044
            com.ss.android.ugc.aweme.feed.ui.s r1 = r7.f77471p
            if (r1 == 0) goto L_0x0044
            boolean r1 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28994s.m95220a(r8)
            if (r1 == 0) goto L_0x0044
            r1 = 1
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            android.widget.TextView r2 = r7.f61605b
            r3 = 8
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.feed.ui.s r2 = r7.f77471p
            if (r2 == 0) goto L_0x005e
            com.ss.android.ugc.aweme.feed.ui.s r2 = r7.f77471p
            int r4 = r7.f61613j
            java.lang.String r5 = r7.f61610g
            r2.mo74283a(r4, r5, r11)
            com.ss.android.ugc.aweme.feed.ui.s r2 = r7.f77471p
            r2.mo74284b()
        L_0x005e:
            com.ss.android.ugc.aweme.movie.c.a r2 = r7.f77472q
            if (r2 == 0) goto L_0x0074
            com.ss.android.ugc.aweme.movie.c.a r2 = r7.f77472q
            int r4 = r7.f61613j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = r7.f61610g
            r2.mo86034a(r4, r5, r11)
            com.ss.android.ugc.aweme.movie.c.a r11 = r7.f77472q
            r11.mo86030a()
        L_0x0074:
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r7.f61607d
            com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo r11 = r11.getMicroAppInfo()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f61607d
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r2.getPoiStruct()
            r4 = 800(0x320, float:1.121E-42)
            if (r11 == 0) goto L_0x00ee
            android.view.View r8 = r7.f77470o
            r8.setVisibility(r0)
            int r8 = r11.getType()
            if (r8 != r10) goto L_0x00aa
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r8 = r7.f77469n
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r6 = "res"
            android.net.Uri$Builder r5 = r5.scheme(r6)
            java.lang.String r6 = "2131232941"
            android.net.Uri$Builder r5 = r5.path(r6)
            android.net.Uri r5 = r5.build()
            r8.setImageURI(r5)
            goto L_0x00d3
        L_0x00aa:
            r5 = 3
            if (r8 != r5) goto L_0x00b6
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r8 = r7.f77469n
            r5 = 2131232945(0x7f0808b1, float:1.8082014E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r8, r5)
            goto L_0x00d3
        L_0x00b6:
            r5 = 2
            if (r8 != r5) goto L_0x00d3
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r8 = r7.f77469n
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r6 = "res"
            android.net.Uri$Builder r5 = r5.scheme(r6)
            java.lang.String r6 = "2131232946"
            android.net.Uri$Builder r5 = r5.path(r6)
            android.net.Uri r5 = r5.build()
            r8.setImageURI(r5)
        L_0x00d3:
            android.widget.TextView r8 = r7.f61604a
            java.lang.String r5 = r11.getTitle()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x00e4
            java.lang.String r11 = r11.getName()
            goto L_0x00e8
        L_0x00e4:
            java.lang.String r11 = r11.getTitle()
        L_0x00e8:
            r8.setText(r11)
            r8 = 1
            goto L_0x017b
        L_0x00ee:
            boolean r11 = r7.mo60853b()
            if (r11 == 0) goto L_0x011b
            r7.f61615l = r10
            android.view.View r8 = r7.f77470o
            r8.setVisibility(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r8 = r7.f77469n
            r8.setVisibility(r0)
            android.widget.TextView r8 = r7.f61604a
            r8.setVisibility(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r8 = r7.f77469n
            java.lang.String r10 = r7.getOpenPlatformIcon()
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r8, r10)
            android.widget.TextView r8 = r7.f61604a
            java.lang.String r10 = r7.getOpenPlatformName()
            r8.setText(r10)
            r7.m96599g()
            goto L_0x017a
        L_0x011b:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r11 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.poi.service.IPoiService> r5 = com.p280ss.android.ugc.aweme.poi.service.IPoiService.class
            java.lang.Object r11 = r11.getService(r5)
            com.ss.android.ugc.aweme.poi.service.IPoiService r11 = (com.p280ss.android.ugc.aweme.poi.service.IPoiService) r11
            boolean r11 = r11.showPoiEntrance()
            if (r11 == 0) goto L_0x0145
            if (r2 == 0) goto L_0x0145
            java.lang.String r11 = r2.poiId
            boolean r11 = com.bytedance.common.utility.C6319n.m19593a(r11)
            if (r11 != 0) goto L_0x0145
            android.view.View r8 = r7.f77470o
            r8.setVisibility(r0)
            android.widget.TextView r8 = r7.f61604a
            java.lang.String r11 = r2.poiName
            r8.setText(r11)
            r8 = 0
            goto L_0x017c
        L_0x0145:
            if (r9 == 0) goto L_0x0169
            android.view.View r8 = r7.f77470o
            r8.setVisibility(r3)
            com.ss.android.ugc.aweme.movie.c.a r8 = r7.f77472q
            r10 = 2131231197(0x7f0801dd, float:1.8078468E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.mo86033a(r10)
            com.ss.android.ugc.aweme.movie.c.a r8 = r7.f77472q
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r7.f61607d
            r8.mo86031a(r10)
            com.ss.android.ugc.aweme.movie.c.a r8 = r7.f77472q
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r7.f61607d
            java.lang.String r11 = "anchor_entrance_show"
            r8.mo86032a(r10, r11)
            goto L_0x017a
        L_0x0169:
            if (r1 == 0) goto L_0x017a
            android.view.View r10 = r7.f77470o
            r10.setVisibility(r3)
            com.ss.android.ugc.aweme.feed.ui.s r10 = r7.f77471p
            r10.mo74282a(r4)
            com.ss.android.ugc.aweme.feed.ui.s r10 = r7.f77471p
            r10.mo74285b(r8)
        L_0x017a:
            r8 = 0
        L_0x017b:
            r10 = 0
        L_0x017c:
            boolean r11 = r7.f61615l
            if (r11 != 0) goto L_0x018c
            if (r10 != 0) goto L_0x018c
            if (r1 != 0) goto L_0x018c
            if (r8 != 0) goto L_0x018c
            if (r9 != 0) goto L_0x018c
            r7.setVisibility(r3)
            return
        L_0x018c:
            r7.setVisibility(r0)
            if (r10 == 0) goto L_0x0199
            android.widget.TextView r8 = r7.f61604a
            r8.setMaxWidth(r4)
            r7.mo75208c()
        L_0x0199:
            if (r10 == 0) goto L_0x01a4
            com.ss.android.ugc.aweme.poi.c r8 = com.p280ss.android.ugc.aweme.C6903bc.m21496o()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r9 = r7.f77469n
            r8.mo88913a(r9, r2)
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedTagLayout2.mo75207a(com.ss.android.ugc.aweme.feed.model.Aweme, android.app.Activity, java.lang.String, org.json.JSONObject):void");
    }
}
