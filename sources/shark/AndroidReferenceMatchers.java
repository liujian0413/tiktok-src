package shark;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import shark.C48710a.C48711a;
import shark.ReferencePattern.InstanceFieldPattern;
import shark.ReferencePattern.JavaLocalPattern;
import shark.ReferencePattern.NativeGlobalVariablePattern;
import shark.ReferencePattern.StaticFieldPattern;

public enum AndroidReferenceMatchers {
    ;
    
    public static final C7562b<C48710a, Boolean> ALWAYS = null;
    public static final C48683u Companion = null;

    /* renamed from: shark.AndroidReferenceMatchers$a */
    static final class C48563a extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$a$a */
        static final class C48564a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48564a f123745a = null;

            static {
                f123745a = new C48564a();
            }

            C48564a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150358a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b == 27) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150358a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.widget.AccessibilityIterators$LineTextSegmentIterator", "mLayout", "AccessibilityIterators holds on to text layouts which can hold on to spans TextView.ChangeWatcher and android.widget.Editor end up in spans and typically hold on to the view hierarchy", C48564a.f123745a));
        }

        C48563a(String str, int i) {
            super(str, 21, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$aa */
    static final class C48565aa extends AndroidReferenceMatchers {
        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(C48683u.m150421a("FinalizerWatchdogDaemon"));
        }

        C48565aa(String str, int i) {
            super(str, 57, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ab */
    static final class C48566ab extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$ab$a */
        static final class C48567a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48567a f123746a = null;

            static {
                f123746a = new C48567a();
            }

            C48567a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150359a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150359a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (C7573i.m23585a((Object) aVar.f123831a, (Object) "HUAWEI")) {
                    int i = aVar.f123832b;
                    if (24 <= i && 25 >= i) {
                        return true;
                    }
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("android.gestureboost.GestureBoostManager", "mContext", "GestureBoostManager is a static singleton that leaks an activity context. Fix: https://github.com/square/leakcanary/issues/696#issuecomment-296420756", C48567a.f123746a));
        }

        C48566ab(String str, int i) {
            super(str, 46, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ac */
    static final class C48568ac extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$ac$a */
        static final class C48569a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48569a f123747a = null;

            static {
                f123747a = new C48569a();
            }

            C48569a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150360a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150360a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (15 <= i && 29 >= i) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: shark.AndroidReferenceMatchers$ac$b */
        static final class C48570b extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48570b f123748a = null;

            static {
                f123748a = new C48570b();
            }

            C48570b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150361a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150361a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (15 <= i && 29 >= i) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: shark.AndroidReferenceMatchers$ac$c */
        static final class C48571c extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48571c f123749a = null;

            static {
                f123749a = new C48571c();
            }

            C48571c() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150362a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150362a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (15 <= i && 29 >= i) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: shark.AndroidReferenceMatchers$ac$d */
        static final class C48572d extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48572d f123750a = null;

            static {
                f123750a = new C48572d();
            }

            C48572d() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150363a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150363a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (C7573i.m23585a((Object) aVar.f123831a, (Object) "HUAWEI")) {
                    int i = aVar.f123832b;
                    if (23 <= i && 29 >= i) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: shark.AndroidReferenceMatchers$ac$e */
        static final class C48573e extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48573e f123751a = null;

            static {
                f123751a = new C48573e();
            }

            C48573e() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150364a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150364a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (15 <= i && 29 >= i) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: shark.AndroidReferenceMatchers$ac$f */
        static final class C48574f extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48574f f123752a = null;

            static {
                f123752a = new C48574f();
            }

            C48574f() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150365a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150365a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (28 <= i && 29 >= i) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: shark.AndroidReferenceMatchers$ac$g */
        static final class C48575g extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48575g f123753a = null;

            static {
                f123753a = new C48575g();
            }

            C48575g() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150366a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150366a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (28 <= i && 29 >= i) {
                    return true;
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            String str = "When we detach a view that receives keyboard input, the InputMethodManager leaks a reference to it until a new view asks for keyboard input. Tracked here: https://code.google.com/p/android/issues/detail?id=171190 Hack: https://gist.github.com/pyricau/4df64341cc978a7de414";
            Collection collection = list;
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.inputmethod.InputMethodManager", "mNextServedView", str, C48569a.f123747a));
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.inputmethod.InputMethodManager", "mServedView", str, C48570b.f123748a));
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.inputmethod.InputMethodManager", "mServedInputConnection", str, C48571c.f123749a));
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.inputmethod.InputMethodManager", "mLastSrvView", "HUAWEI added a mLastSrvView field to InputMethodManager that leaks a reference to the last served view.", C48572d.f123750a));
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.inputmethod.InputMethodManager", "mCurRootView", "The singleton InputMethodManager is holding a reference to mCurRootView long after the activity has been destroyed. Observed on ICS MR1: https://github.com/square/leakcanary/issues/1#issuecomment-100579429 Hack: https://gist.github.com/pyricau/4df64341cc978a7de414", C48573e.f123751a));
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.inputmethod.InputMethodManager", "mImeInsetsConsumer", "Android Q Beta has a leak where InputMethodManager.mImeInsetsConsumer isn't set to\nnull when the activity is destroyed.", C48574f.f123752a));
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.inputmethod.InputMethodManager", "mCurrentInputConnection", "In Android Q Beta InputMethodManager keeps its EditableInputConnection after the\nactivity has been destroyed.", C48575g.f123753a));
        }

        C48568ac(String str, int i) {
            super(str, 5, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ad */
    static final class C48576ad extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$ad$a */
        static final class C48577a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48577a f123754a = null;

            static {
                f123754a = new C48577a();
            }

            C48577a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150367a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150367a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (C7573i.m23585a((Object) aVar.f123831a, (Object) "Meizu")) {
                    int i = aVar.f123832b;
                    if (21 <= i && 22 >= i) {
                        return true;
                    }
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("android.app.Instrumentation", "mRecommendActivity", "Instrumentation would leak com.android.internal.app.RecommendActivity (in framework.jar) in Meizu FlymeOS 4.5 and above, which is based on Android 5.0 and  above", C48577a.f123754a));
        }

        C48576ad(String str, int i) {
            super(str, 52, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ae */
    static final class C48578ae extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$ae$a */
        static final class C48579a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48579a f123755a = null;

            static {
                f123755a = new C48579a();
            }

            C48579a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150368a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150368a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (14 <= i && 22 >= i) {
                    return true;
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.animation.LayoutTransition$1", "val$parent", "LayoutTransition leaks parent ViewGroup through ViewTreeObserver.OnPreDrawListener When triggered, this leaks stays until the window is destroyed. Tracked here: https://code.google.com/p/android/issues/detail?id=171830", C48579a.f123755a));
        }

        C48578ae(String str, int i) {
            super(str, 6, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$af */
    static final class C48580af extends AndroidReferenceMatchers {
        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(C48683u.m150422a("leakcanary.internal.AndroidHeapDumper", "resumedActivity"));
        }

        C48580af(String str, int i) {
            super(str, 60, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ag */
    static final class C48581ag extends AndroidReferenceMatchers {
        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(C48683u.m150422a("leakcanary.internal.InternalLeakCanary", "application"));
        }

        C48581ag(String str, int i) {
            super(str, 61, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ah */
    static final class C48582ah extends AndroidReferenceMatchers {
        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(C48683u.m150421a("LeakCanary-Heap-Dump"));
        }

        C48582ah(String str, int i) {
            super(str, 59, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ai */
    static final class C48583ai extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$ai$a */
        static final class C48584a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48584a f123756a = null;

            static {
                f123756a = new C48584a();
            }

            C48584a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150369a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150369a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "LGE") || aVar.f123832b != 21) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("com.lge.systemservice.core.LGContext", "mContext", "LGContext is a static singleton that leaks an activity context.", C48584a.f123756a));
        }

        C48583ai(String str, int i) {
            super(str, 48, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$aj */
    static final class C48585aj extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$aj$a */
        static final class C48586a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48586a f123757a = null;

            static {
                f123757a = new C48586a();
            }

            C48586a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150370a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b == 28) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150370a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.widget.Magnifier$InternalPopupWindow", "mCallback", "android.widget.Magnifier.InternalPopupWindow registers a frame callback on android.view.ThreadedRenderer.SimpleRenderer which holds it as a native reference. android.widget.Editor$InsertionHandleView registers an OnOperationCompleteCallback on Magnifier.InternalPopupWindow. These references are held after the activity has been destroyed.", C48586a.f123757a));
        }

        C48585aj(String str, int i) {
            super(str, 23, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ak */
    static final class C48587ak extends AndroidReferenceMatchers {
        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(C48683u.m150421a("main"));
        }

        C48587ak(String str, int i) {
            super(str, 58, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$al */
    static final class C48588al extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$al$a */
        static final class C48589a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48589a f123758a = null;

            static {
                f123758a = new C48589a();
            }

            C48589a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150371a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150371a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "NVIDIA") || aVar.f123832b != 19) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("com.nvidia.ControllerMapper.MapperClient$ServiceClient", "this$0", "Not sure exactly what ControllerMapper is about, but there is an anonymous Handler in ControllerMapper.MapperClient.ServiceClient, which leaks ControllerMapper.MapperClient which leaks the activity context.", C48589a.f123758a));
        }

        C48588al(String str, int i) {
            super(str, 50, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$am */
    static final class C48590am extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$am$a */
        static final class C48591a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48591a f123759a = null;

            static {
                f123759a = new C48591a();
            }

            C48591a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150372a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150372a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (22 <= i && 28 >= i) {
                    return true;
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.media.projection.MediaProjection$MediaProjectionCallback", "this$0", "MediaProjectionCallback is held by another process, and holds on to MediaProjection\nwhich has an activity as its context.", C48591a.f123759a));
        }

        C48590am(String str, int i) {
            super(str, 10, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$an */
    static final class C48592an extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$an$a */
        static final class C48593a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48593a f123760a = null;

            static {
                f123760a = new C48593a();
            }

            C48593a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150373a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b <= 22) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150373a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.media.MediaScannerConnection", "mContext", "The static method MediaScannerConnection.scanFile() takes an activity context but the service might not disconnect after the activity has been destroyed. Tracked here: https://code.google.com/p/android/issues/detail?id=173788 Fix: Create an instance of MediaScannerConnection yourself and pass in the application context. Call connect() and disconnect() manually.", C48593a.f123760a));
        }

        C48592an(String str, int i) {
            super(str, 13, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ao */
    static final class C48594ao extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$ao$a */
        static final class C48595a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48595a f123761a = null;

            static {
                f123761a = new C48595a();
            }

            C48595a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150374a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b == 21) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150374a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("android.media.session.MediaSessionLegacyHelper", "sInstance", "MediaSessionLegacyHelper is a static singleton that is lazily instantiated and keeps a reference to the context it's given the first time MediaSessionLegacyHelper.getHelper() is called. This leak was introduced in android-5.0.1_r1 and fixed in Android 5.1.0_r1 by calling context.getApplicationContext(). Fix: https://github.com/android/platform_frameworks_base/commit/9b5257c9c99c4cb541d8e8e78fb04f008b1a9091 To fix this, you could call MediaSessionLegacyHelper.getHelper() early in Application.onCreate() and pass it the application context.", C48595a.f123761a));
        }

        C48594ao(String str, int i) {
            super(str, 2, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ap */
    static final class C48596ap extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$ap$a */
        static final class C48597a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48597a f123762a = null;

            static {
                f123762a = new C48597a();
            }

            C48597a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150375a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150375a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "OnePlus") || aVar.f123832b != 28) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("com.oneplus.util.OemSceneCallBlocker", "sContext", "OemSceneCallBlocker has a sContext static field which holds on to an activity instance.", C48597a.f123762a));
        }

        C48596ap(String str, int i) {
            super(str, 55, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$aq */
    static final class C48598aq extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$aq$a */
        static final class C48599a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48599a f123763a = null;

            static {
                f123763a = new C48599a();
            }

            C48599a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150376a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150376a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung") || aVar.f123832b != 19) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.os.PersonaManager", "mContext", "android.app.LoadedApk.mResources has a reference to android.content.res.Resources.mPersonaManager which has a reference to android.os.PersonaManager.mContext which is an activity.", C48599a.f123763a));
        }

        C48598aq(String str, int i) {
            super(str, 40, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ar */
    static final class C48600ar extends AndroidReferenceMatchers {
        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            Collection collection = list;
            String name = WeakReference.class.getName();
            C7573i.m23582a((Object) name, "WeakReference::class.java.name");
            collection.add(C48683u.m150422a(name, "referent"));
            collection.add(C48683u.m150422a("leakcanary.KeyedWeakReference", "referent"));
            String name2 = SoftReference.class.getName();
            C7573i.m23582a((Object) name2, "SoftReference::class.java.name");
            collection.add(C48683u.m150422a(name2, "referent"));
            String name3 = PhantomReference.class.getName();
            C7573i.m23582a((Object) name3, "PhantomReference::class.java.name");
            collection.add(C48683u.m150422a(name3, "referent"));
            collection.add(C48683u.m150422a("java.lang.ref.Finalizer", "prev"));
            collection.add(C48683u.m150422a("java.lang.ref.Finalizer", "element"));
            collection.add(C48683u.m150422a("java.lang.ref.Finalizer", "next"));
            collection.add(C48683u.m150422a("java.lang.ref.FinalizerReference", "prev"));
            collection.add(C48683u.m150422a("java.lang.ref.FinalizerReference", "element"));
            collection.add(C48683u.m150422a("java.lang.ref.FinalizerReference", "next"));
            collection.add(C48683u.m150422a("sun.misc.Cleaner", "prev"));
            collection.add(C48683u.m150422a("sun.misc.Cleaner", "next"));
        }

        C48600ar(String str, int i) {
            super(str, 56, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$as */
    static final class C48601as extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$as$a */
        static final class C48602a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48602a f123764a = null;

            static {
                f123764a = new C48602a();
            }

            C48602a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150377a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150377a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung") || aVar.f123832b != 19) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.content.res.Resources", "mContext", "In AOSP the Resources class does not have a context. Here we have ZygoteInit.mResources (static field) holding on to a Resources instance that has a context that is the activity. Observed here: https://github.com/square/leakcanary/issues/1#issue-74450184", C48602a.f123764a));
        }

        C48601as(String str, int i) {
            super(str, 41, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$at */
    static final class C48603at extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$at$a */
        static final class C48604a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48604a f123765a = null;

            static {
                f123765a = new C48604a();
            }

            C48604a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150378a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150378a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung") || aVar.f123832b != 28) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(C48683u.m150426b(AndroidReferenceMatchers.Companion, "android.app.SemAppIconSolution", "mContext", null, C48604a.f123765a, 4, null));
        }

        C48603at(String str, int i) {
            super(str, 37, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$au */
    static final class C48605au extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$au$a */
        static final class C48606a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48606a f123766a = null;

            static {
                f123766a = new C48606a();
            }

            C48606a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150379a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150379a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung")) {
                    int i = aVar.f123832b;
                    if (19 <= i && 28 >= i) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: shark.AndroidReferenceMatchers$au$b */
        static final class C48607b extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48607b f123767a = null;

            static {
                f123767a = new C48607b();
            }

            C48607b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150380a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150380a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung")) {
                    int i = aVar.f123832b;
                    if (19 <= i && 28 >= i) {
                        return true;
                    }
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            String str = "SemClipboardManager inner classes are held by native references due to IPC calls ";
            Collection collection = list;
            collection.add(AndroidReferenceMatchers.Companion.mo123345a("com.samsung.android.content.clipboard.SemClipboardManager$1", str, (C7562b<? super C48710a, Boolean>) C48606a.f123766a));
            collection.add(AndroidReferenceMatchers.Companion.mo123345a("com.samsung.android.content.clipboard.SemClipboardManager$3", str, (C7562b<? super C48710a, Boolean>) C48607b.f123767a));
        }

        C48605au(String str, int i) {
            super(str, 33, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$av */
    static final class C48608av extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$av$a */
        static final class C48609a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48609a f123768a = null;

            static {
                f123768a = new C48609a();
            }

            C48609a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150381a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150381a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung")) {
                    int i = aVar.f123832b;
                    if (19 <= i && 24 >= i) {
                        return true;
                    }
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("com.samsung.android.emergencymode.SemEmergencyManager", "mContext", "SemEmergencyManager is a static singleton that leaks a DecorContext. Fix: https://gist.github.com/jankovd/a210460b814c04d500eb12025902d60d", C48609a.f123768a));
        }

        C48608av(String str, int i) {
            super(str, 35, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$aw */
    static final class C48610aw extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$aw$a */
        static final class C48611a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48611a f123769a = null;

            static {
                f123769a = new C48611a();
            }

            C48611a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150382a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150382a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung") || aVar.f123832b != 24) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(C48683u.m150426b(AndroidReferenceMatchers.Companion, "com.samsung.android.knox.SemPersonaManager", "mContext", null, C48611a.f123769a, 4, null));
        }

        C48610aw(String str, int i) {
            super(str, 36, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ax */
    static final class C48612ax extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$ax$a */
        static final class C48613a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48613a f123770a = null;

            static {
                f123770a = new C48613a();
            }

            C48613a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150383a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150383a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "LGE") || aVar.f123832b != 27) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("com.lge.systemservice.core.SmartCoverManager", "mContext", "SmartCoverManager$CallbackRegister is a callback held by a native ref, and SmartCoverManager ends up leaking an activity context.", C48613a.f123770a));
        }

        C48612ax(String str, int i) {
            super(str, 49, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ay */
    static final class C48614ay extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$ay$a */
        static final class C48615a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48615a f123771a = null;

            static {
                f123771a = new C48615a();
            }

            C48615a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150384a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b <= 19) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150384a((C48710a) obj));
            }
        }

        /* renamed from: shark.AndroidReferenceMatchers$ay$b */
        static final class C48616b extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48616b f123772a = null;

            static {
                f123772a = new C48616b();
            }

            C48616b() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150385a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b <= 19) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150385a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            String str = "Editor inserts a special span, which has a reference to the EditText. That span is a NoCopySpan, which makes sure it gets dropped when creating a new SpannableStringBuilder from a given CharSequence. TextView.onSaveInstanceState() does a copy of its mText before saving it in the bundle. Prior to KitKat, that copy was done using the SpannableString constructor, instead of SpannableStringBuilder. The SpannableString constructor does not drop NoCopySpan spans. So we end up with a saved state that holds a reference to the textview and therefore the entire view hierarchy & activity context. Fix: https://github.com/android/platform_frameworks_base/commit/af7dcdf35a37d7a7dbaad7d9869c1c91bce2272b . To fix this, you could override TextView.onSaveInstanceState(), and then use reflection to access TextView.SavedState.mText and clear the NoCopySpan spans.";
            Collection collection = list;
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.widget.Editor$SpanController", "this$0", str, C48615a.f123771a));
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.widget.Editor$EasyEditSpanController", "this$0", str, C48616b.f123772a));
        }

        C48614ay(String str, int i) {
            super(str, 1, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$az */
    static final class C48617az extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$az$a */
        static final class C48618a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48618a f123773a = null;

            static {
                f123773a = new C48618a();
            }

            C48618a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150386a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b < 21) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150386a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.speech.SpeechRecognizer$InternalListener", "this$0", "Prior to Android 5, SpeechRecognizer.InternalListener was a non static inner class and leaked the SpeechRecognizer which leaked an activity context. Fixed in AOSP: https://github.com/android/platform_frameworks_base/commit /b37866db469e81aca534ff6186bdafd44352329b", C48618a.f123773a));
        }

        C48617az(String str, int i) {
            super(str, 11, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$b */
    static final class C48619b extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$b$a */
        static final class C48620a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48620a f123774a = null;

            static {
                f123774a = new C48620a();
            }

            C48620a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150387a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150387a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (28 <= i && 29 >= i) {
                    return true;
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.accessibility.AccessibilityNodeIdManager", "mIdsToViews", "Android Q Beta added AccessibilityNodeIdManager which stores all views from their\nonAttachedToWindow() call, until detached. Unfortunately it's possible to trigger\nthe view framework to call detach before attach (by having a view removing itself\nfrom its parent in onAttach, which then causes AccessibilityNodeIdManager to keep\nchildren view forever. Future releases of Q will hold weak references.", C48620a.f123774a));
        }

        C48619b(String str, int i) {
            super(str, 26, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$ba */
    static final class C48621ba extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$ba$a */
        static final class C48622a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48622a f123775a = null;

            static {
                f123775a = new C48622a();
            }

            C48622a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150388a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b == 22) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150388a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.widget.SpellChecker$1", "this$0", "SpellChecker holds on to a detached view that points to a destroyed activity. mSpellRunnable is being enqueued, and that callback should be removed when  closeSession() is called. Maybe closeSession() wasn't called, or maybe it was  called after the view was detached.", C48622a.f123775a));
        }

        C48621ba(String str, int i) {
            super(str, 8, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$bb */
    static final class C48623bb extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$bb$a */
        static final class C48624a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48624a f123776a = null;

            static {
                f123776a = new C48624a();
            }

            C48624a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150389a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150389a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (16 <= i && 24 >= i) {
                    return true;
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.textservice.SpellCheckerSession$1", "this$0", "SpellCheckerSessionListenerImpl.mHandler is leaking destroyed Activity when the SpellCheckerSession is closed before the service is connected. Tracked here: https://code.google.com/p/android/issues/detail?id=172542", C48624a.f123776a));
        }

        C48623bb(String str, int i) {
            super(str, 7, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$bc */
    static final class C48625bc extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$bc$a */
        static final class C48626a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48626a f123777a = null;

            static {
                f123777a = new C48626a();
            }

            C48626a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150390a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150390a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung") || aVar.f123832b != 19) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("com.samsung.android.smartclip.SpenGestureManager", "mContext", "SpenGestureManager has a static mContext field that leaks a reference to the activity. Yes, a STATIC mContext field.", C48626a.f123777a));
        }

        C48625bc(String str, int i) {
            super(str, 31, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$bd */
    static final class C48627bd extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$bd$a */
        static final class C48628a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48628a f123778a = null;

            static {
                f123778a = new C48628a();
            }

            C48628a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150391a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150391a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung") || aVar.f123832b != 27) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("android.widget.TextView", "mTargetView", "Samsung added a static mTargetView field to TextView which holds on to detached views.", C48628a.f123778a));
        }

        C48627bd(String str, int i) {
            super(str, 45, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$be */
    static final class C48629be extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$be$a */
        static final class C48630a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48630a f123779a = null;

            static {
                f123779a = new C48630a();
            }

            C48630a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150392a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150392a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if ((!C7573i.m23585a((Object) aVar.f123831a, (Object) "LENOVO") || aVar.f123832b != 19) && (!C7573i.m23585a((Object) aVar.f123831a, (Object) "vivo") || aVar.f123832b != 22)) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("android.hardware.SystemSensorManager", "mAppContextImpl", "SystemSensorManager stores a reference to context in a static field in its constructor. Fix: use application context to get SensorManager", C48630a.f123779a));
        }

        C48629be(String str, int i) {
            super(str, 51, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$bf */
    static final class C48631bf extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$bf$a */
        static final class C48632a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48632a f123780a = null;

            static {
                f123780a = new C48632a();
            }

            C48632a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150393a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b <= 22) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150393a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("android.text.TextLine", "sCached", "TextLine.sCached is a pool of 3 TextLine instances. TextLine.recycle() has had at least two bugs that created memory leaks by not correctly clearing the recycled TextLine instances. The first was fixed in android-5.1.0_r1: https://github.com/android/platform_frameworks_base/commit/893d6fe48d37f71e683f722457bea646994a10 The second was fixed, not released yet: https://github.com/android/platform_frameworks_base/commit/b3a9bc038d3a218b1dbdf7b5668e3d6c12be5e To fix this, you could access TextLine.sCached and clear the pool every now and then (e.g. on activity destroy).", C48632a.f123780a));
        }

        C48631bf(String str, int i) {
            super(str, 3, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$bg */
    static final class C48633bg extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$bg$a */
        static final class C48634a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48634a f123781a = null;

            static {
                f123781a = new C48634a();
            }

            C48634a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150394a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b == 24) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150394a((C48710a) obj));
            }
        }

        /* renamed from: shark.AndroidReferenceMatchers$bg$b */
        static final class C48635b extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48635b f123782a = null;

            static {
                f123782a = new C48635b();
            }

            C48635b() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150395a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b == 24) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150395a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            String str = "TextToSpeech.shutdown() does not release its references to context objects. Furthermore, TextToSpeech instances cannot be garbage collected due to other process keeping the references, resulting the context objects leaked. Developers might be able to mitigate the issue by passing application context to TextToSpeech constructor. Tracked at: https://github.com/square/leakcanary/issues/1210 and https://issuetracker.google.com/issues/129250419";
            Collection collection = list;
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.speech.tts.TextToSpeech", "mContext", str, C48634a.f123781a));
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.speech.tts.TtsEngines", "mContext", str, C48635b.f123782a));
        }

        C48633bg(String str, int i) {
            super(str, 27, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$bh */
    static final class C48636bh extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$bh$a */
        static final class C48637a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48637a f123783a = null;

            static {
                f123783a = new C48637a();
            }

            C48637a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150396a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150396a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung")) {
                    int i = aVar.f123832b;
                    if (19 <= i && 28 >= i) {
                        return true;
                    }
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("android.widget.TextView", "mLastHoveredView", "mLastHoveredView is a static field in TextView that leaks the last hovered view.", C48637a.f123783a));
        }

        C48636bh(String str, int i) {
            super(str, 39, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$bi */
    static final class C48638bi extends AndroidReferenceMatchers {
        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123345a("android.widget.Toast$TN", "Toast.TN is held by a global variable in native code due to an IPC call to show the toast.", AndroidReferenceMatchers.ALWAYS));
        }

        C48638bi(String str, int i) {
            super(str, 30, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$bj */
    static final class C48639bj extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$bj$a */
        static final class C48640a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48640a f123784a = null;

            static {
                f123784a = new C48640a();
            }

            C48640a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150397a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150397a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (18 <= i && 25 >= i) {
                    return true;
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.os.UserManager", "mContext", "UserManager has a static sInstance field that creates an instance and caches it the first time UserManager.get() is called. This instance is created with the outer context (which is an activity base context). Tracked here: https://code.google.com/p/android/issues/detail?id=173789 Introduced by: https://github.com/android/platform_frameworks_base/commit/27db46850b708070452c0ce49daf5f79503fbde6 Fix: trigger a call to UserManager.get() in Application.onCreate(), so that the UserManager instance gets cached with a reference to the application context.", C48640a.f123784a));
        }

        C48639bj(String str, int i) {
            super(str, 14, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$bk */
    static final class C48641bk extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$bk$a */
        static final class C48642a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48642a f123785a = null;

            static {
                f123785a = new C48642a();
            }

            C48642a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150398a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b == 28) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150398a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.ViewGroup$ViewLocationHolder", "mRoot", "In Android P, ViewLocationHolder has an mRoot field that is not cleared in its clear() method. Introduced in https://github.com/aosp-mirror/platform_frameworks_base/commit/86b326012813f09d8f1de7d6d26c986a909d Bug report: https://issuetracker.google.com/issues/112792715", C48642a.f123785a));
        }

        C48641bk(String str, int i) {
            super(str, 25, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$bl */
    static final class C48643bl extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$bl$a */
        static final class C48644a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48644a f123786a = null;

            static {
                f123786a = new C48644a();
            }

            C48644a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150399a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150399a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung") || aVar.f123832b != 19) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.ViewConfiguration", "mContext", "In AOSP the ViewConfiguration class does not have a context. Here we have ViewConfiguration.sConfigurations (static field) holding on to a ViewConfiguration instance that has a context that is the activity. Observed here: https://github.com/square/leakcanary/issues/1#issuecomment-100324683", C48644a.f123786a));
        }

        C48643bl(String str, int i) {
            super(str, 42, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$bm */
    static final class C48645bm extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$bm$a */
        static final class C48646a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48646a f123787a = null;

            static {
                f123787a = new C48646a();
            }

            C48646a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150400a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b == 27) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150400a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.WindowManagerGlobal", "mRoots", "ViewRootImpl references a destroyed activity yet it's not detached (still has a view)\n and WindowManagerGlobal still references it.", C48646a.f123787a));
        }

        C48645bm(String str, int i) {
            super(str, 28, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$c */
    static final class C48647c extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$c$a */
        static final class C48648a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48648a f123788a = null;

            static {
                f123788a = new C48648a();
            }

            C48648a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150401a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150401a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (26 <= i && 27 >= i) {
                    return true;
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.view.accessibility.AccessibilityNodeInfo", "mOriginalText", "AccessibilityNodeInfo has a static sPool of AccessibilityNodeInfo. When AccessibilityNodeInfo instances are released back in the pool, AccessibilityNodeInfo.clear() does not clear the mOriginalText field, which causes spans to leak which in turns causes TextView.ChangeWatcher to leak and the whole view hierarchy. Introduced here: https://android.googlesource.com/platform/frameworks/base/+/193520e3dff5248ddcf8435203bf99d2ba667219%5E%21/core/java/android/view/accessibility/AccessibilityNodeInfo.java", C48648a.f123788a));
        }

        C48647c(String str, int i) {
            super(str, 19, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$d */
    static final class C48649d extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$d$a */
        static final class C48650a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48650a f123789a = null;

            static {
                f123789a = new C48650a();
            }

            C48650a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150402a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b <= 27) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150402a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.accounts.AccountManager$AmsTask$Response", "this$1", "AccountManager$AmsTask$Response is a stub and is held in memory by native code, probably because the reference to the response in the other process hasn't been cleared. AccountManager$AmsTask is holding on to the activity reference to use for launching a new sub- Activity. Tracked here: https://code.google.com/p/android/issues/detail?id=173689 Fix: Pass a null activity reference to the AccountManager methods and then deal with the returned future to to get the result and correctly start an activity when it's available.", C48650a.f123789a));
        }

        C48649d(String str, int i) {
            super(str, 12, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$e */
    static final class C48651e extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$e$a */
        static final class C48652a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48652a f123790a = null;

            static {
                f123790a = new C48652a();
            }

            C48652a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150403a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150403a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (15 <= i && 22 >= i) {
                    return true;
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            String str = "ActivityChooserModel holds a static reference to the last set ActivityChooserModelPolicy which can be an activity context. Tracked here: https://code.google.com/p/android/issues/detail?id=172659 Hack: https://gist.github.com/andaag/b05ab66ed0f06167d6e0";
            Collection collection = list;
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.support.v7.internal.widget.ActivityChooserModel", "mActivityChoserModelPolicy", str, C48652a.f123790a));
            collection.add(C48683u.m150426b(AndroidReferenceMatchers.Companion, "android.widget.ActivityChooserModel", "mActivityChoserModelPolicy", str, null, 8, null));
        }

        C48651e(String str, int i) {
            super(str, 9, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$f */
    static final class C48653f extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$f$a */
        static final class C48654a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48654a f123791a = null;

            static {
                f123791a = new C48654a();
            }

            C48654a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150404a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150404a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (19 <= i && 29 >= i) {
                    return true;
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.app.ActivityThread$ActivityClientRecord", "nextIdle", "Android AOSP sometimes keeps a reference to a destroyed activity as a nextIdle client record in the android.app.ActivityThread.mActivities map. Not sure what's going on there, input welcome.", C48654a.f123791a));
        }

        C48653f(String str, int i) {
            super(str, 0, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$g */
    static final class C48655g extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$g$a */
        static final class C48656a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48656a f123792a = null;

            static {
                f123792a = new C48656a();
            }

            C48656a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150405a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150405a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung")) {
                    int i = aVar.f123832b;
                    if (22 <= i && 23 >= i) {
                        return true;
                    }
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("android.app.ActivityManager", "mContext", "Samsung added a static mContext field to ActivityManager, holds a reference to the activity. Observed here: https://github.com/square/leakcanary/issues/177 Fix in comment: https://github.com/square/leakcanary/issues/177#issuecomment-222724283", C48656a.f123792a));
        }

        C48655g(String str, int i) {
            super(str, 44, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$h */
    static final class C48657h extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$h$a */
        static final class C48658a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48658a f123793a = null;

            static {
                f123793a = new C48658a();
            }

            C48658a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150406a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b < 22) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150406a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.appwidget.AppWidgetHost$Callbacks", "this$0", "android.appwidget.AppWidgetHost$Callbacks is a stub and is held in memory native code. The reference to the `mContext` was not being cleared, which caused the Callbacks instance to retain this reference Fixed in AOSP: https://github.com/android/platform_frameworks_base/commit/7a96f3c917e0001ee739b65da37b2fadec7d7765", C48658a.f123793a));
        }

        C48657h(String str, int i) {
            super(str, 15, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$i */
    static final class C48659i extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$i$a */
        static final class C48660a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48660a f123794a = null;

            static {
                f123794a = new C48660a();
            }

            C48660a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150407a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150407a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (24 <= i && 28 >= i) {
                    return true;
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.app.assist.AssistStructure$ViewNodeText", "mText", "AssistStructure (google assistant / autofill) holds on to text spannables on the screen. TextView.ChangeWatcher and android.widget.Editor end up in spans and typically hold on to the view hierarchy", C48660a.f123794a));
        }

        C48659i(String str, int i) {
            super(str, 20, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$j */
    static final class C48661j extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$j$a */
        static final class C48662a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48662a f123795a = null;

            static {
                f123795a = new C48662a();
            }

            C48662a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150408a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b <= 22) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150408a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.media.AudioManager$1", "this$0", "Prior to Android M, VideoView required audio focus from AudioManager and never abandoned it, which leaks the Activity context through the AudioManager. The root of the problem is that AudioManager uses whichever context it receives, which in the case of the VideoView example is an Activity, even though it only needs the application's context. The issue is fixed in Android M, and the AudioManager now uses the application's context. Tracked here: https://code.google.com/p/android/issues/detail?id=152173 Fix: https://gist.github.com/jankovd/891d96f476f7a9ce24e2", C48662a.f123795a));
        }

        C48661j(String str, int i) {
            super(str, 16, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$k */
    static final class C48663k extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$k$a */
        static final class C48664a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48664a f123796a = null;

            static {
                f123796a = new C48664a();
            }

            C48664a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150409a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150409a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung") || aVar.f123832b != 19) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("android.media.AudioManager", "mContext_static", "Samsung added a static mContext_static field to AudioManager, holds a reference to the activity. Observed here: https://github.com/square/leakcanary/issues/32", C48664a.f123796a));
        }

        C48663k(String str, int i) {
            super(str, 43, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$l */
    static final class C48665l extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$l$a */
        static final class C48666a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48666a f123797a = null;

            static {
                f123797a = new C48666a();
            }

            C48666a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150410a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150410a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung") || aVar.f123832b != 19) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("com.android.org.chromium.android_webview.AwResource", "sResources", "", C48666a.f123797a));
        }

        C48665l(String str, int i) {
            super(str, 38, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$m */
    static final class C48667m extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$m$a */
        static final class C48668a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48668a f123798a = null;

            static {
                f123798a = new C48668a();
            }

            C48668a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150411a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150411a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                int i = aVar.f123832b;
                if (24 <= i && 26 >= i) {
                    return true;
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("com.android.internal.policy.BackdropFrameRenderer", "mDecorView", "When BackdropFrameRenderer.releaseRenderer() is called, there's an unknown case where mRenderer becomes null but mChoreographer doesn't and the thread doesn't stop and ends up leaking mDecorView which itself holds on to a destroyed activity", C48668a.f123798a));
        }

        C48667m(String str, int i) {
            super(str, 24, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$n */
    static final class C48669n extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$n$a */
        static final class C48670a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48670a f123799a = null;

            static {
                f123799a = new C48670a();
            }

            C48670a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150412a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b == 28) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150412a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.hardware.biometrics.BiometricPrompt", "mFingerprintManager", "BiometricPrompt holds on to a FingerprintManager which holds on to a destroyed activity.", C48670a.f123799a));
        }

        C48669n(String str, int i) {
            super(str, 22, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$o */
    static final class C48671o extends AndroidReferenceMatchers {
        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            Collection collection = list;
            String str = "A thread waiting on a blocking queue will leak the last dequeued object as a stack local reference. So when a HandlerThread becomes idle, it keeps a local reference to the last message it received. That message then gets recycled and can be used again. As long as all messages are recycled after being used, this won't be a problem, because these references are cleared when being recycled. However, dialogs create template Message instances to be copied when a message needs to be sent. These Message templates holds references to the dialog listeners, which most likely leads to holding a reference onto the activity in some way. Dialogs never recycle their template Message, assuming these Message instances will get GCed when the dialog is GCed. The combination of these two things creates a high potential for memory leaks as soon as you use dialogs. These memory leaks might be temporary, but some handler threads sleep for a long time. To fix this, you could post empty messages to the idle handler threads from time to time. This won't be easy because you cannot access all handler threads, but a library that is widely used should consider doing this for its own handler threads. This leaks has been shown to happen in both Dalvik and ART.";
            collection.add(C48683u.m150426b(AndroidReferenceMatchers.Companion, "android.os.Message", "obj", str, null, 8, null));
            collection.add(C48683u.m150426b(AndroidReferenceMatchers.Companion, "android.os.Message", "next", str, null, 8, null));
            collection.add(C48683u.m150426b(AndroidReferenceMatchers.Companion, "android.os.Message", "target", str, null, 8, null));
        }

        C48671o(String str, int i) {
            super(str, 4, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$p */
    static final class C48672p extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$p$a */
        static final class C48673a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48673a f123800a = null;

            static {
                f123800a = new C48673a();
            }

            C48673a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150413a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150413a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (C7573i.m23585a((Object) aVar.f123831a, (Object) "LGE")) {
                    int i = aVar.f123832b;
                    if (19 <= i && 22 >= i) {
                        return true;
                    }
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("android.widget.BubblePopupHelper", "sHelper", "A static helper for EditText bubble popups leaks a reference to the latest focused view.", C48673a.f123800a));
        }

        C48672p(String str, int i) {
            super(str, 47, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$q */
    static final class C48674q extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$q$a */
        static final class C48675a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48675a f123801a = null;

            static {
                f123801a = new C48675a();
            }

            C48675a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150414a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150414a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung") || aVar.f123832b != 23) {
                    return false;
                }
                return true;
            }
        }

        /* renamed from: shark.AndroidReferenceMatchers$q$b */
        static final class C48676b extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48676b f123802a = null;

            static {
                f123802a = new C48676b();
            }

            C48676b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150415a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150415a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung") || aVar.f123832b != 23) {
                    return false;
                }
                return true;
            }
        }

        /* renamed from: shark.AndroidReferenceMatchers$q$c */
        static final class C48677c extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48677c f123803a = null;

            static {
                f123803a = new C48677c();
            }

            C48677c() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150416a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150416a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung") || aVar.f123832b != 22) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            Collection collection = list;
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.sec.clipboard.ClipboardExManager", "mContext", "android.sec.clipboard.ClipboardExManager$IClipboardDataPasteEventImpl$1 is a native callback that holds IClipboardDataPasteEventImpl which holds ClipboardExManager which has a destroyed activity as mContext", C48675a.f123801a));
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.sec.clipboard.ClipboardExManager", "mPersonaManager", "android.sec.clipboard.ClipboardExManager$IClipboardDataPasteEventImpl$1 is a native callback that holds IClipboardDataPasteEventImpl which holds ClipboardExManager which holds PersonaManager which has a destroyed activity as mContext", C48676b.f123802a));
            collection.add(AndroidReferenceMatchers.Companion.mo123346b("android.widget.TextView$IClipboardDataPasteEventImpl", "this$0", "TextView$IClipboardDataPasteEventImpl$1 is held by a native ref, and IClipboardDataPasteEventImpl ends up leaking a detached textview", C48677c.f123803a));
        }

        C48674q(String str, int i) {
            super(str, 34, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$r */
    static final class C48678r extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$r$a */
        static final class C48679a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48679a f123804a = null;

            static {
                f123804a = new C48679a();
            }

            C48679a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150417a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150417a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (C7573i.m23585a((Object) aVar.f123831a, (Object) "samsung")) {
                    int i = aVar.f123832b;
                    if (19 <= i && 21 >= i) {
                        return true;
                    }
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.sec.clipboard.ClipboardUIManager", "mContext", "ClipboardUIManager is a static singleton that leaks an activity context. Fix: trigger a call to ClipboardUIManager.getInstance() in Application.onCreate() , so that the ClipboardUIManager instance gets cached with a reference to the application context. Example: https://gist.github.com/cypressious/91c4fb1455470d803a602838dfcd5774", C48679a.f123804a));
        }

        C48678r(String str, int i) {
            super(str, 32, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$s */
    static final class C48680s extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$s$a */
        static final class C48681a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48681a f123805a = null;

            static {
                f123805a = new C48681a();
            }

            C48681a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150418a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b <= 23) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150418a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.net.ConnectivityManager", "sInstance", "ConnectivityManager has a sInstance field that is set when the first ConnectivityManager instance is created. ConnectivityManager has a mContext field. When calling activity.getSystemService(Context.CONNECTIVITY_SERVICE) , the first ConnectivityManager instance is created with the activity context and stored in sInstance. That activity context then leaks forever. Until this is fixed, app developers can prevent this leak by making sure the ConnectivityManager is first created with an App Context. E.g. in some static init do: context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE) Tracked here: https://code.google.com/p/android/issues/detail?id=198852 Introduced here: https://github.com/android/platform_frameworks_base/commit/e0bef71662d81caaaa0d7214fb0bef5d39996a69", C48681a.f123805a));
        }

        C48680s(String str, int i) {
            super(str, 18, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$t */
    static final class C48682t extends AndroidReferenceMatchers {
        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123345a("android.view.inputmethod.InputMethodManager$ControlledInputConnectionWrapper", "ControlledInputConnectionWrapper is held by a global variable in native code. ", AndroidReferenceMatchers.ALWAYS));
        }

        C48682t(String str, int i) {
            super(str, 29, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$u */
    public static final class C48683u {

        /* renamed from: shark.AndroidReferenceMatchers$u$a */
        static final class C48684a extends Lambda implements C7562b<C48746h, Boolean> {

            /* renamed from: a */
            final /* synthetic */ C7562b f123806a;

            C48684a(C7562b bVar) {
                this.f123806a = bVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150430a((C48746h) obj));
            }

            /* renamed from: a */
            private boolean m150430a(C48746h hVar) {
                C7573i.m23587b(hVar, "graph");
                return ((Boolean) this.f123806a.invoke(C48711a.m150454a(hVar))).booleanValue();
            }
        }

        private C48683u() {
        }

        /* renamed from: a */
        public static List<C48861w> m150419a() {
            EnumSet allOf = EnumSet.allOf(AndroidReferenceMatchers.class);
            C7573i.m23582a((Object) allOf, "EnumSet.allOf(AndroidRef…enceMatchers::class.java)");
            return m150420a((Set<? extends AndroidReferenceMatchers>) allOf);
        }

        public /* synthetic */ C48683u(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static List<C48861w> m150420a(Set<? extends AndroidReferenceMatchers> set) {
            C7573i.m23587b(set, "referenceMatchers");
            List<C48861w> arrayList = new ArrayList<>();
            for (AndroidReferenceMatchers add$shark_android : set) {
                add$shark_android.add$shark_android(arrayList);
            }
            return arrayList;
        }

        /* renamed from: a */
        public static C48851o m150421a(String str) {
            C7573i.m23587b(str, "threadName");
            return new C48851o(new JavaLocalPattern(str));
        }

        /* renamed from: a */
        public static C48851o m150422a(String str, String str2) {
            C7573i.m23587b(str, "className");
            C7573i.m23587b(str2, "fieldName");
            return new C48851o(new InstanceFieldPattern(str, str2));
        }

        /* renamed from: a */
        private static C48854r m150425a(ReferencePattern referencePattern, String str, C7562b<? super C48710a, Boolean> bVar) {
            return new C48854r(referencePattern, str, new C48684a(bVar));
        }

        /* renamed from: a */
        public final C48854r mo123345a(String str, String str2, C7562b<? super C48710a, Boolean> bVar) {
            C7573i.m23587b(str, "className");
            C7573i.m23587b(str2, "description");
            C7573i.m23587b(bVar, "patternApplies");
            return m150425a((ReferencePattern) new NativeGlobalVariablePattern(str), str2, bVar);
        }

        /* renamed from: b */
        public final C48854r mo123346b(String str, String str2, String str3, C7562b<? super C48710a, Boolean> bVar) {
            C7573i.m23587b(str, "className");
            C7573i.m23587b(str2, "fieldName");
            C7573i.m23587b(str3, "description");
            C7573i.m23587b(bVar, "patternApplies");
            return m150425a((ReferencePattern) new InstanceFieldPattern(str, str2), str3, bVar);
        }

        /* renamed from: a */
        public final C48854r mo123344a(String str, String str2, String str3, C7562b<? super C48710a, Boolean> bVar) {
            C7573i.m23587b(str, "className");
            C7573i.m23587b(str2, "fieldName");
            C7573i.m23587b(str3, "description");
            C7573i.m23587b(bVar, "patternApplies");
            return m150425a((ReferencePattern) new StaticFieldPattern(str, str2), str3, bVar);
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.a.b, code=kotlin.jvm.a.b<shark.a, java.lang.Boolean>, for r4v0, types: [kotlin.jvm.a.b] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ shark.C48854r m150426b(shark.AndroidReferenceMatchers.C48683u r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, kotlin.jvm.p357a.C7562b<shark.C48710a, java.lang.Boolean> r4, int r5, java.lang.Object r6) {
            /*
                r6 = r5 & 4
                if (r6 == 0) goto L_0x0006
                java.lang.String r3 = ""
            L_0x0006:
                r5 = r5 & 8
                if (r5 == 0) goto L_0x000c
                kotlin.jvm.a.b<shark.a, java.lang.Boolean> r4 = shark.AndroidReferenceMatchers.ALWAYS
            L_0x000c:
                shark.r r0 = r0.mo123346b(r1, r2, r3, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: shark.AndroidReferenceMatchers.C48683u.m150426b(shark.AndroidReferenceMatchers$u, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.a.b, int, java.lang.Object):shark.r");
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$v */
    static final class C48685v extends Lambda implements C7562b<C48710a, Boolean> {

        /* renamed from: a */
        public static final C48685v f123807a = null;

        static {
            f123807a = new C48685v();
        }

        C48685v() {
            super(1);
        }

        /* renamed from: a */
        private static boolean m150431a(C48710a aVar) {
            C7573i.m23587b(aVar, "$receiver");
            return true;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m150431a((C48710a) obj));
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$w */
    static final class C48686w extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$w$a */
        static final class C48687a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48687a f123808a = null;

            static {
                f123808a = new C48687a();
            }

            C48687a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150432a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150432a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (C7573i.m23585a((Object) aVar.f123831a, (Object) "motorola")) {
                    int i = aVar.f123832b;
                    if (19 <= i && 22 >= i) {
                        return true;
                    }
                }
                return false;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.app.admin.DevicePolicyManager$SettingsObserver", "this$0", "DevicePolicyManager keeps a reference to the context it has been created with instead of extracting the application context. In this Motorola build, DevicePolicyManager has an inner SettingsObserver class that is a content observer, which is held into memory by a binder transport object.", C48687a.f123808a));
        }

        C48686w(String str, int i) {
            super(str, 53, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$x */
    static final class C48688x extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$x$a */
        static final class C48689a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48689a f123809a = null;

            static {
                f123809a = new C48689a();
            }

            C48689a() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m150433a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (aVar.f123832b <= 23) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150433a((C48710a) obj));
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123346b("android.widget.Editor$Blink", "this$0", "The EditText Blink of the Cursor is implemented using a callback and Messages, which trigger the display of the Cursor. If an AlertDialog or DialogFragment that contains a blinking cursor is detached, a message is posted with a delay after the dialog has been closed and as a result leaks the Activity. This can be fixed manually by calling TextView.setCursorVisible(false) in the dismiss() method of the dialog. Tracked here: https://code.google.com/p/android/issues/detail?id=188551 Fixed in AOSP: https://android.googlesource.com/platform/frameworks/base/+/5b734f2430e9f26c769d6af8ea5645e390fcf5af%5E%21/", C48689a.f123809a));
        }

        C48688x(String str, int i) {
            super(str, 17, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$y */
    static final class C48690y extends AndroidReferenceMatchers {
        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(C48683u.m150422a("android.view.Choreographer$FrameDisplayEventReceiver", "mMessageQueue"));
        }

        C48690y(String str, int i) {
            super(str, 62, null);
        }
    }

    /* renamed from: shark.AndroidReferenceMatchers$z */
    static final class C48691z extends AndroidReferenceMatchers {

        /* renamed from: shark.AndroidReferenceMatchers$z$a */
        static final class C48692a extends Lambda implements C7562b<C48710a, Boolean> {

            /* renamed from: a */
            public static final C48692a f123810a = null;

            static {
                f123810a = new C48692a();
            }

            C48692a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m150434a((C48710a) obj));
            }

            /* renamed from: a */
            private static boolean m150434a(C48710a aVar) {
                C7573i.m23587b(aVar, "$receiver");
                if (!C7573i.m23585a((Object) aVar.f123831a, (Object) "SHARP") || aVar.f123832b != 28) {
                    return false;
                }
                return true;
            }
        }

        public final void add$shark_android(List<C48861w> list) {
            C7573i.m23587b(list, "references");
            list.add(AndroidReferenceMatchers.Companion.mo123344a("android.app.ExtendedStatusBarManager", "sInstance", "ExtendedStatusBarManager is held in a static sInstance field and has a mContext\nfield which references a decor context which references a destroyed activity.", C48692a.f123810a));
        }

        C48691z(String str, int i) {
            super(str, 54, null);
        }
    }

    public abstract void add$shark_android(List<C48861w> list);

    static {
        Companion = new C48683u(null);
        ALWAYS = C48685v.f123807a;
    }
}
