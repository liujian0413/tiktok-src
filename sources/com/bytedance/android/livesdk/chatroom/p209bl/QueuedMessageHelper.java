package com.bytedance.android.livesdk.chatroom.p209bl;

import com.bytedance.android.livesdkapi.message.C9499a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.QueuedMessageHelper */
public enum QueuedMessageHelper {
    INSTANCE;
    
    private Map<Integer, List<C4266a>> sCallbackMap;
    private Map<Integer, Boolean> sIsBusyMap;
    private Map<Integer, Boolean> sIsRunningMap;
    private Map<Integer, List<C9499a>> sMessageQueueMap;

    /* renamed from: com.bytedance.android.livesdk.chatroom.bl.QueuedMessageHelper$a */
    public interface C4266a {
    }

    public final void stop() {
        this.sCallbackMap.clear();
        this.sMessageQueueMap.clear();
        this.sIsRunningMap.clear();
        this.sIsBusyMap.clear();
    }

    public final void onMessageFinish(int i) {
        this.sIsBusyMap.put(Integer.valueOf(i), Boolean.valueOf(false));
        next(i);
    }

    private void next(int i) {
        List list = (List) this.sMessageQueueMap.get(Integer.valueOf(i));
        Boolean bool = (Boolean) this.sIsRunningMap.get(Integer.valueOf(i));
        if (bool != null) {
            Boolean bool2 = (Boolean) this.sIsBusyMap.get(Integer.valueOf(i));
            if (bool2 != null) {
                List list2 = (List) this.sCallbackMap.get(Integer.valueOf(i));
                if (list != null && list.size() > 0 && list2 != null && !list2.isEmpty() && bool.booleanValue() && !bool2.booleanValue()) {
                    this.sIsBusyMap.put(Integer.valueOf(i), Boolean.valueOf(true));
                    if (!list.isEmpty()) {
                        list.get(0);
                    }
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        }
    }

    public final void add(int i, C9499a aVar) {
        Boolean bool = (Boolean) this.sIsRunningMap.get(Integer.valueOf(i));
        if (bool != null) {
            List list = (List) this.sMessageQueueMap.get(Integer.valueOf(i));
            if (bool.booleanValue() && aVar != null && list != null) {
                list.add(aVar);
                next(i);
            }
        }
    }

    public final void start(int i, C4266a aVar) {
        List list = (List) this.sCallbackMap.get(Integer.valueOf(i));
        if (list == null) {
            list = new CopyOnWriteArrayList();
            this.sCallbackMap.put(Integer.valueOf(i), list);
        }
        list.add(aVar);
        this.sMessageQueueMap.put(Integer.valueOf(i), new CopyOnWriteArrayList());
        this.sIsRunningMap.put(Integer.valueOf(i), Boolean.valueOf(true));
        this.sIsBusyMap.put(Integer.valueOf(i), Boolean.valueOf(false));
    }
}
