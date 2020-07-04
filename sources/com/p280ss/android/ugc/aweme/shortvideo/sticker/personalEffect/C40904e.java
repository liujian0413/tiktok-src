package com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect;

import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40368aa;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40369ab;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.e */
public final class C40904e {

    /* renamed from: a */
    public PersonalEffectAdapter f106379a;

    /* renamed from: b */
    public HashSet<String> f106380b = new HashSet<>();

    /* renamed from: c */
    public final AppCompatActivity f106381c;

    /* renamed from: d */
    private RecyclerView f106382d;

    /* renamed from: e */
    private TextView f106383e;

    /* renamed from: f */
    private View f106384f;

    /* renamed from: g */
    private View f106385g;

    /* renamed from: a */
    public final void mo101184a() {
        this.f106385g.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo101187b() {
        this.f106385g.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo101185a(int i) {
        this.f106385g.setVisibility(0);
        this.f106379a.mo101173a(i);
    }

    /* renamed from: a */
    public final void mo101186a(List<? extends StickerWrapper> list) {
        C7573i.m23587b(list, "list");
        this.f106379a.mo101175a(list);
        if (list.isEmpty()) {
            this.f106383e.setVisibility(4);
            this.f106384f.setVisibility(4);
        } else {
            this.f106383e.setVisibility(0);
            this.f106384f.setVisibility(0);
        }
        for (StickerWrapper stickerWrapper : list) {
            m130706a(stickerWrapper.f104908a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00d3, code lost:
        if (r3 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e9, code lost:
        if (r0 == null) goto L_0x00eb;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m130706a(com.p280ss.android.ugc.effectmanager.effect.model.Effect r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.HashSet<java.lang.String> r0 = r6.f106380b
            java.lang.String r1 = r7.getEffectId()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0010
            return
        L_0x0010:
            java.util.HashSet<java.lang.String> r0 = r6.f106380b
            java.lang.String r7 = r7.getEffectId()
            r0.add(r7)
            android.support.v7.app.AppCompatActivity r7 = r6.f106381c
            android.support.v4.app.FragmentActivity r7 = (android.support.p022v4.app.FragmentActivity) r7
            android.arch.lifecycle.w r7 = android.arch.lifecycle.C0069x.m159a(r7)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel> r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel.class
            android.arch.lifecycle.u r7 = r7.mo147a(r0)
            java.lang.String r0 = "ViewModelProviders.of(ac…kerViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r7, r0)
            com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel r7 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel) r7
            com.ss.android.ugc.aweme.shortvideo.sticker.s r7 = r7.mo101285a()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7 = r7.mo101195d()
            android.support.v7.app.AppCompatActivity r0 = r6.f106381c
            android.support.v4.app.FragmentActivity r0 = (android.support.p022v4.app.FragmentActivity) r0
            android.arch.lifecycle.w r0 = android.arch.lifecycle.C0069x.m159a(r0)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel> r1 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel.class
            android.arch.lifecycle.u r0 = r0.mo147a(r1)
            java.lang.String r1 = "ViewModelProviders.of(ac…kerViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel) r0
            android.arch.lifecycle.o r0 = r0.mo101274a()
            android.support.v7.app.AppCompatActivity r1 = r6.f106381c
            android.support.v4.app.FragmentActivity r1 = (android.support.p022v4.app.FragmentActivity) r1
            android.arch.lifecycle.w r1 = android.arch.lifecycle.C0069x.m159a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel> r2 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel.class
            android.arch.lifecycle.u r1 = r1.mo147a(r2)
            java.lang.String r2 = "ViewModelProviders.of(ac…ectViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel r1 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel) r1
            android.arch.lifecycle.o<java.lang.String> r1 = r1.f106557b
            java.lang.String r2 = "prop_show"
            com.ss.android.ugc.aweme.app.g.d r3 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r4 = "enter_method"
            java.lang.String r5 = "click_banner"
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = "video_shoot_page"
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "draft_id"
            java.lang.String r5 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23582a(r7, r5)
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r5 = r7.mo96148i()
            int r5 = r5.getDraftId()
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59970a(r4, r5)
            java.lang.String r4 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r5 = r7.mo96148i()
            java.lang.String r5 = r5.getCreationId()
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r7 = r7.mo96148i()
            java.lang.String r7 = r7.getShootWay()
            com.ss.android.ugc.aweme.app.g.d r7 = r3.mo59973a(r4, r7)
            java.lang.String r3 = "tab_name"
            java.lang.String r4 = "curTab"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x00bc
            java.lang.String r1 = ""
        L_0x00bc:
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r3, r1)
            java.lang.String r1 = "parent_prop_id"
            java.lang.String r3 = "curEffect"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            java.lang.Object r3 = r0.getValue()
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r3
            if (r3 == 0) goto L_0x00d5
            java.lang.String r3 = r3.getEffectId()
            if (r3 != 0) goto L_0x00d7
        L_0x00d5:
            java.lang.String r3 = ""
        L_0x00d7:
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r1, r3)
            java.lang.String r1 = "prop_index"
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r0
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = r0.getGradeKey()
            if (r0 != 0) goto L_0x00ed
        L_0x00eb:
            java.lang.String r0 = ""
        L_0x00ed:
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r1, r0)
            java.lang.String r0 = "prop_id"
            java.lang.String r1 = ""
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect.C40904e.m130706a(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
    }

    public C40904e(AppCompatActivity appCompatActivity, View view, final C40369ab abVar, C40368aa aaVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(view, "rootView");
        this.f106381c = appCompatActivity;
        View findViewById = view.findViewById(R.id.dcj);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.…tub_personal_effect_list)");
        this.f106385g = findViewById;
        View findViewById2 = this.f106385g.findViewById(R.id.caj);
        C7573i.m23582a((Object) findViewById2, "curView.findViewById(R.id.personal_effect)");
        this.f106382d = (RecyclerView) findViewById2;
        View findViewById3 = this.f106385g.findViewById(R.id.uu);
        C7573i.m23582a((Object) findViewById3, "curView.findViewById(R.id.change_effect)");
        this.f106383e = (TextView) findViewById3;
        View findViewById4 = this.f106385g.findViewById(R.id.uv);
        C7573i.m23582a((Object) findViewById4, "curView.findViewById(R.i…change_effect_split_view)");
        this.f106384f = findViewById4;
        this.f106379a = new PersonalEffectAdapter(this.f106381c, abVar, aaVar);
        this.f106382d.setLayoutManager(new LinearLayoutManager(this.f106382d.getContext(), 0, false));
        this.f106382d.setAdapter(this.f106379a);
        this.f106383e.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C40904e f106386a;

            {
                this.f106386a = r1;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:9:0x00d0, code lost:
                if (r0 == null) goto L_0x00d2;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r7) {
                /*
                    r6 = this;
                    com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r7)
                    com.ss.android.ugc.aweme.shortvideo.sticker.ab r7 = r4
                    if (r7 == 0) goto L_0x0010
                    com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.e r0 = r6.f106386a
                    com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.PersonalEffectAdapter r0 = r0.f106379a
                    int r0 = r0.f106361b
                    r7.mo100345a(r0)
                L_0x0010:
                    com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.e r7 = r6.f106386a
                    android.support.v7.app.AppCompatActivity r7 = r7.f106381c
                    android.support.v4.app.FragmentActivity r7 = (android.support.p022v4.app.FragmentActivity) r7
                    android.arch.lifecycle.w r7 = android.arch.lifecycle.C0069x.m159a(r7)
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel> r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel.class
                    android.arch.lifecycle.u r7 = r7.mo147a(r0)
                    java.lang.String r0 = "ViewModelProviders.of(ac…kerViewModel::class.java)"
                    kotlin.jvm.internal.C7573i.m23582a(r7, r0)
                    com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel r7 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel) r7
                    com.ss.android.ugc.aweme.shortvideo.sticker.s r7 = r7.mo101285a()
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7 = r7.mo101195d()
                    com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.e r0 = r6.f106386a
                    android.support.v7.app.AppCompatActivity r0 = r0.f106381c
                    android.support.v4.app.FragmentActivity r0 = (android.support.p022v4.app.FragmentActivity) r0
                    android.arch.lifecycle.w r0 = android.arch.lifecycle.C0069x.m159a(r0)
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel> r1 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel.class
                    android.arch.lifecycle.u r0 = r0.mo147a(r1)
                    java.lang.String r1 = "ViewModelProviders.of(ac…kerViewModel::class.java)"
                    kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel) r0
                    android.arch.lifecycle.o r0 = r0.mo101274a()
                    com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.e r1 = r6.f106386a
                    android.support.v7.app.AppCompatActivity r1 = r1.f106381c
                    android.support.v4.app.FragmentActivity r1 = (android.support.p022v4.app.FragmentActivity) r1
                    android.arch.lifecycle.w r1 = android.arch.lifecycle.C0069x.m159a(r1)
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel> r2 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel.class
                    android.arch.lifecycle.u r1 = r1.mo147a(r2)
                    java.lang.String r2 = "ViewModelProviders.of(ac…ectViewModel::class.java)"
                    kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                    com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel r1 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel) r1
                    android.arch.lifecycle.o<java.lang.String> r1 = r1.f106557b
                    java.lang.String r2 = "modify_moji_prop"
                    com.ss.android.ugc.aweme.app.g.d r3 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                    java.lang.String r4 = "enter_method"
                    java.lang.String r5 = "click_banner"
                    com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
                    java.lang.String r4 = "enter_from"
                    java.lang.String r5 = "video_shoot_page"
                    com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
                    java.lang.String r4 = "draft_id"
                    java.lang.String r5 = "shortVideoContext"
                    kotlin.jvm.internal.C7573i.m23582a(r7, r5)
                    com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r5 = r7.mo96148i()
                    int r5 = r5.getDraftId()
                    com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59970a(r4, r5)
                    java.lang.String r4 = "creation_id"
                    com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r5 = r7.mo96148i()
                    java.lang.String r5 = r5.getCreationId()
                    com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
                    java.lang.String r4 = "shoot_way"
                    com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r7 = r7.mo96148i()
                    java.lang.String r7 = r7.getShootWay()
                    com.ss.android.ugc.aweme.app.g.d r7 = r3.mo59973a(r4, r7)
                    java.lang.String r3 = "tab_name"
                    java.lang.String r4 = "curTab"
                    kotlin.jvm.internal.C7573i.m23582a(r1, r4)
                    java.lang.Object r1 = r1.getValue()
                    java.lang.String r1 = (java.lang.String) r1
                    if (r1 != 0) goto L_0x00b9
                    java.lang.String r1 = ""
                L_0x00b9:
                    com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r3, r1)
                    java.lang.String r1 = "prop_id"
                    java.lang.String r3 = "curEffect"
                    kotlin.jvm.internal.C7573i.m23582a(r0, r3)
                    java.lang.Object r0 = r0.getValue()
                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r0
                    if (r0 == 0) goto L_0x00d2
                    java.lang.String r0 = r0.getEffectId()
                    if (r0 != 0) goto L_0x00d4
                L_0x00d2:
                    java.lang.String r0 = ""
                L_0x00d4:
                    com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r1, r0)
                    java.util.Map<java.lang.String, java.lang.String> r7 = r7.f60753a
                    com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r2, r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect.C40904e.C409051.onClick(android.view.View):void");
            }
        });
    }
}
