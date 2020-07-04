package com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect;

import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40369ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.AddPersonalEffectHolder */
public final class AddPersonalEffectHolder extends C1293v {

    /* renamed from: a */
    public final AppCompatActivity f106356a;

    /* renamed from: b */
    public final C40369ab f106357b;

    /* renamed from: c */
    private final ImageView f106358c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.AddPersonalEffectHolder$a */
    static final class C40896a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddPersonalEffectHolder f106359a;

        C40896a(AddPersonalEffectHolder addPersonalEffectHolder) {
            this.f106359a = addPersonalEffectHolder;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x00cc, code lost:
            if (r0 == null) goto L_0x00ce;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r7) {
            /*
                r6 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r7)
                com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.AddPersonalEffectHolder r7 = r6.f106359a
                com.ss.android.ugc.aweme.shortvideo.sticker.ab r7 = r7.f106357b
                if (r7 == 0) goto L_0x000c
                r7.mo100344a()
            L_0x000c:
                com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.AddPersonalEffectHolder r7 = r6.f106359a
                android.support.v7.app.AppCompatActivity r7 = r7.f106356a
                android.support.v4.app.FragmentActivity r7 = (android.support.p022v4.app.FragmentActivity) r7
                android.arch.lifecycle.w r7 = android.arch.lifecycle.C0069x.m159a(r7)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel> r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel.class
                android.arch.lifecycle.u r7 = r7.mo147a(r0)
                java.lang.String r0 = "ViewModelProviders.of(ac…kerViewModel::class.java)"
                kotlin.jvm.internal.C7573i.m23582a(r7, r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel r7 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel) r7
                com.ss.android.ugc.aweme.shortvideo.sticker.s r7 = r7.mo101285a()
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7 = r7.mo101195d()
                com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.AddPersonalEffectHolder r0 = r6.f106359a
                android.support.v7.app.AppCompatActivity r0 = r0.f106356a
                android.support.v4.app.FragmentActivity r0 = (android.support.p022v4.app.FragmentActivity) r0
                android.arch.lifecycle.w r0 = android.arch.lifecycle.C0069x.m159a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel> r1 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel.class
                android.arch.lifecycle.u r0 = r0.mo147a(r1)
                java.lang.String r1 = "ViewModelProviders.of(ac…kerViewModel::class.java)"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel) r0
                android.arch.lifecycle.o r0 = r0.mo101274a()
                com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.AddPersonalEffectHolder r1 = r6.f106359a
                android.support.v7.app.AppCompatActivity r1 = r1.f106356a
                android.support.v4.app.FragmentActivity r1 = (android.support.p022v4.app.FragmentActivity) r1
                android.arch.lifecycle.w r1 = android.arch.lifecycle.C0069x.m159a(r1)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel> r2 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel.class
                android.arch.lifecycle.u r1 = r1.mo147a(r2)
                java.lang.String r2 = "ViewModelProviders.of(ac…ectViewModel::class.java)"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel r1 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel) r1
                android.arch.lifecycle.o<java.lang.String> r1 = r1.f106557b
                java.lang.String r2 = "create_moji_prop"
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
                if (r1 != 0) goto L_0x00b5
                java.lang.String r1 = ""
            L_0x00b5:
                com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r3, r1)
                java.lang.String r1 = "prop_id"
                java.lang.String r3 = "curEffect"
                kotlin.jvm.internal.C7573i.m23582a(r0, r3)
                java.lang.Object r0 = r0.getValue()
                com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r0
                if (r0 == 0) goto L_0x00ce
                java.lang.String r0 = r0.getEffectId()
                if (r0 != 0) goto L_0x00d0
            L_0x00ce:
                java.lang.String r0 = ""
            L_0x00d0:
                com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r1, r0)
                java.util.Map<java.lang.String, java.lang.String> r7 = r7.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r2, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect.AddPersonalEffectHolder.C40896a.onClick(android.view.View):void");
        }
    }

    /* renamed from: a */
    public final void mo101171a() {
        this.f106358c.setOnClickListener(new C40896a(this));
    }

    public AddPersonalEffectHolder(AppCompatActivity appCompatActivity, View view, C40369ab abVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f106356a = appCompatActivity;
        this.f106357b = abVar;
        View findViewById = view.findViewById(R.id.e2);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.add_effect)");
        this.f106358c = (ImageView) findViewById;
    }
}
