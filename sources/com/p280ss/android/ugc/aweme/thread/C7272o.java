package com.p280ss.android.ugc.aweme.thread;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.thread.o */
final class C7272o {

    /* renamed from: a */
    private final Map<String, WeakReference<ExecutorService>> f20337a = new HashMap();

    /* renamed from: b */
    private Map<ThreadPoolType, AtomicInteger> f20338b = new HashMap();

    C7272o() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : this.f20337a.entrySet()) {
            String str = (String) entry.getKey();
            if (((WeakReference) entry.getValue()).get() != null) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) ((WeakReference) entry.getValue()).get();
                sb.append("pool=");
                sb.append(str);
                sb.append(", core.size=");
                sb.append(threadPoolExecutor.getCorePoolSize());
                sb.append(", pool.size=");
                sb.append(threadPoolExecutor.getPoolSize());
                sb.append(", largest.pool.size=");
                sb.append(threadPoolExecutor.getLargestPoolSize());
                sb.append(", queue.size=");
                sb.append(threadPoolExecutor.getQueue().size());
                sb.append(", task.count=");
                sb.append(threadPoolExecutor.getTaskCount());
                sb.append(", task.completed.count=");
                sb.append(threadPoolExecutor.getCompletedTaskCount());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final JSONObject mo18999a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        int i2 = 0;
        for (Entry entry : this.f20337a.entrySet()) {
            String str = (String) entry.getKey();
            if (((WeakReference) entry.getValue()).get() != null) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) ((WeakReference) entry.getValue()).get();
                if (str.equals(ThreadPoolType.IO.name())) {
                    jSONObject.put("immediate_pool_largest_size", threadPoolExecutor.getLargestPoolSize());
                    jSONObject.put("immediate_pool_task_count", threadPoolExecutor.getTaskCount());
                    jSONObject.put("immediate_pool_queue_size", threadPoolExecutor.getQueue().size());
                } else if (str.equals(ThreadPoolType.DEFAULT.name())) {
                    jSONObject.put("normal_pool_largest_size", threadPoolExecutor.getLargestPoolSize());
                    jSONObject.put("normal_pool_task_count", threadPoolExecutor.getTaskCount());
                    jSONObject.put("normal_pool_queue_size", threadPoolExecutor.getQueue().size());
                } else if (str.equals(ThreadPoolType.BACKGROUND.name())) {
                    jSONObject.put("background_pool_largest_size", threadPoolExecutor.getLargestPoolSize());
                    jSONObject.put("background_pool_task_count", threadPoolExecutor.getTaskCount());
                    jSONObject.put("background_pool_queue_size", threadPoolExecutor.getQueue().size());
                } else if (str.contains(ThreadPoolType.FIXED.name())) {
                    jSONObject.put("fixed_pool_largest_size", threadPoolExecutor.getLargestPoolSize() + jSONObject.optInt("fixed_pool_largest_size"));
                    jSONObject.put("fixed_pool_task_count", threadPoolExecutor.getTaskCount() + ((long) jSONObject.optInt("fixed_pool_task_count")));
                    jSONObject.put("fixed_pool_queue_size", threadPoolExecutor.getQueue().size() + jSONObject.optInt("fixed_pool_queue_size"));
                } else if (str.contains(ThreadPoolType.SCHEDULED.name())) {
                    jSONObject.put("schedule_pool_largest_size", threadPoolExecutor.getLargestPoolSize() + jSONObject.optInt("schedule_pool_largest_size"));
                    jSONObject.put("schedule_pool_task_count", threadPoolExecutor.getTaskCount() + ((long) jSONObject.optInt("schedule_pool_task_count")));
                    jSONObject.put("schedule_pool_queue_size", threadPoolExecutor.getQueue().size() + jSONObject.optInt("schedule_pool_queue_size"));
                } else if (str.contains(ThreadPoolType.SERIAL.name())) {
                    jSONObject.put("serial_pool_largest_size", threadPoolExecutor.getLargestPoolSize() + jSONObject.optInt("serial_pool_largest_size"));
                    jSONObject.put("serial_pool_task_count", threadPoolExecutor.getTaskCount() + ((long) jSONObject.optInt("serial_pool_task_count")));
                    jSONObject.put("serial_pool_queue_size", threadPoolExecutor.getQueue().size() + jSONObject.optInt("serial_pool_queue_size"));
                }
                i += threadPoolExecutor.getLargestPoolSize();
                i2 = (int) (((long) i2) + threadPoolExecutor.getTaskCount());
            }
        }
        jSONObject.put("total_thread_count", i);
        jSONObject.put("total_task_count", i2);
        return jSONObject;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19000a(ThreadPoolType threadPoolType, ExecutorService executorService, boolean z) {
        if (z) {
            this.f20337a.put(threadPoolType.name(), new WeakReference(executorService));
            return;
        }
        if (this.f20338b.get(threadPoolType) == null) {
            this.f20338b.put(threadPoolType, new AtomicInteger(0));
        }
        Map<String, WeakReference<ExecutorService>> map = this.f20337a;
        StringBuilder sb = new StringBuilder();
        sb.append(threadPoolType.name());
        sb.append("_");
        sb.append(((AtomicInteger) this.f20338b.get(threadPoolType)).incrementAndGet());
        map.put(sb.toString(), new WeakReference(executorService));
    }
}
