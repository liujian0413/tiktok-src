package com.p280ss.android.ugc.aweme.money.growth;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.NullValueException;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42705g;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.money.growth.c */
public final class C33633c {

    /* renamed from: g */
    public static boolean f87775g;

    /* renamed from: h */
    public static final C33633c f87776h = C33635b.m108555a();

    /* renamed from: i */
    public static final C33634a f87777i = new C33634a(null);

    /* renamed from: a */
    public UgAwemeActivitySetting f87778a;

    /* renamed from: b */
    public final List<C7562b<UgAwemeActivitySetting, C7581n>> f87779b;

    /* renamed from: c */
    public final C33631b f87780c;

    /* renamed from: d */
    public String f87781d;

    /* renamed from: e */
    public boolean f87782e;

    /* renamed from: f */
    public boolean f87783f;

    /* renamed from: com.ss.android.ugc.aweme.money.growth.c$a */
    public static final class C33634a {
        private C33634a() {
        }

        /* renamed from: a */
        public static boolean m108553a() {
            return C33633c.f87775g;
        }

        /* renamed from: b */
        public static C33633c m108554b() {
            return C33633c.f87776h;
        }

        public /* synthetic */ C33634a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.c$b */
    static final class C33635b {

        /* renamed from: a */
        public static final C33635b f87784a = new C33635b();

        /* renamed from: b */
        private static final C33633c f87785b = new C33633c(null);

        private C33635b() {
        }

        /* renamed from: a */
        public static C33633c m108555a() {
            return f87785b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.c$c */
    static final class C33636c<T> implements C23319b<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ C33633c f87786a;

        C33636c(C33633c cVar) {
            this.f87786a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Bitmap bitmap) {
            if (bitmap != null && this.f87786a.f87782e && !this.f87786a.f87783f) {
                C33633c.m108533b("素材准备好，自动展示弹窗");
                C33633c.m108537d();
            }
        }
    }

    /* renamed from: b */
    public static void m108533b(String str) {
        C7573i.m23587b(str, "msg");
    }

    /* renamed from: d */
    public static void m108537d() {
        C42961az.m136380a(new C42705g());
    }

    /* renamed from: g */
    private final void m108540g() {
        this.f87782e = true;
        if (!this.f87783f) {
            m108533b("不是第一个视频，自动展示弹窗");
            m108537d();
        }
    }

    private C33633c() {
        this.f87779b = new ArrayList();
        this.f87780c = new C33631b();
        this.f87783f = true;
        m108538e();
        this.f87781d = this.f87780c.f87773c;
    }

    /* renamed from: f */
    private void m108539f() {
        this.f87780c.mo86013a(false);
        this.f87780c.mo86011a(0);
        this.f87780c.mo86012a("");
    }

    /* renamed from: i */
    private final boolean m108542i() {
        UrlModel urlModel;
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f87778a;
            if (ugAwemeActivitySetting != null) {
                UgChannelPopup channelPopup = ugAwemeActivitySetting.getChannelPopup();
                if (channelPopup != null) {
                    urlModel = channelPopup.getResourceUrl();
                    return m108534b(urlModel);
                }
            }
            urlModel = null;
            return m108534b(urlModel);
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: k */
    private final boolean m108544k() {
        UrlModel urlModel;
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f87778a;
            if (ugAwemeActivitySetting != null) {
                UgLoginBanner loginBanner = ugAwemeActivitySetting.getLoginBanner();
                if (loginBanner != null) {
                    urlModel = loginBanner.getResourceUrl();
                    return m108534b(urlModel);
                }
            }
            urlModel = null;
            return m108534b(urlModel);
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: e */
    private final void m108538e() {
        m108533b(" initActivityEntry");
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            this.f87778a = a.getAwemeActivitySetting();
            m108541h();
            if (m108546m()) {
                m108542i();
                m108543j();
            }
            m108544k();
        } catch (NullValueException unused) {
            m108533b(" initEntry 时NullValueException");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[Catch:{ NullValueException -> 0x0026 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m108541h() {
        /*
            r1 = this;
            java.lang.String r0 = r1.f87781d     // Catch:{ NullValueException -> 0x0026 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullValueException -> 0x0026 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NullValueException -> 0x0026 }
            if (r0 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r1.f87778a     // Catch:{ NullValueException -> 0x0026 }
            if (r0 == 0) goto L_0x0019
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ NullValueException -> 0x0026 }
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.getCampaignName()     // Catch:{ NullValueException -> 0x0026 }
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullValueException -> 0x0026 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NullValueException -> 0x0026 }
            if (r0 != 0) goto L_0x0026
            com.p280ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi.C33621a.m108515b()     // Catch:{ NullValueException -> 0x0026 }
            return
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.money.growth.C33633c.m108541h():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b A[Catch:{ NullValueException -> 0x0033 }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m108543j() {
        /*
            r5 = this;
            java.lang.String r0 = "tryLoadCouponIconImage"
            m108533b(r0)
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r5.f87778a     // Catch:{ NullValueException -> 0x0033 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton r0 = r0.getProfileActivityButton()     // Catch:{ NullValueException -> 0x0033 }
            if (r0 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r0 = r0.getResourceUrl()     // Catch:{ NullValueException -> 0x0033 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            boolean r2 = r5.m108534b(r0)     // Catch:{ NullValueException -> 0x0033 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NullValueException -> 0x0033 }
            java.lang.String r4 = "加载结果："
            r3.<init>(r4)     // Catch:{ NullValueException -> 0x0033 }
            r3.append(r2)     // Catch:{ NullValueException -> 0x0033 }
            java.lang.String r2 = " resourceUrl:"
            r3.append(r2)     // Catch:{ NullValueException -> 0x0033 }
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = r0.getUri()     // Catch:{ NullValueException -> 0x0033 }
        L_0x002f:
            r3.append(r1)     // Catch:{ NullValueException -> 0x0033 }
            return
        L_0x0033:
            java.lang.String r0 = "tryLoadCouponIconImage:NullValueException"
            m108533b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.money.growth.C33633c.m108543j():void");
    }

    /* renamed from: l */
    private final void m108545l() {
        for (C7562b invoke : C7525m.m23516h((Iterable<? extends T>) this.f87779b)) {
            invoke.invoke(this.f87778a);
        }
    }

    /* renamed from: b */
    public final void mo86018b() {
        f87775g = true;
        m108538e();
        if (this.f87778a != null) {
            try {
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f87778a;
                if (ugAwemeActivitySetting == null) {
                    C7573i.m23580a();
                }
                if (!ugAwemeActivitySetting.getOverallSwitch().booleanValue()) {
                    m108539f();
                }
            } catch (NullValueException unused) {
            }
            m108545l();
        } else {
            m108533b("settingRequestComplete -> activityEntry 为空");
        }
        if (this.f87782e && !this.f87783f) {
            m108537d();
        }
    }

    /* renamed from: m */
    private final boolean m108546m() {
        CharSequence charSequence;
        if (this.f87780c.f87771a == 2) {
            m108533b("DeepLink不展示： 已展示过");
            return false;
        } else if (this.f87780c.f87771a == 1) {
            return true;
        } else {
            try {
                CharSequence charSequence2 = this.f87781d;
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f87778a;
                UgChannelPopup ugChannelPopup = null;
                if (ugAwemeActivitySetting != null) {
                    charSequence = ugAwemeActivitySetting.getActivityId();
                } else {
                    charSequence = null;
                }
                if (!TextUtils.equals(charSequence2, charSequence)) {
                    StringBuilder sb = new StringBuilder("DeepLink不展示： DeepLinkID != activityId--->");
                    sb.append(this.f87781d);
                    m108533b(sb.toString());
                    return false;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f87778a;
                if (ugAwemeActivitySetting2 != null) {
                    ugChannelPopup = ugAwemeActivitySetting2.getChannelPopup();
                }
                if (ugChannelPopup == null) {
                    m108533b("DeepLink不展示： channelPopup==null");
                    return false;
                }
                this.f87780c.mo86011a(1);
                return true;
            } catch (NullValueException unused) {
                m108533b("DeepLink不展示： setting数据为null");
                return false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo86015a() {
        Boolean valueOf = Boolean.valueOf(false);
        if (this.f87778a != null) {
            try {
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f87778a;
                if (ugAwemeActivitySetting != null) {
                    List activityTasks = ugAwemeActivitySetting.getActivityTasks();
                    if (activityTasks != null) {
                        valueOf = Boolean.valueOf(!activityTasks.isEmpty());
                    }
                }
                valueOf = null;
            } catch (NullValueException unused) {
            }
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[Catch:{ NullValueException -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[Catch:{ NullValueException -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057 A[Catch:{ NullValueException -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d A[Catch:{ NullValueException -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0075 A[Catch:{ NullValueException -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007b A[Catch:{ NullValueException -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0093 A[Catch:{ NullValueException -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0099 A[Catch:{ NullValueException -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b7 A[Catch:{ NullValueException -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd A[Catch:{ NullValueException -> 0x00c7 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup mo86019c() {
        /*
            r2 = this;
            r0 = 0
            r2.f87783f = r0
            boolean r0 = f87775g
            r1 = 0
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "DeepLink不展示： setting接口未返回，啥都不干"
            m108533b(r0)
            return r1
        L_0x000e:
            boolean r0 = r2.m108546m()
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            boolean r0 = r2.m108542i()
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "DeepLink不展示： 素材未准备好"
            m108533b(r0)
            return r1
        L_0x0021:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f87778a     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r0.getButtonText()     // Catch:{ NullValueException -> 0x00c7 }
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullValueException -> 0x00c7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "DeepLink不展示： activityEntry?.channelPopup?.buttonText is empty"
            m108533b(r0)     // Catch:{ NullValueException -> 0x00c7 }
            return r1
        L_0x003f:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f87778a     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x004e
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = r0.getContent()     // Catch:{ NullValueException -> 0x00c7 }
            goto L_0x004f
        L_0x004e:
            r0 = r1
        L_0x004f:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullValueException -> 0x00c7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "DeepLink不展示： activityEntry?.channelPopup?.content is empty"
            m108533b(r0)     // Catch:{ NullValueException -> 0x00c7 }
            return r1
        L_0x005d:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f87778a     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r0.getTitle()     // Catch:{ NullValueException -> 0x00c7 }
            goto L_0x006d
        L_0x006c:
            r0 = r1
        L_0x006d:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullValueException -> 0x00c7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "DeepLink不展示： activityEntry?.channelPopup?.title is empty"
            m108533b(r0)     // Catch:{ NullValueException -> 0x00c7 }
            return r1
        L_0x007b:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f87778a     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r0.getH5Link()     // Catch:{ NullValueException -> 0x00c7 }
            goto L_0x008b
        L_0x008a:
            r0 = r1
        L_0x008b:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullValueException -> 0x00c7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = "DeepLink不展示： activityEntry?.channelPopup?.h5Link is empty"
            m108533b(r0)     // Catch:{ NullValueException -> 0x00c7 }
            return r1
        L_0x0099:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f87778a     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r0 = r0.getResourceUrl()     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x00ae
            java.util.List r0 = r0.getUrlList()     // Catch:{ NullValueException -> 0x00c7 }
            goto L_0x00af
        L_0x00ae:
            r0 = r1
        L_0x00af:
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ NullValueException -> 0x00c7 }
            boolean r0 = com.p280ss.android.ugc.aweme.base.utils.C23477d.m77081a(r0)     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = "DeepLink不展示： activityEntry?.channelPopup?.resourceUrl is empty"
            m108533b(r0)     // Catch:{ NullValueException -> 0x00c7 }
            return r1
        L_0x00bd:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.f87778a     // Catch:{ NullValueException -> 0x00c7 }
            if (r0 == 0) goto L_0x00c6
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ NullValueException -> 0x00c7 }
            return r0
        L_0x00c6:
            return r1
        L_0x00c7:
            java.lang.String r0 = "DeepLink不展示： setting channelPopup 字段为空"
            m108533b(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.money.growth.C33633c.mo86019c():com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup");
    }

    public /* synthetic */ C33633c(C7571f fVar) {
        this();
    }

    /* renamed from: b */
    private final boolean m108534b(UrlModel urlModel) {
        com.p280ss.android.ugc.aweme.base.model.UrlModel c = m108535c(urlModel);
        if (mo86016a(urlModel)) {
            return true;
        }
        C23323e.m76501a(c, 0, 0, (C23319b<Bitmap>) new C33636c<Bitmap>(this));
        return false;
    }

    /* renamed from: c */
    private static com.p280ss.android.ugc.aweme.base.model.UrlModel m108535c(UrlModel urlModel) {
        List list;
        com.p280ss.android.ugc.aweme.base.model.UrlModel urlModel2 = new com.p280ss.android.ugc.aweme.base.model.UrlModel();
        String str = null;
        if (urlModel != null) {
            try {
                list = urlModel.getUrlList();
            } catch (NullValueException unused) {
            }
        } else {
            list = null;
        }
        urlModel2.setUrlList(list);
        if (urlModel != null) {
            str = urlModel.getUri();
        }
        urlModel2.setUri(str);
        return urlModel2;
    }

    /* renamed from: c */
    private final void m108536c(String str) {
        try {
            if (this.f87780c.f87771a != 2) {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                UgAwemeActivitySetting awemeActivitySetting = a.getAwemeActivitySetting();
                C7573i.m23582a((Object) awemeActivitySetting, "SettingsReader.get().awemeActivitySetting");
                Boolean isNewUser = awemeActivitySetting.getIsNewUser();
                String str2 = "old_user";
                C7573i.m23582a((Object) isNewUser, "isNewUser");
                if (isNewUser.booleanValue()) {
                    str2 = "new_user";
                }
                C6907h.m21524a("coupon_targetusers", (Map) new C22984d().mo59973a("media_source", str).mo59973a("user_type", str2).f60753a);
            }
        } catch (NullValueException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (android.text.TextUtils.equals(r7, r0) == false) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[Catch:{ NullValueException -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053 A[Catch:{ NullValueException -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d A[Catch:{ NullValueException -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c A[Catch:{ NullValueException -> 0x0093 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86014a(com.p280ss.android.ugc.aweme.money.growth.C33630a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "campaign"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r6.f87778a     // Catch:{ NullValueException -> 0x0093 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ NullValueException -> 0x0093 }
            if (r0 == 0) goto L_0x0015
            java.util.List r0 = r0.getCampaignList()     // Catch:{ NullValueException -> 0x0093 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            r2 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ NullValueException -> 0x0093 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ NullValueException -> 0x0093 }
            r3 = 0
        L_0x0020:
            boolean r4 = r0.hasNext()     // Catch:{ NullValueException -> 0x0093 }
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r0.next()     // Catch:{ NullValueException -> 0x0093 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NullValueException -> 0x0093 }
            if (r3 != 0) goto L_0x003d
            java.lang.String r3 = r7.f87769b     // Catch:{ NullValueException -> 0x0093 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ NullValueException -> 0x0093 }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ NullValueException -> 0x0093 }
            boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch:{ NullValueException -> 0x0093 }
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            goto L_0x003e
        L_0x003d:
            r3 = 1
        L_0x003e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NullValueException -> 0x0093 }
            java.lang.String r5 = "hintGoogleCampaign："
            r4.<init>(r5)     // Catch:{ NullValueException -> 0x0093 }
            r4.append(r3)     // Catch:{ NullValueException -> 0x0093 }
            java.lang.String r4 = r4.toString()     // Catch:{ NullValueException -> 0x0093 }
            m108533b(r4)     // Catch:{ NullValueException -> 0x0093 }
            goto L_0x0020
        L_0x0050:
            r2 = r3
        L_0x0051:
            if (r2 != 0) goto L_0x006f
            java.lang.String r7 = r7.f87769b     // Catch:{ NullValueException -> 0x0093 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ NullValueException -> 0x0093 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r6.f87778a     // Catch:{ NullValueException -> 0x0093 }
            if (r0 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch:{ NullValueException -> 0x0093 }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r0.getCampaignName()     // Catch:{ NullValueException -> 0x0093 }
            goto L_0x0067
        L_0x0066:
            r0 = r1
        L_0x0067:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullValueException -> 0x0093 }
            boolean r7 = android.text.TextUtils.equals(r7, r0)     // Catch:{ NullValueException -> 0x0093 }
            if (r7 == 0) goto L_0x0093
        L_0x006f:
            java.lang.String r7 = "命中"
            m108533b(r7)     // Catch:{ NullValueException -> 0x0093 }
            java.lang.String r7 = "google"
            r6.m108536c(r7)     // Catch:{ NullValueException -> 0x0093 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r7 = r6.f87778a     // Catch:{ NullValueException -> 0x0093 }
            if (r7 == 0) goto L_0x0081
            java.lang.String r1 = r7.getActivityId()     // Catch:{ NullValueException -> 0x0093 }
        L_0x0081:
            r6.f87781d = r1     // Catch:{ NullValueException -> 0x0093 }
            r6.m108540g()     // Catch:{ NullValueException -> 0x0093 }
            boolean r7 = r6.m108546m()     // Catch:{ NullValueException -> 0x0093 }
            if (r7 == 0) goto L_0x0093
            r6.m108542i()     // Catch:{ NullValueException -> 0x0093 }
            r6.m108543j()     // Catch:{ NullValueException -> 0x0093 }
            return
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.money.growth.C33633c.mo86014a(com.ss.android.ugc.aweme.money.growth.a):void");
    }

    /* renamed from: a */
    public final boolean mo86016a(UrlModel urlModel) {
        com.p280ss.android.ugc.aweme.base.model.UrlModel c = m108535c(urlModel);
        if (C23477d.m77081a((Collection<T>) c.getUrlList()) || !C23323e.m76518a(Uri.parse((String) c.getUrlList().get(0)))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo86017a(String str) {
        StringBuilder sb = new StringBuilder("feacebook DeepLink:");
        sb.append(str);
        m108533b(sb.toString());
        CharSequence charSequence = str;
        if (TextUtils.indexOf(charSequence, "snssdk1233://growth_activity_dialog") != 0 && TextUtils.indexOf(charSequence, "snssdk1180://growth_activity_dialog") != 0) {
            return false;
        }
        Uri parse = Uri.parse(str);
        C7573i.m23582a((Object) parse, "Uri.parse(scheme)");
        this.f87781d = parse.getLastPathSegment();
        StringBuilder sb2 = new StringBuilder("deepLinkRequestComplete:");
        sb2.append(str);
        m108533b(sb2.toString());
        m108536c("facebook");
        if (this.f87781d != null) {
            C33631b bVar = this.f87780c;
            String str2 = this.f87781d;
            if (str2 != null) {
                bVar.mo86012a(str2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
        }
        m108540g();
        if (m108546m()) {
            m108542i();
            m108543j();
        }
        return true;
    }

    /* renamed from: a */
    public static void m108531a(String str, Context context) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(context, "context");
        if (!C6903bc.m21505x().mo57937a(context, str, "client")) {
            SmartRouter.buildRoute(context, "aweme://webview/").withParam("url", str).open();
        }
    }

    /* renamed from: a */
    public static void m108532a(String str, Context context, Intent intent) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(intent, "intent");
        if (!C6903bc.m21505x().mo57937a(context, str, "client")) {
            context.startActivity(intent);
        }
    }
}
