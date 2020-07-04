package com.zhihu.matisse;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.p022v4.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;

/* renamed from: com.zhihu.matisse.a */
public final class C47321a {

    /* renamed from: a */
    private final WeakReference<Activity> f121418a;

    /* renamed from: b */
    private final WeakReference<Fragment> f121419b;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Fragment mo119332b() {
        if (this.f121419b != null) {
            return (Fragment) this.f121419b.get();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Activity mo119330a() {
        return (Activity) this.f121418a.get();
    }

    private C47321a(Activity activity) {
        this(activity, null);
    }

    /* renamed from: a */
    public static C47321a m147748a(Activity activity) {
        return new C47321a(activity);
    }

    /* renamed from: b */
    public static List<String> m147752b(Intent intent) {
        return intent.getStringArrayListExtra("extra_result_selection_path");
    }

    private C47321a(Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    /* renamed from: a */
    public static C47321a m147749a(Fragment fragment) {
        return new C47321a(fragment);
    }

    /* renamed from: a */
    public static List<Uri> m147751a(Intent intent) {
        return intent.getParcelableArrayListExtra("extra_result_selection");
    }

    /* renamed from: a */
    public final C47323b mo119331a(Set<MimeType> set) {
        return m147750a(set, true);
    }

    private C47321a(Activity activity, Fragment fragment) {
        this.f121418a = new WeakReference<>(activity);
        this.f121419b = new WeakReference<>(fragment);
    }

    /* renamed from: a */
    private C47323b m147750a(Set<MimeType> set, boolean z) {
        return new C47323b(this, set, true);
    }
}
