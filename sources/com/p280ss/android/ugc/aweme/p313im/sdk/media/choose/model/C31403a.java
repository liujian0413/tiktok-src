package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model;

import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.p1877a.C47886a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.model.a */
public final class C31403a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82252a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31403a.class), "imageModelList", "getImageModelList()Ljava/util/List;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31403a.class), "videoModelList", "getVideoModelList()Ljava/util/List;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31403a.class), "innerMixModelList", "getInnerMixModelList()Ljava/util/List;"))};

    /* renamed from: d */
    public static final C31404a f82253d = new C31404a(null);

    /* renamed from: b */
    public boolean f82254b;

    /* renamed from: c */
    public final String f82255c;

    /* renamed from: e */
    private final C7541d f82256e = C7546e.m23569a(C31405b.f82259a);

    /* renamed from: f */
    private final C7541d f82257f = C7546e.m23569a(C31408e.f82261a);

    /* renamed from: g */
    private final C7541d f82258g = C7546e.m23569a(C31406c.f82260a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.model.a$a */
    public static final class C31404a {
        private C31404a() {
        }

        /* renamed from: a */
        public static C31403a m102178a() {
            C31403a aVar = new C31403a("#album_key_all");
            aVar.f82254b = true;
            return aVar;
        }

        public /* synthetic */ C31404a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.model.a$b */
    static final class C31405b extends Lambda implements C7561a<List<MediaModel>> {

        /* renamed from: a */
        public static final C31405b f82259a = new C31405b();

        C31405b() {
            super(0);
        }

        /* renamed from: a */
        private static List<MediaModel> m102179a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102179a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.model.a$c */
    static final class C31406c extends Lambda implements C7561a<List<MediaModel>> {

        /* renamed from: a */
        public static final C31406c f82260a = new C31406c();

        C31406c() {
            super(0);
        }

        /* renamed from: a */
        private static List<MediaModel> m102180a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102180a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.model.a$d */
    public static final class C31407d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Long.valueOf(((MediaModel) t2).getDateModify()), Long.valueOf(((MediaModel) t).getDateModify()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.model.a$e */
    static final class C31408e extends Lambda implements C7561a<List<MediaModel>> {

        /* renamed from: a */
        public static final C31408e f82261a = new C31408e();

        C31408e() {
            super(0);
        }

        /* renamed from: a */
        private static List<MediaModel> m102181a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102181a();
        }
    }

    /* renamed from: f */
    private final List<MediaModel> m102172f() {
        return (List) this.f82258g.getValue();
    }

    /* renamed from: c */
    public final List<MediaModel> mo81981c() {
        return (List) this.f82256e.getValue();
    }

    /* renamed from: d */
    public final List<MediaModel> mo81982d() {
        return (List) this.f82257f.getValue();
    }

    /* renamed from: a */
    public final int mo81979a() {
        return mo81981c().size() + mo81982d().size();
    }

    /* renamed from: e */
    public final List<MediaModel> mo81983e() {
        if (m102172f().isEmpty()) {
            m102172f().addAll(mo81981c());
            m102172f().addAll(mo81982d());
            List f = m102172f();
            if (f.size() > 1) {
                C7525m.m23474a(f, new C31407d());
            }
        }
        return m102172f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r0 == null) goto L_0x003e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo81980b() {
        /*
            r7 = this;
            java.util.List r0 = r7.mo81981c()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r7.mo81981c()
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.im.sdk.media.model.MediaModel r0 = (com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel) r0
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            java.util.List r3 = r7.mo81982d()
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x0034
            java.util.List r1 = r7.mo81982d()
            java.lang.Object r1 = r1.get(r2)
            com.ss.android.ugc.aweme.im.sdk.media.model.MediaModel r1 = (com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel) r1
        L_0x0034:
            if (r0 != 0) goto L_0x0041
            if (r1 == 0) goto L_0x003e
            java.lang.String r0 = r1.getThumbnail()
            if (r0 != 0) goto L_0x0040
        L_0x003e:
            java.lang.String r0 = ""
        L_0x0040:
            return r0
        L_0x0041:
            if (r1 != 0) goto L_0x0052
            java.lang.String r1 = r0.getThumbnail()
            if (r1 != 0) goto L_0x004d
            java.lang.String r1 = r0.getFilePath()
        L_0x004d:
            if (r1 != 0) goto L_0x0051
            java.lang.String r1 = ""
        L_0x0051:
            return r1
        L_0x0052:
            long r2 = r0.getDateModify()
            long r4 = r1.getDateModify()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x006d
            java.lang.String r1 = r0.getThumbnail()
            if (r1 != 0) goto L_0x0068
            java.lang.String r1 = r0.getFilePath()
        L_0x0068:
            if (r1 != 0) goto L_0x006c
            java.lang.String r1 = ""
        L_0x006c:
            return r1
        L_0x006d:
            java.lang.String r0 = r1.getThumbnail()
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = ""
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.C31403a.mo81980b():java.lang.String");
    }

    public C31403a(String str) {
        C7573i.m23587b(str, "albumKey");
        this.f82255c = str;
    }
}
