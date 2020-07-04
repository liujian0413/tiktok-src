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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DouyinOrderSetting */
public final class DouyinOrderSetting extends Message<DouyinOrderSetting, Builder> {
    public static final DefaultValueProtoAdapter<DouyinOrderSetting> ADAPTER = new ProtoAdapter_DouyinOrderSetting();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String schema;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DouyinOrderSetting$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DouyinOrderSetting, Builder> {
        public String schema;

        public final DouyinOrderSetting build() {
            return new DouyinOrderSetting(this.schema, super.buildUnknownFields());
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DouyinOrderSetting$ProtoAdapter_DouyinOrderSetting */
    static final class ProtoAdapter_DouyinOrderSetting extends DefaultValueProtoAdapter<DouyinOrderSetting> {
        public final DouyinOrderSetting redact(DouyinOrderSetting douyinOrderSetting) {
            return douyinOrderSetting;
        }

        public ProtoAdapter_DouyinOrderSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, DouyinOrderSetting.class);
        }

        public final DouyinOrderSetting decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (DouyinOrderSetting) null);
        }

        public final int encodedSize(DouyinOrderSetting douyinOrderSetting) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, douyinOrderSetting.schema) + douyinOrderSetting.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, DouyinOrderSetting douyinOrderSetting) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, douyinOrderSetting.schema);
            protoWriter.writeBytes(douyinOrderSetting.unknownFields());
        }

        public final DouyinOrderSetting decode(ProtoReader protoReader, DouyinOrderSetting douyinOrderSetting) throws IOException {
            Builder builder;
            DouyinOrderSetting douyinOrderSetting2 = (DouyinOrderSetting) C10938a.m32097a().mo26425a(DouyinOrderSetting.class, douyinOrderSetting);
            if (douyinOrderSetting2 != null) {
                builder = douyinOrderSetting2.newBuilder();
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
                        if (douyinOrderSetting2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.schema((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getSchema() throws NullValueException {
        if (this.schema != null) {
            return this.schema;
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
        if (this.schema != null) {
            i = this.schema.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.schema = this.schema;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        StringBuilder replace = sb.replace(0, 2, "DouyinOrderSetting{");
        replace.append('}');
        return replace.toString();
    }

    public DouyinOrderSetting(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DouyinOrderSetting)) {
            return false;
        }
        DouyinOrderSetting douyinOrderSetting = (DouyinOrderSetting) obj;
        if (!unknownFields().equals(douyinOrderSetting.unknownFields()) || !Internal.equals(this.schema, douyinOrderSetting.schema)) {
            return false;
        }
        return true;
    }

    public DouyinOrderSetting(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.schema = str;
    }
}
