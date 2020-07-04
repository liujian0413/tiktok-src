package p346io.reactivex.observers;

import p346io.reactivex.observers.BaseTestConsumer;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.observers.BaseTestConsumer */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements C7321c {

    /* renamed from: io.reactivex.observers.BaseTestConsumer$TestWaitStrategy */
    public enum TestWaitStrategy implements Runnable {
        SPIN {
            public final void run() {
            }
        },
        YIELD {
            public final void run() {
                Thread.yield();
            }
        },
        SLEEP_1MS {
            public final void run() {
                sleep(1);
            }
        },
        SLEEP_10MS {
            public final void run() {
                sleep(10);
            }
        },
        SLEEP_100MS {
            public final void run() {
                sleep(100);
            }
        },
        SLEEP_1000MS {
            public final void run() {
                sleep(1000);
            }
        };

        public abstract void run();

        static void sleep(int i) {
            try {
                Thread.sleep((long) i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
