package org.ie.dl;

import java.io.IOException;

public class RawDataDownloader {

    public static void DownloadRawData(String idDev) throws IOException {

//        int iddev = Integer.parseInt(idDev);
//        String iddevHex = idDevToHex(iddev);
//        byte[] idDevBin = StringUtils.hexStringToByte(iddevHex);
//
//        Configuration configuration = HBaseConfiguration.create();
//        configuration.set(HConstants.ZOOKEEPER_QUORUM, "dpa-nn01");
//
//
//        HTable table = new HTable(configuration, "devices_dpa");
//        Scan scan = new Scan(idDevBin, idDevBin);
//        scan.setBatch(500);
//
//        Path outPath = Paths.get(idDev + ".bin");
//        OutputStream out = Files.newOutputStream(outPath);
//
//        for (Result result : table.getScanner(scan)) {
//            for (KeyValue keyValue : result.list()) {
//                out.write(Bytes.toBytes(keyValue.getQualifierLength()));
//                out.write(keyValue.getQualifier());
//                out.write(Bytes.toBytes(keyValue.getValueLength()));
//                out.write(keyValue.getValue());
//            }
//        }
//
//        out.close();
//        table.close();
//
//        System.out.println("DONE");
    }


    private static String idDevToHex(int idDev) {
        String iddevHex = Integer.toHexString(idDev);
        while (iddevHex.length() < 8) {
            iddevHex = "0" + iddevHex;
        }
        return iddevHex;
    }


    public static void main(String[] args) throws IOException {
        DownloadRawData("545269123");
    }

}
