package com.p280ss.android.ugc.aweme.story.model;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.p1063g.C23343a;
import com.p280ss.android.ugc.aweme.base.p1063g.C23345c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.story.C33067a;
import com.p280ss.android.ugc.aweme.main.story.C33069b;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.story.C41985c;
import com.p280ss.android.ugc.aweme.story.model.C42005d.C42006a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.story.model.c */
public final class C42002c extends C23343a<C42005d> {

    /* renamed from: a */
    public List<String> f109105a = new ArrayList();

    /* renamed from: b */
    public List<Story> f109106b = new ArrayList();

    /* renamed from: c */
    public boolean f109107c = true;

    /* renamed from: d */
    private Map<String, C42000a> f109108d = new HashMap();

    /* renamed from: e */
    private int f109109e = 3;

    /* renamed from: f */
    private C33069b f109110f;

    /* renamed from: b */
    public final int mo103182b() {
        return this.f109105a.size();
    }

    /* renamed from: a */
    public final void mo103179a(C42005d dVar) {
        mo60638a();
        mo60640a(dVar);
    }

    /* renamed from: a */
    public final C42000a mo103177a(String str) {
        return (C42000a) this.f109108d.get(str);
    }

    /* renamed from: a */
    public final String mo103178a(int i) {
        return (String) this.f109105a.get(i);
    }

    /* renamed from: a */
    private static StoryDetail m133537a(Story story, String str) {
        StoryDetail storyDetail = new StoryDetail();
        storyDetail.setRequestId(str);
        List awemes = story.getAwemes();
        int size = awemes.size();
        for (int i = 0; i < size; i++) {
            Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) awemes.get(i));
            IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
            StringBuilder sb = new StringBuilder();
            sb.append(updateAweme.getAid());
            sb.append(8000);
            iRequestIdService.setRequestIdAndIndex(sb.toString(), str, i);
            awemes.set(i, updateAweme);
        }
        storyDetail.setAwemeList(awemes);
        return storyDetail;
    }

    /* renamed from: a */
    private void m133538a(List<Story> list, String str) {
        String str2;
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (Story story : list) {
                if (story != null && !story.isStory()) {
                    if ((!story.isLive() || C41983b.m133444a()) && (!story.isNewLiveType() || C7213d.m22500a().mo18768af())) {
                        if (story.isFollowing() && C41985c.m133446a().mo103105a(story.getUid())) {
                            story.setRead();
                        }
                        if (story.isLive()) {
                            str2 = story.getLiveUid();
                            this.f109106b.add(story);
                        } else {
                            str2 = story.getUserInfo().getUid();
                        }
                        StoryDetail storyDetail = null;
                        if (story.isFollowing() && story.getAwemes() != null) {
                            storyDetail = m133537a(story, str);
                        }
                        this.f109105a.add(str2);
                        this.f109108d.put(str2, new C42000a(story, storyDetail));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo103180a(boolean z, StoryResponse storyResponse) {
        if (!z) {
            this.f109105a.clear();
            this.f109106b.clear();
            String curUserId = C21115b.m71197a().getCurUserId();
            C42000a aVar = (C42000a) this.f109108d.get(curUserId);
            this.f109108d.clear();
            if (aVar != null) {
                this.f109108d.put(curUserId, aVar);
            }
        }
        m133538a(storyResponse.getStoryFeed(), storyResponse.getRequestId());
    }

    /* renamed from: a */
    public final void mo103181a(boolean z, boolean z2) {
        m133539a(true, z, z2);
    }

    /* renamed from: a */
    private void m133539a(boolean z, final boolean z2, boolean z3) {
        int i;
        if (!z2 || this.f109107c) {
            if (this.f109110f == null) {
                if (z3) {
                    i = 1;
                } else {
                    i = 2;
                }
                this.f109110f = new C33069b(i);
            }
            if (z2) {
                this.f109110f.mo84762a((C23345c<StoryResponse>) new C23345c<StoryResponse>() {
                    /* renamed from: a */
                    public final void mo60642a(Exception exc) {
                        C42002c.this.mo103179a(new C42005d(9999, exc));
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void mo60643a(StoryResponse storyResponse) {
                        boolean z;
                        C42002c.this.f109107c = storyResponse.hasMore;
                        int size = C42002c.this.f109105a.size();
                        C42002c.this.mo103180a(z2, storyResponse);
                        C42002c cVar = C42002c.this;
                        boolean z2 = z2;
                        boolean z3 = C42002c.this.f109107c;
                        String str = storyResponse.requestId;
                        if (storyResponse.autoOpenWindow == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C42006a aVar = new C42006a(z2, size, z3, str, z, true);
                        cVar.mo103179a(new C42005d(1, aVar));
                    }
                });
            } else {
                this.f109110f.mo84763a(true, (C23345c<C33067a>) new C23345c<C33067a>() {
                    /* renamed from: a */
                    public final void mo60642a(Exception exc) {
                        C42002c.this.mo103179a(new C42005d(9999, exc));
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void mo60643a(C33067a aVar) {
                        int i;
                        boolean z;
                        C42002c cVar = C42002c.this;
                        if (aVar.mo84756a()) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        cVar.mo103179a(new C42005d(6, Integer.valueOf(i)));
                        C42002c.this.mo103179a(new C42005d(5, aVar.f86039b));
                        if (aVar.f86038a != null) {
                            StoryResponse storyResponse = aVar.f86038a;
                            C42002c.this.f109107c = storyResponse.hasMore;
                            C42002c.this.mo103180a(z2, storyResponse);
                            C42002c cVar2 = C42002c.this;
                            boolean z2 = z2;
                            boolean z3 = C42002c.this.f109107c;
                            String str = storyResponse.requestId;
                            if (aVar.f86038a.autoOpenWindow == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C42006a aVar2 = new C42006a(z2, 0, z3, str, z, aVar.mo84756a());
                            cVar2.mo103179a(new C42005d(1, aVar2));
                        }
                    }
                });
            }
        }
    }
}
