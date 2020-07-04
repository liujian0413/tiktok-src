package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.feed.event.C28327j;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40732b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40734d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1610c.C40718a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40719a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40722d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40723e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40724f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40725g;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent;
import com.p280ss.android.ugc.aweme.sticker.C41850e;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41841a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.p1877a.C47886a;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget */
public final class InteractStickerWidget extends AbsInteractStickerWidget implements C0053p<C23083a>, C40719a, C40725g {

    /* renamed from: i */
    public C41850e f106101i;

    /* renamed from: j */
    private InteractStickerParent f106102j;

    /* renamed from: k */
    private C40724f f106103k;

    /* renamed from: l */
    private C40718a f106104l;

    /* renamed from: m */
    private List<? extends InteractStickerStruct> f106105m;

    /* renamed from: n */
    private List<? extends InteractStickerStruct> f106106n;

    /* renamed from: o */
    private InteractStickerViewModel f106107o;

    /* renamed from: p */
    private List<C40732b> f106108p = new ArrayList();

    /* renamed from: q */
    private C40734d f106109q;

    /* renamed from: r */
    private boolean f106110r;

    /* renamed from: s */
    private Aweme f106111s;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$a */
    public static final class C40798a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((InteractStickerStruct) t).getIndex()), Integer.valueOf(((InteractStickerStruct) t2).getIndex()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$b */
    public static final class C40799b implements C40723e {

        /* renamed from: a */
        final /* synthetic */ C40732b f106112a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f106113b;

        /* renamed from: c */
        final /* synthetic */ long f106114c;

        /* renamed from: d */
        final /* synthetic */ MotionEvent f106115d;

        /* renamed from: a */
        public final void mo100904a(boolean z) {
            float f;
            float f2;
            C41850e eVar = this.f106113b.f106101i;
            if (eVar != null) {
                C41841a aVar = eVar.f108859l;
                if (aVar != null) {
                    int c = this.f106112a.f105906d.mo100902c();
                    View a = this.f106112a.f105906d.mo100896a(this.f106112a.f105906d.mo100902c());
                    MotionEvent motionEvent = this.f106115d;
                    if (motionEvent != null) {
                        f = motionEvent.getX();
                    } else {
                        f = 0.0f;
                    }
                    MotionEvent motionEvent2 = this.f106115d;
                    if (motionEvent2 != null) {
                        f2 = motionEvent2.getY();
                    } else {
                        f2 = 0.0f;
                    }
                    aVar.mo71722a(c, a, f, f2, this.f106112a.f105906d.mo100903d(), z);
                }
            }
            C41850e eVar2 = this.f106113b.f106101i;
            if (eVar2 != null) {
                C41841a aVar2 = eVar2.f108859l;
                if (aVar2 != null) {
                    aVar2.mo71723a(this.f106112a.f105906d.mo100902c(), true);
                }
            }
        }

        C40799b(C40732b bVar, InteractStickerWidget interactStickerWidget, long j, MotionEvent motionEvent) {
            this.f106112a = bVar;
            this.f106113b = interactStickerWidget;
            this.f106114c = j;
            this.f106115d = motionEvent;
        }
    }

    /* renamed from: a */
    public final C40734d mo100905a() {
        return this.f106109q;
    }

    /* renamed from: b */
    public final int mo60147b() {
        return R.layout.b5e;
    }

    /* renamed from: a */
    public final void mo60146a(View view) {
        super.mo60146a(view);
        C7705c.m23799a().mo20389a((Object) this);
        m130393b(view);
        m130394g();
    }

    /* renamed from: a */
    public final void mo101064a(C40724f fVar) {
        C7573i.m23587b(fVar, "videoDataGetter");
        this.f106103k = fVar;
    }

    /* renamed from: a */
    public final void mo100892a(long j, MotionEvent motionEvent) {
        for (C40732b bVar : this.f106108p) {
            if (!this.f106110r || !(bVar.f105905c.getType() == 1 || bVar.f105905c.getType() == 2)) {
                C40722d dVar = bVar.f105906d;
                int c = bVar.f105906d.mo100902c();
                float x = motionEvent != null ? motionEvent.getX() : 0.0f;
                float y = motionEvent != null ? motionEvent.getY() : 0.0f;
                long j2 = j;
                C40799b bVar2 = new C40799b(bVar, this, j2, motionEvent);
                if (dVar.mo100895a(j2, c, x, y, bVar2)) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100906a(C40734d dVar) {
        C7573i.m23587b(dVar, "data");
        this.f106109q = dVar;
    }

    public final void onDestroy() {
        super.onDestroy();
        C7705c.m23799a().mo20393c((Object) this);
    }

    /* renamed from: d */
    public final InteractStickerViewModel mo101065d() {
        if (this.f106107o == null) {
            this.f106107o = new InteractStickerViewModel();
            InteractStickerViewModel interactStickerViewModel = this.f106107o;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.f106093a = this;
            }
        }
        InteractStickerViewModel interactStickerViewModel2 = this.f106107o;
        if (interactStickerViewModel2 == null) {
            C7573i.m23580a();
        }
        return interactStickerViewModel2;
    }

    public final void onPause() {
        super.onPause();
        for (C40732b bVar : this.f106108p) {
            bVar.f105906d.mo100898b();
        }
    }

    public final void onResume() {
        super.onResume();
        for (C40732b bVar : this.f106108p) {
            bVar.f105906d.mo100897a();
        }
    }

    /* renamed from: e */
    public final void mo101070e() {
        for (C40732b bVar : this.f106108p) {
            bVar.f105906d.mo100900c(bVar.f105906d.mo100902c());
        }
    }

    /* renamed from: f */
    public final void mo101071f() {
        for (C40732b bVar : this.f106108p) {
            bVar.f105906d.mo100899b(bVar.f105906d.mo100902c());
        }
    }

    /* renamed from: g */
    private final void m130394g() {
        if (this.f60922e != null) {
            this.f106101i = (C41850e) this.f60922e.mo60135a("interact_sticker_data");
            this.f106105m = (List) this.f60922e.mo60135a("interact_sticker_aweme_data");
            this.f106106n = (List) this.f60922e.mo60135a("interact_sticker_video_data");
        } else {
            this.f106101i = (C41850e) mo101065d().mo101068a("interact_sticker_data");
            this.f106105m = (List) mo101065d().mo101068a("interact_sticker_aweme_data");
            this.f106106n = (List) mo101065d().mo101068a("interact_sticker_video_data");
        }
        m130391a(this.f106101i);
        m130392a(this.f106105m, this.f106106n);
    }

    public final void onCreate() {
        super.onCreate();
        if (this.f60922e != null) {
            C0053p pVar = this;
            this.f60922e.mo60132a("interact_sticker_data", pVar);
            this.f60922e.mo60132a("interact_sticker_video_data", pVar);
            this.f60922e.mo60132a("interact_sticker_aweme_data", pVar);
            this.f60922e.mo60132a("interact_sticker_clear_data", pVar);
            this.f60922e.mo60132a("action_is_landscape", pVar);
            return;
        }
        C0053p pVar2 = this;
        mo101065d().mo101066a("interact_sticker_data", pVar2);
        mo101065d().mo101066a("interact_sticker_video_data", pVar2);
        mo101065d().mo101066a("interact_sticker_aweme_data", pVar2);
        mo101065d().mo101066a("interact_sticker_clear_data", pVar2);
        mo101065d().mo101066a("action_is_landscape", pVar2);
    }

    /* renamed from: a */
    public final void mo101063a(Aweme aweme) {
        this.f106111s = aweme;
    }

    @C7709l
    public final void onDissmissInteractWindow(C28327j jVar) {
        C7573i.m23587b(jVar, "event");
        m130386a(jVar.f74657a);
    }

    /* renamed from: a */
    private final void m130386a(int i) {
        for (C40732b bVar : this.f106108p) {
            if (bVar.f105906d.mo100902c() != i) {
                bVar.f105906d.mo100900c(bVar.f105906d.mo100902c());
            }
        }
    }

    /* renamed from: b */
    private final void m130393b(View view) {
        InteractStickerParent interactStickerParent;
        if (view != null) {
            interactStickerParent = (InteractStickerParent) view.findViewById(R.id.cwi);
        } else {
            interactStickerParent = null;
        }
        this.f106102j = interactStickerParent;
        if (VERSION.SDK_INT >= 17) {
            InteractStickerParent interactStickerParent2 = this.f106102j;
            if (interactStickerParent2 != null) {
                interactStickerParent2.setLayoutDirection(0);
            }
        }
        Activity c = mo60148c();
        C7573i.m23582a((Object) c, "activity");
        C40718a aVar = new C40718a(c, this.f106108p, this.f106101i, this.f106103k, this);
        this.f106104l = aVar;
        InteractStickerParent interactStickerParent3 = this.f106102j;
        if (interactStickerParent3 != null) {
            interactStickerParent3.setOnTouchListener(this.f106104l);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        String str;
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1862975153:
                    if (str.equals("action_is_landscape")) {
                        Object a = aVar.mo60161a();
                        C7573i.m23582a(a, "kvData.getData()");
                        this.f106110r = ((Boolean) a).booleanValue();
                        break;
                    }
                    break;
                case -1213045287:
                    if (str.equals("interact_sticker_video_data")) {
                        this.f106106n = (List) aVar.mo60161a();
                        m130392a(null, this.f106106n);
                        return;
                    }
                    break;
                case -949174003:
                    if (str.equals("interact_sticker_aweme_data")) {
                        this.f106105m = (List) aVar.mo60161a();
                        m130392a(this.f106105m, null);
                        return;
                    }
                    break;
                case -328001721:
                    if (str.equals("interact_sticker_clear_data")) {
                        InteractStickerParent interactStickerParent = this.f106102j;
                        if (interactStickerParent != null) {
                            interactStickerParent.removeAllViews();
                        }
                        this.f106105m = null;
                        this.f106106n = null;
                        this.f106108p = new ArrayList();
                        return;
                    }
                    break;
                case -153749291:
                    if (str.equals("interact_sticker_data")) {
                        this.f106101i = (C41850e) aVar.mo60161a();
                        m130391a(this.f106101i);
                        return;
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m130391a(com.p280ss.android.ugc.aweme.sticker.C41850e r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x000b
            com.ss.android.ugc.aweme.sticker.a.b r0 = r6.f108858k
            if (r0 == 0) goto L_0x000b
            com.ss.android.ugc.aweme.sticker.a.b$a r0 = r0.mo100886a()
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r1 = 0
            if (r6 == 0) goto L_0x0019
            if (r0 == 0) goto L_0x0015
            int r2 = r0.f108837a
            float r2 = (float) r2
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            r6.mo102764a(r2)
        L_0x0019:
            if (r6 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0020
            int r1 = r0.f108838b
            float r1 = (float) r1
        L_0x0020:
            r6.mo102773b(r1)
        L_0x0023:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent r1 = r5.f106102j
            if (r1 == 0) goto L_0x0030
            if (r6 == 0) goto L_0x002c
            boolean r2 = r6.f108857j
            goto L_0x002d
        L_0x002c:
            r2 = 1
        L_0x002d:
            r1.setNeedConsumeEvent(r2)
        L_0x0030:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a r1 = r5.f106104l
            if (r1 == 0) goto L_0x0036
            r1.f105871q = r6
        L_0x0036:
            if (r6 == 0) goto L_0x0060
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b> r1 = r5.f106108p
            java.util.Iterator r1 = r1.iterator()
        L_0x003e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0060
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b r2 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40732b) r2
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d r3 = r2.f105906d
            r3.mo100893a(r6)
            android.view.View r2 = r2.f105904b
            r3 = 0
            if (r0 == 0) goto L_0x0057
            int r4 = r0.f108839c
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            if (r0 == 0) goto L_0x005c
            int r3 = r0.f108840d
        L_0x005c:
            m130388a(r2, r4, r3)
            goto L_0x003e
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.m130391a(com.ss.android.ugc.aweme.sticker.e):void");
    }

    /* renamed from: a */
    private final void m130390a(InteractStickerStruct interactStickerStruct, C40722d dVar) {
        View a = dVar.mo100896a(dVar.mo100902c());
        if (C6307b.m19566a((Collection<T>) this.f106108p)) {
            if (a == null) {
                C7573i.m23580a();
            }
            m130387a(0, a, interactStickerStruct, dVar, false);
            return;
        }
        int i = 0;
        for (C40732b bVar : this.f106108p) {
            if (C7573i.m23585a((Object) bVar.f105905c, (Object) interactStickerStruct)) {
                bVar.f105906d.mo100901a(interactStickerStruct);
                return;
            } else if (bVar.f105905c.getType() == interactStickerStruct.getType()) {
                if (a == null) {
                    C7573i.m23580a();
                }
                m130387a(i, a, interactStickerStruct, dVar, true);
                return;
            } else if (i == this.f106108p.size() - 1 || interactStickerStruct.getIndex() >= bVar.f105905c.getIndex()) {
                if (i == this.f106108p.size() - 1 && interactStickerStruct.getIndex() < bVar.f105905c.getIndex()) {
                    i++;
                }
                if (a == null) {
                    C7573i.m23580a();
                }
                m130387a(i, a, interactStickerStruct, dVar, false);
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m130392a(java.util.List<? extends com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r7, java.util.List<? extends com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r8) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r7 == 0) goto L_0x000a
        L_0x0007:
            java.util.Collection r7 = (java.util.Collection) r7
            goto L_0x000f
        L_0x000a:
            java.util.List r7 = kotlin.collections.C7525m.m23461a()
            goto L_0x0007
        L_0x000f:
            r0.addAll(r7)
            if (r8 == 0) goto L_0x0017
            java.util.Collection r8 = (java.util.Collection) r8
            goto L_0x001e
        L_0x0017:
            java.util.List r7 = kotlin.collections.C7525m.m23461a()
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
        L_0x001e:
            r0.addAll(r8)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$a r7 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$a
            r7.<init>()
            java.util.Comparator r7 = (java.util.Comparator) r7
            java.util.List r7 = kotlin.collections.C7525m.m23494a(r0, r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0034:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00a9
            java.lang.Object r8 = r7.next()
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r8 = (com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r8
            int r0 = r8.getType()
            switch(r0) {
                case 1: goto L_0x0089;
                case 2: goto L_0x0067;
                case 3: goto L_0x0048;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x0034
        L_0x0048:
            android.content.Context r0 = r6.f60919b
            java.lang.String r1 = "mContext"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.sticker.e r1 = r6.f106101i
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent r2 = r6.f106102j
            if (r2 != 0) goto L_0x0058
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0058:
            android.view.View r2 = (android.view.View) r2
            r3 = r6
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r3 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40725g) r3
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40715b.C40716a.m130177a(r0, r1, r8, r2, r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40722d) r0
            r6.m130390a(r8, r0)
            goto L_0x0034
        L_0x0067:
            android.content.Context r0 = r6.f60919b
            java.lang.String r1 = "mContext"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.sticker.e r1 = r6.f106101i
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent r2 = r6.f106102j
            if (r2 != 0) goto L_0x0077
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0077:
            r3 = r2
            android.view.View r3 = (android.view.View) r3
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f r4 = r6.f106103k
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r6.f106111s
            r2 = r8
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40715b.C40716a.m130175a(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40722d) r0
            r6.m130390a(r8, r0)
            goto L_0x0034
        L_0x0089:
            android.content.Context r0 = r6.f60919b
            java.lang.String r1 = "mContext"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.sticker.e r1 = r6.f106101i
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent r2 = r6.f106102j
            if (r2 != 0) goto L_0x0099
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0099:
            android.view.View r2 = (android.view.View) r2
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f r3 = r6.f106103k
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40715b.C40716a.m130176a(r0, r1, r8, r2, r3)
            if (r0 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40722d) r0
            r6.m130390a(r8, r0)
            goto L_0x0034
        L_0x00a9:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a r7 = r6.f106104l
            if (r7 == 0) goto L_0x00b2
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b> r8 = r6.f106108p
            r7.mo100889a(r8)
        L_0x00b2:
            com.ss.android.ugc.aweme.sticker.e r7 = r6.f106101i
            if (r7 == 0) goto L_0x00bf
            com.ss.android.ugc.aweme.sticker.a.b r7 = r7.f108858k
            if (r7 == 0) goto L_0x00bf
            com.ss.android.ugc.aweme.sticker.a.b$a r7 = r7.mo100886a()
            goto L_0x00c0
        L_0x00bf:
            r7 = 0
        L_0x00c0:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b> r8 = r6.f106108p
            java.util.Iterator r8 = r8.iterator()
        L_0x00c6:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r0 = r8.next()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40732b) r0
            android.view.View r0 = r0.f105904b
            r1 = 0
            if (r7 == 0) goto L_0x00da
            int r2 = r7.f108839c
            goto L_0x00db
        L_0x00da:
            r2 = 0
        L_0x00db:
            if (r7 == 0) goto L_0x00df
            int r1 = r7.f108840d
        L_0x00df:
            m130388a(r0, r2, r1)
            goto L_0x00c6
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.m130392a(java.util.List, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo100891a(long j, int i, MotionEvent motionEvent) {
        mo100892a(j, motionEvent);
    }

    /* renamed from: a */
    private static void m130388a(View view, int i, int i2) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = i;
                layoutParams2.topMargin = i2;
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: a */
    private final void m130387a(int i, View view, InteractStickerStruct interactStickerStruct, C40722d dVar, boolean z) {
        if (i >= 0 && i < this.f106108p.size() && z) {
            try {
                this.f106108p.remove(i);
                InteractStickerParent interactStickerParent = this.f106102j;
                if (interactStickerParent != null) {
                    interactStickerParent.removeViewAt(i);
                }
            } catch (Exception unused) {
                return;
            }
        }
        this.f106108p.add(i, new C40732b(i, view, interactStickerStruct, dVar));
        InteractStickerParent interactStickerParent2 = this.f106102j;
        if (interactStickerParent2 != null) {
            interactStickerParent2.addView(view, i);
        }
    }
}
