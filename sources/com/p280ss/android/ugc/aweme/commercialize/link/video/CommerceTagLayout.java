package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout */
public class CommerceTagLayout extends FrameLayout {

    /* renamed from: a */
    private C24814k f65311a;

    /* renamed from: a */
    public final void mo64846a() {
        removeAllViews();
        this.f65311a = null;
    }

    /* renamed from: b */
    public final void mo64848b() {
        if (this.f65311a != null) {
            this.f65311a.mo64855a();
        }
    }

    /* renamed from: c */
    public final void mo64849c() {
        if (this.f65311a != null) {
            this.f65311a.mo64858b();
        }
    }

    public CommerceTagLayout(Context context) {
        super(context);
    }

    public CommerceTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo64847a(LinkData linkData, C24815l lVar) {
        if (C6399b.m19944t()) {
            switch (linkData.feedShowType) {
                case 1:
                    this.f65311a = new I18nWeakLinkContent(getContext());
                    break;
                case 2:
                    this.f65311a = new I18nStrongLinkContent(getContext());
                    break;
                default:
                    this.f65311a = new C24805b(getContext());
                    break;
            }
        } else {
            int i = linkData.feedShowType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        this.f65311a = new WeakLinkContent(getContext());
                        break;
                    case 2:
                        this.f65311a = new StrongLinkContent(getContext());
                        break;
                    default:
                        this.f65311a = new C24816m(getContext());
                        break;
                }
            } else {
                this.f65311a = new PendantLinkContent(getContext());
            }
        }
        this.f65311a.setLinkTagCallBack(lVar);
        this.f65311a.mo64857a(linkData, lVar, this);
        removeAllViews();
        addView(this.f65311a.mo64859c());
    }

    public CommerceTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
