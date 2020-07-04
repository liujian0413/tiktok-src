package com.p280ss.android.ugc.aweme.comment;

import android.support.p022v4.content.C0683b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.comment.list.C24182h;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.param.C24199a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.m */
public final class C24191m implements C24182h {

    /* renamed from: a */
    public static final C24191m f63849a = new C24191m();

    /* renamed from: b */
    private static final Map<String, C24192a> f63850b = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.comment.m$a */
    public static final class C24192a {

        /* renamed from: a */
        public final int f63851a;

        /* renamed from: b */
        public final Comment f63852b;

        /* renamed from: c */
        public final int f63853c;

        /* renamed from: d */
        public final C24199a f63854d;

        /* renamed from: e */
        public final int f63855e;

        /* renamed from: f */
        public final Comment f63856f;

        public C24192a() {
            this(0, null, 0, null, 0, null, 63, null);
        }

        /* renamed from: a */
        private static C24192a m79497a(int i, Comment comment, int i2, C24199a aVar, int i3, Comment comment2) {
            C24192a aVar2 = new C24192a(i, comment, i2, aVar, i3, comment2);
            return aVar2;
        }

        /* renamed from: a */
        public static /* synthetic */ C24192a m79498a(C24192a aVar, int i, Comment comment, int i2, C24199a aVar2, int i3, Comment comment2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = aVar.f63851a;
            }
            if ((i4 & 2) != 0) {
                comment = aVar.f63852b;
            }
            Comment comment3 = comment;
            if ((i4 & 4) != 0) {
                i2 = aVar.f63853c;
            }
            int i5 = i2;
            if ((i4 & 8) != 0) {
                aVar2 = aVar.f63854d;
            }
            C24199a aVar3 = aVar2;
            if ((i4 & 16) != 0) {
                i3 = aVar.f63855e;
            }
            int i6 = i3;
            if ((i4 & 32) != 0) {
                comment2 = aVar.f63856f;
            }
            return m79497a(i, comment3, i5, aVar3, i6, comment2);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommentPostingStatus(status=");
            sb.append(this.f63851a);
            sb.append(", comment=");
            sb.append(this.f63852b);
            sb.append(", position=");
            sb.append(this.f63853c);
            sb.append(", params=");
            sb.append(this.f63854d);
            sb.append(", requestType=");
            sb.append(this.f63855e);
            sb.append(", replyComment=");
            sb.append(this.f63856f);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = this.f63851a * 31;
            Comment comment = this.f63852b;
            int i4 = 0;
            if (comment != null) {
                i = comment.hashCode();
            } else {
                i = 0;
            }
            int i5 = (((i3 + i) * 31) + this.f63853c) * 31;
            C24199a aVar = this.f63854d;
            if (aVar != null) {
                i2 = aVar.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (((i5 + i2) * 31) + this.f63855e) * 31;
            Comment comment2 = this.f63856f;
            if (comment2 != null) {
                i4 = comment2.hashCode();
            }
            return i6 + i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24192a)) {
                return false;
            }
            C24192a aVar = (C24192a) obj;
            if (this.f63851a == aVar.f63851a && !(!C7573i.m23585a((Object) this.f63852b, (Object) aVar.f63852b)) && this.f63853c == aVar.f63853c && !(!C7573i.m23585a((Object) this.f63854d, (Object) aVar.f63854d)) && this.f63855e == aVar.f63855e && !(!C7573i.m23585a((Object) this.f63856f, (Object) aVar.f63856f))) {
                return true;
            }
            return false;
        }

        private C24192a(int i, Comment comment, int i2, C24199a aVar, int i3, Comment comment2) {
            this.f63851a = i;
            this.f63852b = comment;
            this.f63853c = i2;
            this.f63854d = aVar;
            this.f63855e = i3;
            this.f63856f = comment2;
        }

        public /* synthetic */ C24192a(int i, Comment comment, int i2, C24199a aVar, int i3, Comment comment2, int i4, C7571f fVar) {
            int i5;
            Comment comment3;
            int i6;
            C24199a aVar2;
            Comment comment4;
            int i7 = -1;
            if ((i4 & 1) != 0) {
                i5 = -1;
            } else {
                i5 = i;
            }
            if ((i4 & 2) != 0) {
                comment3 = null;
            } else {
                comment3 = comment;
            }
            if ((i4 & 4) != 0) {
                i6 = -1;
            } else {
                i6 = i2;
            }
            if ((i4 & 8) != 0) {
                aVar2 = null;
            } else {
                aVar2 = aVar;
            }
            if ((i4 & 16) == 0) {
                i7 = i3;
            }
            if ((i4 & 32) != 0) {
                comment4 = null;
            } else {
                comment4 = comment2;
            }
            this(i5, comment3, i6, aVar2, i7, comment4);
        }
    }

    private C24191m() {
    }

    /* renamed from: a */
    public static String m79478a() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(UUID.randomUUID());
        return sb.toString();
    }

    /* renamed from: h */
    public final void mo62637h(Comment comment) {
        if (comment != null) {
            f63850b.remove(comment.getFakeId());
        }
    }

    /* renamed from: b */
    public static boolean m79482b(Comment comment) {
        if (comment == null) {
            return false;
        }
        C24192a aVar = (C24192a) f63850b.get(comment.getFakeId());
        if (aVar == null || aVar.f63851a != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static C24199a m79484j(Comment comment) {
        if (comment == null) {
            return null;
        }
        C24192a aVar = (C24192a) f63850b.get(comment.getFakeId());
        if (aVar != null) {
            return aVar.f63854d;
        }
        return null;
    }

    /* renamed from: e */
    public final boolean mo62635e(Comment comment) {
        if (comment == null) {
            return false;
        }
        C24192a aVar = (C24192a) f63850b.get(comment.getFakeId());
        if (aVar == null || aVar.f63851a != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final int mo62638i(Comment comment) {
        if (comment == null) {
            return -1;
        }
        C24192a aVar = (C24192a) f63850b.get(comment.getFakeId());
        if (aVar != null) {
            return aVar.f63853c;
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo62639k(Comment comment) {
        if (comment == null) {
            return -1;
        }
        C24192a aVar = (C24192a) f63850b.get(comment.getFakeId());
        if (aVar != null) {
            return aVar.f63855e;
        }
        return -1;
    }

    /* renamed from: m */
    public final Comment mo62641m(Comment comment) {
        if (comment == null) {
            return null;
        }
        C24192a aVar = (C24192a) f63850b.get(comment.getFakeId());
        if (aVar != null) {
            return aVar.f63856f;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r11 == null) goto L_0x002c;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m79483f(com.p280ss.android.ugc.aweme.comment.model.Comment r11) {
        /*
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r0 = f63850b
            java.lang.String r1 = r11.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r2 = f63850b
            java.lang.String r11 = r11.getFakeId()
            java.lang.Object r11 = r2.get(r11)
            r2 = r11
            com.ss.android.ugc.aweme.comment.m$a r2 = (com.p280ss.android.ugc.aweme.comment.C24191m.C24192a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            com.ss.android.ugc.aweme.comment.m$a r11 = com.p280ss.android.ugc.aweme.comment.C24191m.C24192a.m79498a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.m$a r11 = new com.ss.android.ugc.aweme.comment.m$a
            r3 = 3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.C24191m.m79483f(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r12 == null) goto L_0x002c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62633c(com.p280ss.android.ugc.aweme.comment.model.Comment r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r0 = f63850b
            java.lang.String r1 = r12.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r2 = f63850b
            java.lang.String r12 = r12.getFakeId()
            java.lang.Object r12 = r2.get(r12)
            r2 = r12
            com.ss.android.ugc.aweme.comment.m$a r2 = (com.p280ss.android.ugc.aweme.comment.C24191m.C24192a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            com.ss.android.ugc.aweme.comment.m$a r12 = com.p280ss.android.ugc.aweme.comment.C24191m.C24192a.m79498a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.m$a r12 = new com.ss.android.ugc.aweme.comment.m$a
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.C24191m.mo62633c(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r12 == null) goto L_0x002c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62634d(com.p280ss.android.ugc.aweme.comment.model.Comment r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r0 = f63850b
            java.lang.String r1 = r12.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r2 = f63850b
            java.lang.String r12 = r12.getFakeId()
            java.lang.Object r12 = r2.get(r12)
            r2 = r12
            com.ss.android.ugc.aweme.comment.m$a r2 = (com.p280ss.android.ugc.aweme.comment.C24191m.C24192a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            com.ss.android.ugc.aweme.comment.m$a r12 = com.p280ss.android.ugc.aweme.comment.C24191m.C24192a.m79498a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.m$a r12 = new com.ss.android.ugc.aweme.comment.m$a
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.C24191m.mo62634d(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r12 == null) goto L_0x002c;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62636g(com.p280ss.android.ugc.aweme.comment.model.Comment r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r0 = f63850b
            java.lang.String r1 = r12.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r2 = f63850b
            java.lang.String r12 = r12.getFakeId()
            java.lang.Object r12 = r2.get(r12)
            r2 = r12
            com.ss.android.ugc.aweme.comment.m$a r2 = (com.p280ss.android.ugc.aweme.comment.C24191m.C24192a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 4
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            com.ss.android.ugc.aweme.comment.m$a r12 = com.p280ss.android.ugc.aweme.comment.C24191m.C24192a.m79498a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.m$a r12 = new com.ss.android.ugc.aweme.comment.m$a
            r3 = 4
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.C24191m.mo62636g(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    /* renamed from: l */
    public final void mo62640l(Comment comment) {
        boolean z;
        if (comment != null) {
            C24192a aVar = (C24192a) f63850b.get(comment.getFakeId());
            if (aVar != null) {
                Comment comment2 = aVar.f63852b;
                CharSequence replyToUserId = comment.getReplyToUserId();
                boolean z2 = false;
                if (replyToUserId == null || replyToUserId.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && comment2 != null) {
                    CharSequence replyToUserId2 = comment2.getReplyToUserId();
                    if (replyToUserId2 == null || replyToUserId2.length() == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        comment.setReplyToUserId(comment2.getReplyToUserId());
                    }
                }
                Map<String, C24192a> map = f63850b;
                String fakeId = comment.getFakeId();
                C7573i.m23582a((Object) fakeId, "comment.fakeId");
                map.put(fakeId, C24192a.m79498a(aVar, 0, comment, 0, null, 0, null, 61, null));
                return;
            }
            Map<String, C24192a> map2 = f63850b;
            String fakeId2 = comment.getFakeId();
            C7573i.m23582a((Object) fakeId2, "comment.fakeId");
            C24192a aVar2 = new C24192a(0, comment, 0, null, 0, null, 61, null);
            map2.put(fakeId2, aVar2);
        }
    }

    /* renamed from: a */
    public final boolean mo62632a(Comment comment) {
        if (comment == null) {
            return false;
        }
        C24192a aVar = (C24192a) f63850b.get(comment.getFakeId());
        if (aVar == null) {
            return false;
        }
        int i = aVar.f63851a;
        if (1 <= i && 3 >= i && aVar.f63853c >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r11 == null) goto L_0x002c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m79481b(com.p280ss.android.ugc.aweme.comment.model.Comment r11, int r12) {
        /*
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r0 = f63850b
            java.lang.String r1 = r11.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r2 = f63850b
            java.lang.String r11 = r11.getFakeId()
            java.lang.Object r11 = r2.get(r11)
            r2 = r11
            com.ss.android.ugc.aweme.comment.m$a r2 = (com.p280ss.android.ugc.aweme.comment.C24191m.C24192a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 47
            r10 = 0
            r7 = r12
            com.ss.android.ugc.aweme.comment.m$a r11 = com.p280ss.android.ugc.aweme.comment.C24191m.C24192a.m79498a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.m$a r11 = new com.ss.android.ugc.aweme.comment.m$a
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 47
            r10 = 0
            r2 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.C24191m.m79481b(com.ss.android.ugc.aweme.comment.model.Comment, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r12 == null) goto L_0x002c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62630a(com.p280ss.android.ugc.aweme.comment.model.Comment r12, int r13) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r0 = f63850b
            java.lang.String r1 = r12.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r2 = f63850b
            java.lang.String r12 = r12.getFakeId()
            java.lang.Object r12 = r2.get(r12)
            r2 = r12
            com.ss.android.ugc.aweme.comment.m$a r2 = (com.p280ss.android.ugc.aweme.comment.C24191m.C24192a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 59
            r10 = 0
            r5 = r13
            com.ss.android.ugc.aweme.comment.m$a r12 = com.p280ss.android.ugc.aweme.comment.C24191m.C24192a.m79498a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.m$a r12 = new com.ss.android.ugc.aweme.comment.m$a
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 59
            r10 = 0
            r2 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.C24191m.mo62630a(com.ss.android.ugc.aweme.comment.model.Comment, int):void");
    }

    /* renamed from: a */
    public static void m79479a(Comment comment, DmtTextView dmtTextView) {
        if (comment != null && dmtTextView != null) {
            C24192a aVar = (C24192a) f63850b.get(comment.getFakeId());
            if (aVar != null) {
                switch (aVar.f63851a) {
                    case 2:
                        dmtTextView.setVisibility(0);
                        dmtTextView.setTextColor(C0683b.m2912c(C6399b.m19921a(), R.color.lo));
                        dmtTextView.setText(R.string.a9d);
                        return;
                    case 3:
                        dmtTextView.setVisibility(0);
                        dmtTextView.setTextColor(C0683b.m2912c(C6399b.m19921a(), R.color.abl));
                        dmtTextView.setText(R.string.a9c);
                        return;
                }
            }
            dmtTextView.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (r11 == null) goto L_0x0031;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m79480a(com.p280ss.android.ugc.aweme.comment.model.Comment r11, com.p280ss.android.ugc.aweme.comment.param.C24199a r12) {
        /*
            java.lang.String r0 = "params"
            kotlin.jvm.internal.C7573i.m23587b(r12, r0)
            if (r11 != 0) goto L_0x0008
            return
        L_0x0008:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r0 = f63850b
            java.lang.String r1 = r11.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r2 = f63850b
            java.lang.String r11 = r11.getFakeId()
            java.lang.Object r11 = r2.get(r11)
            r2 = r11
            com.ss.android.ugc.aweme.comment.m$a r2 = (com.p280ss.android.ugc.aweme.comment.C24191m.C24192a) r2
            if (r2 == 0) goto L_0x0031
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 55
            r10 = 0
            r6 = r12
            com.ss.android.ugc.aweme.comment.m$a r11 = com.p280ss.android.ugc.aweme.comment.C24191m.C24192a.m79498a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 != 0) goto L_0x0040
        L_0x0031:
            com.ss.android.ugc.aweme.comment.m$a r11 = new com.ss.android.ugc.aweme.comment.m$a
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 55
            r10 = 0
            r2 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0040:
            r0.put(r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.C24191m.m79480a(com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.comment.param.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r12 == null) goto L_0x002c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62631a(com.p280ss.android.ugc.aweme.comment.model.Comment r12, com.p280ss.android.ugc.aweme.comment.model.Comment r13) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r0 = f63850b
            java.lang.String r1 = r12.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.m$a> r2 = f63850b
            java.lang.String r12 = r12.getFakeId()
            java.lang.Object r12 = r2.get(r12)
            r2 = r12
            com.ss.android.ugc.aweme.comment.m$a r2 = (com.p280ss.android.ugc.aweme.comment.C24191m.C24192a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 31
            r10 = 0
            r8 = r13
            com.ss.android.ugc.aweme.comment.m$a r12 = com.p280ss.android.ugc.aweme.comment.C24191m.C24192a.m79498a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.m$a r12 = new com.ss.android.ugc.aweme.comment.m$a
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 31
            r10 = 0
            r2 = r12
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.C24191m.mo62631a(com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.comment.model.Comment):void");
    }
}
