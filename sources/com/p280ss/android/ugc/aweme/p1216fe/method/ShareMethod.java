package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.web.p582a.C11087a;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.C28205ai;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.C38065a.C38066a;
import com.p280ss.android.ugc.aweme.share.improve.CommonShareDialog;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38070aa;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38090d;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38125q;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38134v;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38144b;
import com.p280ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage.C38221b;
import com.p280ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.C38232b;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38351c;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.C43147n;
import com.p280ss.android.ugc.aweme.web.p1704b.p1705a.C43439a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod */
public final class ShareMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27928a f73585a = new C27928a(null);

    /* renamed from: b */
    private final ArrayList<String> f73586b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$a */
    public static final class C27928a {
        private C27928a() {
        }

        public /* synthetic */ C27928a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$b */
    public static final class C27929b extends C38351c {

        /* renamed from: a */
        final /* synthetic */ ShareMethod f73587a;

        /* renamed from: b */
        final /* synthetic */ SharePackage f73588b;

        /* renamed from: c */
        final /* synthetic */ String f73589c;

        /* renamed from: a */
        public final boolean mo71406a(C38354f fVar, Context context) {
            C7573i.m23587b(fVar, C38347c.f99553h);
            C7573i.m23587b(context, "context");
            return ShareMethod.m91475a(C6405d.m19984g(), this.f73588b, this.f73589c);
        }

        C27929b(ShareMethod shareMethod, SharePackage sharePackage, String str, C38343b bVar) {
            this.f73587a = shareMethod;
            this.f73588b = sharePackage;
            this.f73589c = str;
            super(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$c */
    public static final class C27930c implements C38386d {

        /* renamed from: a */
        final /* synthetic */ ShareMethod f73590a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f73591b;

        /* renamed from: c */
        final /* synthetic */ C27876a f73592c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f73593d;

        /* renamed from: e */
        final /* synthetic */ String f73594e;

        /* renamed from: a */
        public final void mo67218a(C38389f fVar, SharePackage sharePackage, Context context) {
            C7573i.m23587b(fVar, "action");
            C7573i.m23587b(sharePackage, "sharePackage");
            C7573i.m23587b(context, "context");
        }

        /* renamed from: a */
        public final void mo67217a(SharePackage sharePackage, Context context) {
            C7573i.m23587b(sharePackage, "sharePackage");
            C7573i.m23587b(context, "context");
            C27876a aVar = this.f73592c;
            if (aVar != null) {
                aVar.mo71365a(this.f73591b);
            }
        }

        /* renamed from: b */
        public final void mo67219b(SharePackage sharePackage, Context context) {
            C7573i.m23587b(sharePackage, "sharePackage");
            C7573i.m23587b(context, "context");
            try {
                JSONObject jSONObject = this.f73591b;
                if (jSONObject != null) {
                    jSONObject.put("code", 0);
                }
            } catch (JSONException unused) {
            }
        }

        /* renamed from: a */
        public final void mo67216a(C38343b bVar, boolean z, SharePackage sharePackage, Context context) {
            C7573i.m23587b(bVar, "channel");
            C7573i.m23587b(context, "context");
            if (this.f73593d != null) {
                C6907h.onEvent(MobClick.obtain().setEventName(this.f73593d.optString("tag")).setLabelName(bVar.mo95739b()).setValue(this.f73593d.optString("value")).setJsonObject(this.f73593d.optJSONObject("extras")));
            }
            if (z) {
                String b = bVar.mo95739b();
                String str = this.f73594e;
                C7573i.m23582a((Object) str, "url");
                ShareMethod.m91474a(b, str);
            }
            C27876a aVar = this.f73592c;
            if (aVar != null) {
                aVar.mo71365a(this.f73591b);
            }
        }

        C27930c(ShareMethod shareMethod, JSONObject jSONObject, C27876a aVar, JSONObject jSONObject2, String str) {
            this.f73590a = shareMethod;
            this.f73591b = jSONObject;
            this.f73592c = aVar;
            this.f73593d = jSONObject2;
            this.f73594e = str;
        }
    }

    public ShareMethod() {
        this(null, 1, null);
    }

    public ShareMethod(C11087a aVar) {
        super(aVar);
        this.f73586b = new ArrayList<>(Arrays.asList(new String[]{"copylink", "qrcode", "browser", "refresh"}));
    }

    /* renamed from: a */
    private final void m91473a(String str) {
        if (!TextUtils.isEmpty(str)) {
            List list = (List) new C6600e().mo15975a(str, new ShareMethod$updateShareLists$allowItems$1().getType());
            if (list != null) {
                this.f73586b.clear();
                this.f73586b.addAll(list);
            }
        }
    }

    /* renamed from: a */
    public static void m91474a(String str, String str2) {
        C22984d a = C22984d.m75611a();
        a.mo59973a("enter_from", "h5_page");
        a.mo59973a("platform", str);
        a.mo59973a("url", str2);
        C6907h.m21524a("h5_share", (Map) a.f60753a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64209a(org.json.JSONObject r8, com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a r9) {
        /*
            r7 = this;
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r0 = "code"
            int r1 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78750c
            r6.put(r0, r1)
            java.lang.ref.WeakReference r1 = r7.f73443f
            java.lang.String r0 = "mContextRef"
            kotlin.jvm.internal.C7573i.m23582a(r1, r0)
            com.bytedance.ies.web.a.a r0 = r7.f73445h
            if (r0 == 0) goto L_0x0020
            android.webkit.WebView r0 = r0.f30155d
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.getUrl()
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r3 = r0
            r0 = r7
            r2 = r8
            r4 = r6
            r5 = r9
            boolean r8 = r0.m91476a(r1, r2, r3, r4, r5)
            java.lang.String r0 = "tricky_flag"
            boolean r0 = r6.has(r0)
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "code"
            if (r8 == 0) goto L_0x0039
            int r8 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78750c
            goto L_0x003b
        L_0x0039:
            int r8 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78751d
        L_0x003b:
            r6.put(r0, r8)
            r9.mo71365a(r6)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.ShareMethod.mo64209a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    /* renamed from: a */
    public final boolean mo71405a(WeakReference<Context> weakReference, JSONObject jSONObject) {
        C7573i.m23587b(weakReference, "contextWeakReference");
        C7573i.m23587b(jSONObject, "params");
        return m91476a(weakReference, jSONObject, null, null, null);
    }

    public /* synthetic */ ShareMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }

    /* renamed from: a */
    public static boolean m91475a(Activity activity, SharePackage sharePackage, String str) {
        C7573i.m23587b(sharePackage, "sharePackage");
        if (activity == null) {
            return false;
        }
        sharePackage.f20186l.putString("url_for_im_share", str);
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin()) {
            C32656f.m105742a(activity, "", "click_shareim_button");
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("share_package", sharePackage);
        C30553b.m99810g().enterChooseContact(activity, bundle, null);
        C28205ai.m92704a("chat_merge");
        return true;
    }

    /* renamed from: a */
    private final boolean m91476a(WeakReference<Context> weakReference, JSONObject jSONObject, String str, JSONObject jSONObject2, C27876a aVar) {
        JSONObject jSONObject3;
        SharePackage sharePackage;
        JSONObject jSONObject4 = jSONObject;
        String str2 = str;
        JSONObject jSONObject5 = jSONObject2;
        if (jSONObject4 == null) {
            return false;
        }
        String optString = jSONObject4.optString("title");
        String optString2 = jSONObject4.optString("desc");
        String optString3 = jSONObject4.optString("image");
        String optString4 = jSONObject4.optString("url");
        String optString5 = jSONObject4.optString("image_path");
        String optString6 = jSONObject4.optString("type");
        m91473a(jSONObject4.optString("shareitems"));
        List<String> a = C43147n.m136854a(jSONObject4.optJSONArray("shareEntriesForbidList"));
        if (jSONObject4.has("logArgs")) {
            jSONObject3 = jSONObject4.optJSONObject("logArgs");
        } else {
            jSONObject3 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(optString);
        if (TextUtils.isEmpty(optString2) || isEmpty) {
            if (!isEmpty) {
                optString2 = optString;
            }
            C7573i.m23582a((Object) optString2, "if (!emptyTitle) {\n     …    description\n        }");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(optString);
            sb.append(' ');
            sb.append(optString2);
            optString2 = sb.toString();
        }
        C43439a aVar2 = new C43439a(optString, optString2, optString3, optString4, optString5);
        String optString7 = jSONObject4.optString("platform");
        Context context = (Context) weakReference.get();
        CharSequence charSequence = optString7;
        if (TextUtils.isEmpty(charSequence) || context == null) {
            return false;
        }
        Activity a2 = C23487o.m77130a(context);
        if (a2 == null) {
            return false;
        }
        C38382b bVar = new C38382b();
        C37984ap.m121301a().injectUniversalConfig(bVar, a2, true);
        CharSequence charSequence2 = optString6;
        if (TextUtils.equals(charSequence2, "image")) {
            sharePackage = C38221b.m122098a(context, aVar2, str2);
            C7573i.m23582a((Object) optString3, "image");
            bVar.mo95967a((C38389f) new C38125q(optString3));
        } else if (TextUtils.equals(charSequence2, "local_img")) {
            sharePackage = C38232b.m122148a(context, aVar2, str2);
        } else {
            SharePackage b = C38232b.m122151b(context, aVar2, str2);
            C38144b bVar2 = new C38144b(b, null, 0, 6, null);
            bVar.mo95963a((C38343b) new C27929b(this, b, str2, bVar2));
            sharePackage = b;
        }
        if (this.f73586b.contains("refresh")) {
            bVar.mo95967a((C38389f) new C38070aa(null, this.f73445h));
        }
        if (this.f73586b.contains("browser")) {
            bVar.mo95967a((C38389f) new C38134v());
        }
        if (this.f73586b.contains("copylink")) {
            C38090d dVar = new C38090d("fromWeb", false, false, 6, null);
            bVar.mo95967a((C38389f) dVar);
        }
        for (String a3 : a) {
            bVar.mo95968a(a3);
        }
        bVar.mo95964a(sharePackage);
        if (!TextUtils.equals(charSequence, "share_native")) {
            C38343b a4 = C38066a.m121469a(optString7, a2);
            if (a4 == null) {
                return false;
            }
            return a4.mo71406a(sharePackage.mo18860a(a4), context);
        }
        if (jSONObject5 != null) {
            jSONObject5.put("tricky_flag", "tricky_flag");
        }
        C27930c cVar = new C27930c(this, jSONObject2, aVar, jSONObject3, optString4);
        bVar.mo95966a((C38386d) cVar);
        CommonShareDialog commonShareDialog = new CommonShareDialog(a2, bVar.mo95972a(), 0, 4, null);
        commonShareDialog.show();
        return true;
    }
}
