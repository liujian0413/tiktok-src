package com.bytedance.android.live.p116b;

import android.content.Context;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;

/* renamed from: com.bytedance.android.live.b.a */
public interface C2321a extends C2324b {
    void showFansEntranceDialog(Context context, Room room, boolean z, boolean z2);

    void showJoinFansDialog(Context context, Room room, String str, String str2, boolean z, Map<String, String> map);
}
