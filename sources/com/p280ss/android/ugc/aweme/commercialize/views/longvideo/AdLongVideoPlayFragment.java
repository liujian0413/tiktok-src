package com.p280ss.android.ugc.aweme.commercialize.views.longvideo;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24574n;
import com.p280ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout;
import com.p280ss.android.ugc.aweme.longvideonew.feature.C32793a;
import com.p280ss.android.ugc.aweme.longvideonew.feature.C32795b.C32796a;
import com.p280ss.android.ugc.aweme.longvideonew.feature.C32797c;
import com.p280ss.android.ugc.aweme.longvideonew.feature.C32798d;
import com.p280ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController;
import com.p280ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController.C32785a;
import com.p280ss.android.ugc.aweme.longvideonew.widget.VideoFunctionalLayerWidget;
import com.p280ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget;
import com.p280ss.android.ugc.aweme.longvideonew.widget.VideoSeekContainerWidget;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.ShareDependService;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.longvideo.AdLongVideoPlayFragment */
public final class AdLongVideoPlayFragment extends AmeBaseFragment implements C0053p<C23083a>, OnClickListener, C23254a, C28343z<C28318an>, C28519d, C32785a {

    /* renamed from: k */
    public static final C25592b f67391k = new C25592b(null);

    /* renamed from: A */
    private View f67392A;

    /* renamed from: B */
    private RelativeLayout f67393B;

    /* renamed from: C */
    private C32797c f67394C;

    /* renamed from: D */
    private int f67395D;

    /* renamed from: E */
    private int f67396E;

    /* renamed from: F */
    private FrameLayout f67397F;

    /* renamed from: G */
    private boolean f67398G;

    /* renamed from: H */
    private HashMap f67399H;

    /* renamed from: e */
    public Aweme f67400e;

    /* renamed from: f */
    public boolean f67401f;

    /* renamed from: g */
    public ImageView f67402g;

    /* renamed from: h */
    public C25591a f67403h;

    /* renamed from: i */
    public C24574n f67404i;

    /* renamed from: j */
    public boolean f67405j;

    /* renamed from: l */
    private DataCenter f67406l;

    /* renamed from: m */
    private Video f67407m;

    /* renamed from: n */
    private String f67408n = "noBusinessType";

    /* renamed from: o */
    private String f67409o = "";

    /* renamed from: p */
    private int f67410p;

    /* renamed from: q */
    private C28297e f67411q;

    /* renamed from: r */
    private C32793a f67412r;

    /* renamed from: s */
    private NoOperateModeController f67413s;

    /* renamed from: t */
    private FrameLayout f67414t;

    /* renamed from: u */
    private FrameLayout f67415u;

    /* renamed from: v */
    private DoubleClickDiggFrameLayout f67416v;

    /* renamed from: w */
    private FrameLayout f67417w;

    /* renamed from: x */
    private FrameLayout f67418x;

    /* renamed from: y */
    private FrameLayout f67419y;

    /* renamed from: z */
    private CommerceLikeLayout f67420z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.longvideo.AdLongVideoPlayFragment$a */
    public interface C25591a {
        /* renamed from: a */
        void mo65742a();

        /* renamed from: a */
        void mo65743a(boolean z);

        /* renamed from: b */
        void mo65744b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.longvideo.AdLongVideoPlayFragment$b */
    public static final class C25592b {
        private C25592b() {
        }

        public /* synthetic */ C25592b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static AdLongVideoPlayFragment m84139a(Aweme aweme, String str, int i, String str2) {
            C7573i.m23587b(str, "eventType");
            C7573i.m23587b(str2, "businessType");
            Bundle bundle = new Bundle();
            bundle.putString("extra_event_type", str);
            bundle.putInt("extra_page_type", i);
            bundle.putString("extra_business_type", str2);
            AdLongVideoPlayFragment adLongVideoPlayFragment = new AdLongVideoPlayFragment();
            adLongVideoPlayFragment.setArguments(bundle);
            adLongVideoPlayFragment.f67400e = aweme;
            return adLongVideoPlayFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.longvideo.AdLongVideoPlayFragment$c */
    static final class C25593c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C32798d f67421a;

        /* renamed from: b */
        final /* synthetic */ AdLongVideoPlayFragment f67422b;

        C25593c(C32798d dVar, AdLongVideoPlayFragment adLongVideoPlayFragment) {
            this.f67421a = dVar;
            this.f67422b = adLongVideoPlayFragment;
        }

        public final void run() {
            this.f67422b.mo66375a(!this.f67422b.f67401f, this.f67421a);
        }
    }

    /* renamed from: o */
    private void m84125o() {
        if (this.f67399H != null) {
            this.f67399H.clear();
        }
    }

    /* renamed from: d */
    public final void mo66376d() {
    }

    /* renamed from: e */
    public final void mo66377e() {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m84125o();
    }

    /* renamed from: f */
    public final void mo66378f() {
        this.f67405j = true;
        DataCenter dataCenter = this.f67406l;
        if (dataCenter != null) {
            dataCenter.mo60134a("action_video_mute", (Object) null);
        }
    }

    /* renamed from: g */
    public final void mo66379g() {
        this.f67405j = false;
        DataCenter dataCenter = this.f67406l;
        if (dataCenter != null) {
            dataCenter.mo60134a("action_video_unmute", (Object) null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C28297e eVar = this.f67411q;
        if (eVar != null) {
            eVar.mo71836c();
        }
    }

    /* renamed from: a */
    public final void mo66373a() {
        if (this.f67401f) {
            m84124n();
            return;
        }
        C25591a aVar = this.f67403h;
        if (aVar != null) {
            aVar.mo65742a();
        }
    }

    /* renamed from: k */
    private final void m84121k() {
        if (!(!C7573i.m23585a((Object) "long_video_player_activity", (Object) this.f67408n))) {
            C32798d l = m84122l();
            DataCenter dataCenter = this.f67406l;
            if (dataCenter != null) {
                dataCenter.mo60134a("action_is_landscape_mode", (Object) Boolean.valueOf(this.f67401f));
            }
            C32796a.m106156a((Activity) getActivity(), (View) this.f67417w, (View) this.f67415u, this.f67407m, l, this.f67401f);
        }
    }

    /* renamed from: l */
    private final C32798d m84122l() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WindowManager windowManager = activity.getWindowManager();
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (defaultDisplay != null) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
        }
        return C32796a.m106153a(displayMetrics.widthPixels, C23482j.m77105f(getActivity()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022 A[Catch:{ Exception -> 0x002e }] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m84123m() {
        /*
            r3 = this;
            boolean r0 = r3.f67398G
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r3.f67398G = r0
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ Exception -> 0x002e }
            java.lang.Integer r1 = r1.getIsAdapterVideoPlaySizeAd()     // Catch:{ Exception -> 0x002e }
            if (r1 != 0) goto L_0x0018
            goto L_0x001f
        L_0x0018:
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x002e }
            if (r1 != r0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r3.f67406l     // Catch:{ Exception -> 0x002e }
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = "action_video_auto_resize"
            r2 = 0
            r0.mo60134a(r1, r2)     // Catch:{ Exception -> 0x002e }
            goto L_0x002e
        L_0x002d:
            return
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.longvideo.AdLongVideoPlayFragment.m84123m():void");
    }

    /* renamed from: i */
    private final void m84119i() {
        LayoutParams layoutParams;
        ImageView imageView = this.f67402g;
        if (imageView != null) {
            int a = C21085a.m71116a(imageView.getContext());
            if (a > 0) {
                ImageView imageView2 = this.f67402g;
                if (imageView2 != null) {
                    layoutParams = imageView2.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    if (this.f67396E == 0 && this.f67395D == 0) {
                        this.f67396E = layoutParams2.leftMargin;
                        this.f67395D = layoutParams2.topMargin;
                    }
                    if (this.f67401f) {
                        layoutParams2.leftMargin = a - imageView.getPaddingLeft();
                        layoutParams2.topMargin = this.f67395D;
                    } else {
                        layoutParams2.leftMargin = this.f67396E;
                        layoutParams2.topMargin = this.f67395D + a;
                    }
                    ImageView imageView3 = this.f67402g;
                    if (imageView3 != null) {
                        imageView3.setLayoutParams(layoutParams2);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r0 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == null) goto L_0x0010;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m84120j() {
        /*
            r3 = this;
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = "extra_event_type"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r0 = ""
        L_0x0012:
            r3.f67409o = r0
            android.os.Bundle r0 = r3.getArguments()
            r1 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.String r2 = "extra_page_type"
            int r1 = r0.getInt(r2, r1)
        L_0x0021:
            r3.f67410p = r1
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L_0x0033
            java.lang.String r1 = "extra_business_type"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L_0x0035
        L_0x0033:
            java.lang.String r0 = ""
        L_0x0035:
            r3.f67408n = r0
            r0 = 0
            r3.f67407m = r0
            java.lang.String r0 = "long_video_player_activity"
            java.lang.String r1 = r3.f67408n
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004e
            com.ss.android.ugc.aweme.longvideonew.g r0 = com.p280ss.android.ugc.aweme.longvideonew.C32799g.f85556b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.f67400e
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.mo84325a(r1)
            r3.f67407m = r0
        L_0x004e:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r3.f67407m
            if (r0 != 0) goto L_0x005c
            com.ss.android.ugc.aweme.longvideonew.g r0 = com.p280ss.android.ugc.aweme.longvideonew.C32799g.f85555a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.f67400e
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.mo84325a(r1)
            r3.f67407m = r0
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.longvideo.AdLongVideoPlayFragment.m84120j():void");
    }

    /* renamed from: n */
    private void m84124n() {
        float f;
        FrameLayout frameLayout = this.f67397F;
        if (frameLayout != null) {
            C32798d l = m84122l();
            int a = C21085a.m71116a(frameLayout.getContext());
            if (this.f67401f) {
                frameLayout.setPadding(0, 0, 0, 0);
                frameLayout.getLayoutParams().width = l.f85553a;
                frameLayout.getLayoutParams().height = l.f85554b;
            } else {
                frameLayout.setPadding(a, 0, 0, 0);
                frameLayout.getLayoutParams().width = l.f85554b;
                frameLayout.getLayoutParams().height = l.f85553a;
            }
            frameLayout.requestLayout();
            if (this.f67401f) {
                f = 0.0f;
            } else {
                f = 90.0f;
            }
            frameLayout.animate().rotation(f).withEndAction(new C25593c(l, this)).setDuration(300).start();
        }
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return this.f67409o;
    }

    /* renamed from: a */
    public final void mo66374a(C24574n nVar) {
        this.f67404i = nVar;
        DataCenter dataCenter = this.f67406l;
        if (dataCenter != null) {
            dataCenter.mo60134a("action_video_play_loop", (Object) nVar);
        }
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.b7g) {
            mo66373a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo64929a(C28318an anVar) {
        Integer num;
        User user;
        String str = null;
        if (anVar != null) {
            num = Integer.valueOf(anVar.f74631a);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            C6900g b = C6900g.m21454b();
            C7573i.m23582a((Object) b, "NetworkStateManager.getInstance()");
            if (!b.mo16943d()) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
                return;
            }
            Object obj = anVar.f74632b;
            if (obj != null) {
                Aweme aweme = (Aweme) obj;
                if (aweme != null) {
                    user = aweme.getAuthor();
                } else {
                    user = null;
                }
                if (user != null) {
                    ShareDependService a = C37950a.m121238a();
                    C28297e eVar = this.f67411q;
                    if (eVar != null) {
                        str = eVar.mo71843n();
                    }
                    if (str == null) {
                        str = "";
                    }
                    FragmentActivity requireActivity = requireActivity();
                    C7573i.m23582a((Object) requireActivity, "requireActivity()");
                    a.showReportDialog(aweme, str, requireActivity, "");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        String str;
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -2091198651:
                    if (str.equals("action_switch_mode")) {
                        m84124n();
                        return;
                    }
                    break;
                case -1294386419:
                    if (str.equals("action_video_on_render_ready")) {
                        C24574n nVar = this.f67404i;
                        if (nVar != null) {
                            DataCenter dataCenter = this.f67406l;
                            if (dataCenter != null) {
                                dataCenter.mo60134a("action_video_play_loop", (Object) nVar);
                            }
                        }
                        if (this.f67405j) {
                            DataCenter dataCenter2 = this.f67406l;
                            if (dataCenter2 != null) {
                                dataCenter2.mo60134a("action_video_mute", (Object) null);
                            }
                        }
                        C25591a aVar2 = this.f67403h;
                        if (aVar2 != null) {
                            aVar2.mo65744b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -1235492779:
                    if (str.equals("on_render_first_frame")) {
                        m84123m();
                        break;
                    }
                    break;
                case 356960147:
                    if (str.equals("action_video_on_play_completed") && !this.f67401f) {
                        ImageView imageView = this.f67402g;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        mo66377e();
                        NoOperateModeController noOperateModeController = this.f67413s;
                        if (noOperateModeController != null) {
                            noOperateModeController.f85514c = false;
                        }
                        return;
                    }
                    return;
                case 441659136:
                    if (str.equals("resize_video_and_cover")) {
                        this.f67394C = (C32797c) aVar.mo60161a();
                        C32796a.m106156a((Activity) getActivity(), (View) this.f67417w, (View) this.f67415u, this.f67407m, m84122l(), this.f67401f);
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo60522a(int i, KeyEvent keyEvent) {
        switch (i) {
            case 24:
                DataCenter dataCenter = this.f67406l;
                if (dataCenter != null) {
                    dataCenter.mo60134a("action_keycode_volume_up", (Object) Integer.valueOf(i));
                }
                return true;
            case 25:
                DataCenter dataCenter2 = this.f67406l;
                if (dataCenter2 != null) {
                    dataCenter2.mo60134a("action_keycode_volume_down", (Object) Integer.valueOf(i));
                }
                return true;
            default:
                return false;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m84120j();
        CommerceLikeLayout commerceLikeLayout = this.f67420z;
        if (commerceLikeLayout != null) {
            commerceLikeLayout.setCommerceDigg(this.f67400e);
        }
        this.f67411q = new C28297e(this.f67409o, this.f67410p, this, this);
        C28297e eVar = this.f67411q;
        if (eVar != null) {
            eVar.mo71834a(getActivity(), this);
        }
        C28297e eVar2 = this.f67411q;
        if (eVar2 != null) {
            eVar2.mo71830a();
        }
        Fragment fragment = this;
        this.f67406l = DataCenter.m75849a(C23087c.m75887a(fragment, this), (C0043i) this);
        DataCenter dataCenter = this.f67406l;
        if (dataCenter != null) {
            dataCenter.mo60132a("action_switch_mode", (C0053p<C23083a>) this);
        }
        DataCenter dataCenter2 = this.f67406l;
        if (dataCenter2 != null) {
            dataCenter2.mo60132a("action_video_on_play_completed", (C0053p<C23083a>) this);
        }
        DataCenter dataCenter3 = this.f67406l;
        if (dataCenter3 != null) {
            dataCenter3.mo60132a("resize_video_and_cover", (C0053p<C23083a>) this);
        }
        DataCenter dataCenter4 = this.f67406l;
        if (dataCenter4 != null) {
            dataCenter4.mo60132a("action_video_on_render_ready", (C0053p<C23083a>) this);
        }
        DataCenter dataCenter5 = this.f67406l;
        if (dataCenter5 != null) {
            dataCenter5.mo60132a("on_render_first_frame", (C0053p<C23083a>) this);
        }
        WidgetManager a = WidgetManager.m75867a(fragment, (View) this.f67414t);
        C7573i.m23582a((Object) a, "widgetManager");
        a.mo60153a(this.f67406l);
        VideoPlayerWidget videoPlayerWidget = new VideoPlayerWidget(this.f67400e, this.f67409o, this.f67410p, this.f67408n, this.f67411q, 0, null, 96, null);
        a.mo60157b(R.id.eba, videoPlayerWidget);
        a.mo60157b(R.id.cch, new VideoSeekContainerWidget(this.f67400e, this.f67409o, this.f67410p, this.f67408n));
        a.mo60157b(R.id.apu, new VideoFunctionalLayerWidget(this.f67400e, this.f67409o, this.f67410p, this.f67408n));
        if (!C25594a.m84140a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjt);
        }
        m84121k();
    }

    /* renamed from: a */
    public final void mo66375a(boolean z, C32798d dVar) {
        this.f67401f = z;
        ImageView imageView = this.f67402g;
        if (imageView != null) {
            imageView.setSelected(this.f67401f);
        }
        m84119i();
        DataCenter dataCenter = this.f67406l;
        if (dataCenter != null) {
            dataCenter.mo60134a("action_is_landscape_mode", (Object) Boolean.valueOf(this.f67401f));
        }
        C32793a aVar = this.f67412r;
        if (aVar != null) {
            aVar.mo84323a(this.f67401f);
        }
        C32796a.m106156a((Activity) getActivity(), (View) this.f67417w, (View) this.f67415u, this.f67407m, dVar, this.f67401f);
        C25591a aVar2 = this.f67403h;
        if (aVar2 != null) {
            aVar2.mo65743a(z);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        View view;
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout;
        RelativeLayout relativeLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        CommerceLikeLayout commerceLikeLayout;
        ImageView imageView;
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.ot, viewGroup, false);
        if (inflate != null) {
            this.f67414t = (FrameLayout) inflate;
            FrameLayout frameLayout5 = this.f67414t;
            FrameLayout frameLayout6 = null;
            if (frameLayout5 != null) {
                frameLayout = (FrameLayout) frameLayout5.findViewById(R.id.cww);
            } else {
                frameLayout = null;
            }
            this.f67397F = frameLayout;
            FrameLayout frameLayout7 = this.f67414t;
            if (frameLayout7 != null) {
                view = frameLayout7.findViewById(R.id.lm);
            } else {
                view = null;
            }
            this.f67392A = view;
            FrameLayout frameLayout8 = this.f67414t;
            if (frameLayout8 != null) {
                doubleClickDiggFrameLayout = (DoubleClickDiggFrameLayout) frameLayout8.findViewById(R.id.eb9);
            } else {
                doubleClickDiggFrameLayout = null;
            }
            this.f67416v = doubleClickDiggFrameLayout;
            FrameLayout frameLayout9 = this.f67414t;
            if (frameLayout9 != null) {
                relativeLayout = (RelativeLayout) frameLayout9.findViewById(R.id.dl5);
            } else {
                relativeLayout = null;
            }
            this.f67393B = relativeLayout;
            FrameLayout frameLayout10 = this.f67414t;
            if (frameLayout10 != null) {
                frameLayout2 = (FrameLayout) frameLayout10.findViewById(R.id.apu);
            } else {
                frameLayout2 = null;
            }
            this.f67415u = frameLayout2;
            FrameLayout frameLayout11 = this.f67414t;
            if (frameLayout11 != null) {
                frameLayout3 = (FrameLayout) frameLayout11.findViewById(R.id.c8z);
            } else {
                frameLayout3 = null;
            }
            this.f67418x = frameLayout3;
            FrameLayout frameLayout12 = this.f67414t;
            if (frameLayout12 != null) {
                frameLayout4 = (FrameLayout) frameLayout12.findViewById(R.id.eba);
            } else {
                frameLayout4 = null;
            }
            this.f67417w = frameLayout4;
            FrameLayout frameLayout13 = this.f67414t;
            if (frameLayout13 != null) {
                commerceLikeLayout = (CommerceLikeLayout) frameLayout13.findViewById(R.id.a0_);
            } else {
                commerceLikeLayout = null;
            }
            this.f67420z = commerceLikeLayout;
            FrameLayout frameLayout14 = this.f67414t;
            if (frameLayout14 != null) {
                imageView = (ImageView) frameLayout14.findViewById(R.id.b7g);
            } else {
                imageView = null;
            }
            this.f67402g = imageView;
            ImageView imageView2 = this.f67402g;
            if (imageView2 != null) {
                imageView2.setOnClickListener(this);
            }
            ImageView imageView3 = this.f67402g;
            if (imageView3 != null) {
                imageView3.setSelected(false);
            }
            m84119i();
            FrameLayout frameLayout15 = this.f67414t;
            if (frameLayout15 != null) {
                frameLayout6 = (FrameLayout) frameLayout15.findViewById(R.id.cch);
            }
            this.f67419y = frameLayout6;
            this.f67412r = new C32793a(getActivity(), this.f67414t, this.f67419y);
            NoOperateModeController noOperateModeController = this.f67413s;
            if (noOperateModeController != null) {
                noOperateModeController.mo84299a((C32785a) this);
            }
            return this.f67414t;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
