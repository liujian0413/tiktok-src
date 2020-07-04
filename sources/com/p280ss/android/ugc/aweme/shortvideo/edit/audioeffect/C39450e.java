package com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.text.TextUtils;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e */
public final class C39450e {

    /* renamed from: a */
    public static final C39450e f102409a = new C39450e();

    private C39450e() {
    }

    /* renamed from: a */
    public static final String m125993a(String str, VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(str, "key");
        String str2 = "";
        int hashCode = str.hashCode();
        AVETParameter aVETParameter = null;
        if (hashCode != 502589089) {
            if (hashCode != 831846208) {
                if (hashCode == 2061724374 && str.equals("shoot_entrance")) {
                    if (videoPublishEditModel != null) {
                        aVETParameter = videoPublishEditModel.getAvetParameter();
                    }
                    if (aVETParameter != null) {
                        str2 = videoPublishEditModel.getAvetParameter().getStoryShootEntrance();
                    }
                }
            } else if (str.equals("content_type")) {
                if (videoPublishEditModel != null) {
                    aVETParameter = videoPublishEditModel.getAvetParameter();
                }
                if (aVETParameter != null) {
                    str2 = videoPublishEditModel.getAvetParameter().getContentType();
                }
            }
        } else if (str.equals("content_source")) {
            if (videoPublishEditModel != null) {
                aVETParameter = videoPublishEditModel.getAvetParameter();
            }
            if (aVETParameter != null) {
                str2 = videoPublishEditModel.getAvetParameter().getContentSource();
            }
        }
        if (str2 == null || TextUtils.equals(TEVideoRecorder.FACE_BEAUTY_NULL, str2)) {
            return "";
        }
        return str2;
    }
}
