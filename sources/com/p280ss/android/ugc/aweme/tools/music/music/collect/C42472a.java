package com.p280ss.android.ugc.aweme.tools.music.music.collect;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.tools.music.music.collect.C42480b.C42481a;
import com.p280ss.android.ugc.aweme.tools.music.p1674c.C42447f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.Result;
import kotlin.collections.C7525m;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47940f;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C47955f;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.C48056ad;
import kotlinx.coroutines.C48093bb;

/* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.a */
public final class C42472a {

    /* renamed from: g */
    public static final C42472a f110426g = C42475c.m134994a();

    /* renamed from: h */
    public static final C42473a f110427h = new C42473a(null);

    /* renamed from: a */
    public C42474b f110428a;

    /* renamed from: b */
    public List<MusicModel> f110429b;

    /* renamed from: c */
    public boolean f110430c;

    /* renamed from: d */
    public boolean f110431d;

    /* renamed from: e */
    public int f110432e;

    /* renamed from: f */
    public boolean f110433f;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.a$a */
    public static final class C42473a {
        private C42473a() {
        }

        /* renamed from: a */
        public static C42472a m134989a() {
            return C42472a.f110426g;
        }

        public /* synthetic */ C42473a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.a$b */
    public interface C42474b {
        /* renamed from: a */
        void mo103899a();

        /* renamed from: a */
        void mo103900a(List<? extends MusicModel> list, boolean z);

        /* renamed from: b */
        void mo103901b();

        /* renamed from: c */
        void mo103902c();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.a$c */
    static final class C42475c {

        /* renamed from: a */
        public static final C42475c f110434a = new C42475c();

        /* renamed from: b */
        private static final C42472a f110435b = new C42472a(null);

        private C42475c() {
        }

        /* renamed from: a */
        public static C42472a m134994a() {
            return f110435b;
        }
    }

    @C7540d(mo19421b = "CollectMusicManager.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicManager$initCollectMusicList$1")
    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.a$d */
    static final class C42476d extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        int f110436a;

        /* renamed from: b */
        final /* synthetic */ C42472a f110437b;

        /* renamed from: c */
        private C48056ad f110438c;

        C42476d(C42472a aVar, C47919b bVar) {
            this.f110437b = aVar;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C42476d dVar = new C42476d(this.f110437b, bVar);
            dVar.f110438c = (C48056ad) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C42476d) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f110436a == 0) {
                C1592h userCollectedMusicList = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).userCollectedMusicList(0, 12);
                if (userCollectedMusicList != null) {
                    userCollectedMusicList.mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<TResult, TContinuationResult>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C42476d f110439a;

                        {
                            this.f110439a = r1;
                        }

                        /* access modifiers changed from: private */
                        /* JADX WARNING: Removed duplicated region for block: B:47:0x016b  */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public kotlin.C7581n then(bolts.C1592h<com.p280ss.android.ugc.aweme.music.model.CollectedMusicList> r6) {
                            /*
                                r5 = this;
                                java.lang.String r0 = "task"
                                kotlin.jvm.internal.C7573i.m23582a(r6, r0)
                                boolean r0 = r6.mo6889d()
                                r1 = 10
                                r2 = 0
                                if (r0 != 0) goto L_0x0104
                                boolean r0 = r6.mo6882b()
                                if (r0 == 0) goto L_0x0104
                                java.lang.Object r0 = r6.mo6890e()
                                if (r0 == 0) goto L_0x00ec
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r0 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r0 = r0.f110437b
                                java.lang.Object r3 = r6.mo6890e()
                                java.lang.String r4 = "task.result"
                                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r3 = (com.p280ss.android.ugc.aweme.music.model.CollectedMusicList) r3
                                int r3 = r3.cursor
                                r0.f110432e = r3
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r0 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r0 = r0.f110437b
                                java.lang.Object r3 = r6.mo6890e()
                                java.lang.String r4 = "task.result"
                                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r3 = (com.p280ss.android.ugc.aweme.music.model.CollectedMusicList) r3
                                boolean r3 = r3.isHasMore()
                                r0.f110433f = r3
                                java.lang.Object r0 = r6.mo6890e()
                                java.lang.String r3 = "task.result"
                                kotlin.jvm.internal.C7573i.m23582a(r0, r3)
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r0 = (com.p280ss.android.ugc.aweme.music.model.CollectedMusicList) r0
                                java.util.List<com.ss.android.ugc.aweme.music.model.Music> r0 = r0.items
                                if (r0 == 0) goto L_0x00d3
                                java.lang.Object r0 = r6.mo6890e()
                                java.lang.String r3 = "task.result"
                                kotlin.jvm.internal.C7573i.m23582a(r0, r3)
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r0 = (com.p280ss.android.ugc.aweme.music.model.CollectedMusicList) r0
                                java.util.List<com.ss.android.ugc.aweme.music.model.Music> r0 = r0.items
                                int r0 = r0.size()
                                if (r0 <= 0) goto L_0x00d3
                                java.lang.Object r0 = r6.mo6890e()
                                java.lang.String r3 = "task.result"
                                kotlin.jvm.internal.C7573i.m23582a(r0, r3)
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r0 = (com.p280ss.android.ugc.aweme.music.model.CollectedMusicList) r0
                                com.p280ss.android.ugc.aweme.tools.music.music.collect.C42472a.m134982a(r0)
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r0 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r0 = r0.f110437b
                                java.lang.Object r6 = r6.mo6890e()
                                java.lang.String r3 = "task.result"
                                kotlin.jvm.internal.C7573i.m23582a(r6, r3)
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r6 = (com.p280ss.android.ugc.aweme.music.model.CollectedMusicList) r6
                                java.util.List<com.ss.android.ugc.aweme.music.model.Music> r6 = r6.items
                                java.lang.String r3 = "task.result.items"
                                kotlin.jvm.internal.C7573i.m23582a(r6, r3)
                                java.lang.Iterable r6 = (java.lang.Iterable) r6
                                java.util.ArrayList r3 = new java.util.ArrayList
                                int r1 = kotlin.collections.C7525m.m23469a(r6, r1)
                                r3.<init>(r1)
                                java.util.Collection r3 = (java.util.Collection) r3
                                java.util.Iterator r6 = r6.iterator()
                            L_0x0099:
                                boolean r1 = r6.hasNext()
                                if (r1 == 0) goto L_0x00ad
                                java.lang.Object r1 = r6.next()
                                com.ss.android.ugc.aweme.music.model.Music r1 = (com.p280ss.android.ugc.aweme.music.model.Music) r1
                                com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r1.convertToMusicModel()
                                r3.add(r1)
                                goto L_0x0099
                            L_0x00ad:
                                java.util.List r3 = (java.util.List) r3
                                java.util.Collection r3 = (java.util.Collection) r3
                                java.util.List r6 = kotlin.collections.C7525m.m23509d(r3)
                                r0.mo104010a(r6)
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r6 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r6 = r6.f110437b
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$b r6 = r6.f110428a
                                if (r6 == 0) goto L_0x00d2
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r0 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r0 = r0.f110437b
                                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r0.f110429b
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r1 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r1 = r1.f110437b
                                boolean r1 = r1.f110433f
                                r6.mo103900a(r0, r1)
                                kotlin.n r6 = kotlin.C7581n.f20898a
                                return r6
                            L_0x00d2:
                                return r2
                            L_0x00d3:
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r6 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r6 = r6.f110437b
                                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r6 = r6.f110429b
                                r6.clear()
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r6 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r6 = r6.f110437b
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$b r6 = r6.f110428a
                                if (r6 == 0) goto L_0x00eb
                                r6.mo103899a()
                                kotlin.n r2 = kotlin.C7581n.f20898a
                                goto L_0x0171
                            L_0x00eb:
                                return r2
                            L_0x00ec:
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r6 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r6 = r6.f110437b
                                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r6 = r6.f110429b
                                r6.clear()
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r6 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r6 = r6.f110437b
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$b r6 = r6.f110428a
                                if (r6 == 0) goto L_0x0103
                                r6.mo103899a()
                                kotlin.n r2 = kotlin.C7581n.f20898a
                                goto L_0x0171
                            L_0x0103:
                                return r2
                            L_0x0104:
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r6 = com.p280ss.android.ugc.aweme.tools.music.music.collect.C42472a.m134983d()
                                if (r6 == 0) goto L_0x0137
                                java.util.List<com.ss.android.ugc.aweme.music.model.Music> r6 = r6.items
                                if (r6 == 0) goto L_0x0137
                                java.lang.Iterable r6 = (java.lang.Iterable) r6
                                java.util.ArrayList r0 = new java.util.ArrayList
                                int r1 = kotlin.collections.C7525m.m23469a(r6, r1)
                                r0.<init>(r1)
                                java.util.Collection r0 = (java.util.Collection) r0
                                java.util.Iterator r6 = r6.iterator()
                            L_0x011f:
                                boolean r1 = r6.hasNext()
                                if (r1 == 0) goto L_0x0133
                                java.lang.Object r1 = r6.next()
                                com.ss.android.ugc.aweme.music.model.Music r1 = (com.p280ss.android.ugc.aweme.music.model.Music) r1
                                com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r1.convertToMusicModel()
                                r0.add(r1)
                                goto L_0x011f
                            L_0x0133:
                                r6 = r0
                                java.util.List r6 = (java.util.List) r6
                                goto L_0x0138
                            L_0x0137:
                                r6 = r2
                            L_0x0138:
                                if (r6 == 0) goto L_0x0163
                                boolean r0 = r6.isEmpty()
                                if (r0 != 0) goto L_0x0163
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r0 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r0 = r0.f110437b
                                java.util.Collection r6 = (java.util.Collection) r6
                                java.util.List r6 = kotlin.collections.C7525m.m23509d(r6)
                                r0.mo104010a(r6)
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r6 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r6 = r6.f110437b
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$b r6 = r6.f110428a
                                if (r6 == 0) goto L_0x0162
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r0 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r0 = r0.f110437b
                                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r0.f110429b
                                r1 = 0
                                r6.mo103900a(r0, r1)
                                kotlin.n r6 = kotlin.C7581n.f20898a
                                return r6
                            L_0x0162:
                                return r2
                            L_0x0163:
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$d r6 = r5.f110439a
                                com.ss.android.ugc.aweme.tools.music.music.collect.a r6 = r6.f110437b
                                com.ss.android.ugc.aweme.tools.music.music.collect.a$b r6 = r6.f110428a
                                if (r6 == 0) goto L_0x0171
                                r6.mo103902c()
                                kotlin.n r6 = kotlin.C7581n.f20898a
                                return r6
                            L_0x0171:
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.music.music.collect.C42472a.C42476d.C424771.then(bolts.h):kotlin.n");
                        }
                    });
                }
                this.f110437b.f110430c = false;
                return C7581n.f20898a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.a$e */
    static final class C42478e<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C47919b f110440a;

        /* renamed from: b */
        final /* synthetic */ C42472a f110441b;

        /* renamed from: c */
        final /* synthetic */ int f110442c;

        /* renamed from: d */
        final /* synthetic */ int f110443d;

        C42478e(C47919b bVar, C42472a aVar, int i, int i2) {
            this.f110440a = bVar;
            this.f110441b = aVar;
            this.f110442c = i;
            this.f110443d = i2;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m134996a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m134996a(C1592h<CollectedMusicList> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6889d() || !hVar.mo6882b()) {
                if (this.f110441b.f110430c) {
                    CollectedMusicList d = C42472a.m134983d();
                    if (d != null) {
                        d.setHasMore(false);
                    }
                    this.f110440a.resumeWith(Result.m150902constructorimpl(d));
                    return;
                }
                this.f110440a.resumeWith(Result.m150902constructorimpl(null));
            } else if (hVar.mo6890e() != null) {
                this.f110440a.resumeWith(Result.m150902constructorimpl(hVar.mo6890e()));
                if (this.f110442c == 0) {
                    Object e = hVar.mo6890e();
                    C7573i.m23582a(e, "it.result");
                    C42472a.m134982a((CollectedMusicList) e);
                }
            } else {
                this.f110440a.resumeWith(Result.m150902constructorimpl(null));
            }
        }
    }

    @C7540d(mo19421b = "CollectMusicManager.kt", mo19422c = {81}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicManager$loadMoreCollectMusic$1")
    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.a$f */
    static final class C42479f extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        Object f110444a;

        /* renamed from: b */
        int f110445b;

        /* renamed from: c */
        final /* synthetic */ C42472a f110446c;

        /* renamed from: d */
        private C48056ad f110447d;

        C42479f(C42472a aVar, C47919b bVar) {
            this.f110446c = aVar;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C42479f fVar = new C42479f(this.f110446c, bVar);
            fVar.f110447d = (C48056ad) obj;
            return fVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C42479f) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C47948a.m148881a();
            switch (this.f110445b) {
                case 0:
                    C48056ad adVar = this.f110447d;
                    C42472a aVar = this.f110446c;
                    int i = this.f110446c.f110432e;
                    this.f110444a = adVar;
                    this.f110445b = 1;
                    obj = aVar.mo104008a(i, 12, this);
                    if (obj == a) {
                        return a;
                    }
                    break;
                case 1:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CollectedMusicList collectedMusicList = (CollectedMusicList) obj;
            if (collectedMusicList != null) {
                this.f110446c.f110432e = collectedMusicList.cursor;
                this.f110446c.f110433f = collectedMusicList.isHasMore();
                if (collectedMusicList.items != null && collectedMusicList.items.size() > 0) {
                    List<Music> list = collectedMusicList.items;
                    C7573i.m23582a((Object) list, "collectedMusicList.items");
                    Iterable<Music> iterable = list;
                    Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (Music convertToMusicModel : iterable) {
                        arrayList.add(convertToMusicModel.convertToMusicModel());
                    }
                    this.f110446c.f110429b.addAll((List) arrayList);
                }
                C42474b bVar = this.f110446c.f110428a;
                if (bVar != null) {
                    bVar.mo103900a(this.f110446c.f110429b, this.f110446c.f110433f);
                }
            } else {
                C42474b bVar2 = this.f110446c.f110428a;
                if (bVar2 != null) {
                    bVar2.mo103900a(this.f110446c.f110429b, false);
                }
            }
            this.f110446c.f110431d = true;
            return C7581n.f20898a;
        }
    }

    private C42472a() {
        this.f110429b = new ArrayList();
    }

    /* renamed from: b */
    public final void mo104011b() {
        if (!this.f110430c) {
            mo104009a();
            return;
        }
        C42474b bVar = this.f110428a;
        if (bVar != null) {
            bVar.mo103901b();
        }
    }

    /* renamed from: c */
    public final void mo104012c() {
        this.f110431d = true;
        C48145g.m149385a(C48093bb.f122957a, null, null, new C42479f(this, null), 3, null);
    }

    /* renamed from: d */
    public static CollectedMusicList m134983d() {
        boolean z;
        String a = C42481a.m135000a().mo104013a();
        CharSequence charSequence = a;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                return (CollectedMusicList) C42447f.m134903a().mo15974a(a, CollectedMusicList.class);
            } catch (Exception unused) {
                C42481a.m135000a().mo104015b();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo104009a() {
        this.f110430c = true;
        this.f110432e = 0;
        C48145g.m149385a(C48093bb.f122957a, null, null, new C42476d(this, null), 3, null);
    }

    public /* synthetic */ C42472a(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final void mo104010a(List<MusicModel> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f110429b = list;
    }

    /* renamed from: a */
    public static void m134982a(CollectedMusicList collectedMusicList) {
        C42480b a = C42481a.m135000a();
        String b = C42447f.m134903a().mo15979b((Object) collectedMusicList);
        C7573i.m23582a((Object) b, "GSON.toJson(collectMusicList)");
        a.mo104014a(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo104008a(int i, int i2, C47919b<? super CollectedMusicList> bVar) {
        C47940f fVar = new C47940f(C47948a.m148878a(bVar));
        C47919b bVar2 = fVar;
        C1592h userCollectedMusicList = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).userCollectedMusicList(i, 12);
        if (userCollectedMusicList != null) {
            userCollectedMusicList.mo6875a((C1591g<TResult, TContinuationResult>) new C42478e<TResult,TContinuationResult>(bVar2, this, i, 12));
        }
        Object a = fVar.mo120151a();
        if (a == C47948a.m148881a()) {
            C47955f.m148891c(bVar);
        }
        return a;
    }
}
