package com.bytedance.apm.agent.instrumentation.transaction;

import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import com.bytedance.apm.util.C6296u;
import org.json.JSONException;
import org.json.JSONObject;

public final class TransactionState {
    private static final AgentLog LOG = AgentLogManager.getAgentLog();
    private long bytesReceived;
    private long bytesSent;
    private String carrier = "unknown";
    private long endTime;
    private int errorCode;
    private JSONObject extraData = new JSONObject();
    private String httpMethod;
    private String rawUrl;
    private long startTime;
    private State state = State.READY;
    private int statusCode;
    private TransactionData transactionData;
    private String url;
    private String wanType = "unknown";

    enum State {
        READY,
        SENT,
        COMPLETE
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final long getReceivedBytes() {
        return this.bytesReceived;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isComplete() {
        if (this.state.ordinal() >= State.COMPLETE.ordinal()) {
            return true;
        }
        return false;
    }

    public final boolean isSent() {
        if (this.state.ordinal() >= State.SENT.ordinal()) {
            return true;
        }
        return false;
    }

    public final TransactionData end() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.startTime);
        addAssistData("startTime", sb.toString());
        if (!isComplete()) {
            this.state = State.COMPLETE;
            this.endTime = System.currentTimeMillis();
        }
        return toTransactionData();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" StartTime ");
        sb.append(String.valueOf(this.startTime));
        sb.append(" BytesReceived ");
        sb.append(String.valueOf(this.bytesReceived));
        sb.append(" BytesSent ");
        sb.append(String.valueOf(this.bytesSent));
        sb.append(" Url ");
        sb.append(this.url);
        return sb.toString();
    }

    private TransactionData toTransactionData() {
        if (!isComplete()) {
            LOG.warning("toTransactionData() called on incomplete TransactionState");
        }
        if (this.url == null) {
            LOG.error("Attempted to convert TransactionData TransactionState instance with no URL into TransactionData TransactionData");
            return null;
        }
        if (this.transactionData == null) {
            TransactionData transactionData2 = new TransactionData(this.url, this.carrier, this.endTime - this.startTime, this.statusCode, this.errorCode, this.bytesSent, this.bytesReceived, this.wanType, this.httpMethod, this.extraData);
            this.transactionData = transactionData2;
            this.transactionData.setRequestEnd(this.endTime);
            this.transactionData.setErrorCode(this.errorCode);
        }
        return this.transactionData;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setBytesReceived(long j) {
        if (!isComplete()) {
            this.bytesReceived = j;
            return;
        }
        AgentLog agentLog = LOG;
        StringBuilder sb = new StringBuilder("setBytesReceived(...) called on TransactionState in ");
        sb.append(this.state.toString());
        sb.append(" state");
        agentLog.warning(sb.toString());
    }

    public final void setBytesSent(long j) {
        if (!isComplete()) {
            this.bytesSent = j;
            this.state = State.SENT;
            return;
        }
        AgentLog agentLog = LOG;
        StringBuilder sb = new StringBuilder("setBytesSent(...) called on TransactionState in ");
        sb.append(this.state.toString());
        sb.append(" state");
        agentLog.warning(sb.toString());
    }

    public final void setCarrier(String str) {
        if (!isSent()) {
            this.carrier = str;
            return;
        }
        AgentLog agentLog = LOG;
        StringBuilder sb = new StringBuilder("setCarrier(...) called on TransactionState in ");
        sb.append(this.state.toString());
        sb.append(" state");
        agentLog.warning(sb.toString());
    }

    public final void setErrorCode(int i) {
        if (!isComplete()) {
            this.errorCode = i;
            return;
        }
        if (this.transactionData != null) {
            this.transactionData.setErrorCode(i);
        }
        AgentLog agentLog = LOG;
        StringBuilder sb = new StringBuilder("setErrorCode(...) called on TransactionState in ");
        sb.append(this.state.toString());
        sb.append(" state");
        agentLog.warning(sb.toString());
    }

    public final void setMethod(String str) {
        if (!isSent()) {
            this.httpMethod = str;
            return;
        }
        AgentLog agentLog = LOG;
        StringBuilder sb = new StringBuilder("setHttpMethod(...) called on TransactionState in ");
        sb.append(this.state.toString());
        sb.append(" state");
        agentLog.warning(sb.toString());
    }

    public final void setStatusCode(int i) {
        if (!isComplete()) {
            this.statusCode = i;
            return;
        }
        if (this.statusCode == 0 && i != 0) {
            this.statusCode = i;
        }
        AgentLog agentLog = LOG;
        StringBuilder sb = new StringBuilder("setStatusCode(...) called on TransactionState in ");
        sb.append(this.state.toString());
        sb.append(" state");
        agentLog.warning(sb.toString());
    }

    public final void setUrl(String str) {
        if (this.rawUrl == null) {
            this.rawUrl = str;
        }
        String a = C6296u.m19534a(str);
        if (a != null) {
            if (!isSent()) {
                this.url = a;
                return;
            }
            AgentLog agentLog = LOG;
            StringBuilder sb = new StringBuilder("setUrl(...) called on TransactionState in ");
            sb.append(this.state.toString());
            sb.append(" state");
            agentLog.warning(sb.toString());
        }
    }

    public final void setWanType(String str) {
        if (!isSent()) {
            this.wanType = str;
            return;
        }
        AgentLog agentLog = LOG;
        StringBuilder sb = new StringBuilder("setWanType(...) called on TransactionState in ");
        sb.append(this.state.toString());
        sb.append(" state");
        agentLog.warning(sb.toString());
    }

    public final void addAssistData(String str, String str2) {
        if (isComplete()) {
            AgentLog agentLog = LOG;
            StringBuilder sb = new StringBuilder("addAssistData(...) called on TransactionState in ");
            sb.append(this.state.toString());
            sb.append(" state");
            agentLog.warning(sb.toString());
        }
        try {
            this.extraData.put(str, str2);
        } catch (JSONException e) {
            LOG.error("Caught error while addAssistData: ", e);
        }
    }
}
