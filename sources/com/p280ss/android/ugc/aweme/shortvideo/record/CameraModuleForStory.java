package com.p280ss.android.ugc.aweme.shortvideo.record;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.util.SparseIntArray;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.camera.C20713c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.CameraModuleForStory */
public class CameraModuleForStory implements C0042h, C20713c {

    /* renamed from: b */
    public static SparseIntArray f104657b;

    /* renamed from: a */
    public final C20707b f104658a;

    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
        m128714a(0);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f104657b = sparseIntArray;
        sparseIntArray.put(0, R.drawable.aq6);
        f104657b.put(1, R.drawable.aq7);
        f104657b.put(2, R.drawable.aq7);
        f104657b.put(3, R.drawable.aq5);
    }

    /* renamed from: a */
    private void m128714a(int i) {
        this.f104658a.mo55944b(0);
    }

    /* renamed from: a */
    public final void mo56008a(int i, float f, boolean z) {
        StringBuilder sb = new StringBuilder(" size = ");
        sb.append(f);
        C6893q.m21447a("zoom_info_log", new C38510bb().mo96481a("camera_zoom_size", sb.toString()).mo96482b());
    }

    /* renamed from: a */
    public final void mo56009a(int i, boolean z, boolean z2, float f, List<Integer> list) {
        String str;
        String str2 = "zoom_info_log";
        C38510bb a = new C38510bb().mo96479a("cameraType", Integer.valueOf(i)).mo96477a("supportZoom", Boolean.valueOf(z)).mo96477a("supportSmooth", Boolean.valueOf(z2)).mo96478a("maxZoom", Float.valueOf(f));
        String str3 = "ratios";
        if (C6311g.m19574b(list)) {
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(0));
            str = sb.toString();
        } else {
            str = " ";
        }
        C6893q.m21447a(str2, a.mo96481a(str3, str).mo96482b());
    }
}
