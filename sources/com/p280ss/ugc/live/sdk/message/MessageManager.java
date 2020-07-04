package com.p280ss.ugc.live.sdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.ugc.live.sdk.message.data.Configuration;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.data.JsonApiResult;
import com.p280ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.p280ss.ugc.live.sdk.message.interceptor.DeduplicateInterceptor;
import com.p280ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageConverter;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnInterceptListener;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ugc.live.sdk.message.MessageManager */
class MessageManager extends HandlerThread implements IMessageManager {
    private final DeduplicateInterceptor deduplicateInterceptor = new DeduplicateInterceptor();
    public volatile boolean isFetching;
    private final long[] mApiCallDelayTimeList = new long[5];
    private int mApiCallDelayTimeListIndex;
    private long mApiCallStartTime;
    public volatile long mApiCallTimeStamp;
    public volatile String mCursor;
    private volatile boolean mEnablePriority;
    private volatile boolean mEnableSmoothlyDispatch;
    public int mFetchFailedCount;
    public volatile long mFetchInterval;
    private final List<OnInterceptListener> mInterceptListeners = new CopyOnWriteArrayList();
    private final List<IInterceptor> mInterceptors = new CopyOnWriteArrayList();
    public volatile boolean mIsAnchor;
    public volatile Handler mMainThreadHandler;
    private IMessageClient mMessageClient;
    private Callback mMessageClientCallback;
    public IMessageConverter mMessageConverter;
    private final SparseArray<Set<OnMessageListener>> mMessageListenerMap = new SparseArray<>();
    private final List<IMessage> mMessageQueue = new ArrayList();
    public final List<Long> mMonitorMessageIds = new ArrayList();
    private volatile boolean mNeedEnqueueMessage;
    private volatile int mNextTimeDispatchSize;
    public volatile Handler mSelfThreadHandler;
    public volatile int mState;

    private long getApiCallMaxTime() {
        long[] jArr;
        long j = 0;
        for (long j2 : this.mApiCallDelayTimeList) {
            if (j2 > j) {
                j = j2;
            }
        }
        if (j > 0) {
            return j;
        }
        return 200;
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        this.mSelfThreadHandler = new Handler(getLooper()) {
            public void handleMessage(Message message) {
                MessageManager.this.handleSelfThreadMessage(message);
            }
        };
        this.mSelfThreadHandler.sendEmptyMessage(BaseNotice.HASHTAG);
    }

    public void startMessage() {
        if (this.mState != 2) {
            if (getLooper() == null) {
                this.mState = 1;
                start();
                return;
            }
            if (this.mSelfThreadHandler != null) {
                this.mSelfThreadHandler.sendEmptyMessage(BaseNotice.HASHTAG);
            }
        }
    }

    private void calculateNextTimeDispatchCount() {
        if (this.mEnableSmoothlyDispatch) {
            int size = this.mMessageQueue.size();
            long apiCallMaxTime = this.mFetchInterval + getApiCallMaxTime();
            if (apiCallMaxTime < 200) {
                apiCallMaxTime = 200;
            }
            int i = (int) ((apiCallMaxTime + 100) / 200);
            if (size / i > 0) {
                this.mNextTimeDispatchSize = (size + (i / 2)) / i;
            } else {
                this.mNextTimeDispatchSize = 1;
            }
        } else {
            this.mNextTimeDispatchSize = 1;
        }
    }

    public void release() {
        this.mState = 4;
        if (getLooper() != null) {
            if (this.mSelfThreadHandler != null) {
                this.mSelfThreadHandler.removeCallbacksAndMessages(null);
            }
            if (this.mMainThreadHandler != null) {
                this.mMainThreadHandler.removeCallbacksAndMessages(null);
            }
            quit();
        }
        if (this.mMessageClient != null) {
            this.mMessageClient.disconnectFromWebSocket();
            this.mMessageClient.setCallback(null);
        }
        this.mMonitorMessageIds.clear();
        this.mMessageQueue.clear();
        this.mInterceptListeners.clear();
        this.mInterceptors.clear();
        this.mMessageListenerMap.clear();
    }

    private void fetchMessage() {
        if (this.mMessageClient != null && !this.isFetching) {
            HashMap hashMap = new HashMap();
            hashMap.put("cursor", this.mCursor);
            hashMap.put("user_id", String.valueOf(this.mMessageClient.getUserId()));
            if (this.mIsAnchor) {
                if (this.mApiCallTimeStamp > 0) {
                    hashMap.put("fetch_time", String.valueOf(this.mApiCallTimeStamp));
                }
                if (this.mMonitorMessageIds.size() > 0) {
                    int size = this.mMonitorMessageIds.size();
                    StringBuilder sb = new StringBuilder(size * 20);
                    sb.append(this.mMonitorMessageIds.get(0));
                    for (int i = 1; i < size; i++) {
                        sb.append(",");
                        sb.append(this.mMonitorMessageIds.get(i));
                    }
                    hashMap.put("ack_ids", sb.toString());
                    this.mMonitorMessageIds.clear();
                }
            }
            this.mApiCallStartTime = System.currentTimeMillis();
            this.isFetching = true;
            this.mMessageClient.apiCall(hashMap);
        }
    }

    public void addInterceptor(IInterceptor iInterceptor) {
        this.mInterceptors.add(iInterceptor);
    }

    public void addOnInterceptListener(OnInterceptListener onInterceptListener) {
        this.mInterceptListeners.add(onInterceptListener);
    }

    public void insertMessage(IMessage iMessage) {
        insertMessage(iMessage, false);
    }

    public void removeInterceptor(IInterceptor iInterceptor) {
        this.mInterceptors.remove(iInterceptor);
    }

    public void removeOnInterceptListener(OnInterceptListener onInterceptListener) {
        this.mInterceptListeners.remove(onInterceptListener);
    }

    public void stopMessage(boolean z) {
        int i;
        if (z) {
            this.deduplicateInterceptor.clear();
        }
        if (getLooper() != null && this.mSelfThreadHandler != null) {
            Handler handler = this.mSelfThreadHandler;
            if (z) {
                i = 104;
            } else {
                i = 102;
            }
            handler.sendEmptyMessage(i);
        }
    }

    private void dispatchMessage(IMessage iMessage) {
        Set<OnMessageListener> set = (Set) this.mMessageListenerMap.get(iMessage.getIntType());
        if (set != null && !set.isEmpty()) {
            for (OnMessageListener onMessage : set) {
                onMessage.onMessage(iMessage);
            }
        }
    }

    private void enqueueMessage(IMessage iMessage) {
        if (this.mEnablePriority) {
            int size = this.mMessageQueue.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (iMessage.getPriority() >= ((IMessage) this.mMessageQueue.get(i)).getPriority()) {
                    this.mMessageQueue.add(i, iMessage);
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.mMessageQueue.add(iMessage);
            }
            return;
        }
        this.mMessageQueue.add(iMessage);
    }

    private void onMessage(IMessage iMessage) {
        for (IInterceptor onMessage : this.mInterceptors) {
            if (onMessage.onMessage(iMessage)) {
                for (OnInterceptListener onIntercept : this.mInterceptListeners) {
                    onIntercept.onIntercept(iMessage);
                }
                return;
            }
        }
        dispatchMessage(iMessage);
    }

    private void scheduleNextDispatch(boolean z) {
        if (this.mState == 2 && this.mMainThreadHandler != null && !this.mMainThreadHandler.hasMessages(205)) {
            if (!this.mEnableSmoothlyDispatch || !z) {
                this.mMainThreadHandler.sendEmptyMessage(205);
            } else {
                this.mMainThreadHandler.sendEmptyMessageDelayed(205, 200);
            }
        }
    }

    public void removeMessageListener(OnMessageListener onMessageListener) {
        if (onMessageListener != null) {
            int size = this.mMessageListenerMap.size();
            for (int i = 0; i < size; i++) {
                Set set = (Set) this.mMessageListenerMap.valueAt(i);
                if (set != null) {
                    set.remove(onMessageListener);
                }
            }
        }
    }

    public void handleSelfThreadMessage(Message message) {
        switch (message.what) {
            case BaseNotice.HASHTAG /*101*/:
                if (this.mState != 2) {
                    if (this.mMessageClient != null) {
                        this.mMessageClient.connectToWebSocket();
                    }
                    this.mState = 2;
                    fetchMessage();
                    return;
                }
                break;
            case 102:
            case 104:
                if (message.what == 104) {
                    this.mCursor = "0";
                }
                this.mSelfThreadHandler.removeCallbacksAndMessages(null);
                this.mMainThreadHandler.removeCallbacksAndMessages(null);
                if (this.mState == 2 && this.mMessageClient != null) {
                    this.mMessageClient.disconnectFromWebSocket();
                }
                this.mState = 3;
                return;
            case 103:
                if (this.mState == 2) {
                    fetchMessage();
                    break;
                }
                break;
        }
    }

    MessageManager(Configuration configuration) {
        super("LiveMessageManager");
        boolean z = false;
        this.mApiCallDelayTimeListIndex = 0;
        this.mNextTimeDispatchSize = 1;
        this.mApiCallTimeStamp = 0;
        this.mCursor = "0";
        this.mMessageClientCallback = new Callback() {
            public void onApiError(Exception exc) {
                long j;
                MessageManager.this.isFetching = false;
                if (MessageManager.this.mState == 2 && MessageManager.this.mSelfThreadHandler != null) {
                    MessageManager.this.mFetchFailedCount++;
                    if (MessageManager.this.mFetchFailedCount > 3) {
                        j = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
                    } else {
                        j = (long) (MessageManager.this.mFetchFailedCount * 1000);
                    }
                    MessageManager.this.mSelfThreadHandler.sendEmptyMessageDelayed(103, j);
                }
            }

            public void onApiSuccess(ProtoApiResult protoApiResult) {
                MessageManager.this.isFetching = false;
                MessageManager.this.mFetchFailedCount = 0;
                if (MessageManager.this.mState == 2 && MessageManager.this.mMainThreadHandler != null) {
                    MessageManager.this.mCursor = protoApiResult.cursor;
                    MessageManager.this.mFetchInterval = protoApiResult.fetchInterval;
                    MessageManager.this.mApiCallTimeStamp = protoApiResult.now;
                    if (protoApiResult.messages != null) {
                        protoApiResult.messages.size();
                    }
                    dispatchMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                }
            }

            public void onWebSocketMessage(IMessage iMessage) {
                if (MessageManager.this.mState == 2 && iMessage != null && MessageManager.this.mMainThreadHandler != null) {
                    if (MessageManager.this.mIsAnchor && iMessage.needMonitor()) {
                        MessageManager.this.mMainThreadHandler.obtainMessage(204, Long.valueOf(iMessage.getMessageId())).sendToTarget();
                    }
                    MessageManager.this.mMainThreadHandler.obtainMessage(202, iMessage).sendToTarget();
                }
            }

            public void onApiSuccess(JsonApiResult jsonApiResult) {
                MessageManager.this.isFetching = false;
                MessageManager.this.mFetchFailedCount = 0;
                if (MessageManager.this.mState == 2 && MessageManager.this.mMainThreadHandler != null) {
                    JSONObject jSONObject = jsonApiResult.extra;
                    MessageManager.this.mCursor = jSONObject.optString("cursor");
                    MessageManager.this.mFetchInterval = jSONObject.optLong("fetch_interval");
                    MessageManager.this.mApiCallTimeStamp = jSONObject.optLong("now");
                    JSONArray jSONArray = jsonApiResult.data;
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            JSONObject optJSONObject = jSONObject2.optJSONObject("common");
                            if (optJSONObject != null) {
                                IMessage convert = MessageManager.this.mMessageConverter.convert(optJSONObject.optString("method"), jSONObject2.toString(), MessageManager.this.mApiCallTimeStamp);
                                if (convert != null) {
                                    arrayList.add(convert);
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    dispatchMessage(arrayList, jsonApiResult.delayTimeBeforeDispatch);
                }
            }

            private void dispatchMessage(List<IMessage> list, long j) {
                long j2;
                if (list != null && !list.isEmpty()) {
                    if (MessageManager.this.mIsAnchor) {
                        ArrayList arrayList = new ArrayList();
                        for (IMessage iMessage : list) {
                            if (iMessage.needMonitor()) {
                                MessageManager.this.mMonitorMessageIds.add(Long.valueOf(iMessage.getMessageId()));
                            }
                        }
                        MessageManager.this.mMainThreadHandler.obtainMessage(203, arrayList).sendToTarget();
                    }
                    MessageManager.this.mMainThreadHandler.sendMessageDelayed(MessageManager.this.mMainThreadHandler.obtainMessage(201, list), j);
                }
                if (MessageManager.this.mSelfThreadHandler != null) {
                    if (MessageManager.this.mFetchInterval > 0) {
                        j2 = MessageManager.this.mFetchInterval;
                    } else {
                        j2 = 1000;
                    }
                    MessageManager.this.mSelfThreadHandler.sendEmptyMessageDelayed(103, j2);
                }
            }
        };
        this.mMainThreadHandler = new Handler(Looper.getMainLooper()) {
            public void handleMessage(Message message) {
                MessageManager.this.handleMainThreadMessage(message);
            }
        };
        this.mMessageConverter = configuration.getMessageConverter();
        this.mInterceptors.add(this.deduplicateInterceptor);
        this.mInterceptors.addAll(configuration.getInterceptors());
        this.mInterceptListeners.addAll(configuration.getInterceptListeners());
        this.mMessageClient = configuration.getHttpClient();
        if (this.mMessageClient != null) {
            this.mMessageClient.setCallback(this.mMessageClientCallback);
        }
        this.mEnableSmoothlyDispatch = configuration.isEnableSmoothlyDispatch();
        this.mEnablePriority = configuration.isEnablePriority();
        this.mIsAnchor = configuration.isAnchor();
        if (this.mEnableSmoothlyDispatch || this.mEnablePriority) {
            z = true;
        }
        this.mNeedEnqueueMessage = z;
    }

    public void handleMainThreadMessage(Message message) {
        switch (message.what) {
            case 201:
                if (this.mState == 2) {
                    List<IMessage> list = (List) message.obj;
                    if (!this.mNeedEnqueueMessage) {
                        for (IMessage onMessage : list) {
                            onMessage(onMessage);
                        }
                        return;
                    }
                    for (IMessage enqueueMessage : list) {
                        enqueueMessage(enqueueMessage);
                    }
                    long currentTimeMillis = System.currentTimeMillis() - this.mApiCallStartTime;
                    if (currentTimeMillis > 0) {
                        this.mApiCallDelayTimeList[this.mApiCallDelayTimeListIndex] = currentTimeMillis;
                        this.mApiCallDelayTimeListIndex++;
                        if (this.mApiCallDelayTimeListIndex > 4) {
                            this.mApiCallDelayTimeListIndex = 0;
                        }
                    }
                    calculateNextTimeDispatchCount();
                    scheduleNextDispatch(false);
                    return;
                }
                break;
            case 202:
                if (this.mState == 2) {
                    IMessage iMessage = (IMessage) message.obj;
                    if (!this.mNeedEnqueueMessage) {
                        onMessage(iMessage);
                        return;
                    }
                    enqueueMessage(iMessage);
                    scheduleNextDispatch(false);
                    return;
                }
                break;
            case 203:
                this.mMonitorMessageIds.addAll((List) message.obj);
                return;
            case 204:
                this.mMonitorMessageIds.add((Long) message.obj);
                return;
            case 205:
                if (this.mState == 2) {
                    int size = this.mMessageQueue.size();
                    if (this.mEnableSmoothlyDispatch && size > this.mNextTimeDispatchSize) {
                        size = this.mNextTimeDispatchSize;
                    }
                    List subList = this.mMessageQueue.subList(0, size);
                    for (IMessage iMessage2 : this.mMessageQueue) {
                        if (iMessage2 != null) {
                            onMessage(iMessage2);
                        }
                    }
                    subList.clear();
                    if (this.mMessageQueue.size() > 0) {
                        scheduleNextDispatch(true);
                        break;
                    }
                }
                break;
        }
    }

    public void insertMessage(IMessage iMessage, boolean z) {
        if (iMessage != null) {
            if (z) {
                dispatchMessage(iMessage);
            } else {
                onMessage(iMessage);
            }
        }
    }

    public void addMessageListener(int i, OnMessageListener onMessageListener) {
        if (onMessageListener != null) {
            Set set = (Set) this.mMessageListenerMap.get(i);
            if (set == null) {
                set = new CopyOnWriteArraySet();
                this.mMessageListenerMap.put(i, set);
            }
            set.add(onMessageListener);
        }
    }

    public void removeMessageListener(int i, OnMessageListener onMessageListener) {
        if (onMessageListener != null) {
            Set set = (Set) this.mMessageListenerMap.get(i);
            if (set != null && !set.isEmpty()) {
                set.remove(onMessageListener);
            }
        }
    }
}
