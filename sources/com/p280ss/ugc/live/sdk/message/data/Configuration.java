package com.p280ss.ugc.live.sdk.message.data;

import com.p280ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageConverter;
import com.p280ss.ugc.live.sdk.message.interfaces.OnInterceptListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.ugc.live.sdk.message.data.Configuration */
public class Configuration {
    private boolean mEnablePriority;
    private boolean mEnableSmoothlyDispatch;
    private List<OnInterceptListener> mInterceptListeners = new ArrayList();
    private List<IInterceptor> mInterceptors = new ArrayList();
    private boolean mIsAnchor;
    private IMessageClient mMessageClient;
    private IMessageConverter mMessageConverter;

    public IMessageClient getHttpClient() {
        return this.mMessageClient;
    }

    public List<OnInterceptListener> getInterceptListeners() {
        return this.mInterceptListeners;
    }

    public List<IInterceptor> getInterceptors() {
        return this.mInterceptors;
    }

    public IMessageConverter getMessageConverter() {
        return this.mMessageConverter;
    }

    public boolean isAnchor() {
        return this.mIsAnchor;
    }

    public boolean isEnablePriority() {
        return this.mEnablePriority;
    }

    public boolean isEnableSmoothlyDispatch() {
        return this.mEnableSmoothlyDispatch;
    }

    public Configuration setAnchor(boolean z) {
        this.mIsAnchor = z;
        return this;
    }

    public Configuration setEnablePriority(boolean z) {
        this.mEnablePriority = z;
        return this;
    }

    public Configuration setEnableSmoothlyDispatch(boolean z) {
        this.mEnableSmoothlyDispatch = z;
        return this;
    }

    public Configuration setHttpClient(IMessageClient iMessageClient) {
        this.mMessageClient = iMessageClient;
        return this;
    }

    public Configuration setMessageConverter(IMessageConverter iMessageConverter) {
        this.mMessageConverter = iMessageConverter;
        return this;
    }

    public Configuration addInterceptor(IInterceptor iInterceptor) {
        if (iInterceptor == null) {
            return this;
        }
        this.mInterceptors.add(iInterceptor);
        return this;
    }

    public Configuration addOnInterceptListener(OnInterceptListener onInterceptListener) {
        if (onInterceptListener == null) {
            return this;
        }
        this.mInterceptListeners.add(onInterceptListener);
        return this;
    }
}
