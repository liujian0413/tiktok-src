package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.net.urlconnection.MessageLoop;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

public class DnsQuery {
    private String mHostName;
    private MessageLoop mMessageLoop = new MessageLoop();
    private String[] mQueryResult;
    private int mStatus;

    public String getHostName() {
        return this.mHostName;
    }

    public void done() {
        this.mMessageLoop.quit();
    }

    public void waitResult() throws IOException {
        this.mMessageLoop.loop();
    }

    public List<InetAddress> getResult() throws IOException {
        if (this.mStatus != 0 || this.mQueryResult == null || this.mQueryResult.length == 0) {
            throw new UnknownHostException(this.mHostName);
        }
        ArrayList arrayList = new ArrayList();
        for (String byName : this.mQueryResult) {
            byte[] address = InetAddress.getByName(byName).getAddress();
            if (address != null) {
                arrayList.add(InetAddress.getByAddress(this.mHostName, address));
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new UnknownHostException(this.mHostName);
    }

    public DnsQuery(String str) {
        this.mHostName = str;
    }

    public void resume(Runnable runnable) {
        try {
            this.mMessageLoop.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.m146394e("DnsQuery", "Exception DnsQuery resume ", e);
        }
    }

    public void setResult(int i, String[] strArr) {
        this.mStatus = i;
        this.mQueryResult = strArr;
    }
}
