/*
 * Copyright (c) 2013, OpenCloudDB/MyCAT and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software;Designed and Developed mainly by many Chinese 
 * opensource volunteers. you can redistribute it and/or modify it under the 
 * terms of the GNU General Public License version 2 only, as published by the
 * Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Any questions about this component can be directed to it's project Web address 
 * https://code.google.com/p/opencloudb/.
 *
 */
package io.mycat.config;

import io.mycat.config.model.ClusterConfig;
import io.mycat.config.model.MycatNodeConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Mycat集群
 * @author mycat
 */
public final class MycatCluster {

    private final Map<String, MycatNode> nodes;
    private final Map<String, List<String>> groups;

    public MycatCluster(ClusterConfig clusterConf) {
        this.nodes = new HashMap<String, MycatNode>(clusterConf.getNodes().size());
        this.groups = clusterConf.getGroups();
        for (MycatNodeConfig conf : clusterConf.getNodes().values()) {
            String name = conf.getName();
            MycatNode node = new MycatNode(conf);
            this.nodes.put(name, node);
        }
    }

    public Map<String, MycatNode> getNodes() {
        return nodes;
    }

    public Map<String, List<String>> getGroups() {
        return groups;
    }

}