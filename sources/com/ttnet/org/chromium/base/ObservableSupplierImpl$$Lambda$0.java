package com.ttnet.org.chromium.base;

final /* synthetic */ class ObservableSupplierImpl$$Lambda$0 implements Runnable {
    private final ObservableSupplierImpl arg$1;
    private final Object arg$2;
    private final Callback arg$3;

    ObservableSupplierImpl$$Lambda$0(ObservableSupplierImpl observableSupplierImpl, Object obj, Callback callback) {
        this.arg$1 = observableSupplierImpl;
        this.arg$2 = obj;
        this.arg$3 = callback;
    }

    public final void run() {
        this.arg$1.lambda$addObserver$0$ObservableSupplierImpl(this.arg$2, this.arg$3);
    }
}
