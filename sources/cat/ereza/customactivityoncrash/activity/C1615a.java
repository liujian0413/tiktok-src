package cat.ereza.customactivityoncrash.activity;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: cat.ereza.customactivityoncrash.activity.a */
final class C1615a {
    /* renamed from: a */
    static void m7930a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
