package com.p280ss.android.ugc.gamora.recorder;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.group.C12604b;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.C44514p;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;

/* renamed from: com.ss.android.ugc.gamora.recorder.NormalGroupScene$createRecordControlScene$$inlined$withChildren$1 */
public final class C44416x7c8148b7 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C12604b f114672a;

    @C0054q(mo125a = Event.ON_CREATE)
    public final void oActivityCreated() {
        List<Triple> arrayList = new ArrayList<>();
        arrayList.add(new Triple(Integer.valueOf(R.id.brp), new C44514p(), "RecordChooseMusicScene"));
        for (Triple triple : arrayList) {
            this.f114672a.mo30925a(((Number) triple.getFirst()).intValue(), (C12629j) triple.getSecond(), (String) triple.getThird());
        }
    }

    public C44416x7c8148b7(C12604b bVar) {
        this.f114672a = bVar;
    }
}
