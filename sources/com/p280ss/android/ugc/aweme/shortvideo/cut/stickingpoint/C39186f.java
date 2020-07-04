package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.content.Context;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.C39142b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1555b.C39147a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39166d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39167e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39173k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f */
public final class C39186f {

    /* renamed from: a */
    public static final C39186f f101563a = new C39186f();

    /* renamed from: b */
    public static final C39187a f101564b = new C39187a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f$a */
    public static final class C39187a {
        private C39187a() {
        }

        /* renamed from: a */
        public static C39186f m125119a() {
            return C39186f.f101563a;
        }

        public /* synthetic */ C39187a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f$b */
    static final class C39188b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ int f101565a;

        /* renamed from: b */
        final /* synthetic */ String f101566b;

        C39188b(int i, String str) {
            this.f101565a = i;
            this.f101566b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<AVMusic> call() {
            try {
                return C35563c.f93224F.mo70086a().mo103852a(this.f101565a, this.f101566b);
            } catch (Exception e) {
                C39194h.m125151a(false, e);
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f$c */
    static final class C39189c<TTaskResult, TContinuationResult> implements C1591g<List<? extends AVMusic>, Object> {

        /* renamed from: a */
        final /* synthetic */ C39186f f101567a;

        /* renamed from: b */
        final /* synthetic */ C39167e f101568b;

        /* renamed from: c */
        final /* synthetic */ int f101569c;

        C39189c(C39186f fVar, C39167e eVar, int i) {
            this.f101567a = fVar;
            this.f101568b = eVar;
            this.f101569c = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<List<AVMusic>> hVar) {
            if (hVar == null || hVar.mo6890e() == null) {
                C39167e eVar = this.f101568b;
                if (eVar != null) {
                    eVar.mo97308a(new Exception());
                }
            } else if (C6292i.m19525a((List) hVar.mo6890e())) {
                C39167e eVar2 = this.f101568b;
                if (eVar2 != null) {
                    eVar2.mo97308a(new Exception());
                }
            } else {
                Object e = hVar.mo6890e();
                C7573i.m23582a(e, "task.result");
                List<AVMusic> d = C7525m.m23509d((Collection) e);
                for (AVMusic a : d) {
                    C39182e.f101552a.mo97467a(a);
                }
                C39167e eVar3 = this.f101568b;
                if (eVar3 != null) {
                    eVar3.mo97309a(this.f101567a.mo97472a(d, this.f101569c));
                }
                C39194h.m125151a(true, null);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f$d */
    public static final class C39190d implements IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ C39186f f101570a;

        /* renamed from: b */
        final /* synthetic */ C39173k f101571b;

        /* renamed from: c */
        final /* synthetic */ int f101572c;

        /* renamed from: d */
        final /* synthetic */ String f101573d;

        /* renamed from: e */
        final /* synthetic */ Context f101574e;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f$d$a */
        public static final class C39191a implements C39167e {

            /* renamed from: a */
            final /* synthetic */ C39190d f101575a;

            /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f$d$a$a */
            public static final class C39192a extends C39142b {

                /* renamed from: a */
                final /* synthetic */ C39191a f101576a;

                C39192a(C39191a aVar) {
                    this.f101576a = aVar;
                }

                /* renamed from: a */
                public final void mo97306a(AVMusic aVMusic, boolean z) {
                    if (!z) {
                        C39173k kVar = this.f101576a.f101575a.f101571b;
                        if (kVar != null) {
                            kVar.mo97447a(aVMusic, null);
                        }
                    }
                }

                /* renamed from: b */
                public final void mo97307b(AVMusic aVMusic, boolean z) {
                    if (z) {
                        C39173k kVar = this.f101576a.f101575a.f101571b;
                        if (kVar != null) {
                            kVar.mo97446a(aVMusic);
                        }
                    } else {
                        C39173k kVar2 = this.f101576a.f101575a.f101571b;
                        if (kVar2 != null) {
                            kVar2.mo97450b(aVMusic, null);
                        }
                    }
                }
            }

            C39191a(C39190d dVar) {
                this.f101575a = dVar;
            }

            /* renamed from: a */
            public final void mo97308a(Exception exc) {
                C39173k kVar = this.f101575a.f101571b;
                if (kVar != null) {
                    kVar.mo97451b(exc);
                }
            }

            /* renamed from: a */
            public final void mo97309a(List<? extends AVMusic> list) {
                AVMusic aVMusic = null;
                if (C6292i.m19525a(list)) {
                    C39173k kVar = this.f101575a.f101571b;
                    if (kVar != null) {
                        kVar.mo97451b(null);
                        return;
                    }
                    return;
                }
                C39173k kVar2 = this.f101575a.f101571b;
                if (kVar2 != null) {
                    kVar2.mo97449a(list);
                }
                Context context = this.f101575a.f101574e;
                if (list != null) {
                    aVMusic = (AVMusic) list.get(0);
                }
                C39186f.m125114a(context, aVMusic, (C39166d) new C39192a(this));
            }
        }

        public final void onFailed(Exception exc) {
            C7573i.m23587b(exc, "e");
            C39173k kVar = this.f101571b;
            if (kVar != null) {
                kVar.mo97448a(exc);
            }
        }

        public final void onSuccess(String[] strArr) {
            C7573i.m23587b(strArr, "requirements");
            this.f101570a.mo97473a(this.f101572c, this.f101573d, (C39167e) new C39191a(this));
        }

        C39190d(C39186f fVar, C39173k kVar, int i, String str, Context context) {
            this.f101570a = fVar;
            this.f101571b = kVar;
            this.f101572c = i;
            this.f101573d = str;
            this.f101574e = context;
        }
    }

    private C39186f() {
    }

    /* renamed from: b */
    private static List<AVMusic> m125115b(List<? extends AVMusic> list, int i) {
        int i2;
        int i3;
        if (!C6292i.m19525a(list)) {
            if (list == null) {
                C7573i.m23580a();
            }
            if (list.size() > 10) {
                Collections.shuffle(list);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    i2 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    AVMusic aVMusic = (AVMusic) it.next();
                    if (aVMusic.getStickPointMusicAlg() == null) {
                        i3 = 0;
                    } else {
                        i3 = aVMusic.getStickPointMusicAlg().getMinSeg();
                    }
                    if (aVMusic.getStickPointMusicAlg() != null) {
                        i2 = aVMusic.getStickPointMusicAlg().getMaxSeg();
                    }
                    if (i2 <= 0 && i3 <= 0) {
                        arrayList.add(aVMusic);
                    } else if (i3 <= i && i2 >= i) {
                        arrayList.add(aVMusic);
                    }
                }
                if (arrayList.size() <= 10) {
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList(10);
                while (i2 < 10) {
                    arrayList2.add(arrayList.get(i2));
                    i2++;
                }
                return arrayList2;
            }
        }
        return list;
    }

    /* renamed from: a */
    public final List<AVMusic> mo97472a(List<AVMusic> list, int i) {
        AVMusic aVMusic;
        AVMusic b = C39360dw.m125725a().mo97931b();
        List<AVMusic> list2 = null;
        if (b != null) {
            C39182e.f101552a.mo97467a(b);
            if (C6292i.m19525a(list)) {
                list2 = new ArrayList<>();
            } else {
                if (list == null) {
                    C7573i.m23580a();
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVMusic = null;
                        break;
                    }
                    aVMusic = (AVMusic) it.next();
                    if (aVMusic.getId() == b.getId()) {
                        break;
                    }
                }
                if (aVMusic != null) {
                    list.remove(aVMusic);
                }
                List b2 = m125115b(list, i);
                if (b2 != null) {
                    list2 = C7525m.m23509d((Collection<? extends T>) b2);
                }
            }
            if (list2 == null) {
                C7573i.m23580a();
            }
            list2.add(0, b);
            return list2;
        } else if (C6292i.m19525a(list)) {
            return null;
        } else {
            List b3 = m125115b(list, i);
            if (b3 != null) {
                list2 = C7525m.m23509d((Collection<? extends T>) b3);
            }
            return list2;
        }
    }

    /* renamed from: a */
    public static void m125114a(Context context, AVMusic aVMusic, C39166d dVar) {
        C39147a.f101501a.mo97436a(context, aVMusic, dVar);
    }

    /* renamed from: a */
    public final void mo97473a(int i, String str, C39167e eVar) {
        C1592h.m7853a((Callable<TResult>) new C39188b<TResult>(i, str)).mo6876a((C1591g<TResult, TContinuationResult>) new C39189c<TResult,TContinuationResult>(this, eVar, i), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo97474a(Context context, int i, String str, C39173k kVar) {
        C39190d dVar = new C39190d(this, kVar, i, str, context);
        C39147a.m124995a(dVar);
    }
}
