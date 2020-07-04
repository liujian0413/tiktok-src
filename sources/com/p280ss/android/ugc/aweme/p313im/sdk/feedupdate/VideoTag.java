package com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.FeedUpdate.UserUnreadItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.VideoTag */
public class VideoTag implements Serializable {
    private List<C31201a> awemeSubsets = new ArrayList();
    private UrlModel coverUrl;
    private boolean isPhoto;
    private String lastAid;
    private long lastTime;
    private int tagCount;
    private String title;
    private String uid;

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public String getLastAid() {
        return this.lastAid;
    }

    public long getLastTime() {
        return this.lastTime;
    }

    public int getTagCount() {
        return this.tagCount;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isPhoto() {
        return this.isPhoto;
    }

    public void generate() {
        if (C23477d.m77081a((Collection<T>) this.awemeSubsets)) {
            this.tagCount = 0;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = this.awemeSubsets.iterator();
        while (it.hasNext()) {
            try {
                if (currentTimeMillis - ((C31201a) it.next()).f81832b > 604800) {
                    it.remove();
                }
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        }
        if (C23477d.m77081a((Collection<T>) this.awemeSubsets)) {
            this.tagCount = 0;
        } else {
            this.tagCount = this.awemeSubsets.size();
        }
    }

    public void setPhoto(boolean z) {
        this.isPhoto = z;
    }

    public VideoTag(UserUnreadItem userUnreadItem) {
        this.uid = String.valueOf(userUnreadItem.uid);
        add(userUnreadItem);
    }

    public void add(UserUnreadItem userUnreadItem) {
        boolean z;
        if (userUnreadItem.lastAweme != null) {
            this.lastAid = userUnreadItem.lastAweme.f81834a;
            this.title = userUnreadItem.lastAweme.f81836c;
            this.lastTime = userUnreadItem.lastAweme.f81835b;
            if (userUnreadItem.lastAweme.f81839f == 2) {
                z = true;
            } else {
                z = false;
            }
            this.isPhoto = z;
            if (this.isPhoto) {
                if (userUnreadItem.lastAweme.f81838e != null && userUnreadItem.lastAweme.f81838e.size() > 0) {
                    this.coverUrl = ((C31202b) userUnreadItem.lastAweme.f81838e.get(0)).f81833a;
                }
            } else if (userUnreadItem.lastAweme.f81837d != null) {
                this.coverUrl = userUnreadItem.lastAweme.f81837d.f81840a;
            }
        }
        this.awemeSubsets.addAll(userUnreadItem.getAwemeSubsets());
        this.tagCount = this.awemeSubsets.size();
    }
}
