package com.p280ss.android.ugc.aweme.notification.newstyle.model;

import android.os.Message;
import com.bytedance.common.utility.collection.C6307b;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.collections.C7506ac;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1877a.C47886a;
import kotlin.p356e.C7551d;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.d */
public final class C34559d extends C25673a<MusNotice, MessageResponse> {

    /* renamed from: a */
    public int f90154a = 36;

    /* renamed from: b */
    public long f90155b;

    /* renamed from: c */
    public long f90156c;

    /* renamed from: d */
    private final Map<Integer, List<MusNotice>> f90157d = new LinkedHashMap();

    /* renamed from: e */
    private boolean f90158e;

    /* renamed from: f */
    private long f90159f;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.d$a */
    static final class C34560a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C34559d f90160a;

        /* renamed from: b */
        final /* synthetic */ int f90161b;

        /* renamed from: c */
        final /* synthetic */ Integer f90162c;

        C34560a(C34559d dVar, int i, Integer num) {
            this.f90160a = dVar;
            this.f90161b = i;
            this.f90162c = num;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MessageResponse call() {
            return MusNotificationApiManager.m111254a(this.f90160a.f90155b, this.f90160a.f90156c, 20, this.f90161b, this.f90162c, 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.d$b */
    static final class C34561b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ int f90163a;

        /* renamed from: b */
        final /* synthetic */ Integer f90164b;

        C34561b(int i, Integer num) {
            this.f90163a = i;
            this.f90164b = num;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MessageResponse call() {
            return MusNotificationApiManager.m111254a(0, 0, 20, this.f90163a, this.f90164b, 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.d$c */
    static final class C34562c<T> implements Comparator<MusNotice> {

        /* renamed from: a */
        public static final C34562c f90165a = new C34562c();

        C34562c() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m111741a((MusNotice) obj, (MusNotice) obj2);
        }

        /* renamed from: a */
        private static int m111741a(MusNotice musNotice, MusNotice musNotice2) {
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

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.d$d */
    public static final class C34563d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((MusNotice) t).getLowestPosition()), Integer.valueOf(((MusNotice) t2).getLowestPosition()));
        }
    }

    public final boolean isHasMore() {
        return this.f90158e;
    }

    public final List<MusNotice> getItems() {
        return mo87860a(this.f90154a);
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (objArr.length == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m111735a(List<MusNotice> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            C7525m.m23474a(list, C34562c.f90165a);
        }
    }

    /* renamed from: a */
    public final List<MusNotice> mo87860a(int i) {
        List<MusNotice> list = (List) this.f90157d.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        List<MusNotice> arrayList = new ArrayList<>();
        this.f90157d.put(Integer.valueOf(i), arrayList);
        return arrayList;
    }

    public final void loadMoreList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        Integer num = objArr[1];
        if (num != null) {
            int intValue = num.intValue();
            C23397p.m76735a().mo60807a(this.mHandler, new C34560a(this, intValue, objArr[2]), intValue);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        Integer num = objArr[1];
        if (num != null) {
            int intValue = num.intValue();
            C23397p.m76735a().mo60807a(this.mHandler, new C34561b(intValue, objArr[2]), intValue);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }

    /* renamed from: b */
    private final void m111737b(int i) {
        boolean z;
        Object obj;
        boolean z2;
        if (i == 36) {
            List a = mo87860a(i);
            Collection collection = a;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                List arrayList = new ArrayList();
                Iterator it = C7551d.m23563a(a.size() - 1, 0).iterator();
                while (it.hasNext()) {
                    int a2 = ((C7506ac) it).mo19392a();
                    if (((MusNotice) a.get(a2)).needForceInsert()) {
                        arrayList.add(a.get(a2));
                        a.remove(a2);
                    }
                }
                if (arrayList.size() > 1) {
                    C7525m.m23474a(arrayList, new C34563d());
                }
                Iterator it2 = C7551d.m23565b(0, arrayList.size()).iterator();
                while (it2.hasNext()) {
                    MusNotice musNotice = (MusNotice) arrayList.get(((C7506ac) it2).mo19392a());
                    int min = Math.min(musNotice.getLowestPosition() - 1, a.size());
                    Iterator it3 = C7551d.m23565b(0, min).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        int intValue = ((Number) obj).intValue();
                        if (((MusNotice) a.get(intValue)).getLowestPosition() != 0 || ((MusNotice) a.get(intValue)).getCreateTime() >= musNotice.getCreateTime()) {
                            z2 = false;
                            continue;
                        } else {
                            z2 = true;
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    }
                    Integer num = (Integer) obj;
                    if (num != null) {
                        min = num.intValue();
                    }
                    a.add(min, musNotice);
                }
            }
        }
    }

    public final void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message != null) {
            if (message.obj instanceof Exception) {
                Object obj = message.obj;
                if (obj != null) {
                    C6497a.m20185b((Exception) obj);
                    if (this.mNotifyListeners != null) {
                        for (C25678f fVar : this.mNotifyListeners) {
                            Object obj2 = message.obj;
                            if (obj2 != null) {
                                fVar.mo57296a((Exception) obj2);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                            }
                        }
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            } else if (!(message.obj instanceof MessageResponse)) {
                if (this.mNotifyListeners != null) {
                    for (C25678f fVar2 : this.mNotifyListeners) {
                        Object obj3 = message.obj;
                        if (!(obj3 instanceof Exception)) {
                            obj3 = null;
                        }
                        fVar2.mo57296a((Exception) obj3);
                    }
                }
            } else {
                if (message.what == this.f90154a) {
                    Object obj4 = message.obj;
                    if (obj4 != null) {
                        m111734a((MessageResponse) obj4, message.what, true);
                        if (this.mNotifyListeners != null) {
                            for (C25678f b : this.mNotifyListeners) {
                                b.mo56977b();
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse");
                    }
                } else {
                    Object obj5 = message.obj;
                    if (obj5 != null) {
                        m111734a((MessageResponse) obj5, message.what, false);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m111736a(List<MusNotice> list, LiveMessageResult liveMessageResult) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
        if (r6.getRequestCount() == 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0077, code lost:
        if (r6 == 0) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0157 A[LOOP:1: B:89:0x0151->B:91:0x0157, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0163  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m111734a(com.p280ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse r18, int r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r3 = 1
            if (r18 != 0) goto L_0x000a
            r0.mIsNewDataEmpty = r3
            return
        L_0x000a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem r4 = r18.getItem()
            r5 = 0
            if (r4 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r6 = r4.getNotices()
            r7 = 0
            if (r6 == 0) goto L_0x001d
            java.util.List r6 = r6.getItems()
            goto L_0x001e
        L_0x001d:
            r6 = r7
        L_0x001e:
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x002b
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r6 = 0
            goto L_0x002c
        L_0x002b:
            r6 = 1
        L_0x002c:
            if (r6 == 0) goto L_0x007a
            com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult r6 = r4.getLiveNotice()
            if (r6 == 0) goto L_0x0038
            java.util.List r7 = r6.getLives()
        L_0x0038:
            java.util.Collection r7 = (java.util.Collection) r7
            if (r7 == 0) goto L_0x0045
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r6 = 0
            goto L_0x0046
        L_0x0045:
            r6 = 1
        L_0x0046:
            if (r6 == 0) goto L_0x007a
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r6 = r4.getFollowRequestNotice()
            if (r6 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r6 = r4.getFollowRequestNotice()
            if (r6 != 0) goto L_0x0057
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0057:
            int r6 = r6.getRequestCount()
            if (r6 != 0) goto L_0x007a
        L_0x005d:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r6 = r4.getFollowRequestNotice()
            if (r6 == 0) goto L_0x0068
            int r6 = r6.getRequestCount()
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            if (r6 != 0) goto L_0x007a
            com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice r6 = r4.getCheckProfileNotice()
            if (r6 == 0) goto L_0x0076
            int r6 = r6.getCountOfUser()
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 != 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r6 = 0
            goto L_0x007d
        L_0x007c:
            r6 = 1
        L_0x007d:
            r0.mIsNewDataEmpty = r6
            int r6 = r0.mListQueryType
            if (r6 != r3) goto L_0x0163
            boolean r6 = r0.mIsNewDataEmpty
            if (r6 == 0) goto L_0x0088
            return
        L_0x0088:
            java.util.List r6 = r0.mo87860a(r1)
            if (r4 == 0) goto L_0x0099
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r7 = r4.getNotices()
            if (r7 == 0) goto L_0x0099
            long r7 = r7.getLastReadTime()
            goto L_0x009b
        L_0x0099:
            r7 = 0
        L_0x009b:
            r0.f90159f = r7
            r6.clear()
            if (r4 == 0) goto L_0x0100
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r7 = r4.getNotices()
            if (r7 == 0) goto L_0x0100
            java.util.List r8 = r17.getItems()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x00b2:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c4
            java.lang.Object r9 = r8.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r9 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r9
            long r10 = r0.f90159f
            r9.setLastReadTime(r10)
            goto L_0x00b2
        L_0x00c4:
            if (r20 == 0) goto L_0x00f1
            boolean r2 = r7.getHasMore()
            if (r2 == 0) goto L_0x00e2
            long r8 = r0.f90155b
            long r10 = r7.getMaxTime()
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x00e0
            long r8 = r0.f90156c
            long r10 = r7.getMinTime()
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00e2
        L_0x00e0:
            r2 = 1
            goto L_0x00e3
        L_0x00e2:
            r2 = 0
        L_0x00e3:
            r0.f90158e = r2
            long r8 = r7.getMaxTime()
            r0.f90155b = r8
            long r8 = r7.getMinTime()
            r0.f90156c = r8
        L_0x00f1:
            java.util.List r2 = r7.getItems()
            if (r2 == 0) goto L_0x0100
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r6.addAll(r2)
            java.lang.Boolean.valueOf(r2)
        L_0x0100:
            if (r4 == 0) goto L_0x010b
            com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult r2 = r4.getLiveNotice()
            if (r2 == 0) goto L_0x010b
            m111736a(r6, r2)
        L_0x010b:
            if (r4 == 0) goto L_0x014b
            com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice r2 = r4.getCheckProfileNotice()
            if (r2 == 0) goto L_0x014b
            int r4 = r2.getCountOfUser()
            if (r4 <= 0) goto L_0x014b
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r4 = new com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 127(0x7f, float:1.78E-43)
            r16 = 0
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r7 = com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34352b.m111066a(r2)
            r4.setNid(r7)
            r7 = 1002(0x3ea, float:1.404E-42)
            r4.setType(r7)
            r4.setCheckProfileNotice(r2)
            long r7 = r2.getCreateTime()
            r4.setCreateTime(r7)
            int r2 = r6.size()
            int r2 = r2 + r3
            r4.setLowestPosition(r2)
            r6.add(r5, r4)
        L_0x014b:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L_0x0151:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02d6
            java.lang.Object r3 = r2.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r3 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r3
            long r4 = r0.f90159f
            r3.setLastReadTime(r4)
            goto L_0x0151
        L_0x0163:
            int r6 = r0.mListQueryType
            r7 = 4
            if (r6 != r7) goto L_0x02d6
            boolean r6 = r0.mIsNewDataEmpty
            if (r6 == 0) goto L_0x0171
            if (r20 == 0) goto L_0x0170
            r0.f90158e = r5
        L_0x0170:
            return
        L_0x0171:
            if (r4 == 0) goto L_0x02d6
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r4 = r4.getNotices()
            if (r4 == 0) goto L_0x02d6
            if (r20 == 0) goto L_0x01a6
            boolean r2 = r4.getHasMore()
            if (r2 == 0) goto L_0x0197
            long r6 = r0.f90155b
            long r8 = r4.getMaxTime()
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0195
            long r6 = r0.f90156c
            long r8 = r4.getMinTime()
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0197
        L_0x0195:
            r2 = 1
            goto L_0x0198
        L_0x0197:
            r2 = 0
        L_0x0198:
            r0.f90158e = r2
            long r6 = r4.getMaxTime()
            r0.f90155b = r6
            long r6 = r4.getMinTime()
            r0.f90156c = r6
        L_0x01a6:
            java.util.List r2 = r17.getItems()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x01b0:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x01c2
            java.lang.Object r6 = r2.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r6 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r6
            long r7 = r0.f90159f
            r6.setLastReadTime(r7)
            goto L_0x01b0
        L_0x01c2:
            java.util.List r2 = r4.getItems()
            if (r2 == 0) goto L_0x02d6
            java.util.List r4 = r0.mo87860a(r1)
            r6 = 36
            if (r1 != r6) goto L_0x026a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r2 = r2.iterator()
        L_0x01dd:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0221
            java.lang.Object r7 = r2.next()
            r8 = r7
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
            r9 = r4
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r10 = r9 instanceof java.util.Collection
            if (r10 == 0) goto L_0x01fa
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x021a
        L_0x01fa:
            java.util.Iterator r9 = r9.iterator()
        L_0x01fe:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x021a
            java.lang.Object r10 = r9.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r10 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r10
            java.lang.String r10 = r10.getNid()
            java.lang.String r11 = r8.getNid()
            boolean r10 = kotlin.jvm.internal.C7573i.m23585a(r10, r11)
            if (r10 == 0) goto L_0x01fe
            r8 = 0
            goto L_0x021b
        L_0x021a:
            r8 = 1
        L_0x021b:
            if (r8 == 0) goto L_0x01dd
            r6.add(r7)
            goto L_0x01dd
        L_0x0221:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L_0x0229:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x02d6
            java.lang.Object r6 = r2.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r6 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r6
            int r7 = r6.getType()
            if (r7 == r3) goto L_0x0247
            int r7 = r6.getType()
            r8 = 2
            if (r7 != r8) goto L_0x0243
            goto L_0x0247
        L_0x0243:
            r4.add(r6)
            goto L_0x0229
        L_0x0247:
            java.util.Iterator r7 = r4.iterator()
        L_0x024b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0263
            java.lang.Object r8 = r7.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
            int r9 = r6.getType()
            int r8 = r8.getType()
            if (r9 != r8) goto L_0x024b
            r7 = 0
            goto L_0x0264
        L_0x0263:
            r7 = 1
        L_0x0264:
            if (r7 == 0) goto L_0x0229
            r4.add(r6)
            goto L_0x0229
        L_0x026a:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r2 = r2.iterator()
        L_0x0277:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x02bb
            java.lang.Object r7 = r2.next()
            r8 = r7
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
            r9 = r4
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r10 = r9 instanceof java.util.Collection
            if (r10 == 0) goto L_0x0294
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x02b4
        L_0x0294:
            java.util.Iterator r9 = r9.iterator()
        L_0x0298:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x02b4
            java.lang.Object r10 = r9.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r10 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r10
            java.lang.String r10 = r10.getNid()
            java.lang.String r11 = r8.getNid()
            boolean r10 = kotlin.jvm.internal.C7573i.m23585a(r10, r11)
            if (r10 == 0) goto L_0x0298
            r8 = 0
            goto L_0x02b5
        L_0x02b4:
            r8 = 1
        L_0x02b5:
            if (r8 == 0) goto L_0x0277
            r6.add(r7)
            goto L_0x0277
        L_0x02bb:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L_0x02c3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02d6
            java.lang.Object r3 = r2.next()
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r3 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r3
            r5.add(r3)
            goto L_0x02c3
        L_0x02d6:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem r2 = r18.getItem()
            if (r2 == 0) goto L_0x0301
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r2 = r2.getNotices()
            if (r2 == 0) goto L_0x0301
            java.util.List r2 = r2.getItems()
            if (r2 == 0) goto L_0x0301
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x02ee:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0301
            java.lang.Object r3 = r2.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r3 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r3
            com.ss.android.ugc.aweme.feed.model.LogPbBean r4 = r18.getMLogPbBean()
            r3.logPbBean = r4
            goto L_0x02ee
        L_0x0301:
            java.util.List r2 = r0.mo87860a(r1)
            m111735a(r2)
            r0.m111737b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.model.C34559d.m111734a(com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse, int, boolean):void");
    }
}
