package com.p280ss.android.ugc.aweme.p1685ug.poloris;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.polaris.depend.C12426g;
import com.bytedance.polaris.depend.C12428i;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.legoImp.task.PolarisInitTask;
import com.p280ss.android.ugc.aweme.money.growth.C33633c;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27998o;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.C38065a.C38066a;
import com.p280ss.android.ugc.aweme.share.improve.CommonShareDialog;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38090d;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38144b;
import com.p280ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import com.p280ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.C38232b;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38351c;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38388e;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.util.HashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ug.poloris.b */
public final class C42717b implements C12426g {

    /* renamed from: a */
    public static final C7541d f111011a = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, C42719b.f111014a);

    /* renamed from: b */
    public static final C42718a f111012b = new C42718a(null);

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.b$a */
    public static final class C42718a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f111013a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42718a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/ug/poloris/PolarisShareImpl;"))};

        private C42718a() {
        }

        /* renamed from: a */
        public static C42717b m135616a() {
            return (C42717b) C42717b.f111011a.getValue();
        }

        public /* synthetic */ C42718a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.b$b */
    static final class C42719b extends Lambda implements C7561a<C42717b> {

        /* renamed from: a */
        public static final C42719b f111014a = new C42719b();

        C42719b() {
            super(0);
        }

        /* renamed from: a */
        private static C42717b m135617a() {
            return new C42717b(null);
        }

        public final /* synthetic */ Object invoke() {
            return m135617a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.b$c */
    public static final class C42720c extends C38351c {

        /* renamed from: a */
        final /* synthetic */ String f111015a;

        /* renamed from: b */
        final /* synthetic */ Activity f111016b;

        /* renamed from: c */
        final /* synthetic */ SharePackage f111017c;

        /* renamed from: a */
        public final boolean mo71406a(C38354f fVar, Context context) {
            C7573i.m23587b(fVar, C38347c.f99553h);
            C7573i.m23587b(context, "context");
            if (!TextUtils.isEmpty(this.f111015a)) {
                return C27998o.m91598a(this.f111016b, this.f111017c, this.f111015a);
            }
            return C27998o.m91598a(this.f111016b, this.f111017c, this.f111017c.f20185k);
        }

        C42720c(String str, Activity activity, SharePackage sharePackage, C38343b bVar) {
            this.f111015a = str;
            this.f111016b = activity;
            this.f111017c = sharePackage;
            super(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.b$d */
    public static final class C42721d extends C38388e {

        /* renamed from: a */
        final /* synthetic */ C42717b f111018a;

        /* renamed from: b */
        final /* synthetic */ String f111019b;

        C42721d(C42717b bVar, String str) {
            this.f111018a = bVar;
            this.f111019b = str;
        }

        /* renamed from: a */
        public final void mo67216a(C38343b bVar, boolean z, SharePackage sharePackage, Context context) {
            C7573i.m23587b(bVar, "channel");
            C7573i.m23587b(context, "context");
            Map hashMap = new HashMap();
            hashMap.put("enter_from", "h5_page");
            hashMap.put("platform", bVar.mo95739b());
            hashMap.put("webview_type", "luckycata");
            C6907h.m21524a("h5_share", hashMap);
            this.f111018a.mo104325a(this.f111019b);
        }
    }

    private C42717b() {
    }

    /* renamed from: b */
    private static void m135613b(String str) {
        C33633c.m108533b(str);
    }

    public /* synthetic */ C42717b(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final void mo104325a(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("完成分享任务 getAwardByTaskId ");
            sb.append(str);
            m135613b(sb.toString());
            PolarisInitTask.ensuareInit();
            C12428i.m36147a(str, null, (JSONObject) null);
            return;
        }
        m135613b("完成分享任务 taskId 为空，不需要上报");
    }

    /* renamed from: a */
    private final void m135612a(Activity activity, String str, SharePackage sharePackage, String str2) {
        Context context;
        C38343b a = C38066a.m121469a(str, activity);
        if (a != null) {
            C38354f a2 = sharePackage.mo18860a(a);
            if (activity != null) {
                context = activity;
            } else {
                context = C6399b.m19921a();
            }
            a.mo71406a(a2, context);
        }
        mo104325a(str2);
    }

    /* renamed from: a */
    private final void m135611a(Activity activity, SharePackage sharePackage, String str, String str2) {
        if (activity != null) {
            C38382b bVar = new C38382b();
            C38144b bVar2 = new C38144b(sharePackage, null, 0, 6, null);
            C38382b a = bVar.mo95963a((C38343b) new C42720c(str2, activity, sharePackage, bVar2));
            C37984ap.m121301a().injectUniversalConfig(a, activity, true);
            C38382b a2 = a.mo95964a(sharePackage);
            C38090d dVar = new C38090d(null, false, false, 7, null);
            CommonShareDialog commonShareDialog = new CommonShareDialog(activity, a2.mo95967a((C38389f) dVar).mo95966a((C38386d) new C42721d(this, str)).mo95972a(), 0, 4, null);
            commonShareDialog.show();
        }
    }

    /* renamed from: a */
    public final boolean mo30330a(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, String str7) {
        String str8;
        String str9;
        String str10;
        Activity activity2 = activity;
        String str11 = str;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 != null) {
            StringBuilder sb = new StringBuilder("extra:");
            sb.append(jSONObject2);
            m135613b(sb.toString());
        }
        String str12 = null;
        if (jSONObject2 != null) {
            try {
                str10 = jSONObject2.getString("task_id");
            } catch (Exception unused) {
                str8 = null;
            }
        } else {
            str10 = null;
        }
        str8 = str10;
        if (jSONObject2 != null) {
            try {
                str12 = jSONObject2.getString("origin_url");
            } catch (Exception unused2) {
            }
        }
        if (str12 == null) {
            str9 = str6;
        } else {
            str9 = str12;
        }
        WebSharePackage a = C38232b.m122147a(activity, str, str2, str3, str4, str5, str6, jSONObject, str7, str9);
        if (TextUtils.isEmpty(str11)) {
            CharSequence charSequence = str2;
            if (TextUtils.equals("system", charSequence)) {
                m135612a(activity2, "more", (SharePackage) a, str8);
            } else if (TextUtils.equals("sdk", charSequence)) {
                m135611a(activity2, (SharePackage) a, str8, str9);
            }
        } else {
            m135612a(activity2, str11, (SharePackage) a, str8);
        }
        return true;
    }
}
