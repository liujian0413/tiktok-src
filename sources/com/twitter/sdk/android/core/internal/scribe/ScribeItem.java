package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.p276a.C6593c;
import com.twitter.sdk.android.core.internal.C46937t;
import com.twitter.sdk.android.core.models.C46947d;
import com.twitter.sdk.android.core.models.C46959o;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.User;
import java.io.Serializable;

public class ScribeItem implements Serializable {
    @C6593c(mo15949a = "card_event")
    public final CardEvent cardEvent;
    @C6593c(mo15949a = "description")
    public final String description;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public final Long f120251id;
    @C6593c(mo15949a = "item_type")
    public final Integer itemType;
    @C6593c(mo15949a = "media_details")
    public final MediaDetails mediaDetails;

    public static class CardEvent implements Serializable {
        @C6593c(mo15949a = "promotion_card_type")
        final int promotionCardType;

        public int hashCode() {
            return this.promotionCardType;
        }

        public CardEvent(int i) {
            this.promotionCardType = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (this.promotionCardType == ((CardEvent) obj).promotionCardType) {
                return true;
            }
            return false;
        }
    }

    public static class MediaDetails implements Serializable {
        @C6593c(mo15949a = "content_id")
        public final long contentId;
        @C6593c(mo15949a = "media_type")
        public final int mediaType;
        @C6593c(mo15949a = "publisher_id")
        public final long publisherId;

        public int hashCode() {
            return (((((int) (this.contentId ^ (this.contentId >>> 32))) * 31) + this.mediaType) * 31) + ((int) (this.publisherId ^ (this.publisherId >>> 32)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MediaDetails mediaDetails = (MediaDetails) obj;
            if (this.contentId == mediaDetails.contentId && this.mediaType == mediaDetails.mediaType && this.publisherId == mediaDetails.publisherId) {
                return true;
            }
            return false;
        }

        public MediaDetails(long j, int i, long j2) {
            this.contentId = j;
            this.mediaType = i;
            this.publisherId = j2;
        }
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.ScribeItem$a */
    public static class C46897a {

        /* renamed from: a */
        private Integer f120252a;

        /* renamed from: b */
        private Long f120253b;

        /* renamed from: c */
        private String f120254c;

        /* renamed from: d */
        private CardEvent f120255d;

        /* renamed from: e */
        private MediaDetails f120256e;

        /* renamed from: a */
        public final ScribeItem mo118021a() {
            ScribeItem scribeItem = new ScribeItem(this.f120252a, this.f120253b, this.f120254c, this.f120255d, this.f120256e);
            return scribeItem;
        }

        /* renamed from: a */
        public final C46897a mo118019a(MediaDetails mediaDetails) {
            this.f120256e = mediaDetails;
            return this;
        }

        /* renamed from: a */
        public final C46897a mo118017a(int i) {
            this.f120252a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public final C46897a mo118018a(long j) {
            this.f120253b = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public final C46897a mo118020a(String str) {
            this.f120254c = str;
            return this;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (this.itemType != null) {
            i = this.itemType.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        if (this.f120251id != null) {
            i2 = this.f120251id.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.description != null) {
            i3 = this.description.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.cardEvent != null) {
            i4 = this.cardEvent.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.mediaDetails != null) {
            i5 = this.mediaDetails.hashCode();
        }
        return i9 + i5;
    }

    static int getMediaType(MediaEntity mediaEntity) {
        if ("animated_gif".equals(mediaEntity.type)) {
            return 3;
        }
        return 1;
    }

    public static ScribeItem fromMessage(String str) {
        return new C46897a().mo118017a(6).mo118020a(str).mo118021a();
    }

    public static ScribeItem fromTweet(C46959o oVar) {
        return new C46897a().mo118017a(0).mo118018a(oVar.f120435i).mo118021a();
    }

    public static ScribeItem fromUser(User user) {
        return new C46897a().mo118017a(3).mo118018a(user.f120377id).mo118021a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScribeItem scribeItem = (ScribeItem) obj;
        if (this.itemType == null ? scribeItem.itemType != null : !this.itemType.equals(scribeItem.itemType)) {
            return false;
        }
        if (this.f120251id == null ? scribeItem.f120251id != null : !this.f120251id.equals(scribeItem.f120251id)) {
            return false;
        }
        if (this.description == null ? scribeItem.description != null : !this.description.equals(scribeItem.description)) {
            return false;
        }
        if (this.cardEvent == null ? scribeItem.cardEvent != null : !this.cardEvent.equals(scribeItem.cardEvent)) {
            return false;
        }
        if (this.mediaDetails == null ? scribeItem.mediaDetails != null : !this.mediaDetails.equals(scribeItem.mediaDetails)) {
            return false;
        }
        return true;
    }

    static MediaDetails createMediaDetails(long j, MediaEntity mediaEntity) {
        MediaDetails mediaDetails2 = new MediaDetails(j, getMediaType(mediaEntity), mediaEntity.f120367id);
        return mediaDetails2;
    }

    static MediaDetails createCardDetails(long j, C46947d dVar) {
        MediaDetails mediaDetails2 = new MediaDetails(j, 4, Long.valueOf(C46937t.m146807b(dVar)).longValue());
        return mediaDetails2;
    }

    public static ScribeItem fromMediaEntity(long j, MediaEntity mediaEntity) {
        return new C46897a().mo118017a(0).mo118018a(j).mo118019a(createMediaDetails(j, mediaEntity)).mo118021a();
    }

    public static ScribeItem fromTweetCard(long j, C46947d dVar) {
        return new C46897a().mo118017a(0).mo118018a(j).mo118019a(createCardDetails(j, dVar)).mo118021a();
    }

    private ScribeItem(Integer num, Long l, String str, CardEvent cardEvent2, MediaDetails mediaDetails2) {
        this.itemType = num;
        this.f120251id = l;
        this.description = str;
        this.cardEvent = cardEvent2;
        this.mediaDetails = mediaDetails2;
    }
}
