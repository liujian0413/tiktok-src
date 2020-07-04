package com.p280ss.android.ugc.aweme.profile.presenter;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.p1054a.p1055a.C23222h;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25677e;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26112p;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.C36089t;
import com.p280ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.p280ss.android.ugc.aweme.profile.util.C36729b;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.b */
public class C36018b extends C25673a<Aweme, FeedItemList> implements C26112p {

    /* renamed from: c */
    public int f94228c;

    /* renamed from: d */
    public int f94229d;

    /* renamed from: e */
    public String f94230e;

    /* renamed from: f */
    public boolean f94231f;

    public boolean isNewDataEmpty() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo90896a(boolean z, String str, int i, long j, int i2, String str2) {
        final int i3 = i;
        this.f94228c = i3;
        final String str3 = str;
        this.f94230e = str3;
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final boolean z2 = z;
        final String str4 = str2;
        final long j2 = j;
        final int i4 = i2;
        C360191 r0 = new Callable<FeedItemList>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public FeedItemList call() throws Exception {
                FeedItemList feedItemList;
                if (C36018b.this.f94228c == 14) {
                    feedItemList = AwemeApi.m115425a(z2, str3, str4, 14, j2, i4, null);
                } else if (C36018b.this.f94228c == 1) {
                    if (C36018b.this.mListQueryType == 1) {
                        feedItemList = AwemeApi.m115426a(z2, str3, str4, i3, j2, i4, null, 0, 0);
                    } else {
                        feedItemList = AwemeApi.m115426a(z2, str3, str4, i3, j2, i4, null, C36018b.this.mo91668e(), C36018b.this.mo91666c());
                    }
                } else if (C36018b.this.f94231f) {
                    feedItemList = AwemeApi.m115425a(z2, str3, str4, 11, j2, i4, null);
                } else {
                    feedItemList = AwemeApi.m115425a(z2, str3, str4, i3, j2, i4, null);
                }
                if (feedItemList != null) {
                    feedItemList.fetchType = i3;
                    if (TextUtils.equals(str3, C6861a.m21337f().getCurUserId()) && i3 == 0 && j2 == 0) {
                        if (C36018b.this.mData != null && C6307b.m19566a((Collection<T>) feedItemList.getItems())) {
                            ((FeedItemList) C36018b.this.mData).items = feedItemList.getItems();
                        }
                        C36018b.this.mo91656a(feedItemList, str3);
                    }
                }
                return feedItemList;
            }
        };
        a.mo60807a(fVar, r0, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91658a(String str, C47870u uVar) throws Exception {
        FeedItemList b = m116029b(str);
        if (b == null) {
            b = new FeedItemList();
        }
        b.hasMore = 0;
        uVar.mo19239a((Object) b);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91656a(com.p280ss.android.ugc.aweme.feed.model.FeedItemList r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.io.File r4 = r2.m116030c(r4)     // Catch:{ all -> 0x0023 }
            if (r4 != 0) goto L_0x0009
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            return
        L_0x0009:
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0021 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0021 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0021 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0021 }
            com.google.gson.e r4 = com.bytedance.ies.ugc.aweme.network.C10944e.m32113a()     // Catch:{ IOException -> 0x0021 }
            java.lang.String r3 = r4.mo15979b(r3)     // Catch:{ IOException -> 0x0021 }
            r0.write(r3)     // Catch:{ IOException -> 0x0021 }
            r0.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.presenter.C36018b.mo91656a(com.ss.android.ugc.aweme.feed.model.FeedItemList, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo91660a(Collection<Aweme> collection, String str) {
        if (!collection.isEmpty()) {
            C7492s.m23282a((C7495v<T>) new C36022e<T>(this, str, collection)).mo19304b(C7333a.m23044b()).mo19333l();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<com.ss.android.ugc.aweme.feed.model.Aweme>, for r5v0, types: [java.util.Collection<com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.Collection] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo91659a(java.lang.String r4, java.util.Collection<com.p280ss.android.ugc.aweme.feed.model.Aweme> r5, p346io.reactivex.C47870u r6) throws java.lang.Exception {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.FeedItemList r6 = r3.m116029b(r4)
            if (r6 == 0) goto L_0x0028
            java.util.List r0 = r6.getItems()
            if (r0 == 0) goto L_0x0028
            java.util.Iterator r5 = r5.iterator()
        L_0x0010:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r5.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r0
            java.util.List r1 = r6.getItems()
            r2 = 0
            com.p280ss.android.ugc.aweme.feed.p1234j.C28482e.m93607a(r1, r0, r2)
            goto L_0x0010
        L_0x0025:
            r3.mo91656a(r6, r4)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.presenter.C36018b.mo91659a(java.lang.String, java.util.Collection, io.reactivex.u):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91657a(String str, Aweme aweme, C47870u uVar) throws Exception {
        FeedItemList b = m116029b(str);
        if (b == null) {
            b = new FeedItemList();
        }
        if (b.getItems() == null) {
            b.items = new ArrayList(1);
        }
        b.getItems().add(0, aweme);
        mo91656a(b, str);
    }

    /* renamed from: a */
    public boolean deleteItem(Aweme aweme) {
        return C28482e.m93607a(getItems(), aweme, this.mNotifyListeners);
    }

    /* renamed from: b */
    public final boolean mo91664b() {
        if (this.mData == null || ((FeedItemList) this.mData).hidingInvalidItem <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final int mo91666c() {
        if (this.mData == null) {
            return 0;
        }
        return ((FeedItemList) this.mData).hidingInvalidItem;
    }

    /* renamed from: d */
    public final String mo91667d() {
        if (this.mData == null) {
            return "";
        }
        return ((FeedItemList) this.mData).invalidItemText;
    }

    /* renamed from: e */
    public final int mo91668e() {
        if (this.mData == null) {
            return 0;
        }
        return ((FeedItemList) this.mData).invalidItemCount;
    }

    public List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).getItems();
    }

    public boolean isHasMore() {
        if (this.mData == null || !((FeedItemList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private List<Aweme> m116032f() {
        ArrayList arrayList = new ArrayList();
        if (getItems() != null) {
            for (int i = 0; i < getItems().size(); i++) {
                Aweme aweme = (Aweme) getItems().get(i);
                if (aweme != null && !aweme.isDelete()) {
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<Aweme> mo57985a() {
        if (C6399b.m19944t() || this.f94228c != 1) {
            return getItems();
        }
        return m116032f();
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m116028a(Object... objArr) {
        if (!checkParams(objArr)) {
            return false;
        }
        this.mIsLoading = true;
        return true;
    }

    /* renamed from: d */
    private static String m116031d(String str) {
        C36074j jVar = C36074j.f94315a;
        StringBuilder sb = new StringBuilder();
        sb.append(AwemeApi.f93675a);
        sb.append(str);
        return jVar.hexDigest(sb.toString());
    }

    public void setItems(List<Aweme> list) {
        super.setItems(list);
        if (this.mData == null) {
            FeedItemList feedItemList = new FeedItemList();
            feedItemList.items = list;
            this.mData = feedItemList;
            return;
        }
        ((FeedItemList) this.mData).items = list;
    }

    /* renamed from: b */
    private FeedItemList m116029b(String str) {
        String a;
        File c = m116030c(str);
        if (c != null && c.exists()) {
            synchronized (this) {
                a = C42973bg.m136423a(c, "UTF-8");
            }
            if (!TextUtils.isEmpty(a)) {
                try {
                    return (FeedItemList) C10944e.m32113a().mo15974a(a, FeedItemList.class);
                } catch (JsonIOException | JsonSyntaxException unused) {
                } catch (UnsupportedOperationException e) {
                    C6921a.m21559a((Throwable) e);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C7492s<FeedItemList> mo91653a(String str) {
        ((C36089t) C23222h.m76242a(C6399b.m19921a(), C36089t.class)).mo60380a("");
        return C7492s.m23282a((C7495v<T>) new C36020c<T>(this, str)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
    }

    public boolean sendRequest(Object... objArr) {
        if (!m116028a(objArr)) {
            return false;
        }
        this.mListQueryType = objArr[0].intValue();
        int i = this.mListQueryType;
        if (i != 4) {
            switch (i) {
                case 1:
                    refreshList(objArr);
                    break;
                case 2:
                    loadLatestList(objArr);
                    break;
            }
        } else {
            loadMoreList(objArr);
        }
        return true;
    }

    /* renamed from: c */
    private File m116030c(String str) {
        File cacheDir = C6399b.m19921a().getCacheDir();
        if (cacheDir == null || !cacheDir.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cacheDir.getPath());
        sb.append(File.separator);
        sb.append("aweme_publish");
        File file = new File(sb.toString());
        try {
            if (!file.exists() && !file.mkdirs()) {
                return null;
            }
        } catch (SecurityException unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getPath());
        sb2.append(File.separator);
        sb2.append(m116031d(str));
        return new File(sb2.toString());
    }

    public void loadMoreList(Object... objArr) {
        this.f94229d = objArr[4].intValue();
        long j = 0;
        if (objArr.length >= 6) {
            String str = (String) objArr[2];
            int intValue = objArr[3].intValue();
            if (this.mData != null) {
                j = ((FeedItemList) this.mData).maxCursor;
            }
            m116027a(str, intValue, j, 10, (String) objArr[5]);
            return;
        }
        String b = C43077dz.m136657a().mo104733b(objArr[2]);
        String str2 = (String) objArr[2];
        int intValue2 = objArr[3].intValue();
        if (this.mData != null) {
            j = ((FeedItemList) this.mData).maxCursor;
        }
        m116027a(str2, intValue2, j, 10, b);
    }

    public void refreshList(Object... objArr) {
        int i;
        this.f94229d = objArr[4].intValue();
        if (this.f94228c == 4) {
            i = 12;
        } else {
            i = 20;
        }
        if (objArr.length >= 6) {
            mo90896a(objArr[1].booleanValue(), (String) objArr[2], objArr[3].intValue(), 0, i, (String) objArr[5]);
            return;
        }
        String b = C43077dz.m136657a().mo104733b(objArr[2]);
        mo90896a(objArr[1].booleanValue(), (String) objArr[2], objArr[3].intValue(), 0, i, b);
    }

    /* renamed from: b */
    public final boolean mo91665b(Aweme aweme) {
        int i = 0;
        if (aweme == null || aweme.getAid() == null) {
            return false;
        }
        List items = getItems();
        if (items == null) {
            items = new ArrayList();
            setItems(items);
        }
        int i2 = -1;
        for (int i3 = 0; i3 < items.size(); i3++) {
            Aweme aweme2 = (Aweme) items.get(i3);
            if (aweme2 != null) {
                if (aweme2.isTop() || aweme.getCreateTime() < aweme2.getCreateTime()) {
                    i2 = i3 + 1;
                }
                if (aweme.getAid().equals(aweme2.getAid())) {
                    return false;
                }
            }
        }
        if (i2 >= 0) {
            i = i2;
        }
        items.add(i, aweme);
        for (C25678f fVar : this.mNotifyListeners) {
            if (fVar != null && (fVar instanceof C25677e)) {
                ((C25677e) fVar).mo59136a(items, i);
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void handleData(FeedItemList feedItemList) {
        boolean z;
        boolean z2;
        C28199ae.m92689a().mo71792a(feedItemList.getRequestId(), feedItemList.logPb);
        if (feedItemList == null || feedItemList.fetchType != 0) {
            z = false;
        } else {
            z = true;
        }
        if (feedItemList == null || C6307b.m19566a((Collection<T>) feedItemList.getItems())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            m116026a(feedItemList, z, this.f94228c, this.f94229d);
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = feedItemList;
                if (TextUtils.equals(this.f94230e, C6861a.m21337f().getCurUserId())) {
                    C36729b.m118409a(this.f94228c, false, 0, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.getItems().size());
                }
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = feedItemList;
                } else {
                    if (C6307b.m19566a((Collection<T>) ((FeedItemList) this.mData).getItems())) {
                        ((FeedItemList) this.mData).items = feedItemList.getItems();
                    } else {
                        ((FeedItemList) this.mData).getItems().addAll(m116025a(feedItemList.getItems(), ((FeedItemList) this.mData).getItems()));
                    }
                    ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                    ((FeedItemList) this.mData).hasMore = feedItemList.hasMore & ((FeedItemList) this.mData).hasMore;
                }
                if (TextUtils.equals(this.f94230e, C6861a.m21337f().getCurUserId()) && ((FeedItemList) this.mData).getItems().size() - feedItemList.getItems().size() <= 10) {
                    C36729b.m118409a(this.f94228c, true, 0, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.getItems().size());
                }
            }
            if (this.f94228c == 4 && this.mData != null) {
                ((FeedItemList) this.mData).cursor = feedItemList.cursor;
                ((FeedItemList) this.mData).maxCursor = feedItemList.cursor;
            } else if (this.f94228c == 1 && this.mData != null) {
                ((FeedItemList) this.mData).invalidItemCount = feedItemList.invalidItemCount;
                ((FeedItemList) this.mData).invalidItemText = feedItemList.invalidItemText;
                ((FeedItemList) this.mData).hidingInvalidItem = feedItemList.hidingInvalidItem;
            }
        } else if (this.mData != null) {
            if (feedItemList != null) {
                ((FeedItemList) this.mData).hasMore = feedItemList.hasMore;
                ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                return;
            }
            ((FeedItemList) this.mData).hasMore = 0;
        } else if (feedItemList == null) {
            this.mData = new FeedItemList();
            ((FeedItemList) this.mData).hasMore = 0;
        } else {
            this.mData = feedItemList;
        }
    }

    /* renamed from: a */
    public final void mo91655a(FeedItemList feedItemList) {
        Message obtainMessage = this.mHandler.obtainMessage(0);
        obtainMessage.obj = feedItemList;
        handleMsg(obtainMessage);
    }

    /* renamed from: b */
    public final void mo91661b(Aweme aweme, String str) {
        C7492s.m23282a((C7495v<T>) new C36023f<T>(this, str, aweme)).mo19304b(C7333a.m23044b()).mo19333l();
    }

    /* renamed from: a */
    private static List<Aweme> m116025a(List<Aweme> list, List<Aweme> list2) {
        if (list == null || list2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            arrayList.add(aweme);
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (TextUtils.equals(aweme.getAid(), ((Aweme) it.next()).getAid())) {
                    arrayList.remove(aweme);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo91654a(Aweme aweme, String str) {
        if (aweme != null) {
            C7492s.m23282a((C7495v<T>) new C36021d<T>(this, str, aweme)).mo19304b(C7333a.m23044b()).mo19333l();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo91663b(String str, Aweme aweme, C47870u uVar) throws Exception {
        FeedItemList b = m116029b(str);
        if (b != null && b.getItems() != null) {
            C28482e.m93607a(b.getItems(), aweme, null);
            mo91656a(b, str);
        }
    }

    /* renamed from: a */
    public static void m116026a(FeedItemList feedItemList, boolean z, int i, int i2) {
        int i3;
        Aweme aweme;
        if (feedItemList != null && feedItemList.getItems() != null) {
            int size = feedItemList.getItems().size();
            for (int i4 = 0; i4 < size; i4++) {
                Aweme aweme2 = (Aweme) feedItemList.getItems().get(i4);
                if (aweme2 == null) {
                    i3 = -1;
                } else {
                    i3 = aweme2.getIsTop();
                }
                if (aweme2 == null || (!aweme2.isSelfSee() && !aweme2.isProhibited())) {
                    aweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme2);
                } else {
                    aweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateProfileSelfSeeAweme(aweme2, i);
                }
                if (z && i3 >= 0) {
                    aweme.setIsTop(i3);
                }
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sb = new StringBuilder();
                sb.append(aweme.getAid());
                sb.append(i2 + i);
                iRequestIdService.setRequestIdAndIndex(sb.toString(), feedItemList.getRequestId(), i4);
                feedItemList.getItems().set(i4, aweme);
            }
        }
    }

    /* renamed from: a */
    private void m116027a(String str, int i, long j, int i2, String str2) {
        mo90896a(false, str, i, j, 10, str2);
    }
}
