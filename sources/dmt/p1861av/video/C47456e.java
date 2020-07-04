package dmt.p1861av.video;

import android.arch.lifecycle.C0053p;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: dmt.av.video.e */
public class C47456e<T> implements C0053p<T> {

    /* renamed from: a */
    static boolean f121858a = C7163a.m22363a();

    public void onChanged(T t) {
        String str;
        if (!f121858a) {
            if (t == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                str = t.toString();
            }
            C6921a.m21562b("LogObserver", str);
        }
    }
}
