/******************************************************************************
 * Copyright 2009-2018 Exactpro (Exactpro Systems Limited)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.exactpro.sf.testwebgui.restapi.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dbsettings")
public class XmlStatisticsDBSettings {
    private boolean statisticsServiceEnabled;
    private String dbms;
    private String host;
    private int port;
    private String dbName;
    private String connectionOptionsQuery;
    private String username;
    private String password;

    public boolean getStatisticsServiceEnabled() {
        return this.statisticsServiceEnabled;
    }

    public void setStatisticsServiceEnabled(boolean statisticsServiceEnabled) {
        this.statisticsServiceEnabled = statisticsServiceEnabled;
    }

    public String getDbms() {
        return dbms;
    }

    public void setDbms(String dbms) {
        this.dbms = dbms;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConnectionOptionsQuery() {
        return connectionOptionsQuery;
    }

    public void setConnectionOptionsQuery(String connectionOptionsQuery) {
        this.connectionOptionsQuery = connectionOptionsQuery;
    }
}
