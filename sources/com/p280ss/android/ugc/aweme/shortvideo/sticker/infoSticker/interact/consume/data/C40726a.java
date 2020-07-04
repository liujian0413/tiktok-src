package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.p280ss.android.ugc.aweme.sticker.C41849d;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41841a;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41842b;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41844c;
import com.p280ss.android.ugc.aweme.video.C43191ah;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.playerkit.videoview.C44960f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.p1877a.C47886a;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a */
public final class C40726a {

    /* renamed from: a */
    public Aweme f105874a;

    /* renamed from: b */
    public DataCenter f105875b;

    /* renamed from: c */
    public C41841a f105876c;

    /* renamed from: d */
    public C41842b f105877d;

    /* renamed from: e */
    public C41849d f105878e;

    /* renamed from: f */
    public C43222g f105879f;

    /* renamed from: g */
    public C44960f f105880g;

    /* renamed from: h */
    public C41844c f105881h;

    /* renamed from: i */
    public boolean f105882i;

    /* renamed from: j */
    public InteractStickerViewModel f105883j;

    /* renamed from: k */
    public boolean f105884k;

    /* renamed from: l */
    private final String f105885l;

    /* renamed from: m */
    private final String f105886m;

    /* renamed from: n */
    private final String f105887n;

    /* renamed from: o */
    private final String f105888o;

    /* renamed from: p */
    private final String f105889p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$a */
    public static final class C40727a {

        /* renamed from: a */
        public Aweme f105890a;

        /* renamed from: b */
        public DataCenter f105891b;

        /* renamed from: c */
        public C41841a f105892c;

        /* renamed from: d */
        public C41842b f105893d;

        /* renamed from: e */
        public C41849d f105894e;

        /* renamed from: f */
        public C43222g f105895f;

        /* renamed from: g */
        public C44960f f105896g;

        /* renamed from: h */
        public C41844c f105897h;

        /* renamed from: i */
        public boolean f105898i = true;

        /* renamed from: j */
        public InteractStickerViewModel f105899j;

        /* renamed from: k */
        public boolean f105900k;

        /* renamed from: a */
        public final C40726a mo100948a() {
            return new C40726a(this, null);
        }

        /* renamed from: a */
        public final C40727a mo100938a(DataCenter dataCenter) {
            this.f105891b = dataCenter;
            return this;
        }

        /* renamed from: b */
        public final C40727a mo100949b(boolean z) {
            this.f105900k = z;
            return this;
        }

        /* renamed from: a */
        public final C40727a mo100939a(Aweme aweme) {
            this.f105890a = aweme;
            return this;
        }

        /* renamed from: a */
        public final C40727a mo100940a(InteractStickerViewModel interactStickerViewModel) {
            C7573i.m23587b(interactStickerViewModel, "viewModel");
            this.f105899j = interactStickerViewModel;
            return this;
        }

        /* renamed from: a */
        public final C40727a mo100941a(C41841a aVar) {
            this.f105892c = aVar;
            return this;
        }

        /* renamed from: a */
        public final C40727a mo100942a(C41842b bVar) {
            this.f105893d = bVar;
            return this;
        }

        /* renamed from: a */
        public final C40727a mo100943a(C41844c cVar) {
            this.f105897h = cVar;
            return this;
        }

        /* renamed from: a */
        public final C40727a mo100944a(C41849d dVar) {
            this.f105894e = dVar;
            return this;
        }

        /* renamed from: a */
        public final C40727a mo100945a(C43222g gVar) {
            this.f105895f = gVar;
            return this;
        }

        /* renamed from: a */
        public final C40727a mo100946a(C44960f fVar) {
            this.f105896g = fVar;
            return this;
        }

        /* renamed from: a */
        public final C40727a mo100947a(boolean z) {
            this.f105898i = false;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$b */
    static final class C40728b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C40726a f105901a;

        C40728b(C40726a aVar) {
            this.f105901a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ArrayList<InteractStickerStruct> call() {
            ArrayList<InteractStickerStruct> e = this.f105901a.mo100937e();
            this.f105901a.mo100933a(e);
            return e;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$c */
    static final class C40729c<TTaskResult, TContinuationResult> implements C1591g<ArrayList<InteractStickerStruct>, Object> {

        /* renamed from: a */
        final /* synthetic */ C40726a f105902a;

        C40729c(C40726a aVar) {
            this.f105902a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<ArrayList<InteractStickerStruct>> hVar) {
            if (this.f105902a.f105875b != null) {
                DataCenter dataCenter = this.f105902a.f105875b;
                if (dataCenter != null) {
                    C7573i.m23582a((Object) hVar, "it");
                    dataCenter.mo60134a("interact_sticker_video_data", hVar.mo6890e());
                }
            } else if (this.f105902a.f105883j != null) {
                InteractStickerViewModel interactStickerViewModel = this.f105902a.f105883j;
                if (interactStickerViewModel != null) {
                    C7573i.m23582a((Object) hVar, "it");
                    interactStickerViewModel.mo101067a("interact_sticker_video_data", hVar.mo6890e());
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$d */
    public static final class C40730d extends C6597a<ArrayList<InteractStickerStruct>> {
        C40730d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$e */
    public static final class C40731e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((InteractStickerStruct) t).getIndex()), Integer.valueOf(((InteractStickerStruct) t2).getIndex()));
        }
    }

    /* renamed from: d */
    public final void mo100936d() {
        if (this.f105875b != null) {
            DataCenter dataCenter = this.f105875b;
            if (dataCenter != null) {
                dataCenter.mo60134a("interact_sticker_clear_data", (Object) null);
            }
            DataCenter dataCenter2 = this.f105875b;
            if (dataCenter2 != null) {
                dataCenter2.mo60134a("interact_sticker_aweme_data", (Object) null);
            }
            DataCenter dataCenter3 = this.f105875b;
            if (dataCenter3 != null) {
                dataCenter3.mo60134a("interact_sticker_video_data", (Object) null);
            }
        } else {
            InteractStickerViewModel interactStickerViewModel = this.f105883j;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.mo101067a("interact_sticker_clear_data", (Object) null);
            }
            InteractStickerViewModel interactStickerViewModel2 = this.f105883j;
            if (interactStickerViewModel2 != null) {
                interactStickerViewModel2.mo101067a("interact_sticker_aweme_data", (Object) null);
            }
            InteractStickerViewModel interactStickerViewModel3 = this.f105883j;
            if (interactStickerViewModel3 != null) {
                interactStickerViewModel3.mo101067a("interact_sticker_video_data", (Object) null);
            }
        }
    }

    /* renamed from: b */
    public final void mo100934b() {
        List list;
        ArrayList arrayList;
        Aweme aweme = this.f105874a;
        if (aweme != null) {
            list = aweme.getInteractStickerStructs();
        } else {
            list = null;
        }
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            Aweme aweme2 = this.f105874a;
            if (aweme2 == null) {
                C7573i.m23580a();
            }
            arrayList = new ArrayList(aweme2.getInteractStickerStructs());
        }
        Aweme aweme3 = this.f105874a;
        if (aweme3 != null && aweme3.isProhibited()) {
            arrayList = new ArrayList();
        }
        if (this.f105875b != null) {
            DataCenter dataCenter = this.f105875b;
            if (dataCenter != null) {
                dataCenter.mo60134a("interact_sticker_aweme_data", (Object) arrayList);
            }
        } else if (this.f105883j != null) {
            InteractStickerViewModel interactStickerViewModel = this.f105883j;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.mo101067a("interact_sticker_aweme_data", (Object) arrayList);
            }
        }
    }

    /* renamed from: c */
    public final void mo100935c() {
        Aweme aweme = this.f105874a;
        if (aweme == null || !aweme.isProhibited()) {
            C1592h.m7853a((Callable<TResult>) new C40728b<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C40729c<TResult,TContinuationResult>(this), C1592h.f5958b);
            return;
        }
        if (this.f105875b != null) {
            DataCenter dataCenter = this.f105875b;
            if (dataCenter != null) {
                dataCenter.mo60134a("interact_sticker_video_data", (Object) new ArrayList());
            }
        } else if (this.f105883j != null) {
            InteractStickerViewModel interactStickerViewModel = this.f105883j;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.mo101067a("interact_sticker_video_data", (Object) new ArrayList());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100931a() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.sticker.e r0 = new com.ss.android.ugc.aweme.sticker.e
            r0.<init>()
            com.ss.android.ugc.aweme.sticker.a.a r1 = r4.f105876c
            com.ss.android.ugc.aweme.sticker.e r1 = r0.mo102767a(r1)
            com.ss.android.ugc.aweme.sticker.a.b r2 = r4.f105877d
            com.ss.android.ugc.aweme.sticker.e r1 = r1.mo102768a(r2)
            com.ss.android.ugc.aweme.sticker.a.c r2 = r4.f105881h
            com.ss.android.ugc.aweme.sticker.e r1 = r1.mo102769a(r2)
            com.ss.android.ugc.aweme.sticker.d r2 = r4.f105878e
            com.ss.android.ugc.aweme.sticker.e r1 = r1.mo102770a(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f105874a
            com.ss.android.ugc.aweme.profile.model.User r2 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130164b(r2)
            com.ss.android.ugc.aweme.sticker.e r1 = r1.mo102766a(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f105874a
            java.lang.String r2 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130158a(r2)
            com.ss.android.ugc.aweme.sticker.e r1 = r1.mo102771a(r2)
            boolean r2 = r4.f105882i
            com.ss.android.ugc.aweme.sticker.e r1 = r1.mo102772a(r2)
            boolean r2 = r4.f105884k
            com.ss.android.ugc.aweme.sticker.e r1 = r1.mo102776b(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f105874a
            r3 = 0
            if (r2 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = r2.getLogExtra()
            goto L_0x004e
        L_0x004d:
            r2 = r3
        L_0x004e:
            com.ss.android.ugc.aweme.sticker.e r1 = r1.mo102775b(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f105874a
            if (r2 == 0) goto L_0x0060
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0060
            java.lang.String r3 = r2.getPageFrom()
        L_0x0060:
            com.ss.android.ugc.aweme.sticker.e r1 = r1.mo102777c(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f105874a
            if (r2 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0079
            java.lang.Long r2 = r2.getCreativeId()
            if (r2 == 0) goto L_0x0079
            long r2 = r2.longValue()
            goto L_0x007b
        L_0x0079:
            r2 = 0
        L_0x007b:
            com.ss.android.ugc.aweme.sticker.e r1 = r1.mo102765a(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f105874a
            if (r2 != 0) goto L_0x0086
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0086:
            long r2 = com.p280ss.android.ugc.aweme.commercialize.log.C24932ae.m81780a(r2)
            r1.mo102774b(r2)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r4.f105875b
            if (r1 == 0) goto L_0x009c
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r4.f105875b
            if (r1 == 0) goto L_0x009b
            java.lang.String r2 = "interact_sticker_data"
            r1.mo60134a(r2, r0)
            goto L_0x00aa
        L_0x009b:
            return
        L_0x009c:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r1 = r4.f105883j
            if (r1 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r1 = r4.f105883j
            if (r1 == 0) goto L_0x00aa
            java.lang.String r2 = "interact_sticker_data"
            r1.mo101067a(r2, r0)
            return
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40726a.mo100931a():void");
    }

    /* renamed from: e */
    public final ArrayList<InteractStickerStruct> mo100937e() {
        String str;
        String str2;
        ArrayList<InteractStickerStruct> arrayList;
        if (this.f105879f != null) {
            C43222g gVar = this.f105879f;
            if (gVar == null) {
                C7573i.m23580a();
            }
            str = gVar.mo104951b(this.f105885l);
            if (str == null) {
                C43222g gVar2 = this.f105879f;
                if (gVar2 == null) {
                    C7573i.m23580a();
                }
                str = gVar2.mo104951b(this.f105886m);
            }
            if (str == null) {
                C43222g gVar3 = this.f105879f;
                if (gVar3 == null) {
                    C7573i.m23580a();
                }
                str = gVar3.mo104951b(this.f105887n);
            }
        } else if (this.f105880g != null) {
            String a = C43191ah.m136948a(this.f105880g, this.f105885l);
            if (a == null) {
                a = C43191ah.m136948a(this.f105880g, this.f105886m);
            }
            if (str == null) {
                str = C43191ah.m136948a(this.f105880g, this.f105887n);
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            str2 = new JSONObject(new JSONObject(str).getString(this.f105888o)).getString(this.f105889p);
        } catch (Exception unused) {
            str2 = null;
        }
        try {
            arrayList = (ArrayList) C10944e.m32113a().mo15975a(str2, new C40730d().type);
        } catch (JsonSyntaxException unused2) {
            arrayList = null;
        }
        return arrayList;
    }

    private C40726a(C40727a aVar) {
        this(aVar.f105890a, aVar.f105891b, aVar.f105892c, aVar.f105893d, aVar.f105894e, aVar.f105895f, aVar.f105896g, aVar.f105897h, aVar.f105898i, aVar.f105899j, aVar.f105900k);
    }

    /* renamed from: a */
    private boolean m130198a(String str) {
        BusinessExtraData businessExtraData;
        C7573i.m23587b(str, "attr");
        List list = null;
        try {
            businessExtraData = (BusinessExtraData) C10944e.m32113a().mo15974a(new JSONObject(str).getString("interaction_extra"), BusinessExtraData.class);
        } catch (Exception unused) {
            businessExtraData = null;
        }
        if (businessExtraData == null) {
            return false;
        }
        Aweme aweme = this.f105874a;
        if (aweme != null) {
            String stickerIDs = aweme.getStickerIDs();
            if (stickerIDs != null) {
                list = C7634n.m23768b((CharSequence) stickerIDs, new String[]{","}, false, 0);
            }
        }
        if (C6307b.m19566a((Collection<T>) list)) {
            return false;
        }
        if (list == null) {
            C7573i.m23580a();
        }
        return list.contains(businessExtraData.getStickerId());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x016b, code lost:
        if (r7 == null) goto L_0x016d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0153  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100932a(android.content.Context r12) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r12, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f105874a
            r1 = 0
            if (r0 == 0) goto L_0x000f
            java.util.List r0 = r0.getInteractStickerStructs()
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            if (r0 != 0) goto L_0x0018
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x002a
        L_0x0018:
            java.util.ArrayList r0 = new java.util.ArrayList
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f105874a
            if (r2 != 0) goto L_0x0021
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0021:
            java.util.List r2 = r2.getInteractStickerStructs()
            java.util.Collection r2 = (java.util.Collection) r2
            r0.<init>(r2)
        L_0x002a:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$e r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$e
            r2.<init>()
            java.util.Comparator r2 = (java.util.Comparator) r2
            java.util.List r0 = kotlin.collections.C7525m.m23494a(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x003d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01bc
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r2 = (com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r2
            int r3 = r2.getType()
            r4 = 1
            if (r3 == r4) goto L_0x00b7
            r2 = 3
            if (r3 == r2) goto L_0x0054
            goto L_0x003d
        L_0x0054:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f105874a
            if (r2 == 0) goto L_0x0061
            boolean r2 = r2.isAd()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0062
        L_0x0061:
            r2 = r1
        L_0x0062:
            if (r2 != 0) goto L_0x0067
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0067:
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f105874a
            if (r2 == 0) goto L_0x007d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x007d
            java.lang.String r2 = r2.getLogExtra()
            r4 = r2
            goto L_0x007e
        L_0x007d:
            r4 = r1
        L_0x007e:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f105874a
            if (r2 == 0) goto L_0x008e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x008e
            java.lang.String r2 = r2.getPageFrom()
            r5 = r2
            goto L_0x008f
        L_0x008e:
            r5 = r1
        L_0x008f:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f105874a
            if (r2 == 0) goto L_0x0098
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            goto L_0x0099
        L_0x0098:
            r2 = r1
        L_0x0099:
            if (r2 != 0) goto L_0x009e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x009e:
            java.lang.String r3 = "aweme?.awemeRawAd!!"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r6 = com.p280ss.android.ugc.aweme.commercialize.log.C24932ae.m81781a(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f105874a
            if (r2 != 0) goto L_0x00ae
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00ae:
            long r7 = com.p280ss.android.ugc.aweme.commercialize.log.C24932ae.m81780a(r2)
            r3 = r12
            com.p280ss.android.ugc.aweme.commercialize.log.C24932ae.m81784a(r3, r4, r5, r6, r7)
            goto L_0x003d
        L_0x00b7:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f105874a
            if (r3 == 0) goto L_0x00c4
            boolean r3 = r3.isAd()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x00c5
        L_0x00c4:
            r3 = r1
        L_0x00c5:
            if (r3 != 0) goto L_0x00ca
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00ca:
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0126
            com.ss.android.ugc.aweme.sticker.data.PoiStruct r3 = r2.getPoiStruct()
            if (r3 == 0) goto L_0x00dc
            java.lang.String r3 = r3.getPoiId()
            r5 = r3
            goto L_0x00dd
        L_0x00dc:
            r5 = r1
        L_0x00dd:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f105874a
            if (r3 == 0) goto L_0x00ed
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x00ed
            java.lang.String r3 = r3.getLogExtra()
            r6 = r3
            goto L_0x00ee
        L_0x00ed:
            r6 = r1
        L_0x00ee:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f105874a
            if (r3 == 0) goto L_0x00fe
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x00fe
            java.lang.String r3 = r3.getPageFrom()
            r7 = r3
            goto L_0x00ff
        L_0x00fe:
            r7 = r1
        L_0x00ff:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f105874a
            if (r3 == 0) goto L_0x0108
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            goto L_0x0109
        L_0x0108:
            r3 = r1
        L_0x0109:
            if (r3 != 0) goto L_0x010e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x010e:
            java.lang.String r4 = "aweme?.awemeRawAd!!"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            java.lang.String r8 = com.p280ss.android.ugc.aweme.commercialize.log.C24932ae.m81781a(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f105874a
            if (r3 != 0) goto L_0x011e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x011e:
            long r9 = com.p280ss.android.ugc.aweme.commercialize.log.C24932ae.m81780a(r3)
            r4 = r12
            com.p280ss.android.ugc.aweme.commercialize.log.C24932ae.m81785a(r4, r5, r6, r7, r8, r9)
        L_0x0126:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r3 = r11.f105875b
            if (r3 == 0) goto L_0x0137
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r3 = r11.f105875b
            if (r3 == 0) goto L_0x0148
            java.lang.String r4 = "interact_sticker_data"
            java.lang.Object r3 = r3.mo60135a(r4)
            com.ss.android.ugc.aweme.sticker.e r3 = (com.p280ss.android.ugc.aweme.sticker.C41850e) r3
            goto L_0x0149
        L_0x0137:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r3 = r11.f105883j
            if (r3 == 0) goto L_0x0148
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r3 = r11.f105883j
            if (r3 == 0) goto L_0x0148
            java.lang.String r4 = "interact_sticker_data"
            java.lang.Object r3 = r3.mo101068a(r4)
            com.ss.android.ugc.aweme.sticker.e r3 = (com.p280ss.android.ugc.aweme.sticker.C41850e) r3
            goto L_0x0149
        L_0x0148:
            r3 = r1
        L_0x0149:
            java.lang.String r4 = "poi_sticker_show"
            com.ss.android.ugc.aweme.app.g.d r5 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r6 = "enter_from"
            if (r3 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.sticker.d r7 = r3.f108861n
            if (r7 == 0) goto L_0x015a
            java.lang.String r7 = r7.f108842b
            goto L_0x015b
        L_0x015a:
            r7 = r1
        L_0x015b:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r6, r7)
            java.lang.String r6 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r7 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130167c(r2)
            if (r7 == 0) goto L_0x016d
            java.lang.String r7 = r7.getPoiStickerId()
            if (r7 != 0) goto L_0x016f
        L_0x016d:
            java.lang.String r7 = ""
        L_0x016f:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r6, r7)
            java.lang.String r6 = "group_id"
            if (r3 == 0) goto L_0x017e
            com.ss.android.ugc.aweme.sticker.d r7 = r3.f108861n
            if (r7 == 0) goto L_0x017e
            java.lang.String r7 = r7.f108844d
            goto L_0x017f
        L_0x017e:
            r7 = r1
        L_0x017f:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r6, r7)
            java.lang.String r6 = "log_pb"
            if (r3 == 0) goto L_0x018e
            com.ss.android.ugc.aweme.sticker.d r7 = r3.f108861n
            if (r7 == 0) goto L_0x018e
            java.lang.String r7 = r7.f108845e
            goto L_0x018f
        L_0x018e:
            r7 = r1
        L_0x018f:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r6, r7)
            java.lang.String r6 = "author_id"
            if (r3 == 0) goto L_0x019e
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x019e
            java.lang.String r3 = r3.f108843c
            goto L_0x019f
        L_0x019e:
            r3 = r1
        L_0x019f:
            com.ss.android.ugc.aweme.app.g.d r3 = r5.mo59973a(r6, r3)
            java.lang.String r5 = "poi_id"
            com.ss.android.ugc.aweme.sticker.data.PoiStruct r2 = r2.getPoiStruct()
            if (r2 == 0) goto L_0x01b0
            java.lang.String r2 = r2.getPoiId()
            goto L_0x01b1
        L_0x01b0:
            r2 = r1
        L_0x01b1:
            com.ss.android.ugc.aweme.app.g.d r2 = r3.mo59973a(r5, r2)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r2)
            goto L_0x003d
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40726a.mo100932a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo100933a(ArrayList<InteractStickerStruct> arrayList) {
        String str;
        if (!C6307b.m19566a((Collection<T>) arrayList)) {
            List arrayList2 = new ArrayList();
            if (arrayList != null) {
                for (InteractStickerStruct interactStickerStruct : arrayList) {
                    if (interactStickerStruct != null) {
                        str = interactStickerStruct.getAttr();
                    } else {
                        str = null;
                    }
                    C7573i.m23582a((Object) str, "it?.attr");
                    if (!m130198a(str)) {
                        arrayList2.add(interactStickerStruct);
                    }
                }
            }
            if (arrayList != null) {
                arrayList.removeAll(arrayList2);
            }
        }
    }

    public /* synthetic */ C40726a(C40727a aVar, C7571f fVar) {
        this(aVar);
    }

    private C40726a(Aweme aweme, DataCenter dataCenter, C41841a aVar, C41842b bVar, C41849d dVar, C43222g gVar, C44960f fVar, C41844c cVar, boolean z, InteractStickerViewModel interactStickerViewModel, boolean z2) {
        this.f105874a = aweme;
        this.f105875b = dataCenter;
        this.f105876c = aVar;
        this.f105877d = bVar;
        this.f105878e = dVar;
        this.f105879f = gVar;
        this.f105880g = fVar;
        this.f105881h = cVar;
        this.f105882i = z;
        this.f105883j = interactStickerViewModel;
        this.f105884k = z2;
        this.f105885l = "information";
        this.f105886m = "com.android.information";
        this.f105887n = "com.apple.quicktime.information";
        this.f105888o = "com.bytedance.info";
        this.f105889p = "interaction_stickers";
    }
}
