package com.bytedance.apm.agent.instrumentation.okhttp3;

import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

public class InterceptorImpl implements Interceptor {

    class ResponseBodyWrapper extends ResponseBody {
        private BufferedSource bufferedSource;
        private final Response response;
        private final ResponseBody responseBody;
        public long totalBytesRead;
        private final TransactionState transactionState;

        public long contentLength() {
            return this.responseBody.contentLength();
        }

        public MediaType contentType() {
            return this.responseBody.contentType();
        }

        public void close() {
            this.responseBody.close();
            end();
        }

        public void end() {
            if (!this.transactionState.isComplete()) {
                this.transactionState.setBytesReceived(this.totalBytesRead);
                MonitorRecorder.reportMonitorData(this.transactionState, this.response);
            }
        }

        public BufferedSource source() {
            if (this.bufferedSource == null) {
                this.bufferedSource = Okio.buffer(source(this.responseBody.source()));
            }
            return this.bufferedSource;
        }

        private Source source(Source source) {
            return new ForwardingSource(source) {
                public void close() throws IOException {
                    super.close();
                    ResponseBodyWrapper.this.end();
                }

                public long read(Buffer buffer, long j) throws IOException {
                    long read = super.read(buffer, j);
                    if (read >= 0) {
                        ResponseBodyWrapper.this.totalBytesRead += read;
                    }
                    return read;
                }
            };
        }

        public ResponseBodyWrapper(Response response2, TransactionState transactionState2) {
            this.response = response2;
            this.responseBody = response2.body;
            this.transactionState = transactionState2;
        }
    }

    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        String header = request.header("User-Agent");
        if (header != null && header.contains("tt")) {
            return chain.proceed(request);
        }
        TransactionState transactionState = new TransactionState();
        MonitorRecorder.recordRequest(request, transactionState);
        try {
            Response proceed = chain.proceed(request);
            MonitorRecorder.recordResponse(proceed, transactionState);
            if (transactionState.getReceivedBytes() >= 0 || TextUtils.isEmpty(proceed.header("Transfer-Encoding"))) {
                MonitorRecorder.reportMonitorData(transactionState, proceed);
                return proceed;
            }
            transactionState.addAssistData("Transfer-Encoding", proceed.header("Transfer-Encoding"));
            return proceed.newBuilder().body(new ResponseBodyWrapper(proceed, transactionState)).build();
        } catch (IOException e) {
            MonitorRecorder.reportExceptionMonitor(transactionState, e);
            throw e;
        }
    }
}
