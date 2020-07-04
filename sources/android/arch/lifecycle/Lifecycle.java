package android.arch.lifecycle;

public abstract class Lifecycle {

    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(State state) {
            if (compareTo(state) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public abstract State mo54a();

    /* renamed from: a */
    public abstract void mo55a(C0042h hVar);

    /* renamed from: b */
    public abstract void mo56b(C0042h hVar);
}
