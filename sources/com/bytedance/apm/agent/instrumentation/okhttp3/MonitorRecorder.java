package com.bytedance.apm.agent.instrumentation.okhttp3;

import com.bytedance.apm.C6174c;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionData;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import com.bytedance.apm.agent.monitor.MonitorTool;
import java.io.IOException;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

public class MonitorRecorder {
    public static void reportExceptionMonitor(TransactionState transactionState, Exception exc) {
    }

    public static void reportMonitorData(TransactionState transactionState, Response response) {
        if (transactionState != null && response != null) {
            reportMonitorData(transactionState, "okhttp");
        }
    }

    public static void recordResponse(Response response, TransactionState transactionState) {
        if (response != null && transactionState != null) {
            transactionState.setStatusCode(response.code);
            if (response.body != null) {
                transactionState.setBytesReceived(response.body.contentLength());
            }
        }
    }

    public static void recordRequest(Request request, TransactionState transactionState) {
        boolean z;
        if (request != null && transactionState != null) {
            transactionState.addAssistData("NetworkLib", "OkHttp3");
            transactionState.setUrl(request.url.toString());
            transactionState.setMethod(request.method);
            transactionState.setStartTime(System.currentTimeMillis());
            transactionState.setCarrier("");
            transactionState.setWanType("");
            RequestBody requestBody = request.body;
            if (requestBody != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (requestBody instanceof FormBody) {
                    transactionState.setBytesSent(((FormBody) requestBody).contentLength());
                } else if (requestBody instanceof MultipartBody) {
                    try {
                        transactionState.setBytesSent(requestBody.contentLength());
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    public static void reportMonitorData(TransactionState transactionState, String str) {
        long j;
        if (transactionState != null) {
            TransactionData end = transactionState.end();
            if (C6174c.m19149g()) {
                StringBuilder sb = new StringBuilder("auto plugin, reportMonitorData: ");
                sb.append(end.toString());
                String[] strArr = {sb.toString()};
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("net_consume_type", str);
                jSONObject.put("timing_totalSendBytes", end.getBytesSent());
                jSONObject.put("timing_totalReceivedBytes", end.getBytesReceived());
                jSONObject.put("instruct_error_code", end.getErrorCode());
                long totalTime = end.getTotalTime();
                if (transactionState.getStartTime() == 0) {
                    j = end.getRequestStart();
                } else {
                    j = transactionState.getStartTime();
                }
                MonitorTool.monitorSLA(totalTime, j, end.getUrl(), "", "", end.getStatusCode(), jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
