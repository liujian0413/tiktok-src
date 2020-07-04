package com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect;

import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40368aa;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40369ab;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40906q;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.PersonalEffectAdapter */
public final class PersonalEffectAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public List<? extends StickerWrapper> f106360a = new ArrayList();

    /* renamed from: b */
    public int f106361b;

    /* renamed from: c */
    private final int f106362c = 3;

    /* renamed from: d */
    private final int f106363d;

    /* renamed from: e */
    private final int f106364e = 1;

    /* renamed from: f */
    private final C40897a f106365f = new C40897a(this);

    /* renamed from: g */
    private final AppCompatActivity f106366g;

    /* renamed from: h */
    private final C40369ab f106367h;

    /* renamed from: i */
    private final C40368aa f106368i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.PersonalEffectAdapter$a */
    public static final class C40897a implements C40902c {

        /* renamed from: a */
        final /* synthetic */ PersonalEffectAdapter f106369a;

        C40897a(PersonalEffectAdapter personalEffectAdapter) {
            this.f106369a = personalEffectAdapter;
        }

        /* renamed from: a */
        public final void mo101176a(int i) {
            if (this.f106369a.f106361b != i) {
                StickerWrapper stickerWrapper = (StickerWrapper) this.f106369a.f106360a.get(i);
                if (stickerWrapper.f104910c != 2) {
                    C6600e S = C35574k.m114859a().mo70085S();
                    Effect effect = stickerWrapper.f104908a;
                    C7573i.m23582a((Object) effect, "stickerWrapper.effect");
                    ResourceListModel resourceListModel = (ResourceListModel) S.mo15974a(effect.getResourceId(), ResourceListModel.class);
                    if (stickerWrapper.f104910c != 3 || resourceListModel == null) {
                        this.f106369a.mo101173a(i);
                    } else {
                        this.f106369a.mo101174a(i, resourceListModel);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.PersonalEffectAdapter$b */
    public static final class C40898b implements C40906q {

        /* renamed from: a */
        final /* synthetic */ PersonalEffectAdapter f106370a;

        /* renamed from: b */
        final /* synthetic */ int f106371b;

        /* renamed from: a */
        public final void mo101177a(Exception exc) {
            ((StickerWrapper) this.f106370a.f106360a.get(this.f106371b)).f104910c = 3;
            this.f106370a.notifyItemChanged(this.f106371b);
        }

        C40898b(PersonalEffectAdapter personalEffectAdapter, int i) {
            this.f106370a = personalEffectAdapter;
            this.f106371b = i;
        }

        /* renamed from: a */
        public final void mo101178a(String str, StickerWrapper stickerWrapper, boolean z) {
            Effect effect;
            C7573i.m23587b(str, "id");
            ((StickerWrapper) this.f106370a.f106360a.get(this.f106371b)).f104910c = 1;
            StickerWrapper stickerWrapper2 = (StickerWrapper) this.f106370a.f106360a.get(this.f106371b);
            if (stickerWrapper != null) {
                effect = stickerWrapper.f104908a;
            } else {
                effect = null;
            }
            stickerWrapper2.f104908a = effect;
            if (z) {
                this.f106370a.mo101173a(this.f106371b);
            }
        }
    }

    public final int getItemCount() {
        if (this.f106360a.size() >= this.f106362c) {
            return this.f106362c;
        }
        return this.f106360a.size() + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d6, code lost:
        if (r1 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00b8, code lost:
        if (r4 == null) goto L_0x00ba;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m130679a() {
        /*
            r7 = this;
            android.support.v7.app.AppCompatActivity r0 = r7.f106366g
            android.support.v4.app.FragmentActivity r0 = (android.support.p022v4.app.FragmentActivity) r0
            android.arch.lifecycle.w r0 = android.arch.lifecycle.C0069x.m159a(r0)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel> r1 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel.class
            android.arch.lifecycle.u r0 = r0.mo147a(r1)
            java.lang.String r1 = "ViewModelProviders.of(ac…kerViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel) r0
            com.ss.android.ugc.aweme.shortvideo.sticker.s r0 = r0.mo101285a()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.mo101195d()
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            android.support.v7.app.AppCompatActivity r1 = r7.f106366g
            android.support.v4.app.FragmentActivity r1 = (android.support.p022v4.app.FragmentActivity) r1
            android.arch.lifecycle.w r1 = android.arch.lifecycle.C0069x.m159a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel> r2 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel.class
            android.arch.lifecycle.u r1 = r1.mo147a(r2)
            java.lang.String r2 = "ViewModelProviders.of(ac…kerViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel r1 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel) r1
            android.arch.lifecycle.o r1 = r1.mo101274a()
            android.support.v7.app.AppCompatActivity r2 = r7.f106366g
            android.support.v4.app.FragmentActivity r2 = (android.support.p022v4.app.FragmentActivity) r2
            android.arch.lifecycle.w r2 = android.arch.lifecycle.C0069x.m159a(r2)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel> r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel.class
            android.arch.lifecycle.u r2 = r2.mo147a(r3)
            java.lang.String r3 = "ViewModelProviders.of(ac…ectViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel r2 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel) r2
            android.arch.lifecycle.o<java.lang.String> r2 = r2.f106557b
            java.lang.String r3 = "prop_click"
            com.ss.android.ugc.aweme.app.g.d r4 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r5 = "enter_method"
            java.lang.String r6 = "click_banner"
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
            java.lang.String r5 = "enter_from"
            java.lang.String r6 = "video_shoot_page"
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
            java.lang.String r5 = "draft_id"
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r6 = r0.mo96148i()
            int r6 = r6.getDraftId()
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59970a(r5, r6)
            java.lang.String r5 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r6 = r0.mo96148i()
            java.lang.String r6 = r6.getCreationId()
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
            java.lang.String r5 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r0 = r0.mo96148i()
            java.lang.String r0 = r0.getShootWay()
            com.ss.android.ugc.aweme.app.g.d r0 = r4.mo59973a(r5, r0)
            java.lang.String r4 = "tab_name"
            java.lang.String r5 = "curTab"
            kotlin.jvm.internal.C7573i.m23582a(r2, r5)
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x00a1
            java.lang.String r2 = ""
        L_0x00a1:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r4, r2)
            java.lang.String r2 = "parent_prop_id"
            java.lang.String r4 = "curEffect"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            java.lang.Object r4 = r1.getValue()
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r4
            if (r4 == 0) goto L_0x00ba
            java.lang.String r4 = r4.getEffectId()
            if (r4 != 0) goto L_0x00bc
        L_0x00ba:
            java.lang.String r4 = ""
        L_0x00bc:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r4)
            java.lang.String r2 = "prop_id"
            java.lang.String r4 = ""
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r4)
            java.lang.String r2 = "prop_index"
            java.lang.Object r1 = r1.getValue()
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r1
            if (r1 == 0) goto L_0x00d8
            java.lang.String r1 = r1.getGradeKey()
            if (r1 != 0) goto L_0x00da
        L_0x00d8:
            java.lang.String r1 = ""
        L_0x00da:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect.PersonalEffectAdapter.m130679a():void");
    }

    /* renamed from: a */
    public final void mo101175a(List<? extends StickerWrapper> list) {
        C7573i.m23587b(list, "list");
        this.f106360a = list;
        notifyDataSetChanged();
    }

    public final int getItemViewType(int i) {
        if (this.f106360a.size() >= this.f106362c || i != this.f106360a.size()) {
            return this.f106363d;
        }
        return this.f106364e;
    }

    /* renamed from: a */
    public final void mo101173a(int i) {
        if (i >= 0) {
            notifyItemChanged(this.f106361b);
            this.f106361b = i;
            notifyItemChanged(this.f106361b);
            C40368aa aaVar = this.f106368i;
            if (aaVar != null) {
                aaVar.mo100346a((StickerWrapper) this.f106360a.get(this.f106361b));
            }
            m130679a();
        }
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        boolean z;
        C7573i.m23587b(vVar, "holder");
        if (getItemViewType(i) == this.f106363d) {
            PersonalEffectViewHolder personalEffectViewHolder = (PersonalEffectViewHolder) vVar;
            StickerWrapper stickerWrapper = (StickerWrapper) this.f106360a.get(i);
            if (i == this.f106361b) {
                z = true;
            } else {
                z = false;
            }
            personalEffectViewHolder.mo101179a(i, stickerWrapper, z);
            return;
        }
        ((AddPersonalEffectHolder) vVar).mo101171a();
    }

    /* renamed from: a */
    public final void mo101174a(int i, ResourceListModel resourceListModel) {
        ((StickerWrapper) this.f106360a.get(i)).f104910c = 2;
        notifyItemChanged(i);
        C40368aa aaVar = this.f106368i;
        if (aaVar != null) {
            aaVar.mo100347a((StickerWrapper) this.f106360a.get(i), resourceListModel, i, new C40898b(this, i));
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == this.f106363d) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.z_, viewGroup, false);
            AppCompatActivity appCompatActivity = this.f106366g;
            C7573i.m23582a((Object) inflate, "view");
            return new PersonalEffectViewHolder(appCompatActivity, inflate, this.f106365f);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gi, viewGroup, false);
        AppCompatActivity appCompatActivity2 = this.f106366g;
        C7573i.m23582a((Object) inflate2, "view");
        return new AddPersonalEffectHolder(appCompatActivity2, inflate2, this.f106367h);
    }

    public PersonalEffectAdapter(AppCompatActivity appCompatActivity, C40369ab abVar, C40368aa aaVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        this.f106366g = appCompatActivity;
        this.f106367h = abVar;
        this.f106368i = aaVar;
    }
}
