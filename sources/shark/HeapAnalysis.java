package shark;

import java.io.File;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

public abstract class HeapAnalysis implements Serializable {
    private HeapAnalysis() {
    }

    public abstract long getAnalysisDurationMillis();

    public abstract long getCreatedAtTimeMillis();

    public abstract File getHeapDumpFile();

    public /* synthetic */ HeapAnalysis(C7571f fVar) {
        this();
    }
}
