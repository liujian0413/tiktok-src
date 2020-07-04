package com.p280ss.android.ugc.aweme.shortvideo.cut.p1552a;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.scene.C37299a;
import com.p280ss.android.ugc.aweme.services.cutvideo.DisplayVideoView;
import com.p280ss.android.ugc.aweme.services.cutvideo.ICutVideo;
import com.p280ss.android.ugc.aweme.services.cutvideo.ICutVideoListener;
import com.p280ss.android.ugc.aweme.services.cutvideo.ICutViewInternal;
import com.p280ss.android.ugc.aweme.services.cutvideo.IDisplayVideo;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38747c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.C39293a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a */
public final class C38729a implements ICutVideo, ICutViewInternal {

    /* renamed from: a */
    public VEVideoEditView f100651a;

    /* renamed from: b */
    public VEVideoCutterViewModel f100652b;

    /* renamed from: c */
    public VideoEditViewModel f100653c;

    /* renamed from: d */
    public C38742b f100654d;

    /* renamed from: e */
    public int f100655e;

    /* renamed from: f */
    public final C39293a f100656f = new C39293a(3, 0, SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);

    /* renamed from: g */
    public ICutVideoListener f100657g;

    /* renamed from: h */
    private Context f100658h;

    /* renamed from: i */
    private TextView f100659i;

    /* renamed from: j */
    private CutMultiVideoViewModel f100660j;

    /* renamed from: k */
    private String f100661k = "";

    /* renamed from: l */
    private String f100662l = "";

    /* renamed from: m */
    private long f100663m;

    /* renamed from: n */
    private long f100664n;

    /* renamed from: o */
    private long f100665o = C39810eq.m127460a();

    /* renamed from: p */
    private final int f100666p = 3600000;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$a */
    static final class C38730a<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C38729a f100667a;

        C38730a(C38729a aVar) {
            this.f100667a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                if (!(!bool.booleanValue())) {
                    bool = null;
                }
                if (bool != null) {
                    C38729a.m123705a(this.f100667a).mo97802a(new C39293a(3, C38729a.m123706b(this.f100667a).getPlayingPosition(), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$b */
    static final class C38731b<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C38729a f100668a;

        C38731b(C38729a aVar) {
            this.f100668a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C38729a.m123705a(this.f100668a).mo97802a(new C39293a(3, C38729a.m123706b(this.f100668a).getLeftSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$c */
    static final class C38732c<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C38729a f100669a;

        C38732c(C38729a aVar) {
            this.f100669a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C38729a.m123705a(this.f100669a).mo97802a(new C39293a(3, C38729a.m123706b(this.f100669a).getLeftSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$d */
    static final class C38733d<T> implements C0053p<Long> {

        /* renamed from: a */
        final /* synthetic */ C38729a f100670a;

        C38733d(C38729a aVar) {
            this.f100670a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Long l) {
            if (l != null) {
                C38729a.m123705a(this.f100670a).mo97802a(new C39293a(3, l.longValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$e */
    static final class C38734e<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ C38729a f100671a;

        C38734e(C38729a aVar) {
            this.f100671a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            this.f100671a.mo96825e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$f */
    static final class C38735f<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C38729a f100672a;

        C38735f(C38729a aVar) {
            this.f100672a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C38729a.m123705a(this.f100672a).mo97802a(new C39293a(3, C38729a.m123706b(this.f100672a).getLeftSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
            this.f100672a.mo96825e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$g */
    static final class C38736g<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C38729a f100673a;

        C38736g(C38729a aVar) {
            this.f100673a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C38729a.m123705a(this.f100673a).mo97802a(new C39293a(3, C38729a.m123706b(this.f100673a).getRightSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
            this.f100673a.mo96825e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$h */
    static final class C38737h<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C38729a f100674a;

        C38737h(C38729a aVar) {
            this.f100674a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C38729a.m123705a(this.f100674a).mo97802a(new C39293a(3, C38729a.m123706b(this.f100674a).getLeftSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateIn));
            this.f100674a.mo96825e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$i */
    static final class C38738i<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C38729a f100675a;

        C38738i(C38729a aVar) {
            this.f100675a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C38729a.m123705a(this.f100675a).mo97802a(new C39293a(3, C38729a.m123706b(this.f100675a).getRightSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateOut));
            this.f100675a.mo96825e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$j */
    static final class C38739j<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C38729a f100676a;

        C38739j(C38729a aVar) {
            this.f100676a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f100676a.f100656f.f102020b = C38729a.m123706b(this.f100676a).getPlayingPosition();
            C38729a.m123705a(this.f100676a).mo97802a(this.f100676a.f100656f);
            this.f100676a.mo96825e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$k */
    static final class C38740k<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C38729a f100677a;

        C38740k(C38729a aVar) {
            this.f100677a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            long singlePlayingPosition = C38729a.m123706b(this.f100677a).getSinglePlayingPosition();
            VECutVideoPresenter b = C38729a.m123707c(this.f100677a).mo96827b();
            C0902i playBoundary = C38729a.m123706b(this.f100677a).getPlayBoundary();
            C7573i.m23582a((Object) playBoundary, "videoEditView.playBoundary");
            b.mo96738a(playBoundary);
            C38729a.m123705a(this.f100677a).mo97802a(new C39293a(3, singlePlayingPosition, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
            this.f100677a.mo96825e();
            VECutVideoPresenter b2 = C38729a.m123707c(this.f100677a).mo96827b();
            VideoSegment videoSegment = (VideoSegment) C38729a.m123708d(this.f100677a).mo97721n().get(this.f100677a.f100655e);
            F f = C38729a.m123706b(this.f100677a).getPlayBoundary().f3154a;
            if (f == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) f, "videoEditView.playBoundary.first!!");
            long longValue = ((Number) f).longValue();
            S s = C38729a.m123706b(this.f100677a).getPlayBoundary().f3155b;
            if (s == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) s, "videoEditView.playBoundary.second!!");
            b2.mo96740a(videoSegment, longValue, ((Number) s).longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$l */
    public static final class C38741l implements C38747c {

        /* renamed from: a */
        final /* synthetic */ C38729a f100678a;

        public final void onCompileDone() {
            ICutVideoListener iCutVideoListener = this.f100678a.f100657g;
            if (iCutVideoListener != null) {
                iCutVideoListener.onCompileDone();
            }
        }

        C38741l(C38729a aVar) {
            this.f100678a = aVar;
        }

        /* renamed from: a */
        public final void mo96718a(boolean z) {
            ICutVideoListener iCutVideoListener = this.f100678a.f100657g;
            if (iCutVideoListener != null) {
                iCutVideoListener.onStart();
            }
        }

        public final void onCompileProgress(float f) {
            ICutVideoListener iCutVideoListener = this.f100678a.f100657g;
            if (iCutVideoListener != null) {
                iCutVideoListener.onCompileProgress(f);
            }
        }

        public final void onCompileError(int i, int i2, float f, String str) {
            ICutVideoListener iCutVideoListener = this.f100678a.f100657g;
            if (iCutVideoListener != null) {
                iCutVideoListener.onCompileError(i, i2, f, str);
            }
        }
    }

    public final ICutVideo getProxy() {
        return this;
    }

    public final void setProxy(ICutVideo iCutVideo) {
        C7573i.m23587b(iCutVideo, "proxy");
    }

    public final void restore() {
        VEVideoEditView vEVideoEditView = this.f100651a;
        if (vEVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        vEVideoEditView.mo97666o();
    }

    /* renamed from: a */
    public final VEVideoEditView mo96821a() {
        VEVideoEditView vEVideoEditView = this.f100651a;
        if (vEVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        return vEVideoEditView;
    }

    /* renamed from: b */
    public final VEVideoCutterViewModel mo96822b() {
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f100652b;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: c */
    public final CutMultiVideoViewModel mo96823c() {
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f100660j;
        if (cutMultiVideoViewModel == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    /* renamed from: d */
    public final VideoEditViewModel mo96824d() {
        VideoEditViewModel videoEditViewModel = this.f100653c;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: f */
    private final void m123709f() {
        if (!TextUtils.isEmpty(this.f100661k)) {
            VEVideoEditView vEVideoEditView = this.f100651a;
            if (vEVideoEditView == null) {
                C7573i.m23583a("videoEditView");
            }
            vEVideoEditView.setMaxVideoLength(this.f100664n);
            VEVideoEditView vEVideoEditView2 = this.f100651a;
            if (vEVideoEditView2 == null) {
                C7573i.m23583a("videoEditView");
            }
            vEVideoEditView2.setMinVideoLength(this.f100663m);
            VEVideoEditView vEVideoEditView3 = this.f100651a;
            if (vEVideoEditView3 == null) {
                C7573i.m23583a("videoEditView");
            }
            vEVideoEditView3.setExtractFramesInRoughMode(true);
            VEVideoEditView vEVideoEditView4 = this.f100651a;
            if (vEVideoEditView4 == null) {
                C7573i.m23583a("videoEditView");
            }
            Context context = this.f100658h;
            if (context == null) {
                C7573i.m23583a("context");
            }
            Activity a = C37299a.m119788a(context);
            if (a != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) a;
                CutMultiVideoViewModel cutMultiVideoViewModel = this.f100660j;
                if (cutMultiVideoViewModel == null) {
                    C7573i.m23583a("cutMultiVideoViewModel");
                }
                vEVideoEditView4.mo97632a(fragmentActivity, cutMultiVideoViewModel, this.f100661k);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: e */
    public final void mo96825e() {
        Locale locale = Locale.getDefault();
        C7573i.m23582a((Object) locale, "Locale.getDefault()");
        String str = "%.1f";
        Object[] objArr = new Object[1];
        VEVideoEditView vEVideoEditView = this.f100651a;
        if (vEVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        objArr[0] = Float.valueOf(vEVideoEditView.getSelectedTime());
        String a = C1642a.m8035a(locale, str, Arrays.copyOf(objArr, 1));
        C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
        Context context = this.f100658h;
        if (context == null) {
            C7573i.m23583a("context");
        }
        String string = context.getResources().getString(R.string.cb0, new Object[]{a});
        TextView textView = this.f100659i;
        if (textView == null) {
            C7573i.m23583a("tvTime");
        }
        textView.setText(string);
    }

    public final void compile() {
        Context context = this.f100658h;
        if (context == null) {
            C7573i.m23583a("context");
        }
        Activity a = C37299a.m119788a(context);
        if ((a == null || !a.isFinishing()) && !TextUtils.isEmpty(this.f100662l)) {
            C38742b bVar = this.f100654d;
            if (bVar == null) {
                C7573i.m23583a("displayVideoView");
            }
            if (bVar.mo96827b().mo96731a() + 5 < this.f100665o) {
                Context context2 = this.f100658h;
                if (context2 == null) {
                    C7573i.m23583a("context");
                }
                Context context3 = this.f100658h;
                if (context3 == null) {
                    C7573i.m23583a("context");
                }
                C10761a.m31403c(context2, context3.getString(R.string.fob, new Object[]{Long.valueOf(this.f100665o / 1000)})).mo25750a();
                return;
            }
            C38742b bVar2 = this.f100654d;
            if (bVar2 == null) {
                C7573i.m23583a("displayVideoView");
            }
            if (bVar2.mo96827b().mo96731a() > ((long) this.f100666p)) {
                Context context4 = this.f100658h;
                if (context4 == null) {
                    C7573i.m23583a("context");
                }
                C10761a.m31399c(context4, (int) R.string.cap).mo25750a();
                return;
            }
            C38742b bVar3 = this.f100654d;
            if (bVar3 == null) {
                C7573i.m23583a("displayVideoView");
            }
            VECutVideoPresenter b = bVar3.mo96827b();
            int i = this.f100655e;
            VideoEditViewModel videoEditViewModel = this.f100653c;
            if (videoEditViewModel == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            VECutVideoPresenter.m123542a(b, i, (float) ((VideoSegment) videoEditViewModel.mo97720m().get(this.f100655e)).f100769k, false, 0.0f, 0.0f, 0, 0, 120, null);
            C38742b bVar4 = this.f100654d;
            if (bVar4 == null) {
                C7573i.m23583a("displayVideoView");
            }
            bVar4.mo96827b().mo96741a(this.f100662l, (C38747c) new C38741l(this));
        }
    }

    /* renamed from: g */
    private final void m123710g() {
        VideoEditViewModel videoEditViewModel = this.f100653c;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        C0052o<Boolean> oVar = videoEditViewModel.f101837b;
        Context context = this.f100658h;
        if (context == null) {
            C7573i.m23583a("context");
        }
        Activity a = C37299a.m119788a(context);
        if (a != null) {
            oVar.observe((FragmentActivity) a, new C38730a(this));
            VideoEditViewModel videoEditViewModel2 = this.f100653c;
            if (videoEditViewModel2 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            C0052o<Long> oVar2 = videoEditViewModel2.f101839d;
            Context context2 = this.f100658h;
            if (context2 == null) {
                C7573i.m23583a("context");
            }
            Activity a2 = C37299a.m119788a(context2);
            if (a2 != null) {
                oVar2.observe((FragmentActivity) a2, new C38733d(this));
                VideoEditViewModel videoEditViewModel3 = this.f100653c;
                if (videoEditViewModel3 == null) {
                    C7573i.m23583a("videoEditViewModel");
                }
                C0052o<Float> oVar3 = videoEditViewModel3.f101838c;
                Context context3 = this.f100658h;
                if (context3 == null) {
                    C7573i.m23583a("context");
                }
                Activity a3 = C37299a.m119788a(context3);
                if (a3 != null) {
                    oVar3.observe((FragmentActivity) a3, new C38734e(this));
                    VideoEditViewModel videoEditViewModel4 = this.f100653c;
                    if (videoEditViewModel4 == null) {
                        C7573i.m23583a("videoEditViewModel");
                    }
                    C0052o<Void> oVar4 = videoEditViewModel4.f101841f;
                    Context context4 = this.f100658h;
                    if (context4 == null) {
                        C7573i.m23583a("context");
                    }
                    Activity a4 = C37299a.m119788a(context4);
                    if (a4 != null) {
                        oVar4.observe((FragmentActivity) a4, new C38735f(this));
                        VideoEditViewModel videoEditViewModel5 = this.f100653c;
                        if (videoEditViewModel5 == null) {
                            C7573i.m23583a("videoEditViewModel");
                        }
                        C0052o<Void> oVar5 = videoEditViewModel5.f101840e;
                        Context context5 = this.f100658h;
                        if (context5 == null) {
                            C7573i.m23583a("context");
                        }
                        Activity a5 = C37299a.m119788a(context5);
                        if (a5 != null) {
                            oVar5.observe((FragmentActivity) a5, new C38736g(this));
                            VideoEditViewModel videoEditViewModel6 = this.f100653c;
                            if (videoEditViewModel6 == null) {
                                C7573i.m23583a("videoEditViewModel");
                            }
                            C0052o<Void> oVar6 = videoEditViewModel6.f101842g;
                            Context context6 = this.f100658h;
                            if (context6 == null) {
                                C7573i.m23583a("context");
                            }
                            Activity a6 = C37299a.m119788a(context6);
                            if (a6 != null) {
                                oVar6.observe((FragmentActivity) a6, new C38737h(this));
                                VideoEditViewModel videoEditViewModel7 = this.f100653c;
                                if (videoEditViewModel7 == null) {
                                    C7573i.m23583a("videoEditViewModel");
                                }
                                C0052o<Void> oVar7 = videoEditViewModel7.f101845j;
                                Context context7 = this.f100658h;
                                if (context7 == null) {
                                    C7573i.m23583a("context");
                                }
                                Activity a7 = C37299a.m119788a(context7);
                                if (a7 != null) {
                                    oVar7.observe((FragmentActivity) a7, new C38738i(this));
                                    VideoEditViewModel videoEditViewModel8 = this.f100653c;
                                    if (videoEditViewModel8 == null) {
                                        C7573i.m23583a("videoEditViewModel");
                                    }
                                    C0052o<Void> oVar8 = videoEditViewModel8.f101846k;
                                    Context context8 = this.f100658h;
                                    if (context8 == null) {
                                        C7573i.m23583a("context");
                                    }
                                    Activity a8 = C37299a.m119788a(context8);
                                    if (a8 != null) {
                                        oVar8.observe((FragmentActivity) a8, new C38739j(this));
                                        VideoEditViewModel videoEditViewModel9 = this.f100653c;
                                        if (videoEditViewModel9 == null) {
                                            C7573i.m23583a("videoEditViewModel");
                                        }
                                        C0052o<Void> oVar9 = videoEditViewModel9.f101847l;
                                        Context context9 = this.f100658h;
                                        if (context9 == null) {
                                            C7573i.m23583a("context");
                                        }
                                        Activity a9 = C37299a.m119788a(context9);
                                        if (a9 != null) {
                                            oVar9.observe((FragmentActivity) a9, new C38740k(this));
                                            VideoEditViewModel videoEditViewModel10 = this.f100653c;
                                            if (videoEditViewModel10 == null) {
                                                C7573i.m23583a("videoEditViewModel");
                                            }
                                            C0052o<Void> oVar10 = videoEditViewModel10.f101843h;
                                            Context context10 = this.f100658h;
                                            if (context10 == null) {
                                                C7573i.m23583a("context");
                                            }
                                            Activity a10 = C37299a.m119788a(context10);
                                            if (a10 != null) {
                                                oVar10.observe((FragmentActivity) a10, new C38731b(this));
                                                VideoEditViewModel videoEditViewModel11 = this.f100653c;
                                                if (videoEditViewModel11 == null) {
                                                    C7573i.m23583a("videoEditViewModel");
                                                }
                                                C0052o<Void> oVar11 = videoEditViewModel11.f101844i;
                                                Context context11 = this.f100658h;
                                                if (context11 == null) {
                                                    C7573i.m23583a("context");
                                                }
                                                Activity a11 = C37299a.m119788a(context11);
                                                if (a11 != null) {
                                                    oVar11.observe((FragmentActivity) a11, new C38732c(this));
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
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void setListener(ICutVideoListener iCutVideoListener) {
        C7573i.m23587b(iCutVideoListener, "listener");
        this.f100657g = iCutVideoListener;
    }

    /* renamed from: a */
    public static final /* synthetic */ VEVideoCutterViewModel m123705a(C38729a aVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = aVar.f100652b;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoEditView m123706b(C38729a aVar) {
        VEVideoEditView vEVideoEditView = aVar.f100651a;
        if (vEVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        return vEVideoEditView;
    }

    /* renamed from: c */
    public static final /* synthetic */ C38742b m123707c(C38729a aVar) {
        C38742b bVar = aVar.f100654d;
        if (bVar == null) {
            C7573i.m23583a("displayVideoView");
        }
        return bVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ VideoEditViewModel m123708d(C38729a aVar) {
        VideoEditViewModel videoEditViewModel = aVar.f100653c;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    public final void attachDisplayView(DisplayVideoView displayVideoView) {
        C7573i.m23587b(displayVideoView, "displayView");
        IDisplayVideo proxy = displayVideoView.getProxy();
        if (proxy != null) {
            this.f100654d = (C38742b) proxy;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.cover.DisplayVideoViewProxy");
    }

    public final void initInternal(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        Context context = viewGroup.getContext();
        C7573i.m23582a((Object) context, "parent.context");
        this.f100658h = context;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hg, null, true);
        View findViewById = inflate.findViewById(R.id.ea3);
        C7573i.m23582a((Object) findViewById, "contentView.findViewById(R.id.videoEditView)");
        this.f100651a = (VEVideoEditView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.dq5);
        C7573i.m23582a((Object) findViewById2, "contentView.findViewById(R.id.tvTime)");
        this.f100659i = (TextView) findViewById2;
        viewGroup.addView(inflate);
        Context context2 = this.f100658h;
        if (context2 == null) {
            C7573i.m23583a("context");
        }
        if (context2 != null) {
            FragmentActivity fragmentActivity = (AppCompatActivity) context2;
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(CutMultiVideoViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
            this.f100660j = (CutMultiVideoViewModel) a;
            C0063u a2 = C0069x.m159a(fragmentActivity).mo147a(VEVideoCutterViewModel.class);
            C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…terViewModel::class.java]");
            this.f100652b = (VEVideoCutterViewModel) a2;
            C0063u a3 = C0069x.m159a(fragmentActivity).mo147a(VideoEditViewModel.class);
            C7573i.m23582a((Object) a3, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.f100653c = (VideoEditViewModel) a3;
            m123709f();
            m123710g();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    public final void init(String str, String str2, long j, long j2) {
        C7573i.m23587b(str, "inputPath");
        C7573i.m23587b(str2, "outputPath");
        this.f100661k = str;
        this.f100662l = str2;
        this.f100663m = j;
        this.f100664n = j2;
    }
}
