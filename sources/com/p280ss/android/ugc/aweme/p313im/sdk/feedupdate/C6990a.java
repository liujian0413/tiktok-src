package com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate;

import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.FeedUpdate.UserUnreadItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.a */
public final class C6990a {

    /* renamed from: b */
    private static C6990a f19732b = new C6990a();

    /* renamed from: a */
    public volatile boolean f19733a = false;

    /* renamed from: c */
    private ConcurrentHashMap<String, VideoTag> f19734c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C6990a m21758a() {
        return f19732b;
    }

    /* renamed from: i */
    private void m21763i() {
        if (!this.f19733a) {
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    C6990a.this.mo18075e();
                }
            });
        }
    }

    /* renamed from: f */
    public final void mo18076f() {
        this.f19734c.clear();
        this.f19733a = false;
    }

    /* renamed from: h */
    private static String m21762h() {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        StringBuilder sb = new StringBuilder("update_video_data_");
        sb.append(currentUserID);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo18071b() {
        if (!this.f19733a) {
            this.f19733a = true;
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    C6990a.this.mo18074d();
                    C6990a.this.mo18072c();
                    C6990a.this.f19733a = false;
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo18074d() {
        this.f19734c.clear();
        ArrayList g = m21761g();
        if (!C23477d.m77081a((Collection<T>) g)) {
            Iterator it = g.iterator();
            while (it.hasNext()) {
                VideoTag videoTag = (VideoTag) it.next();
                videoTag.generate();
                if (videoTag.getTagCount() > 0) {
                    this.f19734c.put(videoTag.getUid(), videoTag);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo18075e() {
        ArrayList arrayList = new ArrayList();
        for (Entry value : this.f19734c.entrySet()) {
            VideoTag videoTag = (VideoTag) value.getValue();
            if (videoTag.getTagCount() > 0) {
                arrayList.add(videoTag);
            } else {
                this.f19734c.remove(videoTag.getUid());
            }
        }
        m21760a(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0049, code lost:
        if (r2 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x004f, code lost:
        if (r2 != null) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003e A[SYNTHETIC, Splitter:B:31:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0057 A[SYNTHETIC, Splitter:B:50:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList<com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.VideoTag> m21761g() {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ Exception -> 0x0053, all -> 0x003a }
            java.lang.String r2 = m21762h()     // Catch:{ Exception -> 0x0053, all -> 0x003a }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ Exception -> 0x0053, all -> 0x003a }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
            java.lang.Object r3 = r2.readObject()     // Catch:{ Exception -> 0x0055, all -> 0x002d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ Exception -> 0x0055, all -> 0x002d }
            r2.close()     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            if (r1 == 0) goto L_0x002b
        L_0x001d:
            r1.close()     // Catch:{ Exception -> 0x002b }
            goto L_0x002b
        L_0x0021:
            r0 = move-exception
            if (r1 == 0) goto L_0x0027
            r1.close()     // Catch:{ Exception -> 0x0027 }
        L_0x0027:
            throw r0
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x001d
        L_0x002b:
            r0 = r3
            goto L_0x006b
        L_0x002d:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r2
            r2 = r4
            goto L_0x003c
        L_0x0033:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x003c
        L_0x0038:
            r2 = r0
            goto L_0x0055
        L_0x003a:
            r1 = move-exception
            r2 = r0
        L_0x003c:
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            goto L_0x004f
        L_0x0042:
            r0 = move-exception
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            throw r0
        L_0x0049:
            if (r2 == 0) goto L_0x0052
        L_0x004b:
            r2.close()     // Catch:{ Exception -> 0x0052 }
            goto L_0x0052
        L_0x004f:
            if (r2 == 0) goto L_0x0052
            goto L_0x004b
        L_0x0052:
            throw r1
        L_0x0053:
            r1 = r0
            r2 = r1
        L_0x0055:
            if (r2 == 0) goto L_0x0068
            r2.close()     // Catch:{ Exception -> 0x0062, all -> 0x005b }
            goto L_0x0068
        L_0x005b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0061
            r1.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            throw r0
        L_0x0062:
            if (r1 == 0) goto L_0x006b
        L_0x0064:
            r1.close()     // Catch:{ Exception -> 0x006b }
            goto L_0x006b
        L_0x0068:
            if (r1 == 0) goto L_0x006b
            goto L_0x0064
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.C6990a.m21761g():java.util.ArrayList");
    }

    /* renamed from: c */
    public final void mo18072c() {
        FeedUpdate a = FeedUpdateApiManager.m101668a(0);
        if (a != null && a.getStatusCode() == 0 && !C23477d.m77081a((Collection<T>) a.getItems())) {
            for (UserUnreadItem userUnreadItem : a.getItems()) {
                if (this.f19734c.containsKey(String.valueOf(userUnreadItem.getUid()))) {
                    ((VideoTag) this.f19734c.get(String.valueOf(userUnreadItem.getUid()))).add(userUnreadItem);
                } else {
                    VideoTag videoTag = new VideoTag(userUnreadItem);
                    this.f19734c.put(videoTag.getUid(), videoTag);
                }
            }
        }
        mo18075e();
    }

    /* renamed from: a */
    public static String m21759a(int i) {
        if (i > 99) {
            return "99+";
        }
        return String.valueOf(i);
    }

    /* renamed from: c */
    public final void mo18073c(String str) {
        this.f19734c.remove(str);
        m21763i();
    }

    /* renamed from: a */
    public final int mo18069a(String str) {
        if (this.f19734c.containsKey(str)) {
            return ((VideoTag) this.f19734c.get(str)).getTagCount();
        }
        return 0;
    }

    /* renamed from: b */
    public final VideoTag mo18070b(String str) {
        if (this.f19734c.containsKey(str)) {
            return (VideoTag) this.f19734c.get(str);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0055, code lost:
        if (r1 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005b, code lost:
        if (r1 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x006d, code lost:
        if (r1 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0070, code lost:
        if (r1 != null) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004a A[SYNTHETIC, Splitter:B:33:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0062 A[SYNTHETIC, Splitter:B:52:0x0062] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21760a(java.util.ArrayList<com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.VideoTag> r5) {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = m21762h()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0016
            boolean r0 = r0.delete()
            if (r0 != 0) goto L_0x0016
            return
        L_0x0016:
            r0 = 0
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ Exception -> 0x005f, all -> 0x0046 }
            java.lang.String r2 = m21762h()     // Catch:{ Exception -> 0x005f, all -> 0x0046 }
            r3 = 0
            java.io.FileOutputStream r1 = r1.openFileOutput(r2, r3)     // Catch:{ Exception -> 0x005f, all -> 0x0046 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0060, all -> 0x0044 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0060, all -> 0x0044 }
            r2.writeObject(r5)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            r2.close()     // Catch:{ Exception -> 0x003c, all -> 0x0035 }
            if (r1 == 0) goto L_0x0073
        L_0x0031:
            r1.close()     // Catch:{ Exception -> 0x0073 }
            goto L_0x0073
        L_0x0035:
            r5 = move-exception
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            throw r5
        L_0x003c:
            if (r1 == 0) goto L_0x0073
            goto L_0x0031
        L_0x003f:
            r5 = move-exception
            r0 = r2
            goto L_0x0048
        L_0x0042:
            r0 = r2
            goto L_0x0060
        L_0x0044:
            r5 = move-exception
            goto L_0x0048
        L_0x0046:
            r5 = move-exception
            r1 = r0
        L_0x0048:
            if (r0 == 0) goto L_0x005b
            r0.close()     // Catch:{ Exception -> 0x0055, all -> 0x004e }
            goto L_0x005b
        L_0x004e:
            r5 = move-exception
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            throw r5
        L_0x0055:
            if (r1 == 0) goto L_0x005e
        L_0x0057:
            r1.close()     // Catch:{ Exception -> 0x005e }
            goto L_0x005e
        L_0x005b:
            if (r1 == 0) goto L_0x005e
            goto L_0x0057
        L_0x005e:
            throw r5
        L_0x005f:
            r1 = r0
        L_0x0060:
            if (r0 == 0) goto L_0x0070
            r0.close()     // Catch:{ Exception -> 0x006d, all -> 0x0066 }
            goto L_0x0070
        L_0x0066:
            r5 = move-exception
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            throw r5
        L_0x006d:
            if (r1 == 0) goto L_0x0073
            goto L_0x0031
        L_0x0070:
            if (r1 == 0) goto L_0x0073
            goto L_0x0031
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.C6990a.m21760a(java.util.ArrayList):void");
    }
}
