package com.bytedance.apm.impl;

import com.bytedance.apm.core.C6178c;
import com.bytedance.apm.p249l.C6269c;
import com.bytedance.services.slardar.config.C6480a;
import com.bytedance.services.slardar.config.C6481b;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.List;
import org.json.JSONObject;

public class SlardarConfigManagerImpl implements IConfigManager {
    private C6217b mSlardarConfigFetcher = new C6217b();

    public void fetchConfig() {
        this.mSlardarConfigFetcher.mo14971a();
    }

    public boolean isConfigReady() {
        return this.mSlardarConfigFetcher.f18306a;
    }

    public String queryConfig() {
        return this.mSlardarConfigFetcher.mo14975b();
    }

    public JSONObject getConfigJSON(String str) {
        return this.mSlardarConfigFetcher.mo14981e(str);
    }

    public boolean getLogTypeSwitch(String str) {
        return this.mSlardarConfigFetcher.mo14974a(str);
    }

    public boolean getMetricTypeSwitch(String str) {
        return this.mSlardarConfigFetcher.mo14978b(str);
    }

    public boolean getServiceSwitch(String str) {
        return this.mSlardarConfigFetcher.mo14979c(str);
    }

    public boolean getSwitch(String str) {
        return this.mSlardarConfigFetcher.mo14980d(str);
    }

    public void registerConfigListener(C6480a aVar) {
        this.mSlardarConfigFetcher.mo14973a(aVar);
    }

    public void registerResponseConfigListener(C6481b bVar) {
        C6269c.m19445a().mo15058a(bVar);
    }

    public void unregisterConfigListener(C6480a aVar) {
        this.mSlardarConfigFetcher.mo14977b(aVar);
    }

    public void unregisterResponseConfigListener(C6481b bVar) {
        C6269c.m19445a().mo15062b(bVar);
    }

    public void forceUpdateFromRemote(C6178c cVar, List<String> list) {
        this.mSlardarConfigFetcher.mo14976b(cVar, list);
    }

    public int getConfigInt(String str, int i) {
        return this.mSlardarConfigFetcher.mo14970a(str, i);
    }

    public void initParams(C6178c cVar, List<String> list) {
        this.mSlardarConfigFetcher.mo14972a(cVar, list);
    }
}
