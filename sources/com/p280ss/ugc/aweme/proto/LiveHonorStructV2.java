package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.LiveHonorStructV2 */
public final class LiveHonorStructV2 extends Message<LiveHonorStructV2, Builder> {
    public static final ProtoAdapter<LiveHonorStructV2> ADAPTER = new ProtoAdapter_LiveHonorStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 badge_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer honor_level;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long honor_score;

    /* renamed from: com.ss.ugc.aweme.proto.LiveHonorStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LiveHonorStructV2, Builder> {
        public UrlStructV2 badge_thumb;
        public Integer honor_level;
        public Long honor_score;

        public final LiveHonorStructV2 build() {
            return new LiveHonorStructV2(this.honor_level, this.honor_score, this.badge_thumb, super.buildUnknownFields());
        }

        public final Builder badge_thumb(UrlStructV2 urlStructV2) {
            this.badge_thumb = urlStructV2;
            return this;
        }

        public final Builder honor_level(Integer num) {
            this.honor_level = num;
            return this;
        }

        public final Builder honor_score(Long l) {
            this.honor_score = l;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.LiveHonorStructV2$ProtoAdapter_LiveHonorStructV2 */
    static final class ProtoAdapter_LiveHonorStructV2 extends ProtoAdapter<LiveHonorStructV2> {
        public ProtoAdapter_LiveHonorStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveHonorStructV2.class);
        }

        public final int encodedSize(LiveHonorStructV2 liveHonorStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, liveHonorStructV2.honor_level) + ProtoAdapter.INT64.encodedSizeWithTag(2, liveHonorStructV2.honor_score) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, liveHonorStructV2.badge_thumb) + liveHonorStructV2.unknownFields().size();
        }

        public final LiveHonorStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.honor_level((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.honor_score((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.badge_thumb((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LiveHonorStructV2 liveHonorStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, liveHonorStructV2.honor_level);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, liveHonorStructV2.honor_score);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, liveHonorStructV2.badge_thumb);
            protoWriter.writeBytes(liveHonorStructV2.unknownFields());
        }
    }

    public LiveHonorStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.honor_level = this.honor_level;
        builder.honor_score = this.honor_score;
        builder.badge_thumb = this.badge_thumb;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.honor_level != null) {
            i = this.honor_level.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.honor_score != null) {
            i2 = this.honor_score.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.badge_thumb != null) {
            i4 = this.badge_thumb.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.honor_level != null) {
            sb.append(", honor_level=");
            sb.append(this.honor_level);
        }
        if (this.honor_score != null) {
            sb.append(", honor_score=");
            sb.append(this.honor_score);
        }
        if (this.badge_thumb != null) {
            sb.append(", badge_thumb=");
            sb.append(this.badge_thumb);
        }
        StringBuilder replace = sb.replace(0, 2, "LiveHonorStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveHonorStructV2)) {
            return false;
        }
        LiveHonorStructV2 liveHonorStructV2 = (LiveHonorStructV2) obj;
        if (!unknownFields().equals(liveHonorStructV2.unknownFields()) || !Internal.equals(this.honor_level, liveHonorStructV2.honor_level) || !Internal.equals(this.honor_score, liveHonorStructV2.honor_score) || !Internal.equals(this.badge_thumb, liveHonorStructV2.badge_thumb)) {
            return false;
        }
        return true;
    }

    public LiveHonorStructV2(Integer num, Long l, UrlStructV2 urlStructV2) {
        this(num, l, urlStructV2, ByteString.EMPTY);
    }

    public LiveHonorStructV2(Integer num, Long l, UrlStructV2 urlStructV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.honor_level = num;
        this.honor_score = l;
        this.badge_thumb = urlStructV2;
    }
}
