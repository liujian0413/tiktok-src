package cat.ereza.customactivityoncrash;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: cat.ereza.customactivityoncrash.b */
final class C1616b {
    /* renamed from: a */
    static ApplicationInfo m7931a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        TextUtils.equals(str, C6399b.m19921a().getPackageName());
        return packageManager.getApplicationInfo(str, 0);
    }
}
