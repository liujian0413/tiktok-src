package com.bytedance.p263im.core.internal.p587a.p588a;

import android.util.Pair;
import com.bytedance.p263im.core.internal.p587a.C11211a;
import com.bytedance.p263im.core.internal.p589b.C11314a;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.utils.C11405e;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.MessageBody;
import com.bytedance.p263im.core.proto.NewMessageNotify;
import com.bytedance.p263im.core.proto.NewMessageNotifyType;
import com.bytedance.p263im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.a.y */
final class C11308y extends C11240b {
    C11308y() {
        super(IMCMD.NEW_MSG_NOTIFY.getValue());
    }

    /* renamed from: a */
    static void m33167a(String str) {
        C11368l.m33375a();
        Conversation a = C11368l.m33377a(str);
        if (a != null && a.hasMore()) {
            a.setHasMore(false);
            C11368l.m33375a();
            if (C11368l.m33384b(a)) {
                C6417a.m20015a().mo15553f(a);
            }
        }
    }

    /* renamed from: a */
    private void m33164a(final int i, final NewMessageNotify newMessageNotify) {
        C11319e.m33192a(new C11318d<Pair<Pair<Message, Boolean>, Pair<Boolean, Boolean>>>() {
            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d9, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x00da, code lost:
                com.bytedance.p263im.core.internal.utils.C11430h.m33685a().mo27471a(r3, r4.next_cursor.longValue());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x00eb, code lost:
                throw r0;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x00d9 A[ExcHandler: all (r0v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x0026] */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.util.Pair<android.util.Pair<com.bytedance.p263im.core.model.Message, java.lang.Boolean>, android.util.Pair<java.lang.Boolean, java.lang.Boolean>> mo15560a() {
                /*
                    r15 = this;
                    com.bytedance.im.core.internal.utils.h r0 = com.bytedance.p263im.core.internal.utils.C11430h.m33685a()
                    int r1 = r3
                    long r0 = r0.mo27470a(r1)
                    com.bytedance.im.core.proto.NewMessageNotify r2 = r4
                    java.lang.Long r2 = r2.next_cursor
                    long r2 = r2.longValue()
                    r4 = 0
                    int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                    if (r5 > 0) goto L_0x0018
                    return r4
                L_0x0018:
                    com.bytedance.im.core.proto.NewMessageNotify r2 = r4
                    java.lang.Long r2 = r2.previous_cursor
                    long r2 = r2.longValue()
                    r5 = 1
                    r6 = 0
                    int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                    if (r7 != 0) goto L_0x0110
                    long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    com.bytedance.im.core.proto.NewMessageNotify r2 = r4     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    com.bytedance.im.core.proto.MessageBody r2 = r2.message     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    android.util.Pair r2 = com.bytedance.p263im.core.internal.p587a.p588a.C11308y.m33162a(r2, r6, r6)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                    r3.<init>()     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                    java.lang.String r7 = "duration"
                    long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                    r10 = 0
                    long r8 = r8 - r0
                    r3.put(r7, r8)     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                    java.lang.String r0 = "msg_count"
                    r3.put(r0, r5)     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                    java.lang.String r0 = "msg_source"
                    r3.put(r0, r6)     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                    java.lang.String r0 = "im_save_msg_list_duration"
                    com.bytedance.p263im.core.p586b.C11209d.m32830a(r0, r3, r4)     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                L_0x0051:
                    if (r2 == 0) goto L_0x00ec
                    java.lang.Object r0 = r2.first     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    if (r0 == 0) goto L_0x00ec
                    java.lang.Object r0 = r2.first     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    com.bytedance.im.core.model.Message r0 = (com.bytedance.p263im.core.model.Message) r0     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    com.bytedance.p263im.core.internal.p590db.C11368l.m33375a()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    java.lang.String r1 = r0.getConversationId()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    com.bytedance.im.core.model.Conversation r7 = com.bytedance.p263im.core.internal.p590db.C11368l.m33377a(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    if (r7 != 0) goto L_0x008c
                    android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    android.util.Pair r1 = new android.util.Pair     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    r1.<init>(r3, r5)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    com.bytedance.im.core.internal.utils.h r1 = com.bytedance.p263im.core.internal.utils.C11430h.m33685a()
                    int r2 = r3
                    com.bytedance.im.core.proto.NewMessageNotify r3 = r4
                    java.lang.Long r3 = r3.next_cursor
                    long r3 = r3.longValue()
                    r1.mo27471a(r2, r3)
                    return r0
                L_0x008c:
                    com.bytedance.p263im.core.internal.p590db.C11375q.m33429a()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    java.lang.String r8 = r0.getConversationId()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    long r9 = r7.getReadIndex()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    com.bytedance.im.core.a.c r1 = com.bytedance.p263im.core.p584a.C11198c.m32777a()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    com.bytedance.im.core.a.a r1 = r1.f30372b     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    long r13 = r1.mo27230a()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    long r10 = com.bytedance.p263im.core.internal.p590db.C11375q.m33428a(r8, r9, r11, r13)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    long r8 = r0.getIndex()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    long r12 = com.bytedance.p263im.core.internal.utils.C11405e.m33599c(r0)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    com.bytedance.p263im.core.internal.p587a.p588a.C11308y.m33165a(r7, r8, r10, r12)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    android.util.Pair r1 = new android.util.Pair     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    r1.<init>(r3, r5)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                    com.bytedance.im.core.internal.utils.h r1 = com.bytedance.p263im.core.internal.utils.C11430h.m33685a()
                    int r2 = r3
                    com.bytedance.im.core.proto.NewMessageNotify r3 = r4
                    java.lang.Long r3 = r3.next_cursor
                    long r3 = r3.longValue()
                    r1.mo27471a(r2, r3)
                    return r0
                L_0x00d9:
                    r0 = move-exception
                    com.bytedance.im.core.internal.utils.h r1 = com.bytedance.p263im.core.internal.utils.C11430h.m33685a()
                    int r2 = r3
                    com.bytedance.im.core.proto.NewMessageNotify r3 = r4
                    java.lang.Long r3 = r3.next_cursor
                    long r3 = r3.longValue()
                    r1.mo27471a(r2, r3)
                    throw r0
                L_0x00ec:
                    com.bytedance.im.core.internal.utils.h r0 = com.bytedance.p263im.core.internal.utils.C11430h.m33685a()
                    int r1 = r3
                    com.bytedance.im.core.proto.NewMessageNotify r2 = r4
                    java.lang.Long r2 = r2.next_cursor
                    long r2 = r2.longValue()
                    r0.mo27471a(r1, r2)
                    android.util.Pair r0 = new android.util.Pair
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
                    r1.<init>(r2, r3)
                    r0.<init>(r4, r1)
                    return r0
                L_0x0110:
                    android.util.Pair r0 = new android.util.Pair
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
                    r1.<init>(r2, r3)
                    r0.<init>(r4, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p587a.p588a.C11308y.C113091.mo15560a():android.util.Pair");
            }
        }, new C11317c<Pair<Pair<Message, Boolean>, Pair<Boolean, Boolean>>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Pair<Pair<Message, Boolean>, Pair<Boolean, Boolean>> pair) {
                if (pair != null) {
                    if (((Boolean) ((Pair) pair.second).first).booleanValue()) {
                        if (!(C11198c.m32777a().f30372b.mo27238e() == null || newMessageNotify == null || newMessageNotify.message == null)) {
                            C11198c.m32777a();
                        }
                        C11283p.m33057a();
                        C11283p.m33060a(i, 2);
                    } else if (pair.first != null) {
                        Pair pair2 = (Pair) pair.first;
                        C11308y.m33166a((Message) pair2.first, ((Boolean) pair2.second).booleanValue());
                        if (((Boolean) ((Pair) pair.second).second).booleanValue()) {
                            new C11261h().mo27294a(i, ((Message) pair2.first).getConversationId(), ((Message) pair2.first).getConversationShortId(), ((Message) pair2.first).getConversationType(), ((Message) pair2.first).getCreatedAt());
                        }
                        C11211a.m32841b();
                    } else {
                        C11211a.m32841b();
                    }
                }
            }
        }, C11314a.m33183c());
    }

    /* renamed from: a */
    public static void m33166a(Message message, boolean z) {
        Conversation a = C6417a.m20015a().mo15530a(message.getConversationId());
        ArrayList arrayList = new ArrayList();
        arrayList.add(message);
        if (z) {
            C11407f.m33601a().mo27462c((List<Message>) arrayList);
        } else {
            C11407f.m33601a().mo27466f((List<Message>) arrayList);
        }
        C6417a.m20015a().mo15540b(a);
        if (z) {
            Message b = C11405e.m33597b(message);
            if (b != null) {
                C11198c.m32777a().f30372b.mo27234a(Collections.singletonList(b));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27275a(int i, ResponseBody responseBody) {
        NewMessageNotify newMessageNotify = responseBody.has_new_message_notify;
        if (newMessageNotify.notify_type == NewMessageNotifyType.PER_USER) {
            int[] iArr = C11198c.m32777a().mo27248b().f30416p;
            if (iArr == null) {
                iArr = C11198c.m32777a().mo27248b().f30415o;
            }
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i == i2) {
                        m33164a(i, newMessageNotify);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static Pair<Message, Boolean> m33162a(MessageBody messageBody, boolean z, int i) {
        return m33163a(messageBody, z, null, i);
    }

    /* renamed from: a */
    static void m33165a(Conversation conversation, long j, long j2, long j3) {
        if (j3 > conversation.getUpdatedTime()) {
            conversation.setUpdatedTime(j3);
        }
        conversation.setLastMessageIndex(j);
        conversation.setUnreadCount(j2);
        C11368l.m33375a();
        if (C11368l.m33384b(conversation)) {
            C6417a.m20015a().mo15553f(conversation);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        if (r6.version.longValue() > r7.getVersion()) goto L_0x009e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.util.Pair<com.bytedance.p263im.core.model.Message, java.lang.Boolean> m33163a(com.bytedance.p263im.core.proto.MessageBody r6, boolean r7, android.util.Pair<java.lang.String, java.lang.String> r8, int r9) {
        /*
            com.bytedance.im.core.a.c r0 = com.bytedance.p263im.core.p584a.C11198c.m32777a()
            com.bytedance.im.core.a.a r0 = r0.f30372b
            if (r0 == 0) goto L_0x0022
            com.bytedance.im.core.a.c r0 = com.bytedance.p263im.core.p584a.C11198c.m32777a()
            com.bytedance.im.core.a.a r0 = r0.f30372b
            com.bytedance.im.core.a.b r0 = r0.mo27238e()
            if (r0 == 0) goto L_0x0022
            com.bytedance.im.core.a.c r0 = com.bytedance.p263im.core.p584a.C11198c.m32777a()
            com.bytedance.im.core.a.a r0 = r0.f30372b
            com.bytedance.im.core.a.b r0 = r0.mo27238e()
            com.bytedance.im.core.proto.MessageBody r6 = r0.mo27244a(r6, r9)
        L_0x0022:
            boolean r9 = com.bytedance.p263im.core.internal.utils.C11405e.m33596a(r6)
            r0 = 0
            if (r9 == 0) goto L_0x00f0
            boolean r9 = com.bytedance.p263im.core.internal.p587a.p588a.C11242d.m32945a(r6)
            if (r9 == 0) goto L_0x0030
            return r0
        L_0x0030:
            boolean r9 = com.bytedance.p263im.core.internal.utils.C11405e.m33598b(r6)
            if (r9 == 0) goto L_0x003a
            com.bytedance.p263im.core.internal.p587a.p588a.C11227ag.m32900a(r6)
            return r0
        L_0x003a:
            java.util.Map<java.lang.String, java.lang.String> r9 = r6.ext
            java.lang.String r1 = ""
            if (r9 == 0) goto L_0x005e
            java.lang.String r2 = "s:client_message_id"
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x005e
            java.lang.String r2 = "s:client_message_id"
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x005e
            java.lang.String r1 = "s:client_message_id"
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r1 = (java.lang.String) r1
        L_0x005e:
            if (r9 == 0) goto L_0x009d
            java.lang.String r2 = "s:server_message_id"
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x009d
            java.lang.String r2 = "s:server_message_id"
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x009d
            if (r7 == 0) goto L_0x0079
            return r0
        L_0x0079:
            java.lang.String r7 = "s:server_message_id"
            java.lang.Object r7 = r9.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            long r2 = java.lang.Long.parseLong(r7)
            com.bytedance.p263im.core.internal.p590db.C11375q.m33429a()
            com.bytedance.im.core.model.Message r7 = com.bytedance.p263im.core.internal.p590db.C11375q.m33430a(r2)
            if (r7 == 0) goto L_0x009d
            java.lang.Long r9 = r6.version
            long r2 = r9.longValue()
            long r4 = r7.getVersion()
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r7 = r0
        L_0x009e:
            if (r7 != 0) goto L_0x00bb
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 == 0) goto L_0x00b4
            com.bytedance.p263im.core.internal.p590db.C11375q.m33429a()
            java.lang.Long r7 = r6.server_message_id
            long r2 = r7.longValue()
            com.bytedance.im.core.model.Message r7 = com.bytedance.p263im.core.internal.p590db.C11375q.m33430a(r2)
            goto L_0x00bb
        L_0x00b4:
            com.bytedance.p263im.core.internal.p590db.C11375q.m33429a()
            com.bytedance.im.core.model.Message r7 = com.bytedance.p263im.core.internal.p590db.C11375q.m33447d(r1)
        L_0x00bb:
            if (r7 != 0) goto L_0x00bf
            r9 = 1
            goto L_0x00c0
        L_0x00bf:
            r9 = 0
        L_0x00c0:
            com.bytedance.im.core.model.Message r6 = com.bytedance.p263im.core.internal.utils.C11401b.m33569a(r1, r7, r6)
            if (r8 == 0) goto L_0x00d1
            java.util.Map r7 = r6.getLocalExt()
            java.lang.Object r1 = r8.first
            java.lang.Object r8 = r8.second
            r7.put(r1, r8)
        L_0x00d1:
            if (r9 == 0) goto L_0x00db
            com.bytedance.p263im.core.internal.p590db.C11375q.m33429a()
            boolean r7 = com.bytedance.p263im.core.internal.p590db.C11375q.m33442b(r6)
            goto L_0x00e3
        L_0x00db:
            com.bytedance.im.core.internal.db.q r7 = com.bytedance.p263im.core.internal.p590db.C11375q.m33429a()
            boolean r7 = r7.mo27396a(r6)
        L_0x00e3:
            if (r7 == 0) goto L_0x00ef
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)
            r7.<init>(r6, r8)
            return r7
        L_0x00ef:
            return r0
        L_0x00f0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p587a.p588a.C11308y.m33163a(com.bytedance.im.core.proto.MessageBody, boolean, android.util.Pair, int):android.util.Pair");
    }
}
