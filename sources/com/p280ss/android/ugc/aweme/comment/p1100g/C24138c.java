package com.p280ss.android.ugc.aweme.comment.p1100g;

import com.bytedance.common.utility.collection.C6307b;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24032d;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24148e;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24161j;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.translation.api.TranslationApi;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42617a;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42620c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.comment.g.c */
public final class C24138c implements Runnable {

    /* renamed from: a */
    public Comment f63801a;

    /* renamed from: b */
    private C24136b f63802b;

    public final void run() {
        try {
            C18246h.m60214a(TranslationApi.m135413a(this.f63802b.f63798b, new C6600e().mo15979b((Object) this.f63802b.f63797a), 2), (C18245g<? super V>) new C18245g<C42617a>() {
                public final void onFailure(Throwable th) {
                    C24138c.this.mo62568a(th);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(C42617a aVar) {
                    List<C42620c> list = aVar.f110768a;
                    if (!C6307b.m19566a((Collection<T>) list)) {
                        C24138c.this.mo62567a((C42620c) list.get(0), false);
                        if (list.size() > 1) {
                            C24138c.this.mo62567a((C42620c) list.get(1), true);
                        }
                        C24138c.this.f63801a.setTranslated(true);
                        C24135a.m79312a().mo62561a(C24138c.this.f63801a, false);
                        C24135a.m79312a().mo62565c(C24138c.this.f63801a);
                        C24135a.m79312a();
                        C24135a.m79311a(C24138c.this.f63801a.getCid()).setValue(new C24032d(C24138c.this.f63801a, true, null));
                    }
                }
            }, (Executor) C23364n.f61448a);
        } catch (Exception unused) {
            mo62568a(new Exception());
        }
    }

    /* renamed from: a */
    public final void mo62568a(Throwable th) {
        C24135a.m79312a().mo62561a(this.f63801a, false);
        C24032d dVar = new C24032d(this.f63801a, false, null);
        if (th instanceof Exception) {
            dVar.f63548c = (Exception) th;
        }
        C24135a.m79312a();
        C24135a.m79311a(this.f63801a.getCid()).setValue(dVar);
    }

    public C24138c(Comment comment, C24136b bVar) {
        this.f63801a = comment;
        this.f63802b = bVar;
    }

    /* renamed from: a */
    public final void mo62567a(C42620c cVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String b = C24161j.m79370b(cVar.f110775a);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b);
        sb2.append(" ");
        sb.append(sb2.toString());
        Comment comment = this.f63801a;
        if (z) {
            List replyComments = this.f63801a.getReplyComments();
            if (C6307b.m19566a((Collection<T>) replyComments)) {
                mo62568a(new Exception());
            } else {
                comment = (Comment) replyComments.get(0);
            }
        }
        for (int i = 0; i < comment.getTextExtra().size(); i++) {
            TextExtraStruct textExtraStruct = (TextExtraStruct) comment.getTextExtra().get(i);
            int min = Math.min(Math.max(textExtraStruct.getStart(), 0), C24148e.m79351e(comment).length());
            int min2 = Math.min(textExtraStruct.getEnd(), C24148e.m79351e(comment).length());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C24148e.m79351e(comment).substring(min, min2));
            sb3.append(" ");
            String sb4 = sb3.toString();
            sb.append(sb4);
            TextExtraStruct clone = textExtraStruct.clone();
            int length = sb4.length();
            if (i == 0) {
                clone.setStart(b.length());
            } else {
                clone.setStart(((TextExtraStruct) arrayList.get(i - 1)).getEnd() + 1);
            }
            clone.setEnd(clone.getStart() + length);
            arrayList.add(clone);
        }
        m79322a(sb.toString(), arrayList, z);
    }

    /* renamed from: a */
    private void m79322a(String str, List<TextExtraStruct> list, boolean z) {
        Comment comment = this.f63801a;
        if (z && !C6307b.m19566a((Collection<T>) this.f63801a.getReplyComments())) {
            comment = (Comment) this.f63801a.getReplyComments().get(0);
        }
        comment.setText(str);
        comment.setTextExtra(list);
    }
}
