package com.p280ss.android.ugc.network.observer.bean;

import android.support.annotation.Keep;
import com.facebook.ads.AdError;
import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

@Keep
/* renamed from: com.ss.android.ugc.network.observer.bean.DetectorParam */
public final class DetectorParam {
    @C6593c(mo15949a = "black_timeout")
    public int blackTimeout = 300000;
    @C6593c(mo15949a = "dns_timeout")
    public int dnsTimeout = AdError.SERVER_ERROR_CODE;
    @C6593c(mo15949a = "frequency_limit")
    public int frequencyLimit = 4;
    @C6593c(mo15949a = "ping_timeout")
    public int pingTimeout = AdError.SERVER_ERROR_CODE;
    @C6593c(mo15949a = "start_timeout")
    public int startTimeout = 5000;
    @C6593c(mo15949a = "target_list")
    public String[] targetList = {"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"};
    @C6593c(mo15949a = "tcp_timeout")
    public int tcpTimeout = 3000;

    public final int getBlackTimeout() {
        return this.blackTimeout;
    }

    public final int getDnsTimeout() {
        return this.dnsTimeout;
    }

    public final int getFrequencyLimit() {
        return this.frequencyLimit;
    }

    public final int getPingTimeout() {
        return this.pingTimeout;
    }

    public final int getStartTimeout() {
        return this.startTimeout;
    }

    public final String[] getTargetList() {
        return this.targetList;
    }

    public final int getTcpTimeout() {
        return this.tcpTimeout;
    }

    public DetectorParam() {
    }

    public final void setBlackTimeout(int i) {
        this.blackTimeout = i;
    }

    public final void setDnsTimeout(int i) {
        this.dnsTimeout = i;
    }

    public final void setFrequencyLimit(int i) {
        this.frequencyLimit = i;
    }

    public final void setPingTimeout(int i) {
        this.pingTimeout = i;
    }

    public final void setStartTimeout(int i) {
        this.startTimeout = i;
    }

    public final void setTcpTimeout(int i) {
        this.tcpTimeout = i;
    }

    public final void setTargetList(String[] strArr) {
        C7573i.m23587b(strArr, "<set-?>");
        this.targetList = strArr;
    }

    public DetectorParam(String[] strArr) {
        C7573i.m23587b(strArr, "targetList");
        this.targetList = strArr;
    }
}
