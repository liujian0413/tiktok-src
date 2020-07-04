package com.p280ss.android.ugc.aweme.poi.utils;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.utils.ThirdMapNaviHelper.MapType;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.r */
public final class C35462r {
    /* renamed from: a */
    public static boolean m114565a() {
        return !C6399b.m19944t();
    }

    /* renamed from: a */
    public static boolean m114566a(double d, double d2) {
        return Math.abs(d) <= 90.0d && Math.abs(d2) <= 180.0d && d != 0.0d && d2 != 0.0d;
    }

    /* renamed from: a */
    public static void m114560a(Context context, double[] dArr) {
        if (dArr != null && dArr.length == 2) {
            List a = ThirdMapNaviHelper.m114444a(context);
            if (a.size() == 0) {
                C10761a.m31399c(context, (int) R.string.czc).mo25750a();
            } else if (C6399b.m19944t()) {
                ThirdMapNaviHelper.m114446a(context, (MapType) a.get(0), dArr[0], dArr[1]);
            } else {
                String[] a2 = ThirdMapNaviHelper.m114447a(a, context);
                C25712a aVar = new C25712a(context);
                aVar.mo66614a((CharSequence[]) a2, (OnClickListener) new C35463s(context, a, dArr));
                aVar.mo66615b();
            }
        }
    }

    /* renamed from: a */
    public static void m114558a(Context context, String str, String str2, String str3, PoiSimpleBundle poiSimpleBundle) {
        if (!C6319n.m19593a(str)) {
            m114561a(context, str.split(";"), str2, str3, poiSimpleBundle);
        }
    }

    /* renamed from: a */
    private static void m114561a(Context context, String[] strArr, String str, String str2, PoiSimpleBundle poiSimpleBundle) {
        if (strArr != null && strArr.length != 0) {
            C25712a aVar = new C25712a(context);
            C35464t tVar = new C35464t(context, strArr, str2, str, poiSimpleBundle);
            aVar.mo66614a((CharSequence[]) strArr, (OnClickListener) tVar);
            aVar.mo66615b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m114564a(boolean z, Context context, PoiDetail poiDetail, PoiSimpleBundle poiSimpleBundle, String[] strArr, String str, String str2, DialogInterface dialogInterface, int i) {
        if (i != 0 || !z) {
            C35454m.m114523a(poiSimpleBundle, "poi_contact_method", C22984d.m75611a().mo59973a("enter_method", "click").mo59973a("previous_page", poiSimpleBundle.getPreviousPage()).mo59973a("poi_id", poiDetail.getPoiId()).mo59973a("content_type", "phone"));
            m114569b(context, strArr[i], str, str2, poiSimpleBundle);
            return;
        }
        m114554a(context, poiDetail, poiSimpleBundle);
    }

    /* renamed from: a */
    public static void m114563a(View view, CharSequence charSequence, Context context, int i, String str, PoiDetail poiDetail, String str2) {
        if (!C6399b.m19944t() && view != null && !TextUtils.isEmpty(charSequence) && context != null && poiDetail != null) {
            C35467w wVar = new C35467w(context, i, charSequence, poiDetail, str, str2);
            view.setOnLongClickListener(wVar);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m114567a(Context context, int i, CharSequence charSequence, PoiDetail poiDetail, String str, String str2, View view) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        C25712a aVar = new C25712a(context);
        CharSequence[] charSequenceArr = {context.getString(i)};
        C35468x xVar = new C35468x(clipboardManager, charSequence, poiDetail, str, str2);
        aVar.mo66614a(charSequenceArr, (OnClickListener) xVar);
        aVar.mo66615b();
        C35454m.m114526a(poiDetail, "long_press", new C22984d().mo59973a(C38347c.f99553h, str).mo59973a("poi_id", poiDetail.getPoiId()).mo59973a("enter_from", "poi_page").mo59973a("previous_page", str2));
        return true;
    }

    /* renamed from: a */
    public static Bitmap m114549a(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), R.drawable.axv);
    }

    /* renamed from: a */
    public static String m114551a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy", Locale.getDefault());
        String str = "yyyy.MM.dd";
        if (TextUtils.equals(simpleDateFormat.format(Long.valueOf(j)), simpleDateFormat.format(Long.valueOf(currentTimeMillis)))) {
            str = "MM.dd";
        }
        return new SimpleDateFormat(str, Locale.getDefault()).format(Long.valueOf(j));
    }

    /* renamed from: a */
    public static <T extends AmeBaseFragment> T m114550a(PoiBundle poiBundle, Class<T> cls) throws IllegalAccessException, InstantiationException {
        Bundle bundle = new Bundle(2);
        bundle.putSerializable("poi_bundle", poiBundle);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "poi_page");
        T t = (AmeBaseFragment) cls.newInstance();
        t.setArguments(bundle);
        return t;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m114568b(Context context, PoiDetail poiDetail) {
        C35454m.m114526a(poiDetail, "enter_chat", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "click_poi_contact_method").mo59973a("poi_id", poiDetail.getPoiId()).mo59973a("poi_type", poiDetail.getTypeCode()).mo59973a("to_user_id", poiDetail.getEnterpriseId()));
        C6903bc.m21496o().mo88912a(context, poiDetail.getEnterpriseId(), poiDetail.getEnterpriseSecUid(), poiDetail.getEnterpriseTitle(), poiDetail.getEnterpriseThumb(), poiDetail.getEnterpriseVerifyReason(), poiDetail.getEnterpriseSignature());
    }

    /* renamed from: a */
    private static void m114557a(Context context, User user) {
        if (context != null && user != null && !TextUtils.isEmpty(user.getUid())) {
            String uid = user.getUid();
            String secUid = user.getSecUid();
            SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", uid).withParam("sec_user_id", secUid).withParam("profile_enterprise_type", user.getCommerceUserLevel()).open();
        }
    }

    /* renamed from: a */
    private static void m114554a(Context context, PoiDetail poiDetail, PoiSimpleBundle poiSimpleBundle) {
        if (poiDetail.isEnterprise()) {
            C35454m.m114523a(poiSimpleBundle, "poi_contact_method", C22984d.m75611a().mo59973a("enter_method", "click").mo59973a("previous_page", poiSimpleBundle.getPreviousPage()).mo59973a("poi_id", poiDetail.getPoiId()).mo59973a("content_type", "message"));
            if (!C6861a.m21337f().isLogin()) {
                C32656f.m105745a((Activity) context, "poi_page", "click_chat_button", (C23305g) new C35466v(context, poiDetail));
            } else {
                m114568b(context, poiDetail);
            }
        }
    }

    /* renamed from: a */
    public static void m114555a(Context context, PoiDetail poiDetail, String str) {
        ((C33276r) new C33276r().mo85310b("poi_page").mo85048a("click_profile_card")).mo85321k(str).mo85322o(poiDetail.getEnterpriseId()).mo85311b(poiDetail.getPoiId(), poiDetail.getPoiTypeStr()).mo85252e();
        m114557a(context, poiDetail.getEnterpriseModel());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m114569b(Context context, String str, String str2, String str3, PoiSimpleBundle poiSimpleBundle) {
        C35454m.m114523a(poiSimpleBundle, "poi_call", C22984d.m75611a().mo59973a("enter_from", str3).mo59973a("shop_id", "").mo59973a("poi_type", poiSimpleBundle.getPoiType()).mo59973a("poi_id", poiSimpleBundle.getPoiId()).mo59973a("group_id", poiSimpleBundle.getAwemeId()).mo59973a("previous_page", poiSimpleBundle.getPreviousPage()).mo59973a("click_method", str2));
        context.startActivity(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, null)));
    }

    /* renamed from: a */
    public static void m114556a(Context context, PoiDetail poiDetail, String str, PoiSimpleBundle poiSimpleBundle, boolean z, String str2) {
        String[] strArr;
        String phone = poiDetail.getPhone();
        if (C6319n.m19593a(phone)) {
            strArr = new String[0];
        } else {
            strArr = phone.split(";");
        }
        if (strArr.length > 0) {
            C35444d.m114495d(context, ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(poiSimpleBundle.getAwemeId()), poiDetail.getPoiId());
            C35454m.m114523a(poiSimpleBundle, "poi_contact_method", C22984d.m75611a().mo59973a("enter_method", "show").mo59973a("previous_page", poiSimpleBundle.getPreviousPage()).mo59973a("poi_id", poiDetail.getPoiId()).mo59973a("content_type", "phone"));
        }
        ArrayList arrayList = new ArrayList();
        boolean isEnterprise = poiDetail.isEnterprise();
        if (isEnterprise) {
            arrayList.add(context.getString(R.string.d_c));
            C35454m.m114523a(poiSimpleBundle, "poi_contact_method", C22984d.m75611a().mo59973a("enter_method", "show").mo59973a("previous_page", poiSimpleBundle.getPreviousPage()).mo59973a("poi_id", poiDetail.getPoiId()).mo59973a("content_type", "message"));
        }
        arrayList.addAll(Arrays.asList(strArr));
        if (arrayList.size() != 0) {
            C25712a aVar = new C25712a(context);
            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
            C35465u uVar = new C35465u(isEnterprise, context, poiDetail, poiSimpleBundle, strArr2, str2, str);
            aVar.mo66614a((CharSequence[]) strArr2, (OnClickListener) uVar);
            aVar.mo66615b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m114552a(ClipboardManager clipboardManager, CharSequence charSequence, PoiDetail poiDetail, String str, String str2, DialogInterface dialogInterface, int i) {
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("poi_copy", charSequence));
        }
        C35454m.m114526a(poiDetail, "poi_copy", new C22984d().mo59973a(C38347c.f99553h, str).mo59973a("poi_id", poiDetail.getPoiId()).mo59973a("enter_from", "poi_page").mo59973a("previous_page", str2));
    }
}
