package shark;

import kotlin.jvm.internal.C7573i;

public interface OnAnalysisProgressListener {

    /* renamed from: a */
    public static final C48707a f123827a = C48707a.f123828a;

    public enum Step {
        PARSING_HEAP_DUMP,
        FINDING_LEAKING_INSTANCES,
        FINDING_PATHS_TO_LEAKING_OBJECTS,
        FINDING_DOMINATORS,
        COMPUTING_NATIVE_RETAINED_SIZE,
        COMPUTING_RETAINED_SIZE,
        BUILDING_LEAK_TRACES,
        REPORTING_HEAP_ANALYSIS
    }

    /* renamed from: shark.OnAnalysisProgressListener$a */
    public static final class C48707a {

        /* renamed from: a */
        static final /* synthetic */ C48707a f123828a = new C48707a();

        /* renamed from: b */
        private static final OnAnalysisProgressListener f123829b = new C48708a();

        /* renamed from: shark.OnAnalysisProgressListener$a$a */
        public static final class C48708a implements OnAnalysisProgressListener {
            C48708a() {
            }

            /* renamed from: a */
            public final void mo83581a(Step step) {
                C7573i.m23587b(step, "step");
            }
        }

        private C48707a() {
        }
    }

    /* renamed from: a */
    void mo83581a(Step step);
}
