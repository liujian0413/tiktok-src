package com.p280ss.android.ugc.aweme.emoji.p1206d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.p482io.FileUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.C27599a;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.EmojiCreate;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.utils.C27630a;
import com.p280ss.android.ugc.aweme.emoji.utils.C27631b;
import com.p280ss.android.ugc.aweme.emoji.utils.C27632c;
import com.p280ss.android.ugc.aweme.emoji.utils.C27635f;
import com.p280ss.android.ugc.aweme.emoji.utils.EmojiApi;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.emoji.d.b */
public class C27536b implements C27535a {

    /* renamed from: d */
    private static C27536b f72588d;

    /* renamed from: a */
    public int f72589a;

    /* renamed from: b */
    private List<Emoji> f72590b;

    /* renamed from: c */
    private boolean f72591c;

    /* renamed from: e */
    private List<C27535a> f72592e = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.emoji.d.b$a */
    class C27538a extends C27539b {

        /* renamed from: a */
        Emoji f72593a;

        private C27538a() {
            super();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.d.b$b */
    class C27539b {

        /* renamed from: c */
        boolean f72595c;

        /* renamed from: d */
        List<Emoji> f72596d;

        /* renamed from: e */
        String f72597e;

        /* renamed from: f */
        int f72598f;

        private C27539b() {
        }
    }

    /* renamed from: a */
    public final void mo70757a(C27535a aVar) {
        if (m90257b() && !this.f72592e.contains(aVar)) {
            this.f72592e.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo70760a(boolean z) {
        if (C27630a.m90583a() && m90257b() && (z || !this.f72591c)) {
            this.f72591c = true;
            this.f72589a = 0;
            C27631b.m90586a().getSelfEmojis().mo6876a((C1591g<TResult, TContinuationResult>) new C27540c<TResult,TContinuationResult>(this), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C27541d<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final boolean mo70763a(String str, String str2, String str3) {
        Context h = m90259h();
        if (!C27552o.m90286a(h)) {
            C10761a.m31399c(h, (int) R.string.b0d).mo25750a();
            return false;
        } else if (mo70772e() >= 79) {
            C10761a.m31399c(h, (int) R.string.b0b).mo25750a();
            return false;
        } else {
            C1592h.m7855a((Callable<TResult>) new C27547j<TResult>(this, str, str2, str3), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C27548k<TResult,TContinuationResult>(this), C1592h.f5958b);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo70759a(Throwable th) throws Exception {
        C27539b bVar = new C27539b();
        bVar.f72596d = Collections.emptyList();
        bVar.f72595c = false;
        if (th instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) th;
            bVar.f72597e = apiServerException.getErrorMsg();
            bVar.f72598f = apiServerException.getErrorCode();
        }
        mo63141a(bVar.f72596d, bVar.f72595c, bVar.f72597e);
        m90256b(bVar);
    }

    /* renamed from: a */
    public final void mo70761a(Emoji... emojiArr) {
        Context h = m90259h();
        if (!C27552o.m90286a(h)) {
            C10761a.m31399c(h, (int) R.string.b0d).mo25750a();
            return;
        }
        String b = m90254b(emojiArr);
        if (!TextUtils.isEmpty(b)) {
            EmojiApi a = C27631b.m90586a();
            StringBuilder sb = new StringBuilder("[");
            sb.append(b);
            sb.append("]");
            a.collectEmoji(0, sb.toString()).mo6876a((C1591g<TResult, TContinuationResult>) new C27543f<TResult,TContinuationResult>(this), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C27544g<TResult,TContinuationResult>(this, h), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final void mo63140a(List<Emoji> list, Emoji emoji, boolean z, String str) {
        for (C27535a a : this.f72592e) {
            a.mo63140a(list, emoji, z, str);
        }
    }

    /* renamed from: b */
    public final void mo63142b(List<Emoji> list, boolean z, String str) {
        for (C27535a b : this.f72592e) {
            b.mo63142b(list, z, str);
        }
    }

    /* renamed from: a */
    public final void mo63141a(List<Emoji> list, boolean z, String str) {
        for (C27535a a : this.f72592e) {
            a.mo63141a(list, z, str);
        }
    }

    /* renamed from: a */
    public final void mo63139a(List<Emoji> list) {
        for (C27535a a : this.f72592e) {
            a.mo63139a(list);
        }
    }

    /* renamed from: a */
    public final boolean mo70762a(Emoji emoji) {
        return mo70771d().contains(emoji);
    }

    private C27536b() {
    }

    /* renamed from: h */
    private static Context m90259h() {
        Activity g = C6405d.m19984g();
        if (g == null) {
            return C6399b.m19921a();
        }
        return g;
    }

    /* renamed from: a */
    public static C27536b m90251a() {
        if (f72588d == null) {
            synchronized (C27536b.class) {
                if (f72588d == null) {
                    f72588d = new C27536b();
                }
            }
        }
        return f72588d;
    }

    /* renamed from: b */
    public static boolean m90257b() {
        if (!C6399b.m19944t()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static String m90258g() {
        StringBuilder sb = new StringBuilder("SELF_EMOJIS");
        sb.append(C27630a.m90585c());
        return sb.toString();
    }

    /* renamed from: e */
    public final int mo70772e() {
        if (!C6307b.m19566a((Collection<T>) this.f72590b)) {
            return this.f72590b.size();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ List mo70774f() throws Exception {
        if (!C6307b.m19566a((Collection<T>) this.f72590b)) {
            return this.f72590b;
        }
        List<Emoji> a = C27635f.m90605a(m90258g(), Emoji.class);
        this.f72590b = a;
        return a;
    }

    /* renamed from: c */
    public final void mo70769c() {
        if (m90257b()) {
            if (this.f72591c || !C27552o.m90286a(C6399b.m19921a())) {
                C1592h.m7855a((Callable<TResult>) new C27545h<TResult>(this), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C27546i<TResult,TContinuationResult>(this), C1592h.f5958b);
            } else {
                mo70760a(false);
            }
        }
    }

    /* renamed from: d */
    public final List<Emoji> mo70771d() {
        ArrayList arrayList = new ArrayList();
        if (!C6307b.m19566a((Collection<T>) this.f72590b)) {
            arrayList.addAll(this.f72590b);
        } else {
            this.f72590b = C27635f.m90605a(m90258g(), Emoji.class);
            arrayList.addAll(this.f72590b);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<Emoji> m90255b(List<Emoji> list) {
        if (list.size() > 80) {
            return list.subList(0, 80);
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo70758a(C27539b bVar) throws Exception {
        mo63141a(bVar.f72596d, bVar.f72595c, bVar.f72597e);
        m90256b(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Void mo70768c(C1592h hVar) throws Exception {
        mo63139a((List) hVar.mo6890e());
        return null;
    }

    /* renamed from: a */
    private void m90252a(C7492s<C27599a> sVar) {
        sVar.mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19317d((C7327h<? super T, ? extends R>) new C27550m<Object,Object>(this)).mo19280a((C7326g<? super T>) new C27551n<Object>(this), (C7326g<? super Throwable>) new C27542e<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo70765b(C1592h hVar) throws Exception {
        C27538a aVar;
        if (hVar.mo6890e() == null) {
            aVar = new C27538a();
        } else {
            aVar = (C27538a) hVar.mo6890e();
        }
        mo63140a(aVar.f72596d, aVar.f72593a, aVar.f72595c, aVar.f72597e);
        m90256b((C27539b) aVar);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ Void mo70770d(C1592h hVar) throws Exception {
        List list;
        if (hVar == null || !hVar.mo6882b()) {
            list = null;
        } else {
            list = (List) hVar.mo6890e();
        }
        if (!C6307b.m19566a((Collection<T>) list)) {
            this.f72589a = 3;
        } else if (this.f72589a == 1) {
            this.f72591c = false;
        } else {
            this.f72589a = 2;
        }
        mo63139a(list);
        return null;
    }

    /* renamed from: a */
    private void m90253a(Runnable runnable) {
        Context h = m90259h();
        if (!C27552o.m90286a(h)) {
            C10761a.m31399c(h, (int) R.string.b0d).mo25750a();
        } else if (mo70772e() >= 79) {
            C10761a.m31399c(h, (int) R.string.b0b).mo25750a();
        } else {
            runnable.run();
        }
    }

    /* renamed from: b */
    private String m90254b(Emoji... emojiArr) {
        String str = ",";
        StringBuilder sb = new StringBuilder();
        for (Emoji emoji : emojiArr) {
            if (emoji != null) {
                long id = emoji.getId();
                if (id <= 0) {
                    List d = mo70771d();
                    int indexOf = d.indexOf(emoji);
                    if (indexOf >= 0 && indexOf < d.size()) {
                        id = ((Emoji) d.get(indexOf)).getId();
                    }
                }
                if (id > 0) {
                    sb.append(emoji.getId());
                    sb.append(str);
                }
            }
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.lastIndexOf(str));
    }

    /* JADX INFO: used method not loaded: com.ss.android.ugc.aweme.emoji.utils.f.a(java.lang.String, java.util.List):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r5 = r2.getStickers();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        com.p280ss.android.ugc.aweme.emoji.utils.C27635f.m90606a(m90258g(), (java.util.List) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        r4.f72589a = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.util.List mo70773e(bolts.C1592h r5) throws java.lang.Exception {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x004f
            boolean r1 = r5.mo6882b()
            if (r1 == 0) goto L_0x004f
            r1 = 1
            java.lang.Object r5 = r5.mo6890e()     // Catch:{ Exception -> 0x004d }
            com.ss.android.ugc.aweme.emoji.emojichoose.model.EmojiResourcesResponse r5 = (com.p280ss.android.ugc.aweme.emoji.emojichoose.model.EmojiResourcesResponse) r5     // Catch:{ Exception -> 0x004d }
            if (r5 == 0) goto L_0x004a
            int r2 = r5.status_code     // Catch:{ Exception -> 0x004d }
            if (r2 == 0) goto L_0x0017
            goto L_0x004a
        L_0x0017:
            java.util.List r2 = r5.getResources()     // Catch:{ Exception -> 0x004d }
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)     // Catch:{ Exception -> 0x004d }
            if (r2 != 0) goto L_0x004f
            java.util.List r5 = r5.getResources()     // Catch:{ Exception -> 0x004d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x004d }
        L_0x0029:
            boolean r2 = r5.hasNext()     // Catch:{ Exception -> 0x004d }
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r5.next()     // Catch:{ Exception -> 0x004d }
            com.ss.android.ugc.aweme.emoji.emojichoose.model.EmojiResources r2 = (com.p280ss.android.ugc.aweme.emoji.emojichoose.model.EmojiResources) r2     // Catch:{ Exception -> 0x004d }
            int r3 = r2.getPackageType()     // Catch:{ Exception -> 0x004d }
            if (r1 != r3) goto L_0x0029
            java.util.List r5 = r2.getStickers()     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = m90258g()     // Catch:{ Exception -> 0x0048 }
            com.p280ss.android.ugc.aweme.emoji.utils.C27635f.m90606a(r0, r5)     // Catch:{ Exception -> 0x0048 }
            r0 = r5
            goto L_0x004f
        L_0x0048:
            r0 = r5
            goto L_0x004d
        L_0x004a:
            r4.f72589a = r1     // Catch:{ Exception -> 0x004d }
            goto L_0x004f
        L_0x004d:
            r4.f72589a = r1
        L_0x004f:
            boolean r5 = com.bytedance.common.utility.collection.C6307b.m19566a(r0)
            if (r5 == 0) goto L_0x005f
            java.lang.String r5 = m90258g()
            java.lang.Class<com.ss.android.ugc.aweme.emoji.model.Emoji> r0 = com.p280ss.android.ugc.aweme.emoji.model.Emoji.class
            java.util.List r0 = com.p280ss.android.ugc.aweme.emoji.utils.C27635f.m90605a(r5, r0)
        L_0x005f:
            r4.f72590b = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.p1206d.C27536b.mo70773e(bolts.h):java.util.List");
    }

    /* renamed from: b */
    private void m90256b(C27539b bVar) {
        String str;
        String str2;
        Context h = m90259h();
        if (bVar.f72595c) {
            if (TextUtils.isEmpty(bVar.f72597e)) {
                str2 = h.getString(R.string.azz);
            } else {
                str2 = bVar.f72597e;
            }
            C10761a.m31387a(h, str2).mo25750a();
            return;
        }
        if (!TextUtils.isEmpty(bVar.f72597e)) {
            str = bVar.f72597e;
        } else if (bVar.f72598f == 7279) {
            str = h.getString(R.string.b0b);
        } else if (bVar.f72598f == 7280) {
            str = h.getString(R.string.b01);
        } else {
            str = h.getString(R.string.b0d);
        }
        C10761a.m31403c(h, str).mo25750a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C27539b mo70753a(C1592h hVar) throws Exception {
        C27599a aVar;
        boolean z;
        if (hVar == null || !hVar.mo6882b()) {
            aVar = null;
        } else {
            aVar = (C27599a) hVar.mo6890e();
        }
        C27539b bVar = new C27539b();
        if (aVar != null) {
            bVar.f72597e = aVar.status_msg;
            if (aVar.status_code != 0 || C6307b.m19566a((Collection<T>) aVar.f72749a)) {
                z = false;
            } else {
                z = true;
            }
            bVar.f72595c = z;
            if (bVar.f72595c) {
                List<Emoji> d = mo70771d();
                d.removeAll(aVar.f72749a);
                C27635f.m90606a(m90258g(), d);
                bVar.f72596d = d;
                this.f72590b = d;
            }
        }
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C27539b mo70754a(C27599a aVar) throws Exception {
        boolean z;
        C27539b bVar = new C27539b();
        if (aVar != null) {
            bVar.f72597e = aVar.status_msg;
            bVar.f72598f = aVar.status_code;
            if (aVar.status_code != 0 || C6307b.m19566a((Collection<T>) aVar.f72749a)) {
                z = false;
            } else {
                z = true;
            }
            bVar.f72595c = z;
            if (bVar.f72595c) {
                Emoji emoji = (Emoji) aVar.f72749a.get(0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(emoji);
                arrayList.addAll(mo70771d());
                C27635f.m90606a(m90258g(), (List<? extends T>) arrayList);
                bVar.f72596d = arrayList;
                this.f72590b = arrayList;
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public final void mo70767b(C27535a aVar) {
        if (m90257b()) {
            this.f72592e.remove(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo70755a(Context context, C1592h hVar) throws Exception {
        C27539b bVar;
        String str;
        String str2;
        if (hVar.mo6890e() == null) {
            bVar = new C27539b();
        } else {
            bVar = (C27539b) hVar.mo6890e();
        }
        if (bVar.f72595c) {
            if (TextUtils.isEmpty(bVar.f72597e)) {
                str2 = context.getString(R.string.b0g);
            } else {
                str2 = bVar.f72597e;
            }
            C10761a.m31387a(context, str2).mo25750a();
        } else {
            if (TextUtils.isEmpty(bVar.f72597e)) {
                str = context.getString(R.string.b0d);
            } else {
                str = bVar.f72597e;
            }
            C10761a.m31403c(context, str).mo25750a();
        }
        mo63142b(bVar.f72596d, bVar.f72595c, bVar.f72597e);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C27538a mo70764b(String str, String str2, String str3) throws Exception {
        boolean z;
        C27599a aVar = null;
        C27538a aVar2 = new C27538a();
        try {
            String a = C6306c.m19560a(new File(str));
            EmojiCreate obtain = EmojiCreate.obtain(str2, str3);
            if (obtain != null) {
                aVar = (C27599a) C27631b.m90586a().addSelfEmoji(a, obtain.getAnimateUrl(), obtain.getStaticUrl(), obtain.getAnimateType(), obtain.getStaticType(), obtain.getWidth(), obtain.getHeight()).get();
            }
            if (aVar != null) {
                aVar2.f72597e = aVar.status_msg;
                aVar2.f72598f = aVar.status_code;
                if (aVar.status_code != 0 || C6307b.m19566a((Collection<T>) aVar.f72749a)) {
                    z = false;
                } else {
                    z = true;
                }
                aVar2.f72595c = z;
                if (aVar2.f72595c) {
                    aVar2.f72593a = (Emoji) aVar.f72749a.get(0);
                    if (aVar2.f72593a != null) {
                        FileUtils.m28675a(str2, C27632c.m90587a(), C27632c.m90592c(aVar2.f72593a));
                        FileUtils.m28675a(str2, C27632c.m90590b(), C27632c.m90593d(aVar2.f72593a));
                    }
                    if (aVar2.f72593a != null) {
                        Emoji emoji = aVar2.f72593a;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(emoji);
                        arrayList.addAll(mo70771d());
                        C27635f.m90606a(m90258g(), (List<? extends T>) arrayList);
                        aVar2.f72596d = arrayList;
                        this.f72590b = arrayList;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return aVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo70766b(long j, String str, String str2, long j2, int i) {
        EmojiApi a = C27631b.m90586a();
        StringBuilder sb = new StringBuilder("[");
        sb.append(j);
        sb.append("]");
        m90252a(a.rxCollectEmoji(1, sb.toString(), str, str2, j2, i));
    }

    /* renamed from: a */
    public final void mo70756a(long j, String str, String str2, long j2, int i) {
        C27549l lVar = new C27549l(this, j, str, str2, j2, i);
        m90253a((Runnable) lVar);
    }
}
