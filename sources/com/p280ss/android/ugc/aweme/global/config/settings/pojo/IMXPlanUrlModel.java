package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel */
public final class IMXPlanUrlModel extends Message<IMXPlanUrlModel, Builder> {
    public static final DefaultValueProtoAdapter<IMXPlanUrlModel> ADAPTER = new ProtoAdapter_IMXPlanUrlModel();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 2)
    public final UrlModel high;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 1)
    public final UrlModel normal;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<IMXPlanUrlModel, Builder> {
        public UrlModel high;
        public UrlModel normal;

        public final IMXPlanUrlModel build() {
            return new IMXPlanUrlModel(this.normal, this.high, super.buildUnknownFields());
        }

        public final Builder high(UrlModel urlModel) {
            this.high = urlModel;
            return this;
        }

        public final Builder normal(UrlModel urlModel) {
            this.normal = urlModel;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel$ProtoAdapter_IMXPlanUrlModel */
    static final class ProtoAdapter_IMXPlanUrlModel extends DefaultValueProtoAdapter<IMXPlanUrlModel> {
        public final IMXPlanUrlModel redact(IMXPlanUrlModel iMXPlanUrlModel) {
            return iMXPlanUrlModel;
        }

        public ProtoAdapter_IMXPlanUrlModel() {
            super(FieldEncoding.LENGTH_DELIMITED, IMXPlanUrlModel.class);
        }

        public final IMXPlanUrlModel decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (IMXPlanUrlModel) null);
        }

        public final int encodedSize(IMXPlanUrlModel iMXPlanUrlModel) {
            return UrlModel.ADAPTER.encodedSizeWithTag(1, iMXPlanUrlModel.normal) + UrlModel.ADAPTER.encodedSizeWithTag(2, iMXPlanUrlModel.high) + iMXPlanUrlModel.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, IMXPlanUrlModel iMXPlanUrlModel) throws IOException {
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 1, iMXPlanUrlModel.normal);
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 2, iMXPlanUrlModel.high);
            protoWriter.writeBytes(iMXPlanUrlModel.unknownFields());
        }

        public final IMXPlanUrlModel decode(ProtoReader protoReader, IMXPlanUrlModel iMXPlanUrlModel) throws IOException {
            Builder builder;
            IMXPlanUrlModel iMXPlanUrlModel2 = (IMXPlanUrlModel) C10938a.m32097a().mo26425a(IMXPlanUrlModel.class, iMXPlanUrlModel);
            if (iMXPlanUrlModel2 != null) {
                builder = iMXPlanUrlModel2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.normal((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.normal));
                            break;
                        case 2:
                            builder.high((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.high));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (iMXPlanUrlModel2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final UrlModel getHigh() throws NullValueException {
        if (this.high != null) {
            return this.high;
        }
        throw new NullValueException();
    }

    public final UrlModel getNormal() throws NullValueException {
        if (this.normal != null) {
            return this.normal;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.normal = this.normal;
        builder.high = this.high;
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
        if (this.normal != null) {
            i = this.normal.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.high != null) {
            i3 = this.high.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.normal != null) {
            sb.append(", normal=");
            sb.append(this.normal);
        }
        if (this.high != null) {
            sb.append(", high=");
            sb.append(this.high);
        }
        StringBuilder replace = sb.replace(0, 2, "IMXPlanUrlModel{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IMXPlanUrlModel)) {
            return false;
        }
        IMXPlanUrlModel iMXPlanUrlModel = (IMXPlanUrlModel) obj;
        if (!unknownFields().equals(iMXPlanUrlModel.unknownFields()) || !Internal.equals(this.normal, iMXPlanUrlModel.normal) || !Internal.equals(this.high, iMXPlanUrlModel.high)) {
            return false;
        }
        return true;
    }

    public IMXPlanUrlModel(UrlModel urlModel, UrlModel urlModel2) {
        this(urlModel, urlModel2, ByteString.EMPTY);
    }

    public IMXPlanUrlModel(UrlModel urlModel, UrlModel urlModel2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.normal = urlModel;
        this.high = urlModel2;
    }
}
