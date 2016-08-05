package org.ie.dl.dao.impl;

import org.apache.crunch.types.orc.OrcUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.ql.io.orc.OrcFile;
import org.apache.hadoop.hive.ql.io.orc.OrcStruct;
import org.apache.hadoop.hive.ql.io.orc.Writer;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfo;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfoUtils;
import org.apache.hadoop.io.Text;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        Test test = new Test();
        String tsvString = "text_string\t1\t2\t3\t123.4\t123.45";
        test.createOrcFile(tsvString);
    }

    public void createOrcFile(String input) throws IOException {
//        String typeStr = "struct";
        TypeInfo typeInfo = TypeInfoUtils
                .getTypeInfoFromTypeString("struct<qualifier:string,header:string,xml:string,mac:string>");
        ObjectInspector inspector = OrcStruct.createObjectInspector(typeInfo);

        String[] inputTokens = input.split("\\t");

        OrcStruct orcLine = OrcUtils.createOrcStruct(
                typeInfo,
                new Text(inputTokens[0]),
                new Text(inputTokens[1]),
                new Text(inputTokens[2]),
                new Text(inputTokens[3]));
        Configuration conf = new Configuration();
        Path tempPath = new Path("test.orc");

        Writer writer = OrcFile.createWriter(tempPath, OrcFile.writerOptions(conf).inspector(inspector).stripeSize(100000).bufferSize(10000));
        writer.addRow(orcLine);
        writer.close();
    }
}