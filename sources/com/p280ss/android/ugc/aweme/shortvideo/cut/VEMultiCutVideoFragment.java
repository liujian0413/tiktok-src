package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.DefaultItemAnimator;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.helper.ItemTouchHelper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.facebook.ads.AdError;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13396a;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.imported.C32068d;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter.C38727a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38786e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39193g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentTouchCallback;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39163a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39171i;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.C39249a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.C39293a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40308e;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtAutoRTLImageView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtCheckableImageButton;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtView;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment */
public final class VEMultiCutVideoFragment extends VECutVideoFragment {

    /* renamed from: A */
    public View f100583A;

    /* renamed from: B */
    public C0902i<Integer, Integer> f100584B;

    /* renamed from: C */
    public boolean f100585C;

    /* renamed from: D */
    public ValueAnimator f100586D;

    /* renamed from: E */
    public int f100587E;

    /* renamed from: F */
    public int f100588F;

    /* renamed from: G */
    public int f100589G;

    /* renamed from: H */
    public boolean f100590H = true;

    /* renamed from: I */
    public long f100591I;

    /* renamed from: J */
    public AnimatorSet f100592J;

    /* renamed from: K */
    public boolean f100593K;

    /* renamed from: L */
    private boolean f100594L;

    /* renamed from: M */
    private boolean f100595M;

    /* renamed from: N */
    private AbstractVideoEditView f100596N;

    /* renamed from: O */
    private HashMap f100597O;

    /* renamed from: w */
    public VideoSegmentAdapter f100598w;

    /* renamed from: x */
    public float f100599x = 1.0f;

    /* renamed from: y */
    public float f100600y;

    /* renamed from: z */
    public float f100601z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$VideoLayoutManager */
    final class VideoLayoutManager extends LinearLayoutManager {

        /* renamed from: a */
        public final VideoSmoothScroller f100602a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$VideoLayoutManager$VideoSmoothScroller */
        public final class VideoSmoothScroller extends LinearSmoothScroller {
            /* renamed from: a */
            public final float mo5464a(DisplayMetrics displayMetrics) {
                C7573i.m23587b(displayMetrics, "displayMetrics");
                return 200.0f / ((float) displayMetrics.densityDpi);
            }

            /* renamed from: b */
            public final int mo5472b(int i) {
                if (i > 2000) {
                    i = AdError.SERVER_ERROR_CODE;
                }
                return super.mo5472b(i);
            }

            public VideoSmoothScroller(Context context) {
                super(context);
            }
        }

        public VideoLayoutManager(Context context) {
            super(context, 0, false);
            this.f100602a = new VideoSmoothScroller(context);
        }

        /* renamed from: a */
        public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
            C7573i.m23587b(recyclerView, "recyclerView");
            VideoSmoothScroller videoSmoothScroller = this.f100602a;
            videoSmoothScroller.f4993g = i;
            mo5755a((C1287r) videoSmoothScroller);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$a */
    static final class C38706a<T> implements C0053p<C0902i<Integer, Integer>> {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100605a;

        C38706a(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100605a = vEMultiCutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C0902i<Integer, Integer> iVar) {
            if (iVar != null) {
                VEMultiCutVideoFragment vEMultiCutVideoFragment = this.f100605a;
                F f = iVar.f3154a;
                if (f == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) f, "pair.first!!");
                int intValue = ((Number) f).intValue();
                S s = iVar.f3155b;
                if (s == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) s, "pair.second!!");
                vEMultiCutVideoFragment.mo96772b(intValue, ((Number) s).intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$b */
    public static final class C38707b implements C39249a {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100606a;

        C38707b(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100606a = vEMultiCutVideoFragment;
        }

        /* renamed from: a */
        public final void mo96777a(VideoSegment videoSegment) {
            VideoSegmentAdapter videoSegmentAdapter = this.f100606a.f100598w;
            if (videoSegmentAdapter != null) {
                videoSegmentAdapter.mo96804a(videoSegment);
            }
        }

        /* renamed from: b */
        public final void mo96778b(VideoSegment videoSegment) {
            this.f100606a.f100591I = System.currentTimeMillis();
            VideoSegmentAdapter videoSegmentAdapter = this.f100606a.f100598w;
            if (videoSegmentAdapter != null) {
                videoSegmentAdapter.mo96808b(videoSegment);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$c */
    static final class C38708c<T> implements C0053p<C0902i<Integer, Integer>> {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100607a;

        C38708c(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100607a = vEMultiCutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C0902i<Integer, Integer> iVar) {
            this.f100607a.mo96767L();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$d */
    static final class C38709d<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100608a;

        C38709d(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100608a = vEMultiCutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f100608a.mo96770a(false, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$e */
    static final class C38710e<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100609a;

        C38710e(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100609a = vEMultiCutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f100609a.mo96770a(true, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$f */
    static final class C38711f<T> implements C0053p<VideoSegment> {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100610a;

        C38711f(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100610a = vEMultiCutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(VideoSegment videoSegment) {
            this.f100610a.mo96770a(false, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$g */
    static final class C38712g<T> implements C0053p<C38786e> {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100611a;

        C38712g(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100611a = vEMultiCutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C38786e eVar) {
            Integer num;
            if (eVar != null) {
                num = Integer.valueOf(eVar.f100800b);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                if (this.f100611a.f100590H) {
                    this.f100611a.f100589G = eVar.f100801c;
                    this.f100611a.mo96776e(true);
                    this.f100611a.mo96699i().mo97802a(new C39293a(2, false));
                }
                this.f100611a.f100590H = false;
                return;
            }
            if ((num == null || num.intValue() != 1) && num != null && num.intValue() == 2) {
                this.f100611a.mo96776e(false);
                this.f100611a.mo96769a(eVar.f100802d, this.f100611a.f100589G, eVar.f100799a);
                C39163a aVar = this.f100611a.f100433g;
                if (aVar != null) {
                    aVar.mo97375a(this.f100611a.f100589G, eVar.f100802d);
                }
                this.f100611a.f100590H = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$h */
    static final class C38713h implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100612a;

        C38713h(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100612a = vEMultiCutVideoFragment;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AVDmtView aVDmtView;
            float f;
            VideoSegmentAdapter videoSegmentAdapter = this.f100612a.f100598w;
            if (videoSegmentAdapter == null) {
                C7573i.m23580a();
            }
            int a = videoSegmentAdapter.mo96796a((RecyclerView) (AVDmtPanelRecyleView) this.f100612a.mo96687a((int) R.id.ea5), this.f100612a.f100587E);
            VideoSegmentAdapter videoSegmentAdapter2 = this.f100612a.f100598w;
            if (videoSegmentAdapter2 == null) {
                C7573i.m23580a();
            }
            int a2 = videoSegmentAdapter2.mo96796a((RecyclerView) (AVDmtPanelRecyleView) this.f100612a.mo96687a((int) R.id.ea5), this.f100612a.f100588F);
            if (a == -1 && a2 == -1) {
                AVDmtView aVDmtView2 = (AVDmtView) this.f100612a.mo96687a((int) R.id.g_);
                C7573i.m23582a((Object) aVDmtView2, "animTabDot");
                aVDmtView2.setTranslationX(0.0f);
                AVDmtView aVDmtView3 = (AVDmtView) this.f100612a.mo96687a((int) R.id.g_);
                C7573i.m23582a((Object) aVDmtView3, "animTabDot");
                aVDmtView3.setVisibility(4);
                return;
            }
            if (a < 0 || a2 < 0) {
                AVDmtView aVDmtView4 = (AVDmtView) this.f100612a.mo96687a((int) R.id.g_);
                C7573i.m23582a((Object) aVDmtView4, "animTabDot");
                aVDmtView4.setVisibility(0);
                aVDmtView = (AVDmtView) this.f100612a.mo96687a((int) R.id.g_);
                C7573i.m23582a((Object) aVDmtView, "animTabDot");
                if (a2 == -1) {
                    f = (float) a;
                } else {
                    f = (float) a2;
                }
            } else {
                AVDmtView aVDmtView5 = (AVDmtView) this.f100612a.mo96687a((int) R.id.g_);
                C7573i.m23582a((Object) aVDmtView5, "animTabDot");
                aVDmtView5.setVisibility(0);
                C7573i.m23582a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = (((Float) animatedValue).floatValue() * ((float) (a2 - a))) + ((float) a);
                    AVDmtView aVDmtView6 = (AVDmtView) this.f100612a.mo96687a((int) R.id.g_);
                    C7573i.m23582a((Object) aVDmtView6, "animTabDot");
                    AVDmtView aVDmtView7 = aVDmtView6;
                    f = floatValue;
                    aVDmtView = aVDmtView7;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            }
            aVDmtView.setX(f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$i */
    public static final class C38714i implements C39171i {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100613a;

        /* renamed from: c */
        public final List<VideoSegment> mo96784c() {
            List<VideoSegment> n = this.f100613a.mo96698h().mo97721n();
            C7573i.m23582a((Object) n, "videoEditViewModel.originVideoList");
            return n;
        }

        /* renamed from: a */
        public final void mo96780a() {
            this.f100613a.mo96699i().mo97802a(new C39293a(1, false, 2, null));
        }

        /* renamed from: b */
        public final void mo96783b() {
            this.f100613a.mo96700j().mo96743a(this.f100613a.mo96698h().mo97721n(), false);
        }

        C38714i(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100613a = vEMultiCutVideoFragment;
        }

        /* renamed from: a */
        public final void mo96781a(List<? extends VideoSegment> list) {
            this.f100613a.mo96700j().mo96742a(list, this.f100613a.mo96698h().mo97721n().size());
        }

        /* renamed from: a */
        public final void mo96782a(boolean z, boolean z2) {
            this.f100613a.mo96700j().mo96744a(z);
            if (z2) {
                this.f100613a.mo96700j().mo96743a(this.f100613a.mo96698h().mo97721n(), !z);
            }
            if (z) {
                this.f100613a.f100432f = false;
                VideoSegmentAdapter videoSegmentAdapter = this.f100613a.f100598w;
                if (videoSegmentAdapter == null) {
                    C7573i.m23580a();
                }
                videoSegmentAdapter.f100640b = 0;
                return;
            }
            boolean z3 = true;
            if (z2) {
                VECutVideoPresenter j = this.f100613a.mo96700j();
                C0902i playBoundary = this.f100613a.mo96768a().getPlayBoundary();
                C7573i.m23582a((Object) playBoundary, "videoEditView().playBoundary");
                j.mo96738a(playBoundary);
                VEVideoCutterViewModel i = this.f100613a.mo96699i();
                F f = this.f100613a.mo96768a().getPlayBoundary().f3154a;
                if (f == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) f, "videoEditView().playBoundary.first!!");
                i.mo97802a(new C39293a(3, ((Number) f).longValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
            } else {
                this.f100613a.mo96699i().mo97802a(new C39293a(1, false));
            }
            VEMultiCutVideoFragment vEMultiCutVideoFragment = this.f100613a;
            if (this.f100613a.f100428b || this.f100613a.f100429c) {
                z3 = false;
            }
            vEMultiCutVideoFragment.f100432f = z3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$j */
    static final class C38715j implements C38727a {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100614a;

        C38715j(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100614a = vEMultiCutVideoFragment;
        }

        /* renamed from: a */
        public final void mo96785a(View view, int i, String str) {
            ArrayList arrayList;
            if (this.f100614a.f100434h != 2 && !this.f100614a.f100593K) {
                if (i == 10003) {
                    C39182e eVar = C39182e.f101552a;
                    Activity activity = this.f100614a.getActivity();
                    VideoSegmentAdapter videoSegmentAdapter = this.f100614a.f100598w;
                    Long l = null;
                    if (videoSegmentAdapter != null) {
                        arrayList = videoSegmentAdapter.mo96807b();
                    } else {
                        arrayList = null;
                    }
                    VideoSegmentAdapter videoSegmentAdapter2 = this.f100614a.f100598w;
                    if (videoSegmentAdapter2 != null) {
                        l = Long.valueOf(videoSegmentAdapter2.mo96810c());
                    }
                    if (l == null) {
                        C7573i.m23580a();
                    }
                    eVar.mo97468a(activity, arrayList, l.longValue());
                    return;
                }
                this.f100614a.f100430d = i;
                this.f100614a.f100431e = this.f100614a.mo96698h().mo97688a(str);
                if (this.f100614a.f100431e < 0) {
                    StringBuilder sb = new StringBuilder("edit index:");
                    sb.append(this.f100614a.f100430d);
                    sb.append(", origin_index:");
                    sb.append(this.f100614a.f100431e);
                    sb.append(", path:");
                    sb.append(str);
                    C41530am.m132284c(sb.toString());
                    return;
                }
                this.f100614a.mo96697g().mo96664a(this.f100614a.f100430d, this.f100614a.f100431e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$k */
    static final class C38716k implements OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100615a;

        C38716k(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100615a = vEMultiCutVideoFragment;
        }

        public final boolean onPreDraw() {
            int i;
            int i2;
            ValueAnimator valueAnimator = this.f100615a.f100586D;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                VideoSegmentAdapter videoSegmentAdapter = this.f100615a.f100598w;
                if (videoSegmentAdapter != null) {
                    AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) this.f100615a.mo96687a((int) R.id.ea5);
                    VideoSegmentAdapter videoSegmentAdapter2 = this.f100615a.f100598w;
                    if (videoSegmentAdapter2 != null) {
                        i2 = videoSegmentAdapter2.f100640b;
                    } else {
                        i2 = 0;
                    }
                    i = videoSegmentAdapter.mo96796a((RecyclerView) aVDmtPanelRecyleView, i2);
                } else {
                    i = -1;
                }
                if (i == -1) {
                    AVDmtView aVDmtView = (AVDmtView) this.f100615a.mo96687a((int) R.id.g_);
                    C7573i.m23582a((Object) aVDmtView, "animTabDot");
                    aVDmtView.setVisibility(4);
                } else {
                    AVDmtView aVDmtView2 = (AVDmtView) this.f100615a.mo96687a((int) R.id.g_);
                    C7573i.m23582a((Object) aVDmtView2, "animTabDot");
                    aVDmtView2.setVisibility(0);
                    AVDmtView aVDmtView3 = (AVDmtView) this.f100615a.mo96687a((int) R.id.g_);
                    C7573i.m23582a((Object) aVDmtView3, "animTabDot");
                    aVDmtView3.setX((float) i);
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$l */
    static final class C38717l implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100616a;

        C38717l(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100616a = vEMultiCutVideoFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Integer num;
            if (motionEvent != null) {
                num = Integer.valueOf(motionEvent.getAction());
            } else {
                num = null;
            }
            if ((num != null && num.intValue() == 0) || ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 1))) {
                this.f100616a.f100591I = System.currentTimeMillis();
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$m */
    static final class C38718m extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100617a;

        C38718m(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100617a = vEMultiCutVideoFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m123660a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m123660a() {
            this.f100617a.mo96697g().mo96667a((VideoSegment) this.f100617a.mo96698h().mo97721n().get(this.f100617a.f100431e));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$n */
    static final class C38719n implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f100618a;

        C38719n(C7561a aVar) {
            this.f100618a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f100618a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$o */
    public static final class C38720o implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100619a;

        C38720o(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100619a = vEMultiCutVideoFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39193g.f101577a.mo97487c(this.f100619a.mo96698h().mo97721n(), this.f100619a.mo96683G());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$p */
    static final class C38721p implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100620a;

        C38721p(VEMultiCutVideoFragment vEMultiCutVideoFragment) {
            this.f100620a = vEMultiCutVideoFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f100620a.mo96680D();
            C39193g.f101577a.mo97484b(this.f100620a.mo96698h().mo97721n(), this.f100620a.mo96683G());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$q */
    public static final class C38722q implements OnPreDrawListener {

        /* renamed from: a */
        public final int f100621a;

        /* renamed from: b */
        final /* synthetic */ VEMultiCutVideoFragment f100622b;

        /* renamed from: c */
        final /* synthetic */ int f100623c;

        /* renamed from: d */
        final /* synthetic */ Rect f100624d;

        /* renamed from: e */
        final /* synthetic */ boolean f100625e;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$q$a */
        public static final class C38723a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C38722q f100626a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f100627b;

            public final void onAnimationEnd(Animator animator) {
                C7573i.m23587b(animator, "animation");
                super.onAnimationEnd(animator);
                FragmentActivity activity = this.f100626a.f100622b.getActivity();
                if (activity == null || !activity.isFinishing()) {
                    this.f100626a.f100622b.mo96701k().f104694a = true;
                    if (this.f100626a.f100622b.mo96683G()) {
                        C39163a aVar = this.f100626a.f100622b.f100433g;
                        if (aVar != null) {
                            aVar.mo97395f(false);
                        }
                    } else {
                        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) this.f100626a.f100622b.mo96687a((int) R.id.ea5);
                        C7573i.m23582a((Object) aVDmtPanelRecyleView, "videoRecyclerView");
                        aVDmtPanelRecyleView.setVisibility(8);
                    }
                    AVDmtImageView aVDmtImageView = (AVDmtImageView) this.f100626a.f100622b.mo96687a((int) R.id.b5o);
                    C7573i.m23582a((Object) aVDmtImageView, "ivSave");
                    aVDmtImageView.setVisibility(0);
                    AVDmtImageView aVDmtImageView2 = (AVDmtImageView) this.f100626a.f100622b.mo96687a((int) R.id.b5h);
                    C7573i.m23582a((Object) aVDmtImageView2, "ivCancel");
                    aVDmtImageView2.setVisibility(0);
                    FrameLayout frameLayout = (FrameLayout) this.f100626a.f100622b.mo96687a((int) R.id.alq);
                    C7573i.m23582a((Object) frameLayout, "flEditVideo");
                    frameLayout.setVisibility(0);
                    VideoSegmentAdapter videoSegmentAdapter = this.f100626a.f100622b.f100598w;
                    if (videoSegmentAdapter == null) {
                        C7573i.m23580a();
                    }
                    videoSegmentAdapter.f100642d = false;
                    this.f100626a.f100622b.mo96682F();
                }
            }

            C38723a(C38722q qVar, ArrayList arrayList) {
                this.f100626a = qVar;
                this.f100627b = arrayList;
            }
        }

        public final boolean onPreDraw() {
            View view;
            float f;
            float f2;
            FrameLayout frameLayout = (FrameLayout) this.f100622b.mo96687a((int) R.id.alq);
            C7573i.m23582a((Object) frameLayout, "flEditVideo");
            View rootView = frameLayout.getRootView();
            C7573i.m23582a((Object) rootView, "flEditVideo.rootView");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            VEMultiCutVideoFragment vEMultiCutVideoFragment = this.f100622b;
            VEMultiCutVideoFragment vEMultiCutVideoFragment2 = this.f100622b;
            int i = R.id.ea5;
            C1293v f3 = ((AVDmtPanelRecyleView) vEMultiCutVideoFragment2.mo96687a((int) R.id.ea5)).mo5575f(this.f100623c);
            if (f3 != null) {
                view = f3.itemView;
            } else {
                view = null;
            }
            vEMultiCutVideoFragment.f100583A = view;
            this.f100622b.f100584B = C32068d.m104096a((RecyclerView) (AVDmtPanelRecyleView) this.f100622b.mo96687a((int) R.id.ea5));
            if (this.f100624d == null || this.f100622b.f100583A == null) {
                return false;
            }
            View view2 = this.f100622b.f100583A;
            if (view2 != null) {
                ArrayList arrayList = new ArrayList();
                C0902i<Integer, Integer> iVar = this.f100622b.f100584B;
                if (iVar != null) {
                    F f4 = iVar.f3154a;
                    if (f4 == null) {
                        C7573i.m23580a();
                    }
                    C7573i.m23582a((Object) f4, "range.first!!");
                    int intValue = ((Number) f4).intValue();
                    int i2 = this.f100623c;
                    while (intValue < i2) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) this.f100622b.mo96687a(i);
                        if (aVDmtPanelRecyleView == null) {
                            C7573i.m23580a();
                        }
                        C1293v f5 = aVDmtPanelRecyleView.mo5575f(intValue);
                        if (f5 != null) {
                            C7573i.m23582a((Object) f5, "videoRecyclerView!!.find…              ?: continue");
                            if (this.f100625e) {
                                View view3 = f5.itemView;
                                C7573i.m23582a((Object) view3, "viewHolder.itemView");
                                f2 = view3.getTranslationX() + ((float) (this.f100621a - this.f100624d.right));
                            } else {
                                View view4 = f5.itemView;
                                C7573i.m23582a((Object) view4, "viewHolder.itemView");
                                f2 = view4.getTranslationX() - ((float) this.f100624d.left);
                            }
                            View view5 = f5.itemView;
                            C7573i.m23582a((Object) view5, "viewHolder.itemView");
                            animatorSet.play(ObjectAnimator.ofFloat(f5.itemView, "translationX", new float[]{view5.getTranslationX(), f2}));
                            animatorSet.setDuration(300);
                            arrayList.add(animatorSet);
                        }
                        intValue++;
                        i = R.id.ea5;
                    }
                    int i3 = this.f100623c + 1;
                    S s = iVar.f3155b;
                    if (s == null) {
                        C7573i.m23580a();
                    }
                    C7573i.m23582a((Object) s, "range.second!!");
                    int intValue2 = ((Number) s).intValue();
                    if (i3 <= intValue2) {
                        while (true) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            C1293v f6 = ((AVDmtPanelRecyleView) this.f100622b.mo96687a((int) R.id.ea5)).mo5575f(i3);
                            if (f6 != null) {
                                C7573i.m23582a((Object) f6, "videoRecyclerView.findVi…              ?: continue");
                                if (this.f100625e) {
                                    View view6 = f6.itemView;
                                    C7573i.m23582a((Object) view6, "viewHolder.itemView");
                                    f = view6.getTranslationX() - ((float) this.f100624d.left);
                                } else {
                                    View view7 = f6.itemView;
                                    C7573i.m23582a((Object) view7, "viewHolder.itemView");
                                    f = view7.getTranslationX() + ((float) (this.f100621a - this.f100624d.right));
                                }
                                View view8 = f6.itemView;
                                C7573i.m23582a((Object) view8, "viewHolder.itemView");
                                animatorSet2.play(ObjectAnimator.ofFloat(f6.itemView, "translationX", new float[]{view8.getTranslationX(), f}));
                                animatorSet2.setDuration(300);
                                arrayList.add(animatorSet2);
                            }
                            if (i3 == intValue2) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
                FrameLayout frameLayout2 = (FrameLayout) this.f100622b.mo96687a((int) R.id.alq);
                C7573i.m23582a((Object) frameLayout2, "flEditVideo");
                int width = frameLayout2.getWidth();
                int width2 = this.f100624d.width();
                int[] iArr = new int[2];
                FrameLayout frameLayout3 = (FrameLayout) this.f100622b.mo96687a((int) R.id.alq);
                if (frameLayout3 == null) {
                    C7573i.m23580a();
                }
                frameLayout3.getLocationInWindow(iArr);
                this.f100622b.f100599x = (((float) width) * 1.0f) / ((float) width2);
                int i4 = iArr[0];
                FrameLayout frameLayout4 = (FrameLayout) this.f100622b.mo96687a((int) R.id.alq);
                C7573i.m23582a((Object) frameLayout4, "flEditVideo");
                float width3 = (float) (i4 + (frameLayout4.getWidth() / 2));
                int i5 = iArr[1];
                FrameLayout frameLayout5 = (FrameLayout) this.f100622b.mo96687a((int) R.id.alq);
                C7573i.m23582a((Object) frameLayout5, "flEditVideo");
                float height = (float) (i5 + (frameLayout5.getHeight() / 2));
                this.f100622b.f100600y = width3 - ((float) this.f100624d.centerX());
                this.f100622b.f100601z = height - ((float) this.f100624d.centerY());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(300);
                animatorSet3.play(ObjectAnimator.ofFloat(view2, "translationX", new float[]{0.0f, this.f100622b.f100600y})).with(ObjectAnimator.ofFloat(view2, "translationY", new float[]{0.0f, this.f100622b.f100601z})).with(ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, this.f100622b.f100599x})).with(ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, this.f100622b.f100599x}));
                arrayList.add(animatorSet3);
                VEMultiCutVideoFragment vEMultiCutVideoFragment3 = this.f100622b;
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(arrayList);
                animatorSet4.addListener(new C38723a(this, arrayList));
                vEMultiCutVideoFragment3.f100592J = animatorSet4;
                AnimatorSet animatorSet5 = this.f100622b.f100592J;
                if (animatorSet5 != null) {
                    animatorSet5.start();
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }

        C38722q(VEMultiCutVideoFragment vEMultiCutVideoFragment, int i, Rect rect, boolean z) {
            this.f100622b = vEMultiCutVideoFragment;
            this.f100623c = i;
            this.f100624d = rect;
            this.f100625e = z;
            this.f100621a = C39805en.m127447b(vEMultiCutVideoFragment.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$r */
    public static final class C38724r implements OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ VEMultiCutVideoFragment f100628a;

        /* renamed from: b */
        final /* synthetic */ int f100629b;

        /* renamed from: c */
        final /* synthetic */ boolean f100630c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$r$a */
        public static final class C38725a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C38724r f100631a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f100632b;

            public final void onAnimationEnd(Animator animator) {
                C7573i.m23587b(animator, "animation");
                super.onAnimationEnd(animator);
                FragmentActivity activity = this.f100631a.f100628a.getActivity();
                if (activity == null || !activity.isFinishing()) {
                    this.f100631a.f100628a.mo96701k().f104694a = true;
                    FrameLayout frameLayout = (FrameLayout) this.f100631a.f100628a.mo96687a((int) R.id.alq);
                    C7573i.m23582a((Object) frameLayout, "flEditVideo");
                    frameLayout.setVisibility(8);
                    if (this.f100631a.f100630c) {
                        this.f100631a.f100628a.mo96698h().mo97708c(((VideoSegment) this.f100631a.f100628a.mo96698h().mo97721n().get(this.f100631a.f100628a.f100431e)).mo96908g());
                    }
                    VideoSegmentAdapter videoSegmentAdapter = this.f100631a.f100628a.f100598w;
                    if (videoSegmentAdapter == null) {
                        C7573i.m23580a();
                    }
                    videoSegmentAdapter.f100642d = true;
                    this.f100631a.f100628a.mo96682F();
                    this.f100631a.f100628a.f100585C = false;
                }
            }

            C38725a(C38724r rVar, ArrayList arrayList) {
                this.f100631a = rVar;
                this.f100632b = arrayList;
            }
        }

        public final boolean onPreDraw() {
            int i;
            int i2;
            VEMultiCutVideoFragment vEMultiCutVideoFragment = this.f100628a;
            int i3 = R.id.ea5;
            AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) vEMultiCutVideoFragment.mo96687a((int) R.id.ea5);
            C7573i.m23582a((Object) aVDmtPanelRecyleView, "videoRecyclerView");
            View rootView = aVDmtPanelRecyleView.getRootView();
            C7573i.m23582a((Object) rootView, "videoRecyclerView.rootView");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.f100628a.f100583A == null || this.f100628a.f100584B == null) {
                return false;
            }
            View view = this.f100628a.f100583A;
            if (view != null) {
                ArrayList arrayList = new ArrayList();
                C0902i<Integer, Integer> iVar = this.f100628a.f100584B;
                if (iVar == null) {
                    C7573i.m23580a();
                }
                F f = iVar.f3154a;
                if (f == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) f, "visibleRage!!.first!!");
                int intValue = ((Number) f).intValue();
                int i4 = this.f100629b;
                while (true) {
                    i = 2;
                    if (intValue >= i4) {
                        break;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    AVDmtPanelRecyleView aVDmtPanelRecyleView2 = (AVDmtPanelRecyleView) this.f100628a.mo96687a(i3);
                    if (aVDmtPanelRecyleView2 == null) {
                        C7573i.m23580a();
                    }
                    C1293v f2 = aVDmtPanelRecyleView2.mo5575f(intValue);
                    if (f2 != null) {
                        C7573i.m23582a((Object) f2, "videoRecyclerView!!.find…              ?: continue");
                        View view2 = f2.itemView;
                        C7573i.m23582a((Object) view2, "viewHolder.itemView");
                        animatorSet.play(ObjectAnimator.ofFloat(f2.itemView, "translationX", new float[]{view2.getTranslationX(), 0.0f}));
                        animatorSet.setDuration(300);
                        arrayList.add(animatorSet);
                    }
                    intValue++;
                    i3 = R.id.ea5;
                }
                int i5 = this.f100629b + 1;
                C0902i<Integer, Integer> iVar2 = this.f100628a.f100584B;
                if (iVar2 == null) {
                    C7573i.m23580a();
                }
                S s = iVar2.f3155b;
                if (s == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) s, "visibleRage!!.second!!");
                int intValue2 = ((Number) s).intValue();
                if (i5 <= intValue2) {
                    while (true) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        AVDmtPanelRecyleView aVDmtPanelRecyleView3 = (AVDmtPanelRecyleView) this.f100628a.mo96687a((int) R.id.ea5);
                        if (aVDmtPanelRecyleView3 == null) {
                            C7573i.m23580a();
                        }
                        C1293v f3 = aVDmtPanelRecyleView3.mo5575f(i5);
                        if (f3 != null) {
                            C7573i.m23582a((Object) f3, "videoRecyclerView!!.find…              ?: continue");
                            float[] fArr = new float[i];
                            View view3 = f3.itemView;
                            C7573i.m23582a((Object) view3, "viewHolder.itemView");
                            fArr[0] = view3.getTranslationX();
                            fArr[1] = 0.0f;
                            animatorSet2.play(ObjectAnimator.ofFloat(f3.itemView, "translationX", fArr));
                            animatorSet2.setDuration(300);
                            arrayList.add(animatorSet2);
                        }
                        if (i5 == intValue2) {
                            break;
                        }
                        i5++;
                        i = 2;
                    }
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(300);
                animatorSet3.play(ObjectAnimator.ofFloat(view, "translationX", new float[]{view.getTranslationX(), 0.0f})).with(ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), 0.0f})).with(ObjectAnimator.ofFloat(view, "scaleX", new float[]{view.getScaleX(), 1.0f})).with(ObjectAnimator.ofFloat(view, "scaleY", new float[]{view.getScaleY(), 1.0f}));
                arrayList.add(animatorSet3);
                VEMultiCutVideoFragment vEMultiCutVideoFragment2 = this.f100628a;
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(arrayList);
                animatorSet4.addListener(new C38725a(this, arrayList));
                vEMultiCutVideoFragment2.f100592J = animatorSet4;
                AnimatorSet animatorSet5 = this.f100628a.f100592J;
                if (animatorSet5 != null) {
                    animatorSet5.start();
                }
                VideoSegmentAdapter videoSegmentAdapter = this.f100628a.f100598w;
                if (videoSegmentAdapter == null) {
                    C7573i.m23580a();
                }
                if (this.f100628a.mo96683G()) {
                    i2 = this.f100628a.f100430d;
                } else {
                    i2 = 0;
                }
                videoSegmentAdapter.f100640b = i2;
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }

        C38724r(VEMultiCutVideoFragment vEMultiCutVideoFragment, int i, boolean z) {
            this.f100628a = vEMultiCutVideoFragment;
            this.f100629b = i;
            this.f100630c = z;
        }
    }

    /* renamed from: J */
    public final void mo96686J() {
        if (this.f100597O != null) {
            this.f100597O.clear();
        }
    }

    /* renamed from: a */
    public final View mo96687a(int i) {
        if (this.f100597O == null) {
            this.f100597O = new HashMap();
        }
        View view = (View) this.f100597O.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f100597O.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo96686J();
    }

    /* renamed from: x */
    public final boolean mo96715x() {
        return true;
    }

    /* renamed from: a */
    public final void mo96691a(C15389d dVar) {
        C39163a aVar = this.f100433g;
        if (aVar != null) {
            aVar.mo97380a(dVar);
        }
    }

    /* renamed from: a */
    public final void mo96770a(boolean z, boolean z2) {
        if (z2) {
            VideoSegmentAdapter videoSegmentAdapter = this.f100598w;
            if (videoSegmentAdapter != null && videoSegmentAdapter.mo96795a() == 0) {
                mo96679C();
                return;
            }
        }
        m123607N();
        C39163a aVar = this.f100433g;
        if (aVar != null) {
            aVar.mo97390d();
        }
        C39163a aVar2 = this.f100433g;
        if (aVar2 != null) {
            aVar2.mo97388b(z, z2);
        }
        mo96700j().mo96745a(z, z2);
        C0902i playBoundary = mo96768a().getPlayBoundary();
        if (mo96683G()) {
            List<VideoSegment> n = mo96698h().mo97721n();
            C7573i.m23582a((Object) n, "videoEditViewModel.originVideoList");
            long j = 0;
            for (VideoSegment videoSegment : n) {
                if (!videoSegment.f100768j) {
                    C7573i.m23582a((Object) videoSegment, "it");
                    j += videoSegment.mo96910i() - videoSegment.mo96909h();
                }
            }
            playBoundary = new C0902i(Long.valueOf(0), Long.valueOf(j));
        }
        VECutVideoPresenter j2 = mo96700j();
        C7573i.m23582a((Object) playBoundary, "boundary");
        j2.mo96738a(playBoundary);
        if (z2) {
            mo96697g().mo96662a();
        }
        VEVideoCutterViewModel i = mo96699i();
        Long l = (Long) playBoundary.f3154a;
        if (l == null) {
            l = Long.valueOf(0);
        }
        i.mo97802a(new C39293a(3, l.longValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
        m123616b(z, z2);
        this.f100439m.removeCallbacks(this.f100440n);
        this.f100439m.post(this.f100440n);
        C39193g.f101577a.mo97482a(mo96683G(), false, z, !z, z2, false);
    }

    /* renamed from: D */
    public final void mo96680D() {
        super.mo96680D();
        C39163a aVar = this.f100433g;
        if (aVar != null) {
            aVar.mo97398h();
        }
    }

    /* renamed from: K */
    public final SurfaceView mo96766K() {
        SurfaceView surfaceView = (SurfaceView) mo96687a((int) R.id.ea6);
        C7573i.m23582a((Object) surfaceView, "videoSurface");
        return surfaceView;
    }

    /* renamed from: a */
    public final AbstractVideoEditView mo96768a() {
        AbstractVideoEditView abstractVideoEditView = this.f100596N;
        if (abstractVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        return abstractVideoEditView;
    }

    public final void onPause() {
        super.onPause();
        C39163a aVar = this.f100433g;
        if (aVar != null) {
            aVar.mo97394f();
        }
    }

    public final void onResume() {
        super.onResume();
        C39163a aVar = this.f100433g;
        if (aVar != null) {
            aVar.mo97396g();
        }
    }

    /* renamed from: q */
    public final void mo96708q() {
        C39163a aVar = this.f100433g;
        if (aVar != null) {
            aVar.mo97392e();
        }
    }

    /* renamed from: w */
    public final void mo96714w() {
        super.mo96714w();
        C39163a aVar = this.f100433g;
        if (aVar != null) {
            aVar.mo97399i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo96678B() {
        VideoSegmentAdapter videoSegmentAdapter = this.f100598w;
        if (videoSegmentAdapter == null || videoSegmentAdapter.mo96795a() != 0) {
            m123609P();
        } else {
            mo96680D();
        }
    }

    /* renamed from: G */
    public final boolean mo96683G() {
        if (this.f100433g == null) {
            return false;
        }
        C39163a aVar = this.f100433g;
        if (aVar == null) {
            C7573i.m23580a();
        }
        return aVar.mo97400j();
    }

    /* renamed from: H */
    public final AVMusic mo96684H() {
        if (!mo96683G()) {
            return null;
        }
        C39163a aVar = this.f100433g;
        if (aVar != null) {
            return aVar.mo97402l();
        }
        return null;
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

    public final void onDestroy() {
        super.onDestroy();
        ValueAnimator valueAnimator = this.f100586D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnimatorSet animatorSet = this.f100592J;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m123610Q() {
        /*
            r5 = this;
            android.os.Bundle r0 = r5.getArguments()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            java.lang.String r2 = "page_intent_data"
            android.os.Parcelable r0 = r0.getParcelable(r2)
            android.content.Intent r0 = (android.content.Intent) r0
            if (r0 == 0) goto L_0x0018
            java.lang.String r2 = "shoot_way"
            java.lang.String r0 = r0.getStringExtra(r2)
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            java.lang.String r2 = "system_upload"
            r3 = 2
            r4 = 0
            boolean r0 = kotlin.text.C7634n.m23717a(r0, r2, false)
            if (r0 == 0) goto L_0x0024
            return r4
        L_0x0024:
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e r0 = com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e.f101552a
            boolean r0 = r0.mo97470h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment.m123610Q():boolean");
    }

    /* renamed from: f */
    public final int mo96696f() {
        int i;
        if (m123610Q()) {
            if (C35563c.f93231M.mo93305a(Property.EnableUploadVideoSlideAutoJust)) {
                return R.layout.r3;
            }
            if (!C39182e.m125105i()) {
                return R.layout.r4;
            }
            i = R.layout.r2;
        } else if (C35563c.f93231M.mo93305a(Property.EnableUploadVideoSlideAutoJust)) {
            return R.layout.nn;
        } else {
            i = R.layout.nm;
        }
        return i;
    }

    /* renamed from: P */
    private final void m123609P() {
        Context context = getContext();
        if (context != null) {
            new C10741a(context).mo25657b((int) R.string.dau).mo25658b((int) R.string.cay, (OnClickListener) new C38720o(this)).mo25650a((int) R.string.bbe, (OnClickListener) new C38721p(this)).mo25656a().mo25637a().show();
            C39193g.f101577a.mo97480a(mo96698h().mo97721n(), mo96683G());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo96677A() {
        super.mo96677A();
        View.OnClickListener onClickListener = this;
        ((AVDmtImageView) mo96687a((int) R.id.b5n)).setOnClickListener(onClickListener);
        ((AVDmtImageView) mo96687a((int) R.id.b5i)).setOnClickListener(onClickListener);
        ((AVDmtImageView) mo96687a((int) R.id.b5o)).setOnClickListener(onClickListener);
        ((AVDmtImageView) mo96687a((int) R.id.b5h)).setOnClickListener(onClickListener);
        ((AVDmtCheckableImageButton) mo96687a((int) R.id.b5p)).setOnClickListener(onClickListener);
    }

    /* renamed from: L */
    public final void mo96767L() {
        float f;
        VideoSegment videoSegment = (VideoSegment) mo96698h().mo97721n().get(this.f100431e);
        C7573i.m23582a((Object) videoSegment, "curEditVideo");
        m123612a(videoSegment);
        mo96700j().mo96733a(this.f100431e);
        C39163a aVar = this.f100433g;
        if (aVar != null) {
            aVar.mo97377a(this.f100431e, videoSegment);
        }
        if (videoSegment.mo96911j() == 0.0f) {
            f = 1.0f;
        } else {
            f = videoSegment.mo96911j();
        }
        mo96699i().mo97802a(new C39293a(3, (long) (((float) videoSegment.mo96909h()) / f), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
        m123608O();
        C39193g.f101577a.mo97482a(mo96683G(), true, false, false, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo96717z() {
        super.mo96717z();
        C0043i iVar = this;
        mo96697g().f100394a.observe(iVar, new C38706a(this));
        mo96698h().f101856u = new C38707b(this);
        mo96698h().f101849n.observe(iVar, new C38708c(this));
        mo96698h().f101850o.observe(iVar, new C38709d(this));
        mo96698h().f101851p.observe(iVar, new C38710e(this));
        mo96698h().f101852q.observe(iVar, new C38711f(this));
        mo96697g().f100403j.observe(iVar, new C38712g(this));
    }

    /* renamed from: N */
    private final void m123607N() {
        AVDmtAutoRTLImageView aVDmtAutoRTLImageView = (AVDmtAutoRTLImageView) mo96687a((int) R.id.b5g);
        C7573i.m23582a((Object) aVDmtAutoRTLImageView, "ivBack");
        int i = 0;
        aVDmtAutoRTLImageView.setVisibility(0);
        TextView textView = (TextView) mo96687a((int) R.id.dq1);
        C7573i.m23582a((Object) textView, "tvNext");
        textView.setVisibility(0);
        AVDmtImageView aVDmtImageView = (AVDmtImageView) mo96687a((int) R.id.b5n);
        C7573i.m23582a((Object) aVDmtImageView, "ivRotate");
        aVDmtImageView.setVisibility(8);
        AVDmtImageView aVDmtImageView2 = (AVDmtImageView) mo96687a((int) R.id.b5i);
        C7573i.m23582a((Object) aVDmtImageView2, "ivDelete");
        aVDmtImageView2.setVisibility(8);
        AVDmtTextView aVDmtTextView = (AVDmtTextView) mo96687a((int) R.id.dq_);
        C7573i.m23582a((Object) aVDmtTextView, "tvVideoSegmentDes");
        aVDmtTextView.setVisibility(0);
        AVDmtCheckableImageButton aVDmtCheckableImageButton = (AVDmtCheckableImageButton) mo96687a((int) R.id.b5p);
        C7573i.m23582a((Object) aVDmtCheckableImageButton, "ivSpeed");
        aVDmtCheckableImageButton.setVisibility(4);
        AVDmtCheckableImageButton aVDmtCheckableImageButton2 = (AVDmtCheckableImageButton) mo96687a((int) R.id.b5p);
        C7573i.m23582a((Object) aVDmtCheckableImageButton2, "ivSpeed");
        aVDmtCheckableImageButton2.setChecked(this.f100594L);
        mo96701k().f104694a = false;
        C40308e k = mo96701k();
        if (!this.f100594L) {
            i = 8;
        }
        k.mo100131a(i);
        if (this.f100594L) {
            mo96701k().mo100133a(C38774k.m123824d(mo96698h().mo97722o()));
        }
    }

    /* renamed from: O */
    private final void m123608O() {
        int i;
        this.f100599x = 1.0f;
        this.f100600y = 0.0f;
        this.f100601z = 0.0f;
        boolean z = true;
        if (!mo96683G() || !C39182e.m125102e()) {
            i = this.f100430d;
        } else {
            i = this.f100430d + 1;
        }
        VideoSegmentAdapter videoSegmentAdapter = this.f100598w;
        if (videoSegmentAdapter == null) {
            C7573i.m23580a();
        }
        Rect b = videoSegmentAdapter.mo96806b((AVDmtPanelRecyleView) mo96687a((int) R.id.ea5), i);
        if (C0991u.m4220h((AVDmtPanelRecyleView) mo96687a((int) R.id.ea5)) != 1) {
            z = false;
        }
        FrameLayout frameLayout = (FrameLayout) mo96687a((int) R.id.d6z);
        C7573i.m23582a((Object) frameLayout, "singleEditLayout");
        frameLayout.setVisibility(0);
        AVDmtImageView aVDmtImageView = (AVDmtImageView) mo96687a((int) R.id.b5o);
        C7573i.m23582a((Object) aVDmtImageView, "ivSave");
        aVDmtImageView.setVisibility(8);
        AVDmtImageView aVDmtImageView2 = (AVDmtImageView) mo96687a((int) R.id.b5h);
        C7573i.m23582a((Object) aVDmtImageView2, "ivCancel");
        aVDmtImageView2.setVisibility(8);
        FrameLayout frameLayout2 = (FrameLayout) mo96687a((int) R.id.alq);
        C7573i.m23582a((Object) frameLayout2, "flEditVideo");
        frameLayout2.setVisibility(4);
        FrameLayout frameLayout3 = (FrameLayout) mo96687a((int) R.id.alq);
        C7573i.m23582a((Object) frameLayout3, "flEditVideo");
        View rootView = frameLayout3.getRootView();
        C7573i.m23582a((Object) rootView, "flEditVideo.rootView");
        rootView.getViewTreeObserver().addOnPreDrawListener(new C38722q(this, i, b, z));
    }

    /* renamed from: M */
    private final void m123606M() {
        VideoSegmentAdapter videoSegmentAdapter;
        VECutMultiVideoSegmentTouchCallback vECutMultiVideoSegmentTouchCallback;
        if (m123610Q()) {
            VideoEditViewModel h = mo96698h();
            CutMultiVideoViewModel g = mo96697g();
            List m = mo96698h().mo97720m();
            C7573i.m23582a((Object) m, "videoEditViewModel.videoEditedList");
            videoSegmentAdapter = new StickPointVideoSegmentAdapter(h, g, m);
        } else {
            videoSegmentAdapter = new VideoSegmentAdapter(mo96698h(), mo96697g(), mo96698h().mo97720m());
        }
        this.f100598w = videoSegmentAdapter;
        VideoSegmentAdapter videoSegmentAdapter2 = this.f100598w;
        if (videoSegmentAdapter2 == null) {
            C7573i.m23580a();
        }
        videoSegmentAdapter2.f100641c = new C38715j(this);
        if (this.f100598w instanceof StickPointVideoSegmentAdapter) {
            VideoSegmentAdapter videoSegmentAdapter3 = this.f100598w;
            if (videoSegmentAdapter3 != null) {
                ((StickPointVideoSegmentAdapter) videoSegmentAdapter3).mo97429a(C39182e.m125105i());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter");
            }
        }
        if (m123610Q()) {
            VideoSegmentAdapter videoSegmentAdapter4 = this.f100598w;
            if (videoSegmentAdapter4 == null) {
                C7573i.m23580a();
            }
            vECutMultiVideoSegmentTouchCallback = new StickPointVideoSegmentTouchCallback(videoSegmentAdapter4);
        } else {
            VideoSegmentAdapter videoSegmentAdapter5 = this.f100598w;
            if (videoSegmentAdapter5 == null) {
                C7573i.m23580a();
            }
            vECutMultiVideoSegmentTouchCallback = new VECutMultiVideoSegmentTouchCallback(videoSegmentAdapter5);
        }
        new ItemTouchHelper(vECutMultiVideoSegmentTouchCallback).mo6500a((RecyclerView) (AVDmtPanelRecyleView) mo96687a((int) R.id.ea5));
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo96687a((int) R.id.ea5);
        C7573i.m23582a((Object) aVDmtPanelRecyleView, "videoRecyclerView");
        aVDmtPanelRecyleView.setLayoutManager(new VideoLayoutManager(getContext()));
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = (AVDmtPanelRecyleView) mo96687a((int) R.id.ea5);
        C7573i.m23582a((Object) aVDmtPanelRecyleView2, "videoRecyclerView");
        aVDmtPanelRecyleView2.setAdapter(this.f100598w);
        AVDmtPanelRecyleView aVDmtPanelRecyleView3 = (AVDmtPanelRecyleView) mo96687a((int) R.id.ea5);
        C7573i.m23582a((Object) aVDmtPanelRecyleView3, "videoRecyclerView");
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.f4941j = 300;
        defaultItemAnimator.f4943l = 300;
        defaultItemAnimator.f4942k = 300;
        defaultItemAnimator.f4940i = 300;
        aVDmtPanelRecyleView3.setItemAnimator(defaultItemAnimator);
        AVDmtPanelRecyleView aVDmtPanelRecyleView4 = (AVDmtPanelRecyleView) mo96687a((int) R.id.ea5);
        C7573i.m23582a((Object) aVDmtPanelRecyleView4, "videoRecyclerView");
        aVDmtPanelRecyleView4.getViewTreeObserver().addOnPreDrawListener(new C38716k(this));
        ((AVDmtPanelRecyleView) mo96687a((int) R.id.ea5)).setOnTouchListener(new C38717l(this));
        VideoSegmentAdapter videoSegmentAdapter6 = this.f100598w;
        if (videoSegmentAdapter6 != null) {
            videoSegmentAdapter6.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private final void m123614a(C7561a<C7581n> aVar) {
        Context context = getContext();
        if (context != null) {
            new C10741a(context).mo25657b((int) R.string.ao5).mo25658b((int) R.string.cas, (OnClickListener) null).mo25650a((int) R.string.anl, (OnClickListener) new C38719n(aVar)).mo25656a().mo25637a().show();
        }
    }

    /* renamed from: b */
    private final void m123615b(int i) {
        if (System.currentTimeMillis() - this.f100591I >= 3000) {
            if (i == 0) {
                i = 0;
            } else if (mo96683G() && C39182e.m125102e()) {
                i++;
            }
            ((AVDmtPanelRecyleView) mo96687a((int) R.id.ea5)).mo5561d(i);
        }
    }

    /* renamed from: e */
    public final void mo96776e(boolean z) {
        if (!this.f100593K) {
            mo96768a().setEnabled(!z);
            TextView textView = (TextView) mo96687a((int) R.id.dq1);
            C7573i.m23582a((Object) textView, "tvNext");
            textView.setEnabled(!z);
            AVDmtAutoRTLImageView aVDmtAutoRTLImageView = (AVDmtAutoRTLImageView) mo96687a((int) R.id.b5g);
            C7573i.m23582a((Object) aVDmtAutoRTLImageView, "ivBack");
            aVDmtAutoRTLImageView.setEnabled(!z);
            mo96766K().setEnabled(!z);
        }
    }

    /* renamed from: a */
    private final void m123613a(List<? extends MediaModel> list) {
        Collection collection = list;
        if (!C23477d.m77081a(collection)) {
            ArrayList arrayList = new ArrayList();
            int size = mo96698h().mo97721n().size();
            if (list == null) {
                C7573i.m23580a();
            }
            int size2 = collection.size();
            for (int i = 0; i < size2; i++) {
                VideoSegment videoSegment = new VideoSegment((MediaModel) list.get(i));
                videoSegment.f100759a = size;
                arrayList.add(videoSegment);
                size++;
            }
            VideoSegmentAdapter videoSegmentAdapter = this.f100598w;
            if (videoSegmentAdapter != null) {
                videoSegmentAdapter.mo96809b((List<VideoSegment>) arrayList);
            }
            AbstractVideoEditView abstractVideoEditView = this.f100596N;
            if (abstractVideoEditView == null) {
                C7573i.m23583a("videoEditView");
            }
            List list2 = arrayList;
            abstractVideoEditView.mo97599a(list2);
            mo96700j().mo96742a(list2, mo96698h().mo97721n().size());
        }
    }

    /* renamed from: c */
    public final void mo96694c(boolean z) {
        super.mo96694c(z);
        this.f100593K = z;
        AVDmtImageView aVDmtImageView = (AVDmtImageView) mo96687a((int) R.id.b5n);
        C7573i.m23582a((Object) aVDmtImageView, "ivRotate");
        aVDmtImageView.setEnabled(!z);
        AVDmtImageView aVDmtImageView2 = (AVDmtImageView) mo96687a((int) R.id.b5i);
        C7573i.m23582a((Object) aVDmtImageView2, "ivDelete");
        aVDmtImageView2.setEnabled(!z);
        AVDmtCheckableImageButton aVDmtCheckableImageButton = (AVDmtCheckableImageButton) mo96687a((int) R.id.b5p);
        C7573i.m23582a((Object) aVDmtCheckableImageButton, "ivSpeed");
        aVDmtCheckableImageButton.setEnabled(!z);
        AVDmtImageView aVDmtImageView3 = (AVDmtImageView) mo96687a((int) R.id.b5o);
        C7573i.m23582a((Object) aVDmtImageView3, "ivSave");
        aVDmtImageView3.setEnabled(!z);
        AVDmtImageView aVDmtImageView4 = (AVDmtImageView) mo96687a((int) R.id.b5h);
        C7573i.m23582a((Object) aVDmtImageView4, "ivCancel");
        aVDmtImageView4.setEnabled(!z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0092  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m123611a(android.view.View r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b r0 = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b
            android.support.v4.app.FragmentActivity r1 = r3.getActivity()
            if (r1 != 0) goto L_0x000b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x000b:
            java.lang.String r2 = "activity!!"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.app.Activity r1 = (android.app.Activity) r1
            r0.<init>(r1)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a r0 = (com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39163a) r0
            r3.f100433g = r0
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a r0 = r3.f100433g
            if (r0 == 0) goto L_0x0020
            r0.mo97379a(r4)
        L_0x0020:
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a r4 = r3.f100433g
            if (r4 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView r0 = r3.f100596N
            if (r0 != 0) goto L_0x002d
            java.lang.String r1 = "videoEditView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x002d:
            r4.mo97382a(r0)
        L_0x0030:
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a r4 = r3.f100433g
            if (r4 == 0) goto L_0x003d
            android.widget.LinearLayout r0 = r3.mo96703m()
            android.view.View r0 = (android.view.View) r0
            r4.mo97386b(r0)
        L_0x003d:
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a r4 = r3.f100433g
            if (r4 == 0) goto L_0x004d
            r0 = 2131303133(0x7f091add, float:1.8224372E38)
            android.view.View r0 = r3.mo96687a(r0)
            com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView r0 = (com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView) r0
            r4.mo97378a(r0)
        L_0x004d:
            android.support.v4.app.FragmentActivity r4 = r3.getActivity()
            r0 = 0
            if (r4 == 0) goto L_0x0061
            android.content.Intent r4 = r4.getIntent()
            if (r4 == 0) goto L_0x0061
            java.lang.String r1 = "extra_stickpoint_music_list"
            java.io.Serializable r4 = r4.getSerializableExtra(r1)
            goto L_0x0062
        L_0x0061:
            r4 = r0
        L_0x0062:
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a r1 = r3.f100433g
            if (r1 == 0) goto L_0x0074
            if (r4 != 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r0 = kotlin.collections.C7525m.m23509d(r4)
        L_0x0071:
            r1.mo97387b(r0)
        L_0x0074:
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a r4 = r3.f100433g
            if (r4 == 0) goto L_0x0082
            com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$i r0 = new com.ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment$i
            r0.<init>(r3)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i r0 = (com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39171i) r0
            r4.mo97381a(r0)
        L_0x0082:
            boolean r4 = com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e.m125105i()
            r0 = 1
            if (r4 == 0) goto L_0x0092
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a r4 = r3.f100433g
            if (r4 == 0) goto L_0x0091
            r4.mo97397g(r0)
            goto L_0x009a
        L_0x0091:
            return
        L_0x0092:
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a r4 = r3.f100433g
            if (r4 == 0) goto L_0x009a
            r4.mo97393e(r0)
            return
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment.m123611a(android.view.View):void");
    }

    public final void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        boolean z = true;
        if (num != null && num.intValue() == R.id.b5o) {
            if (!this.f100585C) {
                this.f100585C = true;
                C38774k.m123823c();
                mo96697g().mo96672d();
            } else {
                return;
            }
        } else if (num != null && num.intValue() == R.id.b5h) {
            if (!this.f100585C) {
                this.f100585C = true;
                C38774k.m123821b();
                mo96697g().mo96671c();
            } else {
                return;
            }
        } else if (num != null && num.intValue() == R.id.b5i) {
            m123614a((C7561a<C7581n>) new C38718m<C7581n>(this));
        } else if (num != null && num.intValue() == R.id.b5p) {
            ((AVDmtCheckableImageButton) mo96687a((int) R.id.b5p)).toggle();
            if (this.f100434h == 2) {
                AVDmtCheckableImageButton aVDmtCheckableImageButton = (AVDmtCheckableImageButton) mo96687a((int) R.id.b5p);
                C7573i.m23582a((Object) aVDmtCheckableImageButton, "ivSpeed");
                this.f100595M = aVDmtCheckableImageButton.isChecked();
            } else {
                AVDmtCheckableImageButton aVDmtCheckableImageButton2 = (AVDmtCheckableImageButton) mo96687a((int) R.id.b5p);
                C7573i.m23582a((Object) aVDmtCheckableImageButton2, "ivSpeed");
                this.f100594L = aVDmtCheckableImageButton2.isChecked();
            }
            AVDmtCheckableImageButton aVDmtCheckableImageButton3 = (AVDmtCheckableImageButton) mo96687a((int) R.id.b5p);
            C7573i.m23582a((Object) aVDmtCheckableImageButton3, "ivSpeed");
            if (!aVDmtCheckableImageButton3.isChecked() || mo96683G()) {
                mo96701k().mo100131a(8);
            } else {
                C40308e k = mo96701k();
                AbstractVideoEditView abstractVideoEditView = this.f100596N;
                if (abstractVideoEditView == null) {
                    C7573i.m23583a("videoEditView");
                }
                k.mo100133a(C38774k.m123824d(abstractVideoEditView.getCurrentSpeed()));
                mo96701k().mo100131a(0);
            }
        } else {
            z = false;
        }
        if (!z) {
            super.onClick(view);
        }
    }

    /* renamed from: a */
    private final void m123612a(VideoSegment videoSegment) {
        int i;
        AVDmtView aVDmtView = (AVDmtView) mo96687a((int) R.id.g_);
        C7573i.m23582a((Object) aVDmtView, "animTabDot");
        aVDmtView.setVisibility(4);
        AVDmtAutoRTLImageView aVDmtAutoRTLImageView = (AVDmtAutoRTLImageView) mo96687a((int) R.id.b5g);
        C7573i.m23582a((Object) aVDmtAutoRTLImageView, "ivBack");
        aVDmtAutoRTLImageView.setVisibility(4);
        TextView textView = (TextView) mo96687a((int) R.id.dq1);
        C7573i.m23582a((Object) textView, "tvNext");
        textView.setVisibility(4);
        AVDmtImageView aVDmtImageView = (AVDmtImageView) mo96687a((int) R.id.b5n);
        C7573i.m23582a((Object) aVDmtImageView, "ivRotate");
        aVDmtImageView.setVisibility(0);
        AVDmtImageView aVDmtImageView2 = (AVDmtImageView) mo96687a((int) R.id.b5i);
        C7573i.m23582a((Object) aVDmtImageView2, "ivDelete");
        aVDmtImageView2.setVisibility(0);
        AVDmtTextView aVDmtTextView = (AVDmtTextView) mo96687a((int) R.id.dq_);
        C7573i.m23582a((Object) aVDmtTextView, "tvVideoSegmentDes");
        aVDmtTextView.setVisibility(4);
        AVDmtCheckableImageButton aVDmtCheckableImageButton = (AVDmtCheckableImageButton) mo96687a((int) R.id.b5p);
        C7573i.m23582a((Object) aVDmtCheckableImageButton, "ivSpeed");
        int i2 = 8;
        if (!this.f100432f || !mo96700j().mo96746a(videoSegment)) {
            i = 8;
        } else {
            i = 0;
        }
        aVDmtCheckableImageButton.setVisibility(i);
        AVDmtCheckableImageButton aVDmtCheckableImageButton2 = (AVDmtCheckableImageButton) mo96687a((int) R.id.b5p);
        C7573i.m23582a((Object) aVDmtCheckableImageButton2, "ivSpeed");
        aVDmtCheckableImageButton2.setChecked(this.f100595M);
        mo96701k().f104694a = false;
        C40308e k = mo96701k();
        if (this.f100595M && !mo96683G()) {
            i2 = 0;
        }
        k.mo100131a(i2);
        if (this.f100595M) {
            mo96701k().mo100133a(C38774k.m123824d(videoSegment.mo96911j()));
        }
        StringBuilder sb = new StringBuilder("file://");
        sb.append(videoSegment.mo96896a(false));
        ImageRequest b = ImageRequestBuilder.m40865a(Uri.parse(sb.toString())).mo33468a(new C13596d(C23486n.m77122a(50.0d), C23486n.m77122a(50.0d))).mo33476b();
        C13382e a = C13380c.m39166a();
        RemoteImageView remoteImageView = (RemoteImageView) mo96687a((int) R.id.b5j);
        C7573i.m23582a((Object) remoteImageView, "ivEditVideo");
        C13396a c = ((C13382e) ((C13382e) a.mo32729b(remoteImageView.getController())).mo32748b(b)).mo32730f();
        RemoteImageView remoteImageView2 = (RemoteImageView) mo96687a((int) R.id.b5j);
        C7573i.m23582a((Object) remoteImageView2, "ivEditVideo");
        remoteImageView2.setController(c);
    }

    /* renamed from: a */
    public final void mo96689a(int i, int i2) {
        ((TextView) mo96687a((int) R.id.dq1)).setBackgroundResource(R.drawable.tr);
        ((TextView) mo96687a((int) R.id.dq1)).setTextColor(i2);
    }

    /* renamed from: b */
    public final void mo96772b(int i, int i2) {
        if (this.f100434h != 2) {
            if (i != i2) {
                m123615b(i2);
                VideoSegmentAdapter videoSegmentAdapter = this.f100598w;
                if (videoSegmentAdapter == null) {
                    C7573i.m23580a();
                }
                if (i == videoSegmentAdapter.f100640b) {
                    this.f100587E = i;
                    this.f100588F = i2;
                    ValueAnimator valueAnimator = this.f100586D;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.setDuration(500);
                    ofFloat.addUpdateListener(new C38713h(this));
                    this.f100586D = ofFloat;
                    ValueAnimator valueAnimator2 = this.f100586D;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                } else {
                    return;
                }
            }
            VideoSegmentAdapter videoSegmentAdapter2 = this.f100598w;
            if (videoSegmentAdapter2 == null) {
                C7573i.m23580a();
            }
            videoSegmentAdapter2.f100640b = i2;
        }
    }

    /* renamed from: b */
    private final void m123616b(boolean z, boolean z2) {
        int i;
        AVDmtImageView aVDmtImageView = (AVDmtImageView) mo96687a((int) R.id.b5o);
        C7573i.m23582a((Object) aVDmtImageView, "ivSave");
        aVDmtImageView.setVisibility(8);
        AVDmtImageView aVDmtImageView2 = (AVDmtImageView) mo96687a((int) R.id.b5h);
        C7573i.m23582a((Object) aVDmtImageView2, "ivCancel");
        aVDmtImageView2.setVisibility(8);
        FrameLayout frameLayout = (FrameLayout) mo96687a((int) R.id.d6z);
        C7573i.m23582a((Object) frameLayout, "singleEditLayout");
        frameLayout.setVisibility(8);
        if (mo96683G()) {
            C39163a aVar = this.f100433g;
            if (aVar != null) {
                aVar.mo97395f(true);
            }
        } else {
            AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo96687a((int) R.id.ea5);
            C7573i.m23582a((Object) aVDmtPanelRecyleView, "videoRecyclerView");
            aVDmtPanelRecyleView.setVisibility(0);
        }
        FrameLayout frameLayout2 = (FrameLayout) mo96687a((int) R.id.alq);
        C7573i.m23582a((Object) frameLayout2, "flEditVideo");
        frameLayout2.setVisibility(4);
        if (this.f100583A != null && this.f100584B != null) {
            if (!mo96683G() || !C39182e.m125102e()) {
                i = this.f100430d;
            } else {
                i = this.f100430d + 1;
            }
            AVDmtPanelRecyleView aVDmtPanelRecyleView2 = (AVDmtPanelRecyleView) mo96687a((int) R.id.ea5);
            C7573i.m23582a((Object) aVDmtPanelRecyleView2, "videoRecyclerView");
            View rootView = aVDmtPanelRecyleView2.getRootView();
            C7573i.m23582a((Object) rootView, "videoRecyclerView.rootView");
            rootView.getViewTreeObserver().addOnPreDrawListener(new C38724r(this, i, z2));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        View findViewById = view.findViewById(R.id.ea3);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.videoEditView)");
        this.f100596N = (AbstractVideoEditView) findViewById;
        super.onViewCreated(view, bundle);
        mo96700j().f100501e = C42111b.f109618a.mo103542a(true, false, false, false, false);
        ((AVDmtTextView) mo96687a((int) R.id.dq_)).setShadowLayer(2.0f, 0.0f, 0.0f, getResources().getColor(R.color.a7s));
        m123606M();
        if (m123610Q()) {
            m123611a(view);
        } else {
            C39193g.f101577a.mo97483b(mo96698h().mo97721n());
        }
        if (C39805en.m127445a()) {
            View findViewById2 = view.findViewById(R.id.dkg);
            C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.title_menu)");
            mo96690a((RelativeLayout) findViewById2);
            if (mo96702l().getLayoutParams() instanceof LayoutParams) {
                ViewGroup.LayoutParams layoutParams = mo96702l().getLayoutParams();
                if (layoutParams != null) {
                    LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                    layoutParams2.topMargin = C39805en.m127450c(getActivity());
                    mo96702l().setLayoutParams(layoutParams2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            } else if (mo96702l().getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ViewGroup.LayoutParams layoutParams3 = mo96702l().getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = C39805en.m127450c(getActivity());
                    mo96702l().setLayoutParams(layoutParams4);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (m123610Q()) {
            C39163a aVar = this.f100433g;
            if (aVar != null) {
                aVar.mo97376a(i, i2, intent);
            }
        } else if (i == 1001 && i2 == -1 && intent != null) {
            m123613a((List<? extends MediaModel>) intent.getParcelableArrayListExtra("key_choose_media_data"));
        }
    }

    /* renamed from: a */
    public final void mo96769a(int i, int i2, boolean z) {
        if (z) {
            mo96768a().mo97640c();
            mo96700j().mo96735a(i2, i);
            long j = 0;
            for (int i3 = 0; i3 < i; i3++) {
                VideoSegment videoSegment = (VideoSegment) mo96698h().mo97721n().get(i3);
                if (!videoSegment.f100768j) {
                    C7573i.m23582a((Object) videoSegment, "videoSegment");
                    j += (long) (((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / (mo96698h().mo97722o() * videoSegment.mo96911j()));
                }
            }
            if (j >= mo96768a().getMaxCutDuration()) {
                j = 0;
            }
            if (j != 0) {
                j += 30;
            }
            VECutVideoPresenter j2 = mo96700j();
            C0902i playBoundary = mo96768a().getPlayBoundary();
            C7573i.m23582a((Object) playBoundary, "videoEditView().playBoundary");
            j2.mo96738a(playBoundary);
            mo96699i().mo97802a(new C39293a(3, j, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
            if (!mo96700j().mo96748c()) {
                mo96697g().mo96666a(j, mo96698h().mo97720m(), mo96698h().mo97722o());
            }
            C39193g.f101577a.mo97482a(mo96683G(), false, false, false, false, true);
            return;
        }
        mo96699i().mo97802a(new C39293a(1, false));
    }
}
