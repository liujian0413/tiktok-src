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

/* renamed from: com.ss.ugc.aweme.proto.AwemePromotionOtherStructV2 */
public final class AwemePromotionOtherStructV2 extends Message<AwemePromotionOtherStructV2, Builder> {
    public static final ProtoAdapter<AwemePromotionOtherStructV2> ADAPTER = new ProtoAdapter_AwemePromotionOtherStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer card_predict_duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean order_share_recommend;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String recall_reason;

    /* renamed from: com.ss.ugc.aweme.proto.AwemePromotionOtherStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemePromotionOtherStructV2, Builder> {
        public Integer card_predict_duration;
        public Boolean order_share_recommend;
        public String recall_reason;

        public final AwemePromotionOtherStructV2 build() {
            return new AwemePromotionOtherStructV2(this.recall_reason, this.card_predict_duration, this.order_share_recommend, super.buildUnknownFields());
        }

        public final Builder card_predict_duration(Integer num) {
            this.card_predict_duration = num;
            return this;
        }

        public final Builder order_share_recommend(Boolean bool) {
            this.order_share_recommend = bool;
            return this;
        }

        public final Builder recall_reason(String str) {
            this.recall_reason = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemePromotionOtherStructV2$ProtoAdapter_AwemePromotionOtherStructV2 */
    static final class ProtoAdapter_AwemePromotionOtherStructV2 extends ProtoAdapter<AwemePromotionOtherStructV2> {
        public ProtoAdapter_AwemePromotionOtherStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemePromotionOtherStructV2.class);
        }

        public final int encodedSize(AwemePromotionOtherStructV2 awemePromotionOtherStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemePromotionOtherStructV2.recall_reason) + ProtoAdapter.INT32.encodedSizeWithTag(2, awemePromotionOtherStructV2.card_predict_duration) + ProtoAdapter.BOOL.encodedSizeWithTag(3, awemePromotionOtherStructV2.order_share_recommend) + awemePromotionOtherStructV2.unknownFields().size();
        }

        public final AwemePromotionOtherStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.recall_reason((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.card_predict_duration((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.order_share_recommend((Boolean) ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemePromotionOtherStructV2 awemePromotionOtherStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemePromotionOtherStructV2.recall_reason);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, awemePromotionOtherStructV2.card_predict_duration);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, awemePromotionOtherStructV2.order_share_recommend);
            protoWriter.writeBytes(awemePromotionOtherStructV2.unknownFields());
        }
    }

    public AwemePromotionOtherStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.recall_reason = this.recall_reason;
        builder.card_predict_duration = this.card_predict_duration;
        builder.order_share_recommend = this.order_share_recommend;
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
        if (this.recall_reason != null) {
            i = this.recall_reason.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.card_predict_duration != null) {
            i2 = this.card_predict_duration.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.order_share_recommend != null) {
            i4 = this.order_share_recommend.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.recall_reason != null) {
            sb.append(", recall_reason=");
            sb.append(this.recall_reason);
        }
        if (this.card_predict_duration != null) {
            sb.append(", card_predict_duration=");
            sb.append(this.card_predict_duration);
        }
        if (this.order_share_recommend != null) {
            sb.append(", order_share_recommend=");
            sb.append(this.order_share_recommend);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemePromotionOtherStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemePromotionOtherStructV2)) {
            return false;
        }
        AwemePromotionOtherStructV2 awemePromotionOtherStructV2 = (AwemePromotionOtherStructV2) obj;
        if (!unknownFields().equals(awemePromotionOtherStructV2.unknownFields()) || !Internal.equals(this.recall_reason, awemePromotionOtherStructV2.recall_reason) || !Internal.equals(this.card_predict_duration, awemePromotionOtherStructV2.card_predict_duration) || !Internal.equals(this.order_share_recommend, awemePromotionOtherStructV2.order_share_recommend)) {
            return false;
        }
        return true;
    }

    public AwemePromotionOtherStructV2(String str, Integer num, Boolean bool) {
        this(str, num, bool, ByteString.EMPTY);
    }

    public AwemePromotionOtherStructV2(String str, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.recall_reason = str;
        this.card_predict_duration = num;
        this.order_share_recommend = bool;
    }
}
