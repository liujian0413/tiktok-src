package com.p280ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.group.C12604b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39528f;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39779q;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42607e;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42611i;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.ca */
public final class C44248ca {

    /* renamed from: a */
    public C10751a f114390a;

    /* renamed from: b */
    public final FragmentActivity f114391b;

    /* renamed from: c */
    public final EditViewModel f114392c;

    /* renamed from: d */
    public final EditToolbarViewModel f114393d;

    /* renamed from: e */
    private C10751a f114394e;

    /* renamed from: f */
    private final C47562b f114395f = new C47562b();

    /* renamed from: g */
    private final List<Pair<LiveData<Object>, C0053p<Object>>> f114396g = new ArrayList();

    /* renamed from: h */
    private final C12604b f114397h;

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$a */
    public static final class C44249a implements C42611i {

        /* renamed from: a */
        final /* synthetic */ C44248ca f114398a;

        /* renamed from: b */
        final /* synthetic */ View f114399b;

        /* renamed from: com.ss.android.ugc.gamora.editor.ca$a$a */
        static final class C44250a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44249a f114400a;

            C44250a(C44249a aVar) {
                this.f114400a = aVar;
            }

            public final void run() {
                this.f114400a.f114398a.mo106746b(this.f114400a.f114399b);
            }
        }

        /* renamed from: a */
        public final void mo104207a() {
            boolean z;
            C42607e p = C35563c.f93246i.mo103867e().mo103929p();
            C44247c cVar = this.f114398a.f114393d.f113758d;
            if (!p.mo103933a()) {
                Integer b = p.mo103934b();
                if (b == null || b.intValue() != 3) {
                    z = true;
                    cVar.f114388d = z;
                    this.f114398a.f114391b.runOnUiThread(new C44250a(this));
                    if (this.f114398a.f114393d.f113758d.f114388d && p.mo103935c() >= 0) {
                        C39500av.m126138a(this.f114398a.f114392c.mo29069f(), p);
                        p.mo103932a(-1);
                    }
                    return;
                }
            }
            z = false;
            cVar.f114388d = z;
            this.f114398a.f114391b.runOnUiThread(new C44250a(this));
            if (this.f114398a.f114393d.f113758d.f114388d) {
                C39500av.m126138a(this.f114398a.f114392c.mo29069f(), p);
                p.mo103932a(-1);
            }
        }

        C44249a(C44248ca caVar, View view) {
            this.f114398a = caVar;
            this.f114399b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$b */
    static final class C44251b extends Lambda implements C7562b<Drawable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39528f f114401a;

        C44251b(C39528f fVar) {
            this.f114401a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m140042a((Drawable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140042a(Drawable drawable) {
            C7573i.m23587b(drawable, "it");
            this.f114401a.setIcon(drawable);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$c */
    static final class C44252c extends Lambda implements C7562b<C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44248ca f114402a;

        /* renamed from: b */
        final /* synthetic */ C39528f f114403b;

        C44252c(C44248ca caVar, C39528f fVar) {
            this.f114402a = caVar;
            this.f114403b = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m140043a((C7581n) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140043a(C7581n nVar) {
            C7573i.m23587b(nVar, "it");
            this.f114403b.animate().setStartDelay(50).scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C44252c f114404a;

                {
                    this.f114404a = r1;
                }

                public final void run() {
                    this.f114404a.f114403b.setIcon((int) R.drawable.ef);
                    this.f114404a.f114403b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).withEndAction(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C442531 f114405a;

                        {
                            this.f114405a = r1;
                        }

                        public final void run() {
                            JediViewModel a = C36113b.m116288a(this.f114405a.f114404a.f114402a.f114391b).mo91871a(EditAutoEnhanceViewModel.class);
                            C7573i.m23582a((Object) a, "JediViewModelProviders.o…nceViewModel::class.java)");
                            ((EditAutoEnhanceViewModel) a).mo29069f();
                        }
                    }).start();
                }
            }).start();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$d */
    static final class C44255d extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39528f f114406a;

        C44255d(C39528f fVar) {
            this.f114406a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m140044a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140044a(String str) {
            C7573i.m23587b(str, "it");
            this.f114406a.setText(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$e */
    static final class C44256e extends Lambda implements C7562b<Drawable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39528f f114407a;

        C44256e(C39528f fVar) {
            this.f114407a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m140045a((Drawable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140045a(Drawable drawable) {
            C7573i.m23587b(drawable, "it");
            this.f114407a.setIcon(drawable);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$f */
    static final class C44257f<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ View f114408a;

        C44257f(View view) {
            this.f114408a = view;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                View view = this.f114408a;
                C7573i.m23582a((Object) bool, "it");
                view.setEnabled(bool.booleanValue());
                if (bool.booleanValue()) {
                    this.f114408a.setAlpha(1.0f);
                } else {
                    this.f114408a.setAlpha(0.5f);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$g */
    static final class C44258g<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44248ca f114409a;

        /* renamed from: b */
        final /* synthetic */ int f114410b;

        /* renamed from: c */
        final /* synthetic */ View f114411c;

        /* renamed from: d */
        final /* synthetic */ int f114412d;

        C44258g(C44248ca caVar, int i, View view, int i2) {
            this.f114409a = caVar;
            this.f114410b = i;
            this.f114411c = view;
            this.f114412d = i2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C44248ca caVar = this.f114409a;
                int i = this.f114410b;
                C7573i.m23582a((Object) bool, "it");
                caVar.mo106741a(i, bool.booleanValue(), this.f114411c, this.f114412d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$h */
    static final class C44259h<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ View f114413a;

        C44259h(View view) {
            this.f114413a = view;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C7573i.m23582a((Object) bool, "it");
                if (bool.booleanValue()) {
                    this.f114413a.setAlpha(1.0f);
                } else {
                    this.f114413a.setAlpha(0.5f);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$i */
    static final class C44260i<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ View f114414a;

        C44260i(View view) {
            this.f114414a = view;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            int i;
            if (bool != null) {
                View view = this.f114414a;
                C7573i.m23582a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$j */
    static final class C44261j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44248ca f114415a;

        /* renamed from: b */
        final /* synthetic */ View f114416b;

        /* renamed from: c */
        final /* synthetic */ boolean f114417c;

        C44261j(C44248ca caVar, View view, boolean z) {
            this.f114415a = caVar;
            this.f114416b = view;
            this.f114417c = z;
        }

        public final void run() {
            if (this.f114416b.getVisibility() == 0) {
                C10751a aVar = this.f114415a.f114390a;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                float e = ((float) (aVar.mo25726e() - this.f114416b.getMeasuredWidth())) + C9738o.m28708b((Context) this.f114415a.f114391b, 8.0f);
                float b = C9738o.m28708b((Context) this.f114415a.f114391b, 3.0f) + e;
                if (this.f114417c) {
                    C10751a aVar2 = this.f114415a.f114390a;
                    if (aVar2 == null) {
                        C7573i.m23580a();
                    }
                    aVar2.mo25717a(this.f114416b, 48, b, -((int) e));
                } else {
                    int b2 = (int) C9738o.m28708b((Context) this.f114415a.f114391b, 12.0f);
                    C10751a aVar3 = this.f114415a.f114390a;
                    if (aVar3 == null) {
                        C7573i.m23580a();
                    }
                    aVar3.mo25717a(this.f114416b, 48, ((float) b2) + C9738o.m28708b((Context) this.f114415a.f114391b, 3.0f), -b2);
                }
                if (this.f114415a.f114392c.mo106457r()) {
                    C35563c.f93246i.mo103859a(true);
                    C39500av.m126134a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$k */
    static final class C44262k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44248ca f114418a;

        C44262k(C44248ca caVar) {
            this.f114418a = caVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f114418a.f114392c.mo106440a(1);
        }
    }

    /* renamed from: a */
    public final void mo106745a(Map<Integer, ? extends View> map, int i) {
        C7573i.m23587b(map, "map");
        for (Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData e = this.f114393d.mo106423e(intValue);
            if (e != null) {
                m140019a(e, this.f114391b, new C44258g(this, intValue, view, i));
            }
        }
    }

    /* renamed from: b */
    private final void m140022b() {
        C10751a aVar = this.f114394e;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
    }

    /* renamed from: c */
    private final void m140024c() {
        if (EditViewModel.m139162E()) {
            C10751a aVar = this.f114390a;
            if (aVar != null && aVar.isShowing()) {
                aVar.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo106740a() {
        this.f114395f.mo119660a();
        for (Pair pair : this.f114396g) {
            ((LiveData) pair.getFirst()).removeObserver((C0053p) pair.getSecond());
        }
        this.f114396g.clear();
        m140022b();
    }

    /* renamed from: a */
    private final void m140021a(C7321c cVar) {
        this.f114395f.mo119661a(cVar);
    }

    /* renamed from: b */
    public final void mo106747b(C39528f fVar) {
        C7573i.m23587b(fVar, "item");
        m140021a(this.f114393d.m140467b(this.f114391b, C44265cd.f114421a, new C11672v(), new C44255d(fVar)));
        m140021a(this.f114393d.m140467b(this.f114391b, C44266ce.f114422a, new C11672v(), new C44256e(fVar)));
    }

    /* renamed from: c */
    private final void m140025c(View view) {
        C10751a a = new C10752a(this.f114391b).mo25738b((int) R.string.ajg).mo25731a(3000).mo25736a(true).mo25737a();
        float e = ((float) (a.mo25726e() - view.getMeasuredWidth())) + C9738o.m28708b((Context) this.f114391b, 8.0f);
        float b = C9738o.m28708b((Context) this.f114391b, 3.0f) + e;
        if (C43127fh.m136806a(this.f114391b)) {
            a.mo25717a(view, 48, b, -((int) e));
        } else {
            a.mo25717a(view, 48, 4.0f, -((int) C9738o.m28708b((Context) this.f114391b, 12.0f)));
        }
        C39779q.m127364a("status_background", true);
    }

    /* renamed from: b */
    public final void mo106748b(Map<Integer, ? extends View> map) {
        C7573i.m23587b(map, "map");
        for (Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData d = this.f114393d.mo106420d(intValue);
            if (d != null) {
                m140019a(d, this.f114391b, new C44257f(view));
            }
        }
    }

    /* renamed from: c */
    public final void mo106749c(Map<Integer, ? extends View> map) {
        C7573i.m23587b(map, "map");
        for (Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData f = this.f114393d.mo106425f(intValue);
            if (f != null) {
                m140019a(f, this.f114391b, new C44259h(view));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m140027d(android.view.View r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r10.f114392c
            boolean r0 = r0.mo106457r()
            r1 = 5000(0x1388, double:2.4703E-320)
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x00a7
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r10.f114393d
            com.ss.android.ugc.gamora.editor.c r0 = r0.f113758d
            boolean r0 = r0.f114388d
            if (r0 == 0) goto L_0x00a7
            android.support.v4.app.FragmentActivity r0 = r10.f114391b
            android.content.Context r0 = (android.content.Context) r0
            r5 = 2131494557(0x7f0c069d, float:1.8612626E38)
            r6 = 0
            android.view.View r0 = android.view.View.inflate(r0, r5, r6)
            java.lang.String r5 = "View.inflate(activity, R…ut.prompt_ai_music, null)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r5)
            r5 = 2131302909(0x7f0919fd, float:1.8223917E38)
            android.view.View r5 = r0.findViewById(r5)
            java.lang.String r7 = "bubbleView.findViewById(R.id.tvw_music_title)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r7)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7 = 2131299156(0x7f090b54, float:1.8216305E38)
            android.view.View r7 = r0.findViewById(r7)
            java.lang.String r8 = "bubbleView.findViewById(R.id.ivw_cover)"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r7
            com.ss.android.ugc.aweme.toolsport.IAVMusicService r8 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93246i
            com.ss.android.ugc.aweme.toolsport.IAVMusicService$b r8 = r8.mo103867e()
            com.ss.android.ugc.aweme.toolsport.a.e r8 = r8.mo103929p()
            java.util.List r8 = r8.mo103936d()
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = com.bytedance.common.utility.collection.C6307b.m19566a(r9)
            if (r9 != 0) goto L_0x0081
            if (r8 == 0) goto L_0x006a
            java.lang.Object r9 = r8.get(r4)
            com.ss.android.ugc.aweme.shortvideo.AVMusic r9 = (com.p280ss.android.ugc.aweme.shortvideo.AVMusic) r9
            if (r9 == 0) goto L_0x006a
            java.lang.String r9 = r9.getName()
            goto L_0x006b
        L_0x006a:
            r9 = r6
        L_0x006b:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r5.setText(r9)
            if (r8 == 0) goto L_0x007e
            java.lang.Object r5 = r8.get(r4)
            com.ss.android.ugc.aweme.shortvideo.AVMusic r5 = (com.p280ss.android.ugc.aweme.shortvideo.AVMusic) r5
            if (r5 == 0) goto L_0x007e
            java.lang.String r6 = r5.getPicMedium()
        L_0x007e:
            r7.setImageURI(r6)
        L_0x0081:
            com.bytedance.ies.dmt.ui.bubbleview.a$a r5 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
            android.support.v4.app.FragmentActivity r6 = r10.f114391b
            android.app.Activity r6 = (android.app.Activity) r6
            r5.<init>(r6)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r5 = r5.mo25741c(r4)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r5.mo25732a(r0)
            r5 = 1090519040(0x41000000, float:8.0)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r0.mo25729a(r5)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r0.mo25731a(r1)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r0.mo25736a(r3)
            com.bytedance.ies.dmt.ui.bubbleview.a r0 = r0.mo25737a()
            r10.f114390a = r0
            goto L_0x00d1
        L_0x00a7:
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
            android.support.v4.app.FragmentActivity r5 = r10.f114391b
            android.app.Activity r5 = (android.app.Activity) r5
            r0.<init>(r5)
            com.ss.android.ugc.gamora.editor.EditViewModel r5 = r10.f114392c
            boolean r5 = r5.mo106457r()
            if (r5 == 0) goto L_0x00bc
            r5 = 2131822824(0x7f1108e8, float:1.927843E38)
            goto L_0x00bf
        L_0x00bc:
            r5 = 2131821102(0x7f11022e, float:1.9274938E38)
        L_0x00bf:
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r0.mo25738b(r5)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r0.mo25731a(r1)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r0.mo25736a(r3)
            com.bytedance.ies.dmt.ui.bubbleview.a r0 = r0.mo25737a()
            r10.f114390a = r0
        L_0x00d1:
            android.support.v4.app.FragmentActivity r0 = r10.f114391b
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = com.p280ss.android.ugc.aweme.utils.C43127fh.m136806a(r0)
            com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler r1 = new com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler
            android.support.v4.app.FragmentActivity r2 = r10.f114391b
            android.arch.lifecycle.i r2 = (android.arch.lifecycle.C0043i) r2
            r1.<init>(r2)
            com.ss.android.ugc.gamora.editor.ca$j r2 = new com.ss.android.ugc.gamora.editor.ca$j
            r2.<init>(r10, r11, r0)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.post(r2)
            com.bytedance.ies.dmt.ui.bubbleview.a r11 = r10.f114390a
            if (r11 != 0) goto L_0x00f3
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00f3:
            android.view.View r11 = r11.getContentView()
            com.ss.android.ugc.gamora.editor.ca$k r0 = new com.ss.android.ugc.gamora.editor.ca$k
            r0.<init>(r10)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r11.setOnClickListener(r0)
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f114392c
            boolean r11 = r11.mo106457r()
            if (r11 == 0) goto L_0x0110
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f114393d
            com.ss.android.ugc.gamora.editor.c r11 = r11.f113758d
            r11.f114386b = r4
            goto L_0x011c
        L_0x0110:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f114393d
            com.ss.android.ugc.gamora.editor.c r11 = r11.f113758d
            r11.f114387c = r4
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f114393d
            com.ss.android.ugc.gamora.editor.c r11 = r11.f113758d
            r11.f114385a = r3
        L_0x011c:
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f114392c
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r11.mo29069f()
            com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av.m126163s(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44248ca.m140027d(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo106742a(View view) {
        if (!C35563c.f93246i.mo103866d()) {
            C35563c.f93246i.mo103867e().mo103921a(new C44249a(this, view));
        }
    }

    /* renamed from: b */
    public final void mo106746b(View view) {
        boolean z;
        if (!this.f114392c.mo106457r() && !this.f114393d.f113758d.f114388d) {
            return;
        }
        if (this.f114392c.mo106457r() && this.f114393d.f113758d.f114386b && !C35563c.f93246i.mo103866d()) {
            m140027d(view);
        } else if (!this.f114392c.mo106457r() && !C35563c.f93246i.mo103866d() && (!this.f114393d.f113758d.f114389e || this.f114392c.mo29069f().mOrigin != 0)) {
            IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
            C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
            if (publishService.getCurMusic() == null) {
                C44038al alVar = (C44038al) this.f114397h.mo30924a("MusicScene");
                if (alVar != null) {
                    z = alVar.mo106538J();
                } else {
                    z = false;
                }
                if (!z) {
                    Lifecycle lifecycle = this.f114391b.getLifecycle();
                    C7573i.m23582a((Object) lifecycle, "activity.lifecycle");
                    if (lifecycle.mo54a() == State.RESUMED) {
                        m140027d(view);
                        return;
                    }
                }
                this.f114393d.f113758d.f114387c = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo106743a(C39528f fVar) {
        C7573i.m23587b(fVar, "item");
        m140021a(this.f114393d.m140467b(this.f114391b, C44263cb.f114419a, new C11672v(), new C44251b(fVar)));
        m140021a(this.f114393d.m140469c(this.f114391b, C44264cc.f114420a, new C11672v(), new C44252c(this, fVar)));
    }

    /* renamed from: a */
    public final void mo106744a(Map<Integer, ? extends View> map) {
        C7573i.m23587b(map, "map");
        for (Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData g = this.f114393d.mo106426g(intValue);
            if (g != null) {
                m140019a(g, this.f114391b, new C44260i(view));
            }
        }
    }

    /* renamed from: c */
    private final void m140026c(View view, int i) {
        if (EditViewModel.m139162E()) {
            m140027d(view);
        } else {
            m140028d(view, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r1.getVisibility() == 0) goto L_0x0047;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m140029e(android.view.View r4, int r5) {
        /*
            r3 = this;
            com.bytedance.ies.dmt.ui.bubbleview.a$a r5 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
            android.support.v4.app.FragmentActivity r0 = r3.f114391b
            android.app.Activity r0 = (android.app.Activity) r0
            r5.<init>(r0)
            r0 = 2131822827(0x7f1108eb, float:1.9278436E38)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r5 = r5.mo25738b(r0)
            r0 = 5000(0x1388, double:2.4703E-320)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r5 = r5.mo25731a(r0)
            r0 = 1
            com.bytedance.ies.dmt.ui.bubbleview.a$a r5 = r5.mo25736a(r0)
            int r1 = r4.getVisibility()
            if (r1 != 0) goto L_0x0034
            android.view.ViewParent r1 = r4.getParent()
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L_0x002a
            r1 = 0
        L_0x002a:
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0034
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x0047
        L_0x0034:
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "view.context"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r2 = 1124728832(0x430a0000, float:138.0)
            float r1 = com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C39575f.m126467a(r1, r2)
            int r1 = (int) r1
            r5.mo25742d(r1)
        L_0x0047:
            com.bytedance.ies.dmt.ui.bubbleview.a r5 = r5.mo25737a()
            android.support.v4.app.FragmentActivity r1 = r3.f114391b
            android.content.Context r1 = (android.content.Context) r1
            boolean r1 = com.p280ss.android.ugc.aweme.utils.C43127fh.m136806a(r1)
            if (r1 == 0) goto L_0x0057
            r1 = 5
            goto L_0x0058
        L_0x0057:
            r1 = 3
        L_0x0058:
            r5.mo25719a(r4, r1, r0)
            java.lang.String r4 = "voice"
            com.p280ss.android.ugc.aweme.shortvideo.edit.C39779q.m127364a(r4, r0)
            java.lang.String r4 = "function_toast_show"
            com.ss.android.ugc.aweme.app.g.d r5 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = "video_edit_page"
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r0, r1)
            java.lang.String r0 = "type"
            java.lang.String r1 = "voice"
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44248ca.m140029e(android.view.View, int):void");
    }

    /* renamed from: f */
    private final void m140030f(View view, int i) {
        int i2;
        if (!this.f114392c.mo106458s()) {
            C10751a a = new C10752a(this.f114391b).mo25738b((int) R.string.nm).mo25731a(3000).mo25736a(true).mo25737a();
            a.update();
            if (C43127fh.m136806a(this.f114391b)) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            a.mo25719a(view, i2, true);
            C39779q.m127364a("auto_enhance", true);
        }
    }

    /* renamed from: a */
    private final void m140020a(View view, int i) {
        int i2;
        if (this.f114392c.mo106457r() || (C35563c.f93230L.mo93342a(Property.CombinedShootModeTipShown) && this.f114392c.mo29069f().mOrigin == 0)) {
            if (this.f114394e == null) {
                C10752a aVar = new C10752a(this.f114391b);
                if (this.f114392c.mo106457r()) {
                    i2 = R.string.axx;
                } else {
                    i2 = R.string.ayv;
                }
                this.f114394e = aVar.mo25738b(i2).mo25731a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo25736a(true).mo25737a();
            }
            C10751a aVar2 = this.f114394e;
            if (aVar2 != null) {
                aVar2.mo25717a(view, 48, C9738o.m28708b((Context) this.f114391b, 3.0f), 0);
                if (this.f114392c.mo106457r()) {
                    C39779q.m127364a("effect", true);
                    C6907h.m21524a("function_toast_show", (Map) C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("type", "effect").f60753a);
                } else {
                    C35563c.f93230L.mo93341a(Property.CombinedShootModeTipShown, false);
                }
            }
        }
    }

    /* renamed from: b */
    private final void m140023b(View view, int i) {
        boolean z;
        int i2;
        long j;
        if (C39779q.m127369b(this.f114392c.mo29069f().isReviewVideo()) || C39779q.m127371c(this.f114392c.mo29069f().isReviewVideo())) {
            z = true;
        } else {
            z = false;
        }
        C10752a aVar = new C10752a(this.f114391b);
        if (z) {
            i2 = R.string.ajt;
        } else {
            i2 = R.string.ay0;
        }
        C10752a b = aVar.mo25738b(i2);
        if (z) {
            j = 3000;
        } else {
            j = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
        }
        b.mo25731a(j).mo25736a(true).mo25737a().mo25719a(view, 48, true);
        if (C39779q.m127369b(this.f114392c.mo29069f().isReviewVideo())) {
            C39779q.m127364a("sticker_lyric_music", true);
        } else if (C39779q.m127371c(this.f114392c.mo29069f().isReviewVideo())) {
            C39779q.m127364a("sticker_lyric_no_music", true);
        } else {
            C39779q.m127364a("sticker", true);
        }
        C6907h.m21524a("function_toast_show", (Map) C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("type", "info_sticker").f60753a);
    }

    /* renamed from: d */
    private final void m140028d(View view, int i) {
        C10751a a = new C10752a(this.f114391b).mo25738b((int) R.string.axy).mo25731a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo25736a(true).mo25737a();
        float e = ((float) (a.mo25726e() - view.getMeasuredWidth())) + C9738o.m28708b((Context) this.f114391b, 8.0f);
        float b = C9738o.m28708b((Context) this.f114391b, 3.0f) + e;
        if (C43127fh.m136806a(this.f114391b)) {
            a.mo25717a(view, 48, b, -((int) e));
        } else {
            a.mo25717a(view, 48, 4.0f, -((int) C9738o.m28708b((Context) this.f114391b, 12.0f)));
        }
        C39779q.m127364a("music", true);
        C6907h.m21524a("function_toast_show", (Map) C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("type", "music").f60753a);
    }

    /* renamed from: a */
    private final <T> void m140019a(LiveData<T> liveData, C0043i iVar, C0053p<T> pVar) {
        liveData.observe(iVar, pVar);
        List<Pair<LiveData<Object>, C0053p<Object>>> list = this.f114396g;
        if (liveData != null) {
            list.add(new Pair(liveData, pVar));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LiveData<kotlin.Any>");
    }

    public C44248ca(FragmentActivity fragmentActivity, EditViewModel editViewModel, EditToolbarViewModel editToolbarViewModel, C12604b bVar) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(editViewModel, "editViewModel");
        C7573i.m23587b(editToolbarViewModel, "editToolbarViewModel");
        C7573i.m23587b(bVar, "parentScene");
        this.f114391b = fragmentActivity;
        this.f114392c = editViewModel;
        this.f114393d = editToolbarViewModel;
        this.f114397h = bVar;
    }

    /* renamed from: a */
    public final void mo106741a(int i, boolean z, View view, int i2) {
        if (i != 4) {
            if (i != 6) {
                if (i != 9) {
                    if (i != 12) {
                        switch (i) {
                            case 1:
                                if (z) {
                                    m140026c(view, i2);
                                    return;
                                } else {
                                    m140024c();
                                    return;
                                }
                            case 2:
                                if (z) {
                                    m140020a(view, i2);
                                    return;
                                } else {
                                    m140022b();
                                    return;
                                }
                        }
                    } else if (z) {
                        m140025c(view);
                    }
                } else if (z) {
                    m140030f(view, i2);
                }
            } else if (z) {
                m140029e(view, i2);
            }
        } else if (z) {
            m140023b(view, i2);
        }
    }
}
