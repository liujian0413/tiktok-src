package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.LiveData;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import com.bytedance.scene.group.C12604b;
import com.p280ss.android.ugc.asve.p756d.C15450d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.filter.C29238ba;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38789o.C38790a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.gamora.editor.p1743b.C44148a;
import com.p280ss.android.ugc.gamora.editor.p1743b.C44148a.C44160b;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.C45255af;
import com.p280ss.android.vesdk.ROTATE_DEGREE;
import com.p280ss.android.vesdk.VEListener.C45219o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47479s;
import dmt.p1861av.video.C47515u;
import dmt.p1861av.video.C47516v;
import dmt.p1861av.video.C47517w;
import dmt.p1861av.video.C47518x;
import dmt.p1861av.video.CompileProbeViewModel;
import dmt.p1861av.video.VEEditorAutoStartStopArbiter;
import dmt.p1861av.video.VEPreviewMusicParams;
import dmt.p1861av.video.VEPreviewParams;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.as */
public final class C44066as extends C12604b implements C44396a {

    /* renamed from: p */
    public static final C44067a f113987p = new C44067a(null);

    /* renamed from: j */
    public C44148a f113988j;

    /* renamed from: k */
    public EditPreviewViewModel f113989k;

    /* renamed from: l */
    public FrameLayout f113990l;

    /* renamed from: m */
    public VideoPublishEditModel f113991m;

    /* renamed from: n */
    public CompileProbeViewModel f113992n;

    /* renamed from: o */
    public C44317cv f113993o;

    /* renamed from: q */
    private VEVideoPublishEditViewModel f113994q;

    /* renamed from: r */
    private EditViewModel f113995r;

    /* renamed from: s */
    private EditTextStickerViewModel f113996s;

    /* renamed from: t */
    private EditInfoStickerViewModel f113997t;

    /* renamed from: u */
    private EditPoiStickerViewModel f113998u;

    /* renamed from: v */
    private EditVoteStickerViewModel f113999v;

    /* renamed from: w */
    private EditStickerViewModel f114000w;

    /* renamed from: com.ss.android.ugc.gamora.editor.as$a */
    public static final class C44067a {
        private C44067a() {
        }

        public /* synthetic */ C44067a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.as$b */
    static final class C44068b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44066as f114001a;

        C44068b(C44066as asVar) {
            this.f114001a = asVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo106572a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo106572a() {
            String str;
            String str2;
            String str3;
            String str4;
            Activity activity = this.f114001a.f33526d_;
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            long longExtra = activity.getIntent().getLongExtra("extra_start_enter_edit_page", 0);
            Activity activity2 = this.f114001a.f33526d_;
            if (activity2 == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity2, "activity!!");
            long longExtra2 = activity2.getIntent().getLongExtra("extra_import_compile_cost_time", 0);
            long currentTimeMillis = System.currentTimeMillis() - longExtra;
            if (longExtra > 0) {
                C42962b bVar = C42962b.f111525a;
                String str5 = "tool_performance_edit_first_frame";
                C22984d a = C22984d.m75611a().mo59971a("first_frame_duration", currentTimeMillis).mo59972a("is_fast_import", (Object) Boolean.valueOf(C44066as.m139493d(this.f114001a).isFastImport)).mo59973a("content_type", C39500av.m126133a(C44066as.m139493d(this.f114001a))).mo59973a("content_source", C39500av.m126142b(C44066as.m139493d(this.f114001a)));
                String str6 = "is_hardcode";
                if (C36964i.m118920a()) {
                    str = "1";
                } else {
                    str = "0";
                }
                C22984d a2 = a.mo59973a(str6, str);
                String str7 = "resolution";
                if (C44066as.m139493d(this.f114001a).getOriginal() == 1) {
                    str2 = C36964i.m118932h();
                } else {
                    str2 = C36964i.m118933i();
                }
                bVar.mo104671a(str5, a2.mo59973a(str7, str2).mo59971a("compile_time", longExtra2).mo59973a("bite_rate", String.valueOf(C36964i.m118929e())).mo59970a("video_quality", C36964i.m118931g()).f60753a);
                C42962b bVar2 = C42962b.f111525a;
                String str8 = "first_frame_display_on_edit_page";
                C22984d a3 = C22984d.m75611a().mo59973a("content_type", C39500av.m126133a(C44066as.m139493d(this.f114001a))).mo59973a("filter_list", C44066as.m139493d(this.f114001a).mCurFilterLabels).mo59973a("filter_id_list", C44066as.m139493d(this.f114001a).mCurFilterIds).mo59973a("prop_list", C44066as.m139493d(this.f114001a).mStickerID);
                String str9 = "is_hardcode";
                if (C36964i.m118920a()) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                C22984d a4 = a3.mo59973a(str9, str3).mo59973a("bite_rate", String.valueOf(C36964i.m118929e())).mo59970a("video_quality", C36964i.m118931g());
                String str10 = "resolution";
                if (C44066as.m139493d(this.f114001a).getOriginal() == 1) {
                    str4 = C36964i.m118932h();
                } else {
                    str4 = C36964i.m118933i();
                }
                bVar2.mo104671a(str8, a4.mo59973a(str10, str4).mo59973a("content_source", C39500av.m126142b(C44066as.m139493d(this.f114001a))).mo59971a("total_time", currentTimeMillis).mo59971a("compile_time", longExtra2).mo59972a("is_fast_import", (Object) Boolean.valueOf(C44066as.m139493d(this.f114001a).isFastImport)).mo59970a("segment_count", C44066as.m139493d(this.f114001a).segmentCounts()).f60753a);
                if (TextUtils.equals(C39500av.m126142b(C44066as.m139493d(this.f114001a)), "upload")) {
                    C6893q.m21447a("aweme_publish_edit_page_render_time", C6869c.m21381a().mo16886a("totaltime", Long.valueOf(currentTimeMillis)).mo16886a("process_time", Long.valueOf(longExtra2)).mo16882a("is_fast_import", Boolean.valueOf(C44066as.m139493d(this.f114001a).isFastImport)).mo16885a("segment_count", Integer.valueOf(C44066as.m139493d(this.f114001a).segmentCounts())).mo16888b());
                }
                StringBuilder sb = new StringBuilder("firstFrameRender in VEVideoPublishEditActivity,compile usage:");
                sb.append(longExtra2);
                sb.append(",total usage:");
                sb.append(currentTimeMillis);
                sb.append(", lazyInit:");
                sb.append(C15450d.m45250b());
                C41530am.m132280a(sb.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.as$c */
    static final class C44069c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44066as f114002a;

        C44069c(C44066as asVar) {
            this.f114002a = asVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo106573a();
            return C7581n.f20898a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo106573a() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.as r0 = r2.f114002a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = com.p280ss.android.ugc.gamora.editor.C44066as.m139493d(r0)
                com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r0 = r0.compileProbeResult
                if (r0 == 0) goto L_0x0024
                com.ss.android.ugc.gamora.editor.as r0 = r2.f114002a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = com.p280ss.android.ugc.gamora.editor.C44066as.m139493d(r0)
                com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r0 = r0.compileProbeResult
                if (r0 == 0) goto L_0x001f
                com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus r0 = r0.getStatus()
                if (r0 == 0) goto L_0x001f
                com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$State r0 = r0.getState()
                goto L_0x0020
            L_0x001f:
                r0 = 0
            L_0x0020:
                com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$State r1 = com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.State.CANCEL
                if (r0 != r1) goto L_0x0037
            L_0x0024:
                com.ss.android.ugc.gamora.editor.as r0 = r2.f114002a
                dmt.av.video.CompileProbeViewModel r0 = com.p280ss.android.ugc.gamora.editor.C44066as.m139494e(r0)
                com.ss.android.ugc.gamora.editor.a r0 = r0.mo119463a()
                com.ss.android.ugc.gamora.editor.as r1 = r2.f114002a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = com.p280ss.android.ugc.gamora.editor.C44066as.m139493d(r1)
                r0.mo106490a(r1)
            L_0x0037:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44066as.C44069c.mo106573a():void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.as$d */
    static final class C44070d implements C45219o {

        /* renamed from: a */
        final /* synthetic */ C44066as f114003a;

        /* renamed from: b */
        final /* synthetic */ C44068b f114004b;

        /* renamed from: c */
        final /* synthetic */ C44069c f114005c;

        C44070d(C44066as asVar, C44068b bVar, C44069c cVar) {
            this.f114003a = asVar;
            this.f114004b = bVar;
            this.f114005c = cVar;
        }

        /* renamed from: a */
        public final void mo38884a() {
            this.f114004b.mo106572a();
            this.f114005c.mo106573a();
            C44066as.m139491b(this.f114003a).mo106322g().postValue(null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.as$e */
    public static final class C44071e implements C29238ba {

        /* renamed from: a */
        final /* synthetic */ C44066as f114006a;

        C44071e(C44066as asVar) {
            this.f114006a = asVar;
        }

        /* renamed from: a */
        public final float mo74856a(String str) {
            C7573i.m23587b(str, "filterPath");
            return C44066as.m139492c(this.f114006a).mo106631a().mo119530a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.as$f */
    public static final class C44072f implements C44160b {

        /* renamed from: a */
        final /* synthetic */ C44066as f114007a;

        C44072f(C44066as asVar) {
            this.f114007a = asVar;
        }

        /* renamed from: a */
        public final void mo106574a(C47517w wVar) {
            boolean z;
            if (wVar != null) {
                C44066as asVar = this.f114007a;
                if (wVar.f121981a == 0) {
                    z = true;
                } else {
                    z = false;
                }
                asVar.mo106570a(z, false);
            }
        }

        /* renamed from: a */
        public final void mo106575a(C47518x xVar) {
            boolean z;
            if (xVar != null) {
                C44066as asVar = this.f114007a;
                if (xVar.f121991h == 0) {
                    z = true;
                } else {
                    z = false;
                }
                asVar.mo106570a(z, xVar.f121990g);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.as$g */
    static final class C44073g extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44066as f114008a;

        C44073g(C44066as asVar) {
            this.f114008a = asVar;
            super(2);
        }

        /* renamed from: a */
        private void m139526a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            C44066as.m139489a(this.f114008a).setBackgroundColor(i);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139526a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.as$h */
    static final class C44074h<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C44066as f114009a;

        C44074h(C44066as asVar) {
            this.f114009a = asVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C44066as.m139491b(this.f114009a).mo29069f();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.as$i */
    static final class C44075i<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C44066as f114010a;

        C44075i(C44066as asVar) {
            this.f114010a = asVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C44066as.m139491b(this.f114010a).mo106325j().setValue(null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.as$j */
    static final class C44076j<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44066as f114011a;

        C44076j(C44066as asVar) {
            this.f114011a = asVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            int i;
            if (bool != null) {
                ImageView imageView = C44066as.m139492c(this.f114011a).f114163n;
                C7573i.m23582a((Object) imageView, "publishEditScene.firstFrameView");
                C7573i.m23582a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.as$k */
    static final class C44077k<T> implements C0053p<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ C44066as f114012a;

        C44077k(C44066as asVar) {
            this.f114012a = asVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Bitmap bitmap) {
            if (bitmap != null) {
                C44066as.m139492c(this.f114012a).f114163n.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.as$l */
    static final class C44078l extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44066as f114013a;

        C44078l(C44066as asVar) {
            this.f114013a = asVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139531a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139531a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            VEEditorAutoStartStopArbiter M = this.f114013a.mo106568M();
            if (M != null) {
                M.mo119465a(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.as$m */
    static final class C44079m<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44066as f114014a;

        C44079m(C44066as asVar) {
            this.f114014a = asVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            C44066as.m139491b(this.f114014a).mo106326k().setValue(bool);
        }
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo106569a(C44317cv cvVar) {
        C7573i.m23587b(cvVar, "<set-?>");
        this.f113993o = cvVar;
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        View h_ = mo31004h_(R.id.ace);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.edit_preview_container)");
        this.f113990l = (FrameLayout) h_;
        EditPreviewViewModel editPreviewViewModel = this.f113989k;
        if (editPreviewViewModel == null) {
            C7573i.m23583a("previewViewModel");
        }
        mo91868b(editPreviewViewModel, C44080at.f114015a, new C11672v(), new C44073g(this));
        m139485N();
        m139487P();
    }

    /* renamed from: a */
    public final void mo106570a(boolean z, boolean z2) {
        if (z2) {
            EditStickerViewModel editStickerViewModel = this.f114000w;
            if (editStickerViewModel == null) {
                C7573i.m23583a("stickerViewModel");
            }
            editStickerViewModel.mo106363g().setValue(Boolean.valueOf(z));
        } else {
            EditStickerViewModel editStickerViewModel2 = this.f114000w;
            if (editStickerViewModel2 == null) {
                C7573i.m23583a("stickerViewModel");
            }
            editStickerViewModel2.mo29069f().setValue(Boolean.valueOf(z));
        }
        if (z) {
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f113994q;
            if (vEVideoPublishEditViewModel == null) {
                C7573i.m23583a("publishEditViewModel");
            }
            C0052o r = vEVideoPublishEditViewModel.mo119526r();
            C7573i.m23582a((Object) r, "publishEditViewModel.inTimeEditView");
            r.setValue(Boolean.valueOf(false));
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f113994q;
            if (vEVideoPublishEditViewModel2 == null) {
                C7573i.m23583a("publishEditViewModel");
            }
            C0052o s = vEVideoPublishEditViewModel2.mo119527s();
            C7573i.m23582a((Object) s, "publishEditViewModel.inPinEditView");
            s.setValue(Boolean.valueOf(false));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
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

    /* renamed from: K */
    public final int mo96987K() {
        C44148a aVar = this.f113988j;
        if (aVar == null) {
            C7573i.m23583a("publishEditScene");
        }
        SurfaceView surfaceView = aVar.f114162m;
        C7573i.m23582a((Object) surfaceView, "publishEditScene.surfaceView");
        return surfaceView.getWidth();
    }

    /* renamed from: L */
    public final int mo106567L() {
        C44148a aVar = this.f113988j;
        if (aVar == null) {
            C7573i.m23583a("publishEditScene");
        }
        SurfaceView surfaceView = aVar.f114162m;
        C7573i.m23582a((Object) surfaceView, "publishEditScene.surfaceView");
        return surfaceView.getHeight();
    }

    /* renamed from: M */
    public final VEEditorAutoStartStopArbiter mo106568M() {
        C44148a aVar = (C44148a) mo30924a("VEVideoPublishEditScene");
        if (aVar != null) {
            return aVar.mo106643b();
        }
        return null;
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: J */
    public final MarginLayoutParams mo106566J() {
        C44148a aVar = this.f113988j;
        if (aVar == null) {
            C7573i.m23583a("publishEditScene");
        }
        SurfaceView surfaceView = aVar.f114162m;
        C7573i.m23582a((Object) surfaceView, "publishEditScene.surfaceView");
        LayoutParams layoutParams = surfaceView.getLayoutParams();
        if (layoutParams != null) {
            return (MarginLayoutParams) layoutParams;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: O */
    private final void m139486O() {
        C44068b bVar = new C44068b(this);
        C44069c cVar = new C44069c(this);
        C44148a aVar = this.f113988j;
        if (aVar == null) {
            C7573i.m23583a("publishEditScene");
        }
        EditViewModel editViewModel = this.f113995r;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        aVar.mo106634a(editViewModel.mo29069f().videoEditorType, (C45219o) new C44070d(this, bVar, cVar));
        EditViewModel editViewModel2 = this.f113995r;
        if (editViewModel2 == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel2.mo106436K().setValue(new C44071e(this));
        C44148a aVar2 = this.f113988j;
        if (aVar2 == null) {
            C7573i.m23583a("publishEditScene");
        }
        EditViewModel editViewModel3 = this.f113995r;
        if (editViewModel3 == null) {
            C7573i.m23583a("editViewModel");
        }
        aVar2.mo106637a(editViewModel3.mo106448i());
        C44148a aVar3 = this.f113988j;
        if (aVar3 == null) {
            C7573i.m23583a("publishEditScene");
        }
        aVar3.f114161l = new C44072f(this);
    }

    /* renamed from: N */
    private final void m139485N() {
        C44148a aVar = (C44148a) mo30924a("VEVideoPublishEditScene");
        if (aVar != null) {
            this.f113988j = aVar;
        } else {
            C44148a a = C44148a.m139730a((VEPreviewParams) null);
            C7573i.m23582a((Object) a, "VEVideoPublishEditScene.newInstance(null)");
            this.f113988j = a;
            C44148a aVar2 = this.f113988j;
            if (aVar2 == null) {
                C7573i.m23583a("publishEditScene");
            }
            mo30925a((int) R.id.ace, (C12629j) aVar2, "VEVideoPublishEditScene");
        }
        C44148a aVar3 = this.f113988j;
        if (aVar3 == null) {
            C7573i.m23583a("publishEditScene");
        }
        C44317cv cvVar = this.f113993o;
        if (cvVar == null) {
            C7573i.m23583a("veLifecycleOwner");
        }
        aVar3.f114164o = cvVar;
        m139486O();
        C44148a aVar4 = this.f113988j;
        if (aVar4 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f113994q;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar4.mo106636a((LiveData<VEPreviewParams>) vEVideoPublishEditViewModel.mo119508a());
        C44148a aVar5 = this.f113988j;
        if (aVar5 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f113994q;
        if (vEVideoPublishEditViewModel2 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar5.mo106644b((LiveData<VEPreviewMusicParams>) vEVideoPublishEditViewModel2.mo119513e());
        C44148a aVar6 = this.f113988j;
        if (aVar6 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel3 = this.f113994q;
        if (vEVideoPublishEditViewModel3 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar6.f114158i = vEVideoPublishEditViewModel3.mo119514f();
        C44148a aVar7 = this.f113988j;
        if (aVar7 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel4 = this.f113994q;
        if (vEVideoPublishEditViewModel4 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar7.f114159j = vEVideoPublishEditViewModel4.mo119515g();
        C44148a aVar8 = this.f113988j;
        if (aVar8 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel5 = this.f113994q;
        if (vEVideoPublishEditViewModel5 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar8.mo106645b(vEVideoPublishEditViewModel5.mo119512d());
        C44148a aVar9 = this.f113988j;
        if (aVar9 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel6 = this.f113994q;
        if (vEVideoPublishEditViewModel6 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar9.mo106652d(vEVideoPublishEditViewModel6.mo119510b());
        C44148a aVar10 = this.f113988j;
        if (aVar10 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel7 = this.f113994q;
        if (vEVideoPublishEditViewModel7 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar10.mo106638a(vEVideoPublishEditViewModel7.mo119511c());
        C44148a aVar11 = this.f113988j;
        if (aVar11 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel8 = this.f113994q;
        if (vEVideoPublishEditViewModel8 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar11.mo106648c(vEVideoPublishEditViewModel8.mo119517i());
        C44148a aVar12 = this.f113988j;
        if (aVar12 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel9 = this.f113994q;
        if (vEVideoPublishEditViewModel9 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar12.mo106655e((LiveData<C47479s>) vEVideoPublishEditViewModel9.mo119518j());
        C44148a aVar13 = this.f113988j;
        if (aVar13 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel10 = this.f113994q;
        if (vEVideoPublishEditViewModel10 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar13.mo106651d((LiveData<C47516v>) vEVideoPublishEditViewModel10.mo119519k());
        C44148a aVar14 = this.f113988j;
        if (aVar14 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel11 = this.f113994q;
        if (vEVideoPublishEditViewModel11 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar14.mo106640a(vEVideoPublishEditViewModel11.f121664a);
        C44148a aVar15 = this.f113988j;
        if (aVar15 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel12 = this.f113994q;
        if (vEVideoPublishEditViewModel12 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar15.mo106646b(vEVideoPublishEditViewModel12.mo119520l());
        C44148a aVar16 = this.f113988j;
        if (aVar16 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel13 = this.f113994q;
        if (vEVideoPublishEditViewModel13 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar16.mo106656e(vEVideoPublishEditViewModel13.mo119521m());
        C44148a aVar17 = this.f113988j;
        if (aVar17 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel14 = this.f113994q;
        if (vEVideoPublishEditViewModel14 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar17.mo106658f((LiveData<C47515u>) vEVideoPublishEditViewModel14.mo119522n());
        C44148a aVar18 = this.f113988j;
        if (aVar18 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel15 = this.f113994q;
        if (vEVideoPublishEditViewModel15 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar18.mo106659f(vEVideoPublishEditViewModel15.mo119523o());
        C44148a aVar19 = this.f113988j;
        if (aVar19 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel16 = this.f113994q;
        if (vEVideoPublishEditViewModel16 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar19.mo106649c(vEVideoPublishEditViewModel16.mo119528t());
        C44148a aVar20 = this.f113988j;
        if (aVar20 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel17 = this.f113994q;
        if (vEVideoPublishEditViewModel17 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar20.mo106660g(vEVideoPublishEditViewModel17.mo119524p());
        C44148a aVar21 = this.f113988j;
        if (aVar21 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel18 = this.f113994q;
        if (vEVideoPublishEditViewModel18 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar21.mo106661h(vEVideoPublishEditViewModel18.mo119525q());
        C44148a aVar22 = this.f113988j;
        if (aVar22 == null) {
            C7573i.m23583a("publishEditScene");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel19 = this.f113994q;
        if (vEVideoPublishEditViewModel19 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        aVar22.mo106662i(vEVideoPublishEditViewModel19.mo119529u());
        C44148a aVar23 = this.f113988j;
        if (aVar23 == null) {
            C7573i.m23583a("publishEditScene");
        }
        C0043i iVar = this;
        aVar23.mo106647c().observe(iVar, new C44074h(this));
        C44148a aVar24 = this.f113988j;
        if (aVar24 == null) {
            C7573i.m23583a("publishEditScene");
        }
        aVar24.mo106650d().observe(iVar, new C44075i(this));
        EditPreviewViewModel editPreviewViewModel = this.f113989k;
        if (editPreviewViewModel == null) {
            C7573i.m23583a("previewViewModel");
        }
        editPreviewViewModel.mo106323h().observe(iVar, new C44076j(this));
        EditPreviewViewModel editPreviewViewModel2 = this.f113989k;
        if (editPreviewViewModel2 == null) {
            C7573i.m23583a("previewViewModel");
        }
        editPreviewViewModel2.mo106324i().observe(iVar, new C44077k(this));
        EditPreviewViewModel editPreviewViewModel3 = this.f113989k;
        if (editPreviewViewModel3 == null) {
            C7573i.m23583a("previewViewModel");
        }
        mo91869c(editPreviewViewModel3, C44081au.f114016a, new C11672v(), new C44078l(this));
        C44148a aVar25 = this.f113988j;
        if (aVar25 == null) {
            C7573i.m23583a("publishEditScene");
        }
        aVar25.mo106653e().observe(iVar, new C44079m(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
        if (r0.mIsFromDraft != false) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0186  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m139487P() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f113991m
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            r1 = 30
            r2 = 1
            dmt.av.video.VEPreviewParams r0 = com.p280ss.android.ugc.aweme.shortvideo.edit.C39526e.m126247a(r0, r2, r1)
            android.app.Activity r1 = r6.f33526d_
            if (r1 != 0) goto L_0x0017
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0017:
            java.lang.String r3 = "activity!!"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r3 = "extra_editor_model"
            android.os.Parcelable r1 = r1.getParcelableExtra(r3)
            com.ss.android.vesdk.VEEditorModel r1 = (com.p280ss.android.vesdk.VEEditorModel) r1
            r0.editorModel = r1
            long r3 = com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment.f100416u
            r0.editorHandler = r3
            r3 = -1
            com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment.f100416u = r3
            com.ss.android.vesdk.af r1 = r6.m139490a(r0)
            r0.timelineParams = r1
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r6.f113995r
            if (r1 != 0) goto L_0x0041
            java.lang.String r3 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0041:
            com.ss.android.ugc.aweme.shortvideo.edit.az r1 = r1.mo106446g()
            int r1 = r1.mo98355c()
            r0.canvasWidth = r1
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r6.f113995r
            if (r1 != 0) goto L_0x0054
            java.lang.String r3 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0054:
            com.ss.android.ugc.aweme.shortvideo.edit.az r1 = r1.mo106446g()
            int r1 = r1.mo98356d()
            r0.canvasHeight = r1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f113991m
            if (r1 != 0) goto L_0x0067
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0067:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r1 = r1.veAudioRecorderParam
            r0.veAudioRecordParam = r1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f113991m
            if (r1 != 0) goto L_0x0074
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0074:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r1 = r1.veAudioEffectParam
            if (r1 == 0) goto L_0x0085
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f113991m
            if (r1 != 0) goto L_0x0081
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0081:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r1 = r1.veAudioEffectParam
            r0.veAudioEffectParam = r1
        L_0x0085:
            dmt.av.video.VEVideoPublishEditViewModel r1 = r6.f113994q
            if (r1 != 0) goto L_0x008e
            java.lang.String r3 = "publishEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x008e:
            android.arch.lifecycle.o r1 = r1.mo119508a()
            java.lang.String r3 = "publishEditViewModel.previewParams"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r1.setValue(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f113991m
            if (r0 != 0) goto L_0x00a3
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00a3:
            int r0 = r0.isMusic()
            if (r0 != r2) goto L_0x0198
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f113991m
            if (r0 != 0) goto L_0x00b2
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00b2:
            int r0 = r0.recordMode
            if (r0 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f113991m
            if (r0 != 0) goto L_0x00bf
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00bf:
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L_0x0198
        L_0x00c3:
            dmt.av.video.VEPreviewMusicParams r0 = new dmt.av.video.VEPreviewMusicParams
            r0.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f113991m
            if (r1 != 0) goto L_0x00d1
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00d1:
            java.lang.String r1 = r1.mMusicPath
            r0.f121606a = r1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f113991m
            if (r1 != 0) goto L_0x00de
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00de:
            int r1 = r1.mMusicStart
            r0.f121607b = r1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f113991m
            if (r1 != 0) goto L_0x00eb
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00eb:
            java.lang.String r1 = r1.mMusicPath
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r6.f113991m
            if (r3 != 0) goto L_0x00f6
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x00f6:
            boolean r3 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136538a(r3)
            int r1 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136536a(r1, r3)
            r0.f121608c = r1
            com.ss.android.ugc.aweme.property.AVAB r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r3 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
            boolean r1 = r1.mo93305a(r3)
            if (r1 == 0) goto L_0x0157
            com.ss.android.ugc.aweme.shortvideo.dw r1 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r1 = r1.mo97931b()
            if (r1 == 0) goto L_0x0157
            com.ss.android.ugc.aweme.shortvideo.dw r1 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r1 = r1.mo97931b()
            if (r1 != 0) goto L_0x0121
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0121:
            int r1 = r1.getShootDuration()
            if (r1 <= 0) goto L_0x0157
            int r1 = r0.f121608c
            com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.mo97931b()
            if (r3 != 0) goto L_0x0136
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0136:
            int r3 = r3.getShootDuration()
            int r1 = r1 - r3
            int r1 = java.lang.Math.abs(r1)
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r3) goto L_0x0157
            com.ss.android.ugc.aweme.shortvideo.dw r1 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r1 = r1.mo97931b()
            if (r1 != 0) goto L_0x0150
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0150:
            int r1 = r1.getShootDuration()
            r0.f121609d = r1
            goto L_0x015b
        L_0x0157:
            int r1 = r0.f121608c
            r0.f121609d = r1
        L_0x015b:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f113991m
            if (r1 != 0) goto L_0x0164
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0164:
            float r1 = r1.musicVolume
            r0.f121610e = r1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f113991m
            if (r1 != 0) goto L_0x0171
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0171:
            java.lang.String r1 = r1.musicId
            r0.f121611f = r1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f113991m
            if (r1 != 0) goto L_0x017e
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x017e:
            float r1 = r1.previewStartTime
            r0.f121612g = r1
            dmt.av.video.VEVideoPublishEditViewModel r1 = r6.f113994q
            if (r1 != 0) goto L_0x018b
            java.lang.String r3 = "publishEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x018b:
            android.arch.lifecycle.o r1 = r1.mo119513e()
            java.lang.String r3 = "publishEditViewModel.previewMusicParams"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r1.setValue(r0)
            goto L_0x0201
        L_0x0198:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f113991m
            if (r0 != 0) goto L_0x01a1
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x01a1:
            boolean r0 = r0.isStatusVideoType()
            if (r0 == 0) goto L_0x0201
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f113991m
            if (r0 != 0) goto L_0x01b0
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x01b0:
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r0 = r0.statusCreateVideoData
            java.lang.String r1 = r0.getMusicPath()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0201
            dmt.av.video.VEPreviewMusicParams r1 = new dmt.av.video.VEPreviewMusicParams
            r1.<init>()
            java.lang.String r3 = r0.getMusicPath()
            r1.f121606a = r3
            r3 = 0
            r1.f121607b = r3
            r4 = 10000(0x2710, float:1.4013E-41)
            r1.f121608c = r4
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f113991m
            if (r4 != 0) goto L_0x01d9
            java.lang.String r5 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x01d9:
            float r4 = r4.musicVolume
            r1.f121610e = r4
            java.util.List r0 = r0.getMusicIds()
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r1.f121611f = r0
            r0 = 0
            r1.f121612g = r0
            dmt.av.video.VEVideoPublishEditViewModel r0 = r6.f113994q
            if (r0 != 0) goto L_0x01f5
            java.lang.String r3 = "publishEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x01f5:
            android.arch.lifecycle.o r0 = r0.mo119513e()
            java.lang.String r3 = "publishEditViewModel.previewMusicParams"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r0.setValue(r1)
        L_0x0201:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f113991m
            if (r0 != 0) goto L_0x020a
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x020a:
            int r0 = r0.isMusic()
            if (r0 != r2) goto L_0x0229
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f113991m
            if (r0 != 0) goto L_0x0219
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0219:
            int r0 = r0.recordMode
            if (r0 != r2) goto L_0x0229
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f113991m
            if (r0 != 0) goto L_0x0226
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0226:
            r1 = 0
            r0.mMusicPath = r1
        L_0x0229:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44066as.m139487P():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ FrameLayout m139489a(C44066as asVar) {
        FrameLayout frameLayout = asVar.f113990l;
        if (frameLayout == null) {
            C7573i.m23583a("videoContainer");
        }
        return frameLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditPreviewViewModel m139491b(C44066as asVar) {
        EditPreviewViewModel editPreviewViewModel = asVar.f113989k;
        if (editPreviewViewModel == null) {
            C7573i.m23583a("previewViewModel");
        }
        return editPreviewViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ C44148a m139492c(C44066as asVar) {
        C44148a aVar = asVar.f113988j;
        if (aVar == null) {
            C7573i.m23583a("publishEditScene");
        }
        return aVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ VideoPublishEditModel m139493d(C44066as asVar) {
        VideoPublishEditModel videoPublishEditModel = asVar.f113991m;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ CompileProbeViewModel m139494e(C44066as asVar) {
        CompileProbeViewModel compileProbeViewModel = asVar.f113992n;
        if (compileProbeViewModel == null) {
            C7573i.m23583a("compileProbeViewModel");
        }
        return compileProbeViewModel;
    }

    /* renamed from: e */
    public final void mo106571e(int i) {
        C44148a aVar = this.f113988j;
        if (aVar == null) {
            C7573i.m23583a("publishEditScene");
        }
        aVar.mo106631a().f121694g = i;
    }

    /* renamed from: a */
    private final C45255af m139490a(VEPreviewParams vEPreviewParams) {
        boolean z;
        boolean z2;
        if (vEPreviewParams.editorHandler <= 0 || vEPreviewParams.editorModel == null) {
            return null;
        }
        if (vEPreviewParams.isFastImport && vEPreviewParams.mVideoPaths.length == 1) {
            VideoPublishEditModel videoPublishEditModel = this.f113991m;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("mModel");
            }
            EditVideoSegment editVideoSegment = (EditVideoSegment) videoPublishEditModel.getPreviewInfo().getVideoList().get(0);
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo == null) {
                return null;
            }
            if (videoCutInfo.getEnd() - videoCutInfo.getStart() == editVideoSegment.getVideoFileInfo().getDuration()) {
                C41530am.m132280a("single video import without cut");
                return null;
            }
        }
        C45255af afVar = new C45255af(vEPreviewParams.mVideoPaths);
        afVar.f116440e = vEPreviewParams.mVTrimIn;
        afVar.f116441f = vEPreviewParams.mVTrimOut;
        float[] fArr = vEPreviewParams.speedArray;
        if (fArr != null) {
            if (fArr.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(!z2)) {
                fArr = null;
            }
            if (fArr != null) {
                Collection arrayList = new ArrayList(fArr.length);
                for (float f : fArr) {
                    arrayList.add(Double.valueOf((double) f));
                }
                afVar.f116444i = C7525m.m23502b((Collection<Double>) (List) arrayList);
            }
        }
        int[] iArr = vEPreviewParams.rotateArray;
        if (iArr != null) {
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(true ^ z)) {
                iArr = null;
            }
            if (iArr != null) {
                Collection arrayList2 = new ArrayList(iArr.length);
                for (int a : iArr) {
                    arrayList2.add(C38790a.m123896a(a));
                }
                Object[] array = ((List) arrayList2).toArray(new ROTATE_DEGREE[0]);
                if (array != null) {
                    afVar.f116446k = (ROTATE_DEGREE[]) array;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }
        return afVar;
    }

    /* renamed from: d */
    public final void mo30944d(Bundle bundle) {
        super.mo30944d(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(VEVideoPublishEditViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.f113994q = (VEVideoPublishEditViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditPreviewViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…iewViewModel::class.java)");
                this.f113989k = (EditPreviewViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…ditViewModel::class.java)");
                    this.f113995r = (EditViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(EditTextStickerViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java)");
                        this.f113996s = (EditTextStickerViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity5).mo91871a(EditInfoStickerViewModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…kerViewModel::class.java)");
                            this.f113997t = (EditInfoStickerViewModel) a5;
                            Activity activity6 = this.f33526d_;
                            if (activity6 != null) {
                                JediViewModel a6 = C36113b.m116288a((FragmentActivity) activity6).mo91871a(EditPoiStickerViewModel.class);
                                C7573i.m23582a((Object) a6, "JediViewModelProviders.o…kerViewModel::class.java)");
                                this.f113998u = (EditPoiStickerViewModel) a6;
                                Activity activity7 = this.f33526d_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C36113b.m116288a((FragmentActivity) activity7).mo91871a(EditVoteStickerViewModel.class);
                                    C7573i.m23582a((Object) a7, "JediViewModelProviders.o…kerViewModel::class.java)");
                                    this.f113999v = (EditVoteStickerViewModel) a7;
                                    Activity activity8 = this.f33526d_;
                                    if (activity8 != null) {
                                        JediViewModel a8 = C36113b.m116288a((FragmentActivity) activity8).mo91871a(EditStickerViewModel.class);
                                        C7573i.m23582a((Object) a8, "JediViewModelProviders.o…kerViewModel::class.java)");
                                        this.f114000w = (EditStickerViewModel) a8;
                                        Activity activity9 = this.f33526d_;
                                        if (activity9 != null) {
                                            C0063u a9 = C0069x.m159a((FragmentActivity) activity9).mo147a(CompileProbeViewModel.class);
                                            C7573i.m23582a((Object) a9, "ViewModelProviders.of(ac…obeViewModel::class.java)");
                                            this.f113992n = (CompileProbeViewModel) a9;
                                            EditViewModel editViewModel = this.f113995r;
                                            if (editViewModel == null) {
                                                C7573i.m23583a("editViewModel");
                                            }
                                            this.f113991m = editViewModel.mo29069f();
                                            return;
                                        }
                                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                    }
                                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: b */
    public final ViewGroup mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.air, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
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

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
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
