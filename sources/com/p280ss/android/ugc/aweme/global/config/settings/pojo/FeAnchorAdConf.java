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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeAnchorAdConf */
public final class FeAnchorAdConf extends Message<FeAnchorAdConf, Builder> {
    public static final DefaultValueProtoAdapter<FeAnchorAdConf> ADAPTER = new ProtoAdapter_FeAnchorAdConf();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String ad_tcm_schema;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeAnchorAdConf$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<FeAnchorAdConf, Builder> {
        public String ad_tcm_schema;

        public final FeAnchorAdConf build() {
            return new FeAnchorAdConf(this.ad_tcm_schema, super.buildUnknownFields());
        }

        public final Builder ad_tcm_schema(String str) {
            this.ad_tcm_schema = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeAnchorAdConf$ProtoAdapter_FeAnchorAdConf */
    static final class ProtoAdapter_FeAnchorAdConf extends DefaultValueProtoAdapter<FeAnchorAdConf> {
        public final FeAnchorAdConf redact(FeAnchorAdConf feAnchorAdConf) {
            return feAnchorAdConf;
        }

        public ProtoAdapter_FeAnchorAdConf() {
            super(FieldEncoding.LENGTH_DELIMITED, FeAnchorAdConf.class);
        }

        public final FeAnchorAdConf decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (FeAnchorAdConf) null);
        }

        public final int encodedSize(FeAnchorAdConf feAnchorAdConf) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, feAnchorAdConf.ad_tcm_schema) + feAnchorAdConf.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FeAnchorAdConf feAnchorAdConf) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, feAnchorAdConf.ad_tcm_schema);
            protoWriter.writeBytes(feAnchorAdConf.unknownFields());
        }

        public final FeAnchorAdConf decode(ProtoReader protoReader, FeAnchorAdConf feAnchorAdConf) throws IOException {
            Builder builder;
            FeAnchorAdConf feAnchorAdConf2 = (FeAnchorAdConf) C10938a.m32097a().mo26425a(FeAnchorAdConf.class, feAnchorAdConf);
            if (feAnchorAdConf2 != null) {
                builder = feAnchorAdConf2.newBuilder();
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
                        if (feAnchorAdConf2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.ad_tcm_schema((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getAdTcmSchema() throws NullValueException {
        if (this.ad_tcm_schema != null) {
            return this.ad_tcm_schema;
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
        if (this.ad_tcm_schema != null) {
            i = this.ad_tcm_schema.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.ad_tcm_schema = this.ad_tcm_schema;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ad_tcm_schema != null) {
            sb.append(", ad_tcm_schema=");
            sb.append(this.ad_tcm_schema);
        }
        StringBuilder replace = sb.replace(0, 2, "FeAnchorAdConf{");
        replace.append('}');
        return replace.toString();
    }

    public FeAnchorAdConf(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeAnchorAdConf)) {
            return false;
        }
        FeAnchorAdConf feAnchorAdConf = (FeAnchorAdConf) obj;
        if (!unknownFields().equals(feAnchorAdConf.unknownFields()) || !Internal.equals(this.ad_tcm_schema, feAnchorAdConf.ad_tcm_schema)) {
            return false;
        }
        return true;
    }

    public FeAnchorAdConf(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ad_tcm_schema = str;
    }
}
