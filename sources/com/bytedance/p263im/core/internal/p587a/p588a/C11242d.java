package com.bytedance.p263im.core.internal.p587a.p588a;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p587a.C11211a;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11369m;
import com.bytedance.p263im.core.internal.p590db.C11374p;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.proto.MessageBody;
import com.bytedance.p263im.core.proto.MessageType;
import com.google.gson.p276a.C6593c;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.a.d */
final class C11242d {
    @C6593c(mo15949a = "command_type")

    /* renamed from: a */
    private int f30501a;
    @C6593c(mo15949a = "inbox_type")

    /* renamed from: b */
    private int f30502b;
    @C6593c(mo15949a = "conversation_id")

    /* renamed from: c */
    private String f30503c;
    @C6593c(mo15949a = "conversation_type")

    /* renamed from: d */
    private int f30504d;
    @C6593c(mo15949a = "message_id")

    /* renamed from: e */
    private long f30505e;
    @C6593c(mo15949a = "read_index")

    /* renamed from: f */
    private long f30506f;
    @C6593c(mo15949a = "unread_count")

    /* renamed from: g */
    private int f30507g;
    @C6593c(mo15949a = "last_message_index")

    /* renamed from: h */
    private long f30508h;
    @C6593c(mo15949a = "conversation_version")

    /* renamed from: i */
    private long f30509i;
    @C6593c(mo15949a = "group_version")

    /* renamed from: j */
    private long f30510j;
    @C6593c(mo15949a = "added_participant")

    /* renamed from: k */
    private List<Long> f30511k;
    @C6593c(mo15949a = "modified_participant")

    /* renamed from: l */
    private List<Long> f30512l;
    @C6593c(mo15949a = "removed_participant")

    /* renamed from: m */
    private List<Long> f30513m;

    C11242d() {
    }

    /* renamed from: e */
    private static void m32953e(C11242d dVar) {
        C11308y.m33167a(dVar.f30503c);
    }

    /* renamed from: a */
    private static void m32942a(final Conversation conversation) {
        if (conversation != null) {
            C11283p.m33057a().mo27310a((Runnable) new Runnable() {
                public final void run() {
                    C6417a.m20015a().mo15540b(conversation);
                }
            });
        }
    }

    /* renamed from: b */
    private static void m32947b(final Conversation conversation) {
        if (conversation != null) {
            C11283p.m33057a().mo27310a((Runnable) new Runnable() {
                public final void run() {
                    C6417a.m20015a().mo15550e(conversation);
                }
            });
        }
    }

    /* renamed from: d */
    private static boolean m32952d(C11242d dVar) {
        if (dVar == null || dVar.f30513m == null || !dVar.f30513m.contains(Long.valueOf(C11198c.m32777a().f30372b.mo27230a()))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static void m32949c(C11242d dVar) {
        C11368l.m33375a();
        final Conversation a = C11368l.m33377a(dVar.f30503c);
        if (a != null) {
            C11368l.m33375a();
            if (C11368l.m33387c(a)) {
                C11283p.m33057a().mo27310a((Runnable) new Runnable() {
                    public final void run() {
                        C6417a.m20015a().mo15534a(a);
                    }
                });
            }
        }
        C11211a.m32842b(dVar.f30502b, dVar.f30503c);
    }

    /* renamed from: d */
    private static void m32951d(MessageBody messageBody) {
        C11368l.m33375a();
        final Conversation a = C11368l.m33377a(messageBody.conversation_id);
        if (a != null) {
            C11368l.m33375a();
            C11368l.m33388c(a.getConversationId());
            a.setStatus(1);
            C11283p.m33057a().mo27310a((Runnable) new Runnable() {
                public final void run() {
                    C6417a.m20015a().mo15548d(a);
                }
            });
            C11211a.m32842b(a.getInboxType(), messageBody.conversation_id);
        }
    }

    /* renamed from: b */
    private static void m32946b(C11242d dVar) {
        final Conversation a = C6417a.m20015a().mo15530a(dVar.f30503c);
        if (a != null && a.getLastMessage() != null) {
            C11375q.m33429a();
            final Message a2 = C11375q.m33430a(dVar.f30505e);
            if (a2 != null) {
                final boolean z = true;
                a2.setDeleted(1);
                Message lastMessage = a.getLastMessage();
                C11375q.m33429a();
                boolean a3 = C11375q.m33438a(a2.getUuid());
                if (a3 && lastMessage.getUuid().equals(a2.getUuid())) {
                    C11375q.m33429a();
                    a.setLastMessage(C11375q.m33450h(dVar.f30503c));
                } else if (!a3 || !a.removeMentionMessage(a2.getUuid())) {
                    z = false;
                }
                if (a3) {
                    C11283p.m33057a().mo27310a((Runnable) new Runnable() {
                        public final void run() {
                            C11407f.m33601a().mo27447a(a2);
                            if (z) {
                                C6417a.m20015a().mo15540b(a);
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    private static void m32939a(C11242d dVar) {
        long j;
        C11368l.m33375a();
        final Conversation a = C11368l.m33377a(dVar.f30503c);
        if (a != null && dVar.f30506f > a.getReadIndex()) {
            long unreadCount = a.getUnreadCount();
            C11375q.m33429a();
            long a2 = unreadCount - C11375q.m33428a(a.getConversationId(), a.getReadIndex(), dVar.f30506f, C11198c.m32777a().f30372b.mo27230a());
            if (a2 >= 0) {
                j = a2;
            } else {
                j = 0;
            }
            a.setUnreadCount(j);
            a.setReadIndex(dVar.f30506f);
            if (a2 <= 0) {
                C11374p.m33421a();
                C11374p.m33426b(dVar.f30503c);
                a.setMentionMessages(null);
            } else {
                C11374p.m33421a();
                a.setMentionMessages(C11374p.m33422a(dVar.f30503c, dVar.f30506f));
            }
            C11368l.m33375a();
            if (C11368l.m33384b(a)) {
                C11375q.m33429a();
                C11375q.m33451i(dVar.f30503c);
                C11283p.m33057a().mo27310a((Runnable) new Runnable() {
                    public final void run() {
                        C6417a.m20015a().mo15540b(a);
                    }
                });
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m32948b(com.bytedance.p263im.core.proto.MessageBody r4) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r4.content     // Catch:{ Exception -> 0x0058 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0058 }
            com.google.gson.e r1 = com.bytedance.p263im.core.internal.utils.C11403c.f30887a     // Catch:{ Exception -> 0x0058 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0058 }
            java.lang.Class<com.bytedance.im.core.internal.a.a.d> r2 = com.bytedance.p263im.core.internal.p587a.p588a.C11242d.class
            java.lang.Object r0 = r1.mo15974a(r0, r2)     // Catch:{ Exception -> 0x0058 }
            com.bytedance.im.core.internal.a.a.d r0 = (com.bytedance.p263im.core.internal.p587a.p588a.C11242d) r0     // Catch:{ Exception -> 0x0058 }
            int r1 = r0.f30501a     // Catch:{ Exception -> 0x0058 }
            r2 = 1
            switch(r1) {
                case 1: goto L_0x0053;
                case 2: goto L_0x004f;
                case 3: goto L_0x004b;
                case 4: goto L_0x0046;
                case 5: goto L_0x001b;
                case 6: goto L_0x0042;
                case 7: goto L_0x0026;
                case 8: goto L_0x0022;
                case 9: goto L_0x001c;
                default: goto L_0x001b;
            }     // Catch:{ Exception -> 0x0058 }
        L_0x001b:
            goto L_0x0057
        L_0x001c:
            java.lang.String r4 = r0.f30503c     // Catch:{ Exception -> 0x0058 }
            m32944a(r4, r2)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0057
        L_0x0022:
            m32953e(r0)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005e
        L_0x0026:
            boolean r1 = m32952d(r0)     // Catch:{ Exception -> 0x0058 }
            com.bytedance.im.core.model.Conversation r3 = m32938a(r0, r1)     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x0037
            m32942a(r3)     // Catch:{ Exception -> 0x0058 }
            m32947b(r3)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005e
        L_0x0037:
            m32941a(r0, r4, r2)     // Catch:{ Exception -> 0x0058 }
            com.bytedance.im.core.internal.utils.f r4 = com.bytedance.p263im.core.internal.utils.C11407f.m33601a()     // Catch:{ Exception -> 0x0058 }
            r4.mo27465f(r3)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005e
        L_0x0042:
            m32940a(r0, r4)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005e
        L_0x0046:
            r1 = 0
            m32941a(r0, r4, r1)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005e
        L_0x004b:
            m32949c(r0)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005e
        L_0x004f:
            m32946b(r0)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005e
        L_0x0053:
            m32939a(r0)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005e
        L_0x0057:
            return
        L_0x0058:
            r4 = move-exception
            java.lang.String r0 = "handle command"
            com.bytedance.p263im.core.internal.utils.C11404d.m33585a(r0, r4)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p587a.p588a.C11242d.m32948b(com.bytedance.im.core.proto.MessageBody):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081 A[Catch:{ Exception -> 0x0094 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m32950c(com.bytedance.p263im.core.proto.MessageBody r8) {
        /*
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.ext     // Catch:{ Exception -> 0x0094 }
            r1 = 0
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0025
            java.lang.String r3 = "s:client_message_id"
            boolean r3 = r0.containsKey(r3)     // Catch:{ Exception -> 0x0094 }
            if (r3 == 0) goto L_0x0025
            java.lang.String r3 = "s:client_message_id"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ Exception -> 0x0094 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x0094 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0094 }
            if (r3 != 0) goto L_0x0025
            java.lang.String r2 = "s:client_message_id"
            java.lang.Object r2 = r0.get(r2)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0094 }
        L_0x0025:
            if (r0 == 0) goto L_0x0061
            java.lang.String r3 = "s:server_message_id"
            boolean r3 = r0.containsKey(r3)     // Catch:{ Exception -> 0x0094 }
            if (r3 == 0) goto L_0x0061
            java.lang.String r3 = "s:server_message_id"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ Exception -> 0x0094 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x0094 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0094 }
            if (r3 != 0) goto L_0x0061
            java.lang.String r3 = "s:server_message_id"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0094 }
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0094 }
            com.bytedance.p263im.core.internal.p590db.C11375q.m33429a()     // Catch:{ Exception -> 0x0094 }
            com.bytedance.im.core.model.Message r0 = com.bytedance.p263im.core.internal.p590db.C11375q.m33430a(r3)     // Catch:{ Exception -> 0x0094 }
            if (r0 == 0) goto L_0x0061
            java.lang.Long r3 = r8.version     // Catch:{ Exception -> 0x0094 }
            long r3 = r3.longValue()     // Catch:{ Exception -> 0x0094 }
            long r5 = r0.getVersion()     // Catch:{ Exception -> 0x0094 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r0 = r1
        L_0x0062:
            if (r0 != 0) goto L_0x007f
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0094 }
            if (r0 == 0) goto L_0x0078
            com.bytedance.p263im.core.internal.p590db.C11375q.m33429a()     // Catch:{ Exception -> 0x0094 }
            java.lang.Long r0 = r8.server_message_id     // Catch:{ Exception -> 0x0094 }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0094 }
            com.bytedance.im.core.model.Message r0 = com.bytedance.p263im.core.internal.p590db.C11375q.m33430a(r0)     // Catch:{ Exception -> 0x0094 }
            goto L_0x007f
        L_0x0078:
            com.bytedance.p263im.core.internal.p590db.C11375q.m33429a()     // Catch:{ Exception -> 0x0094 }
            com.bytedance.im.core.model.Message r0 = com.bytedance.p263im.core.internal.p590db.C11375q.m33447d(r2)     // Catch:{ Exception -> 0x0094 }
        L_0x007f:
            if (r0 == 0) goto L_0x0093
            r1 = 1
            com.bytedance.im.core.model.Message r8 = com.bytedance.p263im.core.internal.utils.C11401b.m33570a(r2, r0, r8, r1)     // Catch:{ Exception -> 0x0094 }
            com.bytedance.im.core.internal.db.q r0 = com.bytedance.p263im.core.internal.p590db.C11375q.m33429a()     // Catch:{ Exception -> 0x0094 }
            boolean r0 = r0.mo27396a(r8)     // Catch:{ Exception -> 0x0094 }
            if (r0 == 0) goto L_0x0093
            m32943a(r8)     // Catch:{ Exception -> 0x0094 }
        L_0x0093:
            return
        L_0x0094:
            r8 = move-exception
            java.lang.String r0 = "handle update"
            com.bytedance.p263im.core.internal.utils.C11404d.m33585a(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p587a.p588a.C11242d.m32950c(com.bytedance.im.core.proto.MessageBody):void");
    }

    /* renamed from: e */
    private static void m32954e(MessageBody messageBody) {
        try {
            Map<String, String> map = messageBody.ext;
            String str = "";
            if (map != null && map.containsKey("s:client_message_id") && !TextUtils.isEmpty((CharSequence) map.get("s:client_message_id"))) {
                str = (String) map.get("s:client_message_id");
            }
            if (map != null && map.containsKey("s:server_message_id") && !TextUtils.isEmpty((CharSequence) map.get("s:server_message_id"))) {
                long parseLong = Long.parseLong((String) map.get("s:server_message_id"));
                C11375q.m33429a();
                Message a = C11375q.m33430a(parseLong);
                if (a == null || messageBody.version.longValue() <= a.getVersion()) {
                    a = null;
                }
                if (a == null) {
                    if (TextUtils.isEmpty(str)) {
                        C11375q.m33429a();
                        a = C11375q.m33430a(messageBody.server_message_id.longValue());
                    } else {
                        C11375q.m33429a();
                        a = C11375q.m33447d(str);
                    }
                }
                if (a != null) {
                    Message a2 = C11401b.m33570a(str, a, messageBody, true);
                    if (C11375q.m33429a().mo27396a(a2)) {
                        m32943a(a2);
                    }
                }
            }
        } catch (Throwable th) {
            C11404d.m33585a("handle handleUpdateProperty", th);
        }
    }

    /* renamed from: a */
    private static void m32943a(final Message message) {
        boolean z;
        final Conversation a;
        boolean z2 = false;
        if (message.isRecalled()) {
            List mentionIds = message.getMentionIds();
            if (mentionIds != null && !mentionIds.isEmpty()) {
                C11374p.m33421a();
                z = C11374p.m33424a(message.getUuid());
                C11368l.m33375a();
                a = C11368l.m33377a(message.getConversationId());
                if (a == null && a.getLastMessage() != null) {
                    C11375q.m33429a();
                    long a2 = C11375q.m33428a(message.getConversationId(), a.getReadIndex(), Long.MAX_VALUE, C11198c.m32777a().f30372b.mo27230a());
                    if (a2 != a.getUnreadCount()) {
                        z2 = true;
                    }
                    a.setUnreadCount(a2);
                    if (message.getUuid().equals(a.getLastMessage().getUuid())) {
                        a.setLastMessage(message);
                        z2 = true;
                    }
                    C11368l.m33375a();
                    C11368l.m33384b(a);
                    C11283p.m33057a().mo27310a((Runnable) new Runnable() {
                        public final void run() {
                            C11407f.m33601a().mo27466f(Collections.singletonList(message));
                        }
                    });
                    if (z2 || z) {
                        C11283p.m33057a().mo27310a((Runnable) new Runnable() {
                            public final void run() {
                                C6417a.m20015a().mo15540b(a);
                            }
                        });
                    }
                    return;
                }
            }
        }
        z = false;
        C11368l.m33375a();
        a = C11368l.m33377a(message.getConversationId());
        if (a == null) {
        }
    }

    /* renamed from: a */
    public static boolean m32945a(MessageBody messageBody) {
        if (messageBody.message_type.intValue() == MessageType.MESSAGE_TYPE_COMMAND.getValue()) {
            m32948b(messageBody);
            return true;
        } else if (messageBody.message_type.intValue() == MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_EXT.getValue()) {
            m32950c(messageBody);
            return true;
        } else if (messageBody.message_type.intValue() == MessageType.MESSAGE_TYPE_MODE_CHANGE.getValue()) {
            m32944a(messageBody.conversation_id, false);
            return true;
        } else if (messageBody.message_type.intValue() == MessageType.MESSAGE_TYPE_CONVERSATION_DESTROY.getValue()) {
            m32951d(messageBody);
            return true;
        } else if (messageBody.message_type.intValue() != MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY.getValue()) {
            return false;
        } else {
            m32954e(messageBody);
            return true;
        }
    }

    /* renamed from: a */
    private static void m32944a(final String str, final boolean z) {
        C11375q.m33429a();
        C11375q.m33443b(str);
        C11283p.m33057a().mo27310a((Runnable) new Runnable() {
            public final void run() {
                C11407f.m33601a().mo27453a(str, z);
            }
        });
    }

    /* renamed from: a */
    private static void m32940a(C11242d dVar, MessageBody messageBody) {
        C11368l.m33375a();
        Conversation a = C11368l.m33377a(dVar.f30503c);
        if (a != null && a.getCoreInfo() != null && a.getCoreInfo().getVersion() < dVar.f30510j) {
            C11211a.m32837a(dVar.f30502b, messageBody);
        }
    }

    /* renamed from: a */
    private static Conversation m32938a(C11242d dVar, boolean z) {
        if (dVar == null || TextUtils.isEmpty(dVar.f30503c)) {
            return null;
        }
        C11368l.m33375a();
        Conversation a = C11368l.m33377a(dVar.f30503c);
        if (dVar.f30513m == null || dVar.f30513m.size() <= 0) {
            return a;
        }
        C11369m.m33392a();
        int c = C11369m.m33402c(dVar.f30503c, dVar.f30513m);
        if (a == null || c <= 0) {
            return a;
        }
        a.setMemberCount(Math.max(0, a.getMemberCount() - c));
        if (z) {
            a.setIsMember(false);
        }
        C11368l.m33375a();
        C11368l.m33384b(a);
        return a;
    }

    /* renamed from: a */
    private static void m32941a(C11242d dVar, MessageBody messageBody, boolean z) {
        C11368l.m33375a();
        Conversation a = C11368l.m33377a(dVar.f30503c);
        if (a == null) {
            return;
        }
        if ((a.getSettingInfo() != null && a.getSettingInfo().getVersion() < dVar.f30509i) || z) {
            C11211a.m32837a(dVar.f30502b, messageBody);
        }
    }
}
