package com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.detailvideo;

import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.livedata.SlideData;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.p1148ui.BaseDialogFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29001a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.VideoSeekBar;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.detailvideo.DispatchTouchEventLinearLayout.C29010a;
import com.p280ss.android.ugc.aweme.feed.panel.C28648x;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DetailVideoSeekBarFragment */
public final class DetailVideoSeekBarFragment extends BaseDialogFragment {

    /* renamed from: f */
    public static final C29006a f76407f = new C29006a(null);

    /* renamed from: a */
    public VideoSeekBar f76408a;

    /* renamed from: b */
    public DispatchTouchEventLinearLayout f76409b;

    /* renamed from: c */
    public C29010a f76410c;

    /* renamed from: d */
    public View f76411d;

    /* renamed from: e */
    public boolean f76412e;

    /* renamed from: g */
    private C29012b f76413g;

    /* renamed from: h */
    private C28648x f76414h;

    /* renamed from: i */
    private SlideData f76415i;

    /* renamed from: j */
    private C0053p<Float> f76416j;

    /* renamed from: k */
    private boolean f76417k;

    /* renamed from: l */
    private HashMap f76418l;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DetailVideoSeekBarFragment$a */
    public static final class C29006a {
        private C29006a() {
        }

        public /* synthetic */ C29006a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DetailVideoSeekBarFragment$b */
    static final class C29007b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DetailVideoSeekBarFragment f76419a;

        C29007b(DetailVideoSeekBarFragment detailVideoSeekBarFragment) {
            this.f76419a = detailVideoSeekBarFragment;
        }

        public final void run() {
            View view = this.f76419a.f76411d;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DetailVideoSeekBarFragment$c */
    public static final class C29008c implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ DetailVideoSeekBarFragment f76420a;

        C29008c(DetailVideoSeekBarFragment detailVideoSeekBarFragment) {
            this.f76420a = detailVideoSeekBarFragment;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            C7573i.m23587b(dialogInterface, "dialog");
            C7573i.m23587b(keyEvent, "event");
            if (!this.f76420a.isAdded()) {
                return false;
            }
            C29010a aVar = this.f76420a.f76410c;
            if (aVar != null) {
                return aVar.mo67665a(keyEvent);
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DetailVideoSeekBarFragment$d */
    static final class C29009d<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ DetailVideoSeekBarFragment f76421a;

        C29009d(DetailVideoSeekBarFragment detailVideoSeekBarFragment) {
            this.f76421a = detailVideoSeekBarFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            if (f != null) {
                this.f76421a.mo74328a().setTranslationX(((float) C23482j.m77098b(this.f76421a.getContext())) * f.floatValue());
            }
        }
    }

    /* renamed from: e */
    private void m95242e() {
        if (this.f76418l != null) {
            this.f76418l.clear();
        }
    }

    /* renamed from: a */
    public final VideoSeekBar mo74328a() {
        VideoSeekBar videoSeekBar = this.f76408a;
        if (videoSeekBar == null) {
            C7573i.m23583a("mVideoSeekBar");
        }
        return videoSeekBar;
    }

    /* renamed from: c */
    public final void mo74334c() {
        C29012b bVar = this.f76413g;
        if (bVar != null) {
            bVar.mo84328d();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C29012b bVar = this.f76413g;
        if (bVar != null) {
            bVar.mo74339a();
        }
    }

    /* renamed from: p */
    public final boolean mo66608p() {
        if (!super.mo66608p() || getContext() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo74333b() {
        View view = this.f76411d;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f76411d;
        if (view2 != null) {
            view2.postDelayed(new C29007b(this), 20);
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f76416j != null) {
            SlideData slideData = this.f76415i;
            if (slideData != null) {
                C0052o a = slideData.mo60648a();
                if (a != null) {
                    C0053p<Float> pVar = this.f76416j;
                    if (pVar == null) {
                        C7573i.m23580a();
                    }
                    a.removeObserver(pVar);
                }
            }
        }
        m95242e();
    }

    /* renamed from: d */
    private final void m95241d() {
        if (mo66608p() && C21085a.m71129c()) {
            DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout = this.f76409b;
            if (dispatchTouchEventLinearLayout == null) {
                C7573i.m23583a("mDispatchTouchEventLinearLayout");
            }
            LayoutParams layoutParams = dispatchTouchEventLinearLayout.getLayoutParams();
            layoutParams.height += C23486n.m77122a(11.0d);
            DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout2 = this.f76409b;
            if (dispatchTouchEventLinearLayout2 == null) {
                C7573i.m23583a("mDispatchTouchEventLinearLayout");
            }
            dispatchTouchEventLinearLayout2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo74331a(C28648x xVar) {
        C7573i.m23587b(xVar, "baseListFragmentPanel");
        this.f76414h = xVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.ug);
    }

    /* renamed from: a */
    public final void mo74329a(int i) {
        if (i == 0) {
            View view = this.f76411d;
            if (view != null) {
                view.setVisibility(0);
            }
            return;
        }
        View view2 = this.f76411d;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo74332a(boolean z) {
        if (this.f76411d == null) {
            this.f76417k = z;
            return;
        }
        View view = this.f76411d;
        if (view != null) {
            if (z) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        C7573i.m23582a((Object) dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window2 = activity.getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(48);
            }
        }
        getDialog().setOnKeyListener(new C29008c(this));
        getDialog().setCanceledOnTouchOutside(false);
        getDialog().setCancelable(false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            this.f76415i = (SlideData) C0069x.m159a(activity).mo147a(SlideData.class);
            this.f76416j = new C29009d(this);
            if (this.f76416j != null) {
                SlideData slideData = this.f76415i;
                if (slideData != null) {
                    C0052o a = slideData.mo60648a();
                    if (a != null) {
                        FragmentActivity activity2 = getActivity();
                        if (activity2 == null) {
                            C7573i.m23580a();
                        }
                        C0043i iVar = activity2;
                        C0053p<Float> pVar = this.f76416j;
                        if (pVar == null) {
                            C7573i.m23580a();
                        }
                        a.observe(iVar, pVar);
                    }
                }
            }
        }
        m95241d();
        mo74332a(this.f76417k);
    }

    /* renamed from: a */
    public final void mo74330a(int i, float f, int i2) {
        C29012b bVar = this.f76413g;
        if (bVar != null) {
            bVar.mo84328d();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup viewGroup2;
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.nu, viewGroup, false);
        this.f76411d = inflate;
        C7573i.m23582a((Object) inflate, "view");
        VideoSeekBar videoSeekBar = (VideoSeekBar) inflate.findViewById(R.id.ebh);
        C7573i.m23582a((Object) videoSeekBar, "view.video_seek_bar");
        this.f76408a = videoSeekBar;
        DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout = (DispatchTouchEventLinearLayout) inflate.findViewById(R.id.ob);
        C7573i.m23582a((Object) dispatchTouchEventLinearLayout, "view.bottom_space");
        this.f76409b = dispatchTouchEventLinearLayout;
        if (this.f76412e) {
            DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout2 = this.f76409b;
            if (dispatchTouchEventLinearLayout2 == null) {
                C7573i.m23583a("mDispatchTouchEventLinearLayout");
            }
            LayoutParams layoutParams2 = dispatchTouchEventLinearLayout2.getLayoutParams();
            if (layoutParams2 != null) {
                ((MarginLayoutParams) layoutParams2).bottomMargin = (int) C9738o.m28708b(getContext(), 13.0f);
                DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout3 = this.f76409b;
                if (dispatchTouchEventLinearLayout3 == null) {
                    C7573i.m23583a("mDispatchTouchEventLinearLayout");
                }
                dispatchTouchEventLinearLayout3.setLayoutParams(layoutParams2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        Dialog dialog = getDialog();
        C7573i.m23582a((Object) dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        if (window != null) {
            window.setSoftInputMode(34);
        }
        if (window != null) {
            window.addFlags(32);
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        if (window != null) {
            window.setGravity(80);
        }
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        DispatchTouchEventLinearLayout dispatchTouchEventLinearLayout4 = this.f76409b;
        if (dispatchTouchEventLinearLayout4 == null) {
            C7573i.m23583a("mDispatchTouchEventLinearLayout");
        }
        dispatchTouchEventLinearLayout4.setDispatchTouchEventCallBack(this.f76410c);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            viewGroup2 = (ViewGroup) activity.findViewById(16908290);
        } else {
            viewGroup2 = null;
        }
        View inflate2 = LayoutInflater.from(getActivity()).inflate(R.layout.jq, null, false);
        if (inflate2 != null) {
            LinearLayout linearLayout = (LinearLayout) inflate2;
            if (viewGroup2 != null) {
                viewGroup2.addView(linearLayout);
            }
            LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                layoutParams3.width = -1;
                layoutParams3.height = -2;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = 80;
                layoutParams4.bottomMargin = (int) C9738o.m28708b((Context) getActivity(), 116.0f);
                linearLayout.setLayoutParams(layoutParams3);
            }
            VideoSeekBar videoSeekBar2 = this.f76408a;
            if (videoSeekBar2 == null) {
                C7573i.m23583a("mVideoSeekBar");
            }
            this.f76413g = new C29012b(videoSeekBar2, linearLayout, this.f76414h);
            C28648x xVar = this.f76414h;
            if (xVar != null) {
                C29012b bVar = this.f76413g;
                if (bVar != null) {
                    bVar.f85573n = xVar.mo71904aj();
                }
                C29012b bVar2 = this.f76413g;
                if (bVar2 != null) {
                    bVar2.onFullFeedVideoChangeEvent(new C29001a(xVar.mo71904aj(), xVar.aw_(), xVar.mo71888Y(), xVar));
                }
            }
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }
}
