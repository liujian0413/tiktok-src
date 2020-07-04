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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PoiConfig */
public final class PoiConfig extends Message<PoiConfig, Builder> {
    public static final DefaultValueProtoAdapter<PoiConfig> ADAPTER = new ProtoAdapter_PoiConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String poi_detail;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PoiConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PoiConfig, Builder> {
        public String poi_detail;

        public final PoiConfig build() {
            return new PoiConfig(this.poi_detail, super.buildUnknownFields());
        }

        public final Builder poi_detail(String str) {
            this.poi_detail = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PoiConfig$ProtoAdapter_PoiConfig */
    static final class ProtoAdapter_PoiConfig extends DefaultValueProtoAdapter<PoiConfig> {
        public final PoiConfig redact(PoiConfig poiConfig) {
            return poiConfig;
        }

        public ProtoAdapter_PoiConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, PoiConfig.class);
        }

        public final PoiConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (PoiConfig) null);
        }

        public final int encodedSize(PoiConfig poiConfig) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, poiConfig.poi_detail) + poiConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, PoiConfig poiConfig) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, poiConfig.poi_detail);
            protoWriter.writeBytes(poiConfig.unknownFields());
        }

        public final PoiConfig decode(ProtoReader protoReader, PoiConfig poiConfig) throws IOException {
            Builder builder;
            PoiConfig poiConfig2 = (PoiConfig) C10938a.m32097a().mo26425a(PoiConfig.class, poiConfig);
            if (poiConfig2 != null) {
                builder = poiConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (poiConfig2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.poi_detail((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getPoiDetail() throws NullValueException {
        if (this.poi_detail != null) {
            return this.poi_detail;
        }
        throw new NullValueException();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.poi_detail != null) {
            i = this.poi_detail.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.poi_detail = this.poi_detail;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.poi_detail != null) {
            sb.append(", poi_detail=");
            sb.append(this.poi_detail);
        }
        StringBuilder replace = sb.replace(0, 2, "PoiConfig{");
        replace.append('}');
        return replace.toString();
    }

    public PoiConfig(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoiConfig)) {
            return false;
        }
        PoiConfig poiConfig = (PoiConfig) obj;
        if (!unknownFields().equals(poiConfig.unknownFields()) || !Internal.equals(this.poi_detail, poiConfig.poi_detail)) {
            return false;
        }
        return true;
    }

    public PoiConfig(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.poi_detail = str;
    }
}
