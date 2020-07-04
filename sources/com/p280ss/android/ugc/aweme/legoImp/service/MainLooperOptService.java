package com.p280ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Printer;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoService;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService */
public class MainLooperOptService implements LegoService {
    private static final Boolean LOG_OPEN = Boolean.valueOf(false);
    private Class<?> activityThreadClass;
    private Class<?> choreographerClass;
    public boolean enable = true;
    public Handler frameHandler;
    private Class<?> handlerClass;
    public int launchActivityMsg = 100;

    /* renamed from: mH */
    public Handler f84462mH;
    private Choreographer mainChoreographer = Choreographer.getInstance();
    public MessageQueue mainMessageQueue;
    private Class<?> messageClass;
    private Class<?> messageQueueClass;
    private Printer msgListener = new Printer() {

        /* renamed from: b */
        private boolean f84464b;

        public final void println(String str) {
            if (!MainLooperOptService.this.enable || C7121a.m22261i()) {
                MainLooperOptService.log("Boot Finish");
                MainLooperOptService.this.reset();
            } else if (!((Boolean) MainLooperOptService.this.watchSuccess.get(MainLooperOptService.this.watchState)).booleanValue()) {
                switch (C323532.f84465a[MainLooperOptService.this.watchState.ordinal()]) {
                    case 1:
                        if (!this.f84464b) {
                            this.f84464b = MainLooperOptService.this.moveMessageToFront(MainLooperOptService.this.f84462mH, MainLooperOptService.this.mainMessageQueue, MainLooperOptService.this.pauseActivityMsg);
                            if (this.f84464b) {
                                MainLooperOptService.log("PAUSE_ACTIVITY opt success");
                                MainLooperOptService.this.printMessages(MainLooperOptService.this.mainMessageQueue);
                            }
                        }
                        if (MainLooperOptService.this.moveMessageToFront(MainLooperOptService.this.f84462mH, MainLooperOptService.this.mainMessageQueue, MainLooperOptService.this.launchActivityMsg)) {
                            MainLooperOptService.log("LAUNCH_ACTIVITY opt success");
                            MainLooperOptService.this.printMessages(MainLooperOptService.this.mainMessageQueue);
                            MainLooperOptService.this.watchSuccess.put(WatchState.WATCH_ACTIVITY, Boolean.valueOf(true));
                            return;
                        }
                        break;
                    case 2:
                        if (MainLooperOptService.this.moveMessageToFront(MainLooperOptService.this.frameHandler, MainLooperOptService.this.mainMessageQueue, 0)) {
                            MainLooperOptService.log("MSG_ON_MEASURE opt success");
                            MainLooperOptService.this.printMessages(MainLooperOptService.this.mainMessageQueue);
                            MainLooperOptService.this.watchSuccess.put(WatchState.WATCH_ON_MEASURE, Boolean.valueOf(true));
                            return;
                        }
                        break;
                    case 3:
                        if (MainLooperOptService.this.viewRootImplHandler == null) {
                            MainLooperOptService.log("viewRootImplHandler is null");
                            MainLooperOptService.this.watchSuccess.put(WatchState.WATCH_WINDOW_FOCUS_CHANGE, Boolean.valueOf(true));
                            return;
                        } else if (MainLooperOptService.this.moveMessageToFront(MainLooperOptService.this.viewRootImplHandler, MainLooperOptService.this.mainMessageQueue, 6)) {
                            MainLooperOptService.log("MSG_WINDOW_FOCUS_CHANGED opt success");
                            MainLooperOptService.this.printMessages(MainLooperOptService.this.mainMessageQueue);
                            MainLooperOptService.this.watchSuccess.put(WatchState.WATCH_WINDOW_FOCUS_CHANGE, Boolean.valueOf(true));
                            return;
                        }
                        break;
                    case 4:
                        if (MainLooperOptService.this.moveMessageToFront(MainLooperOptService.this.frameHandler, MainLooperOptService.this.mainMessageQueue, 0)) {
                            MainLooperOptService.log("MSG_ON_DRAW opt success");
                            MainLooperOptService.this.printMessages(MainLooperOptService.this.mainMessageQueue);
                            MainLooperOptService.this.watchSuccess.put(WatchState.WATCH_ON_DRAW, Boolean.valueOf(true));
                            MainLooperOptService.log("Opt Finish");
                            break;
                        }
                        break;
                }
            }
        }
    };
    public int pauseActivityMsg = BaseNotice.HASHTAG;
    private Class<?> viewRootImplClass;
    public Handler viewRootImplHandler;
    public WatchState watchState;
    public Map<WatchState, Boolean> watchSuccess;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$2 */
    static /* synthetic */ class C323532 {

        /* renamed from: a */
        static final /* synthetic */ int[] f84465a = new int[WatchState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$WatchState[] r0 = com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService.WatchState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f84465a = r0
                int[] r0 = f84465a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$WatchState r1 = com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService.WatchState.WATCH_ACTIVITY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f84465a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$WatchState r1 = com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService.WatchState.WATCH_ON_MEASURE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f84465a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$WatchState r1 = com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService.WatchState.WATCH_WINDOW_FOCUS_CHANGE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f84465a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$WatchState r1 = com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService.WatchState.WATCH_ON_DRAW     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService.C323532.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$ResetTask */
    class ResetTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        private ResetTask() {
        }

        public void run(Context context) {
            C6921a.m21555a("ResetTask");
            MainLooperOptService.this.reset();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$WatchState */
    public enum WatchState {
        WATCH_INIT,
        WATCH_ACTIVITY,
        WATCH_ON_MEASURE,
        WATCH_WINDOW_FOCUS_CHANGE,
        WATCH_ON_DRAW
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void reset() {
        this.enable = false;
        this.f84462mH = null;
        this.frameHandler = null;
        this.viewRootImplHandler = null;
        this.mainMessageQueue = null;
        this.mainChoreographer = null;
    }

    static final /* synthetic */ void lambda$logMeasure$1$MainLooperOptService() {
        C6857a.m21312e().mo16827b("cold_boot_main_measure_duration", false);
        C6857a.m21312e().mo16822a("cold_boot_main_measure_to_focus", false);
    }

    private Handler hookActivityThreadHandler() {
        try {
            Object invoke = this.activityThreadClass.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = this.activityThreadClass.getDeclaredField("mH");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(invoke);
        } catch (Exception unused) {
            return null;
        }
    }

    private void logMeasure() {
        this.mainChoreographer.postFrameCallback(C32354a.f84466a);
        try {
            Method declaredMethod = Class.forName("android.view.Choreographer").getDeclaredMethod("postCallbackDelayedInternal", new Class[]{Integer.TYPE, Object.class, Object.class, Long.TYPE});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.mainChoreographer, new Object[]{Integer.valueOf(3), C32355b.f84467a, null, Integer.valueOf(0)});
        } catch (Throwable unused) {
        }
    }

    public void enable(boolean z) {
        this.enable = z;
    }

    public static void log(String str) {
        LOG_OPEN.booleanValue();
    }

    private Message getNextMessage(Message message) {
        try {
            Field declaredField = this.messageClass.getDeclaredField("next");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(message);
            if (obj != null) {
                return (Message) obj;
            }
        } catch (Exception e) {
            log(e.getMessage());
        }
        return null;
    }

    private Handler hookChoreographerHandler(Choreographer choreographer) {
        try {
            Field declaredField = this.choreographerClass.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(choreographer);
        } catch (Exception e) {
            log(e.getMessage());
            return null;
        }
    }

    private MessageQueue hookMainMessageQueue(Handler handler) {
        try {
            Field declaredField = this.handlerClass.getDeclaredField("mQueue");
            declaredField.setAccessible(true);
            return (MessageQueue) declaredField.get(handler);
        } catch (Exception e) {
            log(e.getMessage());
            return null;
        }
    }

    private Handler hookViewRootImplHandler(ViewParent viewParent) {
        try {
            Field declaredField = this.viewRootImplClass.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(viewParent);
        } catch (Exception e) {
            log(e.getMessage());
            return null;
        }
    }

    static final /* synthetic */ void lambda$logMeasure$0$MainLooperOptService(long j) {
        C6857a.m21312e().mo16827b("cold_boot_main_resume_to_measure", false);
        C6857a.m21312e().mo16822a("cold_boot_main_measure_duration", false);
    }

    public void updateRootView(View view) {
        if (this.viewRootImplHandler == null && this.enable) {
            View rootView = view.getRootView();
            if (rootView != null) {
                this.viewRootImplHandler = hookViewRootImplHandler(rootView.getParent());
            }
        }
    }

    public void printMessages(MessageQueue messageQueue) {
        if (LOG_OPEN.booleanValue()) {
            try {
                Field declaredField = this.messageQueueClass.getDeclaredField("mMessages");
                declaredField.setAccessible(true);
                Message message = (Message) declaredField.get(messageQueue);
                StringBuilder sb = new StringBuilder("message: ");
                while (message != null) {
                    sb.append(message.what);
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    message = getNextMessage(message);
                }
                log(sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    public void updateState(WatchState watchState2) {
        if (this.enable && C7121a.m22260h() && !C7121a.m22261i()) {
            StringBuilder sb = new StringBuilder("update state to: ");
            sb.append(watchState2);
            log(sb.toString());
            this.watchState = watchState2;
            this.watchSuccess.put(this.watchState, Boolean.valueOf(false));
        }
    }

    public void init(Context context) {
        C6921a.m21555a("MainLooperOptService");
        logMeasure();
        try {
            this.activityThreadClass = Class.forName("android.app.ActivityThread");
            this.choreographerClass = Class.forName("android.view.Choreographer");
            this.viewRootImplClass = Class.forName("android.view.ViewRootImpl");
            this.handlerClass = Class.forName("android.os.Handler");
            this.messageQueueClass = Class.forName("android.os.MessageQueue");
            this.messageClass = Class.forName("android.os.Message");
            this.f84462mH = hookActivityThreadHandler();
            this.frameHandler = hookChoreographerHandler(this.mainChoreographer);
            this.mainMessageQueue = hookMainMessageQueue(this.f84462mH);
            this.watchSuccess = new HashMap();
            if (!(this.f84462mH == null || this.mainMessageQueue == null || this.frameHandler == null)) {
                for (WatchState put : WatchState.values()) {
                    this.watchSuccess.put(put, Boolean.valueOf(false));
                }
                this.watchSuccess.put(WatchState.WATCH_INIT, Boolean.valueOf(true));
                this.watchState = WatchState.WATCH_INIT;
                Looper.getMainLooper().setMessageLogging(this.msgListener);
            }
            C7121a.m22248b().mo18559a(new ResetTask()).mo18560a();
        } catch (Exception unused) {
        }
    }

    public boolean moveMessageToFront(Handler handler, MessageQueue messageQueue, int i) {
        try {
            Field declaredField = this.messageQueueClass.getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            Message message = (Message) declaredField.get(messageQueue);
            while (message != null) {
                if (message.what == i && message.getTarget() == handler) {
                    Message obtain = Message.obtain(message);
                    handler.removeMessages(message.what);
                    handler.sendMessageAtFrontOfQueue(obtain);
                    return true;
                }
                message = getNextMessage(message);
            }
        } catch (Exception e) {
            log(e.getMessage());
        }
        return false;
    }
}
