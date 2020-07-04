package com.p280ss.android.ugc.aweme.shortvideo.model;

import android.content.Intent;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AVETParameterKt */
public final class AVETParameterKt {
    public static final AVETParameter generateAVETParam(Intent intent) {
        C7573i.m23587b(intent, "intent");
        if (intent.getSerializableExtra("av_et_parameter") != null) {
            Serializable serializableExtra = intent.getSerializableExtra("av_et_parameter");
            if (serializableExtra != null) {
                return (AVETParameter) serializableExtra;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.model.AVETParameter");
        }
        AVETParameter aVETParameter = new AVETParameter();
        String stringExtra = intent.getStringExtra("creation_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVETParameter.setCreationId(stringExtra);
        aVETParameter.setDraftId(intent.getIntExtra("draft_id", 0));
        String stringExtra2 = intent.getStringExtra("shoot_way");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        aVETParameter.setShootWay(stringExtra2);
        aVETParameter.setShootMode(intent.getIntExtra("shoot_mode", 0));
        if (intent.hasExtra("content_type")) {
            String stringExtra3 = intent.getStringExtra("content_type");
            C7573i.m23582a((Object) stringExtra3, "intent.getStringExtra(EXTRA_CONTENT_TYPE)");
            aVETParameter.setContentType(stringExtra3);
        }
        if (intent.hasExtra("content_source")) {
            String stringExtra4 = intent.getStringExtra("content_source");
            C7573i.m23582a((Object) stringExtra4, "intent.getStringExtra(EXTRA_CONTENT_SOURCE)");
            aVETParameter.setContentSource(stringExtra4);
        }
        return aVETParameter;
    }
}
