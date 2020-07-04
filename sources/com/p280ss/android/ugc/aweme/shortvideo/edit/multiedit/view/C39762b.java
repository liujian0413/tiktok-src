package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.animation.AnimatorListenerAdapter;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.C1642a;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1568b.C39709b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b */
public class C39762b implements C39761a {

    /* renamed from: a */
    protected View f103349a;

    /* renamed from: b */
    protected AbstractVideoEditView f103350b;

    /* renamed from: c */
    protected View f103351c;

    /* renamed from: d */
    protected View f103352d;

    /* renamed from: e */
    protected View f103353e;

    /* renamed from: f */
    protected View f103354f;

    /* renamed from: g */
    public C39709b f103355g;

    /* renamed from: h */
    private View f103356h;

    /* renamed from: i */
    private View f103357i;

    /* renamed from: a */
    public void mo99183a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo99184a(FragmentActivity fragmentActivity, int i, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    /* renamed from: a */
    public void mo99185a(FragmentActivity fragmentActivity, int i, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    /* renamed from: a */
    public void mo99188a(FragmentActivity fragmentActivity, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
    }

    /* renamed from: a */
    public void mo99189a(C0902i<Float, Float> iVar) {
        C7573i.m23587b(iVar, "pair");
    }

    /* renamed from: a */
    public void mo99191a(VideoSegment videoSegment) {
    }

    /* renamed from: a */
    public void mo99193a(List<? extends VideoSegment> list) {
    }

    /* renamed from: a */
    public void mo99195a(boolean z, int i) {
    }

    /* renamed from: b */
    public void mo99196b(C0902i<Float, Float> iVar) {
        C7573i.m23587b(iVar, "pair");
    }

    /* renamed from: b */
    public void mo99197b(VideoSegment videoSegment) {
    }

    /* renamed from: f */
    public void mo99203f() {
    }

    /* renamed from: g */
    public void mo99204g() {
    }

    /* renamed from: h */
    public void mo99205h() {
    }

    /* renamed from: i */
    public void mo99206i() {
    }

    /* renamed from: j */
    public void mo99207j() {
    }

    /* renamed from: k */
    public View mo99208k() {
        return null;
    }

    /* renamed from: q */
    public boolean mo99214q() {
        return true;
    }

    /* renamed from: a */
    public final void mo99194a(boolean z) {
        View view = this.f103356h;
        if (view == null) {
            C7573i.m23583a("playView");
        }
        view.setVisibility(z ? 0 : 8);
    }

    /* renamed from: a */
    public final void mo99192a(C39709b bVar) {
        C7573i.m23587b(bVar, "itemListener");
        this.f103355g = bVar;
    }

    /* renamed from: a */
    public final AbstractVideoEditView mo99182a() {
        AbstractVideoEditView abstractVideoEditView = this.f103350b;
        if (abstractVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        return abstractVideoEditView;
    }

    /* renamed from: e */
    public final boolean mo99202e() {
        AbstractVideoEditView abstractVideoEditView = this.f103350b;
        if (abstractVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        return abstractVideoEditView.mo97642f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final AbstractVideoEditView mo99209l() {
        AbstractVideoEditView abstractVideoEditView = this.f103350b;
        if (abstractVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        return abstractVideoEditView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final View mo99210m() {
        View view = this.f103351c;
        if (view == null) {
            C7573i.m23583a("cancleView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final View mo99211n() {
        View view = this.f103352d;
        if (view == null) {
            C7573i.m23583a("saveView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final View mo99212o() {
        View view = this.f103353e;
        if (view == null) {
            C7573i.m23583a("rootView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final View mo99213p() {
        View view = this.f103354f;
        if (view == null) {
            C7573i.m23583a("iRephotographLayout");
        }
        return view;
    }

    /* renamed from: b */
    public final boolean mo99199b() {
        View view = this.f103356h;
        if (view == null) {
            C7573i.m23583a("playView");
        }
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C0902i<Float, Float> mo99201d() {
        AbstractVideoEditView abstractVideoEditView = this.f103350b;
        if (abstractVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        C0902i<Float, Float> slideX = abstractVideoEditView.getSlideX();
        C7573i.m23582a((Object) slideX, "videoEditView.slideX");
        return slideX;
    }

    /* renamed from: c */
    public final void mo99200c() {
        Locale locale = Locale.getDefault();
        C7573i.m23582a((Object) locale, "Locale.getDefault()");
        String str = "%.1f";
        Object[] objArr = new Object[1];
        AbstractVideoEditView abstractVideoEditView = this.f103350b;
        if (abstractVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        objArr[0] = Float.valueOf(abstractVideoEditView.getSelectedTime());
        String a = C1642a.m8035a(locale, str, Arrays.copyOf(objArr, 1));
        C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
        View view = this.f103349a;
        if (view == null) {
            C7573i.m23583a("tvTime");
        }
        String string = view.getResources().getString(R.string.cb0, new Object[]{a});
        View view2 = this.f103349a;
        if (view2 == null) {
            C7573i.m23583a("tvTime");
        }
        if (view2 != null) {
            ((TextView) view2).setText(string);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* renamed from: b */
    public final void mo99198b(boolean z) {
        int i;
        View view = this.f103353e;
        if (view == null) {
            C7573i.m23583a("rootView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (z) {
            AbstractVideoEditView abstractVideoEditView = this.f103350b;
            if (abstractVideoEditView == null) {
                C7573i.m23583a("videoEditView");
            }
            abstractVideoEditView.mo97620a();
        }
        mo99194a(z);
    }

    /* renamed from: a */
    public void mo99190a(OnClickListener onClickListener) {
        View view = this.f103351c;
        if (view == null) {
            C7573i.m23583a("cancleView");
        }
        view.setOnClickListener(onClickListener);
        View view2 = this.f103352d;
        if (view2 == null) {
            C7573i.m23583a("saveView");
        }
        view2.setOnClickListener(onClickListener);
        View view3 = this.f103357i;
        if (view3 == null) {
            C7573i.m23583a("videoControlView");
        }
        view3.setOnClickListener(onClickListener);
        View view4 = this.f103354f;
        if (view4 == null) {
            C7573i.m23583a("iRephotographLayout");
        }
        view4.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public void mo99186a(FragmentActivity fragmentActivity, View view) {
        if (fragmentActivity != null && view != null) {
            this.f103353e = view;
            View findViewById = view.findViewById(R.id.dq5);
            C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.tvTime)");
            this.f103349a = findViewById;
            View findViewById2 = view.findViewById(R.id.dr7);
            C7573i.m23582a((Object) findViewById2, "rootView.findViewById(R.id.tv_cancle)");
            this.f103351c = findViewById2;
            View findViewById3 = view.findViewById(R.id.e15);
            C7573i.m23582a((Object) findViewById3, "rootView.findViewById(R.id.tv_save)");
            this.f103352d = findViewById3;
            View findViewById4 = view.findViewById(R.id.crr);
            C7573i.m23582a((Object) findViewById4, "rootView.findViewById(R.id.rephotograph_layout)");
            this.f103354f = findViewById4;
            View findViewById5 = view.findViewById(R.id.ea3);
            C7573i.m23582a((Object) findViewById5, "rootView.findViewById(R.id.videoEditView)");
            this.f103350b = (AbstractVideoEditView) findViewById5;
            View findViewById6 = view.findViewById(R.id.b5k);
            C7573i.m23582a((Object) findViewById6, "rootView.findViewById(R.id.ivPlay)");
            this.f103356h = findViewById6;
            View findViewById7 = view.findViewById(R.id.a2u);
            C7573i.m23582a((Object) findViewById7, "rootView.findViewById(R.id.control_layout)");
            this.f103357i = findViewById7;
            View findViewById8 = view.findViewById(R.id.b5p);
            C7573i.m23582a((Object) findViewById8, "rootView.findViewById<View>(R.id.ivSpeed)");
            findViewById8.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo99187a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends MediaModel> list, boolean z) {
        AbstractVideoEditView abstractVideoEditView = this.f103350b;
        if (abstractVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        abstractVideoEditView.setExtractFramesInRoughMode(true);
        AbstractVideoEditView abstractVideoEditView2 = this.f103350b;
        if (abstractVideoEditView2 == null) {
            C7573i.m23583a("videoEditView");
        }
        abstractVideoEditView2.mo97634a(fragmentActivity, cutMultiVideoViewModel, list, z);
    }
}
