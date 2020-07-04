package com.bytedance.p263im.core.model;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.C1642a;
import com.bytedance.p263im.core.internal.p587a.p588a.C11283p;
import com.bytedance.p263im.core.internal.p589b.C11314a;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11370n;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.queue.C11379a;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11403c;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.internal.utils.C11405e;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.internal.utils.C11432j;
import com.bytedance.p263im.core.internal.utils.MessageSortedList;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p584a.C11202d.C11204b;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p586b.C11208c;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ParticipantMinIndex;
import com.bytedance.p263im.core.proto.ParticipantReadIndex;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.model.k */
public final class C11443k implements C11439h {

    /* renamed from: a */
    public MessageSortedList f30970a;

    /* renamed from: b */
    public String f30971b;

    /* renamed from: c */
    public int f30972c;

    /* renamed from: d */
    public boolean f30973d;

    /* renamed from: e */
    public boolean f30974e;

    /* renamed from: f */
    public Map<Long, C11468l> f30975f;

    /* renamed from: g */
    private C11439h f30976g;

    /* renamed from: h */
    private boolean f30977h;

    /* renamed from: i */
    private List<Long> f30978i;

    /* renamed from: j */
    private boolean f30979j;

    /* renamed from: k */
    private C11436d f30980k;

    /* renamed from: l */
    private long f30981l;

    /* renamed from: a */
    public final void mo27663a(C11439h hVar) {
        m33747a(hVar, true);
    }

    /* renamed from: a */
    public final void mo27447a(Message message) {
        if (this.f30970a.remove(message) && this.f30976g != null) {
            this.f30976g.mo27447a(message);
        }
    }

    /* renamed from: a */
    public final void mo27454a(boolean z) {
        this.f30970a.clear();
        if (z && this.f30976g != null) {
            this.f30976g.mo27454a(true);
        }
    }

    /* renamed from: a */
    public final void mo27662a(final Message message, boolean z, final C11195b<Pair<List<Long>, List<Long>>> bVar) {
        if (message == null || !message.isSelf() || message.isDeleted() || !C11405e.m33600d(message) || TextUtils.isEmpty(message.getConversationId()) || !message.getConversationId().equals(this.f30971b) || !message.isSuccessOrNormal() || !this.f30979j) {
            bVar.mo18088a(C11438g.m33713a(C11391e.m33515a(-1015)));
            return;
        }
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f30981l < 2000) {
                C11404d.m33582a("getMessageReadStatusAsync net request too often, smaller than 2s, return local data");
                mo27669c(message, bVar);
            } else {
                C11404d.m33582a("getMessageReadStatusAsync net request");
                this.f30981l = currentTimeMillis;
                C6417a.m20015a();
                C6417a.m20024b(message.getConversationId(), (C11195b<List<ParticipantReadIndex>>) new C11195b<List<ParticipantReadIndex>>() {
                    /* renamed from: a */
                    public final void mo18088a(C11438g gVar) {
                        C11443k.this.mo27669c(message, bVar);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void mo18089a(final List<ParticipantReadIndex> list) {
                        C11319e.m33192a(new C11318d<Pair<Boolean, Map<Long, C11468l>>>() {
                            /* access modifiers changed from: private */
                            /* renamed from: b */
                            public Pair<Boolean, Map<Long, C11468l>> mo15560a() {
                                Pair<Boolean, Map<Long, C11468l>> a = C11443k.this.mo27660a(message.getConversationId(), list);
                                C11404d.m33582a(C1642a.m8034a("getMessageReadStatusAsync after updateReadIndex result=%s", new Object[]{C11403c.f30887a.mo15979b((Object) a)}));
                                return a;
                            }
                        }, new C11317c<Pair<Boolean, Map<Long, C11468l>>>() {
                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public void mo15561a(Pair<Boolean, Map<Long, C11468l>> pair) {
                                if (pair != null) {
                                    final Map map = (Map) pair.second;
                                    if (map != null && !map.isEmpty()) {
                                        boolean z = false;
                                        Iterator it = map.entrySet().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Entry entry = (Entry) it.next();
                                            if (entry != null && entry.getValue() != null && ((C11468l) entry.getValue()).mo27682c()) {
                                                z = true;
                                                break;
                                            }
                                        }
                                        if (z) {
                                            C11404d.m33582a("getMessageReadStatusAsync needRequestMinIndex");
                                            C11443k.this.mo27664a(message.getConversationId(), message, bVar);
                                        } else {
                                            Pair a = C11443k.this.mo27659a(message, map);
                                            if (bVar != null) {
                                                bVar.mo18089a(a);
                                            }
                                        }
                                    } else if (bVar != null) {
                                        bVar.mo18089a(new Pair(Collections.emptyList(), Collections.emptyList()));
                                    }
                                    if (((Boolean) pair.first).booleanValue()) {
                                        C11319e.m33192a(new C11318d<Boolean>() {
                                            /* access modifiers changed from: private */
                                            /* renamed from: b */
                                            public Boolean mo15560a() {
                                                C11404d.m33582a("getReadStatusAsync insertOrUpdateMemberRead");
                                                return Boolean.valueOf(C11370n.m33407a().mo27391a(message.getConversationId(), map));
                                            }
                                        }, null, C11314a.m33185e());
                                    }
                                    return;
                                }
                                if (bVar != null) {
                                    bVar.mo18088a(C11438g.m33713a(C11391e.m33515a(-9999)));
                                }
                            }
                        }, C11314a.m33185e());
                    }
                });
            }
        } else {
            mo27669c(message, bVar);
        }
    }

    /* renamed from: a */
    public final void mo27664a(final String str, final Message message, final C11195b<Pair<List<Long>, List<Long>>> bVar) {
        C6417a.m20015a();
        C6417a.m20019a(str, (C11195b<List<ParticipantMinIndex>>) new C11195b<List<ParticipantMinIndex>>() {
            /* renamed from: a */
            public final void mo18088a(C11438g gVar) {
                C11443k.this.mo27669c(message, bVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo18089a(final List<ParticipantMinIndex> list) {
                C11319e.m33192a(new C11318d<Pair<Boolean, Map<Long, C11468l>>>() {
                    /* access modifiers changed from: private */
                    /* renamed from: b */
                    public Pair<Boolean, Map<Long, C11468l>> mo15560a() {
                        Pair<Boolean, Map<Long, C11468l>> b = C11443k.this.mo27666b(str, list);
                        C11404d.m33582a(C1642a.m8034a("requestUpdateMinIndexAndCallback afterUpdateMinIndex result=%s", new Object[]{C11403c.f30887a.mo15979b((Object) b)}));
                        return b;
                    }
                }, new C11317c<Pair<Boolean, Map<Long, C11468l>>>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void mo15561a(Pair<Boolean, Map<Long, C11468l>> pair) {
                        if (pair != null) {
                            final Map map = (Map) pair.second;
                            if (map == null || map.isEmpty()) {
                                C11404d.m33582a("requestUpdateMinIndexAndCallback result empty");
                                if (bVar != null) {
                                    bVar.mo18089a(new Pair(Collections.emptyList(), Collections.emptyList()));
                                }
                            } else {
                                Pair a = C11443k.this.mo27659a(message, map);
                                if (bVar != null) {
                                    bVar.mo18089a(a);
                                }
                            }
                            if (((Boolean) pair.first).booleanValue()) {
                                C11319e.m33192a(new C11318d<Boolean>() {
                                    /* access modifiers changed from: private */
                                    /* renamed from: b */
                                    public Boolean mo15560a() {
                                        C11404d.m33582a("requestUpdateMinIndexAndCallback insertOrUpdateMemberRead");
                                        return Boolean.valueOf(C11370n.m33407a().mo27391a(str, map));
                                    }
                                }, null, C11314a.m33185e());
                            }
                            return;
                        }
                        if (bVar != null) {
                            bVar.mo18088a(C11438g.m33713a(C11391e.m33515a(-9999)));
                        }
                    }
                }, C11314a.m33185e());
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27665a(java.lang.String r14) {
        /*
            r13 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r1 = 0
            if (r0 != 0) goto L_0x0182
            java.util.HashSet r0 = new java.util.HashSet
            com.bytedance.p263im.core.internal.p590db.C11369m.m33392a()
            java.util.List r2 = com.bytedance.p263im.core.internal.p590db.C11369m.m33395a(r14)
            r0.<init>(r2)
            com.bytedance.p263im.core.internal.p590db.C11368l.m33375a()
            com.bytedance.im.core.model.Conversation r2 = com.bytedance.p263im.core.internal.p590db.C11368l.m33377a(r14)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r3 = r13.f30975f
            r4 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0038
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r3 = r13.f30975f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00bf
        L_0x0038:
            com.bytedance.im.core.internal.db.n r3 = com.bytedance.p263im.core.internal.p590db.C11370n.m33407a()
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r7 = r13.f30975f
            java.util.Map r3 = r3.mo27392b(r14, r7)
            r13.f30975f = r3
            java.lang.String r3 = "loadIndexInfoFromMemberAndReadDB after load from read DB result=%s"
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.google.gson.e r8 = com.bytedance.p263im.core.internal.utils.C11403c.f30887a
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r9 = r13.f30975f
            java.lang.String r8 = r8.mo15979b(r9)
            r7[r1] = r8
            java.lang.String r3 = com.C1642a.m8034a(r3, r7)
            com.bytedance.p263im.core.internal.utils.C11404d.m33582a(r3)
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r3 = r13.f30975f
            if (r3 == 0) goto L_0x0065
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r3 = r13.f30975f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00bf
        L_0x0065:
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r3 = r13.f30975f
            if (r3 != 0) goto L_0x0070
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r13.f30975f = r3
        L_0x0070:
            java.util.Iterator r3 = r0.iterator()
        L_0x0074:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00a0
            java.lang.Object r7 = r3.next()
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L_0x0074
            com.bytedance.im.core.model.l r8 = new com.bytedance.im.core.model.l
            r8.<init>()
            r8.f31021a = r14
            long r9 = r7.longValue()
            r8.f31022b = r9
            r9 = -1
            r8.mo27677a(r9)
            r8.mo27679b(r4)
            r8.mo27676a()
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r9 = r13.f30975f
            r9.put(r7, r8)
            goto L_0x0074
        L_0x00a0:
            java.lang.String r3 = "loadIndexInfoFromMemberAndReadDB after load from member DB result=%s"
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.google.gson.e r8 = com.bytedance.p263im.core.internal.utils.C11403c.f30887a
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r9 = r13.f30975f
            java.lang.String r8 = r8.mo15979b(r9)
            r7[r1] = r8
            java.lang.String r3 = com.C1642a.m8034a(r3, r7)
            com.bytedance.p263im.core.internal.utils.C11404d.m33582a(r3)
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r3 = r13.f30975f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00bf
            r3 = 1
            goto L_0x00c0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r7 = r13.f30975f
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0183
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r7 = r13.f30975f
            java.util.Set r7 = r7.keySet()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r0)
            r8.addAll(r7)
            r8.removeAll(r7)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r0)
            r9.addAll(r7)
            r9.removeAll(r0)
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r0 = r13.f30975f
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00ee:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0111
            java.lang.Object r7 = r0.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            if (r7 == 0) goto L_0x00ee
            java.lang.Object r10 = r7.getKey()
            if (r10 == 0) goto L_0x00ee
            java.lang.Object r7 = r7.getKey()
            boolean r7 = r9.contains(r7)
            if (r7 == 0) goto L_0x00ee
            r0.remove()
            r3 = 1
            goto L_0x00ee
        L_0x0111:
            java.lang.String r0 = "loadIndexInfoFromMemberAndReadDB after remove not in member DB result=%s"
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.google.gson.e r9 = com.bytedance.p263im.core.internal.utils.C11403c.f30887a
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r10 = r13.f30975f
            java.lang.String r9 = r9.mo15979b(r10)
            r7[r1] = r9
            java.lang.String r0 = com.C1642a.m8034a(r0, r7)
            com.bytedance.p263im.core.internal.utils.C11404d.m33582a(r0)
            java.util.Iterator r0 = r8.iterator()
        L_0x012a:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x016c
            java.lang.Object r7 = r0.next()
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L_0x012a
            com.bytedance.im.core.model.l r8 = new com.bytedance.im.core.model.l
            r8.<init>()
            r8.f31021a = r14
            long r9 = r7.longValue()
            r8.f31022b = r9
            if (r2 == 0) goto L_0x015b
            long r9 = r2.getLastMessageIndex()
            long r11 = r2.getReadIndex()
            long r9 = java.lang.Math.max(r9, r11)
            r11 = 1
            long r9 = r9 + r11
            long r9 = -r9
            r8.mo27677a(r9)
            goto L_0x0160
        L_0x015b:
            r9 = -9223372036854775808
            r8.mo27677a(r9)
        L_0x0160:
            r8.mo27679b(r4)
            r8.mo27676a()
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r9 = r13.f30975f
            r9.put(r7, r8)
            goto L_0x012a
        L_0x016c:
            java.lang.String r14 = "loadIndexInfoFromMemberAndReadDB after insert from member DB result=%s"
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.google.gson.e r2 = com.bytedance.p263im.core.internal.utils.C11403c.f30887a
            java.util.Map<java.lang.Long, com.bytedance.im.core.model.l> r4 = r13.f30975f
            java.lang.String r2 = r2.mo15979b(r4)
            r0[r1] = r2
            java.lang.String r14 = com.C1642a.m8034a(r14, r0)
            com.bytedance.p263im.core.internal.utils.C11404d.m33582a(r14)
            goto L_0x0183
        L_0x0182:
            r3 = 0
        L_0x0183:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.model.C11443k.mo27665a(java.lang.String):boolean");
    }

    /* renamed from: g */
    public final List<Message> mo27673g() {
        return new ArrayList(this.f30970a);
    }

    /* renamed from: i */
    private Conversation m33757i() {
        return C6417a.m20015a().mo15530a(this.f30971b);
    }

    /* renamed from: c */
    public final void mo27668c() {
        if (this.f30977h) {
            C6417a.m20015a().mo15556g(this.f30971b);
        }
    }

    /* renamed from: d */
    public final void mo27670d() {
        C11432j.m33706a();
        if (!this.f30974e) {
            this.f30974e = true;
            C11319e.m33191a(new C11318d<List<Message>>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public List<Message> mo15560a() {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    List<Message> a = C11375q.m33429a().mo27394a(C11443k.this.f30971b, C11443k.this.f30972c);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        C11209d.m32830a("im_init_msg_duration", jSONObject, (JSONObject) null);
                    } catch (Exception unused) {
                    }
                    C11443k.this.f30970a.clear();
                    C11443k.this.f30970a.addAll(a);
                    return a;
                }
            }, new C11317c<List<Message>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15561a(List<Message> list) {
                    C11443k.this.f30974e = false;
                    if (list == null || list.size() < C11443k.this.f30972c) {
                        C11283p.m33057a();
                        C11283p.m33072a(C11443k.this.f30971b);
                    }
                    C11443k.this.mo27463d(list);
                }
            });
        }
    }

    /* renamed from: f */
    public final Message mo27672f() {
        if (this.f30970a.isEmpty()) {
            return null;
        }
        return (Message) this.f30970a.get(this.f30970a.size() - 1);
    }

    /* renamed from: b */
    public final void mo27667b() {
        if (this.f30977h) {
            C6417a.m20015a().mo15554f(this.f30971b);
        }
    }

    /* renamed from: e */
    public final void mo27671e() {
        if (m33757i() == null) {
            mo27464e(null);
            return;
        }
        C11432j.m33706a();
        if (!this.f30974e) {
            this.f30974e = true;
            C11319e.m33191a(new C11318d<List<Message>>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public List<Message> mo15560a() {
                    Message f = C11443k.this.mo27672f();
                    if (f == null) {
                        return null;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    List<Message> a = C11375q.m33429a().mo27395a(C11443k.this.f30971b, f.getIndex(), C11443k.this.f30972c);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        C11209d.m32830a("im_load_more_msg_duration", jSONObject, (JSONObject) null);
                    } catch (Exception unused) {
                    }
                    return a;
                }
            }, new C11317c<List<Message>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15561a(List<Message> list) {
                    C11443k.this.f30974e = false;
                    if (list == null || list.size() < C11443k.this.f30972c) {
                        C11283p.m33057a();
                        C11283p.m33072a(C11443k.this.f30971b);
                    }
                    C11443k.this.mo27464e(list);
                }
            });
        }
    }

    /* renamed from: h */
    public final void mo27674h() {
        if (C11198c.m32777a().f30373c != null) {
            int[] a = m33748a((List<Message>) this.f30970a);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("receive_no", a[0]);
                jSONObject.put("disordered_no", a[1]);
            } catch (JSONException unused) {
            }
            C11198c.m32777a().f30373c.mo18013a("sdk_enter_chat", jSONObject);
            C11208c.m32815a().mo27256a("message_data_source").mo27258b("wrong_order").mo27257a("total_count", Integer.valueOf(a[0])).mo27257a("count", Integer.valueOf(a[1])).mo27260b();
        }
    }

    /* renamed from: a */
    public final void mo27661a() {
        this.f30976g = null;
        this.f30970a.clear();
        C11407f.m33601a().mo27458b(this);
        if (this.f30979j) {
            C11407f.m33601a().mo27459b(this.f30971b, this.f30980k);
            this.f30980k = null;
        }
        C11379a.m33470a().mo27403a(this.f30978i);
        this.f30978i.clear();
    }

    public C11443k(String str) {
        this(str, true);
    }

    /* renamed from: c */
    public static void m33752c(Message message) {
        C11283p.m33057a();
        C11283p.m33068a(message);
    }

    /* renamed from: d */
    public static void m33753d(Message message) {
        m33754d(message, null);
    }

    /* renamed from: e */
    public static void m33755e(Message message) {
        m33756e(message, null);
    }

    /* renamed from: b */
    private void m33751b(final List<Message> list) {
        C11319e.m33192a(new C11318d<Pair<Boolean, Map<Long, C11468l>>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Pair<Boolean, Map<Long, C11468l>> mo15560a() {
                if (list == null || list.isEmpty()) {
                    return null;
                }
                ArrayList<Message> arrayList = new ArrayList<>(list);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Message message = (Message) it.next();
                    if (message == null || message.isSelf() || TextUtils.isEmpty(message.getConversationId()) || !message.getConversationId().equals(C11443k.this.f30971b)) {
                        it.remove();
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                boolean a = C11443k.this.mo27665a(C11443k.this.f30971b);
                StringBuilder sb = new StringBuilder("updateReadIndexOnGetOtherMsg before update readIndex mReadStatusMap=");
                sb.append(C11403c.f30887a.mo15979b((Object) C11443k.this.f30975f));
                C11404d.m33582a(sb.toString());
                for (Message message2 : arrayList) {
                    long index = message2.getIndex();
                    long orderIndex = message2.getOrderIndex();
                    long sender = message2.getSender();
                    C11404d.m33582a(C1642a.m8034a("updateReadIndexOnGetOtherMsg msg content=%s, readIndex=%s, readOrder=%s", new Object[]{message2.getContent(), String.valueOf(index), String.valueOf(orderIndex)}));
                    C11468l lVar = (C11468l) C11443k.this.f30975f.get(Long.valueOf(sender));
                    if (lVar != null) {
                        if (lVar.mo27680b()) {
                            C11404d.m33582a(C1642a.m8034a("updateReadIndexOnGetOtherMsg readOrder valid content=%s, readIndex=%s, readOrder=%s, oldParticipantIndexInfo=%s", new Object[]{message2.getContent(), String.valueOf(index), String.valueOf(orderIndex), C11403c.f30887a.mo15979b((Object) lVar)}));
                            if (orderIndex > lVar.f31025e) {
                                lVar.mo27679b(index);
                                lVar.mo27681c(orderIndex);
                                C11443k.this.f30975f.put(Long.valueOf(sender), lVar);
                            }
                        } else {
                            C11404d.m33582a(C1642a.m8034a("updateReadIndexOnGetOtherMsg readOrder invalid content=%s, readIndex=%s, readOrder=%s, oldParticipantIndexInfo=%s", new Object[]{message2.getContent(), String.valueOf(index), String.valueOf(orderIndex), C11403c.f30887a.mo15979b((Object) lVar)}));
                            if (index >= lVar.f31024d) {
                                lVar.mo27679b(index);
                                lVar.mo27681c(orderIndex);
                                C11443k.this.f30975f.put(Long.valueOf(sender), lVar);
                            }
                        }
                        a = true;
                    }
                }
                StringBuilder sb2 = new StringBuilder("updateReadIndexOnGetOtherMsg after update readIndex mReadStatusMap=");
                sb2.append(C11403c.f30887a.mo15979b((Object) C11443k.this.f30975f));
                C11404d.m33582a(sb2.toString());
                return new Pair<>(Boolean.valueOf(a), C11443k.this.f30975f);
            }
        }, new C11317c<Pair<Boolean, Map<Long, C11468l>>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(final Pair<Boolean, Map<Long, C11468l>> pair) {
                if (pair != null && ((Boolean) pair.first).booleanValue()) {
                    C11319e.m33192a(new C11318d<Boolean>() {
                        /* access modifiers changed from: private */
                        /* renamed from: b */
                        public Boolean mo15560a() {
                            C11404d.m33582a("updateReadIndexOnGetOtherMsg insertOrUpdateMemberRead");
                            C11370n.m33407a().mo27391a(C11443k.this.f30971b, (Map) pair.second);
                            return Boolean.valueOf(true);
                        }
                    }, null, C11314a.m33185e());
                }
            }
        }, C11314a.m33185e());
    }

    /* renamed from: e */
    public final void mo27464e(List<Message> list) {
        if (list != null && !list.isEmpty()) {
            this.f30970a.appendList(list);
        }
        if (this.f30976g != null) {
            this.f30976g.mo27464e(list);
        }
    }

    /* renamed from: g */
    public final void mo27467g(List<PropertyMsg> list) {
        if (list != null && !list.isEmpty() && this.f30976g != null) {
            this.f30976g.mo27467g(list);
        }
    }

    /* renamed from: c */
    public final void mo27462c(List<Message> list) {
        if (this.f30973d) {
            if (this.f30979j) {
                m33751b(list);
            }
            if (list != null && !list.isEmpty()) {
                this.f30970a.addList(list);
                if (this.f30976g != null) {
                    this.f30976g.mo27462c(list);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo27463d(List<Message> list) {
        if (this.f30976g != null) {
            this.f30976g.mo27463d(list);
        }
        C11319e.m33191a(new C11318d() {
            /* renamed from: a */
            public final Object mo15560a() {
                try {
                    C11443k.this.mo27674h();
                } catch (Exception unused) {
                }
                return null;
            }
        }, null);
    }

    /* renamed from: f */
    public final void mo27466f(List<Message> list) {
        if (list != null && !list.isEmpty()) {
            this.f30970a.updateList(list);
            if (this.f30976g != null) {
                this.f30976g.mo27466f(list);
            }
        }
    }

    /* renamed from: a */
    private int[] m33748a(List<Message> list) {
        if (list == null || list.size() <= 0) {
            return new int[]{0, 0};
        }
        ArrayList<Message> arrayList = new ArrayList<>(list);
        Collections.sort(arrayList, new Comparator<Message>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m33820a((Message) obj, (Message) obj2);
            }

            /* renamed from: a */
            private static int m33820a(Message message, Message message2) {
                if (message.getOrderIndex() > message2.getOrderIndex()) {
                    return 1;
                }
                if (message.getOrderIndex() < message2.getOrderIndex()) {
                    return -1;
                }
                return 0;
            }
        });
        long j = 0;
        int i = 0;
        for (Message message : arrayList) {
            if (j > message.getIndex()) {
                i++;
            }
            j = message.getIndex();
        }
        return new int[]{arrayList.size(), i};
    }

    /* renamed from: b */
    public final void mo27456b(Message message) {
        if (message != null && this.f30976g != null) {
            this.f30970a.update(message);
            this.f30976g.mo27456b(message);
        }
    }

    /* renamed from: a */
    public static void m33745a(Message message, C11195b<Message> bVar) {
        C11283p.m33057a();
        C11283p.m33069a(message, bVar);
    }

    /* renamed from: b */
    public static void m33749b(Message message, C11195b<Message> bVar) {
        C11283p.m33057a();
        C11283p.m33080b(message, bVar);
    }

    private C11443k(String str, boolean z) {
        this(str, true, false);
    }

    /* renamed from: a */
    public static void m33746a(Message message, boolean z) {
        m33750b(message, true, null);
    }

    /* renamed from: d */
    private static void m33754d(final Message message, C11195b<Message> bVar) {
        C11319e.m33191a(new C11318d<Pair<Conversation, Message>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Pair<Conversation, Message> mo15560a() {
                boolean a = C11375q.m33429a().mo27396a(message);
                C11368l.m33375a();
                Conversation a2 = C11368l.m33377a(message.getConversationId());
                if (a2 != null) {
                    C11375q.m33429a();
                    a2.setUnreadCount(C11375q.m33428a(a2.getConversationId(), a2.getReadIndex(), Long.MAX_VALUE, C11198c.m32777a().f30372b.mo27230a()));
                    a2.setUpdatedTime(Math.max(a2.getUpdatedTime(), message.getCreatedAt()));
                    a2.setLastMessageIndex(Math.max(a2.getLastMessageIndex(), message.getIndex()));
                    C11368l.m33375a();
                    C11368l.m33384b(a2);
                }
                if (a) {
                    return new Pair<>(a2, message);
                }
                return null;
            }
        }, new C11317c<Pair<Conversation, Message>>(null) {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Pair<Conversation, Message> pair) {
                int i = -3001;
                if (pair != null) {
                    if (pair.first != null) {
                        C6417a.m20015a().mo15540b((Conversation) pair.first);
                    }
                    if (null != null) {
                        null.mo18089a(message);
                    }
                } else {
                    message.setMsgStatus(3);
                    if (null != null) {
                        null.mo18088a(C11438g.m33713a(C11391e.m33515a(-3001)));
                    }
                }
                C11407f a = C11407f.m33601a();
                if (pair != null) {
                    i = C11204b.f30383a;
                }
                a.mo27455b(i, message);
            }
        });
    }

    /* renamed from: e */
    private static void m33756e(final Message message, C11195b<Message> bVar) {
        C11319e.m33191a(new C11318d<Message>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Message mo15560a() {
                if (C11375q.m33429a().mo27396a(message)) {
                    return message;
                }
                return null;
            }
        }, new C11317c<Message>(null) {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Message message) {
                if (message != null) {
                    C11407f.m33601a().mo27466f(Collections.singletonList(message));
                    if (null != null) {
                        null.mo18089a(message);
                    }
                } else if (null != null) {
                    null.mo18088a(C11438g.m33713a(C11391e.m33515a(-3001)));
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo27446a(int i, PropertyMsg propertyMsg) {
        if (propertyMsg != null && this.f30976g != null) {
            this.f30976g.mo27446a(i, propertyMsg);
        }
    }

    /* renamed from: c */
    public final void mo27669c(final Message message, final C11195b<Pair<List<Long>, List<Long>>> bVar) {
        C11319e.m33192a(new C11318d<Map<Long, C11468l>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Map<Long, C11468l> mo15560a() {
                if (message == null || !message.isSelf() || message.isDeleted() || !C11405e.m33600d(message) || TextUtils.isEmpty(message.getConversationId()) || !message.getConversationId().equals(C11443k.this.f30971b)) {
                    return null;
                }
                if (C11443k.this.f30975f == null || C11443k.this.f30975f.isEmpty()) {
                    C11443k.this.f30975f = C11370n.m33407a().mo27392b(message.getConversationId(), C11443k.this.f30975f);
                    C11404d.m33582a(C1642a.m8034a("getReadAndAllByLocal after loadIndexInfoToMap result=%s", new Object[]{C11403c.f30887a.mo15979b((Object) C11443k.this.f30975f)}));
                }
                return C11443k.this.f30975f;
            }
        }, new C11317c<Map<Long, C11468l>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Map<Long, C11468l> map) {
                if (map != null && !map.isEmpty()) {
                    Pair a = C11443k.this.mo27659a(message, map);
                    if (bVar != null) {
                        bVar.mo18089a(a);
                    }
                } else if (bVar != null) {
                    bVar.mo18089a(new Pair(Collections.emptyList(), Collections.emptyList()));
                }
            }
        }, C11314a.m33185e());
    }

    /* renamed from: a */
    private void m33747a(C11439h hVar, boolean z) {
        this.f30976g = hVar;
        C11407f.m33601a().mo27450a(this);
        C6417a.m20015a();
        C6417a.m20026d(this.f30971b);
        if (this.f30979j) {
            C11407f.m33601a().mo27451a(this.f30971b, this.f30980k);
        }
    }

    /* renamed from: b */
    public final void mo27455b(int i, Message message) {
        if (this.f30973d) {
            if (message != null) {
                this.f30970a.add(message);
                if (this.f30970a.size() > 3000) {
                    this.f30970a = new MessageSortedList(this.f30970a.subList(0, 3000));
                }
            }
            if (this.f30976g != null) {
                this.f30976g.mo27455b(i, message);
            }
        }
    }

    /* renamed from: a */
    public final Pair<Boolean, Map<Long, C11468l>> mo27660a(String str, List<ParticipantReadIndex> list) {
        long j;
        long j2;
        List<ParticipantReadIndex> list2 = list;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        boolean a = mo27665a(str);
        if (this.f30975f != null && !this.f30975f.isEmpty() && list2 != null && !list.isEmpty()) {
            int size = list.size();
            boolean z = a;
            for (int i = 0; i < size; i++) {
                ParticipantReadIndex participantReadIndex = (ParticipantReadIndex) list2.get(i);
                if (participantReadIndex != null) {
                    long j3 = 0;
                    if (participantReadIndex.user_id != null) {
                        j = participantReadIndex.user_id.longValue();
                    } else {
                        j = 0;
                    }
                    if (participantReadIndex.index != null) {
                        j2 = participantReadIndex.index.longValue();
                    } else {
                        j2 = 0;
                    }
                    C11375q.m33429a();
                    Message a2 = C11375q.m33432a(str, j2);
                    if (a2 != null) {
                        j3 = a2.getOrderIndex();
                    }
                    C11468l lVar = (C11468l) this.f30975f.get(Long.valueOf(j));
                    if (lVar != null) {
                        if (a2 != null) {
                            C11404d.m33582a(C1642a.m8034a("updateReadIndex found msg by readIndex=%s, readOrder=%s, mapIndexInfo=%s", new Object[]{String.valueOf(j2), String.valueOf(j3), C11403c.f30887a.mo15979b((Object) lVar)}));
                            if (j3 > lVar.f31025e) {
                                lVar.mo27679b(j2);
                                lVar.mo27681c(j3);
                            }
                        } else {
                            C11404d.m33582a(C1642a.m8034a("updateReadIndex not found msg by readIndex=%s, mapIndexInfo=%s", new Object[]{String.valueOf(j2), C11403c.f30887a.mo15979b((Object) lVar)}));
                            if (j2 > lVar.f31024d) {
                                lVar.mo27679b(j2);
                                lVar.mo27676a();
                            }
                        }
                        z = true;
                    }
                } else {
                    String str2 = str;
                }
            }
            a = z;
        }
        return new Pair<>(Boolean.valueOf(a), this.f30975f);
    }

    /* renamed from: b */
    public final Pair<Boolean, Map<Long, C11468l>> mo27666b(String str, List<ParticipantMinIndex> list) {
        long j;
        long j2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        boolean a = mo27665a(str);
        if (this.f30975f != null && !this.f30975f.isEmpty()) {
            HashSet hashSet = new HashSet();
            if (list != null && !list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ParticipantMinIndex participantMinIndex = (ParticipantMinIndex) list.get(i);
                    if (participantMinIndex != null) {
                        if (participantMinIndex.user_id != null) {
                            j = participantMinIndex.user_id.longValue();
                        } else {
                            j = 0;
                        }
                        if (participantMinIndex.index != null) {
                            j2 = participantMinIndex.index.longValue();
                        } else {
                            j2 = Long.MIN_VALUE;
                        }
                        hashSet.add(Long.valueOf(j));
                        if (this.f30975f.get(Long.valueOf(j)) != null && j2 > ((C11468l) this.f30975f.get(Long.valueOf(j))).f31023c) {
                            ((C11468l) this.f30975f.get(Long.valueOf(j))).mo27677a(j2);
                            a = true;
                        }
                    }
                }
            }
        }
        return new Pair<>(Boolean.valueOf(a), this.f30975f);
    }

    /* renamed from: a */
    public final Pair<List<Long>, List<Long>> mo27659a(Message message, Map<Long, C11468l> map) {
        String str;
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (message != null && !TextUtils.isEmpty(message.getConversationId()) && message.getConversationId().equals(this.f30971b) && map != null && !map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                if (!(entry == null || entry.getValue() == null || ((C11468l) entry.getValue()).f31022b == C11198c.m32777a().f30372b.mo27230a() || Math.abs(((C11468l) entry.getValue()).f31023c) > message.getIndex())) {
                    arrayList2.add(Long.valueOf(((C11468l) entry.getValue()).f31022b));
                    if (!message.isIndexLocal() && (((C11468l) entry.getValue()).f31025e >= message.getOrderIndex() || (((C11468l) entry.getValue()).f31024d >= message.getIndex() && !((C11468l) entry.getValue()).mo27680b()))) {
                        arrayList.add(Long.valueOf(((C11468l) entry.getValue()).f31022b));
                    }
                }
            }
        }
        Pair<List<Long>, List<Long>> pair = new Pair<>(arrayList, arrayList2);
        String str2 = "getReadAndAllMemberIds selfMsg content=%s, index=%s, order=%s, readStatusMap=%s, resultPair=%s";
        Object[] objArr = new Object[5];
        if (message != null) {
            str = message.getContent();
        } else {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        objArr[0] = str;
        if (message != null) {
            obj = Long.valueOf(message.getIndex());
        } else {
            obj = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        objArr[1] = obj;
        if (message != null) {
            obj2 = Long.valueOf(message.getOrderIndex());
        } else {
            obj2 = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        objArr[2] = obj2;
        objArr[3] = C11403c.f30887a.mo15979b((Object) map);
        objArr[4] = C11403c.f30887a.mo15979b((Object) pair);
        C11404d.m33582a(C1642a.m8034a(str2, objArr));
        return pair;
    }

    /* renamed from: a */
    public final void mo27445a(int i, Message message) {
        if (this.f30973d) {
            if (message != null && i == C11204b.f30383a) {
                this.f30970a.add(message);
                if (this.f30970a.size() > 3000) {
                    this.f30970a = new MessageSortedList(this.f30970a.subList(0, 3000));
                }
            }
            if (this.f30976g != null) {
                this.f30976g.mo27445a(i, message);
            }
        }
    }

    /* renamed from: b */
    private static void m33750b(Message message, boolean z, C11195b<Message> bVar) {
        C11283p.m33057a();
        C11283p.m33070a(message, z, null);
    }

    public C11443k(String str, boolean z, boolean z2) {
        this.f30970a = new MessageSortedList();
        this.f30972c = 50;
        this.f30977h = true;
        this.f30973d = true;
        this.f30978i = new ArrayList();
        this.f30979j = false;
        this.f30975f = new HashMap();
        this.f30981l = 0;
        this.f30971b = str;
        this.f30977h = z;
        this.f30979j = z2;
        if (this.f30979j) {
            C11404d.m33582a("MessageModel enter conversation request minIndex");
            mo27664a(this.f30971b, (Message) null, null);
            this.f30980k = new C11436d() {
                /* renamed from: f */
                public final void mo27465f(Conversation conversation) {
                    if (conversation != null && !TextUtils.isEmpty(conversation.getConversationId()) && conversation.getConversationId().equals(C11443k.this.f30971b)) {
                        C11404d.m33582a("MessageModel onMemberChange");
                        C11443k.this.mo27664a(C11443k.this.f30971b, (Message) null, null);
                    }
                }
            };
        }
    }
}
