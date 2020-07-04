package com.bytedance.android.livesdk.rank;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.chatroom.event.C4434d;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.rank.d */
final /* synthetic */ class C8840d implements OnClickListener {

    /* renamed from: a */
    private final DailyRankDialog f24027a;

    /* renamed from: b */
    private final C4434d f24028b;

    /* renamed from: c */
    private final HashMap f24029c;

    /* renamed from: d */
    private final boolean f24030d;

    C8840d(DailyRankDialog dailyRankDialog, C4434d dVar, HashMap hashMap, boolean z) {
        this.f24027a = dailyRankDialog;
        this.f24028b = dVar;
        this.f24029c = hashMap;
        this.f24030d = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f24027a.mo21868a(this.f24028b, this.f24029c, this.f24030d, dialogInterface, i);
    }
}
