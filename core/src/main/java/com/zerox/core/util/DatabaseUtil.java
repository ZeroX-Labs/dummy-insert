package com.zerox.core.util;

import java.sql.Connection;

public interface DatabaseUtil {
    Connection connectDataSource(DataSource dataSource);
}
