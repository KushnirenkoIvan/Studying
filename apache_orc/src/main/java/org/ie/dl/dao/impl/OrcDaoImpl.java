package org.ie.dl.dao.impl;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.ql.exec.vector.LongColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatch;
import org.apache.hadoop.hive.ql.io.orc.OrcFile;
import org.apache.hadoop.hive.ql.io.orc.Writer;
import org.apache.orc.TypeDescription;

import java.io.IOException;

//import org.apache.orc.TypeDescription;

public class OrcDaoImpl {

    public static void main(String[] args) throws IOException {

//
        Configuration configuration = new Configuration();

        TypeDescription schema = TypeDescription.createInt();

//        Writer writer = OrcFile.createWriter(new Path("my-file.orc"), OrcFile.writerOptions(configuration).schema(schema));
        Writer writer = OrcFile.createWriter(new Path("orc\\test_file.orc"), OrcFile.writerOptions(configuration).setSchema(schema));

        VectorizedRowBatch batch = schema.createRowBatch(); // 1024 rows

        LongColumnVector x = (LongColumnVector) batch.cols[0];
//        LongColumnVector y = (LongColumnVector) batch.cols[1];

        for (int r = 0; r < 10000; ++r) {
            int row = batch.size++;
            x.vector[row] = r;
//            y.vector[row] = r * 3;

            // If the batch is full, write it out and start over.
            if (batch.size == batch.getMaxSize()) {
                writer.addRowBatch(batch);
                batch.reset();
            }
        }
        writer.close();
    }
}
