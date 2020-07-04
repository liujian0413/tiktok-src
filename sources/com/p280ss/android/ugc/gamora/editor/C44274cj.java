package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39852k;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39852k.C39856a;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39852k.C39857b;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.cj */
public final class C44274cj extends C12629j implements C44396a {

    /* renamed from: n */
    public static final C44275a f114433n = new C44275a(null);

    /* renamed from: i */
    public EditViewModel f114434i;

    /* renamed from: j */
    public VEVideoPublishEditViewModel f114435j;

    /* renamed from: k */
    public VideoPublishEditModel f114436k;

    /* renamed from: l */
    public EditStickerViewModel f114437l;

    /* renamed from: m */
    public C39852k f114438m;

    /* renamed from: o */
    private EditVolumeViewModel f114439o;

    /* renamed from: p */
    private ViewGroup f114440p;

    /* renamed from: com.ss.android.ugc.gamora.editor.cj$a */
    public static final class C44275a {
        private C44275a() {
        }

        public /* synthetic */ C44275a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cj$b */
    static final class C44276b extends Lambda implements C7563m<C44396a, String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44274cj f114441a;

        C44276b(C44274cj cjVar) {
            this.f114441a = cjVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140095a((C44396a) obj, (String) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140095a(C44396a aVar, String str) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(str, "it");
            TextView textView = C44274cj.m140075c(this.f114441a).f103565c;
            C7573i.m23582a((Object) textView, "volumeHelper.mMusicTv");
            textView.setText(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cj$c */
    static final class C44277c extends Lambda implements C7563m<C44396a, String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44274cj f114442a;

        C44277c(C44274cj cjVar) {
            this.f114442a = cjVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140096a((C44396a) obj, (String) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140096a(C44396a aVar, String str) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(str, "it");
            TextView textView = C44274cj.m140075c(this.f114442a).f103564b;
            C7573i.m23582a((Object) textView, "volumeHelper.mPeopleVoiceTv");
            textView.setText(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cj$d */
    static final class C44278d extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44274cj f114443a;

        C44278d(C44274cj cjVar) {
            this.f114443a = cjVar;
            super(2);
        }

        /* renamed from: a */
        private void m140097a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            C44274cj.m140075c(this.f114443a).mo99270a(i);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140097a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cj$e */
    static final class C44279e implements C39856a {

        /* renamed from: a */
        final /* synthetic */ C44274cj f114444a;

        C44279e(C44274cj cjVar) {
            this.f114444a = cjVar;
        }

        /* renamed from: a */
        public final void mo99288a(float f, float f2) {
            if ((C44274cj.m140073a(this.f114444a).isFastImport || C44274cj.m140073a(this.f114444a).getWavFile() != null) && !C44274cj.m140073a(this.f114444a).isMuted) {
                C44274cj.m140074b(this.f114444a).mo119521m().setValue(VEVolumeChangeOp.ofVoice(f));
                if (C44274cj.m140073a(this.f114444a).mMusicPath != null) {
                    C44274cj.m140074b(this.f114444a).mo119521m().setValue(VEVolumeChangeOp.ofMusic(f2));
                }
                return;
            }
            C44274cj.m140074b(this.f114444a).mo119521m().setValue(VEVolumeChangeOp.ofMusic(f2));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cj$f */
    static final class C44280f implements C39857b {

        /* renamed from: a */
        final /* synthetic */ C44274cj f114445a;

        C44280f(C44274cj cjVar) {
            this.f114445a = cjVar;
        }

        /* renamed from: a */
        public final void mo99289a() {
            C44274cj.m140073a(this.f114445a).voiceVolume = ((float) C44274cj.m140075c(this.f114445a).f103567e) / 100.0f;
            C44274cj.m140073a(this.f114445a).musicVolume = ((float) C44274cj.m140075c(this.f114445a).f103566d) / 100.0f;
            C44274cj.m140075c(this.f114445a).mo99280d(false);
            C44274cj.m140076d(this.f114445a).mo106443a(true, false);
            C44274cj.m140077e(this.f114445a).mo106364h().setValue(Boolean.valueOf(true));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: I */
    private final void m140071I() {
        EditVolumeViewModel editVolumeViewModel = this.f114439o;
        if (editVolumeViewModel == null) {
            C7573i.m23583a("mVolumeViewModel");
        }
        mo91868b(editVolumeViewModel, C44281ck.f114446a, new C11672v(), new C44276b(this));
        EditVolumeViewModel editVolumeViewModel2 = this.f114439o;
        if (editVolumeViewModel2 == null) {
            C7573i.m23583a("mVolumeViewModel");
        }
        mo91868b(editVolumeViewModel2, C44282cl.f114447a, new C11672v(), new C44277c(this));
        EditVolumeViewModel editVolumeViewModel3 = this.f114439o;
        if (editVolumeViewModel3 == null) {
            C7573i.m23583a("mVolumeViewModel");
        }
        mo91868b(editVolumeViewModel3, C44283cm.f114448a, new C11672v(), new C44278d(this));
    }

    /* renamed from: H */
    private final void m140070H() {
        C23258e eVar;
        this.f114438m = new C39852k();
        if (this.f33526d_ instanceof C23258e) {
            Activity activity = this.f33526d_;
            if (activity != null) {
                eVar = (C23258e) activity;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ListenableActivityRegistry");
            }
        } else {
            eVar = null;
        }
        C39852k kVar = this.f114438m;
        if (kVar == null) {
            C7573i.m23583a("volumeHelper");
        }
        Activity activity2 = this.f33526d_;
        if (activity2 != null) {
            kVar.mo99272a((FragmentActivity) activity2, eVar);
            C39852k kVar2 = this.f114438m;
            if (kVar2 == null) {
                C7573i.m23583a("volumeHelper");
            }
            ViewGroup viewGroup = this.f114440p;
            if (viewGroup == null) {
                C7573i.m23583a("volumeLayout");
            }
            kVar2.f103563a = viewGroup;
            C39852k kVar3 = this.f114438m;
            if (kVar3 == null) {
                C7573i.m23583a("volumeHelper");
            }
            VideoPublishEditModel videoPublishEditModel = this.f114436k;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("mModel");
            }
            kVar3.mo99273a(videoPublishEditModel.isMuted);
            C39852k kVar4 = this.f114438m;
            if (kVar4 == null) {
                C7573i.m23583a("volumeHelper");
            }
            kVar4.mo99271a();
            C39852k kVar5 = this.f114438m;
            if (kVar5 == null) {
                C7573i.m23583a("volumeHelper");
            }
            kVar5.f103569g = new C44279e(this);
            C39852k kVar6 = this.f114438m;
            if (kVar6 == null) {
                C7573i.m23583a("volumeHelper");
            }
            kVar6.f103570h = new C44280f(this);
            m140071I();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r0.getWavFile() != null) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b4  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30920G() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114436k
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            boolean r0 = r0.isFastImport
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001e
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114436k
            if (r0 != 0) goto L_0x0018
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0018:
            java.lang.String r0 = r0.getWavFile()
            if (r0 == 0) goto L_0x002b
        L_0x001e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114436k
            if (r0 != 0) goto L_0x0027
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0027:
            boolean r0 = r0.isMuted
            if (r0 == 0) goto L_0x003c
        L_0x002b:
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r6.f114438m
            if (r0 != 0) goto L_0x0034
            java.lang.String r3 = "volumeHelper"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0034:
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r0.mo99279c(r2)
            r0.mo99276b(r1)
            goto L_0x005c
        L_0x003c:
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r6.f114438m
            if (r0 != 0) goto L_0x0045
            java.lang.String r3 = "volumeHelper"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0045:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r6.f114436k
            if (r3 != 0) goto L_0x004e
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x004e:
            java.lang.String r3 = r3.mMusicPath
            if (r3 == 0) goto L_0x0054
            r3 = 1
            goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r0.mo99279c(r3)
            r0.mo99276b(r2)
        L_0x005c:
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r6.f114438m
            if (r0 != 0) goto L_0x0065
            java.lang.String r3 = "volumeHelper"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0065:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r6.f114436k
            if (r3 != 0) goto L_0x006e
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x006e:
            float r3 = r3.musicVolume
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            r0.mo99270a(r3)
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r6.f114438m
            if (r0 != 0) goto L_0x0081
            java.lang.String r3 = "volumeHelper"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0081:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r6.f114436k
            if (r3 != 0) goto L_0x008a
            java.lang.String r5 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x008a:
            float r3 = r3.voiceVolume
            float r3 = r3 * r4
            int r3 = (int) r3
            r0.mo99275b(r3)
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r6.f114438m
            if (r0 != 0) goto L_0x009b
            java.lang.String r3 = "volumeHelper"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x009b:
            r0.mo99280d(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114436k
            if (r0 != 0) goto L_0x00a7
            java.lang.String r2 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00a7:
            java.lang.String r2 = "volumn_edit"
            com.ss.android.ugc.aweme.common.MobClick r0 = com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av.m126132a(r0, r2)
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r0)
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114434i
            if (r0 != 0) goto L_0x00b9
            java.lang.String r2 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00b9:
            r0.mo106443a(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44274cj.mo30920G():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoPublishEditModel m140073a(C44274cj cjVar) {
        VideoPublishEditModel videoPublishEditModel = cjVar.f114436k;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoPublishEditViewModel m140074b(C44274cj cjVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = cjVar.f114435j;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ C39852k m140075c(C44274cj cjVar) {
        C39852k kVar = cjVar.f114438m;
        if (kVar == null) {
            C7573i.m23583a("volumeHelper");
        }
        return kVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ EditViewModel m140076d(C44274cj cjVar) {
        EditViewModel editViewModel = cjVar.f114434i;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ EditStickerViewModel m140077e(C44274cj cjVar) {
        EditStickerViewModel editStickerViewModel = cjVar.f114437l;
        if (editStickerViewModel == null) {
            C7573i.m23583a("stickerViewModel");
        }
        return editStickerViewModel;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        int i;
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            JediViewModel a = C36113b.m116288a(fragmentActivity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f114434i = (EditViewModel) a;
            C0063u a2 = C0069x.m159a(fragmentActivity).mo147a(VEVideoPublishEditViewModel.class);
            C7573i.m23582a((Object) a2, "ViewModelProviders.of(fr…ditViewModel::class.java)");
            this.f114435j = (VEVideoPublishEditViewModel) a2;
            JediViewModel a3 = C36113b.m116288a(fragmentActivity).mo91871a(EditVolumeViewModel.class);
            C7573i.m23582a((Object) a3, "JediViewModelProviders.o…umeViewModel::class.java)");
            this.f114439o = (EditVolumeViewModel) a3;
            EditViewModel editViewModel = this.f114434i;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            this.f114436k = editViewModel.mo29069f();
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditStickerViewModel.class);
                C7573i.m23582a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java)");
                this.f114437l = (EditStickerViewModel) a4;
                m140070H();
                EditVolumeViewModel editVolumeViewModel = this.f114439o;
                if (editVolumeViewModel == null) {
                    C7573i.m23583a("mVolumeViewModel");
                }
                String a5 = mo30999a((int) R.string.c9);
                C7573i.m23582a((Object) a5, "getString(R.string.accompany)");
                editVolumeViewModel.mo106476a(a5);
                EditVolumeViewModel editVolumeViewModel2 = this.f114439o;
                if (editVolumeViewModel2 == null) {
                    C7573i.m23583a("mVolumeViewModel");
                }
                EditViewModel editViewModel2 = this.f114434i;
                if (editViewModel2 == null) {
                    C7573i.m23583a("editViewModel");
                }
                if (editViewModel2.mo106462x()) {
                    i = R.string.dbk;
                } else {
                    i = R.string.c7r;
                }
                String a6 = mo30999a(i);
                C7573i.m23582a((Object) a6, "if (editViewModel.isReac…tring(R.string.man_voice)");
                editVolumeViewModel2.mo106477b(a6);
                mo30920G();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aiy, viewGroup, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            View findViewById = frameLayout.findViewById(R.id.bqs);
            C7573i.m23582a((Object) findViewById, "parentLayout.findViewById(R.id.ll_change_volume)");
            this.f114440p = (ViewGroup) findViewById;
            return frameLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
