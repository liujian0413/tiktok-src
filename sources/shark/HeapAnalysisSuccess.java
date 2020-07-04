package shark;

import java.io.File;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

public final class HeapAnalysisSuccess extends HeapAnalysis {
    private final long analysisDurationMillis;
    private final List<ApplicationLeak> applicationLeaks;
    private final long createdAtTimeMillis;
    private final File heapDumpFile;
    private final List<LibraryLeak> libraryLeaks;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<shark.ApplicationLeak>, for r11v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<shark.LibraryLeak>, for r12v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ shark.HeapAnalysisSuccess copy$default(shark.HeapAnalysisSuccess r5, java.io.File r6, long r7, long r9, java.util.List<shark.ApplicationLeak> r11, java.util.List<shark.LibraryLeak> r12, int r13, java.lang.Object r14) {
        /*
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0008
            java.io.File r6 = r5.getHeapDumpFile()
        L_0x0008:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x0010
            long r7 = r5.getCreatedAtTimeMillis()
        L_0x0010:
            r0 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0019
            long r9 = r5.getAnalysisDurationMillis()
        L_0x0019:
            r2 = r9
            r7 = r13 & 8
            if (r7 == 0) goto L_0x0020
            java.util.List<shark.ApplicationLeak> r11 = r5.applicationLeaks
        L_0x0020:
            r14 = r11
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0027
            java.util.List<shark.LibraryLeak> r12 = r5.libraryLeaks
        L_0x0027:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r0
            r11 = r2
            r13 = r14
            r14 = r4
            shark.HeapAnalysisSuccess r5 = r7.copy(r8, r9, r11, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.HeapAnalysisSuccess.copy$default(shark.HeapAnalysisSuccess, java.io.File, long, long, java.util.List, java.util.List, int, java.lang.Object):shark.HeapAnalysisSuccess");
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

    public final List<ApplicationLeak> component4() {
        return this.applicationLeaks;
    }

    public final List<LibraryLeak> component5() {
        return this.libraryLeaks;
    }

    public final HeapAnalysisSuccess copy(File file, long j, long j2, List<ApplicationLeak> list, List<LibraryLeak> list2) {
        File file2 = file;
        C7573i.m23587b(file, "heapDumpFile");
        List<ApplicationLeak> list3 = list;
        C7573i.m23587b(list, "applicationLeaks");
        List<LibraryLeak> list4 = list2;
        C7573i.m23587b(list4, "libraryLeaks");
        HeapAnalysisSuccess heapAnalysisSuccess = new HeapAnalysisSuccess(file2, j, j2, list3, list4);
        return heapAnalysisSuccess;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HeapAnalysisSuccess) {
                HeapAnalysisSuccess heapAnalysisSuccess = (HeapAnalysisSuccess) obj;
                if (C7573i.m23585a((Object) getHeapDumpFile(), (Object) heapAnalysisSuccess.getHeapDumpFile())) {
                    if (getCreatedAtTimeMillis() == heapAnalysisSuccess.getCreatedAtTimeMillis()) {
                        if (!(getAnalysisDurationMillis() == heapAnalysisSuccess.getAnalysisDurationMillis()) || !C7573i.m23585a((Object) this.applicationLeaks, (Object) heapAnalysisSuccess.applicationLeaks) || !C7573i.m23585a((Object) this.libraryLeaks, (Object) heapAnalysisSuccess.libraryLeaks)) {
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

    public final List<ApplicationLeak> getApplicationLeaks() {
        return this.applicationLeaks;
    }

    public final long getCreatedAtTimeMillis() {
        return this.createdAtTimeMillis;
    }

    public final File getHeapDumpFile() {
        return this.heapDumpFile;
    }

    public final List<LibraryLeak> getLibraryLeaks() {
        return this.libraryLeaks;
    }

    public final int hashCode() {
        File heapDumpFile2 = getHeapDumpFile();
        int i = 0;
        int hashCode = (heapDumpFile2 != null ? heapDumpFile2.hashCode() : 0) * 31;
        long createdAtTimeMillis2 = getCreatedAtTimeMillis();
        int i2 = (hashCode + ((int) (createdAtTimeMillis2 ^ (createdAtTimeMillis2 >>> 32)))) * 31;
        long analysisDurationMillis2 = getAnalysisDurationMillis();
        int i3 = (i2 + ((int) (analysisDurationMillis2 ^ (analysisDurationMillis2 >>> 32)))) * 31;
        List<ApplicationLeak> list = this.applicationLeaks;
        int hashCode2 = (i3 + (list != null ? list.hashCode() : 0)) * 31;
        List<LibraryLeak> list2 = this.libraryLeaks;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeapAnalysisSuccess(heapDumpFile=");
        sb.append(getHeapDumpFile());
        sb.append(", createdAtTimeMillis=");
        sb.append(getCreatedAtTimeMillis());
        sb.append(", analysisDurationMillis=");
        sb.append(getAnalysisDurationMillis());
        sb.append(", applicationLeaks=");
        sb.append(this.applicationLeaks);
        sb.append(", libraryLeaks=");
        sb.append(this.libraryLeaks);
        sb.append(")");
        return sb.toString();
    }

    public final List<Leak> getAllLeaks() {
        return C7525m.m23506c((Collection<? extends T>) this.applicationLeaks, (Iterable<? extends T>) this.libraryLeaks);
    }

    public HeapAnalysisSuccess(File file, long j, long j2, List<ApplicationLeak> list, List<LibraryLeak> list2) {
        C7573i.m23587b(file, "heapDumpFile");
        C7573i.m23587b(list, "applicationLeaks");
        C7573i.m23587b(list2, "libraryLeaks");
        super(null);
        this.heapDumpFile = file;
        this.createdAtTimeMillis = j;
        this.analysisDurationMillis = j2;
        this.applicationLeaks = list;
        this.libraryLeaks = list2;
    }
}
