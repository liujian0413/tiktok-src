package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance */
public final class com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance extends Message<com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance> ADAPTER = new C30214xb3dad81c();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 107876)
    public final Integer max;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 108114)
    public final Integer min;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance, Builder> {
        public Integer max;
        public Integer min;

        public final com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance build() {
            return new com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance(this.min, this.max, super.buildUnknownFields());
        }

        public final Builder max(Integer num) {
            this.max = num;
            return this;
        }

        public final Builder min(Integer num) {
            this.min = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance$ProtoAdapter_com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance */
    static final class C30214xb3dad81c extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance> {
        public final com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance redact(com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance) {
            return com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance;
        }

        public C30214xb3dad81c() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance.class);
        }

        public final com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance) {
            return ProtoAdapter.INT32.encodedSizeWithTag(108114, com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance.min) + ProtoAdapter.INT32.encodedSizeWithTag(107876, com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance.max) + com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 108114, com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance.min);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 107876, com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance.max);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance.unknownFields());
        }

        public final com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance decode(ProtoReader protoReader, com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance2 = (com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance) C10938a.m32097a().mo26425a(com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance.class, com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance);
            if (com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance2 != null) {
                builder = com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 107876) {
                    builder.max((Integer) ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 108114) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.min((Integer) ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }
    }

    public final Integer getMax() throws NullValueException {
        if (this.max != null) {
            return this.max;
        }
        throw new NullValueException();
    }

    public final Integer getMin() throws NullValueException {
        if (this.min != null) {
            return this.min;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.min = this.min;
        builder.max = this.max;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.min != null) {
            i = this.min.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.max != null) {
            i3 = this.max.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.min != null) {
            sb.append(", min=");
            sb.append(this.min);
        }
        if (this.max != null) {
            sb.append(", max=");
            sb.append(this.max);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance)) {
            return false;
        }
        com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance = (com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance.unknownFields()) || !Internal.equals(this.min, com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance.min) || !Internal.equals(this.max, com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance.max)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.min = num;
        this.max = num2;
    }
}
