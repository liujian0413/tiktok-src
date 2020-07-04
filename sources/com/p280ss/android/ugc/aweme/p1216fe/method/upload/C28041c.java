package com.p280ss.android.ugc.aweme.p1216fe.method.upload;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feedback.C29119x;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27940a.C27943a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27996m;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.photo.C34729c;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c */
public final class C28041c implements C6310a, C28035a, C28038b {

    /* renamed from: j */
    public static final C28042a f73866j = new C28042a(null);

    /* renamed from: a */
    public int f73867a;

    /* renamed from: b */
    public boolean f73868b;

    /* renamed from: c */
    public HashMap<Integer, AvatarUri> f73869c;

    /* renamed from: d */
    public List<String> f73870d;

    /* renamed from: e */
    public AtomicInteger f73871e;

    /* renamed from: f */
    public AtomicInteger f73872f;

    /* renamed from: g */
    public C7561a<C7581n> f73873g;

    /* renamed from: h */
    public final WeakReference<Activity> f73874h;

    /* renamed from: i */
    public final C27996m f73875i;

    /* renamed from: k */
    private int f73876k = 1;

    /* renamed from: l */
    private String f73877l = "";

    /* renamed from: m */
    private boolean f73878m;

    /* renamed from: n */
    private String f73879n = "";

    /* renamed from: o */
    private String f73880o = "";

    /* renamed from: p */
    private List<C6310a> f73881p;

    /* renamed from: q */
    private final C27943a f73882q;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$a */
    public static final class C28042a {
        private C28042a() {
        }

        public /* synthetic */ C28042a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$b */
    static final class C28043b {

        /* renamed from: a */
        public final String f73883a;

        /* renamed from: b */
        public final String f73884b;

        /* renamed from: c */
        public final String f73885c;

        public C28043b(String str, String str2, String str3) {
            C7573i.m23587b(str, "url");
            C7573i.m23587b(str2, "uri");
            C7573i.m23587b(str3, "fileName");
            this.f73883a = str;
            this.f73884b = str2;
            this.f73885c = str3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$c */
    static final class C28044c implements C6310a {

        /* renamed from: a */
        final /* synthetic */ C28041c f73886a;

        /* renamed from: b */
        final /* synthetic */ int f73887b;

        C28044c(C28041c cVar, int i) {
            this.f73886a = cVar;
            this.f73887b = i;
        }

        public final void handleMsg(Message message) {
            if (!this.f73886a.f73868b) {
                if (message.obj instanceof ApiServerException) {
                    Activity activity = (Activity) this.f73886a.f73874h.get();
                    if (activity != null) {
                        Context context = activity;
                        Object obj = message.obj;
                        if (obj != null) {
                            C10761a.m31403c(context, ((ApiServerException) obj).getErrorMsg()).mo25750a();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                        }
                    }
                    C28041c.m91649a(this.f73886a).incrementAndGet();
                } else if (message.obj instanceof AvatarUri) {
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        AvatarUri avatarUri = (AvatarUri) obj2;
                        if (C23477d.m77083b(avatarUri.urlList)) {
                            C28041c.m91653b(this.f73886a).put(Integer.valueOf(this.f73887b), avatarUri);
                            C28041c.m91655c(this.f73886a).incrementAndGet();
                        } else {
                            C28041c.m91649a(this.f73886a).incrementAndGet();
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
                    }
                } else {
                    C28041c.m91649a(this.f73886a).incrementAndGet();
                }
                if (C28041c.m91649a(this.f73886a).get() + C28041c.m91655c(this.f73886a).get() == C28041c.m91657d(this.f73886a).size()) {
                    int size = C28041c.m91657d(this.f73886a).size();
                    int i = C28041c.m91655c(this.f73886a).get();
                    if (i == 0) {
                        this.f73886a.f73875i.mo71399a(0, "uploadFailedAll");
                        C7561a<C7581n> aVar = this.f73886a.f73873g;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        C29119x.f76867a.mo74563a(this.f73886a.f73867a);
                    } else if (i >= 0 && size > i) {
                        this.f73886a.f73875i.mo71399a(0, "uploadFailed");
                        C7561a<C7581n> aVar2 = this.f73886a.f73873g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        C29119x.f76867a.mo74563a(this.f73886a.f73867a);
                    } else if (i == size) {
                        ArrayList arrayList = new ArrayList();
                        int size2 = C28041c.m91657d(this.f73886a).size();
                        int i2 = 0;
                        while (true) {
                            List<String> list = null;
                            if (i2 >= size2) {
                                break;
                            }
                            AvatarUri avatarUri2 = (AvatarUri) C28041c.m91653b(this.f73886a).get(Integer.valueOf(i2));
                            if (avatarUri2 != null) {
                                list = avatarUri2.urlList;
                            }
                            if (list != null) {
                                List<String> list2 = avatarUri2.urlList;
                                C7573i.m23582a((Object) list2, "uri.urlList");
                                if (!list2.isEmpty()) {
                                    String str = (String) avatarUri2.urlList.get(0);
                                    C7573i.m23582a((Object) str, "url");
                                    String str2 = avatarUri2.uri;
                                    C7573i.m23582a((Object) str2, "uri.uri");
                                    arrayList.add(new C28043b(str, str2, (String) C28041c.m91657d(this.f73886a).get(this.f73887b)));
                                }
                            }
                            i2++;
                        }
                        if (arrayList.size() == C28041c.m91653b(this.f73886a).size()) {
                            this.f73886a.mo71488a((C28043b) null, arrayList);
                            return;
                        }
                        this.f73886a.f73875i.mo71399a(0, "uploadFailed");
                        C7561a<C7581n> aVar3 = this.f73886a.f73873g;
                        if (aVar3 != null) {
                            aVar3.invoke();
                        }
                        C29119x.f76867a.mo74563a(this.f73886a.f73867a);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$d */
    static final class C28045d implements C22480b {

        /* renamed from: a */
        final /* synthetic */ C28041c f73888a;

        /* renamed from: b */
        final /* synthetic */ Activity f73889b;

        C28045d(C28041c cVar, Activity activity) {
            this.f73888a = cVar;
            this.f73889b = activity;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            boolean z;
            C7573i.m23582a((Object) iArr, "grantResults");
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (iArr[0] == 0) {
                    C19929d.m65758a(this.f73889b, null, 10003);
                } else {
                    C10761a.m31410e((Context) this.f73889b, this.f73889b.getString(R.string.ct5)).mo25750a();
                    this.f73888a.f73875i.mo71399a(-1, "uploadFailed");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$e */
    static final class C28046e implements C22480b {

        /* renamed from: a */
        final /* synthetic */ C28041c f73890a;

        /* renamed from: b */
        final /* synthetic */ Activity f73891b;

        C28046e(C28041c cVar, Activity activity) {
            this.f73890a = cVar;
            this.f73891b = activity;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            boolean z;
            C7573i.m23582a((Object) iArr, "grantResults");
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (iArr[0] == 0) {
                    this.f73890a.mo71487a(this.f73891b);
                } else {
                    C10761a.m31410e((Context) this.f73891b, this.f73891b.getString(R.string.ct5)).mo25750a();
                    this.f73890a.f73875i.mo71399a(-1, "uploadFailed");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$f */
    static final class C28047f<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C28041c f73892a;

        /* renamed from: b */
        final /* synthetic */ C28043b f73893b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f73894c;

        C28047f(C28041c cVar, C28043b bVar, ArrayList arrayList) {
            this.f73892a = cVar;
            this.f73893b = bVar;
            this.f73894c = arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public JSONArray call() {
            if (this.f73893b != null) {
                this.f73894c.add(this.f73893b);
            }
            return C28041c.m91650a((List<C28043b>) this.f73894c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$g */
    static final class C28048g<TTaskResult, TContinuationResult> implements C1591g<JSONArray, Object> {

        /* renamed from: a */
        final /* synthetic */ C28041c f73895a;

        /* renamed from: b */
        final /* synthetic */ C28043b f73896b;

        C28048g(C28041c cVar, C28043b bVar) {
            this.f73895a = cVar;
            this.f73896b = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<JSONArray> hVar) {
            if (!this.f73895a.f73868b) {
                C7573i.m23582a((Object) hVar, "it");
                if (hVar.mo6890e() != null) {
                    this.f73895a.f73875i.mo71400a((JSONArray) hVar.mo6890e());
                } else {
                    this.f73895a.f73875i.mo71399a(0, "uploadFailed");
                }
                if (this.f73896b == null) {
                    C7561a<C7581n> aVar = this.f73895a.f73873g;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    C29119x.f76867a.mo74563a(this.f73895a.f73867a);
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo71423a() {
    }

    /* renamed from: f */
    public final void mo61510f() {
        this.f73873g = null;
    }

    /* renamed from: a */
    public final boolean mo71426a(int i, int i2, Intent intent) {
        if (i2 == 0 || intent == null) {
            this.f73875i.mo71399a(0, "uploadCancel");
            return true;
        }
        Activity activity = (Activity) this.f73874h.get();
        if (activity == null) {
            this.f73875i.mo71399a(0, "uploadFailed");
            return true;
        }
        Context context = activity;
        String a = C19929d.m65756a(context, intent.getData());
        if (C6319n.m19593a(a)) {
            C9738o.m28694a(context, (int) R.drawable.wt, (int) R.string.cty);
            this.f73875i.mo71399a(0, "uploadFailed");
            return true;
        } else if (!new File(a).exists()) {
            C9738o.m28694a(context, (int) R.drawable.wt, (int) R.string.cty);
            this.f73875i.mo71399a(0, "uploadFailed");
            return true;
        } else {
            C19290j jVar = new C19290j(Api.f60503c);
            IAccountUserService userService = C6861a.m21332a().userService();
            C7573i.m23582a((Object) userService, "AccountProxyService.get().userService()");
            jVar.mo51188a("uid", userService.getCurUserId());
            jVar.mo51188a("source", this.f73877l);
            String a2 = jVar.mo51184a();
            C7573i.m23582a((Object) a, "fileName");
            this.f73880o = a;
            this.f73882q.mo71420a(context);
            C6861a.m21332a().userService().uploadAvatar(new C6309f(this), a2, 8388608, a, null);
            return true;
        }
    }

    /* renamed from: e */
    public final void mo61509e() {
        this.f73875i.mo71399a(0, "uploadCancel");
        this.f73868b = true;
    }

    /* renamed from: a */
    public static final /* synthetic */ AtomicInteger m91649a(C28041c cVar) {
        AtomicInteger atomicInteger = cVar.f73872f;
        if (atomicInteger == null) {
            C7573i.m23583a("mMultiUploadFailNum");
        }
        return atomicInteger;
    }

    /* renamed from: b */
    public static final /* synthetic */ HashMap m91653b(C28041c cVar) {
        HashMap<Integer, AvatarUri> hashMap = cVar.f73869c;
        if (hashMap == null) {
            C7573i.m23583a("mAvatarUriList");
        }
        return hashMap;
    }

    /* renamed from: c */
    public static final /* synthetic */ AtomicInteger m91655c(C28041c cVar) {
        AtomicInteger atomicInteger = cVar.f73871e;
        if (atomicInteger == null) {
            C7573i.m23583a("mMultiUploadSuccessNum");
        }
        return atomicInteger;
    }

    /* renamed from: d */
    public static final /* synthetic */ List m91657d(C28041c cVar) {
        List<String> list = cVar.f73870d;
        if (list == null) {
            C7573i.m23583a("mFileNameList");
        }
        return list;
    }

    /* renamed from: a */
    private final void m91651a(int i) {
        this.f73881p = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            C6310a cVar = new C28044c(this, i2);
            List<C6310a> list = this.f73881p;
            if (list == null) {
                C7573i.m23583a("mIHandlerList");
            }
            list.add(cVar);
        }
    }

    /* renamed from: b */
    private final void m91654b(Activity activity) {
        if (C0683b.m2909b((Context) activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            C19929d.m65758a(activity, null, 10003);
            return;
        }
        C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C28045d(this, activity));
    }

    /* renamed from: c */
    private final void m91656c(Activity activity) {
        if (C0683b.m2909b((Context) activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            mo71487a(activity);
            return;
        }
        C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C28046e(this, activity));
    }

    /* renamed from: a */
    public static JSONArray m91650a(List<C28043b> list) {
        String str;
        try {
            JSONArray jSONArray = new JSONArray();
            for (C28043b bVar : list) {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(bVar.f73883a)) {
                    jSONObject.put("url", bVar.f73883a);
                }
                if (!TextUtils.isEmpty(bVar.f73884b)) {
                    jSONObject.put("uri", bVar.f73884b);
                }
                try {
                    str = C42973bg.m136430b(((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().compress(bVar.f73885c, new C34729c(), 216, 384).mPhotoLocalPath);
                    C7573i.m23582a((Object) str, "FileUtils.encodeFileToBa…oContext.mPhotoLocalPath)");
                } catch (IOException unused) {
                    str = "";
                }
                jSONObject.put("base64", str);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo71487a(Activity activity) {
        Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
        intent.putExtra("maxSelectNum", this.f73876k);
        intent.putExtra("enter_from", this.f73879n);
        activity.startActivity(intent);
        C6907h.m21524a("enter_image_choose", (Map) new C22984d().mo59973a("enter_from", this.f73879n).f60753a);
        ImageChooseUploadActivity.f73816i = this;
    }

    public final void handleMsg(Message message) {
        this.f73882q.mo71419a();
        Activity activity = (Activity) this.f73874h.get();
        if (activity == null || message == null) {
            this.f73875i.mo71399a(0, "uploadFailed");
            return;
        }
        if (message.obj instanceof ApiServerException) {
            Context context = activity;
            Object obj = message.obj;
            if (obj != null) {
                C10761a.m31403c(context, ((ApiServerException) obj).getErrorMsg()).mo25750a();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
            }
        } else if (message.obj instanceof AvatarUri) {
            Object obj2 = message.obj;
            if (obj2 != null) {
                AvatarUri avatarUri = (AvatarUri) obj2;
                if (avatarUri.urlList != null) {
                    List<String> list = avatarUri.urlList;
                    C7573i.m23582a((Object) list, "uri.urlList");
                    if (!list.isEmpty()) {
                        String str = (String) avatarUri.urlList.get(0);
                        C7573i.m23582a((Object) str, "url");
                        String str2 = avatarUri.uri;
                        C7573i.m23582a((Object) str2, "uri.uri");
                        mo71488a(new C28043b(str, str2, this.f73880o), new ArrayList<>());
                        return;
                    }
                }
                this.f73875i.mo71399a(0, "uploadFailed");
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
        }
        this.f73875i.mo71399a(0, "uploadFailed");
    }

    /* renamed from: a */
    public final void mo71425a(JSONObject jSONObject) {
        C7573i.m23587b(jSONObject, "params");
        this.f73876k = jSONObject.optInt("maxSelectNum", 1);
        String optString = jSONObject.optString("source", "");
        C7573i.m23582a((Object) optString, "params.optString(\"source\", \"\")");
        this.f73877l = optString;
        this.f73878m = jSONObject.optBoolean("isMultiSelect", false);
        String optString2 = jSONObject.optString("from", "");
        C7573i.m23582a((Object) optString2, "params.optString(\"from\", \"\")");
        this.f73879n = optString2;
        this.f73867a = jSONObject.optInt("image_width", 216);
        if (((Activity) this.f73874h.get()) != null) {
            if (this.f73878m) {
                Object obj = this.f73874h.get();
                if (obj != null) {
                    m91656c((Activity) obj);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            Object obj2 = this.f73874h.get();
            if (obj2 != null) {
                m91654b((Activity) obj2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: a */
    public final void mo71488a(C28043b bVar, ArrayList<C28043b> arrayList) {
        C1592h.m7853a((Callable<TResult>) new C28047f<TResult>(this, bVar, arrayList)).mo6876a((C1591g<TResult, TContinuationResult>) new C28048g<TResult,TContinuationResult>(this, bVar), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo61506a(List<String> list, C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "onUploadFinishedListener");
        if (list != null) {
            this.f73873g = aVar;
            this.f73871e = new AtomicInteger(0);
            this.f73872f = new AtomicInteger(0);
            this.f73870d = list;
            this.f73869c = new HashMap<>();
            List<String> list2 = this.f73870d;
            if (list2 == null) {
                C7573i.m23583a("mFileNameList");
            }
            m91651a(list2.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = (String) list.get(i);
                if (C6319n.m19593a(str)) {
                    AtomicInteger atomicInteger = this.f73872f;
                    if (atomicInteger == null) {
                        C7573i.m23583a("mMultiUploadFailNum");
                    }
                    atomicInteger.incrementAndGet();
                } else {
                    File file = new File(str);
                    if (!file.exists()) {
                        AtomicInteger atomicInteger2 = this.f73872f;
                        if (atomicInteger2 == null) {
                            C7573i.m23583a("mMultiUploadFailNum");
                        }
                        atomicInteger2.incrementAndGet();
                    } else {
                        C19290j jVar = new C19290j(Api.f60503c);
                        IAccountUserService userService = C6861a.m21332a().userService();
                        C7573i.m23582a((Object) userService, "AccountProxyService.get().userService()");
                        jVar.mo51188a("uid", userService.getCurUserId());
                        jVar.mo51188a("source", this.f73877l);
                        String a = jVar.mo51184a();
                        IAccountUserService userService2 = C6861a.m21332a().userService();
                        List<C6310a> list3 = this.f73881p;
                        if (list3 == null) {
                            C7573i.m23583a("mIHandlerList");
                        }
                        userService2.uploadAvatar(new C6309f((C6310a) list3.get(i)), a, 8388608, C29119x.f76867a.mo74562a(str, file, this.f73867a), null);
                    }
                }
            }
        }
    }

    public C28041c(WeakReference<Activity> weakReference, C27943a aVar, C27996m mVar) {
        C7573i.m23587b(weakReference, "contextRef");
        C7573i.m23587b(aVar, "upLoadDialog");
        C7573i.m23587b(mVar, "onFileSelected");
        this.f73874h = weakReference;
        this.f73882q = aVar;
        this.f73875i = mVar;
    }
}
