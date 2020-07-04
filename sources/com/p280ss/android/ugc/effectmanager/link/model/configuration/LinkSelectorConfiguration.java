package com.p280ss.android.ugc.effectmanager.link.model.configuration;

import android.content.Context;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.link.model.configuration.LinkSelectorConfiguration */
public class LinkSelectorConfiguration {
    public Context mContext;
    public boolean mEnableLinkSelector;
    public boolean mIsLazy;
    public boolean mIsNetworkChangeMonitor = true;
    public List<Host> mOriginHosts;
    public int mRepeatTime = 2;
    public String mSpeedApi = "/ies/speed/";
    public int mSpeedTimeOut = AdError.SERVER_ERROR_CODE;

    public void setContext(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void setLazy(boolean z) {
        this.mEnableLinkSelector = true;
        this.mIsLazy = z;
    }

    public void setNetworkChangeMonitor(boolean z) {
        this.mEnableLinkSelector = true;
        this.mIsNetworkChangeMonitor = z;
    }

    public void setRepeatTime(int i) {
        this.mEnableLinkSelector = true;
        this.mRepeatTime = i;
    }

    public void setSpeedApi(String str) {
        this.mEnableLinkSelector = true;
        this.mSpeedApi = str;
    }

    public void setSpeedTimeOut(int i) {
        this.mEnableLinkSelector = true;
        this.mSpeedTimeOut = i;
    }

    public void setOriginHosts(List<Host> list) {
        boolean z = true;
        if (list.size() <= 1) {
            z = false;
        }
        this.mEnableLinkSelector = z;
        this.mOriginHosts = list;
    }
}
