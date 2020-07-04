package com.p280ss.android.ugc.aweme.video.p1700d;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.webkit.CookieManager;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.account.token.C18897a;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.player.C34959b;
import com.p280ss.android.ugc.aweme.player.p334ab.C7189a;
import com.p280ss.android.ugc.aweme.player.p334ab.C7190b;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbDashAudioRangeExp;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbDashHijackBackupDnsExp;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbDashHijackEnableExp;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbDashHijackMainDnsExp;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbDashRangeExp;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbDashVideoRangeExp;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbEnableEngineReuseMTKHuaweWorkaroundExp;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbEnableVolumeBalanceExp;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbSkipFindStreamInfoExp;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbUseCodecPoolExp;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbVolumeBalanceDataExp;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.VolumeBalanceData;
import com.p280ss.android.ugc.aweme.player.sdk.C34963a;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.p280ss.android.ugc.aweme.player.sdk.p1458a.C34964a;
import com.p280ss.android.ugc.aweme.video.C43268o;
import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import com.p280ss.android.ugc.aweme.video.experiment.EnablePlayerLogExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.ExposeTTPlayerCrashSignalExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayeAbDisablePlayerTimeoutExp;
import com.p280ss.android.ugc.aweme.video.experiment.PlayeAbEnableSeekInterruptExp;
import com.p280ss.android.ugc.aweme.video.experiment.PlayeAbReuseEngineExp;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerBufferDataTimeMsExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerCodecSyncModeExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerMaxBufferTimeMsExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerOptionCacheExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerUnifiedAbConfigExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.SUperResCpuCoreNumsExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.SuperRes265Experiment;
import com.p280ss.android.ugc.aweme.video.experiment.SuperResBitrateExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.SuperResCpuFrequencyExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.SuperResRatioLevelExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.TTPlayerUseSysAudioCodecExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.TTplayerHardwareMediaRenderTypeExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.TTplayerIPCExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.VideoCacheEnableSetPlayinfoToP2pExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.VideoCacheLoaderTypeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.C43283g;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.C44915a;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.C44916b;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import com.p280ss.ttvideoengine.TTVideoEngine;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.video.d.d */
public final class C43209d {
    /* renamed from: a */
    public static IPlayer m137008a(Type type) {
        return m137009a(type, false);
    }

    /* renamed from: a */
    public static IPlayer m137009a(Type type, boolean z) {
        int i;
        int i2;
        C7190b bVar;
        boolean z2;
        boolean z3;
        Type type2 = type;
        boolean z4 = z;
        PlayerConfig a = PlayerConfig.m141681a().mo107391a(type2);
        a.mo107387a(C6399b.m19921a());
        if (type2 == Type.Ijk || type2 == Type.IjkHardware) {
            a.mo107390a(C43210e.f111851a);
        } else if (type2 == Type.TT || type2 == Type.TT_IJK_ENGINE || type2 == Type.TT_HARDWARE) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseArray sparseArray = new SparseArray();
            sparseIntArray.put(1, z4 ? 1 : 0);
            int a2 = C6384b.m19835a().mo15287a(PlayeAbEnableVolumeBalanceExp.class, true, "player_enable_volume_balance", C6384b.m19835a().mo15295d().player_enable_volume_balance, 0);
            sparseIntArray.put(28, a2);
            if (a2 == 1) {
                try {
                    VolumeBalanceData volumeBalanceData = (VolumeBalanceData) C6384b.m19835a().mo15290a(PlayeAbVolumeBalanceDataExp.class, true, "player_volume_balance_data", (Object) C6384b.m19835a().mo15295d().player_volume_balance_data, VolumeBalanceData.class);
                    if (volumeBalanceData != null) {
                        sparseArray.put(29, Float.valueOf(volumeBalanceData.getPregain()));
                        sparseArray.put(30, Float.valueOf(volumeBalanceData.getThreshold()));
                        sparseArray.put(31, Float.valueOf(volumeBalanceData.getRatio()));
                        sparseArray.put(32, Float.valueOf(volumeBalanceData.getPredelay()));
                    }
                } catch (Throwable unused) {
                }
            }
            C7189a I = C43268o.m137251I();
            if (I != null) {
                C7163a.m22363a();
                sparseIntArray.put(17, I.f20118c);
                sparseIntArray.put(16, I.f20117b);
                if (I.f20118c == 1) {
                    a.mo107395e();
                }
                if (I.f20117b == 1) {
                    a.mo107394d();
                }
            } else {
                C7163a.m22363a();
                if (type2 == Type.TT_HARDWARE) {
                    a.mo107394d();
                    a.mo107395e();
                }
            }
            if (!C6399b.m19947w() && !z4 && type2 == Type.TT_IJK_ENGINE) {
                sparseIntArray.put(0, 10);
            }
            sparseIntArray.put(2, 1);
            sparseIntArray.put(19, C6384b.m19835a().mo15287a(TTplayerHardwareMediaRenderTypeExperiment.class, true, "ttplayer_hardware_media_render_type", C6384b.m19835a().mo15295d().ttplayer_hardware_media_render_type, 1));
            int i3 = 1000;
            try {
                i3 = C6384b.m19835a().mo15287a(PlayerBufferDataTimeMsExperiment.class, true, "player_buffer_data_time", C6384b.m19835a().mo15295d().player_buffer_data_time, 1000);
            } catch (Exception unused2) {
            }
            sparseIntArray.put(3, i3);
            if (C6399b.m19944t()) {
                sparseIntArray.put(4, 5000);
                sparseIntArray.put(5, 1);
            } else {
                sparseIntArray.put(4, C6384b.m19835a().mo15287a(PlayerMaxBufferTimeMsExperiment.class, true, "player_max_buffer_time", C6384b.m19835a().mo15295d().player_max_buffer_time, 5000));
                sparseIntArray.put(5, C6384b.m19835a().mo15287a(EnablePlayerLogExperiment.class, true, "enable_player_log", C6384b.m19835a().mo15295d().enable_player_log, 1));
            }
            if (C43220a.m137073b() == 2) {
                i = 1;
            } else {
                i = 0;
            }
            sparseIntArray.put(15, i);
            if (C34959b.f91243a) {
                sparseIntArray.put(6, 1);
            }
            if (!z4) {
                Boolean bool = (Boolean) SharePrefCache.inst().getEableUltraResolution().mo59877d();
                Boolean bool2 = (Boolean) SharePrefCache.inst().isInUltraResBlackList().mo59877d();
                if (bool != null && bool.booleanValue() && bool2 != null && !bool2.booleanValue() && C6399b.m19944t()) {
                    sparseIntArray.put(7, 1);
                    sparseIntArray.put(8, ((Integer) SharePrefCache.inst().getUltraResolutionLevel().mo59877d()).intValue());
                    sparseIntArray.put(9, ((Boolean) SharePrefCache.inst().getEnableAntiAliasing().mo59877d()).booleanValue() ? 1 : 0);
                    sparseIntArray.put(12, C6384b.m19835a().mo15287a(SuperRes265Experiment.class, true, "super_res_265", C6384b.m19835a().mo15295d().super_res_265, 0));
                    sparseIntArray.put(11, C6384b.m19835a().mo15287a(SuperResBitrateExperiment.class, true, "super_res_bitrate", C6384b.m19835a().mo15295d().super_res_bitrate, 0));
                    sparseIntArray.put(10, C6384b.m19835a().mo15287a(SuperResRatioLevelExperiment.class, true, "super_res_ratio_level", C6384b.m19835a().mo15295d().super_res_ratio_level, 0));
                    sparseIntArray.put(13, C6384b.m19835a().mo15287a(SUperResCpuCoreNumsExperiment.class, true, "super_res_cpu_nums", C6384b.m19835a().mo15295d().super_res_cpu_nums, 0));
                    sparseIntArray.put(14, C6384b.m19835a().mo15287a(SuperResCpuFrequencyExperiment.class, true, "super_res_cpu_frequency", C6384b.m19835a().mo15295d().super_res_cpu_frequency, 0));
                }
            }
            if (C6384b.m19835a().mo15287a(TTplayerIPCExperiment.class, true, "ttplayer_is_ipc", C6384b.m19835a().mo15295d().ttplayer_is_ipc, 0) == 1) {
                sparseIntArray.put(0, 1);
            }
            if (C6384b.m19835a().mo15287a(ExposeTTPlayerCrashSignalExperiment.class, true, "enable_expose_ttplayer_crash_signal", C6384b.m19835a().mo15295d().enable_expose_ttplayer_crash_signal, 0) == 1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            sparseIntArray.put(22, i2);
            if (C6384b.m19835a().mo15287a(TTPlayerUseSysAudioCodecExperiment.class, true, "ttplayer_use_sys_audio_codec", C6384b.m19835a().mo15295d().ttplayer_use_sys_audio_codec, 0) == 1) {
                sparseIntArray.put(18, 1);
            }
            sparseIntArray.put(20, C6384b.m19835a().mo15287a(PlayerCodecSyncModeExperiment.class, true, "player_codec_sync_mode", C6384b.m19835a().mo15295d().player_codec_sync_mode, 0));
            try {
                bVar = (C7190b) C6384b.m19835a().mo15290a(PlayerUnifiedAbConfigExperiment.class, true, "player_unified_ab_config", (Object) C6384b.m19835a().mo15295d().player_unified_ab_config, C7190b.class);
            } catch (Throwable unused3) {
                bVar = null;
            }
            if (bVar != null) {
                sparseIntArray.put(23, bVar.f20120a);
                sparseIntArray.put(24, bVar.f20121b);
                sparseIntArray.put(25, bVar.f20122c);
                sparseIntArray.put(26, bVar.f20123d);
                sparseIntArray.put(27, bVar.f20124e);
            }
            try {
                if (C6384b.m19835a().mo15287a(PlayeAbEnableEngineReuseMTKHuaweWorkaroundExp.class, true, "player_enable_reuse_mtk_hw_workaround", C6384b.m19835a().mo15295d().player_enable_reuse_mtk_hw_workaround, 0) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a.f115506k = z2;
                sparseIntArray.put(33, C6384b.m19835a().mo15287a(PlayerOptionCacheExperiment.class, true, "player_option_cache", C6384b.m19835a().mo15295d().player_option_cache, 15));
                sparseIntArray.put(34, C6384b.m19835a().mo15287a(PlayeAbReuseEngineExp.class, true, "player_reuse_engine", C6384b.m19835a().mo15295d().player_reuse_engine, 0));
                sparseIntArray.put(35, C6384b.m19835a().mo15287a(PlayeAbDisablePlayerTimeoutExp.class, true, "player_disable_timeout", C6384b.m19835a().mo15295d().player_disable_timeout, 1));
                sparseIntArray.put(36, C6384b.m19835a().mo15287a(PlayeAbEnableSeekInterruptExp.class, true, "player_enable_seek_interrupt", C6384b.m19835a().mo15295d().player_enable_seek_interrupt, 0));
                C44915a aVar = new C44915a();
                aVar.f115511c = C6384b.m19835a().mo15287a(PlayeAbDashRangeExp.class, true, "player_dash_range", C6384b.m19835a().mo15295d().player_dash_range, 1);
                aVar.f115512d = C6384b.m19835a().mo15287a(PlayeAbDashVideoRangeExp.class, true, "player_dash_video_range", C6384b.m19835a().mo15295d().player_dash_video_range, 1048576);
                aVar.f115513e = C6384b.m19835a().mo15287a(PlayeAbDashAudioRangeExp.class, true, "player_dash_audio_range", C6384b.m19835a().mo15295d().player_dash_audio_range, 409600);
                aVar.f115514f = C6384b.m19835a().mo15287a(PlayeAbSkipFindStreamInfoExp.class, true, "player_skip_find_stream_info", C6384b.m19835a().mo15295d().player_skip_find_stream_info, 1);
                aVar.f115515g = C6384b.m19835a().mo15287a(PlayeAbDashHijackEnableExp.class, true, "player_dash_enable_hijack", C6384b.m19835a().mo15295d().player_dash_enable_hijack, 0);
                aVar.f115516h = C6384b.m19835a().mo15287a(PlayeAbDashHijackMainDnsExp.class, true, "player_dash_hijack_main_dns", C6384b.m19835a().mo15295d().player_dash_hijack_main_dns, 2);
                aVar.f115517i = C6384b.m19835a().mo15287a(PlayeAbDashHijackBackupDnsExp.class, true, "player_dash_hijack_backup_dns", C6384b.m19835a().mo15295d().player_dash_hijack_backup_dns, 0);
                String cookie = CookieManager.getInstance().getCookie(C19223b.f51886a);
                Map<String, String> a3 = C18897a.m61680a(C19223b.f51886a);
                C44916b bVar2 = new C44916b();
                bVar2.f115518a = cookie;
                bVar2.f115519b = a3;
                a.f115505j = bVar2;
                if (C6384b.m19835a().mo15287a(PlayeAbUseCodecPoolExp.class, true, "player_use_codecpool", C6384b.m19835a().mo15295d().player_use_codecpool, 0) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                a.f115504i = z3;
                a.f115503h = aVar;
            } catch (Throwable th) {
                C2077a.m9160a(th);
            }
            a.mo107389a(sparseIntArray);
            a.mo107388a(sparseArray);
            C34963a.f91251a = C7163a.m22363a();
            TTVideoEngine.setForceUsePluginPlayer(false);
            if (C43283g.m137315a()) {
                int a4 = C6384b.m19835a().mo15287a(VideoCacheLoaderTypeExperiment.class, true, "videocache_loader_type", C6384b.m19835a().mo15295d().videocache_loader_type, 0);
                if (a4 > 0) {
                    sparseIntArray.put(39, a4);
                    sparseIntArray.put(38, C6384b.m19835a().mo15287a(VideoCacheEnableSetPlayinfoToP2pExperiment.class, true, "enable_set_playinfo_to_p2p", C6384b.m19835a().mo15295d().enable_set_playinfo_to_p2p, 0));
                    if (C6903bc.m21469J().mo57898a()) {
                        sparseIntArray.put(37, 1);
                    }
                }
            }
        } else if (type2 == Type.LIVE) {
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            sparseIntArray2.append(38, 0);
            sparseIntArray2.append(87, 1);
            sparseIntArray2.append(15, 1);
            sparseIntArray2.append(36, 1);
            a.mo107389a(sparseIntArray2);
        }
        return C34964a.m112652a(a);
    }
}
