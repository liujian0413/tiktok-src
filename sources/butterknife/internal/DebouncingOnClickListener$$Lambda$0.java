package butterknife.internal;

final /* synthetic */ class DebouncingOnClickListener$$Lambda$0 implements Runnable {
    static final Runnable $instance = new DebouncingOnClickListener$$Lambda$0();

    private DebouncingOnClickListener$$Lambda$0() {
    }

    public final void run() {
        DebouncingOnClickListener.enabled = true;
    }
}
