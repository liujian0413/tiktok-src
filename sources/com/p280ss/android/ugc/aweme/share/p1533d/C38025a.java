package com.p280ss.android.ugc.aweme.share.p1533d;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.feed.C28205ai;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.setting.C37577aw;
import com.p280ss.android.ugc.aweme.share.C37983ao;
import com.p280ss.android.ugc.aweme.share.gif.C38044a;
import com.p280ss.android.ugc.aweme.share.improve.C38065a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.trill.share.data.C45111a;
import com.p280ss.android.ugc.trill.share.data.C45112b;
import com.p280ss.android.ugc.trill.share.data.ShareDatabase;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.share.d.a */
public class C38025a {

    /* renamed from: c */
    private static volatile C38025a f98974c;

    /* renamed from: a */
    public List<C37983ao> f98975a;

    /* renamed from: b */
    public List<C37577aw> f98976b;

    /* renamed from: d */
    private ShareDatabase f98977d = ShareDatabase.m142253a(C6399b.m19921a());

    /* renamed from: e */
    private Integer f98978e;

    /* renamed from: f */
    private Integer f98979f;

    /* renamed from: a */
    public static C38025a m121371a() {
        if (f98974c == null) {
            synchronized (C38025a.class) {
                if (f98974c == null) {
                    f98974c = new C38025a();
                }
            }
        }
        return f98974c;
    }

    /* renamed from: c */
    private String[] m121376c() {
        LinkedList linkedList = new LinkedList(Arrays.asList(m121377d()));
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return m121372a(strArr, 0);
    }

    private C38025a() {
        boolean z;
        C6921a.m21562b("I18nShareOrderUtil", "Instantiating I18nShareOrderUtil");
        String str = "I18nShareOrderUtil";
        StringBuilder sb = new StringBuilder("I18nShareOrderUtil instantiated, ShareDatabase ready: ");
        if (this.f98977d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C6921a.m21562b(str, sb.toString());
    }

    /* renamed from: b */
    public static String[] m121375b() {
        if (C38044a.m121413a() == null || C38044a.m121413a().isEmpty()) {
            return new String[]{"messenger", "whatsapp", "sms", "twitter", "reddit", "imgur", "line", "kakaotalk", "more"};
        }
        ArrayList arrayList = new ArrayList();
        for (C37983ao aoVar : C38044a.m121413a()) {
            arrayList.add(aoVar.f98894a);
        }
        if (!C6903bc.m21488g().mo80287b()) {
            arrayList.remove("chat_merge");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: d */
    private String[] m121377d() {
        String[] strArr;
        if (this.f98975a == null || this.f98975a.isEmpty()) {
            strArr = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(C6399b.m19921a()).mo18533d();
        } else {
            strArr = new String[this.f98975a.size()];
            for (int i = 0; i < this.f98975a.size(); i++) {
                strArr[i] = ((C37983ao) this.f98975a.get(i)).f98894a;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String add : strArr) {
            arrayList.add(add);
        }
        if (!C6903bc.m21488g().mo80287b()) {
            arrayList.remove("chat_merge");
        }
        if (C6399b.m19947w()) {
            arrayList.remove("vk");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: b */
    private long m121374b(int i) {
        try {
            if (this.f98977d != null) {
                return this.f98977d.mo107673h().mo107678c(Integer.valueOf(i));
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* renamed from: a */
    public final String mo95662a(int i) {
        if (m121374b(0) == 0) {
            return null;
        }
        String[] a = m121373a(m121377d(), 0, 100);
        if (a != null && a.length > 0) {
            for (String str : a) {
                C38343b a2 = C38065a.m121466a(str);
                if (a2 != null && a2.mo95743a(C6399b.m19921a())) {
                    return str;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Drawable m121370a(Activity activity) {
        String c = C28205ai.m92707c();
        C38343b a = C38065a.m121467a(c, activity);
        if (a != null && a.mo95743a(activity)) {
            return C0683b.m2903a((Context) activity, a.mo95736a());
        }
        List<String> asList = Arrays.asList(m121371a().m121376c());
        if (!C6307b.m19566a((Collection<T>) asList)) {
            for (String equals : asList) {
                if (!TextUtils.equals(equals, "chat_merge")) {
                    C38343b a2 = C38065a.m121467a(c, activity);
                    if (a2 != null && a2.mo95743a(activity)) {
                        return C0683b.m2903a((Context) activity, a2.mo95736a());
                    }
                }
            }
        }
        return activity.getResources().getDrawable(R.drawable.au6);
    }

    /* renamed from: a */
    private String[] m121372a(String[] strArr, int i) {
        return m121373a(strArr, 0, 10);
    }

    /* renamed from: a */
    public final void mo95663a(String str, int i) {
        C1592h.m7853a((Callable<TResult>) new C38027c<TResult>(this, str, i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo95664b(String str, int i) throws Exception {
        if (TextUtils.equals("more", str)) {
            return null;
        }
        try {
            ShareDatabase shareDatabase = this.f98977d;
            if (shareDatabase != null) {
                C45112b h = shareDatabase.mo107673h();
                h.mo107676a(new C45111a(Long.valueOf(System.currentTimeMillis()), str, Integer.valueOf(i)));
                if (this.f98979f != null) {
                    h.mo107677b(this.f98979f);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    private String[] m121373a(String[] strArr, int i, int i2) {
        int i3;
        try {
            if (this.f98977d != null) {
                HashMap hashMap = new HashMap();
                for (String put : strArr) {
                    hashMap.put(put, Integer.valueOf(0));
                }
                List<C45111a> a = this.f98977d.mo107673h().mo107675a(Integer.valueOf(i), Integer.valueOf(100));
                if (a.size() >= 100) {
                    this.f98979f = Integer.valueOf(((C45111a) a.get(a.size() - 1)).f115947a);
                }
                if (a.size() > i2 && i2 <= 100) {
                    a = a.subList(0, i2);
                }
                for (C45111a aVar : a) {
                    Integer num = (Integer) hashMap.get(aVar.f115949c);
                    String str = aVar.f115949c;
                    if (num == null) {
                        i3 = 1;
                    } else {
                        i3 = num.intValue() + 1;
                    }
                    hashMap.put(str, Integer.valueOf(i3));
                }
                Arrays.sort(strArr, new C38026b(hashMap, a));
                this.f98978e = Integer.valueOf(i);
            }
        } catch (Exception unused) {
        }
        return strArr;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.trill.share.data.a>, for r8v0, types: [java.util.List, java.util.List<com.ss.android.ugc.trill.share.data.a>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ int m121369a(java.util.Map r7, java.util.List<com.p280ss.android.ugc.trill.share.data.C45111a> r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.Object r0 = r7.get(r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r7 = r7.get(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r0 = r0 - r7
            if (r0 != 0) goto L_0x0055
            java.util.Iterator r7 = r8.iterator()
            r0 = 0
            r2 = r0
            r4 = r2
        L_0x001f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0051
            java.lang.Object r8 = r7.next()
            com.ss.android.ugc.trill.share.data.a r8 = (com.p280ss.android.ugc.trill.share.data.C45111a) r8
            java.lang.String r6 = r8.f115949c
            boolean r6 = android.text.TextUtils.equals(r6, r9)
            if (r6 == 0) goto L_0x003e
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x003e
            java.lang.Long r8 = r8.f115948b
            long r4 = r8.longValue()
            goto L_0x001f
        L_0x003e:
            java.lang.String r6 = r8.f115949c
            boolean r6 = android.text.TextUtils.equals(r6, r10)
            if (r6 == 0) goto L_0x001f
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x001f
            java.lang.Long r8 = r8.f115948b
            long r2 = r8.longValue()
            goto L_0x001f
        L_0x0051:
            r7 = 0
            long r2 = r2 - r4
            int r7 = (int) r2
            return r7
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.p1533d.C38025a.m121369a(java.util.Map, java.util.List, java.lang.String, java.lang.String):int");
    }
}
