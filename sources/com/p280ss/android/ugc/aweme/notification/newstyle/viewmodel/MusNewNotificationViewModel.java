package com.p280ss.android.ugc.aweme.notification.newstyle.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7506ac;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1877a.C47886a;
import kotlin.p356e.C7551d;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewmodel.MusNewNotificationViewModel */
public final class MusNewNotificationViewModel extends C0063u {

    /* renamed from: a */
    public final C0052o<List<MusNotice>> f90324a = new C0052o<>();

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewmodel.MusNewNotificationViewModel$a */
    static final class C34602a<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationViewModel f90325a;

        C34602a(MusNewNotificationViewModel musNewNotificationViewModel) {
            this.f90325a = musNewNotificationViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<MessageResponse> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6890e() != null && hVar.mo6882b()) {
                MusNewNotificationViewModel musNewNotificationViewModel = this.f90325a;
                Object e = hVar.mo6890e();
                C7573i.m23582a(e, "it.result");
                List a = musNewNotificationViewModel.mo87889a((MessageResponse) e, 36);
                if (a == null) {
                    return null;
                }
                this.f90325a.f90324a.postValue(a);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewmodel.MusNewNotificationViewModel$b */
    static final class C34603b<T> implements Comparator<MusNotice> {

        /* renamed from: a */
        public static final C34603b f90326a = new C34603b();

        C34603b() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m111839a((MusNotice) obj, (MusNotice) obj2);
        }

        /* renamed from: a */
        private static int m111839a(MusNotice musNotice, MusNotice musNotice2) {
            C7573i.m23582a((Object) musNotice2, "o2");
            long createTime = musNotice2.getCreateTime();
            C7573i.m23582a((Object) musNotice, "o1");
            long createTime2 = createTime - musNotice.getCreateTime();
            if (createTime2 > 0) {
                return 1;
            }
            if (createTime2 < 0) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewmodel.MusNewNotificationViewModel$c */
    public static final class C34604c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((MusNotice) t).getLowestPosition()), Integer.valueOf(((MusNotice) t2).getLowestPosition()));
        }
    }

    /* renamed from: a */
    public final void mo87890a() {
        MusNotificationApiManager.m111256b(0, 0, 20, 36, null, 1).mo6885c((C1591g<TResult, TContinuationResult>) new C34602a<TResult,TContinuationResult>(this));
    }

    /* renamed from: a */
    private static void m111833a(List<MusNotice> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            C7525m.m23474a(list, C34603b.f90326a);
        }
    }

    /* renamed from: a */
    private static void m111835a(List<MusNotice> list, LiveMessageResult liveMessageResult) {
        if (!C6307b.m19566a((Collection<T>) liveMessageResult.getLives())) {
            List arrayList = new ArrayList();
            List<LiveNotice> lives = liveMessageResult.getLives();
            if (lives != null) {
                for (LiveNotice liveNotice : lives) {
                    MusNotice musNotice = new MusNotice(null, null, null, null, null, null, null, 127, null);
                    musNotice.setType(1001);
                    musNotice.setLiveNotice(liveNotice);
                    musNotice.setCreateTime(9223372036854775805L);
                    arrayList.add(musNotice);
                }
            }
            list.addAll(0, arrayList);
        }
    }

    /* renamed from: a */
    private static void m111834a(List<MusNotice> list, int i) {
        Object obj;
        boolean z;
        if (i == 36 && !list.isEmpty()) {
            List arrayList = new ArrayList();
            Iterator it = C7551d.m23563a(list.size() - 1, 0).iterator();
            while (it.hasNext()) {
                int a = ((C7506ac) it).mo19392a();
                if (((MusNotice) list.get(a)).needForceInsert()) {
                    arrayList.add(list.get(a));
                    list.remove(a);
                }
            }
            if (arrayList.size() > 1) {
                C7525m.m23474a(arrayList, new C34604c());
            }
            Iterator it2 = C7551d.m23565b(0, arrayList.size()).iterator();
            while (it2.hasNext()) {
                MusNotice musNotice = (MusNotice) arrayList.get(((C7506ac) it2).mo19392a());
                int min = Math.min(musNotice.getLowestPosition() - 1, list.size());
                Iterator it3 = C7551d.m23565b(0, min).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    int intValue = ((Number) obj).intValue();
                    if (((MusNotice) list.get(intValue)).getLowestPosition() != 0 || ((MusNotice) list.get(intValue)).getCreateTime() >= musNotice.getCreateTime()) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    min = num.intValue();
                }
                list.add(min, musNotice);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        if (r3.getRequestCount() == 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        if (r3 == 0) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5 A[LOOP:0: B:55:0x009f->B:57:0x00a5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> mo87889a(com.p280ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse r5, int r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem r6 = r5.getItem()
            r0 = 0
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0074
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r3 = r6.getNotices()
            if (r3 == 0) goto L_0x0014
            java.util.List r3 = r3.getItems()
            goto L_0x0015
        L_0x0014:
            r3 = r0
        L_0x0015:
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x0022
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r3 = 0
            goto L_0x0023
        L_0x0022:
            r3 = 1
        L_0x0023:
            if (r3 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult r3 = r6.getLiveNotice()
            if (r3 == 0) goto L_0x0030
            java.util.List r3 = r3.getLives()
            goto L_0x0031
        L_0x0030:
            r3 = r0
        L_0x0031:
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x003e
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r3 = 0
            goto L_0x003f
        L_0x003e:
            r3 = 1
        L_0x003f:
            if (r3 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r3 = r6.getFollowRequestNotice()
            if (r3 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r3 = r6.getFollowRequestNotice()
            if (r3 != 0) goto L_0x0050
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0050:
            int r3 = r3.getRequestCount()
            if (r3 != 0) goto L_0x0073
        L_0x0056:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r3 = r6.getFollowRequestNotice()
            if (r3 == 0) goto L_0x0061
            int r3 = r3.getRequestCount()
            goto L_0x0062
        L_0x0061:
            r3 = 0
        L_0x0062:
            if (r3 != 0) goto L_0x0073
            com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice r3 = r6.getCheckProfileNotice()
            if (r3 == 0) goto L_0x006f
            int r3 = r3.getCountOfUser()
            goto L_0x0070
        L_0x006f:
            r3 = 0
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x0077
            return r0
        L_0x0077:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            if (r6 == 0) goto L_0x008b
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r1 = r6.getNotices()
            if (r1 == 0) goto L_0x008b
            long r1 = r1.getLastReadTime()
            goto L_0x008d
        L_0x008b:
            r1 = 0
        L_0x008d:
            if (r6 == 0) goto L_0x0098
            com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult r6 = r6.getLiveNotice()
            if (r6 == 0) goto L_0x0098
            m111835a(r0, r6)
        L_0x0098:
            r6 = r0
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x009f:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x00af
            java.lang.Object r3 = r6.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r3 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r3
            r3.setLastReadTime(r1)
            goto L_0x009f
        L_0x00af:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem r6 = r5.getItem()
            if (r6 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r6 = r6.getNotices()
            if (r6 == 0) goto L_0x00da
            java.util.List r6 = r6.getItems()
            if (r6 == 0) goto L_0x00da
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x00c7:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x00da
            java.lang.Object r1 = r6.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r1 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r1
            com.ss.android.ugc.aweme.feed.model.LogPbBean r2 = r5.getMLogPbBean()
            r1.logPbBean = r2
            goto L_0x00c7
        L_0x00da:
            m111833a(r0)
            r5 = 36
            m111834a(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.viewmodel.MusNewNotificationViewModel.mo87889a(com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse, int):java.util.List");
    }
}
