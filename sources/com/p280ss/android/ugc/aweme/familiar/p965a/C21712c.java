package com.p280ss.android.ugc.aweme.familiar.p965a;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26098c;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26112p;
import com.p280ss.android.ugc.aweme.familiar.api.C21717a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29367b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.familiar.a.c */
public final class C21712c extends C26098c<C21709a, C21711b> implements C26112p {

    /* renamed from: c */
    public static final HashSet<String> f58144c = new HashSet<>();

    /* renamed from: d */
    public static final HashMap<String, String> f58145d = new HashMap<>();

    /* renamed from: e */
    public static final HashMap<String, Integer> f58146e = new HashMap<>();

    /* renamed from: f */
    public static final C21713a f58147f = new C21713a(null);

    /* renamed from: b */
    public long f58148b;

    /* renamed from: g */
    private final HashSet<String> f58149g = new HashSet<>();

    /* renamed from: com.ss.android.ugc.aweme.familiar.a.c$a */
    public static final class C21713a {
        private C21713a() {
        }

        /* renamed from: a */
        public static HashMap<String, String> m72631a() {
            return C21712c.f58145d;
        }

        /* renamed from: b */
        public static HashMap<String, Integer> m72632b() {
            return C21712c.f58146e;
        }

        public /* synthetic */ C21713a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.familiar.a.c$b */
    static final class C21714b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ long f58150a;

        /* renamed from: b */
        final /* synthetic */ int f58151b;

        /* renamed from: c */
        final /* synthetic */ int f58152c;

        /* renamed from: d */
        final /* synthetic */ String f58153d;

        /* renamed from: e */
        final /* synthetic */ String f58154e;

        /* renamed from: f */
        final /* synthetic */ long f58155f;

        /* renamed from: g */
        final /* synthetic */ int f58156g;

        C21714b(long j, int i, int i2, String str, String str2, long j2, int i3) {
            this.f58150a = j;
            this.f58151b = i;
            this.f58152c = i2;
            this.f58153d = str;
            this.f58154e = str2;
            this.f58155f = j2;
            this.f58156g = i3;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C21711b call() {
            return C21717a.m72636a(this.f58150a, this.f58151b, this.f58152c, C43161e.m136882a(), C43161e.m136884b(), this.f58153d, this.f58154e, this.f58155f, this.f58156g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.familiar.a.c$c */
    static final class C21715c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C21712c f58157a;

        /* renamed from: b */
        final /* synthetic */ Message f58158b;

        C21715c(C21712c cVar, Message message) {
            this.f58157a = cVar;
            this.f58158b = message;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            C21712c cVar = this.f58157a;
            Object obj = this.f58158b.obj;
            if (obj != null) {
                cVar.handleData((C21711b) obj);
                return null;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.familiar.model.FamiliarFeedList");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.familiar.a.c$d */
    static final class C21716d<TTaskResult, TContinuationResult> implements C1591g {

        /* renamed from: a */
        final /* synthetic */ C21712c f58159a;

        C21716d(C21712c cVar) {
            this.f58159a = cVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m72635a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m72635a(C1592h hVar) {
            if (this.f58159a.mNotifyListeners != null) {
                for (C25678f b : this.f58159a.mNotifyListeners) {
                    b.mo56977b();
                }
            }
        }
    }

    /* renamed from: a */
    public final List<Aweme> mo57985a() {
        return mo57987b();
    }

    public final List<C21709a> getItems() {
        C21711b bVar = (C21711b) this.mData;
        if (bVar != null) {
            return bVar.f58140d;
        }
        return null;
    }

    public final boolean isHasMore() {
        C21711b bVar = (C21711b) this.mData;
        if (bVar != null) {
            return bVar.mo57984a();
        }
        return false;
    }

    /* renamed from: b */
    public final List<Aweme> mo57987b() {
        if (this.mData == null) {
            return null;
        }
        List<Aweme> arrayList = new ArrayList<>();
        C21711b bVar = (C21711b) this.mData;
        if (bVar != null) {
            List<C21709a> list = bVar.f58140d;
            if (list != null) {
                for (C21709a aVar : list) {
                    if (aVar.getFeedType() == 65280) {
                        Aweme aweme = aVar.getAweme();
                        if (aweme != null && (!aweme.isForwardAweme() || aweme.getForwardItem() != null)) {
                            arrayList.add(aweme);
                        }
                    } else if (aVar.getFeedType() == 65281) {
                        String requestId = aVar.getRequestId();
                        C7573i.m23582a((Object) requestId, "familiarFeed.requestId");
                        Aweme a = m72623a(aVar, requestId);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (objArr.length == 4) {
            return true;
        }
        return false;
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        Integer num = objArr[1];
        if (num != null) {
            m72624a(0, 1, num.intValue(), (String) objArr[2], (String) objArr[3], this.f58148b, 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }

    /* renamed from: b */
    private static boolean m72626b(C21709a aVar) {
        if (aVar.getFeedType() != 65280) {
            return false;
        }
        Aweme aweme = aVar.getAweme();
        if (aweme == null) {
            aweme = null;
        } else if (aweme.isForwardAweme()) {
            aweme = aweme.getForwardItem();
        }
        if (aweme != null) {
            if (C29367b.m96458a(aweme)) {
                if (aweme.getVideo() != null) {
                    Video video = aweme.getVideo();
                    C7573i.m23582a((Object) video, "this.video");
                    if (video.getWidth() != 0) {
                        Video video2 = aweme.getVideo();
                        C7573i.m23582a((Object) video2, "this.video");
                        if (video2.getHeight() == 0) {
                            return true;
                        }
                        return false;
                    }
                }
                return true;
            } else if (aweme.getAwemeType() == 2) {
                List imageInfos = aweme.getImageInfos();
                if (imageInfos != null && (!imageInfos.isEmpty())) {
                    ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                    if (imageInfo == null || imageInfo.getWidth() == 0 || imageInfo.getHeight() == 0) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public final void handleMsg(Message message) {
        C7573i.m23587b(message, "msg");
        this.mIsLoading = false;
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
        }
        C1592h.m7855a((Callable<TResult>) new C21715c<TResult>(this, Message.obtain(message)), (Executor) C7258h.m22730c()).mo6876a((C1591g<TResult, TContinuationResult>) new C21716d<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        int i;
        int i2;
        C7573i.m23587b(objArr, "params");
        C21711b bVar = (C21711b) this.mData;
        if (bVar != null) {
            j = bVar.f58137a;
        } else {
            j = 0;
        }
        long j2 = j;
        C21711b bVar2 = (C21711b) this.mData;
        if (bVar2 != null) {
            i = bVar2.f58138b;
        } else {
            i = 1;
        }
        Integer num = objArr[1];
        if (num != null) {
            int intValue = num.intValue();
            String str = (String) objArr[2];
            String str2 = (String) objArr[3];
            long j3 = this.f58148b;
            C21711b bVar3 = (C21711b) this.mData;
            if (bVar3 != null) {
                i2 = bVar3.f58143g;
            } else {
                i2 = 0;
            }
            m72624a(j2, i, intValue, str, str2, j3, i2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }

    /* renamed from: a */
    private static boolean m72625a(C21709a aVar) {
        if (aVar.getFeedType() != 65280) {
            return false;
        }
        Aweme aweme = aVar.getAweme();
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                Aweme forwardItem = aweme.getForwardItem();
                if (forwardItem == null || forwardItem.getAwemeType() == 2 || C29367b.m96458a(forwardItem)) {
                    return false;
                }
                return true;
            } else if (aweme.getAwemeType() != 2 && !C29367b.m96458a(aweme)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m72627c(C21709a aVar) {
        C21711b bVar = (C21711b) this.mData;
        if (bVar != null) {
            List<C21709a> list = bVar.f58140d;
            if (list != null && (!list.isEmpty())) {
                if (aVar.getFeedType() == 65281) {
                    List<User> list2 = aVar.f58128a;
                    if (list2 == null || !(!list2.isEmpty())) {
                        return true;
                    }
                    return false;
                }
                if (aVar.getFeedType() == 65280) {
                    List<C21709a> list3 = ((C21711b) this.mData).f58140d;
                    if (list3 != null) {
                        for (C21709a aVar2 : list3) {
                            if (!(aVar.getFeedType() != aVar2.getFeedType() || aVar.getAweme() == null || aVar2.getAweme() == null)) {
                                Aweme aweme = aVar.getAweme();
                                if (aweme == null) {
                                    C7573i.m23580a();
                                }
                                CharSequence aid = aweme.getAid();
                                Aweme aweme2 = aVar2.getAweme();
                                if (aweme2 == null) {
                                    C7573i.m23580a();
                                }
                                if (TextUtils.equals(aid, aweme2.getAid())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r3 == null) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleData(com.p280ss.android.ugc.aweme.familiar.p965a.C21711b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 1
            if (r1 == 0) goto L_0x0010
            java.util.List<com.ss.android.ugc.aweme.familiar.a.a> r3 = r1.f58140d
            if (r3 == 0) goto L_0x0010
            boolean r3 = r3.isEmpty()
            goto L_0x0011
        L_0x0010:
            r3 = 1
        L_0x0011:
            r0.mIsNewDataEmpty = r3
            boolean r3 = r0.mIsNewDataEmpty
            r4 = 0
            if (r3 != 0) goto L_0x02d0
            if (r1 == 0) goto L_0x02cf
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r1.f58141e
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r3.getImprId()
            if (r3 != 0) goto L_0x0026
        L_0x0024:
            java.lang.String r3 = ""
        L_0x0026:
            com.ss.android.ugc.aweme.feed.ae r6 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r7 = r1.f58141e
            r6.mo71792a(r3, r7)
            int r6 = r0.mListQueryType
            if (r6 != r2) goto L_0x0047
            java.util.HashSet<java.lang.String> r6 = f58144c
            r6.clear()
            java.util.HashMap<java.lang.String, java.lang.String> r6 = f58145d
            r6.clear()
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = f58146e
            r6.clear()
            java.util.HashSet<java.lang.String> r6 = r0.f58149g
            r6.clear()
        L_0x0047:
            java.util.List<com.ss.android.ugc.aweme.familiar.a.a> r6 = r1.f58140d
            if (r6 != 0) goto L_0x0052
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
        L_0x0052:
            r7 = r6
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r8 = r7.iterator()
            r9 = 0
        L_0x005a:
            boolean r10 = r8.hasNext()
            r11 = 65280(0xff00, float:9.1477E-41)
            if (r10 == 0) goto L_0x01c3
            java.lang.Object r10 = r8.next()
            int r12 = r9 + 1
            if (r9 >= 0) goto L_0x006e
            kotlin.collections.C7525m.m23465b()
        L_0x006e:
            com.ss.android.ugc.aweme.familiar.a.a r10 = (com.p280ss.android.ugc.aweme.familiar.p965a.C21709a) r10
            r10.setRequestId(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r10.getAweme()
            if (r13 == 0) goto L_0x0084
            com.ss.android.ugc.aweme.profile.model.User r13 = r13.getAuthor()
            if (r13 == 0) goto L_0x0084
            java.lang.String r14 = r10.f58132e
            r13.setRecommendReason(r14)
        L_0x0084:
            int r13 = r10.getFeedType()
            if (r13 != r11) goto L_0x0161
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.getAweme()
            if (r11 == 0) goto L_0x00a8
            com.ss.android.ugc.aweme.profile.model.User r11 = r11.getAuthor()
            if (r11 == 0) goto L_0x00a8
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f58145d
            java.util.Map r13 = (java.util.Map) r13
            java.lang.String r11 = r11.getUid()
            java.lang.String r14 = "it.uid"
            kotlin.jvm.internal.C7573i.m23582a(r11, r14)
            java.lang.String r14 = r10.f58132e
            r13.put(r11, r14)
        L_0x00a8:
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.getAweme()
            boolean r13 = com.p280ss.android.ugc.aweme.familiar.p967c.C21721b.m72645a(r11)
            if (r13 == 0) goto L_0x01c0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r13 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r14 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r13 = r13.getService(r14)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r13 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r13
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r13.updateAweme(r11)
            java.lang.String r13 = "aweme"
            kotlin.jvm.internal.C7573i.m23582a(r11, r13)
            com.ss.android.ugc.aweme.feed.model.LogPbBean r13 = r1.f58141e
            if (r13 == 0) goto L_0x00d0
            java.lang.String r13 = r13.getImprId()
            goto L_0x00d1
        L_0x00d0:
            r13 = r4
        L_0x00d1:
            r11.setRequestId(r13)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r13 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService> r14 = com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService.class
            java.lang.Object r13 = r13.getService(r14)
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r13 = (com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r13
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = r11.getAid()
            r14.append(r15)
            r15 = 22
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.setRequestIdAndIndex(r14, r3, r9)
            r10.setAweme(r11)
            r6.set(r9, r10)
            int r10 = r11.getAwemeType()
            r13 = 13
            if (r10 != r13) goto L_0x0151
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r11.getForwardItem()
            if (r10 == 0) goto L_0x0151
            java.lang.String r13 = r11.getAid()
            r10.setRepostFromGroupId(r13)
            java.lang.String r13 = r11.getAuthorUid()
            r10.setRepostFromUserId(r13)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r13 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r14 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r13 = r13.getService(r14)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r13 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r13
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r13.updateAweme(r10)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r13 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService> r14 = com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService.class
            java.lang.Object r13 = r13.getService(r14)
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r13 = (com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r13
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r5 = "origin"
            kotlin.jvm.internal.C7573i.m23582a(r10, r5)
            java.lang.String r5 = r10.getAid()
            r14.append(r5)
            r14.append(r15)
            java.lang.String r5 = r14.toString()
            r13.setRequestIdAndIndex(r5, r3, r9)
        L_0x0151:
            boolean r5 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136762a(r11)
            if (r5 == 0) goto L_0x01c0
            java.util.HashSet<java.lang.String> r5 = f58144c
            java.lang.String r9 = r11.getAuthorUid()
            r5.add(r9)
            goto L_0x01c0
        L_0x0161:
            int r5 = r10.getFeedType()
            r9 = 65281(0xff01, float:9.1478E-41)
            if (r5 != r9) goto L_0x01c0
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r5 = r10.f58128a
            if (r5 == 0) goto L_0x01c0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r2
            if (r5 == r2) goto L_0x0178
            goto L_0x01c0
        L_0x0178:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r9 = r10.f58128a
            if (r9 == 0) goto L_0x01ae
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x0189:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x01ae
            java.lang.Object r11 = r9.next()
            com.ss.android.ugc.aweme.profile.model.User r11 = (com.p280ss.android.ugc.aweme.profile.model.User) r11
            java.util.HashSet<java.lang.String> r13 = r0.f58149g
            java.lang.String r14 = r11.getUid()
            boolean r13 = r13.contains(r14)
            if (r13 != 0) goto L_0x0189
            java.util.HashSet<java.lang.String> r13 = r0.f58149g
            java.lang.String r14 = r11.getUid()
            r13.add(r14)
            r5.add(r11)
            goto L_0x0189
        L_0x01ae:
            r10.f58128a = r5
            java.lang.String r5 = r10.getRequestId()
            java.lang.String r9 = "familiarFeed.requestId"
            kotlin.jvm.internal.C7573i.m23582a(r5, r9)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = m72623a(r10, r5)
            r10.setAweme(r5)
        L_0x01c0:
            r9 = r12
            goto L_0x005a
        L_0x01c3:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r4 = r7.iterator()
        L_0x01ce:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01f0
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.ss.android.ugc.aweme.familiar.a.a r6 = (com.p280ss.android.ugc.aweme.familiar.p965a.C21709a) r6
            boolean r7 = m72625a(r6)
            if (r7 != 0) goto L_0x01e9
            boolean r6 = m72626b(r6)
            if (r6 != 0) goto L_0x01e9
            r6 = 1
            goto L_0x01ea
        L_0x01e9:
            r6 = 0
        L_0x01ea:
            if (r6 == 0) goto L_0x01ce
            r3.add(r5)
            goto L_0x01ce
        L_0x01f0:
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r3 = kotlin.collections.C7525m.m23509d(r3)
            int r4 = r0.mListQueryType
            r5 = 4
            if (r4 != r5) goto L_0x022a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r3 = r3.iterator()
        L_0x020a:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0222
            java.lang.Object r6 = r3.next()
            r7 = r6
            com.ss.android.ugc.aweme.familiar.a.a r7 = (com.p280ss.android.ugc.aweme.familiar.p965a.C21709a) r7
            boolean r7 = r0.m72627c(r7)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x020a
            r4.add(r6)
            goto L_0x020a
        L_0x0222:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r3 = kotlin.collections.C7525m.m23509d(r4)
        L_0x022a:
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        L_0x0232:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0267
            java.lang.Object r7 = r4.next()
            int r8 = r6 + 1
            if (r6 >= 0) goto L_0x0243
            kotlin.collections.C7525m.m23465b()
        L_0x0243:
            com.ss.android.ugc.aweme.familiar.a.a r7 = (com.p280ss.android.ugc.aweme.familiar.p965a.C21709a) r7
            int r9 = r7.getFeedType()
            if (r9 != r11) goto L_0x0265
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r7.getAweme()
            if (r7 == 0) goto L_0x0265
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = f58146e
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r7 = r7.getAid()
            java.lang.String r10 = "this.aid"
            kotlin.jvm.internal.C7573i.m23582a(r7, r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.put(r7, r6)
        L_0x0265:
            r6 = r8
            goto L_0x0232
        L_0x0267:
            int r4 = r0.mListQueryType
            if (r4 == r2) goto L_0x029f
            if (r4 == r5) goto L_0x026e
            goto L_0x02a3
        L_0x026e:
            java.lang.Object r2 = r0.mData
            com.ss.android.ugc.aweme.familiar.a.b r2 = (com.p280ss.android.ugc.aweme.familiar.p965a.C21711b) r2
            java.util.List<com.ss.android.ugc.aweme.familiar.a.a> r2 = r2.f58140d
            if (r2 != 0) goto L_0x0279
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0279:
            java.util.Collection r3 = (java.util.Collection) r3
            r2.addAll(r3)
            java.lang.Object r2 = r0.mData
            com.ss.android.ugc.aweme.familiar.a.b r2 = (com.p280ss.android.ugc.aweme.familiar.p965a.C21711b) r2
            long r3 = r1.f58137a
            r2.f58137a = r3
            java.lang.Object r2 = r0.mData
            com.ss.android.ugc.aweme.familiar.a.b r2 = (com.p280ss.android.ugc.aweme.familiar.p965a.C21711b) r2
            int r3 = r1.f58138b
            r2.f58138b = r3
            java.lang.Object r2 = r0.mData
            com.ss.android.ugc.aweme.familiar.a.b r2 = (com.p280ss.android.ugc.aweme.familiar.p965a.C21711b) r2
            int r3 = r1.f58143g
            r2.f58143g = r3
            java.lang.Object r2 = r0.mData
            com.ss.android.ugc.aweme.familiar.a.b r2 = (com.p280ss.android.ugc.aweme.familiar.p965a.C21711b) r2
            int r1 = r1.f58139c
            r2.f58139c = r1
            goto L_0x02a3
        L_0x029f:
            r1.f58140d = r3
            r0.mData = r1
        L_0x02a3:
            java.lang.Object r1 = r0.mData
            com.ss.android.ugc.aweme.familiar.a.b r1 = (com.p280ss.android.ugc.aweme.familiar.p965a.C21711b) r1
            java.util.List<com.ss.android.ugc.aweme.familiar.a.a> r1 = r1.f58140d
            if (r1 == 0) goto L_0x02e1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x02b2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02cf
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L_0x02c3
            kotlin.collections.C7525m.m23465b()
        L_0x02c3:
            com.ss.android.ugc.aweme.familiar.a.a r3 = (com.p280ss.android.ugc.aweme.familiar.p965a.C21709a) r3
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.getAweme()
            if (r3 == 0) goto L_0x02cd
            r3.awemePosition = r2
        L_0x02cd:
            r2 = r4
            goto L_0x02b2
        L_0x02cf:
            return
        L_0x02d0:
            int r1 = r0.mListQueryType
            if (r1 == r2) goto L_0x02d5
            goto L_0x02d7
        L_0x02d5:
            r0.mData = r4
        L_0x02d7:
            java.lang.Object r1 = r0.mData
            com.ss.android.ugc.aweme.familiar.a.b r1 = (com.p280ss.android.ugc.aweme.familiar.p965a.C21711b) r1
            if (r1 == 0) goto L_0x02e1
            r2 = 0
            r1.f58139c = r2
            return
        L_0x02e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.familiar.p965a.C21712c.handleData(com.ss.android.ugc.aweme.familiar.a.b):void");
    }

    /* renamed from: a */
    private static Aweme m72623a(C21709a aVar, String str) {
        boolean z;
        Aweme aweme = null;
        if (aVar != null) {
            Collection collection = aVar.f58128a;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aweme = new Aweme();
                StringBuilder sb = new StringBuilder();
                List<User> list = aVar.f58128a;
                if (list != null) {
                    for (User uid : list) {
                        sb.append(uid.getUid());
                    }
                }
                aweme.setAid(sb.toString());
                aweme.setAwemeType(4000);
                aweme.setRequestId(str);
                aweme.setFamiliarRecommendUser(aVar.f58128a);
            }
        }
        return aweme;
    }

    /* renamed from: a */
    private final void m72624a(long j, int i, int i2, String str, String str2, long j2, int i3) {
        C23397p a = C23397p.m76735a();
        Handler handler = this.mHandler;
        C21714b bVar = new C21714b(j, i, i2, str, str2, j2, i3);
        a.mo60807a(handler, bVar, 0);
    }
}
