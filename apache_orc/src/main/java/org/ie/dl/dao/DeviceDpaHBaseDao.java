package org.ie.dl.dao;

import java.io.IOException;
import java.util.List;

public interface DeviceDpaHBaseDao {
    void downloadData(List<String> idDev) throws IOException;
}
