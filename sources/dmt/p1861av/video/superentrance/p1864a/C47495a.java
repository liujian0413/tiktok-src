package dmt.p1861av.video.superentrance.p1864a;

import android.content.Intent;
import com.bytedance.common.utility.collection.C6307b;
import java.util.Collection;
import java.util.Set;

/* renamed from: dmt.av.video.superentrance.a.a */
public final class C47495a {
    /* renamed from: a */
    public static final void m148231a(Intent intent, Intent intent2) {
        if (intent != null) {
            intent2.setAction(intent.getAction());
        }
    }

    /* renamed from: b */
    public static final void m148232b(Intent intent, Intent intent2) {
        if (intent != null) {
            Set<String> categories = intent.getCategories();
            if (!C6307b.m19566a((Collection<T>) categories)) {
                for (String addCategory : categories) {
                    intent2.addCategory(addCategory);
                }
            }
        }
    }
}
