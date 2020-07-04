package com.p280ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Window;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask */
public final class ReleaseWindowBackgroundTask implements LegoTask {
    public static final C32387a Companion = new C32387a(null);
    public final WeakReference<Activity> activityWeakReference;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask$a */
    public static final class C32387a {
        private C32387a() {
        }

        public /* synthetic */ C32387a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask$b */
    static final class C32388b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReleaseWindowBackgroundTask f84507a;

        /* renamed from: b */
        final /* synthetic */ ObjectRef f84508b;

        C32388b(ReleaseWindowBackgroundTask releaseWindowBackgroundTask, ObjectRef objectRef) {
            this.f84507a = releaseWindowBackgroundTask;
            this.f84508b = objectRef;
        }

        public final void run() {
            WeakReference<Activity> weakReference = this.f84507a.activityWeakReference;
            if (weakReference != null) {
                Activity activity = (Activity) weakReference.get();
                if (activity != null) {
                    Window window = activity.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable((Drawable) this.f84508b.element);
                    }
                }
            }
        }
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public ReleaseWindowBackgroundTask(Activity activity) {
        C7573i.m23587b(activity, "activity");
        this.activityWeakReference = new WeakReference<>(activity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d A[Catch:{ Exception -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060 A[Catch:{ Exception -> 0x0068 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.main.experiment.ReleaseWindowBackgroundExperiment> r2 = com.p280ss.android.ugc.aweme.main.experiment.ReleaseWindowBackgroundExperiment.class
            java.lang.String r4 = "is_release_window_background"
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r3 = r3.mo15295d()
            boolean r5 = r3.is_release_window_background
            r3 = 1
            r6 = 0
            boolean r1 = r1.mo15292a(r2, r3, r4, r5, r6)
            r2 = 0
            if (r1 == 0) goto L_0x0027
        L_0x0025:
            r1 = r2
            goto L_0x0043
        L_0x0027:
            java.lang.ref.WeakReference<android.app.Activity> r1 = r7.activityWeakReference
            if (r1 == 0) goto L_0x0025
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L_0x0025
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L_0x0025
            android.view.View r1 = r1.getDecorView()
            if (r1 == 0) goto L_0x0025
            android.graphics.drawable.Drawable r1 = r1.getBackground()
        L_0x0043:
            r0.element = r1
            com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask$b r1 = new com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask$b
            r1.<init>(r7, r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r3 = 3000(0xbb8, float:4.204E-42)
            com.p280ss.android.p281a.p282a.p283a.C6726a.m20843a(r1, r3)
            android.content.Context r8 = r8.getApplicationContext()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = "input_method"
            java.lang.Object r8 = r8.getSystemService(r1)     // Catch:{ Exception -> 0x0068 }
            if (r8 == 0) goto L_0x0060
            android.view.inputmethod.InputMethodManager r8 = (android.view.inputmethod.InputMethodManager) r8     // Catch:{ Exception -> 0x0068 }
            goto L_0x0069
        L_0x0060:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            r8.<init>(r1)     // Catch:{ Exception -> 0x0068 }
            throw r8     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            r8 = r2
        L_0x0069:
            if (r8 != 0) goto L_0x006c
            return
        L_0x006c:
            java.lang.Class r1 = r8.getClass()     // Catch:{ Exception -> 0x009c }
            java.lang.String r2 = "mCurRootView"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x009c }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ Exception -> 0x009c }
            java.lang.Object r8 = r1.get(r8)     // Catch:{ Exception -> 0x009c }
            if (r8 == 0) goto L_0x009c
            boolean r1 = r8 instanceof android.view.View     // Catch:{ Exception -> 0x009c }
            if (r1 == 0) goto L_0x009c
            r1 = r8
            android.view.View r1 = (android.view.View) r1     // Catch:{ Exception -> 0x009c }
            java.lang.Class r1 = r1.getClass()     // Catch:{ Exception -> 0x009c }
            java.lang.String r3 = "mResizingBackgroundDrawable"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ Exception -> 0x009c }
            r1.setAccessible(r2)     // Catch:{ Exception -> 0x009c }
            T r0 = r0.element     // Catch:{ Exception -> 0x009c }
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch:{ Exception -> 0x009c }
            r1.set(r8, r0)     // Catch:{ Exception -> 0x009c }
            return
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask.run(android.content.Context):void");
    }
}
