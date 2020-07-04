package com.p280ss.android.ugc.aweme.utils;

import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.vesdk.VEUtils;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.cp */
public final class C43021cp {

    /* renamed from: a */
    public static final C43021cp f111605a = new C43021cp();

    private C43021cp() {
    }

    /* renamed from: a */
    public static final boolean m136538a(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        C7573i.m23587b(videoPublishEditModel, "model");
        if (C35563c.f93231M.mo93305a(Property.EnableRemove15sCapMusic)) {
            return false;
        }
        boolean z2 = !C6319n.m19593a(videoPublishEditModel.getDuetFrom());
        if (videoPublishEditModel.getReactionParams() == null || C6319n.m19593a(videoPublishEditModel.getReactionParams().reactionFromId)) {
            z = false;
        } else {
            z = true;
        }
        if (z2 || z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final int m136536a(String str, boolean z) {
        int i;
        if (str == null) {
            return 0;
        }
        int[] iArr = new int[10];
        int audioFileInfo = VEUtils.getAudioFileInfo(str, iArr);
        if (audioFileInfo == 0) {
            i = iArr[3];
        } else {
            StringBuilder sb = new StringBuilder("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ");
            sb.append(audioFileInfo);
            C42880h.m136156a(sb.toString());
            i = C35563c.f93246i.mo103862b(str);
        }
        if (!C35563c.f93231M.mo93305a(Property.EnableRemove15sCapMusic) && C6399b.m19946v() && z) {
            i = Math.min(i, IAVService.MUSIC_LENGTH_FOR_COPYRIGHT);
        }
        return i;
    }
}
