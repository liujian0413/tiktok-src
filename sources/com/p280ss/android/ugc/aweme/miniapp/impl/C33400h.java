package com.p280ss.android.ugc.aweme.miniapp.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p1843tt.appbrandimpl.C46579c;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.C21758j;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.C23018p;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p1020a.C22730a;
import com.p280ss.android.ugc.aweme.app.services.C23031af;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a.C25332a.C25333a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.p280ss.android.ugc.aweme.main.p1385g.C33015b;
import com.p280ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33443g;
import com.p280ss.android.ugc.aweme.miniapp_api.model.GlobalMicroAppParams.C33449b;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33431f;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35151b;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35153c;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.p1468a.C35144a;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.p1469b.C35152a;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.C35166h;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.C35179k;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p280ss.android.ugc.aweme.share.improve.C38065a;
import com.p280ss.android.ugc.aweme.share.improve.DynamicShareDialog;
import com.p280ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.h */
public final class C33400h implements C33443g {

    /* renamed from: a */
    private DynamicShareDialog f87241a;

    /* renamed from: a */
    public final boolean mo85627a(Context context, String str, String str2) {
        if (!TextUtils.equals(C22909c.f60637a, str2) && !TextUtils.equals(C22909c.f60639c, str2)) {
            return false;
        }
        C22912d.f60645e.mo59887a(context, str, (String) null);
        return true;
    }

    /* renamed from: a */
    public final boolean mo85625a() {
        return !m108020a(C6399b.m19921a()) || System.currentTimeMillis() - C23018p.m75672a().mo59991d() < DouPlusShareGuideExperiment.MIN_VALID_DURATION;
    }

    /* renamed from: a */
    public final boolean mo85626a(Activity activity, String str, List<String> list, int i) {
        C1592h.m7855a((Callable<TResult>) new C33403i<TResult>(activity, list, i), C1592h.f5958b);
        return true;
    }

    /* renamed from: a */
    public final void mo85623a(Context context, String str) {
        C22912d.f60645e.mo59887a(context, str, (String) null);
    }

    /* renamed from: a */
    public final boolean mo85629a(Context context, String str, boolean z) {
        return C25371n.m83463a(context, str, false);
    }

    /* renamed from: a */
    public final boolean mo85628a(Context context, String str, String str2, String str3) {
        UserProfileActivity.m117395a(context, str, "", str2, str3);
        return true;
    }

    /* renamed from: a */
    public final void mo85624a(Context context, String str, String str2, String str3, long j) {
        C25333a aVar = new C25333a();
        aVar.f66720b = str3;
        aVar.f66719a = Long.valueOf(j);
        C25371n.m83462a(context, str, str2, false, null, true, aVar);
    }

    /* renamed from: c */
    public final Activity mo85635c() {
        return (Activity) C21758j.m72769a().get();
    }

    /* renamed from: b */
    public final void mo85631b() {
        ServiceManager.get().bind(C33015b.class, new ServiceProvider<C33015b>() {
            /* renamed from: a */
            private static C33015b m108043a() {
                return new C23031af();
            }

            public final /* synthetic */ Object get() {
                return m108043a();
            }
        }).asSingleton();
        C22730a.m75099a(AwemeApplication.m21341a());
    }

    /* renamed from: d */
    public final boolean mo85636d() {
        return ((Boolean) SharePrefCache.inst().getShowMiniAppFreshGuideDialog().mo59877d()).booleanValue();
    }

    /* renamed from: e */
    public final void mo85637e() {
        SharePrefCache.inst().getShowMiniAppFreshGuideDialog().mo59871a(Boolean.valueOf(false));
    }

    /* renamed from: a */
    private static boolean m108020a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return C6776h.m20951c(context, context.getPackageName());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo85616a(Activity activity) {
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null) {
            iAccountService.login(new C21080d().mo56860a(activity).mo56859a());
        }
    }

    /* renamed from: b */
    public final void mo85632b(final Activity activity) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                if (activity != null && !activity.isFinishing()) {
                    new C46579c(activity).show();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo85622a(Activity activity, boolean z) {
        QRCodePermissionActivity.m119022a(activity, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo85630b(Activity activity, C33431f fVar) throws Exception {
        this.f87241a = MicroAppSharePackage.m122043a(activity, fVar);
        return null;
    }

    /* renamed from: b */
    public final boolean mo85634b(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("web_url");
            String optString2 = jSONObject.optString("title");
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setFlags(268435456);
            if (!TextUtils.isEmpty(optString2)) {
                intent.putExtra("title", optString2);
            }
            intent.setData(Uri.parse(optString));
            context.startActivity(intent);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo85618a(Activity activity, Intent intent) {
        intent.setClass(activity, DetailActivity.class);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo85620a(Activity activity, C33431f fVar) {
        C1592h.m7855a((Callable<TResult>) new C33404j<TResult>(this, activity, fVar), C1592h.f5958b);
    }

    /* renamed from: b */
    public final void mo85633b(Context context, String str, String str2) {
        C25371n.m83459a(context, str, str2);
    }

    /* renamed from: a */
    public final void mo85617a(Activity activity, int i, int i2) {
        Intent intent = new Intent(activity, MiniAppMediaChooseEmptyActivity.class);
        intent.putExtra("key_choose_num", i2);
        switch (i) {
            case 1:
                intent.putExtra("key_choose_type", 1);
                break;
            case 2:
                intent.putExtra("key_choose_type", 2);
                break;
        }
        activity.startActivityForResult(intent, 11);
    }

    /* renamed from: a */
    static final /* synthetic */ Void m108019a(Activity activity, List list, int i) throws Exception {
        C35179k a = C35179k.m113507a(activity, R.style.nz);
        C35166h a2 = C35166h.m113441a().mo89491b(list).mo89486a(list).mo89477a((int) R.color.a2t).mo89489b((int) R.color.a2t).mo89481a((C35153c) new C35152a()).mo89480a((C35151b) new C35144a()).mo89487a(true).mo89483a(C33405k.f87251a).mo89488a();
        a2.f91970a = i;
        a.mo89528a(a2).mo89529b();
        return null;
    }

    /* renamed from: a */
    public final void mo85621a(Activity activity, C33449b bVar, C33431f fVar) {
        if (bVar != null) {
            if (!TextUtils.equals(bVar.f87310k, "chat_mergeIM")) {
                SharePackage c = this.f87241a.mo95706c();
                if (c instanceof MicroAppSharePackage) {
                    MicroAppSharePackage a = MicroAppSharePackage.m122045a(bVar, (MicroAppSharePackage) c);
                    C38343b a2 = C38065a.m121467a(bVar.f87310k, activity);
                    if (a2 != null) {
                        C38354f a3 = a.mo18860a(a2);
                        if (a2.mo95737a((Context) activity, a3)) {
                            a2.mo71406a(a3, (Context) activity);
                        }
                    }
                }
            } else if (this.f87241a != null) {
                bVar.f87310k = "chat_merge";
                SharePackage c2 = this.f87241a.mo95706c();
                if (c2 instanceof MicroAppSharePackage) {
                    this.f87241a.mo95705a(MicroAppSharePackage.m122045a(bVar, (MicroAppSharePackage) c2), fVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo85619a(Activity activity, Intent intent, C33449b bVar, C33431f fVar) {
        intent.putExtra("share_package", MicroAppSharePackage.m122044a(bVar, (C33431f) null));
        activity.startActivity(intent);
    }
}
