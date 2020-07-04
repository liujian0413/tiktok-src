package com.ttnet.org.chromium.base.library_loader;

final /* synthetic */ class LibraryPrefetcher$$Lambda$1 implements Runnable {
    private final boolean arg$1;

    LibraryPrefetcher$$Lambda$1(boolean z) {
        this.arg$1 = z;
    }

    public final void run() {
        LibraryPrefetcher.lambda$asyncPrefetchLibrariesToMemory$0$LibraryPrefetcher(this.arg$1);
    }
}
