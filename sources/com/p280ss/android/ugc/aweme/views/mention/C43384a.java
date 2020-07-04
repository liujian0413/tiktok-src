package com.p280ss.android.ugc.aweme.views.mention;

import android.text.Editable;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText.MentionSpan;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.views.mention.a */
final /* synthetic */ class C43384a implements Comparator {

    /* renamed from: a */
    private final Editable f112371a;

    C43384a(Editable editable) {
        this.f112371a = editable;
    }

    public final int compare(Object obj, Object obj2) {
        return MentionEditText.m137659a(this.f112371a, (MentionSpan) obj, (MentionSpan) obj2);
    }
}
