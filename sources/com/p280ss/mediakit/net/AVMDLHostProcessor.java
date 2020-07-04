package com.p280ss.mediakit.net;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.mediakit.medialoader.AVMDLLog;
import java.util.HashMap;

/* renamed from: com.ss.mediakit.net.AVMDLHostProcessor */
public class AVMDLHostProcessor {
    private int mBackUpDelayedTime;
    private int mBackUpType;
    private Handler mHandler;
    public String mHost;
    public HashMap<AVMDLDNSParserListener, Integer> mListeners;
    private int mMainType;
    private BaseDNS[] mParsers = new BaseDNS[2];
    private int[] mStates = new int[2];

    public boolean isEnd() {
        for (int i = 0; i < 2; i++) {
            if (this.mParsers[i] != null && this.mStates[i] != 3 && this.mStates[i] != 2) {
                return false;
            }
        }
        AVMDLLog.m143965d("AVMDLHostProcessor", "all dns parse is end");
        return true;
    }

    public boolean isValidSourceId(String str) {
        if (TextUtils.isEmpty(str)) {
            AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("id: %s is empty", new Object[]{str}));
            return false;
        }
        int i = 0;
        while (i < 2) {
            if (this.mParsers[i] == null || !str.equals(this.mParsers[i].mId)) {
                i++;
            } else {
                AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("id: %s is valid index: %d", new Object[]{str, Integer.valueOf(i)}));
                return true;
            }
        }
        AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("id: %s is valid", new Object[]{str}));
        return false;
    }

    private void doParseInternal(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("----do parse internal what:%d info:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo}));
        if (aVMDLDNSInfo != null) {
            if (i == 0 && this.mParsers[0] == null) {
                AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("create main dns type:%d host:%s", new Object[]{Integer.valueOf(this.mMainType), aVMDLDNSInfo.mHost}));
                this.mStates[0] = 1;
                this.mParsers[0] = createDNSParser(aVMDLDNSInfo.mHost, this.mMainType, 0);
                this.mParsers[0].start();
                Message message = new Message();
                message.what = 1;
                message.obj = aVMDLDNSInfo;
                if (this.mBackUpDelayedTime > 0) {
                    AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("BackUpDelayedTime:%d send backup delay first", new Object[]{Integer.valueOf(this.mMainType)}));
                    this.mHandler.sendMessageDelayed(message, (long) (this.mBackUpDelayedTime * 1000));
                }
            } else if (i == 1 && this.mParsers[1] == null) {
                AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("create backup dns type:%d host:%s", new Object[]{Integer.valueOf(this.mMainType), aVMDLDNSInfo.mHost}));
                this.mStates[1] = 1;
                this.mParsers[1] = createDNSParser(aVMDLDNSInfo.mHost, this.mBackUpType, 1);
                this.mParsers[1].start();
            }
            AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("****do parse internal end", new Object[0]));
        }
    }

    public void processMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("----processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost, aVMDLDNSInfo}));
        switch (i) {
            case 0:
                if (this.mStates[0] == 0) {
                    AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("main dns is idle call main dns", new Object[0]));
                    doParseInternal(i, aVMDLDNSInfo);
                    break;
                }
                break;
            case 1:
                if ((this.mStates[0] == 1 || this.mStates[0] == 2 || this.mStates[0] == 3) && this.mStates[1] == 0) {
                    AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("main dns is not end and backup dns is idle call backup dns", new Object[0]));
                    doParseInternal(i, aVMDLDNSInfo);
                    break;
                }
        }
        AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("****end processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost, aVMDLDNSInfo}));
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void processResult(int r19, com.p280ss.mediakit.net.AVMDLDNSInfo r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "AVMDLHostProcessor"
            java.lang.String r4 = "----process result what:%d id:%s host:%s"
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r19)
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = r2.mId
            r9 = 1
            r6[r9] = r7
            java.lang.String r7 = r2.mHost
            r10 = 2
            r6[r10] = r7
            java.lang.String r4 = com.C1642a.m8034a(r4, r6)
            com.p280ss.mediakit.medialoader.AVMDLLog.m143965d(r3, r4)
            r3 = 0
            switch(r1) {
                case 2: goto L_0x002a;
                case 3: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x002f
        L_0x002a:
            if (r2 == 0) goto L_0x002f
            java.lang.String r4 = r2.mId
            goto L_0x0030
        L_0x002f:
            r4 = r3
        L_0x0030:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x0044
            java.lang.String r1 = "AVMDLHostProcessor"
            java.lang.String r2 = "****process result err id is empty"
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r2 = com.C1642a.m8034a(r2, r3)
            com.p280ss.mediakit.medialoader.AVMDLLog.m143965d(r1, r2)
            return
        L_0x0044:
            r6 = 0
        L_0x0045:
            if (r6 >= r10) goto L_0x0088
            com.ss.mediakit.net.BaseDNS[] r7 = r0.mParsers
            r7 = r7[r6]
            if (r7 == 0) goto L_0x0085
            com.ss.mediakit.net.BaseDNS[] r7 = r0.mParsers
            r7 = r7[r6]
            java.lang.String r7 = r7.mId
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x0085
            com.ss.mediakit.net.BaseDNS[] r4 = r0.mParsers
            r4 = r4[r6]
            r4.close()
            com.ss.mediakit.net.BaseDNS[] r4 = r0.mParsers
            r4[r6] = r3
            if (r1 != r5) goto L_0x006b
            int[] r3 = r0.mStates
            r3[r6] = r5
            goto L_0x0071
        L_0x006b:
            if (r1 != r10) goto L_0x0071
            int[] r3 = r0.mStates
            r3[r6] = r10
        L_0x0071:
            java.lang.String r3 = "AVMDLHostProcessor"
            java.lang.String r4 = "****process result parser index:%d is end, be close"
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r7[r8] = r11
            java.lang.String r4 = com.C1642a.m8034a(r4, r7)
            com.p280ss.mediakit.medialoader.AVMDLLog.m143965d(r3, r4)
            goto L_0x0088
        L_0x0085:
            int r6 = r6 + 1
            goto L_0x0045
        L_0x0088:
            if (r6 != 0) goto L_0x00ab
            if (r1 != r10) goto L_0x00ab
            java.lang.String r3 = "AVMDLHostProcessor"
            java.lang.String r4 = "mian dns parse error, try back up dns"
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.String r4 = com.C1642a.m8034a(r4, r6)
            com.p280ss.mediakit.medialoader.AVMDLLog.m143965d(r3, r4)
            com.ss.mediakit.net.AVMDLDNSInfo r3 = new com.ss.mediakit.net.AVMDLDNSInfo
            int r12 = com.p280ss.mediakit.net.AVMDLDNSParser.mGlobalBackType
            java.lang.String r13 = r2.mHost
            r14 = 0
            r15 = 0
            r17 = 0
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r17)
            r0.processMsg(r9, r3)
        L_0x00ab:
            java.lang.String r3 = "AVMDLHostProcessor"
            java.lang.String r4 = "****end process result what:%d id:%s host:%s"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r5[r8] = r1
            java.lang.String r1 = r2.mId
            r5[r9] = r1
            java.lang.String r1 = r2.mHost
            r5[r10] = r1
            java.lang.String r1 = com.C1642a.m8034a(r4, r5)
            com.p280ss.mediakit.medialoader.AVMDLLog.m143965d(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.mediakit.net.AVMDLHostProcessor.processResult(int, com.ss.mediakit.net.AVMDLDNSInfo):void");
    }

    private BaseDNS createDNSParser(String str, int i, int i2) {
        switch (i) {
            case 1:
            case 2:
            case 3:
                AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("create http dns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i)}));
                return new HTTPDNS(str, null, i, this.mHandler);
            default:
                AVMDLLog.m143965d("AVMDLHostProcessor", C1642a.m8034a("create local dns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i)}));
                return new LocalDNS(str, this.mHandler);
        }
    }

    public AVMDLHostProcessor(String str, Handler handler, int i, int i2, int i3) {
        this.mMainType = i;
        this.mBackUpType = i2;
        this.mHandler = handler;
        this.mHost = str;
        this.mBackUpDelayedTime = i3;
        for (int i4 = 0; i4 < 2; i4++) {
            this.mParsers[i4] = null;
        }
        for (int i5 = 0; i5 < 2; i5++) {
            this.mStates[i5] = 0;
        }
        this.mListeners = new HashMap<>();
    }
}
