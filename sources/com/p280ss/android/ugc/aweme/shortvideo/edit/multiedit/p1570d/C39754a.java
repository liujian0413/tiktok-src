package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1570d;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.util.C6292i;
import com.bytedance.common.utility.C9738o;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39700b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1569c.C39738f;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47518x;
import dmt.p1861av.video.C47518x.C47519a;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a */
public final class C39754a extends C12629j {

    /* renamed from: i */
    public static final C39755a f103330i = new C39755a(null);

    /* renamed from: j */
    private VEVideoPublishEditViewModel f103331j;

    /* renamed from: k */
    private C39738f f103332k = new C39738f();

    /* renamed from: l */
    private final int f103333l = 52;

    /* renamed from: m */
    private final int f103334m = 242;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a$a */
    public static final class C39755a {
        private C39755a() {
        }

        public /* synthetic */ C39755a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a$b */
    static final class C39756b implements OnClickListener {

        /* renamed from: a */
        public static final C39756b f103335a = new C39756b();

        C39756b() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
    }

    /* renamed from: a */
    public final void mo99150a() {
        this.f103332k.mo99132b();
    }

    /* renamed from: b */
    private final int m127212b() {
        return (int) C9738o.m28708b((Context) this.f33526d_, (float) this.f103333l);
    }

    /* renamed from: c */
    private final int m127213c() {
        return (int) C9738o.m28708b((Context) this.f33526d_, (float) this.f103334m);
    }

    /* renamed from: A */
    public final void mo30993A() {
        super.mo30993A();
        this.f103332k.mo99133b(false);
    }

    /* renamed from: B */
    public final void mo30994B() {
        super.mo30994B();
        this.f103332k.mo99133b(true);
    }

    /* renamed from: d */
    private final int m127214d() {
        if (C39805en.m127445a()) {
            return (((C39805en.m127452e(this.f33526d_) - m127212b()) - m127213c()) - C39805en.m127450c(this.f33526d_)) - C39805en.m127451d(this.f33526d_);
        }
        View view = this.f33523b;
        C7573i.m23582a((Object) view, "view");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return (((View) parent).getHeight() - m127212b()) - m127213c();
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    /* renamed from: a */
    public final void mo99151a(C15389d dVar) {
        this.f103332k.mo99127a(dVar);
    }

    /* renamed from: a */
    public final void mo99152a(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        if (videoPublishEditModel != null) {
            multiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        } else {
            multiEditVideoRecordData = null;
        }
        if (multiEditVideoRecordData != null && !C6292i.m19525a(videoPublishEditModel.getCurMultiEditVideoRecordData().segmentDataList)) {
            videoPublishEditModel.copyMultiEditMusicInfo();
            this.f103332k.mo99128a(videoPublishEditModel);
        }
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(VEVideoPublishEditViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.f103331j = (VEVideoPublishEditViewModel) a;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo99153a(boolean z, VideoPublishEditModel videoPublishEditModel) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2 = z;
        if (videoPublishEditModel != null) {
            videoPublishEditModel.copyMultiEditMusicInfo();
        }
        if (z2) {
            C39700b.f103201a.mo99066a(this.f103332k.mo99131a());
        }
        if (this.f103332k.mo99131a()) {
            this.f103332k.mo99129a(z2);
            return;
        }
        if (z2) {
            if (videoPublishEditModel == null) {
                C7573i.m23580a();
            }
            if (videoPublishEditModel.isRetakeVideo()) {
                this.f103332k.mo99129a(z2);
                return;
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f103331j;
            if (vEVideoPublishEditViewModel == null) {
                C7573i.m23583a("publishEditViewModel");
            }
            C0052o g = vEVideoPublishEditViewModel.mo119515g();
            C7573i.m23582a((Object) g, "publishEditViewModel.videoPreviewScaleOpChangeV2");
            C47519a aVar = C47518x.f121983l;
            int a = C42111b.f109618a.mo103542a(true, false, false, false, false);
            int b = m127212b();
            if (C39805en.m127445a()) {
                i3 = C39805en.m127450c(this.f33526d_);
            } else {
                i3 = 0;
            }
            int i5 = i3 + b;
            int c = m127213c();
            int d = m127214d();
            if (C39805en.m127445a()) {
                i4 = C39804em.m127438b(this.f33526d_, C39804em.f103457a);
            } else {
                i4 = 0;
            }
            g.setValue(C47519a.m148313a(aVar, a, i5, c, d, i4, 0, false, false, false, false, 960, null));
        } else {
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f103331j;
            if (vEVideoPublishEditViewModel2 == null) {
                C7573i.m23583a("publishEditViewModel");
            }
            C0052o g2 = vEVideoPublishEditViewModel2.mo119515g();
            C7573i.m23582a((Object) g2, "publishEditViewModel.videoPreviewScaleOpChangeV2");
            int color = mo31017x().getColor(R.color.l3);
            int b2 = m127212b();
            if (C39805en.m127445a()) {
                i = C39805en.m127450c(this.f33526d_);
            } else {
                i = 0;
            }
            int i6 = b2 + i;
            int c2 = m127213c();
            int d2 = m127214d();
            if (C39805en.m127445a()) {
                i2 = C39804em.m127438b(this.f33526d_, C39804em.f103457a);
            } else {
                i2 = 0;
            }
            g2.setValue(C47519a.m148310a(color, i6, c2, d2, i2, 0));
        }
        this.f103332k.mo99129a(z2);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.a60, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.cyw);
        C39738f fVar = this.f103332k;
        Activity activity = this.f33526d_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            C7573i.m23582a((Object) frameLayout, "contentView");
            fVar.mo99126a(fragmentActivity, (View) frameLayout);
            frameLayout.setVisibility(8);
            frameLayout.setOnClickListener(C39756b.f103335a);
            C7573i.m23582a((Object) inflate, "rootView");
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
