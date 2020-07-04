package com.ttnet.org.chromium.base.library_loader;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.ttnet.org.chromium.base.CommandLine;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.SysUtils;
import com.ttnet.org.chromium.base.TraceEvent;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.metrics.RecordHistogram;
import com.ttnet.org.chromium.base.task.PostTask;
import com.ttnet.org.chromium.base.task.TaskTraits;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

@JNINamespace("base::android")
public class LibraryPrefetcher {
    private static final AtomicBoolean sPrefetchLibraryHasBeenCalled = new AtomicBoolean();

    static final class OrderedCodeInfo {
        public final String filename;
        public final long length;
        public final long startOffset;

        public final String toString() {
            StringBuilder sb = new StringBuilder("filename = ");
            sb.append(this.filename);
            sb.append(" startOffset = ");
            sb.append(this.startOffset);
            sb.append(" length = ");
            sb.append(this.length);
            return sb.toString();
        }

        public OrderedCodeInfo(String str, long j, long j2) {
            this.filename = str;
            this.startOffset = j;
            this.length = j2;
        }
    }

    private static native void nativeForkAndPrefetchNativeLibrary();

    private static native OrderedCodeInfo nativeGetOrderedCodeInfo();

    private static native int nativePercentageOfResidentNativeLibraryCode();

    /* access modifiers changed from: private */
    public static native void nativePeriodicallyCollectResidency();

    public static void asyncPrefetchLibrariesToMemory() {
        SysUtils.logPageFaultCountToTracing();
        boolean compareAndSet = sPrefetchLibraryHasBeenCalled.compareAndSet(false, true);
        if (!compareAndSet || !CommandLine.getInstance().hasSwitch("log-native-library-residency")) {
            PostTask.postTask(TaskTraits.USER_BLOCKING, new LibraryPrefetcher$$Lambda$1(compareAndSet));
        } else {
            new Thread(LibraryPrefetcher$$Lambda$0.$instance).start();
        }
    }

    public static void maybePinOrderedCodeInMemory() {
        TraceEvent scoped = TraceEvent.scoped("LibraryPrefetcher::maybePinOrderedCodeInMemory");
        OrderedCodeInfo nativeGetOrderedCodeInfo = nativeGetOrderedCodeInfo();
        if (nativeGetOrderedCodeInfo == null) {
            if (scoped != null) {
                $closeResource(null, scoped);
            }
            return;
        }
        TraceEvent.instant("pinOrderedCodeInMemory", nativeGetOrderedCodeInfo.toString());
        Object systemService = ContextUtils.getApplicationContext().getSystemService("pinner");
        if (systemService == null) {
            Log.m146404w("LibraryPrefetcher", "Cannot get PinnerService.", new Object[0]);
            if (scoped != null) {
                $closeResource(null, scoped);
            }
            return;
        }
        try {
            if (!((Boolean) systemService.getClass().getMethod("pinRangeFromFile", new Class[]{String.class, Integer.TYPE, Integer.TYPE}).invoke(systemService, new Object[]{nativeGetOrderedCodeInfo.filename, Integer.valueOf((int) nativeGetOrderedCodeInfo.startOffset), Integer.valueOf((int) nativeGetOrderedCodeInfo.length)})).booleanValue()) {
                Log.m146394e("LibraryPrefetcher", "Not allowed to call the method, should not happen", new Object[0]);
            } else {
                Log.m146395i("LibraryPrefetcher", "Successfully pinned ordered code", new Object[0]);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            String str = "LibraryPrefetcher";
            StringBuilder sb = new StringBuilder("Error invoking the method. ");
            sb.append(e.getMessage());
            Log.m146404w(str, sb.toString(), new Object[0]);
        }
        if (scoped != null) {
            $closeResource(null, scoped);
            return;
        }
        return;
        try {
        } catch (Throwable th) {
            if (scoped != null) {
                $closeResource(r1, scoped);
            }
            throw th;
        }
    }

    static final /* synthetic */ void lambda$asyncPrefetchLibrariesToMemory$0$LibraryPrefetcher(boolean z) {
        boolean z2;
        String str;
        Throwable th;
        int nativePercentageOfResidentNativeLibraryCode = nativePercentageOfResidentNativeLibraryCode();
        TraceEvent scoped = TraceEvent.scoped("LibraryPrefetcher.asyncPrefetchLibrariesToMemory", Integer.toString(nativePercentageOfResidentNativeLibraryCode));
        if (!z || nativePercentageOfResidentNativeLibraryCode >= 90) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            try {
                nativeForkAndPrefetchNativeLibrary();
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
        if (nativePercentageOfResidentNativeLibraryCode != -1) {
            StringBuilder sb = new StringBuilder("LibraryLoader.PercentageOfResidentCodeBeforePrefetch");
            if (z) {
                str = ".ColdStartup";
            } else {
                str = ".WarmStartup";
            }
            sb.append(str);
            RecordHistogram.recordPercentageHistogram(sb.toString(), nativePercentageOfResidentNativeLibraryCode);
        }
        if (scoped != null) {
            $closeResource(null, scoped);
        }
        ContextUtils.getAppSharedPreferences().edit().remove("dont_prefetch_libraries").apply();
    }

    private static /* synthetic */ void $closeResource(Throwable th, TraceEvent traceEvent) {
        if (th != null) {
            try {
                traceEvent.close();
            } catch (Throwable th2) {
                C6497a.m20181a(th, th2);
            }
        } else {
            traceEvent.close();
        }
    }
}
