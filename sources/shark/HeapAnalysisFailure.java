package shark;

import java.io.File;
import kotlin.jvm.internal.C7573i;

public final class HeapAnalysisFailure extends HeapAnalysis {
    private final long analysisDurationMillis;
    private final long createdAtTimeMillis;
    private final HeapAnalysisException exception;
    private final File heapDumpFile;

    public static /* synthetic */ HeapAnalysisFailure copy$default(HeapAnalysisFailure heapAnalysisFailure, File file, long j, long j2, HeapAnalysisException heapAnalysisException, int i, Object obj) {
        if ((i & 1) != 0) {
            file = heapAnalysisFailure.getHeapDumpFile();
        }
        if ((i & 2) != 0) {
            j = heapAnalysisFailure.getCreatedAtTimeMillis();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = heapAnalysisFailure.getAnalysisDurationMillis();
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            heapAnalysisException = heapAnalysisFailure.exception;
        }
        return heapAnalysisFailure.copy(file, j3, j4, heapAnalysisException);
    }

    public final File component1() {
        return getHeapDumpFile();
    }

    public final long component2() {
        return getCreatedAtTimeMillis();
    }

    public final long component3() {
        return getAnalysisDurationMillis();
    }

    public final HeapAnalysisException component4() {
        return this.exception;
    }

    public final HeapAnalysisFailure copy(File file, long j, long j2, HeapAnalysisException heapAnalysisException) {
        C7573i.m23587b(file, "heapDumpFile");
        C7573i.m23587b(heapAnalysisException, "exception");
        HeapAnalysisFailure heapAnalysisFailure = new HeapAnalysisFailure(file, j, j2, heapAnalysisException);
        return heapAnalysisFailure;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HeapAnalysisFailure) {
                HeapAnalysisFailure heapAnalysisFailure = (HeapAnalysisFailure) obj;
                if (C7573i.m23585a((Object) getHeapDumpFile(), (Object) heapAnalysisFailure.getHeapDumpFile())) {
                    if (getCreatedAtTimeMillis() == heapAnalysisFailure.getCreatedAtTimeMillis()) {
                        if (!(getAnalysisDurationMillis() == heapAnalysisFailure.getAnalysisDurationMillis()) || !C7573i.m23585a((Object) this.exception, (Object) heapAnalysisFailure.exception)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getAnalysisDurationMillis() {
        return this.analysisDurationMillis;
    }

    public final long getCreatedAtTimeMillis() {
        return this.createdAtTimeMillis;
    }

    public final HeapAnalysisException getException() {
        return this.exception;
    }

    public final File getHeapDumpFile() {
        return this.heapDumpFile;
    }

    public final int hashCode() {
        File heapDumpFile2 = getHeapDumpFile();
        int i = 0;
        int hashCode = (heapDumpFile2 != null ? heapDumpFile2.hashCode() : 0) * 31;
        long createdAtTimeMillis2 = getCreatedAtTimeMillis();
        int i2 = (hashCode + ((int) (createdAtTimeMillis2 ^ (createdAtTimeMillis2 >>> 32)))) * 31;
        long analysisDurationMillis2 = getAnalysisDurationMillis();
        int i3 = (i2 + ((int) (analysisDurationMillis2 ^ (analysisDurationMillis2 >>> 32)))) * 31;
        HeapAnalysisException heapAnalysisException = this.exception;
        if (heapAnalysisException != null) {
            i = heapAnalysisException.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeapAnalysisFailure(heapDumpFile=");
        sb.append(getHeapDumpFile());
        sb.append(", createdAtTimeMillis=");
        sb.append(getCreatedAtTimeMillis());
        sb.append(", analysisDurationMillis=");
        sb.append(getAnalysisDurationMillis());
        sb.append(", exception=");
        sb.append(this.exception);
        sb.append(")");
        return sb.toString();
    }

    public HeapAnalysisFailure(File file, long j, long j2, HeapAnalysisException heapAnalysisException) {
        C7573i.m23587b(file, "heapDumpFile");
        C7573i.m23587b(heapAnalysisException, "exception");
        super(null);
        this.heapDumpFile = file;
        this.createdAtTimeMillis = j;
        this.analysisDurationMillis = j2;
        this.exception = heapAnalysisException;
    }
}
