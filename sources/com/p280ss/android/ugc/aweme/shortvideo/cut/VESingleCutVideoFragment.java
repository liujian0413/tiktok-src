package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38576cg;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39193g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtCheckableImageButton;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VESingleCutVideoFragment */
public final class VESingleCutVideoFragment extends VECutVideoFragment {

    /* renamed from: A */
    private HashMap f100633A;

    /* renamed from: w */
    private RelativeLayout f100634w;

    /* renamed from: x */
    private RelativeLayout f100635x;

    /* renamed from: y */
    private RelativeLayout f100636y;

    /* renamed from: z */
    private AbstractVideoEditView f100637z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VESingleCutVideoFragment$a */
    static final class C38726a extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ VESingleCutVideoFragment f100638a;

        C38726a(VESingleCutVideoFragment vESingleCutVideoFragment) {
            this.f100638a = vESingleCutVideoFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m123677a(((Number) obj).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m123677a(int i) {
            C39804em.m127430a((View) (SurfaceView) this.f100638a.mo96687a((int) R.id.ea6), (Context) this.f100638a.getActivity(), Math.min(((VideoSegment) this.f100638a.mo96698h().mo97721n().get(0)).f100765g, ((VideoSegment) this.f100638a.mo96698h().mo97721n().get(0)).f100766h), Math.max(((VideoSegment) this.f100638a.mo96698h().mo97721n().get(0)).f100765g, ((VideoSegment) this.f100638a.mo96698h().mo97721n().get(0)).f100766h));
            this.f100638a.mo96716y();
        }
    }

    /* renamed from: J */
    public final void mo96686J() {
        if (this.f100633A != null) {
            this.f100633A.clear();
        }
    }

    /* renamed from: a */
    public final View mo96687a(int i) {
        if (this.f100633A == null) {
            this.f100633A = new HashMap();
        }
        View view = (View) this.f100633A.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f100633A.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo96686J();
    }

    /* renamed from: x */
    public final boolean mo96715x() {
        return false;
    }

    /* renamed from: K */
    public final SurfaceView mo96766K() {
        SurfaceView surfaceView = (SurfaceView) mo96687a((int) R.id.ea6);
        C7573i.m23582a((Object) surfaceView, "videoSurface");
        return surfaceView;
    }

    /* renamed from: a */
    public final AbstractVideoEditView mo96768a() {
        AbstractVideoEditView abstractVideoEditView = this.f100637z;
        if (abstractVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        return abstractVideoEditView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo96677A() {
        super.mo96677A();
        OnClickListener onClickListener = this;
        ((AVDmtImageView) mo96687a((int) R.id.b5n)).setOnClickListener(onClickListener);
        ((AVDmtCheckableImageButton) mo96687a((int) R.id.b5p)).setOnClickListener(onClickListener);
    }

    /* renamed from: b */
    public final View mo96771b() {
        ImageView imageView = (ImageView) mo96687a((int) R.id.b5k);
        C7573i.m23582a((Object) imageView, "ivPlay");
        return imageView;
    }

    /* renamed from: c */
    public final View mo96773c() {
        TextView textView = (TextView) mo96687a((int) R.id.dq1);
        C7573i.m23582a((Object) textView, "tvNext");
        return textView;
    }

    /* renamed from: d */
    public final TextView mo96774d() {
        AVDmtTextView aVDmtTextView = (AVDmtTextView) mo96687a((int) R.id.dq5);
        C7573i.m23582a((Object) aVDmtTextView, "tvTime");
        return aVDmtTextView;
    }

    /* renamed from: e */
    public final ViewStub mo96775e() {
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.dbu);
        C7573i.m23582a((Object) viewStub, "stubSpeedLayout");
        return viewStub;
    }

    /* renamed from: w */
    public final void mo96714w() {
        super.mo96714w();
        C39193g.f101577a.mo97489d(mo96698h().mo97721n());
    }

    /* renamed from: f */
    public final int mo96696f() {
        if (C35563c.f93231M.mo93305a(Property.EnableUploadVideoSlideAutoJust)) {
            if (C39805en.m127445a()) {
                return R.layout.nq;
            }
            return R.layout.nr;
        } else if (C39805en.m127445a()) {
            return R.layout.np;
        } else {
            return R.layout.no;
        }
    }

    /* renamed from: c */
    public final void mo96694c(boolean z) {
        super.mo96694c(z);
        AVDmtImageView aVDmtImageView = (AVDmtImageView) mo96687a((int) R.id.b5n);
        C7573i.m23582a((Object) aVDmtImageView, "ivRotate");
        aVDmtImageView.setEnabled(!z);
        AVDmtCheckableImageButton aVDmtCheckableImageButton = (AVDmtCheckableImageButton) mo96687a((int) R.id.b5p);
        C7573i.m23582a((Object) aVDmtCheckableImageButton, "ivSpeed");
        aVDmtCheckableImageButton.setEnabled(!z);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C39805en.m127445a()) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            new C38576cg(activity).mo96554a(C38577a.f100216a, new C38726a(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo96692a(boolean z) {
        int i;
        RelativeLayout relativeLayout = this.f100634w;
        if (relativeLayout == null) {
            C7573i.m23583a("cornersTop");
        }
        LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (z) {
                i = C39805en.m127450c(getActivity());
            } else {
                i = 0;
            }
            layoutParams2.topMargin = i;
            RelativeLayout relativeLayout2 = this.f100634w;
            if (relativeLayout2 == null) {
                C7573i.m23583a("cornersTop");
            }
            relativeLayout2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public final void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        boolean z = false;
        if (num != null && num.intValue() == R.id.b5p) {
            ((AVDmtCheckableImageButton) mo96687a((int) R.id.b5p)).toggle();
            AVDmtCheckableImageButton aVDmtCheckableImageButton = (AVDmtCheckableImageButton) mo96687a((int) R.id.b5p);
            C7573i.m23582a((Object) aVDmtCheckableImageButton, "ivSpeed");
            if (aVDmtCheckableImageButton.isChecked()) {
                mo96701k().mo100133a(C38774k.m123824d(mo96768a().getCurrentSpeed()));
                mo96701k().mo100131a(0);
            } else {
                mo96701k().mo100131a(8);
            }
            z = true;
        }
        if (!z) {
            super.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo96693b(boolean z) {
        int i;
        int i2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cp);
        LayoutParams layoutParams = mo96703m().getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (z) {
                i = dimensionPixelSize;
            } else {
                i = (int) C9738o.m28708b((Context) getActivity(), 132.0f);
            }
            layoutParams2.height = i;
            mo96703m().setLayoutParams(layoutParams2);
            RelativeLayout relativeLayout = this.f100636y;
            if (relativeLayout == null) {
                C7573i.m23583a("videoEditViewWrapper");
            }
            LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                if (z) {
                    i2 = (int) (C9738o.m28708b((Context) getActivity(), 5.5f) + ((float) dimensionPixelSize));
                } else {
                    i2 = 0;
                }
                layoutParams4.bottomMargin = i2;
                RelativeLayout relativeLayout2 = this.f100636y;
                if (relativeLayout2 == null) {
                    C7573i.m23583a("videoEditViewWrapper");
                }
                relativeLayout2.setLayoutParams(layoutParams4);
                RelativeLayout relativeLayout3 = this.f100635x;
                if (relativeLayout3 == null) {
                    C7573i.m23583a("cornersBottom");
                }
                LayoutParams layoutParams5 = relativeLayout3.getLayoutParams();
                if (layoutParams5 != null) {
                    RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
                    if (!z) {
                        dimensionPixelSize = 0;
                    }
                    layoutParams6.bottomMargin = dimensionPixelSize;
                    RelativeLayout relativeLayout4 = this.f100635x;
                    if (relativeLayout4 == null) {
                        C7573i.m23583a("cornersBottom");
                    }
                    relativeLayout4.setLayoutParams(layoutParams6);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo96689a(int i, int i2) {
        ((TextView) mo96687a((int) R.id.dq1)).setBackgroundResource(R.drawable.tr);
        ((TextView) mo96687a((int) R.id.dq1)).setTextColor(i2);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C7573i.m23587b(view, "view");
        View findViewById = view.findViewById(R.id.ea3);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.videoEditView)");
        this.f100637z = (AbstractVideoEditView) findViewById;
        super.onViewCreated(view, bundle);
        AVDmtImageView aVDmtImageView = (AVDmtImageView) mo96687a((int) R.id.b5n);
        C7573i.m23582a((Object) aVDmtImageView, "ivRotate");
        aVDmtImageView.setVisibility(0);
        C0052o<CutVideoContext> oVar = mo96698h().f101855t;
        if (oVar != null) {
            CutVideoContext cutVideoContext = (CutVideoContext) oVar.getValue();
            if (cutVideoContext != null) {
                List videoSegmentList = cutVideoContext.getVideoSegmentList();
                if (videoSegmentList != null && !videoSegmentList.isEmpty()) {
                    if (this.f100429c) {
                        C39193g.m125127a("prop_customized_video");
                    }
                    C39193g.f101577a.mo97483b(mo96698h().mo97721n());
                    VideoSegment videoSegment = (VideoSegment) mo96698h().mo97721n().get(0);
                    if (videoSegment.f100765g <= 0 || videoSegment.f100766h <= 0) {
                        mo96679C();
                        return;
                    }
                    AVDmtCheckableImageButton aVDmtCheckableImageButton = (AVDmtCheckableImageButton) mo96687a((int) R.id.b5p);
                    C7573i.m23582a((Object) aVDmtCheckableImageButton, "ivSpeed");
                    if (!this.f100432f || !mo96700j().mo96746a(videoSegment)) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    aVDmtCheckableImageButton.setVisibility(i);
                    int min = Math.min(videoSegment.f100765g, videoSegment.f100766h);
                    int max = Math.max(videoSegment.f100765g, videoSegment.f100766h);
                    if (C39805en.m127445a()) {
                        View findViewById2 = view.findViewById(R.id.a3b);
                        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.corners_top)");
                        this.f100634w = (RelativeLayout) findViewById2;
                        View findViewById3 = view.findViewById(R.id.a3a);
                        C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.corners_bottom)");
                        this.f100635x = (RelativeLayout) findViewById3;
                        RelativeLayout relativeLayout = this.f100635x;
                        if (relativeLayout == null) {
                            C7573i.m23583a("cornersBottom");
                        }
                        relativeLayout.setVisibility(0);
                        RelativeLayout relativeLayout2 = this.f100634w;
                        if (relativeLayout2 == null) {
                            C7573i.m23583a("cornersTop");
                        }
                        relativeLayout2.setVisibility(0);
                        View findViewById4 = view.findViewById(R.id.eal);
                        C7573i.m23582a((Object) findViewById4, "view.findViewById(R.id.video_edit_view_wrapper)");
                        this.f100636y = (RelativeLayout) findViewById4;
                        LayoutParams layoutParams = mo96702l().getLayoutParams();
                        if (layoutParams != null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.topMargin = ((int) C9738o.m28708b((Context) getActivity(), 25.0f)) + C39805en.m127450c(getActivity());
                            mo96702l().setLayoutParams(layoutParams2);
                            C39804em.m127430a((View) (SurfaceView) mo96687a((int) R.id.ea6), (Context) getActivity(), min, max);
                            mo96716y();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    } else if ((((float) min) * 1.0f) / ((float) max) < 0.85f) {
                        C39804em.m127439b((SurfaceView) mo96687a((int) R.id.ea6), min, max);
                    }
                }
            }
        }
    }
}
