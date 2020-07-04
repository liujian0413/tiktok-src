package com.p280ss.android.ugc.aweme.video;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.player.p334ab.C7189a;
import com.p280ss.android.ugc.aweme.video.experiment.MultiPlayerExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerRefactorExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerTypeExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerTypeV2Experiment;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;

/* renamed from: com.ss.android.ugc.aweme.video.o */
public class C43268o {

    /* renamed from: a */
    public static final boolean f112004a = C6384b.m19835a().mo15292a(MultiPlayerExperiment.class, true, "enable_multi_player", C6384b.m19835a().mo15295d().enable_multi_player, false);

    /* renamed from: b */
    private static boolean f112005b = C6384b.m19835a().mo15292a(PlayerRefactorExperiment.class, true, "player_refactor", C6384b.m19835a().mo15295d().player_refactor, false);

    /* renamed from: H */
    public static final boolean m137250H() {
        return f112005b;
    }

    /* renamed from: I */
    public static C7189a m137251I() {
        try {
            return (C7189a) C6384b.m19835a().mo15290a(PlayerTypeV2Experiment.class, true, "player_type_v2", (Object) C6384b.m19835a().mo15295d().player_type_v2, C7189a.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: J */
    public static Type m137252J() {
        if (m137251I() == null && mo104901a() == 6) {
            return Type.TT_HARDWARE;
        }
        return Type.TT;
    }

    /* renamed from: a */
    private static int mo104901a() {
        return C6384b.m19835a().mo15287a(PlayerTypeExperiment.class, true, "player_type", C6384b.m19835a().mo15295d().player_type, 0);
    }
}
