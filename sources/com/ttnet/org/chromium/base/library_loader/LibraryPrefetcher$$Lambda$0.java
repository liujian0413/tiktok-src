package com.ttnet.org.chromium.base.library_loader;

final /* synthetic */ class LibraryPrefetcher$$Lambda$0 implements Runnable {
    static final Runnable $instance = new LibraryPrefetcher$$Lambda$0();

    private LibraryPrefetcher$$Lambda$0() {
    }

    public final void run() {
        LibraryPrefetcher.nativePeriodicallyCollectResidency();
    }
}
