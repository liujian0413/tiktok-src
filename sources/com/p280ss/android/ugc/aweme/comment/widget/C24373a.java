package com.p280ss.android.ugc.aweme.comment.widget;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.comment.list.C24187m;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24032d;
import com.p280ss.android.ugc.aweme.comment.p1100g.C24135a;
import com.p280ss.android.ugc.aweme.comment.p1100g.C24136b;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24148e;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24161j;
import com.p280ss.android.ugc.aweme.comment.p1103ui.C24341w;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentTranslationStatusView;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.a */
public final class C24373a implements C0053p<C24032d>, C24187m {

    /* renamed from: a */
    private Context f64334a;

    /* renamed from: b */
    private C24341w f64335b;

    /* renamed from: c */
    private C24341w f64336c;

    /* renamed from: d */
    private Comment f64337d;

    /* renamed from: e */
    private CommentTranslationStatusView f64338e;

    /* renamed from: f */
    private C24135a f64339f = C24135a.m79312a();

    /* renamed from: b */
    public final void mo62645b() {
        if (this.f64337d != null) {
            this.f64339f.mo62559a(this.f64337d);
        }
    }

    /* renamed from: a */
    public final void mo62644a() {
        if (this.f64337d != null) {
            C24136b a = m80092a(this.f64337d, ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage());
            if (a != null) {
                this.f64339f.mo62560a(this.f64337d, a, this.f64338e);
            }
        }
    }

    public C24373a(Context context) {
        this.f64334a = context;
    }

    /* renamed from: a */
    private void m80095a(Exception exc) {
        this.f64338e.setLoading(false);
        if (exc != null) {
            C22814a.m75244a(this.f64334a, (Throwable) exc);
        }
    }

    /* renamed from: b */
    private void m80096b(Comment comment) {
        this.f64338e.setLoading(false);
        this.f64335b.mo63237a(C24148e.m79332a(comment), C24148e.m79344b(comment));
        List replyComments = comment.getReplyComments();
        if (comment.getCommentType() == 0 && this.f64336c != null && !C6307b.m19566a((Collection<T>) replyComments)) {
            Comment comment2 = (Comment) replyComments.get(0);
            this.f64336c.mo63237a(C24148e.m79332a(comment2), C24148e.m79344b(comment2));
        }
    }

    /* renamed from: a */
    private static String m80093a(Comment comment) {
        String a = C24148e.m79336a(comment, false);
        if (TextUtils.isEmpty(a)) {
            return "";
        }
        boolean[] zArr = new boolean[a.length()];
        for (TextExtraStruct textExtraStruct : comment.getTextExtra()) {
            for (int max = Math.max(0, textExtraStruct.getStart()); max < Math.min(a.length(), textExtraStruct.getEnd()); max++) {
                zArr[max] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (!zArr[i]) {
                sb.append(a.charAt(i));
            }
        }
        return C24161j.m79369a(sb.toString().trim());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C24032d dVar) {
        if (dVar != null && dVar.f63546a != null) {
            Activity a = C23487o.m77130a(this.f64334a);
            if (a != null && !a.isFinishing()) {
                Comment comment = dVar.f63546a;
                if (dVar.f63547b) {
                    m80096b(comment);
                } else {
                    m80095a(dVar.f63548c);
                }
            }
        }
    }

    /* renamed from: a */
    private C24136b m80092a(Comment comment, String str) {
        C24136b bVar = new C24136b();
        String a = m80093a(comment);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        bVar.mo62566a(a);
        if (comment.getCommentType() == 0 && !C6307b.m19566a((Collection<T>) comment.getReplyComments())) {
            bVar.mo62566a(m80093a((Comment) comment.getReplyComments().get(0)));
        }
        bVar.f63798b = str;
        return bVar;
    }

    /* renamed from: a */
    public final void mo63296a(Context context, Comment comment, C24341w wVar, C24341w wVar2, CommentTranslationStatusView commentTranslationStatusView) {
        if (comment == null || comment.isTranslated() || !C6399b.m19944t() || commentTranslationStatusView == null) {
            if (commentTranslationStatusView != null) {
                commentTranslationStatusView.setVisibility(8);
            }
            return;
        }
        if (this.f64337d != null) {
            C24135a.m79311a(this.f64337d.getCid()).removeObserver(this);
        }
        this.f64334a = context;
        this.f64337d = comment;
        this.f64335b = wVar;
        this.f64336c = wVar2;
        this.f64338e = commentTranslationStatusView;
        C0043i a = this.f64335b.mo63236a();
        if (a == null) {
            C24135a.m79311a(this.f64337d.getCid()).mo60163a(this, false);
        } else {
            C24135a.m79311a(this.f64337d.getCid()).mo60162a(a, this, false);
        }
        this.f64338e.setLoading(this.f64339f.mo62564b(this.f64337d));
        this.f64339f.mo62564b(this.f64337d);
    }
}
