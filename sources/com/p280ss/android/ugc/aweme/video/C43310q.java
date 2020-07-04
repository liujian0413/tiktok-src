package com.p280ss.android.ugc.aweme.video;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.lancet.C32281i;
import com.p280ss.android.ugc.aweme.p932aa.C21096a;
import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import com.p280ss.android.ugc.aweme.video.experiment.Enable265Experiment;
import com.p280ss.android.ugc.aweme.video.experiment.EnableH265BlackListExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.ForceTokeepSurfaceBelowKITKATExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.MultiPlayerExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerFramesWaitExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerUseVideoTextureRendererExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.TTPlayerAsyncInitExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.TTPlayerRenderTypeExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.TTplayerHardwareMediaRenderTypeExperiment;
import com.p280ss.android.ugc.aweme.video.local.C7277g;
import com.p280ss.android.ugc.aweme.video.p1698b.C43194a;
import com.p280ss.android.ugc.aweme.video.p1698b.C43195b;
import com.p280ss.android.ugc.aweme.video.p1700d.C43208c;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.playerkit.model.C44917a;
import com.p280ss.android.ugc.playerkit.model.C44918b;
import com.p280ss.android.ugc.playerkit.model.C44922f;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import com.p280ss.android.ugc.playerkit.p1751b.C44912a;
import com.p280ss.android.ugc.playerkit.p1751b.C44913b;
import com.p280ss.android.ugc.playerkit.videoview.CommonWidget;
import com.p280ss.android.ugc.playerkit.videoview.p1754c.C44944a;

/* renamed from: com.ss.android.ugc.aweme.video.q */
public final class C43310q {

    /* renamed from: a */
    public static boolean f112118a;

    /* renamed from: a */
    public static void m137423a() {
        f112118a = true;
    }

    /* renamed from: b */
    public static void m137424b() {
        f112118a = false;
    }

    /* renamed from: d */
    public static boolean m137426d() {
        return C7277g.m22829a();
    }

    /* renamed from: c */
    public static void m137425c() {
        C44917a.m141692r().f115521a = new C44922f() {

            /* renamed from: a */
            Boolean f112119a;

            /* renamed from: m */
            public final C44918b mo105110m() {
                return PrepareConfig.Normal;
            }

            /* renamed from: a */
            public final Type mo105098a() {
                return C43268o.m137252J();
            }

            /* renamed from: f */
            public final boolean mo105103f() {
                return C7277g.m22829a();
            }

            /* renamed from: g */
            public final double mo105104g() {
                return C43220a.m137074c();
            }

            /* renamed from: h */
            public final int mo105105h() {
                return C43220a.m137073b();
            }

            /* renamed from: i */
            public final boolean mo105106i() {
                return C43208c.m137005c();
            }

            /* renamed from: l */
            public final Context mo105109l() {
                return C6399b.m19921a();
            }

            /* renamed from: j */
            public final boolean mo105107j() {
                if (C32281i.f84347a || C43310q.f112118a) {
                    return true;
                }
                return false;
            }

            /* renamed from: k */
            public final boolean mo105108k() {
                return VideoBitRateABManager.m22786c().mo19004e();
            }

            /* renamed from: r */
            private boolean m137427r() {
                if (this.f112119a == null) {
                    this.f112119a = Boolean.valueOf(C6776h.m20942a());
                }
                return this.f112119a.booleanValue();
            }

            /* renamed from: b */
            public final int mo105099b() {
                return C6384b.m19835a().mo15287a(TTPlayerRenderTypeExperiment.class, true, "ttplayer_render_type", C6384b.m19835a().mo15295d().ttplayer_render_type, 0);
            }

            /* renamed from: c */
            public final boolean mo105100c() {
                return C6384b.m19835a().mo15292a(MultiPlayerExperiment.class, true, "enable_multi_player", C6384b.m19835a().mo15295d().enable_multi_player, false);
            }

            /* renamed from: d */
            public final boolean mo105101d() {
                return C6384b.m19835a().mo15292a(Enable265Experiment.class, true, "enable_h265", C6384b.m19835a().mo15295d().enable_h265, true);
            }

            /* renamed from: e */
            public final boolean mo105102e() {
                return C6384b.m19835a().mo15292a(EnableH265BlackListExperiment.class, true, "enable_h265_black_list", C6384b.m19835a().mo15295d().enable_h265_black_list, false);
            }

            /* renamed from: n */
            public final boolean mo105111n() {
                return C6384b.m19835a().mo15292a(ForceTokeepSurfaceBelowKITKATExperiment.class, true, "should_force_to_keep_surface_below_kitkat", C6384b.m19835a().mo15295d().should_force_to_keep_surface_below_kitkat, false);
            }

            /* renamed from: o */
            public final boolean mo105112o() {
                return C6384b.m19835a().mo15292a(TTPlayerAsyncInitExperiment.class, true, "is_ttplayer_async_init", C6384b.m19835a().mo15295d().is_ttplayer_async_init, true);
            }

            /* renamed from: p */
            public final int mo105113p() {
                return C6384b.m19835a().mo15287a(PlayerFramesWaitExperiment.class, true, "player_framews_wait", C6384b.m19835a().mo15295d().player_framews_wait, 1);
            }

            /* renamed from: q */
            public final boolean mo105114q() {
                if (!C6384b.m19835a().mo15292a(PlayerUseVideoTextureRendererExperiment.class, true, "player_use_video_texture_renderer", C6384b.m19835a().mo15295d().player_use_video_texture_renderer, false) || mo105103f() || ((m137427r() && VERSION.SDK_INT >= 27) || C6384b.m19835a().mo15287a(TTplayerHardwareMediaRenderTypeExperiment.class, true, "ttplayer_hardware_media_render_type", C6384b.m19835a().mo15295d().ttplayer_hardware_media_render_type, 1) == 0)) {
                    return false;
                }
                return true;
            }
        };
        CommonWidget playUrlBuilder = CommonWidget.INSTANCE.setBitrateManager(C43312r.f112120a).setHttpsHelper(C43313s.f112121a).setPlayUrlBuilder(C43314t.f112122a);
        C43305j g = C43305j.m137386g();
        g.getClass();
        playUrlBuilder.setCacheChecker(C43315u.m137448a(g)).setPlayInfoCallback(new C43266n());
        C44913b.m141675a((C44912a) new C21096a());
        C44944a.m141816a().f115611b = new C43194a();
        C44944a.m141816a().f115610a = new C43195b();
    }
}
