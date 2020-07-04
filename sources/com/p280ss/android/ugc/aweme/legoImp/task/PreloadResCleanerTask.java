package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.LongSparseArray;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.reflect.C6320a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadResCleanerTask */
public class PreloadResCleanerTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        C6921a.m21555a("PreloadResCleanerTask");
        if (VERSION.SDK_INT >= 24) {
            preloadResCleaner(context);
        } else {
            preloadResCleanerForM(context);
        }
    }

    private void preloadResCleanerForM(Context context) {
        try {
            Resources resources = context.getApplicationContext().getResources();
            Object a = C6320a.m19599a((Object) resources, "sPreloadedDrawables");
            if (a instanceof LongSparseArray[]) {
                for (LongSparseArray a2 : (LongSparseArray[]) a) {
                    C6307b.m19565a((Object) a2);
                }
            } else {
                C6307b.m19565a((Object) (LongSparseArray) a);
            }
            C6307b.m19565a(C6320a.m19599a((Object) resources, "sPreloadedColorDrawables"));
            C6307b.m19565a(C6320a.m19599a((Object) resources, "sPreloadedColorStateLists"));
            C6307b.m19565a(C6320a.m19599a((Object) resources, "mDrawableCache"));
            C6307b.m19565a(C6320a.m19599a((Object) resources, "mColorDrawableCache"));
            C6307b.m19565a(C6320a.m19599a((Object) resources, "mColorStateListCache"));
        } catch (Exception unused) {
        }
    }

    private void preloadResCleaner(Context context) {
        try {
            Object a = C6320a.m19599a((Object) context.getApplicationContext().getResources(), "mResourcesImpl");
            if (a != null) {
                Object a2 = C6320a.m19599a(a, "sPreloadedDrawables");
                if (a2 instanceof LongSparseArray[]) {
                    for (LongSparseArray a3 : (LongSparseArray[]) a2) {
                        C6307b.m19565a((Object) a3);
                    }
                } else {
                    C6307b.m19565a((Object) (LongSparseArray) a2);
                }
                C6307b.m19565a(C6320a.m19599a(a, "sPreloadedColorDrawables"));
                C6307b.m19565a(C6320a.m19599a(a, "sPreloadedComplexColors"));
                Object a4 = C6320a.m19599a(a, "mDrawableCache");
                if (a4 != null) {
                    C6307b.m19565a(C6320a.m19599a(a4, "mNullThemedEntries"));
                    C6307b.m19565a(C6320a.m19599a(a4, "mThemedEntries"));
                    C6307b.m19565a(C6320a.m19599a(a4, "mUnthemedEntries"));
                }
                C6307b.m19565a(C6320a.m19599a(a, "mDrawableCache"));
                C6307b.m19565a(C6320a.m19599a(a, "mColorDrawableCache"));
                C6307b.m19565a(C6320a.m19599a(a, "mColorStateListCache"));
            }
        } catch (Exception unused) {
        }
    }
}
