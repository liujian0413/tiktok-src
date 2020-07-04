package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.modules.core.ChoreographerCompat.FrameCallback;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.core.ReactChoreographer.CallbackType;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class EventDispatcher implements LifecycleEventListener {
    public static final Comparator<Event> EVENT_COMPARATOR = new Comparator<Event>() {
        public final int compare(Event event, Event event2) {
            if (event == null && event2 == null) {
                return 0;
            }
            if (event == null) {
                return -1;
            }
            if (event2 == null) {
                return 1;
            }
            long timestampMs = event.getTimestampMs() - event2.getTimestampMs();
            if (timestampMs == 0) {
                return 0;
            }
            if (timestampMs < 0) {
                return -1;
            }
            return 1;
        }
    };
    public final ScheduleDispatchFrameCallback mCurrentFrameCallback = new ScheduleDispatchFrameCallback();
    public final DispatchEventsRunnable mDispatchEventsRunnable = new DispatchEventsRunnable();
    public final LongSparseArray<Integer> mEventCookieToLastEventIdx = new LongSparseArray<>();
    private final Map<String, Short> mEventNameToEventId = MapBuilder.newHashMap();
    private final ArrayList<Event> mEventStaging = new ArrayList<>();
    private final Object mEventsStagingLock = new Object();
    public Event[] mEventsToDispatch = new Event[16];
    public final Object mEventsToDispatchLock = new Object();
    public int mEventsToDispatchSize = 0;
    public volatile boolean mHasDispatchScheduled = false;
    public final AtomicInteger mHasDispatchScheduledCount = new AtomicInteger();
    private final ArrayList<EventDispatcherListener> mListeners = new ArrayList<>();
    private short mNextEventTypeId = 0;
    public volatile RCTEventEmitter mRCTEventEmitter;
    public final ReactApplicationContext mReactContext;

    class DispatchEventsRunnable implements Runnable {
        public void run() {
            Systrace.m42324a(0, "DispatchEventsRunnable");
            try {
                EventDispatcher.this.mHasDispatchScheduledCount.getAndIncrement();
                EventDispatcher.this.mHasDispatchScheduled = false;
                C13854a.m40916b(EventDispatcher.this.mRCTEventEmitter);
                synchronized (EventDispatcher.this.mEventsToDispatchLock) {
                    if (EventDispatcher.this.mEventsToDispatchSize > 1) {
                        Arrays.sort(EventDispatcher.this.mEventsToDispatch, 0, EventDispatcher.this.mEventsToDispatchSize, EventDispatcher.EVENT_COMPARATOR);
                    }
                    for (int i = 0; i < EventDispatcher.this.mEventsToDispatchSize; i++) {
                        Event event = EventDispatcher.this.mEventsToDispatch[i];
                        if (event != null) {
                            event.getEventName();
                            event.getUniqueID();
                            event.dispatch(EventDispatcher.this.mRCTEventEmitter);
                            event.dispose();
                        }
                    }
                    EventDispatcher.this.clearEventsToDispatch();
                    EventDispatcher.this.mEventCookieToLastEventIdx.clear();
                }
                Systrace.m42323a(0);
            } catch (Throwable th) {
                Systrace.m42323a(0);
                throw th;
            }
        }

        private DispatchEventsRunnable() {
        }
    }

    class ScheduleDispatchFrameCallback extends FrameCallback {
        private volatile boolean mIsPosted;
        private boolean mShouldStop;

        public void stop() {
            this.mShouldStop = true;
        }

        private void post() {
            ReactChoreographer.getInstance().postFrameCallback(CallbackType.TIMERS_EVENTS, EventDispatcher.this.mCurrentFrameCallback);
        }

        public void maybePost() {
            if (!this.mIsPosted) {
                this.mIsPosted = true;
                post();
            }
        }

        public void maybePostFromNonUI() {
            if (!this.mIsPosted) {
                if (EventDispatcher.this.mReactContext.isOnUiQueueThread()) {
                    maybePost();
                } else {
                    EventDispatcher.this.mReactContext.runOnUiQueueThread(new Runnable() {
                        public void run() {
                            ScheduleDispatchFrameCallback.this.maybePost();
                        }
                    });
                }
            }
        }

        private ScheduleDispatchFrameCallback() {
        }

        public void doFrame(long j) {
            UiThreadUtil.assertOnUiThread();
            if (this.mShouldStop) {
                this.mIsPosted = false;
            } else {
                post();
            }
            Systrace.m42324a(0, "ScheduleDispatchFrameCallback");
            try {
                EventDispatcher.this.moveStagedEventsToDispatchQueue();
                if (EventDispatcher.this.mEventsToDispatchSize > 0 && !EventDispatcher.this.mHasDispatchScheduled) {
                    EventDispatcher.this.mHasDispatchScheduled = true;
                    EventDispatcher.this.mHasDispatchScheduledCount.get();
                    EventDispatcher.this.mReactContext.runOnJSQueueThread(EventDispatcher.this.mDispatchEventsRunnable);
                }
            } finally {
                Systrace.m42323a(0);
            }
        }
    }

    private static long getEventCookie(int i, short s, short s2) {
        return ((((long) s) & 65535) << 32) | ((long) i) | ((((long) s2) & 65535) << 48);
    }

    public void onHostDestroy() {
        stopFrameCallback();
    }

    public void onHostPause() {
        stopFrameCallback();
    }

    public void clearEventsToDispatch() {
        Arrays.fill(this.mEventsToDispatch, 0, this.mEventsToDispatchSize, null);
        this.mEventsToDispatchSize = 0;
    }

    public void onCatalystInstanceDestroyed() {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                EventDispatcher.this.stopFrameCallback();
            }
        });
    }

    public void stopFrameCallback() {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentFrameCallback.stop();
    }

    public void onHostResume() {
        if (this.mRCTEventEmitter == null) {
            this.mRCTEventEmitter = (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class);
        }
        this.mCurrentFrameCallback.maybePostFromNonUI();
    }

    public void moveStagedEventsToDispatchQueue() {
        synchronized (this.mEventsStagingLock) {
            synchronized (this.mEventsToDispatchLock) {
                for (int i = 0; i < this.mEventStaging.size(); i++) {
                    Event event = (Event) this.mEventStaging.get(i);
                    if (!event.canCoalesce()) {
                        addEventToEventsToDispatch(event);
                    } else {
                        long eventCookie = getEventCookie(event.getViewTag(), event.getEventName(), event.getCoalescingKey());
                        Integer num = (Integer) this.mEventCookieToLastEventIdx.get(eventCookie);
                        Event event2 = null;
                        if (num == null) {
                            this.mEventCookieToLastEventIdx.put(eventCookie, Integer.valueOf(this.mEventsToDispatchSize));
                        } else {
                            Event event3 = this.mEventsToDispatch[num.intValue()];
                            Event coalesce = event.coalesce(event3);
                            if (coalesce != event3) {
                                this.mEventCookieToLastEventIdx.put(eventCookie, Integer.valueOf(this.mEventsToDispatchSize));
                                this.mEventsToDispatch[num.intValue()] = null;
                                event2 = event3;
                                event = coalesce;
                            } else {
                                event2 = event;
                                event = null;
                            }
                        }
                        if (event != null) {
                            addEventToEventsToDispatch(event);
                        }
                        if (event2 != null) {
                            event2.dispose();
                        }
                    }
                }
            }
            this.mEventStaging.clear();
        }
    }

    public void addListener(EventDispatcherListener eventDispatcherListener) {
        this.mListeners.add(eventDispatcherListener);
    }

    public void removeListener(EventDispatcherListener eventDispatcherListener) {
        this.mListeners.remove(eventDispatcherListener);
    }

    private void addEventToEventsToDispatch(Event event) {
        if (this.mEventsToDispatchSize == this.mEventsToDispatch.length) {
            this.mEventsToDispatch = (Event[]) Arrays.copyOf(this.mEventsToDispatch, this.mEventsToDispatch.length * 2);
        }
        Event[] eventArr = this.mEventsToDispatch;
        int i = this.mEventsToDispatchSize;
        this.mEventsToDispatchSize = i + 1;
        eventArr[i] = event;
    }

    public void dispatchEvent(Event event) {
        C13854a.m40915a(event.isInitialized(), "Dispatched event hasn't been initialized");
        Iterator it = this.mListeners.iterator();
        while (it.hasNext()) {
            ((EventDispatcherListener) it.next()).onEventDispatch(event);
        }
        synchronized (this.mEventsStagingLock) {
            this.mEventStaging.add(event);
            event.getEventName();
            event.getUniqueID();
        }
        if (this.mRCTEventEmitter != null) {
            this.mCurrentFrameCallback.maybePostFromNonUI();
        }
    }

    public EventDispatcher(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
        this.mReactContext.addLifecycleEventListener(this);
    }

    private long getEventCookie(int i, String str, short s) {
        short s2;
        Short sh = (Short) this.mEventNameToEventId.get(str);
        if (sh != null) {
            s2 = sh.shortValue();
        } else {
            short s3 = this.mNextEventTypeId;
            this.mNextEventTypeId = (short) (s3 + 1);
            this.mEventNameToEventId.put(str, Short.valueOf(s3));
            s2 = s3;
        }
        return getEventCookie(i, s2, s);
    }
}
