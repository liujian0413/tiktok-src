package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.app.download.p1031b.C22934a;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22944c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.commerce.CommerceInfo;
import com.p280ss.android.ugc.aweme.commerce.OfflineInfo;
import com.p280ss.android.ugc.aweme.commerce.SmartPhone;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24509a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25280bm;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25337b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36694aa;
import com.p280ss.android.ugc.aweme.profile.util.C36736i;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout */
public class EnterpriseTransformLayout extends LinearLayout {

    /* renamed from: j */
    private static final int f94621j = ((int) C9738o.m28708b((Context) AwemeApplication.m21341a(), 4.0f));

    /* renamed from: k */
    private static final int f94622k = ((int) C9738o.m28708b((Context) AwemeApplication.m21341a(), 16.0f));

    /* renamed from: l */
    private static final int f94623l = ((int) C9738o.m28708b((Context) AwemeApplication.m21341a(), 20.0f));

    /* renamed from: a */
    DmtTextView f94624a;

    /* renamed from: b */
    DmtTextView f94625b;

    /* renamed from: c */
    DmtTextView f94626c;

    /* renamed from: d */
    View f94627d;

    /* renamed from: e */
    List<String> f94628e;

    /* renamed from: f */
    List<String> f94629f;

    /* renamed from: g */
    SparseBooleanArray f94630g;

    /* renamed from: h */
    Drawable f94631h;

    /* renamed from: i */
    public TextView f94632i;

    /* renamed from: m */
    private User f94633m;

    /* renamed from: n */
    private Context f94634n;

    /* renamed from: o */
    private Aweme f94635o;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout$a */
    interface C36149a {
        /* renamed from: a */
        boolean mo92009a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92001a(C36149a aVar, String str, View view) {
        if (aVar != null) {
            aVar.mo92009a();
        }
        m116617b(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92002a(C36149a aVar, String str, OfflineInfo offlineInfo, String str2, View view) {
        if (aVar == null || !aVar.mo92009a()) {
            C36736i.m118418a(view.getContext(), str, C6399b.m19944t() ? offlineInfo.getText() : null);
        }
        m116617b(str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92003a(C36149a aVar, String str, String str2, View view) {
        if (aVar == null || !aVar.mo92009a()) {
            m116615a(str, str2);
        }
        m116617b(str2);
    }

    /* renamed from: c */
    static final /* synthetic */ boolean m116618c() {
        try {
            C7195s.m22438a().mo18682a(C30199h.m98861a().getAwemeFeElite().getEditContactLink());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private boolean m116619d() {
        if (this.f94633m == null) {
            return false;
        }
        return TextUtils.equals(C21115b.m71197a().getCurUserId(), this.f94633m.getUid());
    }

    /* renamed from: e */
    private Drawable m116620e() {
        if (this.f94631h == null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.a19});
            try {
                this.f94631h = obtainStyledAttributes.getDrawable(0);
            } catch (UnsupportedOperationException e) {
                C6921a.m21559a((Throwable) e);
            }
            obtainStyledAttributes.recycle();
        }
        return this.f94631h;
    }

    /* renamed from: a */
    public final void mo91999a() {
        if (this.f94627d != null && this.f94624a != null && this.f94625b != null && this.f94626c != null) {
            if (this.f94624a.getVisibility() == 0 && this.f94625b.getVisibility() == 0) {
                m116612a((View) this.f94625b, 0);
                this.f94627d.setVisibility(0);
            }
            this.f94624a.setFontType(C10834d.f29332b);
            this.f94625b.setFontType(C10834d.f29332b);
            this.f94626c.setFontType(C10834d.f29332b);
        }
    }

    /* renamed from: b */
    public final void mo92004b() {
        String str;
        int i;
        if (!C6307b.m19566a((Collection<T>) this.f94628e) && this.f94633m != null && !TextUtils.isEmpty(this.f94633m.getUid())) {
            if (m116619d()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            for (int i2 = 0; i2 < this.f94628e.size(); i2++) {
                String str2 = (String) this.f94628e.get(i2);
                String str3 = (String) this.f94629f.get(i2);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    C6907h.m21521a(getContext(), "show_link", str, this.f94633m.getUid(), "0", m116611a(str2));
                    C6907h.m21524a("show_link", (Map) C22984d.m75611a().mo59973a("author_id", this.f94633m.getUid()).mo59973a("enter_from", str).mo59973a("link_type", str2).f60753a);
                    if (TextUtils.equals(str2, "micro_app") || TextUtils.equals(str2, "micro_game")) {
                        String queryParameter = Uri.parse(str3).getQueryParameter("app_id");
                        IMiniAppService a = C7167b.m22380b().mo18647a();
                        if (TextUtils.equals(str2, "micro_app")) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        a.preloadMiniApp(queryParameter, i);
                        C6907h.m21524a("mp_show", (Map) C22984d.m75611a().mo59973a("mp_id", queryParameter).mo59973a("author_id", this.f94633m.getUid()).mo59973a("enter_from", str).mo59973a("position", "in_video_tag").mo59973a("_param_for_special", str2).f60753a);
                    }
                }
            }
        }
    }

    public EnterpriseTransformLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static JSONObject m116611a(String str) {
        C6909j jVar = new C6909j();
        jVar.mo16966a("link_type", str);
        return jVar.mo16967a();
    }

    /* renamed from: b */
    private void m116617b(String str) {
        String str2;
        String str3;
        if (this.f94633m != null) {
            if (this.f94635o != null && C25352e.m83224g(this.f94635o)) {
                C24976t.m82005K(getContext(), this.f94635o);
            }
            Context context = getContext();
            String str4 = "click_link";
            if (m116619d()) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            C6907h.m21521a(context, str4, str2, this.f94633m.getUid(), "0", m116611a(str));
            String str5 = "click_link";
            C22984d a = C22984d.m75611a().mo59973a("author_id", this.f94633m.getUid());
            String str6 = "enter_from";
            if (m116619d()) {
                str3 = "personal_homepage";
            } else {
                str3 = "others_homepage";
            }
            C6907h.m21524a(str5, (Map) a.mo59973a(str6, str3).mo59973a("link_type", str).f60753a);
            if (C25352e.m83221d(this.f94635o)) {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -718695931) {
                    if (hashCode != 31634769) {
                        if (hashCode == 106642798 && str.equals("phone")) {
                            c = 0;
                        }
                    } else if (str.equals("download_link")) {
                        c = 1;
                    }
                } else if (str.equals("web_link")) {
                    c = 2;
                }
                switch (c) {
                    case 0:
                        C24976t.m82091aD(getContext(), this.f94635o);
                        return;
                    case 1:
                        C24976t.m82090aC(getContext(), this.f94635o);
                        return;
                    case 2:
                        C24976t.m82092aE(getContext(), this.f94635o);
                        break;
                }
            }
        }
    }

    public EnterpriseTransformLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static void m116612a(View view, int i) {
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = i;
            if (VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(i);
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    private boolean m116616a(TextView textView, OfflineInfo offlineInfo) {
        if (textView == null || offlineInfo == null) {
            return false;
        }
        String text = offlineInfo.getText();
        if (TextUtils.isEmpty(text)) {
            return false;
        }
        Paint paint = new Paint();
        paint.setTextSize(textView.getTextSize());
        if (paint.measureText(text) > C9738o.m28708b(getContext(), 250.0f)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m116614a(String str, Context context) {
        String str2;
        C19535g a = DownloaderManagerHolder.m75524a();
        MobClick value = new MobClick().setValue(this.f94633m.getUid());
        C6869c cVar = new C6869c();
        String str3 = "homepage_type";
        if (C36694aa.m118347a(this.f94633m)) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        a.mo51666a(context, 0, null, C22944c.m75517a(str, value.setJsonObject(cVar.mo16887a(str3, str2).mo16888b())));
        C22934a.m75490a().mo59933a(str);
    }

    /* renamed from: a */
    private void m116615a(String str, String str2) {
        String str3;
        String str4;
        if (!TextUtils.isEmpty(str)) {
            String queryParameter = Uri.parse(str).getQueryParameter("app_id");
            if (m116619d()) {
                str3 = "personal_homepage";
            } else {
                str3 = "others_homepage";
            }
            C6907h.m21524a("mp_click", (Map) C22984d.m75611a().mo59973a("mp_id", queryParameter).mo59973a("author_id", this.f94633m.getUid()).mo59973a("enter_from", str3).mo59973a("position", "in_video_tag").mo59973a("_param_for_special", str2).f60753a);
            C33472a aVar = new C33472a();
            if (m116619d()) {
                str4 = "personal_homepage";
            } else {
                str4 = "others_homepage";
            }
            C7167b.m22380b().mo18647a().openMiniApp(getContext(), str, aVar.mo85791b(str4).mo85789a("elite").mo85792c("023003").mo85790a());
            if (C25352e.m83224g(this.f94635o)) {
                C24976t.m82279t(this.f94634n, this.f94635o, "homepage_ad");
            }
        }
    }

    /* renamed from: a */
    public final void mo92000a(User user, Aweme aweme) {
        ArrayList arrayList;
        DmtTextView dmtTextView;
        this.f94633m = user;
        setVisibility(8);
        this.f94624a.setVisibility(8);
        this.f94625b.setVisibility(8);
        this.f94626c.setVisibility(8);
        if (user != null) {
            this.f94633m = user;
            this.f94635o = aweme;
            CommerceInfo commerceInfo = user.getCommerceInfo();
            if (commerceInfo != null) {
                C36149a aVar = null;
                if (commerceInfo.getOfflineInfoList() != null) {
                    arrayList = new ArrayList(commerceInfo.getOfflineInfoList());
                } else {
                    arrayList = null;
                }
                if (!C6399b.m19944t() && C43122ff.m136787r(user) && C43122ff.m136783n(user)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (arrayList.size() < 2) {
                        OfflineInfo offlineInfo = new OfflineInfo();
                        try {
                            offlineInfo.setText(C30199h.m98861a().getEPlatformSettings().getProfileAddContactInfoText());
                            offlineInfo.setAction(C30199h.m98861a().getAwemeFeElite().getEditContactLink());
                        } catch (Exception unused) {
                            offlineInfo.setText("");
                            offlineInfo.setAction("");
                        }
                        offlineInfo.setOfflineInfoType(-137);
                        arrayList.add(offlineInfo);
                    }
                    aVar = C36329aa.f95458a;
                }
                if (!C6307b.m19566a((Collection<T>) arrayList)) {
                    setVisibility(0);
                    if (arrayList.size() > 0) {
                        m116613a(this.f94624a, (OfflineInfo) arrayList.get(0), 0, aVar);
                        new Paint().setTextSize(this.f94624a.getTextSize());
                        if (arrayList.size() > 1) {
                            if (m116616a((TextView) this.f94625b, (OfflineInfo) arrayList.get(1))) {
                                dmtTextView = this.f94626c;
                            } else {
                                dmtTextView = this.f94625b;
                            }
                            m116613a(dmtTextView, (OfflineInfo) arrayList.get(1), 1, aVar);
                        }
                    }
                }
            }
        }
    }

    public EnterpriseTransformLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f94628e = new ArrayList();
        this.f94629f = new ArrayList();
        this.f94630g = new SparseBooleanArray(2);
        LayoutInflater.from(context).inflate(R.layout.v4, this);
        setOrientation(1);
        this.f94624a = (DmtTextView) findViewById(R.id.dna);
        this.f94625b = (DmtTextView) findViewById(R.id.dnd);
        this.f94626c = (DmtTextView) findViewById(R.id.dne);
        this.f94627d = findViewById(R.id.a86);
        this.f94628e.clear();
        this.f94629f.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92005b(C36149a aVar, String str, String str2, View view) {
        if (aVar == null || !aVar.mo92009a()) {
            m116615a(str, str2);
        }
        m116617b(str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo92007d(C36149a aVar, String str, String str2, View view) {
        String str3;
        if (aVar == null || !aVar.mo92009a()) {
            if (!TextUtils.isEmpty(str)) {
                C19290j jVar = new C19290j(str);
                String str4 = "enter_from";
                if (C43122ff.m136787r(this.f94633m)) {
                    str3 = "personal_homepage";
                } else {
                    str3 = "others_homepage";
                }
                jVar.mo51188a(str4, str3);
                jVar.mo51188a("content_source", "personal_information");
                str = jVar.mo51184a();
            }
            C7195s.m22438a().mo18682a(str);
        }
        m116617b(str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo92006c(C36149a aVar, String str, String str2, View view) {
        if (aVar == null || !aVar.mo92009a()) {
            Uri parse = Uri.parse(str);
            if (!C6399b.m19944t() || !C25337b.m83265a(parse)) {
                if (!C6399b.m19945u() || str.endsWith(".apk")) {
                    m116614a(str, this.f94634n);
                    C36736i.m118417a(this.f94634n, str, this.f94633m);
                } else {
                    SmartRouter.buildRoute(this.f94634n, "aweme://webview/").withParam("url", str).withParam("bundle_enable_open_browser_to_download_apk", true).open();
                }
            } else if (C25337b.m83261a(getContext())) {
                C25337b.m83266b(getContext(), parse);
            }
        }
        m116617b(str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo92008e(C36149a aVar, String str, String str2, View view) {
        if (aVar == null || !aVar.mo92009a()) {
            SmartPhone b = C25352e.m83350b(this.f94633m);
            String a = C25352e.m83324a(this.f94633m);
            if (!(this.f94634n instanceof Activity) || TextUtils.isEmpty(a)) {
                C36736i.m118416a(getContext(), str);
            } else {
                C25280bm.m83074a().mo65891a((Activity) this.f94634n, b.getPhoneNumber(), b.getPhoneId(), b.getEncryptKey(), "homepage_ad");
            }
        }
        m116617b(str2);
    }

    /* renamed from: a */
    private void m116613a(DmtTextView dmtTextView, OfflineInfo offlineInfo, int i, C36149a aVar) {
        boolean z;
        C24509a aVar2;
        String str;
        String str2;
        int i2;
        String str3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        DmtTextView dmtTextView2 = dmtTextView;
        int i9 = i;
        C36149a aVar3 = aVar;
        if (offlineInfo == null) {
            dmtTextView2.setText("");
            return;
        }
        this.f94632i = dmtTextView2;
        if (C6399b.m19946v()) {
            dmtTextView2.setTextColor(getResources().getColor(R.color.a2w));
            dmtTextView2.setTextSize(14.0f);
        } else if (((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
            dmtTextView2.setTextColor(getResources().getColor(R.color.a79));
        } else {
            dmtTextView2.setTextColor(getResources().getColor(R.color.a71));
        }
        if (C6399b.m19944t()) {
            dmtTextView2.setFontType(C10834d.f29337g);
        }
        dmtTextView2.setVisibility(0);
        this.f94634n = C6405d.m19984g();
        if (this.f94634n != null) {
            String str4 = "[label] ";
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(offlineInfo.getText());
            SpannableString spannableString = new SpannableString(sb.toString());
            C24509a aVar4 = null;
            String action = offlineInfo.getAction();
            if (!TextUtils.isEmpty(action)) {
                boolean g = C7213d.m22500a().mo18807g();
                if (g || C6399b.m19947w()) {
                    z = true;
                } else {
                    z = false;
                }
                int offlineInfoType = offlineInfo.getOfflineInfoType();
                if (offlineInfoType != -137) {
                    switch (offlineInfoType) {
                        case 1:
                            String str5 = "web_link";
                            Context context = dmtTextView.getContext();
                            if (z) {
                                i3 = R.drawable.avf;
                            } else {
                                i3 = R.drawable.ave;
                            }
                            C36334af afVar = r0;
                            C24509a aVar5 = new C24509a(context, i3);
                            C36334af afVar2 = new C36334af(this, aVar, action, offlineInfo, str5);
                            dmtTextView2.setOnClickListener(afVar);
                            str = str5;
                            aVar2 = aVar5;
                            break;
                        case 2:
                            str = "download_link";
                            Context context2 = dmtTextView.getContext();
                            if (z) {
                                i4 = R.drawable.arn;
                            } else {
                                i4 = R.drawable.arm;
                            }
                            aVar2 = new C24509a(context2, i4);
                            dmtTextView2.setOnClickListener(new C36333ae(this, aVar3, action, str));
                            break;
                        case 3:
                            str = "phone";
                            Context context3 = dmtTextView.getContext();
                            if (z) {
                                i5 = R.drawable.b1l;
                            } else {
                                i5 = R.drawable.b1k;
                            }
                            aVar2 = new C24509a(context3, i5);
                            dmtTextView2.setOnClickListener(new C36331ac(this, aVar3, action, str));
                            break;
                        case 4:
                            str = "address";
                            Context context4 = dmtTextView.getContext();
                            if (z) {
                                i6 = R.drawable.avk;
                            } else {
                                i6 = R.drawable.avj;
                            }
                            aVar2 = new C24509a(context4, i6);
                            dmtTextView2.setOnClickListener(new C36332ad(this, aVar3, action, str));
                            break;
                        case 5:
                            str = "micro_app";
                            Context context5 = dmtTextView.getContext();
                            if (z) {
                                i7 = R.drawable.aw9;
                            } else {
                                i7 = R.drawable.aw8;
                            }
                            aVar2 = new C24509a(context5, i7);
                            dmtTextView2.setOnClickListener(new C36335ag(this, aVar3, action, str));
                            break;
                        case 6:
                            str = "micro_game";
                            Context context6 = dmtTextView.getContext();
                            if (z) {
                                i8 = R.drawable.awd;
                            } else {
                                i8 = R.drawable.awc;
                            }
                            aVar2 = new C24509a(context6, i8);
                            dmtTextView2.setOnClickListener(new C36336ah(this, aVar3, action, str));
                            break;
                        default:
                            str3 = "";
                            break;
                    }
                } else {
                    str3 = "contact_information";
                    aVar4 = new C24509a(dmtTextView.getContext(), R.drawable.arx);
                    dmtTextView2.setOnClickListener(new C36330ab(this, aVar3, str3));
                    dmtTextView2.setTextColor(getResources().getColor(R.color.iq));
                }
                aVar2 = aVar4;
                str = str3;
                if (this.f94633m != null && !TextUtils.isEmpty(this.f94633m.getUid()) && !this.f94630g.get(i9)) {
                    this.f94628e.add(str);
                    this.f94629f.add(action);
                    this.f94630g.put(i9, true);
                    if (m116619d()) {
                        str2 = "personal_homepage";
                    } else {
                        str2 = "others_homepage";
                    }
                    C6907h.m21521a(getContext(), "show_link", str2, this.f94633m.getUid(), "0", m116611a(str));
                    C6907h.m21524a("show_link", (Map) C22984d.m75611a().mo59973a("author_id", this.f94633m.getUid()).mo59973a("enter_from", str2).mo59973a("link_type", str).f60753a);
                    if (TextUtils.equals(str, "micro_app") || TextUtils.equals(str, "micro_game")) {
                        String queryParameter = Uri.parse(action).getQueryParameter("app_id");
                        IMiniAppService a = C7167b.m22380b().mo18647a();
                        if (TextUtils.equals(str, "micro_app")) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        a.preloadMiniApp(queryParameter, i2);
                        C6907h.m21524a("mp_show", (Map) C22984d.m75611a().mo59973a("mp_id", queryParameter).mo59973a("author_id", this.f94633m.getUid()).mo59973a("enter_from", str2).mo59973a("position", "in_video_tag").mo59973a("_param_for_special", str).f60753a);
                    }
                }
                if (aVar2 != null) {
                    spannableString.setSpan(aVar2, 0, str4.length() - 1, 17);
                    dmtTextView2.setText(spannableString);
                    if (g) {
                        if (VERSION.SDK_INT >= 23) {
                            dmtTextView2.setForeground(m116620e());
                        }
                        if (dmtTextView2 == this.f94625b) {
                            m116612a((View) dmtTextView2, f94621j);
                        }
                        if (dmtTextView.getLayoutParams().height != f94623l) {
                            dmtTextView.getLayoutParams().height = f94623l;
                            dmtTextView2.setLayoutParams(dmtTextView.getLayoutParams());
                        }
                    } else {
                        if (dmtTextView2 == this.f94625b) {
                            m116612a((View) dmtTextView2, f94622k);
                        }
                        if (dmtTextView.getLayoutParams().height != -2) {
                            dmtTextView.getLayoutParams().height = -2;
                            dmtTextView2.setLayoutParams(dmtTextView.getLayoutParams());
                        }
                    }
                    C43081e.m136670a(dmtTextView);
                }
            }
        }
    }
}
