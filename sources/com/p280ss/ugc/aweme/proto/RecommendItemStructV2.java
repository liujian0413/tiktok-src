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

/* renamed from: com.ss.ugc.aweme.proto.RecommendItemStructV2 */
public final class RecommendItemStructV2 extends Message<RecommendItemStructV2, Builder> {
    public static final ProtoAdapter<RecommendItemStructV2> ADAPTER = new ProtoAdapter_RecommendItemStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aweme_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 cover;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 dynamic_cover;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long media_type;

    /* renamed from: com.ss.ugc.aweme.proto.RecommendItemStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<RecommendItemStructV2, Builder> {
        public String aweme_id;
        public UrlStructV2 cover;
        public UrlStructV2 dynamic_cover;
        public Long media_type;

        public final RecommendItemStructV2 build() {
            RecommendItemStructV2 recommendItemStructV2 = new RecommendItemStructV2(this.aweme_id, this.cover, this.dynamic_cover, this.media_type, super.buildUnknownFields());
            return recommendItemStructV2;
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder cover(UrlStructV2 urlStructV2) {
            this.cover = urlStructV2;
            return this;
        }

        public final Builder dynamic_cover(UrlStructV2 urlStructV2) {
            this.dynamic_cover = urlStructV2;
            return this;
        }

        public final Builder media_type(Long l) {
            this.media_type = l;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.RecommendItemStructV2$ProtoAdapter_RecommendItemStructV2 */
    static final class ProtoAdapter_RecommendItemStructV2 extends ProtoAdapter<RecommendItemStructV2> {
        public ProtoAdapter_RecommendItemStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, RecommendItemStructV2.class);
        }

        public final int encodedSize(RecommendItemStructV2 recommendItemStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, recommendItemStructV2.aweme_id) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, recommendItemStructV2.cover) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, recommendItemStructV2.dynamic_cover) + ProtoAdapter.INT64.encodedSizeWithTag(4, recommendItemStructV2.media_type) + recommendItemStructV2.unknownFields().size();
        }

        public final RecommendItemStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.aweme_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.cover((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.dynamic_cover((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.media_type((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, RecommendItemStructV2 recommendItemStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recommendItemStructV2.aweme_id);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, recommendItemStructV2.cover);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, recommendItemStructV2.dynamic_cover);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, recommendItemStructV2.media_type);
            protoWriter.writeBytes(recommendItemStructV2.unknownFields());
        }
    }

    public RecommendItemStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.cover = this.cover;
        builder.dynamic_cover = this.dynamic_cover;
        builder.media_type = this.media_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.aweme_id != null) {
            i = this.aweme_id.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.cover != null) {
            i2 = this.cover.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.dynamic_cover != null) {
            i3 = this.dynamic_cover.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.media_type != null) {
            i5 = this.media_type.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=");
            sb.append(this.aweme_id);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        if (this.dynamic_cover != null) {
            sb.append(", dynamic_cover=");
            sb.append(this.dynamic_cover);
        }
        if (this.media_type != null) {
            sb.append(", media_type=");
            sb.append(this.media_type);
        }
        StringBuilder replace = sb.replace(0, 2, "RecommendItemStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecommendItemStructV2)) {
            return false;
        }
        RecommendItemStructV2 recommendItemStructV2 = (RecommendItemStructV2) obj;
        if (!unknownFields().equals(recommendItemStructV2.unknownFields()) || !Internal.equals(this.aweme_id, recommendItemStructV2.aweme_id) || !Internal.equals(this.cover, recommendItemStructV2.cover) || !Internal.equals(this.dynamic_cover, recommendItemStructV2.dynamic_cover) || !Internal.equals(this.media_type, recommendItemStructV2.media_type)) {
            return false;
        }
        return true;
    }

    public RecommendItemStructV2(String str, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Long l) {
        this(str, urlStructV2, urlStructV22, l, ByteString.EMPTY);
    }

    public RecommendItemStructV2(String str, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.aweme_id = str;
        this.cover = urlStructV2;
        this.dynamic_cover = urlStructV22;
        this.media_type = l;
    }
}
