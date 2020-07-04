package com.p280ss.android.ugc.aweme.p313im.sdk.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.StrangerMessage */
public class StrangerMessage {
    @C6593c(mo15949a = "client_msg_id")
    long clientMsgId;
    @C6593c(mo15949a = "content")
    String content;
    @C6593c(mo15949a = "create_time")
    long createTime;
    @C6593c(mo15949a = "device_id")
    long deviceId;
    @C6593c(mo15949a = "ext")
    String ext;
    @C6593c(mo15949a = "from_user")
    IMUser fromUser;
    @C6593c(mo15949a = "msg_type")
    int msgType;
    @C6593c(mo15949a = "to_user")
    IMUser toUser;

    public long getClientMsgId() {
        return this.clientMsgId;
    }

    public String getContent() {
        return this.content;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDeviceId() {
        return this.deviceId;
    }

    public String getExt() {
        return this.ext;
    }

    public IMUser getFromUser() {
        return this.fromUser;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public IMUser getToUser() {
        return this.toUser;
    }

    public boolean isRecalled() {
        if (!TextUtils.isEmpty(this.ext)) {
            try {
                if (TextUtils.equals("true", (CharSequence) ((HashMap) C31913m.m103667a(this.ext, HashMap.class)).get("s:is_recalled"))) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void setClientMsgId(long j) {
        this.clientMsgId = j;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDeviceId(long j) {
        this.deviceId = j;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setFromUser(IMUser iMUser) {
        this.fromUser = iMUser;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setToUser(IMUser iMUser) {
        this.toUser = iMUser;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        if (android.text.TextUtils.isEmpty(r0.getUuid()) != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        if (android.text.TextUtils.isEmpty(r0.getUuid()) == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        r0.setUuid(java.util.UUID.randomUUID().toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        r0.addExt("old_client_message_id", java.lang.String.valueOf(r5.clientMsgId));
        r5 = r5.getFromUser();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        if (r5 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a2, code lost:
        r1 = r5.getUid();
        r0.setSecSender(r5.getSecUid());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ad, code lost:
        if (r1 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1 = java.lang.Long.parseLong(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        r0.setSender(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b9, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.p263im.core.model.Message toChatMessage(com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerMessage r5) {
        /*
            com.bytedance.im.core.model.Message r0 = new com.bytedance.im.core.model.Message
            r0.<init>()
            java.lang.String r1 = r5.getContent()
            r0.setContent(r1)
            int r1 = r5.getMsgType()
            r0.setMsgType(r1)
            r1 = 5
            r0.setMsgStatus(r1)
            int r1 = com.bytedance.p263im.core.p584a.C11202d.C11203a.f30380a
            r0.setConversationType(r1)
            if (r5 != 0) goto L_0x001f
            return r0
        L_0x001f:
            long r1 = r5.getCreateTime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r0.setCreatedAt(r1)
            long r1 = r5.clientMsgId
            r0.setMsgId(r1)
            java.lang.String r1 = r5.getExt()     // Catch:{ Exception -> 0x007a, all -> 0x0063 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x007a, all -> 0x0063 }
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = r5.getExt()     // Catch:{ Exception -> 0x007a, all -> 0x0063 }
            java.lang.Class<java.util.HashMap> r2 = java.util.HashMap.class
            java.lang.Object r1 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m.m103667a(r1, r2)     // Catch:{ Exception -> 0x007a, all -> 0x0063 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x007a, all -> 0x0063 }
            if (r1 != 0) goto L_0x004a
            java.lang.String r2 = ""
            goto L_0x0052
        L_0x004a:
            java.lang.String r2 = "s:client_message_id"
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Exception -> 0x007a, all -> 0x0063 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x007a, all -> 0x0063 }
        L_0x0052:
            r0.setUuid(r2)     // Catch:{ Exception -> 0x007a, all -> 0x0063 }
            r0.setExt(r1)     // Catch:{ Exception -> 0x007a, all -> 0x0063 }
        L_0x0058:
            java.lang.String r1 = r0.getUuid()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0090
            goto L_0x0085
        L_0x0063:
            r5 = move-exception
            java.lang.String r1 = r0.getUuid()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0079
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.setUuid(r1)
        L_0x0079:
            throw r5
        L_0x007a:
            java.lang.String r1 = r0.getUuid()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0090
        L_0x0085:
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.setUuid(r1)
        L_0x0090:
            java.lang.String r1 = "old_client_message_id"
            long r2 = r5.clientMsgId
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.addExt(r1, r2)
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = r5.getFromUser()
            if (r5 != 0) goto L_0x00a2
            return r0
        L_0x00a2:
            java.lang.String r1 = r5.getUid()
            java.lang.String r5 = r5.getSecUid()
            r0.setSecSender(r5)
            if (r1 != 0) goto L_0x00b2
            r1 = 0
            goto L_0x00b6
        L_0x00b2:
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x00b9 }
        L_0x00b6:
            r0.setSender(r1)     // Catch:{ Exception -> 0x00b9 }
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerMessage.toChatMessage(com.ss.android.ugc.aweme.im.sdk.model.StrangerMessage):com.bytedance.im.core.model.Message");
    }
}
