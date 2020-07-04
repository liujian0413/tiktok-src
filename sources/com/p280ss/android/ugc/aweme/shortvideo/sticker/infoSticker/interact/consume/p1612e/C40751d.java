package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1612e;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteDetailApi;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteDetailApi.C40714a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40733c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40734d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40725g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d */
public final class C40751d {

    /* renamed from: a */
    public final C47562b f105963a = new C47562b();

    /* renamed from: b */
    public C40733c f105964b = new C40733c(0, false);

    /* renamed from: c */
    public final C25675c<User> f105965c;

    /* renamed from: d */
    public C40725g f105966d;

    /* renamed from: e */
    public int f105967e;

    /* renamed from: f */
    private final VoteDetailApi f105968f = C40714a.m130174a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d$a */
    public static final class C40752a implements C7498y<VoteDetailResponse> {

        /* renamed from: a */
        final /* synthetic */ C40751d f105969a;

        public final void onComplete() {
        }

        C40752a(C40751d dVar) {
            this.f105969a = dVar;
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f105969a.f105965c.mo59107b(new Exception(th));
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
            this.f105969a.f105963a.mo119661a(cVar);
            this.f105969a.f105965c.aD_();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(VoteDetailResponse voteDetailResponse) {
            C7573i.m23587b(voteDetailResponse, "t");
            this.f105969a.mo100980a(new C40733c(voteDetailResponse.getOffset(), voteDetailResponse.getHasMore()));
            List a = this.f105969a.mo100977a(voteDetailResponse.getUsers());
            this.f105969a.f105965c.mo59108b(a, voteDetailResponse.getHasMore());
            this.f105969a.mo100981a(new ArrayList(a), this.f105969a.f105964b, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d$b */
    public static final class C40753b implements C7498y<VoteDetailResponse> {

        /* renamed from: a */
        final /* synthetic */ C40751d f105970a;

        public final void onComplete() {
        }

        C40753b(C40751d dVar) {
            this.f105970a = dVar;
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f105970a.f105965c.mo59105a_(new Exception(th));
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
            this.f105970a.f105963a.mo119661a(cVar);
            this.f105970a.f105965c.mo59098S_();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(VoteDetailResponse voteDetailResponse) {
            C7573i.m23587b(voteDetailResponse, "t");
            this.f105970a.mo100980a(new C40733c(voteDetailResponse.getOffset(), voteDetailResponse.getHasMore()));
            if (C6307b.m19566a((Collection<T>) voteDetailResponse.getUsers())) {
                this.f105970a.f105965c.ae_();
                return;
            }
            this.f105970a.f105965c.mo59099a(voteDetailResponse.getUsers(), voteDetailResponse.getHasMore());
            this.f105970a.mo100981a(new ArrayList(voteDetailResponse.getUsers()), this.f105970a.f105964b, false);
        }
    }

    /* renamed from: a */
    public final void mo100978a() {
        this.f105963a.dispose();
    }

    /* renamed from: a */
    public final void mo100980a(C40733c cVar) {
        C7573i.m23587b(cVar, "<set-?>");
        this.f105964b = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.profile.model.User> mo100977a(java.util.List<? extends com.p280ss.android.ugc.aweme.profile.model.User> r11) {
        /*
            r10 = this;
            int r0 = r10.f105967e
            r1 = 0
            if (r0 != 0) goto L_0x0014
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r0 = r10.f105966d
            if (r0 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d r0 = r0.mo100905a()
            if (r0 == 0) goto L_0x0012
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f105909a
            goto L_0x0020
        L_0x0012:
            r0 = r1
            goto L_0x0020
        L_0x0014:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r0 = r10.f105966d
            if (r0 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d r0 = r0.mo100905a()
            if (r0 == 0) goto L_0x0012
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f105911c
        L_0x0020:
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)
            if (r2 != 0) goto L_0x00a4
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r3 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)
            if (r3 == 0) goto L_0x0034
            goto L_0x00a4
        L_0x0034:
            if (r11 == 0) goto L_0x008d
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r11 = r11.iterator()
        L_0x0043:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r11.next()
            r5 = r4
            com.ss.android.ugc.aweme.profile.model.User r5 = (com.p280ss.android.ugc.aweme.profile.model.User) r5
            if (r0 == 0) goto L_0x007e
            r6 = r0
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0059:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0079
            java.lang.Object r7 = r6.next()
            r8 = r7
            com.ss.android.ugc.aweme.profile.model.User r8 = (com.p280ss.android.ugc.aweme.profile.model.User) r8
            java.lang.String r9 = r5.getUid()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            java.lang.String r8 = r8.getUid()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.equals(r9, r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x007a
        L_0x0079:
            r7 = r1
        L_0x007a:
            r5 = r7
            com.ss.android.ugc.aweme.profile.model.User r5 = (com.p280ss.android.ugc.aweme.profile.model.User) r5
            goto L_0x007f
        L_0x007e:
            r5 = r1
        L_0x007f:
            if (r5 == 0) goto L_0x0083
            r5 = 1
            goto L_0x0084
        L_0x0083:
            r5 = 0
        L_0x0084:
            if (r5 == 0) goto L_0x0043
            r3.add(r4)
            goto L_0x0043
        L_0x008a:
            java.util.List r3 = (java.util.List) r3
            goto L_0x0091
        L_0x008d:
            java.util.List r3 = kotlin.collections.C7525m.m23461a()
        L_0x0091:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r2)
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r0 = com.bytedance.common.utility.collection.C6307b.m19566a(r3)
            if (r0 != 0) goto L_0x00a1
            r11.removeAll(r3)
        L_0x00a1:
            java.util.List r11 = (java.util.List) r11
            return r11
        L_0x00a4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1612e.C40751d.mo100977a(java.util.List):java.util.List");
    }

    /* renamed from: a */
    public final void mo100979a(long j, long j2) {
        this.f105968f.getVoteDetail(j, j2, 0).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C40753b<Object>(this));
    }

    /* renamed from: b */
    public final void mo100982b(long j, long j2) {
        this.f105968f.getVoteDetail(j, j2, this.f105964b.f105907a).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C40752a<Object>(this));
    }

    public C40751d(C25675c<User> cVar, C40725g gVar, int i) {
        C7573i.m23587b(cVar, "view");
        this.f105965c = cVar;
        this.f105966d = gVar;
        this.f105967e = i;
    }

    /* renamed from: a */
    public final void mo100981a(List<User> list, C40733c cVar, boolean z) {
        C40734d dVar;
        C40734d dVar2;
        C40734d dVar3 = null;
        if (z) {
            Collection collection = list;
            if (!C6307b.m19566a(collection)) {
                C40725g gVar = this.f105966d;
                if (gVar != null) {
                    dVar3 = gVar.mo100905a();
                }
                if (dVar3 == null) {
                    dVar2 = new C40734d(null, null, null, null, 15, null);
                } else {
                    dVar2 = dVar3;
                }
                if (this.f105967e == 0) {
                    if (dVar2.f105909a == null) {
                        dVar2.f105909a = new ArrayList();
                    }
                    List<User> list2 = dVar2.f105909a;
                    if (list2 != null) {
                        list2.addAll(collection);
                    }
                    dVar2.mo100952a(cVar);
                } else {
                    if (dVar2.f105911c == null) {
                        dVar2.f105911c = new ArrayList();
                    }
                    List<User> list3 = dVar2.f105911c;
                    if (list3 != null) {
                        list3.addAll(collection);
                    }
                    dVar2.mo100953b(cVar);
                }
                C40725g gVar2 = this.f105966d;
                if (gVar2 != null) {
                    gVar2.mo100906a(dVar2);
                }
            }
        } else if (!C6307b.m19566a((Collection<T>) list)) {
            C40725g gVar3 = this.f105966d;
            if (gVar3 != null) {
                dVar3 = gVar3.mo100905a();
            }
            if (dVar3 == null) {
                dVar = new C40734d(null, null, null, null, 15, null);
            } else {
                dVar = dVar3;
            }
            if (this.f105967e == 0) {
                dVar.f105909a = list;
                dVar.mo100952a(cVar);
            } else {
                dVar.f105911c = list;
                dVar.mo100953b(cVar);
            }
            C40725g gVar4 = this.f105966d;
            if (gVar4 != null) {
                gVar4.mo100906a(dVar);
            }
        }
    }
}
