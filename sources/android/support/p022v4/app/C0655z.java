package android.support.p022v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.os.Bundle;
import android.support.p022v4.app.NotificationCompat.C0574a;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: android.support.v4.app.z */
final class C0655z {

    /* renamed from: a */
    private static final Object f2535a = new Object();

    /* renamed from: b */
    private static Field f2536b;

    /* renamed from: c */
    private static boolean f2537c;

    /* renamed from: d */
    private static final Object f2538d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m2835a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m2832a(Notification notification) {
        synchronized (f2535a) {
            if (f2537c) {
                return null;
            }
            try {
                if (f2536b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        f2537c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2536b = declaredField;
                }
                Bundle bundle = (Bundle) f2536b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2536b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                f2537c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    static Bundle m2833a(C0574a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", aVar.f2262g);
        bundle2.putCharSequence("title", aVar.f2263h);
        bundle2.putParcelable("actionIntent", aVar.f2264i);
        if (aVar.f2256a != null) {
            bundle = new Bundle(aVar.f2256a);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f2259d);
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m2836a(aVar.f2257b));
        bundle2.putBoolean("showsUserInterface", aVar.f2260e);
        bundle2.putInt("semanticAction", aVar.f2261f);
        return bundle2;
    }

    /* renamed from: a */
    private static Bundle m2834a(C0590ad adVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", adVar.f2349a);
        bundle.putCharSequence("label", adVar.f2350b);
        bundle.putCharSequenceArray("choices", adVar.f2351c);
        bundle.putBoolean("allowFreeFormInput", adVar.f2352d);
        bundle.putBundle("extras", adVar.f2353e);
        Set<String> set = adVar.f2354f;
        if (set != null && !set.isEmpty()) {
            ArrayList arrayList = new ArrayList(set.size());
            for (String add : set) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: a */
    private static Bundle[] m2836a(C0590ad[] adVarArr) {
        if (adVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[adVarArr.length];
        for (int i = 0; i < adVarArr.length; i++) {
            bundleArr[i] = m2834a(adVarArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: a */
    public static Bundle m2831a(Builder builder, C0574a aVar) {
        builder.addAction(aVar.f2262g, aVar.f2263h, aVar.f2264i);
        Bundle bundle = new Bundle(aVar.f2256a);
        if (aVar.f2257b != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m2836a(aVar.f2257b));
        }
        if (aVar.f2258c != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m2836a(aVar.f2258c));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f2259d);
        return bundle;
    }
}
